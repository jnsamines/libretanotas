package com.jonathansamines.libretanotas.data.connector;

/*
 * IDataConnector
 * Conector de datos. Permite realizar una conexi�n a un medio de datos determinado.
 * */
public interface IDataConnector {
	
	/*
	 * connectionTemplate
	 * Plantilla que define la estructura del connection string. 
	 **/
	String connectionTemplate = "";
	
	/*
	 * connectionString
	 * Connection string para este conector de datos.	
	 * */
	String connectionString = "";
	
	/*
	 * connector
	 * Representa la conexi�n a un medio de datos.
	 * */
	Object connector = null;
	
	
	/*
	 * getConnector
	 * Obtiene una referencia al conector de datos.
	 * */
	Object getConnector();
	
	/*
	 * openConnection
	 * Abre la conexi�n al medio de datos.
	 * */
	void openConnection();
	
	/*
	 * closeConnection
	 * Cierra la conexi�n al medio de datos.
	 * */
	void closeConnection();
	

}
