/**
 *
 * @author scottlee
 */

package minitwitter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Users extends UserSubject implements usersInterface, UserObserver{
    private String userID;
    private String username;
    private DefaultMutableTreeNode root;
    private List<Users> followers = new ArrayList<>();
    private DefaultListModel followerList = new DefaultListModel();
    private List<String> userTweets = new ArrayList<>();
    private DefaultListModel newsFeed = new DefaultListModel();
    
    //set user ID, username, and root parent
    public Users(String username, DefaultMutableTreeNode root){
        this.userID = UUID.randomUUID().toString();
        this.username = username;
        this.root = root;
    }
    
    //add followers to user's followersList and add element to jlist
    public void addFollowers(Users user){
        followers.add(user);
        followerList.addElement(user);
    }
    
    public DefaultListModel<Users> getFollowers(){
        return followerList;
    }
    
    //tweet from user and update their follower's with that tweet
    public void tweet(String tweet){
        userTweets.add(tweet);
        newsFeed.addElement(this.getUsername() + ": " + tweet);
        //update their follower's with that tweet using observer pattern
        updateFollowers(tweet);
    }
    
    public List<String> getTweets(){
        return userTweets;
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

    //update subjects of the observer with the tweet and add into their news feed
    @Override
    public void update(UserSubject subject, String tweet) {
        if(subject instanceof Users){
            this.newsFeed.addElement(((Users) subject).getUsername() + ": " + tweet);
        }
    }
    
    //visitor design pattern to accept
    @Override
    public void accept(VisitorInterface visitor){
        visitor.visitUser(this);
    }
}
