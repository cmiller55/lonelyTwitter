package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.SparseBooleanArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * Created by miller4 on 10/11/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet()
    {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        try {
            tweets.add(tweet);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e){

        }

    }


    public void testDelete() {

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void testHasTweet(){

        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void TestGetTweets() {
        TweetList list = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        Tweet tweet2 = new NormalTweet("test2", new Date(2019, 11, 14));
        Tweet tweet3 = new NormalTweet("test3", new Date(2007, 3, 27));
        list.add(tweet1);
        list.add(tweet2);
        list.add(tweet3);
        ArrayList<Tweet> returnedList = list.getTweets();
        assertEquals(returnedList.get(0), tweet3);
        assertEquals(returnedList.get(1), tweet1);
        assertEquals(returnedList.get(2), tweet2);
    }

    public void testGetCount() {
        TweetList list = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        Tweet tweet2 = new NormalTweet("test2");
        Tweet tweet3 = new NormalTweet("test3");
        list.add(tweet1);
        list.add(tweet2);
        list.add(tweet3);
        assertEquals(list.getCount(), 3);
    }
}
