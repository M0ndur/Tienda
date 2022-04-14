
package com.tienda.service;

import com.tienda.dao.ArticuloDao;
import com.tienda.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //
public class ArticuloServicempl implements ArticuloService {
    
    @Autowired
    
    private ArticuloDao articuloDao;

    @Override
    public List<Articulo> getArticulos(boolean activos) {
        var lista = (List<Articulo>)articuloDao.findAll();
        
        if (activos) {
            lista.removeIf(e -> !e.isActivo()); //remueve a los inactivos
        }
        return(List<Articulo>)articuloDao.findAll();
        
    }

    @Override
    public void save(Articulo articulo) {
        articuloDao.save(articulo);
    }

    @Override
    public void delete(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }
    
}