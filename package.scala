package com.anthem.radiant.sample

import scala.io.Source

package object Code_Wrapper {
 def main(args: Array[String]) {
   
   val filename = "C:/Users/AF58733/fileopen.scala"
   
   for (line <- Source.fromFile(filename).getLines) {
     val a=line.split("AS")
    printf("%-60s AS %s\n",a(0),a(1))

   }
   }
   
}
 

//Source.fromFile("data.txt").getLines.take(1).foreach { x => println(x) };
//Source.fromFile("data.txt").getLines.slice(0, 1).foreach { x => println(x) };


