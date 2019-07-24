create table employee
(
   id INT not null,
   salary INT not null,
   hire_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   name varchar(255) not null,
   department varchar(255) not null,
   design varchar(255) not null,
   primary key(id)
);