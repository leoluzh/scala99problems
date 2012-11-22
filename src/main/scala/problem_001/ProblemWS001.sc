import problem_001._

object ProblemWS001 {
  println("Problem 1 - Find the last element of a list.")
                                                  //> Problem 1 - Find the last element of a list.
  Problem001.last(List(1, 1, 2, 3, 5, 8))         //> res0: Any = 8
  Problem001.last(List())                         //> res1: Any = None
}