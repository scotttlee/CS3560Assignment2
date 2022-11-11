/**
 *
 * @author scottlee
 */

package minitwitter;

//visitor design pattern interface
public interface VisitorInterface {
    public void visitUser(Users user);
    public void visitGroup(Groups group);
}
