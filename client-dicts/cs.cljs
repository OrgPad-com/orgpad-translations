(ns orgpad.client.i18n.dicts.cs)

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  {:lang/name                                     "Čeština"
   :lang/en-name                                  "Czech"
   :lang/plural-breaks                            [0 1 2 5] ; Counts of elements for which the next translation for :i18n/plural is used.

   :attachments/allows-access-to-file             "Umožnit přístup k tomuto souboru."
   :attachments/allows-access-to-image            "Umožnit přístup k tomuto obrázku."
   :attachments/no-preview                        "Náhled nedostupný"
   :attachments/used-files                        "Soubory v OrgStránce"
   :attachments/unused-files                      "Soubory stranou"
   :attachments/used-images                       "Obrázky v OrgStránce"
   :attachments/unused-images                     "Obrázky stranou"
   :attachments/uploading-files                   "Nahrávání souborů ..."

   :button/back                                   "Zpět"
   :button/cancel                                 "Zrušit"
   :button/close                                  "Zavřít"
   :button/copied                                 "Zkopírováno"
   :button/copy                                   "Kopírovat"
   :button/copy-link                              "Kopírovat odkaz"
   :button/create                                 "Vytvořit"
   :button/create-tooltip                         "Vytvořit (Ctrl+Enter)"
   :button/delete                                 "Smazat"
   :button/delete-selected                        "Smazat vybrané"
   :button/documentation                          "Dokumentace"
   :button/download                               "Stáhnout"
   :button/download-all                           "Stáhnout vše"
   :button/drop                                   "Pustit"
   :button/edit                                   "Upravit"
   :button/import                                 "Importovat"
   :button/login                                  "Přihlásit"
   :button/logout                                 "Odhlásit"
   :button/publish                                "Zveřejnit"
   :button/read                                   "Číst"
   :button/register                               "Registrovat"
   :button/save                                   "Uložit změny"
   :button/save-tooltip                           "Uložit změny (Ctrl+Enter)"
   :button/upload                                 "Nahrát"
   :button/send                                   "Poslat"
   :button/present                                "Prezentovat"
   :button/present-tooltip                        "Prezentovat (F5)"
   :button/agree                                  "Souhlasit a zavřít"
   :button/share                                  "Sdílet"
   :button/exit                                   "Ukončit"
   :button/show-password                          "Ukázat"
   :button/hide-password                          "Skrýt"

   :consent/popup-text                            (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                    [:div.consent-text
                                                     "Používáním této stránky souhlasíte s "
                                                     [:a terms-and-conditions "pravidly a podmínkami"]
                                                     " společnosti OrgPad a se "
                                                     [:a privacy-policy "zásadami ochrany osobních údajů"]
                                                     ". Pro určitou funkcionalitu, kterou usnadňujeme práci uživatelům OrgPadu, využíváme cookies."])

   :dashboard/confirm-delete                      [:<> [:b "Trvale"] " smazat tuto OrgStránku?"]
   :dashboard/login-needed                        [:<> "Abyste mohli vytvořit novou OrgStránku, " [:b "přihlaste se"] " nebo " [:b "se registrujte"] "."]
   :dashboard/owned-orgpages                      "Moje OrgStránky"
   :dashboard/public-orgpages                     "Veřejné OrgStránky"
   :dashboard/shared-orgpages                     "OrgStránky sdílené s Vámi"
   :dashboard/usergroup-orgpages                  "OrgStránky týmu {usergroup/name}"
   :dashboard/public-permission-edit              "Sdílená s každým pro úpravy"
   :dashboard/public-permission-view              "Sdílená s každým pro čtení"

   :editors/flip-link                             "Změnit směr"
   :editors/insert-unit-in-middle                 "Vložit buňku doprostřed"
   :editors/delete-link                           "Smazat spoj"
   :editors/change-link-style                     "Změnit styl spoje; podržte SHIFT pro nastavení aktuálního stylu, podržte CTRL pro zkopírování do aktuálního stylu"

   :editors/create-page                           "Vytvořit další stránku"
   :editors/remove-page                           "Odstranit tuto stránku"
   :editors/previous-page                         "Předchozí stránka; podržte SHIFT pro přesunutí této stránky doleva"
   :editors/next-page                             "Následující stránka; podržte SHIFT pro přesunutí této stránky doprava"
   :editors/title                                 "Nadpis"
   :editors/switch-page                           "Přepnout na tuto stránku; podržte SHIFT podržte SHIFT pro přesunutí aktuální stránky sem"
   :editors/switch-to-this-page                   (fn [{:render/keys [can-edit]}]
                                                    (str "Přepnout na tuto stránku"
                                                         (when can-edit "; podržte SHIFT podržte SHIFT pro přesunutí aktuální stránky sem")))

   :embedding-code/code                           "Kód"
   :embedding-code/description                    "Pro vložení OrgStránky do vaší webové stránky, zkopírujte do Vaší webové stránky následující kód:"

   :error/orgpage-access-denied                   "K této OrgStránce nemáte přístup."
   :error/usergroup-access-denied                 "Zamítnuta práva k editaci týmu."
   :error/already-member                          "„{usergroups/member}“ už je členem."
   :error/administration-access                   "Administrátorský přístup zamítnut."
   :error/creation-unauthorized                   "Pro vytvoření OrgStránky se přihlaste."
   :error/deleting-denied                         "Smazání OrgStránky zamítnuto."
   :error/email-already-used                      "Email už se používá."
   :error/email-not-registered                    "Žádný účet s tímto emailem."
   :error/email-missing-mx-record                 "Emailový server na doméně nenalezen."
   :error/email-invalid                           "Není email."
   :error/error                                   "Chyba: "
   :error/safari-unsupported                      (str "Webový prohlížeč Safari není v současnosti podporován."
                                                       " Prosím, použijte jiný webový prohlížeč, například "
                                                       " Google Chrome, Microsoft Edge, Vivaldi nebo Firefox.")
   :error/incorrect-id                            (fn [{:orgpage/keys [id]}]
                                                    (str "Chybná OrgStránka" (when id " {orgpage/id}")
                                                         ". Špatně zkopírovaný odkaz?"))
   :error/incorrect-link                          "Chybný odkaz. Buď se přihlaste, nebo otevřete správný odkaz."
   :error/incorrect-password                      "Nesprávné heslo"
   :error/lost-permission                         "Ztracený přístup k této OrgStránce."
   :error/name-already-used                       "Jméno se již používá."
   :error/orgpage-removed                         (fn [{:orgpage/keys [title]}]
                                                    (str "OrgStránka" (when title "\"{orgpage/title}\"")
                                                         " byla odstraněna."))
   :error/owner-of-orgpage                        "Uživatel už je vlastníkem OrgStránky."
   :error/passwords-mismatch                      "Hesla se neshodují."
   :error/unknown-error                           "Neznámá chyba, zkuste to znovu."
   :error/unknown-id                              "Neznámá OrgStránka."
   :error/unknown-login-or-email                  "Neznámý email nebo login týmu."
   :error/unknown-user                            "„{usergroups/member}“ neexistuje."
   :error/unknown-usergroup                       "Tým byl smazán."
   :error/upload-failed                           "Selhalo nahravání OrgStránky: \"{orgpage/title}\""

   :feedback/ask-question                         "Položit otázku"
   :feedback/hide-button                          "Trvale skrýt tlačítko"
   :feedback/dialog-title                         "Napište tvůrcům OrgPadu"
   :feedback/description                          [:<> "Pokud potřebujete pomoci nebo máte problém, ozvěte se nám - "
                                                   [:b "tvůrcům OrgPadu"] ". " "Také vítáme nápady na zlepšení. "
                                                   "Odpovíme Vám pomocí emailu co nejdříve."]
   :feedback/languages                            "Můžete nám psát česky, anglicky nebo německy."

   :help-screen/move-by-dragging                  "Pohybujte se pomocí táhnutí kamkoliv"
   :help-screen/zoom-by-mouse-wheel               "Změňte zvětšení pomocí kolečka myši."

   :help-screen/units-with-shadows                "Buňky se stíny se jedním kliknutím otevírají a zavírají."
   :help-screen/flat-units                        "Nevystouplé buňky nemají uvnitř žádný obsah navíc"

   :help-screen/multiple-pages                    "Více stránek je znázorněno pomocí koleček na spodu buňky."
   :help-screen/click-title-to-close              "Kliknutím na nadpis okamžitě uzavřete buňku."
   :help-screen/click-content-next-page           "Kliknutím na obsah buňky přepnete na další stránku"
   :help-screen/click-bullet-goto-page            "Kliknutím na kolečko přeskočíte přímo na danou stránku."

   :help-screen/create-unit-double-click          "Buňky vytvoříte dvojklikem."
   :help-screen/click-to-edit-again               "Upravte je poklikáním na buňku."
   :help-screen/pack-unit                         "Použijte modré tlačítko nad buňkou k jejímu sbalení."

   :help-screen/create-links                      "Vytvořte spoje buď tažením tlačítka spoje, nebo kliknutím na tlačítko a potom kliknutím na cíl."
   :help-screen/create-unit-by-dragging-link      "Vytvoření spoje v prázdém prostoru vytvoří v daném místě novou buňku."

   :help-screen/simple-steps                      "Jste v OrgPadu noví? Začnete ve třech jednoduchých krocích!"
   :help-screen/how-to-view                       "Jak číst"
   :help-screen/moving-around                     "Pohyb po OrgStránce"
   :help-screen/opening-units                     "Otevírání buněk"
   :help-screen/moving-pages                      "Více stránek"

   :help-screen/editing-guide                     "Rychlý průvodce pro upravování OrgStránek ve dvou krocích!"
   :help-screen/how-to-edit                       "Jak upravit"
   :help-screen/creating-units                    "Vytváření buněk"
   :help-screen/creating-links                    "Vytváření spojů"

   :help-screen/help                              "Pomoc můžete nalézt tady!"

   :info/single-click                             "Šetřete svůj čas! Stačí kliknout jen jednou."
   :info/uploading-attachments                    [:i18n/plural "Nahravání {info/count} {info/num-files}"
                                                   {:info/num-files [:info/count "souborů" "souboru" "souborů" "souborů"]}]
   :info/uploading-images                         [:i18n/plural "Nahravání {info/count} {info/num-images}"
                                                   {:info/num-images [:info/count "obrázků" "obrázku" "obrázků" "obrázků"]}]
   :info/uploading-attachments-failed             "Nahravání souborů selhalo."
   :info/uploading-image-failed                   "Nahravání obrázku selhalo."
   :info/presentation-link-copied                 "Zkopírován odkaz k této prezentaci."

   :import/another-format                         [:<> "Pokud chcete importovat svá stávající data v jiném formátu, kontaktujte nás na "
                                                   [:b "support@orgpad.com"] "."]
   :import/dialog                                 "Importujte svá data"
   :import/google-docs                            "Pokud chcete importovat data z Microsoft Office nebo Google Docs, stačí je vložit ze schránky do OrgStránky."
   :import/supported-formats                      "Teď podporujeme následující formáty:"
   :import/lucidchart                             [:<> [:b "Lucidchart"] " exportovaný jako .vsdx soubor."]

   :language-select/lang-tooltip                  (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                    (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

   :loading/initial-autoresize                    "Počítání velikostí všech buněk, {loading/num-units} zbývá ..."
   :loading/initial-layout                        "Zlepšení počátečního rozložení ..."
   :loading/restoring-opened-pages                "Obnovení pozic otevřených stránek ..."
   :loading/getting-orgpage                       "Stahování OrgStránky ze serveru ..."
   :loading/getting-dashboard                     "Stahování seznamu dostupných OrgStránek ze serveru ..."
   :loading/uploading-orgpage                     "Nahravání OrgStránky na server ..."
   :loading/authorizing-user                      "Autorizování uživatele ..."
   :loading/ws-init                               "Vytváření spojení se serverem ..."
   :loading/ws-closed                             "Spojení se serverem uzavřené, pokouším se znovu připojit. Pokud problém přetrvává, obnovte stránku."
   :loading/administration                        "Nahravání administrativních dat ..."
   :loading/style                                 "Nahravání stylů ..."
   :loading/uploading-attachments                 "Nahravání příloh na server ..."

   :login/continue-with-facebook                  "Pokračovat s Facebookem"
   :login/continue-with-google                    "Pokračovat s Googlem"
   :login/forgotten-password                      "Zapomenuté heslo"
   :login/forgotten-password-email-resent         "Email pro obnovení hesla již odeslán."
   :login/forgotten-password-description          "Vložte emailovou adresu, kam Vám pošleme odkaz pro obnovení hesla. Tento odkaz je funkční 24 hodin."
   :login/forgotten-password-error                [:<> "Tato emailová adresa je blokována Vámi. Buď ji odblokujte kliknutím na Odhlásit odběr v jakémkoliv emailu od OrgPadu, nebo nám pošlete email na "
                                                   [:b "support@orgpad.com"]
                                                   " z této emailové adresy."]
   :login/remember                                "Zapamatovat"
   :login/remember-tooltip                        "Chci zůstat přihlášený při návratu na tento web."
   :login/send-reset-link                         "Poslat obnovovací odkaz"
   :login/wrong-email-or-password                 "Email nebo heslo je nesprávné."

   :login-util/separator                          "nebo"

   :notes/create-note                             "Nová poznámka"
   :notes/edit-note                               "Upravit poznámku"
   :notes/manage-notes                            "Spravovat poznámky"
   :notes/my-notes                                "Moje poznámky"
   :notes/notes                                   [:i18n/plural "{notes/num-notes} {notes/notes-label}"
                                                   {:notes/notes-label [:notes/num-notes
                                                                        "poznámek" "poznámka" "poznámky" "poznámek"]}]
   :notes/confirm-delete                          "Smazat tuto poznámku?"
   :notes/notes-description                       "Zachyťte své nápady a uspořádejte je později."

   :notifications/info                            "Zvolte, které emaily Vám OrgPad bude zasílat. O důležitých změnách Vás budeme vždy informovat."
   :notifications/any-email                       "Jakýkoliv email od OrgPadu"
   :notifications/email-verification              "Ověření emailu při registraci a odkazy pro obnovení hesla"
   :notifications/monthly-newsletter              "Měsíční zpravodaj s novinkami a nedávným vývojem v OrgPadu"
   :notifications/blocked-people                  "Výslovně zablokovaní lidé:"
   :notifications/recieve-invitations             "Dostávejte pozvánky od jiných lidí"
   :notifications/unblock-user                    "Odblokujte tohoto uživatele"

   :orgpage/change-information                    "Změnit informace"
   :orgpage/copy-orgpage                          "Kopírovat do nové OrgStránky"
   :orgpage/delete-orgpage                        "Smazat OrgStránku"
   :orgpage/detail                                "Podrobnosti"
   :orgpage/meta-description                      "Popis"
   :orgpage/meta-new-tag                          "Štítek"
   :orgpage/meta-info                             (str "Informace níže pomáhají Vám a ostatním zjistit, o čem je tato OrgStránka. "
                                                       "Štítky můžete v seznamu OrgStránek využít k filtrování.")
   :orgpage/meta-info-in-share-orgpage            "Před sdílením této OrgStránky musí být nastavený nadpis."
   :orgpage/share-tooltip                         "Sdílejte tuto OrgStránku s ostatními"
   :orgpage/share-orgpage                         "Sdílení OrgStránky"
   :orgpage/show-information                      "Zobrazit informace"

   :orgpage/zoom-in                               "Přiblížení"
   :orgpage/zoom-out                              "Oddálení"
   :orgpage/create-unit-double-click              "Dvojklikem vytvořte buňku."
   :orgpage/switch-to-edit                        "Přepnout na úpravy"

   :orgpage/untitled                              "OrgStránka bez názvu"
   :orgpage/untitled-path                         "Nepojmenovaná cesta"
   :orgpage/path-num-steps                        [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                   {:orgpage/step-label [:orgpage/num-steps
                                                                         "kroků" "krok" "kroky" "kroků"]}]

   :orgpage/page-titles                           (fn [{:orgpage/keys [num-pages]}]
                                                    (str "{orgpage/title}"
                                                         (when (> num-pages 1) " (stránka {orgpage/position})")))
   :orgpage/path-title-closed-opened-index        "{orgpage/title} (stránka {orgpage/closed-index} → {orgpage/opened-index})"

   :orgpage-stats/number-of-units                 "Počet buněk"
   :orgpage-stats/number-of-links                 "Počet spojů"
   :orgpage-stats/number-of-files                 "Počet souborů"
   :orgpage-stats/number-of-images                "Počet obrázků"

   :panel/mobile-limitations                      [:<> "OrgStránku " [:b "nelze zatím"] " vytvářet ani upravit na mobilu. Vyřešíme to v nadcházející verzi, v tuto chvíli prosím používejte desktop."]
   :panel/create-orgpage                          "Nová OrgStránka"
   :panel/logo-tooltip                            "Jít na hlavní stránku"
   :panel/edit-info                               "Přepnout na úpravy, kde můžete vytvořit a smazat buňky a spoje, upravit obsah a další"
   :panel/read-info                               "Přepnout na čtení, kde nic nemůže být změněno, ale procházení obsahu je jednodušší"
   :panel/undo-deletion                           "Vrátit smazání"
   :panel/undo-deletion-info                      [:i18n/plural "Vrátit smazání {delete/num-units} {delete/unit-label} a {delete/num-links} {delete/link-label}."
                                                   #:delete{:unit-label [:delete/num-units
                                                                         "buněk" "buňky" "buněk" "buněk"]
                                                            :link-label [:delete/num-links
                                                                         "spojů" "spoje" "spojů" "spojů"]}]

   :panel/switch-style                            "Přepnout styl nových buněk a spojů; táhnutím vyrobit novou buňku"
   :panel/profile-settings                        "Nastavení"
   :panel/usergroups                              "Týmy"
   :panel/stats                                   "Statistiky"
   :panel/administration                          "Administrace"

   :password/too-short                            "Alespoň 8 znaků"
   :password/different-passwords                  "Hesla se neshodují"

   :password-reset/back-to-list                   "Zpět na seznam"
   :password-reset/change-password                "Změnit heslo"
   :password-reset/set-password                   "Nastavit heslo"
   :password-reset/has-password                   "Váš účet má nastavené heslo."
   :password-reset/without-password               "Žádné heslo není zatím nastavené, protože jste k přihlášení využili propojené účty."
   :password-reset/invalid-link                   "Neplatný odkaz, možná je starší než 24 hodin. Prosím požádejte o opětovné zaslání emailu."
   :password-reset/description                    "Nastavte nové heslo"
   :password-reset/enter-current-and-new-password "Vložte současné heslo a dvakrát nové heslo."
   :password-reset/enter-new-password-twice       "Vložte dvakrát nové heslo."

   :pending-activation/email-already-used         "Email je již použitý na jiném účtu."
   :pending-activation/email-not-recieved         "Neobdrželi jste aktivační email? Klikněte na tlačítko níže. Můžete změnit Vaši emailovou adresu."
   :pending-activation/email-sent                 "Aktivační email odeslán. "
   :pending-activation/instructions               "Z bezpečnostních důvodů musíme nejprve ověřit Váš email. Klikněte na aktivační odkaz v emailu, který jsme Vám odeslali."
   :pending-activation/resend                     "Znovu zaslat aktivační email"

   :path/add-step                                 "Přidat krok"
   :path/title                                    "Prezentace {path/num-paths}"
   :paths/create-new-path                         "Vytvořit prezentaci"
   :paths/confirm-path-deletion                   (fn [{:path/keys [title]}]
                                                    [:<> "Smazat prezentaci " [:b title] " ?"])
   :paths/show-hidden-units                       "Zobrazit skryté buňky"

   :presentation/presentation                     "Prezentace"
   :presentation/step                             "Krok"
   :presentation/first-step                       "První krok"
   :presentation/previous-step                    "Předchozí krok"
   :presentation/next-step                        "Další krok"
   :presentation/last-step                        "Poslední krok"

   :presentation/share-presentation               "Sdílejte tuto prezentaci s ostatními."

   :presentation/embedded-zoom-info               "CTRL + posouvání pro přiblížení"

   :paths-menu/focus                              "Nastavení kamery {keyboard/shortcut}"
   :paths-menu/open-and-close                     "Otevírání a zavírání buněk {keyboard/shortcut}"
   :paths-menu/visibility                         "Změna viditelnosti {keyboard/shortcut}"

   :profile/profile                               "Profil"
   :profile/account                               "Účet"
   :profile/linked-accounts                       "Propojené účty"
   :profile/notifications                         "Oznámení"
   :profile/account-description                   "Změňte svůj email, heslo nebo smažte svůj účet."
   :profile/change-email                          "Změnit email"
   :profile/change-email-text                     "Vložte novou emailovou adresu. Z bezpečnostních důvodů ji musíme ověřit před odblokováním účtu."
   :profile/current-email                         (fn [{:profile/keys [email]}]
                                                    [:<> "Váš účet je registrovaný na email " [:b email] " ."])
   :profile/account-linked-to-facebook            [:<> "Váš účet je" [:b " propojený "] " s Facebookem."]
   :profile/account-not-linked-to-facebook        [:<> "Váš účet " [:b " není propojený "] " s Facebookem."]
   :profile/link-fb                               "Propojit s Facebookem"
   :profile/unlink-fb                             "Zrušit propojení s Facebookem"
   :profile/account-linked-to-google              [:<> "Váš účet je " [:b " propojený "] " s Googlem."]
   :profile/account-not-linked-to-google          [:<> "Váš účet " [:b " není propojený "] " s Googlem."]
   :profile/link-google                           "Propojit s Googlem"
   :profile/unlink-google                         "Zrušit propojení s Googlem"
   :profile/set-password-text                     "Nastavit heslo před zrušením propojení."
   :profile/linked-accounts-info                  "Propojte svůj účet na Facebooku nebo na Googlu s OrgPadem, abyste ho mohli využít k přihlášení."
   :profile/public-profile-info                   "Lidé Vás na OrgPadu poznají pomocí níže uvedených informací."
   :profile/select-language                       "Jazyk aplikace (Ctrl+Shift+L): "

   :profile/delete-account                        "Smazat účet"
   :profile/confirm-delete-account-question       [:<> [:b "Trvale"] " smazat účet?"]
   :profile/confirm-delete-account-info           "Trvale smaže všechny Vaše OrgStránky a jejich data."
   :profile/delete-account-info                   [:<> "Smazání účtu " [:b "trvale"] " smaže všechny Vaše OrgStránky a jejich data."]

   :props/h1                                      "Velký nadpis"
   :props/h2                                      "Střední nadpis"
   :props/h3                                      "Malý nadpis"
   :props/weight-none                             "Normální spoj"
   :props/strong                                  "Silní spoj"
   :props/arrowhead-none                          "Bez šipky"
   :props/single                                  "Šipka"
   :props/double                                  "Dvojitá šipka"

   :public-permission/none                        "soukromá."
   :public-permission/edit                        "sdílená s každým pro úpravy."
   :public-permission/view                        "sdílená s každým pro čtení."

   :registration/create-user                      "Vytvořit účet"
   :registration/register-by-email                "Registrace emailem"
   :registration/server-error                     "Chyba serveru. Zkuste vytvořit účet znovu."

   :selection/change-style-of-selected            [:i18n/plural (fn [{:selection/keys [type]}]
                                                                  (str "Změnit styl výběru "
                                                                       (case type
                                                                         :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                      "{selection/num-links} {selection/link-label}")
                                                                         :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                         :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                       "; podržte SHIFT pro změnu na aktuální styl, podržte CTRL pro kopírování do aktuálního stylu"))
                                                   #:selection{:unit-label [:selection/num-units
                                                                            "buněk" "buňky" "buněk"]
                                                               :link-label [:selection/num-links
                                                                            "spojů" "spoje" "spojů"]}]

   :selection/link                                "Propojit buňky"
   :selection/hide-contents                       "Schovat obsahy"
   :selection/show-contents                       "Zobrazit obsahy"
   :selection/copy-units-links                    "Zkopírovat buňky a spoje"
   :selection/flip-links                          "Změnit směry spojů"
   :selection/delete                              "Vymazat vybrané"

   :share-orgpage/copy-template-link              "Kopírovat odkaz na šablonu"
   :share-orgpage/copy-template-link-tooltip      "Lidé můžou využívat tento odkaz k vytvoření vlastích kopií této OrgStránky"
   :share-orgpage/dialog-title                    "Sdílení {orgpage/title}"
   :share-orgpage/info                            (fn [{:share/keys [create-team]}]
                                                    [:<> (str "Lidé bez účtu na OrgPadu obdrží pozvánku s odkazem."
                                                              " Po otevření odkazu mohou číst tuto OrgStránku. ")
                                                     "Pro snazší sdílení OrgStránek se skupinou lidí si můžete "
                                                     [:a.link-button create-team "vytvořit tým"] "."])
   :share-orgpage/invite-for-editing              "Pozvat pro úpravy"
   :share-orgpage/invite-for-viewing              "Pozvat pro čtení"
   :share-orgpage/invite-by-email                 "Chcete je pozvat emailem v určitém jazyce?"
   :share-orgpage/links                           "Odkazy"
   :share-orgpage/to-read                         "číst"
   :share-orgpage/to-edit                         "upravit"
   :share-orgpage/links-tooltip                   "Udělte přístup prostřednictvím odkazů ke sdílení"
   :share-orgpage/new-user-or-usergroup           "Jméno, email nebo tým"
   :share-orgpage/link-permission-start           "Umožněte lidem"
   :share-orgpage/link-permission-end             "tuto OrgStránku."
   :share-orgpage/private-info                    "Přístup budete mít pouze Vy a lidé v seznamu nebo s odkazem."
   :share-orgpage/publish-permission-end          "Tato OrgStránka je "
   :share-orgpage/publish-info                    [:<> "OrgStránka je " [:b "ve výchozím stavu soukromá"]
                                                   (str ".  Tuto OrgStránku můžete zpřístupnit každému, kdo navštíví OrgPad.")]
   :share-orgpage/publish                         "Publikovat"
   :share-orgpage/publish-confirmation            "Každý bude schopný {orgpage/permission} tuto OrgStránku. Jste si jistý?"
   :share-orgpage/publish-tooltip                 "Udělte přístup každému"
   :share-orgpage/remove-user                     "Odebrat oprávnění"
   :share-orgpage/reset-links                     (fn [{:share/keys [reset-links]}]
                                                    [:<> "Pokud jste odkaz sdíleli omylem, můžete "
                                                     [:span.link-button reset-links "zneplatnit všechny předchozí odkazy"]
                                                     "."])
   :share-orgpage/shareable-link                  "Sdílitelný odkaz"
   :share-orgpage/show-embedding-code             "Vložit do webové stránky"
   :share-orgpage/start-with-presentation         "Začít s prezentací."
   :share-orgpage/user-not-registered             " ještě není registrovaný v OrgPadu."
   :share-orgpage/users                           "Lidé"
   :share-orgpage/users-tooltip                   "Umožnit přístup jednotlivým lidem"

   :side-panel/about                              "O OrgPadu"
   :side-panel/files-and-images                   "Soubory a obrázky"
   :side-panel/paths                              "Prezentace"
   :side-panel/help                               "Nápověda"
   :side-panel/home                               "Hlavní stránka"
   :side-panel/import                             "Import"
   :side-panel/share                              "Sdílení"
   :side-panel/num-files                          [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                   {:side-panel/files-label [:side-panel/num-files
                                                                             "souborů" "soubor" "soubory" "souborů"]}]
   :side-panel/num-images                         [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                   {:side-panel/images-label [:side-panel/num-images
                                                                              "obrázků" "obrázek" "obrázky" "obrázků"]}]
   :side-panel/num-paths                          [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                   {:side-panel/paths-label [:side-panel/num-paths
                                                                             "cest" "cesta" "cesty" "cest"]}]

   :step/closed-pages                             "Zavřené stránky."
   :step/everything-closed                        "Všechno zavřené."
   :step/hidden-units                             "Skryté buňky"
   :step/nothing-changed                          "Žádné změny."
   :step/opened-pages                             "Otevřené stránky"
   :step/pages-shown-in-the-camera                "Stránky zobrazené na kameře"
   :step/revealed-units                           "Odhalené buňky"
   :step/switched-pages                           "Přepnuté stránky"

   :tag/public                                    "veřejné"

   :text-field/email                              "Email"
   :text-field/first-name                         "Křestní jméno"
   :text-field/last-name                          "Příjmení"
   :text-field/new-password                       "Nové heslo"
   :text-field/new-password-again                 "Znovu nové heslo"
   :text-field/password                           "Heslo"
   :text-field/password-again                     "Znovu heslo"
   :text-field/title                              "Nadpis"
   :text-field/content                            "Obsah"
   :text-field/name-or-email                      "Jméno nebo email"
   :text-field/subject                            "Předmět"
   :text-field/message                            "Zpráva"

   :role/owner                                    "Vlastník"
   :role/admin                                    "Může sdílet a mazat"
   :role/edit                                     "Může upravit"
   :role/view                                     "Může číst"
   :role/member                                   "Člen"

   :unit-buttons/create-link                      "Pro propojení klikněte nebo táhněte; podržte SHIFT pro vytvoření více spojů"
   :unit-buttons/change-link-style                (str "Změna stylu této buňky; "
                                                       "podržte SHIFT pro nastavení aktuálního stylu, "
                                                       "podržte CTRL pro zkopírování do aktuálního stylu; "
                                                       "táhnutím vyrobit propojení v tomto stylu")
   :unit-buttons/hide-content                     "Skrýt obsah"
   :unit-buttons/delete-unit                      "Smazat buňku"

   :usergroups/create-team                        "Vytvořit tým"
   :usergroups/info                               "Pro snažší sdílení OrgStránek vytvářejte a spravujte týmy Vašich přátel a spolupracovníků."
   :usergroups/delete-usergroup                   "Smazat tým"
   :usergroups/members                            "Členové"
   :usergroups/change                             "Změnit logo a název týmu"
   :usergroups/show-actions                       "Ukázat akce"
   :usergroups/name                               "Jméno"
   :usergroups/create-usegroup-info               (str "Jméno a profilový obrázek týmu jsou viditelné pro všechny uživatele OrgPadu. "
                                                       "Vyberte si jméno dlouhé nejméně 5 znaků. "
                                                       "Mezery na začátku a konci budou odstraněny.")
   :usergroups/confirm-delete-usergroup           [:<> [:b "Trvale"] " smazat tento tým?"]
   :usergroups/usergroups-members                 "Členové týmu {usergroup/name}"
   :usergroups/remove-member                      "Odebrat z týmu"
   :usergroups/remove-admin                       "Odebrat správce"
   :usergroups/make-admin                         "Udělat správcem"
   :usergroups/admin-tooltip                      "Správce může spravovat členy a smazat tým"
   :usergroups/untitled-usergroup                 "Nepojmenovaný tým"})
