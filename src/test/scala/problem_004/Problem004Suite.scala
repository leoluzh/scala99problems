package problem_004

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem004Suite extends FunSuite{

  test("Problem 4 - Find the number of elements of a list. [1, 1, 2, 3, 5, 8]"){
	  assert(Problem004.length(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  test("Problem 4 - Find the number of elements of a list. Empty"){
	  assert(Problem004.length(List()) === 0)
  }
   
}