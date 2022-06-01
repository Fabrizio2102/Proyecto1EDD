/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_edd;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
/**
 *
 * @author fabba
 */
public class Panel extends javax.swing.JFrame {
    ListaAlmacen almacen = new ListaAlmacen();
    Grafo grafin = new Grafo();
    /**
     * Creates new form Panel
     */
    public Panel() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        espacioTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));
        jPanel1.add(espacioTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser choos = new JFileChooser(new File("c:\\"));
        choos.setDialogTitle("Save a file");
        choos.showSaveDialog(null);
        try{
            File abre = choos.getSelectedFile();
            FileReader fr = new FileReader(abre.getPath());
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            String cadena = "";
            String cadena2 = "";
            while((linea = br.readLine()) != null){
                if("Rutas;".equals(linea)){
                    break;
                }
                if(!"Almacenes;".equals(linea)){
                    cadena = cadena + linea + "\n";
                }
            }
            
            while((linea = br.readLine()) != null){
                if(!"Rutas;".equals(linea)){
                    cadena2 = cadena2 + linea + "\n";
                }
                if("Almacenes;".equals(linea)){
                    break;
                }
            }
            
            cadena2 = cadena2.substring(7, cadena2.length());
            System.out.println(cadena2);
            String[] almacenes = cadena.split(";\n");
            int num = almacenes.length;
            for (int i = 0; i < num; i++) {
                String[] aux = almacenes[i].split(":\n");
                String[] aiua = aux[1].split("\n");
                ListaStock cositas = new ListaStock();
                for (int j = 0; j < aiua.length; j++) {
                    String[] helpme = aiua[j].split(",");
                    String objeto = helpme[0];
                    int cantidad = Integer.parseInt(helpme[1]);
                    cositas.insertarFinal(objeto, cantidad);
                }
                almacen.insertarFinal(aux[0], cositas);
            }
            almacen.imprimirCosas();
            br.close();
            fr.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Hubo un error leyendo el archivo" + e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel espacioTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
