package problem_003

object Problem003 {
	def nth( at: Int , list: List[Any]  ) : Any = {
	  require(at>=0)
	  def nthInternals( at : Int , list : List[Any] ) : Any = {
	    list match {
	      case head :: tail => if(at==0){ head }else{ nthInternals(at-1,tail) }
	      case _ => None
	    }
	  }
	  nthInternals(at,list)
	}
}