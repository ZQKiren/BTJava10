CREATE DATABASE quanlysach;
USE quanlysach;

CREATE TABLE tacgia(
	id int auto_increment,
	tentacgia varchar(100) not null,
	quoctich varchar(50),
	
	primary key(id)
);

CREATE TABLE sach(
	id int auto_increment,
	tieude varchar(200) not null,
	namxuatban int,
	id_tacgia int,
	
	primary key(id)
);

ALTER TABLE sach ADD CONSTRAINT FK_id_tacgia_sach FOREIGN KEY(id_tacgia) REFERENCES tacgia(id);

INSERT INTO tacgia(tentacgia,quoctich) VALUES ('Nguyễn Nhật Ánh', 'Việt Nam'),
											  ('Haruki Murakami', 'Nhật Bản'),
											  ('J.K. Rowling', 'Anh');

INSERT INTO sach(tieude,namxuatban,id_tacgia) VALUES ('Mắt Biếc', 1990, 1),
											  ('Tôi thấy hoa vàng trên cỏ xanh', 2005, 1),
											  ('Rừng Na Uy', 1987, 2),
											  ('Harry Potter và Hòn đá Phù thủy', 1997, 3);

//1
SELECT *
FROM sach;

//2
SELECT *
FROM tacgia
WHERE quoctich = 'Việt Nam';

//3
SELECT tentacgia,tieude
FROM tacgia t
JOIN sach s ON s.id_tacgia = t.id;

//4
SELECT *
FROM sach
WHERE namxuatban > 1990;

//5
SELECT tentacgia, COUNT(*) soluongsach
FROM tacgia t
JOIN sach s ON s.id_tacgia = t.id
GROUP BY tentacgia;

//6
SELECT tentacgia, COUNT(*) soluongsach
FROM tacgia t
JOIN sach s ON s.id_tacgia = t.id
GROUP BY tentacgia
ORDER BY soluongsach DESC
LIMIT 1;

