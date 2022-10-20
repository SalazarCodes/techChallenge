//package com.example.demo.service;
//
//import com.example.demo.controller.model.StudentRequest;
//import com.example.demo.controller.model.StudentResponse;
//import com.example.demo.dao.repository.StudentRepository;
//import com.example.demo.entity.Student;
//import io.reactivex.Completable;
//import io.reactivex.Single;
//import io.reactivex.observers.TestObserver;
//import io.reactivex.schedulers.Schedulers;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//
//@RunWith(MockitoJUnitRunner.class)
//public class StudentServiceImplTest {
//
//    @InjectMocks
//    private StudentServiceImpl studentService;
//
//    @Mock
//    private StudentRepository studentRepository;
//
//
//
//    @Test
//    public void findStudentById() {
//
//
//        Mockito.when(studentRepository.findById(Mockito.anyString())).thenReturn(Mono.just(studentMock()));
//
//        TestObserver<Single<StudentResponse>> testObserver = Single.just(studentService.findStudentById("123")).test();
//        testObserver.awaitTerminalEvent();
//        testObserver.assertComplete();
//
//
//    }
//
//    @Test
//    public void findStudentsActives() {
//
//        Mockito.when(studentRepository.findAll()).thenReturn(Flux.just(studentMock()));
//
//        TestObserver<StudentResponse> testObserver = studentService.findStudentsActives().test();
//        testObserver.awaitTerminalEvent();
//        testObserver.assertComplete();
//    }
//
//    @Test
//    public void saveStudent() {
//
//        Mockito.when(studentRepository.insert(Mockito.any(Student.class))).thenReturn(Mono.just(studentMock()));
//
//        TestObserver<StudentResponse> testObserver = studentService.saveStudent(studentRequestMock()).test();
//
//        testObserver.awaitTerminalEvent();
//        testObserver.assertComplete();
//    }
//
//    @Test
//    public void updateStudent() {
//
//        Mockito.when(studentRepository.findById(Mockito.anyString())).thenReturn(Mono.just(studentMock()));
//        Mockito.when(studentRepository.save(Mockito.any())).thenReturn(Mono.just(studentMock()));
//
//        TestObserver testObserver = studentService.updateStudent("123",studentRequestMock()).test();
//        testObserver.awaitTerminalEvent();
//        testObserver.assertComplete();
//    }
//
//
//
//    @Test
//    public void deleteStudent() {
//
//        Mockito.when(studentRepository.deleteById(Mockito.anyString())).thenReturn(Mono.empty());
//
//        TestObserver<Void> testObserver = studentService.deleteStudent("123").test();
//        testObserver.awaitTerminalEvent();
//        testObserver.assertComplete();
//    }
//
//    private Student studentMock(){
//
//        Student student = new Student();
//        student.setId("123");
//        student.setNombre("Carlos");
//        student.setApellido("Zambrano");
//        student.setCiclo("9no");
//        student.setActive(true);
//
//        return student;
//    }
//
//    private List<Student> studentMockList(){
//
//        Student student = new Student();
//        student.setId("123");
//        student.setNombre("Carlos");
//        student.setApellido("Zambrano");
//        student.setCiclo("9no");
//        student.setActive(true);
//
//        List<Student> students = new ArrayList<>();
//        students.add(student);
//
//        return students;
//    }
//
//    private StudentRequest studentRequestMock(){
//
//        StudentRequest student = new StudentRequest();
//        student.setNombre("Carlos");
//        student.setApellido("Zambrano");
//        student.setCiclo("9no");
//        student.setActive(true);
//
//        return student;
//    }
//}