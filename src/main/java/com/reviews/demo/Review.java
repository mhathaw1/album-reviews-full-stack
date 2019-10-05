package com.reviews.demo;

public class Review {

	private Long id;
	private String name;
	private String description;
	private String imgUrl;
	//is there where I put instance variable for image url? 
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public Review(long id, String name, String description, String imgUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.imgUrl = imgUrl;
	}


}
