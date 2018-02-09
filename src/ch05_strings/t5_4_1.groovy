package ch05_strings

//String的其它便捷方法
//execute() 创建Process对象，可执行系统级的进程


def m1(){
    str="a##b##c"
    str-="##" //重载符,移除 最左匹配的子字符串
    println(str)//ab##c
}
//m1()

/*
其它
plus() +
multiply() *
next() ++
replaceAll()
tokenize()
 */

def m2(){
    for(str in 'aa'..'ad'){
        print("$str ")
    }
}
m2()
