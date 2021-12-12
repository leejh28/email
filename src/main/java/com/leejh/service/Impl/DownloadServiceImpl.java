package com.leejh.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.StyleUtil;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.alibaba.excel.write.style.row.AbstractRowHeightStyleStrategy;
import com.leejh.entity.ImportExcelDto;
import com.leejh.service.DownloadService;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;

@Service
public class DownloadServiceImpl implements DownloadService {
    @Override
    public void download(HttpServletResponse response) throws IOException {
        // 表头策略
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        headWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        headWriteCellStyle.setBorderBottom(BorderStyle.THIN);
        headWriteCellStyle.setBorderLeft(BorderStyle.THIN);
        headWriteCellStyle.setBorderRight(BorderStyle.THIN);
        WriteFont headWriteFont = new WriteFont();
        headWriteFont.setFontHeightInPoints((short)12);
        headWriteFont.setBold(false);
        headWriteCellStyle.setWriteFont(headWriteFont);

        // 内容策略
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        contentWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        contentWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
        WriteFont contentWriteFont = new WriteFont();
        contentWriteFont.setFontHeightInPoints((short)11);
        contentWriteCellStyle.setWriteFont(contentWriteFont);

        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileName = URLEncoder.encode("导入模板", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel
            .write(response.getOutputStream(), ImportExcelDto.class)
            .sheet("导入模板")
            .registerWriteHandler(new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle))
            .registerWriteHandler(new RowStrategy())
            .doWrite(new ArrayList<ImportExcelDto>());
    }

    //设置表头行
    public class RowStrategy extends AbstractRowHeightStyleStrategy {
        @Override
        protected void setHeadColumnHeight(Row row, int i) {
//            WriteFont writeFont =new WriteFont();
//            writeFont.setFontHeightInPoints((short)20);
//            WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
//            contentWriteCellStyle.setWriteFont(writeFont);
//            Workbook workbook = row.getSheet().getWorkbook();
//            CellStyle cellStyle = StyleUtil.buildHeadCellStyle(workbook, contentWriteCellStyle);
            if(row.getRowNum() == 0){
                row.setHeight((short)1500);
//                row.setRowStyle(cellStyle);
            }
            else if(row.getRowNum() == 1){
                row.setHeight((short)600);
//                row.setRowStyle(cellStyle);
            }
        }
        @Override
        protected void setContentColumnHeight(Row row, int i) {}
    }

}
