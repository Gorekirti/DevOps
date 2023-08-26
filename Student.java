import java.util.Scanner;

class Student {
    String name;
    double percentage;

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public static void sortStudent(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].percentage < students[j + 1].percentage) {
                  
     Student temp = students[j];
     students[j] = students[j + 1];
                                                                           
       }
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

 Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Percentage: ");
            double percentage = scanner.nextDouble();
            scanner.nextLine(); 
 
students[i] = new Student(name, percentage);
}
Student.sortStudent(students);
System.out.println("\nSorted list of students based on percentage:");
for (Student student : students) {
            System.out.println("Name: " + student.name + ", Percentage: " + student.percentage);
}
// scanner.close();
 
}
}                                                                                                                                                                       
