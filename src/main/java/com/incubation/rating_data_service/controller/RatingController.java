package com.incubation.rating_data_service.controller;


import com.incubation.rating_data_service.model.Rating;
import com.incubation.rating_data_service.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 5);
    }

    @GetMapping("user/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String id) {
        return new UserRating(new ArrayList<>(
                Arrays.asList(new Rating("1234", 4), new Rating("532", 5))
        ));
    }
}
