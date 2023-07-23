
package admin;

import java.awt.*;
import java.sql.*;
import javax.swing.*;



public class FeeStructure extends javax.swing.JFrame {
       JLabel L[];
       JTextField T[];
       int row_count_fee_heads;
       int j;
       
    
    public FeeStructure() {
        initComponents();
        this.setBounds(-10,0,1938,1000);
              
        panel_head_add.setVisible(false);
        
        
        
        try{
            
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from allClasses");
         
         
         while(rs.next())
           {
           class_choice.addItem(rs.getString(1));
           }
        }
        
        catch(Exception e)
        {
          e.printStackTrace();
        }
        
        try{
            
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from fee_heads where class = '1st'"); 
         
        rs.last();
          row_count_fee_heads = rs.getRow();
        
         L= new JLabel[row_count_fee_heads];
         T = new JTextField[row_count_fee_heads];
            rs.beforeFirst();
     
                 int w  = 170;
                   j =0;
         while(rs.next())
           {   
               
               
               L[j] = new JLabel(rs.getString(1));
               T[j] = new JTextField(20); 
               L[j].setBounds(190, w, 200, 60);
               T[j].setBounds(850, w, 200, 60);
                   w = w +80;
                   
               L[j].setFont(new Font("Tahoma", Font.BOLD, 25));
               T[j].setFont(new Font("Tahoma", Font.BOLD, 20));
               L[j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
               T[j].setBorder(BorderFactory.createBevelBorder(NORMAL));
               L[j].setHorizontalAlignment((int) CENTER_ALIGNMENT);
           panel_fee_structure.add(L[j]);
           panel_fee_structure.add(T[j]);
                     j++;
           }
         save_button_feeStructure.setBounds(530,w+70,200,60);
        }
        
        catch(Exception e)
        {
          e.printStackTrace();
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        class_choice = new javax.swing.JComboBox<>();
        panel_fee_structure = new javax.swing.JPanel();
        panel_head_add = new javax.swing.JPanel();
        Label_head_name_add_head = new javax.swing.JLabel();
        T_add_head = new javax.swing.JTextField();
        button_done_add_head = new javax.swing.JButton();
        button_save_add_head = new javax.swing.JButton();
        applicable_fee_label = new javax.swing.JLabel();
        fee_heads_label = new javax.swing.JLabel();
        save_button_feeStructure = new javax.swing.JButton();
        add_fee_heads = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        class_choice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        class_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_choiceActionPerformed(evt);
            }
        });
        getContentPane().add(class_choice);
        class_choice.setBounds(880, 40, 150, 50);

        panel_fee_structure.setBackground(new java.awt.Color(204, 204, 255));
        panel_fee_structure.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_fee_structure.setLayout(null);

        panel_head_add.setBackground(new java.awt.Color(0, 102, 153));
        panel_head_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_head_add.setLayout(null);

        Label_head_name_add_head.setBackground(new java.awt.Color(255, 255, 255));
        Label_head_name_add_head.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Label_head_name_add_head.setText("    Head Name ");
        Label_head_name_add_head.setBorder(new javax.swing.border.MatteBorder(null));
        panel_head_add.add(Label_head_name_add_head);
        Label_head_name_add_head.setBounds(80, 10, 280, 60);

