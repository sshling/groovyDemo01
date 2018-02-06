package ch02

class Robot{
    def type,heiht,width
    def access(Map<String,Integer> location,weight,fragile){
        println "received fragile?$fragile ,weight:$weight,loc:$location"
    }
}

robot=new Robot(type: 'arm',width: 10,heiht: 40)
println "$robot.type , $robot.width ,$robot.heiht"

robot.access(x:30,y:20,z:10,50,true)
robot.access(50,true,x:10,y:20,z:30)
