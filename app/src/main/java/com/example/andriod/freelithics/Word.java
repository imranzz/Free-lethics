package com.example.andriod.freelithics;

/**
 * Created by IMRAN on 7/17/2017.
 */

public class Word {
    private String heading;


    private String para;


    public Word(String defaultHeading, String para_1) {
        heading = defaultHeading;
        para = para_1;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultHeading() {
        return heading;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getpara() {
        return para;
    }
}
