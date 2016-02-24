case class Chef(cf:String = "chef")
val in = Chef
val str = classOf[Chef]

println(str.getMethods.foreach(println))
// println(in.productIterator.toArray)