package problem_005

object Problem005 {
  
	def reverseUsingApi( list : List[Any] ) : List[Any] = {
	  list.reverse
	}
	
	def reverseFunc( list : List[Any] ) : List[Any] = {
	  list.foldLeft(List[Any]()){ (accum,head) => head :: accum }
	}
	
	def reverseTailRec( list: List[Any ] ) : List[Any] = {
	  def reverseInternals( list : List[Any] , accum : List[Any] ) : List[Any] = {
	    list match {
	      case head :: tail => reverseInternals(tail,head::accum) 
	      case _ => accum
	    }
	  }
	  reverseInternals(list,List())
	}
	
	def reverseSimpleRec( list : List[Any] ) : List[Any] = {
	  list match {
	    case head :: tail => reverseSimpleRec(tail) ::: List(head)
	    case _ => List()
	  }
	}
}