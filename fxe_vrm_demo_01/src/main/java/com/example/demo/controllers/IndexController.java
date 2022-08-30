package com.example.demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.vrm.ObjetosPruebaVrm;

@Controller
public class IndexController {

	public ObjetosPruebaVrm objetosPruebaVrm = new ObjetosPruebaVrm();

//Map de strings//
	
	@GetMapping({"index","/","home"})
	public ModelAndView index(ModelAndView modelV) {
		objetosPruebaVrm.setTitulo("Titulo en objeto");
		objetosPruebaVrm.setEtiquetah1("Etiqueta h1 ");
		modelV.addObject("objetosPruebaVrm",objetosPruebaVrm);
		modelV.setViewName("index");
		return modelV;
	}
	

	
//Map de strings//
	
//	@GetMapping({"index","/","home"})
//	public ModelAndView index(ModelAndView modelV) {
//		modelV.addObject("titulo","Hola spring model VRM!!");
//		modelV.setViewName("index");
//		return modelV;
//	}

//Map de strings//
	
//	@GetMapping({"index","/","home"})
//	public String index(Model model) {
//		model.addAttribute("titulo","Hola spring model VRM!!");
//		return "index";
//	}
	
//Map de strings//
	
//	@GetMapping({"index","/","home"})
//	public String index(Map<String,Object> map) {
//		map.put("titulo","Hola spring map VRM!!");
//		return "index";
//	}

	
	
}
