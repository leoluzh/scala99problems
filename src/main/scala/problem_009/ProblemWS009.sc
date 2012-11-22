import problem_009._

object ProblemWS009 {
  println("Problem 9 - Pack consecutive duplicates of list elements into sublists.")
                                                  //> Problem 9 - Pack consecutive duplicates of list elements into sublists.
  val a = Problem009.packTailRec(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> a  : List[Any] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a,
                                                  //|  'a), List('d), List('e, 'e, 'e, 'e))
  val b = Problem009.packFoldRight(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> b  : List[Any] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a,
                                                  //|  'a), List('d), List('e, 'e, 'e, 'e))

  println(b)                                      //> List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), L
                                                  //| ist('e, 'e, 'e, 'e))
  
  
  
  
                                                  
                                                  
  
}