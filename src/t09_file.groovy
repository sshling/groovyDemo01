

def file="file.txt"
new File(file).eachLine {
//    line-> println(line)
}

//@ mock linux cmd : wc
def chars=0
def words=0
def lines=0
new File(file).eachLine { line->
        chars+=line.length() //contains space
        words+=line.tokenize().size() // tokenize by space
        lines++
}
//println("chars[$chars] words[$words] lines[$lines]")


//@ eachFile(Closure c)
//list the content of a directory File
def listDir(dir,indent){
   dir.eachFile{ file ->
           (0..<indent).each {print ' '}
           println(file.getName())
           if(file.isDirectory()){
                   listDir(file,2+indent)
           }
   }
}
//print the content of a named directory
def printDir(dirName){
        listDir(new File(dirName),0)
}
//printDir("../src")


//@ eachFileRecurse
//list those files exceeding a given size
def printDir(dirName, size) {
        new File(dirName).eachFileRecurse { file ->
                if (file.length() > size) {
                        println("${file.getName()} size[${file.length()}]") //{}不可少
                }
        }
}
//printDir("../src",3000)


//@ With the aid of a PrintWriter object ,we can copy the contents of one file to another.

def copy(src, dst) {
        def outFile = new File(dst)
        if (outFile.exists()) {
                outFile.delete()
        }
        def printWriter = outFile.newPrintWriter()
        new File(src).eachLine { line ->
                println("copy:$line")
                printWriter.println(line)
        }
        printWriter.flush() //must
        printWriter.close()
        println("ok!")
}
//copy("file.txt","file2.txt")


//@ withPrintWrite ,create a new PrintWriter for the file
// and then passes it into the closure
// and ensures that it is closed afterwards
//Other such helper methods: withInputStream/withOutputStream/withReader/withWriter
def copy2(src, dst) {
        new File(dst).withPrintWriter { printWriter ->
                new File(src).eachLine { line ->
                        printWriter.println(line)
                }
        }
}


//@ sort a text file , for small or medium-sized files
//Lists sort method
def sortFile(fileName){
        def lines=[]
        new File(fileName).eachLine {line ->lines<<line}
        lines.sort()//可自定义比较器
        new File(fileName).withPrintWriter {pw->
                lines.each {line->
                        pw.println(line)
                }
        }
}




