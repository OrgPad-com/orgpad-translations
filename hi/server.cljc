(ns orgpad.server.i18n.hi
  (:require [orgpad.common.i18n.dict.hi :as hi]
            [orgpad.common.company :as company]))

(def dict
  (merge
    hi/dict
    {:orgpage/untitled                    "शीर्षक रहित दस्तावेज़"
     :orgpage/copy                        "प्रतिलिपि"

     :permission/view                     "केवल पढ़ें"
     :permission/edit                     "संपादित करें"

     :subscription/monthly                "मासिक"
     :subscription/yearly                 "वार्षिक"

     :email/greeting                      "प्रिय {{customer}},"
     :email/signature                     "शुभकामनाएं"
     :email/team                          "Pavel Klavík and Kamila Klavíková"
     :email/creators                      "OrgPad निर्माता"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". क्या आपको ये ईमेल पसंद नहीं हैं? "
                                                  [:a href-unsubscribe "सदस्यता समाप्त करें"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "यदि आपको कोई समस्या आती है, तो कृपया हमें "
                                                  [:a {:href (str "{{domain}}" url)} "इन-ऐप फ़ॉर्म"]
                                                  " का उपयोग करके या " company/support-email-link " पर ईमेल भेजकर बताएं।"))
     :email/or                            " या "
     :email/customer                      "ग्राहक"

     :verification/subject                "अपने OrgPad खाते को सत्यापित करें"
     :verification/preheader              "OrgPad में आपका स्वागत है। कृपया नीचे दिए गए बटन पर क्लिक करके अपने खाते को सत्यापित करें।"
     :verification/heading                "अपना ईमेल सत्यापित करें"
     :verification/body                   "अपने खाते को सत्यापित करने के लिए, कृपया नीचे दिए गए बटन पर क्लिक करें। बटन पर क्लिक करके, आप OrgPad के "
     :verification/terms-and-conditions   "नियम और शर्तों"
     :verification/button                 "ईमेल पते की पुष्टि करें"
     :verification/accidental-email       "यदि आपको यह ईमेल गलती से मिला है, तो कृपया इसे हटा दें। यदि आपको ये ईमेल बार-बार मिलते हैं, तो कृपया हमसे संपर्क करें "

     :password-reset/subject              "अपना OrgPad पासवर्ड रीसेट करें"
     :password-reset/preheader            "नीचे दिए गए बटन पर क्लिक करके अपना OrgPad पासवर्ड रीसेट करें।"
     :password-reset/heading              "अपना OrgPad पासवर्ड रीसेट करें"
     :password-reset/body                 "अपना पासवर्ड रीसेट करने के लिए कृपया नीचे दिए गए बटन पर क्लिक करें। यह 24 घंटे के लिए वैध है।"
     :password-reset/button               "पासवर्ड रीसेट करें"
     :password-reset/accidental-email     "यदि आपने अपना पासवर्ड रीसेट करने के लिए नहीं कहा है या आपको अब बदलने की आवश्यकता नहीं है, तो आपको कुछ भी करने की आवश्यकता नहीं है।"

     :new-subscription/subject            "नई सदस्यता की पुष्टि"
     :new-subscription/preheader          "OrgPad के साथ आपकी {{tier}} योजना अब सक्रिय है। सदस्यता हर {{period}} में स्वचालित रूप से नवीनीकृत हो जाएगी।"
     :new-subscription/body               "OrgPad के साथ आपकी {{tier}} योजना अब सक्रिय है। आपके भुगतान के लिए धन्यवाद!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "आगे बढ़ते हुए, सदस्यता हर {{period}} में स्वचालित रूप से नवीनीकृत हो जाएगी। आपकी रसीदें स्वचालित रूप से OrgPad सेटिंग्स में "
                                                  [:a {:href (str "{{domain}}" url)} "भुगतान अनुभाग"] " में संग्रहीत की जाती हैं।"))

     :new-payment/subject                 "भुगतान सफल हुआ"
     :new-payment/preheader               "आपने {{tier}} योजना की अपनी सदस्यता को {{subscription-end}} तक नवीनीकृत कर दिया है।"
     :new-payment/body                    (list "आपने {{tier}} योजना की अपनी सदस्यता को सफलतापूर्वक नवीनीकृत कर दिया है। यह "
                                                [:b "{{subscription-end}}"] " तक वैध है। आपके भुगतान के लिए धन्यवाद!")
     :new-payment/button                  "चालान डाउनलोड करें"

     :payment-failed/subject              "सदस्यता भुगतान विफल रहा"
     :payment-failed/preheader            "कृपया जांचें कि आपका कार्ड वैध है और उसमें पर्याप्त धनराशि है। यदि समस्या बनी रहती है, तो हमसे संपर्क करें।"
     :payment-failed/body                 (str "आपके OrgPad सदस्यता के भुगतान में समस्या आई है।"
                                               " कृपया जांचें कि आपका कार्ड वैध है और उसमें पर्याप्त धनराशि है।")
     :payment-failed/button               "भुगतान विधि अपडेट करें"
     :payment-failed/grace-warning        (list "आपकी वर्तमान सदस्यता "
                                                [:b "{{subscription-end}}"]
                                                " तक सक्रिय है। यदि आप इस तिथि तक सदस्यता शुल्क का भुगतान नहीं करते हैं, तो आपका खाता"
                                                " मुफ्त योजना में डाउनग्रेड कर दिया जाएगा। आप अभी भी अपने डेटा तक पहुंच, संपादन, हटाने और साझा करने में सक्षम होंगे।")

     :feedback/subject                    "प्रश्न: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} ने प्रश्न {{title}} भेजा है"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) ने प्रश्न {{title}} भेजा है"

     :invitation/subject                  "आपको OrgPad में एक दस्तावेज़ {{action}} के लिए आमंत्रित किया गया है"
     :invitation/preheader                "{{user}} ने आपको {{title}} {{action}} के लिए आमंत्रित किया है। कृपया इसे खोलने के लिए नीचे दिए गए बटन पर क्लिक करें।"
     :invitation/heading                  "{{user}} ने आपको {{title}} {{action}} के लिए आमंत्रित किया है"
     :invitation/body                     "OrgPad बड़ी तस्वीर के लिए दृश्य दस्तावेज़ बनाने का एक मंच है। निम्नलिखित बटन पर क्लिक करके, आप निमंत्रण स्वीकार करते हैं और दस्तावेज़ खोलते हैं।"
     :invitation/button                   "दस्तावेज़ खोलें"
     :invitation/accidental-email         "यदि आपको यह ईमेल गलती से मिला है, तो कृपया इसे हटा दें। यदि आपको ये ईमेल बार-बार मिलते हैं, तो आप "
     :invitation/block-user               "{{user}} से निमंत्रण ब्लॉक करें"
     :invitation/block-all                "सभी निमंत्रण ब्लॉक करें"

     :contact-user/subject                "OrgPad के माध्यम से आपसे संपर्क किया गया है"
     :contact-user/preheader              "{{user}} से संदेश"
     :contact-user/heading                "{{user}} ({{reply-to}}) OrgPad के माध्यम से आपसे संपर्क कर रहा है"
     :contact-user/body                   (str "यह ईमेल हमारी ओर से है क्योंकि हम आपका ईमेल पता किसी और के साथ साझा नहीं करते हैं। आप संदेश का जवाब "
                                               "इस संदेश का जवाब देकर या {{reply-to}} पर ईमेल करके दे सकते हैं।")
     :contact-user/unsolicited-info       "यदि संदेश अवांछित है, तो आप "
     :contact-user/block-user             "{{user}} से सभी संदेश ब्लॉक करें"
     :contact-user/block-all              "OrgPad में सभी लोगों से सभी संदेश ब्लॉक करें।"

     :blog/rss-description                "OrgPad और तकनीकी चर्चाओं के लिए नवीनतम समाचार और अपडेट।"

     :newsletter-2024-summer/subject      "OrgPad से ग्रीष्मकालीन अपडेट"
     :newsletter-2024-summer/preheader    "हमारे नवीनतम ऐप अपडेट, नए ब्लॉग, बेहतर गोपनीयता उपायों और बहुत कुछ के बारे में जानें!"
     :newsletter-2024-summer/introduction "एक साल के अंतराल के बाद हम एक और न्यूज़लेटर के साथ वापस आ गए हैं!"
     :newsletter-2024-summer/heading      "आप इस न्यूज़लेटर में पाएंगे:"
     :newsletter-2024-summer/body         (list [:li "साल की शुरुआत से ऐप में नया क्या है?"]
                                                [:li "आप हमारे नए ब्लॉग पर क्या पाएंगे?"]
                                                [:li "हम आपकी गोपनीयता और आपके डेटा की सुरक्षा का ध्यान कैसे रखते हैं?"]
                                                [:li "आपकी सुविधा के लिए हमने नियम और शर्तों को कैसे अपडेट किया है?"]
                                                [:li "समुदाय में क्यों शामिल हों?"])
     :newsletter-2024-summer/button       "न्यूज़लेटर पढ़ें"
     :newsletter-2024-summer/closing      "हम आपके विचारों की प्रतीक्षा कर रहे हैं!"}))
