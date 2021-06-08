package com.project.Project.reviewrepository;

import com.project.Project.DTO.ReviewDetails;
import com.project.Project.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

    @Query("SELECT new com.project.Project.DTO.ReviewDetails (u.username, r.ratting, r.comments , m.name) FROM User u, Movies m, Review r WHERE r.user=u.u_id and r.movie=m.m_id and username=?1")
    public List<ReviewDetails> getReviewByUsername(String username);

    @Query("SELECT new com.project.Project.DTO.ReviewDetails (u.username, r.ratting, r.comments , m.name) FROM User u, Movies m, Review r WHERE r.user=u.u_id and r.movie=m.m_id and name=?1")
    public List<ReviewDetails> getReviewByMovieName(String name);
}
