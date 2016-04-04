import Text.Printf

type Point     = (Float,Float)
type Rect      = (Point,Float,Float)

maxWidth :: Float
maxWidth = 1000

maxHeight :: Float
maxHeight = 100


writeRect :: (Rect,String) -> String 
writeRect (((x,y),w,h),style) = 
  printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' style='%s' />\n" x y w h style


writeAllRects :: Float -> Float -> [(Rect,String)] -> String 
writeAllRects w h rs = 
  printf "<svg width='%.2f' height='%.2f' xmlns='http://www.w3.org/2000/svg'>\n" w h 
      ++ (concat (map writeRect rs)) ++ "</svg>"


genRects :: Float -> Float -> Float -> [Rect]
genRects 0.0 _ _ = []
genRects n w h = ((0.0 + ((n-1) * w), 0.0), w, h) : genRects (n-1) w h


myzip :: [String] -> [Rect] -> [(Rect,String)]
myzip _ [] = []
myzip [] _ = []
myzip str rect = ((head rect), (head str)) : myzip(tail str) (tail rect)


applyStyles :: [String] -> [Rect] -> [(Rect,String)]
applyStyles styles rects = zip rects (cycle styles)


geraCor :: Int -> [String]
geraCor 0 = []
geraCor n = printf "fill:rgb(%d,%d,%d)" (n*1) (n*3) (n*5) : geraCor (n-1)
      

main :: IO ()
main = do
  let
    rects = genRects 10 50 50                          
    styles = ["fill:rgb(140,0,0)","fill:rgb(0,140,0)"] 
    rectstyles = applyStyles styles rects
  writeFile "mycolors.svg" (writeAllRects maxWidth maxHeight rectstyles)