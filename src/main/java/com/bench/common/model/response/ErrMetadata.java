package com.bench.common.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
public class ErrMetadata {
    private final List<String> messages = new ArrayList<>();

    public ErrMetadata(String detail) {
        this.messages.add(detail);
    }

    public void addDetail(String detail) {
        this.messages.add(detail);
    }
}
