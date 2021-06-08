package com.project.Project.MovieService;

import com.project.Project.MovieRepository.LangRepository;
import com.project.Project.entity.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class LangServiceImpl implements LangService{

    @Autowired
    LangRepository langRepository;

    @Override
    public Lang addLang(Lang lang) {
        return this.langRepository.save(lang);
    }

    @Override
    public Lang updateLang(Lang lang) {
        return this.langRepository.save(lang);
    }

    @Override
    public Set<Lang> getAllLang() {
        return new LinkedHashSet<>(this.langRepository.findAll());
    }

    @Override
    public void deleteLang(Long l_id) {
        this.langRepository.deleteById(l_id);
    }
}
