module Main where

main :: IO ()
main = do
    let mul (i,x) = x * i
    let calc xs = foldl (+) 0 (map mul (zip [0..] xs))
    print (calc [10,20,30,40,50])
