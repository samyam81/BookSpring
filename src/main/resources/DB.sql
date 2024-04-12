create table BOOK(
    Title VARCHAR(50),
    detail VARCHAR(20),
    Pages INT,
    Languages VARCHAR(50),
    Genre VARCHAR(20),
    BOOKID INT Primary key 
);

create table Library(
    Name VARCHAR(50),
    TotalCapacity INT,
    Location VARCHAR(50),
    LibraryID INT Primary key
);

create table Libraryhall(
    Name VARCHAR(50),
    TotalSeats INT,
    HallID INT Primary key
);

CREATE TABLE reading (
    createdON DATE,
    Shift CHAR(1) PRIMARY KEY
);

CREATE TABLE ShowSeat (
    SeatNo INT PRIMARY KEY,
    Reserved BOOLEAN,
    Price INT,
    Shift CHAR(1), 
    FOREIGN KEY (Shift) REFERENCES reading(Shift) 
);

