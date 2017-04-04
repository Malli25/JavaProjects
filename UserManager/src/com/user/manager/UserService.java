package com.user.manager;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/UserService") 
public class UserService {

	UserDAO udao = new UserDAO();
	
@GET
@Path("/listusers")
@Produces(MediaType.APPLICATION_XML)
public List<User> getUsers(){
		
		return udao.getAllUsers();
	}

}
