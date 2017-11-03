package t11

class Account{
    def number
    def balance
    String toString(){
        return "${number} = ${balance}"
    }
}
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


//@ redefined methods




