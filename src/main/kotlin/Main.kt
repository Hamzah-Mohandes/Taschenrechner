fun main(args: Array<String>) {
    val toDoList = ToDoList()
    var exit = false
    while (!exit){
        println ("choose a  action ")
        println ("1. add a task")
       println ("2. remove a task")
        println ("3. Mark task as done")
        println ("4. print taskes ")
        println ("5. exit")
      //  val action = readLine()!!.toInt()// ein model readln() oder
        when (readln()){
            "1" -> {
                println ("Enter task name : ")
                val taskName = readln()
                val task = Task(taskName)
                toDoList.addTask(task)
                println("task added .")

            }
            "2" -> {
             println ("Enter task name : ")
             val taskName = readln()
             val task = Task(taskName)
             toDoList.removeTask(task)
             println("task removed .")
            }
            "3" -> {
               println ("Enter task name : ")
               val taskName = readln()
                val task = toDoList.getTaskByName(taskName)
                if (task != null){
                    println("Task market as Done")
                } else {
                    println("Task not found")
                }
            }
            "4" -> {
                println ("Tasks : ")
                toDoList.printTasks()
            }
            "5" -> {
                exit = true
                println("bye")
            }else -> println("Invalid choice Please try again")

        }        }
}

