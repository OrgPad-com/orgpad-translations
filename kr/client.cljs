(ns orgpad.client.i18n.dicts.kr
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.kr :as kr]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  (merge
    kr/dict
    {:address/company                                 "회사명"
     :address/ico                                     "VAT"
     :address/street                                  "거리"
     :address/street-number                           "번호"
     :address/postal-code                             "우편번호"
     :address/city                                    "도시"
     :address/country                                 "국가"

     :administration/page-title                       "관리 - OrgPad"

     :attachments/allows-access-to-file               "이 파일에 대한 액세스를 허용합니다."
     :attachments/allows-access-to-image              "이 이미지에 대한 액세스를 허용합니다."
     :attachments/no-preview                          "미리보기 없음."
     :attachments/all-files                           "모든 파일"
     :attachments/used-files                          "OrgPage의 파일"
     :attachments/unused-files                        "미사용 파일"
     :attachments/all-images                          "모든 이미지"
     :attachments/used-images                         "OrgPage의 이미지"
     :attachments/unused-images                       "미사용 이미지"
     :attachments/uploading-files                     "파일 업로드 중..."
     :attachments/previous-attachment                 "이전 파일 또는 이미지"
     :attachments/next-attachment                     "다음 파일 또는 이미지"
     :attachments/display-using-microsoft-365         "Microsoft 365를 사용하여 표시"
     :attachments/edit-filename                       "이름 편집"
     :attachments/title-order                         "제목순"
     :attachments/upload-order                        "최신순"
     :attachments/size-order                          "가장 큰 순"
     :attachments/split-used-unused                   "OrgPage에서의 존재 여부로 그룹화"
     :attachments/search                              "검색"
     :attachments/ordering                            "정렬"
     :attachments/new-version                         "새 버전"
     :attachments/preserve-old-version                "이전 버전 유지"
     :attachments/in-other-orgpages                   "다른 OrgPage에서 바꾸기:"

     :button/back                                     "뒤로"
     :button/cancel                                   "취소"
     :button/close                                    "닫기"
     :button/comment                                  "댓글"
     :button/continue                                 "계속"
     :button/copied                                   "복사됨"
     :button/copy                                     "복사"
     :button/copy-link                                "링크 복사"
     :button/create                                   "만들기"
     :button/create-tooltip                           "만들기 (CTRL+ENTER)"
     :button/delete                                   "삭제"
     :button/delete-selected                          "선택 항목 삭제"
     :button/documentation                            "문서"
     :button/download                                 "다운로드"
     :button/download-all                             "모두 다운로드"
     :button/drop                                     "드롭"
     :button/edit                                     "편집"
     :button/import                                   "가져오기"
     :button/insert                                   "삽입"
     :button/login                                    "로그인"
     :button/logout                                   "로그아웃"
     :button/publish                                  "게시"
     :button/read                                     "읽기"
     :button/register                                 "가입"
     :button/register-to-save                         "저장하려면 가입"
     :button/remove                                   "제거"
     :button/reset                                    "초기화"
     :button/save                                     "변경 사항 저장"
     :button/save-tooltip                             "변경 사항 저장 (CTRL+ENTER)"
     :button/upload                                   "업로드"
     :button/upload-from-computer                     "컴퓨터에서 업로드"
     :button/send                                     "보내기"
     :button/present                                  "발표"
     :button/present-tooltip                          "발표 시작 (F5)"
     :button/share                                    "공유"
     :button/start                                    "시작"
     :button/exit                                     "나가기"
     :button/show-password                            "표시"
     :button/hide-password                            "숨기기"

     :checkout/currency                               "통화"
     :checkout/monthly                                "월간"
     :checkout/yearly                                 "연간 (15% 할인)"
     :checkout/failed-to-init                         "결제 웹사이트를 로드하는 동안 문제가 발생했습니다."
     :checkout/upgrade-plan                           "플랜 업그레이드"
     :checkout/professional-plan                      "프로페셔널 플랜"
     :checkout/school-plan                            "학교 플랜"
     :checkout/enterprise-plan                        "엔터프라이즈 플랜"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "학교"] " 또는 "
                                                         [:a.link-button {:href enterprise-url} "기업"] "? 맞춤형 거래에 대해서는 문의하십시오."])
     :checkout/pay-with-credit-card                   "카드로 결제"
     :checkout/pay-with-wire-transfer                 "계좌 이체로 결제"
     :checkout/promo-code                             "프로모션 코드"
     :checkout/try-for-free                           "무료로 사용해보기"
     :checkout/activate-now                           "지금 활성화"
     :checkout/continue-for-free                      "무료로 계속"

     :code-lang/none                                  "없음"
     :code-lang/multiple                              "여러 개"

     :dashboard/confirm-delete                        [:<> "이 OrgPage를 " [:b "영구적으로"] " 삭제하시겠습니까?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "로그인"] " 또는 "
                                                         [:a {:href register-url} "가입"]
                                                         "하여 새 OrgPage를 만드십시오."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "학교 " name "의 구독이 " subscription-expired "에 만료되었습니다. "
                                                         "갱신하려면 관리자에게 문의하십시오. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "자세한 정보"] " 학교 95% 할인에 대해."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "95% 할인으로 학교에서 OrgPad를 무제한으로 사용하세요. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "자세한 정보."]])
     :dashboard/owned-orgpages                        "내 OrgPage"
     :dashboard/public-orgpages                       "게시된 OrgPage"
     :dashboard/shared-orgpages                       "나와 공유된 OrgPage"
     :dashboard/usergroup-orgpages                    "{usergroup/name}의 OrgPage"
     :dashboard/help-or-inspiration-button            "여기 있습니다!"
     :dashboard/new-domain                            [:<> "새 도메인 " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       "를 사용하십시오. 자세한 내용은 OrgPage " [:a {:href "https://orgpad.info/s/new-domain"} "OrgPad의 변경 사항 및 새 도메인"] "에 있습니다."]

     :dashboard-filter/filter                         "OrgPage 필터링"
     :dashboard-filter/ordering                       "OrgPage 정렬"
     :dashboard-filter/filter-and-ordering            "OrgPage 필터링 및 정렬"
     :dashboard-filter/title                          "표시된 OrgPage 필터링 및 정렬"
     :dashboard-filter/ordering-label                 "OrgPage 정렬"
     :dashboard-filter/title-order                    "제목순"
     :dashboard-filter/creation-time-order            "최신순"
     :dashboard-filter/last-modified-order            "최종 수정순"
     :dashboard-filter/most-viewed-order              "조회수가 가장 많은 순"
     :dashboard-filter/search-tags                    "태그 검색"

     :embedding-code/code                             "코드"
     :embedding-code/description                      "웹사이트나 다른 애플리케이션에 OrgPage를 삽입합니다."

     :error/orgpage-access-denied                     "이 OrgPage에 액세스할 수 없습니다. 로그인을 시도하세요."
     :error/usergroup-access-denied                   "팀 편집 권한이 거부되었습니다."
     :error/administration-access                     "관리 액세스가 거부되었습니다."
     :error/creation-unauthorized                     "OrgPage를 만들려면 로그인하세요."
     :error/deleting-denied                           "OrgPage 삭제가 거부되었습니다."
     :error/email-already-used                        "이미 사용 중인 이메일입니다."
     :error/email-not-registered                      "이 이메일로 등록된 계정이 없습니다."
     :error/email-missing-mx-record                   "이 도메인에서 이메일 서버를 찾을 수 없습니다."
     :error/email-invalid                             "이메일이 아닙니다."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "잘못된 OrgPage" (when id " {orgpage/id}")
                                                             ". 잘못 복사된 링크입니까?"))
     :error/incorrect-link                            "잘못된 링크입니다. 로그인하거나 올바른 링크를 여세요."
     :error/incorrect-password                        "잘못된 비밀번호입니다."
     :error/incorrect-profile-id                      "프로필 링크가 잘못되었습니다. 잘못 복사된 링크입니까?"
     :error/lost-permission                           "이 OrgPage에 대한 액세스 권한을 잃었습니다."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "계정이 없는 이메일: " emails))
     :error/name-already-used                         "이미 사용 중인 이름입니다"
     :error/name-not-valid                            "5자 이상 사용하십시오"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "OrgPage " (when title "“{orgpage/title}”") "가 제거되었습니다."))
     :error/owner-of-orgpage                          "이 사람은 이미 이 OrgPage의 소유자입니다."
     :error/profile-not-found                         "프로필을 찾을 수 없습니다."
     :error/unknown-error                             "알 수 없는 오류입니다. 다시 시도하십시오."
     :error/unknown-id                                "알 수 없는 OrgPage입니다."
     :error/unknown-login-or-email                    "알 수 없는 이메일 또는 팀 로그인입니다."
     :error/unknown-usergroup                         "팀이 삭제되었습니다"
     :error/upload-failed                             "OrgPage 업로드 실패: “{orgpage/title}”"

     :export/show                                     "OrgPage 내보내기"
     :export/title                                    "{orgpage/title} 내보내기"
     :export/info                                     "이 OrgPage를 내보낼 형식을 선택하십시오."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " OrgPad에서 사용하는 형식"]
     :export/html                                     "선형 HTML 파일"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON 캔버스"] " 형식"]
     :export/generate                                 "내보내기 생성"

     :feedback/ask-question                           "질문하기"
     :feedback/hide-button                            "버튼 영구 숨기기"
     :feedback/dialog-title                           "OrgPad 개발자에게 문의"
     :feedback/description                            [:<> "도움이 필요하거나 문제가 있는 경우 "
                                                       [:b "OrgPad 개발자"] "에게 알려주십시오. "
                                                       "개선 아이디어도 환영합니다. "
                                                       "최대한 빨리 이메일로 회신해 드리겠습니다."]
     :feedback/languages                              "영어, 체코어, 독일어로 문의하실 수 있습니다."
     :feedback/contact-when-problem-persists          [:<> " 문제가 지속되면 "
                                                       company/support-email-app-link "으로 문의하십시오."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "계좌 이체"
                                                             (when currency
                                                               (str " " (name currency))) " "
                                                             "연간"
                                                             (if (= tier "standard")
                                                               " 스탠다드"
                                                               " 프로페셔널")
                                                             " 플랜"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "청구서 수신 주소와 송장에 필요한 추가 정보를 기재해 주십시오."
                                                         " 귀하의 이메일 주소 " [:b email] "로 곧 연락드리겠습니다."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "내 " (case org-type
                                                                    :feedback/school-plan "학교"
                                                                    :feedback/enterprise-plan "회사"
                                                                    "조직") "를 위한 플랜을 구매하고 싶습니다"))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "이 양식을 사용하여 OrgPad s.r.o. 담당자에게 문의하십시오."
                                                         " 제공된 전화번호나 이메일 주소(" email
                                                         ")로 곧 연락드리겠습니다. "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "로 전화하셔도 됩니다."])
     :feedback/upgrade-subscription-title             "내 구독을 프로페셔널 플랜으로 업그레이드"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "기존 구독을 어떻게 변경해야 하는지와 추가 정보를 알려주십시오."
                                                         " 귀하의 이메일 주소 " [:b email] "로 곧 연락드리겠습니다."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "청구 기간을 " (if (= period "yearly")
                                                                         "연간"
                                                                         "월간") " 청구로 변경"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "변경은 현재 청구 기간이 끝난 후에 적용됩니다."
                                                         " 연간 청구 시 15% 할인이 적용됩니다."
                                                         " 귀하의 이메일 주소 " [:b email] "로 곧 연락드리겠습니다."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "학교"
                                                               :feedback/enterprise-plan "회사"
                                                               "조직") " 이름"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "학교"
                                                               :feedback/enterprise-plan "회사"
                                                               "조직") " 내 직위"))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "학교"
                                                               :feedback/enterprise-plan "회사"
                                                               "조직") " 웹사이트"))

     :fragment/fragment                               "위치"
     :fragment/text-id                                "ID"
     :fragment/title                                  "제목"
     :fragment/create                                 "위치 만들기"
     :fragment/create-tooltip                         "TAB; SHIFT를 누른 채로 선택한 위치 복사"
     :fragment/remove                                 "위치 제거"
     :fragment/share                                  "이 위치에 대한 링크 복사"
     :fragment/text-id-required                       "ID가 필요합니다."
     :fragment/text-id-already-used                   "이미 사용 중인 ID입니다."
     :fragment/closed-books                           "닫힌 셀; CTRL+클릭하여 선택"
     :fragment/hidden-books                           "숨겨진 셀; CTRL+클릭하여 선택"
     :fragment/opened-pages                           "열린 페이지; CTRL+클릭하여 선택"
     :fragment/focused-books                          "카메라에 표시된 셀; CTRL+클릭하여 선택"
     :fragment/shown-books                            "드러난 셀; CTRL+클릭하여 선택"

     :info/uploading-attachments                      "{info/count}개 파일 업로드 중..."
     :info/uploading-images                           "{info/count}개 이미지 업로드 중..."
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          "{info/count}개 이미지 업로드 실패."
                                                          "하나 이상의 이미지 업로드에 실패했습니다."))
     :info/uploading-youtubes-failed                  "{info/count}개 YouTube 동영상을 찾을 수 없습니다."
     :info/uploading-attachments-failed               "파일 업로드에 실패했습니다."
     :info/presentation-link-copied                   "이 프레젠테이션의 링크가 복사되었습니다."
     :info/max-orgpages-exceeded                      "이 OrgPage의 소유자는 추가 OrgPage를 만들 수 없습니다."
     :info/storage-exceeded                           "이 OrgPage의 소유자는 이 파일을 업로드할 {upload/total-size}의 공간이 남아 있지 않습니다."
     :info/attachments-too-large                      (str "한 번에 {upload/total-size}를 업로드할 수 없습니다."
                                                           " 모든 업로드된 첨부 파일의 최대 크기는 500MB입니다.")
     :info/drop-info                                  "아무 셀이나 회색 캔버스로 드롭하여 새 셀을 만듭니다."
     :info/audio-not-allowed                          "오디오 재생이 차단되었습니다. 재생 버튼을 클릭하십시오."
     :info/audio-not-supported                        "지원되지 않는 오디오 형식입니다."

     :import/another-format                           [:<> "다른 형식으로 기존 데이터를 가져오려면 "
                                                       company/support-email-app-link "으로 문의하십시오."]
     :import/dialog                                   "데이터 가져오기"
     :import/google-docs                              "Microsoft Office 또는 Google Docs에서 데이터를 삽입하려면 OrgPage에 붙여넣기만 하면 됩니다."
     :import/supported-formats                        "현재 다음 형식을 지원합니다:"
     :import/lucidchart                               [:<> ".vsdx 파일로 내보낸 " [:b "Lucidchart"] "."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON 캔버스"] " 파일."]

     :ios/install-info                                "OrgPad 앱 설치"
     :ios/share-button                                "1. 열기"
     :ios/add-to-home-screen                          "2. 탭"

     :lang/cs                                         "체코어"
     :lang/de                                         "독일어"
     :lang/en                                         "영어"
     :lang/es                                         "스페인어"
     :lang/fr                                         "프랑스어"
     :lang/hi                                         "힌디어"
     :lang/pl                                         "폴란드어"
     :lang/ru                                         "러시아어"
     :lang/uk                                         "우크라이나어"

     :lang-select/tooltip                             "앱 언어 (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "사용하시는 언어가 없습니까? "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "OrgPad 번역"] "에 참여하여 도와주세요."]

     :limit/of                                        " / "
     :limit/orgpages                                  " OrgPage"
     :limit/people                                    " 명"
     :limit/teams                                     " 팀"
     :limit/team-members                              " 멤버"
     :limit/orgpages-tooltip                          (str "무료 등급에서는 OrgPage 수가 제한됩니다."
                                                           " 더 많은 OrgPage를 만들려면 플랜을 업그레이드하십시오.")
     :limit/shares-tooltip                            (str "이 OrgPage를 직접 공유할 수 있는 사람의 수가 제한됩니다."
                                                           " 무제한으로 공유하려면 프로페셔널 등급으로 업그레이드하십시오.")
     :limit/teams-tooltip                             (str "스탠다드 등급에서는 소유한 팀 수가 제한됩니다."
                                                           " 무제한 팀을 만들려면 프로페셔널 등급으로 업그레이드하십시오.")
     :limit/teams-members-tooltip                     (str "스탠다드 등급에서는 각 팀의 멤버 수가 제한됩니다."
                                                           " 무제한 팀을 만들려면 프로페셔널 등급으로 업그레이드하십시오.")
     :limit/attachments-size                          (str "업로드된 모든 파일 및 이미지의 총 크기는 제한되어 있습니다"
                                                           " 플랜을 업그레이드하여 늘릴 수 있습니다.")
     :limit/attachments-size-clickable                (str "업로드된 모든 파일 및 이미지의 총 크기는 제한되어 있습니다."
                                                           " 플랜을 업그레이드하여 한도를 늘리려면 클릭하십시오.")
     :limit/attachments-size-try-out                  (str "업로드된 모든 파일 및 이미지의 총 크기는 제한되어 있습니다."
                                                           " 한도를 100MB로 늘리려면 계정을 만드십시오.")

     :limits/max-orgpages                             "문서"
     :limits/max-storage                              "저장 공간"
     :limits/max-teams                                "팀"
     :limits/of                                       " /"
     :limits/max-team-members                         "멤버"
     :limits/priority-support                         "우선 지원"

     :link-panel/flip                                 "방향 뒤집기"
     :link-panel/insert-unit-in-middle                "중간에 셀 삽입"
     :link-panel/delete                               "링크 삭제"
     :link-panel/change-link-style                    "이 링크의 스타일 변경; SHIFT를 누른 채로 현재 스타일 설정, CTRL을 누른 채로 기본값에 복사"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "모든 셀의 크기 계산 중, " [:span#autoresize-num-units num-units] " 남음…"])
     :loading/initial-layout                          "초기 레이아웃 개선 중…"
     :loading/restoring-opened-pages                  "열린 페이지 위치 복원 중…"
     :loading/getting-orgpage                         "서버에서 OrgPage 다운로드 중…"
     :loading/getting-dashboard                       "서버에서 사용 가능한 OrgPage 목록 다운로드 중…"
     :loading/getting-website                         "서버에서 웹사이트 다운로드 중…"
     :loading/getting-blog                            "서버에서 블로그 다운로드 중…"
     :loading/uploading-orgpage                       "서버에 OrgPage 업로드 중…"
     :loading/ws-init                                 "서버에 연결 설정 중…"
     :loading/ws-closed                               "서버 연결이 닫혔습니다. 다시 연결을 시도합니다. 문제가 지속되면 페이지를 새로고침하십시오."
     :loading/administration                          "관리 데이터 로드 중…"
     :loading/profile                                 "프로필 로드 중…"
     :loading/style                                   "스타일 로드 중…"
     :loading/start-trial                             "7일 평가판 구독 시작 중…"
     :loading/uploading-attachments                   "서버에 첨부 파일 업로드 중…"

     :login/continue-with-email                       "이메일로 계속"
     :login/continue-with-facebook                    "Facebook으로 계속"
     :login/continue-with-google                      "Google로 계속"
     :login/continue-with-microsoft                   "Microsoft로 계속"
     :login/continue-with-cuni                        "Charles University로 계속"
     :login/email-sent                                "이메일이 전송되었습니다. 이메일의 링크를 클릭하십시오."
     :login/forgotten-password                        "비밀번호를 잊으셨습니까"
     :login/forgotten-password-email-resent           "비밀번호 재설정 이메일이 이미 전송되었습니다."
     :login/forgotten-password-description            "이메일로 비밀번호 재설정 링크 받기 (24시간 유효)."
     :login/forgotten-password-error                  [:<> "이 이메일 주소는 귀하에 의해 차단되었습니다. OrgPad의 모든 이메일에서 구독 취소를 클릭하여 차단을 해제하거나 이 이메일 주소에서 "
                                                       company/support-email-app-link "으로 이메일을 보내주십시오."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "OrgPad가 처음이신가요? " [:a.link-button {:href route} "가입"]])
     :login/options                                   "다른 로그인 방법 선택"
     :login/send-reset-link                           "재설정 링크 보내기"
     :login/wrong-email-or-password                   "이메일 또는 비밀번호가 잘못되었습니다."

     :markdown/title                                  "붙여넣은 텍스트가 마크다운으로 서식 지정되었습니까?"
     :markdown/info                                   "붙여넣은 콘텐츠에서 마크다운 서식이 감지되었습니다. 서식을 적용하시겠습니까?"
     :markdown/remember                               "새로고침할 때까지 기억"
     :markdown/insert                                 "마크다운 서식 사용"
     :markdown/ignore                                 "원본 유지"

     :meta/title                                      "OrgPage 이름"
     :meta/orgpage-thumbnail                          "OrgPage 이미지"
     :meta/automatic-screenshot-start                 "자동 생성된 스크린샷: "
     :meta/automatic-screenshot-refresh               "변경 후 5분마다 업데이트됩니다."
     :meta/custom-thumbnail                           "크기 1360x768의 사용자 지정 업로드 이미지."
     :meta/upload-thumbnail                           "사용자 지정 이미지 업로드"
     :meta/thumbnail-upload-failed                    "이미지 업로드에 실패했습니다."
     :meta/description                                "설명"
     :meta/new-tags                                   "태그"
     :meta/tag-too-long                               (str "태그의 최대 길이는 " common-orgpage/max-tag-length "자입니다.")
     :meta/too-many-tags                              (str "최대 " common-orgpage/max-tags "개의 태그만 허용됩니다.")
     :meta/info                                       (str "이 세부 정보는 OrgPage 목록, OrgPage 삽입 시 및 소셜 네트워크에서 공유할 때 표시됩니다.")
     :meta/info-in-share-orgpage                      "이 OrgPage를 공유하기 전에 제목을 설정해야 합니다."
     :meta/info-move-to-new-orgpage                   (str "선택한 {selection/num-units}개 셀과 "
                                                           "{selection/num-links}개 링크를 다음 정보와 함께 새 OrgPage로 이동합니다. "
                                                           "현재 OrgPage에서 이러한 셀과 링크는 새 OrgPage가 내부에 포함된 단일 셀로 대체됩니다.")
     :meta/info-title                                 "정보 – {meta/title}"
     :meta/info-title-only                            "OrgPage 이름 지정"
     :meta/details                                    "세부 정보"
     :meta/preview                                    "미리보기"
     :meta/init-fragments                             "시작 위치"
     :meta/init-fragments-info                        (str "OrgPage가 열릴 때 시작 위치를 선택할 수 있습니다. "
                                                           "모바일 장치에는 다른 시작 위치를 지정할 수 있습니다.")
     :meta/desktop-init-fragment                      "데스크톱 위치"
     :meta/mobile-init-fragment                       "모바일 위치"
     :meta/everything-closed                          "모든 셀 닫힘"
     :meta/everything-closed-lowercase                "모든 셀 닫힘"
     :meta/more-details                               "자세한 정보"
     :meta/move-to-new-orgpage-title                  "{meta/title}로 이동"
     :meta/move-to-new-orgpage                        "새 OrgPage로 이동"

     :microsoft-365-permission/title                  "Microsoft 365가 이 문서에 액세스하도록 허용하시겠습니까?"
     :microsoft-365-permission/info                   [:<> "Office 문서는 Microsoft 365를 사용하여 표시할 수 있습니다."
                                                       " 동의를 클릭하면 문서가 Microsoft와 공유됩니다."
                                                       " " [:a.link-button {:href   "https://www.microsoft.com/ko-kr/servicesagreement/"
                                                                            :target "_blank"}
                                                            "Microsoft 서비스 계약"] "을 확인하십시오."]
     :microsoft-365-permission/allow                  "Microsoft 365에 권한 부여"

     :notifications/info                              "OrgPad에서 어떤 이메일을 보낼지 선택하십시오. 중요한 변경 사항에 대해서는 항상 알려드립니다."
     :notifications/any-email                         "OrgPad의 모든 이메일"
     :notifications/email-verification                "가입 시 이메일 확인, 비밀번호 재설정 링크 및 필수 결제 정보"
     :notifications/monthly-newsletter                "OrgPad의 업데이트 및 최근 개발에 대한 월간 뉴스레터"
     :notifications/messages                          "다른 사람으로부터 메시지 받기"
     :notifications/blocked-people                    "특별히 차단된 사람:"
     :notifications/receipts                          "구독이 자동으로 갱신될 때 영수증"
     :notifications/receive-invitations               "다른 사람으로부터 초대 받기"
     :notifications/unblock-user                      "이 사람 차단 해제"

     :onboarding/openable-units                       "그림자가 있는 돌출된 셀만 열 수 있습니다."
     :onboarding/zoom                                 "스크롤하여 확대/축소"
     :onboarding/drag-canvas                          "드래그하여 이동"
     :onboarding/open-units                           "그림자가 있는 셀에는 내용이 있습니다"

     :orgpage/creating-preview                        "미리보기 만드는 중…"
     :orgpage/change-information                      "정보 변경"
     :orgpage/copy-orgpage                            "새 OrgPage에 복사"
     :orgpage/delete-orgpage                          "OrgPage 삭제"
     :orgpage/detail                                  "세부 정보"
     :orgpage/share-tooltip                           "이 OrgPage를 다른 사람과 공유"
     :orgpage/share-orgpage                           "OrgPage 공유"
     :orgpage/show-information                        "정보 표시"
     :orgpage/zoom-in                                 "확대"
     :orgpage/zoom-out                                "축소"
     :orgpage/create-unit-double-click                "두 번 클릭하여 셀 만들기."
     :orgpage/create-unit-hold-or-double-tap          "길게 누르거나 두 번 탭하여 셀 만들기."
     :orgpage/switch-to-edit                          "편집으로 전환."
     :orgpage/untitled                                "제목 없는 OrgPage"
     :orgpage/title                                   "OrgPage 제목"
     :orgpage/untitled-unit                           "제목 없는 셀"
     :orgpage/untitled-path                           "제목 없는 프레젠테이션"
     :orgpage/path-num-steps                          "{orgpage/num-steps} 단계"
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (페이지 {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (페이지 {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "사본은 "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title] "으로 제공됩니다"])
     :orgpage/change-color                            "이 OrgPage의 색상 변경"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "이 OrgPage는 " label "과 자동으로 공유되어 "
                                                         (case permission
                                                           :permission/view "읽기"
                                                           :permission/comment "댓글 달기"
                                                           :permission/edit "편집")
                                                         "할 수 있습니다. " [:span.link-button {:on-click on-click} "여기를 클릭"]
                                                         "하여 공유를 취소하십시오."])

     :orgpage-placement/activate                      "여기에서 보기"

     :orgpage-print/displayed                         "표시된 대로 정확하게"
     :orgpage-print/displayed-info                    "사각형 안의 모든 것이 보이는 대로 정확하게 인쇄됩니다."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPage가 "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] "로 성공적으로 인쇄되었습니다."])
     :orgpage-print/estimated-time                    "이 PDF를 인쇄하는 데 약 {orgpage-print/estimated-time}이 소요됩니다."
     :orgpage-print/everything-closed                 "모든 셀 닫힘"
     :orgpage-print/everything-closed-info            "인쇄된 PDF는 모든 셀이 닫힌 상태로 표시됩니다."
     :orgpage-print/fragment                          "위치"
     :orgpage-print/fragment-info                     "인쇄된 PDF는 선택한 위치를 표시합니다."
     :orgpage-print/gray                              "회색 배경"
     :orgpage-print/landscape                         "가로"
     :orgpage-print/orientation                       "방향"
     :orgpage-print/path-info                         " {orgpage-print/num-pages} 페이지 포함."
     :orgpage-print/portrait                          "세로"
     :orgpage-print/presentation                      "프레젠테이션 단계"
     :orgpage-print/presentation-info                 "각 단계는 별도의 페이지에 인쇄됩니다."
     :orgpage-print/print                             "PDF로 인쇄"
     :orgpage-print/size                              "크기"
     :orgpage-print/started                           (str "이 OrgPage를 PDF로 인쇄하고 있습니다. 약 {orgpage-print/estimated-time}이 소요됩니다."
                                                           " 완료되면 파일로 사용할 수 있습니다.")
     :orgpage-print/title                             "인쇄 이름"
     :orgpage-print/type                              "인쇄 대상"
     :orgpage-print/watermark                         "워터마크 포함"
     :orgpage-print/watermark-info                    "제거하려면 프로페셔널, 학교 또는 기업으로 업그레이드하십시오."
     :orgpage-print/white                             "흰색 배경"

     :orgpage-stats/number-of-units                   "셀 수"
     :orgpage-stats/number-of-links                   "링크 수"
     :orgpage-stats/number-of-files                   "파일 수"
     :orgpage-stats/number-of-images                  "이미지 수"

     :org-role/student                                "학생"
     :org-role/teacher                                "교사"
     :org-role/employee                               "직원"
     :org-role/admin                                  "관리자"

     :panel/toggle-side-panel                         "사이드 메뉴"
     :panel/create-orgpage                            "새 OrgPage"
     :panel/logo-tooltip                              "홈으로 이동"
     :panel/edit-info                                 "셀과 링크를 만들고 삭제하고, 콘텐츠를 수정하는 등의 작업을 할 수 있는 편집으로 전환 (F7)"
     :panel/comment-info                              (str "자신의 셀과 링크를 만들고, 편집하고, 삭제할 수는 있지만 다른 사람의 셀이나 링크는 편집하거나 삭제할 수 없는 댓글 달기로 전환합니다. "
                                                           "하지만 자신이 소유하지 않은 셀에 링크할 수 있습니다. (F7)")
     :panel/read-info                                 "아무것도 변경할 수 없지만 콘텐츠를 더 쉽게 탐색할 수 있는 읽기로 전환 (F6)"
     :panel/undo-deletion                             "삭제 취소"
     :panel/undo-deletion-info                        "{delete/num-units}개 셀과 {delete/num-links}개 링크 삭제 되돌리기 (CTRL+Z)"
     :panel/refresh                                   "새로고침"
     :panel/switch-style                              "새 셀과 링크의 스타일 전환; 드래그하여 새 셀 만들기"
     :panel/profile                                   "프로필"
     :panel/settings                                  "설정"
     :panel/usergroups                                "팀"
     :panel/stats                                     "통계"
     :panel/administration                            "관리"
     :panel/ios-install-info                          "앱 설치"
     :panel/upload-attachment                         "새 셀에 이미지 또는 파일 삽입"
     :panel/selection-mode                            "선택 시작"
     :panel/search                                    "검색 (CTRL+F)"
     :panel/toggle-reveal-hidden                      "현재 위치에 숨겨진 {panel/num-hidden-book-ids}개 셀 표시"

     :password/too-short                              "8자 이상 필요"
     :password/different-passwords                    "비밀번호가 일치하지 않습니다"

     :password-reset/back-to-list                     "목록으로 돌아가기"
     :password-reset/change-password                  "비밀번호 변경"
     :password-reset/set-password                     "비밀번호 설정"
     :password-reset/has-password                     "계정에 비밀번호가 설정되어 있습니다."
     :password-reset/without-password                 "연결된 계정을 사용하여 로그인했기 때문에 아직 비밀번호가 설정되지 않았습니다."
     :password-reset/invalid-link                     "잘못된 링크입니다. 24시간이 지났을 수 있습니다. 이메일을 다시 보내달라고 요청하십시오."
     :password-reset/description                      "새 비밀번호를 설정하십시오."
     :password-reset/enter-current-and-new-password   "현재 비밀번호와 새 비밀번호를 입력하십시오."
     :password-reset/enter-new-password               "새 비밀번호를 입력하십시오."

     :path/add-step                                   "단계"
     :path/add-step-tooltip                           "ENTER 또는 TAB; SHIFT를 누른 채로 카메라 복사"
     :path/hidden-ops                                 " 및 {path/num-hidden}개 더"
     :path/title                                      "프레젠테이션 이름"
     :path/default-title                              "프레젠테이션 {path/num-paths}"
     :path/copy                                       "새 프레젠테이션에 복사"
     :path/copy-suffix                                "사본"
     :path/add-audio                                  "단계에 오디오 연결"
     :path/remove-audio                               "단계에서 오디오 연결 해제"

     :paths/create-new-path                           "프레젠테이션 만들기"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "프레젠테이션 " [:b title] "을(를) 삭제하시겠습니까?"])
     :paths/help                                      "표시되는 내용을 변경하려면 셀을 선택하세요. 자세한 내용은 가이드를 참조하세요."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "현재 " [:b tier " 플랜"] "에 있으며, " [:b end-date] "까지 유효합니다."
                                                         (if autorenewal
                                                           " 구독은 결제 기간이 끝나면 자동으로 갱신됩니다."
                                                           " 구독은 결제 기간이 끝나면 만료됩니다.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "귀하의 " [:b tier " 플랜"] "은(는) 갱신 결제가 실패하여 " [:b end-date] "에 만료되었습니다."
                                                         " 결제를 수정하면 구독이 자동으로 연장됩니다."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> name "의 " [:b tier " 플랜"] "의 " [:b role] "입니다."])
     :payments/free-tier-info                         [:<> "OrgPad는 " [:b "무료 등급"] "에서 사용되며 결제가 없습니다."]
     :payments/no-teams                               "무료 등급에는 팀이 없습니다."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> " " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "업그레이드"] " 또는 "])
                                                         [:a.link-button {:href period-url} "청구 기간 변경"]
                                                         "에 대해서는 문의하십시오."])
     :payments/choose-plan                            "플랜 선택"
     :payments/manage-plan                            "플랜 관리"
     :payments/billing-address                        "청구서 수신 주소"
     :payments/billing-address-info                   (str "입력한 청구서 수신 주소는 모든 새 송장에 사용됩니다."
                                                           " 최근 송장도 자동으로 업데이트됩니다.")
     :payments/receipt-label                          "영수증 {receipt/date-range}"
     :payments/customer-portal-failed                 "플랜 관리 웹사이트를 로드하는 동안 문제가 발생했습니다."

     :pending-activation/email-already-used           "다른 계정에서 이미 사용 중인 이메일입니다."
     :pending-activation/email-not-recieved           "이메일이 없습니까? 아래에서 다시 보내거나 변경하십시오."
     :pending-activation/email-sent                   "활성화 이메일이 전송되었습니다. "
     :pending-activation/instructions                 "거의 다 됐습니다! 이메일로 보내드린 링크를 한 번 클릭하여 계정을 활성화하십시오."
     :pending-activation/resend                       "활성화 이메일 다시 보내기"

     :permission/admin                                "공유 및 삭제 가능"
     :permission/admin-tooltip                        "문서에 액세스할 수 있는 다른 사람도 수정할 수 있습니다."
     :permission/edit                                 "편집 가능"
     :permission/edit-tooltip                         "OrgPage에 대한 모든 변경을 수행할 수 있습니다."
     :permission/comment                              "댓글 달기 가능"
     :permission/comment-tooltip                      (str "새로 소유한 셀을 만들고 연결하고 수정할 수 있습니다. "
                                                           "OrgPage의 나머지 부분은 수정할 수 없습니다.")
     :permission/view                                 "읽기 가능"
     :permission/view-tooltip                         "변경하지 않고 OrgPage를 읽을 수 있습니다."

     :presentation/presentation                       "프레젠테이션"
     :presentation/step                               "단계"
     :presentation/present                            "프레젠테이션 시작"
     :presentation/slideshow                          "자동으로 단계 재생"
     :presentation/step-duration                      "단계 지속 시간(초)"
     :presentation/loop-slideshow                     "끝에서 반복"
     :presentation/respect-audio-track                "오디오 트랙에 따른 단계 지속 시간"
     :presentation/stop-slideshow                     "자동으로 단계 재생 중지"
     :presentation/exit-tooltip                       "프레젠테이션 종료"
     :presentation/play-audio                         "이 단계의 오디오 재생"
     :presentation/pause-audio                        "오디오 재생 일시 중지"
     :presentation/share-presentation                 "이 프레젠테이션을 다른 사람과 공유합니다."

     :pricing-popup/orgpages-exceeded-title           "무료 플랜에서는 더 이상 OrgPage를 만들 수 없습니다"
     :pricing-popup/orgpages-exceeded                 "플랜을 업그레이드해야 합니다."
     :pricing-popup/storage-exceeded-title            "{upload/total-size}를 업로드할 공간이 부족합니다"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "저장 공간에 " [:b space-left "만 남았습니다"] "."
                                                         " 플랜을 업그레이드하여 저장 공간을 확장할 수 있습니다."])
     :pricing-popup/num-shared-limit-reached-title    "이 OrgPage를 더 많은 사람과 공유할 수 없습니다"
     :pricing-popup/num-shared-limit-reached-common   "이 OrgPage를 공유하는 최대 인원에 도달했습니다."
     :pricing-popup/num-shared-limit-reached          [:<> " 더 많은 사람을 추가하려면 "
                                                       [:b "프로페셔널 등급"] "으로 업그레이드해야 합니다."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " 이 OrgPage의 소유자 " owner "는 더 많은 사람을 추가하려면 "
                                                         [:b "프로페셔널 등급"] "으로 업그레이드해야 합니다."])
     :pricing-popup/enable-teams-title                "팀을 관리하려면 플랜을 업그레이드하십시오"
     :pricing-popup/enable-teams                      [:<> "팀은 사람들을 함께 그룹화하여 공동 작업 및 OrgPage 공유를 단순화합니다."
                                                       " 이 기능은 " [:b "스탠다드 등급"] " 이상에서만 활성화됩니다."]
     :pricing-popup/teams-limit-reached-title         "더 많은 팀을 만들려면 플랜을 업그레이드하십시오"
     :pricing-popup/teams-limit-reached               "플랜의 팀 수 제한에 도달했습니다."
     :pricing-popup/team-members-limit-reached-title  "{usergroup/name}에 더 이상 멤버를 추가할 수 없습니다"
     :pricing-popup/team-members-limit-reached-common "팀 멤버의 최대 수에 도달했습니다."
     :pricing-popup/team-members-limit-reached        [:<> " 더 많은 멤버를 추가하려면 "
                                                       [:b "프로페셔널 등급"] "으로 업그레이드해야 합니다."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " 이 팀의 소유자 " owner "는 더 많은 멤버를 추가하려면 "
                                                         [:b "프로페셔널 등급"] "으로 업그레이드해야 합니다."])
     :pricing-popup/try-out-share-title               "이 OrgPage를 공유하려면 가입하십시오"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "저장 공간에 " [:b space-left "만 남았습니다"] "."])
     :pricing-popup/free-account-info                 "가입하면 무료로 다음을 얻을 수 있습니다:"
     :pricing-popup/free-limit                        "최대 3개의 OrgPage,"
     :pricing-popup/free-storage                      "최대 100MB의 저장 공간,"
     :pricing-popup/free-share                        "다른 사람과 작업 공유."
     :pricing-popup/free-account-info2                "몇 번의 클릭만으로 계정을 만드십시오."

     :pricing-popup/register-to-comment               "댓글을 추가하려면 가입하십시오"
     :pricing-popup/register-to-comment-info          (str "댓글 셀에는 이름과 프로필 사진이 표시됩니다."
                                                           " 그러려면 먼저 계정을 만들어야 합니다.")

     :pricing-popup/print-watermark-title             "워터마크 없음을 위해 플랜을 업그레이드하십시오"
     :pricing-popup/print-watermark-info              (str "OrgPad.info 워터마크 없이 인쇄하는 것은"
                                                           " 프로페셔널, 학교 및 기업 플랜에서만 가능합니다.")

     :profile/open-contact-dialog                     "메시지 보내기"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str first-name " " last-name "에게 연락")
                                                          "이 사람에게 연락"))
     :profile/contact-dialog-info                     (str "OrgPad에서 다른 사람의 이메일 주소를 공유하지 않으므로 이 메시지를 대신 보내드립니다. "
                                                           "직접 연락할 수 있도록 귀하의 이름과 이메일을 포함합니다.")

     :promotion/unknown                               "알 수 없는 코드"
     :promotion/max-usages-reached                    "너무 많이 사용됨"
     :promotion/expired                               "만료됨"
     :promotion/one-year-free                         "1년 무료"
     :promotion/duration-free                         "{promotion/duration}일 무료"
     :promotion/for-one-year                          " 1년 동안"
     :promotion/for-six-months                        " 6개월 동안"

     :props/h1                                        "큰 제목"
     :props/h2                                        "중간 제목"
     :props/h3                                        "작은 제목"
     :props/weight-none                               "일반 링크"
     :props/strong                                    "강한 링크"
     :props/arrowhead-none                            "화살표 없음"
     :props/single                                    "화살표"
     :props/double                                    "이중 화살표"

     :public-permission/none                          "비공개."
     :public-permission/view                          "모든 사람과 읽기용으로 공유됨."

     :registration/create-user                        "계정 만들기"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "이미 계정이 있으십니까? " [:a.link-button {:href route} "로그인"]])
     :registration/options                            "다른 가입 방법 선택"
     :registration/server-error                       "서버 오류입니다. 계정을 다시 만들어 보십시오."
     :registration/missing-oauth-email                "{registration/service}에서 귀하의 이메일을 알려주지 않았습니다. 아래에 기입해 주십시오."

     :search/previous-match                           "이전 일치 항목 (PAGEUP)"
     :search/next-match                               "다음 일치 항목 (PAGEDOWN)"
     :search/close                                    "닫기 (ESC)"
     :search/cells-with-selected-attachments          "선택한 파일 및 이미지가 있는 셀."

     :selection/change-style-of-selected              (fn [{:selection/keys [type]}]
                                                        (str "선택한 "
                                                             (case type
                                                               :style-select/all-props (str "{selection/num-units}개 셀과 "
                                                                                            "{selection/num-links}개 링크")
                                                               :style-select/unit-props "{selection/num-units}개 셀"
                                                               :style-select/link-props "{selection/num-links}개 링크")
                                                             "의 스타일 변경; SHIFT를 누른 채로 현재 스타일 설정, CTRL을 누른 채로 현재 스타일에 복사"))

     :selection/link                                  "셀 연결"
     :selection/hide-contents                         "내용 숨기기 (ESC)"
     :selection/show-contents                         "내용 표시"
     :selection/force-closing                         "위치를 열 때 이 내용 숨기기 (ESC)"
     :selection/step-focus-camera                     "이 단계의 카메라를 선택한 셀에 정확히 맞춥니다 (F2 또는 Q). SHIFT를 누른 상태로 추가하고, ALT로 제거합니다."
     :selection/fragment-focus-camera                 "현재 위치의 카메라를 선택한 셀에 정확히 맞춥니다 (F2 또는 Q). SHIFT를 누른 상태로 추가하고, ALT로 제거합니다."
     :selection/step-show-books                       "이 단계에서 선택한 셀만 표시합니다 (F3 또는 W). SHIFT를 누른 상태로 추가하고, ALT로 제거합니다."
     :selection/fragment-show-books                   "현재 위치에서 선택한 셀만 표시합니다 (F3 또는 W). SHIFT를 누른 상태로 추가하고, ALT로 제거합니다."
     :selection/force-showing                         "이전에 숨겨진 선택한 셀 표시"
     :selection/share-units                           "선택한 단위를 표시하는 링크 복사; SHIFT를 누른 채로 위치 설정 열기"
     :selection/move-to-new-orgpage                   "새 OrgPage로 이동"
     :selection/change-code-lang                      "코드 언어 변경"
     :selection/copy-units-links                      "셀과 링크를 클립보드에 복사"
     :selection/flip-links                            "링크 방향 뒤집기"
     :selection/delete                                "선택 항목 삭제"

     :settings/profile                                "프로필"
     :settings/payments                               "결제"
     :settings/account                                "계정"
     :settings/linked-accounts                        "연결된 계정"
     :settings/email                                  "알림"
     :settings/account-description                    "이메일, 비밀번호를 변경하거나 계정을 삭제하십시오."
     :settings/stats-description                      "OrgPad 사용에 대한 몇 가지 통계입니다."
     :settings/change-email                           "이메일 변경"
     :settings/change-email-text                      "새 이메일 주소를 입력하십시오. 보안상의 이유로 계정을 잠금 해제하기 전에 확인해야 합니다."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "이메일 " [:b email] "을(를) 사용하여 계정에 가입했습니다."])
     :settings/account-linked-to-facebook             [:<> "계정이 Facebook에 " [:b "연결"] "되었습니다."]
     :settings/account-not-linked-to-facebook         [:<> "계정이 Facebook에 " [:b "연결되지 않았습니다"] "."]
     :settings/link-fb                                "Facebook 연결"
     :settings/unlink-fb                              "Facebook 연결 해제"
     :settings/account-linked-to-google               [:<> " 계정이 Google에 " [:b "연결"] "되었습니다."]
     :settings/account-not-linked-to-google           [:<> " 계정이 Google에 " [:b "연결되지 않았습니다"] "."]
     :settings/link-google                            "Google 연결"
     :settings/unlink-google                          "Google 연결 해제"
     :settings/account-linked-to-microsoft            [:<> " 계정이 Microsoft에 " [:b "연결"] "되었습니다."]
     :settings/account-not-linked-to-microsoft        [:<> " 계정이 Microsoft에 " [:b "연결되지 않았습니다"] "."]
     :settings/link-microsoft                         "Microsoft 연결"
     :settings/unlink-microsoft                       "Microsoft 연결 해제"
     :settings/account-linked-to-cuni                 [:<> " 계정이 Charles University에 " [:b "연결"] "되었습니다."]
     :settings/account-not-linked-to-cuni             [:<> " 계정이 Charles University에 " [:b "연결되지 않았습니다"] "."]
     :settings/link-cuni                              "Charles University 연결"
     :settings/unlink-cuni                            "Charles University 연결 해제"
     :settings/set-password-text                      " 연결을 해제하기 전에 비밀번호를 설정하십시오."
     :settings/linked-accounts-info                   "Facebook, Google, Microsoft 또는 Charles University 계정을 OrgPad에 연결하여 로그인하는 데 사용할 수 있습니다."
     :settings/profile-info                           "제공된 정보를 통해 프로젝트의 동료가 귀하를 더 쉽게 찾을 수 있습니다."
     :settings/delete-account                         "계정 삭제"
     :settings/confirm-delete-account-question        [:<> "계정을 " [:b "영구적으로"] " 삭제하시겠습니까?"]
     :settings/confirm-delete-account-info            "모든 OrgPage와 해당 데이터가 삭제됩니다."
     :settings/delete-account-info                    [:<> "삭제하면 모든 OrgPage와 해당 데이터가 " [:b "영구적으로"] " 삭제됩니다."]

     :share-orgpage/campaigns                         "캠페인"
     :share-orgpage/copied-to-clipboard               "클립보드에 복사됨"
     :share-orgpage/copy-template-link                "템플릿 링크 복사"
     :share-orgpage/dialog-title                      "{orgpage/title} 공유"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "OrgPad 계정이 없는 사람들은 링크가 포함된 초대장을 받게 됩니다."
                                                                  " 링크를 열면 이 OrgPage를 읽을 수 있습니다. ")
                                                         [:a.link-button create-team "팀 만들기"]
                                                         "를 통해 그룹과 쉽게 OrgPage를 공유할 수 있습니다."])
     :share-orgpage/email-found                       "OrgPad 계정을 찾았습니다."
     :share-orgpage/email-unused                      "OrgPad 계정을 찾을 수 없습니다. 대신 이메일 초대를 보내십시오."
     :share-orgpage/checking-email-address            "이메일 주소 확인 중..."
     :share-orgpage/invite-for-editing                "편집 초대"
     :share-orgpage/invite-for-viewing                "읽기 초대"
     :share-orgpage/invite-by-email                   "특정 언어를 사용하여 이메일로 초대하시겠습니까?"
     :share-orgpage/show-profile                      "프로필 표시"
     :share-orgpage/links                             "링크"
     :share-orgpage/to-read                           "읽기"
     :share-orgpage/to-comment                        "댓글 달기"
     :share-orgpage/to-edit                           "편집"
     :share-orgpage/links-tooltip                     "공유 가능한 링크를 통해 액세스 권한 부여"
     :share-orgpage/template                          "템플릿"
     :share-orgpage/template-tooltip                  "이 OrgPage의 사본을 자동으로 만드는 링크"
     :share-orgpage/template-info                     "사람들은 이 링크를 사용하여 이 OrgPage의 자체 사본을 만들 수 있습니다."
     :share-orgpage/template-autoshare-none           "나와 사본을 공유하지 마십시오."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "나와 사본을 "
                                                             (case template-autoshare
                                                               :permission/view "읽기"
                                                               :permission/comment "댓글 달기"
                                                               :permission/edit "편집") "용으로 공유하십시오."))
     :share-orgpage/embed                             "삽입"
     :share-orgpage/embed-into-microsoft-teams        "Microsoft Teams에 삽입"
     :share-orgpage/embed-into-website                "웹사이트 또는 애플리케이션에 삽입"
     :share-orgpage/embed-tooltip                     "웹사이트 또는 애플리케이션에 삽입"
     :share-orgpage/new-user-or-usergroup             "이름, 이메일 또는 팀"
     :share-orgpage/link-permission-start             "사람들에게 허용"
     :share-orgpage/link-permission-end               "이 OrgPage."
     :share-orgpage/orgpage-info                      "정보"
     :share-orgpage/orgpage-info-tooltip              "소유자 및 OrgPage 게시 여부에 대한 정보"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "이 OrgPage는 귀하와 "
                                                             (case user-permission
                                                               :permission/view "읽기"
                                                               :permission/comment "댓글 달기"
                                                               :permission/edit "편집") "용으로 공유됩니다."))
     :share-orgpage/remove-yourself                   "자신을 제거"
     :share-orgpage/private-info                      "귀하와 귀하가 직접 또는 링크를 통해 OrgPage를 공유한 사람들만 액세스할 수 있습니다. 새로 만든 모든 문서는 비공개입니다."
     :share-orgpage/publish-for-reading-info          "OrgPage는 공개됩니다. 인터넷상의 누구나 검색하고 읽을 수 있습니다. 귀하나 편집용으로 OrgPage를 공유한 사람들만 변경할 수 있습니다."
     :share-orgpage/publish-permission-end            "이 OrgPage는 "
     :share-orgpage/publish                           "게시"
     :share-orgpage/publish-confirmation              "모든 사람이 이 OrgPage를 {orgpage/permission}할 수 있습니다. 확실합니까?"
     :share-orgpage/publish-tooltip                   "모든 사람에게 액세스 권한 부여"
     :share-orgpage/remove-user                       "권한 제거"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "실수로 링크를 공유한 경우 "
                                                         [:span.link-button reset-links "이전의 모든 링크를 무효화"]
                                                         "할 수 있습니다."])
     :share-orgpage/shareable-link                    "공유 가능한 링크"
     :share-orgpage/everything-closed                 "모든 셀 닫힘 표시"
     :share-orgpage/presentation                      "프레젠테이션으로 시작"
     :share-orgpage/fragment                          "위치 표시"
     :share-orgpage/template-link-switch              "템플릿 링크 만들기."
     :share-orgpage/user-not-registered               "님은 아직 OrgPad에 가입하지 않았습니다."
     :share-orgpage/users                             "사람들"
     :share-orgpage/users-tooltip                     "개별 사용자에게 액세스 권한 부여"

     :side-panel/about                                "홈페이지"
     :side-panel/terms-and-conditions                 "이용 약관"
     :side-panel/privacy-and-security                 "개인 정보 보호 및 보안"
     :side-panel/files-and-images                     "파일 및 이미지"
     :side-panel/paths                                "프레젠테이션"
     :side-panel/fragments                            "위치"
     :side-panel/translate                            "번역"
     :side-panel/toggle-debug                         "디버거"
     :side-panel/help                                 "도움말"
     :side-panel/blog                                 "블로그"
     :side-panel/home                                 "홈"
     :side-panel/import                               "가져오기"
     :side-panel/share                                "공유"
     :side-panel/num-files                            "{side-panel/num-files}개 파일"
     :side-panel/num-images                           "{side-panel/num-images}개 이미지"
     :side-panel/num-paths                            "{side-panel/num-paths}개 프레젠테이션"
     :side-panel/num-fragments                        "{side-panel/num-fragments}개 위치"

     :step/closed-books                               "닫힌 셀"
     :step/everything-closed                          "모든 것이 닫혔습니다."
     :step/hidden-books                               "숨겨진 셀"
     :step/nothing-changed                            "아무것도 변경되지 않았습니다."
     :step/opened-pages                               "열린 페이지"
     :step/focused-books                              "카메라에 표시된 셀"
     :step/shown-books                                "드러난 셀"
     :step/switched-pages                             "전환된 페이지"

     :style-select/set-comment                        "프로필 이미지가 있는 댓글 셀로 변경 (CTRL+,)"
     :style-select/unset-comment                      "프로필 이미지를 제거하여 일반 셀로 변경 (CTRL+,)"
     :style-select/set-comment-safari                 "프로필 이미지가 있는 댓글 셀로 변경 (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "프로필 이미지를 제거하여 일반 셀로 변경 (SHIFT+CMD+,)"

     :tag/public                                      "공개"

     :text-field/email                                "이메일"
     :text-field/first-name                           "이름"
     :text-field/last-name                            "성"
     :text-field/name                                 "이름"
     :text-field/new-password                         "새 비밀번호"
     :text-field/password                             "비밀번호"
     :text-field/content                              "내용"
     :text-field/name-or-email                        "이름 또는 이메일"
     :text-field/subject                              "제목"
     :text-field/message                              "메시지"
     :text-field/phone-number                         "전화번호"
     :text-field/width                                "너비"
     :text-field/height                               "높이"

     :translate/title                                 "OrgPage {orgpage/title}를 다른 언어로 번역"
     :translate/info                                  (str "이 OrgPage의 사본을 자동으로 만들어 귀하가 소유하게 되며,"
                                                           " 소스 언어에서 대상 언어로 번역됩니다."
                                                           " 1분 안에 목록에서 찾을 수 있습니다.")
     :translate/source-lang                           "소스 언어"
     :translate/target-lang                           "대상 언어"
     :translate/translate                             "번역"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "번역은 "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title] "으로 제공됩니다"])

     :unit-editor/add-page                            "다른 페이지 만들기 (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "이 페이지 제거"
     :unit-editor/previous-page                       (str "이전 페이지 (PAGEUP);"
                                                           " SHIFT를 누른 채로 이 페이지를 왼쪽으로 이동 (SHIFT+PAGEUP);"
                                                           " CTRL을 누른 채로 이 페이지 앞에 다른 페이지 추가 (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "다음 페이지 (PAGEDOWN);"
                                                           " SHIFT를 누른 채로 이 페이지를 오른쪽으로 이동 (SHIFT+PAGEDOWN);"
                                                           " CTRL을 누른 채로 이 페이지 뒤에 다른 페이지 추가 (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "이 페이지로 전환"
                                                             (when can-edit "; SHIFT를 누른 채로 현재 페이지를 거기로 이동")))
     :unit-editor/hidden-info                         "쓰려면 클릭"
     :unit-editor/undo                                "실행 취소 (CTRL+Z)"
     :unit-editor/redo                                "다시 실행 (CTRL+SHIFT+Z 또는 CTRL+Y)"
     :unit-editor/toggle-bold                         "굵게 (CTRL+B)"
     :unit-editor/toggle-italic                       "기울임꼴 (CTRL+I)"
     :unit-editor/toggle-strikethrough                "취소선"
     :unit-editor/toggle-subscript                    "아래 첨자 (CTRL+S)"
     :unit-editor/toggle-superscript                  "위 첨자 (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "하이퍼링크 만들기 (CTRL+K)"
     :unit-editor/remove-hyperlink                    "하이퍼링크 제거"
     :unit-editor/set-highlighting                    "강조 색상"
     :unit-editor/selection->code                     "코드로 변환 (CTRL+D)"
     :unit-editor/toggle-list-ul                      "글머리 기호 목록 (TAB)"
     :unit-editor/toggle-list-ol                      "번호 매기기 목록 (CTRL+O)"
     :unit-editor/indent                              "들여쓰기 늘리기 (TAB)"
     :unit-editor/outdent                             "들여쓰기 줄이기 (SHIFT+TAB)"
     :unit-editor/center                              "가운데 정렬 (CTRL+L)"
     :unit-editor/heading                             "제목 (CTRL+G)"
     :unit-editor/embed-pdf                           "PDF 내용 표시"
     :unit-editor/link-pdf                            "PDF 내용을 하이퍼링크로 바꾸기"
     :unit-editor/embed-office                        "Microsoft 365를 사용하여 문서 내용 표시"
     :unit-editor/link-office                         "문서 내용을 하이퍼링크로 바꾸기"
     :unit-editor/embed-video                         "비디오 플레이어 표시"
     :unit-editor/link-video                          "비디오를 하이퍼링크로 바꾸기"
     :unit-editor/embed-audio                         "오디오 플레이어 표시"
     :unit-editor/link-audio                          "오디오를 하이퍼링크로 바꾸기"
     :unit-editor/hyperlink->embed                    "링크된 웹사이트 삽입"
     :unit-editor/embed->hyperlink                    "삽입된 웹사이트를 하이퍼링크로 바꾸기"
     :unit-editor/open-image-in-attachments           "첨부 파일 목록에서 이 이미지 열기"
     :unit-editor/open-file-in-attachments            "첨부 파일 목록에서 이 파일 열기"
     :unit-editor/toggle-controls                     "비디오 플레이어 컨트롤 표시"
     :unit-editor/toggle-autoplay                     "자동 재생"
     :unit-editor/toggle-muted                        "음소거 재생, 그렇지 않으면 자동 재생이 차단될 수 있습니다"
     :unit-editor/toggle-loop                         "반복 재생"
     :unit-editor/toggle-chained-size                 "종횡비 유지"
     :unit-editor/insert-menu                         "삽입"
     :unit-editor/insert-image                        "이미지"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "장치에서 이미지 업로드."
     :unit-editor/insert-image-info2                  "팁: 이미지를 아무 셀이나 회색 캔버스로 직접 드래그하거나 붙여넣습니다."
     :unit-editor/insert-camera                       "카메라"
     :unit-editor/insert-attachment                   "파일"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "비디오"
     :unit-editor/insert-video-info                   "컴퓨터에서 비디오를 업로드하거나 YouTube에서 삽입하십시오."
     :unit-editor/insert-video-info2                  "팁: 비디오 및 YouTube 썸네일을 아무 셀이나 회색 캔버스로 직접 드래그하십시오."
     :unit-editor/video-url                           "YouTube 링크"
     :unit-editor/youtube-start                       "시작"
     :unit-editor/youtube-end                         "종료"
     :unit-editor/insert-table                        "표"
     :unit-editor/insert-table-info                   "삽입된 표의 크기를 선택하십시오."
     :unit-editor/toggle-table-border                 "표 테두리 표시"
     :unit-editor/add-row-before                      "위에 행 삽입"
     :unit-editor/add-row-after                       "아래에 행 삽입"
     :unit-editor/remove-current-row                  "행 삭제"
     :unit-editor/add-column-before                   "앞에 열 삽입"
     :unit-editor/add-column-after                    "뒤에 열 삽입"
     :unit-editor/remove-current-column               "열 삭제"
     :unit-editor/remove-table                        "표 제거"
     :unit-editor/insert-website                      "웹사이트"
     :unit-editor/insert-website-info                 (str "웹사이트를 셀에 직접 삽입할 수 있습니다."
                                                           " 작동하지 않으면 웹사이트 소유자가 차단했을 수 있습니다.")
     :unit-editor/website-url-or-code                 "웹사이트 주소 또는 코드"
     :unit-editor/website-id                          "웹사이트 ID"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> " "
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "웹사이트 간 메시지 보내기"] "에 사용됩니다."])
     :unit-editor/invalid-website-url                 "잘못된 웹사이트 주소 또는 코드"
     :unit-editor/invalid-video-url                   "잘못된 비디오 주소"
     :unit-editor/update-website                      "웹사이트 주소 변경"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "코드"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "코드 복사"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "별도 단락으로 코드"
     :unit-editor/toggle-block-math                   "별도 줄에 수학"
     :unit-editor/remove-code                         "코드 서식 제거"
     :unit-editor/insert-math                         "수학 / 화학"

     :unit-panel/link                                 (str "클릭하거나 드래그하여 연결;"
                                                           " SHIFT를 누른 채로 여러 연결 만들기;"
                                                           " CTRL을 누른 채로 셀 체인 만들기")
     :unit-panel/upload-attachment                    "이 셀에 이미지 또는 파일 삽입"
     :unit-panel/change-link-style                    (str "이 셀의 스타일 변경; "
                                                           "SHIFT를 누른 채로 현재 스타일 설정, "
                                                           "CTRL을 누른 채로 기본값에 복사; "
                                                           "이 스타일로 연결하려면 드래그")
     :unit-panel/hide-content                         "내용 숨기기"
     :unit-panel/delete-unit                          "셀 삭제"

     :usergroup/create                                "팀 만들기"
     :usergroup/edit-title                            "{usergroup/name} 편집"
     :usergroup/info                                  "친구 및 동료 팀을 만들고 관리하여 OrgPage 공유를 단순화하십시오."
     :usergroup/delete                                "팀 삭제"
     :usergroup/members                               "멤버"
     :usergroup/edit                                  "팀 이름 및 로고 변경"
     :usergroup/show-actions                          "작업 표시"
     :usergroup/name                                  "이름"
     :usergroup/hide-orgpages                         "공유된 OrgPage 숨기기"
     :usergroup/hide-orgpages-tooltip                 "필터에서 팀을 켜면 표시할 수 있습니다"
     :usergroup/hide-in-filter                        "필터에서 숨기기"
     :usergroup/create-info                           "팀 이름과 프로필 사진은 팀 멤버에게만 표시됩니다."
     :usergroup/confirm-delete                        [:<> "이 팀을 " [:b "영구적으로"] " 삭제하시겠습니까?"]
     :usergroup/members-title                         "{usergroup/name}의 멤버"
     :usergroup/remove-member                         "팀에서 제거"
     :usergroup/remove-admin                          "관리자 제거"
     :usergroup/make-admin                            "관리자로 만들기"
     :usergroup/admin-tooltip                         "관리자는 멤버를 관리하고 팀을 삭제할 수 있습니다."
     :usergroup/copy-usergroup                        "팀 복사"

     :usergroup-role/owner                            "소유자"
     :usergroup-role/admin                            "관리자"
     :usergroup-role/member                           "멤버"

     :wire-transfer/title                             "연간 {wire-transfer/tier} 플랜에 대한 계좌 이체"
     :wire-transfer/info                              "귀하의 돈을 당사 계좌로 받으면 연간 구독을 활성화합니다."
     :wire-transfer/used-currency                     "{wire-transfer/currency}로 결제"
     :wire-transfer/recipient-name                    "수취인 이름"
     :wire-transfer/account-number                    "계좌 번호"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "금액"
     :wire-transfer/payment-purpose                   "결제 목적"
     :wire-transfer/qr-code-common                    (str "은행 앱으로 이 결제 QR 코드를 스캔하여"
                                                           " 올바른 정보를 자동으로 채우십시오.")
     :wire-transfer/cz-sk-qr-code-description         (str " 이것은 체코와 슬로바키아에서 계좌 이체에 일반적으로 사용되는 QR 코드입니다.")
     :wire-transfer/eu-qr-code-description            (str " 이것은 유럽 연합에서 SEPA 이체에 일반적으로 사용되는 QR 코드입니다.")
     :wire-transfer/trial-info                        (str "OrgPad를 즉시 완전히 사용하려면 1회 7일 구독을 시작할 수 있습니다."
                                                           " 은행에서 결제 성공을 확인하면"
                                                           " 구독 기간이 1년 연장됩니다.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " 질문이나 어려움이 있으시면 "
                                                         [:a.link-button {:href url} "이 양식을 작성"] "하여 알려주십시오."])
     :wire-transfer/success-text                      [:<> "새 플랜으로 OrgPad를 즉시 사용할 수 있도록 " [:b "1회 7일 구독"] "을(를) 활성화했습니다. "]
     :wire-transfer/common-result-text                (str "은행에서 결제 성공을 확인하면,"
                                                           " 구독 기간이 1년 연장됩니다.")
     :wire-transfer/start-trial                       "계좌 이체 전송됨"
     :wire-transfer/start-trial-result-title          "결제해 주셔서 감사합니다"
     :wire-transfer/copy                              "클립보드에 복사"

     :website-editor/settings                         "설정"
     :website-editor/routes                           "경로"
     :website-editor/menus                            "메뉴"
     :website-editor/create-menu                      "메뉴 만들기"
     :website-editor/edited-menu                      "편집된 메뉴"
     :website-editor/untitled-menu                    "제목 없는 메뉴"
     :website-editor/num-subitems                     "{menu-item/num-children}개 하위 항목"
     :website-editor/delete-menu-item                 "이 메뉴 항목 삭제"
     :website-editor/add-menu-item                    "메뉴 항목 추가"
     :website-editor/menu-item-label                  "항목 레이블"
     :menu-item/path-type                             "경로 열기"
     :menu-item/url-type                              "외부 URL 열기"
     :menu-item/children-type                         "하위 메뉴 열기"
     :website-editor/menu-item-path                   "경로"

     :youtube-placement/watch-on-prefix               (str "시청하기" unicode/nbsp)
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/kr dict)