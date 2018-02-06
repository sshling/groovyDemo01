package ch02


def log(x,base=10){
    Math.log(x)/Math.log(base)
}
def task(name,String[] details){//数组也可选
    println "$name - $details"
}
task("a")
task("a","1","2")