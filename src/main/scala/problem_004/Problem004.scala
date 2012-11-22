package problem_004

object Problem004 {
	def length( list : List[Any] ) : Int = {
	  def lengthInternals(list: List[Any], acc : Int ) : Int = {
	    list match {
	      case head :: tail => lengthInternals(tail,acc+1)
	      case _ => acc
	    }
	  }
	  lengthInternals(list,0)
	}
}