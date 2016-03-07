package at.tuwien.domain;

import java.sql.Timestamp;

/**
 * Created by geoHeil on 07.03.16.
 */
public class Joke {

    private Integer id;
    private String text;
    private Timestamp published;
    private Integer rating;

    public Joke(Integer id, String text, Timestamp published, Integer rating) {
        this.id = id;
        this.text = text;
        this.published = published;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getPublished() {
        return published;
    }

    public void setPublished(Timestamp published) {
        this.published = published;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", published=" + published +
                ", rating=" + rating +
                '}';
    }
}
