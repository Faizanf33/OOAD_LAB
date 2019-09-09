import javax.swing.JOptionPane;

public class StudentView {
    public String viewSetRollNo() {
        return JOptionPane.showInputDialog("Enter Your Roll Number", "17P-6020");
    }

    public String viewSetName() {
        return JOptionPane.showInputDialog("Enter Your Name", "Faizan Ahmad");
    }

    public void viewStudentDetails(String studentRollNo, String studentName) {
        String message = "Student's Detail\nName : " + studentName + "\nRoll No : " + studentRollNo;
        JOptionPane.showMessageDialog(null, message);
    }
}