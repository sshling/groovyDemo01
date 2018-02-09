package ch05_strings

what = new StringBuilder("fence")//可变对象
text = "@$what" //调用时，拼接
println(text + "," + text.hashCode())
//修改builder ,起止位置，替换为 其它 ，3个字符可被3个以上字符替换
what.replace(0, 2, "123456")
//字符串被改变，延迟 -- lazy evaluation
println(text)

/**
 * 单引号和双引号的字符串是不同的：
 * 单引号：java.lang.String
 * 双引号、双斜杠: GStrings --Groovy String
 */

def printClassInfo(obj) {
    println("class:${obj.getClass().name}")
    println("superClass:${obj.getClass().superclass.name}")
}

val = 125
printClassInfo("双引号:${val}")
printClassInfo(/双引号:${val}/)
printClassInfo('双引号:${val}')

//优化：double quotes or slashes ,会智能推断尽量用普通的String表示