package com.incubation.rating_data_service.model;

import java.util.List;

public class UserRating {
    private List<Rating> ratings;

    public UserRating(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }
}
