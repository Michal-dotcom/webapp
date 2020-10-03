package model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tweet")
public class Tweet {

    @Id
    private long id;

    @ManyToOne(cascade =  {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "author_fk")
    private AppUser author;

    private String message;

    @Column(name = "published_at")
    @CreationTimestamp
    private LocalDateTime publishedAt;





    public Tweet(AppUser author, String message, LocalDateTime publishedAt) {
        this.author = author;
        this.message = message;
        this.publishedAt = publishedAt;
    }

    public Tweet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AppUser getAuthor() {
        return author;
    }

    public void setAuthor(AppUser author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        publishedAt = LocalDateTime.now();
        this.publishedAt = publishedAt;
    }
}