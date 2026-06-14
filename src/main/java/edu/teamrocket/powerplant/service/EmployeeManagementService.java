package edu.teamrocket.powerplant.service;
import java.util.List;
import java.util.Map;

import edu.teamrocket.powerplant.model.Department;
import edu.teamrocket.powerplant.model.Employee;
import edu.teamrocket.powerplant.model.ExperienceLevel;
import edu.teamrocket.powerplant.model.Shift;

public interface EmployeeManagementService {

    public Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift);
    public int crewSize();
    public void listCrew();
    public List<Employee> findEmployeesByDepartment(Department department);
    public void changeEmployeeExperienceLevel(Employee employee, ExperienceLevel experienceLevel);
    public Map<String, Long> getExperienceLevelStatistics();
    public boolean isDepartmentFullyCovered(Department department);
} 