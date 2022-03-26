package com.sau.Project3.Controller;

import com.sau.Project3.Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    private List<Employee> employeeList = new ArrayList<Employee>();

    public EmployeeController() {
        populateList();

    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("eList", employeeList);
        return "index";
    }

    @GetMapping("/getemployee")
    public String getEmployee() {
        return "getemployee";

    }

    @GetMapping("/getemp")
    public String getEmp(@RequestParam Integer no, Model model) {
        for (Employee e : employeeList) {
            if (e.getNo() == no) {
                model.addAttribute("employee", e);
                break;
            }
        }
        return "employee";
    }


    @GetMapping("/addemployee")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "addemployee";

    }

    @PostMapping("/add")
    public String addEmp(Employee employee, Model model) {
        employeeList.add(employee);
        model.addAttribute("eList", employeeList);
        return "index";
    }

    @GetMapping("/update/{no}")
    public String update(@PathVariable("no") Integer no, Model model) {
        for (Employee e: employeeList) {
            if (e.getNo() == no) {
                model.addAttribute("employee", e);
                break;
            }
        }
        return "update";
    }

    @PostMapping("/update")
    public String updateEmployee(Employee employee, Model model) {
        for (Employee e: employeeList) {
            if (e.getNo() == employee.getNo()) {
                e.setEName(employee.getEName());
                e.setJob(employee.getJob());
                e.setMgr(employee.getMgr());
                e.setHireDate(employee.getHireDate());
                e.setSal(employee.getSal());
                e.setComm(employee.getComm());
                e.setDeptNo(employee.getDeptNo());

            }
            model.addAttribute("eList", employeeList);
        }
        return "index";
    }


    @GetMapping("/delete/{no}")
    public String deleteEmp(@PathVariable("no") Integer no, Model model) {
        for (Employee e: employeeList) {
            if (e.getNo() == no) {
                employeeList.remove(e);
                break;
            }
        }

        model.addAttribute("eList", employeeList);
        return "index";

    }


    public void populateList() {

        employeeList.add(new Employee(9369, "SAMI", "CLERK", 7902, "12.15.2021", 1000, null, 20));
        employeeList.add(new Employee(7369, "SMITH", "CLERK", 7902, "12.17.1980", 900, null, 20));
        employeeList.add(new Employee(7499, "ALLEN", "SALESMAN", 7698, "02.20.1981", 1600, 300, 30));
        employeeList.add(new Employee(7521, "WARD", "SALESMAN", 7698, "02.22.1981", 1250, 500, 30));
        employeeList.add(new Employee(7566, "JONES", "MANAGER", 7839, "04.02.1981", 2975, null, 20));
        employeeList.add(new Employee(7654, "MARTIN", "SALESMAN", 7698, "09.28.1981", 1250, 1400, 30));
        employeeList.add(new Employee(7698, "BLAKE", "MANAGER", 7839, "05.01.1981", 2850, null, 30));
        employeeList.add(new Employee(7782, "CLARK", "MANAGER", 7839, "06.09.1981", 2450, null, 10));
        employeeList.add(new Employee(7788, "SCOTT", "ANALYST", 7566, "12.09.1982", 3000, null, 20));
        employeeList.add(new Employee(7839, "KING", "PRESIDENT", null, "11.17.1981", 5000, null, 10));
        employeeList.add(new Employee(7844, "TURNER", "SALESMAN", 7698, "09.08.1981", 1500, 0, 30));
        employeeList.add(new Employee(7876, "ADAMS", "CLERK", 7788, "01.12.1983", 1100, null, 20));
        employeeList.add(new Employee(7900, "JAMES", "CLERK", 7698, "12.03.1981", 950, null, 30));
        employeeList.add(new Employee(7902, "FORD", "ANALYST", 7566, "12.03.1981", 3000, null, 20));
        employeeList.add(new Employee(7934, "MILLER", "CLERK", 7782, "01.23.1982", 1300, null, 10));
    }

}

