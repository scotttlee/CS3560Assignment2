/**
 *
 * @author scottlee
 */

package minitwitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositivityCheckVisitor implements VisitorInterface{
    private double numPositive;
    private double numMessages;
    private double positivePercentage;
    private List<String> positiveKeyWords = new ArrayList(Arrays.asList("happy", "good", "nice", "fantastic", "great", "cool", "excited", "awesome"));
    
    //visit user and check for positive keywords
    @Override
    public void visitUser(Users user){
        for(String tweet : user.getTweets()){
            numMessages++;
            for(String positive : positiveKeyWords){
                if(tweet.contains(positive)){
                    numPositive++;
                    break;
                }
            }
        }
    }
    
    @Override
    public void visitGroup(Groups group){
        
    }
    
    //calculate percentage of positive words with number of messages
    public double getPositivePercentage(){
        setPositivePercentage((numPositive/numMessages)*100);
        return positivePercentage;
    }
    
    public void setPositivePercentage(double positivePercentage){
        this.positivePercentage = positivePercentage;
    }
    
}
