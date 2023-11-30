package ru.netology.services.untitled.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    AfishaManager poster = new AfishaManager();
    Afisha movie1 = new Afisha(1, "Бладшот", "боевик");
    Afisha movie2 = new Afisha(2, "Вперед", "мультфильм");
    Afisha movie3 = new Afisha(3, "Отель Белград", "комедия");
    Afisha movie4 = new Afisha(225, "Джентльмены", "боевик");
    Afisha movie5 = new Afisha(332, "Человек-неведимка", "ужасы");
    Afisha movie6 = new Afisha(41, "Тролли. Мировой тур", "мультфильм");
    Afisha movie7 = new Afisha(8, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
    }

    @Test
    public void shouldFindAllMovies() {                //найти все фильмы
/*        AfishaManager poster =new AfishaManager();

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);*/

        Afisha[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Afisha[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAllMoviesIfNotMovies() { //найти все фильмы, если фильмов нет
        AfishaManager films = new AfishaManager();

        Afisha[] expected = {};
        Afisha[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAllMoviesIfOneMovies() { //найти все фильмы, если фильм один
        AfishaManager films = new AfishaManager();

        films.add(movie2);

        Afisha[] expected = {movie2};
        Afisha[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAllMoviesIfTwoMovies() { ////найти все фильмы, если фильмов два
        AfishaManager films = new AfishaManager();

        films.add(movie2);
        films.add(movie7);

        Afisha[] expected = {movie2, movie7};
        Afisha[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findAllMovies() {
        AfishaManager films = new AfishaManager();

        films.add(movie7);
        films.add(movie6);
        films.add(movie5);
        films.add(movie7);


        Afisha[] expected = {movie7, movie6, movie5, movie7};
        Afisha[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReversThreeFilmsIfAfishaHaveFoureMovies() { //показать три фильма, афиша содержит 4 фильма
        AfishaManager films = new AfishaManager(3);

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        films.add(movie4);

        Afisha[] expected = {movie4, movie3, movie2};
        Afisha[] actual = films.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReversMoviesIfPosterHaveThreeMoviesAndCountFore() {
        AfishaManager films = new AfishaManager(4);

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);

        Afisha[] expected = {movie3, movie2, movie1};
        Afisha[] actual = films.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReverseMoviesIfCountZeroAndAfishaHaveMovies() {
        AfishaManager films = new AfishaManager(0);

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);

        Afisha[] expected = {};
        Afisha[] actual = films.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReverseMoviesIfNoCount() { //по умолчанию

        Afisha[] expected = {movie7, movie6, movie5, movie4, movie3};
        Afisha[] actual = poster.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

}
