package testgroup.filmography.dao;

import com.sun.org.apache.bcel.internal.generic.ATHROW;
import testgroup.filmography.model.Film;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class FilmDAOImpl implements FilmDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer,Film> films = new HashMap<>();
    static {
        Film film1 = new Film();
        film1.setId(AUTO_ID.getAndIncrement());
        film1.setTitle("Once upon time in Hollywood");
        film1.setYear(2010);
        film1.setGenre("action");
        film1.setWatched(true);
        films.put(film1.getId(),film1);
    }
    @Override
    public List<Film> allFilms(){
        return new ArrayList<>(films.values());
    }
    @Override
    public void add(Film film) {
        film.setId(AUTO_ID.getAndIncrement());
        films.put(film.getId(),film);
    }
    @Override
    public void delete(Film film){
        films.remove(film.getId());
    }
    @Override
    public void edit(Film film){
        films.put(film.getId(),film);
    }
    @Override
    public Film getById(int id){
        return films.get(id);
    }
}
