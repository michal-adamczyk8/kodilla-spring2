package com.kodilla.spring.reader;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.locks.Condition;

public class IfDaysIsOddCondition implements org.springframework.context.annotation.Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return LocalDate.now().getDayOfMonth() % 2 == 0;
    }
}
