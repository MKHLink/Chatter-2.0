package com.MKHLink.Chatter20.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Note {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@CreatedDate
	private Timestamp createdAt = Timestamp.valueOf(LocalDateTime.now());
	
	private String message;
	
	@ManyToOne
	private User messenger;
}
