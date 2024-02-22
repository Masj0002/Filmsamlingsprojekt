import java.util.ArrayList;

public class MovieCollection {
    //private Movie[] MovieCollection;
    private ArrayList<Movie> MovieCollection;

    public MovieCollection() {
        this.MovieCollection = new ArrayList<>();
    }

    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        MovieCollection.add(new Movie(title, director, year, isInColor, lengthInMinutes, genre));
    }

    //metode til at printe titel ud
    public ArrayList<String> listOfMovieTitles() {
        ArrayList<String> localListOfMovieTitles = new ArrayList<>();
        for (int i = 0; i < MovieCollection.size(); i++) {
            localListOfMovieTitles.add(MovieCollection.get(i).getTitle());
        }
        return localListOfMovieTitles;
    }

    //metode til at hente alt info om film
    public void getList() {
        for (Movie m : MovieCollection) {
            System.out.println(m.toString());

        }
    }

    public ArrayList<Movie> searchMovieTitle(String title) {
        ArrayList<Movie> searchResults = new ArrayList<>();
        for (Movie movie : MovieCollection) {

            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                searchResults.add(movie);
            }
        }
        return searchResults;
    }

}



