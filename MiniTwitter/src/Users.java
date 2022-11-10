/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 *
 * @author Sudis
 */
public class Users extends UserSubject implements usersInterface, UserObserver{
    private String userID;
    private String username;
    private DefaultMutableTreeNode root;
    private List<Users> followers = new ArrayList<>();
    private DefaultListModel followerList = new DefaultListModel();
    private List<String> userTweets = new ArrayList<>();
    private DefaultListModel newsFeed = new DefaultListModel();
    
    
    public Users(String username, DefaultMutableTreeNode root){
        this.userID = UUID.randomUUID().toString();
        this.username = username;
        this.root = root;
    }
    
    public void addFollowers(Users user){
        followers.add(user);
        followerList.addElement(user);
    }
    
    public DefaultListModel<Users> getFollowers(){
        return followerList;
    }
    
    public void tweet(String tweet){
        userTweets.add(tweet);
        newsFeed.addElement(this.getUsername() + ": " + tweet);
        updateFollowers(tweet);
    }
    
    public DefaultListModel<String> getNewsFeedList(){
        return newsFeed;
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

    @Override
    public void update(UserSubject subject, String tweet) {
        if(subject instanceof Users){
            this.newsFeed.addElement(((Users) subject).getUsername() + ": " + tweet);
        }
    }
    
  
}
