class Manager {
    val taskList = mutableListOf()
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
            println("8. Print all information of a task")
            println("9. Exit")
            print("Enter your choice")
            var choice = readLine()

            when(choice){
                "1" ->
                "2" ->
                "3" ->
                "4" ->
                "5" ->
                "6" ->
                "7" ->
                "8" ->
                "9" ->{
                    println("Exiting Program")
                    break
                }
                else -> println("Invalid Option, Please try again")
            }

        }
    }
    fun createPersonalTask(){
        var
    }
}