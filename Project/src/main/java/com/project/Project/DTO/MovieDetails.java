package com.project.Project.DTO;

public class MovieDetails {

    private Long m_id;
    private String name;
    private String plot;
    private String lang;
    private String genre;
    private String director;
    private  String cast1;
    private  String cast2;
    private  String cast3;
    private Integer year;

    public MovieDetails() {
    }

    public MovieDetails(Long m_id, String name, String plot, String lang, String genre, String director, String cast1, String cast2, String cast3, Integer year) {
        this.m_id = m_id;
        this.name = name;
        this.plot = plot;
        this.lang = lang;
        this.genre = genre;
        this.director = director;
        this.cast1 = cast1;
        this.cast2 = cast2;
        this.cast3 = cast3;
        this.year = year;
    }

    public Long getM_id() {
        return m_id;
    }

    public void setM_id(Long m_id) {
        this.m_id = m_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast1() {
        return cast1;
    }

    public void setCast1(String cast1) {
        this.cast1 = cast1;
    }

    public String getCast2() {
        return cast2;
    }

    public void setCast2(String cast2) {
        this.cast2 = cast2;
    }

    public String getCast3() {
        return cast3;
    }

    public void setCast3(String cast3) {
        this.cast3 = cast3;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
