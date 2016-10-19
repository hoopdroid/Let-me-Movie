package kode.kinopoisk.savin.letmemovie.components;

import java.util.Comparator;

import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.IMovie;

public class CustomLowComparator implements Comparator<IMovie> {

    @Override
    public int compare(IMovie lhs, IMovie rhs) {
        return Float.compare(lhs.getComparableRating(),rhs.getComparableRating());
    }
}