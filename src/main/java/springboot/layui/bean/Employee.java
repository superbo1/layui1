package springboot.layui.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer d_id;
    private Department dept;


}
