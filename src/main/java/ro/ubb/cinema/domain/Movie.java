package ro.ubb.cinema.domain;

public class Movie {
    private int id;
    private String title;
    private int year;
    private String ticketPrice; // string pozitiv
    private boolean inCinema;

    public Movie() {}

    public Movie(int id, String title, int year, String ticketPrice, boolean inCinema) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.ticketPrice = ticketPrice;
        this.inCinema = inCinema;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public boolean isInCinema() {
        return inCinema;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setInCinema(boolean inCinema) {
        this.inCinema = inCinema;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", ticketPrice='" + ticketPrice + '\'' +
                ", inCinema=" + inCinema +
                '}';
    }
}
