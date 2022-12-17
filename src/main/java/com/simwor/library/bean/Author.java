package com.simwor.library.bean;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Table(
        indexes = {
                @Index(name = "IDX_NAME", columnList = "name")
        }
)
@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    private String name;

    @ToString.Exclude
    @ManyToMany(
            mappedBy = "authors",
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Book> books;

}
