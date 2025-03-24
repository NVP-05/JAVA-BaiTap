package ra.validate;

import ra.entity.Student;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentValidator{
    public static String studentIdValidate(Scanner input, String message, String regex){
        while(true){
            System.out.print(message);
            String newStudentId = input.nextLine();
            if(Pattern.matches(regex,newStudentId)){
                return newStudentId;
            }
            System.err.println("Mã sinh viên không đúng định dạng. Vui lòng nhập lại.");
        }
    }

    public static String studentBirtdayValidate(Scanner input, String message, String regex){
        while(true){
            System.out.print(message);
            String newStudentBirthday = input.nextLine();
            if(Pattern.matches(regex, newStudentBirthday)){
                return newStudentBirthday;
            }
            System.err.println("Ngày sinh không đúng định dạng. Vui lòng nhập lại.");
        }
    }

    public static String studentPhoneNumberValidate(Scanner input, String message, String regex){
        while(true){
            System.out.print(message);
            String newStudentPhoneNumber = input.nextLine();
            if(Pattern.matches(regex,newStudentPhoneNumber)){
                return newStudentPhoneNumber;
            }
            System.err.println("Số điện thoại không đúng định dạng. Vui lòng nhập lại.");
        }
    }

    public static boolean studentSexValidate(Scanner input, String message){
        while(true){
            System.out.printf(message);
            String newGender = input.nextLine();
            switch(newGender){
                case "Nam":
                    return true;
                case "Nữ":
                    return false;
                default:
                    System.err.println("Giới tính không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public static String studentEmailValidate(Scanner input, String message, String regex){
        while(true){
            System.out.print(message);
            String newEmail = input.nextLine();
            if(Pattern.matches(regex,newEmail)){
                return newEmail;
            }
            System.err.println("Email không hợp lệ. Vui lòng nhập lại.");
        }
    }

    public static int studentStatusValidate(Scanner input, String message){
        while(true){
            System.out.print(message);
            String newStatus = input.nextLine();
            switch(newStatus){
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
                default:
                    return 1;
            }
        }
    }
    public static boolean isUniqueStudentNameValidate(String studentName, Student[] students, StudentIndex studentIndex){
        for(int i = 0; i < studentIndex.currentIndex; i++){
            if(studentName.equals(students[i].getStudentName())){
                return true;
            }
        }
        return false;
    }
}
