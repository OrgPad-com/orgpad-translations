(ns orgpad.client.i18n.dicts.jp
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.jp :as jp]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  "A dictionary map from keywords to the corresponding Japanese texts."
  (merge
    jp/dict
    {:address/company                                 "会社名"
     :address/ico                                     "法人番号"
     :address/street                                  "通り"
     :address/street-number                           "番地"
     :address/postal-code                             "郵便番号"
     :address/city                                    "市区町村"
     :address/country                                 "国"

     :administration/page-title                       "管理 - OrgPad"

     :attachments/allows-access-to-file               "このファイルへのアクセスを許可します。"
     :attachments/allows-access-to-image              "この画像へのアクセスを許可します。"
     :attachments/no-preview                          "プレビューはありません。"
     :attachments/all-files                           "すべてのファイル"
     :attachments/used-files                          "OrgPage内のファイル"
     :attachments/unused-files                        "サイドにあるファイル"
     :attachments/all-images                          "すべての画像"
     :attachments/used-images                         "OrgPage内の画像"
     :attachments/unused-images                       "サイドにある画像"
     :attachments/uploading-files                     "ファイルをアップロード中..."
     :attachments/previous-attachment                 "前のファイルまたは画像"
     :attachments/next-attachment                     "次のファイルまたは画像"
     :attachments/display-using-microsoft-365         "Microsoft 365を使用して表示"
     :attachments/edit-filename                       "名前を編集"
     :attachments/title-order                         "タイトル順"
     :attachments/upload-order                        "新しい順"
     :attachments/size-order                          "大きい順"
     :attachments/split-used-unused                   "OrgPageでの使用状況でグループ化"
     :attachments/search                              "検索"
     :attachments/ordering                            "並べ替え"
     :attachments/new-version                         "新しいバージョン"
     :attachments/preserve-old-version                "古いバージョンを保持"
     :attachments/in-other-orgpages                   "他のOrgPageで置換"

     :button/back                                     "戻る"
     :button/cancel                                   "キャンセル"
     :button/close                                    "閉じる"
     :button/comment                                  "コメント"
     :button/continue                                 "続ける"
     :button/copied                                   "コピーしました"
     :button/copy                                     "コピー"
     :button/copy-link                                "リンクをコピー"
     :button/create                                   "作成"
     :button/create-tooltip                           "作成 (CTRL+ENTER)"
     :button/delete                                   "削除"
     :button/delete-selected                          "選択項目を削除"
     :button/documentation                            "ドキュメント"
     :button/download                                 "ダウンロード"
     :button/download-all                             "すべてダウンロード"
     :button/drop                                     "ドロップ"
     :button/edit                                     "編集"
     :button/import                                   "インポート"
     :button/insert                                   "挿入"
     :button/login                                    "ログイン"
     :button/logout                                   "ログアウト"
     :button/publish                                  "公開"
     :button/read                                     "閲覧"
     :button/register                                 "登録"
     :button/register-to-save                         "登録して保存"
     :button/remove                                   "削除"
     :button/reset                                    "リセット"
     :button/save                                     "変更を保存"
     :button/save-tooltip                             "変更を保存 (CTRL+ENTER)"
     :button/upload                                   "アップロード"
     :button/upload-from-computer                     "コンピュータからアップロード"
     :button/send                                     "送信"
     :button/present                                  "プレゼンテーション"
     :button/present-tooltip                          "プレゼンテーションを開始 (F5)"
     :button/share                                    "共有"
     :button/start                                    "開始"
     :button/exit                                     "終了"
     :button/show-password                            "表示"
     :button/hide-password                            "非表示"

     :checkout/currency                               "通貨"
     :checkout/monthly                                "月額"
     :checkout/yearly                                 "年額 (15%お得)"
     :checkout/failed-to-init                         "決済サイトの読み込み中に問題が発生しました。"
     :checkout/upgrade-plan                           "プランをアップグレード"
     :checkout/professional-plan                      "プロフェッショナルプラン"
     :checkout/school-plan                            "学校プラン"
     :checkout/enterprise-plan                        "エンタープライズプラン"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "学校"] "または"
                                                         [:a.link-button {:href enterprise-url} "エンタープライズ"] "ですか？カスタム契約についてはお問い合わせください。"])
     :checkout/pay-with-credit-card                   "カードで支払う"
     :checkout/pay-with-wire-transfer                 "銀行振込で支払う"
     :checkout/promo-code                             "プロモーションコード"
     :checkout/try-for-free                           "無料で試す"
     :checkout/activate-now                           "今すぐ有効化"
     :checkout/continue-for-free                      "無料で続ける"

     :code-lang/none                                  "なし"
     :code-lang/multiple                              "複数"

     :dashboard/confirm-delete                        [:<> "このOrgPageを" [:b "完全に"] "削除しますか？"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "ログイン"] "または"
                                                         [:a {:href register-url} "登録"]
                                                         "して新しいOrgPageを作成します。"])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "あなたの学校「" name "」のサブスクリプションは" subscription-expired "に失効しました。更新については、管理部門にお問い合わせください。"
                                                         [:a {:href   info-link
                                                              :target "_blank"} "詳細情報"] " (学校向け95%割引について)。"])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "95%割引でOrgPadを学校で無制限に利用できます。"
                                                         [:a {:href   info-link
                                                              :target "_blank"} "詳細はこちら。"]])
     :dashboard/owned-orgpages                        "私のOrgPage"
     :dashboard/public-orgpages                       "公開されたOrgPage"
     :dashboard/shared-orgpages                       "共有されたOrgPage"
     :dashboard/usergroup-orgpages                    "{usergroup/name}のOrgPage"
     :dashboard/help-or-inspiration-button            "どうぞ！"
     :dashboard/new-domain                            [:<> "新しいドメイン " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       "をご利用ください。詳細はOrgPage " [:a {:href "https://orgpad.info/s/new-domain"} "OrgPadの変更と新しいドメイン"] "をご覧ください。"]

     :dashboard-filter/filter                         "OrgPageをフィルター"
     :dashboard-filter/ordering                       "OrgPageを並べ替え"
     :dashboard-filter/filter-and-ordering            "OrgPageをフィルターして並べ替え"
     :dashboard-filter/title                          "表示されるOrgPageをフィルターして並べ替え"
     :dashboard-filter/ordering-label                 "OrgPageの並べ替え"
     :dashboard-filter/title-order                    "タイトル順"
     :dashboard-filter/creation-time-order            "新しい順"
     :dashboard-filter/last-modified-order            "最終更新順"
     :dashboard-filter/most-viewed-order              "閲覧数順"
     :dashboard-filter/search-tags                    "タグを検索"

     :embedding-code/code                             "コード"
     :embedding-code/description                      "ウェブサイトや他のアプリケーションにOrgPageを埋め込みます。"

     :error/orgpage-access-denied                     "このOrgPageへのアクセス権がありません。ログインしてみてください。"
     :error/usergroup-access-denied                   "チームの編集権限が拒否されました。"
     :error/administration-access                     "管理者アクセスが拒否されました。"
     :error/creation-unauthorized                     "OrgPageを作成するにはログインしてください。"
     :error/deleting-denied                           "OrgPageの削除が拒否されました。"
     :error/email-already-used                        "このメールアドレスは既に使用されています。"
     :error/email-not-registered                      "このメールアドレスのアカウントはありません。"
     :error/email-missing-mx-record                   "このドメインにメールサーバーが見つかりません。"
     :error/email-invalid                             "メールアドレスではありません。"
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "不正なOrgPage" (when id " {orgpage/id}")
                                                             "。リンクが間違っていませんか？"))
     :error/incorrect-link                            "不正なリンクです。ログインするか、正しいリンクを開いてください。"
     :error/incorrect-password                        "パスワードが間違っています。"
     :error/incorrect-profile-id                      "プロファイルへのリンクが不正です。リンクが間違っていませんか？"
     :error/lost-permission                           "このOrgPageへのアクセス権を失いました。"
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "アカウントのないメールアドレス: " emails))
     :error/name-already-used                         "この名前は既に使用されています"
     :error/name-not-valid                            "5文字以上で入力してください"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "OrgPage " (when title "「{orgpage/title}」") " は削除されました。"))
     :error/owner-of-orgpage                          "このユーザーは既にこのOrgPageの所有者です。"
     :error/profile-not-found                         "プロファイルが見つかりません。"
     :error/unknown-error                             "不明なエラーです。もう一度お試しください。"
     :error/unknown-id                                "不明なOrgPageです。"
     :error/unknown-login-or-email                    "不明なメールアドレスまたはチームログインです。"
     :error/unknown-usergroup                         "チームは削除されました"
     :error/upload-failed                             "OrgPageのアップロードに失敗しました: 「{orgpage/title}」"

     :export/show                                     "OrgPageをエクスポート"
     :export/title                                    "{orgpage/title}をエクスポート"
     :export/info                                     "このOrgPageをエクスポートする形式を選択してください。"
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " 形式 (OrgPadで使用)"]
     :export/html                                     "リニアなHTMLファイル"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " 形式"]
     :export/generate                                 "エクスポートを生成"

     :feedback/ask-question                           "質問する"
     :feedback/hide-button                            "ボタンを完全に非表示にする"
     :feedback/dialog-title                           "OrgPad開発者へのお問い合わせ"
     :feedback/description                            [:<> "ヘルプが必要な場合や問題がある場合は、"
                                                       [:b "OrgPadの開発者"] "にお知らせください。"
                                                       "改善のためのアイデアも歓迎します。"
                                                       "できるだけ早くメールで返信いたします。"]
     :feedback/languages                              "英語、チェコ語、ドイツ語でご連絡いただけます。"
     :feedback/contact-when-problem-persists          [:<> "問題が解決しない場合は、"
                                                       company/support-email-app-link "までお問い合わせください。"]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "銀行振込"
                                                             (when currency
                                                               (str " (" (name currency) ")")) " - "
                                                             "年間"
                                                             (if (= tier "standard")
                                                               "スタンダード"
                                                               "プロフェッショナル")
                                                             "プラン"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> [:b "請求先住所"] "と、請求書に必要な追加情報を入力してください。"
                                                         "ご登録のメールアドレス " [:b email] " に、まもなくご連絡いたします。"])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "学校"
                                                               :feedback/enterprise-plan "会社"
                                                               "組織") "のプランを購入したい"))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "このフォームを使用してOrgPad s.r.o.の担当者にお問い合わせください。"
                                                         "ご提供いただいた電話番号またはメールアドレス (" email
                                                         ") に、まもなくご連絡いたします。お電話 "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "でもお問い合わせいただけます。"])
     :feedback/upgrade-subscription-title             "サブスクリプションをプロフェッショナルプランにアップグレード"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "既存のサブスクリプションをどのように変更したいか、またその他の情報をお知らせください。"
                                                         "ご登録のメールアドレス " [:b email] " に、まもなくご連絡いたします。"])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "請求期間を" (if (= period "yearly")
                                                                           "年間"
                                                                           "月間") "請求に変更"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "変更は現在の請求期間の終了後に有効になります。"
                                                         "年間請求には15%の割引があります。"
                                                         "ご登録のメールアドレス " [:b email] " に、まもなくご連絡いたします。"])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "学校"
                                                               :feedback/enterprise-plan "会社"
                                                               "組織") "名"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "学校"
                                                               :feedback/enterprise-plan "会社"
                                                               "組織") "内での役職"))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "学校"
                                                               :feedback/enterprise-plan "会社"
                                                               "組織") "のウェブサイト"))

     :fragment/fragment                               "場所"
     :fragment/text-id                                "ID"
     :fragment/title                                  "タイトル"
     :fragment/create                                 "場所を作成"
     :fragment/create-tooltip                         "TAB; SHIFTキーを押しながらで選択した場所をコピー"
     :fragment/remove                                 "場所を削除"
     :fragment/share                                  "この場所へのリンクをコピー"
     :fragment/text-id-required                       "IDが必要です。"
     :fragment/text-id-already-used                   "IDは既に使用されています。"
     :fragment/closed-books                           "閉じたセル; CTRL+クリックで選択"
     :fragment/hidden-books                           "非表示のセル; CTRL+クリックで選択"
     :fragment/opened-pages                           "開いたページ; CTRL+クリックで選択"
     :fragment/focused-books                          "カメラに表示されているセル; CTRL+クリックで選択"
     :fragment/shown-books                            "表示されたセル; CTRL+クリックで選択"

     :info/uploading-attachments                      "{info/count}個のファイルをアップロード中..."
     :info/uploading-images                           "{info/count}個の画像をアップロード中..."
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          "{info/count}個の画像のアップロードに失敗しました。"
                                                          "少なくとも1つの画像のアップロードに失敗しました。"))
     :info/uploading-youtubes-failed                  "{info/count}個のYouTube動画が見つかりません。"
     :info/uploading-attachments-failed               "ファイルのアップロードに失敗しました。"
     :info/presentation-link-copied                   "このプレゼンテーションのリンクをコピーしました。"
     :info/max-orgpages-exceeded                      "このOrgPageの所有者は、これ以上OrgPageを作成できません。"
     :info/storage-exceeded                           "このOrgPageの所有者には、これらのファイルをアップロードするための{upload/total-size}の空き容量がありません。"
     :info/attachments-too-large                      (str "一度に{upload/total-size}をアップロードすることはできません。"
                                                           "アップロードされるすべての添付ファイルの最大サイズは500 MBです。")
     :info/drop-info                                  "任意のセルまたは灰色のキャンバスにドロップして、新しいセルを作成します。"
     :info/audio-not-allowed                          "音声の再生がブロックされました。再生ボタンをクリックしてください。"
     :info/audio-not-supported                        "対応していない音声形式です。"

     :import/another-format                           [:<> "他の形式で既存のデータをインポートしたい場合は、"
                                                       company/support-email-app-link "までお問い合わせください。"]
     :import/dialog                                   "データをインポート"
     :import/google-docs                              "Microsoft OfficeまたはGoogle Docsからデータを挿入するには、OrgPageに貼り付けるだけです。"
     :import/supported-formats                        "現在、これらの形式をサポートしています:"
     :import/lucidchart                               [:<> ".vsdxファイルとしてエクスポートされた" [:b "Lucidchart"] "。"]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] "ファイル。"]

     :ios/install-info                                "OrgPadアプリをインストール"
     :ios/share-button                                "1. 開く"
     :ios/add-to-home-screen                          "2. タップ"

     :lang/cs                                         "チェコ語"
     :lang/de                                         "ドイツ語"
     :lang/en                                         "英語"
     :lang/es                                         "スペイン語"
     :lang/fr                                         "フランス語"
     :lang/hi                                         "ヒンディー語"
     :lang/pl                                         "ポーランド語"
     :lang/ru                                         "ロシア語"
     :lang/uk                                         "ウクライナ語"

     :lang-select/tooltip                             "アプリの言語 (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "あなたの言語がありませんか？"
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "OrgPadの翻訳"] "にご協力ください。"]

     :limit/of                                        " / "
     :limit/orgpages                                  " OrgPage"
     :limit/people                                    " 人"
     :limit/teams                                     " チーム"
     :limit/team-members                              " メンバー"
     :limit/orgpages-tooltip                          (str "無料プランでは、OrgPageの数に制限があります。"
                                                           "プランをアップグレードして、より多くのOrgPageを作成してください。")
     :limit/shares-tooltip                            (str "このOrgPageを直接共有できる人数には制限があります。"
                                                           "プロフェッショナルプランにアップグレードすると、無制限の人数と共有できます。")
     :limit/teams-tooltip                             (str "スタンダードプランでは、所有できるチームの数に制限があります。"
                                                           "プロフェッショナルプランにアップグレードすると、無制限のチームを作成できます。")
     :limit/teams-members-tooltip                     (str "スタンダードプランでは、各チームのメンバー数に制限があります。"
                                                           "プロフェッショナルプランにアップグレードすると、無制限のチームを作成できます。")
     :limit/attachments-size                          (str "アップロードされたすべてのファイルと画像の合計サイズは制限されており、"
                                                           "プランをアップグレードすることで増やすことができます。")
     :limit/attachments-size-clickable                (str "アップロードされたすべてのファイルと画像の合計サイズは制限されています。"
                                                           "クリックしてプランをアップグレードし、制限を増やしてください。")
     :limit/attachments-size-try-out                  (str "アップロードされたすべてのファイルと画像の合計サイズは制限されています。"
                                                           "制限を100 MBに増やすには、クリックしてアカウントを作成してください。")

     :limits/max-orgpages                             "ドキュメント"
     :limits/max-storage                              "ストレージ"
     :limits/max-teams                                "チーム"
     :limits/of                                       " /"
     :limits/max-team-members                         "メンバー"
     :limits/priority-support                         "優先サポート"

     :link-panel/flip                                 "方向を反転"
     :link-panel/insert-unit-in-middle                "中央にセルを挿入"
     :link-panel/delete                               "リンクを削除"
     :link-panel/change-link-style                    "このリンクのスタイルを変更; SHIFTキーを押しながらで現在値を設定、CTRLキーを押しながらでデフォルトにコピー"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "すべてのセルのサイズを計算中、残り " [:span#autoresize-num-units num-units] " ..."])
     :loading/initial-layout                          "初期レイアウトを改善中..."
     :loading/restoring-opened-pages                  "開いたページの位置を復元中..."
     :loading/getting-orgpage                         "サーバーからOrgPageをダウンロード中..."
     :loading/getting-dashboard                       "サーバーから利用可能なOrgPageのリストをダウンロード中..."
     :loading/getting-website                         "サーバーからウェブサイトをダウンロード中..."
     :loading/getting-blog                            "サーバーからブログをダウンロード中..."
     :loading/uploading-orgpage                       "サーバーにOrgPageをアップロード中..."
     :loading/ws-init                                 "サーバーへの接続をセットアップ中..."
     :loading/ws-closed                               "サーバーへの接続が切れました。再接続を試みています。問題が解決しない場合は、ページをリロードしてください。"
     :loading/administration                          "管理データを読み込み中..."
     :loading/profile                                 "プロファイルを読み込み中..."
     :loading/style                                   "スタイルを読み込み中..."
     :loading/start-trial                             "7日間のトライアルサブスクリプションを開始中..."
     :loading/uploading-attachments                   "添付ファイルをサーバーにアップロード中..."

     :login/continue-with-email                       "メールアドレスで続行"
     :login/continue-with-facebook                    "Facebookで続行"
     :login/continue-with-google                      "Googleで続行"
     :login/continue-with-microsoft                   "Microsoftで続行"
     :login/continue-with-cuni                        "カレル大学アカウントで続行"
     :login/email-sent                                "メールを送信しました。メール内のリンクをクリックしてください。"
     :login/forgotten-password                        "パスワードをお忘れですか"
     :login/forgotten-password-email-resent           "パスワードリセットメールは既に送信されています。"
     :login/forgotten-password-description            "メールでパスワードリセットリンクを取得します（有効期間24時間）。"
     :login/forgotten-password-error                  [:<> "このメールアドレスはブロックされています。OrgPadからのメールの購読解除をクリックしてブロックを解除するか、このメールアドレスから "
                                                       company/support-email-app-link " にメールを送信してください。"]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "OrgPadは初めてですか？ " [:a.link-button {:href route} "登録"]])
     :login/options                                   "別のログイン方法を選択"
     :login/send-reset-link                           "リセットリンクを送信"
     :login/wrong-email-or-password                   "メールアドレスまたはパスワードが正しくありません。"

     :markdown/title                                  "貼り付けたテキストはMarkdownでフォーマットされていますか？"
     :markdown/info                                   "貼り付けたコンテンツにMarkdownフォーマットが検出されました。フォーマットを適用しますか？"
     :markdown/remember                               "リロードするまで記憶"
     :markdown/insert                                 "Markdownフォーマットを使用"
     :markdown/ignore                                 "元のままにする"

     :meta/title                                      "OrgPageの名前"
     :meta/orgpage-thumbnail                          "OrgPageの画像"
     :meta/automatic-screenshot-start                 "自動生成されたスクリーンショット: "
     :meta/automatic-screenshot-refresh               "変更後5分で更新されます。"
     :meta/custom-thumbnail                           "アップロードされたカスタム画像（サイズ1360x768）。"
     :meta/upload-thumbnail                           "カスタム画像をアップロード"
     :meta/thumbnail-upload-failed                    "画像のアップロードに失敗しました。"
     :meta/description                                "説明"
     :meta/new-tags                                   "タグ"
     :meta/tag-too-long                               (str "タグの最大長は " common-orgpage/max-tag-length " 文字です。")
     :meta/too-many-tags                              (str "最大 " common-orgpage/max-tags " 個のタグが許可されています。")
     :meta/info                                       (str "これらの詳細は、OrgPageリスト、OrgPageの埋め込み、ソーシャルネットワークでの共有時に表示されます。")
     :meta/info-in-share-orgpage                      "このOrgPageを共有する前に、タイトルを設定する必要があります。"
     :meta/info-move-to-new-orgpage                   (str "選択した{selection/num-units}個のセルと{selection/num-links}個のリンクを、"
                                                           "以下の情報で新しいOrgPageに移動します。現在のOrgPageでは、これらのセルとリンクは、"
                                                           "新しいOrgPageを内部に含む単一のセルに置き換えられます。")
     :meta/info-title                                 "情報 – {meta/title}"
     :meta/info-title-only                            "OrgPageに名前を付ける"
     :meta/details                                    "詳細"
     :meta/preview                                    "プレビュー"
     :meta/init-fragments                             "開始場所"
     :meta/init-fragments-info                        (str "OrgPageを開いたときの開始場所を選択できます。"
                                                           "モバイルデバイスには別の開始場所を指定できます。")
     :meta/desktop-init-fragment                      "デスクトップの場所"
     :meta/mobile-init-fragment                       "モバイルの場所"
     :meta/everything-closed                          "すべてのセルを閉じる"
     :meta/everything-closed-lowercase                "すべてのセルを閉じる"
     :meta/more-details                               "詳細情報"
     :meta/move-to-new-orgpage-title                  "{meta/title}に移動"
     :meta/move-to-new-orgpage                        "新しいOrgPageに移動"

     :microsoft-365-permission/title                  "Microsoft 365にこのドキュメントへのアクセスを許可しますか？"
     :microsoft-365-permission/info                   [:<> "OfficeドキュメントはMicrosoft 365を使用して表示できます。"
                                                       "同意をクリックすると、ドキュメントはMicrosoftと共有されます。"
                                                       [:a.link-button {:href   "https://www.microsoft.com/en/servicesagreement/"
                                                                        :target "_blank"}
                                                        "Microsoftサービス規約"] "を確認してください。"]
     :microsoft-365-permission/allow                  "Microsoft 365に権限を付与"

     :notifications/info                              "OrgPadから送信されるメールを選択してください。重要な変更については常にお知らせします。"
     :notifications/any-email                         "OrgPadからのすべてのメール"
     :notifications/email-verification                "登録時のメール認証、パスワードリセット用リンク、重要な支払い情報"
     :notifications/monthly-newsletter                "OrgPadの更新情報や最近の開発状況に関する月刊ニュースレター"
     :notifications/messages                          "他の人からのメッセージを受信"
     :notifications/blocked-people                    "特にブロックした人:"
     :notifications/receipts                          "サブスクリプションが自動更新された際の領収書"
     :notifications/receive-invitations               "他の人からの招待を受信"
     :notifications/unblock-user                      "この人のブロックを解除"

     :onboarding/openable-units                       "影付きの浮き上がったセルのみ開くことができます。"
     :onboarding/zoom                                 "スクロールしてズーム"
     :onboarding/drag-canvas                          "ドラッグして移動"
     :onboarding/open-units                           "影付きのセルにはコンテンツがあります"

     :orgpage/creating-preview                        "プレビューを作成中..."
     :orgpage/change-information                      "情報を変更"
     :orgpage/copy-orgpage                            "新しいOrgPageにコピー"
     :orgpage/delete-orgpage                          "OrgPageを削除"
     :orgpage/detail                                  "詳細"
     :orgpage/share-tooltip                           "このOrgPageを他の人と共有"
     :orgpage/share-orgpage                           "OrgPageを共有"
     :orgpage/show-information                        "情報を表示"
     :orgpage/zoom-in                                 "ズームイン"
     :orgpage/zoom-out                                "ズームアウト"
     :orgpage/create-unit-double-click                "ダブルクリックしてセルを作成"
     :orgpage/create-unit-hold-or-double-tap          "長押しまたはダブルタップしてセルを作成"
     :orgpage/switch-to-edit                          "編集モードに切り替え"
     :orgpage/untitled                                "無題のOrgPage"
     :orgpage/title                                   "OrgPageのタイトル"
     :orgpage/untitled-unit                           "無題のセル"
     :orgpage/untitled-path                           "無題のプレゼンテーション"
     :orgpage/path-num-steps                          "{orgpage/num-steps}ステップ"
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (ページ {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (ページ {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "コピーは "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title] " として利用可能です"])
     :orgpage/change-color                            "このOrgPageの色を変更"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "このOrgPageは " label " と自動的に共有され、"
                                                         (case permission
                                                           :permission/view "閲覧"
                                                           :permission/comment "コメント"
                                                           :permission/edit "編集"
                                                           nil)
                                                         "が可能です。" [:span.link-button {:on-click on-click} "ここをクリック"]
                                                         "して共有をキャンセルします。"])

     :orgpage-placement/activate                      "ここで表示"

     :orgpage-print/displayed                         "表示されている通り"
     :orgpage-print/displayed-info                    "長方形の内側にあるすべてのものが、表示されている通りに印刷されます。"
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPageは "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] " に正常に印刷されました。"])
     :orgpage-print/estimated-time                    "このPDFの印刷には約{orgpage-print/estimated-time}かかります。"
     :orgpage-print/everything-closed                 "すべてのセルを閉じる"
     :orgpage-print/everything-closed-info            "印刷されたPDFは、すべてのセルが閉じた状態で表示されます。"
     :orgpage-print/fragment                          "場所"
     :orgpage-print/fragment-info                     "印刷されたPDFは、選択された場所を表示します。"
     :orgpage-print/gray                              "灰色の背景"
     :orgpage-print/landscape                         "横向き"
     :orgpage-print/orientation                       "向き"
     :orgpage-print/path-info                         "{orgpage-print/num-pages}ページ。"
     :orgpage-print/portrait                          "縦向き"
     :orgpage-print/presentation                      "プレゼンテーションのステップ"
     :orgpage-print/presentation-info                 "各ステップは別のページに印刷されます。"
     :orgpage-print/print                             "PDFに印刷"
     :orgpage-print/size                              "サイズ"
     :orgpage-print/started                           (str "このOrgPageをPDFに印刷しています。約{orgpage-print/estimated-time}かかります。"
                                                           "完了すると、ファイルとして利用可能になります。")
     :orgpage-print/title                             "印刷名"
     :orgpage-print/type                              "印刷対象"
     :orgpage-print/watermark                         "透かしを含める"
     :orgpage-print/watermark-info                    "プロフェッショナル、学校、またはエンタープライズにアップグレードして削除します。"
     :orgpage-print/white                             "白い背景"

     :orgpage-stats/number-of-units                   "セル数"
     :orgpage-stats/number-of-links                   "リンク数"
     :orgpage-stats/number-of-files                   "ファイル数"
     :orgpage-stats/number-of-images                  "画像数"

     :org-role/student                                "学生"
     :org-role/teacher                                "教師"
     :org-role/employee                               "従業員"
     :org-role/admin                                  "管理者"

     :panel/toggle-side-panel                         "サイドメニュー"
     :panel/create-orgpage                            "新しいOrgPage"
     :panel/logo-tooltip                              "ホームに戻る"
     :panel/edit-info                                 "編集モードに切り替えて、セルやリンクの作成・削除、コンテンツの変更などを行います (F7)"
     :panel/comment-info                              (str "コメントモードに切り替えます。自分のセルやリンクを作成、編集、削除できますが、"
                                                           "他人のセルやリンクは編集・削除できません。ただし、自分のものでないセルにリンクすることはできます。(F7)")
     :panel/read-info                                 "閲覧モードに切り替えます。何も変更できませんが、コンテンツの閲覧が容易になります (F6)"
     :panel/undo-deletion                             "削除を取り消す"
     :panel/undo-deletion-info                        "{delete/num-units}個のセルと{delete/num-links}個のリンクの削除を取り消します (CTRL+Z)"
     :panel/refresh                                   "更新"
     :panel/switch-style                              "新しいセルとリンクのスタイルを切り替えます。ドラッグして新しいセルを作成します"
     :panel/profile                                   "プロフィール"
     :panel/settings                                  "設定"
     :panel/usergroups                                "チーム"
     :panel/stats                                     "統計"
     :panel/administration                            "管理"
     :panel/ios-install-info                          "アプリをインストール"
     :panel/upload-attachment                         "新しいセルに画像やファイルを挿入"
     :panel/selection-mode                            "選択を開始"
     :panel/search                                    "検索 (CTRL+F)"
     :panel/toggle-reveal-hidden                      "現在の場所で非表示になっている{panel/num-hidden-book-ids}個のセルを表示"

     :password/too-short                              "8文字以上で入力してください"
     :password/different-passwords                    "パスワードが一致しません"

     :password-reset/back-to-list                     "リストに戻る"
     :password-reset/change-password                  "パスワードを変更"
     :password-reset/set-password                     "パスワードを設定"
     :password-reset/has-password                     "アカウントにはパスワードが設定されています。"
     :password-reset/without-password                 "リンクされたアカウントでログインしたため、パスワードはまだ設定されていません。"
     :password-reset/invalid-link                     "無効なリンクです。24時間以上経過している可能性があります。メールの再送信を依頼してください。"
     :password-reset/description                      "新しいパスワードを設定してください。"
     :password-reset/enter-current-and-new-password   "現在のパスワードと新しいパスワードを入力してください。"
     :password-reset/enter-new-password               "新しいパスワードを入力してください。"

     :path/add-step                                   "ステップ"
     :path/add-step-tooltip                           "ENTERまたはTAB; SHIFTキーを押しながらでカメラをコピー"
     :path/hidden-ops                                 "、その他{path/num-hidden}件"
     :path/title                                      "プレゼンテーション名"
     :path/default-title                              "プレゼンテーション {path/num-paths}"
     :path/copy                                       "新しいプレゼンテーションにコピー"
     :path/copy-suffix                                "コピー"
     :path/add-audio                                  "ステップに音声をリンク"
     :path/remove-audio                               "ステップから音声のリンクを解除"

     :paths/create-new-path                           "プレゼンテーションを作成"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "プレゼンテーション " [:b title] " を削除しますか？"])
     :paths/help                                      "表示内容を変更するにはセルを選択してください。詳細はガイドをご覧ください。"

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "現在 " [:b tier " プラン"] "で、" [:b end-date] " まで有効です。"
                                                         (if autorenewal
                                                           "サブスクリプションは支払い期間の終わりに自動的に更新されます。"
                                                           "サブスクリプションは支払い期間の終わりに失効します。")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> [:b tier " プラン"] "は更新支払いが失敗したため、" [:b end-date] " に失効しました。"
                                                         "支払いを修正すると、サブスクリプションは自動的に延長されます。"])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> name " の " [:b tier " プラン"] " の " [:b role] " です。"])
     :payments/free-tier-info                         [:<> "OrgPadは " [:b "無料プラン"] "で、支払いはありません。"]
     :payments/no-teams                               "無料プランではチーム機能はありません。"
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "アップグレード"] "または"])
                                                         [:a.link-button {:href period-url} "請求期間の変更"]
                                                         "については、お問い合わせください。"])
     :payments/choose-plan                            "プランを選択"
     :payments/manage-plan                            "プランを管理"
     :payments/billing-address                        "請求先住所"
     :payments/billing-address-info                   (str "入力された請求先住所は、すべての新しい請求書に使用されます。"
                                                           "最近の請求書も自動的に更新されます。")
     :payments/receipt-label                          "領収書 {receipt/date-range}"
     :payments/customer-portal-failed                 "プラン管理ウェブサイトの読み込み中に問題が発生しました。"

     :pending-activation/email-already-used           "このメールアドレスは別のアカウントで既に使用されています。"
     :pending-activation/email-not-recieved           "メールが届きませんか？以下で再送信または変更してください。"
     :pending-activation/email-sent                   "有効化メールを送信しました。"
     :pending-activation/instructions                 "あと少しです！メールでお送りしたリンクをワンクリックしてアカウントを有効化してください。"
     :pending-activation/resend                       "有効化メールを再送信"

     :permission/admin                                "共有と削除が可能"
     :permission/admin-tooltip                        "ドキュメントへのアクセス権を持つ他のユーザーも変更できます。"
     :permission/edit                                 "編集可能"
     :permission/edit-tooltip                         "OrgPageに任意の変更を加えることができます。"
     :permission/comment                              "コメント可能"
     :permission/comment-tooltip                      (str "新しい所有セルを作成し、接続し、変更することができます。"
                                                           "OrgPageの残りの部分は変更できません。")
     :permission/view                                 "閲覧可能"
     :permission/view-tooltip                         "変更を加えることなくOrgPageを閲覧できます。"

     :presentation/presentation                       "プレゼンテーション"
     :presentation/step                               "ステップ"
     :presentation/present                            "プレゼンテーションを開始"
     :presentation/slideshow                          "ステップを自動再生"
     :presentation/step-duration                      "ステップの持続時間（秒）"
     :presentation/loop-slideshow                     "最後に繰り返す"
     :presentation/respect-audio-track                "オーディオトラックに応じたステップの持続時間"
     :presentation/stop-slideshow                     "ステップの自動再生を停止"
     :presentation/exit-tooltip                       "プレゼンテーションを終了"
     :presentation/play-audio                         "このステップの音声を再生"
     :presentation/pause-audio                        "音声の再生を一時停止"
     :presentation/share-presentation                 "このプレゼンテーションを他の人と共有"

     :pricing-popup/orgpages-exceeded-title           "無料プランではこれ以上OrgPageを作成できません"
     :pricing-popup/orgpages-exceeded                 "プランをアップグレードする必要があります。"
     :pricing-popup/storage-exceeded-title            "{upload/total-size}をアップロードするのに十分な空き容量がありません"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "ストレージには" [:b space-left "しか残っていません"] "。"
                                                         "プランをアップグレードしてストレージを拡張できます。"])
     :pricing-popup/num-shared-limit-reached-title    "このOrgPageをこれ以上多くの人と共有できません"
     :pricing-popup/num-shared-limit-reached-common   "このOrgPageを共有する最大人数に達しました。"
     :pricing-popup/num-shared-limit-reached          [:<> "さらに多くの人を追加するには、"
                                                       [:b "プロフェッショナルプラン"] "にアップグレードする必要があります。"]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> "このOrgPageの所有者 " owner " は、さらに多くの人を追加するために"
                                                         [:b "プロフェッショナルプラン"] "にアップグレードする必要があります。"])
     :pricing-popup/enable-teams-title                "プランをアップグレードしてチームを管理"
     :pricing-popup/enable-teams                      [:<> "チームは人々をグループ化し、コラボレーションとOrgPageの共有を簡素化します。"
                                                       "この機能は" [:b "スタンダードプラン"] "以上で有効になります。"]
     :pricing-popup/teams-limit-reached-title         "プランをアップグレードしてさらに多くのチームを作成"
     :pricing-popup/teams-limit-reached               "プランのチーム数上限に達しました。"
     :pricing-popup/team-members-limit-reached-title  "{usergroup/name}にこれ以上メンバーを追加できません"
     :pricing-popup/team-members-limit-reached-common "チームメンバーの最大数に達しました。"
     :pricing-popup/team-members-limit-reached        [:<> "さらにメンバーを追加するには、"
                                                       [:b "プロフェッショナルプラン"] "にアップグレードする必要があります。"]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> "このチームの所有者 " owner " は、さらにメンバーを追加するために"
                                                         [:b "プロフェッショナルプラン"] "にアップグレードする必要があります。"])
     :pricing-popup/try-out-share-title               "このOrgPageを共有するために登録"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "ストレージには" [:b space-left "しか残っていません"] "。"])
     :pricing-popup/free-account-info                 "登録すると、無料で以下を利用できます:"
     :pricing-popup/free-limit                        "最大3つのOrgPage、"
     :pricing-popup/free-storage                      "最大100MBのストレージ、"
     :pricing-popup/free-share                        "他の人との作業の共有。"
     :pricing-popup/free-account-info2                "数クリックでアカウントを作成できます。"

     :pricing-popup/register-to-comment               "コメントを追加するために登録"
     :pricing-popup/register-to-comment-info          (str "コメントセルにはあなたの名前とプロフィール写真が表示されます。"
                                                           "そのためには、まずアカウントを作成する必要があります。")

     :pricing-popup/print-watermark-title             "透かしなしにするにはプランをアップグレード"
     :pricing-popup/print-watermark-info              (str "OrgPad.infoの透かしなしでの印刷は、"
                                                           "プロフェッショナル、学校、エンタープライズプランでのみ可能です。")

     :profile/open-contact-dialog                     "メッセージを送信"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str first-name " " last-name "に連絡")
                                                          "この人に連絡"))
     :profile/contact-dialog-info                     (str "OrgPadでは他の人のメールアドレスを共有しないため、このメッセージを代理で送信します。"
                                                           "直接連絡が取れるように、あなたの名前とメールアドレスを含めます。")

     :promotion/unknown                               "不明なコード"
     :promotion/max-usages-reached                    "使用回数が上限に達しました"
     :promotion/expired                               "有効期限切れ"
     :promotion/one-year-free                         "1年間無料"
     :promotion/duration-free                         "{promotion/duration}日間無料"
     :promotion/for-one-year                          "1年間"
     :promotion/for-six-months                        "6ヶ月間"

     :props/h1                                        "大見出し"
     :props/h2                                        "中見出し"
     :props/h3                                        "小見出し"
     :props/weight-none                               "通常のリンク"
     :props/strong                                    "強いリンク"
     :props/arrowhead-none                            "矢印なし"
     :props/single                                    "矢印"
     :props/double                                    "二重矢印"

     :public-permission/none                          "プライベート"
     :public-permission/view                          "全員に閲覧用に共有"

     :registration/create-user                        "アカウントを作成"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "既にアカウントをお持ちですか？ " [:a.link-button {:href route} "ログイン"]])
     :registration/options                            "別の登録方法を選択"
     :registration/server-error                       "サーバーエラー。もう一度アカウントを作成してみてください。"
     :registration/missing-oauth-email                "{registration/service}からメールアドレスが提供されませんでした。以下に入力してください。"

     :search/previous-match                           "前の候補 (Page Up)"
     :search/next-match                               "次の候補 (Page Down)"
     :search/close                                    "閉じる (ESC)"
     :search/cells-with-selected-attachments          "選択されたファイルと画像を含むセル。"

     :selection/change-style-of-selected              (fn [{:selection/keys [type]}]
                                                        (str "選択した"
                                                             (case type
                                                               :style-select/all-props (str "{selection/num-units}個のセルと"
                                                                                            "{selection/num-links}個のリンク")
                                                               :style-select/unit-props "{selection/num-units}個のセル"
                                                               :style-select/link-props "{selection/num-links}個のリンク")
                                                             "のスタイルを変更; SHIFTキーを押しながらで現在値を設定、CTRLキーを押しながらで現在値にコピー"))

     :selection/link                                  "セルを接続"
     :selection/hide-contents                         "内容を非表示 (ESC)"
     :selection/show-contents                         "内容を表示"
     :selection/force-closing                         "場所を開くときにこれらの内容を非表示にする (ESC)"
     :selection/step-focus-camera                     "このステップのカメラを選択したセルに正確にフォーカスします（F2 または Q）。SHIFT で追加、ALT で削除します。"
     :selection/fragment-focus-camera                 "場所のカメラを選択したセルに正確にフォーカスします（F2 または Q）。SHIFT で追加、ALT で削除します。"
     :selection/step-show-books                       "このステップで選択したセルのみを表示します（F3 または W）。SHIFT で追加、ALT で削除します。"
     :selection/fragment-show-books                   "場所で選択したセルのみを表示します（F3 または W）。SHIFT で追加、ALT で削除します。"
     :selection/force-showing                         "以前に非表示にされた選択セルを表示"
     :selection/share-units                           "選択したユニットを表示するリンクをコピー; SHIFTキーを押しながらで代わりに場所の設定を開く"
     :selection/move-to-new-orgpage                   "新しいOrgPageに移動"
     :selection/change-code-lang                      "コード言語を変更"
     :selection/copy-units-links                      "セルとリンクをクリップボードにコピー"
     :selection/flip-links                            "リンクの方向を反転"
     :selection/delete                                "選択項目を削除"

     :settings/profile                                "プロフィール"
     :settings/payments                               "支払い"
     :settings/account                                "アカウント"
     :settings/linked-accounts                        "リンクされたアカウント"
     :settings/email                                  "通知"
     :settings/account-description                    "メールアドレス、パスワードの変更、またはアカウントの削除を行います。"
     :settings/stats-description                      "あなたのOrgPad利用に関する統計です。"
     :settings/change-email                           "メールアドレスを変更"
     :settings/change-email-text                      "新しいメールアドレスを入力してください。セキュリティ上の理由から、アカウントのロックを解除する前に確認が必要です。"
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "アカウントはメールアドレス " [:b email] " を使用して登録されています。"])
     :settings/account-linked-to-facebook             [:<> "アカウントはFacebookに" [:b "リンクされています"] "。"]
     :settings/account-not-linked-to-facebook         [:<> "アカウントはFacebookに" [:b "リンクされていません"] "。"]
     :settings/link-fb                                "Facebookをリンク"
     :settings/unlink-fb                              "Facebookのリンクを解除"
     :settings/account-linked-to-google               [:<> "アカウントはGoogleに" [:b "リンクされています"] "。"]
     :settings/account-not-linked-to-google           [:<> "アカウントはGoogleに" [:b "リンクされていません"] "。"]
     :settings/link-google                            "Googleをリンク"
     :settings/unlink-google                          "Googleのリンクを解除"
     :settings/account-linked-to-microsoft            [:<> "アカウントはMicrosoftに" [:b "リンクされています"] "。"]
     :settings/account-not-linked-to-microsoft        [:<> "アカウントはMicrosoftに" [:b "リンクされていません"] "。"]
     :settings/link-microsoft                         "Microsoftをリンク"
     :settings/unlink-microsoft                       "Microsoftのリンクを解除"
     :settings/account-linked-to-cuni                 [:<> "アカウントはカレル大学に" [:b "リンクされています"] "。"]
     :settings/account-not-linked-to-cuni             [:<> "アカウントはカレル大学に" [:b "リンクされていません"] "。"]
     :settings/link-cuni                              "カレル大学をリンク"
     :settings/unlink-cuni                            "カレル大学のリンクを解除"
     :settings/set-password-text                      "リンクを解除する前にパスワードを設定してください。"
     :settings/linked-accounts-info                   "Facebook、Google、Microsoft、またはカレル大学のアカウントをOrgPadにリンクして、ログインに使用できるようにします。"
     :settings/profile-info                           "入力された情報により、プロジェクトの共同作業者が見つけやすくなります。"
     :settings/delete-account                         "アカウントを削除"
     :settings/confirm-delete-account-question        [:<> "アカウントを" [:b "完全に"] "削除しますか？"]
     :settings/confirm-delete-account-info            "すべてのOrgPageとそのデータが削除されます。"
     :settings/delete-account-info                    [:<> "削除すると、すべてのOrgPageとそのデータが" [:b "完全に"] "削除されます。"]

     :share-orgpage/campaigns                         "キャンペーン"
     :share-orgpage/copied-to-clipboard               "クリップボードにコピーしました"
     :share-orgpage/copy-template-link                "テンプレートリンクをコピー"
     :share-orgpage/dialog-title                      "{orgpage/title}を共有"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "OrgPadアカウントを持っていない人には、リンク付きの招待状が届きます。"
                                                                  "リンクを開くと、このOrgPageを読むことができます。")
                                                         [:a.link-button create-team "チームを作成"]
                                                         "して、グループで簡単にOrgPageを共有できます。"])
     :share-orgpage/email-found                       "OrgPadアカウントが見つかりました。"
     :share-orgpage/email-unused                      "OrgPadアカウントが見つかりません。代わりにメールで招待状を送信します。"
     :share-orgpage/checking-email-address            "メールアドレスを確認中..."
     :share-orgpage/invite-for-editing                "編集に招待"
     :share-orgpage/invite-for-viewing                "閲覧に招待"
     :share-orgpage/invite-by-email                   "特定の言語を使用してメールで招待しますか？"
     :share-orgpage/show-profile                      "プロフィールを表示"
     :share-orgpage/links                             "リンク"
     :share-orgpage/to-read                           "閲覧用"
     :share-orgpage/to-comment                        "コメント用"
     :share-orgpage/to-edit                           "編集用"
     :share-orgpage/links-tooltip                     "共有可能なリンクでアクセスを許可"
     :share-orgpage/template                          "テンプレート"
     :share-orgpage/template-tooltip                  "このOrgPageのコピーを自動的に作成するリンク"
     :share-orgpage/template-info                     "このリンクを使用して、このOrgPageの独自のコピーを作成できます。"
     :share-orgpage/template-autoshare-none           "コピーを私と共有しない。"
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "コピーを私と"
                                                             (case template-autoshare
                                                               :permission/view "閲覧"
                                                               :permission/comment "コメント"
                                                               :permission/edit "編集") "用に共有する。"))
     :share-orgpage/embed                             "埋め込み"
     :share-orgpage/embed-into-microsoft-teams        "Microsoft Teamsに埋め込む"
     :share-orgpage/embed-into-website                "ウェブサイトやアプリケーションに埋め込む"
     :share-orgpage/embed-tooltip                     "ウェブサイトやアプリケーションに埋め込む"
     :share-orgpage/new-user-or-usergroup             "名前、メールアドレス、またはチーム"
     :share-orgpage/link-permission-start             "人々に"
     :share-orgpage/link-permission-end               "このOrgPageへのアクセスを許可します。"
     :share-orgpage/orgpage-info                      "情報"
     :share-orgpage/orgpage-info-tooltip              "所有者とOrgPageが公開されているかどうかの情報"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "このOrgPageはあなたと"
                                                             (case user-permission
                                                               :permission/view "閲覧"
                                                               :permission/comment "コメント"
                                                               :permission/edit "編集") "用に共有されています。"))
     :share-orgpage/remove-yourself                   "自分を削除"
     :share-orgpage/private-info                      "あなたと、直接またはリンクを介してOrgPageを共有した人だけがアクセスできます。新しく作成されたドキュメントはすべてプライベートです。"
     :share-orgpage/publish-for-reading-info          "OrgPageは公開されています。インターネット上の誰もが検索して読むことができます。あなたまたは編集用にOrgPageを共有した人だけが変更を加えることができます。"
     :share-orgpage/publish-permission-end            "このOrgPageは"
     :share-orgpage/publish                           "公開"
     :share-orgpage/publish-confirmation              "誰もがこのOrgPageを{orgpage/permission}できるようになります。よろしいですか？"
     :share-orgpage/publish-tooltip                   "全員にアクセスを許可"
     :share-orgpage/remove-user                       "権限を削除"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "誤ってリンクを共有した場合は、"
                                                         [:span.link-button reset-links "以前のすべてのリンクを無効にする"]
                                                         "ことができます。"])
     :share-orgpage/shareable-link                    "共有可能なリンク"
     :share-orgpage/everything-closed                 "すべてのセルを閉じて表示"
     :share-orgpage/presentation                      "プレゼンテーションから開始"
     :share-orgpage/fragment                          "場所を表示"
     :share-orgpage/template-link-switch              "テンプレートリンクを作成"
     :share-orgpage/user-not-registered               "はまだOrgPadに登録していません。"
     :share-orgpage/users                             "人々"
     :share-orgpage/users-tooltip                     "個々の人々にアクセスを許可"

     :side-panel/about                                "ホームページ"
     :side-panel/terms-and-conditions                 "利用規約"
     :side-panel/privacy-and-security                 "プライバシーとセキュリティ"
     :side-panel/files-and-images                     "ファイルと画像"
     :side-panel/paths                                "プレゼンテーション"
     :side-panel/fragments                            "場所"
     :side-panel/translate                            "翻訳"
     :side-panel/toggle-debug                         "デバッガー"
     :side-panel/help                                 "ヘルプ"
     :side-panel/blog                                 "ブログ"
     :side-panel/home                                 "ホーム"
     :side-panel/import                               "インポート"
     :side-panel/share                                "共有"
     :side-panel/num-files                            "{side-panel/num-files}ファイル"
     :side-panel/num-images                           "{side-panel/num-images}画像"
     :side-panel/num-paths                            "{side-panel/num-paths}プレゼンテーション"
     :side-panel/num-fragments                        "{side-panel/num-fragments}場所"

     :step/closed-books                               "閉じたセル"
     :step/everything-closed                          "すべて閉じています。"
     :step/hidden-books                               "非表示のセル"
     :step/nothing-changed                            "何も変更されていません。"
     :step/opened-pages                               "開いたページ"
     :step/focused-books                              "カメラに表示されているセル"
     :step/shown-books                                "表示されたセル"
     :step/switched-pages                             "切り替えたページ"

     :style-select/set-comment                        "プロフィール画像付きのコメントセルに変更 (CTRL+,)"
     :style-select/unset-comment                      "通常のセルに変更し、プロフィール画像を削除 (CTRL+,)"
     :style-select/set-comment-safari                 "プロフィール画像付きのコメントセルに変更 (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "通常のセルに変更し、プロフィール画像を削除 (SHIFT+CMD+,)"

     :tag/public                                      "公開"

     :text-field/email                                "メールアドレス"
     :text-field/first-name                           "名"
     :text-field/last-name                            "姓"
     :text-field/name                                 "名前"
     :text-field/new-password                         "新しいパスワード"
     :text-field/password                             "パスワード"
     :text-field/content                              "内容"
     :text-field/name-or-email                        "名前またはメールアドレス"
     :text-field/subject                              "件名"
     :text-field/message                              "メッセージ"
     :text-field/phone-number                         "電話番号"
     :text-field/width                                "幅"
     :text-field/height                               "高さ"

     :translate/title                                 "OrgPage {orgpage/title}を別の言語に翻訳"
     :translate/info                                  (str "このOrgPageのコピーを自動的に作成し、"
                                                           "ソース言語からターゲット言語に翻訳します。"
                                                           "1分以内にリストに表示されます。")
     :translate/source-lang                           "ソース言語"
     :translate/target-lang                           "ターゲット言語"
     :translate/translate                             "翻訳"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "翻訳は "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title] " として利用可能です"])

     :unit-editor/add-page                            "別のページを作成 (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "このページを削除"
     :unit-editor/previous-page                       (str "前のページ (PAGEUP);"
                                                           " SHIFTキーを押しながらでこのページを左に移動 (SHIFT+PAGEUP);"
                                                           " CTRLキーを押しながらでこのページの前に別のページを追加 (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "次のページ (PAGEDOWN);"
                                                           " SHIFTキーを押しながらでこのページを右に移動 (SHIFT+PAGEDOWN);"
                                                           " CTRLキーを押しながらでこのページの後に別のページを追加 (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "このページに切り替え"
                                                             (when can-edit "; SHIFTキーを押しながらで現在のページをそこに移動")))
     :unit-editor/hidden-info                         "クリックして書き込み"
     :unit-editor/undo                                "元に戻す (CTRL+Z)"
     :unit-editor/redo                                "やり直し (CTRL+SHIFT+Z または CTRL+Y)"
     :unit-editor/toggle-bold                         "太字 (CTRL+B)"
     :unit-editor/toggle-italic                       "斜体 (CTRL+I)"
     :unit-editor/toggle-strikethrough                "取り消し線"
     :unit-editor/toggle-subscript                    "下付き文字 (CTRL+S)"
     :unit-editor/toggle-superscript                  "上付き文字 (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "ハイパーリンクを作成 (CTRL+K)"
     :unit-editor/remove-hyperlink                    "ハイパーリンクを削除"
     :unit-editor/set-highlighting                    "ハイライトカラー"
     :unit-editor/selection->code                     "コードに変換 (CTRL+D)"
     :unit-editor/toggle-list-ul                      "箇条書きリスト (TAB)"
     :unit-editor/toggle-list-ol                      "番号付きリスト (CTRL+O)"
     :unit-editor/indent                              "インデントを増やす (TAB)"
     :unit-editor/outdent                             "インデントを減らす (SHIFT+TAB)"
     :unit-editor/center                              "中央揃え (CTRL+L)"
     :unit-editor/heading                             "見出し (CTRL+G)"
     :unit-editor/embed-pdf                           "PDFコンテンツを表示"
     :unit-editor/link-pdf                            "PDFコンテンツをハイパーリンクに置き換え"
     :unit-editor/embed-office                        "Microsoft 365を使用してドキュメントコンテンツを表示"
     :unit-editor/link-office                         "ドキュメントコンテンツをハイパーリンクに置き換え"
     :unit-editor/embed-video                         "ビデオプレーヤーを表示"
     :unit-editor/link-video                          "ビデオをハイパーリンクに置き換え"
     :unit-editor/embed-audio                         "オーディオプレーヤーを表示"
     :unit-editor/link-audio                          "オーディオをハイパーリンクに置き換え"
     :unit-editor/hyperlink->embed                    "リンクされたウェブサイトを挿入"
     :unit-editor/embed->hyperlink                    "埋め込まれたウェブサイトをハイパーリンクに置き換え"
     :unit-editor/open-image-in-attachments           "この画像を添付ファイルリストで開く"
     :unit-editor/open-file-in-attachments            "このファイルを添付ファイルリストで開く"
     :unit-editor/toggle-controls                     "ビデオプレーヤーのコントロールを表示"
     :unit-editor/toggle-autoplay                     "自動再生"
     :unit-editor/toggle-muted                        "ミュートで再生（そうしないと自動再生がブロックされる場合があります）"
     :unit-editor/toggle-loop                         "ループ再生"
     :unit-editor/toggle-chained-size                 "アスペクト比を維持"
     :unit-editor/insert-menu                         "挿入"
     :unit-editor/insert-image                        "画像"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "デバイスから画像をアップロードします。"
     :unit-editor/insert-image-info2                  "ヒント: 画像を任意のセルまたは灰色のキャンバスに直接ドラッグまたは貼り付けます。"
     :unit-editor/insert-camera                       "カメラ"
     :unit-editor/insert-attachment                   "ファイル"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "ビデオ"
     :unit-editor/insert-video-info                   "コンピュータからビデオをアップロードするか、YouTubeから挿入します。"
     :unit-editor/insert-video-info2                  "ヒント: ビデオやYouTubeのサムネイルを任意のセルまたは灰色のキャンバスに直接ドラッグします。"
     :unit-editor/video-url                           "YouTubeリンク"
     :unit-editor/youtube-start                       "開始"
     :unit-editor/youtube-end                         "終了"
     :unit-editor/insert-table                        "表"
     :unit-editor/insert-table-info                   "挿入する表のサイズを選択します。"
     :unit-editor/toggle-table-border                 "表の罫線を表示"
     :unit-editor/add-row-before                      "上に行を挿入"
     :unit-editor/add-row-after                       "下に行を挿入"
     :unit-editor/remove-current-row                  "行を削除"
     :unit-editor/add-column-before                   "前に列を挿入"
     :unit-editor/add-column-after                    "後に列を挿入"
     :unit-editor/remove-current-column               "列を削除"
     :unit-editor/remove-table                        "表を削除"
     :unit-editor/insert-website                      "ウェブサイト"
     :unit-editor/insert-website-info                 (str "ウェブサイトをセルに直接埋め込むことができます。"
                                                           "動作しない場合は、ウェブサイトの所有者によってブロックされている可能性があります。")
     :unit-editor/website-url-or-code                 "ウェブサイトアドレスまたはコード"
     :unit-editor/website-id                          "ウェブサイトID"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> ""
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "ウェブサイト間のメッセージ送信"] "に使用されます。"])
     :unit-editor/invalid-website-url                 "無効なウェブサイトアドレスまたはコード"
     :unit-editor/invalid-video-url                   "無効なビデオアドレス"
     :unit-editor/update-website                      "ウェブサイトアドレスを変更"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "コード"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "コードをコピー"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "別の段落としてコード"
     :unit-editor/toggle-block-math                   "別の行に数式"
     :unit-editor/remove-code                         "コードフォーマットを削除"
     :unit-editor/insert-math                         "数学 / 化学"

     :unit-panel/link                                 (str "クリックまたはドラッグして接続;"
                                                           " SHIFTキーを押しながらで複数の接続を作成;"
                                                           " CTRLキーを押しながらでセルのチェーンを作成")
     :unit-panel/upload-attachment                    "このセルに画像またはファイルを挿入"
     :unit-panel/change-link-style                    (str "このセルのスタイルを変更;"
                                                           " SHIFTキーを押しながらで現在値を設定,"
                                                           " CTRLキーを押しながらでデフォルトにコピー;"
                                                           " ドラッグしてこのスタイルで接続")
     :unit-panel/hide-content                         "内容を非表示"
     :unit-panel/delete-unit                          "セルを削除"

     :usergroup/create                                "チームを作成"
     :usergroup/edit-title                            "{usergroup/name}を編集"
     :usergroup/info                                  "友人や同僚のチームを作成および管理して、OrgPageの共有を簡素化します。"
     :usergroup/delete                                "チームを削除"
     :usergroup/members                               "メンバー"
     :usergroup/edit                                  "チーム名とロゴを変更"
     :usergroup/show-actions                          "アクションを表示"
     :usergroup/name                                  "名前"
     :usergroup/hide-orgpages                         "共有されたOrgPageを非表示"
     :usergroup/hide-orgpages-tooltip                 "フィルターでチームをオンにすると表示できます"
     :usergroup/hide-in-filter                        "フィルターで非表示"
     :usergroup/create-info                           "チーム名とプロフィール写真はチームメンバーにのみ表示されます。"
     :usergroup/confirm-delete                        [:<> "このチームを" [:b "完全に"] "削除しますか？"]
     :usergroup/members-title                         "{usergroup/name}のメンバー"
     :usergroup/remove-member                         "チームから削除"
     :usergroup/remove-admin                          "管理者から削除"
     :usergroup/make-admin                            "管理者に設定"
     :usergroup/admin-tooltip                         "管理者はメンバーを管理し、チームを削除できます。"
     :usergroup/copy-usergroup                        "チームをコピー"

     :usergroup-role/owner                            "所有者"
     :usergroup-role/admin                            "管理者"
     :usergroup-role/member                           "メンバー"

     :wire-transfer/title                             "年間{wire-transfer/tier}プランの銀行振込"
     :wire-transfer/info                              "当社の口座で入金が確認され次第、年間サブスクリプションを有効にします。"
     :wire-transfer/used-currency                     "{wire-transfer/currency}での支払い"
     :wire-transfer/recipient-name                    "受取人名"
     :wire-transfer/account-number                    "口座番号"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "金額"
     :wire-transfer/payment-purpose                   "支払目的"
     :wire-transfer/qr-code-common                    (str "この支払いQRコードを銀行アプリでスキャンすると、"
                                                           "正しい情報が自動的に入力されます。")
     :wire-transfer/cz-sk-qr-code-description         (str "これはチェコとスロバキアで銀行振込に一般的に使用されるQRコードです。")
     :wire-transfer/eu-qr-code-description            (str "これは欧州連合でSEPA送金に一般的に使用されるQRコードです。")
     :wire-transfer/trial-info                        (str "OrgPadをすぐに完全に利用するために、1回限りの7日間サブスクリプションを開始できます。"
                                                           "銀行が支払いの成功を確認すると、"
                                                           "サブスクリプション期間は1年間延長されます。")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> "ご質問や問題がある場合は、"
                                                         [:a.link-button {:href url} "このフォームにご記入ください"] "。"])
     :wire-transfer/success-text                      [:<> "新しいプランでOrgPadをすぐに利用できるように、" [:b "1回限りの7日間サブスクリプション"]
                                                       "を有効にしました。"]
     :wire-transfer/common-result-text                (str "銀行が支払いの成功を確認すると、"
                                                           "サブスクリプション期間は1年間延長されます。")
     :wire-transfer/start-trial                       "銀行振込を送信しました"
     :wire-transfer/start-trial-result-title          "お支払いありがとうございます"
     :wire-transfer/copy                              "クリップボードにコピー"

     :website-editor/settings                         "設定"
     :website-editor/routes                           "ルート"
     :website-editor/menus                            "メニュー"
     :website-editor/create-menu                      "メニューを作成"
     :website-editor/edited-menu                      "編集中のメニュー"
     :website-editor/untitled-menu                    "無題のメニュー"
     :website-editor/num-subitems                     "{menu-item/num-children}子"
     :website-editor/delete-menu-item                 "このメニュー項目を削除"
     :website-editor/add-menu-item                    "メニュー項目を追加"
     :website-editor/menu-item-label                  "項目ラベル"
     :menu-item/path-type                             "ルートを開く"
     :menu-item/url-type                              "外部リンクを開く"
     :menu-item/children-type                         "サブメニューを開く"
     :website-editor/menu-item-path                   "ルート"

     :youtube-placement/watch-on-prefix               (str "視聴する" unicode/nbsp)
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/jp dict)