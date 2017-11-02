package ch04

//4.1 List
def num=[11,22,33]
num[0]//11 ,  start zero  , eq : num.getAt(0)
num[-1] //33 , last one -- count from the end
//println([1,3,5][1]) //3

li1=['tom','john'] //Strings
li2=[1,2,[3,4],5] //nested list

//inclusive range: start..end
//exclusive range: start..<end
num=[1,3,5,7]
num[0..2] //1,3,5
num[0..<2] //1,3

//set new value
num[0]=10
num[1]=[33,44]
num //[10,[33,44],5,7]

//add item by append
num<<9

// + , concatenate list
def a=[1,2]
def b=[3,4]
def c=a+b //[1, 2, 3, 4]

//- remove items
num=[3,5,7]
//def r=num-[3]//[5, 7]
//def r=num-[3,7] //[5]


//4.3 Map
['Ken' : 'Barclay', 'John' : 'Savage']
[4 : [2], 6 : [3, 2], 12 : [6, 4, 3, 2]]
def m=[] //ArrayList
//println(m.getClass())
m=[:] //LinkedHashMap

/*Observe that if the key in a Map literal is a variable name, then it is interpreted
as a String value. 若 Map 中key 为变量名，则被解析为 字符串 ，不会像在value中解析为变量的值 */
def x=1
def y=2
def m2=[x:y,y:x]
//println(m2) // [x:2, y:1]

//getAt...
def kv=["a":11]
//println(kv['a']+","+kv.a) // 2种方式
kv2=[1:[2,3]]   //key不限定为字符串，这里Integer也可以
//println(kv2[1]) //[2,3] ,根据非字符串的key取值方法，类似 List

//注意：We must be especially careful to recognize that the keys for Maps are objects.
def kv3=[1:'num 1','1':'string 1'] //区分key


//4.5 range
def start=1
def end=4
def range=start..end+1 //[1, 2, 3, 4, 5]
range.getFrom() //1 ,get the lower value of this range
range.getTo() //5   , .. the upper...
println(range.getTo())




