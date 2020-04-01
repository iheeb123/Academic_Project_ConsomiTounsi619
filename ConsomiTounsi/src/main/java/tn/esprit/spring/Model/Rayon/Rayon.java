package tn.esprit.spring.Model.Rayon;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import tn.esprit.spring.Model.GestionProduit.Produit;

@Entity
public class Rayon implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Idrayon;
	private String nom_rayon;
	public Type_rayon type_rayon;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Idrayon")
	private Set<Produit> produits;

	public long getIdrayon() {
		return Idrayon;
	}

	public void setIdrayon(int idrayon) {
		Idrayon = idrayon;
	}

	public String getNom_rayon() {
		return nom_rayon;
	}

	public void setNom_rayon(String nom_rayon) {
		this.nom_rayon = nom_rayon;
	}

	public Type_rayon getType_rayon() {
		return type_rayon;
	}

	public void setType_rayon(Type_rayon type_rayon) {
		this.type_rayon = type_rayon;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	public Rayon() {
		super();
	}

	public Rayon(long idrayon, String nom_rayon, Type_rayon type_rayon) {
		super();
		Idrayon = idrayon;
		this.nom_rayon = nom_rayon;
		this.type_rayon = type_rayon;
	}

	
	
	
	
}