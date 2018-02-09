package ch05_strings

//Literals and Expressions 字面量和表达式

//单引、双引都可以定义字符串
s='a'
ch='a' as char //显式声明为字符，而不是字符串。据推断可能会自动推断
s='a "#" b' //单引号的字符串里 ，有双引号
println(s)

//single quote, as a pure literal ,不解析任何表达式
v=2
println( "v=$v")
println( 'v=$v ') //不解析


//string 不可变
s="hello"
println( s[1]=='e')//取字符，下标0起

v=2
println("v2=\$${v}") //\$  转义 ，默认$在双引号字符串中表示引用某个变量
println(/v3=$$v/) //通常 /和/之间是表示正则 ，这里$无需转义
//${v} 的大括号可选，若无歧义可以去掉





