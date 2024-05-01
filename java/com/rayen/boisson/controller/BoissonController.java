package com.rayen.boisson.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BoissonController {
	@RequestMapping("/myView")
	public String myView()
	{
	return "myView";
	}

}
