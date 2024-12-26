package com.milind.journalismservice.enums;

public enum CitizenStatus {

    NORMAL_CITIZEN,
    JOURNALIST,
    ASSISTANT_JOURNALIST,
    POLITICIAN, //Not allowed to vote
    ADMIN; //Not allowed to vote , owner of website

    @Override
    public String toString() {
        return this.name();
    }
}
