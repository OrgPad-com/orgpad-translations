(ns orgpad.server.i18n.cs
  (:require [orgpad.common.i18n.dict.cs :as cs]))

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  (merge
    cs/dict
    {:orgpage/untitled                              "dokumentu"
     :permission/view                               "ke čtení"
     :permission/edit                               "k úpravě"

     :subscription/monthly                          "měsíc"
     :subscription/yearly                           "rok"

     :tier/standard                                 "Standardní"
     :tier/professional                             "Profesionální"
     :tier/school                                   "Školní"
     :tier/enterprise                               "Firemní"
     :tier/unlimited                                "Neomezené"

     :email/customer                                "zákazníku"
     :email/greeting                                "Vážený {{customer}},"
     :email/signature                               "S pozdravem"
     :email/ceo                                     "Vít Kalisz, CEO"
     :email/contact-us                              (fn [{:feedback/keys [url]}]
                                                      (list "Pokud narazíte na jakékoli problémy, prosím ozvěte se nám buď pomocí " [:a {:href (str "{{domain}}" url)} "formuláře v aplikaci"]
                                                            " nebo nám pošlete email na " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                                      " nebo "

     :invitation/subject                            "Jste pozváni {{action}} dokumentu v OrgPadu"
     :invitation/preheader                          "{{user}} vás zve {{action}} {{title}}. K otevření dokumentu prosím klikněte na tlačítko níže."
     :invitation/heading                            "{{user}} vás zve {{action}} {{title}}"
     :invitation/info                               "OrgPad je platforma na vytváření vizuálních dokumentů pro získání nadhledu. Kliknutím na následující tlačítko přijmete pozvánku a otevřete dokument."
     :invitation/button                             "Otevřít dokument"
     :invitation/accidental-email                   "Pokud jste tento email obdrželi omylem, smažte ho prosím. Pokud tyto emaily dostáváte opakovaně, můžete "
     :invitation/block-user                         "zablokovat pozvánky od {{user}}"
     :invitation/block-all                          "zablokovat všechny pozvánky"

     :footer/unsubscribe                            (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                                      (list [:a href-orgpad "https://orgpad.com"] ". Nechcete dostávat tyto emaily? "
                                                            [:a href-unsubscribe "Odhlaste se"] "."))

     :orgpage/copy                                  "kopie"

     :password-reset/subject                        "Obnovení Vašeho hesla v OrgPadu"
     :password-reset/preheader                      "Pomocí kliknutí na tlačítko níže obnovíte Vaše heslo v OrgPadu."
     :password-reset/heading                        "Obnovení Vašeho hesla v OrgPadu"
     :password-reset/text-1                         "Pro obnovení Vašeho hesla prosím klikněte na tlačítko níze. Platné je po dobu 24 hodin."
     :password-reset/button                         "Obnovit heslo"
     :password-reset/text-2                         "Pokud jste obnovu hesla nevyvolali, nebo pokud už obnovu nepotřebujete, nemusíte nic podnikat."

     :verification/subject                          "Ověření Vašeho účtu v OrgPadu"
     :verification/preheader                        "Vítejte v OrgPadu. Pomocí kliknutí na tlačítko níže prosím oveřte Váš účet."
     :verification/heading                          "Ověření Vašeho emailu"
     :verification/verify-account-info              "Pro ověření Vašeho účtu, prosím klikněte na tlačítko níže. Kliknutím na tlačítko dále souhlasíte s "
     :verification/terms-and-conditions             "podmínkami použití OrgPadu"
     :verification/button                           "Ověřit emailovou adresu"
     :verification/received-by-mistake              "Pokud jste tento email obdrželi omylem, smažte ho prosím. Pokud tyto emaily dostáváte opakovaně, kontaktujte nás prosím na adrese "
     :verification/support-email                    "support@orgpad.com"

     :feedback/subject                              "Otázka: {{title}}"
     :feedback/preheader                            "{{first-name}} {{last-name}} odeslal otázku {{title}}"
     :feedback/heading                              "{{first-name}} {{last-name}} ({{email}}) odeslal otázku {{title}}"

     ;; newsletter was never really used

     :contact-user/subject                          "Byli jste kontaktováni přes OrgPad"
     :contact-user/preheader                        "Zpráva od {{user}}"
     :contact-user/heading                          "{{user}} ({{reply-to}}) Vás kontaktuje přes OrgPad"
     :contact-user/common-info                      (str "Tento email Vám píšeme my, protože Vaši emailovou adresu s nikým nesdílíme. Na zprávu můžete "
                                                         "reagovat zasláním odpovědi na tuto zprávu nebo zprávou na e-mail {{reply-to}}.")
     :contact-user/post-message-info                "Pokud je zpráva nevyžádaná, můžete "
     :contact-user/block-user                       "zablokovat všechny zprávy od {{user}}"
     :contact-user/block-all                        "zablokovat všechny zprávy od všech lidí z OrgPadu."

     :new-payment/subject                           "Platba proběhla v pořádku"
     :new-payment/preheader                         "Obnovili jste Vaše předplatné {{tier}} pro období do {{subscription-end}}."
     :new-payment/common-info                       (list "úspěšně jste obnovili Vaše předplatné {{tier}} pro období do "
                                                          [:b "{{subscription-end}}"] ". Děkujeme Vám za projevenou důvěru.")
     :new-payment/download-receipt                  "Stáhnout účet"

     :new-subscription/subject                      "Potvrzení nového předplatného"
     :new-subscription/preheader                    "Vaše {{tier}} předplatné OrgPadu je nyní aktivní. Předplatné bude automaticky obnovováno každý {{period}}"
     :new-subscription/active-tier                  "Vaše {{tier}} předplatné OrgPadu je nyní aktivní. Děkujeme za Vaši platbu!"
     :new-subscription/payment-info                 (fn [{:payment/keys [url]}]
                                                      (list "Od této chvíle bude předplatné automaticky obnovováno každý {{period}}. Vaše účtenky se automaticky ukládají v "
                                                            [:a {:href (str "{{domain}}" url)} "oddílu plateb"] " v nastavení OrgPadu."))

     :payment-failed/subject                        "Platba předplatného se nezdařila"
     :payment-failed/preheader                      "Zkontrolujte prosím platnost karty a její zůstatek. V případě přetrvávajících potíží nás kontaktujte."
     :payment-failed/error                          "došlo k chybě při platbě Vašeho předplatného OrgPadu. Zkontrolujte prosím, zda je Vaše karta platná a zda na ní máte dostatečný zůstatek."
     :payment-failed/payment                        "Změnit způsob platby"
     :payment-failed/current-subscription           (list "Vaše stávající předplatné platí do " [:b "{{subscription-end}}"]
                                                          ". Pokud do tohoto data neuhradíte předplatné, přepne se Váš účet po tomto datu do předplatného zdarma. Ke svým datům budete mít nadále přístup, budete je moci upravovat, mazat a sdílet.")

     :stripe-report/subject                         "Vyúčtování platební brány Stripe za {{report-month}} {{report-year}}"
     :stripe-report/text                            "Bylo vygenerováno vyúčtování platební brány Stripe."
     :stripe-report/button                          "Stáhnout PDF"

     :offer-to-czech-schools/preheader              "Národní plán obnovy je jedinečnou možností zavést do našich škol mocné nástroje, které budou lidem v příštích dekádách pomáhat při práci. OrgPad takovým mocným nástrojem je, proto bych ho rád zavedl i na Vaši školu, potažmo do všech českých škol."
     :offer-to-czech-schools/subject                "Komplexní řešení digitální gramotnosti financované z Národního plánu obnovy (NPO)"
     :offer-to-czech-schools/heading                "Komplexní řešení digitální gramotnosti financované z Národního plánu obnovy (NPO)"
     :offer-to-czech-schools/greeting               "Vážená paní, vážený pane,"
     :offer-to-czech-schools/introduction           (list "představuji Vám digitální nástroj OrgPad jako "
                                                          [:b "řešení čtvrté digitální kompetence."]
                                                          " OrgPad je nástroj na tvorbu vylepšených myšlenkových map,"
                                                          " který mohou používat děti i učitelé ve všech předmětech. " "Jde o software do výuky i nadoma. "
                                                          "Národní plán obnovy nyní otevírá jedinečnou možnost zavést OrgPad i ve Vaší škole.")
     :offer-to-czech-schools/edu-advantages         "Výhody OrgPadu z hlediska výuky jsou:"
     :offer-to-czech-schools/org-advantages         "Výhody OrgPadu z hlediska organizace jsou:"
     :offer-to-czech-schools/button-info            (list "Nechal jsem pro Vás zpracovat "
                                                          [:b "podrobnější informace přímo v OrgPadu"]
                                                          " tak, abyste si mohli nástroj rovnou vyzkoušet. Prosím, klepněte na následující tlačítko a pokračujte ve čtení tam.")
     :offer-to-czech-schools/button                 "Informace pro české školy o OrgPadu"
     :offer-to-czech-schools/about-ukrainians       (list "Nyní tento software poskytujeme " [:b "všem ukrajincům zdarma."]
                                                          " Pokud byste chtěli tuto možnost využít, stačí mi napsat počet potřebných licencí a obratem je dostanete. "
                                                          "OrgPad tímto způsobem již nyní pomáhá na desítkách škol.")
     :offer-to-czech-schools/org-and-end-stuff      (list "Rád bych společně s Vámi nalezl způsob, jakým by mohla i Vaše škola OrgPad využívat. Můžeme se s Vámi a s vybranými učiteli domluvit na "
                                                          [:b "videokonferenci,"]
                                                          " kde probereme nasazení OrgPadu u Vás na škole - budu rád, když navrhnete termín, který Vám bude vyhovovat nejvíce.")
     :offer-to-czech-schools/farewell-1             "Těším se na naši další komunikaci."
     :offer-to-czech-schools/farewell-2             "S pozdravem"
     :offer-to-czech-schools/signature-line-1       "Vít Kalisz"
     :offer-to-czech-schools/signature-line-2       "CEO & Co-Founder of OrgPad s.r.o."
     :offer-to-czech-schools/signature-line-3       "tel. +420 736 174 126"
     :offer-to-czech-schools/signature-line-4       "www.orgpad.com"
     :offer-to-czech-schools/signature-line-5       "Renoirova 624/1, 15200 Praha 5, Czech Republic"
     :offer-to-czech-schools/signature-line-6       "IČO: 09480994"

     ;; admin-* are only in English
     }))