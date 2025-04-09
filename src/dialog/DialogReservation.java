/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import java.awt.EventQueue;
import java.time.LocalDate;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
        frameReservation.setEnableHeure(false);
        frameReservation.setEnableNbPersonne(false);
        frameReservation.setEnableValider(false);
        frameReservation.setEnableAnnuler(false);
        frameReservation.setTableVisible(false);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        frameReservation.setEnableHeure(true);
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTimeSelectedEvent(String time) {
        frameReservation.setEnableNbPersonne(true);
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        String time = frameReservation.getHeure();
        int jour = frameReservation.getJour();
        int mois = frameReservation.getMois();
        frameReservation.setTableVisible(true);
        frameReservation.afficherTable(inf.trouverTableDisponible(jour, mois, nbPersons, time));

        
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTableSelectedEvent(int numTable) {
        frameReservation.setEnableAnnuler(true);
        frameReservation.setEnableValider(true);
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleCancelEvent() {
        
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleValidationEvent() {
        
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
