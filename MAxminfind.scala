

object MAxminfind {
  
  def main(args: Array[String]) {
 println("Finding Min and Max from 7,5");
      maxmin(7,5);
      
 }
 
 def maxmin(a: Int,b: Int)={
   
   def findmax() = {
     if(a > b)
     println("Max is "+ a)
     else
     println("Max is "+ b)
   }
   
   def findmin() = {
     if(a < b)
     println("Min is :"+a)
     else
     println("Min is "+b)
   }
   findmax();
   findmin();
}

}