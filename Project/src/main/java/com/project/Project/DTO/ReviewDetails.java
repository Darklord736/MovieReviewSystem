package com.project.Project.DTO;

public class ReviewDetails {

    private String username;
    private Integer ratting;
    private String comments;
    private String name;

    public ReviewDetails() {
    }

    public ReviewDetails(String username, Integer ratting, String comments, String name) {
        this.username = username;
        this.ratting = ratting;
        this.comments = comments;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRatting() {
        return ratting;
    }

    public void setRatting(Integer ratting) {
        this.ratting = ratting;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
