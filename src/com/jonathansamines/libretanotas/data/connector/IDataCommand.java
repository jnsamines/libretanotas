package com.jonathansamines.libretanotas.data.connector;

/*
 * IDataCommand
 * Define los metodos necesarios para ejecutar comandos sobre sql.
 * */
public interface IDataCommand {

	/*
	 * executeCommand
	 * Ejecuta una sentencia idempotente.
	 * */
	int executeCommand( String command );
	
}
