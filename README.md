# AppGastos
Projeto feito no SENAC de um app de gestão de gastos e ganhos para uso pessoal em desktop, com integração com banco de dados POSTGRESQL


Script do DB

Creat DataBase GestaoDeCustos;

Create table GastosFixos(
	 IdGastosFixos serial not null,
	 GastoFixoTotal FLOAT,
	 Primary Key (IdGastosFixos)
);
Create table  OutrosGastosFixos(
	 IdOutrosGastosFixos serial not null,
	 NomeOGF varchar(20) not null,
	 ValorOGF FLOAT,
	 Primary key (IdOutrosGastosFixos)
);
Create table Ganhos(
    IdGanhos serial not null,
    NomeGanhos varchar(20),
    ValorGanhos FLOAT,
    DataGanhos varchar not null,
    Primary key (idGanhos)
);

Create table metas(
   IdMetas serial not null,
   NomeMetas varchar(20) not null,
   ValorMetas FLOAT,
   Primary key (idMetas)
);
create table Investimentos(
    idInv serial not null,
    NomeInv varchar(20) not null,
    ValorInv float,
    DataInv varchar not null,
    primary key (idInv)
);
create table gastosvariaveis (
    idgv serial not null,
    nomegv varchar(20) not null,
    valorgv  float not null,
    Datagv varchar not null,
    primary key(idgv)
);

