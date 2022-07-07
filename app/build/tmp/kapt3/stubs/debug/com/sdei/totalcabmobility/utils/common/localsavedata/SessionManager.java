package com.sdei.totalcabmobility.utils.common.localsavedata;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u001f\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/sdei/totalcabmobility/utils/common/localsavedata/SessionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mContext", "sharedPreferences", "Landroid/content/SharedPreferences;", "getBooleanValue", "", "key", "", "getUserData", "getvalue", "logout", "", "setBooleanValue", "value", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "setValue", "Companion", "app_debug"})
public final class SessionManager {
    private final android.content.Context mContext = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String INSIDE_APP = "inside_app";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String AUTHENTICATION = "token";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String USER_IMAGE = "image";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FIRST_NAME = "first_name";
    
    public SessionManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final void setBooleanValue(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    public final boolean getBooleanValue(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserData(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
    
    public final void logout(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getvalue(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/sdei/totalcabmobility/utils/common/localsavedata/SessionManager$Companion;", "", "()V", "AUTHENTICATION", "", "getAUTHENTICATION", "()Ljava/lang/String;", "setAUTHENTICATION", "(Ljava/lang/String;)V", "FIRST_NAME", "getFIRST_NAME", "setFIRST_NAME", "INSIDE_APP", "getINSIDE_APP", "setINSIDE_APP", "USER_ID", "getUSER_ID", "setUSER_ID", "USER_IMAGE", "getUSER_IMAGE", "setUSER_IMAGE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getINSIDE_APP() {
            return null;
        }
        
        public final void setINSIDE_APP(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER_ID() {
            return null;
        }
        
        public final void setUSER_ID(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAUTHENTICATION() {
            return null;
        }
        
        public final void setAUTHENTICATION(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER_IMAGE() {
            return null;
        }
        
        public final void setUSER_IMAGE(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFIRST_NAME() {
            return null;
        }
        
        public final void setFIRST_NAME(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}