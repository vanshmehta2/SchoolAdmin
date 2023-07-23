
package admin;
import java.sql.*;

public class StudentList extends javax.swing.JFrame {

   ResultSet rs; 
 //  Statement st;
   
    public StudentList() {
        initComponents();
        this.setBounds(-10,0,1938,1000);
        Panel_top.setBounds(-10,0,1938,80);
        studentList_panel.setBounds(5,90,1910,920);
        student_list_table.setBounds(8,90,1910,920);        
          
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from allClasses"); 
         
         while(rs.next())
           {
           class_filter_choice.addItem(rs.getString(1));
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
         rs = st.executeQuery("Select * from registrationdata order by class ASC ");
         setData  sd = new setData(rs);
       
         student_list_table.setModel(sd);
        
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
          
           
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_top = new javax.swing.JPanel();
        class_filter_choice = new javax.swing.JComboBox<>();
        back_button_toHome = new javax.swing.JButton();
        studentList_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_list_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Panel_top.setBackground(new java.awt.Color(153, 153, 255));
        Panel_top.setLayout(null);

        class_filter_choice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        class_filter_choice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                class_filter_choiceItemStateChanged(evt);
            }
        });
        Panel_top.add(class_filter_choice);
        class_filter_choice.setBounds(170, 20, 90, 40);

        back_button_toHome.setBackground(new java.awt.Color(153, 153, 153));
        back_button_toHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button_toHome.setText("<--Back");
        back_button_toHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button_toHomeActionPerformed(evt);
            }
        });
        Panel_top.add(back_button_toHome);
        back_button_toHome.setBounds(0, 20, 90, 40);

        getContentPane().add(Panel_top);
        Panel_top.setBounds(0, 0, 1980, 70);

        studentList_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        studentList_panel.setLayout(null);

        student_list_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        student_list_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(student_list_table);

        studentList_panel.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1900, 830);

        getContentPane().add(studentList_panel);
        studentList_panel.setBounds(0, 70, 1980, 930);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void class_filter_choiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_class_filter_choiceItemStateChanged
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement st = c.createStatement();
        rs = st.executeQuery("Select * from registrationdata where class = '"+class_filter_choice.getSelectedItem() +"' ");
        
        setData  sd = new setData(rs);
        student_list_table.setModel(sd);
        
       
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
        
    }//GEN-LAST:event_class_filter_choiceItemStateChanged

    private void back_button_toHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button_toHomeActionPerformed
         Home h = new Home();
          h.setVisible(true);
    }//GEN-LAST:event_back_button_toHomeActionPerformed


    public static void main(String args[]) {
        StudentList L1 = new StudentList();
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_top;
    private javax.swing.JButton back_button_toHome;
    private javax.swing.JComboBox<String> class_filter_choice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel studentList_panel;
    private javax.swing.JTable student_list_table;
    // End of variables declaration//GEN-END:variables
}

class setData extends javax.swing.table.AbstractTableModel{
  ResultSet rs1;
    ResultSetMetaData rsmd;
    
 
    public setData(ResultSet rs2){
    
         try{
             rs1 = rs2;
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         rsmd = rs1.getMetaData();
          
        }
        catch(Exception e){
        System.out.println(e);
        }
    }
    public int getRowCount() {
        try{
        rs1.last();
        return rs1.getRow();
        }catch(Exception e)
        {
          System.out.println(e);
          return -1;
        }
              
        
    }

    @Override
    public int getColumnCount() {
        try{
           return rsmd.getColumnCount();
        }
        catch(Exception e)
        {
            System.out.println(e);
            return -1;
        }
    
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try{
           rs1.absolute(rowIndex+1);
           return rs1.getObject(columnIndex+1);
        }
        catch(Exception e)
        {
         System.out.println(e);
         return null;
        }
    }
  public String getColumnName(int n)
  {
      try{
          return rsmd.getColumnName(n+1);
  }
      catch(Exception e)
  {
      System.out.println(e);
      return null;
  }
  }

}

