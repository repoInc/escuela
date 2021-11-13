CREATE TABLE IF NOT EXISTS cursos (
  id BIGINT NULL PRIMARY KEY,
  curso VARCHAR(50) NOT NULL,
  modalidad VARCHAR(50) NOT NULL,
  seccion VARCHAR(50) NOT NULL,
  jornada VARCHAR(50) NOT NULL
) ;

CREATE TABLE IF NOT EXISTS fichaEstudiantes (
  id BIGINT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  direccion VARCHAR(50) NOT NULL,
  fechaNacimiento TIMESTAMP(6) NOT NULL,
  sexo VARCHAR(50) NOT NULL,
  padre VARCHAR(50) NOT NULL,
  madre VARCHAR(50) NOT NULL,
  fechaMatricula TIMESTAMP(6) NOT NULL,
  fk_cursos VARCHAR(50) NOT NULL REFERENCES cursos(id)
) ;

CREATE TABLE IF NOT EXISTS maestros (
  id BIGINT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  direccion VARCHAR(50) NOT NULL,
  telefono VARCHAR(12) NOT NULL,
  mail VARCHAR(50) NOT NULL
) ;

CREATE TABLE IF NOT EXISTS materias (
  id BIGINT PRIMARY KEY,
  materia VARCHAR(50) NOT NULL,
  fk_cursos BIGINT NOT NULL REFERENCES cursos(id),
  fk_maestros BIGINT NOT NULL REFERENCES maestros(id)
) ;

CREATE TABLE IF NOT EXISTS notas (
  anio BIGINT(4) NOT NULL,
  fk_estudiantes BIGINT NOT NULL,
  fk_cursos BIGINT NOT NULL,
  fk_materias BIGINT NOT NULL,
  PRIMARY KEY (anio, fk_estudiantes, fk_cursos, fk_materias),
  examen_1 FLOAT NOT NULL,
  examen_2 FLOAT NOT NULL,
  examen_3 FLOAT NOT NULL,
  examen_4 FLOAT NOT NULL,
  promedio FLOAT NOT NULL,
  recuperacion_1 FLOAT NOT NULL,
  recuperacion_2 FLOAT NOT NULL
 ) ;

 CREATE TABLE IF NOT EXISTS conceptoPagos (
   id BIGINT PRIMARY KEY,
   concepto VARCHAR NOT NULL,
   precio FLOAT NOT NULL
 );

  CREATE TABLE IF NOT EXISTS empleados (
  id BIGINT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  direccion VARCHAR(50) NOT NULL,
  telefono VARCHAR(50) NOT NULL,
  mail VARCHAR(50) NOT NULL
  );

  CREATE TABLE IF NOT EXISTS jornadas (
    id BIGINT PRIMARY KEY,
    jornada VARCHAR NOT NULL
  );

  CREATE TABLE IF NOT EXISTS proveedores (
    id BIGINT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    telefono VARCHAR(12) NOT NULL
  );

  CREATE TABLE IF NOT EXISTS productos (
    id BIGINT PRIMARY KEY,
    producto VARCHAR(50) NOT NULL,
    precioCosto FLOAT NOT NULL,
    utilidad FLOAT NOT NULL,
    precioVenta FLOAT NOT NULL,
    fk_proveedores BIGINT NOT NULL REFERENCES proveedores(id)
  );

  CREATE TABLE IF NOT EXISTS ventas (
    id BIGINT PRIMARY KEY,
    fechaVenta TIMESTAMP(6) NOT NULL,
    fk_empleados BIGINT NOT NULL REFERENCES empleados(id),
    fk_fichaEstudiantes BIGINT NOT NULL REFERENCES fichaEstudiantes(id)
  );

CREATE TABLE IF NOT EXISTS cobros (
   id BIGINT PRIMARY KEY,
   fechaCobro TIMESTAMP(6) NOT NULL,
   precio FLOAT NOT NULL,
   cantidad INTEGER NOT NULL,
   total FLOAT NOT NULL,
   fk_fichaEstudiantes BIGINT NOT NULL REFERENCES fichaEstudiantes(id),
   fk_conceptoPagos BIGINT NOT NULL REFERENCES conceptoPagos(id),
   fk_jornadas BIGINT NOT NULL REFERENCES jornadas(id),
   fk_empleados BIGINT NOT NULL REFERENCES empleados(id)
 );