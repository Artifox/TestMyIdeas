package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    @org.testng.annotations.Test

    public void test1(){
        Movie m1=new Movie("Inception",110);
        Movie m2=new Movie("GodFather",200);
        Movie m3=new Movie("Forest Gump",130);
        Movie m4=new Movie("Avengers",150);

        List<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(m1);
        listOfMovies.add(m2);
        listOfMovies.add(m3);
        listOfMovies.add(m4);

        /*Collections.sort(listOfMovies, new Comparator<Movie>(){
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getMovieName().compareTo(o2.movieName);
            }
        });*/

        Collections.sort(listOfMovies, (o1, o2) -> o1.getMovieName().compareTo(o2.getMovieName()));
    }
}
