package com.eventtracker;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Marks methods for audit logging
@Retention(RetentionPolicy.RUNTIME)
public @interface AuditTrail {
    String action() default "UNKNOWN"; // Optional metadata about the action
}
