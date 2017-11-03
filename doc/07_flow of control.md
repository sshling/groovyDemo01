
7 flow of control

1. sequence
2. selection
3. iteration

7.1 while statement

    while(condition) {
        statement #1
        ...
    }

7.2 for statement
    be used to iterate over a Range, a collection(List, Map, or array) or a String.
    
    for(var in range|collection|string){
        ...
    }
    
    def end=5
    for(cnt in 1..end)
        println($cnt)

    def map=["k":"v"]
    for(entry in map){ //单条语句 {} 可省略
        println("key=$entry.key value=$entry.value")
    }

    //遍历字符串
    def name="tom"
    def li=[]
    for(letter in name){
        li<<letter
    }

7.3 if statement

    if(condition) {
        ...
    } else {
        ...
    }

    if(condition) {
        ...
    }


    if(score >= 70) //多层允许，但不建议....
        grade = ‘A’
    else if(score >= 60)
        grade = ‘B’
    else if(score >= 50)
        grade = ‘C’
    else if(score >= 40)
        grade = ‘D’
    else
        grade = ‘E’


7.4 swich statement ,勿忘 ";break"

    switch(expression) {
        case expression :
            ...;break
        case exp2 :
            ...;break
        default:
            ...
    }

//7.5 break statement

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (j>0) break //内层嵌套的break ，只是中断当层循环
            println("(i,j)->($i,$j)")
        }
    }

//7.6 continue statement
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (j==1) continue //continue ，只是中断当层循环当次之下语句的执行，下一次循环判断不影响
            println("continue (i,j)->($i,$j)")
        }
    }



