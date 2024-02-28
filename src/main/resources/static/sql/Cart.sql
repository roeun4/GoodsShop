drop table scart;
create table scart(
    cart_no int auto_increment primary key,
    username varchar(50) unique,
    pno int,
    pqty int default 1,
    price int,
    cartInDate datetime not null default current_timestamp(),

	foreign key (username) references suser(username),
    foreign key (pno) references sproduct(pno)
);