import java.util.ArrayList;
import java.util.List;

public class SchoolLOD {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //输出学院的教师id和学生id
        teacher.printPeople(new Student());
    }
}

//学校教师类
class EmployeeDTO {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的学生类
class StudentDTO {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院学生管理类
class Student {
    //返回学院的所有学生
    public List<StudentDTO> getAllEmployee() {
        List<StudentDTO> list = new ArrayList<>();
        //增加 10 个员工到 list
        for (int i = 0; i < 10; i++) {
            StudentDTO stu = new StudentDTO();
            stu.setId("学院学生id= " + i);
            list.add(stu);
        }
        return list;
    }

    public void printStudent(){
        //获取到学院员工
        List<StudentDTO> list1 = getAllEmployee();
        System.out.println("------------学院学生------------");
        for (StudentDTO e : list1) {
            System.out.println(e.getId());
        }
    }
}


//教师管理类
class Teacher {
    //返回学校教师
    public List<EmployeeDTO> getAllEmployee() {
        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
        //增加 5 个员工到 list
        for (int i = 0; i < 5; i++) {
            EmployeeDTO emp = new EmployeeDTO();
            emp.setId("学校教师id= " + i);
            list.add(emp);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息(id)
    void printPeople(Student sub) {

        //将输出学院学生方法，封装到 Student
        sub.printStudent();

        //获取到学校总部员工
        List<EmployeeDTO> list2 = this.getAllEmployee();
        System.out.println("------------学校教师------------");
        for (EmployeeDTO e : list2) {
            System.out.println(e.getId());
        }
    }
}
