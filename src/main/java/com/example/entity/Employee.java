package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "TELEPHONE")
    private String telephone;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "MODIFY_DATE")
    private Timestamp modifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }


    public static final class Builder {
        private Long id;
        private String number;
        private String name;
        private Long departmentId;
        private String gender;
        private String telephone;
        private String address;
        private Integer age;
        private Timestamp createDate;
        private Timestamp modifyDate;

        private Builder() {}

        public static Builder create() { return new Builder(); }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder departmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder createDate(Timestamp createDate) {
            this.createDate = createDate;
            return this;
        }

        public Builder modifyDate(Timestamp modifyDate) {
            this.modifyDate = modifyDate;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.setId(id);
            employee.setNumber(number);
            employee.setName(name);
            employee.setDepartmentId(departmentId);
            employee.setGender(gender);
            employee.setTelephone(telephone);
            employee.setAddress(address);
            employee.setAge(age);
            employee.setCreateDate(createDate);
            employee.setModifyDate(modifyDate);
            return employee;
        }
    }
}
