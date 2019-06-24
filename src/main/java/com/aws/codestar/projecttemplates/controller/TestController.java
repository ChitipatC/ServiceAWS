package com.aws.codestar.projecttemplates.controller;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.codestar.projecttemplates.GatewayResponse;
import com.aws.codestar.projecttemplates.bean.UserInfo;

public class TestController implements RequestHandler<UserInfo, Object> {

	@Override
	public Object handleRequest(UserInfo input, Context context) {
		 Map<String, String> headers = new HashMap<>();
         headers.put("Content-Type", "application/json");
         context.getLogger().log(input.toString());
         return new GatewayResponse(new JSONObject().put("response", input.toString()).toString(), headers, 200);
	}

}
