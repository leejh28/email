package com.leejh.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ColumnWidth(16)
public class ImportExcelDto {
    @ExcelProperty(index = 0 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "序号"})
    private String xh;//序号

    @ExcelProperty(index = 1 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "姓名"})
    private String a01001;//姓名

    @ExcelProperty(index = 2 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "身份证号码"})
    private String a01084;//身份证号码

    @ExcelProperty(index = 3 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "学历"})
    private String a08002a;//学历（学位）

    @ExcelProperty(index = 4 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "所学专业"})
    private String a08024a;//所学专业

    @ExcelProperty(index = 5 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "参加工作时间"} , format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern="yyyy-MM-dd")
    private String h02013;//参加工作时间

    @ExcelProperty(index = 6 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "现工作单位"})
    private String a17015a;//现工作单位

    @ExcelProperty(index = 7 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "原取得资格"})
    private String zj03002;//原取得资格

    @ExcelProperty(index = 8 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "原资格取得时间"}, format = "yyyy-MM-dd")
    private String zj03003;//原资格取得时间

    @ExcelProperty(index = 9 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "资格名称"})
    private String a10005a;//资格名称

    @ExcelProperty(index = 10 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "专业名称"})
    private String p40003a;//专业名称

    @ExcelProperty(index = 11 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "评委会名称（考核认定单位名称）"})
    private String p40008a;//评委会名称（考核认定单位名称）

    @ExcelProperty(index = 12 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "取得时间"} , format = "yyyy-MM-dd")//取zj03评定时间
    private Date a10015;//取得时间

    @ExcelProperty(index = 13 , value = {"广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "广东省（   ）级职称发证表\r\n填报单位名称：（盖章）     填报人：     电话：     填报日期：",
        "证书编号"})
    private String a13007;//证书编号

}

