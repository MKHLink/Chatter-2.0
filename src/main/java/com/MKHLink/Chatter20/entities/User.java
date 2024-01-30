package com.MKHLink.Chatter20.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_table")
@NoArgsConstructor
@Data
public class User {
	@GeneratedValue
	@Id
	private Long id;

	@Embedded
	private Credentials credentials;

	@Embedded
	private Profile profile;

	@OneToMany(mappedBy = "messenger")
	private List<Note> notes = new ArrayList<>();

	@OneToMany(mappedBy = "author")
	private List<DateOf> dates = new ArrayList<>();
}
