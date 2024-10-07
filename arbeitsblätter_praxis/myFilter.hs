#!/home/max/.ghcup/bin runhaskell
-- myFilter.hs
{-# LANGUAGE OverloadedStrings #-} 

import Text.Pandoc.JSON
import Data.Foldable (Foldable(fold))
import qualified Data.Text  as T
import Data.List (intersperse)
import Data.Text (replace)
import Text.Casing

kotlinOptions = "{.kotlin .cb-nb first_number=1}"


main :: IO ()
main = toJSONFilter behead

behead :: Block -> Block
behead (Div ("", ["pyconsole"] ,[]) [Para [Emph p]])  = CodeBlock ( "" , [ kotlinOptions ] , [] ) (T.intercalate "" ( map myhelper p))
behead (Div ("", ["pyconsole"] ,[]) [Para p])  = CodeBlock ( "" , [ kotlinOptions ] , [] ) (T.intercalate "" ( map myhelper p))
behead (Div ("", ["pyconsole"] ,[]) xs)  = CodeBlock ( "" , [ kotlinOptions ] , [] ) (T.intercalate "" ( map myhelper2 xs))
behead (CodeBlock ( "" , [ "python" ] , [] ) s)  = CodeBlock ( "" , [ kotlinOptions ] , [] ) s
behead (Para xs) = Para $ map helper3 xs
behead x = x

helper3 :: Inline -> Inline
helper3 (Code ( "" , [ "python" ] , [] ) s)=   Code ( "" , [ "kotlin" ] , [] )  $ T.pack $ camel $ T.unpack s
helper3 e = e

myhelper2 :: Block -> T.Text
myhelper2 (Para p) = T.intercalate "" ( map myhelper p)


myhelper :: Inline -> T.Text
myhelper (Str s) = replace "\8217" "\39" $ T.pack $ camel $ T.unpack s
myhelper SoftBreak ="\n"
myhelper Space = " "
myhelper x = T.pack $ show x









