package FunctionalProgrammingJuly2014.RemoveDuplicates


import scala.collection.mutable
import scala.io.StdIn

/**
 * Program Description: Removes duplicate characters from a string
 */

    object Remove {
      def main(args:Array[String]) {

        println(retString(StdIn.readLine().toCharArray))
      }

      def retString(s: Array[Char]): String = {
        //LinkedHashSet because it is an ordered set. Others do not seem to add in order of string.
        val set = mutable.LinkedHashSet() ++ s
          var result = ""
          for (x <- set.toIterator)
          {
             result += x
          }
        result
      }

}

