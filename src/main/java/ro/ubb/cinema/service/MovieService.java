package ro.ubb.cinema.service;

import ro.ubb.cinema.domain.Movie;
import ro.ubb.cinema.domain.MovieValidator;
import ro.ubb.cinema.repository.CinemaRepository;

import java.util.List;

public class MovieService {
    private CinemaRepository<Movie> movieRepository;

    public MovieService(CinemaRepository<Movie> movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void add(Movie movie) {
        MovieValidator.validate(movie);
        movieRepository.save(movie);
    }

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    public Movie getById(int id) {
        return movieRepository.findById(id);
    }

    public void update(Movie newMovie) {
        MovieValidator.validate(newMovie);
        movieRepository.update(newMovie);
    }

    public void deleteById(int id) {
        movieRepository.deleteById(id);
    }
}
