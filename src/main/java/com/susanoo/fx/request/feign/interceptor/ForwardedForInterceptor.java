package com.susanoo.fx.request.feign.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import com.susanoo.fx.store.AppStore;

public class ForwardedForInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {

        template.header("Authorization", AppStore.getToken());
    }
}