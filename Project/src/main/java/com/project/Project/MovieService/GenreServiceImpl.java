package com.project.Project.MovieService;

import com.project.Project.MovieRepository.GenreRepository;
import com.project.Project.entity.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class GenreServiceImpl implements GenreService{

    @Autowired
    GenreRepository genreRepository;

    @Override
    public Genre addGenre(Genre genre) {
        return this.genreRepository.save(genre);
    }

    @Override
    public Genre updateGenre(Genre genre) {
        return this.genreRepository.save(genre);
    }

    @Override
    public Set<Genre> getAllGenre() {
        return new LinkedHashSet<>(this.genreRepository.findAll());
    }

    @Override
    public void deleteGenre(Long g_id) {
        genreRepository.deleteById(g_id);
    }
}
