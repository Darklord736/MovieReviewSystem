package com.project.Project.controller;

import com.project.Project.MovieService.LangService;
import com.project.Project.entity.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lang")
@CrossOrigin("*")
public class LangController {

    @Autowired
    LangService langService;

    //add Language
    @PostMapping("/")
    public ResponseEntity<?> addLang(@RequestBody Lang lang){
        Lang lang1 = this.langService.addLang(lang);
        return ResponseEntity.ok(lang1);
    }

    //update Language
    @PutMapping("/")
    public Lang updateLang(@RequestBody Lang lang){
        return this.langService.updateLang(lang);
    }

    //get all Language
    @GetMapping("/")
    public  ResponseEntity<?> getAllLang(){
        return ResponseEntity.ok(this.langService.getAllLang());
    }

    //delete Language
    @DeleteMapping("/{l_id}")
    public void deleteLang(@PathVariable("l_id") Long l_id){
        this.langService.deleteLang(l_id);
    }
}
