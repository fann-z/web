package edu.cqnu.demospdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cqnu.demospdb.model.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {
}