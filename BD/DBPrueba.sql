CREATE  database PruebaDB;

USE pruebadb;

CREATE TABLE People(
	id int primary KEY,
	nombre varchar(25) NOT NULL,
    fecha_nacimiento date NOT NULL
);

INSERT INTO People
value 
(1,'Edwin Alberto','2002-07-30'),
(2,'Carlos Romo','1993-03-20'),
(3,'Luis Soto','1980-05-03');


select *
FROM People;
