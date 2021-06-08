package com.project.Project.controller;

import com.project.Project.DTO.MovieDetails;
import com.project.Project.MovieRepository.MovieRepository;
import com.project.Project.MovieService.MovieService;
import com.project.Project.entity.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin("*")
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    MovieRepository movieRepository;

    //add movies
    @PostMapping("/")
    public ResponseEntity<?> addMovies(@RequestBody Movies movies){
        return ResponseEntity.ok(this.movieService.addMovies(movies));
    }

    //update Movies
    @PutMapping("/")
    public ResponseEntity<?> updateMovies(@RequestBody Movies movies){
    return ResponseEntity.ok(this.movieService.updateMovies(movies));
    }

    //get all Movies
    @GetMapping("/")
    public ResponseEntity<?> getAllMovies(){
        return ResponseEntity.ok(this.movieService.getAllMovies());
    }

    //get Movies by Id
    @GetMapping("/{m_id}")
    public Movies movies(@PathVariable("m_id") Long m_id){
        return this.movieService.findById(m_id);
    }

    //delete Movies
    @DeleteMapping("/{m_id}")
    public void deleteMovies(@PathVariable("m_id") Long m_id){
        this.movieService.deleteMovie(m_id);
    }

    //get by name
    @GetMapping("/name/{name}")
    public Movies getByName(@PathVariable("name") String name){
        return this.movieService.getByName(name);
    }

    //Get Movie By Lang
    @GetMapping("/Language/{lang}")
    public List<MovieDetails> getMovieByLanguage(@PathVariable("lang") String lang){
        return movieRepository.getMovieByLanguage(lang);
    }

    //Get Movie By Genre
    @GetMapping("/Genre/{genre}")
    public List<MovieDetails> 	getMovieByGenre(@PathVariable("genre") String genre){
        return movieRepository.getMovieByGenre(genre);
    }
}
