package com.galievedv.example.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupDem {
    public static void main(String[] args){
        try {
            Document doc =
                    Jsoup
                    .connect("https://modrinth.com/user/syorito-hatsuki")
                    .get();

            String name = doc.select("article h2").text();
            String download = doc.select(".stat").text();
            System.out.println(name + "\n" + download);

        } catch (IOException ioe) {
            System.out.println("Exception: " + ioe);
        }
    }
}
