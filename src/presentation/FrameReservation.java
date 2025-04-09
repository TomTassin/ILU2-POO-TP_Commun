/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import java.time.LocalDate;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;

import dialog.DialogReservation;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        jLabel1 = new javax.swing.JLabel();
        heure = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nbPersonsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nbPersonne = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeTable = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        annuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabel1.setText("1. Choisissez la date");

        heure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        heure.setPreferredSize(new java.awt.Dimension(157, 21));
        heure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heureActionPerformed(evt);
            }
        });

        jLabel2.setText("2. Choisissez l'heure");

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabel3.setText("3. Indiquez le nombre de personnes");

        nbPersonne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        nbPersonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbPersonneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nbPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N

        ListeTable.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListeTable);

        jLabel4.setText("4. Choisissez votre table");

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valider)
                .addGap(18, 18, 18)
                .addComponent(annuler)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider)
                    .addComponent(annuler)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void heureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heureActionPerformed
        dialog.handleTimeSelectedEvent((String)heure.getSelectedItem());
    }//GEN-LAST:event_heureActionPerformed

    private void nbPersonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbPersonneActionPerformed
        dialog.handleNumOfPersonsSelectedEvent((int)nbPersonne.getSelectedItem());
    }//GEN-LAST:event_nbPersonneActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        dialog.handleValidationEvent();
    }//GEN-LAST:event_validerActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        dialog.handleCancelEvent();
    }//GEN-LAST:event_annulerActionPerformed
    
    public void setEnableHeure(boolean enable){
        heure.setEnabled(enable);
    }
    
    public void setEnableNbPersonne(boolean enable){
        nbPersonne.setEnabled(enable);
    }
    
    public void setEnableValider(boolean enable){
        valider.setEnabled(enable);
    }
    
    public void setEnableAnnuler(boolean enable){
        annuler.setEnabled(enable);
    }
    
    public void setTableVisible(boolean visibilite){
        ListeTable.setVisible(visibilite);   
    }
    
    public void afficherTable(String[] table){
        ListeTable.setListData(table);
    }
    
    public String getHeure(){
        return (String)heure.getSelectedItem();
    }
    public int getJour(){
        LocalDate date = datePicker.getDate();
        return date.getDayOfMonth();
    }
    public int getMois(){
        LocalDate date = datePicker.getDate();
        return date.getMonthValue();
    }
    
    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        this.dialog.handleDateSelectedEvent(datePicker.getDate());
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListeTable;
    private javax.swing.JButton annuler;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JComboBox<String> heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JComboBox<String> nbPersonne;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables

}
