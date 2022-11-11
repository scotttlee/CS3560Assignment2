/**
 *
 * @author scottlee
 */

package minitwitter;

//observer pattern interface
public interface UserObserver {
    public void update(UserSubject subject, String tweet);
}
