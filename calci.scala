

object calci {
  
  def main(args: Array[String]) {
    
  println("Adding Two Numbers:");
  var x:Int = scala.io.StdIn.readInt();
  var y:Int = scala.io.StdIn.readInt();
  def add = (x:Int)=>x+y
  println(x+"+"+y+"="+add(x));
  
  println("Subtracting Two Numbers:");
  var a:Int = scala.io.StdIn.readInt();
  var b:Int = scala.io.StdIn.readInt();
  def sub = (a:Int)=>a-b
  println(a+"-"+b+"="+sub(a));
   
  println("Dividing Two Numbers:");
  var j:Int = scala.io.StdIn.readInt();
  var k:Int = scala.io.StdIn.readInt();
  def div = (j:Int)=>j/k
  println(j+"/"+k+"="+div(j));
  
  println("Multiplying Two Numbers:");
  var l:Int = scala.io.StdIn.readInt();
  var m:Int = scala.io.StdIn.readInt();
  def mul = (l:Int)=>l*m
  println(l+"x"+m+"="+mul(l));
   
}
}