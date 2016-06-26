package com.company;

import java.util.Scanner;

/**
 * Created by apple on 19-Jun-16.
 */
public class University {
    Teacher t;
    Student s;
    Teacher teacher[] = new Teacher[10];
    Student student[] = new Student[10];
    int teacherIndex = 0;
    int studentIndex = 0;
    Scanner getval = new Scanner(System.in);
//    public void addTeacher(){};
//    public void addStudent(){};
//    public void serachTeacher(){};
//    public void serachStudent(){};
//    public void listOfTeacher(){};
//    public void listOfStudent(){};
//    public void deleteTeacher(){};
//    public void deleteStudent(){};
//    public void modifyTeacher(){};
//    public void modifyStudent(){};
//    public void quit(){};
    

    private void initializeTeacher(){
        t = new Teacher();
        t.setName("Sir Zeeshan");
        t.setAge(29);
        t.setContact("012345");
        t.setCourse("java");
        t.setId(1);
        t.setExperience("TenYear");
        saveTeacher(t);

        t.setId(2);
        t = new Teacher();
        t.setName("Aziz Bhae");
        t.setAge(23);
        t.setContact("012345");
        t.setCourse("java");
        t.setExperience("oneYear");
        saveTeacher(t);

    }

    public  void addTeacher(){
        t = new Teacher();
        System.out.println("Name : ");
        String name = getval.next();
        t.setName(name);
        System.out.println("Id : ");
        int id = getval.nextInt();
        t.setId(id);
        System.out.println("Age : ");
        int age = getval.nextInt();
        t.setAge(age);
        System.out.println("Experience  : ");
        String exp = getval.next();
        t.setExperience(exp);
        System.out.println("Course : ");
        String course = getval.next();
        t.setCourse(course);
        System.out.println("Contact # : ");
        String cnt = getval.next();
        t.setContact(cnt);

        saveTeacher(t);

    }

    private void saveTeacher(Teacher t) {
        teacher[teacherIndex++] = t;
    }

    private void addstudent(){
        s= new Student();
        System.out.println("Name : ");
        String name = getval.next();
        s.setName(name);
        System.out.println("Age : ");
        int age = getval.nextInt();
        s.setAge(age);
        System.out.println("Last Education : ");
        String ledu = getval.next();
        s.setLasteducation(ledu);
        System.out.println("Roll# : ");
        int roll = getval.nextInt();
        s.setRollnum(roll);
        System.out.println("Contact # : ");
        String cnt = getval.next();
        s.setContact(cnt);
        saveStudent(s);

    }

    private void saveStudent(Student s) {
        student[studentIndex++] = s;
    }

    public void searchTeacher(int id){
        boolean find = false;
        for(int i = 0; i < teacherIndex; i++) {
            if (teacher[i] != null && teacher[i].getId() == id) {
                System.out.println("Name : " + teacher[i].getName() +
                        " \nAge : "+teacher[i].getAge() +"\nExperience : "+ teacher[i].getExperience()+
                        "\nCourse :" + teacher[i].getCourse() +"\nContact# : "+ teacher[i].getContact());
                find = true;
                break;
            }
        }
        if(find == false && teacher.length != 0){
                System.out.println("Not Found...");
            }

        }

    public void searchStudent(int rollnum){
        boolean find = false;
        for(int i = 0; i < studentIndex; i++){
            if(student[i] != null && rollnum == student[i].getRollnum()){
                System.out.println("Name : " + student[i].getName() +
                 "\nAge : " + student[i].getAge() + "\nRoll# : "+student[i].getRollnum() +
                "\nLast Education : " + student[i].getLasteducation()+ "\nContact : " + student[i].getContact());
                find = true;
                break;
            }}
            if(find == false && student.length != 0){
                System.out.println("Not Found...");
            }

    }
    public void showALLTeacher(){
        if(teacherIndex > 0 ){
            System.out.println("\t ID NAME \t AGE \t EXPERIENCE \t COURSE \t CONTACT");
        for(int i = 0; i< teacherIndex; i++){
              if(teacher[i] != null){
                System.out.println("\t "+teacher[i].getId()+"\t"+teacher[i].getName()+" \t"+teacher[i].getAge()+" \t"+teacher[i].getExperience()+"\t"+
                        teacher[i].getCourse()+"\t"+teacher[i].getContact());

        }}
        }
        else {
            System.out.println("Empty List..");
        }
    }
    public void showALLStudent(){
        if(studentIndex > 0){
            System.out.println("\t NAME \t AGE \t ROLL# \t LAST EDU \t CONTACT");
            for(int i = 0; i< studentIndex; i++){
                System.out.println("\t "+student[i].getName()+"\t"+student[i].getAge()+" \t"+student[i].getRollnum()+" \t"+student[i].getLasteducation()+"\t"+
                        student[i].getContact());

            }
        }
        else {
            System.out.println("Empty List..");
        }
    }
    public void deleteTeacher(int id){
        boolean find = false;
        int i = 0;
        for(i =0 ; i < teacherIndex; i++) {
            if ( teacher[i].getId() == id) {
                System.out.println("Name : " + teacher[i].getName() +
                        " \nAge : "+teacher[i].getAge() +"\nExperience : "+ teacher[i].getExperience()+
                        "\nCourse :" + teacher[i].getCourse() +"\nContact# : "+ teacher[i].getContact());
                find = true;
                break;

            }
        }
        if(find == false && teacher.length != 0){
            System.out.println("Not Found...");
        }
        else {
            System.out.println("Are Sure To Delte y/n : ");
            String choice = getval.next();
            if (choice.equalsIgnoreCase("y")) {
                teacher[i] = null;
                teacherIndex -= 1;
            }
            }
        }

