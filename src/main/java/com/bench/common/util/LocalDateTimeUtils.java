package com.bench.common.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author hyk
 * @date 2020/12/21
 * @description
 */
public class LocalDateTimeUtils {

  /**
   * 毫秒时间戳转localDate
   *
   * @param timestamp 毫秒时间戳
   * @return localDate
   */
  public static LocalDate timestampToLocalDate(long timestamp) {
    return Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(8)).toLocalDate();
  }

  /**
   * 毫秒时间戳转LocalDateTime
   *
   * @param timestamp 毫秒时间戳
   * @return LocalDateTime
   */
  public static LocalDateTime timestampToLocalDateTime(long timestamp) {
    return Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(8)).toLocalDateTime();
  }

  /**
   * 将 LocalDate 转为 Date
   *
   * @param localDate 参数
   * @return java.util.Date
   */
  public static Date localDateToDate(LocalDate localDate) {
    return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
  }

  /**
   * 获取两个日期间隔的所有日期
   * @param start 格式必须为'2018-01-25'
   * @param end 格式必须为'2018-01-25'
   * @return
   */
  public static List<String> getBetweenDate(String start, String end){
    List<String> list = new ArrayList<>();
    List<LocalDate> dateList = getBetweenLocalDates(start, end);
    dateList.forEach(date -> list.add(date.toString()));

    return list;
  }

  public static List<LocalDate> getBetweenLocalDates(String start, String end) {
    LocalDate startDate = LocalDate.parse(start);
    LocalDate endDate = LocalDate.parse(end);

    List<LocalDate> dateList = getBetweenDate(startDate, endDate);
    return dateList;
  }

  /**
   * 获取两个日期间隔的所有日期
   * @param startDate
   * @param endDate
   * @return
   */
  public static List<LocalDate> getBetweenDate(LocalDate startDate, LocalDate endDate){
    List<LocalDate> list = new ArrayList<>();

    long distance = ChronoUnit.DAYS.between(startDate, endDate);
    if (distance < 0) {
      return list;
    }

    Stream.iterate(startDate, date -> date.plusDays(1)).limit(distance + 1).forEach(date -> list.add(date));
    return list;
  }

  /**
   * 获取两个日期间隔的所有日期
   * @param startDate
   * @param endDate
   * @return
   */
  public static List<Date> getBetweenDateList(LocalDate startDate, LocalDate endDate){
    List<Date> list = new ArrayList<>();

    long distance = ChronoUnit.DAYS.between(startDate, endDate);
    if (distance < 0) {
      return list;
    }

    Stream.iterate(startDate, date -> date.plusDays(1)).limit(distance + 1)
        .forEach(date -> list.add(localDateToDate(date)));
    return list;
  }

}
