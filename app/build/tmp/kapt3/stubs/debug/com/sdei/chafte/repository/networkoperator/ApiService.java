package com.sdei.chafte.repository.networkoperator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ae\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\'J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000eH\'J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0010H\'J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0013H\'J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003H\'J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J0\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u001bH\'J$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u0006H\'J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\'J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003H\'J0\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\"H\'J\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\'H\'J\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J$\u0010(\u001a\b\u0012\u0004\u0012\u00020*0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020+H\'J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0007\u001a\u00020.H\'J\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J$\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u000202H\'J$\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u000205H\'J$\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\'J\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J$\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020<H\'J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010\u0007\u001a\u00020?H\'J$\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\'J\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J$\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\'JB\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010G\u001a\u00020\u00062\b\b\u0001\u0010H\u001a\u00020\u00062\b\b\u0001\u0010I\u001a\u00020\u00062\b\b\u0001\u0010J\u001a\u00020\u0006H\'J8\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010H\u001a\u00020\u00062\b\b\u0001\u0010I\u001a\u00020\u00062\b\b\u0001\u0010J\u001a\u00020\u0006H\'J\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020NH\'J\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020NH\'J\u0018\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020NH\'J\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020NH\'J$\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020TH\'J$\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020VH\'J$\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020XH\'J\u0018\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u00032\b\b\u0001\u0010[\u001a\u00020\\H\'J\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J$\u0010_\u001a\b\u0012\u0004\u0012\u00020`0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\'J\u0018\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020NH\'J\u0018\u0010b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020cH\'J\u0018\u0010d\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020cH\'J\u0018\u0010e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020cH\'J\u0018\u0010f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020gH\'J\u0018\u0010h\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020iH\'\u00a8\u0006j"}, d2 = {"Lcom/sdei/chafte/repository/networkoperator/ApiService;", "", "getAboutUpdateProfile", "Lretrofit2/Call;", "Lcom/sdei/chafte/model/EditProfileModel;", "authen", "", "body", "Lcom/sdei/chafte/pojoclasses/AboutUpdatePojo;", "getAcceptRequest", "Lcom/sdei/chafte/model/SendOtpResponse;", "Lcom/sdei/chafte/pojoclasses/DetailPojo;", "getAddSearchPeople", "Lcom/sdei/chafte/model/RecentUserResponse;", "Lcom/sdei/chafte/pojoclasses/RecentUserAddPojo;", "getAddSearchRoom", "Lcom/sdei/chafte/pojoclasses/RecentRoomAddPojo;", "getAllRoom", "Lcom/sdei/chafte/model/RoomModel;", "Lcom/sdei/chafte/pojoclasses/FilterPojo;", "getCancelRoom", "getCategoryAll", "Lcom/sdei/chafte/model/CategoryModel;", "getCompanyDetails", "getCreateRoom", "Lcom/sdei/chafte/model/CreateRoomModel;", "timezone", "Lcom/sdei/chafte/pojoclasses/CreateRoomPojo;", "getDeleteRecentSearch", "id", "getDeleteRoom", "getDrinkAll", "Lcom/sdei/chafte/model/DrinkBaseModel;", "getEditeRoom", "Lcom/sdei/chafte/pojoclasses/UpdateRoomPojo;", "getFriendList", "Lcom/sdei/chafte/model/FriendListModel;", "getGmailLogin", "Lcom/sdei/chafte/model/GmailLoginModel;", "Lcom/sdei/chafte/pojoclasses/GmailLoginPojo;", "getJoinRoom", "Lcom/sdei/chafte/model/JoinedRoomModel;", "Lcom/sdei/chafte/model/JoinRoomResponse;", "Lcom/sdei/chafte/pojoclasses/JoinRoomPojo;", "getLogin", "Lcom/sdei/chafte/model/LoginModel;", "Lcom/sdei/chafte/pojoclasses/LoginPojo;", "getLogout", "getMoviesName", "Lcom/sdei/chafte/model/IMDBResultModel;", "Lcom/sdei/chafte/pojoclasses/IMDBSearchPojo;", "getMyEventRoom", "Lcom/sdei/chafte/model/MyEventModel;", "Lcom/sdei/chafte/pojoclasses/MyEventPojo;", "getMyRoomDetails", "Lcom/sdei/chafte/model/MyEventDetailModel;", "getProfile", "Lcom/sdei/chafte/model/MyProfileModel;", "getProfilePrivacy", "Lcom/sdei/chafte/model/AccountVisibilityModel;", "Lcom/sdei/chafte/pojoclasses/AccountVisibilityPojo;", "getRegistration", "Lcom/sdei/chafte/model/RegistrationReponse;", "Lcom/sdei/chafte/pojoclasses/RegistrationPojo;", "getRejectRequest", "getResentSearch", "Lcom/sdei/chafte/model/RecentSearchModel;", "getRoomDetails", "Lcom/sdei/chafte/model/DetailEventModel;", "getSearch", "Lcom/sdei/chafte/model/SearchModel;", "classroom", "searchtext", "page", "pageSize", "getSearchPeople", "Lcom/sdei/chafte/model/PeopleModel;", "getSendOTPForgotPassword", "Lcom/sdei/chafte/pojoclasses/SendOtpPojo;", "getSendOtpRegistration", "getSendOtpWithPhoneForgotPassword", "getSendOtpWithPhoneRegistration", "getSendRequest", "Lcom/sdei/chafte/model/ShowDataAndMessageModel;", "Lcom/sdei/chafte/pojoclasses/SendFriendRequestPojo;", "getUpdateDrink", "Lcom/sdei/chafte/pojoclasses/UpdateDrinkPojo;", "getUpdateProfile", "Lcom/sdei/chafte/pojoclasses/UpdateProfilePojo;", "getUpload", "Lcom/sdei/chafte/model/ImageUploadModel;", "image", "Lokhttp3/MultipartBody$Part;", "getUserNotification", "Lcom/sdei/chafte/model/NotificationModel;", "getUserProfile", "Lcom/sdei/chafte/model/UserProfileModel;", "getVerfityEmailPhone", "getVerfityOtpWithEmail", "Lcom/sdei/chafte/pojoclasses/VerifyEmailPhonePojo;", "getVerfityOtpWithEmailPhoneForForgot", "getVerfityOtpWithPhone", "getVerfityUsername", "Lcom/sdei/chafte/pojoclasses/CheckUsernamePojo;", "getchangePassword", "Lcom/sdei/chafte/pojoclasses/ChangePasswordPojo;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "GetCompanyForSetupAsync")
    public abstract retrofit2.Call<java.lang.String> getCompanyDetails();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drink/getAll")
    public abstract retrofit2.Call<com.sdei.chafte.model.DrinkBaseModel> getDrinkAll();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "category/getAll")
    public abstract retrofit2.Call<com.sdei.chafte.model.CategoryModel> getCategoryAll();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "friends/getAll/friend/list")
    public abstract retrofit2.Call<com.sdei.chafte.model.FriendListModel> getFriendList(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "room/getAll")
    public abstract retrofit2.Call<com.sdei.chafte.model.RoomModel> getAllRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.FilterPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "movie/get")
    public abstract retrofit2.Call<com.sdei.chafte.model.IMDBResultModel> getMoviesName(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.IMDBSearchPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "room/get/rooms/created/by/user ")
    public abstract retrofit2.Call<com.sdei.chafte.model.MyEventModel> getMyEventRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.MyEventPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "room/join")
    public abstract retrofit2.Call<com.sdei.chafte.model.JoinRoomResponse> getJoinRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.JoinRoomPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "room/cancle/room/joining")
    public abstract retrofit2.Call<com.sdei.chafte.model.EditProfileModel> getCancelRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.DetailPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/register")
    public abstract retrofit2.Call<com.sdei.chafte.model.RegistrationReponse> getRegistration(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.RegistrationPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "authentication/update/profile")
    public abstract retrofit2.Call<com.sdei.chafte.model.EditProfileModel> getUpdateProfile(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.UpdateProfilePojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "authentication/update/profile")
    public abstract retrofit2.Call<com.sdei.chafte.model.EditProfileModel> getUpdateDrink(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.UpdateDrinkPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "authentication/update/profile")
    public abstract retrofit2.Call<com.sdei.chafte.model.EditProfileModel> getAboutUpdateProfile(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.AboutUpdatePojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "authentication/update/user/privacy")
    public abstract retrofit2.Call<com.sdei.chafte.model.EditProfileModel> getProfilePrivacy(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.AccountVisibilityPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "authentication/get/user/privacy")
    public abstract retrofit2.Call<com.sdei.chafte.model.AccountVisibilityModel> getProfilePrivacy(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "recent/search/{id}")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getDeleteRecentSearch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "room/get")
    public abstract retrofit2.Call<com.sdei.chafte.model.DetailEventModel> getRoomDetails(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.DetailPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "room/delete")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getDeleteRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.DetailPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "room/get/user/list/with/room/details")
    public abstract retrofit2.Call<com.sdei.chafte.model.MyEventDetailModel> getMyRoomDetails(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.DetailPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/login")
    public abstract retrofit2.Call<com.sdei.chafte.model.LoginModel> getLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.LoginPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/logout")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getLogout(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "authentication/get/profile")
    public abstract retrofit2.Call<com.sdei.chafte.model.MyProfileModel> getProfile(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/room?")
    public abstract retrofit2.Call<com.sdei.chafte.model.SearchModel> getSearch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "roomClass")
    java.lang.String classroom, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchtext, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "pageSize")
    java.lang.String pageSize);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/user?")
    public abstract retrofit2.Call<com.sdei.chafte.model.PeopleModel> getSearchPeople(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchtext, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "pageSize")
    java.lang.String pageSize);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "recent/search/")
    public abstract retrofit2.Call<com.sdei.chafte.model.RecentSearchModel> getResentSearch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "notification/getAll/notifications")
    public abstract retrofit2.Call<com.sdei.chafte.model.NotificationModel> getUserNotification(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "friends/accept/friend/request")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getAcceptRequest(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.DetailPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "recent/search/")
    public abstract retrofit2.Call<com.sdei.chafte.model.RecentUserResponse> getAddSearchPeople(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.RecentUserAddPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "recent/search/")
    public abstract retrofit2.Call<com.sdei.chafte.model.RecentUserResponse> getAddSearchRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.RecentRoomAddPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "friends/reject/friend/request")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getRejectRequest(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.DetailPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "friends/get/user/profile")
    public abstract retrofit2.Call<com.sdei.chafte.model.UserProfileModel> getUserProfile(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.DetailPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "friends/send/friend/request")
    public abstract retrofit2.Call<com.sdei.chafte.model.ShowDataAndMessageModel> getSendRequest(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.SendFriendRequestPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "room/get/rooms/joined/by/user")
    public abstract retrofit2.Call<com.sdei.chafte.model.JoinedRoomModel> getJoinRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/login/by/google")
    public abstract retrofit2.Call<com.sdei.chafte.model.GmailLoginModel> getGmailLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.GmailLoginPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/send/email")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getSendOtpRegistration(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.SendOtpPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/send/mail/otp/forget/password")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getSendOTPForgotPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.SendOtpPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/send/otp")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getSendOtpWithPhoneRegistration(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.SendOtpPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/send/phone/otp/forget/password")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getSendOtpWithPhoneForgotPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.SendOtpPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/verify/phone")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getVerfityOtpWithPhone(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.VerifyEmailPhonePojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/verify/email")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getVerfityOtpWithEmail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.VerifyEmailPhonePojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/check/username")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getVerfityUsername(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.CheckUsernamePojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/check/email/and/phone")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getVerfityEmailPhone(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.SendOtpPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/forget/password/verify/otp")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getVerfityOtpWithEmailPhoneForForgot(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.VerifyEmailPhonePojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/reset/password")
    public abstract retrofit2.Call<com.sdei.chafte.model.SendOtpResponse> getchangePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.ChangePasswordPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "room/add")
    public abstract retrofit2.Call<com.sdei.chafte.model.CreateRoomModel> getCreateRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "timezone")
    java.lang.String timezone, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.CreateRoomPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "room/update")
    public abstract retrofit2.Call<com.sdei.chafte.model.CreateRoomModel> getEditeRoom(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authen, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "timezone")
    java.lang.String timezone, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sdei.chafte.pojoclasses.UpdateRoomPojo body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "upload")
    @retrofit2.http.Multipart()
    public abstract retrofit2.Call<com.sdei.chafte.model.ImageUploadModel> getUpload(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image);
}