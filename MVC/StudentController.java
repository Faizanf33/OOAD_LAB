public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentDetails() {
        model.setName(view.viewSetName());
        model.setRollNo(view.viewSetRollNo());
    }

    public void updateView() {
        view.viewStudentDetails(model.getRollNo(), model.getName());
    }
}