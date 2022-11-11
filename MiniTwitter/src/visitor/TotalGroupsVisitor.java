/**
 *
 * @author scottlee
 */

package visitor;

import minitwitter.Users;
import minitwitter.Groups;
import minitwitter.VisitorInterface;

//visitor design pattern for groups
public class TotalGroupsVisitor implements VisitorInterface{
    private int numGroups;
    
    @Override
    public void visitUser(Users user){
        
    }
    
    //set total amount of groups
    @Override
    public void visitGroup(Groups group){
        setNumGroups(getNumGroups() + 1);
    }
    
    public int getNumGroups(){
        return numGroups;
    }
    
    public void setNumGroups(int totalGroups){
        this.numGroups = totalGroups;
    }
}
