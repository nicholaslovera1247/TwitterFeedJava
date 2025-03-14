/**
Nicholas Lovera
CS2100A
Tweet Class - Tells us the content of a tweet and its author
*/
public class Tweet
{
   // instance variables
   private String tweetSent;
   private String tweetAuthor;
   
   // public class constant
   public static final int MAX_CHARS = 140;
   
   /**
      constructor
      @param String a: the tweets author
      @param String t: the content of the tweet
   */
   public Tweet(String a, String t)
   {
      tweetAuthor = a;
      
      if (t.length() <= MAX_CHARS)
      {
         tweetSent = t;
      }
      
      else
      {
         tweetSent = t.substring(0,140);
      }
      
   }
   
   /**
      Copy Constructor 
      @param Tweet other: Other Tweet object
   */
   public Tweet(Tweet other)
   {
      this(other.tweetSent, other.tweetAuthor);
   }
   
   /**
     Method setTweet takes parameter String t and sets the value of tweetSent equal to t 
     depending on the length of t
     @param String t: The tweet, set to tweetSent depending on amount of chars
   */
   public void setTweet(String t)
   {
      if (t.length() <= MAX_CHARS)
      {
         tweetSent = t;
      }
      
      else
      {
         tweetSent = t.substring(0,140);
      }
   }
   
   /**
      Method setAuthor takes a String, String a, and assigned its value to tweetAuthor
      @param String a: the author of the tweet
   */
   public void setAuthor(String a)
   {
      tweetAuthor = a;
   }
   
   /**
      Method getTweet takes no parameters and returns our tweet
      @return String tweetSent
   */
   public String getTweet()
   {
      return tweetSent;
   }
   /**
      Method getAuthor takes no parameters and returns our tweets author
      @return String tweetAuthor
   */
   public String getAuthor()
   {
      return tweetAuthor;
   }
   
   @Override
   
   /**
      Method toString takes no parameters and returns our tweetAuthor
      and tweetSent values converted into a string format
      @param String.format
   */
   public String toString()
   {
      return String.format("@%s \n\"%s\"",tweetAuthor,tweetSent);
   }
   
   @Override
   
   /**
      Method equals takes 1 parameter (Object other) and returns a boolean,
      telling us if two tweets are equal or not
      @param Object other: Other tweet object
      @return boolean
   */
   public boolean equals(Object other)
   {
      Tweet tOther = (Tweet)other;
      return this.tweetSent.equals(tOther.tweetSent)
            && this.tweetAuthor.equals(tOther.tweetAuthor);
   }
}
