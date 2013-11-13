package com.jonathansamines.libretanotas.data.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * SqlDataConnector
 * Conector de datos para SQL.
 * */
public class SqlDataConnector implements IDataConnector {

	/*
	 * connectionTemplate
	 * Plantilla base para una cadena de conexión a sql.
	 * */
	protected final static String connectionTemplate = "jdbc:mysql://%s/%s?user=%s&password=%s";
	
	
	/*
	 * connectionString
	 * Cadena de conexión al servidor sql.
	 * */
	protected String connectionString;
	
	/*
	 * connector
	 * Connector de datos a sql.
	 * */
	protected Connection connector;
	
	/*
	 * SqlDataConnector
	 * Inicializa una nueva instancia del conector de datos para SQL.
	 * @param server = Servidor de datos
	 * @param user = Usuario de conexión.
	 * @param password = Contraseña de acceso
	 * @parama database = base de datos por defecto.
	 * */
	public SqlDataConnector ( String server, String user, String password, String database ){
		this( String.format( connectionTemplate, server, database, user, password) );
	}
	
	/*
	 * SqlDataConnector
	 * Inicializa una nueva instancia del conector de datos a SQL.
	 * @param connectionString = Cadena de conexión a datos.
	 * */
	public SqlDataConnector( String connectionString ){
		this.connectionString = connectionString;
		
		// Obtiene una instancia de conexión al servidor de datos.
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connector = DriverManager.getConnection(this.connectionString);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	/*
	 * getConnector
	 * Obtiene una referencia al conector de datos SQL.
	 * */
	@Override
	public Connection getConnector() {
		return this.connector;
	}

	/*
	 * openConnection
	 * */
	@Override
	public void openConnection() {
		
	}

	/*
	 * closeConnection
	 * Cierra la instancia de conexión a datos.
	 * */
	@Override
	public void closeConnection() {
		try {
			this.connector.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
