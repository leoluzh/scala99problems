package problem_008

object Problem008 {
	def compress( list: List[Any] ) : List[Any] = {
	  list.foldRight(List[Any]()){
	    (current,accum) => if( accum.isEmpty || current != accum.head ){ current :: accum  }else{ accum }
	  }
	}
}