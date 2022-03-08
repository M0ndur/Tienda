
package com.tienda.domain;

import javax.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    
    //Inicio MySQL
    private static final long serialVersionUI = 1L; // para consignar las llaves primarias de la BD, el id cliente es incremental 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para la autoincrementacion
    private Long idCliente; //esto para mapear una tabla de mySQL, fin
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
    
}
