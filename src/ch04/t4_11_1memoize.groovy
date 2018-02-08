package ch04
/*
Groovy的内存化(memoization)特性(2010年加入)会缓存函数调用的结果。不需要手工编写缓存代码，那样会引入潜在的缺陷，你仅仅只是需要调用memoize方法而以，

memoize()
memoizeAtLeast()和memoizeAtMost()去定制缓存行为。

Groovy简化java开发，加入很多语法糖，动态。
Scala 为了利用JVM设计 ，语法完全被重新设计过了。强静态类型，支持面向对象和函数式范式。
    更偏向后者，
Clojure 最激进，是从其它语言分离出来的，被认为是Lisp的方言，
    强动态类型语言。
    偏函数式
    设计Clojure时遵循一组核心的工程原则：软件事务内存，为了迎合新功能而打破旧有的编程范式。

jRuby

Groovy/Scala 首要，必须掌握,商业应用较热
Clojure的支持者大多是业余爱好者和lisp黑客，而不是商业组织

 */

def timeIt(len,closure){
    long s=System.nanoTime()
    println("max revenue for $len is ${closure(len)}")
    long e=System.nanoTime()
    println "time token:${(e-s)/1.0e9} seconds"
}
/*
内存化：
Memoization in Groovy
    https://objectpartners.com/2014/01/28/memoization-in-groovy/

@ Memoization is a form of caching.
@ useful for recursive calculations, though it can be used anywhere you need to store previously calculated data based on specific input.
@ should be used differently than caching (in the context of Spring Cache, for example).

@ Groovy has
    had closure memoization since version 1.8.
    Method memoization was recently added in version 2.2.  @Memoized

 */


def myClosure={ Integer x->
    println "myClosure argument $x"
    x*2
}.memoize()

println("# "+myClosure(3))
println("# "+myClosure(4))
println("# "+myClosure(3))
println("# "+myClosure(4))

/*
输出：
myClosure argument 3
# 6
myClosure argument 4
# 8
# 6
# 8
 */
/*
结论：
the code inside the closure was executed only once for each distinct input parameter.
同样的入参，闭包内只会执行一次
 */