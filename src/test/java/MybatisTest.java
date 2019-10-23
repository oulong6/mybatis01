import com.demo.Student;
import com.demo.StudentDaoImpl;

import java.util.List;

public class MybatisTest {
    public static void main(String[] args) {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.studentAll();
        System.out.print(students);
    }
}
