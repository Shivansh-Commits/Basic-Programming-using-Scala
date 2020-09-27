

object sq_cube {
  
  def main(arg :Array[String])
  {
    println("ENTER NO.");
    var x:Int = scala.io.StdIn.readInt();
    def sq = (y:Int)=>x*x
    def cube=(z:Int)=>x*x*x
    def fourth_power=(a:Int)=>x*x*x*x;
    println("square is: "+ sq(x)+"\nCube is: "+ cube(x)+"\nfourth power is :"+fourth_power(x));
    
  }
  
}