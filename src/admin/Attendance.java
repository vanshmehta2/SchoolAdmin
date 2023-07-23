package admin;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import javax.swing.*;



public class Attendance extends javax.swing.JFrame implements ItemListener {

    ResultSet rs;
    JComboBox J[];
    int n;
    
    public Attendance() {
        initComponents();
        this.setBounds(-10,0,1938,1000);
        Attendance_top_panel.setBounds(-10,0,1938,80);
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from allClasses"); 
         
         while(rs.next())
           {
           attendance_class_filter_choice.addItem(rs.getString(1));
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
         rs = st.executeQuery("Select registration_no,class,class_roll_no,student_name from registrationdata where class = '1st' order by class_roll_no ASC ");
         
         rs.last();
          n=rs.getRow();

         setData  sd = new setData(rs);
       
         attendance_table.setModel(sd);
                  
         attendance_table.setRowHeight(40);
       
         J = new JComboBox[n];
         int w = 15;
         for(int i = 0; i<n; i++)
         {
           J[i] = new JComboBox();
           J[i].addItem("Not Marked");
           J[i].addItem("Absent");
           J[i].addItem("Present");
           J[i].setBounds(750,w,110,40);
           J[i].addItemListener(this);
           Attendance_data_panel.add(J[i]);
           w = w+50;
         }
        
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
         
     
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Attendance_top_panel = new javax.swing.JPanel();
        attendance_class_filter_choice = new javax.swing.JComboBox<>();
        Attendance_data_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendance_table = new javax.swing.JTable();
        submit_attendance_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Attendance_top_panel.setBackground(new java.awt.Color(153, 153, 255));
        Attendance_top_panel.setLayout(null);

        attendance_class_filter_choice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                attendance_class_filter_choiceItemStateChanged(evt);
            }
        });
        Attendance_top_panel.add(attendance_class_filter_choice);
        attendance_class_filter_choice.setBounds(27, 28, 90, 40);

        getContentPane().add(Attendance_top_panel);
        Attendance_top_panel.setBounds(0, -12, 1460, 0);

        Attendance_data_panel.setLayout(null);

        attendance_table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attendance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(attendance_table);

        Attendance_data_panel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 670, 710);

        submit_attendance_button.setBackground(new java.awt.Color(153, 153, 255));
        submit_attendance_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit_attendance_button.setText("Submit");
        submit_attendance_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit_attendance_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_attendance_buttonActionPerformed(evt);
            }
        });
        Attendance_data_panel.add(submit_attendance_button);
        submit_attendance_button.setBounds(1190, 30, 140, 50);

        getContentPane().add(Attendance_data_panel);
        Attendance_data_panel.setBounds(0, 100, 1560, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attendance_class_filter_choiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_attendance_class_filter_choiceItemStateChanged
        
         for(int i = 0; i<n; i++)
         {
            J[i].setVisible(false); 
         }
        
        try{
            
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         rs = st.executeQuery("Select class,registration_no,class_roll_no,student_name from registrationdata where class = '"+ attendance_class_filter_choice.getSelectedItem()+ "' order by class_roll_no ASC ");
        
        rs.last();
          n=rs.getRow();
         
         
         setData  sd = new setData(rs);
       
         attendance_table.setModel(sd);
         
         attendance_table.setRowHeight(40);
         
         J = new JComboBox[n];
         int w = 15;

        for(int i = 0; i<n; i++)
         {
           J[i] = new JComboBox();
           J[i].addItem("Not Marked");
           J[i].addItem("Absent");
           J[i].addItem("Present");
           J[i].setBounds(750,w,110,40);
           J[i].addItemListener(this);
           Attendance_data_panel.add(J[i]);
           w = w+50;
         
        }
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        
    }//GEN-LAST:event_attendance_class_filter_choiceItemStateChanged

    private void submit_attendance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_attendance_buttonActionPerformed

        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
            //PreparedStatement ps = c.prepareStatement("insert into registrationdata values(?,?,?)");

            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date today = new java.util.Date();
            String date=formatter.format(today);
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("Select studentattendance.date_ofAttendance,registrationdata.class from registrationdata inner join studentattendance on registrationdata.registration_no = studentattendance.registration_no where class = '"+attendance_class_filter_choice.getSelectedItem()+"' and date_ofAttendance = '"+date+"' ");

            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Attendance Already Marked");
            }
            else{
                String query =  "insert into studentattendance values ('%1$s','%2$s','%3$s');";
                String finalQuery = "";
                String s;

                for(int i =0; i<attendance_table.getRowCount(); i++)
                {

                    s = attendance_table.getValueAt(i,0).toString();
                    String status =  J[i].getSelectedItem().toString();

                    finalQuery = String.format(query,s,date,status);
                    st= c.createStatement();
                    int j = st.executeUpdate(finalQuery);
                    //System.out.println(s);
                }

            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }//GEN-LAST:event_submit_attendance_buttonActionPerformed

   public void itemStateChanged(ItemEvent e)
   {
   
   }
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendance_data_panel;
    private javax.swing.JPanel Attendance_top_panel;
    private javax.swing.JComboBox<String> attendance_class_filter_choice;
    private javax.swing.JTable attendance_table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submit_attendance_button;
    // End of variables declaration//GEN-END:variables
}
