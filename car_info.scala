object car_info {
  def main(arg:Array[String])
  {
    var obj_1 = new car_info_1()
    var obj_2 = new car_info_2()
    obj_1.title()
    obj_1.engine()
    obj_1.top_speed()
    obj_1.car_color()
    obj_2.seating_capacity()
  }
  class car_info_1 extends engine with car_color with top_speed
  {
    def title()
    { println("Car Details:") }
    def top_speed()
    { println("220KMph") }
  }
  
  class car_info_2 extends seating_capacity
  {
    def seating_capacity()
    { println("7 Seater") }
  }
  
  trait engine{
    def engine()
    { println("2.0L Volkswagon Engine ") }
  }
  
  trait car_color{
   def car_color()
   { println("BLack Color") }
  }
  
  trait top_speed
  { def top_speed() }
  
  trait seating_capacity
  { def seating_capacity() }
}