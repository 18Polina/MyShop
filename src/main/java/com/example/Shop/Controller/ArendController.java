package com.example.Shop.Controller;

import com.example.Shop.Models.Arenda;
import com.example.Shop.Models.Mesto;
import com.example.Shop.repo.ArendaRepository;
import com.example.Shop.repo.MestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class ArendController {

   @Autowired
   private MestoRepository mestoRepository;
    @Autowired
    private ArendaRepository arendaRepository;

    @GetMapping("/MainAgenda")
    public String GetRab(Model model)
    {
        Iterable<Mesto> mesto = mestoRepository.findAll();
        model.addAttribute("city",mesto);
        return "MainArenda";
    }
    @GetMapping("/Add/arenda")
    public String GetArenda()
    {
        return  "Add-arenda";
    }

    @PostMapping("/Add/arenda")
    public String blogPostAdd( @RequestParam String datenachala,@RequestParam String nomerdogovora, @RequestParam String street,
                               @RequestParam String city,
                              Model model)
    {
        Mesto mesto = mestoRepository.findByCity(city);
        Arenda arenda = new Arenda(datenachala, nomerdogovora,street,mesto);
        arendaRepository.save(arenda);
        return "redirect:/MainArenda";
    }

}
