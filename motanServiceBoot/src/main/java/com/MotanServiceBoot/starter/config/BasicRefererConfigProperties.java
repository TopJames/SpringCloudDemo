package com.MotanServiceBoot.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "motan.basicreferer")
public class BasicRefererConfigProperties {

    /** 服务引用 BeanId */
    private String id;

    /** 使用的协议 default motan */
    private String protocol;

    /** 服务分组 defalut default_rpc */
    private String group;

    /** 模块信息 */
    private String module;

    /** 应用信息 */
    private String application;

    /** 注册中心的id 列表，多个用“,”分隔，如果为空，则使用所有的配置中心 */
    private String registry;

    /** 检查服务提供者是否存在 */
    private String check;

    /** 设为true，将向logger 中输出访问日志 */
    private Boolean accessLog;

    /** 重试次数 defalut 0 */
    private Integer retries;

    /** 抛出异常 default true */
    private Boolean throwException;

    /** 版本 default 1.0 */
    private String version;

    /** 是否共享channel default false */
    private Boolean shareChannel;

    /** 请求超时时间(毫秒) default 200 */
    private Integer requestTimeout;

    /** 过滤器配置 */
    private String filter;

    /** 扩展配置 */
    private String extConfigId;

    /** 最大请求数，0为不做并发限制 default 0 */
    private Integer actives;

    /** 方法是否异步 default false */
    private Boolean async;

    /** 协议编码 */
    private String codec;

    /** 是否开启gzip压缩.只有compressMotan的codec才能支持 */
    private Boolean usegz;

    /** 代理类型 */
    private String proxy;

    /**
     * 开启gzip压缩的阈值.usegz开关开启，且传输数据大于此阈值时，才会进行gzip压缩。
     * 只有compressMotan的codec才能支持
     */
    private Integer mingzSize;

    /**
     * 设为true，表示使用缺省Mock类名
     * 即：接口名+Mock 后缀，服务接口调用失败Mock实现类
     */
    private String mock;

    /** 以下4个文档未描述 */
    private String errorRate;
    private String localServiceAddress;
    private String mean;
    private Boolean defaultConfig;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public Boolean getAccessLog() {
        return accessLog;
    }

    public void setAccessLog(Boolean accessLog) {
        this.accessLog = accessLog;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Boolean getThrowException() {
        return throwException;
    }

    public void setThrowException(Boolean throwException) {
        this.throwException = throwException;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getShareChannel() {
        return shareChannel;
    }

    public void setShareChannel(Boolean shareChannel) {
        this.shareChannel = shareChannel;
    }

    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getExtConfigId() {
        return extConfigId;
    }

    public void setExtConfigId(String extConfigId) {
        this.extConfigId = extConfigId;
    }

    public Integer getActives() {
        return actives;
    }

    public void setActives(Integer actives) {
        this.actives = actives;
    }

    public Boolean getAsync() {
        return async;
    }

    public void setAsync(Boolean async) {
        this.async = async;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public Boolean getUsegz() {
        return usegz;
    }

    public void setUsegz(Boolean usegz) {
        this.usegz = usegz;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public Integer getMingzSize() {
        return mingzSize;
    }

    public void setMingzSize(Integer mingzSize) {
        this.mingzSize = mingzSize;
    }

    public String getMock() {
        return mock;
    }

    public void setMock(String mock) {
        this.mock = mock;
    }

    public String getErrorRate() {
        return errorRate;
    }

    public void setErrorRate(String errorRate) {
        this.errorRate = errorRate;
    }

    public String getLocalServiceAddress() {
        return localServiceAddress;
    }

    public void setLocalServiceAddress(String localServiceAddress) {
        this.localServiceAddress = localServiceAddress;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public Boolean getDefaultConfig() {
        return defaultConfig;
    }

    public void setDefaultConfig(Boolean defaultConfig) {
        this.defaultConfig = defaultConfig;
    }
}
