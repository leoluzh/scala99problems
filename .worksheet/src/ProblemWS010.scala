
import problem_010._

object ProblemWS010 {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
  println("Problem 10 -  Run-length encoding of a list.");$skip(82); val res$0 = 
  Problem010.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e));System.out.println("""res0: List[(Symbol, Int)] = """ + $show(res$0));$skip(85); val res$1 = 
  Problem010.encode_v2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e));System.out.println("""res1: List[(Symbol, Int)] = """ + $show(res$1));$skip(28); val res$2 = 
  Problem010.encode(List());System.out.println("""res2: List[(Nothing, Int)] = """ + $show(res$2))}
}