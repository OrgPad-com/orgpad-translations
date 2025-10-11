(ns orgpad.server.i18n.kr
  (:require [orgpad.common.i18n.dict.kr :as kr]
            [orgpad.common.company :as company]))

(def dict
  (merge
    kr/dict
    {:orgpage/untitled                    "문서"
     :orgpage/copy                        "사본"

     :permission/view                     "읽기"
     :permission/edit                     "편집"

     :subscription/monthly                "월"
     :subscription/yearly                 "년"

     :email/greeting                      "{{customer}}님께,"
     :email/signature                     "감사의 말씀을 드립니다"
     :email/team                          "Pavel Klavík and Kamila Klavíková"
     :email/creators                      "OrgPad 제작자"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". 이 이메일이 마음에 들지 않으십니까? "
                                                  [:a href-unsubscribe "구독을 취소하십시오"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "문제가 발생하면 "
                                                  [:a {:href (str "{{domain}}" url)} "앱 내 양식"]
                                                  "을 사용하거나 " company/support-email-link "으로 이메일을 보내 알려주십시오."))
     :email/or                            " 또는 "
     :email/customer                      "고객"

     :verification/subject                "OrgPad 계정 확인"
     :verification/preheader              "OrgPad에 오신 것을 환영합니다. 아래 버튼을 클릭하여 계정을 확인하십시오."
     :verification/heading                "이메일 확인"
     :verification/body                   "계정을 확인하려면 아래 버튼을 클릭하십시오. 버튼을 클릭하면 OrgPad의 "
     :verification/terms-and-conditions   "이용 약관"
     :verification/button                 "이메일 주소 확인"
     :verification/accidental-email       "실수로 이 이메일을 받은 경우 삭제하십시오. 이 이메일을 반복적으로 받는 경우 고객센터로 문의해 주십시오."

     :password-reset/subject              "OrgPad 비밀번호 재설정"
     :password-reset/preheader            "아래 버튼을 클릭하여 OrgPad 비밀번호를 재설정하십시오."
     :password-reset/heading              "OrgPad 비밀번호 재설정"
     :password-reset/body                 "비밀번호를 재설정하려면 아래 버튼을 클릭하십시오. 24시간 동안 유효합니다."
     :password-reset/button               "비밀번호 재설정"
     :password-reset/accidental-email     "비밀번호 재설정을 요청하지 않으셨거나 더 이상 변경할 필요가 없으시다면 아무 조치도 취하지 않으셔도 됩니다."

     :new-subscription/subject            "새 구독 확인"
     :new-subscription/preheader          "OrgPad의 {{tier}} 플랜이 이제 활성화되었습니다. 구독은 매 {{period}}마다 자동으로 갱신됩니다."
     :new-subscription/body               "OrgPad의 {{tier}} 플랜이 이제 활성화되었습니다. 결제해 주셔서 감사합니다!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "앞으로 구독은 매 {{period}}마다 자동으로 갱신됩니다. 영수증은 OrgPad 설정의 "
                                                  [:a {:href (str "{{domain}}" url)} "결제 섹션"] "에 자동으로 저장됩니다."))

     :new-payment/subject                 "결제 성공"
     :new-payment/preheader               "{{tier}} 플랜 구독을 갱신했으며, {{subscription-end}}까지 유효합니다."
     :new-payment/body                    (list "{{tier}} 플랜 구독을 성공적으로 갱신했습니다. "
                                                [:b "{{subscription-end}}"] "까지 유효합니다. 결제해 주셔서 감사합니다!")
     :new-payment/button                  "청구서 다운로드"

     :payment-failed/subject              "구독 결제 실패"
     :payment-failed/preheader            "카드가 유효하고 잔액이 충분한지 확인하십시오. 문제가 계속되면 문의하십시오."
     :payment-failed/body                 (str "OrgPad 구독 결제에 오류가 발생했습니다."
                                               " 카드가 유효하고 잔액이 충분한지 확인하십시오.")
     :payment-failed/button               "결제 수단 변경"
     :payment-failed/grace-warning        (list "현재 구독은 "
                                                [:b "{{subscription-end}}"]
                                                "까지 활성화됩니다. 이 날짜까지 구독료를 지불하지 않으면 계정이"
                                                " 무료 플랜으로 다운그레이드됩니다. 데이터에 계속 액세스하고, 편집하고, 삭제하고, 공유할 수 있습니다.")

     :feedback/subject                    "질문: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}}님이 질문 {{title}}을(를) 보냈습니다"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}})님께서 {{title}}에 대한 질문을 보내셨습니다."

     :invitation/subject                  "OrgPad에서 문서를 {{action}}하도록 초대되었습니다"
     :invitation/preheader                "{{user}}님이 {{title}}을(를) {{action}}하도록 초대했습니다. 아래 버튼을 클릭하여 여십시오."
     :invitation/heading                  "{{user}}님이 {{title}}을(를) {{action}}하도록 초대했습니다"
     :invitation/body                     "OrgPad는 큰 그림을 위한 시각적 문서를 만드는 플랫폼입니다. 다음 버튼을 클릭하면 초대를 수락하고 문서를 엽니다."
     :invitation/button                   "문서 열기"
     :invitation/accidental-email         "실수로 이 이메일을 받으신 경우, 삭제해 주십시오. 이 이메일을 반복적으로 받으시는 경우, 차단을 요청해 주십시오."
     :invitation/block-user               "{{user}}님의 초대 차단"
     :invitation/block-all                "모든 초대 차단"

     :contact-user/subject                "OrgPad를 통해 연락을 받았습니다"
     :contact-user/preheader              "{{user}}님의 메시지"
     :contact-user/heading                "{{user}} ({{reply-to}})님께서 OrgPad를 통해 연락을 드리고 있습니다."
     :contact-user/body                   (str "이 이메일은 귀하의 이메일 주소를 다른 사람과 공유하지 않기 때문에 당사에서 보낸 것입니다. "
                                               "이 메시지에 회신하거나 {{reply-to}}로 이메일을 보내 메시지에 응답할 수 있습니다.")
     :contact-user/unsolicited-info       "메시지가 원치 않는 경우 차단하실 수 있습니다."
     :contact-user/block-user             "{{user}}님의 모든 메시지 차단"
     :contact-user/block-all              "OrgPad의 모든 사람으로부터의 모든 메시지 차단."

     :blog/rss-description                "OrgPad의 최신 뉴스와 기술 토론 소식입니다."

     :newsletter-2024-summer/subject      "OrgPad의 여름 업데이트"
     :newsletter-2024-summer/preheader    "최신 앱 업데이트, 새 블로그, 개선된 개인 정보 보호 조치 등에 대해 알아보십시오!"
     :newsletter-2024-summer/introduction "1년 만에 뉴스레터로 돌아왔습니다!"
     :newsletter-2024-summer/heading      "이 뉴스레터에서 다음을 찾을 수 있습니다:"
     :newsletter-2024-summer/body         (list [:li "연초 이후 앱의 새로운 기능은 무엇입니까?"]
                                                [:li "새 블로그에서 무엇을 찾을 수 있습니까?"]
                                                [:li "귀하의 개인 정보와 데이터 보안을 어떻게 관리합니까?"]
                                                [:li "귀하의 편의를 위해 이용 약관을 어떻게 업데이트했습니까?"]
                                                [:li "왜 커뮤니티에 가입해야 합니까?"])
     :newsletter-2024-summer/button       "뉴스레터 읽기"
     :newsletter-2024-summer/closing      "여러분의 아이디어를 기대하겠습니다!"}))
