package ch01


class Car {
    /**
     * 声明property的2种方式：
     * 1. def 属性名 [=值]
     * 2. type 属性名 [=值]
     */
    def miles=0 //声明0，好推断出类型
    final year //ro
    //若 private 修饰， 则需要实现setter--拒绝修改
    Car(theYear) {
        year = theYear
    }
}
Car car=new Car(2018)
println car.getYear()
println car.getMiles()
car.miles=22
println car.getMiles()


Calendar.instance //无须getter
str="hi"
str.class.name //但建议 getClass()