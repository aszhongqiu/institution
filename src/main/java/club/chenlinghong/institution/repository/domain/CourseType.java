package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 课程分类
 * @Author  lizhongqiu
 * @Date 2019/5/22 20:05
 * @Version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseType extends BaseDomain {

    private static final long serialVersionUID = 207438013579173602L;

    /**
     * 类型名称
     */
    private String name;
}