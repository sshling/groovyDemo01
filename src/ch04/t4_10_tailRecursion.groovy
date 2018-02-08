package ch04

//尾递归 ： tail recursion
/*
尾调用优化
http://www.ruanyifeng.com/blog/2015/04/tail-call.html

尾调用(tail call)：某个函数的最后一步是调用另一个函数。
以下两种情况，都不属于尾调用。
    // 情况一
    function f(x){
      let y = g(x);
      return y;
    }
    // 情况二
    function f(x){
      return g(x) + 1;
    }
情况一是调用函数g之后，还有别的操作，所以不属于尾调用，即使语义完全一样。
情况二也属于调用后还有操作，即使写在一行内。

尾调用不一定出现在函数尾部，只要是最后一步操作即可。
function f(x) {
  if (x > 0) {
    return m(x)
  }
  return n(x);
}

所有的调用记录，就形成一个"调用栈"（call stack）
@@尾调用由于是函数的最后一步操作，所以不需要保留外层函数的调用记录，因为调用位置、内部变量等信息都不会再用到了，只要直接用内层函数的调用记录，取代外层函数的调用记录就可以了。
"尾调用优化"（Tail call optimization）--节省内存。

        function f() {
          let m = 1;
          let n = 2;
          return g(m + n);
        }
        f();

        // 等同于1
        function f() {
          return g(3);
        }
        f();

        // 等同于2
        g(3);


尾递归(tail recursion)：函数调用自身，称为递归。如果尾调用自身，就称为尾递归。
递归非常耗费内存，因为需要同时保存成千上百个调用记录，很容易发生"栈溢出"错误（stack overflow）。
但对于尾递归来说，由于只存在一个调用记录，所以永远不会发生"栈溢出"错误。

尾递归的实现，往往需要改写递归函数，确保最后一步只调用自身。做到这一点的方法，就是把所有用到的内部变量改写成函数的参数。


large input , overflow
 */


def factorial

factorial={
    int num,BigInteger theFactorial ->
     /*
     num, which is a candidate for which we want to determine
            the factorial
    theFactorial, which stands for the partial result
        being computed through the recursion.
      */
        num==1?theFactorial:
                factorial.trampoline(num-1,num*theFactorial)
}.trampoline()
println(factorial(5,1))

//TrampolineClosure.call() 本质用for循环，直到不产生TrampolineClosure

//Java中居然没有做尾递归优化！



