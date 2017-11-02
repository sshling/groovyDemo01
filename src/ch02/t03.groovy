package ch02

info=''' abc
123
456
899
'''

//println(info.length())

def x="12"
//println("age=${x}")
//println("age=\${x}")


//indexing and slicing
def greeting='0123456789'
/*
println(greeting[0]) //0起
println(greeting[-1]) //9 ,最后一个
println(greeting[1..2]) //12  ,slice with inclusive range
println(greeting[1..<3])//12  ,... exlusive ...
println(greeting[4..2]) //432 ,backward slice
println(greeting[1,3])//13 , selective slicing
*/

//3.3 basic operations
greeting="helloworld"
'hi'+",john" //concatenate ,plus()
'hi'*3 //repeat
def minus=greeting-"world"
//println(minus)//hello
greeting.size()// java.util.Collection
greeting.length()// array and java.lang.String
//两者含义近似

//["aa", "bb", "Chris"].findAll{it.size() <= 4}.each{println it}
//println(greeting.count('o'))//2 发生2词
greeting.contains("ld") //true










