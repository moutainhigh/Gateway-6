package com.creditcloud.investmentfund.lionfund.api.moneyfund.model;

import com.fasterxml.jackson.databind.ObjectMapper;

public class POJO {
	public String toJSON() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String text = mapper.writeValueAsString(this);
			return text;
		} catch (Exception e) {
			return "{}";
		}
	}

        @Override
	public String toString() {
		return toJSON();
	}
}