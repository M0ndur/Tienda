
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    //metodos abstractos
    public List<Categoria> getCategorias(boolean activos);
    public void save(Categoria categoria); //inserta o actualiza
    public void delete(Categoria categoria);
    public Categoria getCategoria(Categoria categoria);
    
}
