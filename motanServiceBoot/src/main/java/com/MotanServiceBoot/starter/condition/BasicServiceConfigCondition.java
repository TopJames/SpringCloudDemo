package com.MotanServiceBoot.starter.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

public class BasicServiceConfigCondition implements Condition{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        return (!StringUtils.isEmpty(env.getProperty("motan.basicservice.exportPort"))
                || !StringUtils.isEmpty(env.getProperty("motan.basicservice.export")));
    }
}
