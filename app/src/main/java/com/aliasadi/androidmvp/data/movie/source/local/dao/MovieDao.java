package com.aliasadi.androidmvp.data.movie.source.local.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.aliasadi.androidmvp.data.movie.Movie;

import java.util.List;

/**
 * Created by Ali Asadi on 30/01/2019.
 */
@Dao
public interface MovieDao {

    /**
     * Select all movies from the movies table.
     *
     * @return all movies.
     */
    @Query("SELECT * FROM movies")
    List<Movie> getMovies();

    /**
     * Insert all movies.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveMovies(List<Movie> movies);

    /**
     * Delete all movies.
     */
    @Query("DELETE FROM movies")
    void deleteMovies();
}
