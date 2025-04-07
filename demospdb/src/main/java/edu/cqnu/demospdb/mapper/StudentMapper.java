package edu.cqnu.demospdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cqnu.demospdb.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
