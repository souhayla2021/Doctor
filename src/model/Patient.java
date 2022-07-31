package model;




import java.util.HashSet;
import java.util.Set;

import com.mysql.jdbc.Blob;

public class Patient {
	private int id_Patient;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String dateDeNaissance;
	private String adresse;
	private String cnss;
	private Set<Rendez_vous> Rendez_vous = new HashSet<Rendez_vous>();
	private Set<Dossier_Patient> Dossier_Patients = new HashSet<Dossier_Patient>();
	

	
	
	public Patient(int id_Patient, String nom, String prenom, String email, String telephone,String dateDeNaissance, String adresse, String cnss) {
		super();
		this.id_Patient = id_Patient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone=telephone;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.cnss = cnss;
	}
	
	


	


	public Patient() {
	}







	public int getId_Patient() {
		return id_Patient;
	}







	public void setId_Patient(int id_Patient) {
		this.id_Patient = id_Patient;
	}







	public String getNom() {
		return nom;
	}







	public void setNom(String nom) {
		this.nom = nom;
	}







	public String getPrenom() {
		return prenom;
	}







	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}







	public String getEmail() {
		return email;
	}







	public void setEmail(String email) {
		this.email = email;
	}







	public String getTelephone() {
		return telephone;
	}







	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}







	public String getDateDeNaissance() {
		return dateDeNaissance;
	}







	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}







	public String getAdresse() {
		return adresse;
	}







	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}







	public String getCnss() {
		return cnss;
	}







	public void setCnss(String cnss) {
		this.cnss = cnss;
	}







	public Set<Rendez_vous> getRendez_vous() {
		return Rendez_vous;
	}







	public void setRendez_vous(Set<Rendez_vous> rendez_vous) {
		Rendez_vous = rendez_vous;
	}







	public Set<Dossier_Patient> getDossier_Patients() {
		return Dossier_Patients;
	}







	public void setDossier_Patients(Set<Dossier_Patient> dossier_Patients) {
		Dossier_Patients = dossier_Patients;
	}



}
