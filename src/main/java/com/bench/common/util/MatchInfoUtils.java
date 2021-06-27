package com.bench.common.util;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

/**
 * @author hyk
 * @date 2021/4/22
 * <p>
 *
 * </p>
 */
public class MatchInfoUtils {

  public static final String[] WEEK_DAYS_STR = {"周一", "周二", "周三", "周四", "周五", "周六", "周日"};

  public static String convertIssueNo(Integer issueNoOld) {
    String issueNo = issueNoOld + "";
    String year = issueNo.substring(0, 4);
    String month = issueNo.substring(4, 6);
    String day = issueNo.substring(6);
    StringBuilder sb = new StringBuilder();
    sb.append(year).append("-").append(month).append("-").append(day);
    return sb.toString();
  }

  /**
   * 三位补齐 LineId
   *
   * @param lineId
   * @return
   */
  public static String getLineIdStr(Integer lineId) {
    return String.format("%03d", lineId);
  }

  public static String getWeekStr(String dateStr) {
    if (StringUtils.isEmpty(dateStr)) {
      return "";
    }
    LocalDate date = LocalDate.parse(dateStr);
    return WEEK_DAYS_STR[date.getDayOfWeek().ordinal()];
  }


}
