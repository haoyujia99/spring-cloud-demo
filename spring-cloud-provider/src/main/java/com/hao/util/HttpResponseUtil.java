package com.hao.util;

import com.hao.model.ao.HttpResponse;

/**
 * com.hao.util.HttpResponseUtil.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 11:18
 */
public class HttpResponseUtil {

    private HttpResponseUtil() {
        throw new IllegalStateException("Not Authorized To Create HttpResponseUtil.class");
    }

    public static HttpResponse success(Object object) {
        return getHttpResponse(HttpResponseCode.SUCCESS, object);
    }

    public static HttpResponse failed(Object object) {
        return getHttpResponse(HttpResponseCode.FAILED, object);
    }

    private static HttpResponse getHttpResponse(HttpResponseCode httpResponseCode, Object object) {
        return new HttpResponse(httpResponseCode.code, httpResponseCode.message, object);
    }

    private enum HttpResponseCode {

        /**
         * HttpResponseCode
         */
        SUCCESS(200, "SUCCESS"),
        FAILED(-1, "FAILED");

        private final Integer code;
        private final String message;

        HttpResponseCode(Integer code, String message) {
            this.code = code;
            this.message = message;
        }
    }

}
