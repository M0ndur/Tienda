
package com.tienda.domain;

import javax.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable{
    
    //Inicio MySQL
    private static final long serialVersionUI = 1L; // para consignar las llaves primarias de la BD, el id articulo es incremental 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para la autoincrementacion
    private Long idArticulo; //esto para mapear una tabla de mySQL, fin
    private Long idCategoria;
     private String descripcion;
     private String detalle;
    private boolean activo;
    private double precio;
    private int existencias;

    
    public Articulo() {
    }

    public Articulo(Long idCategoria, String descripcion, String detalle, boolean activo, double precio, int existencias) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.activo = activo;
        this.precio = precio;
        this.existencias = existencias;
    }

   
   

    
}
