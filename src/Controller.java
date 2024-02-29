import java.util.ArrayList;

public class Controller {
    //Instance
    MovieCollection instanceMovieCollection = new MovieCollection();

    //Constructor
    public Controller() {
    }
    //tilføjer film
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        instanceMovieCollection.addMovie(title, director, year, isInColor, lengthInMinutes, genre);

    }
    public ArrayList<String> listOfMovieTitles(){
        return instanceMovieCollection.listOfMovieTitles();
    }
    //Laver den til en Controller
    public MovieCollection getInstanceMovieCollection() {
        return instanceMovieCollection;
    }
    //Henter Info om film.
    public void getList(){
        instanceMovieCollection.getList();
    }
    //User Story 5 search
    public String searhMovieTitle(String search){
        return instanceMovieCollection.searchMovieTitle(search);
    }
}
