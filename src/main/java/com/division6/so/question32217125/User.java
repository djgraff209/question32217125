package com.division6.so.question32217125;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	private int idUser;
	private String NomUser;
	private String PrenUser;
	private String MailUser;
	private String AdressUser;
	private int PhoneUser;
	private Date DateNaissanceUser;
	private int AccountStatus;
	private String Password;
	private String Login;
	private char SexeUser;
	private String ImagePath;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDUSER", unique = true, nullable = false)
	public int getidUser() {
		return idUser;
	}

	public void setidUser(int iduser) {
		this.idUser = iduser;
	}

	@Column(name = "NOMUSER", nullable = false)
	public String getNomUser() {
		return NomUser;
	}

	public void setNomUser(String nomUser) {
		this.NomUser = nomUser;
	}

	@Column(name = "PRENUSER", nullable = false)
	public String getPrenUser() {
		return PrenUser;
	}

	public void setPrenUser(String prenUser) {
		this.PrenUser = prenUser;
	}

	@Column(name = "MAILUSER", nullable = false)
	public String getMailUser() {
		return MailUser;
	}

	public void setMailUser(String mailUser) {
		this.MailUser = mailUser;
	}

	@Column(name = "ADRESSUSER", nullable = false)
	public String getAdressUser() {
		return AdressUser;
	}

	public void setAdressUser(String adressUser) {
		this.AdressUser = adressUser;
	}

	@Column(name = "PHONEUSER", nullable = false)
	public int getPhoneUser() {
		return PhoneUser;
	}

	public void setPhoneUser(int phoneUser) {
		this.PhoneUser = phoneUser;
	}

	@Column(name = "DATENAISSANCEUSER", nullable = false)
	public Date getDateNaissanceUser() {
		return DateNaissanceUser;
	}

	public void setDateNaissanceUser(Date dateNaissanceUser) {
		this.DateNaissanceUser = dateNaissanceUser;
	}

	@Column(name = "ACCOUNTSTATUS", nullable = false)
	public int getAccountStatus() {
		return AccountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.AccountStatus = accountStatus;
	}

	@Column(name = "PASSWORD", nullable = false)
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	@Column(name = "LOGIN", nullable = false)
	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		this.Login = login;
	}

	@Column(name = "SEXEUSER", nullable = false)
	public char getSexeUser() {
		return SexeUser;
	}

	public void setSexeUser(char sexeUser) {
		this.SexeUser = sexeUser;
	}

	@Column(name = "IMAGEPATH", nullable = true)
	public String getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String imagePath) {
		this.ImagePath = imagePath;
	}
}