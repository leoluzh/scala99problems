package problem_010

import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class Problem010Suite extends FunSuite {

  test("Problem 10 -  Run-length encoding of a list. ['a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e]"){
    Problem010.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
  
  test("Problem 10 -  Run-length encoding of a list. Empty"){
    intercept[java.util.NoSuchElementException]{
      Problem010.encode(List())
    }
  }
  
  test("Problem 10 -  Run-length encoding of a list. v2 ['a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e]"){
    Problem010.encode_v2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
  
  test("Problem 10 -  Run-length encoding of a list. v2 Empty"){
    intercept[java.util.NoSuchElementException]{
      Problem010.encode_v2(List())
    }
  }
  
}