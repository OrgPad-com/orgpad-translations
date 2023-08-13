(ns orgpad.server.i18n.en
  (:require [orgpad.common.i18n.dict.en :as en]
            [orgpad.server.i18n.en-admin :as en-admin]))

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  (merge
    en/dict
    en-admin/dict
    {:orgpage/untitled                        "a document"
     :permission/view                         "to read"
     :permission/edit                         "to edit"

     :subscription/monthly                    "month"
     :subscription/yearly                     "year"

     :tier/standard                           "Standard"
     :tier/professional                       "Professional"
     :tier/school                             "School"
     :tier/enterprise                         "Enterprise"
     :tier/unlimited                          "Unlimited"

     :email/customer                          "customer"
     :email/greeting                          "Dear {{customer}},"
     :email/signature                         "Best wishes"
     :email/ceo                               "Vít Kalisz, CEO"
     :email/contact-us                        (fn [{:feedback/keys [url]}]
                                                (list "If you encounter any problems, please let us know by using an "
                                                      [:a {:href (str "{{domain}}" url)} "in-app form"]
                                                      " or sending email to " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                                " or "

     :invitation/subject                      "You are invited {{action}} a document in OrgPad"
     :invitation/preheader                    "{{user}} have invited you {{action}} {{title}}. Please click the button below to open it."
     :invitation/heading                      "{{user}} have invited you {{action}} {{title}}"
     :invitation/info                         "OrgPad is a platform for building visual documents for the Big Picture. By clicking on the following button, you accept the invitation and open the document."
     :invitation/button                       "Open Document"
     :invitation/accidental-email             "If you have received this email by mistake, please delete it. If you get these emails repeatedly, you can "
     :invitation/block-user                   "block invitations from {{user}}"
     :invitation/block-all                    "block all invitations"

     :june-newsletter-2023/subject            "Updates, Inspirations and Victories - the journey of OrgPad"
     :june-newsletter-2023/preheader          (str "Unveiling a world of innovation: Explore latest improvements, learn"
                                                   " about what's coming up next, celebrate some of our achievements"
                                                   " with us, and win free licenses! Step into the future with our latest"
                                                   " newsletter - Click to open up new horizons!")
     :june-newsletter-2023/introduction       (str "bustling with fresh inspiration and updates is the summer edition of our newsletter."
                                                   " Actually… The real newsletter is hidden below the following button. Dive in!")
     :june-newsletter-2023/button             "OK, I’m curious!"
     :june-newsletter-2023/details            (str "We've been hard at work since the Christmas issue so there are many great"
                                                   " improvements to talk about. Moreover, we’ll give you a glimpse of what"
                                                   " we are going to work on over the summer. But the excitement doesn't"
                                                   " stop there either! We also have an exciting opportunity for you to"
                                                   " win a free professional license valid for a whole year. Click the"
                                                   " button to claim your prize.")
     :june-newsletter-2023/best-wishes        "Wishing you a holiday full of relaxation and joy, from the entire OrgPad team."

     :footer/unsubscribe                      (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                                (list [:a href-orgpad "https://orgpad.com"] ". Do you not like these emails? "
                                                      [:a href-unsubscribe "Unsubscribe"] "."))

     :orgpage/copy                            "copy"

     :password-reset/subject                  "Reset your OrgPad password"
     :password-reset/preheader                "Reset your OrgPad password by clicking on the button below."
     :password-reset/heading                  "Reset your OrgPad password"
     :password-reset/text-1                   "Please click the button below to reset your password. It is valid for 24 hours."
     :password-reset/button                   "Reset password"
     :password-reset/text-2                   "If you did not ask to reset your password or you no longer need to change, you do not need to do anything."

     :verification/subject                    "Verify your OrgPad account"
     :verification/preheader                  "Welcome to OrgPad. Please verify your account by clicking on the button below."
     :verification/heading                    "Verify Your Email"
     :verification/verify-account-info        "To verify your account, please click the button below. By clicking the button, you are further agreeing to OrgPad's "
     :verification/terms-and-conditions       "Terms and Conditions"
     :verification/button                     "Confirm Email Address"
     :verification/received-by-mistake        "If you have received this email by mistake, please delete it. If you get these emails repeatedly, please contact us on "
     :verification/support-email              "support@orgpad.com"

     :feedback/subject                        "Question: {{title}}"
     :feedback/preheader                      "{{first-name}} {{last-name}} has sent question {{title}}"
     :feedback/heading                        "{{first-name}} {{last-name}} ({{email}}) has sent question {{title}}"

     :newsletter/subject                      "OrgPad Newsletter {{newsletter/date}}"
     :newsletter/preheader                    "OrgPad Newsletter for {{newsletter/date}}. Click the link below."
     :newsletter/button                       "Open newsletter"
     :newsletter/text                         "This newsletter is delivered to you since you subscribed for it. If you have received this email by mistake or do not want to receive them anymore, "
     :newsletter/unsubscribe                  "unsubscribe using this link"

     :conference-invitation-2022/subject      "Invitation to OrgPad Conference on 19th of November 2022"
     :conference-invitation-2022/preheader    (str "On November 19 at 9:30 am starts the second OrgPad conference in Prague, Smichov,"
                                                   " and you shouldn't miss it! It is a meeting of the community of which you are a member."
                                                   " You can look forward to eight 20-minute talks, interesting people, great refreshments"
                                                   " and a competition. The speakers are: Barbora Jeřábková, Janek Wagner, Radko Sáblík, Tomáš Baránek,"
                                                   " Ondřej Lněnička, Václav Maněna and Petra Plachá")
     :conference-invitation-2022/introduction (str "I'd like to invite you to the OrgPad conference, which will take place on Saturday, November 19, 2022,"
                                                   " from 9:30 a.m. on the beautiful premises of Next Zone, Preslova 25, Prague 5-Smíchov.")
     :conference-invitation-2022/info         (str "Come and meet other community members! You can look forward to interesting talks and tasty"
                                                   " refreshments. The entry is free of charge. The talks will be held in the Czech language.")
     :conference-invitation-2022/button       "Register for the conference"
     :conference-invitation-2022/program      (list "Conference program:"
                                                    [:ul {:style {:list-style-type "none"
                                                                  :margin          0
                                                                  :padding         0}}
                                                     [:li "09:30 - 10:00 Reception"]
                                                     [:li "10:10 - 10:40 Opening speech and a keynote by the OrgPad authors"]
                                                     [:li "10:45 - 11:05 Baruš Jeřábková, \"Jen\" aplikace"]
                                                     [:li "11:30 - 11:50 Janek Wagner, České školství očima ajťáka aneb Jsem z toho janek"]
                                                     [:li "12:00 - 12:20 Radko Sáblík, Vzdělávání pro 21. století"]
                                                     [:li "13:00 - 13:20 Tomáš Baránek, Příprava autorské knihy a online kurzu v OrgPadu"]
                                                     [:li "13:30 - 13:50 Ondřej Lněnička, Jak jsme se stali školou na OrgPadu závislou"]
                                                     [:li "14:10 - 14:30 Václav Maněna, OrgPad v profesním i osobním životě učitele"]
                                                     [:li "14:40 - 15:00 Petra Plachá, My, ORGanizovaní proPADlí"]
                                                     [:li "15:00 - 15:30 Open Mic (3 - 5 minute slots)"]
                                                     [:li "15:30 - 17:00 Announcement of competition winners, open discussion and accompanying program"]])
     :conference-invitation-2022/best-wishes2 "All the best"

     :contact-user/subject                    "You have been contacted via OrgPad"
     :contact-user/preheader                  "Message from {{user}}"
     :contact-user/heading                    "{{user}} ({{reply-to}}) is contacting you via OrgPad"
     :contact-user/common-info                (str "This email is from us because we do not share your email address with anyone else. You can respond to the message "
                                                   "by replying to this message or by emailing {{reply-to}}.")
     :contact-user/post-message-info          "If the message is unsolicited, you can "
     :contact-user/block-user                 "block all messages from {{user}}"
     :contact-user/block-all                  "block all messages from all people in OrgPad."

     :new-payment/subject                     "Payment succeeded"
     :new-payment/preheader                   "You renewed your subscription to the {{tier}} plan, valid until {{subscription-end}}."
     :new-payment/common-info                 (list "You have successfully renewed your subscription to the {{tier}} plan. It is valid until "
                                                    [:b "{{subscription-end}}"] ". Thank you for your payment!")
     :new-payment/download-receipt            "Download receipt"

     :new-subscription/subject                "New subscription confirmation"
     :new-subscription/preheader              "Your {{tier}} plan with OrgPad is now active. The subscription will be renewed automatically every {{period}}."
     :new-subscription/active-tier            "Your {{tier}} plan with OrgPad is now active. Thank you for your payment!"
     :new-subscription/payment-info           (fn [{:payment/keys [url]}]
                                                (list "Going forward, the subscription will be renewed automatically every {{period}}. Your receipts are automatically stored in the "
                                                      [:a {:href (str "{{domain}}" url)} "payments section"] " in OrgPad settings."))

     :payment-failed/subject                  "Subscription payment failed"
     :payment-failed/preheader                "Please check that your card is valid and has sufficient funds. If problems remain, contact us."
     :payment-failed/error                    (str "There has been an error with the payment of your OrgPad subscription."
                                                   " Please check that your card is valid and has sufficient funds.")
     :payment-failed/payment                  "Update payment method"
     :payment-failed/current-subscription     (list "Your current subscription is active until "
                                                    [:b "{{subscription-end}}"]
                                                    ". If you do not pay the subscription fee by this date, your account will be"
                                                    " downgraded to the free plan. You will still be able to access, edit, delete and share your data.")

     :reminder/subject                        "OrgPad discount, news and examples"
     :reminder/preheader                      "What improved in OrgPad in December 2021 and examples how it can be used."
     :reminder/thank-you                      "First of all, I'd like to thank you for creating an OrgPad account."
     :reminder/phunt-launch                   (str "December is a special month full of surprises. "
                                                   "The biggest surprise of last month came on Christmas Eve. "
                                                   "Santa wasn't responsible though, Product Hunt was. "
                                                   "At least I think so. OrgPad was one of the top five products "
                                                   "on Product Hunt that day. Thanks to that we have been busy over "
                                                   "Christmas answering people's emails and "
                                                   "questions on social media and sharing OrgPad further.")
     :reminder/button-info                    (str "To make your start in OrgPad easier, I have prepared some examples of how to use OrgPad. "
                                                   "Click the button below to explore them. I have also added some news about OrgPad.")
     :reminder/button                         "OrgPad news and examples"
     :reminder/phunt-promo-code               (list "I'd also like to remind you of the "
                                                    [:b "PHUNT21 promo code for 50% discount."]
                                                    " You can help us by spreading the word about OrgPad on social media. "
                                                    "A single tweet, post or mention would be great.")

     :christmas-newsletter-2022/subject       "Price increase, reflection, outlook, wishes"
     :christmas-newsletter-2022/preheader     (str "Until February 1st, you can order at the current price. Summary of new OrgPad features"
                                                   " and events, conference video recordings, Microsoft Roadshow, information for schools,"
                                                   " scheduled systems maintenance on the night of December 24th-25th.")
     :christmas-newsletter-2022/introduction  (str "the run-up to the holidays is a time of reflection. That's why we've taken a look back at what's"
                                                   " happened around OrgPad in the past year and started thinking about the year ahead.")
     :christmas-newsletter-2022/list-info     "One year on, this has resulted in another newsletter in which we touch on the following topics:"
     :christmas-newsletter-2022/list          (list [:li "What has changed in OrgPad over the past year?"]
                                                    [:li "OrgPad conference recapitulation."]
                                                    [:li "New prices from February 1st 2023 on."]
                                                    [:li "Information for schools and our participation on the Microsoft Roadshow."]
                                                    [:li "System maintenance and downtime on Christmas Eve to Christmas Day (Dec 24th-25th)."])
     :christmas-newsletter-2022/button        "New price list and details"
     :christmas-newsletter-2022/best-wishes   "Wishing you peaceful holidays"}))