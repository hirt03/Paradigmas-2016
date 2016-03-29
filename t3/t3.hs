--1

listQuad :: [Int] -> [Int]

listQuad [] = []

listQuad (x:xs) = x^2 : listQuad xs


--2

addSr :: [String] -> [String]

addSr [] = []

addSr (x:xs) = ("Sr. " ++ x) : addSr xs

--3

count :: String ->Int

count [] = 0

count (x:xs)
   |x == ' ' = 1 + count xs
   |otherwise = count xs

--4

opera :: [Float] -> [Float]

opera [] = []

opera (x:xs) = ((3*(x^2))+2)/(x+1) : opera xs

--5

negat :: [Int] -> [Int]

negat [] = []

negat (x:xs)
   |x < 0 = x : negat xs
   |otherwise = negat xs

--6

semVogais :: String -> String

semVogais x = [ y | y <- x , not $ elem y "aeiouAEIOU"]


--7

semVogais2 :: String -> String

semVogais2 [] = []

semVogais2 (x:xs)
   |x == 'a' = semVogais2 xs
   |x == 'e' = semVogais2 xs
   |x == 'i' = semVogais2 xs
   |x == 'o' = semVogais2 xs
   |x == 'u' = semVogais2 xs
   |otherwise = x : semVogais2 xs

--8



--9

codifica :: String -> String

codifica [] = []

codifica (x:xs)
   |x == ' ' = ' ' : codifica xs
   |otherwise = '-' :codifica xs

--10

charFound :: Char -> String -> Bool

charFound y [] = False

charFound y (x:xs)
   |x == y = True
   |otherwise = charFound y xs

--11

translate :: [(Float, Float)] -> [(Float, Float)]

translate [] = []

translate (x:xs) = (fst x + 2, snd x + 2) : translate xs

--12

mult :: [Int] -> [Int] -> [Int]

mult x [] = []

mult [] y = []

mult (x:xs) (y:ys) = (x*y) : mult xs ys

--13

prod :: [Int] -> [Int] -> [Int]

prod x y = [ a*b | a <- x, b <- y]

--14

geraTabela :: Int -> [(Int, Int)]

geraTabela 0 = []

geraTabela x = aux 1 x

aux :: Int -> Int -> [(Int, Int)]

aux x y 
   | x == y + 1 = []
   |otherwise = (x, x^2) : aux (x+1) y


