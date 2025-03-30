import java.time.LocalDate

open class Task(var description: String, var isCompleted: Boolean = false){

  val creationDate: LocalDate = LocalDate.now()

  fun changeStatus(){
    isCompleted = !isCompleted

    // if(isCompleted){

    // }
  }


}

class PersonalTask(description:String, isCompleted:Boolean = false,  var place: String ) : Task (description, isCompleted)
class ProfessionalTask(description:String, isCompleted:Boolean = false,  var place: String ) : Task (description, isCompleted)
class AcademicTask(description:String, isCompleted:Boolean = false,  var place: String ) : Task (description, isCompleted)
class FinancialTask(description:String, isCompleted:Boolean = false,  var place: String ) : Task (description, isCompleted)
class CreativeTask(description:String, isCompleted:Boolean = false,  var place: String ) : Task (description, isCompleted)
