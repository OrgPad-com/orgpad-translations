(ns orgpad.server.i18n.de)

(def dict
  "A dictionary map from keywords to the corresponding German texts."
  {:lang/name                         "Deutsch"
   :lang/en-name                      "German"
   :lang/plural-breaks                [0 1 2]               ; Counts of elements for which the next translation for :i18n/plural is used.

   :orgpage/untitled                  "Dokument"
   :permission/view                   "zum Lessen"
   :permission/edit                   "zum Bearbeiten"

   :email/customer                    "Kunde"
   :email/greeting                    "Sehr geehrter {{customer}},"

   :invitation/subject                "Sie wurden {{action}} eines Dokumentes in OrgPad eingeladen"
   :invitation/preheader              "{{user}} hat Sie {{action}} von {{title}} eingeladen. Zum Öffnen, klicken Sie bitte auf die Schaltfläche unten."
   :invitation/heading                "{{user}} hat Sie {{action}} von {{title}} eingeladen."
   :invitation/info                   "OrgPad ist eine Plattform zum Erstellen von visuellen Dokumenten um eine Übersicht zu gewinnen. Mit dem Klick auf die Schaltfläche stimmen Sie der Einladung zu und öffnen das Dokument."
   :invitation/button                 "Dokument öffnen"
   :invitation/accidental-email       "Falls Sie diese E-Mail nicht empfangen wollten, löschen Sie diese bitte. Falls Sie diese E-Mails öfter empfangen haben, können Sie "
   :invitation/block-user             "die Einladungen von {{user}} blockieren"
   :invitation/block-or               " oder "
   :invitation/block-all              "alle Einladungen blockieren"

   :footer/unsubscribe                (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                        (list [:a href-orgpad "https://orgpad.com"] ". Möchten Sie diese E-Mails nicht mehr erhalten? "
                                              [:a href-unsubscribe "Benachrichtigungen abmelden"] "."))

   :orgpage/copy                      "Kopie"

   :password-reset/subject            "Zurücksetzen des OrgPad-Passworts"
   :password-reset/preheader          "Mit dem Klick auf die Schaltfläche unten setzen Sie das Passwort für OrgPad zurück."
   :password-reset/heading            "Zurücksetzen des OrgPad-Passworts"
   :password-reset/text-1             "Um das Passwort zurückzusetzen, klicken Sie bitte auf die Schaltfläche unten. Diese ist 24 Stunden lang gültig."
   :password-reset/button             "Passwort zurücksetzen"
   :password-reset/text-2             "Falls Sie das Zurücksetzen des Passworts nicht ausgelöst haben, oder es nicht mehr benötigen, müssen Sie nichts unternehmen."

   :verification/subject              "Bestätigung des OrgPad-Kontos"
   :verification/preheader            "Willkommen bei OrgPad. Bitte bestätigen Sie Ihr Konto mit dem Klick auf die Schaltfläche unten."
   :verification/heading              "E-Mail bestätigen"
   :verification/verify-account-info  "Zum Bestätigen des Kontos, klicken Sie bitte auf die Schaltfläche unten. Mit dem Klick stimmen Sie weiter den "
   :verification/terms-and-conditions "Nutzungsbedingungen von OrgPad zu"
   :verification/button               "E-Mail-Adresse bestätigen"
   :verification/received-by-mistake  "Falls Sie diese E-Mail nicht empfangen wollten, löschen Sie diese bitte. Sollten Sie diese E-Mails öfter empfangen, bitte kontaktieren Sie uns unter der E-Mail-Adresse "
   :verification/support-email        "support@orgpad.com"

   :feedback/subject                  "Rückmeldung eines Nutzers: {{title}}"
   :feedback/preheader                "{{first-name}} {{last-name}} hat eine Rückmeldung {{title}} geschickt"
   :feedback/heading                  "{{first-name}} {{last-name}} ({{email}}) hat eine Rückmeldung {{title}} geschickt"})