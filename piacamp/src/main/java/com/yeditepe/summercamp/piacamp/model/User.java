package com.yeditepe.summercamp.piacamp.model;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class User {
	private UUID id;
	private String userName;
	private String name;
	private String lastName;
	private String email;

}
