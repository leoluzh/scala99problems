package problem_010

import problem_009.Problem009

object Problem010 {
 
  def encode[T]( list: List[T] ) : List[(T,Int)] = {
    Problem009.pack(list).map{ element => ( element.head , element.size ) }
  }
  
  def encode_v2[T]( list : List[T] ) : List[(T,Int)] = {
    for{
      element <- Problem009.pack(list)
    } yield ( element.head , element.size )
  }
  
}