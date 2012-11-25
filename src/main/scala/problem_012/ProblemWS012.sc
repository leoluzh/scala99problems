
object ProblemWS012 {
  println("Problem 12 - Decode a run-length encoded list.")
                                                  //> Problem 12 - Decode a run-length encoded list.

	def repeat( element : Any , count : Int ) : List[Any] = {
		if(count <= 0 ){ List() }
		else{ element :: repeat(element,count-1) }
	}                                         //> repeat: (element: Any, count: Int)List[Any]
	
	for{
		(count,element) <- List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
		next <- 1 to count
	} yield element                           //> res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e
                                                  //| , 'e)

	List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)) flatMap {
		case(count,element) => repeat(element,count)
	}                                         //> res1: List[Any] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, '
                                                  //| e)
	
  List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)).foldLeft(List[Any]()){
   case(accum,(count,element)) => {
    accum ::: (1 to count).foldLeft(List[Any]()){ case(l,r) => element :: l }
   }
  }                                               //> res2: List[Any] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, '
                                                  //| e)
	List.make(5,'a)                           //> res3: List[Symbol] = List('a, 'a, 'a, 'a, 'a)
	

}