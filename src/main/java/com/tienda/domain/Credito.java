
package com.tienda.domain;

import javax.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable{
    
    //Inicio MySQL
    private static final long serialVersionUI = 1L; // para consignar las llaves primarias de la BD, el id credito es incremental 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para la autoincrementacion
    private Long idCredito; //esto para mapear una tabla de mySQL, fin
    
    private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }

    
}
