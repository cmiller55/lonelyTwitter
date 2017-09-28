/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact miller4@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author team X
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable {

    /*
     * Class for representing and modifying a tweet, including the message, date and mood
     */

    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    /**
     * Constructs a Tweet object with a default Date
     *
     * @param message tweet message
     */
    public Tweet(String message) {
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object with a specified Date
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * Gets the tweet message
     *
     * @return tweet message
     */
    public String getMessage(){ return message; }

    /**
     * Gets the tweet date
     *
     * @return tweet date
     */
    public Date getDate() { return date; }
    /**
     * Sets the tweet message
     *
     * @param message new tweet message
     * @throws TweetTooLongException
     *
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }


    /**
     * Checks if the tweet is an ImportantTweet object
     *
     * @return boolean representing importance
     */
    public abstract Boolean isImportant();

    /**
     * Prints tweet object
     *
     * @return string representing tweet
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
