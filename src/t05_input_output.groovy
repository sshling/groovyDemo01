/*print "p1"
print("p2")
println "p3"
println("p4")*/

println()
def age = 22
//println("age=${age}") //解析变量必须双引号、三引号，单引号不解析

def li = [1, 3]
def map = ["a": 11]
/*
println("li:" + li)
println("map:" + map)
*/

//5.2 format output
def a = 10
def b = 15
//printf('The sum of %d and %d is %d\n', [a, b, a + b])

def x = 1.234
def y = 56.78
//printf('%f from %f gives %f\n', [y, x, x - y])
// %20s outputs the string right justified(右对齐) in a field of 20 characters.
// %–20s left justifies(左对齐,默认) the output.

def str="hi"
/*
printf("%10s\n",str)
printf("%-10s\n",str)
*/


// 5.4 simple input
/*
print("your name:")
def name = System.in.newReader().readLine();
println("->"+name)
*/

//TODO more

