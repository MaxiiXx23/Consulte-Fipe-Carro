package br.com.challengepipe.challengepipe.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
public class PipeAPI {
    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1/";
    private HttpClient CLIENT = HttpClient.newHttpClient();
    private String type;
    private String brandCode;
    private String carCode;
    public String  getBrandsByType (String type) {

        var address = BASE_URL + type + "/marcas";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = null;

        try {

            response = this.CLIENT
                    .send(request, HttpResponse.BodyHandlers.ofString());

            this.type = type;
            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String  getModelsByBrandCode (String code) {

        var address = BASE_URL + this.type + "/marcas/" + code + "/modelos";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = null;

        try {

            response = this.CLIENT
                    .send(request, HttpResponse.BodyHandlers.ofString());

            this.brandCode = code;
            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String  getYearsByModelCar (String carCode) {

        var address = BASE_URL + this.type + "/marcas/" + this.brandCode + "/modelos" + carCode + "/anos";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = null;

        try {

            response = this.CLIENT
                    .send(request, HttpResponse.BodyHandlers.ofString());

            this.carCode = carCode;
            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String  getValueCar (String year) {

        var address = BASE_URL + this.type + "/marcas/" + this.brandCode
                + "/modelos" + carCode + "/anos" + year;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = null;

        try {

            response = this.CLIENT
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
