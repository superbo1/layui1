package springboot.layui.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springboot.layui.Mapper.EmployeeMapper;
import springboot.layui.bean.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {

    @Autowired
    EmployeeMapper employeeMapper;

    //获取员工数据 转化为json
    @ResponseBody
    @GetMapping("/json")
    public Map<String,Object> addjson(){
        List<Employee> emp = employeeMapper.getEmp();

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",1000);
        map.put("data",emp);

        return map;
    }


    @RequestMapping("/")
    public String index(){
        return "Emptable";
    }

    @GetMapping("/emp/{id}")
    public String del(@PathVariable("id") Integer id){
        int i = employeeMapper.delById(id);
        System.out.println(i);
        return "Emptable";
    }

    @GetMapping("/unEmp")
    public String update(Employee employee){
        int i = employeeMapper.updateEmp(employee);
        System.out.println(i);
        return "Emptable";
    }

    @PostMapping("/insertEmp")
    public String insertEmp(Employee employee){
        employeeMapper.insertEmp(employee);
        return "Emptable";
    }
}
