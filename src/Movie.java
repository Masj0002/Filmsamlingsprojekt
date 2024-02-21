public class Movie {
    //Definere
    private String title;
    private String director;
    private int year;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    //Metode / parameter
    public Movie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre){
        this.title = title;
        this.director = director;
        this.year = year;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }
    //GetterMetode /den returner over i MovieCollection
    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public int getYear(){
        return year;
    }
    public boolean getIsInColor(){
        return isInColor;
    }
    public int getLengthInMinutes(){
        return lengthInMinutes;
    }
    public String getGenre(){
        return genre;
    }
}
