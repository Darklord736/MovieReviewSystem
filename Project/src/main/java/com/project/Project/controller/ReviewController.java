package com.project.Project.controller;

import com.project.Project.DTO.ReviewDetails;
import com.project.Project.entity.Review;
import com.project.Project.reviewrepository.ReviewRepository;
import com.project.Project.reviewservice.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@CrossOrigin("*")
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ReviewService reviewService;

    //add review
    @PostMapping("/")
    public ResponseEntity<?> addReview(@RequestBody Review review){
        return ResponseEntity.ok(this.reviewService.addReview(review));
    }

    //get review by movieName
    @GetMapping("/movie/{name}")
    public List<ReviewDetails> getReviewByMovieName(@PathVariable("name") String name){
        return reviewRepository.getReviewByMovieName(name);
    }

    //get review by username
    @GetMapping("/username/{username}")
    public List<ReviewDetails> getReviewByUserName(@PathVariable("username") String username){
        return reviewRepository.getReviewByUsername(username);
    }
}
