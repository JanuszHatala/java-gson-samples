package com.hatala.jhdemo8json;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Target({ TYPE, METHOD })
@Retention(RUNTIME)
@RequestMapping(method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @interface JsonGetMapping {

	@AliasFor(annotation = RequestMapping.class, attribute = "value")
	String[] value() default {};
}
