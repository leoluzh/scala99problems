
import problem_011._

object ProblemWS011 {
  println("Problem 11 - Modified run-length encoding.")
                                                  //> Problem 11 - Modified run-length encoding.
  Problem011.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res0: List[(Symbol, Int)] = List(('a,6), ('b,1), ('c,2), ('d,1), ('e,4))
}