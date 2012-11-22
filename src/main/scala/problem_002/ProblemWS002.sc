import problem_002._

object ProblemWS002 {
  println("Problem 2 - Find the last but one element of a list.")
                                                  //> Problem 2 - Find the last but one element of a list.
  Problem002.penultimate(List(1, 1, 2, 3, 5, 8))  //> res0: Any = 5
  Problem002.penultimate(List(1, 2))              //> res1: Any = 1
	Problem002.penultimate(List(1))           //> res2: Any = None
	Problem002.penultimate(List())            //> res3: Any = None
    
}