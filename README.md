# PRUEBA3PROGRA2
3era Evaluacion Java Web


```
create table usuarios(
	usuario_id int(10) primary key not null auto_increment,
	usuario varchar(25),
	clave varchar(25),
	fecha_nacimiento date,
	estado varchar(25));

insert into usuarios (usuario, clave, fecha_nacimiento, estado) values ('Fed54' , '1337' , '1992-06-02', 'activo');	
insert into usuarios (usuario, clave, fecha_nacimiento, estado) values ('Ray21' , '5312' , '1978-10-01', 'activo');		

create table autores(
	autor_id int(10) primary key not null auto_increment,
	nombre varchar(25),
	apepat varchar(25),
	apemat varchar(25),
	fecha_nacimiento dare,
	estado varchar(25)


);	

insert into autores (nombre, apepat, apemat, fecha_nacimiento, estado) values ('Colleen' , 'McCullough', 'Williams' , '1937-03-02', 'activo'); 
insert into autores (nombre, apepat, apemat, fecha_nacimiento, estado) values ('Timothy' , 'Zahn', 'Indiana' , '1968-11-21', 'activo'); 



create table editoriales(
	editorial_id int(10) primary key not null auto_increment,
	nombre varchar(25),
	fecha_creacion date,
	estado varchar(25)

);

insert into editoriales (nombre, fecha_creacion, estado) values ('Booket', '2001-05-02' , 'activo');
insert into editoriales (nombre, fecha_creacion, estado) values ('Del Rey', '2005-12-11' , 'activo'); 

create table libros(
    libro_id int(10) primary key not null auto_increment,
    nombre varchar(25),
	fecha_creacion date,
	estado varchar(25),
    autor_id int(10),
    editorial_id int(10),
    usuario varchar(25)	


);

insert into libros (nombre, fecha_creacion, estado, autor_id, editorial_id, usuario) values ('Grass Crown' , '1998-02-12' , 'activo' , 1 , 1 , 'aa');


select libros.nombre, libros.fecha_creacion, libros.autor_id, libros.editorial_id, usuarios.usuario from libros join usuarios ON usuarios.usuario_id=libros.libro_id;


create table ciudades (
	ciudad_id int(10) primary key not null auto_increment,
	nombre varchar(50),
	estado varchar(50),
	creado_por varchar(50),
	pais_id int(10)
	);

create table paises (
	pais_id int(10) primary key not null auto_increment,
	nombre varchar(50),
	creado_por varchar(50),
	estado varchar(50)
);	



```
