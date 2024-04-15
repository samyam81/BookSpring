-- Inserting values into the BOOK table
INSERT INTO BOOK (Title, detail, Pages, Languages, Genre, BOOKID) VALUES
('The Great Gatsby', 'Classic novel', 200, 'English', 'Fiction', 1),
('To Kill a Mockingbird', 'Classic novel', 300, 'English', 'Fiction', 2),
('Harry Potter and the Sorcerer''s Stone', 'Fantasy novel', 400, 'English', 'Fantasy', 3);

-- Inserting values into the Library table
INSERT INTO Library (Name, TotalCapacity, Location, LibraryID) VALUES
('Central Library', 500, 'New York', 1),
('City Library', 300, 'Los Angeles', 2),
('Town Library', 200, 'Chicago', 3);

-- Inserting values into the Libraryhall table
INSERT INTO Libraryhall (Name, TotalSeats, HallID) VALUES
('Main Hall', 200, 1),
('Conference Hall', 100, 2),
('Small Hall', 50, 3);

-- Inserting values into the reading table
INSERT INTO reading (createdON, Shift) VALUES
('2024-04-15', '1'),
('2024-04-16', '2'),
('2024-04-17', '3');

-- Inserting values into the ShowSeat table
INSERT INTO ShowSeat (SeatNo, Reserved, Price, Shift) VALUES
(1, false, 10, '1'),
(2, true, 10, '1'),
(3, false, 10, '1'),
(4, true, 10, '2'),
(5, true, 10, '2'),
(6, false, 10, '3');
