/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sohail 
 */
public class ENT_SPECIALIST extends javax.swing.JFrame {
boolean update=true,field=false;
    /**
     * Creates new form ENT
     */
    public ENT_SPECIALIST() {
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

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        button1 = new java.awt.Button();
        textArea1 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(990, 700));
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        label1.setText("ENT SPECIALIST");
        getContentPane().add(label1);
        label1.setBounds(340, 40, 303, 47);

        label2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label2.setText("DR.SAM");
        getContentPane().add(label2);
        label2.setBounds(430, 90, 100, 33);

        jLabel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel1.setMinimumSize(new java.awt.Dimension(990, 700));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(671, 0, 310, 240);

        label3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        label3.setText("Patient Id");
        getContentPane().add(label3);
        label3.setBounds(128, 148, 91, 26);

        label4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        label4.setText("Patient Name");
        getContentPane().add(label4);
        label4.setBounds(128, 184, 124, 26);

        label5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        label5.setText("Patient Sex");
        getContentPane().add(label5);
        label5.setBounds(440, 150, 104, 26);

        label6.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        label6.setText("Patient Age");
        getContentPane().add(label6);
        label6.setBounds(440, 180, 108, 26);

        label7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        label7.setText("PATIENT DISEASE");
        getContentPane().add(label7);
        label7.setBounds(494, 291, 168, 26);

        label8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        label8.setText("DISEASE DISCRIPTION");
        getContentPane().add(label8);
        label8.setBounds(120, 270, 207, 26);

        label9.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        label9.setText("MEDICATIONS");
        getContentPane().add(label9);
        label9.setBounds(120, 460, 136, 26);

        button1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        button1.setLabel("EXIT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(790, 530, 72, 37);
        getContentPane().add(textArea1);
        textArea1.setBounds(120, 490, 340, 139);
        getContentPane().add(textArea2);
        textArea2.setBounds(120, 300, 340, 146);

        label11.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label11);
        label11.setBounds(258, 184, 108, 20);

        label12.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label12);
        label12.setBounds(550, 150, 103, 20);

        label13.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label13);
        label13.setBounds(550, 180, 103, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 140, 110, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(690, 290, 110, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 600, 90, 30);

        jButton2.setText("SOW HISTORY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 600, 150, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Add Prescription");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(750, 600, 150, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Show history");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(600, 600, 140, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 String id="",name="";
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                          database db= new database();
     
      boolean login =false;
     try{
         
       con=db.createdatabase();
      st=con.createStatement();
     rs=st.executeQuery("select * from PATIENT where id='"+jTextField1.getText()+"' ");
       while(rs.next()){
           field=true;
         id= jTextField1.getText();
          label11.setText(name=rs.getString("NAME"));
          label12.setText(rs.getString("AGE"));
          label13.setText(rs.getString("SEX"));
      }
    }
    catch (SQLException e )
        
     {
           JOptionPane.showMessageDialog(this,e); 
         
     }  
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Connection con=null;
 PreparedStatement st=null;
 ResultSet rs=null;
             database db= new database();
       int id=0, fee=0;
       if(jTextField2.getText().isEmpty()&&textArea1.getText().isEmpty()&&textArea2.getText().isEmpty()){
                  update=false;
              }
       if(field && update){
     try{
          
     
       con=db.createdatabase();
       st=con.prepareStatement("update PATIENT SET disease ='"+jTextField2.getText()+"', description='"+textArea1.getText()+"',medication='"+textArea2.getText()+"' where id='"+jTextField1.getText()+"' ");
      st.execute();
             JOptionPane.showMessageDialog(this,"Patient updated  successfully");  
              jTextField2.setText("");
            jTextField1.setText("");
       textArea1.setText("");
         textArea2.setText("");
         label11.setText("");
          label13.setText("");
          label12.setText(""); 
       
     }
     catch (SQLException e )
     {
       JOptionPane.showMessageDialog(this,e);
     }
       }
       else
            JOptionPane.showMessageDialog(this,"please fill all the fields");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       this.hide();
       login l= new login();
       l.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        history h= new history("e"); 
        h.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if (id!=""){
            Prescription p= new Prescription(id,name);
        p.show(); 
        }
        else
               JOptionPane.showMessageDialog(this,"please enter id above"); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        history h= new history("e"); 
        h.show();    
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
     Connection con=null;
 Statement st=null;
 ResultSet rs=null;
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
            java.util.logging.Logger.getLogger(ENT_SPECIALIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ENT_SPECIALIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ENT_SPECIALIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ENT_SPECIALIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ENT_SPECIALIST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
