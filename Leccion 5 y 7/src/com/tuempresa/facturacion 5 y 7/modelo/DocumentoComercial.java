package com.tuempresa.reyesxochitlfacturacion.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity @Getter @Setter
@View(members =
"anyo,numero,fecha;"+
"cliente;"+
"detalles;"+
"observaciones"
		)
public class DocumentoComercial extends Identificable{ 
	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length=4)
	int anyo;
	
	@Column(length=6)
	@DefaultValueCalculator(value= CalculadoresSiguienteNumeroParaAnyo.class,
	properties= @PropertyValue(name = "anyo"))
	int numero;
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	LocalDate fecha;
	
	@ManyToOne(fetch =  FetchType.LAZY, optional =false)
	@ReferenceView("Simple")
	Cliente cliente;
	
	@ElementCollection
	@ListProperties("producto.numero,producto.descripcion,cantidad")
	Collection <Detalle> detalles;
	
	@Stereotype("MEMO")
	String  observaciones;

}
