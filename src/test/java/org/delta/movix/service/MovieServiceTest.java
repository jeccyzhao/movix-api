package org.delta.movix.service;

import org.delta.movix.Application;
import org.delta.movix.entity.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class MovieServiceTest {

    @Autowired
    private MovieService service;


    @Test
    public void testGetMovie() throws Exception {
        Movie movie = service.getMovie(1L);
        System.out.println(movie);
    }

    @Test
    public void testFindMovies() throws Exception {
        List<Movie> movies = service.findMovies("moo");
        System.out.println(movies);
    }

}
