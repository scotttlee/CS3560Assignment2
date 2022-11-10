
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sudis
 */
public class UserSubject {
    private List<UserObserver> followers = new ArrayList<>();
    
    public void attach(UserObserver observer){
        followers.add(observer);
    }
    
    public void updateFollowers(String tweet){
        for(UserObserver observer : this.followers){
            observer.update(this, tweet);
        }
    }
}
