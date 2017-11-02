package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

// Refactoring #2 - removed public modifiers from methods - all methods in an interface are public
// by default, declaring them as such is redundant
public interface Tweetable {
    String getMessage();

    Date getDate();

}
