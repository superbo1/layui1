package springboot.layui.Mapper;

import org.apache.ibatis.annotations.*;
import springboot.layui.bean.Department;

import java.util.List;


@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Select("select * from department")
    public List<Department> getDept();

    @Delete("delete * from department where id=#{id}")
    public int delDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")  //使自增的id显示出来
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);



}
