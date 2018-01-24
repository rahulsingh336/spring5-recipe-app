package com.rs.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by rs on 1/23/2018.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}