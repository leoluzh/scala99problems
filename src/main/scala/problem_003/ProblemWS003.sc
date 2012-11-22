import problem_003._

object ProblemWS003 {
  println("Problem 3 - Find the Kth element of a list.")
                                                  //> Problem 3 - Find the Kth element of a list.
  Problem003.nth(-1, List(1, 1, 2, 3, 5, 8))      //> java.lang.IllegalArgumentException: requirement failed
                                                  //| 	at scala.Predef$.require(Predef.scala:202)
                                                  //| 	at problem_003.Problem003$.nth(Problem003.scala:5)
                                                  //| 	at ProblemWS003$$anonfun$main$1.apply$mcV$sp(ProblemWS003.scala:5)
                                                  //| 	at scala.runtime.WorksheetSupport$$anonfun$$execute$1.apply$mcV$sp(Works
                                                  //| heetSupport.scala:75)
                                                  //| 	at scala.runtime.WorksheetSupport$.redirected(WorksheetSupport.scala:64)
                                                  //| 
                                                  //| 	at scala.runtime.WorksheetSupport$.$execute(WorksheetSupport.scala:74)
                                                  //| 	at ProblemWS003$.main(ProblemWS003.scala:3)
                                                  //| 	at ProblemWS003.main(ProblemWS003.scala)
  
}