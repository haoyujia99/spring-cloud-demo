package com.hao.model.ao;

import lombok.*;

/**
 * com.hao.model.ao.HttpResponse.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 11:17
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HttpResponse {

    private Integer code;
    private String message;
    private Object data;

}
