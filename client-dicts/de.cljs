(ns orgpad.client.i18n.dicts.de)

(def dict
  "A dictionary map from keywords to the corresponding German texts."
  {:lang/name                                     "Deutsch"
   :lang/en-name                                  "German"
   :lang/plural-breaks                            [0 1 2]   ; Counts of elements for which the next translation for :i18n/plural is used.

   :attachments/allows-access-to-file             "Erlaubt den Zugriff auf diese Datei."
   :attachments/allows-access-to-image            "Erlaubt den Zugriff auf dieses Bild."
   :attachments/no-preview                        "Keine Ansicht verfügbar."
   :attachments/used-files                        "Dateien in der OrgSeite"
   :attachments/unused-files                      "Dateien beiseite"
   :attachments/used-images                       "Bilder in der OrgSeite"
   :attachments/unused-images                     "Bilder beiseite"
   :attachments/uploading-files                   "Dateien werden hochgeladen ..."

   :button/back                                   "Zurück"
   :button/cancel                                 "Abbrechen"
   :button/close                                  "Schließen"
   :button/copied                                 "Kopiert"
   :button/copy                                   "Kopieren"
   :button/copy-link                              "Link kopieren"
   :button/create                                 "Erstellen"
   :button/create-tooltip                         "Erstellen (STRG+Eingabetaste)"
   :button/delete                                 "Löschen"
   :button/delete-selected                        "Auswahl löschen"
   :button/documentation                          "Dokumentation"
   :button/download                               "Herunterladen"
   :button/download-all                           "Alle herunterladen"
   :button/drop                                   "Ablegen"
   :button/edit                                   "Bearbeiten"
   :button/import                                 "Importieren"
   :button/login                                  "Anmelden"
   :button/logout                                 "Abmelden"
   :button/publish                                "Veröffentlichen"
   :button/read                                   "Lesen"
   :button/register                               "Registieren"
   :button/save                                   "Änderungen speichern"
   :button/save-tooltip                           "Änderungen speichern (STRG+Eingabetaste)"
   :button/upload                                 "Hochladen"
   :button/send                                   "Senden"
   :button/present                                "Präsentieren"
   :button/present-tooltip                        "Präsentieren (F5)"
   :button/agree                                  "Zustimmen und Schließen"
   :button/share                                  "Teilen"
   :button/exit                                   "Verlassen"
   :button/show-password                          "Anzeigen"
   :button/hide-password                          "Verbergen"

   :consent/popup-text                            (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                    [:div.consent-text
                                                     "Mit der Nutzung dieser Webseite stimmen Sie den "
                                                     [:a terms-and-conditions "Nutzungsbedingungen"]
                                                     " und den "
                                                     [:a privacy-policy "Datenschutz-Bestimmungen"]
                                                     " von OrgPad zu. "
                                                     (str "Um die Funktionalität in bestimmten Bereichen von OrgPad "
                                                          "sicherstellen zu können, werden Cookies verwendet.")])

   :dashboard/confirm-delete                      [:<> "Sind Sie sicher, dass Sie diese OrgSeite endgültig löschen wollen?"]
   :dashboard/login-needed                        [:<> "Um OrgSeiten zu erstellen, müssen Sie sich " [:b "anmelden"] " oder " [:b "registrieren"] "."]
   :dashboard/owned-orgpages                      "Meine OrgSeiten"
   :dashboard/public-orgpages                     "Veröffentlichte OrgSeiten"
   :dashboard/shared-orgpages                     "Mit Ihnen geteilte OrgSeiten"
   :dashboard/usergroup-orgpages                  "{usergroup/name}'s OrgSeiten"
   :dashboard/public-permission-edit              "Mit allen zum Bearbeiten geteilt"
   :dashboard/public-permission-view              "Mit allen zum Lesen geteilt"

   :editors/flip-link                             "Richtung wechseln"
   :editors/insert-unit-in-middle                 "Einheit in die Mitte einfügen"
   :editors/delete-link                           "Verbindung löschen"
   :editors/change-link-style                     "Stil der Verbindung ändern; Umschalttaste halten um Stil vom Standard übernehmen, STRG halten zum Standard setzen"

   :editors/create-page                           "Seite hinzufügen"
   :editors/remove-page                           "Diese Seite löschen"
   :editors/previous-page                         "Vorherige Seite; Umschalttaste halten um diese Seite nach links zu verschieben"
   :editors/next-page                             "Nächste Seite; Umschalttaste halten um diese Seite nach rechts zu verschieben"
   :editors/title                                 "Überschrift"
   :editors/switch-page                           "Zu dieser Seite wechseln; Umschalttaste halten um aktuelle Seite dahin zu verschieben"
   :editors/switch-to-this-page                   (fn [{:render/keys [can-edit]}]
                                                    (str "Zu dieser Seite wechseln"
                                                         (when can-edit "; Umschalttaste halten um aktuelle Seite dahin zu verschieben")))

   :embedding-code/code                           "Code"
   :embedding-code/description                    "Um diese OrgSeite in Ihre Webseite einzubetten, fügen Sie den angegebenen Code in Ihre Webseite ein:"

   :error/orgpage-access-denied                   "Sie haben keinen Zugriff zu dieser OrgSeite."
   :error/usergroup-access-denied                 "Berechtigung zum bearbeiten des Teams wurde verweigert."
   :error/already-member                          "„{usergroups/member}“ ist bereits Mitglied."
   :error/administration-access                   "Verwaltungszugriff wurde verweigert."
   :error/creation-unauthorized                   "Zum erstellen von OrgSeiten müssen Sie sich anmelden."
   :error/deleting-denied                         "Löschen der OrgSeite wurde verweigert."
   :error/email-already-used                      "Diese E-Mail wird bereits genutzt."
   :error/email-not-registered                    "Kein Konto mit dieser E-Mail."
   :error/email-missing-mx-record                 "Kein E-Mail-Server unter der Domäne."
   :error/email-invalid                           "Ungültige E-Mail."
   :error/error                                   "Fehler: "
   :error/safari-unsupported                      (str "Der Webbrowser Safari wird zurzeit nicht unterstützt."
                                                       " Bitte verwenden Sie einen anderen Webbrowser, zum Beispiel"
                                                       " Google Chrome,  Microsoft Edge, Vivaldi oder Firefox.")
   :error/incorrect-id                            (fn [{:orgpage/keys [id]}]
                                                    (str "Ungültige OrgSeite" (when id " {orgpage/id}")
                                                         ". Fehlerhaft kopierter Link?"))
   :error/incorrect-link                          "Ungültiger Link. Entweder melden Sie sich bitte an, oder verwenden Sie einen gültigen Link."
   :error/incorrect-password                      "Ungültiges Passwort."
   :error/lost-permission                         "Sie haben den Zugriff zu dieser OrgSeite verloren."
   :error/name-already-used                       "Dieser Name wird bereits genutzt"
   :error/orgpage-removed                         (fn [{:orgpage/keys [title]}]
                                                    (str "Die OrgSeite " (when title "\"{orgpage/title}\"") " wurde entfernt."))
   :error/owner-of-orgpage                        "Der Benutzer ist bereits der Inhaber dieser OrgSeite."
   :error/passwords-mismatch                      "Passwörter stimmen nicht überein"
   :error/unknown-error                           "Unbekannter Fehler, bitte erneut versuchen."
   :error/unknown-id                              "Unbekannte OrgSeite."
   :error/unknown-login-or-email                  "Unbekannte E-Mail oder Team-Name."
   :error/unknown-user                            "„{usergroups/member}“ existiert nicht."
   :error/unknown-usergroup                       "Das Team wurde gelöscht"
   :error/upload-failed                           "Hochladen der OrgSeite: \"{orgpage/title}\" hat fehlgeschlagen"

   :feedback/ask-question                         "Frage stellen"
   :feedback/hide-button                          "Schaltfläche dauerhaft ausblenden"
   :feedback/dialog-title                         "Schreiben Sie den Entwicklern von OrgPad"
   :feedback/description                          [:<> "Wenn Sie Hilfe brauchen oder ein Problem haben, bitte schreiben Sie uns - "
                                                   [:b "den Entwicklern von OrgPad"] ". "
                                                   "Wir begrüßen zusätzlich jeden Verbesserungsvorschlag. "
                                                   "Wir werden so bald wie möglich per E-Mail antworten."]
   :feedback/languages                            "Sie können uns auf Deutsch, Englisch und Tschechisch schreiben."

   :help-screen/move-by-dragging                  "Zum Bewegen bitte an beliebiger Stelle ziehen."
   :help-screen/zoom-by-mouse-wheel               "Die Ansicht mit dem Mausrad vergrößern und verkleinern"

   :help-screen/units-with-shadows                "Einheiten mit Schatten können mit einem Mausklick geöffnet und geschlossen werden."
   :help-screen/flat-units                        "Flache Einheiten haben keinen weiteren Inhalt."

   :help-screen/multiple-pages                    "Mehrere Seiten werden mit den Kreisen unten verdeutlicht."
   :help-screen/click-title-to-close              "Das Anklicken der Überschrift schließt sofort die Einheit."
   :help-screen/click-content-next-page           "Das Anklicken des Inhalts wechselt zur nächsten Seite."
   :help-screen/click-bullet-goto-page            "Um zu einer Seite direkt zu wechseln, klicken Sie auf die Kreise."

   :help-screen/create-unit-double-click          "Erstellen Sie Einheiten mit einem Doppelklick."
   :help-screen/click-to-edit-again               "Mit dem Klick auf die Einheit können Sie diese bearbeiten."
   :help-screen/pack-unit                         "Benutzen Sie die blaue Pfeiltaste oben um die Einheit zu schließen."

   :help-screen/create-links                      "Mit dem Ziehen oder Anklicken der Verbindungsschaltfläche und der Zieleinheit erstellen Sie Verbindungen."
   :help-screen/create-unit-by-dragging-link      "Erstellen einer Verbindung in die leeren Fläche erstellt dort eine Einheit."

   :help-screen/simple-steps                      "Neu bei OrgPad? Starten Sie in drei einfachen Schritten!"
   :help-screen/how-to-view                       "Über das Lesen"
   :help-screen/moving-around                     "Über die Bewegung"
   :help-screen/opening-units                     "Einheiten öffnen"
   :help-screen/moving-pages                      "Mehrere Seiten"

   :help-screen/editing-guide                     "Eine Schnellanleitung zum Bearbeiten von OrgSeiten in zwei Schritten!"
   :help-screen/how-to-edit                       "Über das Bearbeiten"
   :help-screen/creating-units                    "Einheiten erstellen"
   :help-screen/creating-links                    "Verbindungen erstellen"

   :help-screen/help                              "Hilfe finden Sie hier!"

   :info/single-click                             "Sparen Sie Ihre Zeit! Ein Klick ist genug."
   :info/uploading-attachments                    [:i18n/plural "Hochladen von {info/count} {info/num-files}"
                                                   {:info/num-files [:info/count "Dateien" "Datei" "Dateien"]}]
   :info/uploading-images                         [:i18n/plural "Hochladen von {info/count} {info/num-images}"
                                                   {:info/num-images [:info/count "Bildern" "Bild" "Bildern"]}]
   :info/uploading-attachments-failed             "Das Hochladen von Dateien hat fehlgeschlagen."
   :info/uploading-image-failed                   "Das Hochladen eines Bildes hat fehlgeschlagen."
   :info/presentation-link-copied                 "Der Link zu dieser Präsentation wurde kopiert."

   :import/another-format                         [:<> "Wenn Sie Daten im anderen Format importieren möchten, bitte schreiben Sie uns unter "
                                                   [:b "support@orgpad.com"] "."]
   :import/dialog                                 "Importieren Sie Ihre Daten"
   :import/google-docs                            "Sie können Daten aus Microsoft Office oder Google Docs einfach in eine OrgSeite einfügen."
   :import/supported-formats                      "Zurzeit unterstützen wir diese Formate:"
   :import/lucidchart                             [:<> [:b "Lucidchart"] " exportiert als eine .vsdx Datei."]

   :language-select/lang-tooltip                  (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                    (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

   :loading/initial-autoresize                    "Berechnung von Größen aller Einheiten, {loading/num-units} verbleiben ..."
   :loading/initial-layout                        "Initiales Layout wird verbessert ..."
   :loading/restoring-opened-pages                "Positionen von geöffneten Seiten wird wieder hergestellt ..."
   :loading/getting-orgpage                       "Herunterladen der OrgSeite vom Server ..."
   :loading/getting-dashboard                     "Herunterladen der Lister verfügbarer OrgSeiten vom Server ..."
   :loading/uploading-orgpage                     "Hochladen einer OrgSeite zum Server ..."
   :loading/authorizing-user                      "Benutzer wird authorisiert ..."
   :loading/ws-init                               "Aufbau der Verbindung zum Server ..."
   :loading/ws-closed                             (str "Verbindung zum Server geschlossen, eine Neuverbindung wird versucht. "
                                                       "Falls das Problem andauert, laden Sie die Seite bitte neu.")
   :loading/administration                        "Verwaltungsdaten werden geladen ..."
   :loading/style                                 "Stile werden geladen ..."
   :loading/uploading-attachments                 "Hochladen der Anhänge zum Server ..."

   :login/continue-with-facebook                  "Mit Facebook fortfahren"
   :login/continue-with-google                    "Mit Google fortfahren"
   :login/forgotten-password                      "Passwort vergessen"
   :login/forgotten-password-email-resent         "E-Mail zum Zurücksetzen bereits gesendet."
   :login/forgotten-password-description          (str "Geben Sie bitte eine E-Mail Adresse ein, für welche wir Ihnen einen Link zum Zurücksetzen des Passworts zusenden werden."
                                                       "Der Link ist 24 Stunden lang gültig.")
   :login/forgotten-password-error                [:<> "Diese E-Mail Adresse wird von Ihnen blockiert. Entweder entsperren Sie diese mit dem Klick auf \"Abmelden\" in einer E-Mail von OrgPad, "
                                                   " oder senden Sie eine E-Mail an " [:b "support@orgpad.com"] " von dieser E-Mail Adresse."]
   :login/remember                                "Anmeldung merken"
   :login/remember-tooltip                        "Angemeldet bleiben, wenn Sie zu dieser Seite zurückkehren."
   :login/send-reset-link                         "Link zum Zurücksetzen senden"
   :login/wrong-email-or-password                 "E-Mail oder Passwort stimmen nicht überein"

   :login-util/separator                          "oder"

   :notes/create-note                             "Neue Notiz"
   :notes/edit-note                               "Notiz bearbeiten"
   :notes/manage-notes                            "Notizen verwalten"
   :notes/my-notes                                "Meine Notizen"
   :notes/notes                                   [:i18n/plural "{notes/num-notes} {notes/notes-label}"
                                                   {:notes/notes-label [:notes/num-notes
                                                                        "Notizen" "Notiz" "Notizen"]}]
   :notes/confirm-delete                          "Wollen Sie wirklich diese Notiz löschen?"
   :notes/notes-description                       "Erfassen Sie Ideen und sortieren Sie diese später."

   :notifications/info                            "Wählen Sie bitte aus, welche E-Mails Sie von OrgPad erhalten möchten. Wir werden Sie immer über wichtige Änderungen benachrichtigen."
   :notifications/any-email                       "Alle E-Mails von OrgPad"
   :notifications/email-verification              "E-Mail Bestätigung beim Registrieren und Links zum Zurücksetzen des Passworts"
   :notifications/monthly-newsletter              "Monatlicher Rundbrief mit Aktualitäten und Neuentwicklungen in OrgPad"
   :notifications/blocked-people                  "Konkret blockierte Personen:"
   :notifications/recieve-invitations             "Einladungen von anderen Personen erhalten"
   :notifications/unblock-user                    "Person entsperren"

   :orgpage/change-information                    "Informationen ändern"
   :orgpage/copy-orgpage                          "In eine neue OrgSeite kopieren"
   :orgpage/delete-orgpage                        "OrgSeite löschen"
   :orgpage/detail                                "Detail"
   :orgpage/meta-description                      "Beschreibung"
   :orgpage/meta-new-tag                          "Markierungen (Tags)"
   :orgpage/meta-info                             (str "Diese Informationen helfen Ihnen und anderen zu wissen, worum es in dieser OrgSeite geht. "
                                                       "Sie können in der Liste von OrgSeiten nach den Markierungen (Tags) filtern.")
   :orgpage/meta-info-in-share-orgpage            "Vor dem Teilen der OrgSeite müssen Sie eine Überschrift erfassen."
   :orgpage/share-tooltip                         "Diese OrgSeite mit anderen teilen"
   :orgpage/share-orgpage                         "OrgSeite teilen"
   :orgpage/show-information                      "Informationen anzeigen"

   :orgpage/zoom-in                               "Vergrößern (reinzoomen)"
   :orgpage/zoom-out                              "Verkleinern (rauszoomen)"
   :orgpage/create-unit-double-click              "Mit dem Doppelklick erstellen Sie eine Einheit."
   :orgpage/switch-to-edit                        "Zum Bearbeiten wechseln."

   :orgpage/untitled                              "Unbenannte OrgSeite"
   :orgpage/untitled-path                         "Unbenannter Pfad"
   :orgpage/path-num-steps                        [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                   {:orgpage/step-label [:orgpage/num-steps
                                                                         "Schritte" "Schritt" "Schritte"]}]

   :orgpage/page-titles                           (fn [{:orgpage/keys [num-pages]}]
                                                    (str "{orgpage/title}"
                                                         (when (> num-pages 1) " (Seite {orgpage/position})")))
   :orgpage/path-title-closed-opened-index        "{orgpage/title} (Seite {orgpage/closed-index} → {orgpage/opened-index})"

   :orgpage-stats/number-of-units                 "Anzahl der Einheiten"
   :orgpage-stats/number-of-links                 "Anzahl der Verbindungen"
   :orgpage-stats/number-of-files                 "Anzahl der Dateien"
   :orgpage-stats/number-of-images                "Anzahl der Bilder"

   :panel/mobile-limitations                      [:<> "Das Erstellen und Bearbeiten von OrgSeiten ist auf mobilen Geräten " [:b "noch nicht möglich"]
                                                   " . Wir werden die Unterstützung in einer neuen Version hinzufügen. Bitte benutzen Sie die Desktop-Version."]
   :panel/create-orgpage                          "Neue OrgSeite"
   :panel/logo-tooltip                            "Zur Startseite"
   :panel/edit-info                               "Welchseln Sie zum Bearbeiten, wo Sie Einheiten und Verbindungen erstellen, bearbeiten, löschen und noch mehr können."
   :panel/read-info                               "Wechseln Sie zum Lesen, wo Sie keine Anpassungen vornehmen können, aber das Lesen ist dort einfacher."
   :panel/undo-deletion                           "Rückgängig machen"
   :panel/undo-deletion-info                      [:i18n/plural "Das Löschen von {delete/num-units} {delete/unit-label} und {delete/num-links} {delete/link-label} rückgängig machen."
                                                   #:delete{:unit-label [:delete/num-units
                                                                         "Einheiten" "Einheit" "Einheiten"]
                                                            :link-label [:delete/num-links
                                                                         "Verbindungen" "Verbindung" "Verbindungen"]}]

   :panel/switch-style                            "Stil von neuen Einheiten und Verbindungen wechseln; Ziehen erstellt eine neue Einheit"
   :panel/profile-settings                        "Einstellungen"
   :panel/usergroups                              "Teams"
   :panel/stats                                   "Statistiken"
   :panel/administration                          "Verwaltung"

   :password/too-short                            "Mindestens 8 Zeichen erforderlich"
   :password/different-passwords                  "Passwörter stimmen nicht überein"

   :password-reset/back-to-list                   "Zurück zu Liste"
   :password-reset/change-password                "Passwort wechseln"
   :password-reset/set-password                   "Passwort setzen"
   :password-reset/has-password                   "Ihr Konto hat ein Passwort eingestellt."
   :password-reset/without-password               "Kein Passwort ist gesetzt, da ein verbundenes Konto zur Anmeldung benutzt wurde."
   :password-reset/invalid-link                   "Ungültiger Link, vielleicht älter als 24 Stunden. Bitte fordern Sie das erneute Senden der E-Mail an."
   :password-reset/description                    "Setzen Sie Ihr neues Passwort."
   :password-reset/enter-current-and-new-password "Geben Sie Ihr aktuelles Passwort und zweimal das neue Passwort ein."
   :password-reset/enter-new-password-twice       "Das neue Passwort bitte zweimal eingeben."

   :pending-activation/email-already-used         "Die E-Mail wird mit einem anderen Konto bereits genutzt."
   :pending-activation/email-not-recieved         "Falls Sie keine E-Mail-Bestätigung erhalten haben, können Sie diese neu senden lassen. Sie können die E-Mail sogar korrigieren."
   :pending-activation/email-sent                 "E-Mail-Bestätigung gesendet."
   :pending-activation/instructions               "Aus Sicherheitsgründen müssen Sie Ihre E-Mail zuerst bestätigen. Klicken Sie auf den Bestätigungslink in der E-Mail, die wir Ihnen geschickt haben."
   :pending-activation/resend                     "E-Mail-Bestätigung neu senden"

   :path/add-step                                 "Schritt hinzufügen"
   :path/title                                    "Präsentation {path/num-paths}"
   :paths/create-new-path                         "Präsentation erstellen"
   :paths/confirm-path-deletion                   (fn [{:path/keys [title]}]
                                                    [:<> " Wollen Sie die Präsentation \"" [:b title] "\" löschen?"])
   :paths/show-hidden-units                       "Ausgeblendete Einheiten anzeigen"

   :presentation/presentation                     "Präsentation"
   :presentation/step                             "Schritt"
   :presentation/first-step                       "Erster Schritt"
   :presentation/previous-step                    "Vorheriger Schritt"
   :presentation/next-step                        "Nächster Schritt"
   :presentation/last-step                        "Letzter Schritt"

   :presentation/share-presentation               "Teilen Sie diese Präsentation mit anderen."

   :presentation/embedded-zoom-info               "STRG + Scrollen zum Verkleinern/ Vergrößern"

   :paths-menu/focus                              "Kamera einstellen {keyboard/shortcut}"
   :paths-menu/open-and-close                     "Einheiten öffnen und schließen {keyboard/shortcut}"
   :paths-menu/visibility                         "Sichtbarkeit anpassen {keyboard/shortcut}"

   :profile/profile                               "Profil"
   :profile/account                               "Konto"
   :profile/linked-accounts                       "Verbundene Konten"
   :profile/notifications                         "Benachrichtigungen"
   :profile/account-description                   "E-Mail und Passwort anpassen oder das Konto löschen"
   :profile/change-email                          "E-Mail ändern"
   :profile/change-email-text                     "Geben Sie bitte eine neue E-Mail Adresse ein. Aus Sicherheitsgründen müssen Sie diese bestätigen, bevor Sie das Konto entsperren können."
   :profile/current-email                         (fn [{:profile/keys [email]}]
                                                    [:<> "Ihr Konto wurde mit der folgenden E-Mail registriert " [:b email] " ."])
   :profile/account-linked-to-facebook            [:<> "Ihr Konto ist mit Facebook " [:b "verbunden"] "."]
   :profile/account-not-linked-to-facebook        [:<> "Ihr Konto ist " [:b "nicht"] " mit Facebook verbunden."]
   :profile/link-fb                               "Mit Facebook verbinden"
   :profile/unlink-fb                             "Verbindung zu Facebook trennen"
   :profile/account-linked-to-google              [:<> "Ihr Konto ist mit Google " [:b "verbunden"] "."]
   :profile/account-not-linked-to-google          [:<> "Ihr Konto ist " [:b "nicht"] " mit Google verbunden."]
   :profile/link-google                           "Mit Google verbinden"
   :profile/unlink-google                         "Verbindung zu Google trennen"
   :profile/set-password-text                     "Setzen Sie vor dem Trennen der Verbindung bitte ein Passwort."
   :profile/linked-accounts-info                  "Verbindnen Sie Ihr Facebook oder Google Konto mit OrgPad, sodass Sie diese Konten zur Anmeldung benutzen können."
   :profile/public-profile-info                   "Leute werden Sie mit den angeführten Informationen bei OrgPad erkennen."
   :profile/select-language                       "Sprache für die Anwendung auswählen (STRG+UMSCHALT+L): "

   :profile/delete-account                        "Konto löschen"
   :profile/confirm-delete-account-question       "Sind Sie sicher, Sie wollen das Konto dauerhaft löschen?"
   :profile/confirm-delete-account-info           "Das Löschen wird alle Ihre OrgSeiten und die Daten darin zerstören."
   :profile/delete-account-info                   [:<> "Das Löschen wird alle Ihre OrgSeiten und die Daten darin " [:b "dauerhaft zerstören"] "."]

   :props/h1                                      "Große Überschrift"
   :props/h2                                      "Mittlere Überschrift"
   :props/h3                                      "Kleine Überschrift"
   :props/weight-none                             "Normale Verbindung"
   :props/strong                                  "Starke Verbindung"
   :props/arrowhead-none                          "Kein Pfeil"
   :props/single                                  "Pfeil"
   :props/double                                  "Doppelpfeil"

   :public-permission/none                        "ist privat."
   :public-permission/edit                        "wird mit allen zum Bearbeiten geteilt."
   :public-permission/view                        "wird mit allen zum Lesen geteilt."

   :registration/create-user                      "Konto erstellen"
   :registration/register-by-email                "Mit E-Mail registrieren"
   :registration/server-error                     "Serverfehler. Bitte versuchen Sie erneut das Konto zu erstellen."

   :selection/change-style-of-selected            [:i18n/plural (fn [{:selection/keys [type]}]
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

   :selection/link                                "Einheiten verbinden"
   :selection/hide-contents                       "Inhalte ausblenden"
   :selection/show-contents                       "Inhalte einblenden"
   :selection/copy-units-links                    "Einheiten und Verbindungen kopieren"
   :selection/flip-links                          "Richtung wechseln"
   :selection/delete                              "Auswahl löschen"

   :share-orgpage/copy-template-link              "Link zur Vorlage kopieren"
   :share-orgpage/copy-template-link-tooltip      "Leute können diesen Link verwenden, um eine eigene Kopie dieser OrgSeite zu erstellen."
   :share-orgpage/dialog-title                    "\"{orgpage/title}\" teilen"
   :share-orgpage/info                            (fn [{:share/keys [create-team]}]
                                                    [:<> (str "Personen ohne ein OrgPad-Konto werden eine Einladung mit einem Link erhalten."
                                                              " Nachdem sie diesen Link geöffnet haben, können sie diese OrgSeite lesen. ")
                                                     "Sie können "
                                                     [:a.link-button create-team "ein Team erstellen"]
                                                     " um mit einer Gruppe von Menschen OrgSeiten einfacher teilen zu können."])
   :share-orgpage/invite-for-editing              "Einladen zum Bearbeiten"
   :share-orgpage/invite-for-viewing              "Einladen zum Lesen"
   :share-orgpage/invite-by-email                 "Wollen Sie diese mit einer E-Mail in bestimmter Sprache einladen?"
   :share-orgpage/links                           "Links"
   :share-orgpage/to-read                         "Lesen"
   :share-orgpage/to-edit                         "Bearbeiten"
   :share-orgpage/links-tooltip                   "Zugriff erteilen mittels teilbaren Links"
   :share-orgpage/new-user-or-usergroup           "Name, E-Mail oder Team"
   :share-orgpage/link-permission-start           "Personen Berechtigung erteilen zum "
   :share-orgpage/link-permission-end             " dieser OrgSeite."
   :share-orgpage/private-info                    "Nur Sie und die Personen in der Liste oder mit einem Link werden Zugriff haben."
   :share-orgpage/publish-permission-end          "Diese OrgSeite "
   :share-orgpage/publish-info                    [:<> "Diese OrgSeite ist " [:b "standardmäßig privat"]
                                                   (str ". Sie können die OrgSeite veröffentlichen, sodass jeder OrgPad-Besucher diese einsehen kann.")]
   :share-orgpage/publish                         "Veröffentlichen"
   :share-orgpage/publish-confirmation            "Jeder wird diese OrgSeite zum {orgpage/permission} öffnen können. Sind Sie sicher?"
   :share-orgpage/publish-tooltip                 "Zugriff allen erteilen"
   :share-orgpage/remove-user                     "Berechtigung entfernen"
   :share-orgpage/reset-links                     (fn [{:share/keys [reset-links]}]
                                                    [:<> "Falls Sie einen Link ausversehen geteilt haben, können Sie "
                                                     [:span.link-button reset-links "alle vorherigen Links ungültig machen"]
                                                     "."])
   :share-orgpage/shareable-link                  "Teilbarer Link"
   :share-orgpage/show-embedding-code             "In Ihre Webseite einbetten"
   :share-orgpage/start-with-presentation         "Mit einer Präsentation starten."
   :share-orgpage/user-not-registered             " ist noch nicht bei OrgPad registriert."
   :share-orgpage/users                           "Personen"
   :share-orgpage/users-tooltip                   "Zugriff einzelnen Personen erteilen"

   :side-panel/about                              "Über OrgPad"
   :side-panel/files-and-images                   "Dateien und Bilder"
   :side-panel/paths                              "Präsentationen"
   :side-panel/help                               "Hilfe"
   :side-panel/home                               "Startseite"
   :side-panel/import                             "Import"
   :side-panel/share                              "Teilen"
   :side-panel/num-files                          [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                   {:side-panel/files-label [:side-panel/num-files
                                                                             "Dateien" "Datei" "Dateien"]}]
   :side-panel/num-images                         [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                   {:side-panel/images-label [:side-panel/num-images
                                                                              "Bilder" "Bild" "Bilder"]}]
   :side-panel/num-paths                          [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                   {:side-panel/paths-label [:side-panel/num-paths
                                                                             " Pfade " " Pfad " " Pfade "]}]

   :step/closed-pages                             "Geschlossene Seiten"
   :step/everything-closed                        "Alles geschlossen."
   :step/hidden-units                             "Ausgeblendete Einheiten"
   :step/nothing-changed                          "Keine Änderung."
   :step/opened-pages                             "Geöffnete Seiten"
   :step/pages-shown-in-the-camera                "Seiten, die auf Kamera gezeigt werden"
   :step/revealed-units                           "Eingeblendete Seiten"
   :step/switched-pages                           "Gewechselte Seiten"

   :tag/public                                    "öffentlich"

   :text-field/email                              "E-Mail"
   :text-field/first-name                         "Vorname"
   :text-field/last-name                          "Nachname"
   :text-field/new-password                       "Neues Passwort"
   :text-field/new-password-again                 "Neues Passwort wiederholen"
   :text-field/password                           "Passwort"
   :text-field/password-again                     "Passwort wiederholen"
   :text-field/title                              "Überschrift"
   :text-field/content                            "Inhalt"
   :text-field/name-or-email                      "Name oder E-Mail"
   :text-field/subject                            "Betreff"
   :text-field/message                            "Nachricht"

   :role/owner                                    "Inhaber"
   :role/admin                                    "Kann teilen und löschen"
   :role/edit                                     "Kann bearbeiten"
   :role/view                                     "Kann lesen"
   :role/member                                   "Mitglied"

   :unit-buttons/create-link                      "Klicken oder Ziehung zum Verbinden; Umschalttaste halten um mehrere Verbindungen zu erstellen"
   :unit-buttons/change-link-style                (str "Stil der Einheit ändern; "
                                                       "Umschalttaste halten um Stil vom Standard übernehmen, "
                                                       "STRG halten zum Standard setzen; "
                                                       "Ziehen erstellt eine Verbindung in diesem Stil")
   :unit-buttons/hide-content                     "Inhalt ausblenden"
   :unit-buttons/delete-unit                      "Einheit löschen"

   :usergroups/create-team                        "Team erstellen"
   :usergroups/info                               "Um das Teilen von OrgSeiten zu vereinfachen, erstellen und verwalten Sie Teams von Freunden und Mitarbeitern."
   :usergroups/delete-usergroup                   "Team löschen"
   :usergroups/members                            "Mitglieder"
   :usergroups/change                             "Überschrift und Logo des Teams anpassen"
   :usergroups/show-actions                       "Aktivitäten anzeigen"
   :usergroups/name                               "Team-Name"
   :usergroups/create-usegroup-info               (str "Der Team-Namen und das Profilbild sind für alle OrgPad-Nutzer sichtbar. "
                                                       "Wählen Sie einen Namen, der mindestens 5 Zeichen lang ist. "
                                                       "Leerzeichen am Anfang und am Ende werden entfernt.")
   :usergroups/confirm-delete-usergroup           "Sind Sie sicher, Sie wollen das Team dauerhaft löschen?"
   :usergroups/usergroups-members                 "{usergroup/name}'s Mitglieder"
   :usergroups/remove-member                      "Vom Team entfernen"
   :usergroups/remove-admin                       "Administrator entfernen"
   :usergroups/make-admin                         "Zum Administrator machen"
   :usergroups/admin-tooltip                      "Ein Administrator kann die Mitglieder verwalten und das Team löschen"
   :usergroups/untitled-usergroup                 "Unbenanntes Team"})