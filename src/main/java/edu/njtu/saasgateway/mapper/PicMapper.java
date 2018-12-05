package edu.njtu.saasgateway.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import edu.njtu.saasgateway.model.Pic;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * t_pic 操作：演示两种方式
 * <p>第一种是基于mybatis3.x版本后提供的注解方式<p/>
 * <p>第二种是早期写法，将SQL写在 XML 中<p/>
 *
 * Created by Donghua.Chen on 2018/6/7.
 */
@Mapper
public interface PicMapper  extends BaseMapper<Pic>{
//    /**
//     * 根据用户名统计（TODO 假设它是一个很复杂的SQL）
//     *
//     * @param picName 用户名
//     * @return 统计结果
//     */
//    int countByPicname(String picName);
//
//    /**
//     * 根据用户名查询用户结果集
//     *
//     * @param picname 用户名
//     * @return 查询结果
//     */
//    @Select("SELECT * FROM pic WHERE pic_name = #{picName}")
//    List<Pic> findByPicname(@Param("picName") String picName);


    /**
     * 保存用户信息
     *
     * @param pic 用户信息
     * @return 成功 1 失败 0
     */
    int insert(Pic pic);
}