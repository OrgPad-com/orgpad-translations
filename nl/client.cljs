(ns orgpad.client.i18n.dicts.nl
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.nl :as nl]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  (merge
    nl/dict
    {:address/company                                 "Bedrijfsnaam"
     :address/ico                                     "Btw-nummer"
     :address/street                                  "Straat"
     :address/street-number                           "Nummer"
     :address/postal-code                             "Postcode"
     :address/city                                    "Stad"
     :address/country                                 "Land"

     :administration/page-title                       "Administratie - OrgPad"

     :attachments/allows-access-to-file               "Geeft toegang tot dit bestand."
     :attachments/allows-access-to-image              "Geeft toegang tot deze afbeelding."
     :attachments/no-preview                          "Geen voorbeeld beschikbaar."
     :attachments/all-files                           "Alle bestanden"
     :attachments/used-files                          "Bestanden in OrgPage"
     :attachments/unused-files                        "Losse bestanden"
     :attachments/all-images                          "Alle afbeeldingen"
     :attachments/used-images                         "Afbeeldingen in OrgPage"
     :attachments/unused-images                       "Losse afbeeldingen"
     :attachments/uploading-files                     "Bestanden worden geüpload…"
     :attachments/previous-attachment                 "Vorig bestand of afbeelding"
     :attachments/next-attachment                     "Volgend bestand of afbeelding"
     :attachments/display-using-microsoft-365         "Weergeven met Microsoft 365"
     :attachments/edit-filename                       "Naam bewerken"
     :attachments/title-order                         "Alfabetisch op titel"
     :attachments/upload-order                        "Nieuwste bovenaan"
     :attachments/size-order                          "Grootste bovenaan"
     :attachments/split-used-unused                   "Groeperen op gebruik in OrgPage"
     :attachments/search                              "Zoeken"
     :attachments/ordering                            "Sorteren"
     :attachments/new-version                         "Nieuwe versie"
     :attachments/preserve-old-version                "Oude versie behouden"
     :attachments/in-other-orgpages                   "Vervangen in andere OrgPages:"

     :button/back                                     "Terug"
     :button/cancel                                   "Annuleren"
     :button/close                                    "Sluiten"
     :button/comment                                  "Reageren"
     :button/continue                                 "Doorgaan"
     :button/copied                                   "Gekopieerd"
     :button/copy                                     "Kopiëren"
     :button/copy-link                                "Link kopiëren"
     :button/create                                   "Aanmaken"
     :button/create-tooltip                           "Aanmaken (CTRL+ENTER)"
     :button/delete                                   "Verwijderen"
     :button/delete-selected                          "Geselecteerde verwijderen"
     :button/documentation                            "Documentatie"
     :button/download                                 "Downloaden"
     :button/download-all                             "Alles downloaden"
     :button/drop                                     "Loslaten"
     :button/edit                                     "Bewerken"
     :button/import                                   "Importeren"
     :button/insert                                   "Invoegen"
     :button/login                                    "Inloggen"
     :button/logout                                   "Uitloggen"
     :button/publish                                  "Publiceren"
     :button/read                                     "Lezen"
     :button/register                                 "Aanmelden"
     :button/register-to-save                         "Aanmelden om op te slaan"
     :button/remove                                   "Verwijderen"
     :button/reset                                    "Resetten"
     :button/save                                     "Wijzigingen opslaan"
     :button/save-tooltip                             "Wijzigingen opslaan (CTRL+ENTER)"
     :button/upload                                   "Uploaden"
     :button/upload-from-computer                     "Uploaden vanaf je computer"
     :button/send                                     "Verzenden"
     :button/present                                  "Presenteren"
     :button/present-tooltip                          "Presentatie starten (F5)"
     :button/share                                    "Delen"
     :button/start                                    "Starten"
     :button/exit                                     "Afsluiten"
     :button/show-password                            "Weergeven"
     :button/hide-password                            "Verbergen"

     :checkout/currency                               "Valuta"
     :checkout/monthly                                "maandelijks"
     :checkout/yearly                                 "jaarlijks (bespaar 15%)"
     :checkout/failed-to-init                         "Er is iets misgegaan bij het laden van de afrekenwebsite."
     :checkout/upgrade-plan                           "Abonnement upgraden"
     :checkout/professional-plan                      "Professioneel abonnement"
     :checkout/school-plan                            "Schoolabonnement"
     :checkout/enterprise-plan                        "Zakelijk abonnement"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "School"] " of "
                                                         [:a.link-button {:href enterprise-url} "onderneming"] "? Neem contact met ons op voor een aangepaste deal."])
     :checkout/pay-with-credit-card                   "Betalen met kaart"
     :checkout/pay-with-wire-transfer                 "Betalen via overschrijving"
     :checkout/promo-code                             "Promotiecode"
     :checkout/try-for-free                           "Gratis proberen"
     :checkout/activate-now                           "Nu activeren"
     :checkout/continue-for-free                      "Gratis doorgaan"

     :code-lang/none                                  "Geen"
     :code-lang/multiple                              "Meerdere"

     :dashboard/confirm-delete                        [:<> [:b "Permanent"] " deze OrgPage verwijderen?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Inloggen"] " of "
                                                         [:a {:href register-url} "aanmelden"]
                                                         " om nieuwe OrgPages te maken."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "Het abonnement van je school " name " is verlopen op " subscription-expired ". "
                                                         "Neem voor verlenging contact op met je management. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Meer informatie"] " over 95% korting voor scholen."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Krijg OrgPad voor je school zonder limieten met 95% korting. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Meer informatie."]])
     :dashboard/owned-orgpages                        "Mijn OrgPages"
     :dashboard/public-orgpages                       "Gepubliceerde OrgPages"
     :dashboard/shared-orgpages                       "Met mij gedeelde OrgPages"
     :dashboard/usergroup-orgpages                    "OrgPages van {usergroup/name}"
     :dashboard/help-or-inspiration-button            "Hier is het!"
     :dashboard/new-domain                            [:<> "Gebruik nu het nieuwe domein " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Meer informatie in OrgPage " [:a {:href "https://orgpad.info/s/new-domain"} "Wijzigingen in OrgPad en nieuw domein"] "."]

     :dashboard-filter/filter                         "OrgPages filteren"
     :dashboard-filter/ordering                       "OrgPages sorteren"
     :dashboard-filter/filter-and-ordering            "OrgPages filteren en sorteren"
     :dashboard-filter/title                          "Weergegeven OrgPages filteren en sorteren"
     :dashboard-filter/ordering-label                 "Sortering van OrgPages"
     :dashboard-filter/title-order                    "Alfabetisch op titel"
     :dashboard-filter/creation-time-order            "Nieuwste bovenaan"
     :dashboard-filter/last-modified-order            "Laatst gewijzigd bovenaan"
     :dashboard-filter/most-viewed-order              "Meest bekeken bovenaan"
     :dashboard-filter/search-tags                    "Tags zoeken"

     :embedding-code/code                             "Code"
     :embedding-code/description                      "De OrgPage insluiten in een website of een andere applicatie."

     :error/orgpage-access-denied                     "Je hebt geen toegang tot deze OrgPage. Probeer in te loggen."
     :error/usergroup-access-denied                   "Toestemming om het team te bewerken geweigerd."
     :error/administration-access                     "Administratietoegang geweigerd."
     :error/creation-unauthorized                     "Log in om OrgPages te maken."
     :error/deleting-denied                           "Verwijderen van OrgPage geweigerd."
     :error/email-already-used                        "E-mailadres al in gebruik."
     :error/email-not-registered                      "Geen account met dit e-mailadres."
     :error/email-missing-mx-record                   "Geen e-mailserver gevonden op dit domein."
     :error/email-invalid                             "Ongeldig e-mailadres."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Onjuiste OrgPage" (when id " {orgpage/id}")
                                                             ". Link verkeerd gekopieerd?"))
     :error/incorrect-link                            "Onjuiste link. Log in of open de juiste link."
     :error/incorrect-password                        "Onjuist wachtwoord."
     :error/incorrect-profile-id                      "Onjuiste link naar profiel. Link verkeerd gekopieerd?"
     :error/lost-permission                           "Toegang tot deze OrgPage verloren."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "E-mails zonder account: " emails))
     :error/name-already-used                         "Naam al in gebruik"
     :error/name-not-valid                            "Gebruik ten minste 5 tekens"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "De OrgPage " (when title "“{orgpage/title}”") " is verwijderd."))
     :error/owner-of-orgpage                          "De persoon is al de eigenaar van deze OrgPage."
     :error/profile-not-found                         "Profiel niet gevonden."
     :error/unknown-error                             "Onbekende fout, probeer het opnieuw."
     :error/unknown-id                                "Onbekende OrgPage."
     :error/unknown-login-or-email                    "Onbekend e-mailadres of teamlogin."
     :error/unknown-usergroup                         "Het team is verwijderd."
     :error/upload-failed                             "Kan de OrgPage niet uploaden: “{orgpage/title}”"

     :export/show                                     "OrgPage exporteren"
     :export/title                                    "{orgpage/title} exporteren"
     :export/info                                     "Kies het formaat waarin deze OrgPage wordt geëxporteerd."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       "-formaat gebruikt door OrgPad"]
     :export/html                                     "Een lineair HTML-bestand"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] "-formaat"]
     :export/generate                                 "Export genereren"

     :feedback/ask-question                           "Stel een vraag"
     :feedback/hide-button                            "Knop permanent verbergen"
     :feedback/dialog-title                           "Neem contact op met de makers van OrgPad"
     :feedback/description                            [:<> "Als je hulp nodig hebt of een probleem hebt, laat het ons — "
                                                       [:b "de makers van OrgPad"] " — weten. "
                                                       "We staan ook open voor ideeën ter verbetering. "
                                                       "We antwoorden zo snel mogelijk per e-mail."]
     :feedback/languages                              "Je kunt ons schrijven in het Engels, Tsjechisch en Duits."
     :feedback/contact-when-problem-persists          [:<> "Als het probleem aanhoudt, neem dan contact met ons op via "
                                                       company/support-email-app-link "."]

     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Overschrijving"
                                                             (when currency (str " in " (name currency)))
                                                             " voor een jaarlijks "
                                                             (if (= tier "standard") "Standard" "Professional")
                                                             "-abonnement"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Schrijf ons je " [:b "factuuradres"] ", eventuele verdere informatie voor de factuur."
                                                         " We nemen spoedig contact met je op via je e-mailadres " [:b email] "."])

     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Ik wil een abonnement kopen voor mijn "
                                                             (case org-type
                                                               :feedback/school-plan "school"
                                                               :feedback/enterprise-plan "bedrijf"
                                                               "organisatie")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Gebruik dit formulier om contact op te nemen met een vertegenwoordiger van OrgPad s.r.o."
                                                         " We nemen spoedig contact met je op via het opgegeven telefoonnummer of e-mailadres (" email
                                                         "). Je kunt ons ook bellen op "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])

     :feedback/upgrade-subscription-title             "Mijn abonnement upgraden naar het Professional-abonnement"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Schrijf ons hoe we je bestaande abonnement moeten wijzigen en eventuele verdere informatie."
                                                         " We nemen spoedig contact met je op via je e-mailadres " [:b email] "."])

     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Mijn factureringsperiode wijzigen naar "
                                                             (if (= period "yearly") "jaarlijkse" "maandelijkse")
                                                             " facturering"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "De wijziging vindt plaats na afloop van de huidige factureringsperiode."
                                                         " Er is een korting van 15% bij jaarlijkse facturering."
                                                         " We nemen spoedig contact met je op via je e-mailadres " [:b email] "."])

     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (case org-type
                                                          :feedback/school-plan "Naam van de school"
                                                          :feedback/enterprise-plan "Naam van het bedrijf"
                                                          "Naam van de organisatie"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (case org-type
                                                          :feedback/school-plan "Functie binnen de school"
                                                          :feedback/enterprise-plan "Functie binnen het bedrijf"
                                                          "Functie binnen de organisatie"))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (case org-type
                                                          :feedback/school-plan "Website van de school"
                                                          :feedback/enterprise-plan "Website van het bedrijf"
                                                          "Website van de organisatie"))

     :fragment/fragment                               "Locatie"
     :fragment/text-id                                "ID"
     :fragment/title                                  "Titel"
     :fragment/create                                 "Locatie aanmaken"
     :fragment/create-tooltip                         "TAB; houd SHIFT ingedrukt om de geselecteerde locatie te kopiëren"
     :fragment/remove                                 "Locatie verwijderen"
     :fragment/share                                  "Link naar deze locatie kopiëren"
     :fragment/text-id-required                       "ID is vereist."
     :fragment/text-id-already-used                   "ID is al in gebruik."
     :fragment/closed-books                           "Gesloten cellen; CTRL+klik om te selecteren"
     :fragment/hidden-books                           "Verborgen cellen; CTRL+klik om te selecteren"
     :fragment/opened-pages                           "Geopende pagina’s; CTRL+klik om te selecteren"
     :fragment/focused-books                          "Cellen die in de camera worden weergegeven; CTRL+klik om te selecteren"
     :fragment/shown-books                            "Zichtbare cellen; CTRL+klik om te selecteren"

     :info/uploading-attachments                      [:i18n/plural "{info/count} {info/num-files} uploaden…"
                                                       {:info/num-files [:info/count "bestanden" "bestand" "bestanden"]}]
     :info/uploading-images                           [:i18n/plural "{info/count} {info/num-images} uploaden…"
                                                       {:info/num-images [:info/count "afbeeldingen" "afbeelding" "afbeeldingen"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Uploaden van {info/count} {info/num-images} mislukt."
                                                           {:info/num-images [:info/count "afbeeldingen" "afbeelding" "afbeeldingen"]}]
                                                          "Uploaden van ten minste één afbeelding mislukt."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} YouTube-{info/num-youtubes} niet gevonden."
                                                       {:info/num-youtubes [:info/count "video’s" "video" "video’s"]}]
     :info/uploading-attachments-failed               "Uploaden van bestanden mislukt."
     :info/presentation-link-copied                   "De link naar deze presentatie is gekopieerd."
     :info/max-orgpages-exceeded                      "De eigenaar van deze OrgPage kan geen extra OrgPage aanmaken."
     :info/storage-exceeded                           "De eigenaar van deze OrgPage heeft niet genoeg ruimte ({upload/total-size}) om deze bestanden te uploaden."
     :info/attachments-too-large                      (str "Kan {upload/total-size} niet in één keer uploaden."
                                                           " De maximale totale grootte van alle geüploade bijlagen is 500 MB.")
     :info/drop-info                                  "Sleep naar een cel of naar het grijze canvas om een nieuwe cel aan te maken."
     :info/audio-not-allowed                          "Het afspelen van audio is geblokkeerd. Klik op de afspeelknop."
     :info/audio-not-supported                        "Audioformaat wordt niet ondersteund."

     :import/another-format                           [:<> "Als je je bestaande gegevens in een ander formaat wilt importeren, neem dan contact met ons op via "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Je gegevens importeren"
     :import/google-docs                              "Om gegevens uit Microsoft Office of Google Docs toe te voegen, plak ze gewoon in een OrgPage."
     :import/supported-formats                        "We ondersteunen momenteel de volgende formaten:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " geëxporteerd als een .vsdx-bestand."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] "-bestand."]

     :ios/install-info                                "Installeer de OrgPad-app"
     :ios/share-button                                "1. Open"
     :ios/add-to-home-screen                          "2. Tik op ‘Zet op beginscherm’"

     :lang/cs                                         "Tsjechisch"
     :lang/de                                         "Duits"
     :lang/en                                         "Engels"
     :lang/es                                         "Spaans"
     :lang/fr                                         "Frans"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Pools"
     :lang/ru                                         "Russisch"
     :lang/uk                                         "Oekraïens"

     :lang-select/tooltip                             "Taal van de app (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "Ontbreekt jouw taal? Help ons door "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "OrgPad te vertalen"] "."]

     :limit/of                                        " van "
     :limit/orgpages                                  " OrgPages"
     :limit/people                                    " personen"
     :limit/teams                                     " teams"
     :limit/team-members                              " leden"
     :limit/orgpages-tooltip                          (str "In het gratis abonnement is het aantal OrgPages beperkt."
                                                           " Upgrade je abonnement om meer OrgPages aan te maken.")
     :limit/shares-tooltip                            (str "Het aantal personen waarmee je deze OrgPage direct kunt delen is beperkt."
                                                           " Upgrade naar het Professional-abonnement om met onbeperkt veel personen te delen.")
     :limit/teams-tooltip                             (str "In het Standard-abonnement is het aantal eigen teams beperkt."
                                                           " Upgrade naar het Professional-abonnement om onbeperkt teams aan te maken.")
     :limit/teams-members-tooltip                     (str "In het Standard-abonnement heeft elk team een beperkt aantal leden."
                                                           " Upgrade naar het Professional-abonnement om onbeperkt teams aan te maken.")
     :limit/attachments-size                          (str "De totale grootte van alle geüploade bestanden en afbeeldingen is beperkt,"
                                                           " maar kan worden verhoogd door je abonnement te upgraden.")
     :limit/attachments-size-clickable                (str "De totale grootte van alle geüploade bestanden en afbeeldingen is beperkt."
                                                           " Klik om je limiet te verhogen door je abonnement te upgraden.")
     :limit/attachments-size-try-out                  (str "De totale grootte van alle geüploade bestanden en afbeeldingen is beperkt."
                                                           " Klik om een account aan te maken en je limiet te verhogen tot 100 MB.")

     :limits/max-orgpages                             "documenten"
     :limits/max-storage                              "opslag"
     :limits/max-teams                                "teams"
     :limits/of                                       " van"
     :limits/max-team-members                         "leden"
     :limits/priority-support                         "prioritaire ondersteuning"

     :link-panel/flip                                 "Draai de richting om"
     :link-panel/insert-unit-in-middle                "Voeg een cel in het midden in"
     :link-panel/delete                               "Verwijder de link"
     :link-panel/change-link-style                    "Wijzig de stijl van deze link; houd SHIFT ingedrukt om de huidige in te stellen, of CTRL om deze als standaard te kopiëren"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Afmetingen van alle cellen berekenen, "
                                                         [:span#autoresize-num-units num-units] " resterend…"])
     :loading/initial-layout                          "Initiële lay-out verbeteren…"
     :loading/restoring-opened-pages                  "Positie van geopende pagina’s herstellen…"
     :loading/getting-orgpage                         "OrgPage downloaden van de server…"
     :loading/getting-dashboard                       "Lijst met beschikbare OrgPages downloaden…"
     :loading/getting-website                         "Website downloaden van de server…"
     :loading/getting-blog                            "Blog downloaden van de server…"
     :loading/uploading-orgpage                       "OrgPage uploaden naar de server…"
     :loading/ws-init                                 "Verbinding met de server tot stand brengen…"
     :loading/ws-closed                               "Verbinding met de server verbroken, opnieuw verbinden… Als het probleem aanhoudt, laad de pagina opnieuw."
     :loading/administration                          "Administratiegegevens laden…"
     :loading/profile                                 "Profiel laden…"
     :loading/style                                   "Stijlen laden…"
     :loading/start-trial                             "7-daags proefabonnement starten…"
     :loading/uploading-attachments                   "Bijlagen uploaden naar de server…"

     :login/continue-with-email                       "Doorgaan met e-mail"
     :login/continue-with-facebook                    "Doorgaan met Facebook"
     :login/continue-with-google                      "Doorgaan met Google"
     :login/continue-with-microsoft                   "Doorgaan met Microsoft"
     :login/continue-with-cuni                        "Doorgaan met de Karelsuniversiteit"
     :login/email-sent                                "E-mail verzonden. Klik op de link in de e-mail om verder te gaan."
     :login/forgotten-password                        "Wachtwoord vergeten"
     :login/forgotten-password-email-resent           "E-mail voor het opnieuw instellen van je wachtwoord is al verzonden."
     :login/forgotten-password-description            "Ontvang een link om je wachtwoord opnieuw in te stellen (24 uur geldig)."
     :login/forgotten-password-error                  [:<> "Dit e-mailadres is door jou geblokkeerd. Deblokkeer het door te klikken op ‘Afmelden’ in een e-mail van OrgPad, of stuur ons een bericht via "
                                                       company/support-email-app-link " vanaf dit e-mailadres."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Nieuw bij OrgPad? " [:a.link-button {:href route} "Meld je aan"]])
     :login/options                                   "Kies een andere manier om in te loggen"
     :login/send-reset-link                           "Resetlink verzenden"
     :login/wrong-email-or-password                   "E-mailadres of wachtwoord is onjuist."

     :markdown/title                                  "Is de geplakte tekst opgemaakt met Markdown?"
     :markdown/info                                   "Er is Markdown-opmaak gedetecteerd in je geplakte inhoud. Wil je die opmaak toepassen?"
     :markdown/remember                               "Onthouden tot herladen"
     :markdown/insert                                 "Markdown-opmaak toepassen"
     :markdown/ignore                                 "Originele opmaak behouden"

     :meta/title                                      "Naam van de OrgPage"
     :meta/orgpage-thumbnail                          "Afbeelding van de OrgPage"
     :meta/automatic-screenshot-start                 "Automatisch gegenereerde schermafbeelding voor "
     :meta/automatic-screenshot-refresh               "Wordt vijf minuten na elke wijziging bijgewerkt."
     :meta/custom-thumbnail                           "Aangepaste geüploade afbeelding (1360×768)."
     :meta/upload-thumbnail                           "Aangepaste afbeelding uploaden"
     :meta/thumbnail-upload-failed                    "Uploaden van afbeelding mislukt."
     :meta/description                                "Beschrijving"
     :meta/new-tags                                   "Tag"
     :meta/tag-too-long                               (str "De maximale lengte van een tag is " common-orgpage/max-tag-length " tekens.")
     :meta/too-many-tags                              (str "Er zijn maximaal " common-orgpage/max-tags " tags toegestaan.")
     :meta/info                                       (str "Deze gegevens worden weergegeven in de OrgPage-lijst, "
                                                           "bij het insluiten van een OrgPage en bij het delen op sociale media.")
     :meta/info-in-share-orgpage                      "Voordat je deze OrgPage kunt delen, moet er een titel worden ingesteld."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Verplaats de geselecteerde {selection/num-units} {selection/units-label} "
                                                                         "en {selection/num-links} {selection/links-label} naar een nieuwe OrgPage "
                                                                         "met de volgende informatie. In de huidige OrgPage worden deze cellen en links "
                                                                         "vervangen door één cel die de nieuwe OrgPage bevat.")
                                                       {:selection/units-label [:selection/num-units "cellen" "cel" "cellen"]
                                                        :selection/links-label [:selection/num-links "links" "link" "links"]}]
     :meta/info-title                                 "Informatie – {meta/title}"
     :meta/info-title-only                            "Geef de OrgPage een naam"
     :meta/details                                    "Details"
     :meta/preview                                    "Voorbeeld"
     :meta/init-fragments                             "Startlocatie"
     :meta/init-fragments-info                        (str "Je kunt een startlocatie kiezen wanneer de OrgPage wordt geopend. "
                                                           "Voor mobiele apparaten kan een andere startlocatie worden ingesteld.")
     :meta/desktop-init-fragment                      "Locatie voor desktop"
     :meta/mobile-init-fragment                       "Locatie voor mobiel"
     :meta/everything-closed                          "Alle cellen gesloten"
     :meta/everything-closed-lowercase                "alle cellen gesloten"
     :meta/more-details                               "Meer informatie"
     :meta/move-to-new-orgpage-title                  "Verplaatsen naar {meta/title}"
     :meta/move-to-new-orgpage                        "Verplaatsen naar een nieuwe OrgPage"

     :microsoft-365-permission/title                  "Microsoft 365 toegang geven tot dit document?"
     :microsoft-365-permission/info                   [:<> "Het Office-document kan worden weergegeven met Microsoft 365."
                                                       " Door op ‘Akkoord’ te klikken, wordt je document gedeeld met Microsoft."
                                                       " Bekijk de " [:a.link-button {:href   "https://www.microsoft.com/nl-nl/servicesagreement/"
                                                                                      :target "_blank"}
                                                                      "Microsoft Servicesovereenkomst"] "."]
     :microsoft-365-permission/allow                  "Toegang verlenen aan Microsoft 365"

     :notifications/info                              "Kies welke e-mails OrgPad naar je stuurt. We informeren je altijd over belangrijke wijzigingen."
     :notifications/any-email                         "Alle e-mails van OrgPad"
     :notifications/email-verification                "E-mailverificatie bij registratie, wachtwoordherstel en essentiële betalingsinformatie"
     :notifications/monthly-newsletter                "Maandelijkse nieuwsbrief met updates en nieuwe ontwikkelingen in OrgPad"
     :notifications/messages                          "Berichten van andere mensen ontvangen"
     :notifications/blocked-people                    "Specifiek geblokkeerde personen:"
     :notifications/receipts                          "Ontvangstbewijzen bij automatische verlenging van je abonnement"
     :notifications/receive-invitations               "Uitnodigingen van andere mensen ontvangen"
     :notifications/unblock-user                      "Deze persoon deblokkeren"

     :onboarding/openable-units                       "Alleen verhoogde cellen met schaduw kunnen worden geopend."
     :onboarding/zoom                                 "Scroll om te zoomen"
     :onboarding/drag-canvas                          "Versleep om te verplaatsen"
     :onboarding/open-units                           "Cellen met schaduw bevatten inhoud"

     :orgpage/creating-preview                        "Voorbeeld wordt gemaakt…"
     :orgpage/change-information                      "Informatie wijzigen"
     :orgpage/copy-orgpage                            "Kopiëren naar een nieuwe OrgPage"
     :orgpage/delete-orgpage                          "OrgPage verwijderen"
     :orgpage/detail                                  "Detail"
     :orgpage/share-tooltip                           "Deze OrgPage met anderen delen"
     :orgpage/share-orgpage                           "OrgPage delen"
     :orgpage/show-information                        "Informatie weergeven"
     :orgpage/zoom-in                                 "Inzoomen"
     :orgpage/zoom-out                                "Uitzoomen"
     :orgpage/create-unit-double-click                "Dubbelklik om een cel te maken."
     :orgpage/create-unit-hold-or-double-tap          "Houd ingedrukt of dubbeltik om een cel te maken."
     :orgpage/switch-to-edit                          "Overschakelen naar bewerken"
     :orgpage/untitled                                "Naamloze OrgPage"
     :orgpage/title                                   "Titel van de OrgPage"
     :orgpage/untitled-unit                           "Naamloze cel"
     :orgpage/untitled-path                           "Naamloze presentatie"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "stappen" "stap" "stappen"]}]
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (pagina {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (pagina {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Een kopie is beschikbaar als "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Kleur van deze OrgPage wijzigen"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Deze OrgPage wordt automatisch gedeeld met " label " voor "
                                                         (case permission
                                                           :permission/view "lezen"
                                                           :permission/comment "reageren"
                                                           :permission/edit "bewerken"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Klik hier"]
                                                         " om het delen te stoppen."])

     :orgpage-placement/activate                      "Hier bekijken"

     :orgpage-print/displayed                         "Precies zoals weergegeven"
     :orgpage-print/displayed-info                    "Alles binnen het kader wordt precies zo afgedrukt als je het ziet."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPage is succesvol afgedrukt als "
                                                         [:a.link-button {:href link :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "Het afdrukken van deze PDF duurt ongeveer {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Alle cellen gesloten"
     :orgpage-print/everything-closed-info            "De afgedrukte PDF toont alle cellen in gesloten toestand."
     :orgpage-print/fragment                          "Een locatie"
     :orgpage-print/fragment-info                     "De afgedrukte PDF toont de geselecteerde locatie."
     :orgpage-print/gray                              "Grijze achtergrond"
     :orgpage-print/landscape                         "Liggend"
     :orgpage-print/orientation                       "Oriëntatie"
     :orgpage-print/path-info                         [:i18n/plural " met {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "pagina's" "pagina" "pagina's"]}]
     :orgpage-print/portrait                          "Staand"
     :orgpage-print/presentation                      "Stappen van een presentatie"
     :orgpage-print/presentation-info                 "Elke stap wordt op een aparte pagina afgedrukt."
     :orgpage-print/print                             "Afdrukken naar PDF"
     :orgpage-print/size                              "Formaat"
     :orgpage-print/started                           (str "OrgPage wordt afgedrukt naar PDF. Dit duurt ongeveer {orgpage-print/estimated-time}."
                                                           " Zodra het klaar is, is het beschikbaar als bestand.")
     :orgpage-print/title                             "Afdruknaam"
     :orgpage-print/type                              "Wat wordt afgedrukt"
     :orgpage-print/watermark                         "Watermerk opnemen"
     :orgpage-print/watermark-info                    "Upgrade naar professioneel, school- of bedrijfsabonnement om te verwijderen."
     :orgpage-print/white                             "Witte achtergrond"

     :orgpage-stats/number-of-units                   "Aantal cellen"
     :orgpage-stats/number-of-links                   "Aantal koppelingen"
     :orgpage-stats/number-of-files                   "Aantal bestanden"
     :orgpage-stats/number-of-images                  "Aantal afbeeldingen"

     :org-role/student                                "Student"
     :org-role/teacher                                "Docent"
     :org-role/employee                               "Werknemer"
     :org-role/admin                                  "Beheerder"

     :panel/toggle-side-panel                         "Zijbalk"
     :panel/create-orgpage                            "Nieuwe OrgPage"
     :panel/logo-tooltip                              "Ga naar startpagina"
     :panel/edit-info                                 "Schakel over naar bewerken om cellen en koppelingen te maken of te verwijderen, inhoud te wijzigen en meer (F7)"
     :panel/comment-info                              (str "Schakel over naar reageren, waar je je eigen cellen en koppelingen kunt maken, bewerken en verwijderen, "
                                                           "maar niet die van anderen. Je kunt echter wel koppelingen maken naar cellen die niet van jou zijn. (F7)")
     :panel/read-info                                 "Schakel over naar lezen, waar niets kan worden gewijzigd maar bladeren eenvoudiger is (F6)"
     :panel/undo-deletion                             "Verwijderen ongedaan maken"
     :panel/undo-deletion-info                        [:i18n/plural "Maak het verwijderen van {delete/num-units} {delete/unit-label} en {delete/num-links} {delete/link-label} ongedaan (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units "cellen" "cel" "cellen"]
                                                                :link-label [:delete/num-links "koppelingen" "koppeling" "koppelingen"]}]
     :panel/refresh                                   "Vernieuwen"
     :panel/switch-style                              "Wijzig de stijl van nieuwe cellen en koppelingen; sleep om een nieuwe cel te maken"
     :panel/profile                                   "Profiel"
     :panel/settings                                  "Instellingen"
     :panel/usergroups                                "Teams"
     :panel/stats                                     "Statistieken"
     :panel/administration                            "Beheer"
     :panel/ios-install-info                          "App installeren"
     :panel/upload-attachment                         "Afbeeldingen of bestanden in nieuwe cellen invoegen"
     :panel/selection-mode                            "Selectie starten"
     :panel/search                                    "Zoeken (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "{panel/num-hidden-book-ids} {panel/unit-label} weergeven die verborgen zijn op de huidige locatie"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids "cellen" "cel" "cellen"]}]

     :password/too-short                              "Minimaal 8 tekens vereist"
     :password/different-passwords                    "Wachtwoorden komen niet overeen"

     :password-reset/back-to-list                     "Terug naar lijst"
     :password-reset/change-password                  "Wachtwoord wijzigen"
     :password-reset/set-password                     "Wachtwoord instellen"
     :password-reset/has-password                     "Je account heeft een wachtwoord ingesteld."
     :password-reset/without-password                 "Er is nog geen wachtwoord ingesteld, omdat je met gekoppelde accounts bent ingelogd."
     :password-reset/invalid-link                     "Ongeldige link — mogelijk ouder dan 24 uur. Vraag om de e-mail opnieuw te verzenden."
     :password-reset/description                      "Stel je nieuwe wachtwoord in."
     :password-reset/enter-current-and-new-password   "Voer je huidige en nieuwe wachtwoord in."
     :password-reset/enter-new-password               "Voer je nieuwe wachtwoord in."

     :path/add-step                                   "Stap"
     :path/add-step-tooltip                           "ENTER of TAB; houd SHIFT ingedrukt om de camera te kopiëren"
     :path/hidden-ops                                 " en nog {path/num-hidden} extra"
     :path/title                                      "Naam van de presentatie"
     :path/default-title                              "Presentatie {path/num-paths}"
     :path/copy                                       "Kopiëren naar nieuwe presentatie"
     :path/copy-suffix                                "kopie"
     :path/add-audio                                  "Audio aan stap koppelen"
     :path/remove-audio                               "Audio van stap ontkoppelen"

     :paths/create-new-path                           "Presentatie aanmaken"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Presentatie " [:b title] " verwijderen?"])
     :paths/help                                      "Selecteer cellen om te bepalen wat wordt weergegeven; zie de handleiding voor meer informatie."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Je gebruikt momenteel het " [:b tier "-abonnement"] ", geldig tot " [:b end-date] "."
                                                         (if autorenewal
                                                           " Het abonnement wordt automatisch verlengd aan het einde van de betalingsperiode."
                                                           " Het abonnement verloopt aan het einde van de betalingsperiode.")])

     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Je " [:b tier "-abonnement"] " is verlopen op " [:b end-date] " omdat de verlengingsbetaling is mislukt."
                                                         " Zodra je de betaling herstelt, wordt je abonnement automatisch verlengd."])

     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " bij het " [:b tier "-abonnement"] " van " name "."])

     :payments/free-tier-info                         [:<> "OrgPad wordt gebruikt in het " [:b "Gratis abonnement"] ", zonder betalingen."]
     :payments/no-teams                               "Geen teams beschikbaar in het gratis abonnement."

     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Voor "
                                                         (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "upgrades"] " of "])
                                                         [:a.link-button {:href period-url} "het wijzigen van je factureringsperiode"]
                                                         ", neem contact met ons op."])

     :payments/choose-plan                            "Abonnement kiezen"
     :payments/manage-plan                            "Abonnement beheren"
     :payments/billing-address                        "Factuuradres"
     :payments/billing-address-info                   (str "Het opgegeven factuuradres wordt gebruikt voor alle nieuwe facturen."
                                                           " Recente facturen worden automatisch bijgewerkt.")
     :payments/receipt-label                          "Ontvangstbewijs {receipt/date-range}"
     :payments/customer-portal-failed                 "Er is iets misgegaan bij het laden van de pagina voor abonnementsbeheer."

     :pending-activation/email-already-used           "E-mailadres wordt al gebruikt voor een ander account."
     :pending-activation/email-not-recieved           "Geen e-mail ontvangen? Stuur opnieuw of wijzig hieronder."
     :pending-activation/email-sent                   "Activeringsmail verzonden."
     :pending-activation/instructions                 "Bijna klaar! Activeer je account door te klikken op de link die we je per e-mail hebben gestuurd."
     :pending-activation/resend                       "Activeringsmail opnieuw verzenden"

     :permission/admin                                "Kan delen en verwijderen"
     :permission/admin-tooltip                        "Kan ook beheren wie er toegang heeft tot het document."
     :permission/edit                                 "Kan bewerken"
     :permission/edit-tooltip                         "Kan alle wijzigingen in de OrgPage aanbrengen."
     :permission/comment                              "Kan reageren"
     :permission/comment-tooltip                      (str "Kan eigen cellen maken, verbinden en bewerken. "
                                                           "Kan de rest van de OrgPage niet wijzigen.")
     :permission/view                                 "Kan lezen"
     :permission/view-tooltip                         "Kan de OrgPage bekijken zonder wijzigingen aan te brengen."

     :presentation/presentation                       "Presentatie"
     :presentation/step                               "Stap"
     :presentation/present                            "Presentatie starten"
     :presentation/slideshow                          "Stappen automatisch afspelen"
     :presentation/step-duration                      "Duur van de stap (in seconden)"
     :presentation/loop-slideshow                     "Herhalen aan het einde"
     :presentation/respect-audio-track                "Stapduur afstemmen op audiotrack"
     :presentation/stop-slideshow                     "Automatisch afspelen stoppen"
     :presentation/exit-tooltip                       "Presentatie afsluiten"
     :presentation/play-audio                         "Audio voor deze stap afspelen"
     :presentation/pause-audio                        "Audio afspelen pauzeren"
     :presentation/share-presentation                 "Deze presentatie delen met anderen"

     :pricing-popup/orgpages-exceeded-title           "Je kunt geen extra OrgPages maken in het gratis abonnement"
     :pricing-popup/orgpages-exceeded                 "Upgrade je abonnement om verder te gaan."
     :pricing-popup/storage-exceeded-title            "Onvoldoende ruimte om {upload/total-size} te uploaden"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Er is nog maar " [:b space-left] " opslagruimte over."
                                                         " Upgrade je abonnement om meer ruimte te krijgen."])

     :pricing-popup/num-shared-limit-reached-title    "Je kunt deze OrgPage niet met meer mensen delen"
     :pricing-popup/num-shared-limit-reached-common   "Het maximale aantal mensen dat deze OrgPage deelt is bereikt."
     :pricing-popup/num-shared-limit-reached          [:<> " Om meer mensen toe te voegen, upgrade naar het "
                                                       [:b "Professionele abonnement"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " De eigenaar van deze OrgPage " owner " moet upgraden naar het "
                                                         [:b "Professionele abonnement"] " om meer mensen toe te voegen."])

     :pricing-popup/enable-teams-title                "Upgrade je abonnement om teams te beheren"
     :pricing-popup/enable-teams                      [:<> "Teams groeperen mensen om samenwerking en het delen van OrgPages eenvoudiger te maken."
                                                       " Deze functie is alleen beschikbaar in het " [:b "Standaardabonnement"] " of hoger."]

     :pricing-popup/teams-limit-reached-title         "Upgrade je abonnement om meer teams te maken"
     :pricing-popup/teams-limit-reached               "De limiet voor het aantal teams in je abonnement is bereikt."

     :pricing-popup/team-members-limit-reached-title  "Je kunt geen extra leden toevoegen aan {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Het maximale aantal teamleden is bereikt."
     :pricing-popup/team-members-limit-reached        [:<> " Om meer leden toe te voegen, upgrade naar het "
                                                       [:b "Professionele abonnement"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " De eigenaar van dit team " owner " moet upgraden naar het "
                                                         [:b "Professionele abonnement"] " om meer leden toe te voegen."])

     :pricing-popup/try-out-share-title               "Meld je aan om deze OrgPage te delen"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Er is nog maar " [:b space-left] " opslagruimte over."])

     :pricing-popup/free-account-info                 "Door je aan te melden, krijg je gratis:"
     :pricing-popup/free-limit                        "tot drie OrgPages,"
     :pricing-popup/free-storage                      "tot 100 MB opslagruimte,"
     :pricing-popup/free-share                        "de mogelijkheid om je werk te delen met anderen."
     :pricing-popup/free-account-info2                "Maak je account aan in slechts een paar klikken."

     :pricing-popup/register-to-comment               "Meld je aan om opmerkingen toe te voegen"
     :pricing-popup/register-to-comment-info          (str "Opmerkingscellen tonen je naam en profielfoto."
                                                           " Maak eerst een account aan om te kunnen reageren.")

     :pricing-popup/print-watermark-title             "Upgrade je abonnement om watermerken te verwijderen"
     :pricing-popup/print-watermark-info              (str "Afdrukken zonder OrgPad-info-watermerken is alleen mogelijk"
                                                           " in professionele, school- en bedrijfsabonnementen.")

     :profile/open-contact-dialog                     "Bericht sturen"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Contact opnemen met " first-name " " last-name)
                                                          "Contact opnemen met deze persoon"))
     :profile/contact-dialog-info                     (str "Omdat we de e-mailadressen van andere gebruikers in OrgPad niet delen, sturen we dit bericht namens jou. "
                                                           "We voegen je naam en e-mailadres toe zodat direct contact mogelijk is.")

     :promotion/unknown                               "Onbekende code"
     :promotion/max-usages-reached                    "Te vaak gebruikt"
     :promotion/expired                               "Verlopen"
     :promotion/one-year-free                         "1 jaar gratis"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} gratis"
                                                       {:promotion/days [:promotion/duration "dagen" "dag" "dagen"]}]
     :promotion/for-one-year                          "voor 1 jaar"
     :promotion/for-six-months                        "voor 6 maanden"

     :props/h1                                        "Grote titel"
     :props/h2                                        "Middelgrote titel"
     :props/h3                                        "Kleine titel"
     :props/weight-none                               "Normale link"
     :props/strong                                    "Vetgedrukte link"
     :props/arrowhead-none                            "Geen pijl"
     :props/single                                    "Pijl"
     :props/double                                    "Dubbele pijl"

     :public-permission/none                          "privé."
     :public-permission/view                          "gedeeld met iedereen om te bekijken."

     :registration/create-user                        "Account aanmaken"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Heb je al een account? " [:a.link-button {:href route} "Inloggen"]])
     :registration/options                            "Kies een andere manier om je aan te melden"
     :registration/server-error                       "Serverfout. Probeer het account opnieuw aan te maken."
     :registration/missing-oauth-email                "{registration/service} heeft je e-mailadres niet doorgegeven. Vul het hieronder in."

     :search/previous-match                           "Vorige overeenkomst (PAGE UP); eerste overeenkomst (HOME)"
     :search/next-match                               "Volgende overeenkomst (PAGE DOWN, ENTER); laatste overeenkomst (END)"
     :search/close                                    "Sluiten (ESC)"
     :search/cells-with-selected-attachments          "Cellen met de geselecteerde bestanden en afbeeldingen."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Stijl wijzigen van geselecteerde "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} en "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; houd SHIFT ingedrukt om de huidige in te stellen, CTRL om als standaard te kopiëren"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "cellen" "cel" "cellen"]
                                                                   :link-label [:selection/num-links
                                                                                "koppelingen" "koppeling" "koppelingen"]}]

     :selection/link                                  "Cellen verbinden"
     :selection/hide-contents                         "Inhoud verbergen (ESC)"
     :selection/show-contents                         "Inhoud weergeven"
     :selection/force-closing                         "Deze inhoud verbergen bij het openen van de locatie (ESC)"
     :selection/step-focus-camera                     "Richt de camera van deze stap precies op de geselecteerde cellen (F2 of Q); houd SHIFT ingedrukt om toe te voegen, ALT om te verwijderen."
     :selection/fragment-focus-camera                 "Richt de camera van de locatie precies op de geselecteerde cellen (F2 of Q); houd SHIFT ingedrukt om toe te voegen, ALT om te verwijderen."
     :selection/step-show-books                       "Toon precies de geselecteerde cellen in deze stap (F3 of W); houd SHIFT ingedrukt om toe te voegen, ALT om te verwijderen."
     :selection/fragment-show-books                   "Toon precies de geselecteerde cellen op de locatie (F3 of W); houd SHIFT ingedrukt om toe te voegen, ALT om te verwijderen."
     :selection/force-showing                         "De geselecteerde cellen weergeven als ze eerder verborgen waren"
     :selection/share-units                           "Kopieer een link die de geselecteerde eenheden weergeeft; houd SHIFT ingedrukt om in plaats daarvan de locatie-instellingen te openen"
     :selection/move-to-new-orgpage                   "Verplaatsen naar een nieuwe OrgPage"
     :selection/change-code-lang                      "Codetaal wijzigen"
     :selection/copy-units-links                      "Cellen en koppelingen naar het klembord kopiëren"
     :selection/flip-links                            "Richting van koppelingen omdraaien"
     :selection/delete                                "Geselecteerde verwijderen"

     :settings/profile                                "Profiel"
     :settings/payments                               "Betalingen"
     :settings/account                                "Account"
     :settings/linked-accounts                        "Gekoppelde accounts"
     :settings/email                                  "Meldingen"
     :settings/account-description                    "Wijzig je e-mailadres of wachtwoord, of verwijder je account."
     :settings/stats-description                      "Hier vind je statistieken over je OrgPad-gebruik."
     :settings/change-email                           "E-mailadres wijzigen"
     :settings/change-email-text                      "Voer een nieuw e-mailadres in. Om veiligheidsredenen moeten we dit verifiëren voordat we je account ontgrendelen."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Je hebt je aangemeld met het e-mailadres " [:b email] "."])
     :settings/account-linked-to-facebook             [:<> "Je account is " [:b "gekoppeld"] " aan Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Je account is " [:b "niet gekoppeld"] " aan Facebook."]
     :settings/link-fb                                "Facebook koppelen"
     :settings/unlink-fb                              "Facebook ontkoppelen"
     :settings/account-linked-to-google               [:<> "Je account is " [:b "gekoppeld"] " aan Google."]
     :settings/account-not-linked-to-google           [:<> "Je account is " [:b "niet gekoppeld"] " aan Google."]
     :settings/link-google                            "Google koppelen"
     :settings/unlink-google                          "Google ontkoppelen"
     :settings/account-linked-to-microsoft            [:<> "Je account is " [:b "gekoppeld"] " aan Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> "Je account is " [:b "niet gekoppeld"] " aan Microsoft."]
     :settings/link-microsoft                         "Microsoft koppelen"
     :settings/unlink-microsoft                       "Microsoft ontkoppelen"
     :settings/account-linked-to-cuni                 [:<> "Je account is " [:b "gekoppeld"] " aan de Karelsuniversiteit Praag."]
     :settings/account-not-linked-to-cuni             [:<> "Je account is " [:b "niet gekoppeld"] " aan de Karelsuniversiteit Praag."]
     :settings/link-cuni                              "Karelsuniversiteit Praag koppelen"
     :settings/unlink-cuni                            "Karelsuniversiteit Praag ontkoppelen"
     :settings/set-password-text                      "Stel een wachtwoord in voordat je de koppeling verbreekt."
     :settings/linked-accounts-info                   "Koppel je Facebook-, Google-, Microsoft- of Karelsuniversiteit Praag-account aan OrgPad om daarmee te kunnen inloggen."
     :settings/profile-info                           "Met deze informatie ben je makkelijker te vinden voor collega’s binnen een project."
     :settings/delete-account                         "Account verwijderen"
     :settings/confirm-delete-account-question        [:<> [:b "Permanent"] " je account verwijderen?"]
     :settings/confirm-delete-account-info            "Hiermee worden al je OrgPages en bijbehorende gegevens verwijderd."
     :settings/delete-account-info                    [:<> "Verwijderen zal " [:b "permanent"] " al je OrgPages en hun gegevens verwijderen."]

     :share-orgpage/campaigns                         "Campagnes"
     :share-orgpage/copied-to-clipboard               "Gekopieerd naar klembord"
     :share-orgpage/copy-template-link                "Sjabloonlink kopiëren"
     :share-orgpage/dialog-title                      "{orgpage/title} delen"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Mensen zonder OrgPad-account ontvangen een uitnodiging met een link."
                                                                  " Nadat ze de link openen, kunnen ze deze OrgPage lezen. ")
                                                         [:a.link-button create-team "Een team maken"]
                                                         " om OrgPages eenvoudig met een groep te delen."])
     :share-orgpage/email-found                       "Een OrgPad-account gevonden."
     :share-orgpage/email-unused                      "Geen OrgPad-account gevonden. Stuur in plaats daarvan een e-mailuitnodiging."
     :share-orgpage/checking-email-address            "E-mailadres controleren…"
     :share-orgpage/invite-for-editing                "Uitnodigen om te bewerken"
     :share-orgpage/invite-for-viewing                "Uitnodigen om te lezen"
     :share-orgpage/invite-by-email                   "Wil je ze per e-mail uitnodigen in een specifieke taal?"
     :share-orgpage/show-profile                      "Profiel weergeven"
     :share-orgpage/links                             "Links"
     :share-orgpage/to-read                           "lezen"
     :share-orgpage/to-comment                        "reageren"
     :share-orgpage/to-edit                           "bewerken"
     :share-orgpage/links-tooltip                     "Toegang verlenen via deelbare links"
     :share-orgpage/template                          "Sjabloon"
     :share-orgpage/template-tooltip                  "Links die automatisch een kopie van deze OrgPage maken"
     :share-orgpage/template-info                     "Met deze link kunnen mensen hun eigen kopieën van deze OrgPage maken."
     :share-orgpage/template-autoshare-none           "Deel de kopieën niet met mij."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Deel de kopieën met mij om te "
                                                             (case template-autoshare
                                                               :permission/view "lezen"
                                                               :permission/comment "reageren"
                                                               :permission/edit "bewerken") "."))
     :share-orgpage/embed                             "Insluiten"
     :share-orgpage/embed-into-microsoft-teams        "Insluiten in Microsoft Teams"
     :share-orgpage/embed-into-website                "Insluiten in website of applicatie"
     :share-orgpage/embed-tooltip                     "Insluiten in website of applicatie"
     :share-orgpage/new-user-or-usergroup             "Naam, e-mail of team"
     :share-orgpage/link-permission-start             "Mensen toestaan"
     :share-orgpage/link-permission-end               "deze OrgPage."
     :share-orgpage/orgpage-info                      "Info"
     :share-orgpage/orgpage-info-tooltip              "Informatie over de eigenaar en of de OrgPage is gepubliceerd"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Deze OrgPage is met je gedeeld om te "
                                                             (case user-permission
                                                               :permission/view "lezen"
                                                               :permission/comment "reageren"
                                                               :permission/edit "bewerken") "."))
     :share-orgpage/remove-yourself                   "Jezelf verwijderen"
     :share-orgpage/private-info                      "Alleen jij en de mensen met wie je de OrgPage direct of via een link deelt, hebben toegang. Elk nieuw document is privé."
     :share-orgpage/publish-for-reading-info          "De OrgPage is openbaar. Iedereen op internet kan deze vinden en lezen. Alleen jij of mensen met bewerkingsrechten kunnen wijzigingen aanbrengen."
     :share-orgpage/publish-permission-end            "Deze OrgPage is "
     :share-orgpage/publish                           "Publiceren"
     :share-orgpage/publish-confirmation              "Iedereen kan deze OrgPage {orgpage/permission}. Weet je het zeker?"
     :share-orgpage/publish-tooltip                   "Iedereen toegang geven"
     :share-orgpage/remove-user                       "Toestemming verwijderen"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Heb je per ongeluk een link gedeeld? Je kunt "
                                                         [:span.link-button reset-links "alle vorige links ongeldig maken"]
                                                         "."])
     :share-orgpage/shareable-link                    "Deelbare link"
     :share-orgpage/everything-closed                 "Alle cellen gesloten weergeven"
     :share-orgpage/presentation                      "Beginnen met een presentatie"
     :share-orgpage/fragment                          "Een locatie weergeven"
     :share-orgpage/template-link-switch              "Een sjabloonlink maken."
     :share-orgpage/user-not-registered               " heeft zich nog niet aangemeld voor OrgPad."
     :share-orgpage/users                             "Mensen"
     :share-orgpage/users-tooltip                     "Individuele personen toegang geven"

     :side-panel/about                                "Startpagina"
     :side-panel/terms-and-conditions                 "Algemene voorwaarden"
     :side-panel/privacy-and-security                 "Privacy en beveiliging"
     :side-panel/files-and-images                     "Bestanden en afbeeldingen"
     :side-panel/paths                                "Presentaties"
     :side-panel/fragments                            "Locaties"
     :side-panel/translate                            "Vertalen"
     :side-panel/toggle-debug                         "Debugger"
     :side-panel/help                                 "Help"
     :side-panel/blog                                 "Blog"
     :side-panel/home                                 "Home"
     :side-panel/import                               "Importeren"
     :side-panel/share                                "Delen"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "bestanden" "bestand" "bestanden"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "afbeeldingen" "afbeelding" "afbeeldingen"]}]
     :side-panel/num-paths                            [:i18n/plural "{side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "presentaties" "presentatie" "presentaties"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "locaties" "locatie" "locaties"]}]

     :step/closed-books                               "Gesloten cellen; CTRL+klik om te selecteren"
     :step/everything-closed                          "Alles gesloten"
     :step/hidden-books                               "Verborgen cellen; CTRL+klik om te selecteren"
     :step/nothing-changed                            "Niets gewijzigd"
     :step/opened-pages                               "Geopende pagina’s; CTRL+klik om te selecteren"
     :step/focused-books                              "Cellen weergeven in camera; CTRL+klik om te selecteren"
     :step/shown-books                                "Onthulde cellen; CTRL+klik om te selecteren"
     :step/switched-pages                             "Pagina’s gewisseld; CTRL+klik om te selecteren"

     :style-select/set-comment                        "Omzetten naar opmerkingscel met je profielfoto (CTRL+,)"
     :style-select/unset-comment                      "Omzetten naar normale cel en profielfoto verwijderen (CTRL+,)"
     :style-select/set-comment-safari                 "Omzetten naar opmerkingscel met je profielfoto (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Omzetten naar normale cel en profielfoto verwijderen (SHIFT+CMD+,)"

     :tag/public                                      "openbaar"

     :text-field/email                                "E-mail"
     :text-field/first-name                           "Voornaam"
     :text-field/last-name                            "Achternaam"
     :text-field/name                                 "Naam"
     :text-field/new-password                         "Nieuw wachtwoord"
     :text-field/password                             "Wachtwoord"
     :text-field/content                              "Inhoud"
     :text-field/name-or-email                        "Naam of e-mail"
     :text-field/subject                              "Onderwerp"
     :text-field/message                              "Bericht"
     :text-field/phone-number                         "Telefoonnummer"
     :text-field/width                                "Breedte"
     :text-field/height                               "Hoogte"

     :translate/title                                 "OrgPage {orgpage/title} vertalen naar een andere taal"
     :translate/info                                  (str "Maakt automatisch een kopie van deze OrgPage (in jouw bezit),"
                                                           " die van de brontaal naar de doeltaal wordt vertaald."
                                                           " Je vindt deze binnen een minuut in je lijst.")
     :translate/source-lang                           "Brontaal"
     :translate/target-lang                           "Doeltaal"
     :translate/translate                             "Vertalen"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Vertaling beschikbaar als "
                                                         [:a.link-button {:href url :target "_blank"} title]])

     :unit-editor/add-page                            "Nog een pagina maken (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "Deze pagina verwijderen"
     :unit-editor/previous-page                       (str "Vorige pagina (PAGEUP);"
                                                           " houd SHIFT ingedrukt om deze pagina naar links te verplaatsen (SHIFT+PAGEUP);"
                                                           " houd CTRL ingedrukt om nog een pagina voor deze pagina toe te voegen (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "Volgende pagina (PAGEDOWN);"
                                                           " houd SHIFT ingedrukt om deze pagina naar rechts te verplaatsen (SHIFT+PAGEDOWN);"
                                                           " houd CTRL ingedrukt om nog een pagina na deze pagina toe te voegen (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Overschakelen naar deze pagina"
                                                             (when can-edit "; houd SHIFT ingedrukt om de huidige pagina daarheen te verplaatsen")))
     :unit-editor/hidden-info                         "Klik om te schrijven"
     :unit-editor/undo                                "Ongedaan maken (CTRL+Z)"
     :unit-editor/redo                                "Opnieuw uitvoeren (CTRL+SHIFT+Z of CTRL+Y)"
     :unit-editor/toggle-bold                         "Vet (CTRL+B)"
     :unit-editor/toggle-italic                       "Cursief (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Doorhalen"
     :unit-editor/toggle-subscript                    "Subscript (CTRL+S)"
     :unit-editor/toggle-superscript                  "Superscript (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Hyperlink maken (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Hyperlink verwijderen"
     :unit-editor/set-highlighting                    "Markeringskleur"
     :unit-editor/selection->code                     "Converteren naar code (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Lijst met opsommingstekens (TAB)"
     :unit-editor/toggle-list-ol                      "Genummerde lijst (CTRL+O)"
     :unit-editor/indent                              "Inspringing vergroten (TAB)"
     :unit-editor/outdent                             "Inspringing verkleinen (SHIFT+TAB)"
     :unit-editor/center                              "Centreren (CTRL+L)"
     :unit-editor/heading                             "Kop (CTRL+G)"
     :unit-editor/embed-pdf                           "PDF-inhoud weergeven"
     :unit-editor/link-pdf                            "PDF-inhoud vervangen door de hyperlink"
     :unit-editor/embed-office                        "Documentinhoud weergeven met Microsoft 365"
     :unit-editor/link-office                         "Documentinhoud vervangen door de hyperlink"
     :unit-editor/embed-video                         "Videospeler weergeven"
     :unit-editor/link-video                          "Video vervangen door de hyperlink"
     :unit-editor/embed-audio                         "Audiospeler weergeven"
     :unit-editor/link-audio                          "Audio vervangen door de hyperlink"
     :unit-editor/hyperlink->embed                    "Gelinkte website invoegen"
     :unit-editor/embed->hyperlink                    "Ingesloten website vervangen door de hyperlink"
     :unit-editor/open-image-in-attachments           "Deze afbeelding openen in de lijst met bijlagen"
     :unit-editor/open-file-in-attachments            "Dit bestand openen in de lijst met bijlagen"
     :unit-editor/toggle-controls                     "Bedieningselementen van de videospeler weergeven"
     :unit-editor/toggle-autoplay                     "Automatisch afspelen"
     :unit-editor/toggle-muted                        "Gedempt afspelen, anders wordt automatisch afspelen mogelijk geblokkeerd"
     :unit-editor/toggle-loop                         "Afspelen in een lus"
     :unit-editor/toggle-chained-size                 "Beeldverhouding behouden"
     :unit-editor/insert-menu                         "Invoegen"
     :unit-editor/insert-image                        "Afbeelding"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Upload een afbeelding vanaf je apparaat."
     :unit-editor/insert-image-info2                  "Tip: Sleep of plak afbeeldingen rechtstreeks in een cel of op het grijze canvas."
     :unit-editor/insert-camera                       "Camera"
     :unit-editor/insert-attachment                   "Bestand"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Video"
     :unit-editor/insert-video-info                   "Upload een video vanaf je computer of voeg deze in vanaf YouTube."
     :unit-editor/insert-video-info2                  "Tip: Sleep video's en YouTube-miniaturen rechtstreeks naar een cel of het grijze canvas."
     :unit-editor/video-url                           "YouTube-link"
     :unit-editor/youtube-start                       "Start"
     :unit-editor/youtube-end                         "Einde"
     :unit-editor/insert-table                        "Tabel"
     :unit-editor/insert-table-info                   "Kies de grootte van de ingevoegde tabel."
     :unit-editor/toggle-table-border                 "Tabelranden weergeven"
     :unit-editor/add-row-before                      "Rij hierboven invoegen"
     :unit-editor/add-row-after                       "Rij hieronder invoegen"
     :unit-editor/remove-current-row                  "Rij verwijderen"
     :unit-editor/add-column-before                   "Kolom ervoor invoegen"
     :unit-editor/add-column-after                    "Kolom erna invoegen"
     :unit-editor/remove-current-column               "Kolom verwijderen"
     :unit-editor/remove-table                        "Tabel verwijderen"
     :unit-editor/insert-website                      "Website"
     :unit-editor/insert-website-info                 (str "Je kunt websites rechtstreeks in een cel insluiten."
                                                           " Als het niet werkt, is het mogelijk geblokkeerd door de eigenaar van de website.")
     :unit-editor/website-url-or-code                 "Websiteadres of code"
     :unit-editor/website-id                          "Website-ID"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Gebruikt voor "
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "het verzenden van berichten tussen websites"] "."])
     :unit-editor/invalid-website-url                 "Ongeldig websiteadres of code"
     :unit-editor/invalid-video-url                   "Ongeldig videoadres"
     :unit-editor/update-website                      "Websiteadres wijzigen"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "Code"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Code kopiëren"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Code als aparte alinea"
     :unit-editor/toggle-block-math                   "Wiskunde op een aparte regel"
     :unit-editor/remove-code                         "Codeopmaak verwijderen"
     :unit-editor/insert-math                         "Wiskunde / Scheikunde"

     :unit-panel/link                                 (str "Klik of sleep om te verbinden;"
                                                           " houd SHIFT ingedrukt om meerdere verbindingen te maken;"
                                                           " houd CTRL ingedrukt om een keten van cellen te maken")
     :unit-panel/upload-attachment                    "Afbeelding of bestand in deze cel invoegen"
     :unit-panel/change-link-style                    (str "De stijl van deze verbinding wijzigen; "
                                                           "houd SHIFT ingedrukt om de huidige in te stellen, "
                                                           "houd CTRL ingedrukt om naar de standaard te kopiëren; "
                                                           "sleep om in deze stijl te verbinden")
     :unit-panel/hide-content                         "Inhoud verbergen"
     :unit-panel/delete-unit                          "Cel verwijderen"

     :usergroup/create                                "Een team maken"
     :usergroup/edit-title                            "{usergroup/name} bewerken"
     :usergroup/info                                  "Maak en beheer teams van je vrienden en collega's om het delen van OrgPages te vereenvoudigen."
     :usergroup/delete                                "Team verwijderen"
     :usergroup/members                               "Leden"
     :usergroup/edit                                  "Teamnaam en logo wijzigen"
     :usergroup/show-actions                          "Acties weergeven"
     :usergroup/name                                  "Naam"
     :usergroup/hide-orgpages                         "Gedeelde OrgPages verbergen"
     :usergroup/hide-orgpages-tooltip                 "Ze kunnen worden weergegeven door het team in te schakelen in het filter"
     :usergroup/hide-in-filter                        "In filter verbergen"
     :usergroup/create-info                           "De teamnaam en profielfoto zijn alleen zichtbaar voor teamleden."
     :usergroup/confirm-delete                        [:<> [:b "Permanent"] " dit team verwijderen?"]
     :usergroup/members-title                         "Leden van {usergroup/name}"
     :usergroup/remove-member                         "Verwijderen uit team"
     :usergroup/remove-admin                          "Beheerder verwijderen"
     :usergroup/make-admin                            "Beheerder maken"
     :usergroup/admin-tooltip                         "Een beheerder kan de leden beheren en het team verwijderen."
     :usergroup/copy-usergroup                        "Team kopiëren"

     :usergroup-role/owner                            "Eigenaar"
     :usergroup-role/admin                            "Beheerder"
     :usergroup-role/member                           "Lid"

     :wire-transfer/title                             "Overschrijving voor jaarlijks {wire-transfer/tier}-abonnement"
     :wire-transfer/info                              "We activeren je jaarlijkse abonnement wanneer we je geld op onze rekening ontvangen."
     :wire-transfer/used-currency                     "Betaling in {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Naam van de ontvanger"
     :wire-transfer/account-number                    "Rekeningnummer"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Bedrag"
     :wire-transfer/payment-purpose                   "Betalingsdoel"
     :wire-transfer/qr-code-common                    (str "Scan deze QR-code voor betalingen met je bank-app om"
                                                           " de juiste informatie automatisch in te vullen.")
     :wire-transfer/cz-sk-qr-code-description         (str " Dit is een QR-code die vaak wordt gebruikt voor overschrijvingen"
                                                           " in Tsjechië en Slowakije.")
     :wire-transfer/eu-qr-code-description            (str " Dit is een QR-code die vaak wordt gebruikt voor SEPA-overschrijvingen"
                                                           " in de Europese Unie.")
     :wire-transfer/trial-info                        (str "Je kunt een eenmalig 7-daags abonnement starten om OrgPad"
                                                           " onmiddellijk volledig te gebruiken. Wanneer de bank heeft bevestigd dat de betaling is geslaagd,"
                                                           " wordt de abonnementsperiode verlengd met 1 jaar.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Als je vragen of problemen hebt, laat het ons dan weten door "
                                                         " " [:a.link-button {:href url} "dit formulier in te vullen"] "."])
     :wire-transfer/success-text                      [:<> "We hebben een " [:b "eenmalig 7-daags abonnement"] " geactiveerd"
                                                       " zodat je OrgPad onmiddellijk met het nieuwe abonnement kunt gebruiken. "]
     :wire-transfer/common-result-text                (str "Wanneer de bank de betaling bevestigt,"
                                                           " wordt de abonnementsperiode verlengd"
                                                           " met 1 jaar.")
     :wire-transfer/start-trial                       "Overschrijving verzonden"
     :wire-transfer/start-trial-result-title          "Bedankt voor de betaling"
     :wire-transfer/copy                              "Kopiëren naar klembord"

     :website-editor/settings                         "Instellingen"
     :website-editor/routes                           "Paden"
     :website-editor/menus                            "Menu's"
     :website-editor/create-menu                      "Menu maken"
     :website-editor/edited-menu                      "Bewerkt menu"
     :website-editor/untitled-menu                    "Naamloos menu"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "kinderen" "kind" "kinderen"]}]
     :website-editor/delete-menu-item                 "Dit menu-item verwijderen"
     :website-editor/add-menu-item                    "Menu-item toevoegen"
     :website-editor/menu-item-label                  "Label"
     :menu-item/path-type                             "Opent een pad"
     :menu-item/url-type                              "Opent een externe URL"
     :menu-item/children-type                         "Opent een submenu"
     :website-editor/menu-item-path                   "Pad"

     :youtube-placement/watch-on-prefix               (str "Bekijk" unicode/nbsp "op")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/nl dict)