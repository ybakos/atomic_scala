
case class Task(description: String = "description", priority: Int = 1)

class ToDoList { 
  private var list: Vector[Task] = Vector.empty
  def add(task: Task) = { list = list :+ task }
  def tasks = list.sortBy(x => x.priority) // How you look at the list
  def completed(completedTask: Task) = {
    list = list.filterNot((task) => task == completedTask)
  }
  override def toString = "ToDoList(" + list.mkString(", ") + ")"
}

object ToDoList {
  def apply(tasks: Task*) : ToDoList = {
    val result = new ToDoList()
    for(task <- tasks) {
      result.add(task)
    }
    result
  }
}

val list = ToDoList(Task("Foo", 3), Task("Bar", 2), Task("Baz", 1))

println(list)
list.add(Task("Milk", 1))
println(list)
val tasks = list.tasks
println(tasks)
list.completed(tasks.head)
println(list)
