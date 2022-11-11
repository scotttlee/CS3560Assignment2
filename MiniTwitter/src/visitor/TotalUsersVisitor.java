/**
 *
 * @author scottlee
 */

package visitor;

import minitwitter.VisitorInterface;
import minitwitter.Users;
import minitwitter.Groups;

//visitor design pattern to find total amount of users
public class TotalUsersVisitor implements VisitorInterface{
    private int numUsers;
    
    //visit the user to set number of users
    @Override
    public void visitUser(Users user){
        setNumUsers(getNumUsers() + 1);
    }
    
    @Override
    public void visitGroup(Groups group){
        
    }
    
    public int getNumUsers(){
        return numUsers;
    }
    
    public void setNumUsers(int numUsers){
        this.numUsers = numUsers;
    }
}
