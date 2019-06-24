package com.aws.codestar.projecttemplates.controller;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TestController implements RequestHandler<Object, Object> {

	@Override
	public Object handleRequest(final Object input, final Context context) {
		if(input==null||input=="") {
			return "====Body : null!====";
		}
		return getResponse(input,context);
	}
	
	public Object getResponse(Object input,Context context) {
    	context.getLogger().log("=====In handleRequest=====");
    	
        return "=====RESPONES : "+input.toString()+"=====";
	}

}
