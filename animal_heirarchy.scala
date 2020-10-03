object animal_heirarchy {
  
  def main(arg:Array[String])
  {
    var obj = new aligator()
    obj.amphibian()
    obj.huge()
    obj.hunt()
    obj.danger()
  }
  class aligator extends Huge with dangerous with good_hunter with amphibian  
  {
    def amphibian() { println("Aligators are Amphbians") }
  }
  trait Huge
  {
    def huge() { println("Aligators are Huge") }
  }
  
  trait dangerous
  {
    def danger() { println("Aligators are Dangerous") }
  }
  
  trait good_hunter
  {
    def hunt() { println("Aligators are Good HUnters") }
  }
  
  trait amphibian
  {
    def amphibian() 
  }
}