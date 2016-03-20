--1

somaQuad :: Int -> Int -> Int

somaQuad x y = (x*x) + (y*y)

--2

hasEqHeads :: [Int] -> [Int] -> Bool

hasEqHeads x y = if head x == head y then True else False

--3

addSr :: [String] -> [String]

addSr x = map("Sr. " ++)x

--4

cont :: String -> Int

cont x = length (filter(==' ')x)

--5

func :: [Double] -> [Double]

func x = map (\x -> (((3*x)^2) + 2)/(x + 1)) x

--6

negativos :: [Int] -> [Int]

negativos x = filter (<0) x

--7

filtCem :: [Int]->[Int]

filtCem x = filter(\x -> x >= 1 && x <= 100) x

--8

idade :: [Int] -> [Int]

idade x = filter (>(2016-1970)) x

--9

par :: [Int] -> [Int]

par x = filter even x

--10

charFound :: Char -> String -> Bool

charFound x y = any (==x) y

--11

--sum (takeWhile(<10000)(filter odd(map(^2)[1..])))

-- O objetivo do exemplo � calcular todos os n�meros quadrados �mpares menores que 10000.
-- Primeiramente, a fun��o mapeia todos os n�meros quadrados em uma lista, ap�s isso filtra os �mpares e pega todos os valores que s�o menores de 10000.


--12

filtA :: [String] -> [String]

filtA [] = []

filtA x = if (last (takeWhile(/= ' ')(head x)))=='a' then (head x) : filtA(tail x) else filtA(tail x)

