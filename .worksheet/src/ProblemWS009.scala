import problem_009._

object ProblemWS009 {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(128); 
  println("Problem 9 - Pack consecutive duplicates of list elements into sublists.");$skip(95); 
  val a = Problem009.packTailRec(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e));System.out.println("""a  : List[Any] = """ + $show(a ));$skip(97); 
  val b = Problem009.packFoldRight(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e));System.out.println("""b  : List[Any] = """ + $show(b ));$skip(14); 

  println(b)}
  
  
  
  
                                                  
                                                  
  
}