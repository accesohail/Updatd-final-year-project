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
public class General_Doctor extends javax.swing.JFrame {
 Connection con=null;
 Statement st=null;
 ResultSet rs=null;
 boolean field=false;
 String patient;
    /**
     * Creates new form Doctor
     */
    public General_Doctor() {
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

        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        textArea1 = new java.awt.TextArea();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        textArea2 = new java.awt.TextArea();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label14 = new java.awt.Label();
        label16 = new java.awt.Label();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        label17 = new java.awt.Label();
        label18 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(990, 700));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/login.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(717, 0, 260, 190);

        label1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        label1.setText("General Physician");
        getContentPane().add(label1);
        label1.setBounds(220, 30, 330, 47);

        label2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label2.setText("Patient Disease");
        getContentPane().add(label2);
        label2.setBounds(540, 270, 190, 33);

        label3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label3.setText("Patient ID");
        getContentPane().add(label3);
        label3.setBounds(60, 120, 120, 33);

        label4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label4.setText("Medications");
        getContentPane().add(label4);
        label4.setBounds(60, 440, 250, 33);

        label5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label5.setText("Patient Age");
        getContentPane().add(label5);
        label5.setBounds(410, 120, 140, 40);

        label6.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label6.setText("Patient Name");
        getContentPane().add(label6);
        label6.setBounds(60, 160, 160, 33);
        getContentPane().add(textArea1);
        textArea1.setBounds(120, 270, 400, 150);

        label7.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label7.setText("Disease Description");
        getContentPane().add(label7);
        label7.setBounds(60, 230, 250, 33);

        label8.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label8.setText("Patient Sex");
        getContentPane().add(label8);
        label8.setBounds(410, 160, 140, 33);
        getContentPane().add(textArea2);
        textArea2.setBounds(120, 480, 400, 140);

        button1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        button1.setLabel("EXIT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(620, 590, 70, 37);

        button2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        button2.setLabel("Refer to Specialist");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(710, 590, 240, 37);

        label10.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label10);
        label10.setBounds(230, 160, 80, 30);

        label11.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label11);
        label11.setBounds(560, 120, 90, 30);

        label12.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label12);
        label12.setBounds(560, 160, 90, 30);

        label14.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label14.setText("Temperature");
        getContentPane().add(label14);
        label14.setBounds(530, 410, 170, 33);

        label16.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label16.setText(" B.P lower limit");
        getContentPane().add(label16);
        label16.setBounds(540, 360, 190, 33);

        jTextField5.setToolTipText("enter bp like upper limit  space lower limit");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(740, 360, 140, 30);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 500, 120, 50);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 120, 90, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(740, 410, 140, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(740, 270, 140, 30);

        jTextField4.setToolTipText("enter bp like upper limit  space lower limit");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(740, 310, 140, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("SHOW history");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(730, 500, 130, 50);

        label17.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label17.setText(" B.P upper limit");
        getContentPane().add(label17);
        label17.setBounds(540, 310, 190, 33);

        label18.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label18.setText(" B.P upper limit");
        getContentPane().add(label18);
        label18.setBounds(540, 310, 190, 33);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      boolean update=true;
      if(jTextField3.getText().isEmpty()&&jTextField4.getText().isEmpty()&&jTextField2.getText().isEmpty()&&textArea1.getText().isEmpty()&&textArea2.getText().isEmpty()){
          update=false;
            
      }
   
       
          
        Connection con=null;
 PreparedStatement st=null;
 ResultSet rs=null;
             database db= new database();
       int id=0, fee=0;
       if(field&&update){
     try{
          
     id=Integer.valueOf(jTextField2.getText());
       fee=Integer.parseInt( jTextField4.getText());
       con=db.createdatabase();
       st=con.prepareStatement("update PATIENT SET disease ='"+jTextField3.getText()+"',temperature='"+jTextField2.getText()+"',bp='"+jTextField4.getText()+"',bplower='"+jTextField5.getText()+"', description='"+textArea1.getText()+"',medication='"+textArea2.getText()+"' where id='"+jTextField1.getText()+"' ");
      st.execute();
             JOptionPane.showMessageDialog(this,"Patient updated  successfully");  
             
         jTextField2.setText("");
            jTextField1.setText("");
             jTextField3.setText("");
              jTextField4.setText("");
              jTextField5.setText("");
       textArea1.setText("");
         textArea2.setText("");
         label10.setText("");
          label11.setText("");
          label12.setText("");
     }
     catch (SQLException e )
     {
       JOptionPane.showMessageDialog(this,e);
     }
       }
        else
          
          JOptionPane.showMessageDialog(this,"Please fill all the fields "); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
  
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        this.hide();
        login l=new login();
        l.show();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
         this.hide();
         Refer_Form rf=new Refer_Form(jTextField1.getText());
         rf.show();
    }//GEN-LAST:event_button2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
               database db= new database();
      String id="";
      boolean login =false;
      
     try{
       con=db.createdatabase();
      st=con.createStatement();
     rs=st.executeQuery("select * from PATIENT where id='"+jTextField1.getText()+"' ");
       while(rs.next()){
           field=true;
         id= jTextField1.getText();
          label10.setText(rs.getString("NAME"));
          label11.setText(rs.getString("AGE"));
          label12.setText(rs.getString("SEX"));
          
      }
    }
    catch (SQLException e )
        
     {
           JOptionPane.showMessageDialog(this,e); 
         
     }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      history a= new history("rec");
      a.show();
      
      
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(General_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(General_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(General_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(General_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new General_Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label14;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
