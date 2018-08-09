package com.luying.dao;

import com.luying.bean.SysResources;
import java.util.List;

public interface SysResourcesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbggenerated
     */
    int insert(SysResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbggenerated
     */
    SysResources selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbggenerated
     */
    List<SysResources> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysResources record);
}