        T_add_head.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        T_add_head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_add_headActionPerformed(evt);
            }
        });
        panel_head_add.add(T_add_head);
        T_add_head.setBounds(130, 90, 200, 50);

        button_done_add_head.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button_done_add_head.setText("Done");
        button_done_add_head.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_done_add_head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_done_add_headActionPerformed(evt);
            }
        });
        panel_head_add.add(button_done_add_head);
        button_done_add_head.setBounds(240, 180, 90, 40);

        button_save_add_head.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button_save_add_head.setText("Save ");
        button_save_add_head.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_save_add_head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_save_add_headActionPerformed(evt);
            }
        });
        panel_head_add.add(button_save_add_head);
        button_save_add_head.setBounds(140, 180, 80, 40);

        panel_fee_structure.add(panel_head_add);
        panel_head_add.setBounds(820, 20, 440, 240);

        applicable_fee_label.setBackground(new java.awt.Color(51, 255, 255));
        applicable_fee_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        applicable_fee_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        applicable_fee_label.setText("Applicable Fee");
        applicable_fee_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel_fee_structure.add(applicable_fee_label);
        applicable_fee_label.setBounds(790, 50, 340, 80);

        fee_heads_label.setBackground(new java.awt.Color(51, 255, 255));
        fee_heads_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        fee_heads_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fee_heads_label.setText("Fee Heads");
        fee_heads_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panel_fee_structure.add(fee_heads_label);
        fee_heads_label.setBounds(170, 50, 250, 80);

        save_button_feeStructure.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        save_button_feeStructure.setText("Save");
        save_button_feeStructure.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save_button_feeStructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_button_feeStructureActionPerformed(evt);
            }
        });
        panel_fee_structure.add(save_button_feeStructure);
        save_button_feeStructure.setBounds(510, 720, 120, 50);

        getContentPane().add(panel_fee_structure);
        panel_fee_structure.setBounds(330, 130, 1260, 790);

        add_fee_heads.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add_fee_heads.setText("Add Heads");
        add_fee_heads.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_fee_heads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_fee_headsActionPerformed(evt);
            }
        });
        getContentPane().add(add_fee_heads);
        add_fee_heads.setBounds(1440, 80, 150, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void class_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_choiceActionPerformed
        try
        {            
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from fee_heads where class = '"+class_choice.getSelectedItem().toString()+"' "); 
         
        
              int w  = 170;
                      
             if(rs.next())
            {  
              rs.last();
          row_count_fee_heads = rs.getRow();
        
         L= new JLabel[row_count_fee_heads];
         T = new JTextField[row_count_fee_heads];
            rs.beforeFirst();
              j =0;
         while(rs.next())
           {   
               
               
               L[j] = new JLabel(rs.getString(1));
               T[j] = new JTextField(20); 
               L[j].setBounds(190, w, 200, 60);
               T[j].setBounds(850, w, 200, 60);
                   w = w +80;
                   
               L[j].setFont(new Font("Tahoma", Font.BOLD, 25));
               T[j].setFont(new Font("Tahoma", Font.BOLD, 20));
               L[j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
               T[j].setBorder(BorderFactory.createBevelBorder(NORMAL));
               L[j].setHorizontalAlignment((int) CENTER_ALIGNMENT);
           panel_fee_structure.add(L[j]);
           panel_fee_structure.add(T[j]);
                     j++;
           }
          }
          else
          {
             int m =0;
              while(m<j)
              {
            L[m].setVisible(false);
            T[m].setVisible(false);
             m++; 
              } 
         save_button_feeStructure.setBounds(530,w+70,200,60);
          }
        } 
        catch(Exception e)
        {
          e.printStackTrace();
        }
        
    
        
    }//GEN-LAST:event_class_choiceActionPerformed

    private void add_fee_headsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_fee_headsActionPerformed
       
      panel_head_add.setVisible(true);
         
    }//GEN-LAST:event_add_fee_headsActionPerformed

    private void button_done_add_headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_done_add_headActionPerformed
        
              panel_head_add.setVisible(false);
               new FeeStructure().setVisible(true);
    }//GEN-LAST:event_button_done_add_headActionPerformed

    private void button_save_add_headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_save_add_headActionPerformed
         int j = 0;
      
         try{
             
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from fee_heads where class = '"+class_choice.getSelectedItem().toString()+"' ");
         
         
         while(rs.next())
         {
         if(rs.getString(1).equals(T_add_head.getText()))
          {
           j = 1;
            break;
          }
         }
        if(j == 0)
        { 
         int i = st.executeUpdate("insert into fee_heads (head_names,class) values ('"+T_add_head.getText()+"','"+class_choice.getSelectedItem().toString()+"')");
         
         if(i == 1)
         {
          JOptionPane.showMessageDialog(this, "head added successfully");
             T_add_head.setText("");
        
         }
         }
         if(j == 1)
         {
          JOptionPane.showMessageDialog(this, "head exists already");
         }
         }
         catch(Exception e)
         {
           e.printStackTrace();
         }
        
        
        
    }//GEN-LAST:event_button_save_add_headActionPerformed

    private void T_add_headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_add_headActionPerformed
    }//GEN-LAST:event_T_add_headActionPerformed

    private void save_button_feeStructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_button_feeStructureActionPerformed
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement st = c.createStatement();
        int k = 0;
        while(k<j)
        {
           int i = st.executeUpdate("insert into fee_on_class(class,head_name,amount) values('"+class_choice.getSelectedItem().toString()+"','"+L[k].getText()+"','"+T[k].getText()+"') ");
          
           if(i == 1)
           {
            T[k].setText("");
           }
           k++;
        }
          if(k == j)
         {
          JOptionPane.showMessageDialog(this, "fee of " +class_choice.getSelectedItem().toString()+ "added successfully");
         }
        }
        catch(Exception e)
                {
                e.printStackTrace();
                }        
    }//GEN-LAST:event_save_button_feeStructureActionPerformed

    public static void main(String args[]) {
     
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
            java.util.logging.Logger.getLogger(FeeStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeStructure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_head_name_add_head;
    private javax.swing.JTextField T_add_head;
    private javax.swing.JButton add_fee_heads;
    private javax.swing.JLabel applicable_fee_label;
    private javax.swing.JButton button_done_add_head;
    private javax.swing.JButton button_save_add_head;
    private javax.swing.JComboBox<String> class_choice;
    private javax.swing.JLabel fee_heads_label;
    private javax.swing.JPanel panel_fee_structure;
    private javax.swing.JPanel panel_head_add;
    private javax.swing.JButton save_button_feeStructure;
    // End of variables declaration//GEN-END:variables
}
