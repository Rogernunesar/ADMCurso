xampp\mysql\bin 
mysql -h localhost -u root

CREATE DATABASE ADMCURSOS;
USE ADMCURSOS;

CREATE TABLE CURSOS(
idCurso        INT NOT NULL,
nomeCurso      VARCHAR(40),
requistoBasic  VARCHAR(60),
cargaHoraria   SMALLINT,
precoCurso     DOUBLE,
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
idTurmas      INT NOT NULL,
tur_idProf    INT NOT NULL,
tur_idCurso   INT NOT NULL,
dataInicio    DATE NULL,
dataFinal     DATE NULL,
cargaHora     SMALLINT,
CONSTRAINT PK_IDTURMAS PRIMARY KEY (idTurmas),
INDEX TURMAS_FKINDEX1(tur_idCurso),
INDEX TURMAS_FKINDEX2(tur_idProf),
FOREIGN KEY (tur_idCurso)
REFERENCES CURSOS (idCurso)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
FOREIGN KEY (tur_idProf)
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
 idMatriculas         INT NOT NULL ,
 mat_idTurmas         INT NOT NULL,
 mat_idAluno          INT NOT NULL,
 data_Matricula       DATE,
 nascAluno            VARCHAR (12)NULL,
 nomeProfessor        VARCHAR (40)NULL,
 nomeCurso            VARCHAR (40)NULL,
 inicioCurso          DATE,
 CONSTRAINT Pk_IDMATRICULAS PRIMARY KEY (idMatriculas),
 INDEX MATRICULAS_FKINDEX1(mat_idTurmas),
 INDEX MATRICULAS_FKINDEX2(mat_idAluno),
 FOREIGN KEY (mat_idTurmas)
 REFERENCES TURMAS(idTurmas)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
 FOREIGN KEY (mat_idAluno)
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
