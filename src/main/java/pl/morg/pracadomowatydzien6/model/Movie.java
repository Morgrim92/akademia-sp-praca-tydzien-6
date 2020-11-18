package pl.morg.pracadomowatydzien6.model;

public class Movie {
    private String title;
    private String year;
    private String manufacturer;

    public Movie() {

    }

    public Movie(String title, String year, String manufacturer) {
        this.title = title;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
