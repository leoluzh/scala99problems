package problem_006

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class Problem006Suite extends FunSuite{

  test("Problem 6 -  Find out whether a list is a palindrome. [1, 2, 3, 2, 1]"){
 	  assert(Problem006.isPalindrome(List(1, 2, 3, 2, 1)) === true)    
  }
  
}