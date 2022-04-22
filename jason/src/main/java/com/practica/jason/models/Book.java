package com.practica.jason.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer bookId;
    private String title;
    private String isb;
    private String publisher;

}
