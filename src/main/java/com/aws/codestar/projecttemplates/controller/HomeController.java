package com.aws.codestar.projecttemplates.controller;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.codestar.projecttemplates.bean.UserInfo;

public class HomeController implements RequestHandler<UserInfo, String> {

	@Override
	public String handleRequest(UserInfo input, Context context) {
		context.getLogger().log("========LOG UserInfo : "+input.toString());
		return input.toString();
	}

}
