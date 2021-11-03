package Interface_abs_Exception_Handling;


import java.util.Scanner;
class InvalidAgeForDrivingLicenseException extends Exception{
    public InvalidAgeForDrivingLicenseException(String str){
        super(str);
    }
}
class InvalidMarkForDrivingLicenseException extends Exception{
    public InvalidMarkForDrivingLicenseException(String str){
        super(str);
    }
}

public class custom_exception_10 {
    static boolean flag1 = false;
    static boolean flag2 = false;
    public static void ValidateAge(int age) throws InvalidAgeForDrivingLicenseException{
        if(age > 0 && age < 18){
            throw  new InvalidAgeForDrivingLicenseException("Age should be more than 18");

        }
        else if(age < 1){
            System.out.println(("InvalidAgeForDrivingLicenseException: Invalid age"));
        }
        else{
            flag1 = true;
        }
    }
    public static void ValidateMark(int mark) throws InvalidMarkForDrivingLicenseException{
        if(mark > 0 && mark < 18){
            throw  new InvalidMarkForDrivingLicenseException("Age should be more than 18");

        }
        else if(mark < 1){
            System.out.println(("InvalidMarkForDrivingLicenseException: Invalid mark"));
        }
        else{
            flag2 = true;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        int age = sc.nextInt();
        int mark = sc.nextInt();
        try{
            ValidateAge(age);
        }catch(InvalidAgeForDrivingLicenseException e){
            System.out.println("InvalidAgeForDrivingLicenseException: Age should be more than 18");
        }
        try{
            ValidateMark(mark);
        }catch(InvalidMarkForDrivingLicenseException e){
            System.out.println("InvalidMarkForDrivingLicenseException: Mark should be more than 80");
        }
        if(flag1 && flag2){
            System.out.println("Approved");
        }
    }
}
