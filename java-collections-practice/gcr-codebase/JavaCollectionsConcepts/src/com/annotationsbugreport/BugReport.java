package com.annotationsbugreport;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
public @interface BugReport 
{
    String description();
}
