fun main(){
  val personal = PersonalTask("title", "description", "place")

  var isGood = personal.isCompleted

  println("lets see $isGood")

  personal.changeStatus()

  isGood = personal.isCompleted

  println("lets see $isGood")

}