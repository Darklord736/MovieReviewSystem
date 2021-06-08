package com.project.Project.MovieService;

import com.project.Project.entity.Lang;

import java.util.Set;

public interface LangService {

    //add Language
    public Lang addLang(Lang lang);

    //update language
    public  Lang updateLang(Lang lang);

    //get all language
    public Set<Lang> getAllLang();

    //delete language
    public void deleteLang(Long l_id);
}
