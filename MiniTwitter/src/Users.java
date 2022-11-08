/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.UUID;
/**
 *
 * @author Sudis
 */
public class Users implements usersInterface{
    private String userID;
    private String username;
    
    public Users(){
        userID = UUID.randomUUID().toString();
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
    public void printUsers(){
        System.out.println(username);
    }
}
