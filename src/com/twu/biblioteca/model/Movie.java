package com.twu.biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Movie {
    private String movieName;
    private int year;
    private String directorName;
    private int movieRating;
    private Boolean available;
    private List<Historic> historic;


    public Movie(String movieName, int year, String directorName, int movieRating, Boolean available) {
        this.movieName = movieName;
        this.year = year;
        this.directorName = directorName;
        this.movieRating = movieRating;
        this.available= available;
        this.historic= new ArrayList<>();
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public List <Historic> getHistoric() {
        return historic;
    }

    public void setHistoric(List <Historic> historic) {
        this.historic = historic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year &&
                movieRating == movie.movieRating &&
                Objects.equals(movieName, movie.movieName) &&
                Objects.equals(directorName, movie.directorName) &&
                Objects.equals(available, movie.available) &&
                Objects.equals(historic, movie.historic);
    }

    @Override
    public int hashCode() {

        return Objects.hash(movieName, year, directorName, movieRating, available, historic);
    }
    public void rent(User user) {
        this.available = false;
        this.historic.add(new Historic(user));
    }

    public void giveBack() {
        this.available = true;
    }

    public Boolean isAvailable(){
        if(available){
            return true;
        }
        return false;
    }
}
