package com.tuempresa.reyesxochitlfacturacion.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter 
@View(members= 
"anyo, numero, fecha;" + 
"cliente;" + 
"detalles;" +
"observaciones"
)
public class Factura extends DocumentoComercial {

	@OneToMany (mappedBy="factura")
	Collection<Pedido>pedidos;
	
	    
}
