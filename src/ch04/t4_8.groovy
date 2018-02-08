package ch04

//动态闭包，若没提供则使用默认实现

def  dosomething(closure){
    if (closure){//判断是否用了闭包
        closure()
    }else{
        println( "using default impl")
    }
}
dosomething(){
    println( "use spec impl")
}
dosomething()


println("------------ 2 --------")
//闭包的参数个数、类型的动态、不确定
def completeOrder(amount,taxComputer){
    tax = 0
    //动态参数个数 。 parameterTypes
    if (taxComputer.maximumNumberOfParameters==2){
        tax=taxComputer(amount,6.05)
    }else{
        tax=taxComputer(amount)
    }
    println( "sales tax is $tax")
}
completeOrder(100){it*0.02}
completeOrder(100){amout,rate ->
    amout*(rate/1000)
}

println("------------ 3 --------")
def examine(closure){
    println("闭包参数个数：$closure.maximumNumberOfParameters ")
    for (p in closure.parameterTypes){
        println(p.name)
    }
}
examine(){}//1 ,参数为 it, 可以为空闭包体，但不能为null
examine(){it}//1 ,参数为it
examine(){->}//0,真正的没有任何参数
examine(){val ->}
examine(){Date v ->}
examine(){Date v1,v2 ->}
examine(){Date v1,String v2 ->}
