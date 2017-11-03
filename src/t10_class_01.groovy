
class Account{
    def number //publick properties
    def balance
}
//create a new t11.Account instance
// named parameters ,命名参数，虽然class没有定义带参构造器，依赖默认生成的隐式无参构造器
def acc=new t11.Account(number: 'ABC123',balance: 1200)
//println("t11.Account obj：${acc.number} has balance ${acc.balance} ")



//properties remove the distinction between an instance field(sometimes also referred to as an attribute) and a method.
//from a view external to the Groovy class,a property is like both the instance field and its getter/setter methods.

// acc.number  is impl by acc.getNumber()

//getter and setter methods are implicitly part of the Groovy class.

class Account2{
    def number
    def balance
    def credit(amout){//+
        balance+=amout
    }
    def debit(amout){//-
        if (balance>=amout)
            balance-=amout;
    }
    def display(){
        println("Account2:$number with balance $balance ")
    }
}
def acc2=new Account2(number: 'A1',balance: 1200)
/*
acc2.display()
acc2.credit(10)
acc2.display()
acc2.debit(20)
acc2.display()
*/


//@ toString() ,auto call
class Account3{
    def num
    String toString(){
        return "###${num}###"
    }
}
def a3=new Account3(num: 12)
//a3.toString()
//println(a3) //automatically call toString()

//@ 构造器
class Account4{
    def num
    def Account4(num){//explicitly provide constructor
        this.num=num
    }

    @Override
    String toString() {
        return "@$num@"
    }
}
def a4=new Account4(4) //不是 named parameters, 是 positional parameters
a4=new Account4(num: 15) //also ok
//println(a4)

//12.2  composition


