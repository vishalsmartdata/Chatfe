package com.sdei.chafte.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bI\b\u0086\b\u0018\u00002\u00020\u0001B\u00e5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010\'\u001a\u00020\u0005\u00a2\u0006\u0002\u0010(J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010N\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u00c6\u0003J\t\u0010O\u001a\u00020\u0016H\u00c6\u0003J\t\u0010P\u001a\u00020\u0018H\u00c6\u0003J\t\u0010Q\u001a\u00020\u001aH\u00c6\u0003J\t\u0010R\u001a\u00020\u001aH\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u0005H\u00c6\u0003J\t\u0010U\u001a\u00020\u001aH\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\"H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010[\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0005H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\tH\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\fH\u00c6\u0003J\t\u0010d\u001a\u00020\u000eH\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\u009d\u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\'\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010g\u001a\u00020\u001a2\b\u0010h\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010i\u001a\u00020\u0003H\u00d6\u0001J\t\u0010j\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010&\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010,R!\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010@R\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0011\u0010\u001e\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u0011\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010,R\u0011\u0010 \u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010,R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\'\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010,R\u0011\u0010#\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010,R\u0011\u0010$\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u0011\u0010%\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010,\u00a8\u0006k"}, d2 = {"Lcom/sdei/chafte/model/UserProfileData;", "", "__v", "", "_id", "", "aboutYourself", "createdAt", "dating", "Lcom/sdei/chafte/model/Dating;", "designation", "dob", "Lcom/sdei/chafte/model/Dob;", "drink", "Lcom/sdei/chafte/model/Drink;", "email", "fname", "friendsArr", "Ljava/util/ArrayList;", "Lcom/sdei/chafte/model/FriendsArr;", "Lkotlin/collections/ArrayList;", "gender", "Lcom/sdei/chafte/model/GenderX;", "hometown", "Lcom/sdei/chafte/model/HometownX;", "interestedInDate", "", "isFriendRequest", "lname", "loginType", "notification", "password", "phone", "profileImg", "Lcom/sdei/chafte/model/ProfileImgX;", "status", "updatedAt", "username", "chatHeadId", "requestStatus", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdei/chafte/model/Dating;Ljava/lang/String;Lcom/sdei/chafte/model/Dob;Lcom/sdei/chafte/model/Drink;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/sdei/chafte/model/GenderX;Lcom/sdei/chafte/model/HometownX;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/sdei/chafte/model/ProfileImgX;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getAboutYourself", "getChatHeadId", "getCreatedAt", "getDating", "()Lcom/sdei/chafte/model/Dating;", "getDesignation", "getDob", "()Lcom/sdei/chafte/model/Dob;", "getDrink", "()Lcom/sdei/chafte/model/Drink;", "getEmail", "getFname", "getFriendsArr", "()Ljava/util/ArrayList;", "getGender", "()Lcom/sdei/chafte/model/GenderX;", "getHometown", "()Lcom/sdei/chafte/model/HometownX;", "getInterestedInDate", "()Z", "getLname", "getLoginType", "getNotification", "getPassword", "getPhone", "getProfileImg", "()Lcom/sdei/chafte/model/ProfileImgX;", "getRequestStatus", "getStatus", "getUpdatedAt", "getUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class UserProfileData {
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
    private final com.sdei.chafte.model.Drink drink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.FriendsArr> friendsArr = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.model.GenderX gender = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.model.HometownX hometown = null;
    private final boolean interestedInDate = false;
    private final boolean isFriendRequest = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String loginType = null;
    private final boolean notification = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.model.ProfileImgX profileImg = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String chatHeadId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String requestStatus = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.UserProfileData copy(int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String aboutYourself, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Dating dating, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Dob dob, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Drink drink, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sdei.chafte.model.FriendsArr> friendsArr, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.GenderX gender, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.HometownX hometown, boolean interestedInDate, boolean isFriendRequest, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String loginType, boolean notification, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.ProfileImgX profileImg, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String chatHeadId, @org.jetbrains.annotations.NotNull()
    java.lang.String requestStatus) {
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
    
    public UserProfileData(int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String aboutYourself, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Dating dating, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Dob dob, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.Drink drink, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sdei.chafte.model.FriendsArr> friendsArr, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.GenderX gender, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.HometownX hometown, boolean interestedInDate, boolean isFriendRequest, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String loginType, boolean notification, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.model.ProfileImgX profileImg, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String chatHeadId, @org.jetbrains.annotations.NotNull()
    java.lang.String requestStatus) {
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
    public final com.sdei.chafte.model.Drink component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.Drink getDrink() {
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
    public final java.util.ArrayList<com.sdei.chafte.model.FriendsArr> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.FriendsArr> getFriendsArr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.GenderX component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.GenderX getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.HometownX component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.HometownX getHometown() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getInterestedInDate() {
        return false;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean isFriendRequest() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLoginType() {
        return null;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean getNotification() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.ProfileImgX component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.model.ProfileImgX getProfileImg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChatHeadId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequestStatus() {
        return null;
    }
}