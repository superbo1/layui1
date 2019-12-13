package springboot.layui.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springboot.layui.Mapper.DepartmentMapper;
import springboot.layui.bean.Department;

import java.util.List;
import java.util.Map;


@Controller
public class DeptController {
    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept")
    public String getDept(Map<String,Object> map){
        List<Department> dept = departmentMapper.getDept();
        map.put("depts",dept);
        return "test";
    }



    @GetMapping("/dept/{id}")
    public Department getDeptByid(@PathVariable("id") Integer id){
        Department deptById = departmentMapper.getDeptById(id);
        return deptById;
    }


//    @GetMapping("/dept")
//    public Department insertDept(Department department){
//        departmentMapper.insertDept(department);
//        return department;
//    }
}
