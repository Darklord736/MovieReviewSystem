package com.project.Project.controller;

import com.project.Project.MovieService.GenreService;
import com.project.Project.entity.Genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genre")
@CrossOrigin("*")
public class GenreController {

    @Autowired
    GenreService genreService;

    //add Genre
    @PostMapping("/")
    public ResponseEntity<?> addGenre(@RequestBody Genre genre){
       Genre genre1 =  this.genreService.addGenre(genre);
       return ResponseEntity.ok(genre1);
    }

    //get All Genre
    @GetMapping("/")
    public ResponseEntity<?> getAllGenre() {
        return ResponseEntity.ok(this.genreService.getAllGenre());
    }

    //Update Genre
    @PutMapping("/")
    public Genre updateGenre(@RequestBody Genre genre){
        return this.genreService.updateGenre(genre);
    }

    //Delete Genre
    @DeleteMapping("/{g_id}")
    public void deleteGenre(@PathVariable("g_id") Long g_id){
        this.genreService.deleteGenre(g_id);
    }
}
