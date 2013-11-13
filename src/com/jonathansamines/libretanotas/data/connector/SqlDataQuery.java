package com.jonathansamines.libretanotas.data.connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * SqlDataQuery
 * Entidad para realizar consultas a un servidor de SQL.
 * */
public class SqlDataQuery implements IDataQuery{

	/*
	 * connector
	 * Conector de datos para SQL.
	 * */
	private SqlDataConnector connector;
	
	/*
	 * statement
	 * Sentencia para realizar consultas.
	 * */
	private Statement statement;
	
	/*
	 * SqlDataQuery
	 * Inicializa una nueva instancia de la clase de consultas.
	 * @param connector = Conector de datos a SQL.
	 * */
	public SqlDataQuery( SqlDataConnector connector ){
		this.connector = connector;
	}
	
	/*
	 * executeQuery
	 * Ejecuta una consulta al servidor SQL. Devuelve una referencia al objeto ResultSet resultante.
	 * @param query = Consulta SQL a realizar.
	 * */
	public ResultSet executeQuery(String query) {	
		ResultSet result = null;
		try {
			this.statement = this.connector.getConnector().createStatement();
			result = this.statement.executeQuery( query );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
