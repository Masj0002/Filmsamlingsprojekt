import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instance / Laver en ny film
        MovieCollection film = new MovieCollection();

        film.addMovie("Shrek", "Ham Der", 2000, true, 120, "Comedy");
        film.addMovie("Inception", "kan ik huske", 1999, true, 160, "Sej");
        film.listOfMovies();

Scanner input = new Scanner(System.in);


    }
}
