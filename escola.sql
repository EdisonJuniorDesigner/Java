create database escola;
use escola;
drop table aluno;
	create table aluno
(
	id INT not null primary key,
    Nome VARCHAR(40) not null,
    CPF VARCHAR(14) not null unique
);

select * from aluno;