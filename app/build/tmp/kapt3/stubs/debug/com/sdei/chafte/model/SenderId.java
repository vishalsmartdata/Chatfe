package com.sdei.chafte.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b@\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010 J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0001H\u00c6\u0003J\t\u0010C\u001a\u00020\u0012H\u00c6\u0003J\t\u0010D\u001a\u00020\u0014H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0014H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u001cH\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\tH\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\fH\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\u00ef\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010X\u001a\u00020\u00142\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00d6\u0001J\t\u0010[\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0011\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0011\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010$\u00a8\u0006\\"}, d2 = {"Lcom/sdei/chafte/model/SenderId;", "", "__v", "", "_id", "", "aboutYourself", "createdAt", "dating", "Lcom/sdei/chafte/model/Dating;", "designation", "dob", "Lcom/sdei/chafte/model/Dob;", "drink", "email", "fname", "gender", "hometown", "Lcom/sdei/chafte/model/Hometown;", "interestedInDate", "", "lname", "loginType", "notification", "otp", "password", "phone", "profileImg", "Lcom/sdei/chafte/model/ProfileImg;", "status", "updatedAt", "username", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdei/chafte/model/Dating;Ljava/lang/String;Lcom/sdei/chafte/model/Dob;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/sdei/chafte/model/Hometown;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdei/chafte/model/ProfileImg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getAboutYourself", "getCreatedAt", "getDating", "()Lcom/sdei/chafte/model/Dating;", "getDesignation", "getDob", "()Lcom/sdei/chafte/model/Dob;", "getDrink", "getEmail", "getFname", "getGender", "()Ljava/lang/Object;", "getHometown", "()Lcom/sdei/chafte/model/Hometown;", "getInterestedInDate", "()Z", "getLname", "getLoginType", "getNotification", "getOtp", "getPassword", "getPhone", "getProfileImg", "()Lcom/sdei/chafte/model/ProfileImg;", "getStatus", "getUpdatedAt", "getUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class SenderId {
    private final int __v = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String _id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String aboutYourself = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.model.Dating dating = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String designation = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.model.Dob dob = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String drink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object gender = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.model.Hometown hometown = null;
    private final boolean interestedInDate = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String loginType = null;
    private final boolean notification = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String otp = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.model.ProfileImg profileImg = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.SenderId copy(int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String aboutYourself, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Dating dating, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Dob dob, @org.jetbrains.annotations.NotNull()
    java.lang.String drink, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    java.lang.Object gender, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Hometown hometown, boolean interestedInDate, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String loginType, boolean notification, @org.jetbrains.annotations.NotNull()
    java.lang.String otp, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.ProfileImg profileImg, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SenderId(int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String aboutYourself, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Dating dating, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Dob dob, @org.jetbrains.annotations.NotNull()
    java.lang.String drink, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    java.lang.Object gender, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Hometown hometown, boolean interestedInDate, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String loginType, boolean notification, @org.jetbrains.annotations.NotNull()
    java.lang.String otp, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.ProfileImg profileImg, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int get__v() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAboutYourself() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.Dating component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.Dating getDating() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDesignation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.Dob component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.Dob getDob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDrink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.Hometown component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.Hometown getHometown() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getInterestedInDate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLoginType() {
        return null;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean getNotification() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.ProfileImg component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.ProfileImg getProfileImg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
}