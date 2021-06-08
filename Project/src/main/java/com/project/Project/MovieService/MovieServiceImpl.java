package com.project.Project.MovieService;

import com.project.Project.MovieRepository.MovieRepository;
import com.project.Project.entity.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository movieRepository;

    @Override
    public Movies addMovies(Movies movies) {
        return this.movieRepository.save(movies);
    }

    @Override
    public Movies updateMovies(Movies movies) {
        return this.movieRepository.save(movies);
    }

    @Override
    public Movies getByName(String name) {
        return this.movieRepository.findByName(name);
    }

    @Override
    public Set<Movies> getAllMovies() {
        return new LinkedHashSet<>(this.movieRepository.findAll());
    }

    @Override
    public Movies findById(Long m_id) {
        return this.movieRepository.findById(m_id).get();
    }

    @Override
    public void deleteMovie(Long m_id) {
        this.movieRepository.deleteById(m_id);
    }
}
