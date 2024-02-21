public class MovieCollection {
    private Movie[] MovieCollection;
    int count = 0;

    public MovieCollection(){
        this.MovieCollection = new Movie[5];
    }
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre){
        MovieCollection[count++] = new Movie(title, director, year, isInColor, lengthInMinutes, genre);
    }
        public void listOfMovies(){

        for(Movie movie : MovieCollection){
            System.out.println(movie.getTitle());
        }
    }
}

