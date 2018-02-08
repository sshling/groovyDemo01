package ch04

//curried closures, prebind parameters

def tellFortunes(clouse){
    Date date=new Date("02/08/2018")
    //curry , can curry only leading parameters
    postFortune = clouse.curry(date)//date在后续已作为第一个参数
    postFortune "xx" //仅传递第2个参数
    postFortune "yy"
}
tellFortunes(){date,fortune ->
    println "fortune for $date is '$fortune'"
}

//if to curry the trailing parameters: recurry()
//.. the mid of the parameters: ncurry()

