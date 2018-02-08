package ch04

//闭包委托：Closure Delegation

/*
闭包，远不止是个匿名方法
支持 method delegation ,and method dispatch ,like js prototype inheritance.

闭包3个properties： this,owner,delegate
    https://dzone.com/articles/groovy-closures-owner-delegate

determine which object handles a method call from within a closure.
一般来讲，delegate 即 owner.

groovy.lang.
   Script --> Closure
 */

def examiningClosure(closure) {
    closure()
}

examiningClosure() {
    println "1 In First Closure:"
    println "1 class is " + getClass().name
    println "1 this is " + this + ", super:" + this.getClass().superclass.name
    println "1 owner is " + owner + ", super:" + owner.getClass().superclass.name
    println "1 delegate is " + delegate +
            ", super:" + delegate.getClass().superclass.name

    examiningClosure() {
        println "2 In Closure within the First Closure:"
        println "2 class is " + getClass().name
        println "2 this is " + this + ", super:" + this.getClass().superclass.name
        println "2 owner is " + owner + ", super:" + owner.getClass().superclass.name
        println "2 delegate is " + delegate +
                ", super:" + delegate.getClass().superclass.name
    }
}
/*

1 In First Closure:
1 class is ch04.t4_9_delegation$_run_closure1
    闭包被创建为 内部类。
1 this is ch04.t4_9_delegation@1ddf84b8, super:groovy.lang.Script
    this是闭包所在类的一个实例 ,   父类是Script
1 owner is ch04.t4_9_delegation@1ddf84b8, super:groovy.lang.Script
    默认等价于this,除非其定义在另个闭包内 ,父类是Script
1 delegate is ch04.t4_9_delegation@1ddf84b8, super:groovy.lang.Script
    默认即owner,但可通过编程动态改变， 父类是Script
2 In Closure within the First Closure:
2 class is ch04.t4_9_delegation$_run_closure1$_closure2
    嵌套闭包：内部类中的内部类
2 this is ch04.t4_9_delegation@1ddf84b8, super:groovy.lang.Script
     this含义：refers to the instance of the class that the closure was defined in.
     @@@@@@ outer.this
2 owner is ch04.t4_9_delegation$_run_closure1@31368b99, super:groovy.lang.Closure
    owner含义：is the same as this, unless the closure was defined inside another closure
        in which case the owner refers to the outer closure.
    @@@@@ inner.this
2 delegate is ch04.t4_9_delegation$_run_closure1@31368b99, super:groovy.lang.Closure
    delegate含义：is the same as owner. But, it is the only one that can be programmatically changed,
    and it is the one that makes Groovy closures really powerful.


delegate即owner,

Groovy的with() -- 修改delegate 执行动态路由.
this , 在闭包内, refers to the object to which the closure is bound(the executing context).



 */














