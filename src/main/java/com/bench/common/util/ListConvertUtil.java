package com.bench.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author hyk
 * @date 2021/4/9
 * <p>
 *
 * </p>
 */


public class ListConvertUtil {

  public static <T, S> List<T> convertList(List<S> records, Function<S, T> function) {

    if (records == null || records.size() == 0) {
      return new ArrayList<>();
    }

    List<T> targetList = new ArrayList<>(records.size());
    for (S record : records) {
      targetList.add(function.apply(record));
    }
    return targetList;
  }

}
