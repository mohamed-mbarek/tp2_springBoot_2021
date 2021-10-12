package com.example.demo.cinema;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entites.Cinema;
import com.example.demo.entites.Ville;
import com.example.demo.reposirtory.CinemaRepository;

@SpringBootTest
public class TestCinema {

	@Autowired
	private CinemaRepository cinemaRepository;

	@Test
	public void testCinemaEmployer() {
		Cinema cinema = new Cinema("Opera", 5, "Nabeul mrezga", "the best cinema");
		cinemaRepository.save(cinema);
	}

	@Test
	public void testFindAll() {
		List<Cinema> prods = cinemaRepository.findAll();
		for (Cinema c : prods) {
			System.out.println(c);
		}
	}

	@Test
	public void testFindByNom() {
		List<Cinema> prods = cinemaRepository.findByNom("Opera");
		for (Cinema c : prods) {
			System.out.println(c);
		}
	}

	@Test
	public void testFindByNomCinemaContains() {
		List<Cinema> prods = cinemaRepository.findByNomContains("Opera");
		for (Cinema p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomNbplace() {
		List<Cinema> prods = cinemaRepository.findByNomNbplace("Opera", 2);
		for (Cinema p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByCinema() {
		Ville cat = new Ville();
		cat.setIdVille(2L);
		List<Cinema> prods = cinemaRepository.findByVille(cat);
		for (Cinema p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindByVilleIdVille() {
		List<Cinema> prods = cinemaRepository.findByVilleIdVille(1L);
		for (Cinema p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByOrderByNomAsc() {
		List<Cinema> prods = cinemaRepository.findByOrderByNomAsc();
		for (Cinema p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testTrierCinemasNomsPrix() {
		List<Cinema> prods = cinemaRepository.trierProduitsNomsSalles();
		for (Cinema p : prods) {
			System.out.println(p);
		}
	}
}
