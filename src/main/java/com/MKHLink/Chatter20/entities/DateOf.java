package com.MKHLink.Chatter20.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class DateOf {

	@Id
	@GeneratedValue
	private Long id;
	
	private Date date;
	private String occasion;
	
	@ManyToOne
	private User author;
}
