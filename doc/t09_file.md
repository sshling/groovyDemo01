

9.1 command line arguments

    println "args:$args"
    println "length:${args.size()}"  //{} 不可少
    println "first arg:${args[0]}"


$ groovy x.groovy  a b c
args:[a, b, c]
length:3
first arg:a

9.2 File class
- file or directory
- a new File obj is created , proccessed,and closed when complete

methods:
void **append**(String text)
Boolean **createNewFile**()
Boolean **delete**()
void **eachFile**(Closure closure)
    invoke the closure for each file in the given directory,and recursively
void **eachFileRecurse**(Closure closure)
void **eachLine**(Closure closure)
Boolean **exists**()
String **getPath**()
String **getText**()
    read the content of this file and return it as a String
Boolean **isDirectory**()
Boolean **mkdir**()
void **withPrintWriter**(Closure c)
    helper method to create a new PrintWriter for this file,pass it into the closure 
    ,and ensure that it is closed again afterwards.

    















