
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    private int counter;
    
    private List<usersInterface> childUsers;
    
    public Groups(){
        userID = UUID.randomUUID().toString();
        this.childUsers = new ArrayList<>();
    }
    
    @Override
    public void setUsername(String a){
        username = a;
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
    
    public void setRootName(){
        username = "root";
    }
}
