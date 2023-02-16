package com.feed.feedservice.controller;

import com.feed.feedservice.entity.Feed;
import com.feed.feedservice.service.FeedService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeedController {
    @Autowired
    FeedService feedService;
    @GetMapping("/feeds")
    public List<Feed> getAllFeeds(){
        return feedService.getFeeds();
    }
    @GetMapping("/feeds/{id}")
    public Feed getAllFeedsId(@PathVariable int id) throws Exception {
        return feedService.getFeedsById(id);
    }
    @PostMapping("/feeds")
    public String addFeeds(@RequestBody Feed feed){
        return feedService.addFeeds(feed);
    }
}
