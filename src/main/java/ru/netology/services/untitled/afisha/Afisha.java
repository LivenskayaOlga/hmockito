package ru.netology.services.untitled.afisha;
public class Afisha {
    private int id;
    private String nameMovie;
    private String genre;
    //private int count;

    public Afisha (int id, String nameMovie, String genre){
        this.id = id;
        this.nameMovie=nameMovie;
        this.genre=genre;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNameMovie(){

        return nameMovie;
    }
    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
