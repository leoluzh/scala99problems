
import problem_010._

object ProblemWS010 {
  println("Problem 10 -  Run-length encoding of a list.")
                                                  //> Problem 10 -  Run-length encoding of a list.
  Problem010.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res0: List[(Symbol, Int)] = List(('a,4), ('b,1), ('c,2), ('a,2), ('d,1), ('e
                                                  //| ,4))
  Problem010.encode_v2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res1: List[(Symbol, Int)] = List(('a,4), ('b,1), ('c,2), ('a,2), ('d,1), ('e
                                                  //| ,4))
  Problem010.encode(List())                       //> java.util.NoSuchElementException: head of empty list
                                                  //| 	at scala.collection.immutable.Nil$.head(List.scala:402)
                                                  //| 	at scala.collection.immutable.Nil$.head(List.scala:399)
                                                  //| 	at problem_010.Problem010$$anonfun$encode$1.apply(Problem010.scala:8)
                                                  //| 	at problem_010.Problem010$$anonfun$encode$1.apply(Problem010.scala:8)
                                                  //| 	at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike
                                                  //| .scala:233)
                                                  //| 	at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike
                                                  //| .scala:233)
                                                  //| 	at scala.collection.LinearSeqOptimized$class.foreach(LinearSeqOptimized.
                                                  //| scala:59)
                                                  //| 	at scala.collection.immutable.List.foreach(List.scala:76)
                                                  //| 	at scala.collection.TraversableLike$class.map(TraversableLike.scala:233)
                                                  //| 
                                                  //| 	at scala.collection.immutable.List.map(List.scala:76)
                                                  //| Output exceeds cutoff limit. 
}