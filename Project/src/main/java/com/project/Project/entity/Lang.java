package com.project.Project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name="Language")
public class Lang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long l_id;
    private String lang;

    @OneToMany(mappedBy = "lang", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Movies> movies = new LinkedHashSet<>();

    public Lang() {
    }

    public Lang(Long l_id, String lang, Set<Movies> movies) {
        this.l_id = l_id;
        this.lang = lang;
        this.movies = movies;
    }

    public Long getL_id() {
        return l_id;
    }

    public void setL_id(Long l_id) {
        this.l_id = l_id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Set<Movies> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movies> movies) {
        this.movies = movies;
    }
}
