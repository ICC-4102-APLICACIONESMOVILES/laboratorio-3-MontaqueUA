package carril.ignacio.labtry123;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.text.Normalizer;
import java.util.List;

public class Database {
    @Dao
    public interface DaoAccess {

        @Insert
        void insertOnlySingleMovie (Forms forms);
        @Insert
        void insertMultipleMovies (List<Forms> formsList);
        @Query("SELECT * FROM Forms WHERE formId = :formId")
        Forms fetchOneMoviesbyMovieId (int movieId);
        @Update
        void updateMovie (Forms forms);
        @Delete
        void deleteMovie (Forms forms);
    }
}
