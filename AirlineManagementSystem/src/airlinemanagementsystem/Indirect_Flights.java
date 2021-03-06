/*
Name: Kanav Kaul
Net Id: kxk140730
Database Project: Aurline Management System

 */
package airlinemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Indirect_Flights extends javax.swing.JFrame {

    DefaultTableModel model;
    /**
     * Creates new form Indirect_Flights
     */
    public Indirect_Flights() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight 1", "Flight1_Departure Code", "Flight1_Arrival Code", "Flight 2 ", "Flight2_Departure Code", "Flight2_Arrival Code", "weekdays"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight1", "Flight1_Departure_Code", "Flight1_Arrival_Code", "Flight2", "Flight2_Departure_Code", "Flight2_Arrival_Code", "Flight3", "Flight3_Departure_Code", "Flight3_Arrival_Code", "weekdays"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Using 1 Connecting Flight:");

        jLabel2.setText("Using 2 Connecting Flights:");

        button1.setLabel("Home");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("Flight Information");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setLabel("Fare Information");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setLabel("Passenger Manifest");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setLabel("Passenger Information");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        jLabel3.setText("No Connecting Flights Available");

        jLabel4.setText("No Connecting Flights Available");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(178, 178, 178)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(168, 168, 168)
                            .addComponent(jLabel4))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Flights().setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FlightInfo().setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FareInfo().setVisible(true);
    }//GEN-LAST:event_button3ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Passenger_Info().setVisible(true);
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PassMan().setVisible(true);
    }//GEN-LAST:event_button4ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    void display1Stop(String source, String destination){
        this.source = source;
        this.destination = destination;
        
         model = (DefaultTableModel) jTable1.getModel();
         try {    
            Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ed) {
            System.out.println("Where is your MySQL JDBC Driver? "+ "Include in your library path!");
            ed.printStackTrace();
            return;
       }
                
       PreparedStatement stmt = null;
       String sql = "";
                   
       try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_mgmt", "root","root")) {
                                
            sql = "select distinct f1.flight_number,f2.flight_number,f1.weekdays,f2.weekdays,f1.departure_airport_code, f1.arrival_airport_code,f2.departure_airport_code, f2.arrival_airport_code from flight f1, flight f2 where f1.departure_airport_code = '"+source+"' and f1.arrival_airport_code = f2.departure_airport_code and f2.arrival_airport_code = '"+destination+"' and f1.scheduled_arrival_time < f2.scheduled_departure_time;";
            stmt = conn.prepareStatement(sql);
                                    
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()){
                      jLabel3.setVisible(true);  
                        
                        
                    }
            while(rs.next()){
            
                String weekdays1 = rs.getString(3);
                String weekdays2 = rs.getString(4);
                String[] days1 = weekdays1.split("_");
                String[] days2 = weekdays2.split("_");
                boolean[] f1_days,f2_days;
                f1_days = new boolean[7];
                f2_days = new boolean[7];
                for(int i = 0;i<days1.length;i++){
                    
                
                switch(days1[i]){
                    case "Mon": f1_days[0]=true;
                        break;
                    case "Tue": f1_days[1]=true;
                        break;
                    case "Wed": f1_days[2]=true;
                        break;
                    case "Thu": f1_days[3]=true;
                        break;
                    case "Fri": f1_days[4]=true;
                        break;
                    case "Sat": f1_days[5]=true;
                        break;
                    case "Sun": f1_days[6]=true;
                        break;
                        
                }
                }
                
                for(int i = 0;i<days2.length;i++){
                    
                
                switch(days2[i]){
                    case "Mon": f2_days[0]=true;
                        break;
                    case "Tue": f2_days[1]=true;
                        break;
                    case "Wed": f2_days[2]=true;
                        break;
                    case "Thu": f2_days[3]=true;
                        break;
                    case "Fri": f2_days[4]=true;
                        break;
                    case "Sat": f2_days[5]=true;
                        break;
                    case "Sun": f2_days[6]=true;
                        break;
                        
                }
                }
                String Final_weekdays = "";
                if(f1_days[0] && f2_days[0])
                    Final_weekdays += "Mon  ";
                if(f1_days[1] && f2_days[1])
                    Final_weekdays += "Tue  ";
                if(f1_days[2] && f2_days[2])
                    Final_weekdays += "Wed  ";
                if(f1_days[3] && f2_days[3])
                    Final_weekdays += "Thu  ";
                if(f1_days[4] && f2_days[4])
                    Final_weekdays += "Fri  ";
                if(f1_days[5] && f2_days[5])
                    Final_weekdays += "Sat  ";
                if(f1_days[6] && f2_days[6])
                    Final_weekdays += "Sun  ";
                if(!Final_weekdays.equals(""))
                    model.addRow(new Object[]{rs.getString(1),rs.getString(5),rs.getString(6),rs.getString(2),rs.getString(7),rs.getString(8),Final_weekdays});
    
            }
                               
            System.out.println("Connection established");
            conn.close();
       }catch(SQLException es){
            es.printStackTrace();
       }
    }
    
     void display2Stops(String source, String destination){
        this.source = source;
        this.destination = destination;
        
         model = (DefaultTableModel) jTable2.getModel();
         try {    
            Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ed) {
            System.out.println("Where is your MySQL JDBC Driver? "+ "Include in your library path!");
            ed.printStackTrace();
            return;
       }
                
       PreparedStatement stmt = null;
       String sql = "";
                   
       try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_mgmt", "root","root")) {
                                
            sql = "select distinct f1.flight_number,f2.flight_number,f1.weekdays,f2.weekdays,f1.departure_airport_code, f1.arrival_airport_code,f2.departure_airport_code, f2.arrival_airport_code, f3.flight_number, f3.departure_airport_code, f3.arrival_airport_code,f3.weekdays from flight f1, flight f2, flight f3 where f1.departure_airport_code = '"+source+"' and f1.arrival_airport_code = f2.departure_airport_code and f2.arrival_airport_code = f3.departure_airport_code and f3.arrival_airport_code = '"+destination+"' and f1.scheduled_arrival_time < f2.scheduled_departure_time and f2.scheduled_arrival_time < f3.scheduled_departure_time;";
            stmt = conn.prepareStatement(sql);
                                    
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()){
                        
                      jLabel4.setVisible(true);  
                        
                    }
            while(rs.next()){
            
                String weekdays1 = rs.getString(3);
                String weekdays2 = rs.getString(4);
                String weekdays3 = rs.getString(12);
                String[] days1 = weekdays1.split("_");
                String[] days2 = weekdays2.split("_");
                String[] days3 = weekdays3.split("_");
                boolean[] f1_days,f2_days,f3_days;
                f1_days = new boolean[7];
                f2_days = new boolean[7];
                f3_days = new boolean[7];
                for(int i = 0;i<days1.length;i++){
                    
                
                switch(days1[i]){
                    case "Mon": f1_days[0]=true;
                        break;
                    case "Tue": f1_days[1]=true;
                        break;
                    case "Wed": f1_days[2]=true;
                        break;
                    case "Thu": f1_days[3]=true;
                        break;
                    case "Fri": f1_days[4]=true;
                        break;
                    case "Sat": f1_days[5]=true;
                        break;
                    case "Sun": f1_days[6]=true;
                        break;
                        
                }
                }
                
                for(int i = 0;i<days2.length;i++){
                    
                
                switch(days2[i]){
                    case "Mon": f2_days[0]=true;
                        break;
                    case "Tue": f2_days[1]=true;
                        break;
                    case "Wed": f2_days[2]=true;
                        break;
                    case "Thu": f2_days[3]=true;
                        break;
                    case "Fri": f2_days[4]=true;
                        break;
                    case "Sat": f2_days[5]=true;
                        break;
                    case "Sun": f2_days[6]=true;
                        break;
                        
                }
                }
                for(int i = 0;i<days3.length;i++){
                    
                
                switch(days3[i]){
                    case "Mon": f3_days[0]=true;
                        break;
                    case "Tue": f3_days[1]=true;
                        break;
                    case "Wed": f3_days[2]=true;
                        break;
                    case "Thu": f3_days[3]=true;
                        break;
                    case "Fri": f3_days[4]=true;
                        break;
                    case "Sat": f3_days[5]=true;
                        break;
                    case "Sun": f3_days[6]=true;
                        break;
                        
                }
                }

                
                String Final_weekdays = "";
                if(f1_days[0] && f2_days[0] && f3_days[0])
                    Final_weekdays += "Mon  ";
                if(f1_days[1] && f2_days[1] && f3_days[1])
                    Final_weekdays += "Tue  ";
                if(f1_days[2] && f2_days[2] && f3_days[2])
                    Final_weekdays += "Wed  ";
                if(f1_days[3] && f2_days[3] && f3_days[3])
                    Final_weekdays += "Thu  ";
                if(f1_days[4] && f2_days[4] && f3_days[4])
                    Final_weekdays += "Fri  ";
                if(f1_days[5] && f2_days[5] && f3_days[5])
                    Final_weekdays += "Sat  ";
                if(f1_days[6] && f2_days[6] && f3_days[6])
                    Final_weekdays += "Sun  ";
                if(!Final_weekdays.equals(""))
                    model.addRow(new Object[]{rs.getString(1),rs.getString(5),rs.getString(6),rs.getString(2),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),Final_weekdays});
    
            }
                               
            System.out.println("Connection established");
            conn.close();
       }catch(SQLException es){
            es.printStackTrace();
       }
    }
    
   
    
     
     
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
            java.util.logging.Logger.getLogger(Indirect_Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Indirect_Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Indirect_Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Indirect_Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Indirect_Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
    private String source,destination;
}
