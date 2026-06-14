package edu.teamrocket.powerplant.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.teamrocket.powerplant.model.Department;
import edu.teamrocket.powerplant.model.Employee;
import edu.teamrocket.powerplant.model.ExperienceLevel;
import edu.teamrocket.powerplant.model.Shift;
import edu.teamrocket.powerplant.service.EmployeeManagementService;

public class EmployeeManagementServiceImpl implements EmployeeManagementService{
    
    public List<Employee> employees = new ArrayList<>();

    public Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        Employee employee = new Employee(name, id, department, experienceLevel, shift);
        employees.add(employee);
        return employee;
    }

    public int crewSize() {
        return employees.size();
    }

    public void listCrew() {
        System.out.println(employees.toString());
    }

    public List<Employee> findEmployeesByDepartment(Department department) {
        List<Employee> employeesByDepartment = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                employeesByDepartment.add(employee);
            }
        }
        return employeesByDepartment;
    }

    public void changeEmployeeExperienceLevel(Employee employee, ExperienceLevel experienceLevel) {
        employee.setExperienceLevel(experienceLevel);
    }

    public Map<String, Long> getExperienceLevelStatistics() {
        Map<String, Long> map = new HashMap<>();
        List<Employee> employeesNovatos = new ArrayList<>();
        List<Employee> employeesIntermedios = new ArrayList<>();
        List<Employee> employeesExpertos = new ArrayList<>();
        for (Employee employee : employees) {
            switch (employee.getExperienceLevel()) {
                case NOVATO:
                    employeesNovatos.add(employee);
                    break;
                case INTERMEDIO:
                    employeesIntermedios.add(employee);
                    break;
                case EXPERTO:
                    employeesExpertos.add(employee);
                    break;
            }
        }
        map.put("NOVATO", (long) employeesNovatos.size());
        map.put("INTERMEDIO", (long) employeesIntermedios.size());
        map.put("EXPERTO", (long) employeesExpertos.size());
        return map;
    }

    public boolean isDepartmentFullyCovered(Department department) {
        List<Employee> employeesDepartment = findEmployeesByDepartment(department);
        boolean morning = false;
        boolean afternoon = false;
        boolean night = false;
        for (Employee employee : employeesDepartment) {
            if (employee.getShift().equals(Shift.MORNING)) {
                morning = true;
            }
            else if (employee.getShift().equals(Shift.AFTERNOON)) {
                afternoon = true;
            }
            else if (employee.getShift().equals(Shift.NIGHT)) {
                night = true;
            }
        }
        if (morning && afternoon && night) {
            return true;
        } else {
            return false;
        }
    }

}
