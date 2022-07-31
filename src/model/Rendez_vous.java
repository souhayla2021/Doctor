package model;

import java.sql.Time;
import java.util.Date;

public class Rendez_vous {
private Long id_Rendez_vous;
private Date date;
private Time heure;


public Rendez_vous() {
	super();
	// TODO Auto-generated constructor stub
}

public Rendez_vous(Date date, Time heure) {
	super();
	this.date = date;
	this.heure = heure;
}

public Long getId_Rendez_vous() {
	return id_Rendez_vous;
}
public void setId_Rendez_vous(Long id_Rendez_vous) {
	this.id_Rendez_vous = id_Rendez_vous;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Time getHeure() {
	return heure;
}
public void setHeure(Time heure) {
	this.heure = heure;
}


}
