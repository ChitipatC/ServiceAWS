package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Handler for requests to Lambda function.
 */
public class HelloWorldHandler implements RequestHandler<Object, Object> {
	
    public Object handleRequest(final Object input, final Context context) {
    	context.getLogger().log("In handleRequest");
        return input.toString();
    }
}
