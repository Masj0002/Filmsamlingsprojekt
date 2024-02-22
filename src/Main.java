import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instance / Laver en ny film
        MovieCollection film = new MovieCollection();
        Scanner input = new Scanner(System.in);
        int sentinel = 2;
        int userChoice = 0;
        while (userChoice != sentinel) {
            System.out.println("Welcome to the MovieCollection");
            System.out.println("1. Create Movie");
            System.out.println("2. Stop");
            userChoice = input.nextInt();
            if (userChoice == 1) {

                //title, director, year, isInColor, lengthInMinutes, genre
                boolean dummyVar = true;
                while (dummyVar) {
                    System.out.println("Please type in the title");
                    String title = input.next();
                    System.out.println("Please type in who directed it");
                    String director = input.next();
                    System.out.println("year");
                    int year = input.nextInt();
                    System.out.println("Are the movie in color (true) else (false)");
                    boolean IsInColor = input.nextBoolean();
                    System.out.println("How long is the movie in minutes");
                    int lengthInMinutes = input.nextInt();
                    System.out.println("what genre is it ?");
                    String genre = input.next();
                    film.addMovie(title, director, year, IsInColor, lengthInMinutes, genre);
                    System.out.println("Movie was added to libary");
                    System.out.println("want to add another type true, else false");
                    boolean dummyVarUpdate = input.nextBoolean();
                    dummyVar = dummyVarUpdate;
                }
            }
        }
        film.listOfMovies();
    }
}
