package ch04

//闭包和协程

def iter(n, closure) {
    1.upto(n) {
        println(" in iter with  value $it")
        closure(it)
    }
}

println(" calling iterate")
total = 0 //....
iter(4) {
    total += it
    println("in closure total so far is $total")
}
println(" done ")