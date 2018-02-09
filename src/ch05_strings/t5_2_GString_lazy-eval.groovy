package ch05_strings

//lazy-eval 的问题

def m1() {
    price = 22
    company = "A"//字符串、Integer都是不可变
    println("price:"+price.getClass().name)//java.lang.Integer
    quote = "今天公司 $company 收盘价 $price"
    println quote
    stocks = [B: 33, C: 44] //map中key不用双引号
    stocks.each { k, v ->
        company = k
        price = v
        println(quote)
    }
}
//m1()
/*
今天公司 A 收盘价 22
今天公司 A 收盘价 22
今天公司 A 收盘价 22

原因分析：
1. 可以改变price,company指向其它地址，但改变的不是 GString 实例 已绑定变量地址所指向的实例内容

We can change the company and price references all we want (both of these are referring to immutable objects) to refer to other objects, but we’re not changing what the GString instance has been bound to.

2. 解决：
    GString to reevaluate the reference

2.1 understand how GString expressions are evaluated?

When evaluating a GString, if we have a variable, its value is simply printed to a writer, typically a StringWriter.

However, if we have a closure instead of a variable, the closure is invoked.
If our closure takes a parameter, then GString sends the Writer object as an argument to the closure.

If our closure takes no parameters at all, then GString simply calls our closure and prints the result we return to the writer.

 */


def m2() {
    price = 22
    company = "A"
    priceClosure = { it.write("$price") } //闭包 ,整形值转为字符串，否则按char处理
    companyClosure = { it.write(company) }
    quote = "m2 今天公司 $companyClosure 收盘价 $priceClosure"
    println quote
    stocks = [B: 33, C: 44] //map中key不用双引号
    stocks.each { k, v ->
        company = k
        price = v
        println(quote)
    }
}
m2()
/*
今天公司 A 收盘价 22
今天公司 B 收盘价 33
今天公司 C 收盘价 44
 */


def m3() {
    price = 22
    company = "A"
    priceClosure = { -> price } //闭包
    companyClosure = { ->company }
    quote = "m3 今天公司 $companyClosure 收盘价 $priceClosure"
    println quote
    stocks = [B: 33, C: 44] //map中key不用双引号
    stocks.each { k, v ->
        company = k
        price = v
        println(quote)
    }
}
//m3()


def m4() {
    price = 22
    company = "A"
    quote = "m4 今天公司 ${->company } 收盘价 ${-> price }"
    println quote
    stocks = [B: 33, C: 44] //map中key不用双引号
    stocks.each { k, v ->
        company = k
        price = v
        println(quote)
    }
}
//m4()


