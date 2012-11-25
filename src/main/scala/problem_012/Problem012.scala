package problem_012

object Problem012 {

  //using for comprehension
  def decode( list : List[(Any,Int)] ) : List[Any] = {
    for{
      (element,count) <- list
      next <- 1 to count
    } yield element
  }
  
  //recursion
  def decode_v2( list : List[(Any,Int)] ) : List[Any] = {   
    def repeat( element : Any , count : Int ) : List[Any] = {
      if(count<=0){ List() }
      else{ element :: repeat(element,count-1) }
    }
    list.flatMap{ case(element,count) => repeat(element,count) }
  }
 
  def decode_v3( list: List[(Any,Int)] ) : List[Any] = {
    list.foldLeft(List[Any]()){
      case(accum,(element,count)) => { 
        accum ::: (1 to count).foldLeft(List[Any]()){ case(l,r) => element :: l } 
      }
    }
  }
  
  //api - using list make but this method was deprecated
  def decode_v4( list : List[(Any,Int)] ) : List[Any] = {
    list.flatMap{ case(element,count) => List.make(count,element) }
  }
  
}