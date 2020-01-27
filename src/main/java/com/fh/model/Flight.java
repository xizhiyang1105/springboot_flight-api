package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fh.action.ZJ.ExcelFild;
import com.fh.action.ZJ.ExcelHeard;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("t_flight")
@ExcelHeard(title = "航班信息")
public class Flight {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @ExcelFild(name = "航班名称")
    private String name;
    private Integer typeId;
    @ExcelFild(name = "起飞时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:MM:ss")
    private Date startTime;
    @ExcelFild(name = "到达时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:MM:ss")
    private Date endTime;
    private Integer startArea1;
    private Integer startArea2;
    private Integer startArea3;

    private Integer entArea1;
    private Integer entArea2;
    private Integer entArea3;

    private Integer zt;



    @TableField(exist = false)
    @ExcelFild(name = "机型")
    private String brandName;
    @TableField(exist = false)
    @ExcelFild(name = "起飞地点")
    private String startArea;
    @TableField(exist = false)
    @ExcelFild(name = "到达地点")
    private String entArea;
    @TableField(exist = false)
    @ExcelFild(name = "票数")
    private Integer count;
    @TableField(exist = false)
    @ExcelFild(name = "票价")
    private double price;
    @TableField(exist = false)
    private double brandNameType;

    @TableField(exist = false)
    private double aprice;
    @TableField(exist = false)
    private double bprice;
    @TableField(exist = false)
    private Integer acount;
    @TableField(exist = false)
    private Integer bcount;

    public double getAprice() {
        return aprice;
    }

    public void setAprice(double aprice) {
        this.aprice = aprice;
    }

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }

    public Integer getAcount() {
        return acount;
    }

    public void setAcount(Integer acount) {
        this.acount = acount;
    }

    public Integer getBcount() {
        return bcount;
    }

    public void setBcount(Integer bcount) {
        this.bcount = bcount;
    }

    public double getBrandNameType() {
        return brandNameType;
    }

    public void setBrandNameType(double brandNameType) {
        this.brandNameType = brandNameType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getStartArea() {
        return startArea;
    }

    public void setStartArea(String startArea) {
        this.startArea = startArea;
    }

    public String getEntArea() {
        return entArea;
    }

    public void setEntArea(String entArea) {
        this.entArea = entArea;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStartArea1() {
        return startArea1;
    }

    public void setStartArea1(Integer startArea1) {
        this.startArea1 = startArea1;
    }

    public Integer getStartArea2() {
        return startArea2;
    }

    public void setStartArea2(Integer startArea2) {
        this.startArea2 = startArea2;
    }

    public Integer getStartArea3() {
        return startArea3;
    }

    public void setStartArea3(Integer startArea3) {
        this.startArea3 = startArea3;
    }

    public Integer getEntArea1() {
        return entArea1;
    }

    public void setEntArea1(Integer entArea1) {
        this.entArea1 = entArea1;
    }

    public Integer getEntArea2() {
        return entArea2;
    }

    public void setEntArea2(Integer entArea2) {
        this.entArea2 = entArea2;
    }

    public Integer getEntArea3() {
        return entArea3;
    }

    public void setEntArea3(Integer entArea3) {
        this.entArea3 = entArea3;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }
}
