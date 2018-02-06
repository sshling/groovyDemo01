package ch02


//multiple assignments

def splitName(fullName){fullName.split(' ')}
def (firstname,lastname)=splitName("james bond")
println "$lastname,$firstname "

def n1="n1"
def n2="n2"
(n1,n2)=[n2,n1]
println "$n1,$n2"


def(String name,Integer age)=["sl",22]
println "$name ,$age"


