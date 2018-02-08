package ch04

class Handler {
    def f1() { println "f1 of Handler called ..."}
    def f2() { println "f2 of Handler called ..."}
}
class Example {
    def f1() { println "f1 of Example called ..."}
    def f2() { println "f2 of Example called ..."}
    def foo(closure) {
        closure.delegate = new Handler()//delegate
        closure()
    }
}
def f1() { println "f1 of Script called..." }
new Example().foo {
    f1()//引用外部的：this
    f2()//本来也是引用外部的，但修改了 delegate
}
/*
    calls to methods within the closure are first routed to the context
object—this—for the closure. If they’re not found, they’re routed to the delegate:
1. context obj : this
2. delegate
 */

/*
def clone = closure.clone()
clone.delegate = handler
clone()

简化：handler.with closure

 */