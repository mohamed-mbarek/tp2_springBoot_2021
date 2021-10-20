package com.example.demo.entites;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Cinema.class }) 
public interface CinemaProjection {
	public String getNom(); 
}
