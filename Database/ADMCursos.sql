xampp\mysql\bin 
mysql -h localhost -u root

CREATE DATABASE CURSOSADM;
USE CURSOSADM;



CREATE TABLE CURSOS(
idCurso       INT NOT NULL,
nomeCurso     VARCHAR(40),
requistoBasic VARCHAR(60),
cargaHoraria  SMALLINT,
precoCurso    DOUBLE,
CONSTRAINT PK_IDCURSO  PRIMARY KEY(idCurso)
); 

CREATE TABLE PROFESSORES(
idProf        INT NOT NULL,
nomeProf      VARCHAR (40),
emailProf     VARCHAR (40),
valorHora     VARCHAR (15),
formacao      VARCHAR (40),
CONSTRAINT PK_IDPROF PRIMARY KEY (idProf)
);


CREATE TABLE TURMAS(
idTurmas     INT NOT NULL,
tur_idProf       INT NOT NULL,
tur_idCurso      INT NOT NULL,
dataInicio   DATE NULL,
dataFinal    DATE NULL,
cargaHora   SMALLINT,
CONSTRAINT PK_IDTURMAS PRIMARY KEY (idTurmas),
INDEX TURMAS_FKINDEX1(idCurso),
INDEX TURMAS_FKINDEX2(idProf),
FOREIGN KEY (idCurso)
REFERENCES CURSOS (idCurso)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
FOREIGN KEY (idProf)
REFERENCES PROFESSORES (idProf)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  );

 CREATE TABLE ALUNOS(
 idAluno      INT NOT NULL,
 nomeAluno    VARCHAR(50),
 emailAluno   VARCHAR(50),
 foneAluno    CHAR(14),
 nascAluno    DATE,
 CONSTRAINT PK_IDALUNO PRIMARY KEY (idAluno));

 CREATE TABLE MATRICULAS(
 idMatriculas     INT NOT NULL ,
 idTurmas         INT NOT NULL,
 idAluno          INT NOT NULL,
 CONSTRAINT Pk_IDMATRICULAS PRIMARY KEY (idMatriculas),
 INDEX MATRICULAS_FKINDEX1(idTurmas),
 INDEX MATRICULAS_FKINDEX2(idAluno),
 FOREIGN KEY (idTurmas)
 REFERENCES TURMAS(idTurmas)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
 FOREIGN KEY (idAluno)
 REFERENCES ALUNOS(idAluno)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
);

CREATE TABLE usuario(
idUse     INT NOT NULL AUTO_INCREMENT,
nomeUse   VARCHAR(40) NOT NULL,
senhaUse  VARCHAR(40) NOT NULL,
CONSTRAINT PK_IDUSE PRIMARY KEY (idUse));

ALTER TABLE usuario ADD tipoUser VARCHAR(20) NULL;

show tables;

SELECT a.nomeTurmas, a.dataInicio, a.dataFinal, a.cargaHora, b.nomeProf, c.nomeCurso
FROM turmas a
INNER JOIN professores b INNER JOIN cursos c
ON a.tur_idProf = b.idProf 
AND a.tur_idCurso= c.idCurso
ORDER BY nomeTurmas;
