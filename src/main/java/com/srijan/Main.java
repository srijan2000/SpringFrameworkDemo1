package com.srijan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");*/

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
       // Doctor d = new Doctor();
       // Doctor d = context.getBean(Doctor.class);
       // Nurse d = context.getBean(Nurse.class);
        //Nurse d = (Nurse) context.getBean("n");
        //Staff staff = context.getBean(Doctor.class);
        //Staff staff = context.getBean(Nurse.class);
        // staff.assist();
        //Doctor staff = context.getBean(Doctor.class);
        //Staff staff = context.getBean(Doctor.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

        /*Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);*/
        /*System.out.println(staff.getQualification());
*/
    }
}