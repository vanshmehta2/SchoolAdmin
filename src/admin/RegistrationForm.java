package admin;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {
    
   
    public RegistrationForm() {
        initComponents();
        this.setBounds(-10,0,1938,1000);
        registration_header.setBounds(100,30,1650,100);
        registration_background_Label.setBounds(100,90,1715,800);
        Registration_background_mainLabel.setBounds(-10,0,1938,1000);
        addClass_panel.setVisible(false);
        Class_T.setVisible(false);
        cast_T.setVisible(false);
        category_T.setVisible(false);
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from allClasses"); 
         
         while(rs.next())
           {
           Class_Choice.addItem(rs.getString(1));
           }
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
           
        
           try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select max(registration_no) from registrationdata"); 
         
         if(rs.next())
         {
         int i = Integer.parseInt(rs.getString(1))+1;
          registrationNo_TextLabel.setText(""+i);
         }
         else{
         registrationNo_TextLabel.setText("1");
         }
         
         
           }
           catch(Exception e)
           {
            System.out.println(e);
           }
        
        
        
      Class_T.setText("");
      StudentName_T.setText("");
      Mobile_T.setText("");
      FatherName_T.setText("");
      MotherName_T.setText("");
      Address_T.setText("");
      Adhar_T.setText("");
      Class_Roll_T.setText("");
      Board_Roll_T.setText("");
     cast_T.setText("");
      category_T.setText("");
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addClass_panel = new javax.swing.JPanel();
        enter_class_name_Label = new javax.swing.JLabel();
        addClass_T = new javax.swing.JTextField();
        addClass_doneButton = new javax.swing.JButton();
        addClass_addButton = new javax.swing.JButton();
        Mobile_Label = new javax.swing.JLabel();
        StudentName_T = new javax.swing.JTextField();
        StudentName_Label = new javax.swing.JLabel();
        Mobile_T = new javax.swing.JTextField();
        Class_Label = new javax.swing.JLabel();
        Adhar_Label = new javax.swing.JLabel();
        Mobile3 = new javax.swing.JLabel();
        Mother_Name_Label = new javax.swing.JLabel();
        FatherName_Label = new javax.swing.JLabel();
        FatherName_T = new javax.swing.JTextField();
        MotherName_T = new javax.swing.JTextField();
        Address_T = new javax.swing.JTextField();
        Adhar_T = new javax.swing.JTextField();
        Class_Roll_T = new javax.swing.JTextField();
        cast_T = new javax.swing.JTextField();
        Address_Label = new javax.swing.JLabel();
        Class_Roll_Label = new javax.swing.JLabel();
        Board_Roll_Label = new javax.swing.JLabel();
        DOB_Label = new javax.swing.JLabel();
        Category_Label = new javax.swing.JLabel();
        Board_Roll_T = new javax.swing.JTextField();
        category_T = new javax.swing.JTextField();
        Cast_Label = new javax.swing.JLabel();
        Class_T = new javax.swing.JTextField();
        save_button = new javax.swing.JButton();
        Class_Choice = new javax.swing.JComboBox<>();
        registration_header = new javax.swing.JLabel();
        registration_header_background = new javax.swing.JLabel();
        RegistrationNo_Label = new javax.swing.JLabel();
        cast_choice = new javax.swing.JComboBox<>();
        category_choice = new javax.swing.JComboBox<>();
        DOB_date = new com.toedter.calendar.JDateChooser();
        back_to_home_button = new javax.swing.JButton();
        registrationNo_TextLabel = new javax.swing.JLabel();
        add_more_classes_button = new javax.swing.JButton();
        registration_background_Label = new javax.swing.JLabel();
        Registration_background_mainLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        addClass_panel.setBackground(new java.awt.Color(204, 255, 153));
        addClass_panel.setLayout(null);

        enter_class_name_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enter_class_name_Label.setText("Enter Class Name");
        addClass_panel.add(enter_class_name_Label);
        enter_class_name_Label.setBounds(30, 20, 130, 40);
        addClass_panel.add(addClass_T);
        addClass_T.setBounds(190, 30, 110, 30);

        addClass_doneButton.setText("Done");
        addClass_doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClass_doneButtonActionPerformed(evt);
            }
        });
        addClass_panel.add(addClass_doneButton);
        addClass_doneButton.setBounds(190, 80, 70, 25);

        addClass_addButton.setText("Add");
        addClass_addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClass_addButtonActionPerformed(evt);
            }
        });
        addClass_panel.add(addClass_addButton);
        addClass_addButton.setBounds(80, 80, 79, 25);

        getContentPane().add(addClass_panel);
        addClass_panel.setBounds(450, 220, 340, 150);

        Mobile_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Mobile_Label.setText("Mobile");
        getContentPane().add(Mobile_Label);
        Mobile_Label.setBounds(280, 440, 110, 30);

        StudentName_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentName_TActionPerformed(evt);
            }
        });
        getContentPane().add(StudentName_T);
        StudentName_T.setBounds(540, 350, 150, 40);

        StudentName_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        StudentName_Label.setText("Student Name");
        getContentPane().add(StudentName_Label);
        StudentName_Label.setBounds(270, 340, 190, 50);

        Mobile_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mobile_TActionPerformed(evt);
            }
        });
        getContentPane().add(Mobile_T);
        Mobile_T.setBounds(540, 440, 150, 40);

        Class_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Class_Label.setText("Class");
        getContentPane().add(Class_Label);
        Class_Label.setBounds(280, 260, 110, 30);

        Adhar_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Adhar_Label.setText("Adhar Card No.");
        getContentPane().add(Adhar_Label);
        Adhar_Label.setBounds(270, 810, 190, 30);

        Mobile3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(Mobile3);
        Mobile3.setBounds(650, 470, 180, 30);

        Mother_Name_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Mother_Name_Label.setText("Mother Name");
        getContentPane().add(Mother_Name_Label);
        Mother_Name_Label.setBounds(270, 630, 180, 30);

        FatherName_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FatherName_Label.setText("Father Name");
        getContentPane().add(FatherName_Label);
        FatherName_Label.setBounds(270, 540, 170, 30);
        getContentPane().add(FatherName_T);
        FatherName_T.setBounds(540, 540, 150, 40);
        getContentPane().add(MotherName_T);
        MotherName_T.setBounds(540, 630, 150, 40);
        getContentPane().add(Address_T);
        Address_T.setBounds(540, 720, 160, 40);
        getContentPane().add(Adhar_T);
        Adhar_T.setBounds(540, 810, 160, 40);
        getContentPane().add(Class_Roll_T);
        Class_Roll_T.setBounds(1350, 170, 110, 30);

        cast_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cast_TActionPerformed(evt);
            }
        });
        getContentPane().add(cast_T);
        cast_T.setBounds(950, 440, 120, 30);

        Address_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Address_Label.setText("Address");
        getContentPane().add(Address_Label);
        Address_Label.setBounds(270, 720, 110, 30);

        Class_Roll_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Class_Roll_Label.setText("Class Rollno.");
        getContentPane().add(Class_Roll_Label);
        Class_Roll_Label.setBounds(1110, 170, 170, 30);

        Board_Roll_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Board_Roll_Label.setText("Board Roll No.");
        getContentPane().add(Board_Roll_Label);
        Board_Roll_Label.setBounds(1110, 250, 180, 30);

        DOB_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DOB_Label.setText("D.O.B");
        getContentPane().add(DOB_Label);
        DOB_Label.setBounds(1110, 340, 180, 30);

        Category_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Category_Label.setText("Category");
        getContentPane().add(Category_Label);
        Category_Label.setBounds(1110, 530, 180, 30);

        Board_Roll_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Board_Roll_TActionPerformed(evt);
            }
        });
        getContentPane().add(Board_Roll_T);
        Board_Roll_T.setBounds(1350, 250, 120, 30);
        getContentPane().add(category_T);
        category_T.setBounds(950, 530, 120, 30);

        Cast_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cast_Label.setText("Cast");
        getContentPane().add(Cast_Label);
        Cast_Label.setBounds(1110, 440, 180, 30);

        Class_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_TActionPerformed(evt);
            }
        });
        getContentPane().add(Class_T);
        Class_T.setBounds(710, 260, 120, 30);

        save_button.setBackground(new java.awt.Color(0, 153, 204));
        save_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        save_button.setText("Save");
        save_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(save_button);
        save_button.setBounds(830, 860, 200, 60);

        getContentPane().add(Class_Choice);
        Class_Choice.setBounds(550, 260, 100, 30);

        registration_header.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        registration_header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registration_header.setText("Registration Form");
        getContentPane().add(registration_header);
        registration_header.setBounds(710, 0, 450, 160);

        registration_header_background.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registration_header_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/Registartion_form_heading_background (1).jpg"))); // NOI18N
        getContentPane().add(registration_header_background);
        registration_header_background.setBounds(700, 20, 460, 110);

        RegistrationNo_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RegistrationNo_Label.setText("Registration no:");
        getContentPane().add(RegistrationNo_Label);
        RegistrationNo_Label.setBounds(270, 170, 210, 50);

        cast_choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mehta", "Arora", "Sikh", "Sonar", "Jatt", "Jaat" }));
        getContentPane().add(cast_choice);
        cast_choice.setBounds(1350, 440, 130, 40);

        category_choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "SC", "BC", "ST", "OBC", " ", " " }));
        getContentPane().add(category_choice);
        category_choice.setBounds(1350, 530, 120, 40);
        getContentPane().add(DOB_date);
        DOB_date.setBounds(1350, 330, 130, 40);

        back_to_home_button.setBackground(new java.awt.Color(204, 204, 255));
        back_to_home_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_to_home_button.setText("<--Back");
        back_to_home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_home_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_to_home_button);
        back_to_home_button.setBounds(20, 30, 100, 30);

        registrationNo_TextLabel.setBackground(new java.awt.Color(204, 204, 204));
        registrationNo_TextLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(registrationNo_TextLabel);
        registrationNo_TextLabel.setBounds(550, 180, 150, 40);

        add_more_classes_button.setForeground(new java.awt.Color(51, 102, 255));
        add_more_classes_button.setText("add more classes...");
        add_more_classes_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_more_classes_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(add_more_classes_button);
        add_more_classes_button.setBounds(590, 295, 150, 20);

        registration_background_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/white.png"))); // NOI18N
        registration_background_Label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(registration_background_Label);
        registration_background_Label.setBounds(0, 10, 1470, 770);

        Registration_background_mainLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/bluish.png"))); // NOI18N
        getContentPane().add(Registration_background_mainLabel);
        Registration_background_mainLabel.setBounds(160, 10, 1300, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mobile_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mobile_TActionPerformed
    }//GEN-LAST:event_Mobile_TActionPerformed

    private void StudentName_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentName_TActionPerformed

    }//GEN-LAST:event_StudentName_TActionPerformed

    private void Board_Roll_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Board_Roll_TActionPerformed

    }//GEN-LAST:event_Board_Roll_TActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
         try
        {
   Class.forName("com.mysql.jdbc.Driver");
   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
   PreparedStatement ps = c.prepareStatement("insert into registrationdata values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
      Class_T.setText(Class_Choice.getSelectedItem().toString());
      cast_T.setText(cast_choice.getSelectedItem().toString());
      category_T.setText(category_choice.getSelectedItem().toString());
      
      
      ps.setString(1, registrationNo_TextLabel.getText());
      ps.setString(2, Class_T.getText());
      ps.setString(3, StudentName_T.getText());
      ps.setString(4, Mobile_T.getText());
      ps.setString(5, FatherName_T.getText());
      ps.setString(6, MotherName_T.getText());
      ps.setString(7, Address_T.getText());
      ps.setString(8, Adhar_T.getText());
      ps.setString(9, Class_Roll_T.getText());
      ps.setString(10, Board_Roll_T.getText());
      ps.setString(11, DOB_date.getDate().toLocaleString());
      ps.setString(12, cast_T.getText());
      ps.setString(13, category_T.getText());
              
              
      int i = ps.executeUpdate();
      
      if(i ==1)
      {
     
      Class_T.setText("");
      StudentName_T.setText("");
      Mobile_T.setText("");
      FatherName_T.setText("");
      MotherName_T.setText("");
      Address_T.setText("");
      Adhar_T.setText("");
      Class_Roll_T.setText("");
      Board_Roll_T.setText("");
      cast_T.setText("");
      category_T.setText("");
      }
          
      
      
 }
         catch(Exception e)
         {
         System.out.println(e);
         }
        
        
    }//GEN-LAST:event_save_buttonActionPerformed

    private void Class_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_TActionPerformed

    }//GEN-LAST:event_Class_TActionPerformed

    private void cast_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cast_TActionPerformed
       
    }//GEN-LAST:event_cast_TActionPerformed

    private void add_more_classes_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_more_classes_buttonActionPerformed
       addClass_panel.setVisible(true);
       add_more_classes_button.setVisible(false);
       Class_Choice.setVisible(false);
    }//GEN-LAST:event_add_more_classes_buttonActionPerformed

    private void addClass_addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClass_addButtonActionPerformed
          
        int j = 0;
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from allClasses");
         PreparedStatement ps = c.prepareStatement("insert into allClasses values(?)");
         
         while(rs.next())
         {
          if(rs.getString(1).equals(addClass_T.getText()))
          {
            j = 1;
            break;
          }
         }
          if(j == 0)
          {
              ps.setString(1, addClass_T.getText());
              int i = ps.executeUpdate();
              
              if(i ==1)
               {
                 addClass_T.setText("");
                 JOptionPane.showMessageDialog(this, "class added successfully");
               }
              
             }
          else if(j == 1){
            JOptionPane.showMessageDialog(this, "class already exists");
          }
         }
       
          catch(Exception e)
          {
           System.out.println(e);
          }
    }//GEN-LAST:event_addClass_addButtonActionPerformed

    private void addClass_doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClass_doneButtonActionPerformed
        addClass_panel.setVisible(false);
                add_more_classes_button.setVisible(true);
                Class_Choice.setVisible(true);

    }//GEN-LAST:event_addClass_doneButtonActionPerformed

    private void back_to_home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_home_buttonActionPerformed
       Home h = new Home();
         h.setVisible(true);
    }//GEN-LAST:event_back_to_home_buttonActionPerformed

    public static void main(String args[]) {
         
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_Label;
    private javax.swing.JTextField Address_T;
    private javax.swing.JLabel Adhar_Label;
    private javax.swing.JTextField Adhar_T;
    private javax.swing.JLabel Board_Roll_Label;
    private javax.swing.JTextField Board_Roll_T;
    private javax.swing.JLabel Cast_Label;
    private javax.swing.JLabel Category_Label;
    private javax.swing.JComboBox<String> Class_Choice;
    private javax.swing.JLabel Class_Label;
    private javax.swing.JLabel Class_Roll_Label;
    private javax.swing.JTextField Class_Roll_T;
    private javax.swing.JTextField Class_T;
    private javax.swing.JLabel DOB_Label;
    private com.toedter.calendar.JDateChooser DOB_date;
    private javax.swing.JLabel FatherName_Label;
    private javax.swing.JTextField FatherName_T;
    private javax.swing.JLabel Mobile3;
    private javax.swing.JLabel Mobile_Label;
    private javax.swing.JTextField Mobile_T;
    private javax.swing.JTextField MotherName_T;
    private javax.swing.JLabel Mother_Name_Label;
    private javax.swing.JLabel RegistrationNo_Label;
    private javax.swing.JLabel Registration_background_mainLabel;
    private javax.swing.JLabel StudentName_Label;
    private javax.swing.JTextField StudentName_T;
    private javax.swing.JTextField addClass_T;
    private javax.swing.JButton addClass_addButton;
    private javax.swing.JButton addClass_doneButton;
    private javax.swing.JPanel addClass_panel;
    private javax.swing.JButton add_more_classes_button;
    private javax.swing.JButton back_to_home_button;
    private javax.swing.JTextField cast_T;
    private javax.swing.JComboBox<String> cast_choice;
    private javax.swing.JTextField category_T;
    private javax.swing.JComboBox<String> category_choice;
    private javax.swing.JLabel enter_class_name_Label;
    private javax.swing.JLabel registrationNo_TextLabel;
    private javax.swing.JLabel registration_background_Label;
    private javax.swing.JLabel registration_header;
    private javax.swing.JLabel registration_header_background;
    private javax.swing.JButton save_button;
    // End of variables declaration//GEN-END:variables
}
