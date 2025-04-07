package edu.cqnu.demospdb;

import edu.cqnu.demospdb.mapper.CourseMapper;
import edu.cqnu.demospdb.mapper.StudentMapper;
import edu.cqnu.demospdb.mapper.TeacherMapper;
import edu.cqnu.demospdb.model.Course;
import edu.cqnu.demospdb.model.Student;
import edu.cqnu.demospdb.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemospdbApplicationTests {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Test
    void getAllStudents() {
        List<Student> students = studentMapper.selectList(null);
    }
    @Test
    void getAllTeachers() {
        List<Teacher> teachers = teacherMapper.selectList(null);
    }
    @Test
    void getAllCourses() {
        List<Course> courses = courseMapper.selectList(null);
    }

    @Test
    void testAddStudent() {
        Student student = new Student(1040, "张三", 20);
        studentMapper.insert(student);
    }

    @Test
    void testUpdateStudent() {
        Student student = studentMapper.selectById(1040);
        student.setAge(25);
        studentMapper.updateById(student);
    }

    @Test
    void testDeleteStudent() {
        studentMapper.deleteById(1040);
    }

    @Test
    void testAddTeacher() {
        Teacher teacher = new Teacher(null, "李四", "教授");
        teacherMapper.insert(teacher);
    }

    @Test
    void testUpdateTeacher() {
        // 假设数据库中已有ID为1的教师记录
        Teacher teacher = teacherMapper.selectById(1);
        teacher.setTitle("副教授");
        teacherMapper.updateById(teacher);
    }

    @Test
    void testDeleteTeacher() {
        // 假设数据库中已有ID为2的教师记录
        teacherMapper.deleteById(2);
    }

    @Test
    void testAddCourse() {
        Course course = new Course(2, "Java程序设计", 4);
        courseMapper.insert(course);
    }

    @Test
    void testUpdateCourse() {
        Course course = courseMapper.selectById(2);
        course.setCredit(3);
        courseMapper.updateById(course);
    }

    @Test
    void testDeleteCourse() {
        courseMapper.deleteById(2);
    }
    @Test
    void testDelete() {
       
    }
}
