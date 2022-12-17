package com.simwor.library.bean;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Table(
        indexes = {
                @Index(name = "IDX_NAME", columnList = "name")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "UNQ_ISBN", columnNames = "isbn")
        }
)
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    private String name;

    private String subTitle;

    @NotBlank
    private String isbn;

    private LocalDateTime publishDate;

    private String imgUrl;

    private String intro;

    @ManyToMany(
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER)
    @JoinTable(
            name = "m2m_author_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;

}
