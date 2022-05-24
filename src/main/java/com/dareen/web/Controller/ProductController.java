package com.dareen.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dareen.web.dto.ProductRepositry;
import com.dareen.web.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepositry productRepo;
	
	@GetMapping("/listProducts.html")
	public String showExampleVeiw(Model model) {
		
		Product p = new Product();
		String id = (String)"S10_1678";
		
		p = (Product) productRepo.findById(id).get();
		
		model.addAttribute("product", p);
		
		System.out.println("from the showExampleVeiw()");
		
		
		return "/listProducts.html";
		
	}

}
