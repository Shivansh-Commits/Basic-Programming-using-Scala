

object oddevencheck {
  
  def main(args: Array[String])={
  println("FInding ODD EVEN from 7")
  findOddEven(7);
  }
    
    
  def findOddEven(a: Int)={
    
   def checkoddeven()={
    
    def findoddeven()={
        if(a%2==0)
          println(a +" is even");
        else
          println(a +" is odd");
      }
    findoddeven()
  }
   checkoddeven()
 }
}