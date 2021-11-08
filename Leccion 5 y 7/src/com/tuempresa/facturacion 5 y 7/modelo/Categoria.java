package com.tuempresa.reyesxochitlfacturacion.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Categoria extends Identificable {
	
	
	@Id
	@Hidden 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	@Column(length=32)
	String oid; 
	
	@Column(length=50)
	String descripcion; 

}
