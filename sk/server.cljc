(ns orgpad.server.i18n.sk
  (:require [orgpad.common.i18n.dict.sk :as sk]
            [orgpad.common.company :as company]))

(def dict
  (merge
    sk/dict
    {:orgpage/untitled                    "dokumentu"
     :orgpage/copy                        "kópia"

     :permission/view                     "na čítanie"
     :permission/edit                     "na úpravu"

     :subscription/monthly                "mesiac"
     :subscription/yearly                 "rok"

     :email/greeting                      "Vážený {{customer}},"
     :email/signature                     "S pozdravom"
     :email/team                          "Pavel Klavík a Kamila Klavíková"
     :email/creators                      "tvorcovia OrgPadu"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". Nechcete dostávať tieto e-maily? "
                                                  [:a href-unsubscribe "Odhláste sa"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "Ak narazíte na akékoľvek problémy, dajte nám vedieť pomocou "
                                                  [:a {:href (str "{{domain}}" url)} "formulára v aplikácii"]
                                                  " alebo e-mailom na " company/support-email-link "."))
     :email/or                            " alebo "
     :email/customer                      "zákazník"

     :verification/subject                "Overenie Vášho účtu v OrgPade"
     :verification/preheader              "Vitajte v OrgPade. Overte svoj účet kliknutím na tlačidlo nižšie."
     :verification/heading                "Overenie Vášho e-mailu"
     :verification/body                   "Ak chcete overiť svoj účet, kliknite na tlačidlo nižšie. Kliknutím na tlačidlo ďalej súhlasíte s "
     :verification/terms-and-conditions   "podmienkami používania OrgPadu"
     :verification/button                 "Potvrdiť e-mailovú adresu"
     :verification/accidental-email       "Ak ste tento e-mail dostali omylom, odstráňte ho. Ak tieto e-maily dostávate opakovane, kontaktujte nás na adrese "

     :password-reset/subject              "Obnovenie Vášho hesla v OrgPade"
     :password-reset/preheader            "Pomocou kliknutia na tlačidlo nižšie obnovíte Vaše heslo v OrgPade."
     :password-reset/heading              "Obnovenie Vášho hesla v OrgPade"
     :password-reset/body                 "Pre obnovenie Vášho hesla prosím kliknite na tlačidlo nižšie. Platné je po dobu 24 hodín."
     :password-reset/button               "Obnoviť heslo"
     :password-reset/accidental-email     "Ak ste obnovu hesla nevyvolali, alebo ak už obnovu nepotrebujete, nemusíte nič podnikať."

     :new-subscription/subject            "Potvrdenie nového predplatného"
     :new-subscription/preheader          "Váš plán {{tier}} s OrgPadom je teraz aktívny. Predplatné sa bude automaticky obnovovať každý {{period}}."
     :new-subscription/body               "Váš plán {{tier}} s OrgPadom je teraz aktívny. Ďakujeme za platbu!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "V budúcnosti sa bude predplatné automaticky obnovovať každý {{period}}. Vaše účtenky sa automaticky ukladajú v "
                                                  [:a {:href (str "{{domain}}" url)} "sekcii platieb"] " v nastaveniach OrgPadu."))

     :new-payment/subject                 "Platba úspešná"
     :new-payment/preheader               "Obnovili ste si predplatné plánu {{tier}}, platné do {{subscription-end}}."
     :new-payment/body                    (list "Úspešne ste si obnovili predplatné plánu {{tier}}. Platí do "
                                                [:b "{{subscription-end}}"] ". Ďakujeme za platbu!")
     :new-payment/button                  "Stiahnuť faktúru"

     :payment-failed/subject              "Platba za predplatné zlyhala"
     :payment-failed/preheader            "Skontrolujte, či je Vaša karta platná a či máte dostatok prostriedkov. Ak problémy pretrvávajú, kontaktujte nás."
     :payment-failed/body                 (str "Pri platbe za Vaše predplatné OrgPadu sa vyskytla chyba."
                                               " Skontrolujte, či je Vaša karta platná a či máte dostatok prostriedkov.")
     :payment-failed/button               "Aktualizovať spôsob platby"
     :payment-failed/grace-warning        (list "Vaše aktuálne predplatné je aktívne do "
                                                [:b "{{subscription-end}}"]
                                                ". Ak do tohto dátumu nezaplatíte, Váš účet sa prevedie na bezplatný plán. Stále budete mať prístup k svojim údajom, budete ich môcť upravovať, odstraňovať a zdieľať.")

     :feedback/subject                    "Otázka: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} poslal otázku {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) poslal otázku {{title}}"

     :invitation/subject                  "Ste pozvaní na {{action}} dokumentu v OrgPade"
     :invitation/preheader                "{{user}} vás pozýva na {{action}} {{title}}. Kliknite na tlačidlo nižšie, aby ste ho otvorili."
     :invitation/heading                  "{{user}} vás pozýva na {{action}} {{title}}"
     :invitation/body                     "OrgPad je platforma na vytváranie vizuálnych dokumentov pre získanie celkového obrazu. Kliknutím na nasledujúce tlačidlo prijmete pozvanie a otvoríte dokument."
     :invitation/button                   "Otvoriť dokument"
     :invitation/accidental-email         "Ak ste tento e-mail dostali omylom, odstráňte ho. Ak tieto e-maily dostávate opakovane, môžete "
     :invitation/block-user               "zablokovať pozvánky od {{user}}"
     :invitation/block-all                "zablokovať všetky pozvánky"

     :contact-user/subject                "Boli ste kontaktovaní cez OrgPad"
     :contact-user/preheader              "Správa od {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) vás kontaktuje cez OrgPad"
     :contact-user/body                   (str "Tento e-mail vám posielame my, pretože Vašu e-mailovú adresu s nikým iným nezdieľame. Na správu môžete odpovedať "
                                               "odpovedaním na túto správu alebo e-mailom na adresu {{reply-to}}.")
     :contact-user/unsolicited-info       "Ak je správa nevyžiadaná, môžete "
     :contact-user/block-user             "zablokovať všetky správy od {{user}}"
     :contact-user/block-all              "zablokovať všetky správy od všetkých ľudí v OrgPade."

     :blog/rss-description                "Najnovšie správy a aktualizácie pre OrgPad a technické diskusie."

     :newsletter-2024-summer/subject      "Letná aktualizácia od OrgPadu"
     :newsletter-2024-summer/preheader    "Zistite viac o našich najnovších aktualizáciách aplikácie, novom blogu, vylepšených opatreniach na ochranu súkromia a ďalších!"
     :newsletter-2024-summer/introduction "Po ročnej prestávke sme späť s ďalším newsletterom!"
     :newsletter-2024-summer/heading      "V tomto newsletteri nájdete:"
     :newsletter-2024-summer/body         (list [:li "Čo je nové v aplikácii od začiatku roka?"]
                                                [:li "Čo nájdete na našom novom blogu?"]
                                                [:li "Ako sa staráme o Vaše súkromie a bezpečnosť Vašich údajov?"]
                                                [:li "Ako sme aktualizovali zmluvné podmienky pre Vaše pohodlie?"]
                                                [:li "Prečo sa pripojiť ku komunite?"])
     :newsletter-2024-summer/button       "Prečítať newsletter"
     :newsletter-2024-summer/closing      "Tešíme sa na Vaše nápady!"}))