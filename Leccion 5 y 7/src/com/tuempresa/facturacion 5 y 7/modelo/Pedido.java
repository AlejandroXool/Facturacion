package com.tuempresa.reyesxochitlfacturacion.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pedido extends DocumentoComercial{

	@ManyToOne
	Factura factura;

}
