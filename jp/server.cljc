(ns orgpad.server.i18n.jp
  (:require [orgpad.common.i18n.dict.jp :as jp]
            [orgpad.common.company :as company]))

(def dict
  (merge
    jp/dict
    {:orgpage/untitled                    "ドキュメント"
     :orgpage/copy                        "コピー"

     :permission/view                     "閲覧"
     :permission/edit                     "編集"

     :subscription/monthly                "月"
     :subscription/yearly                 "年"

     :email/greeting                      "{{customer}}様、"
     :email/signature                     "敬具"
     :email/team                          "Pavel Klavík and Kamila Klavíková"
     :email/creators                      "OrgPad作成者"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] "。このメールが不要な場合は、"
                                                  [:a href-unsubscribe "登録解除"] "してください。"))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "問題が発生した場合は、"
                                                  [:a {:href (str "{{domain}}" url)} "アプリ内フォーム"]
                                                  "を使用するか、" company/support-email-link "にメールを送信してお知らせください。"))
     :email/or                            "または"
     :email/customer                      "お客様"

     :verification/subject                "OrgPadアカウントの確認"
     :verification/preheader              "OrgPadへようこそ。下のボタンをクリックしてアカウントを確認してください。"
     :verification/heading                "メールアドレスの確認"
     :verification/body                   "アカウントを確認するには、下のボタンをクリックしてください。ボタンをクリックすると、OrgPadの"
     :verification/terms-and-conditions   "利用規約"
     :verification/button                 "メールアドレスを確認する"
     :verification/accidental-email       "このメールを誤って受信した場合は、削除してください。これらのメールが繰り返し届く場合は、"

     :password-reset/subject              "OrgPadパスワードのリセット"
     :password-reset/preheader            "下のボタンをクリックしてOrgPadのパスワードをリセットしてください。"
     :password-reset/heading              "OrgPadパスワードのリセット"
     :password-reset/body                 "パスワードをリセットするには、下のボタンをクリックしてください。24時間有効です。"
     :password-reset/button               "パスワードをリセットする"
     :password-reset/accidental-email     "パスワードのリセットを要求していない場合、または変更する必要がなくなった場合は、何もする必要はありません。"

     :new-subscription/subject            "新規サブスクリプションの確認"
     :new-subscription/preheader          "OrgPadの{{tier}}プランが有効になりました。サブスクリプションは{{period}}ごとに自動的に更新されます。"
     :new-subscription/body               "OrgPadの{{tier}}プランが有効になりました。お支払いありがとうございます！"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "今後、サブスクリプションは{{period}}ごとに自動更新されます。領収書はOrgPad設定の"
                                                  [:a {:href (str "{{domain}}" url)} "お支払いセクション"]
                                                  "に自動的に保存されます。"))

     :new-payment/subject                 "お支払いが完了しました"
     :new-payment/preheader               "{{tier}}プランのサブスクリプションを更新しました。有効期限は{{subscription-end}}です。"
     :new-payment/body                    (list "{{tier}}プランのサブスクリプションを更新しました。有効期限は"
                                                [:b "{{subscription-end}}"] "です。お支払いありがとうございます！")
     :new-payment/button                  "請求書をダウンロードする"

     :payment-failed/subject              "サブスクリプションのお支払いが完了しませんでした"
     :payment-failed/preheader            "カードが有効で、十分な残高があることを確認してください。問題が解決しない場合は、お問い合わせください。"
     :payment-failed/body                 (str "OrgPadサブスクリプションの支払いでエラーが発生しました。"
                                               "カードが有効で、十分な残高があることを確認してください。")
     :payment-failed/button               "支払い方法を更新する"
     :payment-failed/grace-warning        (list "現在のサブスクリプションは"
                                                [:b "{{subscription-end}}"]
                                                "まで有効です。この日までにサブスクリプション料金をお支払いいただけない場合、アカウントは"
                                                "無料プランにダウングレードされます。データへのアクセス、編集、削除、共有は引き続き可能です。")

     :feedback/subject                    "質問: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}}さんから質問「{{title}}」が届きました"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) さんから質問「{{title}}」が届きました"

     :invitation/subject                  "OrgPadでドキュメントを{{action}}するよう招待されました"
     :invitation/preheader                "{{user}}さんから{{title}}を{{action}}するよう招待されました。下のボタンをクリックして開いてください。"
     :invitation/heading                  "{{user}}さんから{{title}}を{{action}}するよう招待されました"
     :invitation/body                     "OrgPadは、全体像を把握するためのビジュアルドキュメントを作成するためのプラットフォームです。次のボタンをクリックすると、招待を承諾してドキュメントを開きます。"
     :invitation/button                   "ドキュメントを開く"
     :invitation/accidental-email         "このメールを誤って受信した場合は、削除してください。これらのメールが繰り返し届く場合は、"
     :invitation/block-user               "{{user}}からの招待をブロックする"
     :invitation/block-all                "すべての招待をブロックする"

     :contact-user/subject                "OrgPad経由で連絡がありました"
     :contact-user/preheader              "{{user}}からのメッセージ"
     :contact-user/heading                "{{user}} ({{reply-to}}) さんがOrgPad経由であなたに連絡しています"
     :contact-user/body                   (str "このメールは、お客様のメールアドレスを他の誰とも共有しないため、当社から送信されています。メッセージには、"
                                               "このメッセージに返信するか、{{reply-to}}にメールを送信することで返信できます。")
     :contact-user/unsolicited-info       "メッセージが迷惑な場合は、"
     :contact-user/block-user             "{{user}}からのすべてのメッセージをブロックする"
     :contact-user/block-all              "OrgPadのすべての人からのすべてのメッセージをブロックする"

     :blog/rss-description                "OrgPadの最新ニュース、アップデート、技術的な議論。"

     :newsletter-2024-summer/subject      "OrgPadからの夏のアップデート"
     :newsletter-2024-summer/preheader    "最新のアップデート、新しいブログ、改善されたプライバシー対策などをご紹介します！"
     :newsletter-2024-summer/introduction "1年間の休止期間を経て、ニュースレターが再開しました！"
     :newsletter-2024-summer/heading      "このニュースレターの内容:"
     :newsletter-2024-summer/body         (list [:li "年初からのアプリの新機能は？"]
                                                [:li "新しいブログには何がありますか？"]
                                                [:li "お客様のプライバシーとデータのセキュリティをどのように保護していますか？"]
                                                [:li "お客様の便宜のために利用規約をどのように更新しましたか？"]
                                                [:li "なぜコミュニティに参加するのですか？"])
     :newsletter-2024-summer/button       "ニュースレターを読む"
     :newsletter-2024-summer/closing      "皆様のアイデアをお待ちしております！"}))
