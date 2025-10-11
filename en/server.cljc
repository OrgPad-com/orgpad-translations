(ns orgpad.server.i18n.en
  (:require [orgpad.common.i18n.dict.en :as en]
            [orgpad.common.i18n.dict.en-admin :as common-en-admin]
            [orgpad.server.i18n.en-admin :as en-admin]
            [orgpad.common.company :as company]))

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  (merge
    en/dict
    common-en-admin/dict
    en-admin/dict
    {:orgpage/untitled                    "a document"
     :orgpage/copy                        "copy"

     :permission/view                     "to read"
     :permission/edit                     "to edit"

     :subscription/monthly                "month"
     :subscription/yearly                 "year"

     :email/greeting                      "Dear {{customer}},"
     :email/signature                     "Best wishes"
     :email/team                          "Pavel Klavík and Kamila Klavíková"
     :email/creators                      "OrgPad creators"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". Do you not like these emails? "
                                                  [:a href-unsubscribe "Unsubscribe"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "If you encounter any problems, please let us know by using an "
                                                  [:a {:href (str "{{domain}}" url)} "in-app form"]
                                                  " or sending email to " company/support-email-link "."))
     :email/or                            " or "
     :email/customer                      "customer"

     :verification/subject                "Verify your OrgPad account"
     :verification/preheader              "Welcome to OrgPad. Please verify your account by clicking on the button below."
     :verification/heading                "Verify Your Email"
     :verification/body                   "To verify your account, please click the button below. By clicking the button, you are further agreeing to OrgPad's "
     :verification/terms-and-conditions   "Terms and Conditions"
     :verification/button                 "Confirm Email Address"
     :verification/accidental-email       "If you have received this email by mistake, please delete it. If you get these emails repeatedly, please contact us on "

     :password-reset/subject              "Reset your OrgPad password"
     :password-reset/preheader            "Reset your OrgPad password by clicking on the button below."
     :password-reset/heading              "Reset your OrgPad password"
     :password-reset/body                 "Please click the button below to reset your password. It is valid for 24 hours."
     :password-reset/button               "Reset password"
     :password-reset/accidental-email     "If you did not ask to reset your password or you no longer need to change, you do not need to do anything."

     :new-subscription/subject            "New subscription confirmation"
     :new-subscription/preheader          "Your {{tier}} plan with OrgPad is now active. The subscription will be renewed automatically every {{period}}."
     :new-subscription/body               "Your {{tier}} plan with OrgPad is now active. Thank you for your payment!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "Going forward, the subscription will be renewed automatically every {{period}}. Your receipts are automatically stored in the "
                                                  [:a {:href (str "{{domain}}" url)} "payments section"] " in OrgPad settings."))

     :new-payment/subject                 "Payment succeeded"
     :new-payment/preheader               "You renewed your subscription to the {{tier}} plan, valid until {{subscription-end}}."
     :new-payment/body                    (list "You have successfully renewed your subscription to the {{tier}} plan. It is valid until "
                                                [:b "{{subscription-end}}"] ". Thank you for your payment!")
     :new-payment/button                  "Download invoice"

     :payment-failed/subject              "Subscription payment failed"
     :payment-failed/preheader            "Please check that your card is valid and has sufficient funds. If problems remain, contact us."
     :payment-failed/body                 (str "There has been an error with the payment of your OrgPad subscription."
                                               " Please check that your card is valid and has sufficient funds.")
     :payment-failed/button               "Update payment method"
     :payment-failed/grace-warning        (list "Your current subscription is active until "
                                                [:b "{{subscription-end}}"]
                                                ". If you do not pay the subscription fee by this date, your account will be"
                                                " downgraded to the free plan. You will still be able to access, edit, delete and share your data.")

     :feedback/subject                    "Question: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} has sent question {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) has sent question {{title}}"

     :invitation/subject                  "You are invited {{action}} a document in OrgPad"
     :invitation/preheader                "{{user}} have invited you {{action}} {{title}}. Please click the button below to open it."
     :invitation/heading                  "{{user}} have invited you {{action}} {{title}}"
     :invitation/body                     "OrgPad is a platform for building visual documents for the Big Picture. By clicking on the following button, you accept the invitation and open the document."
     :invitation/button                   "Open Document"
     :invitation/accidental-email         "If you have received this email by mistake, please delete it. If you get these emails repeatedly, you can "
     :invitation/block-user               "block invitations from {{user}}"
     :invitation/block-all                "block all invitations"

     :contact-user/subject                "You have been contacted via OrgPad"
     :contact-user/preheader              "Message from {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) is contacting you via OrgPad"
     :contact-user/body                   (str "This email is from us because we do not share your email address with anyone else. You can respond to the message "
                                               "by replying to this message or by emailing {{reply-to}}.")
     :contact-user/unsolicited-info       "If the message is unsolicited, you can "
     :contact-user/block-user             "block all messages from {{user}}"
     :contact-user/block-all              "block all messages from all people in OrgPad."

     :blog/rss-description                "The latest news and updates for OrgPad and technical discussions."

     :newsletter-2024-summer/subject      "Summer update from OrgPad"
     :newsletter-2024-summer/preheader    "Learn about our latest app updates, new blog, improved privacy measures, and more!"
     :newsletter-2024-summer/introduction "We're back with another newsletter after a year-long break!"
     :newsletter-2024-summer/heading      "You will find in this newsletter:"
     :newsletter-2024-summer/body         (list [:li "What's new in the app since the beginning of the year?"]
                                                [:li "What you'll find on our new blog?"]
                                                [:li "How we take care of your privacy and the security of your data?"]
                                                [:li "How we've updated terms and conditions for your convenience?"]
                                                [:li "Why join the community?"])
     :newsletter-2024-summer/button       "Read newsletter"
     :newsletter-2024-summer/closing      "We look forward to your ideas!"}))