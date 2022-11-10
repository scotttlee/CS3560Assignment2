/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.UUID;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 *
 * @author Sudis
 */
public class Users implements usersInterface{
    private String userID;
    private String username;
    private DefaultMutableTreeNode root;
    
    public Users(String username, DefaultMutableTreeNode root){
        this.userID = UUID.randomUUID().toString();
        this.username = username;
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
    
    @Override
    public DefaultMutableTreeNode getRoot(){
        return root;
    }
    
  
}
