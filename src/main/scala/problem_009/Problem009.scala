package problem_009

import scala.annotation.tailrec

object Problem009 {
  
  def packTailRec( list : List[Any] ) : List[Any] = {
    @tailrec
    def packInternals( content : List[Any] , accum : List[Any] , listPack : List[Any] ) : List[Any] = {
      content match {
        case head :: tail => { 
        	val next = if( accum.isEmpty || head == accum.head ){ ( head :: accum , listPack ) }else{ ( List(head) , accum :: listPack ) }
        	packInternals( tail , next._1 , next._2 )
          }
        case _ => accum :: listPack
      }
    }
    packInternals(list,List(),List()).reverse
  }

  def packTailRecTyped[T]( list : List[T] ) : List[List[T]] = {
    @tailrec
    def packInternals[T]( content : List[T] , accum : List[T] , listPack : List[List[T]] ) : List[List[T]] = {
      content match {
        case head :: tail => { 
        	val next = if( accum.isEmpty || head == accum.head ){ ( head :: accum , listPack ) }else{ ( List(head) , accum :: listPack ) }
        	packInternals( tail , next._1 , next._2 )
          }
        case _ => accum :: listPack
      }
    }
    packInternals(list,List(),List(List())).reverse
  }
  
  
  def packFoldRight( list : List[Any] ) : List[Any] = {
    val result = list.foldRight((List[Any](),List[Any]())){
    	(current,accum) => 
    	  if( accum._1.isEmpty || current == accum._1.head ){ 
    	    ( current :: accum._1 , accum._2 ) 
    	 }else{ 
    	   (List(current), accum._1 :: accum._2) 
    	 }
    }
    result._1 :: result._2
  }
  
  def pack[A](ls: List[A]): List[List[A]] = 
    ls match {
      case head :: tail => {
    	  val (packed, next) = ls span { _ == ls.head }
    	  if (next == Nil) List(packed)
    	  else packed :: pack(next)
      }
      case _ => List(List())
    }
    
  
}