create table notice(
    no int auto_increment primary key,
    writer varchar(20) not null,
    title varchar(40) not null,
    content varchar(2000) not null,
    InDate datetime not null default current_timestamp(),

	foreign key (writer) references sadmin(name)
);