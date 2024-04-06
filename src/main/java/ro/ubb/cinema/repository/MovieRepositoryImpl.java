package ro.ubb.cinema.repository;

import ro.ubb.cinema.domain.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {
    private List<Movie> movieList;

    public MovieRepositoryImpl() {
        movieList = new ArrayList<>();
    }

    public Movie findById(int id) {
        for(Movie movie : movieList) {
            if(movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public List<Movie> findAll() {
        return movieList;
    }

    @Override
    public void save(Movie movie) {
        if(findById(movie.getId()) != null) {
            throw new RuntimeException("Duplicate id!");
        }
        movieList.add(movie);
    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public void deleteById(int id) {
        Movie movieToDelete = findById(id);

        if(movieToDelete != null) {
            this.movieList.remove(movieToDelete);
        }
    }
}
