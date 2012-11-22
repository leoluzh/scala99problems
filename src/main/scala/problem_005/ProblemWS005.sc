import problem_005._

object ProblemWS005 {
  println("Problem 5 - Reverse a list.")          //> Problem 5 - Reverse a list.
  Problem005.reverseTailRec(List(1, 1, 2, 3, 5, 8))
                                                  //> res0: List[Any] = List(8, 5, 3, 2, 1, 1)
  Problem005.reverseSimpleRec(List(1, 1, 2, 3, 5, 8))
                                                  //> res1: List[Any] = List(8, 5, 3, 2, 1, 1)

}