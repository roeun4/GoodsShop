create table c_category(
    cnum int not null auto_increment,
    code varchar(10) not null,
    cname varchar(20) not null,
    primary key(cnum)
);

select * from c_category;