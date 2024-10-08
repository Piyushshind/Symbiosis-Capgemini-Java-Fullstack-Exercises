package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "book_info")
@Data
@ToString
//@AllArgsConstructor
//@RequiredArgsConstructor

public class BookInfoEntity {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="book_Id")
	private Long bookID ;
	
	@Column(name ="book_Title")
	private String bookTitle;
	
	@Column(name ="book_author")
	private String autherName;
	
	@Column(name ="book_price")
	private Double sellingPrice;
	
	@Column(name ="book_catagory")
	private String bookCatagory ;
	
	
}
