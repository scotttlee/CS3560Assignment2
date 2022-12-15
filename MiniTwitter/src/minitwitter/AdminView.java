/**
 *
 * @author scottlee
 */

package minitwitter;


import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.JOptionPane;
import visitor.TotalGroupsVisitor;
import visitor.TotalMessagesVisitor;
import visitor.TotalUsersVisitor;
import visitor.LastUpdatedVisitor;
/**
 *
 * @author scottlee
 */
public class AdminView extends javax.swing.JFrame {


    Groups rootGroup = new Groups("root");
    List<usersInterface> list = new ArrayList<>();
    Boolean check;

    //singleton design pattern by initializing a single AdminView
    private static AdminView admin = new AdminView();

    public static AdminView getInstance() {
        if(admin == null){
            admin = new AdminView();
        }
        return admin;
    }

    private AdminView() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        usersTree = new javax.swing.JTree();
        addUser = new javax.swing.JButton();
        addGroup = new javax.swing.JButton();
        openUserView = new javax.swing.JButton();
        showUserTotal = new javax.swing.JButton();
        showMessagesTotal = new javax.swing.JButton();
        showGroupTotal = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        groupID = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        userID = new javax.swing.JTextArea();
        showPositivePercentage = new javax.swing.JButton();
        validateID = new javax.swing.JButton();
        lastUpdatedUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Root");
        usersTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(usersTree);

