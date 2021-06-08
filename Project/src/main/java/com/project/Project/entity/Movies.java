package com.project.Project.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name="Movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long m_id;
    private String name;
    private String director;
    private String cast1;
    private String cast2;
    private String cast3;
    private String plot;
    private Integer year;

    @ManyToOne(fetch = FetchType.EAGER)
    private Genre genre;

    @ManyToOne(fetch = FetchType.EAGER)
    private Lang lang;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Review> reviews = new LinkedHashSet<>();

    public Movies() {
    }

    public Movies(Long m_id, String name, String director, String cast1, String cast2, String cast3, String plot, Integer year, Genre genre, Lang lang, Set<Review> reviews) {
        this.m_id = m_id;
        this.name = name;
        this.director = director;
        this.cast1 = cast1;
        this.cast2 = cast2;
        this.cast3 = cast3;
        this.plot = plot;
        this.year = year;
        this.genre = genre;
        this.lang = lang;
        this.reviews = reviews;
    }

    public Long getM_id() {
        return m_id;
    }

    public void setM_id(Long m_id) {
        this.m_id = m_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast1() {
        return cast1;
    }

    public void setCast1(String cast1) {
        this.cast1 = cast1;
    }

    public String getCast2() {
        return cast2;
    }

    public void setCast2(String cast2) {
        this.cast2 = cast2;
    }

    public String getCast3() {
        return cast3;
    }

    public void setCast3(String cast3) {
        this.cast3 = cast3;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }
}
