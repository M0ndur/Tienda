
package com.tienda.controller;


import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class indexController {
    @Autowired
    
    //private ArticuloDao articuloDao;
    private ArticuloService articuloService;
    
    @GetMapping("/")

    public String inicio(Model model){ //mostrar los articulos
        var articulos = articuloService.getArticulos(true); //articulos activos
        model.addAttribute("articulos", articulos); 
        return "index";
    }
    
    
}
    

