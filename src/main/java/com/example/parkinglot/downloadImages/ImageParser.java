package com.example.parkinglot.downloadImages;

import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class ImageParser {

    public String baseUrl;
    public Set<String> imagesFromURL = new HashSet<>();
    public Set<String> processedURL = new HashSet<>();

    public Set<String> getImages(String url) throws IOException {

        getImagesFromWebsite(url, url);
        return imagesFromURL;

    }

    public void getImagesFromWebsite(String url, String baseUrl) throws IOException {


        if (processedURL.contains(url)) {
            return;
        }
        processedURL.add(url);
        Document doc = Jsoup.connect(url).get();
        Elements elements = doc.getElementsByTag("img");
        for (Element element : elements) {
            String image = element.attr("src");
            if (image.startsWith(".")) {
                image = image.substring(3, image.length());
            } else {
                image = image.substring(1, image.length());
            }
            String compleURL = baseUrl + image;
            imagesFromURL.add(compleURL);
        }

        Elements subURL = doc.getElementsByTag("a");
        for (Element element : subURL) {
            String uri = element.attr("href");
            if (uri.startsWith("/")) {
                uri = uri.substring(1, uri.length());
                String completeURL = baseUrl + uri;
                getImagesFromWebsite(completeURL, baseUrl);
            }

        }


    }

    public static void main(String[] args) throws IOException {

        ImageParser imageParser = new ImageParser();

        imageParser.getImagesFromWebsite("https://www.vymo.com/", "https://www.vymo.com/");

        Images images = new Images(imageParser.imagesFromURL);
        images.displayImages();


    }
}
