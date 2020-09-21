

object maxmin {
  
 def main(args: Array[String]) {
 println("Fnding Min and Max from 4,5");
 maxmin(4,5);
 }
 
 def maxmin(a: Int,b: Int)={
   
   def findmax() = {
     if(a<b)
     {println("Max is"+ b)}
     else
     {println("Max is "+ a)}
   }
   
   def findmin() = {
     if(a<b)
     {println("Min is :"+a)}
     else
     {println("Min is "+b)}
   }
 
}
 
}

