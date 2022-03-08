/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import com.tienda.service.ClienteService;
import java.util.Arrays;
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
    
    //private ClienteDao clienteDao;
    private ClienteService clienteService;
    
    @GetMapping("/")

    public String inicio(Model model){
                
        //lista
        //var clientes = Arrays.asList(cliente1, cliente2);
        var clientes = clienteService.getClientes(); // enlace a la capa de negocio
        
        model.addAttribute("clientes", clientes); //un identificador y la variable

        return "index";
    }
    
    @GetMapping("/nuevoCliente")

        public String nuevoCliente(Cliente cliente){
   
        return "modificarCliente";
    }

    @PostMapping("/guardarCliente")

        public String guardarCliente(Cliente cliente){
        clienteService.save(cliente);
   
        return "redirect:/";
    }
        
    @GetMapping("/modificarCliente/{idCliente}") //id Cliente tendra un valor para cada usaurio

        public String modificarCliente(Cliente cliente, Model model){
            cliente = clienteService.getCliente(cliente); // se encarga el objeto
            model.addAttribute("cliente", cliente); // y se lo paso a modificar CLinete, esto para que aparezca la info precargada
   
        return "modificarCliente";
    }
        
    @GetMapping("/eliminarCliente/{idCliente}")

        public String eliminarCliente(Cliente cliente){
        clienteService.delete(cliente); 
   
        return "redirect:/";
    }
}
    

