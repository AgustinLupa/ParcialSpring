package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.dao.IClienteService;
import com.example.demo.models.dao.IFacturaDao_2;
import com.example.demo.models.entity.Cliente;
import com.example.demo.models.entity.Factura;
import com.example.demo.paginator.PageRender;

@Controller
public class FacuraController {
	@Autowired
	private IFacturaDao_2 facturaDAO; 
	
	@GetMapping({"/listarfacturas"})
	public String Listar( Model model) {
		model.addAttribute("titulo","Listado de facturas");
		//Pageable page_request = PageRequest.of(page, 4);
		//System.out.println(facturaDAO.findAll(page_request).getSize());
		//Page<Factura> facturas = facturaDAO.findAll(page_request);
		//PageRender<Factura> page_render = new PageRender<>("/listarfacturas",facturas);
		List<Factura> facturas =  (List<Factura>) facturaDAO.findAll();		
		model.addAttribute("facturas", facturas);
		
		return "listarfacturas";
	}
}
