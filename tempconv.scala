

object tempconv {
  
  def main(args: Array[String])
  {
    printf("PRESS 1 for C to F\nPRESS 2 for F to C: ");
    var ch:Int = scala.io.StdIn.readInt()
    if(ch==1)
    {
      println("ENTER TEMP IN C")
      var c:Double = scala.io.StdIn.readDouble();
      def conv=(f:Double)=>(c * 1.8) + 32
      println("TEMP in Farenhite is :"+conv(c)+" Deg");
    }
    else
    {
      println("ENTER TEMP IN F")
      var f:Double = scala.io.StdIn.readDouble();
      def conv=(c:Double)=>(f - 32) / 1.8
      println("TEMP in Celcius is :"+conv(f)+" Deg");
    }
  }
}