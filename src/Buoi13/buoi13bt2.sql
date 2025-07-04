CREATE DATABASE cybersoft_shop;
USE cybersoft_shop;

CREATE TABLE loaisanpham(
	id int auto_increment,
	tenloaisp varchar(255),
	
	primary key(id)
);

CREATE TABLE sanpham(
	id int auto_increment,
	tensp varchar(255),
	mota text,
	gia int,
	id_loaisanpham int,
	
	primary key(id)
);

CREATE TABLE khachhang(
	id int auto_increment,
	ho varchar(255),
	ten varchar(255),
	sdt char(11),
	diachi varchar(255),
	email char(255),
	
	primary key(id)
);

CREATE TABLE hoadon(
	id int auto_increment,
	ngaymua date,
	id_khachhang int,
	
	primary key(id)
);

CREATE TABLE chitiethoadon(
	id_hoadon int,
	id_sanpham int,
	soluong int,
	giaban int
);

ALTER TABLE sanpham ADD CONSTRAINT FK_id_loaisanpham_sanpham FOREIGN KEY(id_loaisanpham) REFERENCES loaisanpham(id);
ALTER TABLE hoadon ADD CONSTRAINT FK_id_khachhang_hoadon FOREIGN KEY(id_khachhang) REFERENCES khachhang(id);
ALTER TABLE chitiethoadon ADD CONSTRAINT FK_id_sanpham_chitiethoadon FOREIGN KEY(id_sanpham) REFERENCES sanpham(id);
ALTER TABLE chitiethoadon ADD CONSTRAINT FK_id_hoadon_chitiethoadon FOREIGN KEY(id_hoadon) REFERENCES hoadon(id);

