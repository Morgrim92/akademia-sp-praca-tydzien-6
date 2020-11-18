package pl.morg.pracadomowatydzien6.repository;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;
import pl.morg.pracadomowatydzien6.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    List<Movie> movies;

    public MovieRepository() {
        movies = new ArrayList<>();
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initData() {
        movies.add(new Movie("Titanic", "1997", "USA"));
        movies.add(new Movie("Pulp Fiction", "1994", "USA"));
        movies.add(new Movie("The Silence of the Lambs", "1991", "USA"));
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public boolean addMovie(Movie movie) {
        return movies.add(movie);
    }
}
