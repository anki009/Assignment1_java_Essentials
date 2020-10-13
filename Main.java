 class Main {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.Name = "Ankita";
    e1.Age = 21;
    e1.City = "Mumbai";
    e1.display();


    Employee e2 = new Employee();
    e2.Name = "Athira";
    e2.Age = 24;
    e2.City = "Pune";
    e2.display();
  }
}

/* OUTPUT

java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* Main
My Name is : Ankita
My Age is : 21
I live in : Mumbai
My Name is : Athira
My Age is : 24
I live in : Pune
*/