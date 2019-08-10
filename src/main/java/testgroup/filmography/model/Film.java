package testgroup.filmography.model;

public class Film {
   private int Film;
   private String title;
   private int year;
   private String genre;
   private boolean watched;

    public int getFilm() {
        return Film;
    }

    public void setFilm(int film) {
        Film = film;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
    @Override
    public String toString(){
        return getGenre();
    }

}
