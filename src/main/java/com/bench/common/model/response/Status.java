package com.bench.common.model.response;

import com.bench.common.error.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * RPC body status
 * </p>
 *
 * @author Karl
 * @date 2022/6/29 17:15
 */
@Data
@NoArgsConstructor
public class Status {
    @ApiModelProperty(value = "请求成功与否,true:成功,false:失败", required = true)
    private boolean ok;

    @ApiModelProperty(value = "可读错误码")
    private String errCode;

    @ApiModelProperty(value = "提示信息")
    private ErrMetadata errMetadata;
    /**
     * 为满足rpc调用后业务方需要根据 错误码进行判断业务处理
     */
    @ApiModelProperty(value = "错误代码实体，此值非空时，则取code与message 覆盖 errCode与errMetadata")
    private ErrorCode errorCode;

    public Status(boolean ok) {
        this.ok = ok;
    }

    public Status(boolean ok, String errCode) {
        this.ok = ok;
        this.errCode = errCode;
    }

    public Status(boolean ok, String errCode, String message) {
        this.ok = ok;
        this.errCode = errCode;
        this.errMetadata = new ErrMetadata(message);
    }

    public Status(boolean ok,ErrorCode errorCodeEntry){
        this.ok =  ok;
        this.errorCode = errorCodeEntry;
        if(errorCodeEntry != null){
            this.errCode = errorCodeEntry.getName();
            this.errMetadata = new ErrMetadata(StringUtils.isNotEmpty(errorCodeEntry.getMessage())? errorCodeEntry.getMessage():errorCodeEntry.getName());
        }
    }


    public boolean equalsErrorCode(ErrorCode errorCodeEntry){
        if(errorCodeEntry == null){
            return false;
        }
        return errorCodeEntry.equals(this.getErrorCode());

    }
}
