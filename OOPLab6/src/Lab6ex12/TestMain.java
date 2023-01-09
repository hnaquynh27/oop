package Lab6ex12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestMain {
    public static void main(String[] args) {
        Student stu1 = new Student("Quanh", "KTX", "Data", 2022, 5);
        System.out.println("Student info: name=" + stu1.getName() + " address=" + stu1.getAddress() + " program=" + stu1.getProgram() + " year=" + stu1.getYear() + " fee=" + stu1.getFee());

        Staff staff1 = new Staff("Thuy", "Uni", "HUS", 6);
        staff1.setPay(9);
        System.out.println(staff1.toString());
    }
}
