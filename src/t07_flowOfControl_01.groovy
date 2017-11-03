


def map=["k":"v"]
for(entry in map){
//    println("key=$entry.key value=$entry.value")
}

def name="tom"
def li=[]
for(letter in name){
    li<<letter
}


//switch
def n=2
switch (n){
    case 1:println("one");break //break 1
    case 2:
        //println 'two'
        break  //break 2 ,新行，无需分号隔开
    default:println('default')
}

//break

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        if (j==1) break //内层嵌套的break ，只是中断当层循环
       // println("break (i,j)->($i,$j)")
    }
}

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        if (j==1) continue //内层嵌套的break ，只是中断当层循环
        println("continue (i,j)->($i,$j)")
    }
}

