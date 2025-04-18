package dialog;

import java.awt.EventQueue;

import control.ControlCreerClient;
import model.CarnetClientele;
import presentation.PresentationJFrameCreationClient;
import presentation.PresentationJFrameModeAdministrateur;

public class DialogAjoutClient {

	private PresentationJFrameCreationClient presentationCreationClient;
	private PresentationJFrameModeAdministrateur presentationFenetreModeAdministrateur;
	private CarnetClientele carnetClientel;
	private ControlCreerClient controlCreerClient;

	public void initDialog() {
		// Cr�ation de la pr�sentation pour l'ajout client
		presentationCreationClient = new PresentationJFrameCreationClient();
		presentationCreationClient.setDialogue(this);
		presentationCreationClient.setVisible(true);
		// Cr�ation de la pr�sentation pour le mode administrateur
		presentationFenetreModeAdministrateur = new PresentationJFrameModeAdministrateur();
		presentationFenetreModeAdministrateur.setVisible(true);
		// Cr�ation carnetClient
		carnetClientel = new CarnetClientele();
		// Cr�ation controlCreerClient
		controlCreerClient = new ControlCreerClient(carnetClientel);
	}

	public void eventCreationClient(String nom, String prenom, String email, char[] mdp, char[] mdpConf) {

		boolean passwordError = false;

		int sizeMdp = (new String(mdp)).length();
		int sizeMdpConf = (new String(mdpConf)).length();

		if (sizeMdp != sizeMdpConf) {
			passwordError = true;
		} else {
			for (int i = 0; i < sizeMdp; i++) {
				if (mdp[i] != mdpConf[i]) {
					passwordError = true;
					break;
				}
			}
		}

		if (passwordError) {
			presentationCreationClient.setPresentationPasswordError();
		} else {
			controlCreerClient.creerClient(nom, prenom, email, new String(mdp));
			presentationFenetreModeAdministrateur.presentationClientAjoute(nom, prenom, email);
		}

	}

	public void eventCreationClientCancel() {
		presentationCreationClient.resetPresentation();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Cr�ation dialogReservation
		DialogAjoutClient dialogReservation = new DialogAjoutClient();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dialogReservation.initDialog();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
