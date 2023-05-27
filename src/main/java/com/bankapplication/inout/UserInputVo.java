//package com.bankapplication.inout;
//
//import io.swagger.v3.oas.annotations.media.Schema;
//import lombok.Data;
//
//@Data
//public class UserInputVo {
//
//    private String panCardNumber;
//    private String userId;
//
//    @Schema(defaultValue = "false")
//    private boolean closed;
//    @Schema(defaultValue = "false")
//    private boolean opened;
//    @Schema(defaultValue = "false")
//    private boolean pending;
//
//    public String getPanCardNumber() {
//        return panCardNumber;
//    }
//
//    public void setPanCardNumber(String panCardNumber) {
//        this.panCardNumber = panCardNumber;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public boolean isClosed() {
//        return closed;
//    }
//
//    public void setClosed(boolean closed) {
//        this.closed = closed;
//    }
//
//    public boolean isOpened() {
//        return opened;
//    }
//
//    public void setOpened(boolean opened) {
//        this.opened = opened;
//    }
//
//    public boolean isPending() {
//        return pending;
//    }
//
//    public void setPending(boolean pending) {
//        this.pending = pending;
//    }
//}
