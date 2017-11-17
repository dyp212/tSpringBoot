package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 城市国标码
     */
    private Integer code;

    /**
     * 力蕴系统的城市编码
     */
    @Column(name = "reg_code")
    private String regCode;

    /**
     * 城市名称
     */
    private String name;

    /**
     * 所属区域ID
     */
    @Column(name = "area_id")
    private Long areaId;

    private String remark;

    private Long cuid;

    private Long muid;

    private Date created;

    private Date modified;

    /**
     * 级别[1, max)
     */
    private Integer level;

    /**
     * ehr 部门ID
     */
    @Column(name = "dept_id")
    private Long deptId;

    /**
     * ehr 部门编号
     */
    @Column(name = "dept_code")
    private String deptCode;

    /**
     * ehr 上级部门编号
     */
    @Column(name = "dept_pcode")
    private String deptPcode;

    /**
     * 状态  1 正常  0 删除
     */
    private Integer status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取城市国标码
     *
     * @return code - 城市国标码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置城市国标码
     *
     * @param code 城市国标码
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取力蕴系统的城市编码
     *
     * @return reg_code - 力蕴系统的城市编码
     */
    public String getRegCode() {
        return regCode;
    }

    /**
     * 设置力蕴系统的城市编码
     *
     * @param regCode 力蕴系统的城市编码
     */
    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    /**
     * 获取城市名称
     *
     * @return name - 城市名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置城市名称
     *
     * @param name 城市名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属区域ID
     *
     * @return area_id - 所属区域ID
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 设置所属区域ID
     *
     * @param areaId 所属区域ID
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return cuid
     */
    public Long getCuid() {
        return cuid;
    }

    /**
     * @param cuid
     */
    public void setCuid(Long cuid) {
        this.cuid = cuid;
    }

    /**
     * @return muid
     */
    public Long getMuid() {
        return muid;
    }

    /**
     * @param muid
     */
    public void setMuid(Long muid) {
        this.muid = muid;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return modified
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * 获取级别[1, max)
     *
     * @return level - 级别[1, max)
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置级别[1, max)
     *
     * @param level 级别[1, max)
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取ehr 部门ID
     *
     * @return dept_id - ehr 部门ID
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 设置ehr 部门ID
     *
     * @param deptId ehr 部门ID
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取ehr 部门编号
     *
     * @return dept_code - ehr 部门编号
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置ehr 部门编号
     *
     * @param deptCode ehr 部门编号
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * 获取ehr 上级部门编号
     *
     * @return dept_pcode - ehr 上级部门编号
     */
    public String getDeptPcode() {
        return deptPcode;
    }

    /**
     * 设置ehr 上级部门编号
     *
     * @param deptPcode ehr 上级部门编号
     */
    public void setDeptPcode(String deptPcode) {
        this.deptPcode = deptPcode;
    }

    /**
     * 获取状态  1 正常  0 删除
     *
     * @return status - 状态  1 正常  0 删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态  1 正常  0 删除
     *
     * @param status 状态  1 正常  0 删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}