create table suser(
    no int not null auto_increment,
    username varchar(50) not null,
    password varchar(100) not null,
    name varchar(20) not null,
    dob int not null,
    email varchar(200) not null,
    tel int not null,
    in_date datetime not null default current_timestamp(),
    primary key(user_no)
);
