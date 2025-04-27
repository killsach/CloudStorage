package com.example.cloudstorage;

import android.util.Log;

public class User {
    private String username; // имя пользователя
    private String password; // пароль пользователя

    /**
     * конструктор класса User.
     * username имя пользователя.
     * password пароль пользователя.
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * метод для аутентификации пользователя.
     * inputUsername имя пользователя для проверки.
     * inputPassword пароль для проверки.
     * true, если аутентификация успешна, иначе false.
     */
    public boolean authenticate(String inputUsername, String inputPassword) {
        Log.d("User ", "Попытка аутентификации пользователя: " + inputUsername);
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            Log.d("User ", "Аутентификация успешна для пользователя: " + inputUsername);
            return true;
        } else {
            Log.e("User ", "Ошибка аутентификации для пользователя: " + inputUsername);
            return false;
        }
    }

    /**
     * метод для изменения пароля пользователя.
     * oldPassword старый пароль.
     * newPassword новый пароль.
     * return true, если изменение пароля успешно, иначе false.
     */
    public boolean changePassword(String oldPassword, String newPassword) {
        Log.d("User ", "Попытка изменения пароля для пользователя: " + username);
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            Log.d("User ", "Пароль успешно изменен для пользователя: " + username);
            return true;
        } else {
            Log.e("User ", "Ошибка изменения пароля для пользователя: " + username);
            return false;
        }
    }

    // геттеры и сеттеры
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
