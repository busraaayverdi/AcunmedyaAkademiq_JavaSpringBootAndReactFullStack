-- 1. Books tablosundaki tüm kitapları listeleyiniz
SELECT * FROM Books;

-- 2. "Bilgisayar Bilimleri" kategorisindeki kitaplar
SELECT * FROM Books
WHERE category = 'Bilgisayar Bilimleri';

-- 3. 2020 ve sonrasında yayımlanan kitaplar
SELECT * FROM Books
WHERE publication_year >= 2020;

-- 4. Her kitabın ismini ve ait olduğu kategoriyi listeleyiniz
SELECT title, category FROM Books;

-- 5. Kitap alan öğrencilerin adını, soyadını ve kitap adını listeleyiniz
SELECT Students.first_name, Students.last_name, Books.title
FROM Loans
JOIN Students ON Loans.student_id = Students.id
JOIN Books ON Loans.book_id = Books.id;

-- 6. Her kitapla ilişkili yazarı ve yayın yılını listeleyiniz
SELECT title, author, publication_year FROM Books;

-- 7. Hangi kullanıcı hangi kitabı ne zaman almış?
SELECT Students.first_name, Students.last_name, Books.title, Loans.loan_date
FROM Loans
JOIN Students ON Loans.student_id = Students.id
JOIN Books ON Loans.book_id = Books.id;

-- 8. Geri dönüş tarihi boş olan kitapların listesini ve kullanıcı bilgileri
SELECT Students.first_name, Students.last_name, Books.title
FROM Loans
JOIN Students ON Loans.student_id = Students.id
JOIN Books ON Loans.book_id = Books.id
WHERE Loans.return_date IS NULL;

-- 9. Her kategoriye ait kaç kitap olduğunu listeleyiniz
SELECT category, COUNT(*) AS total_books
FROM Books
GROUP BY category;

-- 10. En çok kitap ödünç alan kullanıcıları sıralayınız (en fazla borçtan aza)
SELECT Students.first_name, Students.last_name, COUNT(Loans.book_id) AS total_loans
FROM Loans
JOIN Students ON Loans.student_id = Students.id
GROUP BY Students.first_name, Students.last_name
ORDER BY total_loans DESC;

-- A) ALTER TABLE kullanımı
ALTER TABLE Books ADD COLUMN publisher VARCHAR(100);
ALTER TABLE Books CHANGE COLUMN publisher book_publisher VARCHAR(150);

-- B) UPDATE, DELETE kullanımı
UPDATE Books SET category = 'Yazılım Mühendisliği' WHERE category = 'Bilgisayar Bilimleri';
DELETE FROM Books WHERE publication_year < 2000;

-- C) INNER JOIN, LEFT JOIN, RIGHT JOIN, FULL JOIN örneği
-- INNER JOIN
SELECT Students.first_name, Books.title
FROM Loans
INNER JOIN Students ON Loans.student_id = Students.id
INNER JOIN Books ON Loans.book_id = Books.id;
-- LEFT JOIN
SELECT Students.first_name, Books.title
FROM Students
LEFT JOIN Loans ON Students.id = Loans.student_id
LEFT JOIN Books ON Loans.book_id = Books.id;
-- RIGHT JOIN
SELECT Students.first_name, Books.title
FROM Students
RIGHT JOIN Loans ON Students.id = Loans.student_id
RIGHT JOIN Books ON Loans.book_id = Books.id;
-- FULL JOIN (bazı veritabanları destekler)
SELECT Students.first_name, Books.title
FROM Students
FULL JOIN Loans ON Students.id = Loans.student_id
FULL JOIN Books ON Loans.book_id = Books.id;

-- D) HAVING ve GROUP BY birlikte kullanımı
SELECT category, COUNT(*) AS book_count
FROM Books
GROUP BY category
HAVING book_count > 5;

-- E) LIMIT, OFFSET kullanımı
SELECT * FROM Books ORDER BY publication_year DESC LIMIT 5;
SELECT * FROM Books ORDER BY publication_year DESC LIMIT 5 OFFSET 10;

-- F) SUBQUERY örneği
SELECT * FROM Books
WHERE publication_year = (SELECT MIN(publication_year) FROM Books);

-- G) AND / OR mantıksal operatörleri
SELECT * FROM Books
WHERE category = 'Bilgisayar Bilimleri' AND publication_year >= 2015;

-- H) BETWEEN kullanımı
SELECT * FROM Books
WHERE publication_year BETWEEN 2020 AND 2023;

-- I) IN ifadesiyle çoklu karşılaştırma
SELECT * FROM Books
WHERE category IN ('Bilgisayar Bilimleri', 'Mühendislik', 'Veri Bilimi');

--J) LIKE operatörü kullanımı
SELECT * FROM Books WHERE title LIKE 'SQL%';
SELECT * FROM Books WHERE title LIKE '%Veritabanı%';
SELECT * FROM Books WHERE title LIKE '_QL%';
