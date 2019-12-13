package springboot.layui.Mapper;

import org.apache.ibatis.annotations.*;
import springboot.layui.bean.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {

//    @Select("select * from employee")
    public List<Employee> getEmp();

    @Delete("delete from employee where id = #{id}")
    public int delById(Integer id);

    @Insert("insert into employee values(#{id},#{lastName},#{email},#{gender},#{d_id})")
    public int insertEmp(Employee employee);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender} where id = #{id}")
    public int updateEmp(Employee employee);
}
