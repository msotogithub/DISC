
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ManuelSotoBaquero
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public int contador; // variable para cambiar de pregunta
    
    // variables para calcular el acumulado de cada perfil
    public int dominante = 0;
    public int influyente = 0;
    public int solido = 0;
    public int controlador = 0;
    public int progreso = 0;
    public int valorprincipal = 0;
    public int valorsecundario = 0;
    // variables para calcular los perfiles y el patrón
    public String principal;
    public String secundario;
    public String patron;
    
    String mas1[] = {"Ejecutor","Directo","Controlador","Impulsor","Iniciador","Competitivo","Arriesgado","Exigente","Ambicioso","Pionero"};
    String mas2[] = {"Relacionador","Apasionado","Popular","Magnético","Persuasivo","Sociable","Efusivo","Alegre","Político","Entusiasta"};
    String mas3[] = {"Servicial","Estable","Aceptado","Estable","Pasivo","Leal","Finiquitador","Tranquilo","Autocontrolado","Pausado"};
    String mas4[] = {"Organizador","Preciso","Cumplido","Cuidadoso","Analítico","Exacto","Fáctico (Dado a los hechos)","Responsable","Cauteloso","Conservador"};
 
    String menos1[] = {"Conservador","Indeciso","Inseguro","Suave","Modesto","Calculador","Moderado","Complaciente","Pacífico","Agradable"};
    String menos2[] = {"Reflexivo","Calculador","Lógico","Suspicaz","Incisivo","Racional","Escéptico","Inexpresivo","Pesimista","Parco"};
    String menos3[] = {"Versátil","Alerta","Demostrativo","Preciso","Flexible","Activo","Ignorador","Impaciente","Impulsivo","Ansioso"};
    String menos4[] = {"Flexible","Servicial","Deshinibido","Creativo","Intenso","Independiente","Apasionado","Confiado","Expresivo","Poético"};
    
    public Principal() {
        initComponents();
        datos_iniciales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonSiguiente = new javax.swing.JButton();
        jLabelGrupo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método DISC");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 255));

        jButtonSiguiente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSiguiente.setText("Siguiente/Terminar");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jLabelGrupo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelGrupo.setText("Grupo");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton3.setText("jRadioButton3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton4.setText("jRadioButton4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jProgressBar.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelGrupo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSiguiente)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void datos_iniciales(){
        progreso = 5; 
        jLabelGrupo.setText("ME CONSIDERO MÁS:");
        jRadioButton1.setText(mas1[0]);
        jRadioButton2.setText(mas2[0]);
        jRadioButton3.setText(mas3[0]);
        jRadioButton4.setText(mas4[0]);
        jButtonSiguiente.setText("Siguiente");
        contador =1;
        
      
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
               
    }
    
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
   
        if (contador == 20){ 
            actualiza_acumulados();
            calcula_perfil();
            calcula_patron();
            
            Secundaria secundaria = new Secundaria(this, true);
                        
            secundaria.actualiza_valor("primario", principal, valorprincipal);
            secundaria.actualiza_valor("secundario", secundario, valorsecundario);
            secundaria.actualiza_valor("patron", patron, 0);
            secundaria.setVisible(true);
            dispose();
        
        }else {
            if (jRadioButton1.isSelected() || jRadioButton2.isSelected()  || jRadioButton3.isSelected()  || jRadioButton4.isSelected()  ){
               
               siguiente();  
            }else{
                JOptionPane.showMessageDialog(this,"Debe seleccionar una opción", "Advertencia",JOptionPane.INFORMATION_MESSAGE);
            }
           
            
        }
        
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void siguiente(){
        // Actualizamos acumulados
        actualiza_acumulados();
        
        // Pasamos a la siguiente pregunta
        if (contador <10){
            jRadioButton1.setText(mas1[contador]);
            jRadioButton2.setText(mas2[contador]);
            jRadioButton3.setText(mas3[contador]);
            jRadioButton4.setText(mas4[contador]);
        }else{
            jRadioButton1.setText(menos1[contador-10]);
            jRadioButton2.setText(menos2[contador-10]);
            jRadioButton3.setText(menos3[contador-10]);
            jRadioButton4.setText(menos4[contador-10]);
            //Cambiamos el color del texto para que se den cuenta del cambio
            jRadioButton1.setForeground(Color.red);
            jRadioButton2.setForeground(Color.red);
            jRadioButton3.setForeground(Color.red);
            jRadioButton4.setForeground(Color.red);
        }
        if (contador == 10){
        jLabelGrupo.setText("ME CONSIDERO MENOS:");
        jLabelGrupo.setForeground(Color.red);
        }
        if (contador == 19){
             jButtonSiguiente.setText("Finalizar");
        }
        jProgressBar.setValue(progreso);
        progreso = progreso + 5;
        contador++;
    }
    
    // función que acumula los puntos de cada perfil
    private void actualiza_acumulados(){
        if (jRadioButton1.isSelected()) {
            dominante++;
          //  jRadioButton1.setEnabled(false);
        }
        if (jRadioButton2.isSelected()) {
            influyente++;
           // jRadioButton2.setEnabled(false);
        }
        if (jRadioButton3.isSelected()) {
            solido++;
           // jRadioButton3.setEnabled(false);
        }
        if (jRadioButton4.isSelected()) {
            controlador++;
           // jRadioButton4.setEnabled(false);
        }
        buttonGroup1.clearSelection();
        
        jLabel1.setText(String.valueOf(dominante) );
        jLabel2.setText(String.valueOf(influyente) );
        jLabel3.setText(String.valueOf(solido) );
        jLabel4.setText(String.valueOf(controlador) );
    }
    
   
    
    public void calcula_perfil(){
        
         int max1 = 0;
         int max2 = 0;
         principal = "T";
         secundario = "T";
        
        // Comparamos cada variable con los máximos actuales y actualizamos max1 y max2 si es necesario
        if (dominante > max1) {
            max2 = max1; // Guardamos el valor anterior de max1 en max2
            max1 = dominante;
        } else if (dominante > max2) {
            max2 = dominante;
        }
        
        if (influyente > max1) {
            max2 = max1; // Guardamos el valor anterior de max1 en max2
            max1 = influyente;
        } else if (influyente > max2) {
            max2 = influyente;
        }
        
        if (solido > max1) {
            max2 = max1; // Guardamos el valor anterior de max1 en max2
            max1 = solido;
        } else if (solido > max2) {
            max2 = solido;
        }
        
        if (controlador > max1) {
            max2 = max1; // Guardamos el valor anterior de max1 en max2
            max1 = controlador;
        } else if (controlador > max2) {
            max2 = controlador;
        }
        
         // Comprobamos qué variables tienen el valor más alto
        if (dominante == max1) {
            principal = "D";
            valorprincipal = dominante;
        }
        if (influyente == max1) {
            principal = "I";
            valorprincipal = influyente;
        }
        if (solido == max1) {
            principal = "S";
            valorprincipal = solido;
        }
        if (controlador == max1) {
            principal = "C";
            valorprincipal = controlador;
        }
         // Comprobamos qué variable tienen el segundo valor más alto
        if (dominante == max2 && principal != "D") {
            secundario = "D";
            valorsecundario = dominante;
        }
        if (influyente == max2 && principal != "I") {
            secundario = "I";
            valorsecundario = influyente;
        }
        if (solido == max2 && principal != "S") {
            secundario = "S";
            valorsecundario = solido;
        }
        if (controlador == max2 && principal != "C") {
            secundario = "C";
            valorsecundario = controlador;
        }
    }
    
    public void calcula_patron(){
        int ref = 15;
        patron = "Indeterminado";
        if (dominante > ref){
            patron = "Emprendedor";
        }else if (influyente > ref ){
            patron = "Promotor";
        }else if (solido > ref){
            patron = "Planificador";
        }else if (controlador > ref){
            patron = "Pensador, Analista";
        }else if ((dominante + influyente)>ref){
            patron = "Competidor";
        }else if ((dominante + solido)>ref){
            patron = "Perfil poco común";
        }else if ((dominante + controlador)>ref){
            patron = "Creativo";
        }else if ((dominante + influyente + solido)>ref){
            patron = "Perfil valioso";
        }else if ((dominante + influyente + controlador)>ref){
            patron = "Dinámico";
        }else if ((dominante + solido + controlador)>ref){
            patron = "Analista competitivo";
        }else if ((influyente + solido)>ref){
            patron = "Consejero";
        }else if ((influyente + controlador)>ref){
            patron = "Evaluador";
        }else if ((influyente + solido + controlador)>ref){
            patron = "Experto, Profesional";
        }else if ((solido + controlador)>ref){
            patron = "Perfeccionista";
        }else if ( (dominante < 6) && (influyente < 6) && (solido < 6) && (controlador < 6) ){
            patron = "Ninguno";
        }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelGrupo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
