class Employee (
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int
){
    var fullName: String = fullName
    private set
    var position: String = position
        private set
    var salary: Int = salary
        get() = field
        set(value) {
            if (value < 0) {
                println("Предупреждение: Зарплата не может быть отрицательной! Оставлено старое значение: $field")
            } else {
                field = value
            }
        }
    var yearsOfExperience: Int = yearsOfExperience
        get() = field
        set(value) {
            if (value > 50) {
                println("Предупреждение: Опыт работы не может превышать 50 лет.")
                field = 50
            } else if (value < 0) {
                field = 0
            } else {
                field = value
            }
        }
}
fun main() {
    val emp = Employee("Демиденко Иван Васильевич", "Учитель", 25000, 10)
    println("ФИО: ${emp.fullName}, Позиция: ${emp.position}")
    println("Начальная зарплата: ${emp.salary}, Опыт: ${emp.yearsOfExperience}")
    println("\n--- Попытка установить зарплату -1000 ---")
    emp.salary = -1000
    println("Текущая зарплата: ${emp.salary}")
    println("\n--- Попытка установить опыт 75 лет ---")
    emp.yearsOfExperience = 75
    println("Текущий опыт: ${emp.yearsOfExperience} лет")
}