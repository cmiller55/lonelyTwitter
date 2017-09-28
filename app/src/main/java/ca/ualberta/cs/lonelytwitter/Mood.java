
/*
 * Mood
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
 * Represents a mood for a tweet
 *
 * @author team X
 * @version 1.0
 * @see HappyMood
 * @see SadMood
 * @see Tweet
 * @since 1.0
 */
public abstract class Mood {
    private Date date;

    /**
     * Constructs a Mood object using default Date
     */
    public Mood(){
        date = new Date();
    }

    /**
     * Constructs a Mood object using specified Date
     *
     * @param date mood date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * gets the mood date
     *
     * @return mood date
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets the mood date
     *
     * @param newDate new mood date
     */
    public void setDate(Date newDate) {
        this.date = newDate;
    }

    /**
     * prints Mood object
     * @return String representing mood
     */
    public abstract String printMood();
}
