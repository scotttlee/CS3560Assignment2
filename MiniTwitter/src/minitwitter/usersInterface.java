/**
 *
 * @author scottlee
 */

package minitwitter;

import javax.swing.tree.DefaultMutableTreeNode;

//interface for composite design pattern
public interface usersInterface {
        
    public String getID();
    
    public String getUsername();
    
    public String toString();
    
    public long getCreationTime();
    
    public DefaultMutableTreeNode getRoot();
    
    public void accept(VisitorInterface visitor);
   
}
