package com.sdei.chafte.ui.authentication.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u00a4\u0001\u001a\u00030\u00a5\u0001J\u0011\u0010\u00a6\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u00a7\u0001\u001a\u00020\u0017J\u0011\u0010\u00a8\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u00a7\u0001\u001a\u00020\u0017J\u0014\u0010\u00a9\u0001\u001a\u00030\u00a5\u00012\b\u0010\u00aa\u0001\u001a\u00030\u00ab\u0001H\u0002J\u0014\u0010\u00ac\u0001\u001a\u00030\u00a5\u00012\b\u0010\u00aa\u0001\u001a\u00030\u00ab\u0001H\u0002J\u001b\u0010\u00ad\u0001\u001a\u00030\u00a5\u00012\u0006\u0010>\u001a\u00020\u00072\u0007\u0010\u00ae\u0001\u001a\u00020\u0007H\u0002J\u0014\u0010\u00af\u0001\u001a\u00030\u00a5\u00012\b\u0010\u00b0\u0001\u001a\u00030\u00b1\u0001H\u0002J\u0014\u0010\u00b2\u0001\u001a\u00030\u00a5\u00012\b\u0010\u00b0\u0001\u001a\u00030\u00b1\u0001H\u0002J\u0013\u0010\u00b3\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0007H\u0002J\u0011\u0010\u00b4\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\u0007J\u0011\u0010\u00b6\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\u0007J\u0011\u0010\u00b7\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\u0007J\u0011\u0010\u00b8\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\u0007J\u0011\u0010\u00b9\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u00ba\u0001\u001a\u00020eJ\b\u0010\u00bb\u0001\u001a\u00030\u00a5\u0001J\u000f\u0010\u00bc\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006J\u001f\u0010\u00bd\u0001\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`8\u0018\u00010\u0006J\u001f\u0010\u00be\u0001\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000706j\b\u0012\u0004\u0012\u00020\u0007`8\u0018\u00010\u0006J\u000f\u0010\u00bf\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006J\u000f\u0010\u00c0\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0010\u0010\u00c1\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0099\u0001\u0018\u00010\u0006J\u000f\u0010\u00c2\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000f\u0010\u00c3\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000f\u0010\u00c4\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\b\u0010\u00c5\u0001\u001a\u00030\u00a5\u0001J\b\u0010\u00c6\u0001\u001a\u00030\u00a5\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0004R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u001a\u0010+\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\u001a\u0010.\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR \u00101\u001a\b\u0012\u0004\u0012\u00020\u00070&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010(\"\u0004\b3\u00104R2\u00105\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`8\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR\u001a\u0010;\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u0010\u001eR\u001a\u0010>\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u001a\u0010C\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010\u001eR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010(R\u001a\u0010H\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001c\"\u0004\bJ\u0010\u001eR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010(R\u001a\u0010M\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001c\"\u0004\bO\u0010\u001eR\u001a\u0010P\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001c\"\u0004\bR\u0010\u001eR\u001a\u0010S\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u001c\"\u0004\bU\u0010\u001eR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010(R\u001a\u0010X\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u001c\"\u0004\bZ\u0010\u001eR2\u0010[\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000706j\b\u0012\u0004\u0012\u00020\u0007`8\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\t\"\u0004\b]\u0010\u000bR\u001a\u0010^\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001c\"\u0004\b`\u0010\u001eR \u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010(\"\u0004\bc\u00104R\u001a\u0010d\u001a\u00020eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010f\"\u0004\bg\u0010hR\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020e0&\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010(R\u001a\u0010j\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u001c\"\u0004\bl\u0010\u001eR\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010(R\u001c\u0010o\u001a\u0004\u0018\u00010pX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010(R\u001a\u0010w\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u001c\"\u0004\by\u0010\u001eR \u0010z\u001a\b\u0012\u0004\u0012\u00020e0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010(\"\u0004\b|\u00104R \u0010}\u001a\b\u0012\u0004\u0012\u00020e0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010(\"\u0004\b\u007f\u00104R#\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070&X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010(\"\u0005\b\u0082\u0001\u00104R#\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070&X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010(\"\u0005\b\u0085\u0001\u00104R#\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070&X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010(\"\u0005\b\u0088\u0001\u00104R#\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070&X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010(\"\u0005\b\u008b\u0001\u00104R\u001d\u0010\u008c\u0001\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u001c\"\u0005\b\u008e\u0001\u0010\u001eR\u0019\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010(R\u001d\u0010\u0091\u0001\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u001c\"\u0005\b\u0093\u0001\u0010\u001eR\u0019\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010(R\u0019\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020e0&\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010(R&\u0010\u0098\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0099\u0001\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\t\"\u0005\b\u009b\u0001\u0010\u000bR%\u0010\u009c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\t\"\u0005\b\u009e\u0001\u0010\u000bR\u001d\u0010\u009f\u0001\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010\u001c\"\u0005\b\u00a1\u0001\u0010\u001eR\u0019\u0010\u00a2\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070&\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a3\u0001\u0010(\u00a8\u0006\u00c7\u0001"}, d2 = {"Lcom/sdei/chafte/ui/authentication/registration/RegistrationVM;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "VerifyEmailNumberResponse", "Landroidx/lifecycle/MutableLiveData;", "", "getVerifyEmailNumberResponse", "()Landroidx/lifecycle/MutableLiveData;", "setVerifyEmailNumberResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "VerifyOtpResponse", "getVerifyOtpResponse", "setVerifyOtpResponse", "VerifyUsernameResponse", "getVerifyUsernameResponse", "setVerifyUsernameResponse", "app", "getApp", "()Landroid/app/Application;", "setApp", "backbuttonClick", "", "getBackbuttonClick", "setBackbuttonClick", "birthDateVisiblity", "getBirthDateVisiblity", "()Ljava/lang/String;", "setBirthDateVisiblity", "(Ljava/lang/String;)V", "click_Button", "getClick_Button", "setClick_Button", "confirmPassword", "getConfirmPassword", "setConfirmPassword", "confirmPasswordObserver", "Landroidx/databinding/ObservableField;", "getConfirmPasswordObserver", "()Landroidx/databinding/ObservableField;", "dateOfBirthObserver", "getDateOfBirthObserver", "date_of_birth", "getDate_of_birth", "setDate_of_birth", "datingVisibility", "getDatingVisibility", "setDatingVisibility", "drinkObserver", "getDrinkObserver", "setDrinkObserver", "(Landroidx/databinding/ObservableField;)V", "drinkResponse", "Ljava/util/ArrayList;", "Lcom/sdei/chafte/model/DrinkModel;", "Lkotlin/collections/ArrayList;", "getDrinkResponse", "setDrinkResponse", "drink_id", "getDrink_id", "setDrink_id", "email", "getEmail", "setEmail", "emailObserver", "getEmailObserver", "firstName", "getFirstName", "setFirstName", "firstnameObserver", "getFirstnameObserver", "gender", "getGender", "setGender", "genderObservers", "getGenderObservers", "genderVisiblity", "getGenderVisiblity", "setGenderVisiblity", "homeTownVisibilty", "getHomeTownVisibilty", "setHomeTownVisibilty", "hometown", "getHometown", "setHometown", "howeTownObserver", "getHoweTownObserver", "imagePath", "getImagePath", "setImagePath", "imageUploadResponse", "getImageUploadResponse", "setImageUploadResponse", "interestedDating", "getInterestedDating", "setInterestedDating", "interestedDatingObserver", "getInterestedDatingObserver", "setInterestedDatingObserver", "isVerified", "", "()Z", "setVerified", "(Z)V", "isVerifiedObserver", "lastName", "getLastName", "setLastName", "lastnameObserver", "getLastnameObserver", "mPhotoFile", "Ljava/io/File;", "getMPhotoFile", "()Ljava/io/File;", "setMPhotoFile", "(Ljava/io/File;)V", "notListedObservers", "getNotListedObservers", "not_listed", "getNot_listed", "setNot_listed", "optionEmail", "getOptionEmail", "setOptionEmail", "optionPhonenumber", "getOptionPhonenumber", "setOptionPhonenumber", "otpFirstObserver", "getOtpFirstObserver", "setOtpFirstObserver", "otpFouthObserver", "getOtpFouthObserver", "setOtpFouthObserver", "otpSecondObserver", "getOtpSecondObserver", "setOtpSecondObserver", "otpThirdObserver", "getOtpThirdObserver", "setOtpThirdObserver", "password", "getPassword", "setPassword", "passwordObserver", "getPasswordObserver", "phoneName", "getPhoneName", "setPhoneName", "phoneNumberObserver", "getPhoneNumberObserver", "progressObservable", "getProgressObservable", "registrationReponse", "Lcom/sdei/chafte/model/RegistrationReponseData;", "getRegistrationReponse", "setRegistrationReponse", "sendOtpResponse", "getSendOtpResponse", "setSendOtpResponse", "username", "getUsername", "setUsername", "usernameObserver", "getUsernameObserver", "OtpVerification", "", "backButtonClick", "position", "buttonClickForNext", "callSendOtp", "sendOtpPojo", "Lcom/sdei/chafte/pojoclasses/SendOtpPojo;", "callSendOtpWithPhoneNumber", "callVerifyEmailNumber", "phonenumber", "callVerifyOtpEmail", "verifyEmailPhonePojo", "Lcom/sdei/chafte/pojoclasses/VerifyEmailPhonePojo;", "callVerifyOtpWithPhoneNumber", "callVerifyUserName", "checkBirthDate", "text", "checkDating", "checkGender", "checkHomeTown", "doRegistrationProcess", "notification", "getAllDrink", "observerBackButtonClickResponse", "observerDrinkResponse", "observerImageUploadResponse", "observerNextButtonResponse", "observerOtpResponse", "observerRegistrationResponse", "observerVerifyEmailPhoneResponse", "observerVerifyOtpResponse", "observerVerifyUsernameResponse", "sendOtpVerification", "uploadImage", "app_debug"})
public final class RegistrationVM extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> click_Button;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> backbuttonClick;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> usernameObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> passwordObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> confirmPasswordObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> firstnameObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> lastnameObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> emailObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> phoneNumberObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> dateOfBirthObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> genderObservers = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> notListedObservers = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> howeTownObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> isVerifiedObserver = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> drinkObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> interestedDatingObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> otpFirstObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> otpSecondObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> otpThirdObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> otpFouthObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> optionEmail;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> optionPhonenumber;
    @org.jetbrains.annotations.Nullable()
    private java.io.File mPhotoFile;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imagePath = "";
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> imageUploadResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.DrinkModel>> drinkResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.RegistrationReponseData> registrationReponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> sendOtpResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> VerifyOtpResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> VerifyUsernameResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> VerifyEmailNumberResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> progressObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String username = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String confirmPassword = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firstName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phoneName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String date_of_birth = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hometown = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String drink_id = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String gender = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String not_listed = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String interestedDating = "";
    private boolean isVerified = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String birthDateVisiblity = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String genderVisiblity = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String datingVisibility = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String homeTownVisibilty = "";
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    
    public RegistrationVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getClick_Button() {
        return null;
    }
    
    public final void setClick_Button(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getBackbuttonClick() {
        return null;
    }
    
    public final void setBackbuttonClick(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUsernameObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getPasswordObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getConfirmPasswordObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getFirstnameObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getLastnameObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEmailObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getPhoneNumberObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDateOfBirthObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getGenderObservers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getNotListedObservers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getHoweTownObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isVerifiedObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDrinkObserver() {
        return null;
    }
    
    public final void setDrinkObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getInterestedDatingObserver() {
        return null;
    }
    
    public final void setInterestedDatingObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getOtpFirstObserver() {
        return null;
    }
    
    public final void setOtpFirstObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getOtpSecondObserver() {
        return null;
    }
    
    public final void setOtpSecondObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getOtpThirdObserver() {
        return null;
    }
    
    public final void setOtpThirdObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getOtpFouthObserver() {
        return null;
    }
    
    public final void setOtpFouthObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getOptionEmail() {
        return null;
    }
    
    public final void setOptionEmail(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getOptionPhonenumber() {
        return null;
    }
    
    public final void setOptionPhonenumber(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getMPhotoFile() {
        return null;
    }
    
    public final void setMPhotoFile(@org.jetbrains.annotations.Nullable()
    java.io.File p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImagePath() {
        return null;
    }
    
    public final void setImagePath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getImageUploadResponse() {
        return null;
    }
    
    public final void setImageUploadResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.DrinkModel>> getDrinkResponse() {
        return null;
    }
    
    public final void setDrinkResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.DrinkModel>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.RegistrationReponseData> getRegistrationReponse() {
        return null;
    }
    
    public final void setRegistrationReponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.RegistrationReponseData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSendOtpResponse() {
        return null;
    }
    
    public final void setSendOtpResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getVerifyOtpResponse() {
        return null;
    }
    
    public final void setVerifyOtpResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getVerifyUsernameResponse() {
        return null;
    }
    
    public final void setVerifyUsernameResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getVerifyEmailNumberResponse() {
        return null;
    }
    
    public final void setVerifyEmailNumberResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getProgressObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConfirmPassword() {
        return null;
    }
    
    public final void setConfirmPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneName() {
        return null;
    }
    
    public final void setPhoneName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_of_birth() {
        return null;
    }
    
    public final void setDate_of_birth(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHometown() {
        return null;
    }
    
    public final void setHometown(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDrink_id() {
        return null;
    }
    
    public final void setDrink_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNot_listed() {
        return null;
    }
    
    public final void setNot_listed(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInterestedDating() {
        return null;
    }
    
    public final void setInterestedDating(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isVerified() {
        return false;
    }
    
    public final void setVerified(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthDateVisiblity() {
        return null;
    }
    
    public final void setBirthDateVisiblity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenderVisiblity() {
        return null;
    }
    
    public final void setGenderVisiblity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDatingVisibility() {
        return null;
    }
    
    public final void setDatingVisibility(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomeTownVisibilty() {
        return null;
    }
    
    public final void setHomeTownVisibilty(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.Nullable()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> observerNextButtonResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> observerBackButtonClickResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> observerImageUploadResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.DrinkModel>> observerDrinkResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.RegistrationReponseData> observerRegistrationResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerOtpResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerVerifyUsernameResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerVerifyEmailPhoneResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerVerifyOtpResponse() {
        return null;
    }
    
    public final void buttonClickForNext(int position) {
    }
    
    public final void backButtonClick(int position) {
    }
    
    public final void sendOtpVerification() {
    }
    
    private final void callSendOtp(com.sdei.chafte.pojoclasses.SendOtpPojo sendOtpPojo) {
    }
    
    private final void callSendOtpWithPhoneNumber(com.sdei.chafte.pojoclasses.SendOtpPojo sendOtpPojo) {
    }
    
    public final void OtpVerification() {
    }
    
    private final void callVerifyEmailNumber(java.lang.String email, java.lang.String phonenumber) {
    }
    
    private final void callVerifyUserName(java.lang.String username) {
    }
    
    private final void callVerifyOtpWithPhoneNumber(com.sdei.chafte.pojoclasses.VerifyEmailPhonePojo verifyEmailPhonePojo) {
    }
    
    private final void callVerifyOtpEmail(com.sdei.chafte.pojoclasses.VerifyEmailPhonePojo verifyEmailPhonePojo) {
    }
    
    public final void uploadImage() {
    }
    
    public final void getAllDrink() {
    }
    
    public final void checkBirthDate(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void checkGender(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void checkDating(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void checkHomeTown(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void doRegistrationProcess(boolean notification) {
    }
}