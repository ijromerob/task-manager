class Manager {
//    initializes a tasklist
    val taskList: MutableList<Task> = mutableListOf()

//    Initializes values that will work to ensure correct assignment of when
    val personalTask:String = "Personal"
    val professionalTask:String = "Professional"
    val academicTask:String = "Academic"
    val financialTask:String = "Financial"
    val creativeTask:String = "Creative"

//    Function start emcopases the whole experience that the user will see in the console
    fun start(){

        while(true){
            println("Please choose one of the following options")
            println("1. Create a Personal Task")
            println("2. Create a Professional Task")
            println("3. Create a Academic Task")
            println("4. Create a Financial Task")
            println("5. Create a Creative Task")
            println("6. Display all tasks ")
            println("7. Change the status of a task")
            println("8. Exit")
            print("Enter your choice ")
            var choice = readLine()

//            with When operator the correct create task is performed
            when(choice){

                "1" ->createTask(personalTask)
                "2" ->createTask(professionalTask)
                "3" ->createTask(academicTask)
                "4" ->createTask(financialTask)
                "5" ->createTask(creativeTask)
                "6" -> displayAll(taskList)
                "7" ->changeStatusTask(taskList)
                "8" ->{
                    println("Exiting Program")
                    break
                }
                else -> println("Invalid Option, Please try again")
            }

        }
    }
//    ensures to create a correct task and to add it to the task list
    fun createTask(choice: String){
        val newTask: Task = when(choice){
            personalTask -> PersonalTask()
            professionalTask -> ProfessionalTask()
            academicTask -> AcademicTask()
            financialTask -> FinancialTask()
            creativeTask -> CreativeTask()
            else -> throw IllegalArgumentException("Invalid task type")
        }
        taskList.add(newTask)
    }

//    this function iterates through the list of tasks and displays them in order
    fun displayAll(taskList:MutableList<Task>){
        var index = 1
        for(task in taskList){
            print("$index ")
            task.displayDetails()
            index++
        }
    }

//    The status task changes the status of one task based on the position of the task in the tasklist
    fun changeStatusTask(taskList:MutableList<Task>){


        var convertedIndex: Int
        var index : String
        while (true){
            try {
                print("Please enter the number of task you want to change the status ")
                index = readLine()?: "not a number"
                convertedIndex = index.toInt() - 1
                taskList[convertedIndex].changeStatus()
                break
            } catch (error: Error) {
                println(error)
                println("Please try again")
            }
        }

    }
}