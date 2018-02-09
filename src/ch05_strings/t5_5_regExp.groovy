package ch05_strings

//add operators and symbols to make it easier to program with RegEx

def m1(){
    pattern= ~"hello"
    //java.util.regex.Pattern
    println pattern.getClass().name
}
//m1()

// 双斜杠也可以创建正则，好处是 no need 转义
p1=/\d*\W*/
p2="\\d*\\W*" //等价于 p1

//几个匹配符：
// =~ 部分匹配, partial match
// ==~ , exact match

// =~ 操作符返回 Matcher 对象，
//返回true:至少一个匹配

def m2(){
    matcher= 'Groovy is groovy' =~ /(G|g)roovy/
    size=matcher.size();
    println("size of matcher is:${matcher.size()}")
    0.upto(size-1){
        println("item:${matcher[it]}")
    }
    /*
    size of matcher is:2
    item:[Groovy, G]
    item:[groovy, g]
     */
}
//m2()

def m3(){
    str="Groovy is groovy ,really groovy"
    println(str)
    result=(str =~ /groovy/).replaceAll("hip")
    println(result)
/*
Groovy is groovy ,really groovy
Groovy is hip ,really hip
 */
}
m3()









