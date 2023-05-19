data class Task(var name: String, var isDone: Boolean = false) {
    fun markAsDone() {
        isDone = true
    }

    override fun toString(): String {
        val status = if (isDone) "done" else "[]"
        return "$status $name"
    }
}

/**
 * Die Task-Klasse repräsentiert eine einzelne Aufgabe. Sie hat eine Eigenschaft name, die den Namen der Aufgabe speichert, und eine Eigenschaft isDone, die angibt, ob die Aufgabe erledigt ist. Die Methode markAsDone() markiert die Aufgabe als erledigt. Die toString()-Methode gibt eine String-Repräsentation der Aufgabe zurück, die den Status und den Namen der Aufgabe enthält.
 */