/**
 *
 * @author scottlee
 */

package minitwitter;

import java.util.ArrayList;
import java.util.List;

//observer design pattern with user being the subject
public class UserSubject {
    private List<UserObserver> followers = new ArrayList<>();
    
    //attach followers to user subject
    public void attach(UserObserver observer){
        followers.add(observer);
    }
    
    //update the followers with the user's tweet
    public void updateFollowers(String tweet){
        for(UserObserver observer : this.followers){
            observer.update(this, tweet);
        }
    }
}
