data class Task(val name : String, var isDone : Boolean = false) {
    fun markAsDone() {
        isDone = true
    }
override fun toString(): String{

}
}