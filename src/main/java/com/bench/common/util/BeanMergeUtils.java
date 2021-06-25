package com.bench.common.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import lombok.SneakyThrows;

/**
 * @author hyk
 * @date 2021/4/13
 * <p>
 * BeanMerge，对象属性合并
 * 使用场景：
 * 假设现在有一个数据库对象a，
 * 我有一个新的编辑对象b，b只编辑了部分a的字段，
 * 那么需要把b合并到a中，则使用merge(a,b)
 * </p>
 */

public class BeanMergeUtils {

  /**
   * 对象属性合并 忽略null值 会处理 '' 空串
   *
   * @param target      主数据
   * @param destination 待合并数据
   * @param <M>         泛型类型
   * @throws Exception
   */
  @SneakyThrows
  public static <M> void merge(M target, M destination) {
    // 获取目标bean
    BeanInfo beanInfo = Introspector.getBeanInfo(target.getClass());
    // 遍历所有属性
    for (PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {
      // 如果是可写属性
      if (descriptor.getWriteMethod() != null) {
        Object defaultValue = descriptor.getReadMethod().invoke(destination);
        if(defaultValue != null){
          // 用非null的defaultValue值覆盖到target去
          descriptor.getWriteMethod().invoke(target, defaultValue);
        }
      }
    }
  }


}
