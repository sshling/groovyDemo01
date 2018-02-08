package ch04

//用闭包做资源清理

/* 忘记关闭，写不进去的
fw=new FileWriter("d:/a.txt")
fw.write('!')*/

new FileWriter("d:/a.txt").withWriter {w->
    w.write('!')
}

//Execute Around Method pattern 围绕方法模式执行
/*
def static use(closure) {
    def r = new Resource()
    try {
        r.open()
        closure(r)
    } finally {
        r.close()
    }
}*/
