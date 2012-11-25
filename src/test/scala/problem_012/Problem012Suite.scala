package problem_012

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite



@RunWith(classOf[JUnitRunner])
class Problem012Suite extends FunSuite {

  test("Decode a run-length encoded list."){
    assert(Problem012.decode(List(('a,4),('b,1),('c,2),('a,2),('d,1),('e,4)))===List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
  
}