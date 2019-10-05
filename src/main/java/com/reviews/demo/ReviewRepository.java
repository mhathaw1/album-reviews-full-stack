package com.reviews.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	
	private Map<Long, Review> reviewList = new HashMap<>();
	private Review reviewOne = new Review(1L, "Radiohead: OK Computer", "This is where I'd write an essay on how great this album is if I weren't behind on my WCCI projects!", "/images/okcomputer.jpg");
	private Review reviewTwo = new Review(2L, "My Bloody Valentine: Loveless", "This is where I'd write an essay on how great this album is if I weren't behind on my WCCI projects!", "/images/loveless2.jpeg");
	private Review reviewThree = new Review(3L, "The Flaming Lips: The Soft Bulletin", "This is where I'd write an essay on how great this album is if I weren't behind on my WCCI projects!", "/images/softbulletin.jpg");
	private Review reviewFour = new Review(4L, "Spiritualized: Ladies and Gentlemen We Are Floating in Space", "This is where I'd write an essay on how great this album is if I weren't behind on my WCCI projects!", "/images/spiritualized.png");
	private Review reviewFive = new Review(5L, "Sigur Ros: Agaetis byrjun", "description", "/images/agaetis.jpeg");
	public ReviewRepository() {
		reviewList.put(reviewOne.getId(), reviewOne);
		reviewList.put(reviewTwo.getId(), reviewTwo);
		reviewList.put(reviewThree.getId(), reviewThree);
		reviewList.put(reviewFour.getId(), reviewFour);
		reviewList.put(reviewFive.getId(), reviewFive);
	}
	
	public ReviewRepository(Review...reviews) {
		for(Review review: reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOneReview(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAllReviews() {
		return reviewList.values();
	}

}