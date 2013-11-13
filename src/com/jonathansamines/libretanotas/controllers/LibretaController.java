package com.jonathansamines.libretanotas.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jonathansamines.libretanotas.data.connector.IDataConnector;
import com.jonathansamines.libretanotas.data.connector.IDataQuery;
import com.jonathansamines.libretanotas.data.connector.SqlDataConnector;
import com.jonathansamines.libretanotas.data.connector.SqlDataQuery;

import com.jonathansamines.libretanotas.data.models.Libreta;
import com.jonathansamines.libretanotas.data.models.Nota;

public class LibretaController{

	private IDataConnector connector;
	
	private IDataQuery query;
	
	public LibretaController( SqlDataConnector connector ){		
		this.connector = connector;
		this.query = new SqlDataQuery( (SqlDataConnector)this.connector );
	}
	
	public ArrayList<Libreta> obtenerLibretasDeNotas( ){
		ArrayList<Libreta> libretas = new ArrayList<Libreta>();
		ResultSet resultado = this.query.executeQuery("SELECT * FROM LIBRETA");
		
		try {
			while( resultado.next()){
				Libreta libreta = new Libreta( resultado.getInt("CodigoLibreta"), resultado.getString("NombreLibreta") );
				libreta.setDescripcion( resultado.getString("Descripcion"));
				libretas.add(libreta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libretas;
	}
	
	public ArrayList<Nota> obtenerNotasLibreta( Libreta libreta ){
		ArrayList<Nota> notas = new ArrayList<Nota>();
		ResultSet resultado = this.query.executeQuery( 
								String.format("SELECT * FROM NOTA WHERE CodigoLibreta = %s", 
								libreta.getCodigoLibreta()));
		
		try{
			
			while( resultado.next() ){
				
				Nota nota = new Nota( 
								resultado.getString("TituloNota"), 
								resultado.getString("Contenido"),
								resultado.getDate("FechaCreacion"),
								resultado.getDate("FechaModificacion"));
				notas.add(nota);
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return notas;
	}
	

}
