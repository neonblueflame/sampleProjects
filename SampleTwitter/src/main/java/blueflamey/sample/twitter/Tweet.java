package blueflamey.sample.twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Hello world!
 *
 */
public class Tweet 
{
	static String testStatus = "Hello from twitter 4j";
	
    public static void main( String[] args )
    {
    	String consumerKey = "8GRK25RQmdlHB147ClrCzLuMF";
    	String consumerSecret = "s5JoB0w5MScpJbwMXXVsTLtbebY0WGdLWbqm4WGwbUF6OmXBk2";
    	
//    	ConfigurationBuilder builder = new ConfigurationBuilder();
//      builder.setDebugEnabled(true);
//      builder.setOAuthConsumerKey(consumerKey);
//      builder.setOAuthConsumerSecret(consumerSecret);
        
//      TwitterFactory factory = new TwitterFactory(builder.build());
//      Twitter twitter = factory.getInstance();
    	Twitter twitter = TwitterFactory.getSingleton();
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
        
        try {
        	RequestToken tokenReq = twitter.getOAuthRequestToken();
			System.out.println("Request token:");
			System.out.println(tokenReq.getToken());
			System.out.println("Request token secret:");
			System.out.println(tokenReq.getTokenSecret());
	        
	        AccessToken tokenAccess = null;
	        BufferedReader reader = new BufferedReader(
	        	new InputStreamReader(System.in));
	        
	        while (null == tokenAccess) {
	        	System.out.println(tokenReq.getAuthenticationURL());
	        	String PIN = reader.readLine();
	        	
	        	if (PIN.length() > 0)
	        		tokenAccess = twitter.getOAuthAccessToken(tokenReq, PIN);
	        	else
	        		tokenAccess = twitter.getOAuthAccessToken();
	        }
	        
	        Status status = twitter.updateStatus(testStatus);
	        System.out.println("Status updated!");
	        System.out.println(status.getText());
	        
		} catch (TwitterException te) {
			if (401 == te.getStatusCode())
				System.out.println(te.getMessage());
			
			te.printStackTrace();
			
		} catch(IOException ie) {
			ie.printStackTrace();
		}
    }
}
