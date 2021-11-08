package com.tuempresa.reyesxochitlfacturacion.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter 
public class Empleado {
	
	@Id @Column(length=4)
	int idemp; 
	
	@Column(length=30)
	String nombre; 
	
	@Column (length=50)
	String domicilo; 

}
