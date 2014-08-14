package net.belisoft.butron.controller;

import net.belisoft.butron.model.Cachopo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ButronController {

	@Autowired
	@Qualifier("cachopoDeHeces")
	private Cachopo cachopo;

	@RequestMapping("/prueba")
	public String prueba() {
		System.out.println(cachopo.getTipo());
		return "hola";
	}
}