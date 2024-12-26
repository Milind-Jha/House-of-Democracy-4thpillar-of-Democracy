package com.milind.journalismservice.enums;

public enum VotingTopics {

    POLITICIAN_RESIGN,
    IAS_TRANSFER,
    IPS_TRANSFER,
    CBI_INVESTIGATION,
    ED_INVESTIGATION;

    @Override
    public String toString(){
        return this.name();
    }
}
