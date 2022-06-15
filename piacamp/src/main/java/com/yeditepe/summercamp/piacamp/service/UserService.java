package com.yeditepe.summercamp.piacamp.service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeditepe.summercamp.piacamp.DTO.UserDTO;
import com.yeditepe.summercamp.piacamp.model.User;
import com.yeditepe.summercamp.piacamp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDTO createUSer(UserDTO dto) {

		User existUser = userRepository.findByUserName(dto.getUserName());
		if (Objects.nonNull(existUser)) {
			throw new RuntimeException("Username must be uniq!!!");
		}
		return convertUser(userRepository.save(convertUserDTO(dto)));
	}

	public List<User> getAllUSer() {
		return userRepository.findAll();
	}

	private UserDTO convertUser(User user) {
		UserDTO dto = new UserDTO();
		dto.setUserName(user.getUserName());
		dto.setName(user.getName());
		dto.setLastName(user.getLastName());
		dto.setEmail(user.getEmail());
		return dto;
	}

	private User convertUserDTO(UserDTO dto) {
		User user = new User(UUID.randomUUID(), dto.getUserName(), dto.getName(), dto.getLastName(), dto.getEmail());
		return user;
	}

}
