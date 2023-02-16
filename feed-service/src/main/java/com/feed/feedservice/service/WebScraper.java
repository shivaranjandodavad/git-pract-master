package com.feed.feedservice.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebScraper {
  public static void main(String[] args) throws Exception {
    Document doc = Jsoup.connect("https://xhamster18.desi/tags/hindi").get();
    Elements title = doc.select("title");
    System.out.println("Title: " + title.text());
    Elements vid = doc.select("a");
    System.out.println("Attributes: " +vid);
  }

}
