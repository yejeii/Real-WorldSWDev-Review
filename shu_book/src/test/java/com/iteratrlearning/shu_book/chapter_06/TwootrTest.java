package com.iteratrlearning.shu_book.chapter_06;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TwootrTest {

    private Twootr twootr = new Twootr();
    private MockReceiverEndPoint mockReceiverEndPoint = new MockReceiverEndPoint();

    /** 1. 핵심 비즈니스 로직기능 - 로그인 기능 테스트 */

    // 유저가 로그인하면 올바르게 인증되는지 확인
    @Test
    public void shouldBeAbleToAuthenticateUser() {

        // given : 유효 사용자의 로그온 메시지 수신
        String user = TestData.USER_ID;

        // when : 로그온 메서드는 새 엔드포인트 반환
        final Optional<SenderEndPoint> endPoint =
                twootr.onLogon(user, mockReceiverEndPoint);

        // then : 엔트포인트 유효성을 확인하는 어서션
        assertNotNull(endPoint);
    }

    // 로그인한 유저가 정확한 비밀번호를 사용했는지 검사
    @Test
    public void shouldNotAuthenticateUserWithWrongPassword() {
        //final Optional<SenderEndPoint> endPoint =
        //        twootr.onLogon(TestData.USER_ID, "bad password", mockReceiverEndPoint);
    }

}
