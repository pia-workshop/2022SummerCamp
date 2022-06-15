package com.yeditepe.summercamp.piacamp.rest;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeditepe.summercamp.piacamp.DTO.UserDTO;
import com.yeditepe.summercamp.piacamp.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Validated
@Api(tags = "This api have user methods")
@RequestMapping("/user")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	@ApiOperation(value="Create User method", notes="Something happen!!!")
	@PostMapping(value="/create",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDTO createUser(@Valid @RequestBody UserDTO user) {
		
		return userService.createUSer(user);
	}

	
}
