package com.project.dolbomi.manager.service;

import org.springframework.stereotype.Service;

@Service
public interface ManagerService {

    //    동행서비스 리스트
    public void accGetList();

    //    돌봄서비스 리스트
    public void careGetList();

    //    동행서비스 신청
    public void accApply(long accReservationNum);

    //    돌봄서비스 신청
    public void careApply(long careReservationNum);

    //    매니저 탈퇴
    public void withdrawal(String userEmail);

}
