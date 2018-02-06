package ch01

/**
 * <programming groovy 2> P12
 *
 * 1. Groovy 可以无需class/method声明
 */

/*

for (int i = 0; i < 3; i++) {
    println "h"+i
}
println "merry goovy!"

*/


//for可以简化： 闭区间 --Range
/*for (i in 0..2) {
    print("hi" + i)
    println ''//调用方法可省略括号, lenient with parentheses
}*/

//对于 Integer
0.upto(2) {
    print( "$it")
}


