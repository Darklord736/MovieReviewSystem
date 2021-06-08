package com.project.Project.MovieService;

import com.project.Project.entity.Movies;

import java.util.Set;

public interface MovieService {

    //add movies
    public Movies addMovies(Movies movies);

    //update Movies
    public Movies updateMovies(Movies movies);

    //get by name
    public Movies getByName(String name);

    //get All Movies
    public Set<Movies> getAllMovies();

    //get Movie By name
    public Movies findById(Long m_id);

    //delete movie
    public void deleteMovie(Long m_id);
}
