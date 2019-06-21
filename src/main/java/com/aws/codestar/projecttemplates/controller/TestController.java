package com.aws.codestar.projecttemplates.controller;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TestController implements RequestHandler<Object, Object> {

	@Override
	public Object handleRequest(final Object input, final Context context) {
		if(input==null) {
			return "Response : null!";
		}
		return getResponse(input);
	}
	
	public String getResponse(Object input) {
		return "Response : "+input.toString();
	}

}
