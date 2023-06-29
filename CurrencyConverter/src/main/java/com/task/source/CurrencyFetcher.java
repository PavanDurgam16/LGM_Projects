package com.task.source;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class CurrencyFetcher {

	private static final String API_KEY = "c5ee391f0914884e41fda943";

	public CurrencyConversionDAO fetchCurrencyData(String baseCurrency, String targetCurrency, double amount)
			throws IOException {
		String urlStr = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + baseCurrency + "/" + targetCurrency
				+ "/" + amount;

		URL url = new URL(urlStr);
		HttpURLConnection request = (HttpURLConnection) url.openConnection();
		request.connect();

		// Convert to JSON
		JsonReader reader = new JsonReader(new InputStreamReader(request.getInputStream()));
		JsonObject jsonObject = (JsonObject) JsonParser.parseReader(reader);

		String result = jsonObject.get("result").getAsString();
		if (result.equals("success")) {
			CurrencyConversionDAO currencyConversion = new CurrencyConversionDAO();
			currencyConversion.setBaseCode(jsonObject.get("base_code").getAsString());
			currencyConversion.setTargetCode(jsonObject.get("target_code").getAsString());
			currencyConversion.setConversionRate(jsonObject.get("conversion_rate").getAsDouble());
			currencyConversion.setConversionResult(jsonObject.get("conversion_result").getAsDouble());

			return currencyConversion;
		} else {
			throw new IOException("Failed to retrieve currency data");
		}
	}
}
