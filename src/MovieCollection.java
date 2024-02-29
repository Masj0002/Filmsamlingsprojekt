import java.util.ArrayList;

public class MovieCollection {
    //private Movie[] MovieCollection;
    private final ArrayList<Movie> MovieCollection;

    //laver en arraylist til søgemetode
    public ArrayList<Movie> searchMatch = new ArrayList<>();

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
    public ArrayList<Movie> searchMovie(String title) {
        for (Movie movies : MovieCollection) {
            if (movies.getTitle().toLowerCase().contains(title.toLowerCase())) {
                searchMatch.add(movies);
            }
        }
        return searchMatch;
    }
}


 /* //Gammel Kode
        // finder en film
        public String searchMovieTitle(String title) {
            StringBuilder searchResults = new StringBuilder();
            for (Movie movie : MovieCollection) {

                if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    searchResults.append(movie);
                }
            }
            return searchResults.toString();*/


