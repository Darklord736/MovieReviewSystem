package com.project.Project.MovieService;

import com.project.Project.entity.Genre;

import java.util.Set;


public interface GenreService {

    //add Genre
    public Genre addGenre(Genre genre);

    //update genre
    public Genre updateGenre(Genre genre);

    //get all genre
    public Set<Genre> getAllGenre();

    //delete genre by id
    public void deleteGenre(Long g_id);
}
