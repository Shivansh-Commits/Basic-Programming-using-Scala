

object multiple_traits {
  
  def main(arg:Array[String])
  {
    var obj = new demo()
    obj.fun_1
    obj.fun_2
    obj.fun_3 
  }
  class demo extends trait_1 with trait_2 with trait_3
  {
    def fun_3()
    {
      println("Declared in trait_3 but defined in class demo");
    }
  }
  trait trait_1
  {
    def fun_1
    {
    println("Defined in trait_1")
    }
  }
  trait trait_2
  {
    def fun_2()
    {
    println("Defined in trait_2")
    }
  }
  trait trait_3
  {
    def fun_3()
  }
  
}