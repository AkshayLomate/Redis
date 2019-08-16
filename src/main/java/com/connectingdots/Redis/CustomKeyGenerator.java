package com.connectingdots.Redis;

import java.lang.reflect.Method;

import org.apache.commons.pool2.KeyedPooledObjectFactory;
import org.springframework.cache.interceptor.KeyGenerator;

public class CustomKeyGenerator implements KeyGenerator{

	@Override
	public Object generate(Object target, Method method, Object... params) {
		 StringBuilder sb = new StringBuilder();
	        sb.append(target.getClass().getSimpleName())
	                .append("-")
	                .append(method.getName());

	        if (params != null) {
	            for (Object param : params) {
	                sb.append("-")
	                        .append(param.getClass().getSimpleName())
	                        .append(":").append(param);
	            }
	        }
	        return sb.toString();
	}

}
