package com.github.simplerestapp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.simplerestapp.entries.User;

@Path("/accounts")
public class Accounts {

	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setId(1);
		user1.setName("Ramu");
		user1.setAge(24);
		User user2 = new User();
		user2.setId(2);
		user2.setName("Suresh");
		user2.setAge(38);
		users.add(user1);
		users.add(user2);
		return users;
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("id") int id){
		User user = new User();
		if(id == 1) {
		user.setId(1);
		user.setName("Ramu");
		user.setAge(24);
		}else if( id == 2) {
		user.setId(2);
		user.setName("Suresh");
		user.setAge(38);
		}else {
			
		}
		return user;
	}
	
}
