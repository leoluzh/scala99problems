package problem_001

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith


@RunWith(classOf[JUnitRunner])
class Problem001Suite extends FunSuite {

  test("Problem 1 - Find the last element of a list. [1, 1, 2, 3, 5, 8] is 8"){
	assert(Problem001.last(List(1, 1, 2, 3, 5, 8))===8)
  }

  test("Problem 1 - Find the last element of a list. Empty list"){
	assert(Problem001.last(List())===None)
  }
  
  
}