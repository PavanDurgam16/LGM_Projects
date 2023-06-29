package com.task.source;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConverterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String amountStr = request.getParameter("amount");
        String fromCurrency = request.getParameter("from");
        String toCurrency = request.getParameter("to");

        if (validateInput(amountStr)) {
            double amount = Double.parseDouble(amountStr);
            double conversionRate = getConversionRate(fromCurrency, toCurrency, amount);

            CurrencyFetcher currencyFetcher = new CurrencyFetcher();
            CurrencyConversionDAO currencyConversion = currencyFetcher.fetchCurrencyData(fromCurrency, toCurrency,
                    amount);

            currencyConversion.setConversionResult(convertCurrency(amount, conversionRate));

            request.setAttribute("currencyConversion", currencyConversion);

            request.getRequestDispatcher("/jsp/result.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Invalid input. Please enter a valid amount.");
            request.getRequestDispatcher("/jsp/error.jsp").forward(request, response);
        }
    }

    private boolean validateInput(String amountStr) {
        if (amountStr == null || amountStr.isEmpty())
            return false;

        try {
            double amount = Double.parseDouble(amountStr);
            return amount > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double getConversionRate(String fromCurrency, String toCurrency, double amount) {
        try {
            CurrencyFetcher currencyFetcher = new CurrencyFetcher();
            CurrencyConversionDAO currencyConversion = currencyFetcher.fetchCurrencyData(fromCurrency, toCurrency,
                    amount);
            return currencyConversion.getConversionRate();
        } catch (IOException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    private double convertCurrency(double amount, double conversionRate) {
        return amount * conversionRate;
    }
}
