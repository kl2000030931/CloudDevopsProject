package com.klef.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.springboot.model.Government;
import com.klef.springboot.model.Articles;
import com.klef.springboot.model.Citizen;
import com.klef.springboot.service.GovernmentService;
import com.klef.springboot.service.ArticlesService;
import com.klef.springboot.service.CitizenService;

@Controller
public class ClientController
{
	@Autowired
	private GovernmentService governmentService;
	
	@Autowired
	private CitizenService citizenService;
	
	@Autowired
	private ArticlesService articlesService;
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	
	@GetMapping("/governmentlogin")
	public ModelAndView governmentlogindemo()
	{
		ModelAndView mv = new ModelAndView("governmentlogin");
		
		return mv;
	}
	
	@GetMapping("/ctzhome")
	public ModelAndView ctzhome()
	{
		ModelAndView mv = new ModelAndView("citizenhome");
		
		return mv;
	}
	
	@GetMapping("/citizenlogin")
	public ModelAndView citizenogindemo()
	{
		ModelAndView mv = new ModelAndView("citizenlogin");
		
		return mv;
	}
	
	@GetMapping("/citizenreg")
	public ModelAndView citizenregdemo()
	{
		ModelAndView mv = new ModelAndView("citizenregistration", "ctz",new Citizen());
		return mv;
	}
	
	@GetMapping("/new")
	public ModelAndView newarticledemo()
	{
		ModelAndView mv = new ModelAndView("newarticle", "arts",new Government());
		return mv;
	
	}
	@GetMapping("/governmenthome")
	public ModelAndView governmenthomedemo()
	{
		ModelAndView mv = new ModelAndView("governmenthome");
		
		return mv;
	}
	
	@GetMapping("/employeehome")
	public ModelAndView employeehomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("employeehome");
		
		HttpSession session = request.getSession();
		
		String euname = (String) session.getAttribute("euname");
		
		mv.addObject("euname", euname);
		
		return mv;
	}
	
	@GetMapping("/viewallctz")
	public ModelAndView viewallctzdemo()
	{
		ModelAndView mv = new ModelAndView("viewallcitizen");
		
		List<Citizen> ctzlist = governmentService.viewallcitizen();
		mv.addObject("ctzlist",ctzlist);
		
		return mv;
	}
	
	@GetMapping("/viewallarticles")
	public ModelAndView viewallartsdemo()
	{
		ModelAndView mv = new ModelAndView("viewallarticles");
		
		List<Articles> artslist = governmentService.viewallarticles();
		mv.addObject("artslist",artslist);
		
		return mv;
	}
	
	@GetMapping("/articlesforctz")
	public ModelAndView articlesforcitizendemo()
	{
		ModelAndView mv = new ModelAndView("articlesforctz");
		
		List<Articles> artslist = citizenService.articlesforctz();
		mv.addObject("artslist",artslist);
		
		return mv;
	}
	
	
	
	@PostMapping("/checkgovernmentlogin")
	public ModelAndView checkgovernmentlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String auname = request.getParameter("auname");
		String apwd = request.getParameter("apwd");
		
		Government government = governmentService.checkgovernmentlogin(auname, apwd);
		
		if(government!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("auname", auname);
			
			mv.setViewName("governmenthome");
		}
		else
		{
			mv.setViewName("governmentlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
	
	@PostMapping("/checkctzlogin")
	public ModelAndView checkctzlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String cuname = request.getParameter("cuname");
		String cpwd = request.getParameter("cpwd");
		
		Citizen emp = citizenService.checkctzlogin(cuname, cpwd);
		
		if(emp!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("cuname", cuname);
			
			mv.setViewName("citizenhome");
		}
		else
		{
			mv.setViewName("citizenlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
	
	@PostMapping("/addcitizen")
	public String addcitizendemo(@ModelAttribute("ctz") Citizen citizen)
	{
		citizenService.addcitizen(citizen);
		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("citizenregistration");
//		mv.addObject("msg", "citizen Registered Successfully");
		
		return "redirect:citizenlogin";
	}
	
	@GetMapping("/newarticle")
	public ModelAndView articles()
	{
		ModelAndView mv=new ModelAndView("newarticle","arts",new Articles());
		return mv;
	}
	@PostMapping("/addarticles")
	public String addarticles(@ModelAttribute("arts")Articles articles)
	{
		articlesService.addarticles(articles);
		return "redirect:governmenthome";
	}
	
	@GetMapping("/deletectz")
	public String deletectzdemo(@RequestParam("id") int cid)
	{
		governmentService.deletecitizen(cid);
		
		return "redirect:viewallctz";
	}
	
	@GetMapping("/deleteartz")
	public String deleteartzdemo(@RequestParam("id") int ano)
	{
		governmentService.deletearticle(ano);
		
		return "redirect:viewallarticles";
	}
	
	@GetMapping("/viewctz")
	public ModelAndView viewctz(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String cuname = (String) session.getAttribute("cuname");
		
		Citizen ctz =  citizenService.viewcitizen(cuname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewcitizen");
		mv.addObject("ctz",ctz);
		
		return mv;
	}
	
	@GetMapping("/cchangepwd")
	public ModelAndView cchangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String cuname = (String) session.getAttribute("cuname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ctzchangepwd");
		mv.addObject("cuname",cuname);
		
		return mv;
	}
	
	@PostMapping("/updatectzpwd")
	public ModelAndView updatectzpwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ctzchangepwd");
		
		HttpSession session = request.getSession();
		
		String cuname = (String) session.getAttribute("cuname");
		
		String coldpwd = request.getParameter("copwd");
		String cnewpwd = request.getParameter("cnpwd");
		
		int n = citizenService.changecitizenpassword(coldpwd, cnewpwd, cuname);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	
	@GetMapping("/viewctzbyid")
	public ModelAndView viewctzbyiddemo(@RequestParam("id") int cid)
	{
		Citizen ctz = governmentService.viewcitizenbyid(cid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewctzbyid");
		mv.addObject("ctz",ctz);
		
		return mv;
	}
	@GetMapping("/viewartbyid")
	public ModelAndView viewartbyiddemo(@RequestParam("id") int aid)
	{
		Articles articles = citizenService.viewarticlebyid(aid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewarticlesbyid");
		mv.addObject("arts",articles);
		
		return mv;
	}
	@GetMapping("/viewartbyidctz")
	public ModelAndView viewartbyidctzdemo(@RequestParam("id") int aid)
	{
		Articles articles = citizenService.viewarticlebyid(aid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewartbyidctz");
		mv.addObject("arts",articles);
		
		return mv;
	}
}
