

object Maxminnested {
    def main(args: Array[String]) {
 println("Finding Min and Max from 23,34");
      maxmin(23,34);
 }

 def maxmin(a: Int,b: Int)={
    
   def getmax()= {
     
     def findmax()= {
       if(a > b)
       println("Max is :"+ a)
       else
       println("Max is :"+ b)
       }
     findmax()
    }
   
   def getmin()= {
     def findmin()= {
       if(a < b)
       println("Min is :"+a)
       else
       println("Min is :"+b)
       }
     findmin()
    }
    
    getmax()
    getmin()
 }
 
}