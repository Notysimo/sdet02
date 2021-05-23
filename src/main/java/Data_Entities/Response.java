package Data_Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"status", "data", "message"})
public class Response {
    private String status;
    private User data;
    private String message;

    Response() {
        this.status = "";
        this.data = new User();
        this.message = "";
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("data")
    public User getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(User data) {
        this.data = data;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }
}
