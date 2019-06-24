package com.aws.codestar.projecttemplates.controller;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.codestar.projecttemplates.GatewayResponse;

public class TestController implements RequestHandler<Object, Object> {

	@Override
	public Object handleRequest(final Object input, final Context context) {
		if(input==null) {
			return "Response : null!";
		}
		return getResponse(input);
	}
	
	public Object getResponse(Object input) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return new GatewayResponse(new JSONObject().put("Output", input.toString()).toString(), headers, 200);
	}

}
