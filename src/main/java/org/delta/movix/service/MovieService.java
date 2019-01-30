package org.delta.movix.service;

import org.delta.movix.entity.Movie;
import org.delta.movix.service.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieDao movieDao;


    public Movie getMovie(Long id) {
        return movieDao.findById(id);
    }

    public List<Movie> findMovies(String title) {
        return movieDao.queryByTitle(title);
    }

}
