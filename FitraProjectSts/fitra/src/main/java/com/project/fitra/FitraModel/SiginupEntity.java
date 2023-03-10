package com.project.fitra.FitraModel;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="signup")
public class SiginupEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
		public String toString() {
			return "SiginupModel [Firstname=" + Firstname + ", Lastname=" + Lastname + ", phonenumber=" + phonenumber
					+ ", emailid=" + emailid + ", password=" + password + ", getFirstname()"
					+ ", getLastname()="  + ", getPhonenumber()=" + getPhonenumber() + ", getEmailid()="
					+ getEmailid() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
	public SiginupEntity(String firstname, String lastname, String phonenumber, String emailid, String password) {
			super();
			Firstname = firstname;
			Lastname = lastname;
			this.phonenumber = phonenumber;
			this.emailid = emailid;
			this.password = password;
		}
	public SiginupEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		public String Firstname;
        public String Lastname;
        public String phonenumber;
        public String emailid;
        public String password;
}
