(ns orgpad.client.i18n.dicts.hi
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.hi :as hi]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  "A dictionary map from keywords to the corresponding Hindi texts."
  (merge
    hi/dict
    {:address/company                                 "कंपनी का नाम"
     :address/ico                                     "वैट"
     :address/street                                  "गली"
     :address/street-number                           "संख्या"
     :address/postal-code                             "डाक कोड"
     :address/city                                    "शहर"
     :address/country                                 "देश"

     :administration/page-title                       "प्रशासन - OrgPad"

     :attachments/allows-access-to-file               "इस फ़ाइल तक पहुंच की अनुमति देता है।"
     :attachments/allows-access-to-image              "इस छवि तक पहुंच की अनुमति देता है।"
     :attachments/no-preview                          "कोई पूर्वावलोकन उपलब्ध नहीं है।"
     :attachments/all-files                           "सभी फाइलें"
     :attachments/used-files                          "OrgPage में उपयोग की गई फ़ाइलें"
     :attachments/unused-files                        "OrgPage में उपयोग नहीं की गई फ़ाइलें"
     :attachments/all-images                          "सभी छवियाँ"
     :attachments/used-images                         "OrgPage में उपयोग की गई छवियाँ"
     :attachments/unused-images                       "OrgPage में उपयोग नहीं की गई छवियाँ"
     :attachments/uploading-files                     "फ़ाइलें अपलोड हो रही हैं..."
     :attachments/previous-attachment                 "पिछली फ़ाइल या छवि"
     :attachments/next-attachment                     "अगली फ़ाइल या छवि"
     :attachments/display-using-microsoft-365         "Microsoft 365 का उपयोग करके प्रदर्शित करें"
     :attachments/edit-filename                       "नाम संपादित करें"
     :attachments/title-order                         "शीर्षक के अनुसार वर्णानुक्रम में"
     :attachments/upload-order                        "नवीनतम सबसे ऊपर"
     :attachments/size-order                          "सबसे बड़ा सबसे ऊपर"
     :attachments/split-used-unused                   "OrgPage में उपस्थिति के आधार पर समूह"
     :attachments/search                              "खोज"
     :attachments/ordering                            "क्रमबद्ध करना"
     :attachments/new-version                         "नया संस्करण"
     :attachments/preserve-old-version                "पुराना संस्करण संरक्षित करें"
     :attachments/in-other-orgpages                   "अन्य OrgPages में बदलें:"

     :button/back                                     "वापस"
     :button/cancel                                   "रद्द करें"
     :button/close                                    "बंद करें"
     :button/comment                                  "टिप्पणी"
     :button/continue                                 "जारी रखें"
     :button/copied                                   "कॉपी किया गया"
     :button/copy                                     "कॉपी"
     :button/copy-link                                "लिंक कॉपी करें"
     :button/create                                   "बनाएं"
     :button/create-tooltip                           "बनाएं (CTRL+ENTER)"
     :button/delete                                   "हटाएं"
     :button/delete-selected                          "चयनित हटाएं"
     :button/documentation                            "दस्तावेज़ीकरण"
     :button/download                                 "डाउनलोड करें"
     :button/download-all                             "सभी डाउनलोड करें"
     :button/drop                                     "ड्रॉप"
     :button/edit                                     "संपादित करें"
     :button/import                                   "आयात करें"
     :button/insert                                   "सम्मिलित करें"
     :button/login                                    "लॉग इन करें"
     :button/logout                                   "लॉग आउट करें"
     :button/publish                                  "प्रकाशित करें"
     :button/read                                     "पढ़ें"
     :button/register                                 "साइन अप करें"
     :button/register-to-save                         "सहेजने के लिए साइन अप करें"
     :button/remove                                   "हटाएं"
     :button/reset                                    "रीसेट करें"
     :button/save                                     "बदलाव सहेजें"
     :button/save-tooltip                             "बदलाव सहेजें (CTRL+ENTER)"
     :button/upload                                   "अपलोड करें"
     :button/upload-from-computer                     "कंप्यूटर से अपलोड करें"
     :button/send                                     "भेजें"
     :button/present                                  "प्रस्तुत करें"
     :button/present-tooltip                          "प्रस्तुति शुरू करें (F5)"
     :button/share                                    "साझा करें"
     :button/start                                    "शुरू करें"
     :button/exit                                     "बाहर निकलें"
     :button/show-password                            "दिखाएं"
     :button/hide-password                            "छिपाएं"

     :checkout/currency                               "मुद्रा"
     :checkout/monthly                                "मासिक"
     :checkout/yearly                                 "वार्षिक (15% बचाएं)"
     :checkout/failed-to-init                         "चेकआउट वेबसाइट लोड करते समय कुछ गलत हो गया।"
     :checkout/upgrade-plan                           "योजना उन्नत करें"
     :checkout/professional-plan                      "पेशेवर योजना"
     :checkout/school-plan                            "विद्यालय योजना"
     :checkout/enterprise-plan                        "उद्यम योजना"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "विद्यालय"] " या "
                                                         [:a.link-button {:href enterprise-url} "उद्यम"] "? एक कस्टम सौदे के लिए हमसे संपर्क करें।"])
     :checkout/pay-with-credit-card                   "कार्ड से भुगतान करें"
     :checkout/pay-with-wire-transfer                 "बैंक ट्रांसफ़र द्वारा भुगतान करें"
     :checkout/promo-code                             "प्रोमो कोड"
     :checkout/try-for-free                           "इसे मुफ्त में आजमाएं"
     :checkout/activate-now                           "अभी सक्रिय करें"
     :checkout/continue-for-free                      "मुफ्त में जारी रखें"

     :code-lang/none                                  "कोई नहीं"
     :code-lang/multiple                              "एकाधिक"

     :dashboard/confirm-delete                        [:<> [:b "स्थायी रूप से"] " इस OrgPage को हटाएं? "]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "लॉग इन करें"] " या "
                                                         [:a {:href register-url} "साइन अप करें"]
                                                         " नए OrgPages बनाने के लिए।"])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "आपके विद्यालय " name " की सदस्यता " subscription-expired " को समाप्त हो गई है। "
                                                         "नवीनीकरण के लिए, अपने प्रबंधन से संपर्क करें। "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "अधिक जानकारी"] " विद्यालयों के लिए 95% छूट के बारे में।"])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "95% छूट के साथ अपने विद्यालय के लिए बिना किसी सीमा के OrgPad प्राप्त करें। "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "अधिक जानकारी।"]])
     :dashboard/owned-orgpages                        "मेरे OrgPages"
     :dashboard/public-orgpages                       "प्रकाशित OrgPages"
     :dashboard/shared-orgpages                       "मेरे साथ साझा किए गए OrgPages"
     :dashboard/usergroup-orgpages                    "{usergroup/name} के OrgPages"
     :dashboard/help-or-inspiration-button            "यह लीजिए!"
     :dashboard/new-domain                            [:<> "नए डोमेन का उपयोग करें " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". OrgPage में अधिक जानकारी " [:a {:href "https://orgpad.info/s/new-domain"} "OrgPad में परिवर्तन और नया डोमेन"] "."]

     :dashboard-filter/filter                         "OrgPages फ़िल्टर करें"
     :dashboard-filter/ordering                       "OrgPages ऑर्डर करें"
     :dashboard-filter/filter-and-ordering            "OrgPages फ़िल्टर और ऑर्डर करें"
     :dashboard-filter/title                          "प्रदर्शित OrgPages को फ़िल्टर और ऑर्डर करें"
     :dashboard-filter/ordering-label                 "OrgPages का क्रम"
     :dashboard-filter/title-order                    "शीर्षक के अनुसार वर्णानुक्रम में"
     :dashboard-filter/creation-time-order            "नवीनतम सबसे ऊपर"
     :dashboard-filter/last-modified-order            "अंतिम संशोधित सबसे ऊपर"
     :dashboard-filter/most-viewed-order              "सबसे ज्यादा देखे गए सबसे ऊपर"
     :dashboard-filter/search-tags                    "टैग खोजें"

     :embedding-code/code                             "कोड"
     :embedding-code/description                      "OrgPage को एक वेबसाइट या किसी अन्य एप्लिकेशन में सन्निहित करें।"

     :error/orgpage-access-denied                     "आपके पास इस OrgPage तक पहुंच नहीं है। लॉग इन करने का प्रयास करें।"
     :error/usergroup-access-denied                   "टीम को संपादित करने की अनुमति अस्वीकार कर दी गई।"
     :error/administration-access                     "प्रशासनिक प्रवेश अस्वीकृत।"
     :error/creation-unauthorized                     "OrgPages बनाने के लिए लॉग इन करें।"
     :error/deleting-denied                           "OrgPage को हटाना अस्वीकार कर दिया गया।"
     :error/email-already-used                        "ईमेल पहले से उपयोग में है।"
     :error/email-not-registered                      "इस ईमेल के साथ कोई खाता नहीं है।"
     :error/email-missing-mx-record                   "इस डोमेन पर कोई ईमेल सर्वर नहीं मिला।"
     :error/email-invalid                             "अमान्य ईमेल पता।"
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "गलत OrgPage" (when id " {orgpage/id}")
                                                             ". गलत तरीके से कॉपी किया गया लिंक? "))
     :error/incorrect-link                            "गलत लिंक। या तो लॉग इन करें, या सही लिंक खोलें।"
     :error/incorrect-password                        "गलत पासवर्ड।"
     :error/incorrect-profile-id                      "प्रोफ़ाइल का गलत लिंक। गलत तरीके से कॉपी किया गया लिंक?"
     :error/lost-permission                           "इस OrgPage तक पहुंच खो गई।"
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "बिना खाते के ईमेल: " emails))
     :error/name-already-used                         "नाम पहले से उपयोग में है"
     :error/name-not-valid                            "कम से कम 5 वर्णों का उपयोग करें"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "OrgPage " (when title "“{orgpage/title}”") " हटा दिया गया था। "))
     :error/owner-of-orgpage                          "व्यक्ति पहले से ही इस OrgPage का स्वामी है।"
     :error/profile-not-found                         "प्रोफ़ाइल नहीं मिली।"
     :error/unknown-error                             "अज्ञात त्रुटि, पुनः प्रयास करें।"
     :error/unknown-id                                "अज्ञात OrgPage।"
     :error/unknown-login-or-email                    "अज्ञात ईमेल या टीम लॉगिन।"
     :error/unknown-usergroup                         "टीम हटा दी गई है"
     :error/upload-failed                             "OrgPage अपलोड करने में विफल: “{orgpage/title}”"

     :export/show                                     "OrgPage निर्यात करें"
     :export/title                                    "निर्यात करें {orgpage/title}"
     :export/info                                     "वह प्रारूप चुनें जिसमें यह OrgPage निर्यात किया गया है।"
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " OrgPad द्वारा उपयोग किया जाने वाला प्रारूप"]
     :export/html                                     "एक रैखिक HTML फ़ाइल"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON कैनवास"] " प्रारूप"]
     :export/generate                                 "निर्यात उत्पन्न करें"

     :feedback/ask-question                           "एक प्रश्न पूछें"
     :feedback/hide-button                            "बटन को स्थायी रूप से छिपाएं"
     :feedback/dialog-title                           "OrgPad डेवलपर्स से संपर्क करें"
     :feedback/description                            [:<> "यदि आपको सहायता की आवश्यकता है या कोई समस्या है, तो कृपया हमें बताएं - "
                                                       [:b "OrgPad के डेवलपर्स"] "। "
                                                       "इसके अलावा, हम सुधार के लिए किसी भी विचार का स्वागत करते हैं। "
                                                       "हम जल्द से जल्द ईमेल के माध्यम से जवाब देंगे।"]
     :feedback/languages                              "आप हमें अंग्रेजी, चेक और जर्मन में लिख सकते हैं।"
     :feedback/contact-when-problem-persists          [:<> " यदि समस्या बनी रहती है, तो हमसे संपर्क करें "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "तार हस्तांतरण"
                                                             (when currency
                                                               (str " में " (name currency))) " के लिए "
                                                             "वार्षिक"
                                                             (if (= tier "standard")
                                                               " मानक"
                                                               " पेशेवर")
                                                             " योजना"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "हमें अपना " [:b "बिलिंग पता"] ", चालान के लिए कोई और जानकारी लिखें।"
                                                         " हम जल्द ही आपके ईमेल पते " [:b email] " पर आपसे संपर्क करेंगे।"])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "मैं अपने " (case org-type
                                                                           :feedback/school-plan "विद्यालय"
                                                                           :feedback/enterprise-plan "कंपनी"
                                                                           "संगठन") " के लिए एक योजना खरीदना चाहता हूं"))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "OrgPad s.r.o. प्रतिनिधि से संपर्क करने के लिए इस फ़ॉर्म का उपयोग करें।"
                                                         " हम जल्द ही आपके द्वारा प्रदान किए गए फ़ोन नंबर या ईमेल पते (" email
                                                         ") पर आपसे संपर्क करेंगे। आप हमें "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] " पर भी कॉल कर सकते हैं।"])
     :feedback/upgrade-subscription-title             "मेरी सदस्यता को पेशेवर योजना में अपग्रेड करें"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "हमें बताएं कि हमें आपकी मौजूदा सदस्यता और किसी भी अन्य जानकारी को कैसे बदलना चाहिए।"
                                                         " हम जल्द ही आपके ईमेल पते " [:b email] " पर आपसे संपर्क करेंगे।"])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "मेरी बिलिंग अवधि को " (if (= period "yearly")
                                                                                      "वार्षिक"
                                                                                      "मासिक") " बिलिंग में बदलें"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "वर्तमान बिलिंग अवधि समाप्त होने के बाद परिवर्तन होगा।"
                                                         " वार्षिक रूप से बिल किए जाने पर 15% की छूट है।"
                                                         " हम जल्द ही आपके ईमेल पते " [:b email] " पर आपसे संपर्क करेंगे।"])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "विद्यालय"
                                                               :feedback/enterprise-plan "कंपनी"
                                                               "संगठन") " का नाम"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str " " (case org-type
                                                                   :feedback/school-plan "विद्यालय"
                                                                   :feedback/enterprise-plan "कंपनी"
                                                                   "संगठन") " के भीतर स्थिति"))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "विद्यालय"
                                                               :feedback/enterprise-plan "कंपनी"
                                                               "संगठन") " वेबसाइट"))

     :fragment/fragment                               "स्थान"
     :fragment/text-id                                "आईडी"
     :fragment/title                                  "शीर्षक"
     :fragment/create                                 "स्थान बनाएं"
     :fragment/create-tooltip                         "TAB; चयनित स्थान की प्रतिलिपि बनाने के लिए SHIFT दबाए रखें"
     :fragment/remove                                 "स्थान हटाएं"
     :fragment/share                                  "इस स्थान का लिंक कॉपी करें"
     :fragment/text-id-required                       "आईडी आवश्यक है।"
     :fragment/text-id-already-used                   "आईडी पहले से उपयोग में है।"
     :fragment/closed-books                           "बंद सेल; चुनने के लिए CTRL+क्लिक करें"
     :fragment/hidden-books                           "छिपे हुए सेल; चुनने के लिए CTRL+क्लिक करें"
     :fragment/opened-pages                           "खुले पृष्ठ; चुनने के लिए CTRL+क्लिक करें"
     :fragment/focused-books                          "कैमरे में दिखाए गए सेल; चुनने के लिए CTRL+क्लिक करें"
     :fragment/shown-books                            "प्रकट सेल; चुनने के लिए CTRL+क्लिक करें"

     :info/uploading-attachments                      [:i18n/plural "{info/count} {info/num-files} अपलोड हो रही हैं..."
                                                       {:info/num-files [:info/count "फ़ाइलें" "फ़ाइल" "फ़ाइलें"]}]
     :info/uploading-images                           [:i18n/plural "{info/count} {info/num-images} अपलोड हो रही हैं..."
                                                       {:info/num-images [:info/count "छवियाँ" "छवि" "छवियाँ"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "{info/count} {info/num-images} अपलोड करने में विफल।"
                                                           {:info/num-images [:info/count "छवियाँ" "छवि" "छवियाँ"]}]
                                                          "कम से कम एक छवि अपलोड करने में विफल।"))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} Youtube {info/num-youtubes} नहीं मिला।"
                                                       {:info/num-youtubes [:info/count "वीडियो" "वीडियो" "वीडियो"]}]
     :info/uploading-attachments-failed               "फ़ाइलें अपलोड करने में विफल।"
     :info/presentation-link-copied                   "इस प्रस्तुति का लिंक कॉपी किया गया।"
     :info/max-orgpages-exceeded                      "इस OrgPage का स्वामी एक अतिरिक्त OrgPage नहीं बना सकता है।"
     :info/storage-exceeded                           "इस OrgPage के स्वामी के पास इन फ़ाइलों को अपलोड करने के लिए {upload/total-size} शेष नहीं है।"
     :info/attachments-too-large                      (str "एकल अपलोड में {upload/total-size} अपलोड नहीं किया जा सकता है।"
                                                           " सभी अपलोड किए गए अनुलग्नकों का अधिकतम आकार 500 एमबी है।")
     :info/drop-info                                  "एक नया सेल बनाने के लिए किसी भी सेल या ग्रे कैनवास में ड्रॉप करें।"
     :info/audio-not-allowed                          "ऑडियो चलाना ब्लॉक किया गया है। कृपया प्ले बटन दबाएँ।"
     :info/audio-not-supported                        "ऑडियो प्रारूप समर्थित नहीं है।"

     :import/another-format                           [:<> "यदि आप अपने मौजूदा डेटा को किसी अन्य प्रारूप में आयात करना चाहते हैं, तो हमसे संपर्क करें "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "अपना डेटा आयात करें"
     :import/google-docs                              "Microsoft Office या Google Docs से डेटा सम्मिलित करने के लिए, बस उन्हें एक OrgPage में पेस्ट करें।"
     :import/supported-formats                        "अब हम इन प्रारूपों का समर्थन करते हैं:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " को .vsdx फ़ाइल के रूप में निर्यात किया गया।"]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON कैनवास"] " फ़ाइल।"]

     :ios/install-info                                "OrgPad ऐप इंस्टॉल करें"
     :ios/share-button                                "1. खोलें"
     :ios/add-to-home-screen                          "2. टैप करें"

     :lang/cs                                         "चेक"
     :lang/de                                         "जर्मन"
     :lang/en                                         "अंग्रेज़ी"
     :lang/es                                         "स्पेनिश"
     :lang/fr                                         "फ्रेंच"
     :lang/hi                                         "हिन्दी"
     :lang/pl                                         "पोलिश"
     :lang/ru                                         "रूसी"
     :lang/uk                                         "यूक्रेनी"

     :lang-select/tooltip                             "ऐप की भाषा (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "क्या आप अपनी भाषा को याद करते हैं? "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "OrgPad का अनुवाद"] " करके हमारी सहायता करें।"]

     :limit/of                                        " का "
     :limit/orgpages                                  " OrgPages"
     :limit/people                                    " लोग"
     :limit/teams                                     " टीमें"
     :limit/team-members                              " सदस्य"
     :limit/orgpages-tooltip                          (str "निःशुल्क श्रेणी में, OrgPages की संख्या सीमित है।"
                                                           " अधिक OrgPages बनाने के लिए अपनी योजना को उन्नत करें।")
     :limit/shares-tooltip                            (str "आप इस OrgPage को सीधे साझा कर सकने वाले लोगों की संख्या सीमित है।"
                                                           " असीमित संख्या में लोगों के साथ साझा करने के लिए पेशेवर श्रेणी में उन्नत करें।")
     :limit/teams-tooltip                             (str "मानक श्रेणी में, स्वामित्व वाली टीमों की संख्या सीमित है।"
                                                           " असीमित टीमें बनाने के लिए पेशेवर श्रेणी में उन्नत करें।")
     :limit/teams-members-tooltip                     (str "मानक श्रेणी में, प्रत्येक टीम में सदस्यों की संख्या सीमित है।"
                                                           " असीमित टीमें बनाने के लिए पेशेवर श्रेणी में उन्नत करें।")
     :limit/attachments-size                          (str "सभी अपलोड की गई फ़ाइलों और छवियों का कुल आकार सीमित है"
                                                           " और योजना को उन्नत करके बढ़ाया जा सकता है।")
     :limit/attachments-size-clickable                (str "सभी अपलोड की गई फ़ाइलों और छवियों का कुल आकार सीमित है।"
                                                           " योजना को उन्नत करके अपनी सीमा बढ़ाने के लिए क्लिक करें।")
     :limit/attachments-size-try-out                  (str "सभी अपलोड की गई फ़ाइलों और छवियों का कुल आकार सीमित है।"
                                                           " अपनी सीमा को 100 एमबी तक बढ़ाने के लिए, एक खाता बनाने के लिए क्लिक करें।")

     :limits/max-orgpages                             "दस्तावेज़"
     :limits/max-storage                              "भंडारण"
     :limits/max-teams                                "टीमें"
     :limits/of                                       " का"
     :limits/max-team-members                         "सदस्य"
     :limits/priority-support                         "प्राथमिकता समर्थन"

     :link-panel/flip                                 "दिशा पलटें"
     :link-panel/insert-unit-in-middle                "बीच में एक सेल डालें"
     :link-panel/delete                               "लिंक हटाएं"
     :link-panel/change-link-style                    "इस लिंक की शैली बदलें; वर्तमान सेट करने के लिए SHIFT दबाए रखें, डिफ़ॉल्ट पर कॉपी करने के लिए CTRL दबाए रखें"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "सभी सेलों के आकार की गणना हो रही है, " [:span#autoresize-num-units num-units] " शेष... "])
     :loading/initial-layout                          "प्रारंभिक लेआउट में सुधार हो रहा है..."
     :loading/restoring-opened-pages                  "खुले पृष्ठों की स्थिति बहाल हो रही है..."
     :loading/getting-orgpage                         "सर्वर से एक OrgPage डाउनलोड हो रहा है..."
     :loading/getting-dashboard                       "सर्वर से उपलब्ध OrgPages की सूची डाउनलोड हो रही है..."
     :loading/getting-website                         "सर्वर से एक वेबसाइट डाउनलोड हो रही है..."
     :loading/getting-blog                            "सर्वर से ब्लॉग डाउनलोड हो रहा है..."
     :loading/uploading-orgpage                       "सर्वर पर एक OrgPage अपलोड हो रहा है..."
     :loading/ws-init                                 "सर्वर से कनेक्शन स्थापित हो रहा है..."
     :loading/ws-closed                               "सर्वर से कनेक्शन बंद हो गया, पुनः कनेक्ट करने का प्रयास किया जा रहा है। यदि समस्या बनी रहती है, तो पृष्ठ को पुनः लोड करें।"
     :loading/administration                          "प्रशासन डेटा लोड हो रहा है..."
     :loading/profile                                 "प्रोफ़ाइल लोड हो रही है..."
     :loading/style                                   "शैलियाँ लोड हो रही हैं..."
     :loading/start-trial                             "7-दिवसीय परीक्षण सदस्यता शुरू हो रही है..."
     :loading/uploading-attachments                   "सर्वर पर अनुलग्नक अपलोड हो रहे हैं..."

     :login/continue-with-email                       "ईमेल के साथ जारी रखें"
     :login/continue-with-facebook                    "फेसबुक के साथ जारी रखें"
     :login/continue-with-google                      "गूगल के साथ जारी रखें"
     :login/continue-with-microsoft                   "माइक्रोसॉफ्ट के साथ जारी रखें"
     :login/continue-with-cuni                        "चार्ल्स विश्वविद्यालय के साथ जारी रखें"
     :login/email-sent                                "ईमेल भेजा गया। ईमेल में दिए गए लिंक पर क्लिक करें।"
     :login/forgotten-password                        "पासवर्ड भूल गए"
     :login/forgotten-password-email-resent           "पासवर्ड रीसेट ईमेल पहले ही भेजा जा चुका है।"
     :login/forgotten-password-description            "ईमेल द्वारा एक पासवर्ड रीसेट लिंक प्राप्त करें (24 घंटे के लिए वैध)।"
     :login/forgotten-password-error                  [:<> "यह ईमेल पता आपके द्वारा अवरुद्ध कर दिया गया है। या तो OrgPad से किसी भी ईमेल में सदस्यता समाप्त करें पर क्लिक करके इसे अनब्लॉक करें, या हमें इस ईमेल पते से "
                                                       company/support-email-app-link " पर एक ईमेल भेजें।"]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "OrgPad में नए हैं? " [:a.link-button {:href route} "साइन अप करें"]])
     :login/options                                   "लॉग इन करने का दूसरा तरीका चुनें"
     :login/send-reset-link                           "रीसेट लिंक भेजें"
     :login/wrong-email-or-password                   "ईमेल या पासवर्ड गलत है।"

     :markdown/title                                  "क्या चिपकाया गया पाठ मार्कडाउन द्वारा स्वरूपित है?"
     :markdown/info                                   "आपके चिपकाए गए सामग्री में मार्कडाउन स्वरूपण का पता चला है। क्या आप इसका स्वरूपण लागू करना चाहेंगे?"
     :markdown/remember                               "पुनः लोड होने तक याद रखें"
     :markdown/insert                                 "मार्कडाउन स्वरूपण का उपयोग करें"
     :markdown/ignore                                 "मूल रखें"

     :meta/title                                      "OrgPage का नाम"
     :meta/orgpage-thumbnail                          "OrgPage छवि"
     :meta/automatic-screenshot-start                 "का स्क्रीनशॉट स्वचालित रूप से बनाया गया"
     :meta/automatic-screenshot-refresh               "प्रत्येक परिवर्तन के पांच मिनट बाद अपडेट होता है।"
     :meta/custom-thumbnail                           "आकार 1360x768 की कस्टम अपलोड की गई छवि।"
     :meta/upload-thumbnail                           "कस्टम छवि अपलोड करें"
     :meta/thumbnail-upload-failed                    "छवि अपलोड करने में विफल।"
     :meta/description                                "विवरण"
     :meta/new-tags                                   "टैग"
     :meta/tag-too-long                               (str "एक टैग की अधिकतम लंबाई " common-orgpage/max-tag-length " वर्ण है।")
     :meta/too-many-tags                              (str "अधिकतम " common-orgpage/max-tags " टैग की अनुमति है।")
     :meta/info                                       (str "ये विवरण OrgPage सूची में प्रदर्शित होंगे, "
                                                           "एक OrgPage एम्बेड करते समय, और इसे सोशल नेटवर्क पर साझा करते समय।")
     :meta/info-in-share-orgpage                      "इस OrgPage को साझा करने से पहले, शीर्षक सेट करने की आवश्यकता है।"
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "चयनित {selection/num-units} {selection/units-label} "
                                                                         "और {selection/num-links} {selection/links-label} को निम्नलिखित जानकारी के साथ एक नए OrgPage में ले जाएं। "
                                                                         "वर्तमान OrgPage में, इन सेलों और लिंक को एक एकल सेल द्वारा प्रतिस्थापित किया जाएगा, जिसमें अंदर नया OrgPage होगा।")
                                                       {:selection/units-label [:selection/num-units "सेल" "सेल" "सेल"]
                                                        :selection/links-label [:selection/num-links "लिंक" "लिंक" "लिंक"]}]
     :meta/info-title                                 "जानकारी – {meta/title}"
     :meta/info-title-only                            "OrgPage को नाम दें"
     :meta/details                                    "विवरण"
     :meta/preview                                    "पूर्वावलोकन"
     :meta/init-fragments                             "प्रारंभिक स्थान"
     :meta/init-fragments-info                        (str "आप OrgPage खोले जाने पर प्रारंभिक स्थान चुन सकते हैं। "
                                                           "मोबाइल उपकरणों के लिए एक अलग प्रारंभिक स्थान निर्दिष्ट किया जा सकता है।")
     :meta/desktop-init-fragment                      "डेस्कटॉप का स्थान"
     :meta/mobile-init-fragment                       "मोबाइल का स्थान"
     :meta/everything-closed                          "सभी सेल बंद"
     :meta/everything-closed-lowercase                "सभी सेल बंद"
     :meta/more-details                               "अधिक विवरण"
     :meta/move-to-new-orgpage-title                  "{meta/title} में ले जाएं"
     :meta/move-to-new-orgpage                        "एक नए OrgPage में ले जाएं"

     :microsoft-365-permission/title                  "Microsoft 365 को इस दस्तावेज़ तक पहुंचने की अनुमति दें?"
     :microsoft-365-permission/info                   [:<> "Office दस्तावेज़ को Microsoft 365 का उपयोग करके प्रदर्शित किया जा सकता है।"
                                                       " सहमत पर क्लिक करके, आपका दस्तावेज़ Microsoft के साथ साझा किया जाएगा।"
                                                       " " [:a.link-button {:href   "https://www.microsoft.com/hi-in/servicesagreement/"
                                                                            :target "_blank"}
                                                            "Microsoft सेवा अनुबंध"] " की जाँच करें।"]
     :microsoft-365-permission/allow                  "Microsoft 365 को अनुमति दें"

     :notifications/info                              "OrgPad आपको कौन से ईमेल भेजता है, चुनें। हम आपको हमेशा महत्वपूर्ण परिवर्तनों के बारे में बताएंगे।"
     :notifications/any-email                         "OrgPad से कोई भी ईमेल"
     :notifications/email-verification                "साइन अप करने पर ईमेल सत्यापन, पासवर्ड रीसेट करने के लिए लिंक और आवश्यक भुगतान जानकारी"
     :notifications/monthly-newsletter                "OrgPad में अपडेट और हाल के विकास के साथ मासिक न्यूज़लेटर"
     :notifications/messages                          "अन्य लोगों से संदेश प्राप्त करें"
     :notifications/blocked-people                    "विशेष रूप से अवरुद्ध लोग:"
     :notifications/receipts                          "आपकी सदस्यता स्वचालित रूप से नवीनीकृत होने पर रसीदें"
     :notifications/receive-invitations               "अन्य लोगों से निमंत्रण प्राप्त करें"
     :notifications/unblock-user                      "इस व्यक्ति को अनब्लॉक करें"

     :onboarding/openable-units                       "केवल छाया वाले ऊंचे सेल खोले जा सकते हैं।"
     :onboarding/zoom                                 "ज़ूम करने के लिए स्क्रॉल करें"
     :onboarding/drag-canvas                          "खींचकर ले जाएं"
     :onboarding/open-units                           "छाया वाले सेलों में सामग्री होती है"

     :orgpage/creating-preview                        "पूर्वावलोकन बनाया जा रहा है..."
     :orgpage/change-information                      "जानकारी बदलें"
     :orgpage/copy-orgpage                            "एक नए OrgPage में कॉपी करें"
     :orgpage/delete-orgpage                          "OrgPage हटाएं"
     :orgpage/detail                                  "विवरण"
     :orgpage/share-tooltip                           "इस OrgPage को दूसरों के साथ साझा करें"
     :orgpage/share-orgpage                           "OrgPage साझा करें"
     :orgpage/show-information                        "जानकारी दिखाएं"
     :orgpage/zoom-in                                 "ज़ूम इन करें"
     :orgpage/zoom-out                                "ज़ूम आउट करें"
     :orgpage/create-unit-double-click                "एक सेल बनाने के लिए डबल क्लिक करें।"
     :orgpage/create-unit-hold-or-double-tap          "एक सेल बनाने के लिए दबाए रखें या डबल टैप करें।"
     :orgpage/switch-to-edit                          "संपादन मोड पर जाएं।"
     :orgpage/untitled                                "शीर्षकहीन OrgPage"
     :orgpage/title                                   "OrgPage शीर्षक"
     :orgpage/untitled-unit                           "शीर्षकहीन सेल"
     :orgpage/untitled-path                           "शीर्षकहीन प्रस्तुति"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "चरण" "चरण" "चरण"]}]
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (पृष्ठ {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (पृष्ठ {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "एक प्रतिलिपि "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title] " के रूप में उपलब्ध है"])
     :orgpage/change-color                            "इस OrgPage का रंग बदलें"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "यह OrgPage स्वचालित रूप से " label " के साथ "
                                                         (case permission
                                                           :permission/view "पढ़ने"
                                                           :permission/comment "टिप्पणी करने"
                                                           :permission/edit "संपादन")
                                                         " के लिए साझा किया गया है। " [:span.link-button {:on-click on-click} "यहां क्लिक करें"]
                                                         " साझाकरण रद्द करने के लिए।"])

     :orgpage-placement/activate                      "यहां देखें"

     :orgpage-print/displayed                         "ठीक वैसे ही जैसे प्रदर्शित किया गया है"
     :orgpage-print/displayed-info                    "आयत के अंदर सब कुछ ठीक वैसा ही मुद्रित होगा जैसा आप इसे देखते हैं।"
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPage सफलतापूर्वक "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] " में मुद्रित हो गया।"])
     :orgpage-print/estimated-time                    "इस PDF को प्रिंट करने में लगभग {orgpage-print/estimated-time} लगना चाहिए।"
     :orgpage-print/everything-closed                 "सभी सेल बंद"
     :orgpage-print/everything-closed-info            "मुद्रित PDF सभी सेलों को बंद दिखाता है।"
     :orgpage-print/fragment                          "एक स्थान"
     :orgpage-print/fragment-info                     "मुद्रित PDF चयनित स्थान को प्रदर्शित करता है।"
     :orgpage-print/gray                              "ग्रे पृष्ठभूमि"
     :orgpage-print/landscape                         "लैंडस्केप"
     :orgpage-print/orientation                       "अभिविन्यास"
     :orgpage-print/path-info                         [:i18n/plural " {orgpage-print/num-pages} {orgpage-print/page-label} के साथ।"
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "पृष्ठ" "पृष्ठ" "पृष्ठ"]}]
     :orgpage-print/portrait                          "पोर्ट्रेट"
     :orgpage-print/presentation                      "एक प्रस्तुति के चरण"
     :orgpage-print/presentation-info                 "प्रत्येक चरण एक अलग पृष्ठ पर मुद्रित होता है।"
     :orgpage-print/print                             "PDF में प्रिंट करें"
     :orgpage-print/size                              "आकार"
     :orgpage-print/started                           (str "हम इस OrgPage को PDF में प्रिंट कर रहे हैं। इसमें लगभग {orgpage-print/estimated-time} लगना चाहिए।"
                                                           " जब हो जाएगा, तो यह एक फ़ाइल के रूप में उपलब्ध होगा।")
     :orgpage-print/title                             "प्रिंट नाम"
     :orgpage-print/type                              "क्या मुद्रित किया जाता है"
     :orgpage-print/watermark                         "वॉटरमार्क शामिल करें"
     :orgpage-print/watermark-info                    "हटाने के लिए पेशेवर, विद्यालय या उद्यम में अपग्रेड करें।"
     :orgpage-print/white                             "सफेद पृष्ठभूमि"

     :orgpage-stats/number-of-units                   "सेलों की संख्या"
     :orgpage-stats/number-of-links                   "लिंक की संख्या"
     :orgpage-stats/number-of-files                   "फ़ाइलों की संख्या"
     :orgpage-stats/number-of-images                  "छवियों की संख्या"

     :org-role/student                                "छात्र"
     :org-role/teacher                                "शिक्षक"
     :org-role/employee                               "कर्मचारी"
     :org-role/admin                                  "प्रशासक"

     :panel/toggle-side-panel                         "साइड मेनू"
     :panel/create-orgpage                            "नया OrgPage"
     :panel/logo-tooltip                              "मुख्य पृष्ठ"
     :panel/edit-info                                 "संपादन पर स्विच करें जहां आप सेल और लिंक बना और हटा सकते हैं, सामग्री को संशोधित कर सकते हैं, और बहुत कुछ (F7)"
     :panel/comment-info                              (str "टिप्पणी करने पर स्विच करें जहां आप बना सकते हैं, संपादित कर सकते हैं और हटा सकते हैं"
                                                           " आपके सेल और लिंक लेकिन अन्य लोगों के सेल या लिंक को संपादित या हटा नहीं सकते हैं। "
                                                           "हालांकि, आप उन सेलों से लिंक कर सकते हैं जो आपके स्वामित्व में नहीं हैं। (F7)")
     :panel/read-info                                 "पढ़ने पर स्विच करें जहां कुछ भी नहीं बदला जा सकता है लेकिन सामग्री को ब्राउज़ करना आसान है (F6)"
     :panel/undo-deletion                             "हटाना पूर्ववत करें"
     :panel/undo-deletion-info                        [:i18n/plural "{delete/num-units} {delete/unit-label} और {delete/num-links} {delete/link-label} (CTRL+Z) के हटाने को वापस लाएं"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "सेल" "सेल" "सेल"]
                                                                :link-label [:delete/num-links
                                                                             "लिंक" "लिंक" "लिंक"]}]
     :panel/refresh                                   "ताज़ा करें"
     :panel/switch-style                              "नए सेलों और लिंक की शैली स्विच करें; एक नया सेल बनाने के लिए खींचें"
     :panel/profile                                   "प्रोफ़ाइल"
     :panel/settings                                  "सेटिंग्स"
     :panel/usergroups                                "टीमें"
     :panel/stats                                     "आँकड़े"
     :panel/administration                            "प्रशासन"
     :panel/ios-install-info                          "ऐप इंस्टॉल करें"
     :panel/upload-attachment                         "नए सेलों में छवियाँ या फ़ाइलें डालें"
     :panel/selection-mode                            "चयन शुरू करें"
     :panel/search                                    "खोज (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "वर्तमान स्थान में छिपे {panel/num-hidden-book-ids} {panel/unit-label} प्रकट करें"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids
                                                                            "सेल" "सेल" "सेल"]}]

     :password/too-short                              "कम से कम 8 वर्ण आवश्यक हैं"
     :password/different-passwords                    "पासवर्ड मेल नहीं खाते"

     :password-reset/back-to-list                     "सूची पर वापस जाएं"
     :password-reset/change-password                  "पासवर्ड बदलें"
     :password-reset/set-password                     "पासवर्ड सेट करें"
     :password-reset/has-password                     "आपके खाते में एक पासवर्ड सेट है।"
     :password-reset/without-password                 "अभी तक कोई पासवर्ड सेट नहीं है क्योंकि लॉगिन के लिए लिंक किए गए खातों का उपयोग किया गया था।"
     :password-reset/invalid-link                     "अमान्य लिंक, शायद 24 घंटे से अधिक पुराना है। कृपया ईमेल को फिर से भेजने के लिए कहें।"
     :password-reset/description                      "अपना नया पासवर्ड सेट करें।"
     :password-reset/enter-current-and-new-password   "वर्तमान पासवर्ड और नया पासवर्ड दर्ज करें।"
     :password-reset/enter-new-password               "नया पासवर्ड दर्ज करें।"

     :path/add-step                                   "चरण"
     :path/add-step-tooltip                           "ENTER या TAB; कैमरे की प्रतिलिपि बनाने के लिए SHIFT दबाए रखें"
     :path/hidden-ops                                 " और {path/num-hidden} और"
     :path/title                                      "प्रस्तुति का नाम"
     :path/default-title                              "प्रस्तुति {path/num-paths}"
     :path/copy                                       "एक नई प्रस्तुति में कॉपी करें"
     :path/copy-suffix                                "प्रतिलिपि"
     :path/add-audio                                  "ऑडियो को चरण से लिंक करें"
     :path/remove-audio                               "चरण से ऑडियो को अनलिंक करें"

     :paths/create-new-path                           "एक प्रस्तुति बनाएं"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "प्रस्तुति " [:b title] " हटाएं? "])
     :paths/help                                      "क्या दिखाना है बदलने के लिए कोशिकाएँ चुनें; अधिक जानकारी के लिए गाइड देखें।"

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "वर्तमान में " [:b tier " योजना"] " में, " [:b end-date] " तक वैध है।"
                                                         (if autorenewal
                                                           " भुगतान अवधि के अंत में सदस्यता स्वचालित रूप से नवीनीकृत हो जाएगी।"
                                                           " भुगतान अवधि के अंत में सदस्यता समाप्त हो जाएगी।")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "आपकी " [:b tier " योजना"] " " [:b end-date] " को समाप्त हो गई क्योंकि आपका नवीनीकरण भुगतान विफल हो गया।"
                                                         " यदि आप अपना भुगतान ठीक करते हैं, तो आपकी सदस्यता स्वचालित रूप से बढ़ा दी जाएगी।"])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " पर " name " की " [:b tier " योजना"] "।"])
     :payments/free-tier-info                         [:<> "OrgPad " [:b "निःशुल्क श्रेणी,"] " में बिना किसी भुगतान के उपयोग किया जाता है।"]
     :payments/no-teams                               "निःशुल्क श्रेणी में कोई टीम नहीं है।"
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "के लिए " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "अपग्रेड"] " या "])
                                                         [:a.link-button {:href period-url} "अपनी बिलिंग अवधि बदलना"]
                                                         ", हमसे संपर्क करें।"])
     :payments/choose-plan                            "योजना चुनें"
     :payments/manage-plan                            "योजना प्रबंधित करें"
     :payments/billing-address                        "बिलिंग पता"
     :payments/billing-address-info                   (str "दर्ज किया गया बिलिंग पता सभी नए चालानों पर उपयोग किया जाएगा।"
                                                           " हाल के चालान भी स्वचालित रूप से अपडेट किए जाते हैं।")
     :payments/receipt-label                          "रसीद {receipt/date-range}"
     :payments/customer-portal-failed                 "योजना प्रबंधन वेबसाइट लोड करते समय कुछ गलत हो गया।"

     :pending-activation/email-already-used           "ईमेल पहले से ही किसी अन्य खाते पर उपयोग में है।"
     :pending-activation/email-not-recieved           "कोई ईमेल नहीं? नीचे फिर से भेजें या बदलें।"
     :pending-activation/email-sent                   "सक्रियण ईमेल भेजा गया। "
     :pending-activation/instructions                 "लगभग हो गया! हमने आपको ईमेल द्वारा भेजे गए लिंक पर एक क्लिक के साथ अपना खाता सक्रिय करें।"
     :pending-activation/resend                       "सक्रियण ईमेल फिर से भेजें"

     :permission/admin                                "साझा और हटा सकते हैं"
     :permission/admin-tooltip                        "यह भी संशोधित कर सकते हैं कि दस्तावेज़ तक किसकी पहुंच है।"
     :permission/edit                                 "संपादित कर सकते हैं"
     :permission/edit-tooltip                         "OrgPage में कोई भी बदलाव कर सकते हैं।"
     :permission/comment                              "टिप्पणी कर सकते हैं"
     :permission/comment-tooltip                      (str "नए स्वामित्व वाले सेल बना सकते हैं, उन्हें कनेक्ट कर सकते हैं और उन्हें संशोधित कर सकते हैं। "
                                                           "OrgPage के बाकी हिस्सों को संशोधित नहीं कर सकते।")
     :permission/view                                 "पढ़ सकते हैं"
     :permission/view-tooltip                         "बिना कोई बदलाव किए OrgPage पढ़ सकते हैं।"

     :presentation/presentation                       "प्रस्तुति"
     :presentation/step                               "चरण"
     :presentation/present                            "प्रस्तुति शुरू करें"
     :presentation/slideshow                          "स्वचालित रूप से चरण चलाएं"
     :presentation/step-duration                      "सेकंड में चरण की अवधि"
     :presentation/loop-slideshow                     "अंत में दोहराएं"
     :presentation/respect-audio-track                "ऑडियो ट्रैक के अनुसार चरण की अवधि"
     :presentation/stop-slideshow                     "स्वचालित रूप से चलने वाले चरणों को रोकें"
     :presentation/exit-tooltip                       "प्रस्तुति से बाहर निकलें"
     :presentation/play-audio                         "इस चरण के लिए ऑडियो चलाएं"
     :presentation/pause-audio                        "ऑडियो चलाना रोकें"
     :presentation/share-presentation                 "इस प्रस्तुति को दूसरों के साथ साझा करें।"

     :pricing-popup/orgpages-exceeded-title           "आप मुफ्त योजना में और OrgPages नहीं बना सकते"
     :pricing-popup/orgpages-exceeded                 "आपको अपनी योजना को अपग्रेड करना होगा।"
     :pricing-popup/storage-exceeded-title            "{upload/total-size} अपलोड करने के लिए पर्याप्त जगह नहीं बची है"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "आपके भंडारण में केवल " [:b space-left " शेष"] " है।"
                                                         " आप अपने भंडारण का विस्तार करने के लिए अपनी योजना को अपग्रेड कर सकते हैं।"])
     :pricing-popup/num-shared-limit-reached-title    "आप इस OrgPage को और लोगों के साथ साझा नहीं कर सकते"
     :pricing-popup/num-shared-limit-reached-common   "इस OrgPage को साझा करने वाले लोगों की अधिकतम संख्या तक पहुंच गया है।"
     :pricing-popup/num-shared-limit-reached          [:<> " और लोगों को जोड़ने के लिए, आपको "
                                                       [:b "पेशेवर श्रेणी"] " में अपग्रेड करना होगा।"]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " इस OrgPage के स्वामी " owner " को और लोगों को जोड़ने के लिए "
                                                         [:b "पेशेवर श्रेणी"] " में अपग्रेड करना होगा।"])
     :pricing-popup/enable-teams-title                "टीमों को प्रबंधित करने के लिए अपनी योजना को अपग्रेड करें"
     :pricing-popup/enable-teams                      [:<> "टीमें लोगों को एक साथ समूहित करती हैं जो सहयोग और OrgPages साझा करना सरल बनाती है।"
                                                       " यह सुविधा केवल " [:b "मानक श्रेणी"] " या उच्चतर में सक्षम है।"]
     :pricing-popup/teams-limit-reached-title         "और टीमें बनाने के लिए अपनी योजना को अपग्रेड करें"
     :pricing-popup/teams-limit-reached               "आपकी योजना के लिए टीमों की संख्या की सीमा तक पहुंच गया है।"
     :pricing-popup/team-members-limit-reached-title  "आप {usergroup/name} में और सदस्य नहीं जोड़ सकते"
     :pricing-popup/team-members-limit-reached-common "टीम के सदस्यों की अधिकतम संख्या तक पहुंच गया है।"
     :pricing-popup/team-members-limit-reached        [:<> " और सदस्य जोड़ने के लिए, आपको "
                                                       [:b "पेशेवर श्रेणी"] " में अपग्रेड करना होगा।"]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " इस टीम के स्वामी " owner " को और सदस्य जोड़ने के लिए "
                                                         [:b "पेशेवर श्रेणी"] " में अपग्रेड करना होगा।"])
     :pricing-popup/try-out-share-title               "इस OrgPage को साझा करने के लिए साइन अप करें"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "आपके भंडारण में केवल " [:b space-left " शेष"] " है।"])
     :pricing-popup/free-account-info                 "साइन अप करके, आप मुफ्त में प्राप्त करते हैं:"
     :pricing-popup/free-limit                        "तीन OrgPages तक,"
     :pricing-popup/free-storage                      "100 एमबी तक का भंडारण,"
     :pricing-popup/free-share                        "दूसरों के साथ अपना काम साझा करना।"
     :pricing-popup/free-account-info2                "बस कुछ ही क्लिक में अपना खाता बनाएं।"

     :pricing-popup/register-to-comment               "अपनी टिप्पणियां जोड़ने के लिए साइन अप करें"
     :pricing-popup/register-to-comment-info          (str "टिप्पणी सेलों में आपका नाम और प्रोफ़ाइल फ़ोटो प्रदर्शित होगी।"
                                                           " उसके लिए आपको पहले अपना खाता बनाना होगा।")

     :pricing-popup/print-watermark-title             "कोई वॉटरमार्क नहीं के लिए अपनी योजना को अपग्रेड करें"
     :pricing-popup/print-watermark-info              (str "OrgPad.info वॉटरमार्क के बिना मुद्रण केवल"
                                                           " पेशेवर, विद्यालय और उद्यम योजनाओं में ही संभव है।")

     :profile/open-contact-dialog                     "संदेश भेजें"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str first-name " " last-name " से संपर्क करें")
                                                          "इस व्यक्ति से संपर्क करें"))
     :profile/contact-dialog-info                     (str "चूंकि हम OrgPad में अन्य लोगों के ईमेल पते साझा नहीं करते हैं, इसलिए हम यह संदेश आपके लिए भेजेंगे। "
                                                           "हम सीधा संपर्क प्रदान करने के लिए आपका नाम और ईमेल शामिल करेंगे।")

     :promotion/unknown                               "अज्ञात कोड"
     :promotion/max-usages-reached                    "उपयोग सीमा पूरी हो गई"
     :promotion/expired                               "समाप्त हो गया"
     :promotion/one-year-free                         "1 साल मुफ्त"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} मुफ्त"
                                                       {:promotion/days [:promotion/duration "दिन" "दिन" "दिन"]}]
     :promotion/for-one-year                          " 1 साल के लिए"
     :promotion/for-six-months                        " 6 महीने के लिए"

     :props/h1                                        "बड़ा शीर्षक"
     :props/h2                                        "मध्यम शीर्षक"
     :props/h3                                        "छोटा शीर्षक"
     :props/weight-none                               "सामान्य लिंक"
     :props/strong                                    "मजबूत लिंक"
     :props/arrowhead-none                            "कोई तीर नहीं"
     :props/single                                    "तीर"
     :props/double                                    "डबल तीर"

     :public-permission/none                          "निजी।"
     :public-permission/view                          "पढ़ने के लिए सभी के साथ साझा किया गया।"

     :registration/create-user                        "खाता बनाएं"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "पहले से ही एक खाता है? " [:a.link-button {:href route} "लॉग इन करें"]])
     :registration/options                            "साइन अप करने का दूसरा तरीका चुनें"
     :registration/server-error                       "सर्वर त्रुटि। फिर से खाता बनाने का प्रयास करें।"
     :registration/missing-oauth-email                "{registration/service} ने हमें आपका ईमेल नहीं बताया। कृपया इसे नीचे भरें।"

     :search/previous-match                           "पिछला मिलान (Page Up)"
     :search/next-match                               "अगला मिलान (Page Down)"
     :search/close                                    "बंद करें (ESC)"
     :search/cells-with-selected-attachments          "चयनित फ़ाइलों और छवियों वाले सेल।"

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "चयनित की शैली बदलें "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; वर्तमान सेट करने के लिए SHIFT दबाए रखें, वर्तमान में कॉपी करने के लिए CTRL दबाए रखें"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "सेल" "सेल" "सेल"]
                                                                   :link-label [:selection/num-links
                                                                                "लिंक" "लिंक" "लिंक"]}]

     :selection/link                                  "सेलों को कनेक्ट करें"
     :selection/hide-contents                         "सामग्री छिपाएं (ESC)"
     :selection/show-contents                         "सामग्री दिखाएं"
     :selection/force-closing                         "स्थान खोलते समय इन सामग्रियों को छिपाएं (ESC)"
     :selection/step-focus-camera                     "इस चरण के कैमरे को चुनी गई कोशिकाओं पर केंद्रित करें (F2 या Q); जोड़ने के लिए SHIFT दबाएँ, हटाने के लिए ALT दबाएँ।"
     :selection/fragment-focus-camera                 "स्थान के कैमरे को चुनी गई कोशिकाओं पर केंद्रित करें (F2 या Q); जोड़ने के लिए SHIFT दबाएँ, हटाने के लिए ALT दबाएँ।"
     :selection/step-show-books                       "इस चरण में केवल चुनी गई कोशिकाएँ दिखाएँ (F3 या W); जोड़ने के लिए SHIFT दबाएँ, हटाने के लिए ALT दबाएँ।"
     :selection/fragment-show-books                   "स्थान में केवल चुनी गई कोशिकाएँ दिखाएँ (F3 या W); जोड़ने के लिए SHIFT दबाएँ, हटाने के लिए ALT दबाएँ।"
     :selection/force-showing                         "पहले से छिपे हुए चयनित सेलों को प्रकट करें"
     :selection/share-units                           "चयनित इकाइयों को प्रदर्शित करने वाला एक लिंक कॉपी करें; इसके बजाय स्थान की सेटिंग्स खोलने के लिए SHIFT दबाए रखें"
     :selection/move-to-new-orgpage                   "एक नए OrgPage में ले जाएं"
     :selection/change-code-lang                      "कोड भाषा बदलें"
     :selection/copy-units-links                      "सेलों और लिंक को क्लिपबोर्ड पर कॉपी करें"
     :selection/flip-links                            "लिंक दिशाओं को पलटें"
     :selection/delete                                "चयनित हटाएं"

     :settings/profile                                "प्रोफ़ाइल"
     :settings/payments                               "भुगतान"
     :settings/account                                "खाता"
     :settings/linked-accounts                        "लिंक किए गए खाते"
     :settings/email                                  "सूचनाएं"
     :settings/account-description                    "अपना ईमेल, पासवर्ड बदलें या अपना खाता हटाएं।"
     :settings/stats-description                      "यहां आपके OrgPad उपयोग के बारे में कुछ आँकड़े दिए गए हैं।"
     :settings/change-email                           "ईमेल बदलें"
     :settings/change-email-text                      "नया ईमेल पता दर्ज करें। सुरक्षा कारणों से, हमें खाता अनलॉक करने से पहले इसे सत्यापित करना होगा।"
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "आपने ईमेल " [:b email] " का उपयोग करके अपने खाते के लिए साइन अप किया है।"])
     :settings/account-linked-to-facebook             [:<> "आपका खाता फेसबुक से " [:b "लिंक"] " है।"]
     :settings/account-not-linked-to-facebook         [:<> "आपका खाता फेसबुक से " [:b "लिंक नहीं"] " है।"]
     :settings/link-fb                                "फेसबुक लिंक करें"
     :settings/unlink-fb                              "फेसबुक अनलिंक करें"
     :settings/account-linked-to-google               [:<> " आपका खाता गूगल से " [:b "लिंक"] " है।"]
     :settings/account-not-linked-to-google           [:<> " आपका खाता गूगल से " [:b "लिंक नहीं"] " है।"]
     :settings/link-google                            "गूगल लिंक करें"
     :settings/unlink-google                          "गूगल अनलिंक करें"
     :settings/account-linked-to-microsoft            [:<> " आपका खाता माइक्रोसॉफ्ट से " [:b "लिंक"] " है।"]
     :settings/account-not-linked-to-microsoft        [:<> " आपका खाता माइक्रोसॉफ्ट से " [:b "लिंक नहीं"] " है।"]
     :settings/link-microsoft                         "माइक्रोसॉफ्ट लिंक करें"
     :settings/unlink-microsoft                       "माइक्रोसॉफ्ट अनलिंक करें"
     :settings/account-linked-to-cuni                 [:<> " आपका खाता चार्ल्स विश्वविद्यालय से " [:b "लिंक"] " है।"]
     :settings/account-not-linked-to-cuni             [:<> " आपका खाता चार्ल्स विश्वविद्यालय से " [:b "लिंक नहीं"] " है।"]
     :settings/link-cuni                              "चार्ल्स विश्वविद्यालय लिंक करें"
     :settings/unlink-cuni                            "चार्ल्स विश्वविद्यालय अनलिंक करें"
     :settings/set-password-text                      " अनलिंक करने से पहले पासवर्ड सेट करें।"
     :settings/linked-accounts-info                   "अपने फेसबुक, गूगल, माइक्रोसॉफ्ट या चार्ल्स विश्वविद्यालय खाते को OrgPad से लिंक करें ताकि आप उनका उपयोग लॉग इन करने के लिए कर सकें।"
     :settings/profile-info                           "दी गई जानकारी के साथ आपको किसी प्रोजेक्ट पर सह-कार्यकर्ताओं के लिए ढूंढना आसान होगा।"
     :settings/delete-account                         "खाता हटाएं"
     :settings/confirm-delete-account-question        [:<> [:b "स्थायी रूप से"] " अपना खाता हटाएं? "]
     :settings/confirm-delete-account-info            "यह आपके सभी OrgPages और उनके डेटा को हटा देगा।"
     :settings/delete-account-info                    [:<> "हटाने से आपके सभी OrgPages और उनके डेटा " [:b "स्थायी रूप से"] " हट जाएंगे।"]

     :share-orgpage/campaigns                         "अभियान"
     :share-orgpage/copied-to-clipboard               "क्लिपबोर्ड पर कॉपी किया गया"
     :share-orgpage/copy-template-link                "टेम्पलेट लिंक कॉपी करें"
     :share-orgpage/dialog-title                      "साझा करें {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "जिन लोगों के पास OrgPad खाता नहीं है, उन्हें एक लिंक के साथ एक निमंत्रण मिलेगा।"
                                                                  " लिंक खोलने के बाद, वे इस OrgPage को पढ़ सकते हैं। ")
                                                         [:a.link-button create-team "एक टीम बनाएं"]
                                                         " लोगों के समूह के साथ आसानी से OrgPages साझा करने के लिए।"])
     :share-orgpage/email-found                       "एक OrgPad खाता मिला।"
     :share-orgpage/email-unused                      "कोई OrgPad खाता नहीं मिला। इसके बजाय एक ईमेल आमंत्रण भेजें।"
     :share-orgpage/checking-email-address            "ईमेल पता जांचा जा रहा है..."
     :share-orgpage/invite-for-editing                "संपादन के लिए आमंत्रित करें"
     :share-orgpage/invite-for-viewing                "पढ़ने के लिए आमंत्रित करें"
     :share-orgpage/invite-by-email                   "क्या आप उन्हें एक विशिष्ट भाषा का उपयोग करके ईमेल द्वारा आमंत्रित करना चाहते हैं?"
     :share-orgpage/show-profile                      "प्रोफ़ाइल दिखाएं"
     :share-orgpage/links                             "लिंक"
     :share-orgpage/to-read                           "पढ़ने के लिए"
     :share-orgpage/to-comment                        "टिप्पणी करने के लिए"
     :share-orgpage/to-edit                           "संपादित करने के लिए"
     :share-orgpage/links-tooltip                     "साझा करने योग्य लिंक के माध्यम से पहुंच प्रदान करें"
     :share-orgpage/template                          "टेम्पलेट"
     :share-orgpage/template-tooltip                  "इस OrgPage की एक प्रतिलिपि स्वचालित रूप से बनाने वाले लिंक"
     :share-orgpage/template-info                     "लोग इस लिंक का उपयोग इस OrgPage की अपनी प्रतियां बनाने के लिए कर सकते हैं।"
     :share-orgpage/template-autoshare-none           "मेरे साथ प्रतियां साझा न करें।"
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "मेरे साथ प्रतियां "
                                                             (case template-autoshare
                                                               :permission/view "पढ़ने"
                                                               :permission/comment "टिप्पणी करने"
                                                               :permission/edit "संपादन") " के लिए साझा करें।"))
     :share-orgpage/embed                             "एम्बेड करें"
     :share-orgpage/embed-into-microsoft-teams        "Microsoft Teams में सन्निहित  करें"
     :share-orgpage/embed-into-website                "वेबसाइट या एप्लिकेशन में सन्निहित  करें"
     :share-orgpage/embed-tooltip                     "वेबसाइट या एप्लिकेशन में सन्निहित  करें"
     :share-orgpage/new-user-or-usergroup             "नाम, ईमेल या टीम"
     :share-orgpage/link-permission-start             "लोगों को अनुमति दें"
     :share-orgpage/link-permission-end               "यह OrgPage।"
     :share-orgpage/orgpage-info                      "जानकारी"
     :share-orgpage/orgpage-info-tooltip              "स्वामी और क्या OrgPage प्रकाशित है, के बारे में जानकारी"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "यह OrgPage आपके साथ "
                                                             (case user-permission
                                                               :permission/view "पढ़ने"
                                                               :permission/comment "टिप्पणी करने"
                                                               :permission/edit "संपादन") " के लिए साझा किया गया है।"))
     :share-orgpage/remove-yourself                   "खुद को हटाएं"
     :share-orgpage/private-info                      "केवल आप और वे लोग जिनके साथ आपने OrgPage को सीधे या एक लिंक के माध्यम से साझा किया है, पहुंच सकते हैं। प्रत्येक नया बनाया गया दस्तावेज़ निजी है।"
     :share-orgpage/publish-for-reading-info          "OrgPage सार्वजनिक है। इंटरनेट पर कोई भी इसे खोज और पढ़ सकता है। केवल आप या वे लोग जिनके साथ आपने OrgPage को संपादन के लिए साझा किया है, परिवर्तन कर सकते हैं।"
     :share-orgpage/publish-permission-end            "यह OrgPage है "
     :share-orgpage/publish                           "प्रकाशित करें"
     :share-orgpage/publish-confirmation              "हर कोई इस OrgPage को {orgpage/permission} कर सकेगा। क्या आप निश्चित हैं?"
     :share-orgpage/publish-tooltip                   "सभी को पहुंच प्रदान करें"
     :share-orgpage/remove-user                       "अनुमति हटाएं"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "यदि आपने गलती से कोई लिंक साझा कर दिया है, तो आप "
                                                         [:span.link-button reset-links "सभी पिछले लिंक को अमान्य करें"]
                                                         "।"])
     :share-orgpage/shareable-link                    "साझा करने योग्य लिंक"
     :share-orgpage/everything-closed                 "सभी सेल बंद प्रदर्शित करें"
     :share-orgpage/presentation                      "एक प्रस्तुति के साथ शुरू करें"
     :share-orgpage/fragment                          "एक स्थान प्रदर्शित करें"
     :share-orgpage/template-link-switch              "एक टेम्पलेट लिंक बनाएं।"
     :share-orgpage/user-not-registered               " ने अभी तक OrgPad के लिए साइन अप नहीं किया है।"
     :share-orgpage/users                             "लोग"
     :share-orgpage/users-tooltip                     "व्यक्तिगत लोगों को पहुंच प्रदान करें"

     :side-panel/about                                "हमारे बारे में"
     :side-panel/terms-and-conditions                 "नियम और शर्तें"
     :side-panel/privacy-and-security                 "गोपनीयता और सुरक्षा"
     :side-panel/files-and-images                     "फ़ाइलें और छवियाँ"
     :side-panel/paths                                "प्रस्तुतियाँ"
     :side-panel/fragments                            "स्थान"
     :side-panel/translate                            "अनुवाद करें"
     :side-panel/toggle-debug                         "डीबगर"
     :side-panel/help                                 "सहायता"
     :side-panel/blog                                 "ब्लॉग"
     :side-panel/home                                 "मुखपृष्ठ"
     :side-panel/import                               "आयात करें"
     :side-panel/share                                "साझा करें"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "फ़ाइलें" "फ़ाइल" "फ़ाइलें"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "छवियाँ" "छवि" "छवियाँ"]}]
     :side-panel/num-paths                            [:i18n/plural "{side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "प्रस्तुतियाँ" "प्रस्तुति" "प्रस्तुतियाँ"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "स्थान" "स्थान" "स्थान"]}]

     :step/closed-books                               "बंद सेल"
     :step/everything-closed                          "सब कुछ बंद है।"
     :step/hidden-books                               "छिपे हुए सेल"
     :step/nothing-changed                            "कुछ भी नहीं बदला।"
     :step/opened-pages                               "खुले पृष्ठ"
     :step/focused-books                              "कैमरे में दिखाए गए सेल"
     :step/shown-books                                "प्रकट सेल"
     :step/switched-pages                             "स्विच किए गए पृष्ठ"

     :style-select/set-comment                        "अपनी प्रोफ़ाइल छवि (CTRL+,) के साथ एक टिप्पणी सेल में बदलें"
     :style-select/unset-comment                      "प्रोफ़ाइल छवि (CTRL+,) को हटाकर एक सामान्य सेल में बदलें"
     :style-select/set-comment-safari                 "अपनी प्रोफ़ाइल छवि (SHIFT+CMD+,) के साथ एक टिप्पणी सेल में बदलें"
     :style-select/unset-comment-safari               "प्रोफ़ाइल छवि (SHIFT+CMD+,) को हटाकर एक सामान्य सेल में बदलें"

     :tag/public                                      "सार्वजनिक"

     :text-field/email                                "ईमेल"
     :text-field/first-name                           "पहला नाम"
     :text-field/last-name                            "अंतिम नाम"
     :text-field/name                                 "नाम"
     :text-field/new-password                         "नया पासवर्ड"
     :text-field/password                             "पासवर्ड"
     :text-field/content                              "सामग्री"
     :text-field/name-or-email                        "नाम या ईमेल"
     :text-field/subject                              "विषय"
     :text-field/message                              "संदेश"
     :text-field/phone-number                         "फ़ोन नंबर"
     :text-field/width                                "चौड़ाई"
     :text-field/height                               "ऊँचाई"

     :translate/title                                 "OrgPage {orgpage/title} को किसी अन्य भाषा में अनुवाद करें"
     :translate/info                                  (str "स्वचालित रूप से आपके स्वामित्व वाले इस OrgPage की एक प्रतिलिपि बनाता है"
                                                           " जिसे स्रोत भाषा से लक्ष्य में अनुवादित किया गया है"
                                                           " भाषा। आप इसे एक मिनट के भीतर अपनी सूची में पा सकते हैं।")
     :translate/source-lang                           "स्रोत भाषा"
     :translate/target-lang                           "लक्ष्य भाषा"
     :translate/translate                             "अनुवाद करें"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "अनुवाद "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title] " के रूप में उपलब्ध है"])

     :unit-editor/add-page                            "एक और पृष्ठ बनाएं (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "इस पृष्ठ को हटाएं"
     :unit-editor/previous-page                       (str "पिछला पृष्ठ (PAGEUP);"
                                                           " इस पृष्ठ को बाईं ओर ले जाने के लिए SHIFT दबाए रखें (SHIFT+PAGEUP);"
                                                           " इस पृष्ठ से पहले एक और पृष्ठ जोड़ने के लिए CTRL दबाए रखें (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "अगला पृष्ठ (PAGEDOWN);"
                                                           " इस पृष्ठ को दाईं ओर ले जाने के लिए SHIFT दबाए रखें (SHIFT+PAGEDOWN);"
                                                           " इस पृष्ठ के बाद एक और पृष्ठ जोड़ने के लिए CTRL दबाए रखें (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "इस पृष्ठ पर स्विच करें"
                                                             (when can-edit "; वर्तमान पृष्ठ को वहां ले जाने के लिए SHIFT दबाए रखें")))
     :unit-editor/hidden-info                         "लिखने के लिए क्लिक करें"
     :unit-editor/undo                                "पूर्ववत करें (CTRL+Z)"
     :unit-editor/redo                                "पुनः करें (CTRL+SHIFT+Z या CTRL+Y)"
     :unit-editor/toggle-bold                         "बोल्ड (CTRL+B)"
     :unit-editor/toggle-italic                       "इटैलिक (CTRL+I)"
     :unit-editor/toggle-strikethrough                "स्ट्राइकथ्रू"
     :unit-editor/toggle-subscript                    "सबस्क्रिप्ट (CTRL+S)"
     :unit-editor/toggle-superscript                  "सुपरस्क्रिप्ट (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "हाइपरलिंक बनाएं (CTRL+K)"
     :unit-editor/remove-hyperlink                    "हाइपरलिंक हटाएं"
     :unit-editor/set-highlighting                    "हाइलाइट रंग"
     :unit-editor/selection->code                     "कोड में बदलें (CTRL+D)"
     :unit-editor/toggle-list-ul                      "बुलेटेड सूची (TAB)"
     :unit-editor/toggle-list-ol                      "क्रमांकित सूची (CTRL+O)"
     :unit-editor/indent                              "इंडेंट बढ़ाएं (TAB)"
     :unit-editor/outdent                             "इंडेंट घटाएं (SHIFT+TAB)"
     :unit-editor/center                              "केंद्र संरेखित करें (CTRL+L)"
     :unit-editor/heading                             "शीर्षक (CTRL+G)"
     :unit-editor/embed-pdf                           "PDF सामग्री दिखाएं"
     :unit-editor/link-pdf                            "PDF सामग्री को उसके हाइपरलिंक से बदलें"
     :unit-editor/embed-office                        "Microsoft 365 का उपयोग करके दस्तावेज़ सामग्री दिखाएं"
     :unit-editor/link-office                         "दस्तावेज़ सामग्री को उसके हाइपरलिंक से बदलें"
     :unit-editor/embed-video                         "वीडियो प्लेयर प्रदर्शित करें"
     :unit-editor/link-video                          "वीडियो को उसके हाइपरलिंक से बदलें"
     :unit-editor/embed-audio                         "ऑडियो प्लेयर प्रदर्शित करें"
     :unit-editor/link-audio                          "ऑडियो को उसके हाइपरलिंक से बदलें"
     :unit-editor/hyperlink->embed                    "लिंक की गई वेबसाइट डालें"
     :unit-editor/embed->hyperlink                    "एम्बेडेड वेबसाइट को उसके हाइपरलिंक से बदलें"
     :unit-editor/open-image-in-attachments           "इस छवि को अनुलग्नकों की सूची में खोलें"
     :unit-editor/open-file-in-attachments            "इस फ़ाइल को अनुलग्नकों की सूची में खोलें"
     :unit-editor/toggle-controls                     "वीडियो प्लेयर नियंत्रण प्रदर्शित करें"
     :unit-editor/toggle-autoplay                     "स्वचालित रूप से चलाएं"
     :unit-editor/toggle-muted                        "म्यूट करके चलाएं, अन्यथा स्वचालित रूप से चलाना अवरुद्ध हो सकता है"
     :unit-editor/toggle-loop                         "लूप प्लेबैक"
     :unit-editor/toggle-chained-size                 "पहलू अनुपात बनाए रखें"
     :unit-editor/insert-menu                         "सम्मिलित करें"
     :unit-editor/insert-image                        "छवि"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "अपने डिवाइस से एक छवि अपलोड करें।"
     :unit-editor/insert-image-info2                  "सुझाव: छवियों को सीधे किसी भी सेल या ग्रे कैनवास में खींचें या पेस्ट करें।"
     :unit-editor/insert-camera                       "कैमरा"
     :unit-editor/insert-attachment                   "फ़ाइल"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "वीडियो"
     :unit-editor/insert-video-info                   "कंप्यूटर से एक वीडियो अपलोड करें या इसे YouTube से डालें।"
     :unit-editor/insert-video-info2                  "सुझाव: वीडियो और YouTube थंबनेल को सीधे किसी भी सेल या ग्रे कैनवास में खींचें।"
     :unit-editor/video-url                           "YouTube लिंक"
     :unit-editor/youtube-start                       "शुरू करें"
     :unit-editor/youtube-end                         "समाप्त करें"
     :unit-editor/insert-table                        "तालिका"
     :unit-editor/insert-table-info                   "डाली गई तालिका का आकार चुनें।"
     :unit-editor/toggle-table-border                 "तालिका सीमाएं दिखाएं"
     :unit-editor/add-row-before                      "ऊपर पंक्ति डालें"
     :unit-editor/add-row-after                       "नीचे पंक्ति डालें"
     :unit-editor/remove-current-row                  "पंक्ति हटाएं"
     :unit-editor/add-column-before                   "पहले कॉलम डालें"
     :unit-editor/add-column-after                    "बाद में कॉलम डालें"
     :unit-editor/remove-current-column               "कॉलम हटाएं"
     :unit-editor/remove-table                        "तालिका हटाएं"
     :unit-editor/insert-website                      "वेबसाइट"
     :unit-editor/insert-website-info                 (str "आप वेबसाइटों को सीधे एक सेल में एम्बेड कर सकते हैं।"
                                                           " यदि यह काम नहीं करता है, तो यह वेबसाइट के स्वामी द्वारा अवरुद्ध किया जा सकता है।")
     :unit-editor/website-url-or-code                 "वेबसाइट का पता या कोड"
     :unit-editor/website-id                          "वेबसाइट आईडी"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "के लिए उपयोग किया जाता है "
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "वेबसाइटों के बीच संदेश भेजना"] "."])
     :unit-editor/invalid-website-url                 "अमान्य वेबसाइट पता या कोड"
     :unit-editor/invalid-video-url                   "अमान्य वीडियो पता"
     :unit-editor/update-website                      "वेबसाइट का पता बदलें"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "कोड"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "कोड कॉपी करें"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "एक अलग पैराग्राफ के रूप में कोड"
     :unit-editor/toggle-block-math                   "एक अलग लाइन पर गणित"
     :unit-editor/remove-code                         "कोड स्वरूपण हटाएं"
     :unit-editor/insert-math                         "गणित / रसायन विज्ञान"

     :unit-panel/link                                 (str "कनेक्ट करने के लिए क्लिक करें या खींचें;"
                                                           " कई कनेक्शन बनाने के लिए SHIFT दबाए रखें;"
                                                           " सेलों की एक श्रृंखला बनाने के लिए CTRL दबाए रखें")
     :unit-panel/upload-attachment                    "इस सेल में छवि या फ़ाइल डालें"
     :unit-panel/change-link-style                    (str "इस सेल की शैली बदलें; "
                                                           "वर्तमान सेट करने के लिए SHIFT दबाए रखें, "
                                                           "डिफ़ॉल्ट पर कॉपी करने के लिए CTRL दबाए रखें; "
                                                           "इस शैली में कनेक्ट करने के लिए खींचें")
     :unit-panel/hide-content                         "सामग्री छिपाएं"
     :unit-panel/delete-unit                          "सेल हटाएं"

     :usergroup/create                                "एक टीम बनाएं"
     :usergroup/edit-title                            "{usergroup/name} संपादित करें"
     :usergroup/info                                  "OrgPages साझा करना सरल बनाने के लिए अपने दोस्तों और सहकर्मियों की टीमें बनाएं और प्रबंधित करें।"
     :usergroup/delete                                "टीम हटाएं"
     :usergroup/members                               "सदस्य"
     :usergroup/edit                                  "टीम का नाम और लोगो बदलें"
     :usergroup/show-actions                          "क्रियाएं दिखाएं"
     :usergroup/name                                  "नाम"
     :usergroup/hide-orgpages                         "साझा किए गए OrgPages छिपाएं"
     :usergroup/hide-orgpages-tooltip                 "उन्हें फ़िल्टर में टीम को चालू करके प्रदर्शित किया जा सकता है"
     :usergroup/hide-in-filter                        "फ़िल्टर में छिपाएं"
     :usergroup/create-info                           "टीम का नाम और प्रोफ़ाइल चित्र केवल टीम के सदस्यों को दिखाई देता है।"
     :usergroup/confirm-delete                        [:<> [:b "स्थायी रूप से"] " इस टीम को हटाएं? "]
     :usergroup/members-title                         "{usergroup/name} के सदस्य"
     :usergroup/remove-member                         "टीम से हटाएं"
     :usergroup/remove-admin                          "व्यवस्थापक हटाएं"
     :usergroup/make-admin                            "व्यवस्थापक बनाएं"
     :usergroup/admin-tooltip                         "एक व्यवस्थापक सदस्यों का प्रबंधन कर सकता है और टीम को हटा सकता है।"
     :usergroup/copy-usergroup                        "टीम कॉपी करें"

     :usergroup-role/owner                            "स्वामी"
     :usergroup-role/admin                            "प्रशासक"
     :usergroup-role/member                           "सदस्य"

     :wire-transfer/title                             "वार्षिक {wire-transfer/tier} योजना के लिए तार हस्तांतरण"
     :wire-transfer/info                              "जब हम आपके पैसे हमारे खाते में प्राप्त करेंगे तो हम आपकी वार्षिक सदस्यता को सक्रिय कर देंगे।"
     :wire-transfer/used-currency                     "{wire-transfer/currency} में भुगतान"
     :wire-transfer/recipient-name                    "प्राप्तकर्ता का नाम"
     :wire-transfer/account-number                    "खाता संख्या"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "राशि"
     :wire-transfer/payment-purpose                   "भुगतान का उद्देश्य"
     :wire-transfer/qr-code-common                    (str "सही जानकारी को स्वचालित रूप से भरने के लिए अपने बैंकिंग ऐप से इस भुगतान QR कोड को स्कैन करें।")
     :wire-transfer/cz-sk-qr-code-description         (str " यह एक QR कोड है जो आमतौर पर चेकिया और स्लोवाकिया में तार हस्तांतरण के लिए उपयोग किया जाता है।")
     :wire-transfer/eu-qr-code-description            (str " यह एक QR कोड है जो आमतौर पर यूरोपीय संघ में SEPA हस्तांतरण के लिए उपयोग किया जाता है।")
     :wire-transfer/trial-info                        (str "आप OrgPad का पूरी तरह से तुरंत उपयोग करने के लिए एक बार की 7-दिवसीय सदस्यता शुरू कर सकते हैं।"
                                                           " जब बैंक भुगतान सफल होने की पुष्टि करता है,"
                                                           " सदस्यता अवधि 1 वर्ष बढ़ा दी जाएगी।")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " यदि आपके कोई प्रश्न या कठिनाइयां हैं, तो कृपया हमें बताएं"
                                                         " " [:a.link-button {:href url} "इस फ़ॉर्म को भरकर"] "।"])
     :wire-transfer/success-text                      [:<> "हमने एक " [:b "एक बार की 7-दिवसीय सदस्यता"] " सक्रिय कर दी है"
                                                       " ताकि आप तुरंत नई योजना के साथ OrgPad का उपयोग कर सकें। "]
     :wire-transfer/common-result-text                (str "जब बैंक भुगतान सफल होने की पुष्टि करता है,"
                                                           " सदस्यता अवधि 1 वर्ष बढ़ा दी जाएगी।")
     :wire-transfer/start-trial                       "तार हस्तांतरण भेजा गया"
     :wire-transfer/start-trial-result-title          "भुगतान के लिए धन्यवाद"
     :wire-transfer/copy                              "क्लिपबोर्ड पर कॉपी करें"

     :website-editor/settings                         "सेटिंग्स"
     :website-editor/routes                           "मार्ग"
     :website-editor/menus                            "मेनू"
     :website-editor/create-menu                      "मेनू बनाएं"
     :website-editor/edited-menu                      "संपादित मेनू"
     :website-editor/untitled-menu                    "शीर्षकहीन मेनू"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "बच्चे" "बच्चा" "बच्चे"]}]
     :website-editor/delete-menu-item                 "इस मेनू आइटम को हटाएं"
     :website-editor/add-menu-item                    "मेनू आइटम जोड़ें"
     :website-editor/menu-item-label                  "आइटम लेबल"
     :menu-item/path-type                             "एक मार्ग खोलता है"
     :menu-item/url-type                              "एक बाहरी URL खोलता है"
     :menu-item/children-type                         "एक सबमेनू खोलता है"
     :website-editor/menu-item-path                   "मार्ग"

     :youtube-placement/watch-on-prefix               (str "देखें" unicode/nbsp "पर")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/hi dict)