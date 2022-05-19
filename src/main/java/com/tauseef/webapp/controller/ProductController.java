package com.tauseef.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tauseef.webapp.dao.ProductDAO;
import com.tauseef.webapp.model.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDAO productDAO;

	@RequestMapping(value = "/list-products", method = RequestMethod.GET)
	public ModelAndView listAllProducts() {
		ModelAndView mv = new ModelAndView("list-products");
		// get list of all products from db.
		List<Product> productList = productDAO.getProducts();
		mv.addObject("list", productList);
		return mv;
	}

	// load add product form,
	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public ModelAndView addProduct() {
		ModelAndView mv = new ModelAndView("add-product");
		Product product = new Product();
		mv.addObject("product", product);
		return mv;
	}

	// submit add product form
	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public ModelAndView submitProduct(@ModelAttribute("product") Product product) {
		ModelAndView mv = new ModelAndView("success-reponse");
		// submit data to add product dao operation.
		productDAO.addProduct(product);
		mv.addObject("action", "created");
		return mv;
	}

	// load update product form,
	@RequestMapping(value = "/update-product", method = RequestMethod.GET)
	public ModelAndView updateProduct() {
		ModelAndView mv = new ModelAndView("update-product");
		Product product = new Product();
		mv.addObject("product", product);
		return mv;
	}

	// submit update product form
	@RequestMapping(value = "/update-product", method = RequestMethod.POST)
	public ModelAndView submitUpdateProduct(@ModelAttribute("product") Product product) {
		ModelAndView mv = new ModelAndView("success-reponse");
		// submit data to update product dao operation.
		productDAO.updateProduct(product);
		mv.addObject("action", "updated");
		return mv;
	}

	// load delete product form,
	@RequestMapping(value = "/delete-product", method = RequestMethod.GET)
	public ModelAndView deleteProduct() {
		ModelAndView mv = new ModelAndView("delete-product");
		Product product = new Product();
		mv.addObject("product", product);
		return mv;
	}

	// submit delete product form
	@RequestMapping(value = "/delete-product", method = RequestMethod.POST)
	public ModelAndView submitDeleteProduct(@ModelAttribute("product") Product product) {
		ModelAndView mv = new ModelAndView("success-reponse");
		// submit data to update product dao operation.
		productDAO.deleteProduct(product);
		mv.addObject("action", "deleted");
		return mv;
	}
}
