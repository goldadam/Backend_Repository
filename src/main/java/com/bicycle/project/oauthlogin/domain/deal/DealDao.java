package com.bicycle.project.oauthlogin.domain.deal;

import com.bicycle.project.oauthlogin.domain.deal.dto.*;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DealDao {

    public List<GetTopListRes> getTopList();

    void writeDeal(WritingDealReq writingDealReq);

    GetDealDetailRes getDealDetail(Long dealId);


    void pushDealLike(DealLikeReq dealLikeReq);


    void updateDeal(UpdateDealReq updateDealReq);

    void deleteDealLike(Long dealId);

    void deleteDeal(Long dealId);
}
