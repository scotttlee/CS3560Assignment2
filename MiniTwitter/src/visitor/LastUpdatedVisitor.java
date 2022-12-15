/**
 *
 * @author scottlee
 */

package visitor;

import minitwitter.Users;
import minitwitter.Groups;
import minitwitter.VisitorInterface;

//visitor design pattern to get the last updated user
public class LastUpdatedVisitor implements VisitorInterface{
    String lastUpdatedID;
    long lastUpdatedTime;
    
    //if the new tweet time is > previous tweet time, set lastUpdatedID to the most recently tweeted user
    @Override
    public void visitUser(Users user){
        if(user.getLastUpdatedTime() > lastUpdatedTime){
            lastUpdatedID = user.getUsername();
        }
    }
    
    @Override
    public void visitGroup(Groups group){
        
    }
    
    public String getLastUpdatedID(){
        return lastUpdatedID;
    }
}
