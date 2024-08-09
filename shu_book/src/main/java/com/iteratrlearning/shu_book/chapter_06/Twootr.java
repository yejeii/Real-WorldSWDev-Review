package com.iteratrlearning.shu_book.chapter_06;

import java.util.Optional;

/** 핵심 비즈니스 코어 */
public class Twootr {

    /** 로그인 이벤트 발생
     *
     * 요구사항 >>
     * 1. 한 사용자가 다른 사용자를 팔로우하고 있을 때, 팔로우 대상 사용자가 트윗을 올렸다는 걸 확인할 수 있어야 함
     *  - 전제 ) 사용자가 로그인한 상태이어야 함
     *  - 필요 기능 ) 팔로우 대상 사용자가 트윗을 올렸다는 걸 알리는 기능 (전송 기능)
     *  -            사용자가 이벤트를 받는 기능 (수신 기능)
     *
     * 구현 >>
     * 팔로우 대상 사용자가 트윗을 올렸다는 걸 알리기 위해
     * */
    public Optional<SenderEndPoint> onLogon(String userId, ReceiverEndPoint receiver) {
        return null;
    }
}
