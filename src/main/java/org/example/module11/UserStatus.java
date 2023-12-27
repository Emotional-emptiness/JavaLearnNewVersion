package org.example.module11;

public class UserStatus {
    public static final UserStatus ACTIVE = new UserStatus("ACTIVE");
    public static final UserStatus NOT_ACTIVE = new UserStatus("NOT_ACTIVE");

    private final String status;

    private UserStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
