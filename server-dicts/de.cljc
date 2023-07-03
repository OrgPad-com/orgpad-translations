(ns orgpad.server.i18n.de
  (:require [orgpad.common.i18n.dict.de :as de]))

(def dict
  "A dictionary map from keywords to the corresponding German texts."
  (merge
    de/dict
    {:orgpage/untitled                        "Dokument"
     :permission/view                         "zum Lessen"
     :permission/edit                         "zum Bearbeiten"

     :subscription/monthly                    "Monat"
     :subscription/yearly                     "Jahr"

     :tier/standard                           "Standard"
     :tier/professional                       "Professional"
     :tier/school                             "Schule"
     :tier/enterprise                         "Unternehmen"
     :tier/unlimited                          "Unbegrenzt"

     :email/customer                          "Kunde"
     :email/greeting                          "Sehr geehrter {{customer}},"
     :email/signature                         "Mit freundlichen Grüßen"
     :email/ceo                               "Vít Kalisz, CEO"
     :email/contact-us                        (fn [{:feedback/keys [url]}]
                                                (list "Wenn Sie auf Probleme stoßen, informieren Sie uns bitte über ein "
                                                      [:a {:href (str "{{domain}}" url)} "Formular in der Anwendung"]
                                                      " oder senden Sie eine E-Mail an " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                                " oder "

     :invitation/subject                      "Sie wurden {{action}} eines Dokumentes in OrgPad eingeladen"
     :invitation/preheader                    "{{user}} hat Sie {{action}} von {{title}} eingeladen. Zum Öffnen, klicken Sie bitte auf die Schaltfläche unten."
     :invitation/heading                      "{{user}} hat Sie {{action}} von {{title}} eingeladen."
     :invitation/info                         "OrgPad ist eine Plattform zum Erstellen von visuellen Dokumenten um eine Übersicht zu gewinnen. Mit dem Klick auf die Schaltfläche stimmen Sie der Einladung zu und öffnen das Dokument."
     :invitation/button                       "Dokument öffnen"
     :invitation/accidental-email             "Falls Sie diese E-Mail nicht empfangen wollten, löschen Sie diese bitte. Falls Sie diese E-Mails öfter empfangen haben, können Sie "
     :invitation/block-user                   "die Einladungen von {{user}} blockieren"
     :invitation/block-all                    "alle Einladungen blockieren"

     :footer/unsubscribe                      (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                                (list [:a href-orgpad "https://orgpad.com"] ". Möchten Sie diese E-Mails nicht mehr erhalten? "
                                                      [:a href-unsubscribe "Benachrichtigungen abmelden"] "."))

     :orgpage/copy                            "Kopie"

     :password-reset/subject                  "Zurücksetzen des OrgPad-Passworts"
     :password-reset/preheader                "Mit dem Klick auf die Schaltfläche unten setzen Sie das Passwort für OrgPad zurück."
     :password-reset/heading                  "Zurücksetzen des OrgPad-Passworts"
     :password-reset/text-1                   "Um das Passwort zurückzusetzen, klicken Sie bitte auf die Schaltfläche unten. Diese ist 24 Stunden lang gültig."
     :password-reset/button                   "Passwort zurücksetzen"
     :password-reset/text-2                   "Falls Sie das Zurücksetzen des Passworts nicht ausgelöst haben, oder es nicht mehr benötigen, müssen Sie nichts unternehmen."

     :verification/subject                    "Bestätigung des OrgPad-Kontos"
     :verification/preheader                  "Willkommen bei OrgPad. Bitte bestätigen Sie Ihr Konto mit dem Klick auf die Schaltfläche unten."
     :verification/heading                    "E-Mail bestätigen"
     :verification/verify-account-info        "Zum Bestätigen des Kontos, klicken Sie bitte auf die Schaltfläche unten. Mit dem Klick stimmen Sie weiter den "
     :verification/terms-and-conditions       "Nutzungsbedingungen von OrgPad zu"
     :verification/button                     "E-Mail-Adresse bestätigen"
     :verification/received-by-mistake        (str "Falls Sie diese E-Mail nicht empfangen wollten, löschen Sie diese bitte."
                                                   " Sollten Sie diese E-Mails öfter empfangen, bitte kontaktieren Sie uns unter der E-Mail-Adresse ")
     :verification/support-email              "support@orgpad.com"

     :feedback/subject                        "Frage: {{title}}"
     :feedback/preheader                      "{{first-name}} {{last-name}} hat eine Frage {{title}} geschickt"
     :feedback/heading                        "{{first-name}} {{last-name}} ({{email}}) hat eine Frage {{title}} geschickt"

     ;; newsletter was never really used
     :conference-invitation-2022/subject      "Einladung zur OrgPad Konferenz am 19. November 2022"
     :conference-invitation-2022/preheader    (str "Am 19. November um 9:30 Uhr in Prag, Smichov beginnt die zweite OrgPad Konferenz und Sie sollten sie nicht"
                                                   " verpassen! Es ist ein Treffen der Gemeinschaft, der Sie angehören. Sie können sich auf acht 20 Minuten lange"
                                                   " Vorträge, interessante Menschen, tolle Erfrischungen und ein Gewinnspiel freuen. Die Vortragenden sind: Barbora Jeřábková,"
                                                   " Janek Wagner, Radko Sáblík, Tomáš Baránek, Ondřej Lněnička, Václav Maněna und Petra Plachá")
     :conference-invitation-2022/introduction (str "Ich möchte Sie herzlich zur OrgPad-Konferenz einladen, die am Samstag, den 19. November 2022, ab 9:30 Uhr in"
                                                   " den wunderschönen Räumlichkeiten von Next Zone, Preslova 25, Prag 5-Smíchov stattfinden wird.")
     :conference-invitation-2022/info         (str "Kommen Sie und treffen Sie die anderen Community-Mitglieder! Freuen Sie sich auf interessante Gespräche"
                                                   " und schmackhafte Erfrischungen. Der Eintritt ist kostenlos. Die Vorträge werden in tschechischer Sprache abgehalten.")
     :conference-invitation-2022/button       "Zur Konferenz anmelden"
     :conference-invitation-2022/program      (list "Konferenzprogramm:"
                                                    [:ul {:style {:list-style-type "none"
                                                                  :margin          0
                                                                  :padding         0}}
                                                     [:li "09:30 - 10:00 Empfang"]
                                                     [:li "10:10 - 10:40 Eröffnungsrede und Keynote der OrgPad-Autoren"]
                                                     [:li "10:45 - 11:05 Baruš Jeřábková, \"Jen\" aplikace"]
                                                     [:li "11:30 - 11:50 Janek Wagner, České školství očima ajťáka aneb Jsem z toho janek"]
                                                     [:li "12:00 - 12:20 Radko Sáblík, Vzdělávání pro 21. století"]
                                                     [:li "13:00 - 13:20 Tomáš Baránek, Příprava autorské knihy a online kurzu v OrgPadu"]
                                                     [:li "13:30 - 13:50 Ondřej Lněnička, Jak jsme se stali školou na OrgPadu závislou"]
                                                     [:li "14:10 - 14:30 Václav Maněna, OrgPad v profesním i osobním životě učitele"]
                                                     [:li "14:40 - 15:00 Petra Plachá, My, ORGanizovaní proPADlí"]
                                                     [:li "15:00 - 15:30 Open Mic (3 - 5 Minuten Slots)"]
                                                     [:li "15:30 - 17:00 Bekanntgabe der Wettbewerbsgewinner, offene Diskussion und Begleitprogramm"]])
     :conference-invitation-2022/best-wishes2 "Mit freundlichen Grüßen"

     :contact-user/subject                    "Sie sind über OrgPad kontaktiert worden"
     :contact-user/preheader                  "Nachricht von {{user}}"
     :contact-user/heading                    "{{user}} ({{reply-to}}) kontaktiert Sie über OrgPad"
     :contact-user/common-info                (str "Diese E-Mail ist von uns, denn wir geben Ihre E-Mail-Adresse nicht an Dritte weiter."
                                                   " Sie können auf die Nachricht reagieren, indem Sie "
                                                   "auf diese Nachricht antworten oder können Sie eine E-Mail an {{reply-to}} schicken.")
     :contact-user/post-message-info          "Wenn die Nachricht unerwünscht ist, können Sie "
     :contact-user/block-user                 "alle Nachrichten von {{user}} blockieren"
     :contact-user/block-all                  "alle Nachrichten von allen Personen in OrgPad blockieren."

     ;; fall-newsletter was sent only in English and Czech

     :new-payment/subject                     "Zahlung erfolgreich"
     :new-payment/preheader                   "Sie haben Ihr {{tier}}-Abo bis {{subscription-end}} verlängert."
     :new-payment/common-info                 (list "Sie haben Ihr Abo in der Abo-Stufe {{tier}} für den Zeitraum bis "
                                                    [:b "{{subscription-end}}"] "erfolgreich verlängert."
                                                    " Vielen Dank für Ihre Zahlung!")
     :new-payment/download-receipt            "Rechnung herunterladen"

     :new-subscription/subject                "Bestätigung neues Abos"
     :new-subscription/preheader              "Ihr {{tier}}-Abo mit OrgPad ist jetzt aktiv. Das Abo wird automatisch nach einem {{period}} erneuert."
     :new-subscription/active-tier            "Ihr {{tier}}-Abo mit OrgPad ist jetzt aktiv. Vielen Dank für Ihre Zahlung!"
     :new-subscription/payment-info           (fn [{:payment/keys [url]}]
                                                (list "In Zukunft wird das Abonnement automatisch in jedem {{Zeitraum}} erneuert."
                                                      " Ihre Rechnungen werden automatisch in dem"
                                                      [:a {:href (str "{{domain}}" url)} "Zahlungsbereich"]
                                                      " in den OrgPad Einstellungen gespeichert."))

     :payment-failed/subject                  "Abo-Zahlung fehlgeschlagen"
     :payment-failed/preheader                (str "Bitte überprüfen Sie, ob Ihre Karte gültig ist und über ausreichend Guthaben verfügt."
                                                   " Sollten Probleme bestehen, kontaktieren Sie uns.")
     :payment-failed/error                    (str "bei der Bezahlung Ihres OrgPad Abos ist ein Fehler aufgetreten."
                                                   " Bitte überprüfen Sie, ob Ihre Karte gültig ist und über ausreichend Guthaben verfügt.")
     :payment-failed/payment                  "Zahlungsmethode aktualisieren"
     :payment-failed/current-subscription     (list "Ihr aktuelles Abo ist aktiv bis "
                                                    [:b "{{subscription-end}}"]
                                                    ". Wenn Sie Ihr Abo nicht bis zu diesem Datum bezahlen, wird Ihr Konto "
                                                    " in ein kostenloses Abo umgewandelt. Sie können weiterhin auf Ihre Daten zugreifen,"
                                                    " sie bearbeiten, löschen und teilen.")

     ;; admin-* are only in English
     }))