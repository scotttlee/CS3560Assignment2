
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.JOptionPane;
import java.awt.Component;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author scottlee
 */
public class AdminView extends javax.swing.JFrame {
    
    
    Groups userGroups = new Groups();
    Groups groupGroups = new Groups();
    private int totalUsers;
    private int totalGroups;

    private static AdminView singleDriver = new AdminView();
    
    /**
     * Creates new form Driver
     */
    private AdminView() {
        initComponents();
    }
    
    public static AdminView getInstance() {
        if(singleDriver == null){
            singleDriver = new AdminView();
        }
        return singleDriver;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Root");
        usersTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(usersTree);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 6, 194, 365);

        addUser.setText("Add User");
        addUser.setPreferredSize(new java.awt.Dimension(180, 20));
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        getContentPane().add(addUser);
        addUser.setBounds(434, 6, 149, 79);
        addUser.getAccessibleContext().setAccessibleName("addUser");

        addGroup.setText("Add Group");
        addGroup.setPreferredSize(new java.awt.Dimension(180, 20));
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });
        getContentPane().add(addGroup);
        addGroup.setBounds(434, 91, 149, 80);

        openUserView.setText("Open User View");
        openUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUserViewActionPerformed(evt);
            }
        });
        getContentPane().add(openUserView);
        openUserView.setBounds(206, 177, 377, 70);

        showUserTotal.setText("Show User Total");
        showUserTotal.setPreferredSize(new java.awt.Dimension(180, 20));
        showUserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUserTotalActionPerformed(evt);
            }
        });
        getContentPane().add(showUserTotal);
        showUserTotal.setBounds(206, 253, 190, 62);

        showMessagesTotal.setText("Show Total Messages");
        showMessagesTotal.setPreferredSize(new java.awt.Dimension(180, 20));
        showMessagesTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMessagesTotalActionPerformed(evt);
            }
        });
        getContentPane().add(showMessagesTotal);
        showMessagesTotal.setBounds(206, 321, 190, 50);

        showGroupTotal.setText("Show Group Total");
        showGroupTotal.setPreferredSize(new java.awt.Dimension(180, 20));
        showGroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGroupTotalActionPerformed(evt);
            }
        });
        getContentPane().add(showGroupTotal);
        showGroupTotal.setBounds(402, 253, 181, 62);

        groupID.setColumns(20);
        groupID.setRows(5);
        groupID.setPreferredSize(new java.awt.Dimension(180, 20));
        jScrollPane4.setViewportView(groupID);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(206, 91, 222, 80);

        userID.setColumns(20);
        userID.setRows(5);
        userID.setPreferredSize(new java.awt.Dimension(180, 20));
        jScrollPane5.setViewportView(userID);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(206, 6, 222, 79);

        showPositivePercentage.setText("Show Positive Percentage");
        showPositivePercentage.setPreferredSize(new java.awt.Dimension(180, 20));
        showPositivePercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPositivePercentageActionPerformed(evt);
            }
        });
        getContentPane().add(showPositivePercentage);
        showPositivePercentage.setBounds(402, 321, 181, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
        TreeSelectionModel check = usersTree.getSelectionModel();
        
        if(check.getSelectionCount() > 0){
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)usersTree.getSelectionPath().getLastPathComponent();
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(userID.getText());
            Users newUser = new Users();
            newUser.setUsername(userID.getText());
        
            selectedNode.add(newNode);
            
            
            userGroups.addUser(newUser);
            
            DefaultTreeModel model = (DefaultTreeModel)usersTree.getModel();
            
        
            model.reload();
        }
    }//GEN-LAST:event_addUserActionPerformed

    private void openUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUserViewActionPerformed
        // TODO add your handling code here:
        
        UserView student = new UserView();
        student.setVisible(true);
    }//GEN-LAST:event_openUserViewActionPerformed

    private void showPositivePercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPositivePercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPositivePercentageActionPerformed

    private void showMessagesTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMessagesTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showMessagesTotalActionPerformed

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        // TODO add your handling code here:
        TreeSelectionModel check = usersTree.getSelectionModel();
        
        if(check.getSelectionCount() > 0){
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)usersTree.getSelectionPath().getLastPathComponent();
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(groupID.getText());
            
            Groups newGroup = new Groups();
            newGroup.setUsername(groupID.getText());
            groupGroups.addUser(newGroup);
            
            selectedNode.add(newNode);
            
            
            
            DefaultTreeModel model = (DefaultTreeModel)usersTree.getModel();
        
            model.reload();
        }
    }//GEN-LAST:event_addGroupActionPerformed

    private void showUserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUserTotalActionPerformed
        // TODO add your handling code here:
        totalUsers = userGroups.getTotalUsers();
        //System.out.println(totalUsers);
        JOptionPane.showMessageDialog(null, "Total Users: " + totalUsers);
    }//GEN-LAST:event_showUserTotalActionPerformed

    private void showGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGroupTotalActionPerformed
        // TODO add your handling code here:
        totalGroups = groupGroups.getTotalUsers();
        JOptionPane.showMessageDialog(null, "Total Groups: " + totalGroups);
    }//GEN-LAST:event_showGroupTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

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
    private javax.swing.JButton openUserView;
    private javax.swing.JButton showGroupTotal;
    private javax.swing.JButton showMessagesTotal;
    private javax.swing.JButton showPositivePercentage;
    private javax.swing.JButton showUserTotal;
    private javax.swing.JTextArea userID;
    private javax.swing.JTree usersTree;
    // End of variables declaration//GEN-END:variables
}
