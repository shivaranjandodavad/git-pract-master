package com.feed.feedservice.service;

import com.feed.feedservice.entity.Feed;

import java.util.List;

public interface FeedService {
    List<Feed> getFeeds();
    String addFeeds(Feed feed);

    Feed getFeedsById(int id) throws Exception;
}
