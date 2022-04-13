
package com.tienda.service;

import com.tienda.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    //metodos abstractos
    public List<Articulo> getArticulos(boolean activos);
    public void save(Articulo articulo); 
    public void delete(Articulo articulo);
    public Articulo getArticulo(Articulo articulo);
    
}
