package edu.cqnu.demospdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cqnu.demospdb.model.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
}