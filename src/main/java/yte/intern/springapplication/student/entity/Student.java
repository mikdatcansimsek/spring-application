package yte.intern.springapplication.student.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import yte.intern.springapplication.common.BaseEntity;
import yte.intern.springapplication.student.controller.request.StudentUpdateRequest;

@Entity
@NoArgsConstructor
@Getter
public class Student extends BaseEntity {

    private String name;
    private String surname;
    private String email;
    private String tcKimlikNo;
    private String studentNumber;

    public Student(String name, String surname, String email, String tcKimlikNo, String studentNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.tcKimlikNo = tcKimlikNo;
        this.studentNumber = studentNumber;
    }

    public void updateStudentInformationForDepartmenChange(String email, String studentNumber){
        this.email = email;
        this.studentNumber = studentNumber;
    }

    public void update(StudentUpdateRequest studentUpdateRequest) {
        this.name = studentUpdateRequest.name();
        this.surname = studentUpdateRequest.surname();
        this.email = studentUpdateRequest.email();
        this.studentNumber = studentUpdateRequest.studentNumber();
    }
}
