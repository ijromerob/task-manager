
import java.time.LocalDate

// This class will be the template that other specialized classes will work with
// it takes a description and by default they are not compleated

fun readInfoFromConsole(info):String {
    print("Please enter the $info for this task")
}

fun readTitleFromConsole():String{
    print("Please enter the title for this task: ")
    val newTitle :String = readLine() ?: "A very important task"
    return newTitle

}
fun readDescriptionFromConsole():String{
    print("Please enter the description for this task: ")
    val newDescription : String = readLine() ?: "-No description Provided"
    return newDescription
}

fun readPLaceFromConsole():String{
    print("PLease enter the Place for this task: ")
    val newPlace : String = readLine() ?: "No place was added"
    return newPlace
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

    constructor(): this( readTitleFromConsole(),readDescriptionFromConsole(), readPLaceFromConsole())
    override fun displayCongratulations(){
        println("You are becoming your best self by achieving $title")
    }


}

class ProfessionalTask(title:String, description:String,  var place: String ) : Task (title, description){

    override fun displayCongratulations(){
        println("You are a terrific professional! great job for finishing $title! ")
    }


}

class AcademicTask(title:String, description:String,   var place: String ) : Task (title, description){

    override fun displayCongratulations(){
        println("You are learning so much! good job for finishing $title!")
    }

}

class FinancialTask(title:String, description:String, var place: String ) : Task (title, description){
    override fun displayCongratulations(){
        println("This is very important step for your financial independence! you achieved $title")
    }
}

class CreativeTask(title:String, description:String,  var place: String ) : Task (title, description){
    override fun displayCongratulations(){
        println("This was a great idea! Congratulations finishing $title")
    }
}
