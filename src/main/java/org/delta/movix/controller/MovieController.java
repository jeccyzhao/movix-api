package org.delta.movix.controller;

import org.delta.movix.entity.Movie;
import org.delta.movix.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController extends BaseController {

    @Autowired
    private MovieService service;


    @GetMapping("{id}")
    @ResponseBody
    public Movie read(@PathVariable("id") Long id) {
        Movie movie = service.getMovie(id);
        logger.debug("Find movie: {} ", movie);
        return movie;
    }

    @GetMapping
    @ResponseBody
    public List<Movie> find(@RequestParam("title") String title) {
        List<Movie> movies = service.findMovies(title);
        logger.debug("Find {} movies.", movies.size());
        return movies;
    }

}
