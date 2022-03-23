(ns orgpad.server.i18n.en
  (:require [orgpad.common.i18n.dict.en :as en]))

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  (merge
    en/dict
    {:orgpage/untitled                     "a document"
     :permission/view                      "to read"
     :permission/edit                      "to edit"

     :subscription/monthly                 "month"
     :subscription/yearly                  "year"

     :tier/standard                        "Standard"
     :tier/professional                    "Professional"
     :tier/school                          "School"
     :tier/enterprise                      "Enterprise"
     :tier/unlimited                       "Unlimited"

     :email/customer                       "customer"
     :email/greeting                       "Dear {{customer}},"
     :email/signature                      "Best wishes"
     :email/ceo                            "Vít Kalisz, CEO"
     :email/contact-us                     (fn [{:feedback/keys [url]}]
                                             (list "If you encounter any problems, please let us know by using an "
                                                   [:a {:href (str "{{domain}}" url)} "in-app form"]
                                                   " or sending email to " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                             " or "

     :invitation/subject                   "You are invited {{action}} a document in OrgPad"
     :invitation/preheader                 "{{user}} have invited you {{action}} {{title}}. Please click the button below to open it."
     :invitation/heading                   "{{user}} have invited you {{action}} {{title}}"
     :invitation/info                      "OrgPad is a platform for building visual documents for the Big Picture. By clicking on the following button, you accept the invitation and open the document."
     :invitation/button                    "Open Document"
     :invitation/accidental-email          "If you have received this email by mistake, please delete it. If you get these emails repeatedly, you can "
     :invitation/block-user                "block invitations from {{user}}"
     :invitation/block-all                 "block all invitations"

     :footer/unsubscribe                   (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                             (list [:a href-orgpad "https://orgpad.com"] ". Do you not like these emails? "
                                                   [:a href-unsubscribe "Unsubscribe"] "."))

     :orgpage/copy                         "copy"

     :password-reset/subject               "Reset your OrgPad password"
     :password-reset/preheader             "Reset your OrgPad password by clicking on the button below."
     :password-reset/heading               "Reset your OrgPad password"
     :password-reset/text-1                "Please click the button below to reset your password. It is valid for 24 hours."
     :password-reset/button                "Reset password"
     :password-reset/text-2                "If you did not asked to reset your password or you no longer need to change, you do not need to do anything."

     :verification/subject                 "Verify your OrgPad account"
     :verification/preheader               "Welcome to OrgPad. Please verify your account by clicking on the button below."
     :verification/heading                 "Verify Your Email"
     :verification/verify-account-info     "To verify your account, please click the button below. By clicking the button, you are further agreeing to Orgpad's "
     :verification/terms-and-conditions    "Terms and Conditions"
     :verification/button                  "Confirm Email Address"
     :verification/received-by-mistake     "If you have received this email by mistake, please delete it. If you get these emails repeatedly, please contact us on "
     :verification/support-email           "support@orgpad.com"

     :feedback/subject                     "Question: {{title}}"
     :feedback/preheader                   "{{first-name}} {{last-name}} has sent question {{title}}"
     :feedback/heading                     "{{first-name}} {{last-name}} ({{email}}) has sent question {{title}}"

     :newsletter/subject                   "OrgPad Newsletter {newsletter/date}"
     :newsletter/preheader                 "OrgPad Newsletter for {newsletter/date}. Click the link below."
     :newsletter/button                    "Open newsletter"
     :newsletter/text                      "This newsletter is delivered to you since you subscribed for it. If you have received this email by mistake or do not want to receive them anymore, "
     :newsletter/unsubscribe               "unsubscribe using this link"

     :contact-user/subject                 "You have been contacted via OrgPad"
     :contact-user/preheader               "Message from {{user}}"
     :contact-user/heading                 "{{user}} ({{reply-to}}) is contacting you via OrgPad"
     :contact-user/common-info             (str "This email is from us because we do not share your email address with anyone else. You can respond to the message "
                                                "by replying to this message or by emailing {{reply-to}}.")
     :contact-user/post-message-info       "If the message is unsolicited, you can "
     :contact-user/block-user              "block all messages from {{user}}"
     :contact-user/block-all               "block all messages from all people in OrgPad."

     :new-payment/subject                  "Payment succeeded"
     :new-payment/preheader                "You renewed your subscription to the {{tier}} plan, valid until {{subscription-end}}."
     :new-payment/common-info              (list "You have successfully renewed your subscription to the {{tier}} plan. It is valid until "
                                                 [:b "{{subscription-end}}"] ". Thank you for your payment!")
     :new-payment/download-receipt         "Download receipt"

     :new-subscription/subject             "New subscription confirmation"
     :new-subscription/preheader           "Your {{tier}} plan with OrgPad is now active. The subscription will be renewed automatically every {{period}}."
     :new-subscription/active-tier         "Your {{tier}} plan with OrgPad is now active. Thank you for your payment!"
     :new-subscription/payment-info        (fn [{:payment/keys [url]}]
                                             (list "Going forward, the subscription will be renewed automatically every {{period}}. Your receipts are automatically stored in the "
                                                   [:a {:href (str "{{domain}}" url)} "payments section"] " in OrgPad settings."))

     :payment-failed/subject               "Subscription payment failed"
     :payment-failed/preheader             "Please check that your card is valid and has sufficient funds. If problems remain, contact us."
     :payment-failed/error                 (str "There has been an error with the payment of your OrgPad subscription."
                                                " Please check that your card is valid and has sufficient funds.")
     :payment-failed/payment               "Update payment method"
     :payment-failed/current-subscription  (list "Your current subscription is active until "
                                                 [:b "{{subscription-end}}"]
                                                 ". If you do not pay the subscription fee by this date, your account will be"
                                                 " downgraded to the free plan. You will still be able to access, edit, delete and share your data.")

     :admin-trial-start/subject            "New {{tier}} trial started ({{monetary-value}})"
     :admin-free-license-activated/subject "Free {{tier}} license activated ({{monetary-value}})"
     :admin-gift-coupon-activated/subject  "Gift coupon for {{tier}} license activated ({{monetary-value}})"
     :admin-subscription-start/subject     "New {{period}} {{tier}} subscription started ({{monetary-value}})"
     :admin-subscription-failed/subject    "Renewal of {{period}} {{tier}} subscription failed ({{monetary-value}})"
     :admin-subscription-end/subject       "Renewal of {{period}} {{tier}} subscription canceled ({{monetary-value}})"
     :admin-subscription-renewed/subject   "Existing {{period}} {{tier}} subscription was renewed ({{monetary-value}})"

     :reminder/subject                     "OrgPad discount, news and examples"
     :reminder/preheader                   "What improved in OrgPad in December 2021 and examples how it can be used."
     :reminder/thank-you                   "First of all, I'd like to thank you for creating an OrgPad account."
     :reminder/phunt-launch                (str "December is a special month full of surprises. "
                                                "The biggest surprise of last month came on Christmas Eve. "
                                                "Santa wasn't responsible though, Product Hunt was. "
                                                "At least I think so. OrgPad was one of the top five products "
                                                "on Product Hunt that day. Thanks to that we have been busy over "
                                                "Christmas answering people's emails and "
                                                "questions on social media and sharing OrgPad further.")
     :reminder/button-info                 (str "To make your start in OrgPad easier, I have prepared some examples of how to use OrgPad. "
                                                "Click the button below to explore them. I have also added some news about OrgPad.")
     :reminder/button                      "OrgPad news and examples"
     :reminder/phunt-promo-code            (list "I'd also like to remind you of the "
                                                 [:b "PHUNT21 promo code for 50% discount."]
                                                 " You can help us by spreading the word about OrgPad on social media. "
                                                 "A single tweet, post or mention would be great.")}))