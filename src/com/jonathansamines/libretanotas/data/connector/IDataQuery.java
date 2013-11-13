package com.jonathansamines.libretanotas.data.connector;

import java.sql.ResultSet;

/*
 * IDataQuery
 * Define los métodos necesarios para realizar consultas.
 * */
public interface IDataQuery{
	
	/*
	 * executeQuery
	 * Ejecuta una consulta generica sobre el medio de datos, devolviendo un objeto del tipo ResultSet
	 * */
	ResultSet executeQuery( String query );
	
}
