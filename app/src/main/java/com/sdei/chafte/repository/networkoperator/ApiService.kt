package com.sdei.chafte.repository.networkoperator


import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.*
import com.sdei.chafte.pojoclasses.ProfileImg
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*


interface ApiService {

    @GET("GetCompanyForSetupAsync")
    fun getCompanyDetails(): Call<String>

    @GET("drink/getAll")
    fun getDrinkAll(): Call<DrinkBaseModel>

    @GET("category/getAll")
    fun getCategoryAll(): Call<CategoryModel>

    @GET("friends/getAll/friend/list")
    fun getFriendList(@Header ("Authorization") authen:String?): Call<FriendListModel>

    @POST("room/getAll")
    fun getAllRoom(@Header ("Authorization") authen:String?,@Body body: FilterPojo): Call<RoomModel>

    @POST("movie/get")
    fun getMoviesName(@Header ("Authorization") authen:String?,@Body body: IMDBSearchPojo): Call<IMDBResultModel>

    @POST("room/get/rooms/created/by/user ")
    fun getMyEventRoom(@Header ("Authorization") authen:String?,@Body body: MyEventPojo): Call<MyEventModel>

    @POST("room/join")
    fun getJoinRoom(@Header ("Authorization") authen:String?,@Body body: JoinRoomPojo): Call<JoinRoomResponse>

    @POST("room/cancle/room/joining")
    fun getCancelRoom(@Header ("Authorization") authen:String?,@Body body: DetailPojo): Call<EditProfileModel>

    @POST("authentication/register")
    fun getRegistration(@Body body: RegistrationPojo): Call<RegistrationReponse>

    @PUT("authentication/update/profile")
    fun getUpdateProfile(@Header ("Authorization") authen:String?, @Body body: UpdateProfilePojo): Call<EditProfileModel>

    @PUT("authentication/update/profile")
    fun getUpdateDrink(@Header ("Authorization") authen:String?, @Body body: UpdateDrinkPojo): Call<EditProfileModel>

    @PUT("authentication/update/profile")
    fun getAboutUpdateProfile(@Header ("Authorization") authen:String?, @Body body: AboutUpdatePojo): Call<EditProfileModel>

    @PUT("authentication/update/user/privacy")
    fun getProfilePrivacy(@Header ("Authorization") authen:String?, @Body body: AccountVisibilityPojo): Call<EditProfileModel>

    @GET("authentication/get/user/privacy")
    fun getProfilePrivacy(@Header ("Authorization") authen:String?): Call<AccountVisibilityModel>

    @DELETE("recent/search/{id}")
    fun getDeleteRecentSearch(@Header ("Authorization") authen:String?,@Path("id") id:String): Call<SendOtpResponse>

    @POST("room/get")
    fun getRoomDetails(@Header ("Authorization") authen:String?,@Body body: DetailPojo): Call<DetailEventModel>

   @POST("room/delete")
    fun getDeleteRoom(@Header ("Authorization") authen:String?,@Body body: DetailPojo): Call<SendOtpResponse>

    @POST("user/block")
    fun getBlockUser(@Header ("Authorization") authen:String?,@Body body: UserBlockPojo): Call<SendOtpResponse>

    @POST("room/get/user/list/with/room/details")
    fun getMyRoomDetails(@Header ("Authorization") authen:String?,@Body body: DetailPojo): Call<MyEventDetailModel>

    @POST("authentication/login")
    fun getLogin(@Body body: LoginPojo): Call<LoginModel>

    @POST("authentication/logout")
    fun getLogout(@Header ("Authorization") authen:String?): Call<SendOtpResponse>

    @GET("authentication/get/profile")
    fun getProfile(@Header ("Authorization") authen:String?): Call<MyProfileModel>

    @GET("search/room?")
    fun getSearch(@Header ("Authorization") authen:String?,@Query("roomClass") classroom:String,@Query("q") searchtext:String,@Query("page") page:String,@Query("pageSize") pageSize:String): Call<SearchModel>

    @GET("search/user?")
    fun getSearchPeople(@Header ("Authorization") authen:String?,@Query("q") searchtext:String,@Query("page") page:String,@Query("pageSize")pageSize:String): Call<PeopleModel>

    @GET("recent/search/")
    fun getResentSearch(@Header ("Authorization") authen:String?): Call<RecentSearchModel>

