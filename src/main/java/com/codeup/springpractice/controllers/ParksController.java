package com.codeup.springpractice.controllers;

import com.codeup.springpractice.models.NationalParks;
import com.codeup.springpractice.repositories.ParksRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/parks")
public class ParksController {

    private ParksRepository parksDao;

    public ParksController(ParksRepository parksDao){
        this.parksDao = parksDao;

    }

    @GetMapping("/list")
    public String allParks(Model model){
        List<NationalParks> parks = parksDao.findAll();
        model.addAttribute("parks", parks);
        return "/parks";
    }

    @GetMapping("/create")
    public String createParksForm(){
        return "/create";
    }

    @PostMapping("/create")
    public String saveThePark(@RequestParam (name= "name") String name){
        NationalParks park = new NationalParks(name);
        parksDao.save(park);
        return "redirect:/parks/list";
    }



}
