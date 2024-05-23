package com.example.eduforum.activity.repository.community;

import com.example.eduforum.activity.model.community_manage.Community;

import java.util.List;

public interface ICommunityCallBack_C {
    void onRoleAdmin(List<Community> communityList);

    void onGetCommunityMemberSuccess(List<String> userIds, List<String> adminIds);
}
