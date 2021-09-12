create table Funcionario(
  cpf varchar(11) primary key not null,
  nome_func varchar(50) not null,
  email varchar(80) not null,
  senha varchar(50) not null
);

insert into Funcionario values ('523685268', 'Rosimeire', 'rosimeiremantovani@hotmail.com', 'rosimeire123');

create table Produto(
  idProduto serial primary key not null,
  valor_produto numeric(5,2) not null,
  nome_produto varchar(80) not null
);

create table Pedido(
  idPedido serial primary key not null,
  nome_cliente varchar(50) not null,
  cpf_func varchar(11) not null,
  constraint fk_cpf_func foreign key(cpf_func) references Funcionario(cpf)
);


create table Produto_Pedido(
  id_produto int not null,
  id_pedido int not null,
  qtd int not null,
  constraint fk_pedido foreign key(id_pedido) references Pedido(idPedido),
  constraint fk_prod foreign key(id_produto) references Produto(idProduto)
);

create table Gasto(
  id_gasto serial primary key not null,
  cpf_funcionario varchar(11) not null,
  valor_gasto numeric(5,2) not null,
  descricao_gasto varchar(1000) not null,
  dia_gasto varchar(10),
  constraint fk_funcionarioGasto foreign key(cpf_funcionario) references Funcionario(cpf)
);

drop table Produto_Pedido;
drop table Gasto;
drop table Pedido;
drop table Produto;
drop table Funcionario;

select * from Produto;
select * from funcionario;
select * from pedido;
select * from Produto_pedido;
select * from gasto;

/*
delete from Produto_pedido;
delete from Pedido;
*/
select * from pedido p inner join produto_pedido pp on (p.idPedido = pp.id_pedido) where p.nome_cliente like 'd%';