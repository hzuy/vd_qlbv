import java.util.Scanner;

public class Staff extends User{
    private String staffId;
Scanner sc = new Scanner(System.in);
    public Staff() {
    }

    public Staff(String name, int age, String phone, String staffId) {
        super(name, age, phone);
        this.staffId = staffId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public void inputData() {
        System.out.println("Nhap ID nhan vien : ");
        this.staffId=sc.nextLine();
        super.inputData();
    }

    @Override
    public void outputData() {
        System.out.println("ID nhan vien : "+this.getStaffId());
        super.outputData();
    }

    public void approveAppointment(){
        System.out.println("Nhan vien dang len lich kham benh !");
    }
    public void editAppointment(){
        System.out.println("Nhan vien dang sua lich kham benh !");
    }


}
