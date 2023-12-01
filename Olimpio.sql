create database olimpio;
use olimpio;

create table Login(
id_login int primary key auto_increment not null,
usuario varchar(155) not null,
senha varchar(55) not null
);

CREATE TABLE Deuses (
    id_deuses int(255) primary key not null auto_increment,
    nome_deuses varchar(55) not null,
    descricao_deuses varchar(100) not null,
    poder varchar(100) not null
);

CREATE TABLE Herois (
    id_herois  int(255) primary key not null auto_increment,
	nome_herois varchar(55) not null,
    descricao_herois varchar(100) not null,
    poder varchar(100) not null
);

CREATE TABLE Monstros (
    id_monstros  int(255) primary key not null auto_increment,
	nome_monstro varchar(55) not null,
    descricao_monstro varchar(100) not null,
    especie varchar(100) not null
);

CREATE TABLE Titas (
	id_titans int(255) primary key not null auto_increment,
	nome_titans varchar(55) not null,
    descricao_titans varchar(100) not null,
    poderes_titan varchar(255) not null
);

CREATE TABLE Mitos (
    id_mito int(255) primary key not null auto_increment,
    titulo_mito varchar(255) not null,
    descricao_mitos varchar(255) not null,
    deuses_envolvidos varchar(255) not null,
    herois_envolvidos varchar(255) not null
);

INSERT INTO Login (usuario, senha) VALUES ('marcos', 'marcos1234@#');

INSERT INTO Deuses (nome_deuses, descricao_deuses, poder) VALUES
('Zeus', 'Rei dos deuses', 'Trovoada e relâmpagos'),
('Atena', 'Deusa da sabedoria', 'Guerra estratégica e artesanato'),
('Poseidon', 'Deus do mar', 'Terremotos e cavalos');

INSERT INTO Herois (nome_herois, descricao_herois, poder) VALUES
('Hércules', 'Filho de Zeus', 'Força sobre-humana'),
('Aquiles', 'Herói grego da Guerra de Troia', 'Invulnerabilidade exceto no calcanhar'),
('Perseu', 'Matador de Medusa', 'Sandálias aladas e capa de invisibilidade');

INSERT INTO Monstros (nome_monstro, descricao_monstro, especie) VALUES
('Cérbero', 'Cão de três cabeças guardião do Submundo', 'Criatura mítica'),
('Medusa', 'Górgona com serpentes no cabelo', 'Monstro'),
('Minotauro', 'Metade humano, metade touro', 'Criatura mítica');

INSERT INTO Titas (nome_titans, descricao_titans, poderes_titan) VALUES
('Cronos', 'Líder dos Titãs', 'Controle sobre o tempo'),
('Réia', 'Titã associada à fertilidade', 'Mãe dos deuses'),
('Atlas', 'Titã condenado a sustentar o céu', 'Resistência e força');


INSERT INTO Mitos (titulo_mito, descricao_mitos, deuses_envolvidos, herois_envolvidos) VALUES
('Criação do Mundo', 'O mito da criação', 'Zeus, Poseidon, Atena', 'Hércules, Perseu'),
('Guerra de Troia', 'Conflito épico entre gregos e troianos', 'Zeus, Hera, Apolo', 'Aquiles, Heitor');
