 object Test {
  def baz(x: Object) = {
    val s as (_s: String) = x
    x
  }
  def main(args: Array[String]): Unit = {
    assert(baz("1") == "1")
  }
}
