package ch04


//闭包

def pickEven(n,block){
    for (int i = 02; i <=n; i+=2) {
        block(i)
    }
}
//行为做为数
pickEven(10,{println it})
pickEven(10){  //闭包作为最后一个参数的，
    println(it)
}
//groovy的闭包，不像java不能单独存在：attch 一个方法或变量

pickEven(10){
    v->println v //自定义变量名，而非默认的it
}

