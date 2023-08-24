package lesson_28.interfaces;

public interface InterfaceDefault {
    int getUserId();

    default int getAdminId() {
        return 25;
    }
}
