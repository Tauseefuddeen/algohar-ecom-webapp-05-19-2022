package com.tauseef.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tauseef.webapp.dao.CustomerDAO;
import com.tauseef.webapp.model.Customer;

@Controller
public class CustomerController {

	@Autowired
	CustomerDAO customerDAO;
	
	@RequestMapping(value = "/list-customer", method = RequestMethod.GET)
	public ModelAndView listAllCustomer() {
		ModelAndView mv = new ModelAndView("list-customer");
		// get list of all products from d.
		List<Customer> customerList = customerDAO.getCustomer();
		mv.addObject("list", customerList);
		return mv;
	}

	// load add product form,
	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public ModelAndView addProduct() {
		ModelAndView mv = new ModelAndView("add-product");
		Customer customer = new Customer();
		mv.addObject("customer", customer);
		return mv;
	}

	// submit add product form
	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public ModelAndView submitProduct(@ModelAttribute("product") Customer customer) {
		ModelAndView mv = new ModelAndView("success-reponse");
		// submit data to add product dao operation.
		customerDAO.addCustomer(customer);
		mv.addObject("action", "created");
		return mv;
	}

	// load update customer form,
	@RequestMapping(value = "/update-customer", method = RequestMethod.GET)
	public ModelAndView updateCustomer() {
		ModelAndView mv = new ModelAndView("update-customer");
		Customer customer = new Customer();
		mv.addObject("customer", customer);
		return mv;
	}

	// submit add customer form
	@RequestMapping(value = "/update-product", method = RequestMethod.POST)
	public ModelAndView submitUpdateCustomer(@ModelAttribute("customer") Customer customer) {
		ModelAndView mv = new ModelAndView("success-reponse");
		// submit data to update product dao operation.
		customerDAO.updateCustomer(customer);
		mv.addObject("action", "updated");
		return mv;
	}

	// load delete customer form,
	@RequestMapping(value = "/delete-customer", method = RequestMethod.GET)
	public ModelAndView deleteCustomer() {
		ModelAndView mv = new ModelAndView("delete-customer");
		Customer customer = new Customer();
		mv.addObject("customer", customer);
		return mv;
	}

	// submit delete customer form
	@RequestMapping(value = "/delete-customer", method = RequestMethod.POST)
	public ModelAndView submitDeleteCustomer(@ModelAttribute("customer") Customer customer) {
		ModelAndView mv = new ModelAndView("success-reponse");
//		 submit data to update customer
		customerDAO.deleteCustomer(customer);
		mv.addObject("action", "deleted");
		return mv;
	}
}
