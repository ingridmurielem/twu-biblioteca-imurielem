package com.twu.biblioteca.model;

import java.util.Objects;

public class Movie {
    private String movieName;
    private int year;
    private String directorName;
    private int movieRating;
    private Boolean available;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year &&
                Objects.equals(movieName, movie.movieName) &&
                Objects.equals(directorName, movie.directorName) &&
                Objects.equals(movieRating, movie.movieRating);
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override

    public int hashCode() {

        return Objects.hash(movieName, year, directorName, movieRating);
    }



    public Movie(String movieName, int year, String directorName, int movieRating, Boolean available) {
        this.movieName = movieName;
        this.year = year;
        this.directorName = directorName;
        this.movieRating = movieRating;
        this.available= available;
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
}
