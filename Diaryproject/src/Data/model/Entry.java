package Data.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Entry {
    private static int id;

    private String title;

    private String body;

    private String Author;

    private LocalDate dateCreated;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDate.now();


    }

    public Entry() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Entry.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}