package com.bankapplication.inputoutput;

import lombok.Data;

@Data
public class UserInput {
    private String userId;
    private String accountKey;

    private boolean open;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    private boolean close;
}
