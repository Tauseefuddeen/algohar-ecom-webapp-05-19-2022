create database if not exists ecomwebapp;
use ecomwebapp;

create table customer_data( id int(11) NOT NULL AUTO_INCREMENT, 
name varchar(150) ,balance decimal(10,2), address varchar(200),
primary key(`id`) );

insert into product_data(id,name,balance,address) values (1,'John Smith',1000.23, 'Delhi India');
insert into product_data(id,name,price,description) values (2,'Mike Smith',9000.23, 'Mumbai India');
insert into product_data(id,name,price,description) values (3,'Sir Ratan Tata',9100.23, 'Gujrat India');
insert into product_data(id,name,price,description) values (4,'Tauseef Uddeen',1230.23, 'Nagpur India');

SELECT * FROM ecomwebapp.product_data;

