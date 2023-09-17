CREATE TABLE FT_LEAGUE (
    ID_LEAGUE VARCHAR(40) NOT NULL,
    NAME VARCHAR(100) NOT NULL,
    COUNTRY VARCHAR(50) NOT NULL,
    CATEGORY INT NOT NULL,
    LVL FLOAT(1),
    CONSTRAINT PK_LEAGUE PRIMARY KEY (ID_LEAGUE)
);