package com.milind.journalismservice.enums;

public enum JournalistStatus {

    INDEPENDENT,
    TV;

    @Override
    public String toString(){
        return this.name();
    }
}
