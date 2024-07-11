package src;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/e9bc912c507ef3a6ffcad760/latest/";

    public ExchangeRateResponse getExchangeRates(String baseCurrency) {
        String url = API_URL + baseCurrency;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), ExchangeRateResponse.class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public double convertCurrency(String fromCurrency, String toCurrency, double amount, ExchangeRateResponse rates) {
        if (amount < 0) {
            throw new IllegalArgumentException("Valor para conversão não pode ser negativo");
        }

        if (rates == null || rates.getConversion_rates() == null) {
            throw new IllegalArgumentException("Dado de câmbio para conversão inválido");
        }

        Double fromRate = rates.getConversion_rates().get(fromCurrency);
        Double toRate = rates.getConversion_rates().get(toCurrency);

        if (fromRate == null || toRate == null) {
            throw new IllegalArgumentException("Moeda não encontrada.");
        }

        return amount * (toRate / fromRate);
    }
}
