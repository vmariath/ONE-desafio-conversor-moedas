package src;

import java.util.Map;

public class ExchangeRateResponse {
    private String base_code;
    private String time_last_update_utc;
    private String time_next_update_utc;
    private Map<String, Double> conversion_rates;

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public void setTime_next_update_utc(String time_next_update_utc) {
        this.time_next_update_utc = time_next_update_utc;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    @Override
    public String toString() {
        return "ExchangeRateResponse{" +
                "base_code='" + base_code + '\'' +
                ", time_last_update_utc='" + time_last_update_utc + '\'' +
                ", time_next_update_utc='" + time_next_update_utc + '\'' +
                ", conversion_rates=" + conversion_rates +
                '}';
    }
}
