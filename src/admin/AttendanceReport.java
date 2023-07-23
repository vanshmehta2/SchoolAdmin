package admin;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AttendanceReport extends javax.swing.JFrame {
    ResultSet rs;
    
    public AttendanceReport() {
        initComponents();
        this.setBounds(-10,0,1938,1000);
        top_panel_attendance_report.setBounds(-10,0,160,1000);
        table_attendance_report.setRowHeight(50);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from allClasses"); 
         
         while(rs.next())
           {
           class_choice_filter_attendanceReport.addItem(rs.getString(1));
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
         
         DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date today = new java.util.Date();
        String date=formatter.format(today);
       
         rs = st.executeQuery("Select registrationdata.registration_no,registrationdata.class_roll_no,studentattendance.date_ofAttendance,studentattendance.status  from registrationdata inner join studentattendance on registrationdata.registration_no = studentattendance.registration_no where class = '1st' and date_ofAttendance = '"+date+"' ");
         setData  sd = new setData(rs);
       
         table_attendance_report.setModel(sd);
        
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_panel_attendance_report = new javax.swing.JPanel();
        class_choice_filter_attendanceReport = new javax.swing.JComboBox<>();
        show_button_attendanceReport = new javax.swing.JButton();
        date_JDateChooser_attendance_report = new com.toedter.calendar.JDateChooser();
        back_button_toHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_attendance_report = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        top_panel_attendance_report.setBackground(new java.awt.Color(51, 102, 255));
        top_panel_attendance_report.setLayout(null);

        class_choice_filter_attendanceReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_choice_filter_attendanceReportActionPerformed(evt);
            }
        });
        top_panel_attendance_report.add(class_choice_filter_attendanceReport);
        class_choice_filter_attendanceReport.setBounds(30, 200, 110, 40);

        show_button_attendanceReport.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        show_button_attendanceReport.setText("Show ");
        show_button_attendanceReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_button_attendanceReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_button_attendanceReportActionPerformed(evt);
            }
        });
        top_panel_attendance_report.add(show_button_attendanceReport);
        show_button_attendanceReport.setBounds(30, 280, 100, 40);
        top_panel_attendance_report.add(date_JDateChooser_attendance_report);
        date_JDateChooser_attendance_report.setBounds(30, 120, 110, 40);

        back_button_toHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button_toHome.setForeground(new java.awt.Color(51, 51, 51));
        back_button_toHome.setText("<--Back");
        back_button_toHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button_toHomeActionPerformed(evt);
            }
        });
        top_panel_attendance_report.add(back_button_toHome);
        back_button_toHome.setBounds(10, 10, 90, 40);

        getContentPane().add(top_panel_attendance_report);
        top_panel_attendance_report.setBounds(0, 0, 150, 990);

        table_attendance_report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_attendance_report);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 10, 1730, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_button_attendanceReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_button_attendanceReportActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement st = c.createStatement();
        
         DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date selecteddate = date_JDateChooser_attendance_report.getDate();
        String date=formatter.format(selecteddate);
        
        rs = st.executeQuery("Select registrationdata.registration_no,registrationdata.class_roll_no,studentattendance.date_ofAttendance,studentattendance.status  from registrationdata inner join studentattendance on registrationdata.registration_no = studentattendance.registration_no where class = '"+class_choice_filter_attendanceReport.getSelectedItem()+"' anxd date_ofAttendance = '"+date +"'");
        
        setData  sd = new setData(rs);
        table_attendance_report.setModel(sd);
        
       
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_show_button_attendanceReportActionPerformed

    private void class_choice_filter_attendanceReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_choice_filter_attendanceReportActionPerformed
      
    }//GEN-LAST:event_class_choice_filter_attendanceReportActionPerformed

    private void back_button_toHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button_toHomeActionPerformed
       Home h = new Home();
          h.setVisible(true);
        
        
    }//GEN-LAST:event_back_button_toHomeActionPerformed
    public static void main(String args[]) {
        AttendanceReport AR = new AttendanceReport();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceReport().setVisible(true);
            }
        });
        
        
    }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button_toHome;
    private javax.swing.JComboBox<String> class_choice_filter_attendanceReport;
    private com.toedter.calendar.JDateChooser date_JDateChooser_attendance_report;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton show_button_attendanceReport;
    private javax.swing.JTable table_attendance_report;
    private javax.swing.JPanel top_panel_attendance_report;
    // End of variables declaration//GEN-END:variables
}
