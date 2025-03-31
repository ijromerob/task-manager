
import java.time.LocalDate

// This class will be the template that other specialized classes will work with
// it takes a description and by default they are not compleated

fun readInfoFromConsole(info:String):String {
    print("Please enter the $info for this task")
    val newField : String = readLine() ?: "No information was provided"
    return newField
}


open class Task(var title:String, var description: String,){

    // The task also creates an inmutable variable to create the creation time
    val creationDate: LocalDate = LocalDate.now()
    var completedDate: LocalDate? = null
    var isCompleted: Boolean = false

    // This function toggles the completion and assigns the completed date
    fun changeStatus(): Unit {
        isCompleted = !isCompleted

        if(isCompleted){

            completedDate = LocalDate.now()
            displayCongratulations()

        }   else {

            completedDate = null

        }


    }

    // This method provides a generic congratulations message when something is finished
    open fun displayCongratulations(): Unit {
        println("Congratulations for the completion!")
    }
}

class PersonalTask(title:String, description:String, var place: String ) : Task (title, description){

    constructor(): this( readInfoFromConsole("title"),readInfoFromConsole("description"), readInfoFromConsole("place"))
    override fun displayCongratulations(){
        println("You are becoming your best self by achieving $title")
    }


}

class ProfessionalTask(title:String, description:String,  var place: String ) : Task (title, description){

    constructor(): this( readInfoFromConsole("title"),readInfoFromConsole("description"), readInfoFromConsole("place"))
    override fun displayCongratulations(){
        println("You are a terrific professional! great job for finishing $title! ")
    }


}

class AcademicTask(title:String, description:String,   var place: String ) : Task (title, description){

    constructor(): this( readInfoFromConsole("title"),readInfoFromConsole("description"), readInfoFromConsole("place"))
    override fun displayCongratulations(){
        println("You are learning so much! good job for finishing $title!")
    }

}

class FinancialTask(title:String, description:String, var place: String ) : Task (title, description){

    constructor(): this( readInfoFromConsole("title"),readInfoFromConsole("description"), readInfoFromConsole("place"))

    override fun displayCongratulations(){
        println("This is very important step for your financial independence! you achieved $title")
    }
}

class CreativeTask(title:String, description:String,  var place: String ) : Task (title, description){

    constructor(): this( readInfoFromConsole("title"),readInfoFromConsole("description"), readInfoFromConsole("place"))gi

    override fun displayCongratulations(){
        println("This was a great idea! Congratulations finishing $title")
    }
}
