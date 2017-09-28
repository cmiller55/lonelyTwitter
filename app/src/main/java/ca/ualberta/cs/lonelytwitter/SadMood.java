
/*
 * SadMood
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
 * Represents a sad mood for a tweet
 *
 * @author team X
 * @version 1.0
 * @see Mood
 * @see Tweet
 * @since 1.0
 */
public class SadMood extends Mood {

    /**
     * Constructs a SadMood object using a default date
     */
    public SadMood(){
        super();
    }

    /**
     * Constructs a SadMood object using a specified date
     *
     * @param date mood date
     */
    public SadMood(Date date){
        super(date);
    }

    /**
     * Prints Mood object
     *
     * @return string representing mood
     */
    @Override
    public String printMood() {
        return ":(";
    }
}
