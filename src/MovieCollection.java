import java.util.ArrayList;

public class MovieCollection {
    //private Movie[] MovieCollection;
    private ArrayList<Movie> MovieCollection;

    public MovieCollection(){
        this.MovieCollection = new ArrayList<>();
    }
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre){
       MovieCollection.add(new Movie(title, director, year, isInColor,lengthInMinutes, genre));
    }

        public void listOfMovies(){
        for (int i = 0; i <MovieCollection.size(); i++){
            System.out.println(MovieCollection.get(i).getTitle());
        }
    }
}

