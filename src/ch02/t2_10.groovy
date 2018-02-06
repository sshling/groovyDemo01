package ch02

import groovy.transform.Canonical
import groovy.transform.Immutable

/*
@Canonical
class Person{
    String name;
    int age;
}

def obj=new Person(name: "tom",age: 22)
println(obj)*/

/*
class A{
    def a(){println "a..."}
}
class B{
    def b(){println "b..."}
}
class AB{
    @Delegate A a=new A()
    @Delegate B b=new B()
}
def obj =new AB()
obj.a()
obj.b()*/


/*@Immutable
class Person{
    String name
    int age
}*/



//@Lazy



//@Newify
/*@Canonical
class Person{
    String name
    int age
}
@Newify([Person])
def out(){
    println Person.new(name: "tom1",age: 1)//ruby-like
    println Person(name: "tom2",age: 2) //python-like
}
out()*/


//@Singleton
@Singleton(lazy = true,strict = false)
class Per{
    String name=""
    private Per(){println("instance created.")}
    def hello(){println "hello"}
}
Per.instance.hello()
Per.instance.hello()




//@