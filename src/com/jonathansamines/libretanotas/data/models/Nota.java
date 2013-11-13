package com.jonathansamines.libretanotas.data.models;

import java.util.Date;

public class Nota {
	
	private int codigoNota;
	
	private String tituloNota;
	
	private Date fechaCreacion;
	
	private Date fechaModificacion;
	
	private String contenido;
	
	public Nota( String tituloNota, String contenido , Date fechaCreacion, Date fechaModificacion){
		this.tituloNota = tituloNota;
		this.contenido = contenido;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public int getCodigoNota() {
		return codigoNota;
	}

	public void setCodigoNota(int codigoNota) {
		this.codigoNota = codigoNota;
	}

	public String getTituloNota() {
		return tituloNota;
	}

	public void setTituloNota(String tituloNota) {
		this.tituloNota = tituloNota;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
}