    public void deleteStudent(int rollnum){
        boolean find = false;
        int i = 0;
        for(i =0 ; i < studentIndex; i++){
            if(rollnum == student[i].rollnum){
                System.out.println("Name : " + student[i].getName() +
                        "\nAge : " + student[i].getAge() + "\nRoll# : "+student[i].getRollnum() +
                        "\nLast Education : " + student[i].getLasteducation()+ "\nContact : " + student[i].getContact());
                find = true;
                break;
            }}
        if(find == false && student.length != 0){
            System.out.println("Not Found...");
        }
        else {
            System.out.println("Are Sure To Delte y/n : ");
            String choice = getval.next();
            if (choice.equalsIgnoreCase("y")) {
                student[i] = null;
                studentIndex -= 1;
            }
        }
    }

    public void modifyTeacher(int id) {
        boolean find = false;
        int i = 0;

        if(teacherIndex > 0) {
            for (i = 0; i < teacherIndex; i++) {
                if (teacher[i].getId() == id) {
                    System.out.println("Name : " + teacher[i].getName() +
                            " \nAge : " + teacher[i].getAge() + "\nExperience : " + teacher[i].getExperience() +
                            "\nCourse :" + teacher[i].getCourse() + "\nContact# : " + teacher[i].getContact());
                    find = true;
                    break;
                }}
            if (find == false && teacher.length != 0) {
                System.out.println("Not Found...");
            } else {
                System.out.println("Are Sure To Modify y/n : ");
                String choice = getval.next();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.println("Experence : ");
                    String exp = getval.next();
                    teacher[i].setExperience(exp);
                    System.out.println("Course : ");
                    String cur = getval.next();
                    teacher[i].setCourse(cur);
                    System.out.println("Contact# : ");
                    String cnt = getval.next();
                    teacher[i].setContact(cnt);
                }}}
        else
        {
            System.out.println("Empty..");
        }}
    public void modifyStudent(int rollnum) {
        boolean find = false;
        int i = 0;
        if (studentIndex > 0) {
            for (i = 0; i < studentIndex; i++) {
                if (rollnum == student[i].rollnum) {
                    System.out.println("Name : " + student[i].getName() +
                            "\nAge : " + student[i].getAge() + "\nRoll# : " + student[i].getRollnum() +
                            "\nLast Education : " + student[i].getLasteducation() + "\nContact : " + student[i].getContact());
                    find = true;
                    break;
                }
            }
            if (find == false && student.length != 0) {
                System.out.println("Not Found...");
            } else {
                System.out.println("Are Sure To Modify y/n : ");
                String choice = getval.next();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.println("Last Educaton : ");
                    String ledu = getval.next();
                    student[i].setLasteducation(ledu);
                    System.out.println("Contact : ");
                    String cnt = getval.next();
                    student[i].setContact(cnt);
                }
            }
        }
    }


    public void menu() {
        initializeTeacher();
        while (true) {
            System.out.println("\n\n\n");
            System.out.println("1. Add Teacher");
            System.out.println("2. Add Student");
            System.out.println("3. Search Teacher");
            System.out.println("4. Search Student");
            System.out.println("5. Modify Teacher");
            System.out.println("6. Modify Student");
            System.out.println("7. Delete Teacher");
            System.out.println("8. Delete Student");
            System.out.println("9. Show All Teacher");
            System.out.println("10.Show All Student");
            System.out.println("11.Quit");
            System.out.println("Select : ");
            int select = getval.nextInt();
            switch (select) {
                case 1: {
                    System.out.println(" Add Teacher");
                    addTeacher();

                }
                break;

                case 2: {
                    System.out.println(" Add Student");
                    addstudent();
                }
                break;
                case 3: {
                    if(teacherIndex > 0) {

                        System.out.println("Search Teacher");
                        System.out.println("Enter ID :");
                        int id = getval.nextInt();
                        searchTeacher(id);
                    }else
                    {
                        System.out.println("Empty...");
                    }

                }
                break;
                case 4: {
                    if(studentIndex > 0) {

                        System.out.println(" Search Student");
                        System.out.println("Enter Roll Number : ");
                        int roll = getval.nextInt();
                        searchStudent(roll);
                    }
                    else
                    {
                        System.out.println("Empty..");
                    }
                }
                break;
                case 5: {

                    if(teacherIndex > 0) {
                        System.out.println(" Modify Teacher");
                        System.out.println("Enter Id :");
                        int id = getval.nextInt();
                        modifyTeacher(id);
                    }
                    else
                    {
                        System.out.println("Empty...");
                    }
                }
                break;
                case 6: {
                    if(studentIndex > 0) {

                        System.out.println("Modify Student");
                        System.out.println("Enter Roll#:");
                        int roll = getval.nextInt();
                        modifyStudent(roll);

                    }else
                    {
                        System.out.println("Empty..");
                    }
                }
                break;
                case 7: {
                    System.out.println("Delete Teacher");
                    System.out.println("Enter Id :");
                    int id = getval.nextInt();
                    deleteTeacher(id);

                }
                break;
                case 8: {
                    System.out.println("Delete Student");
                    System.out.println("Enter Roll :");
                    int roll = getval.nextInt();
                    deleteStudent(roll);
                }
                break;
                case 9: {
                    System.out.println("\t\t Show All Teacher");
                    showALLTeacher();
                }
                break;
                case 10: {
                    System.out.println("\t\t Show All Student");
                    showALLStudent();

                }
                break;
                case 11: {
                    return;
                }

            }
        }
    }
}