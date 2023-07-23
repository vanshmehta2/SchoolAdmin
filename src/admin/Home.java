package admin;

public class Home extends javax.swing.JFrame {

    public Home() 
    {
        initComponents();
        homeBackground.setBounds(-10,0,1938,1000);
        this.setBounds(-10,0,1938,1000);
    }
          
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Attendance = new javax.swing.JButton();
        FeeReport = new javax.swing.JButton();
        Registration1 = new javax.swing.JButton();
        StudentList = new javax.swing.JButton();
        create_classes = new javax.swing.JButton();
        homeBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Attendance.setBackground(new java.awt.Color(153, 153, 255));
        Attendance.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Attendance.setForeground(new java.awt.Color(255, 0, 204));
        Attendance.setText("Attendance");
        Attendance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceActionPerformed(evt);
            }
        });
        getContentPane().add(Attendance);
        Attendance.setBounds(640, 500, 220, 160);

        FeeReport.setBackground(new java.awt.Color(153, 255, 51));
        FeeReport.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FeeReport.setForeground(new java.awt.Color(0, 0, 204));
        FeeReport.setText("Fee Section");
        FeeReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FeeReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeeReportActionPerformed(evt);
            }
        });
        getContentPane().add(FeeReport);
        FeeReport.setBounds(950, 500, 220, 160);

        Registration1.setBackground(new java.awt.Color(0, 204, 204));
        Registration1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Registration1.setForeground(new java.awt.Color(255, 0, 0));
        Registration1.setText("Registration");
        Registration1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Registration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registration1ActionPerformed(evt);
            }
        });
        getContentPane().add(Registration1);
        Registration1.setBounds(630, 280, 220, 160);

        StudentList.setBackground(new java.awt.Color(204, 0, 51));
        StudentList.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        StudentList.setForeground(new java.awt.Color(51, 255, 204));
        StudentList.setText("Student List");
        StudentList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StudentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentListActionPerformed(evt);
            }
        });
        getContentPane().add(StudentList);
        StudentList.setBounds(950, 280, 220, 160);

        create_classes.setBackground(new java.awt.Color(153, 153, 153));
        create_classes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        create_classes.setForeground(new java.awt.Color(0, 51, 255));
        create_classes.setText("Create Classes");
        create_classes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        create_classes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_classesActionPerformed(evt);
            }
        });
        getContentPane().add(create_classes);
        create_classes.setBounds(790, 90, 230, 150);

        homeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/home background.jpg"))); // NOI18N
        getContentPane().add(homeBackground);
        homeBackground.setBounds(4, 2, 1250, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceActionPerformed
   
    }//GEN-LAST:event_AttendanceActionPerformed

    private void FeeReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeeReportActionPerformed
        
    }//GEN-LAST:event_FeeReportActionPerformed

    private void StudentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentListActionPerformed
        
        StudentList s = new StudentList();
           s.setVisible(true);
           
           
    }//GEN-LAST:event_StudentListActionPerformed

    private void Registration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registration1ActionPerformed
        
        RegistrationForm rf = new RegistrationForm();
                rf.setVisible(true);
           
        
    }//GEN-LAST:event_Registration1ActionPerformed

    private void create_classesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_classesActionPerformed
        
        
        
        
    }//GEN-LAST:event_create_classesActionPerformed

    public static void main(String args[]) {
               
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Attendance;
    private javax.swing.JButton FeeReport;
    private javax.swing.JButton Registration1;
    private javax.swing.JButton StudentList;
    private javax.swing.JButton create_classes;
    private javax.swing.JLabel homeBackground;
    // End of variables declaration//GEN-END:variables
}
