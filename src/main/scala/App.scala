
object App {
  def main(args: Array[String]): Unit = {
    println("Hello World");
    //val for immutable varibale
    val b = 2;
    //var for mutable varibale
    var result = Math.plus(10, 12);
    println(result);
    var a = 1;

    //while loop
    while (a < 111) {
      println("While Loop Executed " + a);
      a = a + 1;
    }

    //do while loop
    do {
      println(" DO While Loop Executed " + a);
    } while (a < 11)
    {
      a += 1;
    }

    //for loop
    for (i <- 1 to (10)) {
      println("for loop i = " + i);
    }

    //for loop
    for (i <- 1 until (10)) {
      println("for loop i = " + i);
    }

    //nested for loop
    for (i <- 1 until (10); j <- 1 until(9)) {
      println("for loop i = " + i + "for loop i = " + j);
    }

    //if else condition
    if (a < 10 || a > 0) {
      println("From If " + a)
    } else {
      println("From Else " + a)
    }

    //match case condition
    a match {
      case 1 => {
        println("A = " + a);
      }
      case 110 => {
        println("A = " + a);
      }
      case _ => {
        println("A = " + a);
      }
    }
  }
}
