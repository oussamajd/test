package main.com.cynapsys.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom; 
	@Column(name = "password")
	private String password; 
	@Column(name = "username")
	private String username;
	

	/**
	 * @param iD
	 * @param nom
	 * @param prenom
	 * @param password
	 * @param username
	 */
	public User(Integer iD, String nom, String prenom, String password, String username) {
		
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.username = username;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the iD
	 */
	public Integer getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(Integer iD) {
		ID = iD;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", username="
				+ username + "]";
	}


	



	
}