
CREATE TABLE Libreta(
	CodigoLibreta int(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	NombreLibreta nvarchar(50) NOT NULL,
	Descripcion nvarchar(50) NULL
) DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci ENGINE = InnoDB


CREATE TABLE Nota(
	CodigoNota int(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	TituloNota nvarchar(100) NOT NULL,
	FechaCreacion date NOT NULL,
	FechaModificacon date NULL,
	Contenido nvarchar(10000) NULL,
	CodigoLibreta int(5) NOT NULL,
	FOREIGN KEY ( CodigoLibreta ) REFERENCES Libreta( CodigoLibreta) ON DELETE CASCADE
) DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci ENGINE = InnoDB










