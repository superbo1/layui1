package springboot.layui;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.layui.Mapper.EmployeeMapper;
import springboot.layui.bean.Employee;

import java.util.List;

@SpringBootTest
class LayuiApplicationTests {
	@Autowired
	EmployeeMapper employeeMapper;

	@Test
	void contextLoads() {
		Employee e = new Employee();
		e.setId(4);
		e.setLastName("黄学博");
		e.setEmail("1141760604@qq.com");
		e.setGender(1);
		e.setD_id(1);
		int i = employeeMapper.insertEmp(e);
		System.out.println(i);
	}

	@Test
	void test(){
		Employee e = new Employee();
		e.setId(2);
		e.setLastName("黄学博");
		e.setEmail("1141760604@qq.com");
		e.setGender(2);
		e.setD_id(2);
		int i = employeeMapper.updateEmp(e);
		System.out.println(i);
	}

	@Test
	void selectTest(){
		List<Employee> emp = employeeMapper.getEmp();
		System.out.println(emp);
	}
}
