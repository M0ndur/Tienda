
package com.tienda.controller;

import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CategoriaController {
    @Autowired
    
    private CategoriaService categoriaService;
    
    @GetMapping("/categoria/listado")

    public String inicio(Model model){
          
        var categorias = categoriaService.getCategorias(false); // false para que nos devuelva todas la categorias 
        
        model.addAttribute("categorias", categorias); //un identificador y la variable

        return "/categoria/listado";
    }
    
    @GetMapping("/categoria/nuevo")
        public String nuevoCategoria(Categoria categoria){
        return "/categoria/modificar";
    }

    @PostMapping("/categoria/guardar")

        public String guardarCategoria(Categoria categoria){
        categoriaService.save(categoria);
        return "redirect:/categoria/listado";
    }
        
    @GetMapping("/categoria/modificar/{idCategoria}") //id Categoria tendra un valor para cada usaurio
        public String modificarCategoria(Categoria categoria, Model model){
        categoria = categoriaService.getCategoria(categoria); // se encarga el objeto
        model.addAttribute("categoria", categoria); // y se lo paso a modificar CLinete, esto para que aparezca la info precargada
        return "/categoria/modificar";
    }
        
    @GetMapping("/categoria/eliminar/{idCategoria}")
        public String eliminarCategoria(Categoria categoria){
        categoriaService.delete(categoria); 
        return "redirect:/categoria/listado";
    }
}
    