        addUser.setText("Add User");
        addUser.setPreferredSize(new java.awt.Dimension(180, 20));
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        addGroup.setText("Add Group");
        addGroup.setPreferredSize(new java.awt.Dimension(180, 20));
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        openUserView.setText("Open User View");
        openUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUserViewActionPerformed(evt);
            }
        });

        showUserTotal.setText("Show User Total");
        showUserTotal.setPreferredSize(new java.awt.Dimension(180, 20));
        showUserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUserTotalActionPerformed(evt);
            }
        });

        showMessagesTotal.setText("Show Total Messages");
        showMessagesTotal.setPreferredSize(new java.awt.Dimension(180, 20));
        showMessagesTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMessagesTotalActionPerformed(evt);
            }
        });

        showGroupTotal.setText("Show Group Total");
        showGroupTotal.setPreferredSize(new java.awt.Dimension(180, 20));
        showGroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGroupTotalActionPerformed(evt);
            }
        });

        groupID.setColumns(20);
        groupID.setRows(5);
        groupID.setPreferredSize(new java.awt.Dimension(180, 20));
        jScrollPane4.setViewportView(groupID);

        userID.setColumns(20);
        userID.setRows(5);
        userID.setPreferredSize(new java.awt.Dimension(180, 20));
        jScrollPane5.setViewportView(userID);

        showPositivePercentage.setText("Show Positive Percentage");
        showPositivePercentage.setPreferredSize(new java.awt.Dimension(180, 20));
        showPositivePercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPositivePercentageActionPerformed(evt);
            }
        });

        validateID.setText("Validate IDs");
        validateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateIDActionPerformed(evt);
            }
        });

        lastUpdatedUser.setText("Last user updated");
        lastUpdatedUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastUpdatedUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showMessagesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPositivePercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(openUserView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showUserTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(validateID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastUpdatedUser, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                            .addComponent(showGroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(openUserView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validateID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastUpdatedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showUserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showGroupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showMessagesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPositivePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        addUser.getAccessibleContext().setAccessibleName("addUser");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed

        
        //add users to jtree and update on button click
        TreeSelectionModel check = usersTree.getSelectionModel();

        //user must select a group in order to add a user
        if(check.getSelectionCount() > 0 ){
            
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)usersTree.getSelectionPath().getLastPathComponent();
            DefaultTreeModel model = (DefaultTreeModel) usersTree.getModel();
            DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
            Users newUser = new Users(userID.getText(), root);
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newUser, false);
            
            //add new user as a child to the selected node in the jtree
            selectedNode.add(newNode);
            //add new user to the group through composite class
            rootGroup.addUser(newUser);
            System.out.println(newUser.getUsername() + " created at " + newUser.getCreationTime());
            

            //refresh the jtree model to show changes after adding a user
            DefaultTreeModel modelRefresh = (DefaultTreeModel)usersTree.getModel();
            modelRefresh.reload();
        }
    }//GEN-LAST:event_addUserActionPerformed

    private void openUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUserViewActionPerformed

        //pass selected user in the jtree to open the user view for that specific user
        DefaultMutableTreeNode selectedUser = (DefaultMutableTreeNode)usersTree.getSelectionPath().getLastPathComponent();
        Users openUser = (Users)selectedUser.getUserObject();

        UserView student = new UserView(openUser, rootGroup);
        student.setVisible(true);
    }//GEN-LAST:event_openUserViewActionPerformed

    private void showPositivePercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPositivePercentageActionPerformed

        //using visitor design pattern, pass positivity check visitor to check for positive messages ratio
        PositivityCheckVisitor posVisitor = new PositivityCheckVisitor();
        rootGroup.accept(posVisitor);
        double posPercentage = posVisitor.getPositivePercentage();
        JOptionPane.showMessageDialog(null, "Positive percentage: " + posPercentage + "%");
    }//GEN-LAST:event_showPositivePercentageActionPerformed

    private void showMessagesTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMessagesTotalActionPerformed
        // TODO add your handling code here:
        //using visitor design pattern, pass total number of messages visitor to check for number of messages
        TotalMessagesVisitor numMessagesVisitor = new TotalMessagesVisitor();
        rootGroup.accept(numMessagesVisitor);
        int numMessages = numMessagesVisitor.getNumMessages();
        JOptionPane.showMessageDialog(null, "Total Messages: " + numMessages);
        
    }//GEN-LAST:event_showMessagesTotalActionPerformed

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed

        //add groups to jtree and update on button click
        TreeSelectionModel check = usersTree.getSelectionModel();

        //user must select a group in order to add another group
        if(check.getSelectionCount() > 0){
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)usersTree.getSelectionPath().getLastPathComponent();
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(groupID.getText(), true);
            Groups newGroup = new Groups(groupID.getText());

            //add new group as a child to the selected node in the jtree
            selectedNode.add(newNode);
            
            //add group to composite group class
            rootGroup.addUser(newGroup);
            System.out.println(newGroup.getUsername() + " created at " + newGroup.getCreationTime());

            //refresh the jtree model to show changes after adding a group
            DefaultTreeModel model = (DefaultTreeModel)usersTree.getModel();

            model.reload();
        }
    }//GEN-LAST:event_addGroupActionPerformed

    private void showUserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUserTotalActionPerformed

        //using visitor pattern design, pass total number of users visitor to check for the number of users
        TotalUsersVisitor numTotalUsersVisitor = new TotalUsersVisitor();
        rootGroup.accept(numTotalUsersVisitor);
        int numUsers = numTotalUsersVisitor.getNumUsers();
        JOptionPane.showMessageDialog(null, "Total Users: " + numUsers);
    }//GEN-LAST:event_showUserTotalActionPerformed

    private void showGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGroupTotalActionPerformed

        //using visitor pattern design, pass total number of groups visitor to check for the number of groups
        TotalGroupsVisitor numTotalGroupsVisitor = new TotalGroupsVisitor();
        rootGroup.accept(numTotalGroupsVisitor);
        int numGroups = numTotalGroupsVisitor.getNumGroups();
        JOptionPane.showMessageDialog(null, "Total Groups: " + numGroups);
    }//GEN-LAST:event_showGroupTotalActionPerformed

    private void validateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateIDActionPerformed
        // Validate ID's
        String newGroup = groupID.getText();
        String newUser = userID.getText();

        //check if any user or group in the rootgroup is equal to another, if so, check = true
        list = rootGroup.getObject();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getUsername().equals(userID.getText()) || list.get(i).getUsername().equals(groupID.getText())){
                check = true;
            } else{
                check = false;
            }
        }
        //if check is true then invalidate id's
        if(check = true){
            JOptionPane.showMessageDialog(null, "Invalid, same ID's");
        }
        //if group or user contains space then invalidate ids
        if(newUser.contains(" ") || newGroup.contains(" ")){
            JOptionPane.showMessageDialog(null, "Invalid, ID contains space");
        }
    }//GEN-LAST:event_validateIDActionPerformed

    private void lastUpdatedUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastUpdatedUserActionPerformed
        //prints out last updated user
        LastUpdatedVisitor lastUser = new LastUpdatedVisitor();
        rootGroup.accept(lastUser);
        JOptionPane.showMessageDialog(null, "Last updated user: " + lastUser.getLastUpdatedID());
    }//GEN-LAST:event_lastUpdatedUserActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroup;
    private javax.swing.JButton addUser;
    private javax.swing.JTextArea groupID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton lastUpdatedUser;
    private javax.swing.JButton openUserView;
    private javax.swing.JButton showGroupTotal;
    private javax.swing.JButton showMessagesTotal;
    private javax.swing.JButton showPositivePercentage;
    private javax.swing.JButton showUserTotal;
    private javax.swing.JTextArea userID;
    private javax.swing.JTree usersTree;
    private javax.swing.JButton validateID;
    // End of variables declaration//GEN-END:variables
}
