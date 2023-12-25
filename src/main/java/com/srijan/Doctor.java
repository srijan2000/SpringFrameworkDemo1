package com.srijan;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/*@Component*/
@Scope(scopeName = "prototype")
@Component
public class Doctor implements Staff, BeanNameAware {

//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    /*   public Doctor(String qualification) {
                this.qualification = qualification;
            }

            //if we want to inject the entire object
            *//*private Nurse nurse;*//*
    private String qualification;*/
    /*public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }*/
    private String qualification;




    public void assist(){
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean name method is called ");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct Method is called");
    }
}
