package com.project.Project.entity;

import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

public class Authority implements GrantedAuthority {

    private String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
