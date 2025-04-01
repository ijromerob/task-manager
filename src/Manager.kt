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
//            println("6. Display all tasks ")
//            println("7. Change the status of a task")
//            println("8. Print all information of a task")
            println("9. Exit")
            print("Enter your choice ")
            var choice = readLine()

            when(choice){
                "1" ->createTask(personalTask)
                "2" ->createTask(professionalTask)
                "3" ->createTask(academicTask)
                "4" ->createTask(financialTask)
                "5" ->createTask(creativeTask)
//                "6" ->
//                "7" ->
//                "8" ->
                "9" ->{
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
}