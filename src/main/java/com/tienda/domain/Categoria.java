
package com.tienda.domain;

import javax.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    
    //Inicio MySQL
    private static final long serialVersionUI = 1L; // para consignar las llaves primarias de la BD, el id categoria es incremental 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para la autoincrementacion
    private Long idCategoria; //esto para mapear una tabla de mySQL, fin
    
    private String descripcion;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    
    
}
