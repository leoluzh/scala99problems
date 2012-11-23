package problem_011

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import problem_011._

@RunWith(classOf[JUnitRunner])
class Problem011Suite extends FunSuite{

  test("Problem 11 - Modified run-length encoding. ['a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e]"){
    assert(Problem011.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))===List(('a,6), ('b,1), ('c,2), ('d,1), ('e,4)))
  }
  
}