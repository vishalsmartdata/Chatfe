package com.sdei.chafte.pojoclasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0015H\u00c6\u0003J\t\u00104\u001a\u00020\u0010H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\t\u0010<\u001a\u00020\u000eH\u00c6\u0003J\t\u0010=\u001a\u00020\u0010H\u00c6\u0003J\u009f\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010?\u001a\u00020\u00102\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020BH\u00d6\u0001J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\'R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001c\u00a8\u0006D"}, d2 = {"Lcom/sdei/chafte/pojoclasses/RegistrationPojo;", "", "dating", "Lcom/sdei/chafte/pojoclasses/Dating;", "designation", "", "dob", "Lcom/sdei/chafte/pojoclasses/Dob;", "drink", "email", "fname", "gender", "Lcom/sdei/chafte/pojoclasses/Gender;", "hometown", "Lcom/sdei/chafte/pojoclasses/Hometown;", "interestedInDate", "", "lname", "password", "phone", "profileImg", "Lcom/sdei/chafte/pojoclasses/ProfileImg;", "notification", "username", "(Lcom/sdei/chafte/pojoclasses/Dating;Ljava/lang/String;Lcom/sdei/chafte/pojoclasses/Dob;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdei/chafte/pojoclasses/Gender;Lcom/sdei/chafte/pojoclasses/Hometown;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdei/chafte/pojoclasses/ProfileImg;ZLjava/lang/String;)V", "getDating", "()Lcom/sdei/chafte/pojoclasses/Dating;", "getDesignation", "()Ljava/lang/String;", "getDob", "()Lcom/sdei/chafte/pojoclasses/Dob;", "getDrink", "getEmail", "getFname", "getGender", "()Lcom/sdei/chafte/pojoclasses/Gender;", "getHometown", "()Lcom/sdei/chafte/pojoclasses/Hometown;", "getInterestedInDate", "()Z", "getLname", "getNotification", "getPassword", "getPhone", "getProfileImg", "()Lcom/sdei/chafte/pojoclasses/ProfileImg;", "getUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class RegistrationPojo {
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.pojoclasses.Dating dating = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String designation = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.pojoclasses.Dob dob = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String drink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fname = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.pojoclasses.Gender gender = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.pojoclasses.Hometown hometown = null;
    private final boolean interestedInDate = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.pojoclasses.ProfileImg profileImg = null;
    private final boolean notification = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.RegistrationPojo copy(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.Dating dating, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.Dob dob, @org.jetbrains.annotations.NotNull()
    java.lang.String drink, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.Gender gender, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.Hometown hometown, boolean interestedInDate, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.ProfileImg profileImg, boolean notification, @org.jetbrains.annotations.NotNull()
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
    
    public RegistrationPojo(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.Dating dating, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.Dob dob, @org.jetbrains.annotations.NotNull()
    java.lang.String drink, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.Gender gender, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.Hometown hometown, boolean interestedInDate, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.ProfileImg profileImg, boolean notification, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.Dating component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.Dating getDating() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDesignation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.Dob component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.Dob getDob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDrink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.Gender component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.Gender getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.Hometown component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.Hometown getHometown() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getInterestedInDate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.ProfileImg component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.pojoclasses.ProfileImg getProfileImg() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getNotification() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
}