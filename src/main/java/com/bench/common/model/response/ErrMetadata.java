package com.bench.common.model.response;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * rpc body error metadata
 * </p>
 *
 * @author Karl
 * @date 2022/6/29 17:16
 */
@Getter
public class ErrMetadata {
    private final List<String> message = new ArrayList<>();

    public ErrMetadata(String detail) {
        this.message.add(detail);
    }

    public void addDetail(String detail) {
        this.message.add(detail);
    }
}
