--1

addSuffix :: String -> [String] -> [String]

addSuffix x y = [a ++ x | a <- y]

--2

countShorts :: [String] -> Int

countShorts [] = 0

countShorts (x:xs) = if length x < 5 then 1 + countShorts xs else countShorts xs

--3

--4

ciclo :: Int -> [Int] -> [Int]

ciclo x y = if x == 1 then y else y++ciclo (x-1) y

--5

numera :: [String] -> [(Int, String)]

numera x = aux 1 x

aux :: Int -> [String] -> [(Int, String)]

aux x [] = []

aux x (y:ys) = (x, y) : aux (x+1) ys

--6

--a : [(2,3), (2,5), (4,5)]
--b : ["lazyfrog", "lazydog", "bigfrog", "bigdog"]
--c : "p-r-l-l-p-p-d-"


