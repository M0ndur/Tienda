
package com.tienda.service;

import com.tienda.domain.Cliente;
import java.util.List;


public interface ClienteService {
    //metodos abstractos
    public List<Cliente> getClientes();
    public void save(Cliente cliente); //inserta o actualiza
    public void delete(Cliente cliente);
    public Cliente getCliente(Cliente cliente);
    
}
