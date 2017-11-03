
//6.1 method

def methodName(){  //methodName are presented as program identifiers
    // body
}
methodName()//  call or invoke  ...

def hi(name , age){
    print("p1");print(" and ")  //一行多句用 ; 分割
    println("p3 $name age=${age}#")
}
//hi('tom',33);

//6.3  default parameters
def h2(age=28){
    println("age=${age}")
}
/*
h2()
h2(23)
*/

//6.4 return value

def h3(num){
    return num*2
}
//println(h3(3)) //6

//6.5 parameter passing ,pass by value
//String/Integer 之列是不变对象

//6.6 scope  方法内、方法外 def 定义变量

/**
 * Groovy  variables defined outside a method using def are
 * effectively local to the generated run method
 * and cannot be referenced by any of our Groovy methods
 */
def var="xxx"
def printName(name){
    println("n1=$name")
  //  name=var //error 不可以访问到变量var
    println("n2=$name")
}
//printName("tom")


//6.7 collections as method parameters and return values
def sort(list, ascending = true) {
    list.sort()
    if(ascending == false)
        list = list.reverse()
    return list
}
def numbers = [10, 5, 3, 6]
assert(sort(numbers, false) == [10, 6, 5, 3])

