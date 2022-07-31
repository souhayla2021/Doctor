package model;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.mysql.jdbc.Blob;

public class Secretaire {
	private Long id_Secretaire;
	private String nom;
	private String prenom;
	private String email;
	private Date dateDeNaissance;
	private String adresse;
	private String motDePasse;
	private int telephone;
	private String login;
	private Blob image;
	private String cv;
	private Set<Rendez_vous> Rendez_vous = new HashSet<Rendez_vous>();
	private Set<Dossier_Patient> Dossier_Patients = new HashSet<Dossier_Patient>();
	
	
	public Secretaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Secretaire(String nom, String prenom, String email, Date dateDeNaissance, String adresse, String motDePasse,
			int telephone, String login, Blob image, String cv) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.motDePasse = motDePasse;
		this.telephone = telephone;
		this.login = login;
		this.image = image;
		this.cv = cv;
	}

	public Long getId_Secretaire() {
		return id_Secretaire;
	}
	public void setId_Secretaire(Long id_Secretaire) {
		this.id_Secretaire = id_Secretaire;
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
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
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
