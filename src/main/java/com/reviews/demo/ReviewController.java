package com.reviews.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ReviewController {
	
	@Resource
	private ReviewRepository reviewRepo;

	@GetMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviewsModel", reviewRepo.findAllReviews());
		return "reviews-template";
		
	}
	
	@GetMapping("/show-single-review")
	public String findOneReview(@RequestParam Long id, Model model) {
		model.addAttribute("reviewModel", reviewRepo.findOneReview(id));
		return "review-template";
	}
}