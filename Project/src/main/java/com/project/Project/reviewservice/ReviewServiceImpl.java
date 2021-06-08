package com.project.Project.reviewservice;

import com.project.Project.entity.Review;
import com.project.Project.reviewrepository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        return this.reviewRepository.save(review);
    }
}
