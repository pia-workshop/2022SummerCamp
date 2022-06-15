package com.yeditepe.summercamp.piacamp.DTO;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class UserDTO {
	@NotNull(message = "Username is mandotory!!!")
	private String userName;
	private String name;
	private String lastName;
	private String email;
	
}
