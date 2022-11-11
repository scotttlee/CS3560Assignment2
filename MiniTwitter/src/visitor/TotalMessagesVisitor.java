/**
 *
 * @author scottlee
 */

package visitor;

import minitwitter.VisitorInterface;
import minitwitter.Users;
import minitwitter.Groups;

//visitor design pattern to find total amount of messages tweeted
public class TotalMessagesVisitor implements VisitorInterface{
    private int numMessages;
    
    //visit user to find the total amount of tweets sent
    @Override
    public void visitUser(Users user){
        setNumMessages(getNumMessages() + user.getTweets().size());
    }
    
    @Override
    public void visitGroup(Groups group){
        
    }
    
    public int getNumMessages(){
        return numMessages;
    }
    
    public void setNumMessages(int totalMessages){
        numMessages = totalMessages;
    }
}
