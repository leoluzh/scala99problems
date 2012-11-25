
object ProblemWS012 {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Problem 12 - Decode a run-length encoded list.");$skip(136); 

	def repeat( element : Any , count : Int ) : List[Any] = {
		if(count <= 0 ){ List() }
		else{ element :: repeat(element,count-1) }
	};System.out.println("""repeat: (element: Any, count: Int)List[Any]""");$skip(126); val res$0 = 
	
	for{
		(count,element) <- List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
		next <- 1 to count
	} yield element;System.out.println("""res0: List[Symbol] = """ + $show(res$0));$skip(121); val res$1 = 

	List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)) flatMap {
		case(count,element) => repeat(element,count)
	};System.out.println("""res1: List[Any] = """ + $show(res$1));$skip(209); val res$2 = 
	
  List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)).foldLeft(List[Any]()){
   case(accum,(count,element)) => {
    accum ::: (1 to count).foldLeft(List[Any]()){ case(l,r) => element :: l }
   }
  };System.out.println("""res2: List[Any] = """ + $show(res$2));$skip(17); val res$3 = 
	List.make(5,'a);System.out.println("""res3: List[Symbol] = """ + $show(res$3))}
	

}