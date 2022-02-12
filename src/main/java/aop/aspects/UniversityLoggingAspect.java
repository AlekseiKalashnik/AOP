package aop.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @AfterThrowing(pointcut = "execution(* getStudents())",
    throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
                "логирум выброс исключения " + exception);
    }

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students") /*значение returning должно совпадать с парамметром метода ниже*/
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurnameOfFirstStudent = firstStudent.getNameSurname();
//        nameSurnameOfFirstStudent = "Mr." + nameSurnameOfFirstStudent;
//        firstStudent.setNameSurname(nameSurnameOfFirstStudent);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 0.3;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после работы метода getStudents");
//    }
}
