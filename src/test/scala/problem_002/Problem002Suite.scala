package problem_002

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith


@RunWith(classOf[JUnitRunner])
class Problem002Suite extends FunSuite {

  test("Problem 2 - Find the last but one element of a list. [1, 1, 2, 3, 5, 8]"){
	  assert(Problem002.penultimate(List(1, 1, 2, 3, 5, 8))===5)  //> res0: Any = 5
  }

  test("Problem 2 - Find the last but one element of a list. [1,2]"){
	  assert(Problem002.penultimate(List(1, 2))===1)              
  }

  test("Problem 2 - Find the last but one element of a list. [1]"){
	  assert(Problem002.penultimate(List(1))===None)           
  }

  test("Problem 2 - Find the last but one element of a list. Emty list"){
	  assert(Problem002.penultimate(List())===None)            
  }
  
}