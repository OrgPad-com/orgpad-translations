(ns orgpad.client.i18n.dicts.en
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.en :as en]
            [orgpad.client.util.unicode :as unicode]))

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  (merge
    en/dict
    {:administration/page-title                       "Administration - OrgPad"

     :attachments/allows-access-to-file               "Allows access to this file."
     :attachments/allows-access-to-image              "Allows access to this image."
     :attachments/no-preview                          "No preview available."
     :attachments/used-files                          "Files in OrgPage"
     :attachments/unused-files                        "Files on the side"
     :attachments/used-images                         "Images in OrgPage"
     :attachments/unused-images                       "Images on the side"
     :attachments/uploading-files                     "Uploading the files …"
     :attachments/previous-attachment                 "Previous file or image"
     :attachments/next-attachment                     "Next file or image"

     :button/back                                     "Back"
     :button/cancel                                   "Cancel"
     :button/close                                    "Close"
     :button/comment                                  "Comment"
     :button/copied                                   "Copied"
     :button/copy                                     "Copy"
     :button/copy-link                                "Copy link"
     :button/create                                   "Create"
     :button/create-tooltip                           "Create (CTRL+ENTER)"
     :button/delete                                   "Delete"
     :button/delete-selected                          "Delete selected"
     :button/documentation                            "Documentation"
     :button/download                                 "Download"
     :button/download-all                             "Download all"
     :button/drop                                     "Drop"
     :button/edit                                     "Edit"
     :button/import                                   "Import"
     :button/insert                                   "Insert"
     :button/login                                    "Log in"
     :button/logout                                   "Log out"
     :button/publish                                  "Publish"
     :button/read                                     "Read"
     :button/register                                 "Sign up"
     :button/register-to-save                         "Sign up to save"
     :button/remove                                   "Remove"
     :button/reset                                    "Reset"
     :button/save                                     "Save changes"
     :button/save-tooltip                             "Save changes (CTRL+ENTER)"
     :button/upload                                   "Upload"
     :button/upload-from-computer                     "Upload from computer"
     :button/send                                     "Send"
     :button/present                                  "Present"
     :button/present-tooltip                          "Start presentation (F5)"
     :button/share                                    "Share"
     :button/start                                    "Start"
     :button/exit                                     "Exit"
     :button/show-password                            "Show"
     :button/hide-password                            "Hide"

     :checkout/currency                               "Currency"
     :checkout/monthly                                "monthly"
     :checkout/yearly                                 "yearly (save 15%)"
     :checkout/failed-to-init                         "Something went wrong while loading checkout website."
     :checkout/upgrade-plan                           "Upgrade plan"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "School"] " or "
                                                         [:a.link-button {:href enterprise-url} "enterprise"] "? Contact us for a custom deal."])
     :checkout/pay-with-credit-card                   "Pay by card"
     :checkout/pay-with-wire-transfer                 "Pay by wire transfer"
     :checkout/promo-code                             "Promo code"
     :checkout/try-for-free                           "Try it for free"
     :checkout/activate-now                           "Activate now"
     :checkout/continue-for-free                      "Continue for free"

     :consent/title                                   "Usage of cookies in OrgPad"
     :consent/text                                    (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                        [:<> "By using this site, you are agreeing with OrgPad's "
                                                         [:a.link-button terms-and-conditions "Terms and Conditions"]
                                                         " and "
                                                         [:a.link-button privacy-policy "Privacy policy"]
                                                         (str ". We employ the use of cookies to enable the functionality "
                                                              "of certain areas to make it easier for people using OrgPad.")])

     :dashboard/confirm-delete                        [:<> [:b "Permanently"] " delete this OrgPage?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Log in"] " or "
                                                         [:a {:href register-url} "sign up"]
                                                         " to create new OrgPages."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "Subscription of your school " name " have expired on " subscription-expired ". "
                                                         "For renewal, contact your management. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "More information"] " about 95% discount for schools."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Get OrgPad for your school without limits with a 95% discount. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "More information."]])
     :dashboard/owned-orgpages                        "My OrgPages"
     :dashboard/public-orgpages                       "Published OrgPages"
     :dashboard/shared-orgpages                       "OrgPages shared with me"
     :dashboard/usergroup-orgpages                    "{usergroup/name}'s OrgPages"
     :dashboard/public-permission-view                "Shared with everyone for reading"
     :dashboard/public-permission-comment             "Shared with everyone for commenting"
     :dashboard/public-permission-edit                "Shared with everyone for editing"
     :dashboard/help-or-inspiration-button            "Here you go!"

     :dashboard-filter/filter                         "Filter OrgPages"
     :dashboard-filter/ordering                       "Order OrgPages"
     :dashboard-filter/filter-and-ordering            "Filter and order OrgPages"
     :dashboard-filter/title                          "Filter and order displayed OrgPages"
     :dashboard-filter/ordering-label                 "Ordering of OrgPages"
     :dashboard-filter/title-order                    "Alphabetically by title"
     :dashboard-filter/creation-time-order            "Newest at the top"
     :dashboard-filter/last-modified-order            "Last modification at the top"
     :dashboard-filter/most-viewed-order              "Most viewed at the top"
     :dashboard-filter/search-tags                    "Search tags"

     :embedding-code/code                             "Code"
     :embedding-code/description                      "Embed the OrgPage into a website or another application."

     :error/orgpage-access-denied                     "You do not have access to this OrgPage. Try to log in."
     :error/usergroup-access-denied                   "Permissions to edit the team denied."
     :error/administration-access                     "Administration access denied."
     :error/creation-unauthorized                     "Log in to create OrgPages."
     :error/deleting-denied                           "Deleting OrgPage denied."
     :error/email-already-used                        "Email already used."
     :error/email-not-registered                      "No account with this email."
     :error/email-missing-mx-record                   "No email server found at this domain."
     :error/email-invalid                             "Not an email."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Incorrect OrgPage" (when id " {orgpage/id}")
                                                             ". Wrongly copied link?"))
     :error/incorrect-link                            "Incorrect link. Either log in, or open the correct link."
     :error/incorrect-password                        "Incorrect password."
     :error/incorrect-profile-id                      "Incorrect link to profile. Wrongly copied link?"
     :error/lost-permission                           "Lost access to this OrgPage."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "Emails without account: " emails))
     :error/name-already-used                         "Name already used"
     :error/name-not-valid                            "Use at least 5 characters"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "The OrgPage " (when title "“{orgpage/title}”") " was removed."))
     :error/owner-of-orgpage                          "The person is already the owner of this OrgPage."
     :error/profile-not-found                         "Profile not found."
     :error/unknown-error                             "Unknown error, try again."
     :error/unknown-id                                "Unknown OrgPage."
     :error/unknown-login-or-email                    "Unknown email or team login."
     :error/unknown-usergroup                         "The team has been deleted"
     :error/upload-failed                             "Failed to upload the OrgPage: \"{orgpage/title}\""

     :feedback/ask-question                           "Ask a question"
     :feedback/hide-button                            "Hide button permanently"
     :feedback/dialog-title                           "Contact OrgPad Developers"
     :feedback/description                            [:<> "If you need help or have any problem, please let us - "
                                                       [:b "the developers of OrgPad"] " know. "
                                                       "Also, we welcome any ideas for improvement. "
                                                       "We will reply via email as soon as possible."]
     :feedback/languages                              "You can write us in English, Czech and German."
     :feedback/contact-when-problem-persists          [:<> " If the problem persists, contact us at "
                                                       [:a.link-button {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Wire transfer"
                                                             (when currency
                                                               (str " in " (name currency))) " for "
                                                             "yearly"
                                                             (if (= tier "standard")
                                                               " Standard"
                                                               " Professional")
                                                             " plan"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Write us your " [:b "billing address"] ", any further information for the invoice."
                                                         " We will contact you shortly at your email address " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "I want to buy a plan for my " (case org-type
                                                                                              :feedback/school-plan "school"
                                                                                              :feedback/enterprise-plan "company"
                                                                                              "organization")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Through this form you will get in touch with a representative of OrgPad s.r.o."
                                                         " We will contact you shortly at your phone number or your email address " [:b email]
                                                         ". Alternatively, you can call us at "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Upgrade my subscription to Professional plan"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Write us how we should change your existing subscription and any further information."
                                                         " We will contact you shortly at your email address " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Change my billing period to " (if (= period "yearly")
                                                                                              "yearly"
                                                                                              "monthly") " billing"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "The change will happen after the current billing period finishes."
                                                         " There is a 15% discount when billed yearly."
                                                         " We will contact you shortly at your email address " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "School"
                                                               :feedback/enterprise-plan "Company"
                                                               "Organization") " name"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Position within the " (case org-type
                                                                                      :feedback/school-plan "school"
                                                                                      :feedback/enterprise-plan "company"
                                                                                      "organization")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "School"
                                                               :feedback/enterprise-plan "Company"
                                                               "Organization") " website"))

     :help-screen/units-with-shadows                  "Cells with shadows are opened and closed by a single click."
     :help-screen/flat-units                          "Flat cells have no extra content."

     :help-screen/more-pages                          "Multiple pages are indicated by circles at the bottom."
     :help-screen/click-title-to-close                "Clicking on title closes the cell immediately."
     :help-screen/click-content-next-page             "Clicking on content slides to the next page."
     :help-screen/click-bullet-goto-page              "Click on circles to jump to a page directly."

     :help-screen/create-links                        "Create links by dragging the connect button or clicking on it and then on the target."
     :help-screen/create-unit-by-dragging-link        "Creating a link into an empty space creates a new cell there."

     :help-screen/how-to-view                         "How to read"
     :help-screen/opening-units                       "Opening cells"
     :help-screen/moving-pages                        "Multiple pages"

     :help-screen/how-to-edit                         "How to edit"
     :help-screen/creating-links                      "Creating links"

     :help-screen/help                                "Help can be found here!"

     :info/uploading-attachments                      [:i18n/plural "Uploading {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "files" "file" "files"]}]
     :info/uploading-images                           [:i18n/plural "Uploading {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "images" "image" "images"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Failed to upload {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "images" "image" "images"]}]
                                                          "Failed to upload at least one image."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} Youtube {info/num-youtubes} not found."
                                                       {:info/num-youtubes [:info/count "videos" "video" "videos"]}]
     :info/uploading-attachments-failed               "Uploading files failed."
     :info/presentation-link-copied                   "The link for this presentation copied."
     :info/max-orgpages-exceeded                      "The owner of this OrgPage cannot create an additional OrgPage."
     :info/storage-exceeded                           "The owner of this OrgPage does not have {upload/total-size} left to upload these files."
     :info/attachments-too-large                      (str "Cannot upload {upload/total-size} in a single upload."
                                                           " The maximum size of all uploaded attachments is 500 MB.")
     :info/drop-info                                  "Drop into any cell or into gray canvas to create a new cell."

     :import/another-format                           [:<> "If you want to import your existing data in another format, contact us at "
                                                       [:b "support@orgpad.com"] "."]
     :import/dialog                                   "Import your data"
     :import/google-docs                              "To insert data from Microsoft Office or Google Docs, just paste them into an OrgPage."
     :import/supported-formats                        "Now we support these formats:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exported as .vsdx file."]

     :ios/install-info                                "Install OrgPad app"
     :ios/share-button                                "1. Open"
     :ios/add-to-home-screen                          "2. Tap"

     :lang/cs                                         "Czech"
     :lang/de                                         "German"
     :lang/en                                         "English"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polish"
     :lang/ru                                         "Russian"

     :language-select/lang-tooltip                    (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                        (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

     :limit/of                                        " of "
     :limit/orgpages                                  " OrgPages"
     :limit/people                                    " people"
     :limit/teams                                     " teams"
     :limit/team-members                              " members"
     :limit/orgpages-tooltip                          (str "In Free tier, the number of OrgPages is limited."
                                                           " Upgrade your plan to create more OrgPages.")
     :limit/shares-tooltip                            (str "The number of people you can share this OrgPage directly is limited."
                                                           " Upgrade to Professional tier to share with unlimited number of people.")
     :limit/teams-tooltip                             (str "In Standard tier, the number of owned teams is limited."
                                                           " Upgrade to Professional tier to create unlimited teams.")
     :limit/teams-members-tooltip                     (str "In Standard tier, each team has a limited number of members."
                                                           " Upgrade to Professional tier to create unlimited teams.")
     :limit/attachments-size                          (str "The total size of all uploaded files and images is limited"
                                                           " and can be increased by upgrading the plan.")
     :limit/attachments-size-clickable                (str "The total size of all uploaded files and images is limited."
                                                           " Click to increase your limit by upgrading the plan.")
     :limit/attachments-size-try-out                  (str "The total size of all uploaded files and images is limited."
                                                           " To increase your limit to 100 MB, click to create an account.")

     :limits/max-orgpages                             "documents"
     :limits/max-storage                              "storage"
     :limits/max-teams                                "teams"
     :limits/of                                       " of"
     :limits/max-team-members                         "members"
     :limits/priority-support                         "priority support"

     :link-panel/flip                                 "Flip the direction"
     :link-panel/insert-unit-in-middle                "Insert a cell in the middle"
     :link-panel/delete                               "Delete the link"
     :link-panel/change-link-style                    "Change style of this link; hold SHIFT to set the current, hold CTRL to copy to the default"

     :loading/initial-autoresize                      "Computing sizes of all cells, {loading/num-units} remaining …"
     :loading/initial-layout                          "Improving the initial layout …"
     :loading/restoring-opened-pages                  "Restoring position of opened pages …"
     :loading/getting-orgpage                         "Downloading an OrgPage from the server …"
     :loading/getting-dashboard                       "Downloading the list of available OrgPages from the server …"
     :loading/getting-website                         "Downloading a website from the server …"
     :loading/uploading-orgpage                       "Uploading an OrgPage to the server …"
     :loading/ws-init                                 "Setting up connection to the server …"
     :loading/ws-closed                               "Connection to server closed, trying to reconnect. If the problem persists, reload the page."
     :loading/administration                          "Loading administration data …"
     :loading/profile                                 "Loading profile …"
     :loading/style                                   "Loading styles …"
     ;; Needed?
     :loading/start-trial                             "Starting 7-day trial subscription…"
     :loading/uploading-attachments                   "Uploading attachments to the server …"

     :login/continue-with-email                       "Continue with email"
     :login/continue-with-facebook                    "Continue with Facebook"
     :login/continue-with-google                      "Continue with Google"
     :login/continue-with-microsoft                   "Continue with Microsoft"
     :login/email-sent                                "Email sent. Click the link in the email."
     :login/forgotten-password                        "Forgotten password"
     :login/forgotten-password-email-resent           "Password reset email sent already."
     :login/forgotten-password-description            "Get a password reset link by email (valid 24h)."
     :login/forgotten-password-error                  [:<> "This email address is blocked by you. Either unblock it by clicking Unsubscribe in any email from OrgPad, or send us an email to "
                                                       [:b "support@orgpad.com"]
                                                       " from this email address."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "New to OrgPad? " [:a.link-button {:href route} "Sign up"]])
     :login/options                                   "Pick another way to log in"
     :login/send-reset-link                           "Send reset link"
     :login/wrong-email-or-password                   "Email or password is incorrect."

     :meta/orgpage-thumbnail                          "OrgPage image"
     :meta/thumbnail-info                             (str "Choose image displayed for this OrgPage. It is used in "
                                                           "the list of OrgPages, in embeds and when shared in social networks.")
     :meta/automatic-screenshot                       "Automatically generated screenshot. Updates five minutes after each change."
     :meta/custom-thumbnail                           "Custom uploaded image of size 1360x768."
     :meta/upload-thumbnail                           "Upload custom image"
     :meta/thumbnail-upload-failed                    "Failed to upload image."
     :meta/description                                "Description"
     :meta/new-tag                                    "Tag"
     :meta/info                                       (str "Information below helps you and others to know what this OrgPage is about. "
                                                           "You can filter by tags in the OrgPages list.")
     :meta/info-in-share-orgpage                      "Before sharing this OrgPage, title has to be set."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Move the selected {selection/num-units} {selection/units-label} "
                                                                         "and {selection/num-links} {selection/links-label} into a new OrgPage "
                                                                         "with the following information. In the current OrgPage, these cells and links "
                                                                         "will be replaced by a single cell, containing the new OrgPage inside.")
                                                       {:selection/units-label [:selection/num-units "cells" "cell" "cells"]
                                                        :selection/links-label [:selection/num-links "links" "link" "links"]}]
     :meta/move-to-new-orgpage-title                  "Move to {meta/title}"
     :meta/move-to-new-orgpage                        "Move to a new OrgPage"

     :notifications/info                              "Pick which emails OrgPad sends to you. We'll always let you know about important changes."
     :notifications/any-email                         "Any email from OrgPad"
     :notifications/email-verification                "Email verification when signed up, links for resetting password and essential payment information"
     :notifications/monthly-newsletter                "Monthly newsletter with updates and recent development in OrgPad"
     :notifications/messages                          "Receive messages from other people"
     :notifications/blocked-people                    "Specifically blocked people:"
     :notifications/receipts                          "Receipts when your subscription is automatically renewed"
     :notifications/receive-invitations               "Receive invitations from other people"
     :notifications/unblock-user                      "Unblock this person"

     :onboarding/openable-units                       "Only elevated cells with shadows can be opened."
     :onboarding/zoom                                 "Scroll to zoom"
     :onboarding/drag-canvas                          "Move by dragging"
     :onboarding/open-units                           "Cells with shadows have content"

     :orgpage/creating-preview                        "Creating preview …"
     :orgpage/change-information                      "Change information"
     :orgpage/copy-orgpage                            "Copy into a new OrgPage"
     :orgpage/delete-orgpage                          "Delete OrgPage"
     :orgpage/detail                                  "Detail"
     :orgpage/share-tooltip                           "Share this OrgPage with others"
     :orgpage/share-orgpage                           "Share OrgPage"
     :orgpage/show-information                        "Show information"

     :orgpage/zoom-in                                 "Zoom in"
     :orgpage/zoom-out                                "Zoom out"
     :orgpage/create-unit-double-click                "Double click to create a cell."
     :orgpage/create-unit-hold-or-double-tap          "Hold or double tap to create a cell."
     :orgpage/switch-to-edit                          "Switch to edit."

     :orgpage/untitled                                "Untitled OrgPage"
     :orgpage/title                                   "OrgPage title"
     :orgpage/untitled-unit                           "Untitled cell"
     :orgpage/untitled-path                           "Untitled presentation"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "steps" "step" "steps"]}]

     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (page {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (page {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "A copy available as "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Change color of this OrgPage"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "This OrgPage is automatically shared with " label " for "
                                                         (case permission
                                                           :permission/view "reading"
                                                           :permission/comment "commenting"
                                                           :permission/edit "editing"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Click here"]
                                                         " to cancel sharing."])

     :orgpage-placement/activate                      "View here"

     :orgpage-stats/number-of-units                   "Number of cells"
     :orgpage-stats/number-of-links                   "Number of links"
     :orgpage-stats/number-of-files                   "Number of files"
     :orgpage-stats/number-of-images                  "Number of images"

     :org-role/student                                "Student"
     :org-role/teacher                                "Teacher"
     :org-role/employee                               "Employee"
     :org-role/admin                                  "Administrator"

     :panel/create-orgpage                            "New OrgPage"
     :panel/logo-tooltip                              "Go home"
     :panel/edit-info                                 "Switch to editing where you can create and delete cells and links, modify content, and more (F7)"
     :panel/comment-info                              (str "Switch to commenting where you can create, edit and delete"
                                                           " your cells and links but cannot edit or delete cells or links"
                                                           " of other people. However, you can link to cells not owned by you. (F7)")
     :panel/read-info                                 "Switch to reading where nothing can be changed but browsing the content is easier (F6)"
     :panel/undo-deletion                             "Undo deletion"
     :panel/undo-deletion-info                        [:i18n/plural "Revert the deletion of {delete/num-units} {delete/unit-label} and {delete/num-links} {delete/link-label} (CTRL+Z)."
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "cells" "cell" "cells"]
                                                                :link-label [:delete/num-links
                                                                             "links" "link" "links"]}]
     :panel/refresh                                   "Refresh"
     :panel/switch-style                              "Switch style of new cells and links; drag to create a new cell"
     :panel/profile                                   "Profile"
     :panel/settings                                  "Settings"
     :panel/usergroups                                "Teams"
     :panel/stats                                     "Stats"
     :panel/administration                            "Administration"
     :panel/ios-install-info                          "Install app"
     :panel/upload-attachment                         "Insert images or files into new cells"
     :panel/selection-mode                            "Start selection"
     :panel/search                                    "Search"

     :password/too-short                              "At least 8 characters required"
     :password/different-passwords                    "Passwords do not match"

     :password-reset/back-to-list                     "Back to list"
     :password-reset/change-password                  "Change password"
     :password-reset/set-password                     "Set password"
     :password-reset/has-password                     "Your account has a password set."
     :password-reset/without-password                 "No password is yet set since linked accounts were used for login."
     :password-reset/invalid-link                     "Invalid link, maybe older than 24 hours. Please ask to resend the email."
     :password-reset/description                      "Set your new password."
     :password-reset/enter-current-and-new-password   "Enter the current password and the new password."
     :password-reset/enter-new-password-twice         "Enter the new password."

     :path/add-step                                   "Add a step"
     :path/add-step-tooltip                           "Hold SHIFT to copy the camera"
     :path/hidden-ops                                 " and {path/num-hidden} more"
     :path/title                                      "Presentation {path/num-paths}"
     :paths/create-new-path                           "Create a presentation"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Delete the presentation " [:b title] "?"])

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Currently in " [:b tier " plan"] ", valid till " [:b end-date] "."
                                                         (if autorenewal
                                                           " Subscription will be automatically renewed at the end of the payment period."
                                                           " Subscription will expire at the end of the payment period.")])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " at " [:b tier " plan"] " of " name "."])
     :payments/free-tier-info                         [:<> "OrgPad used in " [:b "Free tier,"] " without any payments."]
     :payments/no-teams                               "No teams in Free tier."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "For " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "upgrades"]] " or ")
                                                         [:a.link-button {:href period-url} "changing your billing period"]
                                                         ", contact us."])
     :payments/choose-plan                            "Choose plan"
     :payments/manage-plan                            "Manage plan"
     :payments/contact-to-manage                      (fn [{:payments/keys [url]}]
                                                        [:<> "Contact us to "
                                                         [:a.link-button {:href url} "to manage your subscription"] "."])
     :payments/receipts                               "Receipts:"
     :payments/receipt-label                          "Receipt {receipt/date-range}"
     :payments/customer-portal-failed                 "Something went wrong while loading plan management website."

     :pending-activation/email-already-used           "Email already used on another account."
     :pending-activation/email-not-recieved           "No email? Resend or change below."
     :pending-activation/email-sent                   "Activation email sent. "
     :pending-activation/instructions                 "Almost done! Activate your account with one click on the link we sent you by email."
     :pending-activation/resend                       "Resend activation email"

     :permission/admin                                "Can share and delete"
     :permission/admin-tooltip                        "Can also modify who else has access to the document."
     :permission/edit                                 "Can edit"
     :permission/edit-tooltip                         "Can do any changes to the OrgPage."
     :permission/comment                              "Can comment"
     :permission/comment-tooltip                      (str "Can create new owned cells, connect them and modify them. "
                                                           "Cannot modify the rest of the OrgPage.")
     :permission/view                                 "Can read"
     :permission/view-tooltip                         "Can read the OrgPage without doing any changes."

     :presentation/presentation                       "Presentation"
     :presentation/step                               "Step"
     :presentation/first-step                         "The first step"
     :presentation/previous-step                      "The previous step"
     :presentation/next-step                          "The next step"
     :presentation/last-step                          "The last step"
     :presentation/present                            "Start presentation"
     :presentation/slideshow                          "Automatically play steps"
     :presentation/step-duration                      "Step duration in seconds"
     :presentation/loop-slideshow                     "Repeat at the end"
     :presentation/stop-slideshow                     "Stop automatically playing steps"
     :presentation/exit-tooltip                       "Exit presentation"

     :presentation/share-presentation                 "Share this presentation with others."

     :presentation/embedded-zoom-info                 "CTRL + scroll for zooming"

     :paths-menu/focus                                "Set camera {keyboard/shortcut}"
     :paths-menu/open-and-close                       "Open and close cells {keyboard/shortcut}"
     :paths-menu/visibility                           "Change visibility {keyboard/shortcut}"

     :pricing-popup/orgpages-exceeded-title           "You cannot create more OrgPages in Free plan"
     :pricing-popup/orgpages-exceeded                 "You have to upgrade your plan."
     :pricing-popup/storage-exceeded-title            "Not enough space left to upload {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Only " [:b space-left " remain"] " in your storage."
                                                         " You can upgrade your plan to extend your storage."])
     :pricing-popup/num-shared-limit-reached-title    "You cannot share this OrgPage with more people"
     :pricing-popup/num-shared-limit-reached-common   "The maximum number of people sharing this OrgPage was reached."
     :pricing-popup/num-shared-limit-reached          [:<> " To add more people, you have to upgrade to "
                                                       [:b "Professional tier"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " The owner of this OrgPage " owner " has to upgrade to "
                                                         [:b "Professional tier"] " to add more people."])
     :pricing-popup/enable-teams-title                "Upgrade your plan to manage teams"
     :pricing-popup/enable-teams                      [:<> "Teams group people together which simplifies collaboration and sharing OrgPages."
                                                       " This feature is only enabled in " [:b "Standard tier"] " or higher."]
     :pricing-popup/teams-limit-reached-title         "Upgrade your plan to create more teams"
     :pricing-popup/teams-limit-reached               "The limit for the number of teams was reached for your plan."
     :pricing-popup/team-members-limit-reached-title  "You cannot add more members to {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "The maximum number of team members was reached."
     :pricing-popup/team-members-limit-reached        [:<> " To add more members, you have to upgrade to "
                                                       [:b "Professional tier"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " The owner of this team " owner " has to upgrade to "
                                                         [:b "Professional tier"] " to add more members."])
     :pricing-popup/try-out-share-title               "Sign up to share this OrgPage"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Only " [:b space-left " remain"] " in your storage."])
     :pricing-popup/free-account-info                 "By signing up, you get for free:"
     :pricing-popup/free-limit                        "up to three OrgPages,"
     :pricing-popup/free-storage                      "up to 100 MB of storage,"
     :pricing-popup/free-share                        "sharing your work with others."
     :pricing-popup/free-account-info2                "Create your account in just a few clicks."

     :pricing-popup/register-to-comment               "Sign up to add your comments"
     :pricing-popup/register-to-comment-info          (str "Comment cells will display your name and profile photo."
                                                           " For that you need to create your account first.")

     :profile/open-contact-dialog                     "Send message"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Contact " first-name " " last-name)
                                                          "Contact this person"))
     :profile/contact-dialog-info                     (str "Since we do not share the email addresses of other people in OrgPad, we will send this message for you. We will"
                                                           " include your name and email to provide a direct contact.")

     :promotion/unknown                               "Unknown code"
     :promotion/max-usages-reached                    "Used too many times"
     :promotion/expired                               "Expired"
     :promotion/one-year-free                         "1 year free"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} free"
                                                       {:promotion/days [:promotion/duration "days" "day" "days"]}]
     :promotion/for-one-year                          " for 1 year"
     :promotion/for-six-months                        " for 6 months"

     :props/h1                                        "Large title"
     :props/h2                                        "Medium title"
     :props/h3                                        "Small title"
     :props/weight-none                               "Normal link"
     :props/strong                                    "Strong link"
     :props/arrowhead-none                            "No arrow"
     :props/single                                    "Arrow"
     :props/double                                    "Double arrow"

     :public-permission/none                          "private."
     :public-permission/comment                       "shared with everyone for commenting."
     :public-permission/edit                          "shared with everyone for editing."
     :public-permission/view                          "shared with everyone for reading."

     :registration/create-user                        "Create account"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Already have an account? " [:a.link-button {:href route} "Log in"]])
     :registration/options                            "Pick another way to sign up"
     :registration/server-error                       "Server error. Try creating the account again."
     :registration/missing-oauth-email                "{registration/service} did not let us know your email. Please fill it out below."

     :search/previous-match                           "Previous match (Page Up)"
     :search/next-match                               "Next match (Page Down)"
     :search/close                                    "Close (ESC)"

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Change style of selected "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; hold SHIFT to set the current, hold CTRL to copy to the current"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "cells" "cell" "cells"]
                                                                   :link-label [:selection/num-links
                                                                                "links" "link" "links"]}]

     :selection/link                                  "Connect cells"
     :selection/hide-contents                         "Hide contents (ESC)"
     :selection/show-contents                         "Show contents"
     :selection/move-to-new-orgpage                   "Move to a new OrgPage"
     :selection/copy-units-links                      "Copy cells and links to clipboard"
     :selection/flip-links                            "Flip link directions"
     :selection/delete                                "Delete selected"

     :settings/profile                                "Profile"
     :settings/payments                               "Payments"
     :settings/account                                "Account"
     :settings/linked-accounts                        "Linked accounts"
     :settings/notifications                          "Notifications"
     :settings/account-description                    "Change your email, password or delete your account."
     :settings/stats-description                      "Here are some statistics about your OrgPad usage."
     :settings/change-email                           "Change email"
     :settings/change-email-text                      "Enter new email address. For security reasons, we have to verify it before unlocking the account."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "You signed up for your account using the email " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Your account is " [:b " linked "] " to Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Your account is " [:b " not linked "] " to Facebook."]
     :settings/link-fb                                "Link Facebook"
     :settings/unlink-fb                              "Unlink Facebook"
     :settings/account-linked-to-google               [:<> " Your account is " [:b " linked "] " to Google."]
     :settings/account-not-linked-to-google           [:<> " Your account is " [:b " not linked "] " to Google."]
     :settings/link-google                            "Link Google"
     :settings/unlink-google                          "Unlink Google"
     :settings/account-linked-to-microsoft            [:<> " Your account is " [:b " linked "] " to Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> " Your account is " [:b " not linked "] " to Microsoft."]
     :settings/link-microsoft                         "Link Microsoft"
     :settings/unlink-microsoft                       "Unlink Microsoft"
     :settings/set-password-text                      " Set password before unlinking."
     :settings/linked-accounts-info                   "Link your Facebook or Google account to OrgPad so you can use them to log in."
     :settings/profile-info                           "With the given information you will be easier to find for co-workers on a project."
     :settings/select-language                        "Language of the app (CTRL+SHIFT+L): "

     :settings/delete-account                         "Delete account"
     :settings/confirm-delete-account-question        [:<> [:b "Permanently"] " delete your account?"]
     :settings/confirm-delete-account-info            "It will delete all your OrgPages and their data."
     :settings/delete-account-info                    [:<> "Deleting will " [:b "permanently"] " delete all your OrgPages and their data."]

     :share-orgpage/campaigns                         "Campaigns"
     :share-orgpage/copied-to-clipboard               "Copied to clipboard"
     :share-orgpage/copy-template-link                "Copy template link"
     :share-orgpage/dialog-title                      "Share {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "People without an OrgPad account will get an invitation with a link."
                                                                  " After they open the link, they can read this OrgPage. ")
                                                         [:a.link-button create-team "Create a team"]
                                                         " to easily share OrgPages with a group of people."])
     :share-orgpage/email-found                       "An OrgPad account found."
     :share-orgpage/email-unused                      "No OrgPad account found. Send an email invite instead."
     :share-orgpage/checking-email-address            "Checking email address ..."
     :share-orgpage/invite-for-editing                "Invite for editing"
     :share-orgpage/invite-for-viewing                "Invite for reading"
     :share-orgpage/invite-by-email                   "Do you want to invite them by email using a specific language?"
     :share-orgpage/show-profile                      "Show profile"
     :share-orgpage/links                             "Links"
     :share-orgpage/to-read                           "to read"
     :share-orgpage/to-comment                        "to comment"
     :share-orgpage/to-edit                           "to edit"
     :share-orgpage/links-tooltip                     "Grant access via shareable links"
     :share-orgpage/template                          "Template"
     :share-orgpage/template-tooltip                  "Links automatically creating a copy of this OrgPage"
     :share-orgpage/template-info                     "People can use this link to create their own copies of this OrgPage."
     :share-orgpage/template-autoshare-none           "Do not share the copies with me."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Share the copies with me for "
                                                             (case template-autoshare
                                                               :permission/view "reading"
                                                               :permission/comment "commenting"
                                                               :permission/edit "editing") "."))
     :share-orgpage/embed                             "Embed"
     :share-orgpage/embed-into-microsoft-teams        "Embed into Microsoft Teams"
     :share-orgpage/embed-into-website                "Embed into website or application"
     :share-orgpage/embed-tooltip                     "Embed into website or application"
     :share-orgpage/new-user-or-usergroup             "Name, email or team"
     :share-orgpage/link-permission-start             "Allow people"
     :share-orgpage/link-permission-end               "this OrgPage."
     :share-orgpage/orgpage-info                      "Info"
     :share-orgpage/orgpage-info-tooltip              "Information about the owner and whether the OrgPage is published"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "This OrgPage is shared with you for "
                                                             (case user-permission
                                                               :permission/view "reading"
                                                               :permission/comment "commenting"
                                                               :permission/edit "editing") "."))
     :share-orgpage/remove-yourself                   "Remove yourself"
     :share-orgpage/private-info                      "Only you and the people with whom you have shared the OrgPage directly or through a link have access. Every newly created document is private."
     :share-orgpage/publish-for-commenting-info       "The OrgPage is public. Anyone on the Internet can search and comment it with an OrgPad account."
     :share-orgpage/publish-for-editing-info          "The OrgPage is public. Anyone on the Internet can search and edit it."
     :share-orgpage/publish-for-reading-info          "The OrgPage is public. Anyone on the Internet can search and read it. Only you or the people with whom you have shared the OrgPage for editing can make changes."
     :share-orgpage/publish-permission-end            "This OrgPage is "
     :share-orgpage/publish                           "Publish"
     :share-orgpage/publish-confirmation              "Everyone will be able {orgpage/permission} this OrgPage. Are you sure?"
     :share-orgpage/publish-tooltip                   "Grant access to everyone"
     :share-orgpage/remove-user                       "Remove permission"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "If you shared a link by accident, you can "
                                                         [:span.link-button reset-links "invalidate all previous links"]
                                                         "."])
     :share-orgpage/shareable-link                    "Shareable link"
     :share-orgpage/start-with-presentation           "Start with a presentation."
     :share-orgpage/template-link-switch              "Create a template link."
     :share-orgpage/user-not-registered               " has not yet signed up for OrgPad."
     :share-orgpage/users                             "People"
     :share-orgpage/users-tooltip                     "Grant access to individual people"

     :side-panel/about                                "Home page"
     :side-panel/files-and-images                     "Files and images"
     :side-panel/paths                                "Presentations"
     :side-panel/translate                            "Translate"
     :side-panel/toggle-debug                         "Debugger"
     :side-panel/help                                 "Help"
     :side-panel/home                                 "Home"
     :side-panel/import                               "Import"
     :side-panel/share                                "Share"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "files" "file" "files"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "images" "image" "images"]}]
     :side-panel/num-paths                            [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 " paths " " path " " paths "]}]

     :step/closed-pages                               "Closed pages"
     :step/everything-closed                          "Everything closed."
     :step/hidden-units                               "Hidden cells"
     :step/nothing-changed                            "Nothing changed."
     :step/opened-pages                               "Opened pages"
     :step/pages-shown-in-the-camera                  "Pages shown in camera"
     :step/revealed-units                             "Revealed cells"
     :step/switched-pages                             "Switched pages"

     :style-select/set-comment                        "Change into a comment cell with your profile image (CTRL+,)"
     :style-select/unset-comment                      "Change into a normal cell, removing the profile image (CTRL+,)"

     :tag/public                                      "public"

     :text-field/email                                "Email"
     :text-field/first-name                           "First name"
     :text-field/last-name                            "Last name"
     :text-field/new-password                         "New password"
     :text-field/password                             "Password"
     :text-field/title                                "Title"
     :text-field/content                              "Content"
     :text-field/name-or-email                        "Name or email"
     :text-field/subject                              "Subject"
     :text-field/message                              "Message"
     :text-field/phone-number                         "Phone number"
     :text-field/width                                "Width"
     :text-field/height                               "Height"

     :tier/free                                       "Free"
     :tier/standard                                   "Standard"
     :tier/professional                               "Professional"
     :tier/school                                     "School"
     :tier/enterprise                                 "Enterprise"
     :tier/unlimited                                  "Unlimited"

     :translate/title                                 "Translate OrgPage {orgpage/title} into another language"
     :translate/info                                  (str "Automatically creates a copy of this OrgPage owned by you"
                                                           " which is translated from the source language to the target"
                                                           " language. You can find it in your list within a minute.")
     :translate/source-lang                           "Source language"
     :translate/target-lang                           "Target language"
     :translate/translate                             "Translate"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Translation available as "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :usergroup-role/owner                            "Owner"
     :usergroup-role/admin                            "Administrator"
     :usergroup-role/member                           "Member"

     :unit-editor/add-page                            "Create another page"
     :unit-editor/delete-page                         "Remove this page"
     :unit-editor/previous-page                       "Previous page (PAGEUP); hold SHIFT to move this page to the left (SHIFT+PAGEUP)"
     :unit-editor/next-page                           "Next page (PAGEDOWN); hold SHIFT to move this page to the right (SHIFT+PAGEDOWN)"
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Switch to this page"
                                                             (when can-edit "; hold SHIFT to move the current page there")))
     :unit-editor/hidden-info                         "Click to write"
     :unit-editor/undo                                "Undo (CTRL+Z)"
     :unit-editor/redo                                "Redo (CTRL+SHIFT+Z or CTRL+Y)"
     :unit-editor/toggle-bold                         "Bold (CTRL+B)"
     :unit-editor/toggle-italic                       "Italic (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Strikethrough"
     :unit-editor/toggle-subscript                    "Subscript (CTRL+S)"
     :unit-editor/toggle-superscript                  "Superscript (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Create hyperlink (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Remove hyperlink"
     :unit-editor/set-highlighting                    "Highlight color"
     :unit-editor/selection->code                     "Convert to code (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Bulleted list (CTRL+U)"
     :unit-editor/toggle-list-ol                      "Numbered list (CTRL+O)"
     :unit-editor/indent                              "Increase indent (TAB)"
     :unit-editor/outdent                             "Decrease indent (SHIFT+TAB)"
     :unit-editor/center                              "Center align"
     :unit-editor/heading                             "Heading"
     :unit-editor/embed-pdf                           "Show PDF content"
     :unit-editor/link-pdf                            "Replace PDF content with its hyperlink"
     :unit-editor/embed-video                         "Display video player"
     :unit-editor/link-video                          "Replace video with its hyperlink"
     :unit-editor/embed-audio                         "Display audio player"
     :unit-editor/link-audio                          "Replace audio with its hyperlink"
     :unit-editor/hyperlink->embed                    "Insert linked website"
     :unit-editor/embed->hyperlink                    "Replace embedded website with its hyperlink"
     :unit-editor/toggle-controls                     "Display video player controls"
     :unit-editor/toggle-autoplay                     "Play automatically"
     :unit-editor/toggle-muted                        "Play muted, automatic playing might be blocked otherwise"
     :unit-editor/toggle-loop                         "Loop playback"
     :unit-editor/toggle-chained-size                 "Maintain aspect ratio"
     :unit-editor/insert-menu                         "Insert"
     :unit-editor/insert-image                        "Image"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Upload an image from your device."
     :unit-editor/insert-image-info2                  "Tip: Drag or paste images directly into any cell or gray canvas."
     :unit-editor/insert-camera                       "Camera"
     :unit-editor/insert-attachment                   "File"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Video"
     :unit-editor/insert-video-info                   "Upload a video from computer or insert it from YouTube."
     :unit-editor/insert-video-info2                  "Tip: Drag videos and YouTube thumbnails directly into any cell or gray canvas."
     :unit-editor/video-url                           "YouTube link"
     :unit-editor/youtube-start                       "Start"
     :unit-editor/youtube-end                         "End"
     :unit-editor/insert-table                        "Table"
     :unit-editor/insert-table-info                   "Choose size of the inserted table."
     :unit-editor/toggle-table-border                 "Show table borders"
     :unit-editor/add-row-before                      "Insert row above"
     :unit-editor/add-row-after                       "Insert row below"
     :unit-editor/remove-current-row                  "Delete row"
     :unit-editor/add-column-before                   "Insert column before"
     :unit-editor/add-column-after                    "Insert column after"
     :unit-editor/remove-current-column               "Delete column"
     :unit-editor/remove-table                        "Remove table"
     :unit-editor/insert-website                      "Website"
     :unit-editor/insert-website-info                 (str "You can embed websites directly into a cell."
                                                           " If it does not work, it might be blocked by the website owner.")
     :unit-editor/website-url-or-code                 "Website address or code"
     :unit-editor/update-website                      "Change website address"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "Code"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/toggle-block-code                   "Code block"
     :unit-editor/remove-code                         "Remove code formatting"


     :unit-panel/link                                 (str "Click or drag to connect;"
                                                           " hold SHIFT to create multiple connections;"
                                                           " hold CTRL to create a chain of cells")
     :unit-panel/upload-attachment                    "Insert image or file into this cell"
     :unit-panel/change-link-style                    (str "Change style of this cell; "
                                                           "hold SHIFT to set the current, "
                                                           "hold CTRL to copy to the default; "
                                                           "drag to connect in this style")
     :unit-panel/hide-content                         "Hide content"
     :unit-panel/delete-unit                          "Delete cell"

     :usergroups/create-team                          "Create a team"
     :usergroups/info                                 "Create and manage teams of your friends and coworkers to simplify sharing OrgPages."
     :usergroups/delete-usergroup                     "Delete team"
     :usergroups/members                              "Members"
     :usergroups/change                               "Change team title and logo"
     :usergroups/show-actions                         "Show actions"
     :usergroups/name                                 "Name"
     :usergroups/create-usegroup-info                 "The team name and profile picture can be seen by anyone on OrgPad."
     :usergroups/confirm-delete-usergroup             [:<> [:b "Permanently"] " delete this team?"]
     :usergroups/usergroups-members                   "{usergroup/name}'s members"
     :usergroups/remove-member                        "Remove from team"
     :usergroups/remove-admin                         "Remove admin"
     :usergroups/make-admin                           "Make admin"
     :usergroups/admin-tooltip                        "An admin can manage the members and delete the team."

     :wire-transfer/title                             "Wire Transfer for yearly {wire-transfer/tier} plan"
     :wire-transfer/info                              "We will activate your yearly subscription when we receive your money at our account."
     :wire-transfer/used-currency                     "Payment in {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Recipient name"
     :wire-transfer/account-number                    "Account number"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Amount"
     :wire-transfer/payment-purpose                   "Payment purpose"
     :wire-transfer/qr-code-common                    (str "Scan this payment QR code with your banking app to fill"
                                                           " out the correct information automatically.")
     :wire-transfer/cz-sk-qr-code-description         (str " This is a QR code commonly used for wire transfers"
                                                           " in Czechia and Slovakia.")
     :wire-transfer/eu-qr-code-description            (str " This is a QR code commonly used for SEPA transfers"
                                                           " in the European Union.")
     :wire-transfer/trial-info                        (str "You can start a one-time 7-day subscription to use OrgPad"
                                                           " fully immediately. When the bank confirms the payment"
                                                           " succeeded, the subscription period will be extended"
                                                           " by 1 year.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " If you have any questions or difficulties, please let us"
                                                         " know by " [:a.link-button {:href url} "filling out this form"] "."])
     :wire-transfer/success-text                      [:<> "We have activated a " [:b "one-time 7-day subscription"]
                                                       " so you can use OrgPad with the new plan immediately. "]
     :wire-transfer/common-result-text                (str "When the bank confirms the payment succeeded,"
                                                           " the subscription period will be extended"
                                                           " by 1 year.")
     :wire-transfer/start-trial                       "Wire transfer sent"
     :wire-transfer/start-trial-result-title          "Thank you for the payment"
     :wire-transfer/copy                              "Copy to clipboard"

     :website-editor/settings                         "Settings"
     :website-editor/routes                           "Routes"
     :website-editor/menus                            "Menus"
     :website-editor/create-menu                      "Create menu"
     :website-editor/edited-menu                      "Edited menu"
     :website-editor/untitled-menu                    "Untitled menu"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "children" "child" "children"]}]
     :website-editor/delete-menu-item                 "Delete this menu item"
     :website-editor/add-menu-item                    "Add menu item"
     :website-editor/menu-item-label                  "Item label"
     :menu-item/path-type                             "Opens a route"
     :menu-item/url-type                              "Opens an external URL"
     :menu-item/children-type                         "Opens a submenu"
     :website-editor/menu-item-path                   "Route"

     :youtube-placement/watch-on-prefix               (str "Watch" unicode/nbsp "on")
     :youtube-placement/watch-on-suffix               ""
     }))