(ns orgpad.server.i18n.pl
  (:require [orgpad.common.i18n.dict.pl :as pl]
            [orgpad.common.company :as company]))

(def dict
  (merge
    pl/dict
    {:orgpage/untitled                    "dokument"
     :orgpage/copy                        "kopia"

     :permission/view                     "do odczytu"
     :permission/edit                     "do edycji"

     :subscription/monthly                "miesiąc"
     :subscription/yearly                 "rok"

     :email/greeting                      "Szanowny Użytkowniku,"
     :email/signature                     "Z poważaniem"
     :email/team                          "Pavel Klavík i Kamila Klavíková"
     :email/creators                      "Twórcy OrgPad"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"]
                                                  ". Nie chcą Państwo otrzymywać tych e-maili? "
                                                  [:a href-unsubscribe "Anulujcie subskrypcję"]
                                                  "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "Jeśli napotkają Państwo jakiekolwiek problemy, prosimy o kontakt poprzez "
                                                  [:a {:href (str "{{domain}}" url)} "formularz w aplikacji"]
                                                  " lub wysyłając e-mail na adres " company/support-email-link "."))

     :email/or                            " lub "
     :email/customer                      "klient"

     :verification/subject                "Zweryfikuj swoje konto OrgPad"
     :verification/preheader              "Witamy w OrgPad. Prosimy o zweryfikowanie konta, klikając poniższy przycisk."
     :verification/heading                "Zweryfikuj swój adres e-mail"
     :verification/body                   "Aby zweryfikować swoje konto, prosimy kliknąć przycisk poniżej. Klikając, akceptują Państwo "
     :verification/terms-and-conditions   "Warunki korzystania z usługi OrgPad"
     :verification/button                 "Potwierdź adres e-mail"
     :verification/accidental-email       "Jeśli otrzymali Państwo tę wiadomość przez pomyłkę, prosimy ją usunąć. Jeśli sytuacja się powtarza, prosimy o kontakt na adres "

     :password-reset/subject              "Zresetuj hasło do konta OrgPad"
     :password-reset/preheader            "Aby zresetować hasło do konta OrgPad, prosimy kliknąć poniższy przycisk."
     :password-reset/heading              "Zresetuj hasło do konta OrgPad"
     :password-reset/body                 "Aby zresetować hasło, prosimy kliknąć przycisk poniżej. Link jest ważny przez 24 godziny."
     :password-reset/button               "Zresetuj hasło"
     :password-reset/accidental-email     "Jeśli nie prosili Państwo o zresetowanie hasła lub nie muszą już go zmieniać, prosimy zignorować tę wiadomość."

     :new-subscription/subject            "Potwierdzenie nowej subskrypcji"
     :new-subscription/preheader          "Państwa plan {{tier}} w OrgPad jest teraz aktywny. Subskrypcja będzie odnawiana automatycznie co {{period}}."
     :new-subscription/body               "Państwa plan {{tier}} w OrgPad jest teraz aktywny. Dziękujemy za płatność!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "W przyszłości subskrypcja będzie odnawiana automatycznie co {{period}}. Faktury są dostępne w "
                                                  [:a {:href (str "{{domain}}" url)} "sekcji płatności"]
                                                  " w ustawieniach OrgPad."))

     :new-payment/subject                 "Płatność zakończona pomyślnie"
     :new-payment/preheader               "Odnowili Państwo subskrypcję planu {{tier}}, ważną do {{subscription-end}}."
     :new-payment/body                    (list "Pomyślnie odnowili Państwo subskrypcję planu {{tier}}. Jest ona ważna do "
                                                [:b "{{subscription-end}}"] ". Dziękujemy za płatność!")
     :new-payment/button                  "Pobierz fakturę"

     :payment-failed/subject              "Płatność za subskrypcję nie powiodła się"
     :payment-failed/preheader            "Prosimy sprawdzić, czy karta jest ważna i czy posiada wystarczające środki. Jeśli problem będzie się powtarzać, prosimy o kontakt."
     :payment-failed/body                 (str "Wystąpił błąd podczas płatności za subskrypcję OrgPad. "
                                               "Prosimy sprawdzić, czy karta jest ważna i posiada wystarczające środki.")
     :payment-failed/button               "Zaktualizuj metodę płatności"
     :payment-failed/grace-warning        (list "Obecna subskrypcja jest aktywna do "
                                                [:b "{{subscription-end}}"]
                                                ". Jeśli do tego dnia nie opłacą Państwo subskrypcji, konto zostanie obniżone do planu darmowego. "
                                                "Dane nadal będą dostępne do odczytu, edycji i udostępniania.")

     :feedback/subject                    "Pytanie: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} wysłał pytanie {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) wysłał pytanie {{title}}"

     :invitation/subject                  "Zostali Państwo zaproszeni do {{action}} dokumentu w OrgPad"
     :invitation/preheader                "{{user}} zaprosił(a) Państwa do {{action}} {{title}}. Prosimy kliknąć poniższy przycisk, aby go otworzyć."
     :invitation/heading                  "{{user}} zaprosił(a) Państwa do {{action}} {{title}}"
     :invitation/body                     "OrgPad to platforma do tworzenia wizualnych dokumentów dla uzyskania pełnego obrazu. Klikając przycisk poniżej, akceptują Państwo zaproszenie i otwierają dokument."
     :invitation/button                   "Otwórz dokument"
     :invitation/accidental-email         "Jeśli otrzymali Państwo tę wiadomość przez pomyłkę, prosimy ją usunąć. Jeśli sytuacja się powtarza, mogą Państwo "
     :invitation/block-user               "zablokować zaproszenia od {{user}}"
     :invitation/block-all                "zablokować wszystkie zaproszenia"

     :contact-user/subject                "Skontaktowano się z Państwem za pośrednictwem OrgPad"
     :contact-user/preheader              "Wiadomość od {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) kontaktuje się z Państwem za pośrednictwem OrgPad"
     :contact-user/body                   (str "Ten e-mail pochodzi od nas, ponieważ nie udostępniamy Państwa adresu e-mail nikomu innemu. "
                                               "Mogą Państwo odpowiedzieć na wiadomość, odpisując na nią lub wysyłając e-mail na adres {{reply-to}}.")
     :contact-user/unsolicited-info       "Jeśli wiadomość jest niechciana, mogą Państwo "
     :contact-user/block-user             "zablokować wszystkie wiadomości od {{user}}"
     :contact-user/block-all              "zablokować wszystkie wiadomości od wszystkich osób w OrgPad."

     :blog/rss-description                "Najnowsze wiadomości i aktualizacje dotyczące OrgPad oraz dyskusje techniczne."

     :newsletter-2024-summer/subject      "Letnia aktualizacja od OrgPad"
     :newsletter-2024-summer/preheader    "Dowiedz się o naszych najnowszych aktualizacjach aplikacji, nowym blogu, ulepszonych środkach ochrony prywatności i nie tylko!"
     :newsletter-2024-summer/introduction "Po rocznej przerwie wracamy z kolejnym newsletterem!"
     :newsletter-2024-summer/heading      "W tym newsletterze znajdą Państwo:"
     :newsletter-2024-summer/body         (list [:li "Co nowego w aplikacji od początku roku?"]
                                                [:li "Co znajdą Państwo na naszym nowym blogu?"]
                                                [:li "Jak dbamy o prywatność i bezpieczeństwo danych?"]
                                                [:li "Jak zaktualizowaliśmy warunki korzystania z usługi dla Państwa wygody?"]
                                                [:li "Dlaczego warto dołączyć do społeczności?"])
     :newsletter-2024-summer/button       "Przeczytaj newsletter"
     :newsletter-2024-summer/closing      "Czekamy na Państwa pomysły!"}))