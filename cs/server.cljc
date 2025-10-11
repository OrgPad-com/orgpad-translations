(ns orgpad.server.i18n.cs
  (:require [orgpad.common.i18n.dict.cs :as cs]
            [orgpad.common.i18n.dict.cs-admin :as common-cs-admin]
            [orgpad.server.i18n.cs-admin :as cs-admin]
            [orgpad.common.company :as company]))

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  (merge
    cs/dict
    common-cs-admin/dict
    cs-admin/dict
    {:orgpage/untitled                    "dokumentu"
     :orgpage/copy                        "kopie"

     :permission/view                     "ke čtení"
     :permission/edit                     "k úpravě"

     :subscription/monthly                "měsíc"
     :subscription/yearly                 "rok"

     :email/greeting                      "Vážený {{customer}},"
     :email/signature                     "S pozdravem"
     :email/team                          "Pavel Klavík a Kamila Klavíková"
     :email/creators                      "tvůrci OrgPadu"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". Nechcete dostávat tyto e-maily? "
                                                  [:a href-unsubscribe "Odhlaste se"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "Pokud narazíte na jakékoliv problémy, prosím ozvěte se nám buď pomocí " [:a {:href (str "{{domain}}" url)} "formuláře v aplikaci"]
                                                  " nebo nám pošlete e-mail na " company/support-email-link "."))
     :email/or                            " nebo "
     :email/customer                      "zákazníku"

     :verification/subject                "Ověření Vašeho účtu v OrgPadu"
     :verification/preheader              "Vítejte v OrgPadu. Pomocí kliknutí na tlačítko níže prosím ověřte Váš účet."
     :verification/heading                "Ověření Vašeho e-mailu"
     :verification/body                   "Pro ověření Vašeho účtu, prosím klikněte na tlačítko níže. Kliknutím na tlačítko dále souhlasíte s "
     :verification/terms-and-conditions   "podmínkami použití OrgPadu"
     :verification/button                 "Ověřit e-mailovou adresu"
     :verification/accidental-email       "Pokud jste tento e-mail obdrželi omylem, smažte ho prosím. Pokud tyto e-maily dostáváte opakovaně, kontaktujte nás prosím na adrese "

     :password-reset/subject              "Obnovení Vašeho hesla v OrgPadu"
     :password-reset/preheader            "Pomocí kliknutí na tlačítko níže obnovíte Vaše heslo v OrgPadu."
     :password-reset/heading              "Obnovení Vašeho hesla v OrgPadu"
     :password-reset/body                 "Pro obnovení Vašeho hesla prosím klikněte na tlačítko níže. Platné je po dobu 24 hodin."
     :password-reset/button               "Obnovit heslo"
     :password-reset/accidental-email     "Pokud jste obnovu hesla nevyvolali, nebo pokud už obnovu nepotřebujete, nemusíte nic podnikat."

     :new-subscription/subject            "Potvrzení nového předplatného"
     :new-subscription/preheader          "Vaše {{tier}} předplatné OrgPadu je nyní aktivní. Předplatné bude automaticky obnovováno každý {{period}}"
     :new-subscription/body               "Vaše {{tier}} předplatné OrgPadu je nyní aktivní. Děkujeme za Vaši platbu!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "Od této chvíle bude předplatné automaticky obnovováno každý {{period}}. Vaše účtenky se automaticky ukládají v "
                                                  [:a {:href (str "{{domain}}" url)} "oddílu plateb"] " v nastavení OrgPadu."))

     :new-payment/subject                 "Platba proběhla v pořádku"
     :new-payment/preheader               "Obnovili jste Vaše předplatné {{tier}} pro období do {{subscription-end}}."
     :new-payment/body                    (list "úspěšně jste obnovili Vaše předplatné {{tier}} pro období do "
                                                [:b "{{subscription-end}}"] ". Děkujeme Vám za projevenou důvěru.")
     :new-payment/button                  "Stáhnout fakturu"

     :payment-failed/subject              "Platba předplatného se nezdařila"
     :payment-failed/preheader            "Zkontrolujte prosím platnost karty a její zůstatek. V případě přetrvávajících potíží nás kontaktujte."
     :payment-failed/body                 "došlo k chybě při platbě Vašeho předplatného OrgPadu. Zkontrolujte prosím, zda je Vaše karta platná a zda na ní máte dostatečný zůstatek."
     :payment-failed/button               "Změnit způsob platby"
     :payment-failed/grace-warning        (list "Vaše stávající předplatné platí do "
                                                [:b "{{subscription-end}}"]
                                                ". Pokud do tohoto data neuhradíte předplatné, přepne se Váš účet po tomto datu do předplatného zdarma. Ke svým datům budete mít nadále přístup, budete je moci upravovat, mazat a sdílet.")

     :feedback/subject                    "Otázka: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} odeslal otázku {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) odeslal otázku {{title}}"

     :invitation/subject                  "Jste pozváni {{action}} dokumentu v OrgPadu"
     :invitation/preheader                "{{user}} vás zve {{action}} {{title}}. K otevření dokumentu prosím klikněte na tlačítko níže."
     :invitation/heading                  "{{user}} vás zve {{action}} {{title}}"
     :invitation/body                     "OrgPad je platforma na vytváření vizuálních dokumentů pro získání nadhledu. Kliknutím na následující tlačítko přijmete pozvánku a otevřete dokument."
     :invitation/button                   "Otevřít dokument"
     :invitation/accidental-email         "Pokud jste tento e-mail obdrželi omylem, smažte ho prosím. Pokud tyto e-maily dostáváte opakovaně, můžete "
     :invitation/block-user               "zablokovat pozvánky od {{user}}"
     :invitation/block-all                "zablokovat všechny pozvánky"

     :contact-user/subject                "Byli jste kontaktováni přes OrgPad"
     :contact-user/preheader              "Zpráva od {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) Vás kontaktuje přes OrgPad"
     :contact-user/body                   (str "Tento e-mail Vám píšeme my, protože Vaši e-mailovou adresu s nikým nesdílíme. Na zprávu můžete "
                                               "reagovat zasláním odpovědi na tuto zprávu nebo zprávou na e-mail {{reply-to}}.")
     :contact-user/unsolicited-info       "Pokud je zpráva nevyžádaná, můžete "
     :contact-user/block-user             "zablokovat všechny zprávy od {{user}}"
     :contact-user/block-all              "zablokovat všechny zprávy od všech lidí z OrgPadu."

     :blog/rss-description                "Poslední novinky a aktualizace OrgPadu a technické diskuze."

     :newsletter-2024-summer/subject      "Letní novinky od OrgPadu"
     :newsletter-2024-summer/preheader    "Zjistěte více o změnách slevy pro učitele a studenty, novém blogu, vylepšených opatřeních na ochranu soukromí a další!"
     :newsletter-2024-summer/introduction "po roční pauze jsme zpět s dalším newsletterem."
     :newsletter-2024-summer/heading      "Co naleznete v tomto newsletteru:"
     :newsletter-2024-summer/body         (list [:li "Jak se od září 2024 mění podmínky slev pro učitele a studenty?"]
                                                [:li "Co je nového v aplikaci od začátku roku?"]
                                                [:li "Co najdete na našem novém blogu?"]
                                                [:li "Jak dbáme na vaše soukromí a bezpečnost vašich dat?"]
                                                [:li "Jak jsme aktualizovali obchodní podmínky pro vaše pohodlí?"]
                                                [:li "Proč se připojit ke komunitě?"])
     :newsletter-2024-summer/button       "Číst newsletter"
     :newsletter-2024-summer/closing      "Těšíme se na vaše nápady!"}))