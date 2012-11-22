package problem_001

object Problem001 {
  
  def last( list: List[Any] ) : Any = { 
    def lastInternals( list: List[Any] , current : Any ) : Any = {
      list match {
        case head :: tail => lastInternals(tail,head)
        case _ => current
      }
    }
    lastInternals(list,None)
  }
  
  def lastV2( list: List[Any] ) : Any = list match {
    case head :: Nil => head
    case _ :: tail => lastV2(tail)
    case _ => None
  }
  
  def lastUsingApi( list : List[Any] ) : Any = {
    list.last
  }
  
}//end klazz