package com.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Product;
import repository.HomeRepo;

@Controller
@RequestMapping("/")
public class HomeCon {

	HomeRepo repo;
	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping("/add")
	public String add(HttpServletRequest req) {
		String id= req.getParameter("id");
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String desp=req.getParameter("desp");
         Product p=new Product(id,name,price,desp);
		repo.save(p);
	 return "home";	
	}
	@RequestMapping("/delete")
	public String delete(HttpServletRequest req) {
		String id= req.getParameter("id");
		repo.deleteById(id);
	 return "home";	
	}
	@RequestMapping("/part")
	public Product part(HttpServletRequest req) {
		String id= req.getParameter("id");
		return repo.getById(id);
	}
	@RequestMapping("/show")
	public List<Product> show() {
		List<Product> p=repo.findAll();
		return p;
	}
}
