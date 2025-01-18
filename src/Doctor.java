import java.util.Scanner;

public class Doctor extends User{
    private String DoctorId;
    private String Specialization;

    Scanner sc=new Scanner(System.in);
    //constructor
    public Doctor() {
    }

    public Doctor(String name, int age, String phone, String doctorId, String specialization) {
        super(name, age, phone);
        DoctorId = doctorId;
        Specialization = specialization;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String doctorId) {
        DoctorId = doctorId;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    @Override
    public void inputData() {
        System.out.println("Nhap id bac si : ");
        this.DoctorId=sc.nextLine();
        super.inputData();
        System.out.println("Nhap chuyen khoa : ");
        this.Specialization=sc.nextLine();

    }

    @Override
    public void outputData() {
        System.out.println("ID bac si : "+this.getDoctorId());
        super.outputData();
        System.out.println("Chuyen khoa : "+this.getSpecialization());
    }

    public void Schedule(){
        System.out.println("Ngay lam viec : T2-T6");
        System.out.println("Gio lam viec : 7h00-17h00");
    }
}
