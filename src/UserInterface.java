import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Controller film = new Controller();
    Scanner input = new Scanner(System.in);

    public void startMenu() {
/*
        film.addMovie("DieHard","Lord Hard",2004, true, 20, "Action");
        film.addMovie("Lovepotion","Jacob Clienton",1992, false, 32, "Drama");
        film.addMovie("Shrek","hamder a", 2000,true,120,"horror");
*/
        int sentinel = 5;
        int userChoice = 0;
        while (userChoice != sentinel) {

            System.out.println("Welcome to the MovieCollection");
            System.out.println("1. Create Movie");
            System.out.println("2. Search For A Movie");
            System.out.println("3. Show Movie Collection");
            System.out.println("4. Edit A Movie");
            System.out.println("5. Stop Program");
            userChoice = input.nextInt();
            if (userChoice == 1) {
                createMovie();
                returnToMenu();
            } else if (userChoice == 2) {
                searchForMovie();
                returnToMenu();
            } else if (userChoice == 3) {
                showMovieCollection();
                returnToMenu();
            } else if (userChoice == 4) {
                editMovie();
                returnToMenu();
            }
        }
    }

    //Methods
    public void createMovie() {
        System.out.println("Please type in the title");
        String title = input.nextLine();
        input.nextLine();
        System.out.println("Please type in who directed it");
        String director = input.nextLine();
        System.out.println("Please type in the year it was made");
        int year = input.nextInt();

        System.out.println("Is the movie in color");
        boolean IsInColor = false;
        if (input.next().equalsIgnoreCase("yes")) {
            IsInColor = true;
        }
        System.out.println("How long is the movie in minutes");
        int lengthInMinutes = input.nextInt();
        System.out.println("what genre is it ?");
        String genre = input.next();
        film.addMovie(title, director, year, IsInColor, lengthInMinutes, genre);
        System.out.println("Movie was added to library");
    }

    public void searchForMovie() {
        System.out.println("Search for a Movie");
        String stringToSearchFor = input.nextLine();
        stringToSearchFor = input.nextLine();
        /*Gammel kode
        String searchResult = film.searchMovieTitle(stringToSearchFor);
        System.out.println(searchResult);*/
        ArrayList<Movie> searchResult = film.findTitle(stringToSearchFor);
        System.out.println(searchResult);
    }

    public void showMovieCollection() {
        System.out.println(film.listOfMovieTitles());
    }
//User Story 8-9
    public void editMovie() {
        System.out.println("Which Movie would you like to edit?");
        String stringToSearchFor = input.nextLine();
        stringToSearchFor = input.nextLine();
        ArrayList<Movie> searchResult = film.findTitle(stringToSearchFor);
        System.out.println(searchResult);

    }

    public void returnToMenu() {
        boolean dummyVar = true;
        while (dummyVar) {
            System.out.println("Want to return to main menu?");
            dummyVar = input.next().equalsIgnoreCase("yes");
            {
                dummyVar = false;
            }
        }
    }
}