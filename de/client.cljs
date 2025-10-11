(ns orgpad.client.i18n.dicts.de
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.de :as de]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  "A dictionary map from keywords to the corresponding German texts."
  (merge
    de/dict
    {:address/company                                 "Firmenname"
     :address/ico                                     "USt-IdNr."
     :address/street                                  "Straße"
     :address/street-number                           "Hausnummer"
     :address/postal-code                             "Postleitzahl"
     :address/city                                    "Stadt"
     :address/country                                 "Land"

     :administration/page-title                       "Administration - OrgPad"

     :attachments/allows-access-to-file               "Erlaubt den Zugriff auf diese Datei."
     :attachments/allows-access-to-image              "Erlaubt den Zugriff auf dieses Bild."
     :attachments/no-preview                          "Keine Ansicht verfügbar."
     :attachments/all-files                           "Alle Dateien"
     :attachments/used-files                          "Dateien in der OrgSeite"
     :attachments/unused-files                        "Dateien beiseite"
     :attachments/all-images                          "Alle Bilder"
     :attachments/used-images                         "Bilder in der OrgSeite"
     :attachments/unused-images                       "Bilder beiseite"
     :attachments/uploading-files                     "Dateien werden hochgeladen …"
     :attachments/previous-attachment                 "Vorherige Datei oder Bild"
     :attachments/next-attachment                     "Weitere Datei oder Bild"
     :attachments/display-using-microsoft-365         "Mit Microsoft 365 anzeigen"
     :attachments/edit-filename                       "Bearbeiten Name"
     :attachments/title-order                         "Alphabetisch nach Titel"
     :attachments/upload-order                        "Neueste oben"
     :attachments/size-order                          "Größte oben"
     :attachments/split-used-unused                   "Gruppieren nach Präsenz auf OrgSeite"
     :attachments/search                              "Suche"
     :attachments/ordering                            "Sortierung"
     :attachments/new-version                         "Neue Version"
     :attachments/preserve-old-version                "Alte Version beibehalten"
     :attachments/in-other-orgpages                   "In anderen OrgSeiten ersetzen:"

     :button/back                                     "Zurück"
     :button/cancel                                   "Abbrechen"
     :button/close                                    "Schließen"
     :button/comment                                  "Kommentieren"
     :button/continue                                 "Weiter"
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
     :button/insert                                   "Einfügen"
     :button/login                                    "Anmelden"
     :button/logout                                   "Abmelden"
     :button/publish                                  "Veröffentlichen"
     :button/read                                     "Lesen"
     :button/register                                 "Registrieren"
     :button/register-to-save                         "Zum Speichern registrieren"
     :button/remove                                   "Entfernen"
     :button/reset                                    "Zurücksetzen"
     :button/save                                     "Änderungen speichern"
     :button/save-tooltip                             "Änderungen speichern (STRG+Eingabetaste)"
     :button/upload                                   "Hochladen"
     :button/upload-from-computer                     "Vom Computer hochladen"
     :button/send                                     "Senden"
     :button/present                                  "Präsentieren"
     :button/present-tooltip                          "Präsentation starten (F5)"
     :button/share                                    "Teilen"
     :button/start                                    "Starten"
     :button/exit                                     "Verlassen"
     :button/show-password                            "Anzeigen"
     :button/hide-password                            "Ausblenden"

     :checkout/currency                               "Währung"
     :checkout/monthly                                "monatlich"
     :checkout/yearly                                 "jährlich (15 % sparen)"
     :checkout/failed-to-init                         "Beim Übergang zur Kasse ist ein Problem aufgetreten."
     :checkout/upgrade-plan                           "Abo-Upgrade" ; (d. h. ein Wechsel zu einer höheren Abostufe) (siehe Netflix help)
     :checkout/professional-plan                      "Professional-Abo"
     :checkout/school-plan                            "Schul-Abo"
     :checkout/enterprise-plan                        "Firmen-Abo"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Schule"] " oder "
                                                         [:a.link-button {:href enterprise-url} "Unternehmen"] "? Kontaktieren Sie uns für ein individuelles Angebot."])
     :checkout/pay-with-credit-card                   "Mit Kreditkarte bezahlen"
     :checkout/pay-with-wire-transfer                 "Mit Überweisung bezahlen"
     :checkout/promo-code                             "Gutscheincode"
     :checkout/try-for-free                           "Kostenlos ausprobieren"
     :checkout/activate-now                           "Jetzt aktivieren"
     :checkout/continue-for-free                      "Kostenlos fortsetzen"

     :code-lang/none                                  "Keiner"
     :code-lang/multiple                              "Mehrere"

     :dashboard/confirm-delete                        [:<> "Sind Sie sicher, dass Sie diese OrgSeite endgültig löschen wollen?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> "Um OrgSeiten zu erstellen, müssen Sie sich "
                                                         [:a {:href login-url} "anmelden"] " oder "
                                                         [:a {:href register-url} "registrieren"] "."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "Das Abo Ihrer Schule " name " ist am " subscription-expired "ausgelaufen. "
                                                         "Für die Erneuerung, kontaktieren Sie Ihre Verwaltung. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Mehr Informationen"] " über den etwa 95% hohen Rabatt für Schulen."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Erwerben Sie OrgPad für Ihre Schule ohne Einschränkungen mit einem 95% Rabatt. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Mehr Informationen."]])
     :dashboard/owned-orgpages                        "Meine OrgSeiten"
     :dashboard/public-orgpages                       "Veröffentlichte OrgSeiten"
     :dashboard/shared-orgpages                       "Mit mir geteilte OrgSeiten"
     :dashboard/usergroup-orgpages                    "{usergroup/name}'s OrgSeiten"
     :dashboard/help-or-inspiration-button            "Hier geht's weiter!"
     :dashboard/new-domain                            [:<>
                                                       "Verwenden Sie die neue Domain " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Weitere Informationen auf der OrgSeite " [:a {:href "https://orgpad.info/s/new-domain"} "Änderungen bei OrgPad und neue Domain (EN)"] "."]

     :dashboard-filter/filter                         "Filtrieren der OrgSeiten"
     :dashboard-filter/ordering                       "Sortierung der OrgSeiten"
     :dashboard-filter/filter-and-ordering            "Filtrieren und Sortieren der OrgSeiten"
     :dashboard-filter/title                          "Filtrieren und Sortieren der angezeigten OrgSeiten"
     :dashboard-filter/ordering-label                 "Sortierung der OrgSeiten"
     :dashboard-filter/title-order                    "Alphabetisch dem Titel nach"
     :dashboard-filter/creation-time-order            "Neuste zuerst"
     :dashboard-filter/last-modified-order            "Zuletzt angepasste zuerst"
     :dashboard-filter/most-viewed-order              "Meist gelesene zuerst"
     :dashboard-filter/search-tags                    "Suchmarkierungen (Such-Tags)"

     :embedding-code/code                             "Code"
     :embedding-code/description                      "Fügen Sie die OrgPage in eine Webseite oder eine andere Anwendung ein."

     :error/orgpage-access-denied                     "Sie haben keinen Zugriff zu dieser OrgSeite. Versuchen Sie sich anzumelden."
     :error/usergroup-access-denied                   "Berechtigung zum bearbeiten des Teams wurde verweigert."
     :error/administration-access                     "Verwaltungszugriff wurde verweigert."
     :error/creation-unauthorized                     "Zum erstellen von OrgSeiten müssen Sie sich anmelden."
     :error/deleting-denied                           "Löschen der OrgSeite wurde verweigert."
     :error/email-already-used                        "Diese E-Mail wird bereits genutzt."
     :error/email-not-registered                      "Kein Konto mit dieser E-Mail."
     :error/email-missing-mx-record                   "Kein E-Mail-Server unter der Domäne."
     :error/email-invalid                             "Ungültige E-Mail."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Ungültige OrgSeite" (when id " {orgpage/id}")
                                                             ". Fehlerhaft kopierter Link?"))
     :error/incorrect-link                            "Ungültiger Link. Entweder melden Sie sich bitte an, oder verwenden Sie einen gültigen Link."
     :error/incorrect-password                        "Ungültiges Passwort."
     :error/incorrect-profile-id                      "Ungültiger Link zum Profil. Fehlerhaft kopierter Link?"
     :error/lost-permission                           "Sie haben den Zugriff zu dieser OrgSeite verloren."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "E-Mails ohne ein Konto: " emails))
     :error/name-already-used                         "Dieser Name wird bereits genutzt"
     :error/name-not-valid                            "Benutzen Sie mindestens 5 Zeichen"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "Die OrgSeite " (when title "„{orgpage/title}“") " wurde entfernt."))
     :error/owner-of-orgpage                          "Die Person ist bereits der Inhaber dieser OrgSeite."
     :error/profile-not-found                         "Profil nicht gefunden."
     :error/unknown-error                             "Unbekannter Fehler, bitte erneut versuchen."
     :error/unknown-id                                "Unbekannte OrgSeite."
     :error/unknown-login-or-email                    "Unbekannte E-Mail oder Team-Name."
     :error/unknown-usergroup                         "Das Team wurde gelöscht"
     :error/upload-failed                             "Hochladen der OrgSeite: \"{orgpage/title}\" ist fehlgeschlagen"

     :export/show                                     "OrgSeite exportieren"
     :export/title                                    "Exportiere {orgpage/title}"
     :export/info                                     "Wählen Sie das Format, in dem diese OrgSeite exportieren möchten."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " Format, das von OrgPad verwendet wird"]
     :export/html                                     "Lineare HTML-Datei"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " Format"]
     :export/generate                                 "Export generieren"

     :feedback/ask-question                           "Frage stellen"
     :feedback/hide-button                            "Schaltfläche dauerhaft ausblenden"
     :feedback/dialog-title                           "Schreiben Sie den Entwicklern von OrgPad"
     :feedback/description                            [:<> "Wenn Sie Hilfe brauchen oder ein Problem haben, bitte schreiben Sie uns - "
                                                       [:b "den Entwicklern von OrgPad"] ". "
                                                       "Wir begrüßen zusätzlich jeden Verbesserungsvorschlag. "
                                                       "Wir werden so bald wie möglich per E-Mail antworten."]
     :feedback/languages                              "Sie können uns auf Deutsch, Englisch und Tschechisch schreiben."

     :feedback/contact-when-problem-persists          [:<> " Wenn das Problem besteht, bitte kontaktieren Sie uns unter "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Banküberweisung"
                                                             (when currency
                                                               (str " in " (name currency))) " für "
                                                             "jährliches"
                                                             (if (= tier "standard")
                                                               " Standard"
                                                               " Professional")
                                                             "-Abo"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Schreiben Sie uns Ihre " [:b "Rechnungsadresse"] " und weitere Informationen für die Rechnungsstellung."
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " [:b email] " kontaktieren."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Ich möchte ein Abo für "
                                                             (case org-type
                                                               :feedback/school-plan "meine Schule"
                                                               :feedback/enterprise-plan "mein Unternehmen"
                                                               "meine Organisation")
                                                             " kaufen"))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Durch dieses Formular werden Sie einen Vertreter der Firma OrgPad s.r.o. ansprechen."
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " email " kontaktieren."
                                                         " Alternativ können Sie uns auch unter "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] " anrufen."])
     :feedback/upgrade-subscription-title             "Aktualisieren Sie mein Abo auf das Profi-Abo"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Geben Sie uns an, wie wir Ihr bestehendes Abo ändern sollen, und geben Sie uns alle weiteren Informationen."
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " [:b email] " kontaktieren."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Bitte ändern Sie meinen Abrechnungszeitraum auf " (if (= period "yearly")
                                                                                                                  "jährliche"
                                                                                                                  "monatliche") " Abrechnung"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Die Änderung wird nach Ablauf des aktuellen Abrechnungszeitraums vorgenommen."
                                                         " Bei jährlicher Abrechnung gibt es 15% Rabatt."
                                                         " Wir werden Sie in Kürze unter Ihrer E-Mail Adresse " [:b email] " kontaktieren."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str "Name " (case org-type
                                                                       :feedback/school-plan "der Schule"
                                                                       :feedback/enterprise-plan "des Unternehmens"
                                                                       "der Organisation")))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Position innerhalb " (case org-type
                                                                                     :feedback/school-plan "der Schule"
                                                                                     :feedback/enterprise-plan "des Unternehmens"
                                                                                     "der Organisation")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str "Webseite " (case org-type
                                                                           :feedback/school-plan "der Schule"
                                                                           :feedback/enterprise-plan "des Unternehmens"
                                                                           "der Organisation")))

     :fragment/fragment                               "Ort"
     :fragment/text-id                                "ID"
     :fragment/title                                  "Titel"
     :fragment/create                                 "Ort erstellen"
     :fragment/create-tooltip                         "TAB; halten Sie UMSCHALT gedrückt, um den ausgewählten Ort zu kopieren"
     :fragment/remove                                 "Ort löschen"
     :fragment/share                                  "Link zu diesem Ort kopieren"
     :fragment/text-id-required                       "ID erforderlich."
     :fragment/text-id-already-used                   "ID bereits verwendet."
     :fragment/closed-books                           "Geschlossene Einheiten; STRG+Klick zum Auswählen"
     :fragment/hidden-books                           "Versteckte Einheiten; STRG+Klick zum Auswählen"
     :fragment/opened-pages                           "Geöffnete Seiten; STRG+Klick zum Auswählen"
     :fragment/focused-books                          "Einheiten in der Kameraansicht; STRG+Klick zum Auswählen"
     :fragment/shown-books                            "Angezeigte Einheiten; STRG+Klick zum Auswählen"

     :info/uploading-attachments                      [:i18n/plural "Hochladen von {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "Dateien" "Datei" "Dateien"]}]
     :info/uploading-images                           [:i18n/plural "Hochladen von {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "Bildern" "Bild" "Bildern"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Das Hochladen von {info/count} {info/num-images} ist fehlgeschlagen."
                                                           {:info/num-images [:info/count "Bildern" "Bild" "Bildern"]}]
                                                          "Das Hochladen von mindestens einem Bild ist fehlgeschlagen."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} Youtube-{info/num-youtubes} nicht gefunden."
                                                       {:info/num-youtubes [:info/count "Videos" "Video" "Videos"]}]
     :info/uploading-attachments-failed               "Das Hochladen von Dateien ist fehlgeschlagen."
     :info/presentation-link-copied                   "Der Link zu dieser Präsentation wurde kopiert."
     :info/max-orgpages-exceeded                      "Der Inhaber dieser OrgSeite kann keine zusätzlichen OrgSeiten erstellen."
     :info/storage-exceeded                           "Der Inhaber dieser OrgSeiten hat die benötigten {upload/total-size} zum Hochladen dieser Dateien nicht übrig."
     :info/attachments-too-large                      (str "Das Hochladen von {upload/total-size} ist fehlgeschlagen."
                                                           " Auf einmal kann nur höchstens 500 MB hochgeladen werden.")
     :info/drop-info                                  (str "Lassen Sie über einer beliebigen Einheit oder über der grauen Leinwand los,"
                                                           " um eine neue Einheit zu erstellen.")
     :info/audio-not-allowed                          "Die Audiowiedergabe wurde blockiert. Klicken Sie auf den Play-Button."
     :info/audio-not-supported                        "Audio-Format wird nicht unterstützt."

     :import/another-format                           [:<> "Wenn Sie Daten im anderen Format importieren möchten, bitte schreiben Sie uns unter "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Importieren Sie Ihre Daten"
     :import/google-docs                              "Sie können Daten aus Microsoft Office oder Google Docs einfach in eine OrgSeite einfügen."
     :import/supported-formats                        "Zurzeit unterstützen wir diese Formate:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exportiert als eine .vsdx Datei."]
     :import/json-canvas                              [:<> [:a.link-button {:href "https://jsoncanvas.org/" :target "_blank"} "JSON canvas"] "-Datei."]

     :ios/install-info                                "Installieren Sie die OrgPad-App"
     :ios/share-button                                "1. Öffnen"
     :ios/add-to-home-screen                          "2. Antippen"

     :lang/cs                                         "Tschechisch"
     :lang/de                                         "Deutsch"
     :lang/en                                         "Englisch"
     :lang/es                                         "Spanisch"
     :lang/fr                                         "Französisch"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polnisch"
     :lang/ru                                         "Russisch"
     :lang/uk                                         "Ukrainisch"

     :lang-select/tooltip                             "Sprache für die Anwendung auswählen (STRG+UMSCHALT+L)"
     :lang-select/help-by-translating                 [:<> "Vermissen Sie Ihre Sprache? Helfen Sie uns mit der "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "Übersetzung von OrgPad"] "."]

     :limit/of                                        " von "
     :limit/orgpages                                  " OrgSeiten"
     :limit/people                                    " Menschen"
     :limit/teams                                     " Teams"
     :limit/team-members                              " Mitglieder"
     :limit/orgpages-tooltip                          (str "Im Free-Abo ist die Anzahl der OrgSeiten beschränkt."
                                                           " Wechseln Sie zum höheren Abo um mehr OrgSeiten zu erstellen.")
     :limit/shares-tooltip                            (str "Die Anzahl der Menschen, mit denen Sie OrgSeiten direkt teilen können ist beschränkt."
                                                           " Wechseln Sie zu dem Professional-Abo, um mit unbeschränkt vielen Menschen zu teilen.")
     :limit/teams-tooltip                             (str "Im Standard-Abo ist die Anzahl von besitzten Teams beschränkt."
                                                           " Wechseln Sie zu dem Professional-Abo, um unbeschränkt viele Teams erstellen zu können.")
     :limit/teams-members-tooltip                     (str "Im Standard-Abo ist die Anzahl der Mitglieder eines Teams beschränkt."
                                                           " Wechseln Sie zu dem Professional-Abo, um unbeschränkt große Teams erstellen zu können.")
     :limit/attachments-size                          (str "Die Gesamtgröße aller hochgeladeten Dateien und Bildern ist beschränkt"
                                                           " und kann mit dem Wechsel zur höheren Abo-Stufe erweitert werden.")
     :limit/attachments-size-clickable                (str "Die Gesamtgröße aller hochgeladeten Dateien und Bildern ist beschränkt."
                                                           " Klicken Sie, um zum höheren Abo zu wechseln, welches die Obergrenze erhöht.")
     :limit/attachments-size-try-out                  (str "Die Gesamtgröße aller hochgeladenen Dateien und Bildern ist beschränkt."
                                                           " Zum Erhöhen der Obergrenze auf 100 MB, klicken Sie zum Erstellen eines Kontos.")

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

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Berechnung von Größen aller Einheiten, " [:span#autoresize-num-units num-units] " verbleiben …"])
     :loading/initial-layout                          "Initiales Layout wird verbessert …"
     :loading/restoring-opened-pages                  "Positionen von geöffneten Seiten wird wieder hergestellt …"
     :loading/getting-orgpage                         "Herunterladen der OrgSeite vom Server …"
     :loading/getting-dashboard                       "Herunterladen der Lister verfügbarer OrgSeiten vom Server …"
     :loading/getting-website                         "Herunterladen der Webseite vom Server …"
     :loading/getting-blog                            "Herunterladen des Blogs vom Server …"
     :loading/uploading-orgpage                       "Hochladen einer OrgSeite zum Server …"
     :loading/ws-init                                 "Aufbau der Verbindung zum Server …"
     :loading/ws-closed                               (str "Verbindung zum Server geschlossen, eine Neuverbindung wird versucht. "
                                                           "Falls das Problem andauert, laden Sie die Seite bitte neu.")
     :loading/administration                          "Verwaltungsdaten werden geladen …"
     :loading/profile                                 "Profil wird geladen …"
     :loading/style                                   "Stile werden geladen …"
     ;; Needed?
     :loading/start-trial                             "7-Tage Probe-Abo wird gestartet …"
     :loading/uploading-attachments                   "Hochladen der Anhänge zum Server …"

     :login/continue-with-email                       "Mit E-Mail fortfahren"
     :login/continue-with-facebook                    "Mit Facebook fortfahren"
     :login/continue-with-google                      "Mit Google fortfahren"
     :login/continue-with-microsoft                   "Mit Microsoft fortfahren"
     :login/continue-with-cuni                        "Mit Charles University fortfahren"
     :login/email-sent                                "E-Mail gesendet. Klicken Sie auf den Link in der E-Mail."
     :login/forgotten-password                        "Passwort vergessen"
     :login/forgotten-password-email-resent           "E-Mail zum Zurücksetzen bereits gesendet."
     :login/forgotten-password-description            "Erhalten Sie einen Link zum Zurücksetzen des Passworts per E-Mail (24 Stunden gültig)."
     :login/forgotten-password-error                  [:<> "Diese E-Mail Adresse wird von Ihnen blockiert. Entweder entsperren Sie diese mit dem Klick auf \"Abmelden\" in einer E-Mail von OrgPad, "
                                                       " oder senden Sie eine E-Mail an " company/support-email-app-link " von dieser E-Mail Adresse."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Neu bei OrgPad? " [:a.link-button {:href route} "Registrieren"]])
     :login/options                                   "Wählen Sie eine andere Anmeldemethode"
     :login/send-reset-link                           "Link zum Zurücksetzen senden"
     :login/wrong-email-or-password                   "E-Mail oder Passwort stimmen nicht überein"

     :markdown/title                                  "Ist der eingefügte Text im Markdown-Format?"
     :markdown/info                                   "Markdown-Formatierung wurde in Ihrem eingefügten Inhalt erkannt. Möchten Sie das Format benutzen?"
     :markdown/remember                               "Bis zum Neuladen merken"
     :markdown/insert                                 "Markdown-Formatierung benutzen"
     :markdown/ignore                                 "Original beibehalten"

     :meta/title                                      "OrgSeiten-Überschrift"
     :meta/orgpage-thumbnail                          "OrgSeiten-Ansicht"
     :meta/automatic-screenshot-start                 "Automatisch generierter Screenshot für "
     :meta/automatic-screenshot-refresh               "Wird fünf Minuten nach jeder Änderung aktualisiert."
     :meta/custom-thumbnail                           "Eigenes Bild mit den Abmessungen 1360x768."
     :meta/upload-thumbnail                           "Eigenes Bild hochladen"
     :meta/thumbnail-upload-failed                    "Hochladen der Ansicht ist fehlgeschlagen."
     :meta/description                                "Beschreibung"
     :meta/new-tags                                   "Markierungen (Tags)"
     :meta/tag-too-long                               (str "Maximale Länge eines Tags ist " common-orgpage/max-tag-length " Zeichen.")
     :meta/too-many-tags                              (str "Es sind höchstens " common-orgpage/max-tags " Tags erlaubt.")
     :meta/info                                       (str "Die Informationen werden in der OrgPage-Liste angezeigt, "
                                                           "wenn Sie eine OrgPage einbetten oder Sie in sozialen Netzwerken teilen.")
     :meta/info-in-share-orgpage                      "Vor dem Teilen der OrgSeite müssen Sie eine Überschrift erfassen."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Die {selection/num-units} {selection/units-label} "
                                                                         "und {selection/num-links} {selection/links-label} in eine neue OrgSeite "
                                                                         "mit den folgenden Informationen verschieben. In der aktuellen OrgSeite "
                                                                         "werden die Einheiten und Verbindungen mit einer Einheit ersetzt, die "
                                                                         "die neu entstandene OrgSeite beinhaltet.")
                                                       {:selection/units-label [:selection/num-units "ausgewählten Einheiten" "ausgewählte Einheit" "ausgewählten Einheiten"]
                                                        :selection/links-label [:selection/num-links "Verbindungen" "Verbindung" "Verbindungen"]}]
     :meta/info-title                                 "Informationen – {meta/title}"
     :meta/info-title-only                            "Benennen Sie die OrgSeite"
     :meta/details                                    "Details"
     :meta/preview                                    "Vorschau"
     :meta/init-fragments                             "Startort"
     :meta/init-fragments-info                        (str "Du kannst einen Startort festlegen, der beim Öffnen der OrgSeite angezeigt wird. "
                                                           "Für Mobilgeräte kann ein anderer Startort festgelegt werden.")
     :meta/desktop-init-fragment                      "Ort für Desktop"
     :meta/mobile-init-fragment                       "Ort für Mobilgerät"
     :meta/everything-closed                          "Alle Einheiten geschlossen"
     :meta/everything-closed-lowercase                "alle Einheiten geschlossen"
     :meta/more-details                               "Mehr Informationen"
     :meta/move-to-new-orgpage-title                  "Zu {meta/title} verschieben"
     :meta/move-to-new-orgpage                        "Zu einer neuen OrgSeite verschieben"

     :microsoft-365-permission/title                  "Microsoft 365 Zugriff auf dieses Dokument erlauben?"
     :microsoft-365-permission/info                   [:<> "Das Office-Dokument kann mit Microsoft 365 angezeigt werden."
                                                       " Mit dem Klick auf Einverstanden, Ihr Dokument wird mit Microsoft geteilt."
                                                       " Lesen Sie den " [:a.link-button {:href   "https://www.microsoft.com/de-de/servicesagreement/"
                                                                                          :target "_blank"}
                                                                          "Microsoft-Servicevertrag"] "."]
     :microsoft-365-permission/allow                  "Microsoft 365 Erlaubnis erteilen"

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

     :orgpage/creating-preview                        "Ansicht wird erstellt …"
     :orgpage/change-information                      "Informationen ändern"
     :orgpage/copy-orgpage                            "In eine neue OrgSeite kopieren"
     :orgpage/delete-orgpage                          "OrgSeite löschen"
     :orgpage/detail                                  "Detail"
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
     :orgpage/untitled-path                           "Unbenannte Präsentation"
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
     :orgpage/change-color                            "Die Farbe dieser OrgSeite wechseln"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Diese OrgSeite wird automatisch mit " label " zum "
                                                         (case permission
                                                           :permission/view "Lesen"
                                                           :permission/comment "Kommentieren"
                                                           :permission/edit "Bearbeiten"
                                                           nil)
                                                         " geteilt. Zum Beenden des Teilens "
                                                         [:span.link-button {:on-click on-click} "hier anklicken"] "."])

     :orgpage-placement/activate                      "Hier ansehen"

     :orgpage-print/displayed                         "Genau wie dargestellt"
     :orgpage-print/displayed-info                    "Alles innerhalb des Rechtecks wird genau so gedruckt, wie Sie es sehen."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgSeite erfolgreich in eine"
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF-Datei"] "ausgedruckt."])
     :orgpage-print/estimated-time                    "Das Drucken dieses PDFs sollte etwa {orgpage-print/estimated-time} dauern."
     :orgpage-print/everything-closed                 "Alle Einheiten geschlossen"
     :orgpage-print/everything-closed-info            "Das gedruckte PDF zeigt alle Einheiten geschlossen an."
     :orgpage-print/fragment                          "Ein Ort"
     :orgpage-print/fragment-info                     "Das gedruckte PDF zeigt den ausgewählten Ort an."
     :orgpage-print/gray                              "Grauer Hintergrund"
     :orgpage-print/landscape                         "Querformat"
     :orgpage-print/orientation                       "Ausrichtung"
     :orgpage-print/path-info                         [:i18n/plural " mit {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "Seiten" "Seite" "Seiten"]}]
     :orgpage-print/portrait                          "Hochformat"
     :orgpage-print/presentation                      "Schritte einer Präsentation"
     :orgpage-print/presentation-info                 "Jeder Schritt wird auf einer separaten Seite gedruckt."
     :orgpage-print/print                             "Zu PDF drucken"
     :orgpage-print/size                              "Größe"
     :orgpage-print/started                           (str "Wir drucken diese OrgSeite in eine PDF-Datei aus. Es sollte etwa {orgpage-print/estimated-time} dauern."
                                                           " Wenn der Prozess fertig ist, wird sie als Datei verfügbar sein.")

     :orgpage-print/title                             "Name des Ausdrucks"
     :orgpage-print/type                              "Was wird gedruckt"
     :orgpage-print/watermark                         "Wasserzeichen verwenden"
     :orgpage-print/watermark-info                    "Zum Entfernen zum Professional-, Schule- oder Unternehmen-Abo wechseln."
     :orgpage-print/white                             "Weißer Hintergrund"

     :orgpage-stats/number-of-units                   "Anzahl der Einheiten"
     :orgpage-stats/number-of-links                   "Anzahl der Verbindungen"
     :orgpage-stats/number-of-files                   "Anzahl der Dateien"
     :orgpage-stats/number-of-images                  "Anzahl der Bilder"

     :org-role/student                                "Schüler"
     :org-role/teacher                                "Lehrer"
     :org-role/employee                               "Mitarbeiter"
     :org-role/admin                                  "Administrator"

     :panel/toggle-side-panel                         "Seitenmenü"
     :panel/create-orgpage                            "Neue OrgSeite"
     :panel/logo-tooltip                              "Zur Startseite"
     :panel/edit-info                                 "Wechseln Sie zum Bearbeiten, wo Sie Einheiten und Verbindungen erstellen, bearbeiten, löschen und noch mehr können. (F7)"
     :panel/comment-info                              (str "Wechseln Sie zum Kommentieren, wo Sie Ihre Einheiten und Verbindungen"
                                                           " erstellen, bearbeiten und löschen können, aber nicht die"
                                                           " von anderen Menschen. Allerdings können Sie Verbindungen"
                                                           " zu Einheiten erstellen, die Sie nicht besitzen. (F7)")
     :panel/read-info                                 "Wechseln Sie zum Lesen, wo Sie keine Anpassungen vornehmen können, aber das Lesen ist dort einfacher. (F6)"
     :panel/undo-deletion                             "Rückgängig machen"
     :panel/undo-deletion-info                        [:i18n/plural "Das Löschen von {delete/num-units} {delete/unit-label} und {delete/num-links} {delete/link-label} rückgängig machen (STRG+Z)"
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
     :panel/selection-mode                            "Auswahl anfangen"
     :panel/search                                    "Suche (STRG+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Zeige {panel/num-hidden-book-ids} {panel/unit-label}, die am aktuellen Ort verborgen sind"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids "Einheiten" "Einheit" "Einheiten"]}]

     :password/too-short                              "Mindestens 8 Zeichen erforderlich"
     :password/different-passwords                    "Passwörter stimmen nicht überein"

     :password-reset/back-to-list                     "Zurück zu Liste"
     :password-reset/change-password                  "Passwort wechseln"
     :password-reset/set-password                     "Passwort setzen"
     :password-reset/has-password                     "Ihr Konto hat ein Passwort eingestellt."
     :password-reset/without-password                 "Kein Passwort ist gesetzt, da ein verbundenes Konto zur Anmeldung benutzt wurde."
     :password-reset/invalid-link                     "Ungültiger Link, vielleicht älter als 24 Stunden. Bitte fordern Sie das erneute Senden der E-Mail an."
     :password-reset/description                      "Setzen Sie Ihr neues Passwort."
     :password-reset/enter-current-and-new-password   "Geben Sie Ihr aktuelles Passwort und das neue Passwort ein."
     :password-reset/enter-new-password               "Das neue Passwort bitte eingeben."

     :path/add-step                                   "Schritt"
     :path/add-step-tooltip                           "Eingabetaste oder TAB; halten Sie UMSCHALT, um die Kamera zu kopieren"
     :path/hidden-ops                                 " und {path/num-hidden} weitere"
     :path/title                                      "Präsentationsüberschrift"
     :path/default-title                              "Präsentation {path/num-paths}"
     :path/copy                                       "Kopieren in eine neue Präsentation"
     :path/copy-suffix                                "Kopie"
     :path/add-audio                                  "Audio mit Schritt verknüpfen"
     :path/remove-audio                               "Audio von Schritt trennen"

     :paths/create-new-path                           "Präsentation erstellen"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> " Wollen Sie die Präsentation \"" [:b title] "\" löschen?"])
     :paths/help                                      "Zellen auswählen, um ändern, was sichtbar ist. Details finden Sie im Leitfaden (auf Englisch)."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Aktuell in " [:b tier] ", gültig bis " [:b end-date] "."
                                                         (if autorenewal
                                                           " Das Abo wird nach dem Ablauf der Gültigkeitsdauer automatisch  erneuert."
                                                           " Das Abo wird am Ende der Gültigkeitsdauer auslaufen.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Ihr " [:b tier " Abo"] " ist am " [:b end-date] " abgelaufen, da Ihre Zahlung zur Verlängerung nicht erfolgreich war."
                                                         " Wenn Sie Ihre Zahlungsinformationen aktualisieren, wird Ihr Abonnement automatisch verlängert."])
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
     :payments/billing-address                        "Rechnungsadresse"
     :payments/billing-address-info                   (str "Die eingegebene Rechnungsadresse wird auf allen neuen Rechnungen verwendet."
                                                           " Auch kürzlich ausgestellte Rechnungen werden automatisch aktualisiert.")
     :payments/receipt-label                          "Rechnung {receipt/date-range}"
     :payments/customer-portal-failed                 "Beim Laden der Abo-Verwaltung ist ein Problem aufgetreten."

     :pending-activation/email-already-used           "Die E-Mail wird mit einem anderen Konto bereits genutzt."
     :pending-activation/email-not-recieved           "Keine E-Mail erhalten? Erneut senden oder unten ändern."
     :pending-activation/email-sent                   "E-Mail-Bestätigung gesendet."
     :pending-activation/instructions                 "Fast fertig! Aktivieren Sie Ihr Konto mit einem Klick auf den Link, den wir Ihnen per E-Mail geschickt haben."
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
     :presentation/present                            "Präsentation starten"
     :presentation/slideshow                          "Automatische Wiedergabe der Schritte"
     :presentation/step-duration                      "Dauer eines Schrittes in Sekunden"
     :presentation/loop-slideshow                     "Am Ende wiederholen"
     :presentation/respect-audio-track                "Schrittdauer gemäß Audiospur"
     :presentation/stop-slideshow                     "Automatische Wiedergabe der Schritte stoppen"
     :presentation/exit-tooltip                       "Präsentation abbrechen"
     :presentation/play-audio                         "Audio für diesen Schritt abspielen"
     :presentation/pause-audio                        "Audiowiedergabe anhalten"

     :presentation/share-presentation                 "Teilen Sie diese Präsentation mit anderen."

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
     :pricing-popup/try-out-share-title               "Registrieren Sie sich um diese OrgSeite zu teilen"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Nur " [:b space-left " verbleiben"] " von Ihrem Speicherplatz."])
     :pricing-popup/free-account-info                 "Mit dem Registrieren eines Kontos erhalten Sie kostenlos:"
     :pricing-popup/free-limit                        "bis zu drei OrgSeiten,"
     :pricing-popup/free-storage                      "bis zu 100 MB Speicherplatz,"
     :pricing-popup/free-share                        "das Teilen Ihrer Arbeit mit Anderen."
     :pricing-popup/free-account-info2                "Erstellen Sie ein Konto mit wenigen Klicks."

     :pricing-popup/register-to-comment               "Um Kommentieren zu können, melden Sie sich an."
     :pricing-popup/register-to-comment-info          (str "Kommentar-Einheiten werden Ihren Namen und Ihr Profilbild"
                                                           " anzeigen. Deswegen müssen Sie zuerst Ihr Konto anlegen.")

     :pricing-popup/print-watermark-title             "Um das Wasserzeichen zu entfernen müssen Sie zum höheren Abo wechseln"
     :pricing-popup/print-watermark-info              (str "Druck ohne das OrgPad.info-Wasserzeichen ist nur im"
                                                           "Professional-, Schule- oder Unternehmen-Abo möglich.")

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
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} kostenlos"
                                                       {:promotion/days [:promotion/duration "Tage" "Tag" "Tage"]}]
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
     :public-permission/view                          "wird mit allen zum Lesen geteilt."

     :registration/create-user                        "Konto erstellen"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Haben Sie bereits ein Konto? " [:a.link-button {:href route} "Anmelden"]])
     :registration/options                            "Wählen Sie eine andere Registrierungsmethode"
     :registration/server-error                       "Serverfehler. Bitte versuchen Sie erneut das Konto zu erstellen."
     :registration/missing-oauth-email                "{registration/service} hat uns Ihre E-Mail-Adresse nicht mitgeteilt. Bitte geben Sie sie unten ein."

     :search/previous-match                           "Vorherige Übereinstimmung (Bild auf)"
     :search/next-match                               "Nächste Übereinstimmung (Bild ab)"
     :search/close                                    "Schließen (ESC)"
     :search/cells-with-selected-attachments          "Die Einheiten mit ausgewählten Dateien und Bildern."

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
     :selection/hide-contents                         "Inhalte ausblenden (ESC)"
     :selection/show-contents                         "Inhalte einblenden"
     :selection/force-closing                         "Diese Inhalte beim Öffnen des Ortes ausblenden (ESC)"
     :selection/step-focus-camera                     "Die Kamera des Schrittes exakt auf die ausgewählten Einheiten ausrichten (F2 oder Q). Halten Sie UMSCHALT, um weitere Einheiten hinzuzufügen, und ALT gedrückt, um sie zu entfernen."
     :selection/fragment-focus-camera                 "Die Kamera des Ortes exakt auf die ausgewählten Einheiten ausrichten (F2 oder Q). Halten Sie UMSCHALT, um weitere Einheiten hinzuzufügen, und ALT gedrückt, um sie zu entfernen."
     :selection/step-show-books                       "Nur die ausgewählten Einheiten im Schritt anzeigen (F3 oder W). Halten Sie UMSCHALT gedrückt, um weitere Einheiten hinzuzufügen, und ALT gedrückt, um sie zu entfernen."
     :selection/fragment-show-books                   "Nur die ausgewählten Einheiten im Ort anzeigen (F3 oder W). Halten Sie UMSCHALT gedrückt, um weitere Einheiten hinzuzufügen, und ALT gedrückt, um sie zu entfernen."
     :selection/force-showing                         "Ausgewählte Einheiten anzeigen, auch wenn sie zuvor verborgen waren."
     :selection/share-units                           "Einen Link kopieren, der die ausgewählten Einheiten anzeigt. Halten Sie UMSCHALT, um stattdessen die Einstellungen zu öffnen."
     :selection/move-to-new-orgpage                   "In eine neue OrgSeite verschieben"
     :selection/change-code-lang                      "Codesprache ändern"
     :selection/copy-units-links                      "Einheiten und Verbindungen in die Zwischenablage kopieren"
     :selection/flip-links                            "Richtung wechseln"
     :selection/delete                                "Auswahl löschen"

     :settings/profile                                "Profil"
     :settings/payments                               "Zahlungen"
     :settings/account                                "Konto"
     :settings/linked-accounts                        "Verbundene Konten"
     :settings/email                                  "Benachrichtigungen"
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
     :settings/account-linked-to-microsoft            [:<> "Ihr Konto ist mit Microsoft " [:b "verbunden"] "."]
     :settings/account-not-linked-to-microsoft        [:<> "Ihr Konto ist " [:b "nicht"] " mit Microsoft verbunden."]
     :settings/link-microsoft                         "Mit Microsoft verbinden"
     :settings/unlink-microsoft                       "Verbindung zu Microsoft trennen"
     :settings/account-linked-to-cuni                 [:<> "Ihr Konto ist mit Charles University " [:b "verbunden"] "."]
     :settings/account-not-linked-to-cuni             [:<> "Ihr Konto ist " [:b "nicht"] " mit Charles University verbunden."]
     :settings/link-cuni                              "Mit Charles University verbinden"
     :settings/unlink-cuni                            "Verbindung zu Charles University trennen"
     :settings/set-password-text                      " Setzen Sie vor dem Trennen der Verbindung bitte ein Passwort."
     :settings/linked-accounts-info                   "Verbinden Sie Ihr Facebook, Google, Microsoft oder Charles University Konto mit OrgPad, sodass Sie diese Konten zur Anmeldung benutzen können."
     :settings/profile-info                           "Über die angeführten Informationen sind Sie leichter für Mitwirkende an gemeinsamen Projekten auffindbar."

     :settings/delete-account                         "Konto löschen"
     :settings/confirm-delete-account-question        "Sind Sie sicher, Sie wollen das Konto dauerhaft löschen?"
     :settings/confirm-delete-account-info            "Das Löschen wird alle Ihre OrgSeiten und die Daten darin zerstören."
     :settings/delete-account-info                    [:<> "Das Löschen wird alle Ihre OrgSeiten und die Daten darin " [:b "dauerhaft zerstören"] "."]

     :share-orgpage/campaigns                         "Kampagne"
     :share-orgpage/copied-to-clipboard               "In die Zwischenablage kopiert"
     :share-orgpage/copy-template-link                "Link zur Vorlage kopieren"
     :share-orgpage/dialog-title                      "\"{orgpage/title}\" teilen"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Personen ohne ein OrgPad-Konto werden eine Einladung mit einem Link erhalten."
                                                                  " Nachdem sie diesen Link geöffnet haben, können sie diese OrgSeite lesen. ")
                                                         "Sie können "
                                                         [:a.link-button create-team "ein Team erstellen"]
                                                         " um mit einer Gruppe von Menschen OrgSeiten einfacher teilen zu können."])
     :share-orgpage/email-found                       "Ein OrgPad-Konto gefunden."
     :share-orgpage/email-unused                      "Kein OrgPad-Konto gefunden. Senden Sie stattdessen eine E-Mail."
     :share-orgpage/checking-email-address            "Die E-Mail-Adresse wird überprüft ..."
     :share-orgpage/invite-for-editing                "Einladen zum Bearbeiten"
     :share-orgpage/invite-for-viewing                "Einladen zum Lesen"
     :share-orgpage/invite-by-email                   "Wollen Sie diese mit einer E-Mail in bestimmter Sprache einladen?"
     :share-orgpage/show-profile                      "Profil anzeigen"
     :share-orgpage/links                             "Links"
     :share-orgpage/to-read                           "Lesen"
     :share-orgpage/to-comment                        "Kommentieren"
     :share-orgpage/to-edit                           "Bearbeiten"
     :share-orgpage/links-tooltip                     "Zugriff erteilen mittels teilbaren Links"
     :share-orgpage/template                          "Vorlage"
     :share-orgpage/template-tooltip                  "Links die automatisch eine Kopie der OrgSeite erstellen"
     :share-orgpage/template-info                     "Leute können diesen Link verwenden, um eine eigene Kopie dieser OrgSeite zu erstellen."
     :share-orgpage/template-autoshare-none           "Kopien werden mit dem Inhaber nicht geteilt."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Kopien werden mit dem Inhaber dieser OrgSeite zum "
                                                             (case template-autoshare
                                                               :permission/view "Lesen"
                                                               :permission/comment "Kommentieren"
                                                               :permission/edit "Bearbeiten") " geteilt."))
     :share-orgpage/embed                             "Einbetten"
     :share-orgpage/embed-into-microsoft-teams        "In Microsoft Teams einfügen"
     :share-orgpage/embed-into-website                "In eine Webseite oder Anwendung einfügen"
     :share-orgpage/embed-tooltip                     "In eine Webseite oder Anwendung einfügen"
     :share-orgpage/new-user-or-usergroup             "Name, E-Mail oder Team"
     :share-orgpage/link-permission-start             "Personen Berechtigung erteilen zum "
     :share-orgpage/link-permission-end               " dieser OrgSeite."
     :share-orgpage/orgpage-info                      "Informationen"
     :share-orgpage/orgpage-info-tooltip              "Informationen über den Inhaber und ob die OrgSeite veröffentlicht ist"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Diese OrgSeite ist mit Ihnen zum "
                                                             (case user-permission
                                                               :permission/view "Lesen"
                                                               :permission/comment "Kommentieren"
                                                               :permission/edit "Bearbeiten") " geteilt."))
     :share-orgpage/remove-yourself                   "Sich selbst entfernen"
     :share-orgpage/private-info                      "Nur Sie und die Personen, mit denen Sie die OrgSeite direkt oder über einen Link geteilt haben, haben Zugang. Jedes neu erstellte Dokument ist privat."
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
     :share-orgpage/everything-closed                 "Alle Einheiten geschlossen anzeigen"
     :share-orgpage/presentation                      "Mit einer Präsentation starten"
     :share-orgpage/fragment                          "Ort anzeigen"
     :share-orgpage/template-link-switch              "Link zur Vorlage erstellen."
     :share-orgpage/user-not-registered               " ist noch nicht bei OrgPad registriert."
     :share-orgpage/users                             "Personen"
     :share-orgpage/users-tooltip                     "Zugriff einzelnen Personen erteilen"

     :side-panel/about                                "Startseite"
     :side-panel/terms-and-conditions                 "Allgemeine Geschäftsbedingungen"
     :side-panel/privacy-and-security                 "Datenschutz und Sicherheit"
     :side-panel/files-and-images                     "Dateien und Bilder"
     :side-panel/paths                                "Präsentationen"
     :side-panel/fragments                            "Orte"
     :side-panel/translate                            "Übersetzungen"
     :side-panel/toggle-debug                         "Debugger"
     :side-panel/help                                 "Hilfe"
     :side-panel/blog                                 "Blog"
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
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     " Orte " " Ort " " Orte "]}]

     :step/closed-books                               "Geschlossene Einheiten; STRG+Klick zum Auswählen"
     :step/everything-closed                          "Alles geschlossen"
     :step/hidden-books                               "Ausgeblendete Einheiten; STRG+Klick zum Auswählen"
     :step/nothing-changed                            "Keine Änderung"
     :step/opened-pages                               "Geöffnete Seiten; STRG+Klick zum Auswählen"
     :step/focused-books                              "Einheiten, die auf Kamera gezeigt werden; STRG+Klick zum Auswählen"
     :step/shown-books                                "Eingeblendete Einheiten; STRG+Klick zum Auswählen"
     :step/switched-pages                             "Gewechselte Seiten; STRG+Klick zum Auswählen"

     :style-select/set-comment                        "Zu einer Kommentar-Einheit mit Ihrem Profilbild wechseln (STRG+,)"
     :style-select/unset-comment                      "Zu einer normalen Einheit ohne Ihr Profilbild wechseln (STRG+,)"
     :style-select/set-comment-safari                 "Zu einer Kommentar-Einheit mit Ihrem Profilbild wechseln (UMSCHALT+BEFEHL+,)"
     :style-select/unset-comment-safari               "Zu einer normalen Einheit ohne Ihr Profilbild wechseln (UMSCHALT+BEFEHL+,)"

     :tag/public                                      "öffentlich"

     :text-field/email                                "E-Mail"
     :text-field/first-name                           "Vorname"
     :text-field/last-name                            "Nachname"
     :text-field/name                                 "Name"
     :text-field/new-password                         "Neues Passwort"
     :text-field/password                             "Passwort"
     :text-field/content                              "Inhalt"
     :text-field/name-or-email                        "Name oder E-Mail"
     :text-field/subject                              "Betreff"
     :text-field/message                              "Nachricht"
     :text-field/phone-number                         "Telefonnumber"
     :text-field/width                                "Breite"
     :text-field/height                               "Höhe"

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

     :unit-editor/add-page                            "Seite hinzufügen (STRG+BILD ↓)"
     :unit-editor/delete-page                         "Diese Seite löschen"
     :unit-editor/previous-page                       (str "Vorherige Seite (BILD ↑);"
                                                           " Umschalttaste halten um diese Seite nach links zu verschieben (UMSCHALT+BILD ↑);"
                                                           " STRG halten um eine weitere Seite vor dieser Seite hinzuzufügen (STRG+BILD ↑)")
     :unit-editor/next-page                           (str "Nächste Seite (BILD ↓);"
                                                           " Umschalttaste halten um diese Seite nach rechts zu verschieben (UMSCHALT+BILD ↓);"
                                                           " STRG halten um eine weitere Seite nach dieser Seite hinzuzufügen (STRG+BILD ↓)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Zu dieser Seite wechseln"
                                                             (when can-edit "; Umschalttaste halten um aktuelle Seite dahin zu verschieben")))
     :unit-editor/hidden-info                         "Klicken Sie zum Schreiben"
     :unit-editor/undo                                "Rückgängig machen (STRG+Z)"
     :unit-editor/redo                                "Wiederherstellen (STRG+UMSCHALT+Z oder STRG+Y)"
     :unit-editor/toggle-bold                         "Fett (STRG+B)"
     :unit-editor/toggle-italic                       "Kursiv (STRG+I)"
     :unit-editor/toggle-strikethrough                "Durchgestrichen"
     :unit-editor/toggle-subscript                    "Tiefgestellt (STRG+S)"
     :unit-editor/toggle-superscript                  "Hochgestellt (STRG+UMSCHALT+S)"
     :unit-editor/create-hyperlink                    "Hyperlink erstellen (STRG+K)"
     :unit-editor/remove-hyperlink                    "Hyperlink entfernen"
     :unit-editor/set-highlighting                    "Hervorhebungsfarbe"
     :unit-editor/selection->code                     "Zum Code umwandeln (STRG+D)"
     :unit-editor/toggle-list-ul                      "Ungeordnete Aufzählung (TAB)"
     :unit-editor/toggle-list-ol                      "Nummerierte Liste (STRG+O)"
     :unit-editor/indent                              "Einzug vergrößern (TAB)"
     :unit-editor/outdent                             "Einzug Verkleinern (UMSCHALT+TAB)"
     :unit-editor/center                              "Ausrichtung zentrieren (STRG+L)"
     :unit-editor/heading                             "Überschrift (STRG+G)"
     :unit-editor/embed-pdf                           "PDF-Inhalt anzeigen"
     :unit-editor/link-pdf                            "PDF-Inhalt mit seinem Hyperlink ersetzen"
     :unit-editor/embed-office                        "Inhalt des Dokuments mit Microsoft 365 anzeigen"
     :unit-editor/link-office                         "Inhalt des Dokuments mit dem Hyperlink des Dokuments ersetzen"
     :unit-editor/embed-video                         "Video-Player anzeigen"
     :unit-editor/link-video                          "Video mit seinem Hyperlink ersetzen"
     :unit-editor/embed-audio                         "Audio-Player anzeigen"
     :unit-editor/link-audio                          "Audio mit seinem Hyperlink ersetzen"
     :unit-editor/hyperlink->embed                    "Verlinkte Website einfügen"
     :unit-editor/embed->hyperlink                    "Eingebettete Website durch ihren Hyperlink ersetzen"
     :unit-editor/open-image-in-attachments           "Dieses Bild in der Anhangsliste öffnen"
     :unit-editor/open-file-in-attachments            "Diese Datei in der Anhangsliste öffnen"
     :unit-editor/toggle-controls                     "Steuerelemente des Video-Players anzeigen"
     :unit-editor/toggle-autoplay                     "Automatisch abspielen"
     :unit-editor/toggle-muted                        "Stummgeschaltetes Abspielen, automatisches Abspielen kann sonst blockiert werden"
     :unit-editor/toggle-loop                         "Schleifenwiedergabe"
     :unit-editor/toggle-chained-size                 "Seitenverhältnis beibehalten"
     :unit-editor/insert-menu                         "Einfügen"
     :unit-editor/insert-image                        "Bild"
     :unit-editor/insert-image-shortcut               "STRG+UMSCHALT+I"
     :unit-editor/insert-image-info                   "Bild von Ihrem Gerät hochladen."
     :unit-editor/insert-image-info2                  "Tipp: Ziehen Sie Bilder direkt in eine beliebige Einheit oder auf die graue Leinwand."
     :unit-editor/insert-camera                       "Kamera"
     :unit-editor/insert-attachment                   "Datei einfügen"
     :unit-editor/insert-attachment-shortcut          "STRG+UMSCHALT+F"
     :unit-editor/insert-video                        "Video"
     :unit-editor/insert-video-info                   "Laden Sie ein Video vom Computer hoch oder fügen Sie es von YouTube ein."
     :unit-editor/insert-video-info2                  "Tipp: Ziehen Sie Videos und YouTube-Miniaturansichten direkt in eine beliebige Einheit oder graue Leinwand."
     :unit-editor/video-url                           "YouTube link"
     :unit-editor/youtube-start                       "Start"
     :unit-editor/youtube-end                         "Ende"
     :unit-editor/insert-table                        "Tabelle"
     :unit-editor/insert-table-info                   "Wählen Sie die Größe der eingefügten Tabelle."
     :unit-editor/toggle-table-border                 "Tabellenränder anzeigen"
     :unit-editor/add-row-before                      "Zeile oben einfügen"
     :unit-editor/add-row-after                       "Zeile unten einfügen"
     :unit-editor/remove-current-row                  "Zeile löschen"
     :unit-editor/add-column-before                   "Spalte links einfügen"
     :unit-editor/add-column-after                    "Spalte rechts einfügen"
     :unit-editor/remove-current-column               "Spalte löschen"
     :unit-editor/remove-table                        "Tabelle löschen"
     :unit-editor/insert-website                      "Webseite"
     :unit-editor/insert-website-info                 (str "Sie können Websiten direkt in eine Einheit einbetten."
                                                           " Wenn es nicht funktioniert, wird es möglicherweise vom Eigentümer der Website blockiert.")
     :unit-editor/website-url-or-code                 "Adresse der Website oder Code"
     :unit-editor/website-id                          "Website-ID"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Zum "
                                                         [:a.link-button {:href info :target "_blank"} "Versenden von Nachrichten zwischen Websites"] "."])
     :unit-editor/invalid-website-url                 "Die Webadresse oder der Code ist ungültig."
     :unit-editor/invalid-video-url                   "Die Videoadresse ist ungültig."
     :unit-editor/update-website                      "Adresse der Webseite anpassen"
     :unit-editor/insert-orgpage                      "OrgSeite"
     :unit-editor/insert-code                         "Code"
     :unit-editor/insert-code-shortcut                "STRG+D"
     :unit-editor/copy-code                           "Code kopieren"
     :unit-editor/insert-math-shortcut                "STRG+U, STRG+M"
     :unit-editor/toggle-block-code                   "Code als ein eigener Absatz"
     :unit-editor/toggle-block-math                   "Mathematik in einer eigenen Zeile"
     :unit-editor/remove-code                         "Code-Formatierung entfernen"
     :unit-editor/insert-math                         "Mathematik / Chemie"


     :unit-panel/link                                 (str "Klicken oder Ziehen zum Verbinden;"
                                                           " Umschalttaste halten um mehrere Verbindungen zu erstellen;"
                                                           " STRG halten zum Erstellen einer Kette von Einheiten")
     :unit-panel/upload-attachment                    "Bild oder Datei in diese Einheit einfügen"
     :unit-panel/change-link-style                    (str "Stil der Einheit ändern; "
                                                           "Umschalttaste halten, um Stil vom Standard zu übernehmen; "
                                                           "STRG halten, um als Standard festzulegen; "
                                                           "Ziehen erstellt eine Verbindung in diesem Stil")
     :unit-panel/hide-content                         "Inhalt ausblenden"
     :unit-panel/delete-unit                          "Einheit löschen"

     :usergroup/create                                "Team erstellen"
     :usergroup/edit-title                            "Bearbeiten {usergroup/name}"
     :usergroup/info                                  "Um das Teilen von OrgSeiten zu vereinfachen, erstellen und verwalten Sie Teams von Freunden und Mitarbeitern."
     :usergroup/delete                                "Team löschen"
     :usergroup/members                               "Mitglieder"
     :usergroup/edit                                  "Überschrift und Logo des Teams anpassen"
     :usergroup/show-actions                          "Aktivitäten anzeigen"
     :usergroup/name                                  "Team-Name"
     :usergroup/hide-orgpages                         "Geteilte OrgSeite ausblenden"
     :usergroup/hide-orgpages-tooltip                 "Um diese anzuzeigen, aktivieren Sie das Team im Filter."
     :usergroup/hide-in-filter                        "Im Filter ausblenden"
     :usergroup/create-info                           "Der Team-Name und das Profilbild sind nur für Mitglieder sichtbar."
     :usergroup/confirm-delete                        "Sind Sie sicher, Sie wollen das Team dauerhaft löschen?"
     :usergroup/members-title                         "{usergroup/name}'s Mitglieder"
     :usergroup/remove-member                         "Vom Team entfernen"
     :usergroup/remove-admin                          "Administrator entfernen"
     :usergroup/make-admin                            "Zum Administrator machen"
     :usergroup/admin-tooltip                         "Ein Administrator kann die Mitglieder verwalten und das Team löschen."
     :usergroup/copy-usergroup                        "Team kopieren"

     :usergroup-role/owner                            "Inhaber"
     :usergroup-role/admin                            "Administrator"
     :usergroup-role/member                           "Mitglied"

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
                                                        [:<> " Wenn Sie Fragen oder Schwierigkeiten haben sollten, bitte "
                                                         [:a.link-button {:href url} "füllen Sie dieses Formular"] " aus."])
     :wire-transfer/success-text                      [:<> "Wir haben Ihnen ein " [:b "einmaliges 7-Tage-Abo"] " aktiviert,"
                                                       " sodass Sie OrgPad mit dem neuen Tarif sofort benutzen können. "]
     :wire-transfer/common-result-text                (str "Wenn die Bank die erfolgreiche Zahlung bestätigt hat,"
                                                           " wird die Gültigkeit des Abos um 1 Jahr verlängert.")
     :wire-transfer/start-trial                       "Überweisung gesendet"
     :wire-transfer/start-trial-result-title          "Danke für die Bezahlung"
     :wire-transfer/copy                              "In die Zwischenablage kopieren"

     :website-editor/settings                         "Einstellungen"
     :website-editor/routes                           "Routen"
     :website-editor/menus                            "Menüs"
     :website-editor/create-menu                      "Menü erstellen"
     :website-editor/edited-menu                      "Bearbeitetes Menü"
     :website-editor/untitled-menu                    "Unbenanntes Menü"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "Unterpunkte" "Unterpunkt" "Unterpunkte"]}]
     :website-editor/delete-menu-item                 "Diesen Menüpunkt löschen"
     :website-editor/add-menu-item                    "Menüpunkt hinzufügen"
     :website-editor/menu-item-label                  "Menüpunkt-Name"
     :menu-item/path-type                             "Öffnet eine Route"
     :menu-item/url-type                              "Öffnet eine externe URL"
     :menu-item/children-type                         "Öffnet ein Untermenü"
     :website-editor/menu-item-path                   "Route"

     :youtube-placement/watch-on-prefix               "Auf"
     :youtube-placement/watch-on-suffix               "ansehen"}))

(dicts/init-lang! :lang/de dict)
