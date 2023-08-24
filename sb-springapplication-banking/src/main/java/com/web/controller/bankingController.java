package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Banking;
import com.web.service.BankingService;

@Controller
public class bankingController {
	@Autowired
	private BankingService service;
	
	@RequestMapping("/")
       public String homepage() {
    	   return"home";
       }
	@RequestMapping("/newaccount")
	public String newaccountpage() {
		return"newaccount";
	}
	@RequestMapping("/register")
	public String registeraccount(@ModelAttribute Banking Banking,Model model) {
		Banking bank=service.saveaccount(Banking);
		return "bank";
	}
	@RequestMapping("/balance")
	public String balancepage() {
		return"balance";
	}
	@RequestMapping("/balancesucess")
	public String balanceamountpage(@ModelAttribute Banking Banking,ModelMap model) {
        model.put("Banking",service.findbyid(Banking));
		return"balancesucess";
	}
	@RequestMapping("/deposit")
	public String depositpage() {
		return"deposit";
	}
	@RequestMapping("/depositsucess")
	public String depositamountpage(@ModelAttribute Banking Banking,ModelMap model) {
		 model.put("Banking",service.depositamount(Banking));
		return"depositsucess";
	}
	@RequestMapping("/withdraw")
	public String withdrawpage() {
		return"withdraw";
	}
	@RequestMapping("/withdrawsucess")
	public String withdrawmoney(@ModelAttribute Banking Banking,ModelMap model) {
		model.put("Banking",service.withdrawamount(Banking));
		return"withdrawsucess";
	}
	@RequestMapping("/closeac")
	public String closeacount() {
		return"deleteacount";
	}
	@RequestMapping("/deletesucess")
	public String deletesucesspage(@ModelAttribute Banking Banking,ModelMap model) {
		model.put("praveen",service.deleteaccount(Banking));
		return"deletesucess";
	}
	
}