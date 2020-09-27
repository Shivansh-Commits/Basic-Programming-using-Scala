

object years_to_days {
  
  def main(arg :Array[String])
  {
    println("INPUT years:")
    var year:Double = scala.io.StdIn.readDouble()
    def conv = (days:Double)=>year*365;
    println("No. of Days are "+conv(year))
  }
}