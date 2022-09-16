package com.example.Shop.Controller;

import com.example.Shop.Models.Personal;
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


public class SotrudnikController {
    @Autowired
    private SotrudnikRepository sotrudnikRepository;
    @GetMapping("/Personal")
    public String GetRab(Model model)
    {

        return "Personal";
    }
    @GetMapping("/Add/personal")
    public String GetAddStudent(Personal personal, Model model)
    {
        return "Add-personal";
    }
    @PostMapping("/Add/personal")
    public String blogPostAdd(@ModelAttribute("personal")@Valid Personal personal, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "Add-personal";
        }
        sotrudnikRepository.save(personal);
        return "redirect:/Personal";
    }
}
