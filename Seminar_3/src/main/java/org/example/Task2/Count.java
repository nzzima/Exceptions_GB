package org.example.Task2;

public class Count implements AutoCloseable{
    private int count = 0;
    private boolean isOpen = true;

    public void checkOpen() throws Exception {
        if (!isOpen) {
            throw new Exception("Экземпляр закрыт");
        }
    }

    public void add() throws Exception{
        checkOpen();
        count++;
    }

    public int getCount() throws Exception {
        checkOpen();
        return count;
    }

    @Override
    public void close() throws Exception {
        isOpen = false;
        System.out.println("Работа метода 'close'");
    }
}
