import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instance / Laver en ny film
        Controller film = new Controller();
        Scanner input = new Scanner(System.in);

        //Controller skal bruges før while-loopet ellers tilføjer man hele tiden en ny collection således at der ikke kan komme mere end 1 film i collection


        int sentinel = 3;
        int userChoice = 0;
        while (userChoice != sentinel) {
            System.out.println("Welcome to the MovieCollection");
            System.out.println("1. Create Movie");
            System.out.println("2. Search For Movie");
            System.out.println("3. Stop");
            userChoice = input.nextInt();
            if (userChoice == 1) {

                //title, director, year, isInColor, lengthInMinutes, genre
                boolean dummyVar = true;
                while (dummyVar) {
                    System.out.println("Please type in the title");
                    String title = input.next();
                    System.out.println("Please type in who directed it");
                    String director = input.next();
                    System.out.println("Please type in the year it was made");
                    int year = input.nextInt();

                    System.out.println("Are the movie in color (true) else (false)");
                    boolean IsInColor = input.nextBoolean();

                    System.out.println("How long is the movie in minutes");
                    int lengthInMinutes = input.nextInt();
                    System.out.println("what genre is it ?");
                    String genre = input.next();
                    film.addMovie(title, director, year, IsInColor, lengthInMinutes, genre);
                    System.out.println("Movie was added to library");

                    System.out.println("want to add another type true, else false");
                    dummyVar = input.nextBoolean();
                }
            } else if (userChoice == 2){
                System.out.println("Search for a Movie");
            }
        }
        System.out.println(film.listOfMovieTitles());
        film.getList();

    }
}
