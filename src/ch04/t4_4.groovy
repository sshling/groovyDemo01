package ch04


//传参数给闭包：无参、单参、多参

def tellFortune(closure){//闭包2个参数
    closure new Date("02/08/2018"),"your day is filled with ceremony"
}

tellFortune(){
    date,fortune ->
        println "Fortune for $date is '${fortune}'"
}

tellFortune(){
    Date date,fortune -> //groovy参数类型可选
        println "Fortune for $date is '${fortune}'"
}
