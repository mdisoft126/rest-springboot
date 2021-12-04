package com.marcind;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource 
{
	@RequestMapping("aliens")
	public List<Alien> getAliens()
	{
		List<Alien> aliens = new ArrayList<>();
		
		Alien a1 = new Alien();
		a1.setId(101);
		a1.setName("Navin");
		a1.setPoints(70);
		
		Alien a2 = new Alien();
		a2.setId(102);
		a2.setName("Priya");
		a2.setPoints(80);
		
		Alien a3 = new Alien();
		a3.setId(103);
		a3.setName("Kaka");
		a3.setPoints(50);
		
		
		aliens.add(a1);
		aliens.add(a2);
		aliens.add(a3);
		
		return aliens;
	}
}
