package problem_002

object Problem002 {
	def penultimate( list : List[Any] ) :Any  = {
	  def penultimateInternals( list : List[Any] , beforeLast : Any ) : Any = {
	    list match {
	      case head :: tail => penultimateInternals(tail,if(tail.isEmpty){beforeLast}else{head})
	      case _ => beforeLast
	    }
	  }//end internals
	  penultimateInternals(list,None)
	}//end method
}//end object