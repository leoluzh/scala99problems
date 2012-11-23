import problem_002._

object ProblemWS002 {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(109); 
  println("Problem 2 - Find the last but one element of a list.");$skip(49); val res$0 = 
  Problem002.penultimate(List(1, 1, 2, 3, 5, 8));System.out.println("""res0: Any = """ + $show(res$0));$skip(37); val res$1 = 
  Problem002.penultimate(List(1, 2));System.out.println("""res1: Any = """ + $show(res$1));$skip(33); val res$2 = 
	Problem002.penultimate(List(1));System.out.println("""res2: Any = """ + $show(res$2));$skip(32); val res$3 = 
	Problem002.penultimate(List());System.out.println("""res3: Any = """ + $show(res$3))}
    
}