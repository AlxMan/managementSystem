package testRun;

import com.wxc.entity.Employee;
import com.wxc.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RunEmployeeAnnotation {
    @Autowired
    private EmployeeService employeeService;
    @Test
    public void findByid(){
        Employee employeebyid = employeeService.findByid(1);
        System.out.println(employeebyid);
        System.out.println("-----------------------------华丽的分割线---------------------------");
        List<Employee> all = employeeService.findAll();
        all.forEach(System.out::println);

    }
    /**
     * 新增
     */
    @Test
    public void saveTest(){
        Employee employee = new Employee();
        employee.setEmp_id(5);
        employee.setEmp_name("小刘");
        employee.setDept_id(2);
        employee.setJob_name("销售经理");
        employee.setJoin_date(new Date());
        employee.setTelephone("16666666667");
        employeeService.save(employee);
    }
}

