package com.SpringFormApplication.springForm.dto;

public class UserDto {
    private String fullName;
    private String dob;
    private String email;
    private String phNo;
    private String qualification;
    private String department;
    private String yearPassout;
    private String preferredRole;
    private String preferredSalary;
    private String jobType;
    private String skills;
    private String location;


    public UserDto(String fullName, String dob, String email, String phNo, String qualification, String department, String yearPassout, String preferredRole, String preferredSalary, String jobType, String skills, String location) {
        this.fullName = fullName;
        this.dob = dob;
        this.email = email;
        this.phNo = phNo;
        this.qualification = qualification;
        this.department = department;
        this.yearPassout = yearPassout;
        this.preferredRole = preferredRole;
        this.preferredSalary = preferredSalary;
        this.jobType = jobType;
        this.skills = skills;
        this.location = location;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYearPassout() {
        return yearPassout;
    }

    public void setYearPassout(String yearPassout) {
        this.yearPassout = yearPassout;
    }

    public String getPreferredRole() {
        return preferredRole;
    }

    public void setPreferredRole(String preferredRole) {
        this.preferredRole = preferredRole;
    }

    public String getPreferredSalary() {
        return preferredSalary;
    }

    public void setPreferredSalary(String preferredSalary) {
        this.preferredSalary = preferredSalary;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
