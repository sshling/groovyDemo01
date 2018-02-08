package ch04
/*
功能确定的，前期可用方法实现 ，
重构阶段的，可考虑闭包。better,more elegant

keep closures small and cohesive.

 */

//使用闭包的方法
def totalSelectionValues(n,closure){
    total =0
    for (i in 1.. n){
        if(closure(i)){//调用闭包就像调用一个方法
            total+=i
        }
    }
    total //最后一个值作为方法的返回值
}

def isOdd={it%2!=0} //奇数,闭包的最后一个表达式作为结果返回
println  totalSelectionValues(10,isOdd)

