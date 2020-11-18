package pl.morg.pracadomowatydzien6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.morg.pracadomowatydzien6.model.Movie;
import pl.morg.pracadomowatydzien6.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies() {
        return movieRepository.getMovies();
    }

    public boolean addMovie(Movie movie) {
        return movieRepository.addMovie(movie);
    }
}
