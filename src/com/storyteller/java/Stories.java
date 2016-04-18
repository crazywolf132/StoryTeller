package com.storyteller.java;

import java.net.URL;

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
    }

}
