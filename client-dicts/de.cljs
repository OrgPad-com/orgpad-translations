(ns orgpad.client.i18n.dicts.de
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.de :as de]))

(def dict
  "A dictionary map from keywords to the corresponding German texts."
  (merge
    de/dict
    {:attachments/allows-access-to-file               "Erlaubt den Zugriff auf diese Datei."
     :attachments/allows-access-to-image              "Erlaubt den Zugriff auf dieses Bild."
     :attachments/no-preview                          "Keine Ansicht verfügbar."
     :attachments/used-files                          "Dateien in der OrgSeite"
     :attachments/unused-files                        "Dateien beiseite"
     :attachments/used-images                         "Bilder in der OrgSeite"
     :attachments/unused-images                       "Bilder beiseite"
     :attachments/uploading-files                     "Dateien werden hochgeladen ..."

     :button/back                                     "Zurück"
     :button/cancel                                   "Abbrechen"
     :button/close                                    "Schließen"
     :button/copied                                   "Kopiert"
     :button/copy                                     "Kopieren"
     :button/copy-link                                "Link kopieren"
     :button/create                                   "Erstellen"
     :button/create-tooltip                           "Erstellen (STRG+Eingabetaste)"
     :button/delete                                   "Löschen"
     :button/delete-selected                          "Auswahl löschen"
     :button/documentation                            "Dokumentation"
     :button/download                                 "Herunterladen"
     :button/download-all                             "Alle herunterladen"
     :button/drop                                     "Ablegen"
     :button/edit                                     "Bearbeiten"
     :button/import                                   "Importieren"
     :button/login                                    "Anmelden"
     :button/logout                                   "Abmelden"
     :button/publish                                  "Veröffentlichen"
     :button/read                                     "Lesen"
     :button/register                                 "Registrieren"
     :button/save                                     "Änderungen speichern"
     :button/save-tooltip                             "Änderungen speichern (STRG+Eingabetaste)"
     :button/upload                                   "Hochladen"
     :button/send                                     "Senden"
     :button/present                                  "Präsentieren"
     :button/present-tooltip                          "Präsentation starten (F5)"
     :button/share                                    "Teilen"
     :button/exit                                     "Verlassen"
     :button/show-password                            "Anzeigen"
     :button/hide-password                            "Ausblenden"

     :checkout/currency                               "Währung"
     :checkout/monthly                                "monatlich"
     :checkout/yearly                                 "jährlich (15 % sparen)"
     ;; Kaufabschluss, zur Kasse gehen, das/ der Check-out
     :checkout/failed-to-init                         "Beim Übergang zur Kasse ist ein Problem aufgetreten."
     :checkout/upgrade-plan                           "Abo-Upgrade" ; (d. h. ein Wechsel zu einer höheren Abostufe) (siehe Netflix help)
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Schule"] " oder "
                                                         [:a.link-button {:href enterprise-url} "Unternehmen"] "? Kontaktieren Sie uns für ein individuelles Angebot."])
     :checkout/pay-with-credit-card                   "Mit Kreditkarte bezahlen"
     :checkout/pay-with-wire-transfer                 "Mit Überweisung bezahlen"
     :checkout/promo-code                             "Gutscheincode"
     :checkout/try-for-free                           "Kostenlos ausprobieren"
     :checkout/activate-now                           "Jetzt aktivieren"
     :checkout/continue-for-free                      "Kostenlos fortsetzen"

     :consent/title                                   "Nutzung von Cookies in OrgPad"
     :consent/text                                    (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                        [:<> "Mit der Nutzung dieser Webseite stimmen Sie den "
                                                         [:a.link-button terms-and-conditions "Nutzungsbedingungen"]
                                                         " und den "
                                                         [:a.link-button privacy-policy "Datenschutz-Bestimmungen"]
                                                         " von OrgPad zu. "
                                                         (str "Um die Funktionalität in bestimmten Bereichen von OrgPad "
                                                              "sicherstellen zu können, werden Cookies verwendet.")])

     :dashboard/confirm-delete                        [:<> "Sind Sie sicher, dass Sie diese OrgSeite endgültig löschen wollen?"]
     :dashboard/login-needed                          [:<> "Um OrgSeiten zu erstellen, müssen Sie sich " [:b "anmelden"] " oder " [:b "registrieren"] "."]
     :dashboard/owned-orgpages                        "Meine OrgSeiten"
     :dashboard/public-orgpages                       "Veröffentlichte OrgSeiten"
     :dashboard/shared-orgpages                       "Mit Ihnen geteilte OrgSeiten"
     :dashboard/usergroup-orgpages                    "{usergroup/name}'s OrgSeiten"
     :dashboard/public-permission-edit                "Mit allen zum Bearbeiten geteilt"
     :dashboard/public-permission-view                "Mit allen zum Lesen geteilt"
     :dashboard/create-public-orgpage                 "Als öffentlich erstellen"
     :dashboard/leave-orgpage-as-public               "Als öffentlich belassen"
     :dashboard/owner-reached-private-limit           "Der Inhaber hat das Limit erreicht"
     :dashboard/copy-as-public                        "Als öffentlich kopieren"
     :dashboard/copy-from-template-as-public          "Als öffentlich von der Vorlage kopieren"

     :editors/create-page                             "Seite hinzufügen"
     :editors/remove-page                             "Diese Seite löschen"
     :editors/previous-page                           "Vorherige Seite; Umschalttaste halten um diese Seite nach links zu verschieben"
     :editors/next-page                               "Nächste Seite; Umschalttaste halten um diese Seite nach rechts zu verschieben"
     :editors/title                                   "Überschrift"
     :editors/switch-to-this-page                     (fn [{:render/keys [can-edit]}]
                                                        (str "Zu dieser Seite wechseln"
                                                             (when can-edit "; Umschalttaste halten um aktuelle Seite dahin zu verschieben")))
     :editors/hidden-info                             "Klicken Sie zum Schreiben"

     :embedding-code/code                             "Code"
     :embedding-code/description                      [:<> "Um diese OrgSeite in Ihre " [:b "Webseite"]
                                                       " einzubetten, fügen Sie den angegebenen Code in Ihre Webseite ein:"]

     :error/orgpage-access-denied                     "Sie haben keinen Zugriff zu dieser OrgSeite. Versuchen Sie sich anzumelden."
     :error/usergroup-access-denied                   "Berechtigung zum bearbeiten des Teams wurde verweigert."
     :error/already-member                            "„{usergroups/member}“ ist bereits Mitglied."
     :error/administration-access                     "Verwaltungszugriff wurde verweigert."
     :error/creation-unauthorized                     "Zum erstellen von OrgSeiten müssen Sie sich anmelden."
     :error/deleting-denied                           "Löschen der OrgSeite wurde verweigert."
     :error/email-already-used                        "Diese E-Mail wird bereits genutzt."
     :error/email-not-registered                      "Kein Konto mit dieser E-Mail."
     :error/email-missing-mx-record                   "Kein E-Mail-Server unter der Domäne."
     :error/email-invalid                             "Ungültige E-Mail."
     :error/error                                     "Fehler: "
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Ungültige OrgSeite" (when id " {orgpage/id}")
                                                             ". Fehlerhaft kopierter Link?"))
     :error/incorrect-link                            "Ungültiger Link. Entweder melden Sie sich bitte an, oder verwenden Sie einen gültigen Link."
     :error/incorrect-password                        "Ungültiges Passwort."
     :error/incorrect-profile-id                      "Ungültiger Link zum Profil. Fehlerhaft kopierter Link?"
     :error/lost-permission                           "Sie haben den Zugriff zu dieser OrgSeite verloren."
     :error/name-already-used                         "Dieser Name wird bereits genutzt"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "Die OrgSeite " (when title "\"{orgpage/title}\"") " wurde entfernt."))
     :error/owner-of-orgpage                          "Die Person ist bereits der Inhaber dieser OrgSeite."
     :error/passwords-mismatch                        "Passwörter stimmen nicht überein"
     :error/profile-not-found                         "Profil nicht gefunden."
     :error/unknown-error                             "Unbekannter Fehler, bitte erneut versuchen."
     :error/unknown-id                                "Unbekannte OrgSeite."
     :error/unknown-login-or-email                    "Unbekannte E-Mail oder Team-Name."
     :error/unknown-user                              "„{usergroups/member}“ existiert nicht."
     :error/unknown-usergroup                         "Das Team wurde gelöscht"
     :error/upload-failed                             "Hochladen der OrgSeite: \"{orgpage/title}\" ist fehlgeschlagen"

     :feedback/ask-question                           "Frage stellen"
     :feedback/hide-button                            "Schaltfläche dauerhaft ausblenden"
     :feedback/dialog-title                           "Schreiben Sie den Entwicklern von OrgPad"
     :feedback/description                            [:<> "Wenn Sie Hilfe brauchen oder ein Problem haben, bitte schreiben Sie uns - "
                                                       [:b "den Entwicklern von OrgPad"] ". "
                                                       "Wir begrüßen zusätzlich jeden Verbesserungsvorschlag. "
                                                       "Wir werden so bald wie möglich per E-Mail antworten."]
     :feedback/languages                              "Sie können uns auf Deutsch, Englisch und Tschechisch schreiben."

     :feedback/contact-when-problem-persists          [:<> " Wenn das Problem besteht, bitte kontaktieren Sie uns unter "
                                                       [:a {:href  "mailto:support@orgpad.com"
                                                            :class "link-button"} "support@orgpad.com"] "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Banküberweisung"
                                                             (when currency
                                                               (str " in " (name currency))) " für "
                                                             "jährlich"
                                                             (if (= tier "standard")
                                                               " Standard"
                                                               " Professional")
                                                             "-Abo"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Schreiben Sie uns Ihre " [:b "Rechnungsadresse"] " und weitere Informationen für die Rechnungsstellung."
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " [:b email] " kontaktieren."])
     :feedback/school-plan-title                      "Ich möchte einen Abo für meine Schule kaufen"
     :feedback/school-plan                            (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Geben Sie uns an, " [:b "wie groß Ihre Schule ist"]
                                                         ",  wie viele Lehrer und Schüler OrgPad nutzen möchten, und geben Sie alle weiteren Informationen an."
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " [:b email] "kontaktieren."
                                                         ". Alternativ können Sie uns auch unter "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "anrufen."])
     :feedback/enterprise-plan-title                  "Ich möchte einen Abo für mein Unternehmen kaufen"
     :feedback/enterprise-plan                        (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Geben Sie uns an, " [:b "wie groß Ihr Unternehmen ist"]
                                                         " und wie viele Personen OrgPad nutzen möchten."
                                                         " Haben Sie zusätzliche Anforderungen?"
                                                         " Möchten Sie OrgPad gegen einen Aufpreis selbst hosten?"
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " [:b email] "kontaktieren."
                                                         ". Alternativ können Sie uns auch unter "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Aktualisieren Sie mein Abo auf den Profi-Abo"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Geben Sie uns an, wie wir Ihr bestehendes Abo ändern sollen, und geben Sie uns alle weiteren Informationen."
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " [:b email] "kontaktieren."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Bitte ändern Sie meinen Abrechnungszeitraum auf " (if (= period "yearly")
                                                                                                                  "jährliche"
                                                                                                                  "monatliche") " Abrechnung"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Die Änderung wird nach Ablauf des aktuellen Abrechnungszeitraums vorgenommen."
                                                         " Bei jährlicher Abrechnung gibt es 15% Rabatt."
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " [:b email] " kontaktieren."])

     :help-screen/units-with-shadows                  "Einheiten mit Schatten können mit einem Mausklick geöffnet und geschlossen werden."
     :help-screen/flat-units                          "Flache Einheiten haben keinen weiteren Inhalt."

     :help-screen/more-pages                          "Mehrere Seiten werden mit den Kreisen unten verdeutlicht."
     :help-screen/click-title-to-close                "Das Anklicken der Überschrift schließt sofort die Einheit."
     :help-screen/click-content-next-page             "Das Anklicken des Inhalts wechselt zur nächsten Seite."
     :help-screen/click-bullet-goto-page              "Um zu einer Seite direkt zu wechseln, klicken Sie auf die Kreise."

     :help-screen/create-links                        "Mit dem Ziehen oder Anklicken der Verbindungsschaltfläche und der Zieleinheit erstellen Sie Verbindungen."
     :help-screen/create-unit-by-dragging-link        "Erstellen einer Verbindung in die leeren Fläche erstellt dort eine Einheit."

     :help-screen/how-to-view                         "Über das Lesen"
     :help-screen/opening-units                       "Einheiten öffnen"
     :help-screen/moving-pages                        "Mehrere Seiten"

     :help-screen/how-to-edit                         "Über das Bearbeiten"
     :help-screen/creating-links                      "Verbindungen erstellen"

     :help-screen/help                                "Hilfe finden Sie hier!"

     :info/uploading-attachments                      [:i18n/plural "Hochladen von {info/count} {info/num-files} ..."
                                                       {:info/num-files [:info/count "Dateien" "Datei" "Dateien"]}]
     :info/uploading-images                           [:i18n/plural "Hochladen von {info/count} {info/num-images} ..."
                                                       {:info/num-images [:info/count "Bildern" "Bild" "Bildern"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Das Hochladen von {info/count} {info/num-images} ist fehlgeschlagen."
                                                           {:info/num-images [:info/count "Bildern" "Bild" "Bildern"]}]
                                                          "Das Hochladen von mindestens einem Bild ist fehlgeschlagen."))
     :info/uploading-attachments-failed               "Das Hochladen von Dateien ist fehlgeschlagen."
     :info/presentation-link-copied                   "Der Link zu dieser Präsentation wurde kopiert."
     :info/attachments-too-large                      (str "Das Hochladen von {upload/total-size} ist fehlgeschlagen."
                                                           " Auf einmal kann nur höchstens 500 MB hochgeladen werden.")

     :import/another-format                           [:<> "Wenn Sie Daten im anderen Format importieren möchten, bitte schreiben Sie uns unter "
                                                       [:b "support@orgpad.com"] "."]
     :import/dialog                                   "Importieren Sie Ihre Daten"
     :import/google-docs                              "Sie können Daten aus Microsoft Office oder Google Docs einfach in eine OrgSeite einfügen."
     :import/supported-formats                        "Zurzeit unterstützen wir diese Formate:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exportiert als eine .vsdx Datei."]

     :ios/install-info                                "Installieren Sie die OrgPad-App"
     :ios/share-button                                "1. Öffnen"
     :ios/add-to-home-screen                          "2. Antippen"

     :lang/cs                                         "Tschechisch"
     :lang/de                                         "Deutsch"
     :lang/en                                         "Englisch"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polnisch"
     :lang/ru                                         "Russisch"

     :language-select/lang-tooltip                    (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                        (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

     :limit/of                                        " von "
     :limit/orgpages                                  " OrgSeiten"
     :limit/people                                    " Menschen"
     :limit/teams                                     " Teams"
     :limit/team-members                              " Mitglieder"
     :limit/orgpages-tooltip                          (str "Im Free-Abo ist die Anzahl der OrgSeiten beschränkt."
                                                           " Wechseln Sie zum höheren Abo um mehr OrgSeiten zu erstellen.")
     :limit/shares-tooltip                            (str "Die Anzahl der Menschen, mit denen Sie OrgSeiten direkt teilen können ist beschränkt."
                                                           " Wechseln Sie zu dem Professional-Abo, um mit unbeschränkt vielen Menschen zu teilen.")
     :limit/teams-tooltip                             (str "Im Standard-Abo ist die Anzahl von bestitzten Teams beschränkt."
                                                           " Wechseln Sie zu dem Professional-Abo, um unbeschränkt viele Teams erstellen zu können.")
     :limit/teams-members-tooltip                     (str "Im Standard-Abo ist die Anzahl der Mitgleider eines Teams beschränkt."
                                                           " Wechseln Sie zu dem Professional-Abo, um unbeschränkt große Teams erstellen zu können.")
     :limit/attachments-size                          (str "Die Gesamtgröße aller hochgeladeten Dateien und Bildern ist beschränkt"
                                                           " und kann mit dem Wechsel zur höheren Abo-Stufe erweitert werden.")
     :limit/attachments-size-clickable                (str "Die Gesamtgröße aller hochgeladeten Dateien und Bildern ist beschränkt."
                                                           " Clicken Sie, um zum höheren Abo zu wechseln, welches die Obergrenze erhöht.")

     :limits/max-orgpages                             "Dokumente"
     :limits/max-storage                              "Speicher"
     :limits/max-teams                                "Teams"
     :limits/of                                       " von"
     :limits/max-team-members                         "Mitglieder"
     :limits/priority-support                         "vorrangige Unterstützung"

     :link-panel/flip                                 "Richtung wechseln"
     :link-panel/insert-unit-in-middle                "Einheit in die Mitte einfügen"
     :link-panel/delete                               "Verbindung löschen"
     :link-panel/change-link-style                    "Stil der Verbindung ändern; Umschalttaste halten um Stil vom Standard übernehmen, STRG halten zum Standard setzen"

     :loading/initial-autoresize                      "Berechnung von Größen aller Einheiten, {loading/num-units} verbleiben ..."
     :loading/initial-layout                          "Initiales Layout wird verbessert ..."
     :loading/restoring-opened-pages                  "Positionen von geöffneten Seiten wird wieder hergestellt ..."
     :loading/getting-orgpage                         "Herunterladen der OrgSeite vom Server ..."
     :loading/getting-dashboard                       "Herunterladen der Lister verfügbarer OrgSeiten vom Server ..."
     :loading/uploading-orgpage                       "Hochladen einer OrgSeite zum Server ..."
     :loading/authorizing-user                        "Benutzer wird authorisiert ..."
     :loading/ws-init                                 "Aufbau der Verbindung zum Server ..."
     :loading/ws-closed                               (str "Verbindung zum Server geschlossen, eine Neuverbindung wird versucht. "
                                                           "Falls das Problem andauert, laden Sie die Seite bitte neu.")
     :loading/administration                          "Verwaltungsdaten werden geladen ..."
     :loading/profile                                 "Profil wird geladen ..."
     :loading/style                                   "Stile werden geladen ..."
     :loading/uploading-attachments                   "Hochladen der Anhänge zum Server ..."

     :login/continue-with-facebook                    "Mit Facebook fortfahren"
     :login/continue-with-google                      "Mit Google fortfahren"
     :login/forgotten-password                        "Passwort vergessen"
     :login/forgotten-password-email-resent           "E-Mail zum Zurücksetzen bereits gesendet."
     :login/forgotten-password-description            (str "Geben Sie bitte eine E-Mail Adresse ein, für welche wir Ihnen einen Link zum Zurücksetzen des Passworts zusenden werden."
                                                           "Der Link ist 24 Stunden lang gültig.")
     :login/forgotten-password-error                  [:<> "Diese E-Mail Adresse wird von Ihnen blockiert. Entweder entsperren Sie diese mit dem Klick auf \"Abmelden\" in einer E-Mail von OrgPad, "
                                                       " oder senden Sie eine E-Mail an " [:b "support@orgpad.com"] " von dieser E-Mail Adresse."]
     :login/remember                                  "Anmeldung merken"
     :login/remember-tooltip                          "Angemeldet bleiben, wenn Sie zu dieser Seite zurückkehren."
     :login/send-reset-link                           "Link zum Zurücksetzen senden"
     :login/wrong-email-or-password                   "E-Mail oder Passwort stimmen nicht überein"

     :login-util/separator                            "oder"

     :notes/create-note                               "Neue Notiz"
     :notes/edit-note                                 "Notiz bearbeiten"
     :notes/manage-notes                              "Notizen verwalten"
     :notes/my-notes                                  "Meine Notizen"
     :notes/notes                                     [:i18n/plural "{notes/num-notes} {notes/notes-label}"
                                                       {:notes/notes-label [:notes/num-notes
                                                                            "Notizen" "Notiz" "Notizen"]}]
     :notes/confirm-delete                            "Wollen Sie wirklich diese Notiz löschen?"
     :notes/notes-description                         "Erfassen Sie Ideen und sortieren Sie diese später."

     :notifications/info                              "Wählen Sie bitte aus, welche E-Mails Sie von OrgPad erhalten möchten. Wir werden Sie immer über wichtige Änderungen benachrichtigen."
     :notifications/any-email                         "Alle E-Mails von OrgPad"
     :notifications/email-verification                (str "E-Mail Bestätigung beim Registrieren, Links zum Zurücksetzen des Passworts"
                                                           " und essenzielle Informationen über Zahlungen")
     :notifications/monthly-newsletter                "Monatlicher Rundbrief mit Aktualitäten und Neuentwicklungen in OrgPad"
     :notifications/messages                          "Nachrichten von anderen Personen erhalten"
     :notifications/blocked-people                    "Konkret blockierte Personen:"
     :notifications/receipts                          "Rechnungen bei automatischer Verlängerung des Abos"
     :notifications/receive-invitations               "Einladungen von anderen Personen erhalten"
     :notifications/unblock-user                      "Person entsperren"

     :onboarding/openable-units                       "Nur angehobene Einheiten mit Schatten können geöffnet werden."
     :onboarding/zoom                                 "Zum Zoomen scrollen"
     :onboarding/drag-canvas                          "Mit dem Ziehen bewegen"
     :onboarding/open-units                           "Einheiten mit Schatten haben Inhalt"

     :orgpage/change-information                      "Informationen ändern"
     :orgpage/copy-orgpage                            "In eine neue OrgSeite kopieren"
     :orgpage/delete-orgpage                          "OrgSeite löschen"
     :orgpage/detail                                  "Detail"
     :orgpage/meta-description                        "Beschreibung"
     :orgpage/meta-new-tag                            "Markierungen (Tags)"
     :orgpage/meta-info                               (str "Diese Informationen helfen Ihnen und anderen zu verstehen, wovon diese OrgSeite handelt. "
                                                           "Mithilfe von Markierungen (Tags) können Sie nach bestimmten OrgSeiten in der Liste filtern.")
     :orgpage/meta-info-in-share-orgpage              "Vor dem Teilen der OrgSeite müssen Sie eine Überschrift erfassen."
     :orgpage/share-tooltip                           "Diese OrgSeite mit anderen teilen"
     :orgpage/share-orgpage                           "OrgSeite teilen"
     :orgpage/show-information                        "Informationen anzeigen"

     :orgpage/zoom-in                                 "Vergrößern (reinzoomen)"
     :orgpage/zoom-out                                "Verkleinern (rauszoomen)"
     :orgpage/create-unit-double-click                "Mit dem Doppelklick erstellen Sie eine Einheit."
     :orgpage/create-unit-hold-or-double-tap          "Mit Halten oder doppeltem Antippen erstellen Sie eine Einheit."
     :orgpage/switch-to-edit                          "Zum Bearbeiten wechseln."

     :orgpage/untitled                                "Unbenannte OrgSeite"
     :orgpage/title                                   "Titel der OrgSeite"
     :orgpage/untitled-unit                           "Unbenannte Einheit"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "Schritte" "Schritt" "Schritte"]}]

     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (Seite {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (Seite {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Eine Kopie verfügbar als "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :orgpage-stats/number-of-units                   "Anzahl der Einheiten"
     :orgpage-stats/number-of-links                   "Anzahl der Verbindungen"
     :orgpage-stats/number-of-files                   "Anzahl der Dateien"
     :orgpage-stats/number-of-images                  "Anzahl der Bilder"

     :org-role/student                                "Schüler"
     :org-role/teacher                                "Lehrer"
     :org-role/employee                               "Mitarbeiter"
     :org-role/admin                                  "Administrator"

     :panel/create-orgpage                            "Neue OrgSeite"
     :panel/logo-tooltip                              "Zur Startseite"
     :panel/edit-info                                 "Welchseln Sie zum Bearbeiten, wo Sie Einheiten und Verbindungen erstellen, bearbeiten, löschen und noch mehr können."
     :panel/read-info                                 "Wechseln Sie zum Lesen, wo Sie keine Anpassungen vornehmen können, aber das Lesen ist dort einfacher."
     :panel/undo-deletion                             "Rückgängig machen"
     :panel/undo-deletion-info                        [:i18n/plural "Das Löschen von {delete/num-units} {delete/unit-label} und {delete/num-links} {delete/link-label} rückgängig machen."
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "Einheiten" "Einheit" "Einheiten"]
                                                                :link-label [:delete/num-links
                                                                             "Verbindungen" "Verbindung" "Verbindungen"]}]
     :panel/refresh                                   "Neu laden"
     :panel/switch-style                              "Stil von neuen Einheiten und Verbindungen wechseln; Ziehen erstellt eine neue Einheit"
     :panel/profile                                   "Profil"
     :panel/settings                                  "Einstellungen"
     :panel/usergroups                                "Teams"
     :panel/stats                                     "Statistiken"
     :panel/administration                            "Verwaltung"
     :panel/ios-install-info                          "App installieren"
     :panel/upload-attachment                         "Bilder oder Dateien in neue Einheiten einfügen"

     :password/too-short                              "Mindestens 8 Zeichen erforderlich"
     :password/different-passwords                    "Passwörter stimmen nicht überein"

     :password-reset/back-to-list                     "Zurück zu Liste"
     :password-reset/change-password                  "Passwort wechseln"
     :password-reset/set-password                     "Passwort setzen"
     :password-reset/has-password                     "Ihr Konto hat ein Passwort eingestellt."
     :password-reset/without-password                 "Kein Passwort ist gesetzt, da ein verbundenes Konto zur Anmeldung benutzt wurde."
     :password-reset/invalid-link                     "Ungültiger Link, vielleicht älter als 24 Stunden. Bitte fordern Sie das erneute Senden der E-Mail an."
     :password-reset/description                      "Setzen Sie Ihr neues Passwort."
     :password-reset/enter-current-and-new-password   "Geben Sie Ihr aktuelles Passwort und zweimal das neue Passwort ein."
     :password-reset/enter-new-password-twice         "Das neue Passwort bitte zweimal eingeben."

     :path/add-step                                   "Schritt hinzufügen"
     :path/add-step-tooltip                           "Halten Sie SHIFT, um die Kamera zu kopieren"
     :path/title                                      "Präsentation {path/num-paths}"
     :paths/create-new-path                           "Präsentation erstellen"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> " Wollen Sie die Präsentation \"" [:b title] "\" löschen?"])
     :paths/show-hidden-units                         "Ausgeblendete Einheiten anzeigen"

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Aktuell in " [:b tier] ", gültig bis " [:b end-date] "."
                                                         (if autorenewal
                                                           " Das Abo wird nach dem Ablauf der Gültigkeitsdauer automatisch  erneuert."
                                                           " Das Abo wird am Ende der Gültigkeitsdauer auslaufen.")])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " im " [:b tier "-Abo"] " von " name "."])
     :payments/free-tier-info                         [:<> "OrgPad wird im " [:b "Free-Abo"] " kostenlos benutzt."]
     :payments/no-teams                               "Keine Teams im Free-Abo."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Für " (when upgrade-url [:<> "den " [:a.link-button {:href upgrade-url} "Abo-Wechsel"] " oder "])
                                                         [:a.link-button {:href period-url} "Wechsel der Gültigkeitsdauer"]
                                                         ", bitte kontaktieren Sie uns."])
     :payments/choose-plan                            "Abo wählen"
     :payments/manage-plan                            "Abo verwalten"
     :payments/contact-to-manage                      [:<> "Zum Verwalten Ihres Abo's kontaktieren Sie uns bitte unter "
                                                       [:a {:href  "mailto:support@orgpad.com"
                                                            :class "link-button"} "support@orgpad.com"]]
     :payments/receipts                               "Rechnungen:"
     :payments/receipt-label                          "Rechnung {receipt/date-range}"
     :payments/customer-portal-failed                 "Beim Laden der Abo-Verwaltung ist ein Problem aufgetreten."

     :pending-activation/email-already-used           "Die E-Mail wird mit einem anderen Konto bereits genutzt."
     :pending-activation/email-not-recieved           "Falls Sie keine E-Mail-Bestätigung erhalten haben, können Sie diese neu senden lassen. Sie können die E-Mail sogar korrigieren."
     :pending-activation/email-sent                   "E-Mail-Bestätigung gesendet."
     :pending-activation/instructions                 "Aus Sicherheitsgründen müssen Sie Ihre E-Mail zuerst bestätigen. Klicken Sie auf den Bestätigungslink in der E-Mail, die wir Ihnen geschickt haben."
     :pending-activation/resend                       "E-Mail-Bestätigung neu senden"

     :permission/admin                                "Kann teilen und löschen"
     :permission/admin-tooltip                        "Kann auch anpassen wer sonst auf das Dokument zugreifen kann."
     :permission/edit                                 "Kann bearbeiten"
     :permission/edit-tooltip                         "Kann die OrgSeite beliebig verändern."
     :permission/comment                              "Kann kommentieren"
     :permission/comment-tooltip                      (str "Kann eigene Einheiten erstellen, verbinden und verändern. "
                                                           "Kann aber nicht den Rest der OrgSeite bearbeiten.")
     :permission/view                                 "Kann lesen"
     :permission/view-tooltip                         "Kann die OrgSeite nur lesen ohne Änderungen vorzunehmen."

     :presentation/presentation                       "Präsentation"
     :presentation/step                               "Schritt"
     :presentation/first-step                         "Erster Schritt"
     :presentation/previous-step                      "Vorheriger Schritt"
     :presentation/next-step                          "Nächster Schritt"
     :presentation/last-step                          "Letzter Schritt"
     :presentation/present                            "Präsentation starten"
     :presentation/exit-tooltip                       "Präsentation abbrechen"

     :presentation/share-presentation                 "Teilen Sie diese Präsentation mit anderen."

     :presentation/embedded-zoom-info                 "STRG + Scrollen zum Verkleinern/ Vergrößern"

     :paths-menu/focus                                "Kamera einstellen {keyboard/shortcut}"
     :paths-menu/open-and-close                       "Einheiten öffnen und schließen {keyboard/shortcut}"
     :paths-menu/visibility                           "Sichtbarkeit anpassen {keyboard/shortcut}"

     :pricing-popup/orgpages-exceeded-title           "Im kostenlosen Abo können Sie keine weiteren OrgSeiten erstellen"
     :pricing-popup/orgpages-exceeded                 "Sie müssen zum höheren Abo wechseln."
     :pricing-popup/storage-exceeded-title            "Nicht genug Platz zum hochladen von {upload/total-size} vorhanden."
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Nur noch " [:b space-left " "] " Speicher frei."
                                                         " Sie können Ihr Speicher mit dem Wechsel zur höheren Abo-Stufe erweitern."])
     :pricing-popup/num-shared-limit-reached-title    "Sie können diese OrgSeite nicht mit weiteren Menschen teilen."
     :pricing-popup/num-shared-limit-reached-common   "Die maximale Anzahl der Menschen, die diese OrgSeite teilen, wurde erreicht."
     :pricing-popup/num-shared-limit-reached          [:<> " Um weitere Menschen hinzufügen zu können, müssen Sie zum "
                                                       [:b "Professional-Abo"] " wechseln."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Der Inhaber dieser OrgSeite " owner " muss zum "
                                                         [:b "Professional-Abo"] " wechseln, um weitere Menschen hinzufügen zu können."])
     :pricing-popup/enable-teams-title                "Zum Verwalten von Teams müssen Sie zum höheren Abo wechseln."
     :pricing-popup/enable-teams                      [:<> "Teams gruppieren Menschen, was die Zusammenarbeit und das Teilen von OrgSeiten erleichtert."
                                                       "Die Funktionalität ist nur im " [:b "Standard-Abo"] " oder höher verfügbar."]
     :pricing-popup/teams-limit-reached-title         "Zum Erstellen weiterer Teams müssen Sie zum höheren Abo wechseln."
     :pricing-popup/teams-limit-reached               "Die Obergrenze der Anzahl der Teams in Ihrem Abo wurde erreicht."
     :pricing-popup/team-members-limit-reached-title  "Sie können keine weiteren Mitglieder zu {usergroup/name} hinzufügen."
     :pricing-popup/team-members-limit-reached-common "Die maximale Anzahl der Team-Mitglieder wurde erreicht."
     :pricing-popup/team-members-limit-reached        [:<> "Um weitere Mitglieder hinzufügen zu können, müssen sie zum "
                                                       [:b "Professional-Abo"] " wechseln."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " Der Inhaber dieser OrgSeite " owner " muss zum "
                                                         [:b "Professional-Abo"] " wechseln, um weitere Mitglieder hinzufügen zu können."])

     :profile/open-contact-dialog                     "Nachricht schicken"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Kontaktieren Sie " first-name " " last-name)
                                                          "Kontaktieren Sie diese Person"))
     :profile/contact-dialog-info                     (str "Da wir die E-Mail Adressen anderer Personen in OrgPad nicht weitergeben, wird der Kontakt von OrgPad vermittelt. Die Person wird"
                                                           " Ihren Namen und Ihre E-MailAdresse erhalten, damit ein direkter Kontakt entstehen kann.")

     :promotion/unknown                               "Unbekannter Code"
     :promotion/max-usages-reached                    "Zu oft verwendet"
     :promotion/expired                               "Ausgelaufen"
     :promotion/one-year-free                         "1 Jahr kostenlos"
     :promotion/for-one-year                          " für 1 Jahr"
     :promotion/for-six-months                        " für 6 Monate"

     :props/h1                                        "Große Überschrift"
     :props/h2                                        "Mittlere Überschrift"
     :props/h3                                        "Kleine Überschrift"
     :props/weight-none                               "Normale Verbindung"
     :props/strong                                    "Starke Verbindung"
     :props/arrowhead-none                            "Kein Pfeil"
     :props/single                                    "Pfeil"
     :props/double                                    "Doppelpfeil"

     :public-permission/none                          "ist privat."
     :public-permission/edit                          "wird mit allen zum Bearbeiten geteilt."
     :public-permission/view                          "wird mit allen zum Lesen geteilt."

     :registration/create-user                        "Konto erstellen"
     :registration/register-by-email                  "Mit E-Mail registrieren"
     :registration/server-error                       "Serverfehler. Bitte versuchen Sie erneut das Konto zu erstellen."
     :registration/missing-email                      "{registration/service} hat uns Ihre E-Mail-Adresse nicht mitgeteilt. Bitte geben Sie sie unten ein."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Stil der Auswahl von "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           " ändern; Umschalttaste halten um Stil vom Standard übernehmen, STRG halten zum Standard setzen"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "Einheiten" "Einheit" "Einheiten"]
                                                                   :link-label [:selection/num-links
                                                                                "Verbindungen" "Verbindung" "Verbindungen"]}]

     :selection/link                                  "Einheiten verbinden"
     :selection/hide-contents                         "Inhalte ausblenden"
     :selection/show-contents                         "Inhalte einblenden"
     :selection/copy-units-links                      "Einheiten und Verbindungen in die Zwischenablage kopieren"
     :selection/flip-links                            "Richtung wechseln"
     :selection/delete                                "Auswahl löschen"

     :settings/profile                                "Profil"
     :settings/payments                               "Zahlungen"
     :settings/account                                "Konto"
     :settings/linked-accounts                        "Verbundene Konten"
     :settings/notifications                          "Benachrichtigungen"
     :settings/account-description                    "E-Mail und Passwort anpassen oder das Konto löschen"
     :settings/stats-description                      "Hier sind ausgewählte Statistiken über Ihre Nutzung von OrgPad."
     :settings/change-email                           "E-Mail ändern"
     :settings/change-email-text                      "Geben Sie bitte eine neue E-Mail Adresse ein. Aus Sicherheitsgründen müssen Sie diese bestätigen, bevor Sie das Konto entsperren können."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Ihr Konto wurde mit der folgenden E-Mail registriert " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Ihr Konto ist mit Facebook " [:b "verbunden"] "."]
     :settings/account-not-linked-to-facebook         [:<> "Ihr Konto ist " [:b "nicht"] " mit Facebook verbunden."]
     :settings/link-fb                                "Mit Facebook verbinden"
     :settings/unlink-fb                              "Verbindung zu Facebook trennen"
     :settings/account-linked-to-google               [:<> "Ihr Konto ist mit Google " [:b "verbunden"] "."]
     :settings/account-not-linked-to-google           [:<> "Ihr Konto ist " [:b "nicht"] " mit Google verbunden."]
     :settings/link-google                            "Mit Google verbinden"
     :settings/unlink-google                          "Verbindung zu Google trennen"
     :settings/set-password-text                      " Setzen Sie vor dem Trennen der Verbindung bitte ein Passwort."
     :settings/linked-accounts-info                   "Verbindnen Sie Ihr Facebook oder Google Konto mit OrgPad, sodass Sie diese Konten zur Anmeldung benutzen können."
     :settings/profile-info                           "Über die angeführten Informationen sind Sie leichter für Mitwirkende an gemeinsamen Projekten auffindbar."
     :settings/select-language                        "Sprache für die Anwendung auswählen (STRG+UMSCHALT+L): "

     :settings/delete-account                         "Konto löschen"
     :settings/confirm-delete-account-question        "Sind Sie sicher, Sie wollen das Konto dauerhaft löschen?"
     :settings/confirm-delete-account-info            "Das Löschen wird alle Ihre OrgSeiten und die Daten darin zerstören."
     :settings/delete-account-info                    [:<> "Das Löschen wird alle Ihre OrgSeiten und die Daten darin " [:b "dauerhaft zerstören"] "."]

     :share-orgpage/copy-template-link                "Link zur Vorlage kopieren"
     :share-orgpage/copy-template-link-tooltip        "Leute können diesen Link verwenden, um eine eigene Kopie dieser OrgSeite zu erstellen."
     :share-orgpage/dialog-title                      "\"{orgpage/title}\" teilen"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Personen ohne ein OrgPad-Konto werden eine Einladung mit einem Link erhalten."
                                                                  " Nachdem sie diesen Link geöffnet haben, können sie diese OrgSeite lesen. ")
                                                         "Sie können "
                                                         [:a.link-button create-team "ein Team erstellen"]
                                                         " um mit einer Gruppe von Menschen OrgSeiten einfacher teilen zu können."])
     :share-orgpage/invite-for-editing                "Einladen zum Bearbeiten"
     :share-orgpage/invite-for-viewing                "Einladen zum Lesen"
     :share-orgpage/invite-by-email                   "Wollen Sie diese mit einer E-Mail in bestimmter Sprache einladen?"
     :share-orgpage/links                             "Links"
     :share-orgpage/to-read                           "Lesen"
     :share-orgpage/to-comment                        "zu kommentieren"
     :share-orgpage/to-edit                           "Bearbeiten"
     :share-orgpage/links-tooltip                     "Zugriff erteilen mittels teilbaren Links"
     :share-orgpage/embed                             "Einbetten"
     :share-orgpage/embed-tooltip                     "In Ihre Webseite einbetten"
     :share-orgpage/new-user-or-usergroup             "Name, E-Mail oder Team"
     :share-orgpage/link-permission-start             "Personen Berechtigung erteilen zum "
     :share-orgpage/link-permission-end               " dieser OrgSeite."
     :share-orgpage/private-info                      "Nur Sie und die Personen, mit denen Sie die OrgSeite direkt oder über einen Link geteilt haben, haben Zugang. Jedes neu erstellte Dokument ist privat."
     :share-orgpage/publish-for-editing-info          "Die OrgSeite ist öffentlich. Jeder im Internet kann sie durchsuchen und bearbeiten."
     :share-orgpage/publish-for-reading-info          "Die OrgSeite ist öffentlich. Jeder im Internet kann sie durchsuchen und lesen. Nur Sie selber oder die Personen, mit denen Sie die OrgSeite zur Bearbeitung geteilt haben, können Änderungen vornehmen."
     :share-orgpage/publish-permission-end            "Diese OrgSeite "
     :share-orgpage/publish                           "Veröffentlichen"
     :share-orgpage/publish-confirmation              "Jeder wird diese OrgSeite zum {orgpage/permission} öffnen können. Sind Sie sicher?"
     :share-orgpage/publish-tooltip                   "Zugriff allen erteilen"
     :share-orgpage/remove-user                       "Berechtigung entfernen"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Falls Sie einen Link aus Versehen geteilt haben, können Sie "
                                                         [:span.link-button reset-links "alle vorherigen Links ungültig machen"]
                                                         "."])
     :share-orgpage/shareable-link                    "Teilbarer Link"
     :share-orgpage/start-with-presentation           "Mit einer Präsentation starten."
     :share-orgpage/template-link-switch              "Link zur Vorlage erstellen."
     :share-orgpage/user-not-registered               " ist noch nicht bei OrgPad registriert."
     :share-orgpage/users                             "Personen"
     :share-orgpage/users-tooltip                     "Zugriff einzelnen Personen erteilen"

     :side-panel/about                                "Über OrgPad"
     :side-panel/files-and-images                     "Dateien und Bilder"
     :side-panel/paths                                "Präsentationen"
     :side-panel/translate                            "Übersetzungen"
     :side-panel/help                                 "Hilfe"
     :side-panel/home                                 "Startseite"
     :side-panel/import                               "Import"
     :side-panel/share                                "Teilen"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "Dateien" "Datei" "Dateien"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "Bilder" "Bild" "Bilder"]}]
     :side-panel/num-paths                            [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 " Pfade " " Pfad " " Pfade "]}]

     :step/closed-pages                               "Geschlossene Seiten"
     :step/everything-closed                          "Alles geschlossen."
     :step/hidden-units                               "Ausgeblendete Einheiten"
     :step/nothing-changed                            "Keine Änderung."
     :step/opened-pages                               "Geöffnete Seiten"
     :step/pages-shown-in-the-camera                  "Seiten, die auf Kamera gezeigt werden"
     :step/revealed-units                             "Eingeblendete Seiten"
     :step/switched-pages                             "Gewechselte Seiten"

     :tag/public                                      "öffentlich"

     :text-field/email                                "E-Mail"
     :text-field/first-name                           "Vorname"
     :text-field/last-name                            "Nachname"
     :text-field/new-password                         "Neues Passwort"
     :text-field/new-password-again                   "Neues Passwort wiederholen"
     :text-field/password                             "Passwort"
     :text-field/password-again                       "Passwort wiederholen"
     :text-field/title                                "Überschrift"
     :text-field/content                              "Inhalt"
     :text-field/name-or-email                        "Name oder E-Mail"
     :text-field/subject                              "Betreff"
     :text-field/message                              "Nachricht"

     ;; das Abo (Abonnement), Standard-Abo
     :tier/free                                       "Kostenlos"
     :tier/standard                                   "Standard"
     :tier/professional                               "Professional" ; Profi-Abo?
     :tier/school                                     "Schule"
     :tier/enterprise                                 "Unternehmen"
     :tier/unlimited                                  "Unbegrenzt"

     :translate/title                                 "OrgSeite {orgpage/title} in eine andere Sprache automatisch übersetzen"
     :translate/info                                  (str "Erstellt automatisch eine Kopie dieser OrgSeite in Ihrem Besitz,"
                                                           " die aus der Quellsprache in die Zielsprache übersetzt wird."
                                                           " Innerhalb einer Minute wird diese in der Liste verfügbar sein.")
     :translate/source-lang                           "Quellsprache"
     :translate/target-lang                           "Zielsprache"
     :translate/translate                             "Übersetzen"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Übersetzung verfügbar als "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :role/owner                                      "Inhaber"
     :role/member                                     "Mitglied"

     :unit-panel/link                                 "Klicken oder Ziehen zum Verbinden; Umschalttaste halten um mehrere Verbindungen zu erstellen"
     :unit-panel/upload-attachment                    "Bild oder Datei in diese Einheit einfügen"
     :unit-panel/change-link-style                    (str "Stil der Einheit ändern; "
                                                           "Umschalttaste halten um Stil vom Standard übernehmen, "
                                                           "STRG halten zum Standard setzen; "
                                                           "Ziehen erstellt eine Verbindung in diesem Stil")
     :unit-panel/hide-content                         "Inhalt ausblenden"
     :unit-panel/delete-unit                          "Einheit löschen"

     :usergroups/create-team                          "Team erstellen"
     :usergroups/info                                 "Um das Teilen von OrgSeiten zu vereinfachen, erstellen und verwalten Sie Teams von Freunden und Mitarbeitern."
     :usergroups/delete-usergroup                     "Team löschen"
     :usergroups/members                              "Mitglieder"
     :usergroups/change                               "Überschrift und Logo des Teams anpassen"
     :usergroups/show-actions                         "Aktivitäten anzeigen"
     :usergroups/name                                 "Team-Name"
     :usergroups/create-usegroup-info                 (str "Der Team-Namen und das Profilbild sind für alle auf OrgPad sichtbar. "
                                                           "Wählen Sie einen Namen, der mindestens 5 Zeichen lang ist. "
                                                           "Leerzeichen am Anfang und am Ende werden entfernt.")
     :usergroups/confirm-delete-usergroup             "Sind Sie sicher, Sie wollen das Team dauerhaft löschen?"
     :usergroups/usergroups-members                   "{usergroup/name}'s Mitglieder"
     :usergroups/remove-member                        "Vom Team entfernen"
     :usergroups/remove-admin                         "Administrator entfernen"
     :usergroups/make-admin                           "Zum Administrator machen"
     :usergroups/admin-tooltip                        "Ein Administrator kann die Mitglieder verwalten und das Team löschen."
     :usergroups/untitled-usergroup                   "Unbenanntes Team"

     :wire-transfer/title                             "Banküberweisung für das Jahres-{wire-transfer/tier}-Abo"
     :wire-transfer/info                              "Wir werden Ihr Abo aktivieren, wenn wie den Empfang der Zahlung auf unserem Konto bestätigen können."
     :wire-transfer/used-currency                     "Zahlung in {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Empfänger"
     :wire-transfer/account-number                    "Kontonummer"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Betrag"
     :wire-transfer/payment-purpose                   "Verwendungszweck"
     :wire-transfer/qr-code-common                    (str "Zum automatischen Ausfüllen der korrekten Angaben"
                                                           " scannen Sie bitte den GiroCode mit der Banking-App ein.")
     :wire-transfer/cz-sk-qr-code-description         (str " Dies ist ein QR-Code, der meistens in Tschechien"
                                                           " und der Slowakei für Banküberweisungen benutzt wird.")
     :wire-transfer/eu-qr-code-description            (str " Dies ist ein QR-Code, der meistens in der Europäischen Union"
                                                           " für SEPA-Überweisungen benutzt wird.")
     :wire-transfer/trial-info                        (str "Für den vollen Gebrauch von OrgPad können Sie sofort einmalig"
                                                           " ein 7-Tage-Abo starten. Wenn die Bank die Bezahlung bestätigt hat,"
                                                           " wird das Abo-Dauer um 1 Jahr verlängert.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Wenn Sie jegliche Fragen oder Schwierigkeiten haben sollten, bitte "
                                                         [:a.link-button {:href url} "füllen Sie dieses Formular"] " aus."])
     :wire-transfer/success-text                      [:<> "Wir haben Ihnen ein" [:b "einmaliges 7-Tage-Abo"] "aktiviert,"
                                                       " sodass Sie OrgPad mit dem neuen Tarif sofort benutzen können. "]
     :wire-transfer/common-result-text                (str "Wenn die Bank die erfolgreiche Zahlung bestätigt hat,"
                                                           " wird die Gültigkeit des Abo's um 1 Jahr verlängert.")
     :wire-transfer/start-trial                       "Überweisung gesendet"
     :wire-transfer/start-trial-result-title          "Danke für die Bezahlung"
     :wire-transfer/copy                              "In die Zwischenablage kopieren"
     }))
