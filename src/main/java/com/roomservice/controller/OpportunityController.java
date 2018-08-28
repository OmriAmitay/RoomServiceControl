package com.roomservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.roomservice.dao.MongoDao;
import com.roomservice.entity.Operator;
import com.roomservice.entity.OpportunityFormData;

@Controller
@RequestMapping("/control")
public class OpportunityController {
	
	@RequestMapping("/health")
	public String health(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "ok";
	}

	@GetMapping("/opportunity")
	public String greetingForm(Model model) {
		Long opportunityId = MongoDao.getInstance().getMaxOpportunityId();
		OpportunityFormData opportunityFormData = new OpportunityFormData();
		opportunityFormData.setOpportunityId(opportunityId);

		model.addAttribute("opportunityForm", opportunityFormData);
		model.addAttribute("operators", Operator.values());
		return "opportunityForm";
	}

	@PostMapping("/addOportunity")
	public String greetingSubmit(@Valid @ModelAttribute OpportunityFormData opportunityFormData, BindingResult errors,
			HttpServletResponse response) throws Exception {

		if (errors.hasErrors()) {
			throw new Exception("Bad Parameters");
		}

		boolean isValid = MongoDao.getInstance().importOpportunity(opportunityFormData);
		if (!isValid) {
			throw new Exception("Bad Opportunity Id");
		}

		return "display";
	}

}