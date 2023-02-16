package com.feed.feedservice.repositery;

import com.feed.feedservice.entity.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepositery extends JpaRepository<Feed,Integer> {

}
