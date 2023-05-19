class TaskManager {
    private val tasks = mutableListOf<Task>()

    fun createTask(name: String): Task {
        val task = Task(name)
        tasks.add(task)
        return task
    }

    fun editTask(task: Task, newName: String) {
        task.name = newName
    }

    fun deleteTask(task: Task) {
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
}
/*
Die TaskManager-Klasse bietet erweiterte Funktionen zum Verwalten von Aufgaben. Sie hat eine private Liste von Task-Objekten. Die Methode createTask(name: String) erstellt eine neue Aufgabe mit dem angegebenen Namen und fügt sie dem Aufgabenmanager hinzu. Die Methode editTask(task: Task, newName: String) bearbeitet den Namen einer Aufgabe. Die Methode deleteTask(task: Task) löscht eine Aufgabe. Die Methode markTaskAsDone(task: Task) markiert eine Aufgabe
 */