package org.delta.movix.service.dao;

import org.delta.movix.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDao {

    Movie findById(Long id);

    List<Movie> queryByTitle(String title);

}
