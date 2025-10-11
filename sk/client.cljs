(ns orgpad.client.i18n.dicts.sk
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.sk :as sk]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  (merge
    sk/dict
    {:address/company                                 "Názov firmy"
     :address/ico                                     "IČO"
     :address/street                                  "Ulica"
     :address/street-number                           "Číslo"
     :address/postal-code                             "PSČ"
     :address/city                                    "Mesto"
     :address/country                                 "Krajina"

     :administration/page-title                       "Administrácia – OrgPad"

     :attachments/allows-access-to-file               "Povoľuje prístup k tomuto súboru."
     :attachments/allows-access-to-image              "Povoľuje prístup k tomuto obrázku."
     :attachments/no-preview                          "Náhľad nedostupný"
     :attachments/all-files                           "Všetky súbory"
     :attachments/used-files                          "Súbory v OrgStránke"
     :attachments/unused-files                        "Súbory na boku"
     :attachments/all-images                          "Všetky obrázky"
     :attachments/used-images                         "Obrázky v OrgStránke"
     :attachments/unused-images                       "Obrázky na boku"
     :attachments/uploading-files                     "Nahrávanie súborov …"
     :attachments/previous-attachment                 "Predchádzajúci súbor alebo obrázok"
     :attachments/next-attachment                     "Nasledujúci súbor alebo obrázok"
     :attachments/display-using-microsoft-365         "Zobraziť pomocou Microsoft 365"
     :attachments/edit-filename                       "Premenovať"
     :attachments/title-order                         "Abecedne podľa názvu"
     :attachments/upload-order                        "Najnovšie navrchu"
     :attachments/size-order                          "Najväčšie navrchu"
     :attachments/split-used-unused                   "Zoskupiť podľa prítomnosti v OrgStránke"
     :attachments/search                              "Vyhľadávanie"
     :attachments/ordering                            "Zoradenie"
     :attachments/new-version                         "Nová verzia"
     :attachments/preserve-old-version                "Ponechať starú verziu"
     :attachments/in-other-orgpages                   "Nahradiť v iných OrgStránkach:"

     :button/back                                     "Späť"
     :button/cancel                                   "Zrušiť"
     :button/close                                    "Zavrieť"
     :button/comment                                  "Komentovať"
     :button/continue                                 "Pokračovať"
     :button/copied                                   "Skopírované"
     :button/copy                                     "Kopírovať"
     :button/copy-link                                "Kopírovať odkaz"
     :button/create                                   "Vytvoriť"
     :button/create-tooltip                           "Vytvoriť (CTRL+ENTER)"
     :button/delete                                   "Odstrániť"
     :button/delete-selected                          "Odstrániť vybrané"
     :button/documentation                            "Dokumentácia"
     :button/download                                 "Stiahnuť"
     :button/download-all                             "Stiahnuť všetko"
     :button/drop                                     "Pustiť"
     :button/edit                                     "Upraviť"
     :button/import                                   "Importovať"
     :button/insert                                   "Vložiť"
     :button/login                                    "Prihlásiť sa"
     :button/logout                                   "Odhlásiť sa"
     :button/publish                                  "Zverejniť"
     :button/read                                     "Čítať"
     :button/register                                 "Zaregistrovať sa"
     :button/register-to-save                         "Zaregistrovať sa pre uloženie"
     :button/remove                                   "Odstrániť"
     :button/reset                                    "Resetovať"
     :button/save                                     "Uložiť zmeny"
     :button/save-tooltip                             "Uložiť zmeny (CTRL+ENTER)"
     :button/upload                                   "Nahrať"
     :button/upload-from-computer                     "Nahrať z počítača"
     :button/send                                     "Odoslať"
     :button/present                                  "Prezentovať"
     :button/present-tooltip                          "Spustiť prezentáciu (F5)"
     :button/share                                    "Zdieľať"
     :button/start                                    "Spustiť"
     :button/exit                                     "Ukončiť"
     :button/show-password                            "Zobraziť"
     :button/hide-password                            "Skryť"

     :checkout/currency                               "Mena"
     :checkout/monthly                                "mesačný"
     :checkout/yearly                                 "ročný (ušetríte 15 %)"
     :checkout/failed-to-init                         "Pri načítavaní webovej stránky pokladne sa niečo pokazilo."
     :checkout/upgrade-plan                           "Povýšte predplatné"
     :checkout/professional-plan                      "Profesionálne predplatné"
     :checkout/school-plan                            "Školské predplatné"
     :checkout/enterprise-plan                        "Firemné predplatné"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Škola"] " alebo "
                                                         [:a.link-button {:href enterprise-url} "firma"] "? Kontaktujte nás pre individuálnu ponuku."])
     :checkout/pay-with-credit-card                   "Zaplatiť kartou"
     :checkout/pay-with-wire-transfer                 "Zaplatiť bankovým prevodom"
     :checkout/promo-code                             "Promo kód"
     :checkout/try-for-free                           "Vyskúšať zadarmo"
     :checkout/activate-now                           "Aktivovať teraz"
     :checkout/continue-for-free                      "Pokračovať zadarmo"

     :code-lang/none                                  "Žiadny"
     :code-lang/multiple                              "Viac"

     :dashboard/confirm-delete                        [:<> [:b "Trvale"] " odstrániť túto OrgStránku?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> "Aby ste mohli vytvoriť novú OrgStránku, "
                                                         [:a {:href login-url} "prihláste sa"] " alebo "
                                                         [:a {:href register-url} "sa zaregistrujte"] "."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "Predplatné vašej školy " name " vypršalo dňa " subscription-expired ". "
                                                         "Pre obnovenie kontaktujte vaše vedenie. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Viac informácií"] " o 95% zľave pre školy."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Získajte pre svoju školu OrgPad bez obmedzení s 95% zľavou. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Viac informácií."]])
     :dashboard/owned-orgpages                        "Moje"
     :dashboard/public-orgpages                       "Zverejnené OrgStránky"
     :dashboard/shared-orgpages                       "Zdieľané so mnou"
     :dashboard/usergroup-orgpages                    "Tím {usergroup/name}"
     :dashboard/help-or-inspiration-button            "Nech sa páči!"
     :dashboard/new-domain                            [:<> "Používajte novú doménu " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Viac informácií v OrgStránke " [:a {:href "https://orgpad.info/s/nova-domena"} "Změny v OrgPadu a nová doména"] "."]

     :dashboard-filter/filter                         "Filtrovanie OrgStránok"
     :dashboard-filter/ordering                       "Zoradenie OrgStránok"
     :dashboard-filter/filter-and-ordering            "Filtrovanie a zoradenie OrgStránok"
     :dashboard-filter/title                          "Filtrovanie a zoradenie zobrazených OrgStránok"
     :dashboard-filter/ordering-label                 "Zoradenie OrgStránok"
     :dashboard-filter/title-order                    "Abecedne podľa názvu"
     :dashboard-filter/creation-time-order            "Najnovšie navrchu"
     :dashboard-filter/last-modified-order            "Posledne upravené navrchu"
     :dashboard-filter/most-viewed-order              "Najviac zobrazené navrchu"
     :dashboard-filter/search-tags                    "Vyhľadávanie štítkov"

     :embedding-code/code                             "Kód"
     :embedding-code/description                      "Vložte OrgStránku do webovej stránky alebo inej aplikácie."

     :error/orgpage-access-denied                     "Nemáte prístup k tejto OrgStránke. Skúste sa prihlásiť."
     :error/usergroup-access-denied                   "Povolenia na úpravu tímu zamietnuté."
     :error/administration-access                     "Prístup do administrácie zamietnutý."
     :error/creation-unauthorized                     "Pre vytvorenie OrgStránky sa prihláste."
     :error/deleting-denied                           "Odstránenie OrgStránky zamietnuté."
     :error/email-already-used                        "E-mail sa už používa."
     :error/email-not-registered                      "Žiadny účet s týmto e-mailom."
     :error/email-missing-mx-record                   "Na tejto doméne sa nenašiel žiadny e-mailový server."
     :error/email-invalid                             "Nie je e-mail."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Nesprávna OrgStránka" (when id " {orgpage/id}")
                                                             ". Nesprávne skopírovaný odkaz?"))
     :error/incorrect-link                            "Nesprávny odkaz. Buď sa prihláste, alebo otvorte správny odkaz."
     :error/incorrect-password                        "Nesprávne heslo"
     :error/incorrect-profile-id                      "Nesprávny odkaz na profil. Nesprávne skopírovaný odkaz?"
     :error/lost-permission                           "Stratený prístup k tejto OrgStránke."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "E-maily bez účtu: " emails))
     :error/name-already-used                         "Názov sa už používa."
     :error/name-not-valid                            "Použite aspoň 5 znakov."
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "OrgStránka " (when title "„{orgpage/title}“")
                                                             " bola odstránená."))
     :error/owner-of-orgpage                          "Osoba je už vlastníkom tejto OrgStránky."
     :error/profile-not-found                         "Profil sa nenašiel."
     :error/unknown-error                             "Neznáma chyba, skúste to znova."
     :error/unknown-id                                "Neznáma OrgStránka."
     :error/unknown-login-or-email                    "Neznámy e-mail alebo login tímu."
     :error/unknown-usergroup                         "Tím bol odstránený."
     :error/upload-failed                             "Nepodarilo sa nahrať OrgStránku: „{orgpage/title}“"

     :export/show                                     "Exportovať OrgStránku"
     :export/title                                    "Exportovať {orgpage/title}"
     :export/info                                     "Vyberte formát, v ktorom sa má táto OrgStránka exportovať."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " formát používaný OrgPadom"]
     :export/html                                     "Lineárny HTML súbor"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " formát"]
     :export/generate                                 "Generovať export"

     :feedback/ask-question                           "Položiť otázku"
     :feedback/hide-button                            "Trvale skryť tlačidlo"
     :feedback/dialog-title                           "Kontaktujte tvorcov OrgPadu"
     :feedback/description                            [:<> "Ak potrebujete pomoc alebo máte nejaký problém, dajte nám vedieť – "
                                                       [:b "tvorcom OrgPadu"] ". "
                                                       "Uvítame aj akékoľvek nápady na zlepšenie. "
                                                       "Odpovieme vám e-mailom čo najskôr."]
     :feedback/languages                              "Môžete nám písať v angličtine, češtine a nemčine."
     :feedback/contact-when-problem-persists          [:<> " Ak problém pretrváva, kontaktujte nás prosím na "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Bankový prevod"
                                                             (when currency
                                                               (str " v " (name currency))) " pre "
                                                             "ročný"
                                                             (if (= tier "standard")
                                                               " štandardné"
                                                               " profesionálne")
                                                             " predplatné"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Napíšte nám vašu " [:b "fakturačnú adresu"] ", akékoľvek ďalšie informácie k faktúre."
                                                         " Čoskoro vás budeme kontaktovať na vašej e-mailovej adrese " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Chcem si kúpiť predplatné pre svoju " (case org-type
                                                                                                      :feedback/school-plan "školu"
                                                                                                      :feedback/enterprise-plan "firmu"
                                                                                                      "organizáciu")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Použite tento formulár na kontaktovanie zástupcu firmy OrgPad s.r.o."
                                                         " Čoskoro sa vám ozveme na vami zadané telefónne číslo alebo e-mailovú adresu (" email
                                                         "). Môžete nám tiež zavolať na "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Povýšte moje predplatné na profesionálne predplatné"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Napíšte nám, ako by sme mali zmeniť vaše existujúce predplatné a akékoľvek ďalšie informácie."
                                                         " Čoskoro vás budeme kontaktovať na vašej e-mailovej adrese " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Zmeniť fakturačné obdobie na " (if (= period "yearly")
                                                                                               "ročnú"
                                                                                               "mesačnú") " fakturáciu"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Zmena sa uskutoční po skončení aktuálneho fakturačného obdobia."
                                                         " Pri ročnej fakturácii je zľava 15 %."
                                                         " Čoskoro vás budeme kontaktovať na vašej e-mailovej adrese " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str "Názov " (case org-type
                                                                        :feedback/school-plan "školy"
                                                                        :feedback/enterprise-plan "firmy"
                                                                        "organizácie")))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Pozícia v rámci " (case org-type
                                                                                  :feedback/school-plan "školy"
                                                                                  :feedback/enterprise-plan "firmy"
                                                                                  "organizácie")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str "Webová stránka " (case org-type
                                                                                 :feedback/school-plan "školy"
                                                                                 :feedback/enterprise-plan "firmy"
                                                                                 "organizácie")))

     :fragment/fragment                               "Lokácia"
     :fragment/text-id                                "Kód"
     :fragment/title                                  "Názov"
     :fragment/create                                 "Vytvoriť lokáciu"
     :fragment/create-tooltip                         "TAB; podržte SHIFT pre skopírovanie vybranej lokácie"
     :fragment/remove                                 "Odstrániť lokáciu"
     :fragment/share                                  "Kopírovať odkaz na túto lokáciu"
     :fragment/text-id-required                       "Kód je povinný."
     :fragment/text-id-already-used                   "Kód sa už používa."
     :fragment/closed-books                           "Zatvorené bunky; CTRL+klik pre výber"
     :fragment/hidden-books                           "Skryté bunky; CTRL+klik pre výber"
     :fragment/opened-pages                           "Otvorené stránky; CTRL+klik pre výber"
     :fragment/focused-books                          "Bunky zobrazené v kamere; CTRL+klik pre výber"
     :fragment/shown-books                            "Odhalené bunky; CTRL+klik pre výber"

     :info/uploading-attachments                      [:i18n/plural "Nahrávanie {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "súborov" "súbor" "súbory" "súborov"]}]
     :info/uploading-images                           [:i18n/plural "Nahrávanie {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "obrázkov" "obrázok" "obrázky" "obrázkov"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Nepodarilo sa nahrať {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "obrázkov" "obrázok" "obrázky" "obrázkov"]}]
                                                          "Nepodarilo sa nahrať aspoň jeden obrázok."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} videí z YouTube {info/num-youtubes} sa nenašlo."
                                                       {:info/num-youtubes [:info/count "videí" "video" "videá" "videí"]}]
     :info/uploading-attachments-failed               "Nahrávanie súborov zlyhalo."
     :info/presentation-link-copied                   "Odkaz na túto prezentáciu bol skopírovaný."
     :info/max-orgpages-exceeded                      "Vlastník tejto OrgStránky nemôže vytvoriť ďalšiu OrgStránku."
     :info/storage-exceeded                           "Vlastník tejto OrgStránky nemá na nahratie týchto súborov {upload/total-size} voľného miesta."
     :info/attachments-too-large                      (str "Nie je možné nahrať {upload/total-size} v jednom nahrávaní."
                                                           " Maximálna veľkosť všetkých nahraných príloh je 500 MB.")
     :info/drop-info                                  "Presuňte do ľubovoľnej bunky alebo na sivé plátno a vytvorte novú bunku."
     :info/audio-not-allowed                          "Prehrávanie zvuku je zablokované. Kliknite na tlačidlo prehrávania."
     :info/audio-not-supported                        "Formát zvuku nie je podporovaný."

     :import/another-format                           [:<> "Ak chcete importovať svoje existujúce dáta v inom formáte, kontaktujte nás na "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Importujte svoje dáta"
     :import/google-docs                              "Ak chcete importovať dáta z Microsoft Office alebo Google Docs, stačí ich vložiť zo schránky do OrgStránky."
     :import/supported-formats                        "Teraz podporujeme nasledujúce formáty:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exportovaný ako .vsdx súbor."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " súbor."]

     :ios/install-info                                "Nainštalujte aplikáciu OrgPad"
     :ios/share-button                                "1. Otvoríte"
     :ios/add-to-home-screen                          "2. Ťuknite"

     :lang/cs                                         "Česky"
     :lang/de                                         "Nemčina"
     :lang/en                                         "Anglicky"
     :lang/es                                         "Španělsky"
     :lang/fr                                         "Francouzsky"
     :lang/hi                                         "Hindsky"
     :lang/pl                                         "Polsky"
     :lang/ru                                         "Rusky"
     :lang/uk                                         "Ukrajinsky"

     :lang-select/tooltip                             "Jazyk aplikácie (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "Chýba vám váš jazyk? Pomôžte nám "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "preložením OrgPadu"] "."]

     :limit/of                                        " z "
     :limit/orgpages                                  " OrgStránok"
     :limit/people                                    " ľudí"
     :limit/teams                                     [:i18n/plural "{limit/team-label}"
                                                       {:limit/team-label [:limit/num-teams
                                                                           "tímov" "tím" "tímy" "tímov"]}]
     :limit/team-members                              " členov"
     :limit/orgpages-tooltip                          (str "V predplatnom zadarmo je počet OrgStránok obmedzený."
                                                           " Pre vytváranie viacerých OrgStránok prejdite na vyššie predplatné.")
     :limit/shares-tooltip                            (str "Počet ľudí, s ktorými môžete túto OrgStránku priamo zdieľať, je obmedzený."
                                                           " Pre zdieľanie s neobmedzeným počtom ľudí prejdite na profesionálne predplatné.")
     :limit/teams-tooltip                             (str "V štandardnom predplatnom je počet vlastnených tímov obmedzený."
                                                           " Pre vytváranie neobmedzeného počtu tímov prejdite na profesionálne predplatné.")
     :limit/teams-members-tooltip                     (str "V štandardnom predplatnom má každý tím obmedzený počet členov."
                                                           " Pre vytváranie neobmedzene veľkých tímov prejdite na profesionálne predplatné.")
     :limit/attachments-size                          (str "Celková veľkosť nahraných súborov a obrázkov je obmedzená,"
                                                           " ale môže byť navýšená prechodom na vyššie predplatné.")
     :limit/attachments-size-clickable                (str "Celková veľkosť nahraných súborov a obrázkov je obmedzená."
                                                           " Kliknite pre navýšenie limitu prechodom na vyššie predplatné.")
     :limit/attachments-size-try-out                  (str "Celková veľkosť všetkých nahraných súborov a obrázkov je obmedzená."
                                                           " Ak chcete navýšiť limit na 100 MB, kliknite a vytvorte si účet.")

     :limits/max-orgpages                             [:i18n/plural "{limit/document-label}"
                                                       {:limit/document-label [:limit/num
                                                                               "dokumentov" "dokument" "dokumenty" "dokumentov"]}]
     :limits/max-storage                              "úložiska"
     :limits/max-teams                                [:i18n/plural "{limit/team-label}"
                                                       {:limit/team-label [:limit/num-teams
                                                                           "tímov" "tím" "tímy" "tímov"]}]
     :limits/of                                       " z"
     :limits/max-team-members                         [:i18n/plural "{limit/member-label}"
                                                       {:limit/member-label [:limit/num
                                                                             "členov" "člen" "členov" "členov"]}]
     :limits/priority-support                         "prioritná podpora"

     :link-panel/flip                                 "Otočiť smer"
     :link-panel/insert-unit-in-middle                "Vložiť bunku do stredu"
     :link-panel/delete                               "Odstrániť spoj"
     :link-panel/change-link-style                    "Zmeniť štýl spoja; podržte SHIFT pre nastavenie aktuálneho, podržte CTRL pre skopírovanie do aktuálneho; ťahnutím vyrobiť spoj v tomto štýle"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Vypočítavanie veľkostí všetkých buniek, " [:span#autoresize-num-units num-units] " zostáva …"])
     :loading/initial-layout                          "Zlepšovanie počiatočného rozloženia …"
     :loading/restoring-opened-pages                  "Obnovovanie polohy otvorených stránok …"
     :loading/getting-orgpage                         "Sťahovanie OrgStránky zo servera …"
     :loading/getting-dashboard                       "Sťahovanie zoznamu dostupných OrgStránok zo servera …"
     :loading/getting-website                         "Sťahovanie webovej stránky zo servera …"
     :loading/getting-blog                            "Sťahovanie blogu zo servera …"
     :loading/uploading-orgpage                       "Nahrávanie OrgStránky na server …"
     :loading/ws-init                                 "Nastavovanie pripojenia k serveru …"
     :loading/ws-closed                               "Pripojenie k serveru bolo zatvorené, pokúšam sa znova pripojiť. Ak problém pretrváva, obnovte stránku."
     :loading/administration                          "Načítavanie administratívnych údajov …"
     :loading/profile                                 "Načítavanie profilu …"
     :loading/style                                   "Načítavanie štýlov …"
     :loading/start-trial                             "Spúšťame 7-dňové skúšobné predplatné …"
     :loading/uploading-attachments                   "Nahrávanie príloh na server …"

     :login/continue-with-email                       "Pokračovať e-mailom"
     :login/continue-with-facebook                    "Pokračovať pomocou Facebooku"
     :login/continue-with-google                      "Pokračovať pomocou Google"
     :login/continue-with-microsoft                   "Pokračovať pomocou Microsoftu"
     :login/continue-with-cuni                        "Pokračovať cez Karlovu univerzitu"
     :login/email-sent                                "E-mail odoslaný. Kliknite na odkaz v e-maile."
     :login/forgotten-password                        "Zabudnuté heslo"
     :login/forgotten-password-email-resent           "E-mail na obnovenie hesla už bol odoslaný."
     :login/forgotten-password-description            "Získajte odkaz na obnovenie hesla e-mailom (platný 24 hodín)."
     :login/forgotten-password-error                  [:<> "Túto e-mailovú adresu ste zablokovali. Odblokujte ju kliknutím na „Odhláste sa“ v akomkoľvek e-maile od OrgPadu, alebo nám pošlite e-mail na "
                                                       company/support-email-app-link " z tejto e-mailovej adresy."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Ste v OrgPade nový? " [:a.link-button {:href route} "Zaregistrujte sa"]])
     :login/options                                   "Vyberte si iný spôsob prihlásenia"
     :login/send-reset-link                           "Odoslať odkaz na obnovenie"
     :login/wrong-email-or-password                   "E-mail alebo heslo je nesprávne."

     :markdown/title                                  "Je vložený text formátovaný pomocou Markdownu?"
     :markdown/info                                   "Vo vašom vloženom obsahu bolo zistené formátovanie Markdownu. Chcete použiť jeho formátovanie?"
     :markdown/remember                               "Zapamätať si do obnovenia"
     :markdown/insert                                 "Použiť formátovanie Markdownu"
     :markdown/ignore                                 "Ponechať pôvodné"

     :meta/title                                      "Názov OrgStránky"
     :meta/orgpage-thumbnail                          "Obrázok OrgStránky"
     :meta/automatic-screenshot-start                 "Automaticky generovaná snímka pre "
     :meta/automatic-screenshot-refresh               "Aktualizuje sa päť minút po každej zmene."
     :meta/custom-thumbnail                           "Vlastný nahraný obrázok s veľkosťou 1360x768."
     :meta/upload-thumbnail                           "Nahrať vlastný obrázok"
     :meta/thumbnail-upload-failed                    "Nepodarilo sa nahrať obrázok."
     :meta/description                                "Popis"
     :meta/new-tags                                   "Štítok"
     :meta/tag-too-long                               (str "Maximálna dĺžka štítku je " common-orgpage/max-tag-length " znakov.")
     :meta/too-many-tags                              (str "Povolených je najviac " common-orgpage/max-tags " štítkov.")
     :meta/info                                       (str "Tieto údaje sa zobrazia v zozname OrgStránok, "
                                                           "pri vkladaní OrgStránky a pri jej zdieľaní na sociálnych sieťach.")
     :meta/info-in-share-orgpage                      "Pred zdieľaním tejto OrgStránky je potrebné nastaviť názov."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Presunúť vybrané {selection/num-units} {selection/units-label} "
                                                                         "a {selection/num-links} {selection/links-label} do novej OrgStránky "
                                                                         "s nasledujúcimi informáciami. V aktuálnej OrgStránke budú tieto bunky a spoje nahradené "
                                                                         "jednou bunkou, ktorá bude obsahovať novú OrgStránku vo vnútri.")
                                                       {:selection/units-label [:selection/num-units "buniek" "bunka" "bunky" "buniek"]
                                                        :selection/links-label [:selection/num-links "spojov" "spoj" "spoje" "spojov"]}]
     :meta/info-title                                 "Informácie – {meta/title}"
     :meta/info-title-only                            "Pomenujte OrgStránku"
     :meta/details                                    "Podrobnosti"
     :meta/preview                                    "Náhľad"
     :meta/init-fragments                             "Východisková lokácia"
     :meta/init-fragments-info                        (str "Pri otvorení OrgStránky si môžete zvoliť východiskovú lokáciu. "
                                                           "Pre mobilné zariadenia je možné špecifikovať inú východiskovú lokáciu.")
     :meta/desktop-init-fragment                      "Lokácia pre počítač"
     :meta/mobile-init-fragment                       "Lokácia pre mobil"
     :meta/everything-closed                          "Všetky bunky sú zatvorené"
     :meta/everything-closed-lowercase                "všetky bunky sú zatvorené"
     :meta/more-details                               "Viac informácií"
     :meta/move-to-new-orgpage-title                  "Presunúť do {meta/title}"
     :meta/move-to-new-orgpage                        "Presunúť do novej OrgStránky"

     :microsoft-365-permission/title                  "Povoliť prístup k tomuto dokumentu službe Microsoft 365?"
     :microsoft-365-permission/info                   [:<> "Dokument Office je možné zobraziť pomocou služby Microsoft 365."
                                                       " Kliknutím na súhlasím bude váš dokument zdieľaný so spoločnosťou Microsoft."
                                                       " Skontrolujte " [:a.link-button {:href   "https://www.microsoft.com/sk-sk/servicesagreement/"
                                                                                         :target "_blank"}
                                                                         "Zmluvu o poskytovaní služieb spoločnosti Microsoft"] "."]
     :microsoft-365-permission/allow                  "Povoliť zdieľanie s Microsoft 365"

     :notifications/info                              "Vyberte, ktoré e-maily vám bude OrgPad posielať. O dôležitých zmenách vás budeme vždy informovať."
     :notifications/any-email                         "Akýkoľvek e-mail od OrgPadu"
     :notifications/email-verification                "Overenie e-mailu pri registrácii, odkazy na obnovenie hesla a dôležité informácie o platbách"
     :notifications/monthly-newsletter                "Mesačný newsletter s novinkami a nedávnym vývojom v OrgPade"
     :notifications/messages                          "Dostávajte správy od ostatných ľudí"
     :notifications/blocked-people                    "Výslovne zablokovaní ľudia:"
     :notifications/receipts                          "Účty pri automatickom obnovení predplatného"
     :notifications/receive-invitations               "Dostávajte pozvánky od ostatných ľudí"
     :notifications/unblock-user                      "Odblokujte túto osobu"

     :onboarding/openable-units                       "Otvoriť sa dajú iba vyvýšené bunky s tieňmi."
     :onboarding/zoom                                 "Približujte sa kolieskom myši"
     :onboarding/drag-canvas                          "Pohybujte sa ťahaním"
     :onboarding/open-units                           "Bunky s tieňmi majú obsah"

     :orgpage/creating-preview                        "Vytváranie náhľadu …"
     :orgpage/change-information                      "Zmeniť informácie"
     :orgpage/copy-orgpage                            "Kopírovať do novej OrgStránky"
     :orgpage/delete-orgpage                          "Odstrániť OrgStránku"
     :orgpage/detail                                  "Podrobnosti"
     :orgpage/share-tooltip                           "Zdieľajte túto OrgStránku s ostatnými"
     :orgpage/share-orgpage                           "Zdieľanie OrgStránky"
     :orgpage/show-information                        "Zobraziť informácie"
     :orgpage/zoom-in                                 "Priblíženie"
     :orgpage/zoom-out                                "Oddialenie"
     :orgpage/create-unit-double-click                "Dvojklikom vytvorte bunku."
     :orgpage/create-unit-hold-or-double-tap          "Podržaním alebo dvojitým poklepaním vytvorte bunku."
     :orgpage/switch-to-edit                          "Prepnúť na úpravy"

     :orgpage/untitled                                "OrgStránka bez názvu"
     :orgpage/title                                   "Názov OrgStránky"
     :orgpage/untitled-unit                           "Nepomenovaná jednotka"
     :orgpage/untitled-path                           "Nepomenovaná prezentácia"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "krokov" "krok" "kroky" "krokov"]}]
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (stránka {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (stránka {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Kópia je dostupná ako "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Zmeniť farbu tejto OrgStránky"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Táto OrgStránka je automaticky zdieľaná s " label " pre "
                                                         (case permission
                                                           :permission/view "čítanie"
                                                           :permission/comment "komentovanie"
                                                           :permission/edit "editovanie"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Kliknite sem"]
                                                         " pre zrušenie zdieľania."])

     :orgpage-placement/activate                      "Prezerať tu"

     :orgpage-print/displayed                         "Presne ako zobrazené"
     :orgpage-print/displayed-info                    "Všetko vnútri obdĺžnika bude vytlačené presne tak, ako to vidíte."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgStránka úspešne vytlačená ako "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "Tlač tohto súboru PDF by mala trvať približne {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Všetky bunky zatvorené"
     :orgpage-print/everything-closed-info            "Tlačené PDF zobrazuje všetky bunky zatvorené."
     :orgpage-print/fragment                          "Lokácia"
     :orgpage-print/fragment-info                     "Tlačené PDF zobrazuje vybranú lokáciu."
     :orgpage-print/gray                              "Sivé pozadie"
     :orgpage-print/landscape                         "Na šírku"
     :orgpage-print/orientation                       "Orientácia"
     :orgpage-print/path-info                         [:i18n/plural " o {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "stránok" "stránka" "stránky" "stránok"]}]
     :orgpage-print/portrait                          "Na výšku"
     :orgpage-print/presentation                      "Kroky prezentácie"
     :orgpage-print/presentation-info                 "Každý krok je vytlačený na samostatnú stránku."
     :orgpage-print/print                             "Vytlačiť do PDF"
     :orgpage-print/size                              "Veľkosť"
     :orgpage-print/started                           (str "Tlačíme túto OrgStránku do PDF, bude to trvať približne {orgpage-print/estimated-time}."
                                                           " Keď to bude hotové, bude k dispozícii na stiahnutie ako súbor.")
     :orgpage-print/title                             "Názov tlače"
     :orgpage-print/type                              "Čo vytlačiť"
     :orgpage-print/watermark                         "Pridať vodoznak"
     :orgpage-print/watermark-info                    "Pre odstránenie povýšte na profesionálne, školské alebo firemné predplatné."
     :orgpage-print/white                             "Biele pozadie"

     :orgpage-stats/number-of-units                   "Počet buniek"
     :orgpage-stats/number-of-links                   "Počet spojov"
     :orgpage-stats/number-of-files                   "Počet súborov"
     :orgpage-stats/number-of-images                  "Počet obrázkov"

     :org-role/student                                "Žiak"
     :org-role/teacher                                "Učiteľ"
     :org-role/employee                               "Zamestnanec"
     :org-role/admin                                  "Správca"

     :panel/toggle-side-panel                         "Bočné menu"
     :panel/create-orgpage                            "Nová OrgStránka"
     :panel/logo-tooltip                              "Ísť na hlavnú stránku"
     :panel/edit-info                                 "Prepnúť na úpravy, kde môžete vytvárať a odstraňovať bunky a spoje, upravovať obsah a ďalšie (F7)"
     :panel/comment-info                              (str "Prepnúť na komentovanie, kde môžete vytvárať, upravovať a odstraňovať"
                                                           " vlastné bunky, ale nemôžete upravovať a odstraňovať cudzie bunky."
                                                           " Napriek tomu môžete vytvárať spoje na cudzie bunky. (F7)")
     :panel/read-info                                 "Prepnúť na čítanie, kde nič nemôže byť zmenené, ale prehliadanie obsahu je jednoduchšie (F6)"
     :panel/undo-deletion                             "Vrátiť odstránenie"
     :panel/undo-deletion-info                        [:i18n/plural "Vrátiť odstránenie {delete/num-units} {delete/unit-label} a {delete/num-links} {delete/link-label} (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "buniek" "bunka" "bunky" "buniek"]
                                                                :link-label [:delete/num-links
                                                                             "spojov" "spoj" "spoje" "spojov"]}]
     :panel/refresh                                   "Obnoviť"
     :panel/switch-style                              "Prepnúť štýl nových buniek a spojov; ťahaním vyrobiť novú bunku"
     :panel/profile                                   "Profil"
     :panel/settings                                  "Nastavenia"
     :panel/usergroups                                "Tímy"
     :panel/stats                                     "Štatistiky"
     :panel/administration                            "Administrácia"
     :panel/ios-install-info                          "Nainštalovať aplikáciu"
     :panel/upload-attachment                         "Vložte obrázky alebo súbory do nových buniek"
     :panel/selection-mode                            "Začať výber"
     :panel/search                                    "Vyhľadávanie (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Zobraziť {panel/num-hidden-book-ids} {panel/unit-label} v aktuálnej lokácii"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids "buniek skrytých" "bunka skrytá"
                                                                            "bunky skryté" "buniek skrytých"]}]


     :password/too-short                              "Aspoň 8 znakov"
     :password/different-passwords                    "Heslá sa nezhodujú"

     :password-reset/back-to-list                     "Späť na zoznam"
     :password-reset/change-password                  "Zmeniť heslo"
     :password-reset/set-password                     "Nastaviť heslo"
     :password-reset/has-password                     "Váš účet má nastavené heslo."
     :password-reset/without-password                 "Žiadne heslo zatiaľ nie je nastavené, pretože ste na prihlásenie použili prepojené účty."
     :password-reset/invalid-link                     "Neplatný odkaz, možno je starší ako 24 hodín. Prosím, požiadajte o opätovné zaslanie e-mailu."
     :password-reset/description                      "Nastavte nové heslo"
     :password-reset/enter-current-and-new-password   "Vložte súčasné heslo a nové heslo."
     :password-reset/enter-new-password               "Vložte nové heslo."

     :path/add-step                                   "Krok"
     :path/add-step-tooltip                           "ENTER alebo TAB; podržte SHIFT pre skopírovanie kamery"
     :path/title                                      "Názov prezentácie"
     :path/default-title                              "Prezentácia {path/num-paths}"
     :path/hidden-ops                                 " a {path/num-hidden} ďalších"
     :path/copy                                       "Kopírovať do novej prezentácie"
     :path/copy-suffix                                "kópia"
     :path/add-audio                                  "Pripojiť zvuk ku kroku"
     :path/remove-audio                               "Odpojiť zvuk od kroku"

     :paths/create-new-path                           "Vytvoriť prezentáciu"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Odstrániť prezentáciu " [:b title] " ?"])
     :paths/help                                      "Vyberte bunky, aby ste zmenili, čo sa zobrazuje; podrobnosti nájdete v návode."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Aktuálne " [:b tier] " predplatné je platné do " [:b end-date] "."
                                                         (if autorenewal
                                                           " Predplatné bude na konci platobného obdobia automaticky obnovené."
                                                           " Predplatné vyprší na konci platobného obdobia.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Vaše " [:b tier] " predplatné skončilo " [:b end-date] ", pretože sa nepodarila platba za automatickú obnovu."
                                                         " Ak opravíte vaše platobné údaje, vaše predplatné sa automaticky predĺži."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " v " [:b tier " predplatnom"] " z " name "."])
     :payments/free-tier-info                         [:<> "OrgPad používate v " [:b "predplatnom zadarmo"] "."]
     :payments/no-teams                               "Tímy nie sú dostupné v predplatnom zadarmo."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Pre " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "povýšenie"] " alebo "])
                                                         [:a.link-button {:href period-url} "zmenu platobného obdobia"]
                                                         ", nás prosím kontaktujte."])
     :payments/choose-plan                            "Vybrať predplatné"
     :payments/manage-plan                            "Spravovať predplatné"
     :payments/billing-address                        "Fakturačná adresa"
     :payments/billing-address-info                   (str "Zadaná fakturačná adresa bude použitá na všetkých nových faktúrach."
                                                           " Nedávno vystavené faktúry sa tiež automaticky aktualizujú.")
     :payments/receipt-label                          "Účtenka {receipt/date-range}"
     :payments/customer-portal-failed                 "Pri načítavaní webovej stránky správy predplatného sa niečo pokazilo."

     :pending-activation/email-already-used           "E-mail sa už používa na inom účte."
     :pending-activation/email-not-recieved           "E-mail vám neprišiel? Pošlite si ho znova alebo zmeňte adresu nižšie."
     :pending-activation/email-sent                   "Aktivačný e-mail odoslaný. "
     :pending-activation/instructions                 "Už ste skoro v cieli! Aktivujte si svoj účet jedným kliknutím na odkaz, ktorý sme vám zaslali na váš e-mail."
     :pending-activation/resend                       "Znova zaslať aktivačný e-mail"

     :permission/admin                                "Môže zdieľať a odstraňovať"
     :permission/admin-tooltip                        "Môže meniť, kto bude mať prístup k OrgStránke, alebo ju celú odstrániť."
     :permission/edit                                 "Môže upravovať"
     :permission/edit-tooltip                         "Môže robiť akékoľvek úpravy v OrgStránke."
     :permission/comment                              "Môže komentovať"
     :permission/comment-tooltip                      (str "Môže vytvárať, upravovať a prepájať vlastné bunky. "
                                                           "Nemôže ale upravovať zvyšok OrgStránky.")
     :permission/view                                 "Môže čítať"
     :permission/view-tooltip                         "Môže OrgStránku čítať, ale nemôže robiť žiadne zmeny."

     :presentation/presentation                       "Prezentácia"
     :presentation/step                               "Krok"
     :presentation/present                            "Spustiť prezentáciu"
     :presentation/slideshow                          "Automaticky prehrávať kroky"
     :presentation/step-duration                      "Dĺžka kroku v sekundách"
     :presentation/loop-slideshow                     "Opakovať na konci"
     :presentation/respect-audio-track                "Dĺžka kroku podľa zvukovej stopy"
     :presentation/stop-slideshow                     "Zastaviť automatické prehrávanie krokov"
     :presentation/exit-tooltip                       "Ukončiť prezentáciu"
     :presentation/play-audio                         "Prehrať zvuk pre tento krok"
     :presentation/pause-audio                        "Pozastaviť prehrávanie zvuku"


     :presentation/share-presentation                 "Zdieľajte túto prezentáciu s ostatnými."

     :pricing-popup/orgpages-exceeded-title           "V bezplatnom predplatnom nemôžete vytvoriť viac OrgStránok."
     :pricing-popup/orgpages-exceeded                 "Musíte povýšiť svoje predplatné."
     :pricing-popup/storage-exceeded-title            "Nedostatok miesta na nahratie {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Zostáva iba " [:b space-left] " miesta vo vašom úložisku."
                                                         " Povýšením svojho predplatného môžete úložný priestor rozšíriť."])
     :pricing-popup/num-shared-limit-reached-title    "Túto OrgStránku nemôžete zdieľať s viacerými ľuďmi."
     :pricing-popup/num-shared-limit-reached-common   "Bol dosiahnutý maximálny počet ľudí zdieľajúcich túto OrgStránku."
     :pricing-popup/num-shared-limit-reached          [:<> " Ak chcete pridať viac ľudí, musíte povýšiť na "
                                                       [:b "profesionálne predplatné"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Vlastník tejto OrgStránky " owner " musí pre pridanie ďalších ľudí povýšiť na "
                                                         [:b "profesionálne predplatné"] "."])
     :pricing-popup/enable-teams-title                "Povyšte svoje predplatné na správu tímov."
     :pricing-popup/enable-teams                      [:<> "Tímy zoskupujú ľudí, čo zjednodušuje spoluprácu a zdieľanie OrgStránok."
                                                       " Táto funkcia je dostupná v " [:b "štandardnej úrovni"] " alebo vyššej."]
     :pricing-popup/teams-limit-reached-title         "Povyšte svoje predplatné na vytváranie viacerých tímov."
     :pricing-popup/teams-limit-reached               "Limit pre počet tímov bol dosiahnutý vo vašom predplatnom."
     :pricing-popup/team-members-limit-reached-title  "Nemôžete pridať viac členov do {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Bol dosiahnutý maximálny počet členov tímov."
     :pricing-popup/team-members-limit-reached        [:<> " Ak chcete pridať viac členov, musíte povýšiť na "
                                                       [:b "profesionálne predplatné"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> "Vlastník tohto tímu " owner " musí pre pridanie ďalších členov povýšiť na "
                                                         [:b "profesionálne predplatné"] "."])
     :pricing-popup/try-out-share-title               "Pre zdieľanie tejto OrgStránky sa zaregistrujte"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Vo vašom úložisku z " [:b space-left] " zostáva."])
     :pricing-popup/free-account-info                 "S registráciou účtu zadarmo dostanete:"
     :pricing-popup/free-limit                        "až tri OrgStránky,"
     :pricing-popup/free-storage                      "až 100 MB úložiska,"
     :pricing-popup/free-share                        "zdieľanie vašej práce s ostatnými."
     :pricing-popup/free-account-info2                "Vytvorte si svoj účet len na niekoľko kliknutí."

     :pricing-popup/register-to-comment               "Pre pridanie vašich komentárov sa zaregistrujte"
     :pricing-popup/register-to-comment-info          (str "Komentárové bunky budú obsahovať vaše meno a profilovú fotku."
                                                           " Preto si najprv musíte vytvoriť účet.")

     :pricing-popup/print-watermark-title             "Pre odstránenie vodoznakov povyšte svoje predplatné"
     :pricing-popup/print-watermark-info              (str "Tlač bez vodoznakov OrgPad.info je možná iba v profesionálnom,"
                                                           " školskom a firemnom predplatnom.")

     :profile/open-contact-dialog                     "Poslať správu"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Kontaktujte " first-name " " last-name)
                                                          "Kontaktujte túto osobu"))
     :profile/contact-dialog-info                     (str "Pretože nezdieľame e-mailové adresy ostatných ľudí v OrgPade, odošleme túto správu za vás. Uvedieme v nej vaše meno a e-mail,"
                                                           " aby sme vám umožnili nadviazať priamy kontakt.")

     :promotion/unknown                               "Neznámy kód"
     :promotion/max-usages-reached                    "Použitý príliš mnohokrát"
     :promotion/expired                               "Vypršal"
     :promotion/one-year-free                         "1 rok zadarmo"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} zadarmo"
                                                       {:promotion/days [:promotion/duration "dní" "deň" "dni" "dní"]}]
     :promotion/for-one-year                          " na 1 rok"
     :promotion/for-six-months                        " na 6 mesiacov"

     :props/h1                                        "Veľký nadpis"
     :props/h2                                        "Stredný nadpis"
     :props/h3                                        "Malý nadpis"
     :props/weight-none                               "Normálny spoj"
     :props/strong                                    "Silný spoj"
     :props/arrowhead-none                            "Bez šípky"
     :props/single                                    "Šípka"
     :props/double                                    "Dvojitá šípka"

     :public-permission/none                          "súkromná."
     :public-permission/view                          "zdieľaná s každým na čítanie."

     :registration/create-user                        "Vytvoriť účet"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Už máte účet? " [:a.link-button {:href route} "Prihláste sa"]])
     :registration/options                            "Vyberte si iný spôsob registrácie"
     :registration/server-error                       "Chyba servera. Skúste vytvoriť účet znova."
     :registration/missing-oauth-email                "{{registration/service}} nám neposkytol váš e-mail. Vyplňte ho prosím nižšie."

     :search/previous-match                           "Predchádzajúca zhoda (Page Up)"
     :search/next-match                               "Nasledujúca zhoda (Page Down)"
     :search/close                                    "Zavrieť (ESC)"
     :search/cells-with-selected-attachments          "Bunky s označenými súbormi a obrázkami."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Zmeniť štýl výberu "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; podržte SHIFT pre zmenu na aktuálny štýl, podržte CTRL pre kopírovanie do aktuálneho štýlu"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "buniek" "bunka" "bunky" "buniek"]
                                                                   :link-label [:selection/num-links
                                                                                "spojov" "spoj" "spoje" "spojov"]}]

     :selection/link                                  "Prepojiť bunky"
     :selection/hide-contents                         "Skryť obsahy (ESC)"
     :selection/show-contents                         "Zobraziť obsahy"
     :selection/force-closing                         "Pri otvorení lokácie skryť tieto prvky (ESC)"
     :selection/step-focus-camera                     "Nastaviť kameru kroku presne na vybrané bunky (F2 alebo Q); podržte SHIFT pre ich pridanie, podržte ALT pre ich odstránenie."
     :selection/fragment-focus-camera                 "Nastaviť kameru lokácie presne na vybrané bunky (F2 alebo Q); podržte SHIFT pre ich pridanie, podržte ALT pre ich odstránenie."
     :selection/step-show-books                       "Zobraziť v kroku presne vybrané bunky (F3 alebo W); podržte SHIFT pre ich pridanie, podržte ALT pre ich odstránenie."
     :selection/fragment-show-books                   "Zobraziť v lokácii presne vybrané bunky (F3 alebo W); podržte SHIFT pre ich pridanie, podržte ALT pre ich odstránenie."
     :selection/force-showing                         "Zobraziť vybrané bunky, ak boli predtým skryté"
     :selection/share-units                           "Kopírovať odkaz na zobrazenie vybraných buniek; podržte SHIFT pre otvorenie nastavení miesta"
     :selection/move-to-new-orgpage                   "Presunúť do novej OrgStránky"
     :selection/change-code-lang                      "Zmeniť jazyk kódu"
     :selection/copy-units-links                      "Kopírovať bunky a spoje do schránky"
     :selection/flip-links                            "Zmeniť smery spojov"
     :selection/delete                                "Vymazať vybrané"

     :settings/profile                                "Profil"
     :settings/payments                               "Platby"
     :settings/account                                "Účet"
     :settings/linked-accounts                        "Prepojené účty"
     :settings/email                                  "Oznámenia"
     :settings/account-description                    "Zmeňte svoj e-mail, heslo alebo odstráňte svoj účet."
     :settings/stats-description                      "Tu sú vybrané štatistiky vášho používania OrgPadu."
     :settings/change-email                           "Zmeniť e-mail"
     :settings/change-email-text                      "Vložte novú e-mailovú adresu. Z bezpečnostných dôvodov ju musíme overiť pred odblokovaním účtu."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Váš účet je registrovaný na e-mail " [:b email] "."])
     :settings/account-linked-to-facebook             [:<> "Váš účet je" [:b " prepojený "] " s Facebookom."]
     :settings/account-not-linked-to-facebook         [:<> "Váš účet " [:b " nie je prepojený "] " s Facebookom."]
     :settings/link-fb                                "Prepojiť s Facebookom"
     :settings/unlink-fb                              "Zrušiť prepojenie s Facebookom"
     :settings/account-linked-to-google               [:<> "Váš účet je " [:b " prepojený "] " s Googlom."]
     :settings/account-not-linked-to-google           [:<> "Váš účet " [:b " nie je prepojený "] " s Googlom."]
     :settings/link-google                            "Prepojiť s Googlom"
     :settings/unlink-google                          "Zrušiť prepojenie s Googlom"
     :settings/account-linked-to-microsoft            [:<> "Váš účet je " [:b " prepojený "] " s Microsoftom."]
     :settings/account-not-linked-to-microsoft        [:<> "Váš účet " [:b " nie je prepojený "] " s Microsoftom."]
     :settings/link-microsoft                         "Prepojiť s Microsoftom"
     :settings/unlink-microsoft                       "Zrušiť prepojenie s Microsoftom"
     :settings/account-linked-to-cuni                 [:<> "Váš účet je " [:b " prepojený "] " s Karlovou univerzitou."]
     :settings/account-not-linked-to-cuni             [:<> "Váš účet " [:b " nie je prepojený "] " s Karlovou univerzitou."]
     :settings/link-cuni                              "Prepojiť s Karlovou univerzitou"
     :settings/unlink-cuni                            "Zrušiť prepojenie s Karlovou univerzitou"
     :settings/set-password-text                      " Nastavte heslo pred zrušením prepojenia."
     :settings/linked-accounts-info                   "Prepojte svoj účet na Facebooku, Googli, Microsofte alebo Karlovej univerzite s OrgPadom, aby ste ho mohli použiť na prihlásenie."
     :settings/profile-info                           "Pomocou zadaných informácií vás spolupracujúci na spoločných projektoch ľahšie nájdu."

     :settings/delete-account                         "Odstrániť účet"
     :settings/confirm-delete-account-question        [:<> [:b "Trvale"] " odstrániť účet?"]
     :settings/confirm-delete-account-info            "Trvale odstráni všetky vaše OrgStránky a ich údaje."
     :settings/delete-account-info                    [:<> "Odstránenie účtu " [:b "trvale"] " odstráni všetky vaše OrgStránky a ich údaje."]

     :share-orgpage/campaigns                         "Kampane"
     :share-orgpage/copied-to-clipboard               "Skopírované do schránky"
     :share-orgpage/copy-template-link                "Kopírovať odkaz na šablónu"
     :share-orgpage/dialog-title                      "Zdieľanie {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Ľudia bez účtu na OrgPade dostanú pozvánku s odkazom."
                                                                  " Po otvorení odkazu môžu čítať túto OrgStránku. ")
                                                         "Na jednoduchšie zdieľanie OrgStránok so skupinou ľudí si môžete "
                                                         [:a.link-button create-team "vytvoriť tím"] "."])
     :share-orgpage/email-found                       "Účet v OrgPade nájdený."
     :share-orgpage/email-unused                      "Účet v OrgPade nenájdený. Môžete poslať pozvánku e-mailom."
     :share-orgpage/checking-email-address            "Kontrolujeme e-mailovú adresu …"
     :share-orgpage/invite-for-editing                "Pozvať na úpravy"
     :share-orgpage/invite-for-viewing                "Pozvať na čítanie"
     :share-orgpage/invite-by-email                   "Chcete ho pozvať e-mailom v určitom jazyku?"
     :share-orgpage/show-profile                      "Ukázať profil"
     :share-orgpage/links                             "Odkazy"
     :share-orgpage/to-read                           "čítať"
     :share-orgpage/to-comment                        "komentovať"
     :share-orgpage/to-edit                           "upraviť"
     :share-orgpage/links-tooltip                     "Udeľte prístup prostredníctvom odkazov na zdieľanie"
     :share-orgpage/template                          "Šablóna"
     :share-orgpage/template-tooltip                  "Odkazy, ktoré automaticky vytvoria kópiu tejto OrgStránky"
     :share-orgpage/template-info                     "Ľudia môžu použiť tento odkaz na vytvorenie vlastných kópií tejto OrgStránky."
     :share-orgpage/template-autoshare-none           "Nezdieľať kópie so mnou."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Zdieľať kópie so mnou pre "
                                                             (case template-autoshare
                                                               :permission/view "čítanie"
                                                               :permission/comment "komentovanie"
                                                               :permission/edit "editovanie") "."))
     :share-orgpage/embed                             "Vložiť"
     :share-orgpage/embed-into-microsoft-teams        "Vložiť do Microsoft Teams"
     :share-orgpage/embed-into-website                "Vložiť do webovej stránky alebo aplikácie"
     :share-orgpage/embed-tooltip                     "Vložte do webovej stránky alebo aplikácie"
     :share-orgpage/new-user-or-usergroup             "Meno, e-mail alebo tím"
     :share-orgpage/link-permission-start             "Umožnite ľuďom"
     :share-orgpage/link-permission-end               "túto OrgStránku."
     :share-orgpage/orgpage-info                      "Info"
     :share-orgpage/orgpage-info-tooltip              "Informácie o vlastníkovi a či je OrgStránka zverejnená"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Táto OrgStránka je s vami zdieľaná pre "
                                                             (case user-permission
                                                               :permission/view "čítanie"
                                                               :permission/comment "komentovanie"
                                                               :permission/edit "editovanie") "."))
     :share-orgpage/remove-yourself                   "Odstrániť seba"
     :share-orgpage/private-info                      "Prístup máte iba vy a ľudia, s ktorými ste OrgStránku zdieľali priamo alebo pomocou odkazu. Každý novovytvorený dokument je súkromný."
     :share-orgpage/publish-for-reading-info          "OrgStránka je verejná. Každý na internete ju môže vyhľadať a čítať. Zmeny môžete robiť iba vy alebo ľudia, s ktorými ste OrgStránku zdieľali na úpravy."
     :share-orgpage/publish-permission-end            "Táto OrgStránka je "
     :share-orgpage/publish                           "Publikovať"
     :share-orgpage/publish-confirmation              "Každý bude schopný {orgpage/permission} túto OrgStránku. Ste si istý?"
     :share-orgpage/publish-tooltip                   "Udeľte prístup každému"
     :share-orgpage/remove-user                       "Odstrániť oprávnenie"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Ak ste odkaz zdieľali omylom, môžete "
                                                         [:span.link-button reset-links "zneplatniť všetky predchádzajúce odkazy"]
                                                         "."])
     :share-orgpage/shareable-link                    "Zdieľateľný odkaz"
     :share-orgpage/everything-closed                 "Zobraziť všetky bunky zatvorené"
     :share-orgpage/presentation                      "Začať s prezentáciou"
     :share-orgpage/fragment                          "Zobraziť lokáciu"
     :share-orgpage/template-link-switch              "Vytvoriť odkaz na šablónu."
     :share-orgpage/user-not-registered               " ešte nie je registrovaný v OrgPade."
     :share-orgpage/users                             "Ľudia"
     :share-orgpage/users-tooltip                     "Umožnite prístup jednotlivým ľuďom"

     :side-panel/about                                "Úvodná stránka"
     :side-panel/terms-and-conditions                 "Obchodné podmienky"
     :side-panel/privacy-and-security                 "Súkromie a bezpečnosť"
     :side-panel/files-and-images                     "Súbory a obrázky"
     :side-panel/paths                                "Prezentácie"
     :side-panel/fragments                            "Lokácie"
     :side-panel/translate                            "Preklady"
     :side-panel/toggle-debug                         "Debugger"
     :side-panel/help                                 "Nápoveda"
     :side-panel/blog                                 "Blog"
     :side-panel/home                                 "Hlavná stránka"
     :side-panel/import                               "Import"
     :side-panel/share                                "Zdieľanie"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "súborov" "súbor" "súbory" "súborov"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "obrázkov" "obrázok" "obrázky" "obrázkov"]}]
     :side-panel/num-paths                            [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "prezentácií" "prezentácia" "prezentácie" "prezentácií"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "lokácií" "lokácia" "lokácie" "lokácií"]}]

     :step/closed-books                               "Zatvorené bunky."
     :step/everything-closed                          "Všetko zatvorené."
     :step/hidden-books                               "Skryté bunky"
     :step/nothing-changed                            "Žiadne zmeny."
     :step/opened-pages                               "Otvorené stránky"
     :step/focused-books                              "Bunky zobrazené na kamere"
     :step/shown-books                                "Odhalené bunky"
     :step/switched-pages                             "Prepnuté stránky"

     :style-select/set-comment                        "Zmeniť v komentárovú bunku s vašou profilovou fotkou (CTRL+,)"
     :style-select/unset-comment                      "Zmeniť v normálnu bunku odstránením profilovej fotky (CTRL+,)"
     :style-select/set-comment-safari                 "Zmeniť v komentárovú bunku s vašou profilovou fotkou (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Zmeniť v normálnu bunku odstránením profilovej fotky (SHIFT+CMD+,)"

     :tag/public                                      "verejné"

     :text-field/email                                "E-mail"
     :text-field/first-name                           "Krstné meno"
     :text-field/last-name                            "Priezvisko"
     :text-field/name                                 "Meno"
     :text-field/new-password                         "Nové heslo"
     :text-field/password                             "Heslo"
     :text-field/content                              "Obsah"
     :text-field/name-or-email                        "Meno alebo e-mail"
     :text-field/subject                              "Predmet"
     :text-field/message                              "Správa"
     :text-field/phone-number                         "Telefónne číslo"
     :text-field/width                                "Šírka"
     :text-field/height                               "Výška"

     :translate/title                                 "Preklad OrgStránky {orgpage/title} do iného jazyka"
     :translate/info                                  (str "Automaticky vytvorí vami vlastnenú kópiu OrgStránky,"
                                                           " ktorá bude preložená zo zdrojového jazyka do cieľového jazyka."
                                                           " V priebehu minúty ju nájdete vo vašom zozname.")
     :translate/source-lang                           "Zdrojový jazyk"
     :translate/target-lang                           "Cieľový jazyk"
     :translate/translate                             "Preložiť"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Preklad dostupný ako "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :unit-editor/add-page                            "Vytvoriť ďalšiu stránku (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "Odstrániť túto stránku"
     :unit-editor/previous-page                       (str "Predchádzajúca stránka (PAGEUP);"
                                                           " podržte SHIFT pre presunutie tejto stránky doľava (SHIFT+PAGEUP);"
                                                           " podržte CTRL pre vytvorenie novej stránky pred touto stránkou (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "Nasledujúca stránka (PAGEDOWN);"
                                                           " podržte SHIFT pre presunutie tejto stránky doprava (SHIFT+PAGEDOWN);"
                                                           " podržte CTRL pre vytvorenie novej stránky za touto stránkou (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Prepnúť na túto stránku"
                                                             (when can-edit "; podržte SHIFT pre presunutie aktuálnej stránky sem")))
     :unit-editor/hidden-info                         "Pre písanie kliknite"
     :unit-editor/undo                                "Vrátiť späť (CTRL+Z)"
     :unit-editor/redo                                "Opakovať (CTRL+SHIFT+Z alebo CTRL+Y)"
     :unit-editor/toggle-bold                         "Tučné (CTRL+B)"
     :unit-editor/toggle-italic                       "Kurzíva (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Prečiarknutie"
     :unit-editor/toggle-subscript                    "Dolný index (CTRL+S)"
     :unit-editor/toggle-superscript                  "Horný index (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Vytvoriť odkaz (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Odstrániť odkaz"
     :unit-editor/set-highlighting                    "Farba zvýraznenia"
     :unit-editor/selection->code                     "Previesť na kód (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Odrážkový zoznam (TAB)"
     :unit-editor/toggle-list-ol                      "Číslovaný zoznam (CTRL+O)"
     :unit-editor/indent                              "Zväčšiť odsadenie (TAB)"
     :unit-editor/outdent                             "Zmenšiť odsadenie (SHIFT+TAB)"
     :unit-editor/center                              "Zarovnanie na stred (CTRL+L)"
     :unit-editor/heading                             "Nadpis (CTRL+G)"
     :unit-editor/embed-pdf                           "Zobraziť obsah PDF"
     :unit-editor/link-pdf                            "Nahradiť obsah PDF odkazom"
     :unit-editor/embed-office                        "Zobraziť obsah dokumentu pomocou služby Microsoft 365"
     :unit-editor/link-office                         "Nahradiť obsah dokumentu odkazom"
     :unit-editor/embed-video                         "Zobraziť prehrávač videa"
     :unit-editor/link-video                          "Nahradiť prehrávač videa odkazom"
     :unit-editor/embed-audio                         "Zobraziť prehrávač zvuku"
     :unit-editor/link-audio                          "Nahradiť prehrávač zvuku odkazom"
     :unit-editor/hyperlink->embed                    "Zobraziť odkazovanú webovú stránku"
     :unit-editor/embed->hyperlink                    "Nahradiť vloženú webovú stránku odkazom"
     :unit-editor/open-image-in-attachments           "Otvoriť tento obrázok v zozname príloh"
     :unit-editor/open-file-in-attachments            "Otvoriť tento súbor v zozname príloh"
     :unit-editor/toggle-controls                     "Zobraziť ovládacie prvky video prehrávača"
     :unit-editor/toggle-autoplay                     "Prehrávať automaticky"
     :unit-editor/toggle-muted                        "Prehrávať bez zvuku, inak nemusí fungovať automatické prehrávanie"
     :unit-editor/toggle-loop                         "Prehrávať v slučke"
     :unit-editor/toggle-chained-size                 "Zachovať pomer strán"
     :unit-editor/insert-menu                         "Vložiť"
     :unit-editor/insert-image                        "Obrázok"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Nahrajte obrázok z vášho zariadenia."
     :unit-editor/insert-image-info2                  "Tip: Presuňte alebo vložte obrázok priamo do bunky alebo do sivého plátna."
     :unit-editor/insert-camera                       "Kamera"
     :unit-editor/insert-attachment                   "Súbor"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Video"
     :unit-editor/insert-video-info                   "Nahrajte video z počítača alebo ho vložte z YouTube."
     :unit-editor/insert-video-info2                  "Tip: Presuňte videá a náhľady YouTube videí priamo do bunky alebo sivého plátna."
     :unit-editor/video-url                           "Odkaz na YouTube"
     :unit-editor/youtube-start                       "Štart"
     :unit-editor/youtube-end                         "Koniec"
     :unit-editor/insert-table                        "Tabuľka"
     :unit-editor/insert-table-info                   "Zvoľte veľkosť vkladanej tabuľky."
     :unit-editor/toggle-table-border                 "Zobraziť ohraničenie tabuľky"
     :unit-editor/add-row-before                      "Vložiť riadok nad"
     :unit-editor/add-row-after                       "Vložiť riadok pod"
     :unit-editor/remove-current-row                  "Odstrániť riadok"
     :unit-editor/add-column-before                   "Vložiť stĺpec pred"
     :unit-editor/add-column-after                    "Vložiť stĺpec za"
     :unit-editor/remove-current-column               "Odstrániť stĺpec"
     :unit-editor/remove-table                        "Odstrániť tabuľku"
     :unit-editor/insert-website                      "Webová stránka"
     :unit-editor/insert-website-info                 (str "Webovú stránku môžete vložiť priamo do bunky."
                                                           " Ak to nefunguje, je možné, že je to zakázané majiteľom webovej stránky.")
     :unit-editor/website-url-or-code                 "Adresa webovej stránky alebo kód"
     :unit-editor/website-id                          "ID webu"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Slúži na "
                                                         [:a.link-button {:href info :target "_blank"} "odosielanie správ medzi webmi"] "."])
     :unit-editor/invalid-website-url                 "Neplatná adresa webovej stránky alebo kód"
     :unit-editor/invalid-video-url                   "Neplatná adresa videa"
     :unit-editor/update-website                      "Zmeniť adresu webovej stránky"
     :unit-editor/insert-orgpage                      "OrgStránka"
     :unit-editor/insert-code                         "Kód"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Kopírovať kód"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Kód ako samostatný odsek"
     :unit-editor/toggle-block-math                   "Matematika na samostatnom riadku"
     :unit-editor/remove-code                         "Odstrániť formátovanie kódu"
     :unit-editor/insert-math                         "Matematika / chémia"

     :unit-panel/link                                 (str "Pre prepojenie kliknite alebo ťahajte;"
                                                           " podržte SHIFT pre vytvorenie viacerých spojov;"
                                                           " podržte CTRL pre vytvorenie reťaze buniek")
     :unit-panel/upload-attachment                    "Vložte obrázok alebo súbor do tejto bunky"
     :unit-panel/change-link-style                    (str "Zmena štýlu tejto bunky; "
                                                           "podržte SHIFT pre nastavenie aktuálneho štýlu, "
                                                           "podržte CTRL pre skopírovanie do aktuálneho štýlu; "
                                                           "ťahaním vyrobiť spoj v tomto štýle")
     :unit-panel/hide-content                         "Skryť obsah"
     :unit-panel/delete-unit                          "Odstrániť bunku"

     :usergroup/create                                "Vytvoriť tím"
     :usergroup/edit-title                            "Upraviť {usergroup/name}"
     :usergroup/info                                  "Pre jednoduchšie zdieľanie OrgStránok vytvárajte a spravujte tímy vašich priateľov a spolupracovníkov."
     :usergroup/delete                                "Odstrániť tím"
     :usergroup/members                               "Členovia"
     :usergroup/edit                                  "Zmeniť logo a názov tímu"
     :usergroup/show-actions                          "Ukázať akcie"
     :usergroup/name                                  "Meno"
     :usergroup/hide-orgpages                         "Skryť zdieľané OrgStránky"
     :usergroup/hide-orgpages-tooltip                 "Zobrazia sa po zapnutí tímu vo filtri."
     :usergroup/hide-in-filter                        "Skryť vo filtri"
     :usergroup/create-info                           "Meno a profilový obrázok tímu sú viditeľné iba pre členov tímu."
     :usergroup/confirm-delete                        [:<> [:b "Trvale"] " odstrániť tento tím?"]
     :usergroup/members-title                         "Členovia tímu {usergroup/name}"
     :usergroup/remove-member                         "Odstrániť z tímu"
     :usergroup/remove-admin                          "Odstrániť správcu"
     :usergroup/make-admin                            "Urobiť správcom"
     :usergroup/admin-tooltip                         "Správca môže spravovať členov a odstrániť tím."
     :usergroup/copy-usergroup                        "Kopírovať tím"

     :usergroup-role/owner                            "Vlastník"
     :usergroup-role/admin                            "Správca"
     :usergroup-role/member                           "Člen"

     :wire-transfer/title                             "Bankový prevod pre ročný {wire-transfer/tier} predplatné"
     :wire-transfer/info                              "Vaše ročné predplatné aktivujeme po prijatí peňazí na náš účet."
     :wire-transfer/used-currency                     "Platba v {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Príjemca"
     :wire-transfer/account-number                    "Číslo účtu"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Čiastka"
     :wire-transfer/payment-purpose                   "Správa pre príjemcu"
     :wire-transfer/qr-code-common                    (str "Pre automatické vyplnenie správnych informácií pomocou bankovej"
                                                           " aplikácie prosím naskenujte nasledujúci kód QR platby.")
     :wire-transfer/cz-sk-qr-code-description         (str " Tento QR kód sa bežne používa pre bankové prevody"
                                                           " v Česku a na Slovensku.")
     :wire-transfer/eu-qr-code-description            (str " Tento QR kód sa bežne používa pre SEPA bankové prevody"
                                                           " v Európskej únii.")
     :wire-transfer/trial-info                        (str "Pre plné využitie OrgPadu môžete začať ihneď jednorazovým"
                                                           " 7-dňovým predplatným. Keď nám banka potvrdí platbu,"
                                                           " predĺžime vám predplatné o 1 rok.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Ak máte akékoľvek otázky alebo ťažkosti, prosím kontaktujte"
                                                         " nás " [:a.link-button {:href url} "vyplnením formulára"] "."])
     :wire-transfer/success-text                      [:<> "Aktivovali sme vám " [:b "jednorazové 7-dňové predplatné"] ","
                                                       " aby ste mohli OrgPad s novým plánom používať okamžite. "]
     :wire-transfer/common-result-text                (str "Keď banka potvrdí, že platba prebehla úspešne,"
                                                           " bude doba predplatného predĺžená o 1 rok.")
     :wire-transfer/start-trial                       "Platba odoslaná"
     :wire-transfer/start-trial-result-title          "Ďakujeme za platbu"
     :wire-transfer/copy                              "Kopírovať do schránky"

     :website-editor/settings                         "Nastavenia"
     :website-editor/routes                           "Cesty"
     :website-editor/menus                            "Menu"
     :website-editor/create-menu                      "Vytvoriť menu"
     :website-editor/edited-menu                      "Upravované menu"
     :website-editor/untitled-menu                    "Menu bez názvu"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "položiek" "položka" "položky" "položiek"]}]
     :website-editor/delete-menu-item                 "Odstrániť túto položku menu"
     :website-editor/add-menu-item                    "Pridať položku menu"
     :website-editor/menu-item-label                  "Názov položky"
     :menu-item/path-type                             "Otvára cestu"
     :menu-item/url-type                              "Otvára externú URL"
     :menu-item/children-type                         "Otvára podmenu"
     :website-editor/menu-item-path                   "Cesta"

     :youtube-placement/watch-on-prefix               (str "Sledujte" unicode/nbsp "na")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/sk dict)