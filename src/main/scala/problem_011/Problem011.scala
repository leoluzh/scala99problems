package problem_011

object Problem011 {

  def encode[T]( list : List[T] ) : List[(T,Int)] = {
    list.distinct map { element => ( element , list.filter{ _ == element }.size ) }
  }
  
}