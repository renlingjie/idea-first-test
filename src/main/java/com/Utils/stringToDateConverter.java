package com.Utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class stringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if (s == null){
            //如果传入参数为空，抛出运行时异常，提示传入数据
            throw new RuntimeException("请您传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换错误，您可能没按照格式yyyy-MM-dd来写");
        }
    }
}
