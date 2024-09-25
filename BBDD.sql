create database gestion_inventario;
use gestion_inventario;

create table product(
id int primary key auto_increment not null,
name varchar (100) not null,
price double not null,
description text
);