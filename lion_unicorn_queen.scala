import scala.collection.mutable.ListBuffer

// Create class to store information about each product
class Product {
  var name : String = _
  var material : String = _
  var description : String = _
  
  def this(name : String, material : String, description : String) {
    this()
    this.name = name
    this.material = material
    this.description = description
  }
  
  override def toString = s"Product($name, $material, $description)"
}

// Create class to store information about each lesson
class Lesson {
  var name : String = _
  var materials : ListBuffer[String] = _
  var description : String = _
  var steps : ListBuffer[String] = _
  
  def this(name : String, materials : ListBuffer[String], description : String, steps : ListBuffer[String]) {
    this()
    this.name = name
    this.materials = materials
    this.description = description
    this.steps = steps
  }
  
  override def toString = s"Lesson($name, $materials, $description, $steps)"
}

// Create a list of products that can be created from waste materials
val products = ListBuffer[Product](
  new Product("Pet Bed", "Plastic Bottles", "Create a comfortable bed for your pet out of plastic bottles"),
  new Product("Tote Bag", "Old Clothes", "Turn your old clothes into a stylish tote bag"),
  new Product("Pots and Pans", "Cans", "Upcycle cans into storage containers and cooking utensils"),
  new Product("Keychains", "Chip Bags", "Repurpose chip bags into fashionable keychains"),
  new Product("Quilt", "T-Shirts", "Make a colorful quilt out of your old t-shirts")
)

// Create a list of lessons to teach how to make the products
val lessons = ListBuffer[Lesson](
  new Lesson("Pet Bed", ListBuffer("Plastic Bottles", "Fabric Scraps", "Glue"),
             "Learn how to create a comfortable pet bed out of plastic bottles and scraps of fabric",
             ListBuffer("Gather plastic bottles and fabric scraps", "Cut fabric scraps into circles", "Attach circles to plastic bottles with glue")),
  new Lesson("Tote Bag", ListBuffer("Old Clothes", "Needle & Thread"),
             "Make a stylish tote bag out of old clothes",
             ListBuffer("Cut old clothes into strips", "Sew strips into a bag shape", "Add straps to the bag")),
  new Lesson("Pots and Pans", ListBuffer("Cans", "Utensil Handle"),
             "Turn cans into makeshift storage containers and cooking utensils",
             ListBuffer("Remove labels from cans", "Cut cans in half", "Attach handle for easy mobility")),
  new Lesson("Keychains", ListBuffer("Chip Bags", "Keychain Hooks"),
             "Make unique keychains out of chip bags",
             ListBuffer("Cut chip bags into circles", "Punch a hole in each circle", "Attach keychain hooks")),
  new Lesson("Quilt", ListBuffer("T-Shirts", "Fabric Scraps", "Needle & Thread"),
             "Create a unique quilt from your old t-shirts and fabric scraps",
             ListBuffer("Cut t-shirts and fabric scraps into strips", "Arrange strips in a quilt pattern", "Stitch strips together with needle and thread"))
)

// Functions to print product and lesson information
def printProductInfo(products : ListBuffer[Product]) = {
  for (product <- products) {
    println(s"Name: ${product.name}")
    println(s"Material: ${product.material}")
    println(s"Description: ${product.description}")
  }
}

def printLessonInfo(lessons : ListBuffer[Lesson]) = {
  for (lesson <- lessons) {
    println(s"Name: ${lesson.name}")
    println(s"Materials: ${lesson.materials.mkString(", ")}")
    println(s"Description: ${lesson.description}")
    println(s"Steps:")
    for (step <- lesson.steps) println(s" - $step")
  }
}

// Main program
println("Welcome to the Waste Repurposing Initiative!")
println("We have created a list of products that can be created from waste materials, as well as some lessons to help you make them.")

println("List of Products:")
printProductInfo(products)

println("

List of Lessons:")
printLessonInfo(lessons)