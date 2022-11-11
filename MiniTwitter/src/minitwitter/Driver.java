package minitwitter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author scottlee
 */
public class Driver {
    public static void main(String[] args){
        AdminView adminFrame = AdminView.getInstance();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                adminFrame.setVisible(true);
            }
        });
    }
}
