
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sudis
 */
public class Groups implements usersInterface{
    private String userID;
    private String username;
    private DefaultMutableTreeNode root;
    private int counter;
    
    private List<usersInterface> childUsers;
    
    public Groups(String username){
        userID = UUID.randomUUID().toString();
        this.username = username;
        this.childUsers = new ArrayList<>();
        this.root = root;
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
    
    public void addUser(usersInterface user){
        childUsers.add(user);
        counter++;
    }
    
    public int getTotalUsers(){
        return counter;
    }
    
    public boolean isGroup(){
        return false;
    }
    
    
    @Override
    public DefaultMutableTreeNode getRoot(){
        return root;
    }
}
