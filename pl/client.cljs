(ns orgpad.client.i18n.dicts.pl
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.pl :as pl]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  (merge
    pl/dict
    {:address/company                                 "Nazwa firmy"
     :address/ico                                     "Numer VAT (NIP)"
     :address/street                                  "Ulica"
     :address/street-number                           "Numer"
     :address/postal-code                             "Kod pocztowy"
     :address/city                                    "Miasto"
     :address/country                                 "Kraj"

     :administration/page-title                       "Administracja - OrgPad"

     :attachments/allows-access-to-file               "Umożliwia dostęp do tego pliku."
     :attachments/allows-access-to-image              "Umożliwia dostęp do tego obrazu."
     :attachments/no-preview                          "Brak podglądu."
     :attachments/all-files                           "Wszystkie pliki"
     :attachments/used-files                          "Pliki w OrgStronie"
     :attachments/unused-files                        "Pliki poza OrgStroną"
     :attachments/all-images                          "Wszystkie obrazy"
     :attachments/used-images                         "Obrazy w OrgStronie"
     :attachments/unused-images                       "Obrazy poza OrgStroną"
     :attachments/uploading-files                     "Przesyłanie plików…"
     :attachments/previous-attachment                 "Poprzedni plik lub obraz"
     :attachments/next-attachment                     "Następny plik lub obraz"
     :attachments/display-using-microsoft-365         "Wyświetl w Microsoft 365"
     :attachments/edit-filename                       "Edytuj nazwę"
     :attachments/title-order                         "Alfabetycznie według tytułu"
     :attachments/upload-order                        "Najnowsze na górze"
     :attachments/size-order                          "Największe na górze"
     :attachments/split-used-unused                   "Grupuj według obecności w OrgStronie"
     :attachments/search                              "Szukaj"
     :attachments/ordering                            "Sortowanie"
     :attachments/new-version                         "Nowa wersja"
     :attachments/preserve-old-version                "Zachowaj starą wersję"
     :attachments/in-other-orgpages                   "Zastąp w innych OrgStronach:"

     :button/back                                     "Wstecz"
     :button/cancel                                   "Anuluj"
     :button/close                                    "Zamknij"
     :button/comment                                  "Skomentuj"
     :button/continue                                 "Kontynuuj"
     :button/copied                                   "Skopiowano"
     :button/copy                                     "Kopiuj"
     :button/copy-link                                "Kopiuj link"
     :button/create                                   "Utwórz"
     :button/create-tooltip                           "Utwórz (CTRL+ENTER)"
     :button/delete                                   "Usuń"
     :button/delete-selected                          "Usuń zaznaczone"
     :button/documentation                            "Dokumentacja"
     :button/download                                 "Pobierz"
     :button/download-all                             "Pobierz wszystko"
     :button/drop                                     "Upuść"
     :button/edit                                     "Edytuj"
     :button/import                                   "Importuj"
     :button/insert                                   "Wstaw"
     :button/login                                    "Zaloguj się"
     :button/logout                                   "Wyloguj się"
     :button/publish                                  "Opublikuj"
     :button/read                                     "Czytaj"
     :button/register                                 "Zarejestruj się"
     :button/register-to-save                         "Zarejestruj się, aby zapisać"
     :button/remove                                   "Usuń"
     :button/reset                                    "Resetuj"
     :button/save                                     "Zapisz zmiany"
     :button/save-tooltip                             "Zapisz zmiany (CTRL+ENTER)"
     :button/upload                                   "Prześlij"
     :button/upload-from-computer                     "Prześlij z komputera"
     :button/send                                     "Wyślij"
     :button/present                                  "Prezentuj"
     :button/present-tooltip                          "Rozpocznij prezentację (F5)"
     :button/share                                    "Udostępnij"
     :button/start                                    "Start"
     :button/exit                                     "Wyjdź"
     :button/show-password                            "Pokaż"
     :button/hide-password                            "Ukryj"

     :checkout/currency                               "Waluta"
     :checkout/monthly                                "miesięcznie"
     :checkout/yearly                                 "rocznie (oszczędzasz 15%)"
     :checkout/failed-to-init                         "Wystąpił błąd podczas ładowania strony płatności."
     :checkout/upgrade-plan                           "Ulepsz plan"
     :checkout/professional-plan                      "Plan profesjonalny"
     :checkout/school-plan                            "Plan szkolny"
     :checkout/enterprise-plan                        "Plan dla firm"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Szkoła"] " lub "
                                                         [:a.link-button {:href enterprise-url} "firma"]
                                                         "? Skontaktuj się z nami w sprawie oferty indywidualnej."])
     :checkout/pay-with-credit-card                   "Zapłać kartą"
     :checkout/pay-with-wire-transfer                 "Zapłać przelewem bankowym"
     :checkout/promo-code                             "Kod promocyjny"
     :checkout/try-for-free                           "Wypróbuj za darmo"
     :checkout/activate-now                           "Aktywuj teraz"
     :checkout/continue-for-free                      "Kontynuuj za darmo"

     :code-lang/none                                  "Brak"
     :code-lang/multiple                              "Wiele"

     :dashboard/confirm-delete                        [:<> [:b "Trwale"] " usunąć tę OrgStronę?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Zaloguj się"] " lub "
                                                         [:a {:href register-url} "zarejestruj się"]
                                                         ", aby tworzyć nowe OrgStrony."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "Subskrypcja Twojej szkoły " name " wygasła " subscription-expired ". "
                                                         "W celu odnowienia skontaktuj się z zarządem. "
                                                         [:a {:href info-link :target "_blank"} "Więcej informacji"] " o 95% zniżce dla szkół."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Zdobądź OrgPad dla swojej szkoły bez ograniczeń z 95% zniżką. "
                                                         [:a {:href info-link :target "_blank"} "Więcej informacji."]])
     :dashboard/owned-orgpages                        "Moje OrgStrony"
     :dashboard/public-orgpages                       "Opublikowane OrgStrony"
     :dashboard/shared-orgpages                       "OrgStrony udostępnione mi"
     :dashboard/usergroup-orgpages                    "OrgStrony użytkownika {usergroup/name}"
     :dashboard/help-or-inspiration-button            "Proszę bardzo!"
     :dashboard/new-domain                            [:<> "Użyj nowej domeny " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Więcej informacji w OrgStronie "
                                                       [:a {:href "https://orgpad.info/s/new-domain"} "Zmiany w OrgPad i nowa domena"] "."]
     :dashboard-filter/filter                         "Filtruj OrgStrony"
     :dashboard-filter/ordering                       "Sortuj OrgStrony"
     :dashboard-filter/filter-and-ordering            "Filtruj i sortuj OrgStrony"
     :dashboard-filter/title                          "Filtruj i sortuj wyświetlane OrgStrony"
     :dashboard-filter/ordering-label                 "Sortowanie OrgStron"
     :dashboard-filter/title-order                    "Alfabetycznie według tytułu"
     :dashboard-filter/creation-time-order            "Najnowsze na górze"
     :dashboard-filter/last-modified-order            "Ostatnio zmodyfikowane na górze"
     :dashboard-filter/most-viewed-order              "Najczęściej oglądane na górze"
     :dashboard-filter/search-tags                    "Szukaj tagów"

     :embedding-code/code                             "Kod"
     :embedding-code/description                      "Osadź OrgStronę na stronie internetowej lub w innej aplikacji."

     :error/orgpage-access-denied                     "Nie masz dostępu do tej OrgStrony. Spróbuj się zalogować."
     :error/usergroup-access-denied                   "Odmowa uprawnień do edycji zespołu."
     :error/administration-access                     "Odmowa dostępu administracyjnego."
     :error/creation-unauthorized                     "Zaloguj się, aby tworzyć OrgStrony."
     :error/deleting-denied                           "Nie można usunąć tej OrgStrony."
     :error/email-already-used                        "E-mail jest już używany."
     :error/email-not-registered                      "Brak konta z tym adresem e-mail."
     :error/email-missing-mx-record                   "Nie znaleziono serwera pocztowego w tej domenie."
     :error/email-invalid                             "To nie jest adres e-mail."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Nieprawidłowa OrgStrona" (when id " {orgpage/id}")
                                                             ". Źle skopiowany link?"))
     :error/incorrect-link                            "Nieprawidłowy link. Zaloguj się lub otwórz prawidłowy link."
     :error/incorrect-password                        "Nieprawidłowe hasło."
     :error/incorrect-profile-id                      "Nieprawidłowy link do profilu. Źle skopiowany link?"
     :error/lost-permission                           "Utracono dostęp do tej OrgStrony."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "E-maile bez konta: " emails))
     :error/name-already-used                         "Nazwa jest już używana."
     :error/name-not-valid                            "Użyj co najmniej 5 znaków."
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "OrgStrona " (when title "„{orgpage/title}”") " została usunięta."))
     :error/owner-of-orgpage                          "Osoba jest już właścicielem tej OrgStrony."
     :error/profile-not-found                         "Nie znaleziono profilu."
     :error/unknown-error                             "Nieznany błąd. Spróbuj ponownie."
     :error/unknown-id                                "Nieznana OrgStrona."
     :error/unknown-login-or-email                    "Nieznany e-mail lub login zespołu."
     :error/unknown-usergroup                         "Zespół został usunięty."
     :error/upload-failed                             "Nie udało się przesłać OrgStrony: „{orgpage/title}”."

     :export/show                                     "Eksportuj OrgStronę"
     :export/title                                    "Eksportuj {orgpage/title}"
     :export/info                                     "Wybierz format, w którym ta OrgStrona ma zostać wyeksportowana."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " format używany przez OrgPad"]
     :export/html                                     "Liniowy plik HTML"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " format"]
     :export/generate                                 "Generuj eksport"

     :feedback/ask-question                           "Zadaj pytanie"
     :feedback/hide-button                            "Ukryj przycisk na stałe"
     :feedback/dialog-title                           "Skontaktuj się z twórcami OrgPad"
     :feedback/description                            [:<> "Jeśli potrzebujesz pomocy lub masz jakiś problem, daj znać nam – "
                                                       [:b "twórcom OrgPad"] ". "
                                                       "Mile widziane są również wszelkie pomysły na ulepszenia. "
                                                       "Odpowiemy e-mailem tak szybko, jak to możliwe."]
     :feedback/languages                              "Możesz do nas pisać po angielsku, czesku lub niemiecku."
     :feedback/contact-when-problem-persists          [:<> " Jeśli problem będzie się powtarzał, skontaktuj się z nami pod adresem "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Przelew bankowy"
                                                             (when currency
                                                               (str " w " (name currency))) " za "
                                                             "roczny"
                                                             (if (= tier "standard")
                                                               " Standardowy"
                                                               " Profesjonalny")
                                                             " plan"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Napisz nam swój " [:b "adres rozliczeniowy"] ", wszelkie dalsze informacje do faktury."
                                                         " Wkrótce skontaktujemy się z Tobą pod Twoim adresem e-mail " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Chcę kupić plan dla mojej " (case org-type
                                                                                            :feedback/school-plan "szkoły"
                                                                                            :feedback/enterprise-plan "firmy"
                                                                                            "organizacji")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Użyj tego formularza, aby skontaktować się z przedstawicielem OrgPad s.r.o."
                                                         " Wkrótce skontaktujemy się z Tobą pod podanym numerem telefonu lub adresem e-mail (" email
                                                         "). Możesz również zadzwonić do nas pod numer "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Ulepsz moją subskrypcję do planu profesjonalnego"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Napisz nam, jak powinniśmy zmienić Twoją istniejącą subskrypcję i wszelkie dalsze informacje."
                                                         " Wkrótce skontaktujemy się z Tobą pod Twoim adresem e-mail " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Zmień mój okres rozliczeniowy na " (if (= period "yearly")
                                                                                                   "roczny"
                                                                                                   "miesięczny") " rozliczeniowy"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Zmiana nastąpi po zakończeniu bieżącego okresu rozliczeniowego."
                                                         " Przy rozliczeniu rocznym obowiązuje 15% zniżki."
                                                         " Wkrótce skontaktujemy się z Tobą pod Twoim adresem e-mail " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str "Nazwa " (case org-type
                                                                        :feedback/school-plan "szkoły"
                                                                        :feedback/enterprise-plan "firmy"
                                                                        "organizacji")))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Stanowisko w " (case org-type
                                                                               :feedback/school-plan "szkole"
                                                                               :feedback/enterprise-plan "firmie"
                                                                               "organizacji")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str "Strona internetowa " (case org-type
                                                                                     :feedback/school-plan "szkoły"
                                                                                     :feedback/enterprise-plan "firmy"
                                                                                     "organizacji")))

     :fragment/fragment                               "Lokalizacja"
     :fragment/text-id                                "Identyfikator"
     :fragment/title                                  "Tytuł"
     :fragment/create                                 "Utwórz lokalizację"
     :fragment/create-tooltip                         "TAB; przytrzymaj SHIFT, aby skopiować wybraną lokalizację"
     :fragment/remove                                 "Usuń lokalizację"
     :fragment/share                                  "Kopiuj link do tej lokalizacji"
     :fragment/text-id-required                       "Identyfikator jest wymagany."
     :fragment/text-id-already-used                   "Identyfikator jest już używany."
     :fragment/closed-books                           "Zamknięte komórki; CTRL+klik, aby wybrać"
     :fragment/hidden-books                           "Ukryte komórki; CTRL+klik, aby wybrać"
     :fragment/opened-pages                           "Otwarte strony; CTRL+klik, aby wybrać"
     :fragment/focused-books                          "Komórki pokazane w kamerze; CTRL+klik, aby wybrać"
     :fragment/shown-books                            "Odkryte komórki; CTRL+klik, aby wybrać"

     :info/uploading-attachments                      [:i18n/plural "Przesyłanie {info/count} {info/num-files}…"
                                                       {:info/num-files [:info/count "plików" "pliku" "pliki"]}]
     :info/uploading-images                           [:i18n/plural "Przesyłanie {info/count} {info/num-images}…"
                                                       {:info/num-images [:info/count "obrazów" "obrazu" "obrazy"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Nie udało się przesłać {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "obrazów" "obrazu" "obrazy"]}]
                                                          "Nie udało się przesłać co najmniej jednego obrazu."))
     :info/uploading-youtubes-failed                  [:i18n/plural "Nie znaleziono {info/count} filmów {info/num-youtubes} z YouTube."
                                                       {:info/num-youtubes [:info/count "filmów" "filmu" "filmy"]}]
     :info/uploading-attachments-failed               "Przesyłanie plików nie powiodło się."
     :info/presentation-link-copied                   "Link do tej prezentacji został skopiowany."
     :info/max-orgpages-exceeded                      "Właściciel tej OrgStrony nie może utworzyć dodatkowej OrgStrony."
     :info/storage-exceeded                           "Właściciel tej OrgStrony nie ma {upload/total-size} wolnego miejsca na przesłanie tych plików."
     :info/attachments-too-large                      (str "Nie można przesłać {upload/total-size} w jednym przesyłaniu."
                                                           " Maksymalny rozmiar wszystkich przesłanych załączników to 500 MB.")
     :info/drop-info                                  "Upuść do dowolnej komórki lub na szare płótno, aby utworzyć nową komórkę."
     :info/audio-not-allowed                          "Odtwarzanie dźwięku zablokowane. Kliknij przycisk odtwarzania."
     :info/audio-not-supported                        "Format audio nie jest obsługiwany."

     :import/another-format                           [:<> "Jeśli chcesz zaimportować istniejące dane w innym formacie, skontaktuj się z nami pod adresem "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Importuj swoje dane"
     :import/google-docs                              "Aby wstawić dane z Microsoft Office lub Google Docs, po prostu wklej je do OrgStrony."
     :import/supported-formats                        "Obecnie obsługujemy następujące formaty:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " wyeksportowany jako plik .vsdx."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " plik."]

     :ios/install-info                                "Zainstaluj aplikację OrgPad"
     :ios/share-button                                "1. Otwórz"
     :ios/add-to-home-screen                          "2. Stuknij"

     :lang/cs                                         "Czeski"
     :lang/de                                         "Niemiecki"
     :lang/en                                         "Angielski"
     :lang/es                                         "Hiszpański"
     :lang/fr                                         "Francuski"
     :lang/hi                                         "Hinduski"
     :lang/pl                                         "Polski"
     :lang/ru                                         "Rosyjski"
     :lang/uk                                         "Ukraiński"

     :lang-select/tooltip                             "Język aplikacji (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "Brakuje Twojego języka? Pomóż nam, "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "tłumacząc OrgPad"] "."]

     :limit/of                                        " z "
     :limit/orgpages                                  " OrgStron"
     :limit/people                                    " osób"
     :limit/teams                                     " zespołów"
     :limit/team-members                              " członków"
     :limit/orgpages-tooltip                          (str "W planie darmowym liczba OrgStron jest ograniczona."
                                                           " Ulepsz swój plan, aby tworzyć więcej OrgStron.")
     :limit/shares-tooltip                            (str "Liczba osób, którym możesz bezpośrednio udostępnić tę OrgStronę, jest ograniczona."
                                                           " Ulepsz do planu profesjonalnego, aby udostępniać nieograniczonej liczbie osób.")
     :limit/teams-tooltip                             (str "W planie standardowym liczba posiadanych zespołów jest ograniczona."
                                                           " Ulepsz do planu profesjonalnego, aby tworzyć nieograniczoną liczbę zespołów.")
     :limit/teams-members-tooltip                     (str "W planie standardowym każdy zespół ma ograniczoną liczbę członków."
                                                           " Ulepsz do planu profesjonalnego, aby tworzyć nieograniczoną liczbę zespołów.")
     :limit/attachments-size                          (str "Całkowity rozmiar wszystkich przesłanych plików i obrazów jest ograniczony"
                                                           " i można go zwiększyć, ulepszając plan.")
     :limit/attachments-size-clickable                (str "Całkowity rozmiar wszystkich przesłanych plików i obrazów jest ograniczony."
                                                           " Kliknij, aby zwiększyć swój limit, ulepszając plan.")
     :limit/attachments-size-try-out                  (str "Całkowity rozmiar wszystkich przesłanych plików i obrazów jest ograniczony."
                                                           " Aby zwiększyć swój limit do 100 MB, kliknij, aby utworzyć konto.")

     :limits/max-orgpages                             "dokumentów"
     :limits/max-storage                              "pamięci masowej"
     :limits/max-teams                                "zespołów"
     :limits/of                                       " z"
     :limits/max-team-members                         "członków"
     :limits/priority-support                         "wsparcie priorytetowe"

     :link-panel/flip                                 "Odwróć kierunek"
     :link-panel/insert-unit-in-middle                "Wstaw komórkę pośrodku"
     :link-panel/delete                               "Usuń link"
     :link-panel/change-link-style                    "Zmień styl tego linku; przytrzymaj SHIFT, aby ustawić bieżący, przytrzymaj CTRL, aby skopiować do domyślnego"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Obliczanie rozmiarów wszystkich komórek, pozostało " [:span#autoresize-num-units num-units] "…"])
     :loading/initial-layout                          "Ulepszanie początkowego układu…"
     :loading/restoring-opened-pages                  "Przywracanie pozycji otwartych stron…"
     :loading/getting-orgpage                         "Pobieranie OrgStrony z serwera…"
     :loading/getting-dashboard                       "Pobieranie listy dostępnych OrgStron z serwera…"
     :loading/getting-website                         "Pobieranie strony internetowej z serwera…"
     :loading/getting-blog                            "Pobieranie bloga z serwera…"
     :loading/uploading-orgpage                       "Przesyłanie OrgStrony na serwer…"
     :loading/ws-init                                 "Konfigurowanie połączenia z serwerem…"
     :loading/ws-closed                               "Połączenie z serwerem zamknięte, próba ponownego połączenia. Jeśli problem będzie się powtarzał, odśwież stronę."
     :loading/administration                          "Ładowanie danych administracyjnych…"
     :loading/profile                                 "Ładowanie profilu…"
     :loading/style                                   "Ładowanie stylów…"
     :loading/start-trial                             "Rozpoczynanie 7-dniowej subskrypcji próbnej…"
     :loading/uploading-attachments                   "Przesyłanie załączników na serwer…"

     :login/continue-with-email                       "Kontynuuj za pomocą poczty e-mail"
     :login/continue-with-facebook                    "Kontynuuj za pomocą Facebooka"
     :login/continue-with-google                      "Kontynuuj za pomocą Google"
     :login/continue-with-microsoft                   "Kontynuuj za pomocą Microsoft"
     :login/continue-with-cuni                        "Kontynuuj za pomocą Uniwersytetu Karola"
     :login/email-sent                                "E-mail wysłany. Kliknij link w e-mailu."
     :login/forgotten-password                        "Zapomniałeś hasła"
     :login/forgotten-password-email-resent           "E-mail do resetowania hasła został już wysłany."
     :login/forgotten-password-description            "Otrzymaj link do resetowania hasła e-mailem (ważny 24h)."
     :login/forgotten-password-error                  [:<> "Ten adres e-mail jest przez Ciebie zablokowany. Odblokuj go, klikając Anuluj subskrypcję w dowolnym e-mailu od OrgPad, lub wyślij nam e-mail na adres "
                                                       company/support-email-app-link " z tego adresu e-mail."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Nowy w OrgPad? " [:a.link-button {:href route} "Zarejestruj się"]])
     :login/options                                   "Wybierz inny sposób logowania"
     :login/send-reset-link                           "Wyślij link do resetowania"
     :login/wrong-email-or-password                   "E-mail lub hasło jest nieprawidłowe."

     :markdown/title                                  "Czy wklejony tekst jest sformatowany za pomocą Markdown?"
     :markdown/info                                   "Wykryto formatowanie Markdown w Twojej wklejonej treści. Czy chcesz zastosować jego formatowanie?"
     :markdown/remember                               "Zapamiętaj do ponownego załadowania"
     :markdown/insert                                 "Użyj formatowania Markdown"
     :markdown/ignore                                 "Zachowaj oryginał"

     :meta/title                                      "Nazwa OrgStrony"
     :meta/orgpage-thumbnail                          "Obraz OrgStrony"
     :meta/automatic-screenshot-start                 "Automatycznie wygenerowany zrzut ekranu dla "
     :meta/automatic-screenshot-refresh               "Aktualizuje się pięć minut po każdej zmianie."
     :meta/custom-thumbnail                           "Niestandardowy przesłany obraz o rozmiarze 1360x768."
     :meta/upload-thumbnail                           "Prześlij niestandardowy obraz"
     :meta/thumbnail-upload-failed                    "Nie udało się przesłać obrazu."
     :meta/description                                "Opis"
     :meta/new-tags                                   "Tag"
     :meta/tag-too-long                               (str "Maksymalna długość tagu to " common-orgpage/max-tag-length " znaków.")
     :meta/too-many-tags                              (str "Dozwolone jest co najwyżej " common-orgpage/max-tags " tagów.")
     :meta/info                                       (str "Te szczegóły będą wyświetlane na liście OrgStron, "
                                                           "podczas osadzania OrgStrony i udostępniania jej w sieciach społecznościowych.")
     :meta/info-in-share-orgpage                      "Zanim będziesz mógł udostępnić tę OrgStronę, należy ustawić tytuł."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Przenieś wybrane {selection/num-units} {selection/units-label} "
                                                                         "i {selection/num-links} {selection/links-label} do nowej OrgStrony "
                                                                         "z następującymi informacjami. W bieżącej OrgStronie te komórki i linki "
                                                                         "zostaną zastąpione pojedynczą komórką, zawierającą wewnątrz nową OrgStronę.")
                                                       {:selection/units-label [:selection/num-units "komórek" "komórki" "komórki"]
                                                        :selection/links-label [:selection/num-links "linków" "linku" "linki"]}]
     :meta/info-title                                 "Informacje – {meta/title}"
     :meta/info-title-only                            "Nazwij OrgStronę"
     :meta/details                                    "Szczegóły"
     :meta/preview                                    "Podgląd"
     :meta/init-fragments                             "Lokalizacja początkowa"
     :meta/init-fragments-info                        (str "Możesz wybrać lokalizację początkową po otwarciu OrgStrony. "
                                                           "Dla urządzeń mobilnych można określić inną lokalizację początkową.")
     :meta/desktop-init-fragment                      "Lokalizacja na komputerze stacjonarnym"
     :meta/mobile-init-fragment                       "Lokalizacja na urządzeniu mobilnym"
     :meta/everything-closed                          "Wszystkie komórki zamknięte"
     :meta/everything-closed-lowercase                "wszystkie komórki zamknięte"
     :meta/more-details                               "Więcej szczegółów"
     :meta/move-to-new-orgpage-title                  "Przenieś do {meta/title}"
     :meta/move-to-new-orgpage                        "Przenieś do nowej OrgStrony"

     :microsoft-365-permission/title                  "Zezwolić Microsoft 365 na dostęp do tego dokumentu?"
     :microsoft-365-permission/info                   [:<> "Dokument Office można wyświetlić za pomocą Microsoft 365."
                                                       " Klikając Zgadzam się, Twój dokument zostanie udostępniony firmie Microsoft."
                                                       " Sprawdź " [:a.link-button {:href   "https://www.microsoft.com/pl-pl/servicesagreement/"
                                                                                    :target "_blank"}
                                                                    "Umowę o świadczenie usług firmy Microsoft"] "."]
     :microsoft-365-permission/allow                  "Udziel pozwolenia Microsoft 365"

     :notifications/info                              "Wybierz, które e-maile OrgPad ma do Ciebie wysyłać. Zawsze będziemy Cię informować o ważnych zmianach."
     :notifications/any-email                         "Dowolny e-mail od OrgPad"
     :notifications/email-verification                "Weryfikacja e-mail po rejestracji, linki do resetowania hasła i niezbędne informacje o płatnościach"
     :notifications/monthly-newsletter                "Miesięczny biuletyn z aktualizacjami i najnowszymi wydarzeniami w OrgPad"
     :notifications/messages                          "Odbieraj wiadomości od innych osób"
     :notifications/blocked-people                    "Specjalnie zablokowane osoby:"
     :notifications/receipts                          "Rachunki po automatycznym odnowieniu subskrypcji"
     :notifications/receive-invitations               "Odbieraj zaproszenia od innych osób"
     :notifications/unblock-user                      "Odblokuj tę osobę"

     :onboarding/openable-units                       "Można otwierać tylko podniesione komórki z cieniami."
     :onboarding/zoom                                 "Przewiń, aby powiększyć"
     :onboarding/drag-canvas                          "Przesuwaj, przeciągając"
     :onboarding/open-units                           "Komórki z cieniami mają zawartość"

     :orgpage/creating-preview                        "Tworzenie podglądu…"
     :orgpage/change-information                      "Zmień informacje"
     :orgpage/copy-orgpage                            "Kopiuj do nowej OrgStrony"
     :orgpage/delete-orgpage                          "Usuń OrgStronę"
     :orgpage/detail                                  "Szczegóły"
     :orgpage/share-tooltip                           "Udostępnij tę OrgStronę innym"
     :orgpage/share-orgpage                           "Udostępnij OrgStronę"
     :orgpage/show-information                        "Pokaż informacje"
     :orgpage/zoom-in                                 "Powiększ"
     :orgpage/zoom-out                                "Pomniejsz"
     :orgpage/create-unit-double-click                "Kliknij dwukrotnie, aby utworzyć komórkę."
     :orgpage/create-unit-hold-or-double-tap          "Przytrzymaj lub dotknij dwukrotnie, aby utworzyć komórkę."
     :orgpage/switch-to-edit                          "Przełącz na edycję."
     :orgpage/untitled                                "OrgStrona bez tytułu"
     :orgpage/title                                   "Tytuł OrgStrony"
     :orgpage/untitled-unit                           "Komórka bez tytułu"
     :orgpage/untitled-path                           "Prezentacja bez tytułu"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "kroków" "kroku" "kroki"]}]
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (strona {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (strona {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Kopia dostępna jako "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Zmień kolor tej OrgStrony"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Ta OrgStrona jest automatycznie udostępniana " label " do "
                                                         (case permission
                                                           :permission/view "czytania"
                                                           :permission/comment "komentowania"
                                                           :permission/edit "edycji"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Kliknij tutaj"]
                                                         ", aby anulować udostępnianie."])

     :orgpage-placement/activate                      "Wyświetl tutaj"

     :orgpage-print/displayed                         "Dokładnie tak, jak wyświetlono"
     :orgpage-print/displayed-info                    "Wszystko wewnątrz prostokąta zostanie wydrukowane dokładnie tak, jak to widzisz."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgStrona została pomyślnie wydrukowana do "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "Drukowanie tego pliku PDF powinno zająć około {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Wszystkie komórki zamknięte"
     :orgpage-print/everything-closed-info            "Wydrukowany plik PDF wyświetla wszystkie komórki zamknięte."
     :orgpage-print/fragment                          "Lokalizacja"
     :orgpage-print/fragment-info                     "Wydrukowany plik PDF wyświetla wybraną lokalizację."
     :orgpage-print/gray                              "Szare tło"
     :orgpage-print/landscape                         "Poziomo"
     :orgpage-print/orientation                       "Orientacja"
     :orgpage-print/path-info                         [:i18n/plural " z {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "stronami" "stroną" "stronami"]}]
     :orgpage-print/portrait                          "Pionowo"
     :orgpage-print/presentation                      "Kroki prezentacji"
     :orgpage-print/presentation-info                 "Każdy krok jest drukowany na osobnej stronie."
     :orgpage-print/print                             "Drukuj do PDF"
     :orgpage-print/size                              "Rozmiar"
     :orgpage-print/started                           (str "Drukujemy tę OrgStronę do pliku PDF. Powinno to zająć około {orgpage-print/estimated-time}."
                                                           " Po zakończeniu będzie ona dostępna jako plik.")
     :orgpage-print/title                             "Nazwa wydruku"
     :orgpage-print/type                              "Co jest drukowane"
     :orgpage-print/watermark                         "Dołącz znak wodny"
     :orgpage-print/watermark-info                    "Ulepsz do wersji profesjonalnej, szkolnej lub firmowej, aby usunąć znak wodny."
     :orgpage-print/white                             "Białe tło"

     :orgpage-stats/number-of-units                   "Liczba komórek"
     :orgpage-stats/number-of-links                   "Liczba linków"
     :orgpage-stats/number-of-files                   "Liczba plików"
     :orgpage-stats/number-of-images                  "Liczba obrazów"

     :org-role/student                                "Uczeń"
     :org-role/teacher                                "Nauczyciel"
     :org-role/employee                               "Pracownik"
     :org-role/admin                                  "Administrator"

     :panel/toggle-side-panel                         "Menu boczne"
     :panel/create-orgpage                            "Nowa OrgStrona"
     :panel/logo-tooltip                              "Przejdź do strony głównej"
     :panel/edit-info                                 "Przełącz na edycję, gdzie możesz tworzyć i usuwać komórki i linki, modyfikować zawartość i nie tylko (F7)"
     :panel/comment-info                              (str "Przełącz na komentowanie, gdzie możesz tworzyć, edytować i usuwać"
                                                           " swoje komórki i linki, ale nie możesz edytować ani usuwać komórek lub linków"
                                                           " innych osób. Możesz jednak linkować do komórek, których nie jesteś właścicielem. (F7)")
     :panel/read-info                                 "Przełącz na czytanie, gdzie nic nie można zmienić, ale przeglądanie zawartości jest łatwiejsze (F6)"
     :panel/undo-deletion                             "Cofnij usunięcie"
     :panel/undo-deletion-info                        [:i18n/plural "Cofnij usunięcie {delete/num-units} {delete/unit-label} i {delete/num-links} {delete/link-label} (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "komórek" "komórki" "komórki"]
                                                                :link-label [:delete/num-links
                                                                             "linków" "linku" "linki"]}]
     :panel/refresh                                   "Odśwież"
     :panel/switch-style                              "Przełącz styl nowych komórek i linków; przeciągnij, aby utworzyć nową komórkę"
     :panel/profile                                   "Profil"
     :panel/settings                                  "Ustawienia"
     :panel/usergroups                                "Zespoły"
     :panel/stats                                     "Statystyki"
     :panel/administration                            "Administracja"
     :panel/ios-install-info                          "Zainstaluj aplikację"
     :panel/upload-attachment                         "Wstaw obrazy lub pliki do nowych komórek"
     :panel/selection-mode                            "Rozpocznij zaznaczanie"
     :panel/search                                    "Szukaj (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Odkryj {panel/num-hidden-book-ids} {panel/unit-label} ukrytych w bieżącej lokalizacji"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids
                                                                            "komórek" "komórki" "komórki"]}]

     :password/too-short                              "Wymagane co najmniej 8 znaków"
     :password/different-passwords                    "Hasła nie pasują"

     :password-reset/back-to-list                     "Powrót do listy"
     :password-reset/change-password                  "Zmień hasło"
     :password-reset/set-password                     "Ustaw hasło"
     :password-reset/has-password                     "Twoje konto ma ustawione hasło."
     :password-reset/without-password                 "Nie ustawiono jeszcze hasła, ponieważ do logowania użyto połączonych kont."
     :password-reset/invalid-link                     "Nieprawidłowy link, być może starszy niż 24 godziny. Poproś o ponowne wysłanie e-maila."
     :password-reset/description                      "Ustaw nowe hasło."
     :password-reset/enter-current-and-new-password   "Wprowadź bieżące hasło i nowe hasło."
     :password-reset/enter-new-password               "Wprowadź nowe hasło."

     :path/add-step                                   "Krok"
     :path/add-step-tooltip                           "ENTER lub TAB; przytrzymaj SHIFT, aby skopiować kamerę"
     :path/hidden-ops                                 " i {path/num-hidden} więcej"
     :path/title                                      "Nazwa prezentacji"
     :path/default-title                              "Prezentacja {path/num-paths}"
     :path/copy                                       "Kopiuj do nowej prezentacji"
     :path/copy-suffix                                "kopia"
     :path/add-audio                                  "Połącz audio z krokiem"
     :path/remove-audio                               "Odłącz audio od kroku"

     :paths/create-new-path                           "Utwórz prezentację"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Usunąć prezentację " [:b title] "?"])
     :paths/help                                      "Wybierz komórki, aby zmienić to, co jest wyświetlane; zobacz przewodnik, aby uzyskać szczegóły."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Obecnie w planie " [:b tier] ", ważnym do " [:b end-date] "."
                                                         (if autorenewal
                                                           " Subskrypcja zostanie automatycznie odnowiona na koniec okresu płatności."
                                                           " Subskrypcja wygaśnie na koniec okresu płatności.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Twój plan " [:b tier] " wygasł " [:b end-date] ", ponieważ płatność za odnowienie nie powiodła się."
                                                         " Jeśli naprawisz płatność, Twoja subskrypcja zostanie automatycznie przedłużona."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " w planie " [:b tier] " " name "."])
     :payments/free-tier-info                         [:<> "OrgPad używany w " [:b "planie darmowym,"] " bez żadnych płatności."]
     :payments/no-teams                               "Brak zespołów w planie darmowym."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "W celu " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "ulepszeń"] " lub "])
                                                         [:a.link-button {:href period-url} "zmiany okresu rozliczeniowego"]
                                                         ", skontaktuj się z nami."])
     :payments/choose-plan                            "Wybierz plan"
     :payments/manage-plan                            "Zarządzaj planem"
     :payments/billing-address                        "Adres rozliczeniowy"
     :payments/billing-address-info                   (str "Wprowadzony adres rozliczeniowy będzie używany na wszystkich nowych fakturach."
                                                           " Ostatnie faktury są również automatycznie aktualizowane.")
     :payments/receipt-label                          "Rachunek {receipt/date-range}"
     :payments/customer-portal-failed                 "Wystąpił błąd podczas ładowania strony zarządzania planem."

     :pending-activation/email-already-used           "E-mail jest już używany na innym koncie."
     :pending-activation/email-not-recieved           "Brak e-maila? Wyślij ponownie lub zmień poniżej."
     :pending-activation/email-sent                   "E-mail aktywacyjny wysłany. "
     :pending-activation/instructions                 "Prawie gotowe! Aktywuj swoje konto jednym kliknięciem linku, który wysłaliśmy Ci e-mailem."
     :pending-activation/resend                       "Wyślij ponownie e-mail aktywacyjny"

     :permission/admin                                "Może udostępniać i usuwać"
     :permission/admin-tooltip                        "Może również modyfikować, kto jeszcze ma dostęp do dokumentu."
     :permission/edit                                 "Może edytować"
     :permission/edit-tooltip                         "Może wprowadzać dowolne zmiany w OrgStronie."
     :permission/comment                              "Może komentować"
     :permission/comment-tooltip                      (str "Może tworzyć nowe własne komórki, łączyć je i modyfikować. "
                                                           "Nie może modyfikować reszty OrgStrony.")
     :permission/view                                 "Może czytać"
     :permission/view-tooltip                         "Może czytać OrgStronę bez wprowadzania żadnych zmian."

     :presentation/presentation                       "Prezentacja"
     :presentation/step                               "Krok"
     :presentation/present                            "Rozpocznij prezentację"
     :presentation/slideshow                          "Automatycznie odtwarzaj kroki"
     :presentation/step-duration                      "Czas trwania kroku w sekundach"
     :presentation/loop-slideshow                     "Powtórz na końcu"
     :presentation/respect-audio-track                "Czas trwania kroku zgodnie ze ścieżką audio"
     :presentation/stop-slideshow                     "Zatrzymaj automatyczne odtwarzanie kroków"
     :presentation/exit-tooltip                       "Wyjdź z prezentacji"
     :presentation/play-audio                         "Odtwórz audio dla tego kroku"
     :presentation/pause-audio                        "Wstrzymaj odtwarzanie audio"
     :presentation/share-presentation                 "Udostępnij tę prezentację innym."

     :pricing-popup/orgpages-exceeded-title           "Nie możesz utworzyć więcej OrgStron w planie darmowym"
     :pricing-popup/orgpages-exceeded                 "Musisz ulepszyć swój plan."
     :pricing-popup/storage-exceeded-title            "Za mało miejsca na przesłanie {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "W Twojej pamięci masowej pozostało tylko " [:b space-left] "."
                                                         " Możesz ulepszyć swój plan, aby rozszerzyć swoją pamięć masową."])
     :pricing-popup/num-shared-limit-reached-title    "Nie możesz udostępnić tej OrgStrony większej liczbie osób"
     :pricing-popup/num-shared-limit-reached-common   "Osiągnięto maksymalną liczbę osób udostępniających tę OrgStronę."
     :pricing-popup/num-shared-limit-reached          [:<> " Aby dodać więcej osób, musisz ulepszyć do "
                                                       [:b "planu profesjonalnego"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Właściciel tej OrgStrony " owner " musi ulepszyć do "
                                                         [:b "planu profesjonalnego"] ", aby dodać więcej osób."])
     :pricing-popup/enable-teams-title                "Ulepsz swój plan, aby zarządzać zespołami"
     :pricing-popup/enable-teams                      [:<> "Zespoły grupują ludzi, co upraszcza współpracę i udostępnianie OrgStron."
                                                       " Ta funkcja jest włączona tylko w " [:b "planie standardowym"] " lub wyższym."]
     :pricing-popup/teams-limit-reached-title         "Ulepsz swój plan, aby tworzyć więcej zespołów"
     :pricing-popup/teams-limit-reached               "Osiągnięto limit liczby zespołów dla Twojego planu."
     :pricing-popup/team-members-limit-reached-title  "Nie możesz dodać więcej członków do {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Osiągnięto maksymalną liczbę członków zespołu."
     :pricing-popup/team-members-limit-reached        [:<> " Aby dodać więcej członków, musisz ulepszyć do "
                                                       [:b "planu profesjonalnego"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " Właściciel tego zespołu " owner " musi ulepszyć do "
                                                         [:b "planu profesjonalnego"] ", aby dodać więcej członków."])
     :pricing-popup/try-out-share-title               "Zarejestruj się, aby udostępnić tę OrgStronę"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "W Twojej pamięci masowej pozostało tylko " [:b space-left] "."])
     :pricing-popup/free-account-info                 "Rejestrując się, otrzymujesz za darmo:"
     :pricing-popup/free-limit                        "do trzech OrgStron,"
     :pricing-popup/free-storage                      "do 100 MB pamięci masowej,"
     :pricing-popup/free-share                        "udostępnianie swojej pracy innym."
     :pricing-popup/free-account-info2                "Utwórz swoje konto w zaledwie kilka kliknięć."

     :pricing-popup/register-to-comment               "Zarejestruj się, aby dodać swoje komentarze"
     :pricing-popup/register-to-comment-info          (str "Komórki komentarzy będą wyświetlać Twoje imię i zdjęcie profilowe."
                                                           " W tym celu musisz najpierw utworzyć swoje konto.")

     :pricing-popup/print-watermark-title             "Ulepsz swój plan, aby nie było znaków wodnych"
     :pricing-popup/print-watermark-info              (str "Drukowanie bez znaków wodnych OrgPad.info jest możliwe tylko"
                                                           " w planach profesjonalnych, szkolnych i dla przedsiębiorstw.")

     :profile/open-contact-dialog                     "Wyślij wiadomość"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Skontaktuj się z " first-name " " last-name)
                                                          "Skontaktuj się z tą osobą"))
     :profile/contact-dialog-info                     (str "Ponieważ nie udostępniamy adresów e-mail innych osób w OrgPad, wyślemy tę wiadomość za Ciebie. "
                                                           "Dołączymy Twoje imię i adres e-mail, aby zapewnić bezpośredni kontakt.")

     :promotion/unknown                               "Nieznany kod"
     :promotion/max-usages-reached                    "Użyto zbyt wiele razy"
     :promotion/expired                               "Wygasł"
     :promotion/one-year-free                         "1 rok za darmo"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} za darmo"
                                                       {:promotion/days [:promotion/duration "dni" "dzień" "dni"]}]
     :promotion/for-one-year                          " na 1 rok"
     :promotion/for-six-months                        " na 6 miesięcy"

     :props/h1                                        "Duży tytuł"
     :props/h2                                        "Średni tytuł"
     :props/h3                                        "Mały tytuł"
     :props/weight-none                               "Normalny link"
     :props/strong                                    "Mocny link"
     :props/arrowhead-none                            "Brak strzałki"
     :props/single                                    "Strzałka"
     :props/double                                    "Podwójna strzałka"

     :public-permission/none                          "prywatny."
     :public-permission/view                          "udostępniony wszystkim do czytania."

     :registration/create-user                        "Utwórz konto"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Masz już konto? " [:a.link-button {:href route} "Zaloguj się"]])
     :registration/options                            "Wybierz inny sposób rejestracji"
     :registration/server-error                       "Błąd serwera. Spróbuj utworzyć konto ponownie."
     :registration/missing-oauth-email                "{{registration/service}} nie przekazał nam Twojego adresu e-mail. Wpisz go poniżej."

     :search/previous-match                           "Poprzednie dopasowanie (PAGE UP); pierwsze dopasowanie (HOME)"
     :search/next-match                               "Następne dopasowanie (PAGE DOWN, ENTER); ostatnie dopasowanie (END)"
     :search/close                                    "Zamknij (ESC)"
     :search/cells-with-selected-attachments          "Komórki z wybranymi plikami i obrazami."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Zmień styl wybranych "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} i "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; przytrzymaj SHIFT, aby ustawić bieżący, przytrzymaj CTRL, aby skopiować do bieżącego"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "komórek" "komórki" "komórki"]
                                                                   :link-label [:selection/num-links
                                                                                "linków" "linku" "linki"]}]

     :selection/link                                  "Połącz komórki"
     :selection/hide-contents                         "Ukryj zawartość (ESC)"
     :selection/show-contents                         "Pokaż zawartość"
     :selection/force-closing                         "Ukryj tę zawartość podczas otwierania lokalizacji (ESC)"
     :selection/step-focus-camera                     "Skieruj kamerę tego kroku dokładnie na wybrane komórki (F2 lub Q); przytrzymaj SHIFT, aby dodać, ALT, aby usunąć."
     :selection/fragment-focus-camera                 "Skieruj kamerę lokalizacji dokładnie na wybrane komórki (F2 lub Q); przytrzymaj SHIFT, aby dodać, ALT, aby usunąć."
     :selection/step-show-books                       "Pokaż dokładnie wybrane komórki w tym kroku (F3 lub W); przytrzymaj SHIFT, aby dodać, ALT, aby usunąć."
     :selection/fragment-show-books                   "Pokaż dokładnie wybrane komórki w lokalizacji (F3 lub W); przytrzymaj SHIFT, aby dodać, ALT, aby usunąć."
     :selection/force-showing                         "Odkryj wybrane komórki, jeśli były wcześniej ukryte"
     :selection/share-units                           "Kopiuj link wyświetlający wybrane jednostki; przytrzymaj SHIFT, aby zamiast tego otworzyć ustawienia lokalizacji"
     :selection/move-to-new-orgpage                   "Przenieś do nowej OrgStrony"
     :selection/change-code-lang                      "Zmień język kodu"
     :selection/copy-units-links                      "Kopiuj komórki i linki do schowka"
     :selection/flip-links                            "Odwróć kierunki linków"
     :selection/delete                                "Usuń zaznaczone"

     :settings/profile                                "Profil"
     :settings/payments                               "Płatności"
     :settings/account                                "Konto"
     :settings/linked-accounts                        "Połączone konta"
     :settings/email                                  "Powiadomienia"
     :settings/account-description                    "Zmień adres e-mail, hasło lub usuń swoje konto."
     :settings/stats-description                      "Oto kilka statystyk dotyczących Twojego korzystania z OrgPad."
     :settings/change-email                           "Zmień adres e-mail"
     :settings/change-email-text                      "Wprowadź nowy adres e-mail. Ze względów bezpieczeństwa musimy go zweryfikować przed odblokowaniem konta."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Zarejestrowałeś się, używając adresu e-mail " [:b email] "."])
     :settings/account-linked-to-facebook             [:<> "Twoje konto jest " [:b "połączone"] " z Facebookiem."]
     :settings/account-not-linked-to-facebook         [:<> "Twoje konto " [:b "nie jest połączone"] " z Facebookiem."]
     :settings/link-fb                                "Połącz z Facebookiem"
     :settings/unlink-fb                              "Odłącz od Facebooka"
     :settings/account-linked-to-google               [:<> " Twoje konto jest " [:b "połączone"] " z Google."]
     :settings/account-not-linked-to-google           [:<> " Twoje konto " [:b "nie jest połączone"] " z Google."]
     :settings/link-google                            "Połącz z Google"
     :settings/unlink-google                          "Odłącz od Google"
     :settings/account-linked-to-microsoft            [:<> " Twoje konto jest " [:b "połączone"] " z Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> " Twoje konto " [:b "nie jest połączone"] " z Microsoft."]
     :settings/link-microsoft                         "Połącz z Microsoft"
     :settings/unlink-microsoft                       "Odłącz od Microsoft"
     :settings/account-linked-to-cuni                 [:<> " Twoje konto jest " [:b "połączone"] " z Uniwersytetem Karola."]
     :settings/account-not-linked-to-cuni             [:<> " Twoje konto " [:b "nie jest połączone"] " z Uniwersytetem Karola."]
     :settings/link-cuni                              "Połącz z Uniwersytetem Karola"
     :settings/unlink-cuni                            "Odłącz od Uniwersytetu Karola"
     :settings/set-password-text                      " Ustaw hasło przed odłączeniem."
     :settings/linked-accounts-info                   "Połącz swoje konto na Facebooku, Google, Microsoft lub Uniwersytecie Karola z OrgPad, aby móc logować się przy ich użyciu."
     :settings/profile-info                           "Dzięki tym informacjom współpracownicy w projekcie łatwiej Cię znajdą."
     :settings/delete-account                         "Usuń konto"
     :settings/confirm-delete-account-question        [:<> [:b "Trwale"] " usunąć konto?"]
     :settings/confirm-delete-account-info            "Spowoduje to usunięcie wszystkich Twoich OrgStron i ich danych."
     :settings/delete-account-info                    [:<> "Usunięcie spowoduje " [:b "trwałe"] " usunięcie wszystkich Twoich OrgStron i ich danych."]

     :share-orgpage/campaigns                         "Kampanie"
     :share-orgpage/copied-to-clipboard               "Skopiowano do schowka"
     :share-orgpage/copy-template-link                "Kopiuj link do szablonu"
     :share-orgpage/dialog-title                      "Udostępnij {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Osoby bez konta OrgPad otrzymają zaproszenie z linkiem."
                                                                  " Po otwarciu linku będą mogły przeczytać tę OrgStronę. ")
                                                         [:a.link-button create-team "Utwórz zespół"]
                                                         ", aby łatwo udostępniać OrgStrony grupie osób."])
     :share-orgpage/email-found                       "Znaleziono konto OrgPad."
     :share-orgpage/email-unused                      "Nie znaleziono konta OrgPad. Zamiast tego wyślij zaproszenie e-mailem."
     :share-orgpage/checking-email-address            "Sprawdzanie adresu e-mail…"
     :share-orgpage/invite-for-editing                "Zaproś do edycji"
     :share-orgpage/invite-for-viewing                "Zaproś do czytania"
     :share-orgpage/invite-by-email                   "Czy chcesz zaprosić ich e-mailem w określonym języku?"
     :share-orgpage/show-profile                      "Pokaż profil"
     :share-orgpage/links                             "Linki"
     :share-orgpage/to-read                           "do czytania"
     :share-orgpage/to-comment                        "do komentowania"
     :share-orgpage/to-edit                           "do edycji"
     :share-orgpage/links-tooltip                     "Udziel dostępu za pomocą linków do udostępniania"
     :share-orgpage/template                          "Szablon"
     :share-orgpage/template-tooltip                  "Linki automatycznie tworzące kopię tej OrgStrony"
     :share-orgpage/template-info                     "Ludzie mogą użyć tego linku, aby utworzyć własne kopie tej OrgStrony."
     :share-orgpage/template-autoshare-none           "Nie udostępniaj mi kopii."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Udostępnij mi kopie do "
                                                             (case template-autoshare
                                                               :permission/view "czytania"
                                                               :permission/comment "komentowania"
                                                               :permission/edit "edycji") "."))
     :share-orgpage/embed                             "Osadź"
     :share-orgpage/embed-into-microsoft-teams        "Osadź w Microsoft Teams"
     :share-orgpage/embed-into-website                "Osadź na stronie internetowej lub w aplikacji"
     :share-orgpage/embed-tooltip                     "Osadź na stronie internetowej lub w aplikacji"
     :share-orgpage/new-user-or-usergroup             "Nazwa, e-mail lub zespół"
     :share-orgpage/link-permission-start             "Zezwól ludziom"
     :share-orgpage/link-permission-end               "na tę OrgStronę."
     :share-orgpage/orgpage-info                      "Informacje"
     :share-orgpage/orgpage-info-tooltip              "Informacje o właścicielu i o tym, czy OrgStrona jest opublikowana"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Ta OrgStrona jest Ci udostępniona do "
                                                             (case user-permission
                                                               :permission/view "czytania"
                                                               :permission/comment "komentowania"
                                                               :permission/edit "edycji") "."))
     :share-orgpage/remove-yourself                   "Usuń siebie"
     :share-orgpage/private-info                      "Dostęp masz tylko Ty i osoby, którym udostępniłeś OrgStronę bezpośrednio lub za pomocą linku. Każda nowo utworzona OrgStrona jest prywatna."
     :share-orgpage/publish-for-reading-info          "OrgStrona jest publiczna. Każdy w Internecie może ją wyszukać i przeczytać. Zmiany mogą wprowadzać tylko Ty lub osoby, którym udostępniłeś OrgStronę do edycji."
     :share-orgpage/publish-permission-end            "Ta OrgStrona jest "
     :share-orgpage/publish                           "Opublikuj"
     :share-orgpage/publish-confirmation              "Każdy będzie mógł {orgpage/permission} tę OrgStronę. Jesteś pewien?"
     :share-orgpage/publish-tooltip                   "Udziel dostępu wszystkim"
     :share-orgpage/remove-user                       "Usuń uprawnienia"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Jeśli przypadkowo udostępniłeś link, możesz "
                                                         [:span.link-button reset-links "unieważnić wszystkie poprzednie linki"]
                                                         "."])
     :share-orgpage/shareable-link                    "Link do udostępniania"
     :share-orgpage/everything-closed                 "Wyświetl wszystkie komórki zamknięte"
     :share-orgpage/presentation                      "Rozpocznij od prezentacji"
     :share-orgpage/fragment                          "Wyświetl lokalizację"
     :share-orgpage/template-link-switch              "Utwórz link do szablonu."
     :share-orgpage/user-not-registered               " jeszcze nie zarejestrował się w OrgPad."
     :share-orgpage/users                             "Ludzie"
     :share-orgpage/users-tooltip                     "Udziel dostępu poszczególnym osobom"

     :side-panel/about                                "Strona główna"
     :side-panel/terms-and-conditions                 "Warunki korzystania z usługi"
     :side-panel/privacy-and-security                 "Prywatność i bezpieczeństwo"
     :side-panel/files-and-images                     "Pliki i obrazy"
     :side-panel/paths                                "Prezentacje"
     :side-panel/fragments                            "Lokalizacje"
     :side-panel/translate                            "Tłumacz"
     :side-panel/toggle-debug                         "Debuger"
     :side-panel/help                                 "Pomoc"
     :side-panel/blog                                 "Blog"
     :side-panel/home                                 "Strona główna"
     :side-panel/import                               "Importuj"
     :side-panel/share                                "Udostępnij"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "plików" "pliku" "pliki"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "obrazów" "obrazu" "obrazy"]}]
     :side-panel/num-paths                            [:i18n/plural "{side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "prezentacji" "prezentacji" "prezentacje"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "lokalizacji" "lokalizacji" "lokalizacje"]}]

     :step/closed-books                               "Zamknięte komórki; CTRL+klik, aby wybrać"
     :step/everything-closed                          "Wszystko zamknięte"
     :step/hidden-books                               "Ukryte komórki; CTRL+klik, aby wybrać"
     :step/nothing-changed                            "Nic się nie zmieniło"
     :step/opened-pages                               "Otwarte strony; CTRL+klik, aby wybrać"
     :step/focused-books                              "Komórki pokazane w kamerze; CTRL+klik, aby wybrać"
     :step/shown-books                                "Odkryte komórki; CTRL+klik, aby wybrać"
     :step/switched-pages                             "Przełączone strony; CTRL+klik, aby wybrać"

     :style-select/set-comment                        "Zmień na komórkę komentarza ze swoim zdjęciem profilowym (CTRL+,)"
     :style-select/unset-comment                      "Zmień na normalną komórkę, usuwając zdjęcie profilowe (CTRL+,)"
     :style-select/set-comment-safari                 "Zmień na komórkę komentarza ze swoim zdjęciem profilowym (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Zmień na normalną komórkę, usuwając zdjęcie profilowe (SHIFT+CMD+,)"

     :tag/public                                      "publiczny"

     :text-field/email                                "E-mail"
     :text-field/first-name                           "Imię"
     :text-field/last-name                            "Nazwisko"
     :text-field/name                                 "Nazwa"
     :text-field/new-password                         "Nowe hasło"
     :text-field/password                             "Hasło"
     :text-field/content                              "Treść"
     :text-field/name-or-email                        "Nazwa lub e-mail"
     :text-field/subject                              "Temat"
     :text-field/message                              "Wiadomość"
     :text-field/phone-number                         "Numer telefonu"
     :text-field/width                                "Szerokość"
     :text-field/height                               "Wysokość"

     :translate/title                                 "Przetłumacz OrgStronę {orgpage/title} na inny język"
     :translate/info                                  (str "Automatycznie tworzy kopię tej OrgStrony należącą do Ciebie,"
                                                           " przetłumaczoną z języka źródłowego na docelowy."
                                                           " Znajdziesz ją na swojej liście w ciągu minuty.")
     :translate/source-lang                           "Język źródłowy"
     :translate/target-lang                           "Język docelowy"
     :translate/translate                             "Przetłumacz"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Tłumaczenie dostępne jako "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :unit-editor/add-page                            "Utwórz kolejną stronę (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "Usuń tę stronę"
     :unit-editor/previous-page                       (str "Poprzednia strona (PAGEUP);"
                                                           " przytrzymaj SHIFT, aby przenieść tę stronę w lewo (SHIFT+PAGEUP);"
                                                           " przytrzymaj CTRL, aby dodać kolejną stronę przed tą stroną (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "Następna strona (PAGEDOWN);"
                                                           " przytrzymaj SHIFT, aby przenieść tę stronę w prawo (SHIFT+PAGEDOWN);"
                                                           " przytrzymaj CTRL, aby dodać kolejną stronę po tej stronie (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Przełącz na tę stronę"
                                                             (when can-edit "; przytrzymaj SHIFT, aby przenieść bieżącą stronę tam")))
     :unit-editor/hidden-info                         "Kliknij, aby napisać"
     :unit-editor/undo                                "Cofnij (CTRL+Z)"
     :unit-editor/redo                                "Ponów (CTRL+SHIFT+Z lub CTRL+Y)"
     :unit-editor/toggle-bold                         "Pogrubienie (CTRL+B)"
     :unit-editor/toggle-italic                       "Kursywa (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Przekreślenie"
     :unit-editor/toggle-subscript                    "Indeks dolny (CTRL+S)"
     :unit-editor/toggle-superscript                  "Indeks górny (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Utwórz hiperłącze (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Usuń hiperłącze"
     :unit-editor/set-highlighting                    "Kolor podświetlenia"
     :unit-editor/selection->code                     "Konwertuj na kod (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Lista wypunktowana (TAB)"
     :unit-editor/toggle-list-ol                      "Lista numerowana (CTRL+O)"
     :unit-editor/indent                              "Zwiększ wcięcie (TAB)"
     :unit-editor/outdent                             "Zmniejsz wcięcie (SHIFT+TAB)"
     :unit-editor/center                              "Wyrównaj do środka (CTRL+L)"
     :unit-editor/heading                             "Nagłówek (CTRL+G)"
     :unit-editor/embed-pdf                           "Pokaż zawartość PDF"
     :unit-editor/link-pdf                            "Zastąp zawartość PDF hiperłączem"
     :unit-editor/embed-office                        "Pokaż zawartość dokumentu za pomocą Microsoft 365"
     :unit-editor/link-office                         "Zastąp zawartość dokumentu hiperłączem"
     :unit-editor/embed-video                         "Wyświetl odtwarzacz wideo"
     :unit-editor/link-video                          "Zastąp wideo hiperłączem"
     :unit-editor/embed-audio                         "Wyświetl odtwarzacz audio"
     :unit-editor/link-audio                          "Zastąp audio hiperłączem"
     :unit-editor/hyperlink->embed                    "Wstaw połączoną stronę internetową"
     :unit-editor/embed->hyperlink                    "Zastąp osadzoną stronę internetową hiperłączem"
     :unit-editor/open-image-in-attachments           "Otwórz ten obraz na liście załączników"
     :unit-editor/open-file-in-attachments            "Otwórz ten plik na liście załączników"
     :unit-editor/toggle-controls                     "Wyświetl kontrolki odtwarzacza wideo"
     :unit-editor/toggle-autoplay                     "Odtwarzaj automatycznie"
     :unit-editor/toggle-muted                        "Odtwarzaj wyciszone, w przeciwnym razie automatyczne odtwarzanie może być zablokowane"
     :unit-editor/toggle-loop                         "Odtwarzanie w pętli"
     :unit-editor/toggle-chained-size                 "Zachowaj proporcje"
     :unit-editor/insert-menu                         "Wstaw"
     :unit-editor/insert-image                        "Obraz"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Prześlij obraz z Twojego urządzenia."
     :unit-editor/insert-image-info2                  "Wskazówka: Przeciągnij lub wklej obrazy bezpośrednio do dowolnej komórki lub szarego płótna."
     :unit-editor/insert-camera                       "Kamera"
     :unit-editor/insert-attachment                   "Plik"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Wideo"
     :unit-editor/insert-video-info                   "Prześlij wideo z komputerа lub wstaw je z YouTube."
     :unit-editor/insert-video-info2                  "Wskazówka: Przeciągnij filmy i miniatury YouTube bezpośrednio do dowolnej komórki lub szarego płótna."
     :unit-editor/video-url                           "Link do YouTube"
     :unit-editor/youtube-start                       "Start"
     :unit-editor/youtube-end                         "Koniec"
     :unit-editor/insert-table                        "Tabela"
     :unit-editor/insert-table-info                   "Wybierz rozmiar wstawianej tabeli."
     :unit-editor/toggle-table-border                 "Pokaż obramowanie tabeli"
     :unit-editor/add-row-before                      "Wstaw wiersz powyżej"
     :unit-editor/add-row-after                       "Wstaw wiersz poniżej"
     :unit-editor/remove-current-row                  "Usuń wiersz"
     :unit-editor/add-column-before                   "Wstaw kolumnę przed"
     :unit-editor/add-column-after                    "Wstaw kolumnę po"
     :unit-editor/remove-current-column               "Usuń kolumnę"
     :unit-editor/remove-table                        "Usuń tabelę"
     :unit-editor/insert-website                      "Strona internetowa"
     :unit-editor/insert-website-info                 (str "Możesz osadzać strony internetowe bezpośrednio w komórce."
                                                           " Jeśli to nie działa, może to być zablokowane przez właściciela strony internetowej.")
     :unit-editor/website-url-or-code                 "Adres strony internetowej lub kod"
     :unit-editor/website-id                          "Identyfikator strony internetowej"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Używane do "
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "wysyłania wiadomości między stronami internetowymi"] "."])
     :unit-editor/invalid-website-url                 "Nieprawidłowy adres strony internetowej lub kod"
     :unit-editor/invalid-video-url                   "Nieprawidłowy adres wideo"
     :unit-editor/update-website                      "Zmień adres strony internetowej"
     :unit-editor/insert-orgpage                      "OrgStrona"
     :unit-editor/insert-code                         "Kod"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Kopiuj kod"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Kod jako osobny akapit"
     :unit-editor/toggle-block-math                   "Matematyka w osobnej linii"
     :unit-editor/remove-code                         "Usuń formatowanie kodu"
     :unit-editor/insert-math                         "Matematyka / Chemia"

     :unit-panel/link                                 (str "Kliknij lub przeciągnij, aby połączyć;"
                                                           " przytrzymaj SHIFT, aby utworzyć wiele połączeń;"
                                                           " przytrzymaj CTRL, aby utworzyć łańcuch komórek")
     :unit-panel/upload-attachment                    "Wstaw obraz lub plik do tej komórki"
     :unit-panel/change-link-style                    (str "Zmień styl tej komórki; "
                                                           "przytrzymaj SHIFT, aby ustawić bieżący, "
                                                           "przytrzymaj CTRL, aby skopiować do domyślnego; "
                                                           "przeciągnij, aby połączyć w tym stylu")
     :unit-panel/hide-content                         "Ukryj zawartość"
     :unit-panel/delete-unit                          "Usuń komórkę"

     :usergroup/create                                "Utwórz zespół"
     :usergroup/edit-title                            "Edytuj {usergroup/name}"
     :usergroup/info                                  "Twórz i zarządzaj zespołami znajomych i współpracowników, aby uprościć udostępnianie OrgStron."
     :usergroup/delete                                "Usuń zespół"
     :usergroup/members                               "Członkowie"
     :usergroup/edit                                  "Zmień nazwę i logo zespołu"
     :usergroup/show-actions                          "Pokaż akcje"
     :usergroup/name                                  "Nazwa"
     :usergroup/hide-orgpages                         "Ukryj udostępnione OrgStrony"
     :usergroup/hide-orgpages-tooltip                 "Można je wyświetlić, włączając zespół w filtrze"
     :usergroup/hide-in-filter                        "Ukryj w filtrze"
     :usergroup/create-info                           "Nazwa zespołu i zdjęcie profilowe są widoczne tylko dla członków zespołu."
     :usergroup/confirm-delete                        [:<> [:b "Trwale"] " usunąć ten zespół?"]
     :usergroup/members-title                         "Członkowie zespołu {usergroup/name}"
     :usergroup/remove-member                         "Usuń z zespołu"
     :usergroup/remove-admin                          "Usuń administratora"
     :usergroup/make-admin                            "Ustaw jako administratora"
     :usergroup/admin-tooltip                         "Administrator może zarządzać członkami i usuwać zespół."
     :usergroup/copy-usergroup                        "Kopiuj zespół"

     :usergroup-role/owner                            "Właściciel"
     :usergroup-role/admin                            "Administrator"
     :usergroup-role/member                           "Członek"

     :wire-transfer/title                             "Przelew bankowy za roczny plan {wire-transfer/tier}"
     :wire-transfer/info                              "Aktywujemy Twoją roczną subskrypcję po otrzymaniu pieniędzy na nasze konto."
     :wire-transfer/used-currency                     "Płatność w {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Nazwa odbiorcy"
     :wire-transfer/account-number                    "Numer konta"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Kwota"
     :wire-transfer/payment-purpose                   "Cel płatności"
     :wire-transfer/qr-code-common                    (str "Zeskanuj ten kod QR płatności za pomocą swojej aplikacji bankowej, aby automatycznie wypełnić"
                                                           " prawidłowe informacje.")
     :wire-transfer/cz-sk-qr-code-description         (str " Jest to kod QR powszechnie używany do przelewów bankowych"
                                                           " w Czechach i na Słowacji.")
     :wire-transfer/eu-qr-code-description            (str " Jest to kod QR powszechnie używany do przelewów SEPA"
                                                           " w Unii Europejskiej.")
     :wire-transfer/trial-info                        (str "Możesz rozpocząć jednorazową 7-dniową subskrypcję, aby natychmiast w pełni korzystać z OrgPad."
                                                           " Gdy bank potwierdzi pomyślną płatność,"
                                                           " okres subskrykcji zostanie przedłużony o 1 rok.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Jeśli masz jakieś pytania lub trudności, daj nam znać, "
                                                         " " [:a.link-button {:href url} "wypełniając ten formularz"] "."])
     :wire-transfer/success-text                      [:<> "Aktywowaliśmy " [:b "jednorazową 7-dniową subskrypcję"]
                                                       ", abyś mógł natychmiast korzystać z OrgPad z nowym planem. "]
     :wire-transfer/common-result-text                (str "Gdy bank potwierdzi pomyślną płatność,"
                                                           " okres subskrypcji zostanie przedłużony"
                                                           " o 1 rok.")
     :wire-transfer/start-trial                       "Przelew bankowy wysłany"
     :wire-transfer/start-trial-result-title          "Dziękujemy za płatność"
     :wire-transfer/copy                              "Kopiuj do schowka"

     :website-editor/settings                         "Ustawienia"
     :website-editor/routes                           "Trasy"
     :website-editor/menus                            "Menu"
     :website-editor/create-menu                      "Utwórz menu"
     :website-editor/edited-menu                      "Edytowane menu"
     :website-editor/untitled-menu                    "Menu bez tytułu"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "elementów podrzędnych" "elementu podrzędnego" "elementy podrzędne"]}]
     :website-editor/delete-menu-item                 "Usuń ten element menu"
     :website-editor/add-menu-item                    "Dodaj element menu"
     :website-editor/menu-item-label                  "Etykieta elementu"
     :menu-item/path-type                             "Otwiera trasę"
     :menu-item/url-type                              "Otwiera zewnętrzny adres URL"
     :menu-item/children-type                         "Otwiera podmenu"
     :website-editor/menu-item-path                   "Trasa"

     :youtube-placement/watch-on-prefix               (str "Oglądaj" unicode/nbsp "na")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/pl dict)