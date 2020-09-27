
object checkprime {
  
  def main(args: Array[String]) {
    
  println("Check if a no. is prime or not");
  var x:Int = scala.io.StdIn.readInt();
  var i:Int=0
  var flag:Int = 1

  for(i <- 2 to x/2)
  {
    if(x%i==0)
        {
         flag=0;
        }
   }
  
if(flag==1)
  println("PRIME");
else
  println("NOT PRIME");

  }
}