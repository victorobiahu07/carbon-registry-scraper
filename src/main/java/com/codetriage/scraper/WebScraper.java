//package com.codetriage.scraper;
//import java.io.IOException;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import java.net.http.HttpClient;
//
//public class WebScraper {
//
//    private void scrape() {
//        final String httpsUrl = "https://acr2.apx.com/myModule/rpt/myrpt.asp?r=111";
//
//        try {
//
//            final HttpClient client = new HttpClient();
//            client.start();
//
//            final ContentResponse res = client.GET(httpsUrl);
//
//            System.out.println("****** Content of the URL ********");
//            System.out.println(res.getContentAsString());
//
//            client.stop();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
