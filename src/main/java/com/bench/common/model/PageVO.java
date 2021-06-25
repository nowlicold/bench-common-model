package com.bench.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author by catface
 * @date 2020/12/15
 */
@ApiModel(description = "分页通用返回模型")
public class PageVO<T> {

  @ApiModelProperty(value = "结果列表")
  private List<T> records;

  @ApiModelProperty(value = "当前页码")
  private Integer current;

  @ApiModelProperty(value = "分页大小")
  private Integer size;

  @ApiModelProperty(value = "总页数")
  private Integer pages;

  @ApiModelProperty(value = "总条数")
  private Integer total;

  @ApiModelProperty(value = "是否有下一页,true:有;false:无")
  private Boolean hasNext;

  public PageVO() {
  }

  public static <T> PageVO<T> emptyPage(Class<T> clazz, Long current, Long size) {
    return new PageVO<>(null, current, size, 0L);
  }

  public static <T> PageVO<T> emptyPage(Class<T> clazz, Long current, Long size, Long pages) {
    return new PageVO<>(null, current, size, pages);
  }

  public static <T> PageVO<T> emptyPage(Class<T> clazz, Integer current, Integer size) {
    return new PageVO<>(null, current, size, 0);
  }

  public static <T> PageVO<T> emptyPage(Class<T> clazz, Integer current, Integer size, Integer pages) {
    return new PageVO<>(null, current, size, pages);
  }


  public static <T, S> PageVO<T> emptyPage(PageVO<S> pageVOSource) {
    PageVO<T> targetPageVO = new PageVO<>(new ArrayList<>(), pageVOSource.getCurrent(),
        pageVOSource.getSize(), pageVOSource.getPages(), pageVOSource.getTotal());
    return targetPageVO;
  }

  public static <T, S> PageVO<T> convertPageVO(PageVO<S> pageVOSource, Function<S, T> function) {
    List<T> targetList = new ArrayList<>();
    PageVO<T> targetPageVO = new PageVO<>(targetList, pageVOSource.getCurrent(),
        pageVOSource.getSize(), pageVOSource.getPages(), pageVOSource.getTotal());

    if (pageVOSource.getRecords() == null || pageVOSource.getRecords().size() == 0) {
      return targetPageVO;
    }

    for (S record : pageVOSource.getRecords()) {
      targetList.add(function.apply(record));
    }
    return targetPageVO;
  }

  public static <T, S> PageVO<T> convertPageVO(List<T> records, PageVO<S> pageVOSource) {
    PageVO<T> targetPageVO = new PageVO<>(records, pageVOSource.getCurrent(),
        pageVOSource.getSize(), pageVOSource.getPages(), pageVOSource.getTotal());
    return targetPageVO;
  }

  public PageVO(List<T> records, Integer current, Integer size, Integer pages, Integer total) {
    this.records = records;
    this.current = current;
    this.size = size;
    this.pages = pages;
    this.total = total;
  }

  public PageVO(List<T> records, Integer current, Integer size, Integer pages) {
    this.records = records;
    this.current = current;
    this.size = size;
    this.pages = pages;
  }

  public PageVO(List<T> records, Long current, Long size, Long pages) {
    this.records = records;
    this.current = current.intValue();
    this.size = size.intValue();
    this.pages = pages.intValue();
  }

  public PageVO(List<T> records, Long current, Long size, Long pages,Long total) {
    this.records = records;
    this.current = current.intValue();
    this.size = size.intValue();
    this.pages = pages.intValue();
    this.total=total.intValue();
  }

  public List<T> getRecords() {
    return records;
  }

  public PageVO<T> setRecords(List<T> records) {
    this.records = records;
    return this;
  }

  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public Boolean getHasNext() {
    if (hasNext == null) {
      hasNext = current < pages;
    }
    return hasNext;
  }

  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }
}
