package model;

public class Dossier_Patient {
	private Long id_Dossier;
	private String HistoriquePatient;
	
	
	public Dossier_Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dossier_Patient(String historiquePatient) {
		super();
		HistoriquePatient = historiquePatient;
	}

	public Long getId_Dossier() {
		return id_Dossier;
	}
	public void setId_Dossier(Long id_Dossier) {
		this.id_Dossier = id_Dossier;
	}
	public String getHistoriquePatient() {
		return HistoriquePatient;
	}
	public void setHistoriquePatient(String historiquePatient) {
		HistoriquePatient = historiquePatient;
	}
	

}
