
object inch_to_mt_cnvrt {
  
  def main(args:Array[String])
  {
    printf("Input value in inches:")
    var inch:Double = scala.io.StdIn.readDouble(); 
    def conv = (mt:Double)=>inch/39.37;
    println("Conversion in Meters is :"+conv(inch));
    
  }
}



