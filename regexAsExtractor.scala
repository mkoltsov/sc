val pattern = "([0-9]+) ([A-Za-z]+)".r

val pattern(count, fruit) = "100 Bananas"

println(s"$count - $fruit")


val pigs = "(p[A-Za-z]+) ([0-9]+)".r
val dogs = "(d[A-Za-z]+) ([0-9]+)".r

val d =  "dogs 100" match {
	case pigs(plSing, count) => s"the number of $plSing found is $count"
	case dogs(plSing, count) => s"the number of $plSing found is $count"
	case _ => "unmatchables"
}

println(d)