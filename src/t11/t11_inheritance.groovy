package t11

class Account{
    def number //properties
    def balance
    String toString(){ //redifinition
        return "${number} = ${balance}"
    }
}

/**
 * In Groovy,all the features declared in a superclass are inherited by a subclass.
 * subClass need declare only those methods and properties required by itself.
 */
class CurrentAccount extends Account{
    def overdraftlimit
    String toString(){
        return 'Current t11.Account:'+super.toString()+" ${overdraftlimit}"
    }
}
def a1=new CurrentAccount(number: 'A12',balance: 13,overdraftlimit: 4444)
//println(a1)

//同一包下 类名不能重复
//@ inherited methods

//@ define class
class V3 extends Account{
    String toString(){ //super ,keyword
        return "redefine methods...."+super.toString()
    }
}
def v3=new V3()
//println(v3.toString())
//@ polymorphism  多态,runtime
// def v1=new SubClass1()
// def v2=new SubClass2()

//@The abstract Class
//a class act only as a basis for establish other,there is no intention to make an instance of it.

abstract class Base{
    def commonField
    String toString(){
        return "$commonField"
    }
}

//@The interface Class
//no method is actually defined,an interface presents only a specification of its behavious , acting as the protocol to which one or more subclass must conform,
interface HelloService{
    def abstract hello()
}
abstract class AbstractHelloService implements HelloService{
    def no
    @Override
    String toString() {
        return "no[$no]"
    }
}
class HelloServiceImpl extends AbstractHelloService {

    @Override
    def hello() {
        return "hi,$no"
    }
}

def v4 = new HelloServiceImpl(no: 22)
println(v4.hello())












