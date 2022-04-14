
package com.tienda.controller;

import com.tienda.domain.Articulo;
import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticuloController {
    @Autowired
    
    private ArticuloService articuloService;
    
    @GetMapping("/articulo/listado")

    public String inicio(Model model){
          
        var articulos = articuloService.getArticulos(false); // false para que nos devuelva todas la articulos 
        
        model.addAttribute("articulos", articulos); //un identificador y la variable

        return "/articulo/listado";
    }
    
    @GetMapping("/articulo/nuevo")
        public String nuevoArticulo(Articulo articulo){
        return "/articulo/modificar";
    }

    @PostMapping("/articulo/guardar")

        public String guardarArticulo(Articulo articulo){
        articuloService.save(articulo);
        return "redirect:/articulo/listado";
    }
        
    @GetMapping("/articulo/modificar/{idArticulo}") //id Articulo tendra un valor para cada usaurio
        public String modificarArticulo(Articulo articulo, Model model){
        articulo = articuloService.getArticulo(articulo); // se encarga el objeto
        model.addAttribute("articulo", articulo); // y se lo paso a modificar CLinete, esto para que aparezca la info precargada
        return "/articulo/modificar";
    }
        
    @GetMapping("/articulo/eliminar/{idArticulo}")
        public String eliminarArticulo(Articulo articulo){
        articuloService.delete(articulo); 
        return "redirect:/articulo/listado";
    }
}
    

