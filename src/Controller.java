import java.util.ArrayList;

public class Controller {
    //Instance
    MovieCollection instanceMovieCollection = new MovieCollection();

    //Constructor
    public Controller() {
    }

    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        instanceMovieCollection.addMovie(title, director, year, isInColor, lengthInMinutes, genre);


    }
    public ArrayList<String> listOfMovieTitles(){
        return instanceMovieCollection.listOfMovieTitles();
    }


    public MovieCollection getInstanceMovieCollection() {
        return instanceMovieCollection;
    }

}
