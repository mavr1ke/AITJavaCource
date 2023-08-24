package lesson_28.interfaces.series;

import lesson_28.interfaces.InterfaceDefault;

public class ClassDefault implements InterfaceDefault {
    @Override
    public int getUserId() {
        return InterfaceDefault.super.getAdminId();
    }

    public int getAdminID() {
        return 345;
    }
}
