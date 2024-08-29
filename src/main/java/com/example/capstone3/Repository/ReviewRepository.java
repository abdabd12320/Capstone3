package com.example.capstone3.Repository;

import com.example.capstone3.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Integer> {

    Review findReviewById(Integer id);

    List<Review> findReviewByCommentContains(String comment);
}