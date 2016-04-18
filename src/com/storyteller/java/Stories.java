package com.storyteller.java;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.io.File;

/**
 * Created by travis.henley on 18/04/2016.
 */
public class Stories {

    public Stories() {
        ;
    }

    public String generateStory(String char1) {
        //story.txt
        URL url = Stories.class.getClassLoader().getResource("story.txt");
        String text = null;
        try {
            text = new String(Files.readAllBytes(new File(url.toURI()).toPath()), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return text.replace("$char$", char1);
    }

}
