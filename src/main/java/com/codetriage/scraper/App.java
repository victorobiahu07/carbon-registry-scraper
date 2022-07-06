package com.codetriage.scraper;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Our scraper class
 */
public class App {
  /**
   * The main method of our class, which will also house the scraping
   * functionality.
   */
  public static void main(String[] args) {
    try {
      // Here we create a document object and use JSoup to fetch the website
      Document doc = Jsoup.connect("https://acr2.apx.com/myModule/rpt/myrpt.asp?r=111").get();

      // With the document fetched, we use JSoup's title() method to fetch the title
      System.out.printf("Title: %s\n", doc.title());

      // In case of any IO errors, we want the messages written to the console
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
