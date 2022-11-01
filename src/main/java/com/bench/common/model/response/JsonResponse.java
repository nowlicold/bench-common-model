package com.bench.common.model.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 通用返回模型
 * 业务上有以下要求：
 * 1.http 接口返回 http 状态码需要是 2xx,4xx,5xx
 * 2.http body 中有 status 对象，用于表示业务处理是否成功
 * 3.业务字段 key 为蛇形风格
 * </p>
 *
 * @author Karl
 * @date 2022/6/28 11:45
 */
@ApiModel(description = "通用返回模型")
@Data
public class JsonResponse<T> {
    private static final String MSG_BAD_REQUEST = "BAD_REQUEST";
    private static final String MSG_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";

    @ApiModelProperty(value = "状态")
    private Status status;

    @ApiModelProperty(value = "返回业务数据")
    private T data;

    private final static Status STATUS_OK = new Status(true);
    private final static JsonResponse RESULT_OK = new JsonResponse<>(STATUS_OK);

    private JsonResponse(Status status) {
        this.status = status;
    }

    private JsonResponse(Status status, T data) {
        this.status = status;
        this.data = data;
    }

    private JsonResponse(boolean ok, String errCode) {
        this.status = new Status(ok, errCode);
    }

    private JsonResponse(boolean ok, String errCode, String message) {
        this.status = new Status(ok, errCode, message);
    }

    public void addMessage(String message) {
        this.status.getErrMetadata().addDetail(message);
    }

    /**
     * <p>
     * 请求成功
     * </p>
     *
     * @return com.felo.minutes.app.api.meet.request.JsonResult<T>
     * @author Karl
     * @date 2022/6/28 12:16
     */
    public static <T> JsonResponse<T> ok() {
        return RESULT_OK;
    }

    /**
     * <p>
     * 请求成功
     * </p>
     *
     * @param data data
     * @return com.felo.minutes.app.api.meet.request.JsonResult<T>
     * @author Karl
     * @date 2022/6/28 12:15
     */
    public static <T> JsonResponse<T> ok(T data) {
        return new JsonResponse<>(STATUS_OK, data);
    }

    /**
     * <p>
     * 请求错误
     * </p>
     *
     * @param message message 错误信息
     * @return com.felo.minutes.app.api.meet.request.JsonResult<T>
     * @author Karl
     * @date 2022/6/28 12:15
     */
    public static <T> JsonResponse<T> badRequest(String message) {
        return new JsonResponse<>(false, MSG_BAD_REQUEST, message);
    }

    /**
     * <p>
     * 请求错误
     * </p>
     *
     * @return com.felo.minutes.app.api.meet.request.JsonResult<T>
     * @author Karl
     * @date 2022/6/28 12:15
     */
    public static <T> JsonResponse<T> badRequest() {
        return new JsonResponse<>(false, MSG_BAD_REQUEST);
    }

    /**
     * <p>
     * 系统发生错误
     * </p>
     *
     * @return com.felo.minutes.app.api.meet.request.JsonResult<T>
     * @author Karl
     * @date 2022/6/28 12:14
     */
    public static <T> JsonResponse<T> error() {
        return new JsonResponse<>(false, MSG_INTERNAL_SERVER_ERROR);
    }
}
