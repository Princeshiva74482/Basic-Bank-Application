package com.bankapplication.inout;

import lombok.Data;

@Data
public class UserInput {
    private String userId;
    private String accountKey;
    private String accountNumber;

    private boolean open;
    private boolean close;
    private boolean other;
    private boolean applied;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return String return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return String return the accountKey
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * @param accountKey the accountKey to set
     */
    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }

    /**
     * @return boolean return the open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    /**
     * @return boolean return the close
     */
    public boolean isClose() {
        return close;
    }

    /**
     * @param close the close to set
     */
    public void setClose(boolean close) {
        this.close = close;
    }

    /**
     * @return boolean return the other
     */
    public boolean isOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(boolean other) {
        this.other = other;
    }

    /**
     * @return boolean return the applied
     */
    public boolean isApplied() {
        return applied;
    }

    /**
     * @param applied the applied to set
     */
    public void setApplied(boolean applied) {
        this.applied = applied;
    }

    public String getPanCardNumber() {
        return this.getPanCardNumber();
    }
}
