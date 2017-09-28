
/*
 * Tweetable
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
 * Interface for Tweet objects
 *
 * @author team X
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */
public interface Tweetable {

    /**
     * Gets the tweet message
     *
     * @return tweet message
     */
    public String getMessage();

    /**
     * Gets the tweet date
     *
     * @return tweet date
     */
    public Date getDate();
}
