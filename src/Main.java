import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Manas","cool.mega007@gmail.com",27);
        Student student2 = new Student("Matmusa","matmusa@gmail.com",22);
        Student student3 = new Student("Nurseit","nurseit@gmail.com",20);
        Student student4 = new Student("Samat","matmusa9@gmail.com",39);
        Student student5 = new Student("Mirbek","mirbek@gmail.com",17);
        Student student6 = new Student("Ulan","ulan@gmail.com",24);
        Student student7 = new Student("Chyngyz","nurseit@gmail.com",28);
        Student student8 = new Student("Bek","bek@gmail.com",22);
        Student student9 = new Student("Erjigit","erjigit@gmail.com",21);
        Student student10 = new Student("Torogeldi","torogeldi@gmail.com",18);

        Student[] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};

        ArrayList<Student>list = new ArrayList<>();
        list.add(student9);

        int counter1 = 0;
        try {
            for (int i = 0; i < students.length; i++) {
                counter1++;
                if (list.equals(students[i])){
                    throw new Exception("There is same email address");
                }else {
                    list.add(students[i]);
                }
               /* for (Student student : list) {
                    if (student.getEmail().equals(students[i].getEmail())) {
                        throw new Exception("There is same email address");
                    } else {
                        list.add(students[i]);

                    }
                }*/
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("first method"+list);
        System.out.println(counter1);

        int counter =0;
        try {
            for (Student lists : list) {
                System.out.println(counter);
                if (lists.getEmail().equals(student1.getEmail())) {
                    throw new Exception("There is same email address");
                }else {
                    list.add(student1);
                }
                if (lists.getEmail().equals(student3.getEmail())){
                    throw new Exception("There is same email address");
                }else {
                    list.add(student3);
                }
                if (lists.getEmail().equals(student4.getEmail())){
                    throw new Exception("There is same email address");
                }else {
                    list.add(student4);
                }
                if (lists.getEmail().equals(student5.getEmail())){
                    throw new Exception("There is same email address");
                }else {
                    list.add(student5);
//                    System.out.println("work " + list.size());
//                    System.out.println(list);
                }
                if (lists.getEmail().equals(student6.getEmail())){
                    throw new Exception("There is same email address");
                }else {
                    list.add(student6);
                }
                if (lists.getEmail().equals(student7.getEmail())){
                    throw new Exception("There is same email address");
                }else {
                    list.add(student7);
                }
                if (lists.getEmail().equals(student8.getEmail())){
                    throw new Exception("There is same email address");
                }else {
                    list.add(student8);
                }
                if (lists.getEmail().equals(student9.getEmail())){
                    throw new Exception("There is same email address");
                }else {
//                    System.out.println("work1 " + list.size());
                    list.add(student9);
                }
                if (lists.getEmail().equals(student10.getEmail())){
                    throw new Exception("There is same email address");
                }else {
                    list.add(student10);
                }
            }
            counter ++;
            System.out.println(counter);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(list);

    }
}