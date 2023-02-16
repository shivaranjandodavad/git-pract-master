package com.feed.feedservice.service;

import com.feed.feedservice.entity.Feed;
import com.feed.feedservice.repositery.FeedRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedServiceImple implements FeedService {
    @Autowired
    FeedRepositery feedRepositery;
    @Override
    public List<Feed> getFeeds() {
        return feedRepositery.findAll();
    }

    @Override
    public String addFeeds(Feed feed) {
        feedRepositery.save(feed);
        return "Feed Added";
    }

    @Override
    public Feed getFeedsById(int id) throws Exception {
      return feedRepositery.findById(id).orElseThrow(()->new Exception("not found"));
    }
}
