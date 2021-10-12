package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cinema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int nombreSalles;
	private String adress;
	private String description;
	@ManyToOne
	private Ville ville;
	

	public Cinema() {
		super();
	}

	public Cinema(String nom, int nombreSalles, String adress, String description) {
		super();
		this.nom = nom;
		this.nombreSalles = nombreSalles;
		this.adress = adress;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Cinema [id=" + id + ", nom=" + nom + ", nombreSalles=" + nombreSalles + ", adress=" + adress
				+ ", description=" + description + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreSalles() {
		return nombreSalles;
	}

	public void setNombreSalles(int nombreSalles) {
		this.nombreSalles = nombreSalles;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
