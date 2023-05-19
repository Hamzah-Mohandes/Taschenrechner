class ToDoList {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun removeTask(task: Task) {
        tasks.remove(task)
    }

    fun markTaskAsDone(task: Task) {
        task.markAsDone()
    }

    fun printTasks() {
        if (tasks.isEmpty()) {
            println("No tasks found.")
        } else {
            for (task in tasks) {
                println(task)
            }
        }
    }
    fun getTaskByName(taskName: String): Task? {
        return tasks.find { it.name == taskName }
    }
}
/*
Die ToDoList-Klasse verwaltet eine Liste von Aufgaben. Sie hat eine private Liste von Task-Objekten. Die Methode addTask(task: Task) fügt eine Aufgabe der To-Do-Liste hinzu. Die Methode removeTask(task: Task) entfernt eine Aufgabe aus der To-Do-Liste. Die Methode markTaskAsDone(task: Task) markiert eine Aufgabe als erledigt. Die Methode printTasks() gibt alle Aufgaben in der To-Do-Liste aus.


 */