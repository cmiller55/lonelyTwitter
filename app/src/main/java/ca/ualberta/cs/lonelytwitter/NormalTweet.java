
/*
 * NormalTweet
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

import java.util.Date;

/**
 * Represents a Tweet object that is considered normal
 *
 * @author team X
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */
public class NormalTweet extends Tweet {
    /**
     * Constructs an NormalTweet object with a default Date
     *
     * @param message tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs an NormalTweet object with a specified Date
     *
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Checks if tweet is an ImportantTweet object
     *
     * @return returns false boolean for non-importance
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
