package com.project.fitra.FitraModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="utubelinks")
public class LinkEntity {
	  @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
	    int id;
	  String link;
	public String getlink() {
		return link;
	}

	public LinkEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LinkEntity(int id, String link) {
		super();
		this.id = id;
		this.link = link;
	}

	public LinkEntity(String link) {
		super();
		this.link = link;
	}
	@Override
	public String toString() {
		return "LinkModel [link=" + link + "]";
	}
      }
