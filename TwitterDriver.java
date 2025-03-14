/**
Nicholas Lovera
CS2100A
TwitterDriver - Driver that tests the functionality of our Tweet and TwitterFeed
classes
*/
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class TwitterDriver
{
   public static void main(String [] args) throws IOException
   {
      /**
       Set our constants to null so that we can initialized them but be able to
       reference certain objects later in the program. Useful for when needing to
       reference objects only after a certain loop has terminated.
       Also set int readLine to zero so that we can use this to apply
       info from specific lines in the file 
      */
      String tweetAuthor;
      String feedAuthor;
      String tweet;
      int readLine = 0;
      // Scanner object created to read file
      Scanner infile = new Scanner(new File("feed1.txt"));
      
      // for loop to read through file
      for(int i = 0; i == 0; i++)
      {
         // Apply data from file to our classes
         String line = infile.nextLine();
         feedAuthor = line;
         
      }
      TwitterFeed tf = new TwitterFeed(feedAuthor);
      
      while(infile.hasNext())
      {
         if(readLine == 0)
         {
            readLine++;
         }
         
         else
         {
            String line = infile.nextLine();
            tweetAuthor = line;
            if(infile.hasNext())
            {
               tweet=infile.nextLine();
               tf.addTweet(tweetAuthor,tweet);
            }
         }
      }
      
      
      // Print our data in the desired formats
      System.out.printf("Feed of @%s\n",feedAuthor);
      for (Tweet t: tf.getTweet())
      {
         System.out.println(t.toString());
      }
      
      System.out.printf("\n\n\n");
      
      tweetAuthor = "BillGates";
      System.out.printf("Tweets on %s feed by %s:\n\n", feedAuthor, tweetAuthor);
      for (Tweet t: tf.tweetsBy(tweetAuthor))
      {
         System.out.println(t.toString());
      }
   }
}