

object print_string_using_closures {
  
  def main(arg :Array[String])
  {
    val age:Int = 19;//free variable 
    def printString = (name:String)=>println(s"My name is $name"+s" and i am $age years old")//closure
    printString("Shivansh");
    
  }
}