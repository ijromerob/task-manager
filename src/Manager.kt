class Manager {
    val taskList: MutableList<Task> = mutableListOf()
    val personalTask:String = "Personal"
    val professionalTask:String = "Professional"
    val academicTask:String = "Academic"
    val financialTask:String = "Financial"
    val creativeTask:String = "Creative"
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

    fun displayAll(taskList:MutableList<Task>){
        var index = 1
        for(task in taskList){
            print("$index ")
            task.displayDetails()
            index++
        }
    }

    fun changeStatusTask(taskList:MutableList<Task>){


        while (true){
        print("Please enter the number of task you want to change the status ")
        var index : String = readLine()?: "not a number"
        var convertedIndex: Int
            try {
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