package com.uca.Labo3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.Labo3.domain.Producto;


@Controller
public class ProductoController {
	private List<Producto> products = new ArrayList<Producto>();
	
	@GetMapping("/producto")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		
		products.add(new Producto(1, "Rubik", 100));
		
		products.add(new Producto(2, "yoyo", 20));
		
		products.add(new Producto(3, "Megaminx", 200));
		
		products.add(new Producto(4, "Skew", 100));
		
		mav.setViewName("productos");
		mav.addObject("product", new Producto() );
		mav.addObject("productos", products);
		
		return mav;
	}	
	
	@PostMapping("/validar")
	public ModelAndView validar(Producto product) {
		ModelAndView mav = new ModelAndView();
	mav.addObject("product", product);
		if(product.getCantidad() > products.get(product.getId()).getCantidad()) {
			mav.addObject("product", product);
			mav.setViewName("/error");
		}else {
			mav.addObject("product", product);
			mav.setViewName("/comprar");
		}
		
		return mav;
	}
	
}