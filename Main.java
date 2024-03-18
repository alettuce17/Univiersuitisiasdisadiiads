// Rogie  G. Samson
// Denzel Villaflores
// Carlo Romel Celis
// Kenneth Zabala
// BSIT 1-B
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Subject subject1 = new Subject("Mathematics", "MATH101", "Introduction to Mathematics", true);
        Subject subject2 = new Subject("Physics", "PHYS101", "Introduction to Physics", true);
        Subject subject3 = new Subject("Biology", "BIO101", "Introduction to Biology", true);
        Subject subject4 = new Subject("Chemistry", "CHEM101", "Introduction to Chemistry", true);
        Subject subject5 = new Subject("English", "ENG101", "Introduction to English Literature", true);

        // Add subjects to the list of subjects
        Subject.addSubject(subject1);
        Subject.addSubject(subject2);
        Subject.addSubject(subject3);
        Subject.addSubject(subject4);
        Subject.addSubject(subject5);

        // Display all subjects
        Subject.displayAllSubjects();
        // Example usage
        Instructor instructor1 = new Instructor("John", "Doe", "123 Street", 35);
        Instructor instructor2 = new Instructor("Jane", "Smith", "456 Avenue", 40);

        // Add instructors to the list
        Instructor.addInstructor(instructor1);
        Instructor.addInstructor(instructor2);

        // Search for an instructor by ID
        String searchId = instructor1.getInstructorId(); // Using the ID of the first instructor
        Instructor foundInstructor = Instructor.findInstructorById(searchId);

        if (foundInstructor != null) {
            System.out.println("Instructor found:");
            System.out.println("Name: " + foundInstructor.getFullName());
            System.out.println("ID: " + foundInstructor.getInstructorId());
            System.out.println("Age: " + foundInstructor.getAge());
            // You can print other details if needed
        } else {
            System.out.println("Instructor not found with ID: " + searchId);
        }
        Student student1 = new Student("John", "Robert", "Smith", "123 Main St", 20);
        Student student2 = new Student("Emily", "Grace", "Johnson", "456 Elm St", 22);
        Student student3 = new Student("Michael", "James", "Brown", "789 Oak St", 21);
        Student student4 = new Student("Sophia", "Elizabeth", "Davis", "321 Pine St", 23);
        Student student5 = new Student("William", "Alexander", "Wilson", "654 Cedar St", 19);
        Student student6 = new Student("Olivia", "Madison", "Taylor", "987 Maple St", 20);
        Student student7 = new Student("Ethan", "David", "Anderson", "135 Birch St", 21);
        Student student8 = new Student("Emma", "Charlotte", "Thomas", "246 Walnut St", 22);
        Student student9 = new Student("Alexander", "Joseph", "Clark", "579 Spruce St", 20);
        Student student10 = new Student("Ava", "Abigail", "Moore", "468 Sycamore St", 21);
        Student student11 = new Student("Matthew", "Christopher", "White", "753 Cherry St", 23);
        Student student12 = new Student("Isabella", "Natalie", "Harris", "864 Ash St", 19);
        Student student13 = new Student("Daniel", "Benjamin", "Martinez", "159 Cedar St", 20);
        Student student14 = new Student("Mia", "Grace", "Robinson", "246 Elm St", 22);
        Student student15 = new Student("Jacob", "Andrew", "Lee", "357 Oak St", 21);
        Student student16 = new Student("Sophie", "Madeline", "Garcia", "468 Pine St", 20);
        Student student17 = new Student("Liam", "Henry", "Miller", "579 Maple St", 22);
        Student student18 = new Student("Charlotte", "Victoria", "Jackson", "681 Birch St", 19);
        Student student19 = new Student("Noah", "William", "Adams", "792 Walnut St", 20);
        Student student20 = new Student("Amelia", "Scarlett", "Cook", "893 Spruce St", 21);
        Student student21 = new Student("James", "Edward", "Evans", "324 Sycamore St", 23);
        Student student22 = new Student("Ella", "Grace", "Perez", "435 Cherry St", 19);
        Student student23 = new Student("Benjamin", "Samuel", "Gonzalez", "546 Ash St", 20);
        Student student24 = new Student("Avery", "Samantha", "Murphy", "657 Cedar St", 22);
        Student student25 = new Student("Lucas", "Nicholas", "Rivera", "768 Elm St", 21);
        Student student26 = new Student("Harper", "Madison", "Collins", "879 Oak St", 20);
        Student student27 = new Student("Logan", "Michael", "Baker", "981 Pine St", 22);
        Student student28 = new Student("Lily", "Isabella", "Rossi", "192 Maple St", 19);
        Student student29 = new Student("Jackson", "Gabriel", "Edwards", "283 Birch St", 20);



        // Add students to the list
        Student.addStudent(student1);
        Student.addStudent(student2);
        Student.addStudent(student3);
        Student.addStudent(student4);
        Student.addStudent(student5);
        Student.addStudent(student6);
        Student.addStudent(student7);
        Student.addStudent(student8);
        Student.addStudent(student9);
        Student.addStudent(student10);
        Student.addStudent(student11);
        Student.addStudent(student12);
        Student.addStudent(student13);
        Student.addStudent(student14);
        Student.addStudent(student15);
        Student.addStudent(student16);
        Student.addStudent(student17);
        Student.addStudent(student18);
        Student.addStudent(student19);
        Student.addStudent(student20);
        Student.addStudent(student21);
        Student.addStudent(student22);
        Student.addStudent(student23);
        Student.addStudent(student24);
        Student.addStudent(student25);
        Student.addStudent(student26);
        Student.addStudent(student27);
        Student.addStudent(student28);
        Student.addStudent(student29);


        Subject subjectA = subject1;
        subjectA.enrollStudent(student1);
        subjectA.enrollStudent(student2);
        subjectA.enrollStudent(student3);
        subjectA.enrollStudent(student4);
        subjectA.enrollStudent(student5);
        subjectA.enrollStudent(student6);
        subjectA.enrollStudent(student7);
        subjectA.enrollStudent(student8);
        subjectA.enrollStudent(student9);
        subjectA.enrollStudent(student10);
        subjectA.enrollStudent(student11);
        subjectA.enrollStudent(student12);
        subjectA.enrollStudent(student13);
        subjectA.enrollStudent(student14);
        subjectA.enrollStudent(student15);
        subjectA.enrollStudent(student16);
        subjectA.enrollStudent(student17);
        subjectA.enrollStudent(student18);
        subjectA.enrollStudent(student19);
        subjectA.enrollStudent(student20);
        subjectA.enrollStudent(student21);
        subjectA.enrollStudent(student22);
        subjectA.enrollStudent(student23);
        subjectA.enrollStudent(student24);
        subjectA.enrollStudent(student25);
        subjectA.enrollStudent(student26);
        subjectA.enrollStudent(student27);
        subjectA.enrollStudent(student28);
        subjectA.enrollStudent(student29);

        // Search for an student by ID
        String searchsId = student1.getStudentId(); // Using the ID of the first student
        Student foundStudent = Student.findStudentById(searchsId);

        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getFullName());
            System.out.println("ID: " + foundStudent.getStudentId());
            System.out.println("Age: " + foundStudent.getAge());
            // You can print other details if needed
        } else {
            System.out.println("Student not found with ID: " + searchsId);
        }

        System.out.println("\n" +
                " __          __    _                                _            _____  __  __  _            _    _         _                         _  _          _     \n" +
                " \\ \\        / /   | |                              | |          |_   _||  \\/  |(_)          | |  | |       (_)                       (_)| |        ( )    \n" +
                "  \\ \\  /\\  / /___ | |  ___  ___   _ __ ___    ___  | |_  ___      | |  | \\  / | _  ___  ___ | |  | | _ __   _ __   __ ___  _ __  ___  _ | |_  _   _|/ ___ \n" +
                "   \\ \\/  \\/ // _ \\| | / __|/ _ \\ | '_ ` _ \\  / _ \\ | __|/ _ \\     | |  | |\\/| || |/ __|/ __|| |  | || '_ \\ | |\\ \\ / // _ \\| '__|/ __|| || __|| | | | / __|\n" +
                "    \\  /\\  /|  __/| || (__| (_) || | | | | ||  __/ | |_| (_) |   _| |_ | |  | || |\\__ \\\\__ \\| |__| || | | || | \\ V /|  __/| |   \\__ \\| || |_ | |_| | \\__ \\\n" +
                "     \\/  \\/  \\___||_| \\___|\\___/ |_| |_| |_| \\___|  \\__|\\___/  _|_____||_|  |_||_||___/|___/ \\____/ |_| |_||_|  \\_/  \\___||_|_  |___/|_| \\__| \\__, | |___/\n" +
                "                                                                                                                                               __/ |      \n" +
                "  _    _                                      _           __    __                                                           _               |___/       \n" +
                " | |  | |       (_)                       (_)| |          |  \\/  |                                                          | |                           \n" +
                " | |  | | _ __   _ __   __ ___  _ __  ___  _ | |_  _   _  | \\  / |  __ _  _ __    __ _   __ _   ___  _ __ ___    ___  _ __  | |_                          \n" +
                " | |  | || '_ \\ | |\\ \\ / // _ \\| '__|/ __|| || __|| | | | | |\\/| | / _` || '_ \\  / _` | / _` | / _ \\| '_ ` _ \\  / _ \\| '_ \\ | __|                         \n" +
                " | |__| || | | || | \\ V /|  __/| |   \\__ \\| || |_ | |_| | | |  | || (_| || | | || (_| || (_| ||  __/| | | | | ||  __/| | | || |_                          \n" +
                "  \\____/ |_| |_||_|  \\_/  \\___||_|   |___/|_| \\__| \\__, | |_|  |_| \\__,_||_| |_| \\__,_| \\__, | \\___||_| |_| |_| \\___||_| |_| \\__|                         \n" +
                "                                                    __/ |                                __/ |                                                            \n" +
                "  _____               __  _  _  _                  |___/              _                 |___/                                                             \n" +
                " |  __ \\             / _|(_)| |(_)                / ____|            | |                                                                                  \n" +
                " | |__) |_ __  ___  | |_  _ | | _  _ __    __ _  | (___   _   _  ___ | |_  ___  _ __ ___                                                                  \n" +
                " |  ___/| '__|/ _ \\ |  _|| || || || '_ \\  / _` |  \\___ \\ | | | |/ __|| __|/ _ \\| '_ ` _ \\                                                                 \n" +
                " | |    | |  | (_) || |  | || || || | | || (_| |  ____) || |_| |\\__ \\| |_|  __/| | | | | |                                                                \n" +
                " |_|    |_|   \\___/ |_|  |_||_||_||_| |_| \\__, | |_____/  \\__, ||___/ \\__|\\___||_| |_| |_|                                                                \n" +
                "                                           __/ |           __/ |                                                                                          \n" +
                "                                          |___/           |___/                                                                                           \n");

        while (true) {
            int choice =-1;
            try {
                System.out.println();
                System.out.println("+==========================================================================================================================+\n" +
                        "│"+padStringMiddle("Options Menu for Managing Instructors, Subjects, and Students",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+\n" +
                        "│"+padStringMiddle(" ",122)+"│\n" +
                        "│"+padStringMiddle("[1] Add",24)+"│" + padStringMiddle("[2] Edit",24)+ "│"+  padStringMiddle("[3] Delete",24)+ "│"+  padStringMiddle("[4] Search",23)+"│"+padStringMiddle("[5] Display",23)+"│\n"+
                        "│"+padStringMiddle(" ",122)+"│\n" +
                        "+==========================================================================================================================+\n" +
                        "\n"+
                        "+==========================================================================================================================+\n" +
                        "│"+padStringMiddle("Menu for Student Enrollment and Subject Assignment Management",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+\n" +
                        "│"+padStringMiddle(" |",122)+"│\n" +
                        "│"+padStringMiddle("[6] Enroll a Student   ",61)+"│" + padStringMiddle("[7] Assign Instructor to a subject  ",60)+"│\n"+
                        "│"+padStringMiddle(" |",122)+"│\n" +
                        "│--------------------------------------------------------------------------------------------------------------------------│\n" +
                        "│"+padStringMiddle(" |",122)+"│\n" +
                        "│"+padStringMiddle("[8] Unenroll a Student",61)+"│" + padStringMiddle("[9] Unassign Instructor to a subject",60)+"│\n"+
                        "│"+padStringMiddle(" |",122)+"│\n" +
                        "+==========================================================================================================================+\n" +
                        "\n"+
                        "+==========================================================================================================================+\n" +
                        "│"+padStringMiddle("View All Records",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+\n" +
                        "│"+padStringMiddle("",122)+"│\n" +
                        "│"+padStringMiddle("[10] Display All Subjects",40)+"│" + padStringMiddle("[11] Display  All Students",40)+"│"+padStringMiddle("[12] Display All Instructors",40)+"│ \n"+
                        "│"+padStringMiddle("",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+\n" +
                        "\n" +
                        "+==========================================================================================================================+\n" +
                        "│"+padStringMiddle("[13]Exit",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+");
                System.out.println("Choose the number you want to do: ");

                choice = sc.nextInt();
                sc.nextLine();
                // Handle the user choice here
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Please enter only integer that you'll choose to do in this program. :)  " );
            }

            switch (choice) {
                case 0:
                    // Go back to the main menu
                    break;
                case 1:
                    // Add
                    switch (options("Add")){
                        case 1:
                            sc.nextLine();
                            addPerson(Student.getRole());
                            System.out.println(Student.getStaticRole()); // Output: Student


                            break;
                        case 2:
                            sc.nextLine();
                            addPerson(Instructor.getRole());
                            break;
                        case 3:
                            System.out.println("add subject");
                            addSubject();
                    }
                    break;
                case 2:
                    // Edit
                    switch (options("Edit")){
                        case 1:
                            // Validate first if there are currently available students
                            if(!Student.students.isEmpty()){
                                editPerson(Student.getRole());
                            }else {
                                sc.nextLine();
                                noInput(Student.getRole());
                            }
                            break;
                        case 2:

                            if(!Instructor.instructors.isEmpty()) {
                                editPerson(Instructor.getRole());
                            }else {
                                sc.nextLine();
                                noInput(Instructor.getRole());
                            }
                            break;
                        case 3:
                            sc.nextLine();
                            if(!Subject.subjects.isEmpty()){
                                editSubject();
                            }else {
                                noInput("Subject");
                            }

                    }
                    break;
                case 3:
                    // Delete
                    switch (options("Delete")){
                        case 1:
                            sc.nextLine();
                            if(!Student.students.isEmpty()){

                                boolean validStudentId = false;

                                String confirmation = "";
                                while (!confirmation.equalsIgnoreCase("no")) {                                    // Prompt the user to input student details
                                    System.out.println("Enter student ID:");
                                    String studentId = sc.nextLine();

                                    // Find the student based on the provided ID
                                    Student student = Student.findStudentById(studentId);
                                    if (student != null) {
                                        System.out.println("Match");
                                        while (true) {
                                            System.out.println("Are you sure you want to delete " + student.getFullName() + "(yes/no)?");
                                            String deleteStudent = sc.nextLine();
                                            if (deleteStudent.equalsIgnoreCase("yes")) {
                                                Student.deleteStudentById(student.getStudentId());
                                                System.out.println("Mr."+student.getLastName()+" deleted.");
                                                while (true) {
                                                    System.out.println("Do you still want to delete a student (yes/no)?");
                                                    confirmation = sc.nextLine();
                                                    if (confirmation.equalsIgnoreCase("yes")) {
                                                        break;
                                                    } else if (confirmation.equalsIgnoreCase("no")) {
                                                        System.out.println("Returning to the main menu.");
                                                        break;
                                                    } else {
                                                        System.out.println("Please enter a valid answer");
                                                    }
                                                }
                                                break;
                                            }else if(deleteStudent.equalsIgnoreCase("no")){
                                                System.out.println("Mr."+student.getLastName()+" not deleted.");
                                                break;
                                            }else {
                                                System.out.println("Please enter a valid answer");
                                            }

                                        }
                                    }else {
                                        while (true) {
                                            System.out.println("Do you still want to delete a student (yes/no)?");
                                            confirmation = sc.nextLine();
                                            if (confirmation.equalsIgnoreCase("yes")) {
                                                break;
                                            } else if (confirmation.equalsIgnoreCase("no")) {
                                                System.out.println("Returning to the main menu.");
                                                break;
                                            } else {
                                                System.out.println("Please enter a valid answer");
                                            }
                                        }
                                    }
                                }
                            }else {
                                noInput(Student.getRole());
                            }

                            break;
                        case 2:

                            System.out.println("delete instructor");
                            sc.nextLine();
                            if(!Student.students.isEmpty()) {


                                Instructor instructor = null;
                                String confirmation = "";
                                while (!confirmation.equalsIgnoreCase("no")) {
                                    // Prompt the user to input instructor details
                                    System.out.println("Enter instructor ID:");
                                    String instructorId = sc.nextLine();

                                    // Find the instructor based on the provided ID
                                    instructor = Instructor.findInstructorById(instructorId);
                                    if (instructor != null) {
                                        System.out.println("Match");
                                        while (true) {
                                            System.out.println("Are you sure you want to delete " + instructor.getFullName() + "(yes/no)?");
                                            String deleteConfirmation = sc.nextLine();
                                            if (deleteConfirmation.equalsIgnoreCase("yes")) {
                                                Instructor.deleteInstructorByID(instructor.getInstructorId());
                                                System.out.println("Mr." + instructor.getLastName() + " deleted.");
                                                while (true) {
                                                    System.out.println("Do you still want to delete a Instructor (yes/no)?");
                                                    confirmation = sc.nextLine();
                                                    if (confirmation.equalsIgnoreCase("yes")) {
                                                        break;
                                                    } else if (confirmation.equalsIgnoreCase("no")) {
                                                        System.out.println("Returning to the main menu.");
                                                        break;
                                                    } else {
                                                        System.out.println("Please enter a valid answer");
                                                    }
                                                }
                                                break;
                                            } else if (deleteConfirmation.equalsIgnoreCase("no")) {
                                                System.out.println("Mr." + instructor.getLastName() + " will not be deleted.");
                                                break;
                                            } else {
                                                System.out.println("Please enter a valid answer");
                                            }
                                        }

                                    }else {
                                        while (true) {
                                            System.out.println("Do you still want to delete a Instructor (yes/no)?");
                                            confirmation = sc.nextLine();
                                            if (confirmation.equalsIgnoreCase("yes")) {
                                                break;
                                            } else if (confirmation.equalsIgnoreCase("no")) {
                                                System.out.println("Returning to the main menu.");
                                                break;
                                            } else {
                                                System.out.println("Please enter a valid answer");
                                            }
                                        }
                                    }
                                }
                            }else {
                                noInput(Instructor.getRole());
                            }
                            break;
                        case 3:

                            if(!Subject.subjects.isEmpty()) {

                                boolean validSubjectId = false;
                                Subject subject = null;
                                while (!validSubjectId) {
                                    // Prompt the user to input subject details
                                    System.out.println("Enter subject ID:");
                                    String subjectId = sc.nextLine();

                                    // Find the subject based on the provided ID
                                    subject = Subject.findSubjectById(subjectId);
                                    if (subject != null) {
                                        System.out.println("Match");
                                        System.out.println("Are you sure you want to delete " + subject.getName() + "?");
                                        Subject.deleteSubjectById(subject.getSubjectId());
                                        validSubjectId = true;
                                    } else {
                                        System.out.println("No match");
                                    }
                                }
                            }else {
                                sc.nextLine();
                                noInput("Subject");
                            }
                            break;
                    }
                    break;
                case 4:
                    // Search by String


                    switch (options("Search")){

                        case 1:
                            if(!Student.students.isEmpty()) {
                                String confirmation;
                                sc.nextLine();
                                do{
                                    System.out.println("Search student:");
                                    Student.searchStudentsByName(search(sc));
                                    do {
                                        System.out.println("Do you still want to search(yes/no)?");
                                        confirmation = sc.nextLine();
                                        if (confirmation.equalsIgnoreCase("yes")) {
                                            System.out.println("Enter another student name you want to search :)");
                                            break;
                                        } else if (confirmation.equalsIgnoreCase("no")) {
                                            System.out.println("Returning to the main menu.");
                                            break;
                                        }else {
                                            System.out.println("Pease enter a valid keyword");
                                        }
                                    }while (true);
                                }while (!confirmation.equalsIgnoreCase("no"));
                            }else {
                                sc.nextLine();
                                noInput(Student.getRole());
                            }
                            break;
                        case 2:
                            sc.nextLine();
                            if(!Instructor.instructors.isEmpty()) {
                                String confirmation;
                                do{
                                    Instructor.searchInstructorsByName(search(sc));
                                    do {
                                        System.out.println("Do you still want to search(yes/no)?");
                                        confirmation = sc.nextLine();
                                        if (confirmation.equalsIgnoreCase("yes")) {
                                            System.out.println("Enter another Instructor's name you want to search :)");
                                            break;
                                        } else if (confirmation.equalsIgnoreCase("no")) {
                                            System.out.println("Returning to the main menu.");
                                            break;
                                        }else {
                                            System.out.println("Pease enter a valid keyword");
                                        }
                                    }while (true);
                                }while (!confirmation.equalsIgnoreCase("no"));
                            }else {
                                noInput(Instructor.getRole());
                            }
                            break;
                        case 3:
                            sc.nextLine();
                            if(!Subject.subjects.isEmpty()){
                                String confirmation;
                                do{
                                    Subject.searchSubjectsByName(search(sc));
                                    do {
                                        System.out.println("Do you still want to search(yes/no)?");
                                        confirmation = sc.nextLine();
                                        if (confirmation.equalsIgnoreCase("yes")) {
                                            System.out.println("Enter another Instructor's name you want to search :)");
                                            break;
                                        } else if (confirmation.equalsIgnoreCase("no")) {
                                            System.out.println("Returning to the main menu.");
                                            break;
                                        }else {
                                            System.out.println("Pease enter a valid keyword");
                                        }
                                    }while (true);
                                }while (!confirmation.equalsIgnoreCase("no"));
                            }else {
                                noInput("Subject");
                            }
                            break;
                    }
                    break;
                case 5:

                    // Display
                    switch (options("Display")){
                        case 1:
                            sc.nextLine();
                            System.out.println("Display student");
                            if(!Student.students.isEmpty()){
                                String confirmation="";
                                do{
                                    Student student = Student.findStudentById(search(sc,Student.getRole()));
                                    if(student!=null){
                                        student.displayInfo();
                                        student.getFullName();

                                        if(student.getTotalEnrolledSubjects()!=0) {
                                            student.displayEnrolledSubjectsTable();
                                        }else {
                                            System.out.println("There are currently no subject enrolled for "+student.getFullName());
                                            if(!Subject.subjects.isEmpty()) {
                                                String enrollSub ="";
                                                while (!enrollSub.equalsIgnoreCase("yes") || !confirmation.equalsIgnoreCase("no")) {

                                                    System.out.println("Do you want to enroll a subject for Mr."+student.getLastName()+" (yes/no)?");
                                                    enrollSub = sc.nextLine();
                                                    if (enrollSub.equalsIgnoreCase("yes")) {
                                                        Subject.displayAllSubjects();
                                                        enrollStudentToSubject(student);
                                                    } else if (enrollSub.equalsIgnoreCase("no")) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true){
                                        System.out.println("Do you still want to display a student(yes/no)?");
                                        confirmation = sc.nextLine();
                                        if (confirmation.equalsIgnoreCase("yes")){
                                            System.out.println();
                                            break;
                                        }else if (confirmation.equalsIgnoreCase("no")){
                                            System.out.println("Returning to Main Menu");
                                            break;
                                        }else {
                                            System.out.println("Please enter a valid answer");
                                        }
                                    }
                                }while (!confirmation.equalsIgnoreCase("no"));
                            }else{
                                noInput(Student.getRole());
                            }
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.println("Display instructor");
                            if(!Instructor.instructors.isEmpty()){
                                String confirmation = "";
                                do {
                                    Instructor instructor = Instructor.findInstructorById(search(sc, Instructor.getRole()));
                                    if (instructor != null) {
                                        instructor.displayInfo();

                                        if (instructor.getSizeOfAssignedSubjectsForInstructor() != 0) {
                                            instructor.displayHandledSubjects();
                                        } else if (instructor.getSizeOfAssignedSubjectsForInstructor() == 0) {
                                            System.out.println("There are currently no subject assigned for " + instructor.getFullName());
                                            String assignSub ="";
                                            if (!Subject.subjects.isEmpty()) {
                                                do {
                                                    System.out.println("Do you want to assign a subject (yes/no)?");
                                                    assignSub = sc.nextLine();
                                                    if (assignSub.equalsIgnoreCase("yes")) {
                                                        assignInstructorToSubject(instructor);
                                                        assignSub.equalsIgnoreCase("no");
                                                    } else {
                                                        while (true) {
                                                            System.out.println("Do you still want to assign a instructor for a Subject?(yes/no)?");
                                                            assignSub = sc.nextLine();
                                                            if (assignSub.equalsIgnoreCase("yes")) {
                                                                break;
                                                            } else if (assignSub.equalsIgnoreCase("no")) {
                                                                System.out.println("Returning to main menu");
                                                                break;
                                                            } else {
                                                                System.out.println("Please enter a valid input");
                                                            }
                                                        }
                                                    }
                                                } while (assignSub.equalsIgnoreCase("yes"));
                                            }
                                        }
                                    }
                                    while (true){
                                        System.out.println("Do you still want to display a instructor (yes/no)?");
                                        confirmation = sc.nextLine();
                                        if (confirmation.equalsIgnoreCase("yes")){
                                            System.out.println();
                                            break;
                                        }else if (confirmation.equalsIgnoreCase("no")){
                                            System.out.println("Returning to Main Menu");
                                            break;
                                        }else {
                                            System.out.println("Please enter a valid answer");
                                        }
                                    }
                                }while (!confirmation.equalsIgnoreCase("no"));
                            }else {
                                noInput(Instructor.getRole());
                            }
                            break;
                        case 3:

                            if(!Subject.subjects.isEmpty()) {
                                sc.nextLine();
                                String confirmation = "";
                                do {
                                    System.out.println("Display enrolled Students in the Subject");
                                    System.out.println("Enter Subject ID:");
                                    String subjectId = sc.nextLine();
                                    Subject subject = Subject.findSubjectById(subjectId);
                                    if (subject != null) {
                                        subject.displaySubjectInformation(subject);
                                        subject.displayEnrolledStudents();
                                    } else {
                                        System.out.println("The subject id does not match to any of the current subjects available.");
                                    }
                                    while (true){
                                        System.out.println("Do you still want to display a Subject (yes/no)?");
                                        confirmation = sc.nextLine();
                                        if (confirmation.equalsIgnoreCase("yes")){
                                            System.out.println();
                                            break;
                                        }else if (confirmation.equalsIgnoreCase("no")){
                                            System.out.println("Returning to Main Menu");
                                            break;
                                        }else {
                                            System.out.println("Please enter a valid answer");
                                        }
                                    }
                                }while (!confirmation.equalsIgnoreCase("no"));

                            }else{
                                sc.nextLine();
                                noInput("Subject");
                            }


                            break;
                    }
                    break;
                case 6:
                    System.out.println("+==========================================================================================================================+");
                    System.out.println("│" + padStringMiddle("Enroll a Student",122)+"│");
                    System.out.println("+==========================================================================================================================+");

                    if(!Student.students.isEmpty() && !Subject.subjects.isEmpty()){
                        String confirmation="";
                        do{
                            System.out.println("Enter Student ID you want to enroll:");
                            String id = sc.nextLine().trim();

                            Student student = Student.findStudentById(id);

                            if (student != null && student.getTotalEnrolledSubjects()<Subject.maxEnrolledSubject) {
                                if (!confirmation.equalsIgnoreCase("yes")&& confirmation.equalsIgnoreCase("yes")) {
                                    break;
                                }
                                do {
                                    Subject.displayAllSubjects();
                                    System.out.println("Enter Subject ID:");
                                    String subjectId = sc.nextLine();
                                    Subject subject = Subject.findSubjectById(subjectId);
                                    if (subject != null && subject.getEnrolledStudents().size() < subject.maxStudentEnrolled ) {
                                        if(!subject.getEnrolledStudents().contains(student)  ) {
                                            subject.enrollStudent(student);
                                            System.out.println("Student enrolled succesfully");

                                        }else {
                                            System.out.println("Student is already enrolled in this subject");
                                        }
                                        while (true) {
                                            System.out.println("Do you still want to enroll a student? (yes/no)");
                                            confirmation = sc.nextLine().trim();
                                            if (confirmation.equalsIgnoreCase("yes")) {
                                                break;
                                            } else if (confirmation.equalsIgnoreCase("no")) {
                                                System.out.println("Returning to main menu");
                                                break;
                                            } else {
                                                System.out.println("Please enter a valid input");
                                            }
                                        }
                                        break;
                                    } else if(subject != null && subject.getEnrolledStudents().size() == subject.maxStudentEnrolled ){
                                        System.out.println("The maximum number of student is reached. Students cannot be added to this subject anymore. :(");
                                    }else if (subject == null) {
                                        System.out.println("Please enter the correct Subject ID you wish to enroll");
                                        Subject.displayAllSubjects();
                                        while (true) {
                                            System.out.println("Do you still want to enroll a student?(yes/no)");
                                            confirmation = sc.nextLine().trim();
                                            if (confirmation.equalsIgnoreCase("yes")) {
                                                break;
                                            } else if (confirmation.equalsIgnoreCase("no")) {
                                                System.out.println("Returning to main menu");

                                                break;
                                            } else {
                                                System.out.println("Please enter a valid input");
                                            }

                                        }
                                    }
                                }while (!confirmation.equalsIgnoreCase("no"));
                            }else if(student != null && student.getTotalEnrolledSubjects()==Subject.maxEnrolledSubject){
                                System.out.println("The student reached the maximum number of subjects can be enrolled");
                                break;
                            } else {
                                while (true) {
                                    System.out.println("Do you still want to enroll a student?(yes/no)");
                                    confirmation = sc.nextLine().trim();
                                    if (confirmation.equalsIgnoreCase("yes")) {
                                        break;
                                    } else if (confirmation.equalsIgnoreCase("no")) {
                                        System.out.println("Returning to main menu");
                                        break;
                                    } else {
                                        System.out.println("Please enter a valid input");
                                    }
                                }
                            }
                        }while (!confirmation.equalsIgnoreCase("no"));
                    }
                    else if(Student.students.isEmpty()&&Subject.subjects.isEmpty()) {
                        System.out.println("There are currently no student and a subject in this program. Please add a student and subject first:)");
                    }
                    else if(Student.students.isEmpty()){
                        System.out.println("There are no available students to be added. Please add a student first:)");
                    }

                    break;
                case 7:
                    System.out.println("+==========================================================================================================================+");
                    System.out.println("│" + padStringMiddle("Assign Instructor to a subject",122)+"│");
                    System.out.println("+==========================================================================================================================+");
                    if(!Student.students.isEmpty() && !Subject.subjects.isEmpty()){
                        String confirm = "";
                        do {
                            System.out.println("Enter Instructor ID you want to be assigned:");
                            String id = sc.nextLine();
                            Instructor instructor = Instructor.findInstructorById(id);

                            if (instructor != null) {
                                assignInstructorToSubject(instructor);
                                while (true) {
                                    System.out.println("Do you still want to assign a instructor(yes/no)?");
                                    confirm = sc.nextLine();
                                    if (confirm.equalsIgnoreCase("yes")) {
                                        break;
                                    } else if (confirm.equalsIgnoreCase("no")) {
                                        System.out.println("Returning to main menu");
                                        break;
                                    } else {
                                        System.out.println("Please enter a valid input");
                                    }
                                }                            }else {
                                while (true) {
                                    System.out.println("Do you still want to assign a instructor(yes/no)?");
                                    confirm = sc.nextLine();
                                    if (confirm.equalsIgnoreCase("yes")) {
                                        break;
                                    } else if (confirm.equalsIgnoreCase("no")) {
                                        System.out.println("Returning to main menu");
                                        break;
                                    } else {
                                        System.out.println("Please enter a valid input");
                                    }
                                }
                            }
                        }while (!confirm.equalsIgnoreCase("no"));
                    }
                    else if (Instructor.instructors.isEmpty() && Subject.subjects.isEmpty()){
                        System.out.println("There are currently no student and a subject in this program. Please add a student and subject first:)");
                    }else if(Instructor.instructors.isEmpty()){
                        System.out.println("There are no available students to be added. Please add a student first:)");
                    } else if (Subject.subjects.isEmpty()) {
                        System.out.println("There are no available subjects to be enrolled. Please add a subject first:)");
                    }

                    break;
                case 8:
                    System.out.println("+==========================================================================================================================+");
                    System.out.println("│" + padStringMiddle("Unenroll a Student",122)+"│");
                    System.out.println("+==========================================================================================================================+");
                    boolean addMore = false;
                    if(Subject.anySubjectHasEnrolledStudents()) {
                        do {

                            System.out.println("Enter the Student's ID you want to enroll:");
                            String id = sc.nextLine();
                            Student student = Student.findStudentById(id);
                            if (student != null && student.getTotalEnrolledSubjects()!=0) {
                                student.displayEnrolledSubjectsTable();
                                System.out.println("Enter the subject ID you want to unenroll:");
                                String subjectId = sc.nextLine();
                                Subject subject = Subject.findSubjectById(subjectId);
                                if (subject != null && subject.getEnrolledStudents().contains(student)) {
                                    while (true) {
                                        System.out.println("Do you really want to unenroll Mr." + student.getLastName() + " to the Subject " + subject.getName() + "(yes/no) ?");
                                        String unenrollST = sc.nextLine();
                                        if (unenrollST.equalsIgnoreCase("yes")) {
                                            subject.unenrollStudent(student);
                                            System.out.println("Succesfully unenrolled " + student.getFullName());
                                            break;
                                        } else if (unenrollST.equalsIgnoreCase("no")) {
                                            System.out.println("Mr." + student.getLastName() + " remains enrolled for the subject " + subject.getName());
                                            break;
                                        } else {
                                            System.out.println("Please enter a valid answer");
                                        }
                                    }
                                }else if(subject != null && !subject.getEnrolledStudents().contains(student)) {
                                    System.out.println("The student is not enrolled in " + subject.getName());
                                }else {
                                    System.out.println("Subject not found");
                                }

                            }else if(student != null && student.getTotalEnrolledSubjects()==0){
                                System.out.println("There are no enrolled subjects for Mr"+student.getLastName());
                            }
                            while (true) {
                                System.out.println("Do you still want to unenroll a student (yes/no)?");
                                String add = sc.nextLine();
                                if (add.equalsIgnoreCase("yes")) {
                                    addMore = true;
                                    break;
                                } else if (add.equalsIgnoreCase("no")) {
                                    addMore = false;
                                    break;
                                } else {
                                    System.out.println("Please enter a valid answer");
                                }
                            }
                        } while (addMore);
                    }else {
                        System.out.println("Please enroll a student first");
                    }
                    break;
                case 9:
                    System.out.println("+==========================================================================================================================+");
                    System.out.println("│" + padStringMiddle("Unassign Instructor to a subject",122)+"│");
                    System.out.println("+==========================================================================================================================+");

                    if(Instructor.anyInstructorHasAssignedSubjects()) {

                        boolean unassignIns = false;
                        do {
                            System.out.println("Enter Subject ID: ");
                            String id = sc.nextLine();
                            Subject subject = Subject.findSubjectById(id);
                            if (subject != null && subject.hasInstructorsAssigned()) {
                                while (true) {
                                    System.out.println("Do you really want to unassign Mr. " + subject.getInstructor().getLastName() + " to " + subject.getName() + " Subject (yes/no)?");
                                    String confirm = sc.nextLine();
                                    if (confirm.equalsIgnoreCase("yes")) {
                                        subject.removeInstructor();
                                        System.out.println("Succesfully unassigned the instructor for " + subject.getName());
                                        break;
                                    } else if (confirm.equalsIgnoreCase("no")) {
                                        System.out.println("Mr." + subject.getInstructor().getLastName() + " remains as the instructor for the subject " + subject.getName());
                                        break;
                                    } else {
                                        System.out.println("Please enter a valid answer");
                                    }
                                }
                            }else if(subject !=  null && !subject.hasInstructorsAssigned()){
                                System.out.println("No instructor assigned to this subject");
                            }else {
                                System.out.println("Subject id not found");
                            }
                            while (true) {
                                System.out.println("Do you still want to unassign an Instructor (yes/no)?");
                                String add = sc.nextLine();
                                if (add.equalsIgnoreCase("yes")) {
                                    unassignIns = true;
                                    break;
                                } else if (add.equalsIgnoreCase("no")) {
                                    unassignIns = false;
                                    break;
                                } else {
                                    System.out.println("Please enter a valid answer");
                                }
                            }

                        } while (unassignIns);
                    }else {
                        System.out.println("Please assign an instructor to a subject first. :)");
                    }
                    break;
                case 10:
                    if (!Subject.subjects.isEmpty()) {
                        Subject.displayAllSubjects();
                    }else {
                        noInput("Subject");
                    }
                    break;

                case 11:

                    if(!Student.students.isEmpty()) {
                        Subject.displayAllStudents();
                    }else {
                        noInput("Student");
                    }
                    break;

                case 12:
                    System.out.println("+==========================================================================================================================+");
                    System.out.println("│" + padStringMiddle("Display All Instructors",122)+"│");
                    System.out.println("+==========================================================================================================================+");

                    if (!Instructor.instructors.isEmpty()) {
                        Instructor.displayAllInstructors();
                    }else {
                        noInput("Instructor");
                    }
                    break;
                case 13:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close(); // Close the scanner
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
    public static String padStringMiddle(String str, int length) {
        if (str.length() >= length) {
            return str;
        } else {
            int spacesToAdd = length - str.length();
            int leftSpaces = spacesToAdd / 2;
            int rightSpaces = spacesToAdd - leftSpaces;
            StringBuilder paddedStr = new StringBuilder();
            for (int i = 0; i < leftSpaces; i++) {
                paddedStr.append(" ");
            }
            paddedStr.append(str);
            for (int i = 0; i < rightSpaces; i++) {
                paddedStr.append(" ");
            }
            return paddedStr.toString();
        }
    }
    private static int options(String option) {
        String paddedOption = padStringMiddle(option, 122); // Adjust the length as needed
        System.out.println("+==========================================================================================================================+");
        System.out.println("|" + paddedOption + "|");
        System.out.println("+==========================================================================================================================+");
        System.out.println("│"+padStringMiddle("",122)+"│");
        System.out.println("│"+ padStringMiddle("[1] Student",30)+"│"+ padStringMiddle("[2] Instructor",30)+"│"+ padStringMiddle("[3] Subject",30)+"│"+ padStringMiddle("[4] Back to Main",29)+"│");
        System.out.println("│"+padStringMiddle("",122)+"│");
        System.out.println("+==========================================================================================================================+");


        System.out.println("Choose the number you want to do:");

        int addChoice = -1;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                addChoice = sc.nextInt();
                if (addChoice < 1 || addChoice > 4) {
                    throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 4.");
                }
                isValidInput = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Invalid input. Please enter a valid number between 1 and 4.");
            }
        }

        return addChoice;
    }

    private static void addPerson(String role) {
        boolean addMore = true;
        while (addMore) {
            String firstName = validateName(sc, "first",false,false);
            String middleName = validateName(sc,"middle",true,false);
            String lastName = validateName(sc, "last",false,false);

            String address;
            do {
                System.out.println("Enter " + role + "'s address:");
                address = sc.nextLine();
            } while (!isValidAddress(address));

            int age;
            while (true) {
                System.out.println("Enter " + role + "'s age:");
                String ageInput = sc.nextLine();
                String confirm = "";
                if (isNumeric(ageInput)) {
                    age = Integer.parseInt(ageInput);
                    if ((role.equalsIgnoreCase(Student.getRole()) && age < 17) || (role.equalsIgnoreCase(Instructor.getRole()) && age < 24)) {
                        System.out.println("Invalid age. " + role + " must be at least " + (role.equalsIgnoreCase(Student.getRole()) ? "17" : "24") + " years old or older.");
                    } else if(age>60){
                        while (true) {
                            System.out.println("Are you sure you are above 60 years old? Please confirm (yes/no):");
                            confirm = sc.nextLine();
                            if (confirm.equalsIgnoreCase("yes")){
                                System.out.println("Thank you for confirming your age.");
                                break;
                            }else if(confirm.equalsIgnoreCase("no")){
                                System.out.println("Please provide your correct age:");
                                break;
                            }else {
                                System.out.println("Please enter a valid answer. ");
                            }
                        }
                        if (confirm.equalsIgnoreCase("yes")){
                            break;
                        }
                    }else {
                        break;
                    }
                } else {
                    System.out.println("Invalid age input. Please enter a valid number.");

                }

            }

            // Prompt for confirmation
            promptForConfirmation(lastName,firstName,middleName,address,age,role);
            String confirm;
            while(true) {
                System.out.println("Do you want to add this " + role + "? (yes/no)");
                confirm = sc.nextLine().toLowerCase();
                if(confirm.equalsIgnoreCase("no")){
                    System.out.println(role+" will not be added.");
                    break;
                }else if(confirm.equalsIgnoreCase("yes")){
                    break;
                }
                else {
                    System.out.println("Please enter a valid answer");
                }
            }
            if (confirm.equals("yes")) {
                if (middleName == null) {
                    if (role.equalsIgnoreCase(Student.getRole())) {
                        // If middle name is not provided, construct student without middle name
                        Student newStudent = new Student(firstName, lastName, address, age);
                        Student.addStudent(newStudent);
                        System.out.println("Mr." + newStudent.getLastName() + " is added as a " + Student.getRole() + " ID:" +newStudent.getStudentId());

                        if (!Subject.subjects.isEmpty()) {
                            String confirmation;
                            System.out.println("There are currently " + Subject.getTotalSubjects() + " subjects");
                            while (true) {
                                System.out.println("Do you want to " + newStudent.getFullName() + " enroll to a subject (yes/no)?");
                                confirmation = sc.nextLine();
                                if(confirmation.equalsIgnoreCase("yes")) {
                                    Subject.displayAllSubjects();
                                    enrollStudentToSubject(newStudent);
                                    break;
                                }else if(confirmation.equalsIgnoreCase("no")){
                                    break;
                                }else {
                                    System.out.println("Please enter a valid answer");
                                }
                            }
                        }


                    } else {
                        Instructor newInstructor = new Instructor(firstName, lastName, address, age);
                        Instructor.addInstructor(newInstructor);
                        System.out.println("Mr." + newInstructor.getLastName() + "is added as a " + Instructor.getRole()+ " ID:" +newInstructor.getInstructorId() );
                        if (!Subject.subjects.isEmpty()) {
                            Subject.displayAllSubjects();
                            assignInstructorToSubject(newInstructor);
                        }
                    }
                } else {
                    if (role.equalsIgnoreCase(Student.getRole())) {
                        // If middle name is provided, construct student with middle name
                        Student newStudent = new Student(firstName, middleName, lastName, address, age);
                        Student.addStudent(newStudent);
                        System.out.println("Mr." + newStudent.getLastName() + " is added as a " + Student.getRole() + " ID:" +newStudent.getStudentId());
                        if (!Subject.subjects.isEmpty()) {
                            String confirmation;
                            System.out.println("There are currently " + Subject.getTotalSubjects() + " subjects");
                            while (true) {
                                System.out.println("Do you want to " + newStudent.getFullName() + " enroll to a subject (yes/no)?");
                                confirmation = sc.nextLine();
                                if(confirmation.equalsIgnoreCase("yes")) {
                                    Subject.displayAllSubjects();
                                    enrollStudentToSubject(newStudent);
                                    break;
                                }else if(confirmation.equalsIgnoreCase("no")){
                                    break;
                                }else {
                                    System.out.println("Please enter a valid answer");
                                }
                            }
                        }
                    } else {
                        Instructor newInstructor = new Instructor(firstName, lastName, address, age);
                        Instructor.addInstructor(newInstructor);
                        System.out.println("Mr." + newInstructor.getLastName() + "is added as a " + Instructor.getRole()+ " ID:" +newInstructor.getInstructorId() );

                        if (!Subject.subjects.isEmpty()) {
                            Subject.displayAllSubjects();
                            assignInstructorToSubject(newInstructor);
                        }
                    }
                }
            }

            while (true){
                System.out.println("Do you want to add another " + role + "? (yes/no)");
                String input = sc.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("no")) {
                    System.out.println("Returning to the main menu.");
                    addMore = false;
                    break;
                }else if(input.equalsIgnoreCase("yes")){
                    System.out.println("Enter new "+role+" details");
                    break;
                }else {
                    System.out.println("Please enter a valid answer");
                }
            }
        }
    }

    private static boolean isValidAddress(String address) {
        // Simple validation, just check if the address is not empty
        return !address.isEmpty();
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static String validateName(Scanner scanner, String role, boolean changeable, boolean forEdit) {
        String name;
        Pattern pattern = Pattern.compile("[a-zA-Z\\s]+"); // R egular expression to allow only letters and spaces

        if (!changeable){

            do {
                System.out.println("Enter your valid " + role + " name:");
                name = scanner.nextLine().trim(); // Trim leading and trailing spaces
                if (forEdit && name.isEmpty()) {

                    return null; // Return null if input is empty and it's for editing
                }
                if (!pattern.matcher(name).matches()) {
                    System.out.println("Please enter a valid name without special characters or numbers.");
                } else {
                    return name;
                }
            } while (!pattern.matcher(name).matches()); // Continue until a valid name is entered
            return name;
        }else {
            do {

                System.out.println("Enter your "+role+" name (leave empty if none):");
                name = scanner.nextLine().trim(); // Trim leading and trailing spaces
                if(name.isEmpty()){
                    return null;
                }
                if (!isValidMiddleName(name)) {
                    if (name.isEmpty()) {
                        break; // If middle name is empty, exit loop
                    }
                    if (!pattern.matcher(name).matches()) {
                        System.out.println("Please enter a valid name without special characters or numbers.))");
                    } else {
                        return name;
                    }
                }
            } while (!pattern.matcher(name).matches());
            return name;
        }
    }


    private static boolean isValidMiddleName(String middleName) {
        return middleName.isEmpty() || middleName.matches("[a-zA-Z\\s]+");
    }

    // Use method overloading to display
    private static void subjectDetails(Subject subject) {
        // Display the student's details including the generated student ID
        System.out.println("Subject details:");
        System.out.println("Name: " + subject.getName());
        System.out.println("Code: " + subject.getCode());
        System.out.println("Description: " + subject.getDescription());
        System.out.println("Subject ID: "+ subject.getSubjectId());
        Instructor assignedInstructor = subject.getInstructor();
        if (assignedInstructor != null) {
            System.out.println("Instructor details:");
            System.out.println("Name: " + assignedInstructor.getFullName());
            System.out.println("ID: " + assignedInstructor.getInstructorId());
        }
    }

    private static void addSubject(){

        sc.nextLine();
        String addMore = "";
        do {
            // Prompt the user to input subject details
            System.out.println("Enter subject details:");
            System.out.print("Name: ");
            String name = sc.nextLine().trim(); // trim to remove leading/trailing whitespace
            while (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter again:");
                name = sc.nextLine().trim();
            }

            System.out.print("Code: ");
            String code = sc.nextLine().trim(); // trim to remove leading/trailing whitespace
            while (code.isEmpty()) {
                System.out.println("Code cannot be empty. Please enter again:");
                code = sc.nextLine().trim();
            }

            System.out.print("Description: ");
            String description = sc.nextLine().trim(); // trim to remove leading/trailing whitespace
            while (description.isEmpty()) {
                System.out.println("Description cannot be empty. Please enter again:");
                description = sc.nextLine().trim();
            }
            Subject subject = new Subject(name.substring(0, 1).toUpperCase() + name.substring(1), code.toUpperCase(), description.substring(0, 1).toUpperCase() + name.substring(1), false);

            while (true) {
                System.out.println("Do you want to add this subject?(yes/no)");
                String addSub = sc.nextLine();
                // Create a new subject object
                if (addSub.equalsIgnoreCase("yes")) {
                    // Add subject to the list of subjects
                    Subject.addSubject(subject);
                    // Display subject details
                    System.out.println("Subject added successfully:");
                    subjectDetails(subject);
                    // Check if there's an instructor assigned to the subject
                    if (!Instructor.instructors.isEmpty()) {
                        int availableInstructorsCount = countAvailableInstructors();

                        // Print the message
                        System.out.println("There are currently " + availableInstructorsCount + " instructors available.");
                        String choice;
                        boolean addInstructor = false;
                        while (addInstructor != true) {
                            try {
                                System.out.println("Would you like to add an instructor? (yes/no)");
                                choice = sc.nextLine();
                                Instructor instructor;
                                if (choice.equalsIgnoreCase("yes")) {
                                    boolean validInstructorId = false;
                                    Subject.displayAvailableInstructors(subject);
                                    while (!validInstructorId) {
                                        // Prompt the user to input instructor details
                                        System.out.println("Enter instructor ID:");
                                        String instructorId = sc.nextLine();
                                        // Find the instructor based on the provided ID
                                        instructor = Instructor.findInstructorById(instructorId);

                                        if (instructor != null) {
                                            subject.setInstructor(instructor);
                                            validInstructorId = true;
                                            addInstructor = true;

                                        } else {
                                            String confirmation;
                                            while (true) {
                                                System.out.println("Do you still want to add (yes/no)?");
                                                confirmation = sc.nextLine();
                                                if (confirmation.equalsIgnoreCase("yes")) {
                                                    System.out.println("Enter the id again");
                                                    break;
                                                } else if (confirmation.equalsIgnoreCase("no")) {
                                                    System.out.println("Returning to the main menu.");
                                                    addInstructor = true;
                                                    break;
                                                } else {
                                                    System.out.println("Please enter a valid input");
                                                }
                                            }
                                            if (confirmation.equalsIgnoreCase("no")) {
                                                System.out.println("Subject saved without an instructor.");
                                                addInstructor = true;
                                                break;
                                            }
                                        }
                                    }
                                } else if (choice.equalsIgnoreCase("no")) {
                                    System.out.println("Subject saved without an instructor.");
                                    break;
                                } else {
                                    System.out.println("Please enter a valid input");
                                }

                            } catch (Exception e) {
                                sc.nextLine();
                                System.out.println("Please enter a valid answer");
                            }
                        }

                    } else {
                        noInput(Instructor.getRole());
                    }
                    break;
                } else if (addSub.equalsIgnoreCase("no")) {
                    System.out.println("Subject " + name.substring(0, 1).toUpperCase() + name.substring(1) + "  not added");
                    break;
                } else {
                    System.out.println("Please enter a valid answer");
                }
            }
            while(true) {
                System.out.println("Do you still want to add a new subject (yes/no)?");
                addMore = sc.nextLine();
                if (addMore.equalsIgnoreCase("yes")) {
                    System.out.println();
                    break;
                } else if (addMore.equalsIgnoreCase("no")) {
                    System.out.println("Returning to Main Menu");
                    break;
                } else {
                    System.out.println("Please enter a valid answer.");
                }
            }


        }while (!addMore.equalsIgnoreCase("no"));

    }


    private static void editPerson(String role) {
        sc.nextLine();
        if (role.equalsIgnoreCase(Student.getRole())) {
            boolean validStudentId = false;
            Student student = null;
            String confirmation ="s";
            while (!confirmation.equalsIgnoreCase("no")) {
                // Prompt the user to input student details
                System.out.println("Enter student ID:");
                String studentId = sc.nextLine();

                // Find the student based on the provided ID
                student = student.findStudentById(studentId);
                if (student != null) {
                    validStudentId = true;
                    System.out.println("Editing student: " + student.getFullName());

                    // Now proceed to edit the student's details
                    System.out.println("Enter new details for the student:");
                    String firstName = validateName(sc, "first", false, true);
                    String middleName = validateName(sc, "middle", true, true);
                    String lastName = validateName(sc, "last", false, true);

                    String address;
                    do {
                        System.out.println("Enter student's address:");
                        address = sc.nextLine();
                        if (address.isEmpty()) {
                            // Return the current address of the student to keep it unchanged
                            address = student.getAddress();
                            break;
                        }
                    } while (!isValidAddress(address));

                    int age;

                    while (true) {
                        System.out.println("Enter student's age (press Enter to keep it unchanged):");
                        String ageInput = sc.nextLine();
                        if (ageInput.isEmpty()) {
                            // Return a default value or perform any other action as needed
                            age = student.getAge(); // Assuming you want to keep the age unchanged
                            break;
                        }
                        if (isNumeric(ageInput)) {
                            age = Integer.parseInt(ageInput);
                            if (age < 17) {
                                System.out.println("Invalid age. Student must be at least 17 years old or older.");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Invalid age input. Please enter a valid number.");
                        }
                    }


                    String confirm;
                    while(true) {
                        System.out.println("Do you want to save the following information(yes/no)?");
                        confirm = sc.nextLine().toLowerCase();
                        if(confirm.equalsIgnoreCase("no")){
                            System.out.println(role+"'s information will not be modified.");
                            break;
                        }else if(confirm.equalsIgnoreCase("yes")){
                            student.setFirstName(firstName);
                            student.setMiddleName(middleName);
                            student.setLastName(lastName);
                            student.setAddress(address);
                            student.setAge(age);
                            student.displayInfo();
                            System.out.println("Student details updated successfully.");
                            break;
                        }
                        else {
                            System.out.println("Please enter a valid answer");
                        }
                    }
                } else {
                    while (true) {
                        System.out.println("Do you still want to search a Student Id (yes/no)?");
                        confirmation = sc.nextLine();
                        if (confirmation.equalsIgnoreCase("yes")) {
                            break;
                        } else if (confirmation.equalsIgnoreCase("no")) {
                            System.out.println("Returning to the main menu.");
                            break;
                        } else {
                            System.out.println("Please enter a valid answer");
                        }
                    }
                }
            }
        }
        else{

            String choice = "";
            while (!choice.equalsIgnoreCase("no") ) {
                // Prompt the user to input instructor details
                System.out.println("Enter instructor ID:");
                String instructorId = sc.nextLine();

                // Find the instructor based on the provided ID
                Instructor instructor = Instructor.findInstructorById(instructorId);
                if (instructor != null) {
                    System.out.println("Editing instructor: " + instructor.getFullName());

                    // Now proceed to edit the instructor's details
                    System.out.println("Enter new details for the instructor:");
                    String firstName = validateName(sc, "first", false, true);
                    String middleName = validateName(sc, "middle", true, true);
                    String lastName = validateName(sc, "last", false, true);

                    String address;
                    do {
                        System.out.println("Enter instructor's address:");
                        address = sc.nextLine();
                        if (address.isEmpty()) {
                            // Return the current address of the student to keep it unchanged
                            address = instructor.getAddress();
                            break;
                        }
                    } while (!isValidAddress(address));

                    int age;

                    while (true) {
                        System.out.println("Enter instructor's age (press Enter to keep it unchanged):");
                        String ageInput = sc.nextLine();
                        if (ageInput.isEmpty()) {
                            // Return a default value or perform any other action as needed
                            age = instructor.getAge(); // Assuming you want to keep the age unchanged
                            break;
                        }
                        if (isNumeric(ageInput)) {
                            age = Integer.parseInt(ageInput);
                            if (age < 24) {
                                System.out.println("Invalid age. Instructor must be at least 24 years old or older.");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Invalid age input. Please enter a valid number.");
                        }
                    }


                    // Update the instructor's details
                    System.out.println("Do you want to save the following information(yes/no)?");
                    String confirmation = sc.nextLine();
                    if (confirmation.equalsIgnoreCase("yes")) {
                        instructor.setFirstName(firstName);
                        instructor.setMiddleName(middleName);
                        instructor.setLastName(lastName);
                        instructor.setAddress(address);
                        instructor.setAge(age);
                        System.out.println("Instructor details updated successfully.");
                    }else{
                        System.out.println();
                    }
                }
                else {
                    choice ="";
                    boolean validInstructorId;
                    while (true) {
                        System.out.println("Do you still want to search a Instructor's Id (yes/no)?");
                        choice = sc.nextLine();
                        if (choice.equalsIgnoreCase("yes")) {
                            break;
                        } else if (choice.equalsIgnoreCase("no")) {
                            validInstructorId = true;
                            System.out.println("Returning to the main menu.");
                            break;
                        } else {
                            System.out.println("Please enter a valid answer");
                        }
                    }
                }
            }
        }

    }
    private static void editSubject(){
        sc.nextLine();
        boolean validSubjectId = false;
        Subject subject = null;
        while (!validSubjectId) {
            // Prompt the user to input subject details
            System.out.println("Enter subject ID:");
            String subjectId = sc.nextLine();

            // Find the subject based on the provided ID
            subject = Subject.findSubjectById(subjectId);
            if (subject != null) {

                System.out.println("Edit");
                // Prompt the user to input subject details
                System.out.println("Enter subject details:");
                System.out.print("Name ("+subject.getName()+"): ");
                String name = sc.nextLine();
                System.out.print("Code ("+subject.getCode()+"): ");
                String code = sc.nextLine();
                System.out.print("Description("+subject.getDescription()+"): ");
                String description = sc.nextLine();
                subject.setName(name);
                subject.setDescription(code);
                subject.setDescription(description);
                validSubjectId = true;
            }else {
                break;
            }

        }
    }
    public static void enrollStudentToSubject( Student newStudent) {
        String confirmation = "";
        if (newStudent != null && newStudent.getTotalEnrolledSubjects()<Subject.maxEnrolledSubject) {
            do {
                System.out.println("Enter the Subject ID You want to Enroll:");
                String subjectId = sc.nextLine();
                Subject subject = Subject.findSubjectById(subjectId);

                if (subject != null && subject.getEnrolledStudents().size() < subject.maxStudentEnrolled) {
                    if (!subject.getEnrolledStudents().contains(newStudent)) {
                        System.out.println(subject.getEnrolledStudents().size());
                        subject.enrollStudent(newStudent);
                        System.out.println("Mr." + newStudent.getLastName() + " enrolled in " + subject.getName());
                    } else {
                        System.out.println("Mr." + newStudent.getLastName() + " is already enrolled in " + subject.getName());
                    }
                    break;
                } else if (subject != null && subject.getEnrolledStudents().size() == subject.maxStudentEnrolled) {
                    System.out.println("The maximum number of student is reached. Students cannot be added to this subject anymore. :(");
                }
                while (true) {
                    System.out.println("Do you still want to enroll to subject (yes/no)?");
                    confirmation = sc.nextLine();
                    if (confirmation.equalsIgnoreCase("no")) {
                        break;
                    } else if (confirmation.equalsIgnoreCase("yes")) {
                        break;
                    } else {
                        System.out.println("Please enter a valid answer");
                    }
                }

            } while (!confirmation.equalsIgnoreCase("no"));
        }else if(newStudent != null && newStudent.getTotalEnrolledSubjects()==Subject.maxEnrolledSubject){
            System.out.println("The student reached the maximum number of subjects can be enrolled");

        }
    }
    public static void assignInstructorToSubject(Instructor newInstructor){
        boolean asssignMore = true;

        do {
            System.out.println("Enter the Subject ID You want to be assigned: ");
            String subjectId = sc.nextLine();
            Subject subject = Subject.findSubjectById(subjectId);
            if (subject != null && !subject.isInstructorAssigned(newInstructor)&&!subject.hasInstructorsAssigned()) {
                while (true) {
                    System.out.println("Do you want to assign Mr." + newInstructor.getLastName() + " to " + subject.getName() + "(yes/no)?");
                    String assign = sc.nextLine();
                    if(assign.equalsIgnoreCase("yes")) {
                        subject.setInstructor(newInstructor);
                        System.out.println("Instructor assigned successfully in " + subject.getName());
                        break;
                    }else if(assign.equalsIgnoreCase("no")){
                        System.out.println("Mr." + newInstructor.getLastName() + " not Added to " + subject.getName());
                        break;
                    }else {
                        System.out.println("Please enter a valid answer.");
                    }
                }
            } else if(subject == null) {
                System.out.println("Subject not found.");
            }else if(subject.isInstructorAssigned(newInstructor)) {
                System.out.println("Instructor is already assigned to this subject.");
            }else if(subject.hasInstructorsAssigned()){
                System.out.println("There are already assigned instructor for this subject " );
            }
            while (true){
                System.out.println("Do you still want to assign a subject for "+newInstructor.getFullName()+" (yes/no)?");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")){
                    System.out.println("Assign Subject");
                    break;
                }else if(choice.equalsIgnoreCase("no")){
                    asssignMore=false;
                    break;
                }else {
                    System.out.println("Please enter a valid answer");
                }
            }
        }while(asssignMore);
    }
    public static String search(Scanner scanner) {
        System.out.println("Enter you want to search:");
        String searchPattern = scanner.nextLine().trim(); // Trim leading and trailing whitespace
        while (searchPattern.isEmpty()) { // Check if the search pattern is empty
            System.out.println("Search cannot be empty. Please enter a valid search pattern:");
            searchPattern = scanner.nextLine().trim(); // Prompt user again
        }
        return searchPattern;
    }
    public static String search(Scanner scanner, String role) {

        System.out.println("Enter the id of the "+role+":");
        String searchPattern = scanner.nextLine().trim(); // Trim leading and trailing whitespace
        while (searchPattern.isEmpty()) { // Check if the search pattern is empty
            System.out.println("Search cannot be empty. Please enter a valid search pattern:");
            searchPattern = scanner.nextLine().trim(); // Prompt user again
        }
        return searchPattern;
    }
    private static int countAvailableInstructors() {
        int count = 0;
        for (Instructor instructor : Instructor.instructors) {
            if (instructor.getSizeOfAssignedSubjectsForInstructor(instructor) < Subject.maxAssignedSubject) {
                count++;
            }
        }
        return count;
    }
    private static void noInput(String role){

        System.out.println("There are no "+role+" added yet.");
        String confirmation = "";
        while (!confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to add a new "+role+" first(yes/no)?");
            confirmation = sc.nextLine();
            if (confirmation.equalsIgnoreCase("yes") && !role.equalsIgnoreCase("Subject")) {
                addPerson(role);
            } else if(confirmation.equalsIgnoreCase("yes") && role.equalsIgnoreCase("Subject")){
                addSubject();
            }else if (confirmation.equalsIgnoreCase("no")) {
                break;
            }else {
                System.out.println("Please enter a valid answer");

            }
        }

    }
    public static void promptForConfirmation(String lastName, String firstName, String middleName, String address, int age, String role) {
        System.out.println("Confirm adding " + role + " with the following details:");
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + (middleName==null ? "N/A" : middleName));
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}
