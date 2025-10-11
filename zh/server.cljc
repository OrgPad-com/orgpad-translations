(ns orgpad.server.i18n.zh
  (:require [orgpad.common.i18n.dict.zh :as zh]
            [orgpad.common.company :as company]))

(def dict
  (merge
    zh/dict
    {:orgpage/untitled                    "一份文件"
     :orgpage/copy                        "复制"

     :permission/view                     "用于阅读"
     :permission/edit                     "用于编辑"

     :subscription/monthly                "月"
     :subscription/yearly                 "年"

     :email/greeting                      "尊敬的{{customer}}，"
     :email/signature                     "诚挚的问候"
     :email/team                          "Pavel Klavík 和 Kamila Klavíková"
     :email/creators                      "OrgPad创作者"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"]
                                                  "。如果您不想再收到这些邮件，请点击 "
                                                  [:a href-unsubscribe "取消订阅"] "。"))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "如果您遇到任何问题，请通过"
                                                  [:a {:href (str "{{domain}}" url)} "应用内表单"]
                                                  "或发送电子邮件至 " company/support-email-link " 与我们联系。"))
     :email/or                            "或"
     :email/customer                      "客户"

     :verification/subject                "验证您的OrgPad账户"
     :verification/preheader              "欢迎来到OrgPad。请点击下面的按钮验证您的账户。"
     :verification/heading                "验证您的电子邮件"
     :verification/body                   "要验证您的账户，请单击下面的按钮。点击按钮即表示您同意OrgPad的条款和条件。"
     :verification/terms-and-conditions   "条款和条件"
     :verification/button                 "确认电子邮件地址"
     :verification/accidental-email       "如果您错误地收到了这封电子邮件，请删除它。如果您重复收到这些电子邮件，请联系我们。"

     :password-reset/subject              "重置您的OrgPad密码"
     :password-reset/preheader            "点击下面的按钮重置您的OrgPad密码。"
     :password-reset/heading              "重置您的OrgPad密码"
     :password-reset/body                 "请点击下面的按钮重置您的密码。该链接有效期为24小时。"
     :password-reset/button               "重置密码"
     :password-reset/accidental-email     "如果您未请求重置密码或不需要更改，请忽略此邮件。"

     :new-subscription/subject            "新订阅确认"
     :new-subscription/preheader          "您在OrgPad的{{tier}}计划现已生效。订阅将每{{period}}自动续订。"
     :new-subscription/body               "您在OrgPad的{{tier}}计划现已生效。感谢您的付款！"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "今后，订阅将每{{period}}自动续订。您的收据会自动存储在 OrgPad 设置中的"
                                                  [:a {:href (str "{{domain}}" url)} "付款部分"] "。"))

     :new-payment/subject                 "付款成功"
     :new-payment/preheader               "您已续订{{tier}}计划，有效期至{{subscription-end}}。"
     :new-payment/body                    (list "您已成功续订{{tier}}计划，有效期至"
                                                [:b "{{subscription-end}}"] "，感谢您的付款！")
     :new-payment/button                  "下载发票"

     :payment-failed/subject              "订阅付款失败"
     :payment-failed/preheader            "请检查您的卡是否有效且资金充足。如果问题仍然存在，请联系我们。"
     :payment-failed/body                 "您的 OrgPad 订阅付款出现错误。请检查您的卡是否有效且资金充足。"
     :payment-failed/button               "更新付款方式"
     :payment-failed/grace-warning        (list "您当前的订阅有效期至"
                                                [:b "{{subscription-end}}"]
                                                "。如果您在此日期前未支付订阅费，您的帐户将降级为免费计划，您仍然可以访问、编辑、删除和共享您的数据。")

     :feedback/subject                    "问题：{{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} 发送了问题 {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) 发送了问题 {{title}}"

     :invitation/subject                  "您被邀请在OrgPad中{{action}}该文档"
     :invitation/preheader                "{{user}} 邀请您 {{action}} {{title}}。请点击下面的按钮打开。"
     :invitation/heading                  "{{user}} 邀请您 {{action}} {{title}}"
     :invitation/body                     "OrgPad是一个用于构建可视化文档以了解全局的平台。点击下面的按钮，即表示您接受邀请并打开文档。"
     :invitation/button                   "打开文档"
     :invitation/accidental-email         "如果您错误地收到了这封电子邮件，请删除它。如果您重复收到这些电子邮件，您可以"
     :invitation/block-user               "阻止来自 {{user}} 的邀请"
     :invitation/block-all                "阻止所有邀请"

     :contact-user/subject                "有人通过OrgPad与您联系"
     :contact-user/preheader              "来自{{user}}的消息"
     :contact-user/heading                "{{user}} ({{reply-to}}) 通过 OrgPad 与您联系"
     :contact-user/body                   (str "这封电子邮件来自我们，因为我们不会与任何人分享您的电子邮件地址。"
                                               "您可以通过回复此消息或发送电子邮件至 {{reply-to}} 来回复该消息。")
     :contact-user/unsolicited-info       "如果该消息是未经请求的，您可以"
     :contact-user/block-user             "阻止来自{{user}}的所有消息"
     :contact-user/block-all              "阻止 OrgPad 中所有人的消息。"

     :blog/rss-description                "OrgPad 的最新消息、更新和技术讨论。"

     :newsletter-2024-summer/subject      "来自OrgPad的夏季更新"
     :newsletter-2024-summer/preheader    "了解我们最新的应用更新、新博客、改进的隐私措施等更多内容！"
     :newsletter-2024-summer/introduction "经过一年的中断，我们再次推出新的新闻通讯！"
     :newsletter-2024-summer/heading      "您将在此新闻通讯中找到："
     :newsletter-2024-summer/body         (list [:li "自年初以来应用中有什么新功能？"]
                                                [:li "您会在我们的新博客上找到什么？"]
                                                [:li "我们如何保护您的隐私和数据安全？"]
                                                [:li "我们如何为您的便利更新条款和条件？"]
                                                [:li "为什么要加入社区？"])
     :newsletter-2024-summer/button       "阅读新闻通讯"
     :newsletter-2024-summer/closing      "我们期待您的想法！"}))
