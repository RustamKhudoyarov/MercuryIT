package community.redrover.mercuryit;

import java.net.http.HttpResponse;


public class MercuryITHttpResponse extends MercuryITObject<MercuryITHttpResponse> {

    private final HttpResponse<String> response;

    MercuryITHttpResponse(MercuryITConfigHolder configHolder, HttpResponse<String> response) {
        super(configHolder);
        this.response = response;
    }

    public int getCode() {
        return response.statusCode();
    }

    public String getBody() {
        return response.body();
    }

    public <T> T getBody(Class<T> clazz) {
        return  config(MercuryITJsonConfig.class).fromJson(getBody(), clazz);
    }
}
