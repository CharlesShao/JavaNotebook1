package com.komorebishao5;

public class FDoor extends Door implements Lock, DoorBell {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void bell() {
        System.out.println("按铃");
    }

    @Override
    public void closeLock() {
        System.out.println("关锁");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");
    }
}
