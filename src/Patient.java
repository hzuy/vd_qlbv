import java.util.Scanner;

public class Patient extends User {
    Scanner sc = new Scanner(System.in);
    private String patientID;
    private String userName;
    private String password;

    public Patient() {
    }

    public Patient(String name, int age, String phone, String patientID, String userName, String password) {
        super(name, age, phone);
        this.patientID = patientID;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void inputData() {
        super.inputData();
        System.out.println("Nhap id benh nhan : ");
        this.patientID=sc.nextLine();
    }

    public void LogIn(){
        System.out.println("Nhap ten tai khoan : ");
        this.userName=sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap mat khau  : ");
        this.password=sc.nextLine();
        sc.nextLine();
    }
    public void LogOut(){
        System.out.println("Ban da dang xuat thanh cong !");
    }

    @Override
    public void outputData() {
        System.out.println("Id benh nhan : "+this.patientID);
        super.outputData();
    }
}
