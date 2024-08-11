def categorizeNumber(input: Int): String = {
    input match {
      case n if ((n: Int) => n % 3 == 0 && n % 5 == 0)(n) => "Multiple of Both Three and Five"
      case n if ((n: Int) => n % 3 == 0)(n) => "Multiple of Three"
      case n if ((n: Int) => n % 5 == 0)(n) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }
  }