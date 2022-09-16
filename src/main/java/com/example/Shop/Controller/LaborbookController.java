package com.example.Shop.Controller;

import com.example.Shop.Models.Laborbook;
import com.example.Shop.Models.Personal;
import com.example.Shop.repo.LaborbookRepository;
import com.example.Shop.repo.SotrudnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LaborbookController    {
    @Autowired
    private LaborbookRepository laborbookRepository;
    @GetMapping("/Labor")
    public String GetRab(Model model)
    {
        return "Labbook";
    }
    @GetMapping("/Add/lab")
    public String GetAddStudent(Laborbook laborbook, Model model)
    {
        return "Add-lab";
    }
    @PostMapping("/Add/lab")
    public String blogPostAdd(@ModelAttribute("laborbook")@Valid Laborbook laborbook, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "Add-lab";
        }
        laborbookRepository.save(laborbook);
        return "redirect:/Labor";
    }
}
