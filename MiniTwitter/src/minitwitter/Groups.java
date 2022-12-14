/**
 *
 * @author scottlee
 */

package minitwitter;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.tree.DefaultMutableTreeNode;

public class Groups implements usersInterface{
    private String userID;
    private String username;
    private DefaultMutableTreeNode root;
    private List<usersInterface> childUsers;
    private long creationTime;
    
    //set group ID, username, children users, and group parents
    public Groups(String username){
        userID = UUID.randomUUID().toString();
        this.username = username;
        this.childUsers = new ArrayList<>();
        this.root = root;
    }
    
    public List<usersInterface> getObject(){
        return childUsers;
    }

    @Override
    public String getID(){
        return this.userID;
    }
    
    @Override
    public String getUsername(){
        return this.username;
    }
    
    @Override
    public String toString(){
        return username;
    }
    
    @Override
    public long getCreationTime(){
        return creationTime;
    }
    
    public void addUser(usersInterface user){
        childUsers.add(user);
    }

    @Override
    public DefaultMutableTreeNode getRoot(){
        return root;
    }
    
    //visitor design pattern to accept
    @Override
    public void accept(VisitorInterface visitor){
        visitor.visitGroup(this);
        for(usersInterface members : childUsers){
            if(members instanceof Users){
                members.accept(visitor);
            } else if(members instanceof Groups){
                members.accept(visitor);
            }
        }
    }
    
    
    
}
