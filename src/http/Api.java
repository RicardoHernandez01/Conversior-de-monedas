package http;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {

    private final String URL =  "https://v6.exchangerate-api.com/v6/4a8178dfdc0eb5e4da17582f/pair/";
    private HttpResponse<String> response;

    public Api(String[] moneda, Float monto) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(generarDireccion(moneda, monto)))
                .build();
        response = client
                .send(request, HttpResponse
                        .BodyHandlers
                        .ofString());


    }

    private String generarDireccion(String[] moneda, Float monto){
        return "%s/%s/%s/%4f".formatted(URL,moneda[0],moneda[1],monto);
    }

    public HttpResponse<String> getResponse() {
        return response;
    }
}
