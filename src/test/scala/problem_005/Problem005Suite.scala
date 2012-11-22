package problem_005

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class Problem005Suite extends FunSuite {

  test("Problem 5 - Reverse a list. [1, 1, 2, 3, 5, 8] - Using tail recursion."){
	  assert(Problem005.reverseTailRec(List(1, 1, 2, 3, 5, 8))===List(8, 5, 3, 2, 1, 1))
  }
  
}