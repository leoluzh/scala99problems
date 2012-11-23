package problem_010

import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class Problem010Suite extends FunSuite {

  test("Problem 10 -  Run-length encoding of a list. ['a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e]"){
    assert(Problem010.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))===List(('a,4), ('b,1), ('c,2), ('a,2), ('d,1), ('e,4)))
  }
  
  test("Problem 10 -  Run-length encoding of a list. Empty"){
    intercept[java.util.NoSuchElementException]{
      assert(Problem010.encode(List())===None)
    }
  }
  
  test("Problem 10 -  Run-length encoding of a list. v2 ['a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e]"){
     assert(Problem010.encode_v2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))===List(('a,4), ('b,1), ('c,2), ('a,2), ('d,1), ('e,4)))
  }
  
  test("Problem 10 -  Run-length encoding of a list. v2 Empty"){
    intercept[java.util.NoSuchElementException]{
      assert(Problem010.encode_v2(List())===None)
    }
  }
  
}