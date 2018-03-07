package com.mulesoft.training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MuleComponent {

	public Map<String, String> processMap(Map<String, String> input) {
		input.put("processedBy", "processMap");
		return input;
	}

	public Map<String, String> processArray(List<String> input) {
		Map<String, String> output = new HashMap<String, String>();
		output.put("message", input.get(0));
		output.put("processedBy", "processedArray");

		return output;
	}

	public Map<String, String> processString(String input) {
		Map<String, String> output = new HashMap<String, String>();
		output.put("message", input);
		output.put("processedBy", "processedArray");
		return null;
	}

}
