package com.motanService.filters;

import com.weibo.api.motan.core.extension.SpiMeta;
import com.weibo.api.motan.filter.Filter;
import com.weibo.api.motan.rpc.Caller;
import com.weibo.api.motan.rpc.Request;
import com.weibo.api.motan.rpc.Response;

@SpiMeta(name = "ServiceFilter")
public class ServiceFilter implements Filter {
    @Override
    public Response filter(Caller<?> caller, Request request) {
        System.out.println("request:"+request.getArguments()[0]);
        Response res=caller.call(request);
        System.out.println("response:"+res.getValue());
        return res;
    }
}
