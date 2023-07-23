package admin;
import java.sql.*;


public class loading extends javax.swing.JFrame {

    
    
 
    public loading() {
        initComponents();
        this.setBounds(-10,0,1938,1000);
        loaderBackground.setBounds(-10,0,1938,1000);
       
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        Username1 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        loaderBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("Usename:");
        Username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Username);
        Username.setBounds(820, 190, 140, 50);

        T1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(T1);
        T1.setBounds(820, 260, 260, 50);

        T2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(T2);
        T2.setBounds(820, 390, 260, 50);

        Username1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Username1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username1.setText("Password:");
        Username1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Username1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Username1);
        Username1.setBounds(820, 320, 140, 50);

        Login.setBackground(new java.awt.Color(255, 102, 0));
        Login.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Login.setText("Login");
        Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(860, 470, 150, 50);

        loaderBackground.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loaderBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/login Background.jpg"))); // NOI18N
        getContentPane().add(loaderBackground);
        loaderBackground.setBounds(0, -120, 1720, 930);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

         try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
         Statement  st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from logindetails where username = '"+ T1.getText()+"' and password = '"+T2.getText()+"' ");
         
         if(rs.next())
         {
            Home h = new Home();
             h.setVisible(true);
         }
         else{
          System.out.println("Invalid username & password");
         }
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
         
        
    }//GEN-LAST:event_LoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Username1;
    private javax.swing.JLabel loaderBackground;
    // End of variables declaration//GEN-END:variables
}
