package ru.netology.services.untitled.afisha;

public class AfishaManager {
    private Afisha[] movies = new Afisha[0];

    private int countMovies;

/*   public int getResultLength() {
        return countMovies;
    }

    public void setResultLength(int newCountMovies) {
        if (newCountMovies < 0) {
            return;
        } else {countMovies=newCountMovies;}
    }*/

    public AfishaManager() {
        this.countMovies = 5;
    }

    public AfishaManager(int newCountMovies) {
        this.countMovies = newCountMovies;

    }

    public void add(Afisha movie) { //добавление нового фильма
        Afisha[] tmp = new Afisha[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Afisha[] findAll() {
        return movies;

    }

    public Afisha[] getMovies() {
        int resultLength;
        if (movies.length < countMovies) {
            resultLength = movies.length;
        } else {
            resultLength = countMovies;
        }
        //??? result = new ???[resultLength];
        //  for (???) {
        // заполняем result из массива, что лежит в поле
        // в обратном порядке
        //}*/

        Afisha[] all = findAll();
        Afisha[] reversed = new Afisha[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;

    }
}
