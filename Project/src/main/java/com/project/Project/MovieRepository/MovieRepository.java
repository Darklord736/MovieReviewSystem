package com.project.Project.MovieRepository;

import com.project.Project.DTO.MovieDetails;
import com.project.Project.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movies, Long> {

    //Get Movie By Language
    @Query("SELECT new com.project.Project.DTO.MovieDetails (m.m_id, m.name, m.plot, l.lang, g.genre, m.director, m.cast1, m.cast2, m.cast3, m.year) FROM Movies m ,Lang l ,Genre g   WHERE  m.lang=l.l_id and m.genre=g.g_id AND lang=?1")
    public List<MovieDetails> getMovieByLanguage(String lang);

    //Get Movie By Language
    @Query("SELECT new com.project.Project.DTO.MovieDetails (m.m_id, m.name, m.plot, l.lang, g.genre, m.director, m.cast1, m.cast2, m.cast3, m.year) FROM Movies m ,Lang l ,Genre g   WHERE  m.lang=l.l_id and m.genre=g.g_id AND genre=?1")
    public List<MovieDetails> getMovieByGenre(String genre);

    Movies findByName(String name);
}
