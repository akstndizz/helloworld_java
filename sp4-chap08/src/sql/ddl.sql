create user 'spring4'@'localhost' identified by 'spring4';
create database spring4fs character set=utf8;
grant all privileges on spring4fs.* to 'spring4'@'localhost';
create table spring4fs.MEMBER(
	ID int auto_increment primary key,
    EMAIL varchar(255),
    PASSWORD varchar(100),
    NAME varchar(100),
    REGDATE datetime,
    unique key(EMAIL)
    )engine=InnoDB char set=utf8;
    
    insert into spring4fs.MEMBER (EMAIL,PASSWORD,NAME,REGDATE) values ('test@test.net','1234','kws',now());
    
    create table ranmat.letter(
   no int auto_increment primary key,
    title text,
    content text,
    writer text,
    reader text,
    created_at datetime);
    
INSERT INTO ranmat.letter(title, content, writer, reader, created_at) VALUES('테스트데이터01', '테스트데이터01', 'akstndizz', 'kws', NOW());
INSERT INTO ranmat.letter(title, content, writer, reader, created_at) VALUES('테스트데이터03', '테스트데이터03', 'pch', 'akstndizz', NOW());
INSERT INTO ranmat.letter(title, content, writer, reader, created_at) VALUES('테스트데이터04', '테스트데이터04', 'akstndizz', 'kws', NOW());
INSERT INTO ranmat.letter(title, content, writer, reader, created_at) VALUES('테스트데이터05', '테스트데이터05', 'pch', 'akstndizz', NOW());
INSERT INTO ranmat.letter(title, content, writer, reader, created_at) VALUES('테스트데이터06', '테스트데이터06', 'akstndizz', 'akstndizz', NOW());

alter table ranmat.lerrer modify reader varchar(20);
ALTER TABLE ranmat.letter add foreign key (reader) references ranmat.join(user_id) on update cascade on delete set null;