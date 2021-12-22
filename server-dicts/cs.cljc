(ns orgpad.server.i18n.cs
  (:require [orgpad.common.i18n.dict.cs :as cs]))

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  (merge
    cs/dict
    {:orgpage/untitled                    "dokumentu"
     :permission/view                     "ke čtení"
     :permission/edit                     "k úpravě"

     :subscription/monthly                "měsíc"
     :subscription/yearly                 "rok"

     :tier/standard                       "Standardní"
     :tier/professional                   "Profesionální"
     :tier/school                         "Školní"
     :tier/enterprise                     "Firemní"
     :tier/unlimited                      "Neomezené"

     :email/customer                      "zákazníku"
     :email/greeting                      "Vážený {{customer}},"
     :email/signature                     "S pozdravem"
     :email/ceo                           "Vít Kalisz, CEO"
     :email/contact-us                    (fn [{:feedback/keys [url]}]
                                            (list "Pokud narazíte na jakékoli problémy, prosím ozvěte se nám buď pomocí " [:a {:href (str "{{domain}}" url)} "formuláře v aplikaci"]
                                                  " nebo nám pošlete email na " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                            " nebo "

     :invitation/subject                  "Jste pozváni {{action}} dokumentu v OrgPadu"
     :invitation/preheader                "{{user}} vás zve {{action}} {{title}}. K otevření dokumentu prosím klikněte na tlačítko níže."
     :invitation/heading                  "{{user}} vás zve {{action}} {{title}}"
     :invitation/info                     "OrgPad je platforma na vytváření vizuálních dokumentů pro získání nadhledu. Kliknutím na následující tlačítko přijmete pozvánku a otevřete dokument."
     :invitation/button                   "Otevřít dokument"
     :invitation/accidental-email         "Pokud jste tento email obdrželi omylem, smažte ho prosím. Pokud tyto emaily dostáváte opakovaně, můžete "
     :invitation/block-user               "zablokovat pozvánky od {{user}}"
     :invitation/block-all                "zablokovat všechny pozvánky"

     :footer/unsubscribe                  (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.com"] ". Nechcete dostávat tyto emaily? "
                                                  [:a href-unsubscribe "Odhlaste se"] "."))

     :orgpage/copy                        "kopie"

     :password-reset/subject              "Obnovení Vašeho hesla v OrgPadu"
     :password-reset/preheader            "Pomocí kliknutí na tlačítko níže obnovíte Vaše heslo v OrgPadu."
     :password-reset/heading              "Obnovení Vašeho hesla v OrgPadu"
     :password-reset/text-1               "Pro obnovení Vašeho hesla prosím klikněte na tlačítko níze. Platné je po dobu 24 hodin."
     :password-reset/button               "Obnovit heslo"
     :password-reset/text-2               "Pokud jste obnovu hesla nevyvolali, nebo pokud už obnovu nepotřebujete, nemusíte nic podnikat."

     :verification/subject                "Ověření Vašeho účtu v OrgPadu"
     :verification/preheader              "Vítejte v OrgPadu. Pomocí kliknutí na tlačítko níže prosím oveřte Váš účet."
     :verification/heading                "Ověření Vašeho emailu"
     :verification/verify-account-info    "Pro ověření Vašeho účtu, prosím klikněte na tlačítko níže. Kliknutím na tlačítko dále souhlasíte s "
     :verification/terms-and-conditions   "podmínkami použití OrgPadu"
     :verification/button                 "Ověřit emailovou adresu"
     :verification/received-by-mistake    "Pokud jste tento email obdrželi omylem, smažte ho prosím. Pokud tyto emaily dostáváte opakovaně, kontaktujte nás prosím na adrese "
     :verification/support-email          "support@orgpad.com"

     :feedback/subject                    "Otázka: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} odeslal otázku {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) odeslal otázku {{title}}"

     ;; newsletter was never really used

     :contact-user/subject                "Byli jste kontaktováni přes OrgPad"
     :contact-user/preheader              "Zpráva od {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) Vás kontaktuje přes OrgPad"
     :contact-user/common-info            (str "Tento email Vám píšeme my, protože Vaši emailovou adresu s nikým nesdílíme. Na zprávu můžete "
                                               "reagovat zasláním odpovědi na tuto zprávu nebo zprávou na e-mail {{reply-to}}.")
     :contact-user/post-message-info      "Pokud je zpráva nevyžádaná, můžete "
     :contact-user/block-user             "zablokovat všechny zprávy od {{user}}"
     :contact-user/block-all              "zablokovat všechny zprávy od všech lidí z OrgPadu."

     :christmas-newsletter/subject        "Změna pravidel free verze, novinky a výhledy"
     :christmas-newsletter/preheader      "Probereme s Vámi nadcházející změny, novinky a další plány v OrgPadu a možnosti, jak nás podpořit."
     :christmas-newsletter/introduction   (str "prosinec již klepe na dveře a přichází tak období rekapitulací, analýz a zamýšlení se."
                                               " Dovolte mi proto požádat Vás o pár minut Vašeho času, projdeme společně novinky a změny,"
                                               " které v OrgPadu nastanou od 1. prosince 2021. ")
     :christmas-newsletter/button-info    "Newsletter je zpracovaný přímo v OrgPadu, přejděte na něj, prosím, kliknutím na následující tlačítko"
     :christmas-newsletter/button         "Přejít na Newsletter"
     :christmas-newsletter/button-info2   (list "nebo tento odkaz: " [:a {:href "https://orgpad.com/s/newsletter-konec-2021"}
                                                                      "https://orgpad.com/s/newsletter-konec-2021"]
                                                ". Newsletter se týká mimo jiné změn v pravidlech free verze. ")
     :christmas-newsletter/best-wishes    "Přeji Vám příjemný a poklidný advent."
     :christmas-newsletter/best-wishes2   "S pozdravem za celý tým OrgPadu"

     :new-payment/subject                 "Platba proběhla v pořádku"
     :new-payment/preheader               "Obnovili jste Vaše předplatné {{tier}} pro období do {{subscription-end}}."
     :new-payment/common-info             (list "úspěšně jste obnovili Vaše předplatné {{tier}} pro období do "
                                                [:b "{{subscription-end}}"] ". Děkujeme Vám za projevenou důvěru.")
     :new-payment/download-receipt        "Stáhnout účet"

     :new-subscription/subject            "Potvrzení nového předplatného"
     :new-subscription/preheader          "Vaše {{tier}} předplatné OrgPadu je nyní aktivní. Předplatné bude automaticky obnovováno každý {{period}}"
     :new-subscription/active-tier        "Vaše {{tier}} předplatné OrgPadu je nyní aktivní. Děkujeme za Vaši platbu!"
     :new-subscription/payment-info       (fn [{:payment/keys [url]}]
                                            (list "Od této chvíle bude předplatné automaticky obnovováno každý {{period}}. Vaše účtenky se automaticky ukládají v "
                                                  [:a {:href (str "{{domain}}" url)} "oddílu plateb"] " v nastavení OrgPadu."))

     :payment-failed/subject              "Platba předplatného se nezdařila"
     :payment-failed/preheader            "Zkontrolujte prosím platnost karty a její zůstatek. V případě přetrvávajících potíží nás kontaktujte."
     :payment-failed/error                "došlo k chybě při platbě Vašeho předplatného OrgPadu. Zkontrolujte prosím, zda je Vaše karta platná a zda na ní máte dostatečný zůstatek."
     :payment-failed/payment              "Změnit způsob platby"
     :payment-failed/current-subscription (list "Vaše stávající předplatné platí do " [:b "{{subscription-end}}"]
                                                ". Pokud do tohoto data neuhradíte předplatné, přepne se Váš účet po tomto datu do předplatného zdarma. Ke svým datům budete mít nadále přístup, budete je moci upravovat, mazat a sdílet.")

     :stripe-report/subject               "Vyúčtování platební brány Stripe za {{report-month}} {{report-year}}"
     :stripe-report/text                  "Bylo vygenerováno vyúčtování platební brány Stripe."
     :stripe-report/button                "Stáhnout PDF"

     ;; admin-* are only in English
     }))