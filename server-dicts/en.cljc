(ns orgpad.server.i18n.en)

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  {:lang/name                         "English"
   :lang/plural-breaks                [0 1 2]               ; Counts of elements for which the next translation for :i18n/plural is used.

   :orgpage/untitled                  "a document"
   :permission/view                   "to read"
   :permission/edit                   "to edit"

   :email/customer                    "customer"
   :email/greeting                    "Dear {{customer}},"

   :invitation/subject                "You are invited {{action}} a document in OrgPad"
   :invitation/preheader              "{{user}} have invited you {{action}} {{title}}. Please click the button below to open it."
   :invitation/heading                "{{user}} have invited you {{action}} {{title}}"
   :invitation/info                   "OrgPad is a platform for building visual documents for the Big Picture. By clicking on the following button, you accept the invitation and open the document."
   :invitation/button                 "Open Document"
   :invitation/accidental-email       "If you have received this email by mistake, please delete it. If you get these emails repeatedly, you can "
   :invitation/block-user             "block invitations from {{user}}"
   :invitation/block-or               " or "
   :invitation/block-all              "block all invitations"

   :footer/unsubscribe                (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                        (list [:a href-orgpad "https://orgpad.com"] ". Don't like these emails? "
                                              [:a href-unsubscribe "Unsubscribe"] "."))

   :orgpage/copy                      "copy"

   :password-reset/subject            "Reset your OrgPad password"
   :password-reset/preheader          "Reset your OrgPad password by clicking on the button below."
   :password-reset/heading            "Reset your OrgPad password"
   :password-reset/text-1             "Please click the button below to reset your password. It is valid for 24 hours."
   :password-reset/button             "Reset password"
   :password-reset/text-2             "If you did not asked to reset your password or you no longer need to change, you do not need to do anything."

   :verification/subject              "Verify your OrgPad account"
   :verification/preheader            "Welcome to OrgPad. Please verify your account by clicking on the button below."
   :verification/heading              "Verify Your Email"
   :verification/verify-account-info  "To verify your account, please click the button below. By clicking the button, you are further agreeing to Orgpad's "
   :verification/terms-and-conditions "Terms and Conditions"
   :verification/button               "Confirm Email Address"
   :verification/received-by-mistake  "If you have received this email by mistake, please delete it. If you get these emails repeatedly, please contact us on "
   :verification/support-email        "support@orgpad.com"

   :feedback/subject                  "User feedback: {{title}}"
   :feedback/preheader                "{{first-name}} {{last-name}} has sent feedback {{title}}"
   :feedback/heading                  "{{first-name}} {{last-name}} ({{email}}) has sent feedback {{title}}"

   :newsletter/subject                "OrgPad Newsletter {newsletter/date}"
   :newsletter/preheader              "OrgPad Newsletter for {newsletter/date}. Click the link below."
   :newsletter/button                 "Open newsletter"
   :newsletter/text                   "This newsletter is delivered to you since you subscribed for it. If you have received this email by mistake or do not want to receive them anymore, "
   :newsletter/unsubscribe            "unsubscribe using this link"})