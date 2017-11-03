//8.1 closures
def clos = { println 'hi,tom' } //closure no parameters
//clos.getClass()  //t08_closure$_run_closure1
//clos.call()  // executed with the call statement

//@formal parameter
def c2 = { param -> println "hi,$param" }
/*
c2.call('tom') //actual argument is 'tom'
c2.call('john')
c2('john')//abbreviated form
*/

//@implicit single parameter referred to as it can be used.
def c3 = { println("hi,$it") }
//c3('tom3')

//@ closures can refer to variables at the time the closure is defined
def name = 'tom'
def c4 = { param -> println("name=${name} age=$param") }
/*
c4(23) // name=tom age=23
name='john'
c4(24) //name=john age=24 ,同步修改了
*/

//@closure as parameter
def cnt = 1
def c5 = { param -> println("cnt=$cnt seq=$param") }
//c5(1) //cnt=1 seq=1
def m1(closure) {
    def cnt = 2 // @not affect closure
    closure(2) //调用closure
}
//m1(c5) //传closure变量名,cnt=1 seq=2

//@take a clousure as the final parameter
// can be removed from the list of actual parameters
// and placc5ed immediately after the closing parenthesis(圆括号).

//m1 c5 //cnt=1 seq=2  ，使用已有closure. 方法不带()
//m1() c5 //error 不可以这样调用
//m1 {param->println("closure define here:cnt=$cnt seq=$param")} //closure定义在调用点 ,方法不带()
//m1() {param->println("closure define here:cnt=$cnt seq=$param")} //closure定义在调用点 ,方法带()

//@ Groovy lib 例子
/*
 void upto(Number to ,Clousure closure)
 1.upto(10){ ... }  //call the closure literal 10 times.
 1.upto(10){ p-> ...} // it->p
*/
1.upto(5) {
//    println("hi $it")
}

//@8.2 List,Map,String  each
//[1,3,5].each {print(it)} //不在引号内，无需 ${}
//['k':'v'].each {println("${it.key} = ${it.value}")}
//'tom'.each {println(it)}

//@ find
// Object find(Closure closure)
def v = [1, 3, 5].find { ele -> ele == 3 }
//println("found:$v")
def map = ['k1': 23].find { entry -> entry.value > 20 }
//println(map) //k1=23

//@ List findAll(Closure closure)
def li = [1, 3, 5].findAll { item -> item > 2 }
//li.each {println(it)}

//@ boolean any(Closure closure)
//@ boolean every(Closure closure)

//@ List collect(Closure closure) //按条件选择出

//@ collection扩展
//a series of closures
def doubles = { item -> 2 * item }
def triples = { item -> 3 * item }
def isEven = { item -> (item % 2) == 0 }
//a method to apply a closure to a list
def map(clos,list){
    return list.collect(clos)
}
/*
println("Doubling:${map(doubles,[1,2,3,4])}")
println("Tripling:${map(triples,[1,2,3,4])}")
println("Evens:${map(isEven,[1,2,3,4])}")
*/


// @inject
/*
- iterates through a List,passing the initial value to the closure
- together with the first element,
- and then passing into the next iteration the computed value from the previous closure
- and the next element of the collection ,and so on

    Object inject(Object value,Closure closure)

 */

def fact = 1
[2, 3, 4, 5].each {
    number -> fact *= number
}
println("fact1:$fact") //120

def fact2 = [2, 3, 4, 5].inject(1) {
    previous, element -> previous * element
}
println("fact2:$fact2")

//Named list
def list = [2, 3, 4, 5]
def fact3 = list.inject(1) {
    pre, ele -> pre * ele
}
println("fact3:$fact3")

//Named list and closure
list = [2, 3, 4, 5]
def closure = { pre, ele -> pre * ele }
def fact4 = list.inject(1, closure)
println("fact4=$fact4")


