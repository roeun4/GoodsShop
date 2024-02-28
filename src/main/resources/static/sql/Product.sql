drop table sproduct;
create table sproduct(
    pno int not null auto_increment, -- 상품 번호
    pname varchar(100) not null, -- 상품 이름
    pcate_fk varchar(20), -- 상품 카테고리 not null
	pimage varchar(200), -- 상품 이미지
    pcompany varchar(50),  	-- 제조회사
    delivery int not null default 0, -- 배송비
    price int not null default 0, -- 가격
	pspec varchar(20),         -- 상품사양(인기, 추천, 신규, 일반)
    pcontent varchar(300),     -- 상품상세
    in_date datetime not null default current_timestamp(),
    primary key(pno)
);
select*from sproduct;