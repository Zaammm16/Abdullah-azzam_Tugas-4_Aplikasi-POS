package aplikasi;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Azzam16
 */
public class kasir extends javax.swing.JFrame {

    /**
     * Creates new form kasir
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public kasir() {
        initComponents();
        Kodebarang();
        Total();
        Diskon();
    }
    
    private void Diskon(){
        txtDiskon.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int sub_total = 0;
                for(int a = 0;a<tblList.getRowCount();a++ ){
                sub_total += Integer.parseInt((String)
                    tblList.getValueAt(a, 5).toString().replace(".", ""));
                }
        
                txtJumlahharga.setText(nf.format(sub_total));
        
            //diskon
                int diskon, hasil_diskon;
         
                diskon = Integer.parseInt(txtJumlahharga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText().replace("", ""))/100;
                hasil_diskon = Integer.parseInt(txtJumlahharga.getText().replace(".", ""))
                        - diskon;
                txthasildiskon.setText(nf.format(diskon));
            //total bersih
        
                int  totalbersih;
                totalbersih = hasil_diskon;
                lblJumlahharga.setText("Rp. " + nf.format(totalbersih));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void Total(){
        txtQty.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try {
                    int hasil = 0;
                    if(txtQty.getText().equals("")){
                      hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 0;
                    }else{
                      hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) *
                              Integer.parseInt(txtQty.getText());
                    }
                    txtTotalharga.setText(nf.format(hasil));
                } catch (Exception a){
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 try {
                     int hasil = 0;
                    if(txtQty.getText().equals("")){
                      hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 0;
                    }else{
                      hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) *
                              Integer.parseInt(txtQty.getText());
                    }
                    txtTotalharga.setText(nf.format(hasil));
                } catch (Exception a){
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void Kodebarang(){
        txtKodebarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String Kodebarang;
                Kodebarang = (String) txtKodebarang.getText();
                
                switch(Kodebarang){
                    case "B01" :
                        txtNamabarang.setText("Asus ROG 3");
                        txtHarga.setText(nf.format(10000000));
                        txtQty.grabFocus();
                        break;
                    case "B02" :
                        txtNamabarang.setText("Lenovo");
                        txtHarga.setText(nf.format(7500000));
                        txtQty.grabFocus();
                        break;
                    case "B03" :
                        txtNamabarang.setText("Infinix");
                        txtHarga.setText(nf.format(1500000));
                        txtQty.grabFocus();
                        break;
                    case "B04" :
                        txtNamabarang.setText("Vivo");
                        txtHarga.setText(nf.format(2000000));
                        txtQty.grabFocus();
                        break;
                    default:
                        txtNamabarang.setText("");
                        txtHarga.setText("");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 String Kodebarang;
                Kodebarang = (String) txtKodebarang.getText();
                
                switch(Kodebarang){
                    case "B01" :
                        txtNamabarang.setText("Asus ROG 3");
                        txtHarga.setText(nf.format(10000000));
                        txtQty.grabFocus();
                        break;
                    case "B02" :
                        txtNamabarang.setText("Lenovo");
                        txtHarga.setText(nf.format(7500000));
                        txtQty.grabFocus();
                        break;
                    case "B03" :
                        txtNamabarang.setText("Infinix");
                        txtHarga.setText(nf.format(1500000));
                        txtQty.grabFocus();
                        break;
                    case "B04" :
                        txtNamabarang.setText("Vivo");
                        txtHarga.setText(nf.format(2000000));
                        txtQty.grabFocus();
                        break;
                    default:
                        txtNamabarang.setText("");
                        txtHarga.setText("");
                }
            }
            

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblJumlahharga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtfaktur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKodebarang = new javax.swing.JTextField();
        txtNamabarang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtTotalharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtJumlahharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        txthasildiskon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblJmlQty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJumlahharga.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblJumlahharga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJumlahharga.setText("Rp.");

        jLabel2.setText("No. faktur");

        txtfaktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfakturActionPerformed(evt);
            }
        });

        jLabel3.setText("Kode barang");

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode barang", "Nama barang", "Harga", "Qty", "Total harga"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        jLabel4.setText("Jumlah harga");

        jLabel5.setText("Diskon %");

        txthasildiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthasildiskonActionPerformed(evt);
            }
        });

        jLabel6.setText("Total harga");

        jLabel7.setText("Item yang dibeli");

        lblJmlQty.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblJumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJmlQty, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtJumlahharga)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txthasildiskon, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                            .addComponent(txtTotal))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJumlahharga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblJmlQty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthasildiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void txtfakturActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(txtQty.getText().equals("")){
            return;
        }else{
            DefaultTableModel  model = (DefaultTableModel) tblList.getModel();
            
            Object obj [] = new Object[6];
            obj [1] = txtKodebarang.getText();
            obj [2] = txtNamabarang.getText();
            obj [3] = txtHarga.getText();
            obj [4] = txtQty.getText();
            obj [5] = txtTotalharga.getText();
            
            model.addRow(obj);
            
            int baris = model.getRowCount();
            for(int a=0;a<baris;a++){
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }
            tblList.setRowHeight(20);
            
            lblJmlQty.setText(String.valueOf(baris));
            
            jmlTotalharga();
            bersih();
        }
    }                                      

    private void txthasildiskonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

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
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJmlQty;
    private javax.swing.JLabel lblJumlahharga;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlahharga;
    private javax.swing.JTextField txtKodebarang;
    private javax.swing.JTextField txtNamabarang;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalharga;
    private javax.swing.JTextField txtfaktur;
    private javax.swing.JTextField txthasildiskon;
    // End of variables declaration                   

    private void jmlTotalharga() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sub_total = 0;
        for(int a = 0;a<tblList.getRowCount();a++ ){
            sub_total += Integer.parseInt((String)
                    tblList.getValueAt(a, 5).toString().replace(".", ""));
        }
        
        txtJumlahharga.setText(nf.format(sub_total));
        
        //diskon
        int diskon, hasil_diskon;
         
        diskon = Integer.parseInt(txtJumlahharga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText().replace("", "0"))/100;
        hasil_diskon = Integer.parseInt(txtJumlahharga.getText().replace(".", ""))
                - diskon;
        
        //total bersih
        
        int  totalbersih;
        totalbersih = hasil_diskon;
        lblJumlahharga.setText("Rp. " + nf.format(totalbersih));
    }
    

    private void bersih() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        txtKodebarang.setText("");
        txtKodebarang.grabFocus();
        txtQty.setText("");
        txtTotalharga.setText("");
    }
}
