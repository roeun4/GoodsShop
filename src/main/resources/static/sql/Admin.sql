create table samdin(
    ano int not null auto_increment primary key,
    aid varchar(50) not null,
    apassword varchar(100) not null,
    name varchar(20) not null

    primary key(ano),
    unique(name)
);

insert into sadmin values('admin', '1234', '관리자');