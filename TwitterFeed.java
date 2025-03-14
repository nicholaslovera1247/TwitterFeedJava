/**
Nicholas Lovera
CS2100A
TwitterFeed Class - Tells us the author of a twitter feed, while also
creating an array of said twitter feed
*/
import java.util.ArrayList;
public class TwitterFeed
{
   // Instance variables
   private String feedAuthor;
   private ArrayList<Tweet> tweets;
   
   // private class constant
   private static final int INITIAL_CAPACITY = 100;
   
   /**
      Constructor
      Sets tweets to an empty array with a limit of our initial capacity constant (100)
      @param String a: Author of twitter feed
   */
   public TwitterFeed(String a)
   {
      feedAuthor = a;
      tweets = new ArrayList<Tweet>(INITIAL_CAPACITY);
   }
   
   /**
      Method getFeedAuthor takes no parameteres and returns the author of our
      twitter feed
      @return feedAuthor
   */
   public String getFeedAuthor()
   {
      return feedAuthor;
   }
   
   /**
      Method getTweet takes no parameters, but makes a deep copy
      of our twitter feed array while returning the copy
      @return tweetsCopy
   */
   public ArrayList<Tweet> getTweet()
   {
      ArrayList<Tweet> tweetsCopy = new ArrayList<>();
      
      for(Tweet tweet : tweets)
      {
         tweetsCopy.add(tweet);
      }
      
      return tweetsCopy;
   }
   
   /**
      Method addTweet takes 2 parameters, String a and t, and 
      adds them to our tweets array by creating a new Tweet object to add
      to the array
      @param String a: tweet author
      @param String t: tweet itself
   */
   public void addTweet(String a, String t)
   {
      if(tweets.size() < INITIAL_CAPACITY)
      {
         tweets.add(new Tweet(a, t));
      }
   }
   
   /**
      Method addTweet is an overload method, which uses the same name
      but only takes 1 parameter, Tweet t, and adds that tweet object 
      to our tweets array if it is less than our class constant value
      @param Tweet t: Tweet object
   */
   public void addTweet(Tweet t)
   {
      if(tweets.size() < INITIAL_CAPACITY)
      {
         tweets.add(t);
      }  
   }
   
   @Override
   /**
      Method toString is our TwitterFeed toString, which takes our
      array of tweets and our feed author and converts it into an
      easy to read string, takes no paramenters
      @return String.format
   */
   public String toString()
   {
      ArrayList<Tweet> feed = new ArrayList<>();
      for (Tweet tweet : tweets)
      {
         feed.add(tweet);
      }
      return String.format("%s\n%s",feedAuthor,feed);
   }
   
   /**
      Method tweetsBy takes one parameter, String a, and returns
      and array of tweets only made by that author that are on our
      feed authors feed
      @param String a: Tweet author
      @return tweetsByAuthor
   */
   
   public ArrayList<Tweet> tweetsBy(String a)
   {
      ArrayList<Tweet> tweetsByAuthor = new ArrayList<>();
      for (Tweet tweet:tweets)
      {
         if(tweet.getAuthor().equals(a))
         {
            tweetsByAuthor.add(tweet);
         }
      }
      return tweetsByAuthor;
   }
   
   
}
