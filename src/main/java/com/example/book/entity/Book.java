package com.example.book.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
public class Book {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
 public Long id;
 @NotBlank(message="Title is required")
 public String title;
 @NotBlank(message="Author is required") 
 public String author;
 @NotBlank(message="ISBN is required") 
 public String isbn;
}