   /* @GET("friends/getAll/friend/requests")
    fun getUserRequest(@Header ("Authorization") authen:String?): Call<FriendRequestModel>*/

    @GET("notification/getAll/notifications")
    fun getUserNotification(@Header ("Authorization") authen:String?): Call<NotificationModel>

    @POST("friends/accept/friend/request")
    fun getAcceptRequest(@Header ("Authorization") authen:String?,@Body body: AcceptRejectPojo): Call<SendOtpResponse>

    @POST("recent/search/")
    fun getAddSearchPeople(@Header ("Authorization") authen:String?,@Body body: RecentUserAddPojo): Call<RecentUserResponse>

    @POST("recent/search/")
    fun getAddSearchRoom(@Header ("Authorization") authen:String?,@Body body: RecentRoomAddPojo): Call<RecentUserResponse>

    @POST("friends/reject/friend/request")
    fun getRejectRequest(@Header ("Authorization") authen:String?,@Body body: AcceptRejectPojo): Call<SendOtpResponse>

    @POST("friends/get/user/profile")
    fun getUserProfile(@Header ("Authorization") authen:String?, @Body body: DetailPojo): Call<UserProfileModel>

    @POST("authentication/get/recent/suggestion/user/data")
    fun getRecentUserProfile(@Header ("Authorization") authen:String?, @Body body: RecentUserProfile): Call<RecentSuggestionModel>

    @POST("friends/send/friend/request")
    fun getSendRequest(@Header ("Authorization") authen:String?, @Body body: SendFriendRequestPojo): Call<ShowDataAndMessageModel>

    @POST("friends/unfriend")
    fun getUnfriend(@Header ("Authorization") authen:String?, @Body body: UnfriendPojo): Call<ShowDataAndMessageModel>

    @GET("room/get/rooms/joined/by/user")
    fun getJoinRoom(@Header ("Authorization") authen:String?): Call<JoinedRoomModel>

    @POST("authentication/login/by/google")
    fun getGmailLogin(@Body body: GmailLoginPojo): Call<GmailLoginModel>

    @POST("authentication/send/email")
    fun getSendOtpRegistration(@Body body: SendOtpPojo): Call<SendOtpResponse>

    @POST("authentication/send/mail/otp/forget/password")
    fun getSendOTPForgotPassword(@Body body: SendOtpPojo): Call<SendOtpResponse>

    @POST("authentication/send/otp")
    fun getSendOtpWithPhoneRegistration(@Body body: SendOtpPojo): Call<SendOtpResponse>

    @POST("authentication/send/phone/otp/forget/password")
    fun getSendOtpWithPhoneForgotPassword(@Body body: SendOtpPojo): Call<SendOtpResponse>

    @POST("authentication/verify/phone")
    fun getVerfityOtpWithPhone(@Body body: VerifyEmailPhonePojo): Call<SendOtpResponse>

    @POST("authentication/verify/email")
    fun getVerfityOtpWithEmail(@Body body: VerifyEmailPhonePojo): Call<SendOtpResponse>

    @POST("authentication/check/username")
    fun getVerfityUsername(@Body body: CheckUsernamePojo): Call<SendOtpResponse>

    @POST("authentication/check/email/and/phone")
    fun getVerfityEmailPhone(@Body body: SendOtpPojo): Call<SendOtpResponse>

    @POST("authentication/forget/password/verify/otp")
    fun getVerfityOtpWithEmailPhoneForForgot(@Body body: VerifyEmailPhonePojo): Call<SendOtpResponse>

    @POST("authentication/reset/password")
    fun getchangePassword(@Body body: ChangePasswordPojo): Call<SendOtpResponse>

    @POST("room/add")
    fun getCreateRoom(@Header ("Authorization") authen:String?,@Header ("timezone") timezone:String?,@Body body: CreateRoomPojo): Call<CreateRoomModel>

    @PUT("room/update")
    fun getEditeRoom(@Header ("Authorization") authen:String?,@Header ("timezone") timezone:String?,@Body body: UpdateRoomPojo): Call<CreateRoomModel>

    @Multipart
    @POST("upload")
    fun getUpload(@Part image: MultipartBody.Part): Call<ImageUploadModel>

    @GET("user/block")
    fun getBlockedUser(@Header ("Authorization") authen:String?): Call<BlockList>

    @PUT("user/unblock")
    fun getUnBlockUser(@Header ("Authorization") authen:String?, @Body body: Unblock): Call<UnblockUser>

}