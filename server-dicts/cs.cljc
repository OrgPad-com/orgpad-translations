(ns orgpad.server.i18n.cs)

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  {:lang/name                         "Čeština"
   :lang/en-name                      "Czech"
   :lang/plural-breaks                [0 1 2 5]             ; Counts of elements for which the next translation for :i18n/plural is used.

   :orgpage/untitled                  "dokumentu"
   :permission/view                   "ke čtení"
   :permission/edit                   "k úpravě"

   :email/customer                    "zákazníku"
   :email/greeting                    "Vážený {{customer}},"

   :invitation/subject                "Jste pozváni {{action}} dokumentu v OrgPadu"
   :invitation/preheader              "{{user}} vás zve {{action}} {{title}}. K otevření dokumentu prosím klikněte na tlačítko níže."
   :invitation/heading                "{{user}} vás zve {{action}} {{title}}"
   :invitation/info                   "OrgPad je platforma na vytváření vizuálních dokumentů pro získání nadhledu. Kliknutím na následující tlačítko přijmete pozvánku a otevřete dokument."
   :invitation/button                 "Otevřít dokument"
   :invitation/accidental-email       "Pokud jste tento email obdrželi omylem, smažte ho prosím. Pokud tyto emaily dostáváte opakovaně, můžete "
   :invitation/block-user             "zablokovat pozvánky od {{user}}"
   :invitation/block-or               " nebo "
   :invitation/block-all              "zablokovat všechny pozvánky"

   :footer/unsubscribe                (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                        (list [:a href-orgpad "https://orgpad.com"] ". Nechcete dostávat tyto emaily? "
                                              [:a href-unsubscribe "Odhlašte se"] "."))

   :orgpage/copy                      "kopie"

   :password-reset/subject            "Obnovení Vašeho hesla v OrgPadu"
   :password-reset/preheader          "Pomocí kliknutí na tlačítko níže obnovíte Vaše heslo v OrgPadu."
   :password-reset/heading            "Obnovení Vašeho hesla v OrgPadu"
   :password-reset/text-1             "Pro obnovení Vašeho hesla prosím klikněte na tlačítko níze. Platné je po dobu 24 hodin."
   :password-reset/button             "Obnovit heslo"
   :password-reset/text-2             "Pokud jste obnovu hesla nevyvolali, nebo pokud už obnovu nepotřebujete, nemusíte nic podnikat."

   :verification/subject              "Ověření Vašeho účtu v OrgPadu"
   :verification/preheader            "Vítejte v OrgPadu. Pomocí kliknutí na tlačítko níže prosím oveřte Váš účet."
   :verification/heading              "Ověření Vašeho emailu"
   :verification/verify-account-info  "Pro ověření Vašeho účtu, prosím klikněte na tlačítko níže. Kliknutím na tlačítko dále souhlasíte s "
   :verification/terms-and-conditions "podmínkami použití OrgPadu"
   :verification/button               "Ověřit emailovou adresu"
   :verification/received-by-mistake  "Pokud jste tento email obdrželi omylem, smažte ho prosím. Pokud tyto emaily dostáváte opakovaně, kontaktujte nás prosím na adrese "
   :verification/support-email        "support@orgpad.com"

   :feedback/subject                  "Zpětná vazba uživatele: {{title}}"
   :feedback/preheader                "{{first-name}} {{last-name}} odeslal zpětnou vazbu {{title}}"
   :feedback/heading                  "{{first-name}} {{last-name}} ({{email}}) odeslal zpětnou vazbu {{title}}"})