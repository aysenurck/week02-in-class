size(list.List[(T)] =>
def size(list : List[(T)]: Int =
{
list match 
{
   case Nil =>0
   case _:tail => 1 + size(tail)
}
}

def sizeHelper (list, acc){
list match 
{
case Nil => acc
case _:tail => sizeHelper(tail, acc)
}
}

def last (xs: List[Int]) :Int=
{
xs match 
{
    case h: Nil => h
    case _:: tail => last(tail)
    case _=> 0
}
}

def reverse(mylist: List[Int]):List[Int] = {

mylist match {

case Nil => Nil
case h: Nil => h
case h :: t => reverse(t) : h
}
}



