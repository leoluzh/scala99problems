package problem_003

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith


@RunWith(classOf[JUnitRunner])
class Problem003Suite extends FunSuite {

  test("Problem 3 - Find the Kth element of a list. k:-1  [1, 1, 2, 3, 5, 8]"){      
      intercept[IllegalArgumentException]{
    	  assert(Problem003.nth(-1, List(1, 1, 2, 3, 5, 8))===None)  
      }
  }

  test("Problem 3 - Find the Kth element of a list. k:3 [1, 1, 2, 3, 5, 8]"){                                                  
 	  assert(Problem003.nth(2, List(1, 1, 2, 3, 5, 8))===2) 
  }
   
}