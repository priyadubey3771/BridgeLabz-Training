package com.healthcheckpro;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Marks an API method as public (no authentication required)
@Retention(RetentionPolicy.RUNTIME)
public @interface PublicAPI 
{
	
}

// Marks an API method that requires authentication
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresAuth 
{
	
}
