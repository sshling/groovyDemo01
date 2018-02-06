package ch02

int val=5
println val.getClass().name

arr=["aa","bb"]
for(v in arr){
    println(v)
}


enum CoffeeSize{ SHORT,SMALL,MEDIUM,LARGE}
def out(){
    for(size in CoffeeSize.values()){
        println(size)
    }
}

def varArgs1(int a ,int...b){
    println("a==$a, b=$b")
}
def varArgs2(int a,int[] b){
    println("a==$a, b=$b")
}
