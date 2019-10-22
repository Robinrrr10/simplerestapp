package com.github.simplerestapp.domain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.simplerestapp.entries.Health;

@Path("/base")
public class Basic {

	@Path("/healthCheck")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Health checkHealth() {
		Health health = new Health();
		health.setIsAlive(true);
		return health;
	}
	
}
