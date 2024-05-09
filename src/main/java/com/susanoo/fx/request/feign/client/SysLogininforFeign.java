package com.susanoo.fx.request.feign.client;

import com.google.gson.JsonObject;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import com.susanoo.fx.domain.SysLogininfor;
import com.susanoo.fx.domain.page.TableDataInfo;
import com.susanoo.fx.request.feign.FeignAPI;

import java.util.Map;

/**
 * 系统访问记录
 *
 * @author ruoyi
 */
public interface SysLogininforFeign extends FeignAPI {
    @RequestLine("GET /monitor/logininfor/list")
    TableDataInfo list(@QueryMap Map<String, Object> query);

    @RequestLine("POST /system/logininfor/export")
    void export( SysLogininfor logininfor);

    @RequestLine("DELETE /system/logininfor/{infoIds}")
    JsonObject remove(@Param("infoIds") String infoIds);

    @RequestLine("DELETE /system/logininfor/clean")
    JsonObject clean();

    @RequestLine("GET /system/logininfor/unlock/{userName}")
    JsonObject unlock(@Param("userName") String userName);

    @RequestLine("POST /system/logininfor")
    JsonObject add( SysLogininfor logininfor);
}
