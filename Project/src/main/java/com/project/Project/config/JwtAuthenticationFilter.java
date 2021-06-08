package com.project.Project.config;

import com.project.Project.userservice.UserDetailsServiceImpl;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private UserDetailsServiceImpl userDetailServiceImpl;

    @Autowired
    private JwtUtils jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

       final String requestTokenHeader =  request.getHeader("Authorization");
        System.out.println(requestTokenHeader);
        String username = null;
        String jwtToken = null;

        if (requestTokenHeader!=null && requestTokenHeader.startsWith("Bearer "))
        {
                jwtToken = requestTokenHeader.substring(7);
            try
            {
                username = this.jwtUtil.extractUsername(jwtToken);
            }
            catch (ExpiredJwtException e)
            {
                e.printStackTrace();
                System.out.println("jwt token is expired");
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("error");
            }

        }
        else {
            System.out.println("Invalid Token, not start with bearer string");
        }

        //validate the token
        if (username!=null && SecurityContextHolder.getContext().getAuthentication()==null)
        {
          final  UserDetails userDetails = this.userDetailServiceImpl.loadUserByUsername(username);
          if (this.jwtUtil.validateToken(jwtToken,userDetails))
          {
              //token is valid
              UsernamePasswordAuthenticationToken usernamePasswordAuthenticationtoken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
              usernamePasswordAuthenticationtoken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

              SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationtoken);
          }
          } else {
            System.out.println("Token is not valid");
        }
        filterChain.doFilter(request,response);
    }
}
