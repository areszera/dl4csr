package service;

public interface UserLogService {
    void logSignIn(String time, String identity, String email, String ip);
    void logSignOut(String time, String identity, String email, String ip);
    void logSignUp(String time, String identity, String email, String ip);
}
