
package com.tienda.controller;

import com.tienda.domain.Cliente;
import com.tienda.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/cliente/listado")
    public String inicio(Model model){
          
        var clientes = clienteService.getClientes(); // enlace a la capa de negocio
        var limiteTotal=0;
        for (var c: clientes) {
            limiteTotal+=c.credito.limite;
        }
        model.addAttribute("limiteTotal",limiteTotal);
        model.addAttribute("totalClientes",clientes.size());
        model.addAttribute("clientes", clientes); //un identificador y la variable

        return "/cliente/listado";
    }
    
    @GetMapping("/cliente/nuevo")
        public String nuevoCliente(Cliente cliente){
        return "/cliente/modificar";
    }

    @PostMapping("/cliente/guardar")

        public String guardarCliente(Cliente cliente){
        clienteService.save(cliente);
        return "redirect:/cliente/listado";
    }
        
    @GetMapping("/cliente/modificar/{idCliente}") //id Cliente tendra un valor para cada usaurio
        public String modificarCliente(Cliente cliente, Model model){
        cliente = clienteService.getCliente(cliente); // se encarga el objeto
        model.addAttribute("cliente", cliente); // y se lo paso a modificar CLinete, esto para que aparezca la info precargada
        return "/cliente/modificar";
    }
        
    @GetMapping("/cliente/eliminar/{idCliente}")
        public String eliminarCliente(Cliente cliente){
        clienteService.delete(cliente); 
        return "redirect:/cliente/listado";
    }
}
    

