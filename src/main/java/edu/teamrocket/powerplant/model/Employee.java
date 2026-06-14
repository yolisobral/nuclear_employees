package edu.teamrocket.powerplant.model;

public final class Employee {
    private String name;
    private int id;
    private Department department;
    private ExperienceLevel experienceLevel;
    private Shift shift;
       
    public Employee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.experienceLevel = experienceLevel;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", experienceLevel="
                + experienceLevel + ", shift=" + shift + "]\n";
    }    
    
}


