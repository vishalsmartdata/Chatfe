package com.sdei.chafte;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sdei.chafte.databinding.ActivityAboutEditBindingImpl;
import com.sdei.chafte.databinding.ActivityAuthenticationBindingImpl;
import com.sdei.chafte.databinding.ActivityChatBindingImpl;
import com.sdei.chafte.databinding.ActivityCreateEventBindingImpl;
import com.sdei.chafte.databinding.ActivityEventDetailsBindingImpl;
import com.sdei.chafte.databinding.ActivityFilterBindingImpl;
import com.sdei.chafte.databinding.ActivityHomeBindingImpl;
import com.sdei.chafte.databinding.ActivityMainBindingImpl;
import com.sdei.chafte.databinding.ActivityNotificationBindingImpl;
import com.sdei.chafte.databinding.ActivityProfilePreviewBindingImpl;
import com.sdei.chafte.databinding.ActivitySettingBindingImpl;
import com.sdei.chafte.databinding.ActivityVoteToRemoveBindingImpl;
import com.sdei.chafte.databinding.DrinkRecyclerItemBindingImpl;
import com.sdei.chafte.databinding.DummyBindingImpl;
import com.sdei.chafte.databinding.FragmentAccountActivityBindingImpl;
import com.sdei.chafte.databinding.FragmentAccountVisibilityBindingImpl;
import com.sdei.chafte.databinding.FragmentCalendarBindingImpl;
import com.sdei.chafte.databinding.FragmentCalendarWeekBindingImpl;
import com.sdei.chafte.databinding.FragmentChangePasswordBindingImpl;
import com.sdei.chafte.databinding.FragmentCompleteForgotPasswordBindingImpl;
import com.sdei.chafte.databinding.FragmentCompleteRegistrationBindingImpl;
import com.sdei.chafte.databinding.FragmentEventFragmentBindingImpl;
import com.sdei.chafte.databinding.FragmentFirstForgotPasswordBindingImpl;
import com.sdei.chafte.databinding.FragmentFirstSlideBindingImpl;
import com.sdei.chafte.databinding.FragmentForgotPasswordBindingImpl;
import com.sdei.chafte.databinding.FragmentFouthSlideBindingImpl;
import com.sdei.chafte.databinding.FragmentHomeBindingImpl;
import com.sdei.chafte.databinding.FragmentIntroBindingImpl;
import com.sdei.chafte.databinding.FragmentLoginBindingImpl;
import com.sdei.chafte.databinding.FragmentMessageBindingImpl;
import com.sdei.chafte.databinding.FragmentOtpForgotPasswordBindingImpl;
import com.sdei.chafte.databinding.FragmentOtpForgotPasswordRegistrationBindingImpl;
import com.sdei.chafte.databinding.FragmentOtpSelectOptionBindingImpl;
import com.sdei.chafte.databinding.FragmentProfileBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationAfterFouthPageBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationAfterInsideFouthPageBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationFifthBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationFirstpageBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationFouthpageBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationFrontPageBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationSecondpageBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationSixthBindingImpl;
import com.sdei.chafte.databinding.FragmentRegistrationThirdpageBindingImpl;
import com.sdei.chafte.databinding.FragmentSearchBindingImpl;
import com.sdei.chafte.databinding.FragmentSecondSlideBindingImpl;
import com.sdei.chafte.databinding.FragmentSettingBindingImpl;
import com.sdei.chafte.databinding.FragmentThirdSlideBindingImpl;
import com.sdei.chafte.databinding.FragmentViewFriendlistBindingImpl;
import com.sdei.chafte.databinding.FragmentViewProfileBindingImpl;
import com.sdei.chafte.databinding.FriendListLayoutBindingImpl;
import com.sdei.chafte.databinding.FriendsItemAdapterBindingImpl;
import com.sdei.chafte.databinding.HomeItemAdapterBindingImpl;
import com.sdei.chafte.databinding.HomeSelectedItemAdapterBindingImpl;
import com.sdei.chafte.databinding.InviteFriendsAdapterBindingImpl;
import com.sdei.chafte.databinding.MessageAdapterBindingImpl;
import com.sdei.chafte.databinding.MessageBannerAdapterBindingImpl;
import com.sdei.chafte.databinding.MessageLayoutBindingImpl;
import com.sdei.chafte.databinding.MyEventItemAdapterBindingImpl;
import com.sdei.chafte.databinding.PeopleAdapterBindingImpl;
import com.sdei.chafte.databinding.ProfileDrinkLayoutBindingImpl;
import com.sdei.chafte.databinding.RecentSearchLayoutBindingImpl;
import com.sdei.chafte.databinding.RowHomeListBindingImpl;
import com.sdei.chafte.databinding.RowSideMenuBindingImpl;
import com.sdei.chafte.databinding.SearchItemAdapterBindingImpl;
import com.sdei.chafte.databinding.SelectFriendLayoutBindingImpl;
import com.sdei.chafte.databinding.SelectRoomLayoutBindingImpl;
import com.sdei.chafte.databinding.SelectUserAdapterBindingImpl;
import com.sdei.chafte.databinding.SortByAdapterBindingImpl;
import com.sdei.chafte.databinding.TimeItemAdapterBindingImpl;
import com.sdei.chafte.databinding.UserFriendRequestAdapterBindingImpl;
import com.sdei.chafte.databinding.UserListAdapterBindingImpl;
import com.sdei.chafte.databinding.ViewSideProfileBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYABOUTEDIT = 1;

  private static final int LAYOUT_ACTIVITYAUTHENTICATION = 2;

  private static final int LAYOUT_ACTIVITYCHAT = 3;

  private static final int LAYOUT_ACTIVITYCREATEEVENT = 4;

  private static final int LAYOUT_ACTIVITYEVENTDETAILS = 5;

  private static final int LAYOUT_ACTIVITYFILTER = 6;

  private static final int LAYOUT_ACTIVITYHOME = 7;

  private static final int LAYOUT_ACTIVITYMAIN = 8;

  private static final int LAYOUT_ACTIVITYNOTIFICATION = 9;

  private static final int LAYOUT_ACTIVITYPROFILEPREVIEW = 10;

  private static final int LAYOUT_ACTIVITYSETTING = 11;

  private static final int LAYOUT_ACTIVITYVOTETOREMOVE = 12;

  private static final int LAYOUT_DRINKRECYCLERITEM = 13;

  private static final int LAYOUT_DUMMY = 14;

  private static final int LAYOUT_FRAGMENTACCOUNTACTIVITY = 15;

  private static final int LAYOUT_FRAGMENTACCOUNTVISIBILITY = 16;

  private static final int LAYOUT_FRAGMENTCALENDAR = 17;

  private static final int LAYOUT_FRAGMENTCALENDARWEEK = 18;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 19;

  private static final int LAYOUT_FRAGMENTCOMPLETEFORGOTPASSWORD = 20;

  private static final int LAYOUT_FRAGMENTCOMPLETEREGISTRATION = 21;

  private static final int LAYOUT_FRAGMENTEVENTFRAGMENT = 22;

  private static final int LAYOUT_FRAGMENTFIRSTFORGOTPASSWORD = 23;

  private static final int LAYOUT_FRAGMENTFIRSTSLIDE = 24;

  private static final int LAYOUT_FRAGMENTFORGOTPASSWORD = 25;

  private static final int LAYOUT_FRAGMENTFOUTHSLIDE = 26;

  private static final int LAYOUT_FRAGMENTHOME = 27;

  private static final int LAYOUT_FRAGMENTINTRO = 28;

  private static final int LAYOUT_FRAGMENTLOGIN = 29;

  private static final int LAYOUT_FRAGMENTMESSAGE = 30;

  private static final int LAYOUT_FRAGMENTOTPFORGOTPASSWORD = 31;

  private static final int LAYOUT_FRAGMENTOTPFORGOTPASSWORDREGISTRATION = 32;

  private static final int LAYOUT_FRAGMENTOTPSELECTOPTION = 33;

  private static final int LAYOUT_FRAGMENTPROFILE = 34;

  private static final int LAYOUT_FRAGMENTREGISTRATION = 35;

  private static final int LAYOUT_FRAGMENTREGISTRATIONAFTERFOUTHPAGE = 36;

  private static final int LAYOUT_FRAGMENTREGISTRATIONAFTERINSIDEFOUTHPAGE = 37;

  private static final int LAYOUT_FRAGMENTREGISTRATIONFIFTH = 38;

  private static final int LAYOUT_FRAGMENTREGISTRATIONFIRSTPAGE = 39;

  private static final int LAYOUT_FRAGMENTREGISTRATIONFOUTHPAGE = 40;

  private static final int LAYOUT_FRAGMENTREGISTRATIONFRONTPAGE = 41;

  private static final int LAYOUT_FRAGMENTREGISTRATIONSECONDPAGE = 42;

  private static final int LAYOUT_FRAGMENTREGISTRATIONSIXTH = 43;

  private static final int LAYOUT_FRAGMENTREGISTRATIONTHIRDPAGE = 44;

  private static final int LAYOUT_FRAGMENTSEARCH = 45;

  private static final int LAYOUT_FRAGMENTSECONDSLIDE = 46;

  private static final int LAYOUT_FRAGMENTSETTING = 47;

  private static final int LAYOUT_FRAGMENTTHIRDSLIDE = 48;

  private static final int LAYOUT_FRAGMENTVIEWFRIENDLIST = 49;

  private static final int LAYOUT_FRAGMENTVIEWPROFILE = 50;

  private static final int LAYOUT_FRIENDLISTLAYOUT = 51;

  private static final int LAYOUT_FRIENDSITEMADAPTER = 52;

  private static final int LAYOUT_HOMEITEMADAPTER = 53;

  private static final int LAYOUT_HOMESELECTEDITEMADAPTER = 54;

  private static final int LAYOUT_INVITEFRIENDSADAPTER = 55;

  private static final int LAYOUT_MESSAGEADAPTER = 56;

  private static final int LAYOUT_MESSAGEBANNERADAPTER = 57;

  private static final int LAYOUT_MESSAGELAYOUT = 58;

  private static final int LAYOUT_MYEVENTITEMADAPTER = 59;

  private static final int LAYOUT_PEOPLEADAPTER = 60;

  private static final int LAYOUT_PROFILEDRINKLAYOUT = 61;

  private static final int LAYOUT_RECENTSEARCHLAYOUT = 62;

  private static final int LAYOUT_ROWHOMELIST = 63;

  private static final int LAYOUT_ROWSIDEMENU = 64;

  private static final int LAYOUT_SEARCHITEMADAPTER = 65;

  private static final int LAYOUT_SELECTFRIENDLAYOUT = 66;

  private static final int LAYOUT_SELECTROOMLAYOUT = 67;

  private static final int LAYOUT_SELECTUSERADAPTER = 68;

  private static final int LAYOUT_SORTBYADAPTER = 69;

  private static final int LAYOUT_TIMEITEMADAPTER = 70;

  private static final int LAYOUT_USERFRIENDREQUESTADAPTER = 71;

  private static final int LAYOUT_USERLISTADAPTER = 72;

  private static final int LAYOUT_VIEWSIDEPROFILE = 73;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(73);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_about_edit, LAYOUT_ACTIVITYABOUTEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_authentication, LAYOUT_ACTIVITYAUTHENTICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_chat, LAYOUT_ACTIVITYCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_create_event, LAYOUT_ACTIVITYCREATEEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_event_details, LAYOUT_ACTIVITYEVENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_filter, LAYOUT_ACTIVITYFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_notification, LAYOUT_ACTIVITYNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_profile_preview, LAYOUT_ACTIVITYPROFILEPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_setting, LAYOUT_ACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.activity_vote_to_remove, LAYOUT_ACTIVITYVOTETOREMOVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.drink_recycler_item, LAYOUT_DRINKRECYCLERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.dummy, LAYOUT_DUMMY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_account_activity, LAYOUT_FRAGMENTACCOUNTACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_account_visibility, LAYOUT_FRAGMENTACCOUNTVISIBILITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_calendar, LAYOUT_FRAGMENTCALENDAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_calendar_week, LAYOUT_FRAGMENTCALENDARWEEK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_complete_forgot_password, LAYOUT_FRAGMENTCOMPLETEFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_complete_registration, LAYOUT_FRAGMENTCOMPLETEREGISTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_event_fragment, LAYOUT_FRAGMENTEVENTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_first_forgot_password, LAYOUT_FRAGMENTFIRSTFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_first_slide, LAYOUT_FRAGMENTFIRSTSLIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_forgot_password, LAYOUT_FRAGMENTFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_fouth_slide, LAYOUT_FRAGMENTFOUTHSLIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_intro, LAYOUT_FRAGMENTINTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_message, LAYOUT_FRAGMENTMESSAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_otp_forgot_password, LAYOUT_FRAGMENTOTPFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_otp_forgot_password_registration, LAYOUT_FRAGMENTOTPFORGOTPASSWORDREGISTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_otp_select_option, LAYOUT_FRAGMENTOTPSELECTOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration, LAYOUT_FRAGMENTREGISTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_after_fouth_page, LAYOUT_FRAGMENTREGISTRATIONAFTERFOUTHPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_after_inside_fouth_page, LAYOUT_FRAGMENTREGISTRATIONAFTERINSIDEFOUTHPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_fifth, LAYOUT_FRAGMENTREGISTRATIONFIFTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_firstpage, LAYOUT_FRAGMENTREGISTRATIONFIRSTPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_fouthpage, LAYOUT_FRAGMENTREGISTRATIONFOUTHPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_front_page, LAYOUT_FRAGMENTREGISTRATIONFRONTPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_secondpage, LAYOUT_FRAGMENTREGISTRATIONSECONDPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_sixth, LAYOUT_FRAGMENTREGISTRATIONSIXTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_registration_thirdpage, LAYOUT_FRAGMENTREGISTRATIONTHIRDPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_second_slide, LAYOUT_FRAGMENTSECONDSLIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_third_slide, LAYOUT_FRAGMENTTHIRDSLIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_view_friendlist, LAYOUT_FRAGMENTVIEWFRIENDLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.fragment_view_profile, LAYOUT_FRAGMENTVIEWPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.friend_list_layout, LAYOUT_FRIENDLISTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.friends_item_adapter, LAYOUT_FRIENDSITEMADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.home_item_adapter, LAYOUT_HOMEITEMADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.home_selected_item_adapter, LAYOUT_HOMESELECTEDITEMADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.invite_friends_adapter, LAYOUT_INVITEFRIENDSADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.message_adapter, LAYOUT_MESSAGEADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.message_banner_adapter, LAYOUT_MESSAGEBANNERADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.message_layout, LAYOUT_MESSAGELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.my_event_item_adapter, LAYOUT_MYEVENTITEMADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.people_adapter, LAYOUT_PEOPLEADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.profile_drink_layout, LAYOUT_PROFILEDRINKLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.recent_search_layout, LAYOUT_RECENTSEARCHLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.row_home_list, LAYOUT_ROWHOMELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.row_side_menu, LAYOUT_ROWSIDEMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.search_item_adapter, LAYOUT_SEARCHITEMADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.select_friend_layout, LAYOUT_SELECTFRIENDLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.select_room_layout, LAYOUT_SELECTROOMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.select_user_adapter, LAYOUT_SELECTUSERADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.sort_by_adapter, LAYOUT_SORTBYADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.time_item_adapter, LAYOUT_TIMEITEMADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.user_friend_request_adapter, LAYOUT_USERFRIENDREQUESTADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.user_list_adapter, LAYOUT_USERLISTADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sdei.chafte.R.layout.view_side_profile, LAYOUT_VIEWSIDEPROFILE);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYABOUTEDIT: {
        if ("layout/activity_about_edit_0".equals(tag)) {
          return new ActivityAboutEditBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_about_edit is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYAUTHENTICATION: {
        if ("layout/activity_authentication_0".equals(tag)) {
          return new ActivityAuthenticationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_authentication is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHAT: {
        if ("layout/activity_chat_0".equals(tag)) {
          return new ActivityChatBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_chat is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCREATEEVENT: {
        if ("layout/activity_create_event_0".equals(tag)) {
          return new ActivityCreateEventBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_create_event is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEVENTDETAILS: {
        if ("layout/activity_event_details_0".equals(tag)) {
          return new ActivityEventDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_event_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFILTER: {
        if ("layout/activity_filter_0".equals(tag)) {
          return new ActivityFilterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_filter is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHOME: {
        if ("layout/activity_home_0".equals(tag)) {
          return new ActivityHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYNOTIFICATION: {
        if ("layout/activity_notification_0".equals(tag)) {
          return new ActivityNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPROFILEPREVIEW: {
        if ("layout/activity_profile_preview_0".equals(tag)) {
          return new ActivityProfilePreviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_profile_preview is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSETTING: {
        if ("layout/activity_setting_0".equals(tag)) {
          return new ActivitySettingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVOTETOREMOVE: {
        if ("layout/activity_vote_to_remove_0".equals(tag)) {
          return new ActivityVoteToRemoveBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_vote_to_remove is invalid. Received: " + tag);
      }
      case  LAYOUT_DRINKRECYCLERITEM: {
        if ("layout/drink_recycler_item_0".equals(tag)) {
          return new DrinkRecyclerItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for drink_recycler_item is invalid. Received: " + tag);
      }
      case  LAYOUT_DUMMY: {
        if ("layout/dummy_0".equals(tag)) {
          return new DummyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dummy is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTACCOUNTACTIVITY: {
        if ("layout/fragment_account_activity_0".equals(tag)) {
          return new FragmentAccountActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_account_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTACCOUNTVISIBILITY: {
        if ("layout/fragment_account_visibility_0".equals(tag)) {
          return new FragmentAccountVisibilityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_account_visibility is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCALENDAR: {
        if ("layout/fragment_calendar_0".equals(tag)) {
          return new FragmentCalendarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_calendar is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCALENDARWEEK: {
        if ("layout/fragment_calendar_week_0".equals(tag)) {
          return new FragmentCalendarWeekBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_calendar_week is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
        if ("layout/fragment_change_password_0".equals(tag)) {
          return new FragmentChangePasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCOMPLETEFORGOTPASSWORD: {
        if ("layout/fragment_complete_forgot_password_0".equals(tag)) {
          return new FragmentCompleteForgotPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_complete_forgot_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCOMPLETEREGISTRATION: {
        if ("layout/fragment_complete_registration_0".equals(tag)) {
          return new FragmentCompleteRegistrationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_complete_registration is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEVENTFRAGMENT: {
        if ("layout/fragment_event_fragment_0".equals(tag)) {
          return new FragmentEventFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_event_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFIRSTFORGOTPASSWORD: {
        if ("layout/fragment_first_forgot_password_0".equals(tag)) {
          return new FragmentFirstForgotPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_first_forgot_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFIRSTSLIDE: {
        if ("layout/fragment_first_slide_0".equals(tag)) {
          return new FragmentFirstSlideBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_first_slide is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFORGOTPASSWORD: {
        if ("layout/fragment_forgot_password_0".equals(tag)) {
          return new FragmentForgotPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_forgot_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFOUTHSLIDE: {
        if ("layout/fragment_fouth_slide_0".equals(tag)) {
          return new FragmentFouthSlideBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_fouth_slide is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTINTRO: {
        if ("layout/fragment_intro_0".equals(tag)) {
          return new FragmentIntroBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_intro is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGIN: {
        if ("layout/fragment_login_0".equals(tag)) {
          return new FragmentLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMESSAGE: {
        if ("layout/fragment_message_0".equals(tag)) {
          return new FragmentMessageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_message is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOTPFORGOTPASSWORD: {
        if ("layout/fragment_otp_forgot_password_0".equals(tag)) {
          return new FragmentOtpForgotPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_otp_forgot_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOTPFORGOTPASSWORDREGISTRATION: {
        if ("layout/fragment_otp_forgot_password_registration_0".equals(tag)) {
          return new FragmentOtpForgotPasswordRegistrationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_otp_forgot_password_registration is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOTPSELECTOPTION: {
        if ("layout/fragment_otp_select_option_0".equals(tag)) {
          return new FragmentOtpSelectOptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_otp_select_option is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATION: {
        if ("layout/fragment_registration_0".equals(tag)) {
          return new FragmentRegistrationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONAFTERFOUTHPAGE: {
        if ("layout/fragment_registration_after_fouth_page_0".equals(tag)) {
          return new FragmentRegistrationAfterFouthPageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_after_fouth_page is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONAFTERINSIDEFOUTHPAGE: {
        if ("layout/fragment_registration_after_inside_fouth_page_0".equals(tag)) {
          return new FragmentRegistrationAfterInsideFouthPageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_after_inside_fouth_page is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONFIFTH: {
        if ("layout/fragment_registration_fifth_0".equals(tag)) {
          return new FragmentRegistrationFifthBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_fifth is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONFIRSTPAGE: {
        if ("layout/fragment_registration_firstpage_0".equals(tag)) {
          return new FragmentRegistrationFirstpageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_firstpage is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONFOUTHPAGE: {
        if ("layout/fragment_registration_fouthpage_0".equals(tag)) {
          return new FragmentRegistrationFouthpageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_fouthpage is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONFRONTPAGE: {
        if ("layout/fragment_registration_front_page_0".equals(tag)) {
          return new FragmentRegistrationFrontPageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_front_page is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONSECONDPAGE: {
        if ("layout/fragment_registration_secondpage_0".equals(tag)) {
          return new FragmentRegistrationSecondpageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_secondpage is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONSIXTH: {
        if ("layout/fragment_registration_sixth_0".equals(tag)) {
          return new FragmentRegistrationSixthBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_sixth is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTRATIONTHIRDPAGE: {
        if ("layout/fragment_registration_thirdpage_0".equals(tag)) {
          return new FragmentRegistrationThirdpageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_registration_thirdpage is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEARCH: {
        if ("layout/fragment_search_0".equals(tag)) {
          return new FragmentSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSECONDSLIDE: {
        if ("layout/fragment_second_slide_0".equals(tag)) {
          return new FragmentSecondSlideBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_second_slide is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSETTING: {
        if ("layout/fragment_setting_0".equals(tag)) {
          return new FragmentSettingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTHIRDSLIDE: {
        if ("layout/fragment_third_slide_0".equals(tag)) {
          return new FragmentThirdSlideBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_third_slide is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTVIEWFRIENDLIST: {
        if ("layout/fragment_view_friendlist_0".equals(tag)) {
          return new FragmentViewFriendlistBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_view_friendlist is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTVIEWPROFILE: {
        if ("layout/fragment_view_profile_0".equals(tag)) {
          return new FragmentViewProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_view_profile is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_FRIENDLISTLAYOUT: {
        if ("layout/friend_list_layout_0".equals(tag)) {
          return new FriendListLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for friend_list_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRIENDSITEMADAPTER: {
        if ("layout/friends_item_adapter_0".equals(tag)) {
          return new FriendsItemAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for friends_item_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMEITEMADAPTER: {
        if ("layout/home_item_adapter_0".equals(tag)) {
          return new HomeItemAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_item_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMESELECTEDITEMADAPTER: {
        if ("layout/home_selected_item_adapter_0".equals(tag)) {
          return new HomeSelectedItemAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_selected_item_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_INVITEFRIENDSADAPTER: {
        if ("layout/invite_friends_adapter_0".equals(tag)) {
          return new InviteFriendsAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for invite_friends_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_MESSAGEADAPTER: {
        if ("layout/message_adapter_0".equals(tag)) {
          return new MessageAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for message_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_MESSAGEBANNERADAPTER: {
        if ("layout/message_banner_adapter_0".equals(tag)) {
          return new MessageBannerAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for message_banner_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_MESSAGELAYOUT: {
        if ("layout/message_layout_0".equals(tag)) {
          return new MessageLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for message_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_MYEVENTITEMADAPTER: {
        if ("layout/my_event_item_adapter_0".equals(tag)) {
          return new MyEventItemAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for my_event_item_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_PEOPLEADAPTER: {
        if ("layout/people_adapter_0".equals(tag)) {
          return new PeopleAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for people_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_PROFILEDRINKLAYOUT: {
        if ("layout/profile_drink_layout_0".equals(tag)) {
          return new ProfileDrinkLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for profile_drink_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_RECENTSEARCHLAYOUT: {
        if ("layout/recent_search_layout_0".equals(tag)) {
          return new RecentSearchLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recent_search_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOMELIST: {
        if ("layout/row_home_list_0".equals(tag)) {
          return new RowHomeListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_home_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWSIDEMENU: {
        if ("layout/row_side_menu_0".equals(tag)) {
          return new RowSideMenuBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_side_menu is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHITEMADAPTER: {
        if ("layout/search_item_adapter_0".equals(tag)) {
          return new SearchItemAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_item_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_SELECTFRIENDLAYOUT: {
        if ("layout/select_friend_layout_0".equals(tag)) {
          return new SelectFriendLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for select_friend_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SELECTROOMLAYOUT: {
        if ("layout/select_room_layout_0".equals(tag)) {
          return new SelectRoomLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for select_room_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SELECTUSERADAPTER: {
        if ("layout/select_user_adapter_0".equals(tag)) {
          return new SelectUserAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for select_user_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_SORTBYADAPTER: {
        if ("layout/sort_by_adapter_0".equals(tag)) {
          return new SortByAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sort_by_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_TIMEITEMADAPTER: {
        if ("layout/time_item_adapter_0".equals(tag)) {
          return new TimeItemAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for time_item_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_USERFRIENDREQUESTADAPTER: {
        if ("layout/user_friend_request_adapter_0".equals(tag)) {
          return new UserFriendRequestAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for user_friend_request_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_USERLISTADAPTER: {
        if ("layout/user_list_adapter_0".equals(tag)) {
          return new UserListAdapterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for user_list_adapter is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWSIDEPROFILE: {
        if ("layout/view_side_profile_0".equals(tag)) {
          return new ViewSideProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_side_profile is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(40);

    static {
      sKeys.put(1, "VRVM");
      sKeys.put(0, "_all");
      sKeys.put(2, "a");
      sKeys.put(3, "acVM");
      sKeys.put(4, "adapter");
      sKeys.put(5, "avVM");
      sKeys.put(6, "b");
      sKeys.put(7, "c");
      sKeys.put(8, "cVM");
      sKeys.put(9, "callback");
      sKeys.put(10, "click");
      sKeys.put(11, "dVM");
      sKeys.put(12, "fVM");
      sKeys.put(13, "faVM");
      sKeys.put(14, "fhVM");
      sKeys.put(15, "flVM");
      sKeys.put(16, "friendlist");
      sKeys.put(17, "hVM");
      sKeys.put(18, "itemsList");
      sKeys.put(19, "list");
      sKeys.put(20, "listItems");
      sKeys.put(21, "listener");
      sKeys.put(22, "mVM");
      sKeys.put(23, "meVM");
      sKeys.put(24, "model");
      sKeys.put(25, "nVM");
      sKeys.put(26, "pVM");
      sKeys.put(27, "peoplelist");
      sKeys.put(28, "position");
      sKeys.put(29, "ppVM");
      sKeys.put(30, "privateRoomlist");
      sKeys.put(31, "recentList");
      sKeys.put(32, "sVM");
      sKeys.put(33, "searchlist");
      sKeys.put(34, "sortlist");
      sKeys.put(35, "timelist");
      sKeys.put(36, "title");
      sKeys.put(37, "toolbarModel");
      sKeys.put(38, "vm");
      sKeys.put(39, "vpVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(73);

    static {
      sKeys.put("layout/activity_about_edit_0", com.sdei.chafte.R.layout.activity_about_edit);
      sKeys.put("layout/activity_authentication_0", com.sdei.chafte.R.layout.activity_authentication);
      sKeys.put("layout/activity_chat_0", com.sdei.chafte.R.layout.activity_chat);
      sKeys.put("layout/activity_create_event_0", com.sdei.chafte.R.layout.activity_create_event);
      sKeys.put("layout/activity_event_details_0", com.sdei.chafte.R.layout.activity_event_details);
      sKeys.put("layout/activity_filter_0", com.sdei.chafte.R.layout.activity_filter);
      sKeys.put("layout/activity_home_0", com.sdei.chafte.R.layout.activity_home);
      sKeys.put("layout/activity_main_0", com.sdei.chafte.R.layout.activity_main);
      sKeys.put("layout/activity_notification_0", com.sdei.chafte.R.layout.activity_notification);
      sKeys.put("layout/activity_profile_preview_0", com.sdei.chafte.R.layout.activity_profile_preview);
      sKeys.put("layout/activity_setting_0", com.sdei.chafte.R.layout.activity_setting);
      sKeys.put("layout/activity_vote_to_remove_0", com.sdei.chafte.R.layout.activity_vote_to_remove);
      sKeys.put("layout/drink_recycler_item_0", com.sdei.chafte.R.layout.drink_recycler_item);
      sKeys.put("layout/dummy_0", com.sdei.chafte.R.layout.dummy);
      sKeys.put("layout/fragment_account_activity_0", com.sdei.chafte.R.layout.fragment_account_activity);
      sKeys.put("layout/fragment_account_visibility_0", com.sdei.chafte.R.layout.fragment_account_visibility);
      sKeys.put("layout/fragment_calendar_0", com.sdei.chafte.R.layout.fragment_calendar);
      sKeys.put("layout/fragment_calendar_week_0", com.sdei.chafte.R.layout.fragment_calendar_week);
      sKeys.put("layout/fragment_change_password_0", com.sdei.chafte.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_complete_forgot_password_0", com.sdei.chafte.R.layout.fragment_complete_forgot_password);
      sKeys.put("layout/fragment_complete_registration_0", com.sdei.chafte.R.layout.fragment_complete_registration);
      sKeys.put("layout/fragment_event_fragment_0", com.sdei.chafte.R.layout.fragment_event_fragment);
      sKeys.put("layout/fragment_first_forgot_password_0", com.sdei.chafte.R.layout.fragment_first_forgot_password);
      sKeys.put("layout/fragment_first_slide_0", com.sdei.chafte.R.layout.fragment_first_slide);
      sKeys.put("layout/fragment_forgot_password_0", com.sdei.chafte.R.layout.fragment_forgot_password);
      sKeys.put("layout/fragment_fouth_slide_0", com.sdei.chafte.R.layout.fragment_fouth_slide);
      sKeys.put("layout/fragment_home_0", com.sdei.chafte.R.layout.fragment_home);
      sKeys.put("layout/fragment_intro_0", com.sdei.chafte.R.layout.fragment_intro);
      sKeys.put("layout/fragment_login_0", com.sdei.chafte.R.layout.fragment_login);
      sKeys.put("layout/fragment_message_0", com.sdei.chafte.R.layout.fragment_message);
      sKeys.put("layout/fragment_otp_forgot_password_0", com.sdei.chafte.R.layout.fragment_otp_forgot_password);
      sKeys.put("layout/fragment_otp_forgot_password_registration_0", com.sdei.chafte.R.layout.fragment_otp_forgot_password_registration);
      sKeys.put("layout/fragment_otp_select_option_0", com.sdei.chafte.R.layout.fragment_otp_select_option);
      sKeys.put("layout/fragment_profile_0", com.sdei.chafte.R.layout.fragment_profile);
      sKeys.put("layout/fragment_registration_0", com.sdei.chafte.R.layout.fragment_registration);
      sKeys.put("layout/fragment_registration_after_fouth_page_0", com.sdei.chafte.R.layout.fragment_registration_after_fouth_page);
      sKeys.put("layout/fragment_registration_after_inside_fouth_page_0", com.sdei.chafte.R.layout.fragment_registration_after_inside_fouth_page);
      sKeys.put("layout/fragment_registration_fifth_0", com.sdei.chafte.R.layout.fragment_registration_fifth);
      sKeys.put("layout/fragment_registration_firstpage_0", com.sdei.chafte.R.layout.fragment_registration_firstpage);
      sKeys.put("layout/fragment_registration_fouthpage_0", com.sdei.chafte.R.layout.fragment_registration_fouthpage);
      sKeys.put("layout/fragment_registration_front_page_0", com.sdei.chafte.R.layout.fragment_registration_front_page);
      sKeys.put("layout/fragment_registration_secondpage_0", com.sdei.chafte.R.layout.fragment_registration_secondpage);
      sKeys.put("layout/fragment_registration_sixth_0", com.sdei.chafte.R.layout.fragment_registration_sixth);
      sKeys.put("layout/fragment_registration_thirdpage_0", com.sdei.chafte.R.layout.fragment_registration_thirdpage);
      sKeys.put("layout/fragment_search_0", com.sdei.chafte.R.layout.fragment_search);
      sKeys.put("layout/fragment_second_slide_0", com.sdei.chafte.R.layout.fragment_second_slide);
      sKeys.put("layout/fragment_setting_0", com.sdei.chafte.R.layout.fragment_setting);
      sKeys.put("layout/fragment_third_slide_0", com.sdei.chafte.R.layout.fragment_third_slide);
      sKeys.put("layout/fragment_view_friendlist_0", com.sdei.chafte.R.layout.fragment_view_friendlist);
      sKeys.put("layout/fragment_view_profile_0", com.sdei.chafte.R.layout.fragment_view_profile);
      sKeys.put("layout/friend_list_layout_0", com.sdei.chafte.R.layout.friend_list_layout);
      sKeys.put("layout/friends_item_adapter_0", com.sdei.chafte.R.layout.friends_item_adapter);
      sKeys.put("layout/home_item_adapter_0", com.sdei.chafte.R.layout.home_item_adapter);
      sKeys.put("layout/home_selected_item_adapter_0", com.sdei.chafte.R.layout.home_selected_item_adapter);
      sKeys.put("layout/invite_friends_adapter_0", com.sdei.chafte.R.layout.invite_friends_adapter);
      sKeys.put("layout/message_adapter_0", com.sdei.chafte.R.layout.message_adapter);
      sKeys.put("layout/message_banner_adapter_0", com.sdei.chafte.R.layout.message_banner_adapter);
      sKeys.put("layout/message_layout_0", com.sdei.chafte.R.layout.message_layout);
      sKeys.put("layout/my_event_item_adapter_0", com.sdei.chafte.R.layout.my_event_item_adapter);
      sKeys.put("layout/people_adapter_0", com.sdei.chafte.R.layout.people_adapter);
      sKeys.put("layout/profile_drink_layout_0", com.sdei.chafte.R.layout.profile_drink_layout);
      sKeys.put("layout/recent_search_layout_0", com.sdei.chafte.R.layout.recent_search_layout);
      sKeys.put("layout/row_home_list_0", com.sdei.chafte.R.layout.row_home_list);
      sKeys.put("layout/row_side_menu_0", com.sdei.chafte.R.layout.row_side_menu);
      sKeys.put("layout/search_item_adapter_0", com.sdei.chafte.R.layout.search_item_adapter);
      sKeys.put("layout/select_friend_layout_0", com.sdei.chafte.R.layout.select_friend_layout);
      sKeys.put("layout/select_room_layout_0", com.sdei.chafte.R.layout.select_room_layout);
      sKeys.put("layout/select_user_adapter_0", com.sdei.chafte.R.layout.select_user_adapter);
      sKeys.put("layout/sort_by_adapter_0", com.sdei.chafte.R.layout.sort_by_adapter);
      sKeys.put("layout/time_item_adapter_0", com.sdei.chafte.R.layout.time_item_adapter);
      sKeys.put("layout/user_friend_request_adapter_0", com.sdei.chafte.R.layout.user_friend_request_adapter);
      sKeys.put("layout/user_list_adapter_0", com.sdei.chafte.R.layout.user_list_adapter);
      sKeys.put("layout/view_side_profile_0", com.sdei.chafte.R.layout.view_side_profile);
    }
  }
}
