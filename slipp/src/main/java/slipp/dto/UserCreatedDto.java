package slipp.dto;

import slipp.domain.User;

public class UserCreatedDto {
    private String userId;
    private String password;
    private String name;
    private String email;

    private UserCreatedDto() {
    }

    public UserCreatedDto(String userId, String password, String name, String email) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public User toUser() {
        return new User(userId, password, name, email);
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
