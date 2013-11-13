package com.jonathansamines.libretanotas.data.models;

import java.util.ArrayList;
import java.util.List;

import com.jonathansamines.libretanotas.data.models.Nota;

public class Libreta {
	
	private int codigoLibreta;
	
	private String nombreLibreta;
	
	private String descripcion;
	
	private ArrayList<Nota> notas;
	
	public Libreta( int codigoLibreta, String nombreLibreta ){
		this.codigoLibreta = codigoLibreta;
		this.nombreLibreta = nombreLibreta;
	}
	
	public int getCodigoLibreta() {
		return codigoLibreta;
	}

	public void setCodigoLibreta(int codigoLibreta) {
		this.codigoLibreta = codigoLibreta;
	}

	public String getNombreLibreta() {
		return nombreLibreta;
	}

	public void setNombreLibreta(String nombreLibreta) {
		this.nombreLibreta = nombreLibreta;
	}

	public List<Nota> getNotas() {
		return notas;
	}
	
	
	public void setDescripcion( String descripcion ){
		this.descripcion = descripcion;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	
}
