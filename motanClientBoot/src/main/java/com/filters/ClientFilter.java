package com.filters;

import com.weibo.api.motan.core.extension.SpiMeta;
import com.weibo.api.motan.filter.Filter;
import com.weibo.api.motan.rpc.Caller;
import com.weibo.api.motan.rpc.Request;
import com.weibo.api.motan.rpc.Response;

@SpiMeta(name = "ClientFilter")
public class ClientFilter implements Filter {
    @Override
    public Response filter(Caller<?> caller, Request request) {
        System.out.println("Client request:"+request.getArguments()[0]);
        Response response=caller.call(request);
        System.out.println("Client response:"+response.getValue());
        return response;
    }
}
