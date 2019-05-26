package club.chenlinghong.institution.service;

import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.repository.domain.Course;

import java.awt.*;
import java.util.List;

/**
 * @Description 课程Service接口
 * @Author lizhongqiu
 * @Date 2019/4/2 21:39
 **/
public interface CourseService extends IBaseService<Course>{

    /**
     * 根据老师id获取其所有的授课科目信息
     * @param userId
     * @return
     */
   PageDto<Course> getByTeacherId(int userId);
}
