package Principal;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarDivisa {
        public Divisas obtenerDivisas(String divisaBase, String divisaObjetivo){
            URI direction = URI.create("https://v6.exchangerate-api.com/v6/80b129e41b2a9987338ec4d0/pair/"+divisaBase+"/"+divisaObjetivo);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direction)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Divisas.class);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

