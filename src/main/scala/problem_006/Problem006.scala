package problem_006

object Problem006 {
  def isPalindrome( list: List[Any] ) : Boolean = {
    list == list.reverse
  }
}