(ns orgpad.server.i18n.de
  (:require [orgpad.common.i18n.dict.de :as de]
            [orgpad.common.company :as company]))

(def dict
  "A dictionary map from keywords to the corresponding German texts."
  (merge
    de/dict
    {:orgpage/untitled                    "Dokument"
     :orgpage/copy                        "Kopie"

     :permission/view                     "zu lesen"
     :permission/edit                     "zu bearbeiten"

     :subscription/monthly                "Monat"
     :subscription/yearly                 "Jahr"

     :email/greeting                      "Sehr geehrter {{customer}},"
     :email/signature                     "Mit freundlichen Grüßen"
     :email/team                          "Pavel Klavík und Kamila Klavíková"
     :email/creators                      "Schöpfer von OrgPad"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". Möchten Sie diese E-Mails nicht mehr erhalten? "
                                                  [:a href-unsubscribe "Abmelden"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "Wenn Sie auf Probleme stoßen, informieren Sie uns bitte über ein "
                                                  [:a {:href (str "{{domain}}" url)} "Formular in der Anwendung"]
                                                  " oder senden Sie eine E-Mail an " company/support-email-link "."))
     :email/or                            " oder "
     :email/customer                      "Kunde"

     :verification/subject                "Bestätigen Sie Ihr OrgPad-Konto"
     :verification/preheader              "Willkommen bei OrgPad. Bitte bestätigen Sie Ihr Konto, indem Sie auf den folgenden Link klicken."
     :verification/heading                "E-Mail bestätigen"
     :verification/body                   "Um Ihr Konto zu bestätigen, klicken Sie bitte auf den folgenden Link. Mit dem Klick stimmen Sie außerdem den Nutzungsbedingungen von OrgPad zu."
     :verification/terms-and-conditions   "Nutzungsbedingungen von OrgPad"
     :verification/button                 "E-Mail-Adresse bestätigen"
     :verification/accidental-email       (str "Falls Sie diese E-Mail nicht empfangen wollten, löschen Sie diese bitte. "
                                               "Sollten Sie diese E-Mails häufiger erhalten, kontaktieren Sie uns bitte unter der E-Mail-Adresse ")

     :password-reset/subject              "Setzen Sie Ihr OrgPad-Passwort zurück"
     :password-reset/preheader            "Klicken Sie auf den folgenden Link, um Ihr OrgPad-Passwort zurückzusetzen."
     :password-reset/heading              "OrgPad-Passwort zurücksetzen"
     :password-reset/body                 "Klicken Sie auf den folgenden Link, um Ihr Passwort zurückzusetzen. Der Link ist 24 Stunden gültig."
     :password-reset/button               "Passwort zurücksetzen"
     :password-reset/accidental-email     "Wenn Sie das Zurücksetzen des Passworts nicht angefordert haben oder es nicht mehr benötigen, brauchen Sie nichts weiter zu tun."

     :new-subscription/subject            "Ihr neues OrgPad-Abo ist jetzt aktiv"
     :new-subscription/preheader          "Ihr {{tier}}-Abo mit OrgPad ist jetzt aktiv. Das Abo wird automatisch alle {{period}} erneuert."
     :new-subscription/body               "Ihr {{tier}}-Abo mit OrgPad ist jetzt aktiv. Vielen Dank für Ihre Zahlung!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "Das Abonnement wird künftig automatisch alle {{period}} erneuert. "
                                                  "Ihre Rechnungen werden automatisch im Bereich "
                                                  [:a {:href (str "{{domain}}" url)} "Zahlungen "]
                                                  " der OrgPad-Einstellungen gespeichert."))

     :new-payment/subject                 "Zahlung erfolgreich"
     :new-payment/preheader               "Sie haben Ihr {{tier}}-Abo bis {{subscription-end}} verlängert."
     :new-payment/body                    (list "Sie haben Ihr {{tier}}-Abo erfolgreich bis "
                                                [:b "{{subscription-end}}"]
                                                " verlängert. Vielen Dank für Ihre Zahlung!")
     :new-payment/button                  "Rechnung herunterladen"

     :payment-failed/subject              "Abo-Zahlung fehlgeschlagen"
     :payment-failed/preheader            (str "Bitte überprüfen Sie, ob Ihre Karte gültig ist und über ausreichend Guthaben verfügt."
                                               " Sollten Probleme bestehen, kontaktieren Sie uns.")
     :payment-failed/body                 (str "Bei der Bezahlung Ihres OrgPad-Abos ist ein Fehler aufgetreten. "
                                               "Bitte überprüfen Sie, ob Ihre Karte gültig ist und über ausreichend Guthaben verfügt.")
     :payment-failed/button               "Zahlungsmethode aktualisieren"
     :payment-failed/grace-warning        (list "Ihr aktuelles Abo ist bis "
                                                [:b "{{subscription-end}}"]
                                                " aktiv. Wenn Sie die Zahlung bis zu diesem Datum nicht vornehmen, wird Ihr Konto auf das kostenlose Abo umgestellt. "
                                                "Sie können weiterhin auf Ihre Daten zugreifen, sie bearbeiten, löschen und teilen.")

     :feedback/subject                    "Frage: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} hat eine Frage {{title}} gesendet"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) hat eine Frage {{title}} gesendet"

     :invitation/subject                  "Sie wurden eingeladen, {{action}} ein Dokument in OrgPad."
     :invitation/preheader                "{{user}} hat Sie eingeladen, {{title}} {{action}}. Klicken Sie auf den folgenden Link, um es zu öffnen."
     :invitation/heading                  "{{user}} hat Sie eingeladen, {{title}} {{action}}."
     :invitation/body                     "OrgPad ist eine Plattform zum Erstellen visueller Dokumente für den Überblick. Wenn Sie auf den folgenden Link klicken, akzeptieren Sie die Einladung und öffnen das Dokument."
     :invitation/button                   "Dokument öffnen"
     :invitation/accidental-email         "Falls Sie diese E-Mail irrtümlich erhalten haben, löschen Sie sie bitte. Wenn Sie solche E-Mails häufiger erhalten, können Sie "
     :invitation/block-user               "die Einladungen von {{user}} blockieren"
     :invitation/block-all                "alle Einladungen blockieren"

     :contact-user/subject                "Sie wurden über OrgPad kontaktiert"
     :contact-user/preheader              "Nachricht von {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) kontaktiert Sie über OrgPad"
     :contact-user/body                   (str "Diese E-Mail stammt von uns, da wir Ihre E-Mail-Adresse nicht an Dritte weitergeben. "
                                               "Sie können auf die Nachricht antworten, indem Sie einfach auf diese E-Mail antworten "
                                               "oder eine Nachricht an {{reply-to}} senden.")
     :contact-user/unsolicited-info       "Wenn die Nachricht unerwünscht ist, können Sie "
     :contact-user/block-user             "alle Nachrichten von {{user}} blockieren"
     :contact-user/block-all              "alle Nachrichten von allen Personen in OrgPad blockieren."

     :blog/rss-description                "Die neuesten Nachrichten und Updates für OrgPad und technische Diskussionen."

     :newsletter-2024-summer/subject      "Sommer-Update von OrgPad"
     :newsletter-2024-summer/preheader    "Erfahren Sie mehr über unsere neuesten App-Updates, den neuen Blog, verbesserte Datenschutzmaßnahmen und mehr!"
     :newsletter-2024-summer/introduction "Wir sind nach einer einjährigen Pause mit einem weiteren Newsletter zurück!"
     :newsletter-2024-summer/heading      "Das finden Sie in diesem Newsletter:"
     :newsletter-2024-summer/body         (list [:li "Was ist seit Jahresbeginn neu in der App?"]
                                                [:li "Was finden Sie in unserem neuen Blog?"]
                                                [:li "Wie kümmern wir uns um Ihre Privatsphäre und die Sicherheit Ihrer Daten?"]
                                                [:li "Wie haben wir die Allgemeinen Geschäftsbedingungen zu Ihrem Komfort aktualisiert?"]
                                                [:li "Warum sollten Sie der Community beitreten?"])
     :newsletter-2024-summer/button       "Newsletter lesen"
     :newsletter-2024-summer/closing      "Wir freuen uns auf Ihre Ideen!"}))