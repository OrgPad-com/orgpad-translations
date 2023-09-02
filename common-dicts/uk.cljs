(ns orgpad.client.i18n.dicts.cs
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.cs :as cs]))

(def dict
  "A dictionary map from keywords to the corresponding Ukranian texts."
  (merge
    cs/dict
    {:administration/page-title                       "Адміністрування – OrgPad"

     :attachments/allows-access-to-file               "Дозволити доступ до цього файла."
     :attachments/allows-access-to-image              "Дозволити доступ до цього зображення."
     :attachments/no-preview                          "Perehljad nedostupnyj"
     :attachments/used-files                          "Файли в ОргСторінка"
     :attachments/unused-files                        "Файли в стороні"
     :attachments/used-images                         "Фотографії в ОргСторінка"
     :attachments/unused-images                       "Зображення в сторону"
     :attachments/uploading-files                     "Завантаження файлів ..."

     :button/back                                     "Назад"
     :button/cancel                                   "Скасувати"
     :button/close                                    "Закрити"
     :button/copied                                   "Скопійовано"
     :button/copy                                     "Копіювати"
     :button/copy-link                                "Скопіювати посилання"
     :button/create                                   "Створити"
     :button/create-tooltip                           "Створити (Ctrl+Enter)"
     :button/delete                                   "Вилучити"
     :button/delete-selected                          "Вилучити вибране"
     :button/documentation                            "Документація"
     :button/download                                 "Звантажити"
     :button/download-all                             "Завантажити всі"
     :button/drop                                     "Відпустити"
     :button/edit                                     "Змінити"
     :button/import                                   "Імпортувати"
     :button/login                                    "Увійти"
     :button/logout                                   "Вийти"
     :button/publish                                  "Опублікувати"
     :button/read                                     "Читати"
     :button/register                                 "Реєстрація"
     :button/save                                     "Зберегти зміни"
     :button/save-tooltip                             "Зберегти зміни (Ctrl+Enter)"
     :button/upload                                   "Завантажити"
     :button/send                                     "Надіслати"
     :button/present                                  "Презентувати"
     :button/present-tooltip                          "Почати презентацію (F5)"
     :button/share                                    "Поділитися"
     :button/exit                                     "Вийти"
     :button/show-password                            "Показати"
     :button/hide-password                            "Сховати"

     :checkout/currency                               "Měna"
     :checkout/monthly                                "měsíční"
     :checkout/yearly                                 "roční (ušetříte 15 %)"
     :checkout/failed-to-init                         "Při nahrávání webové stránky pokladny nastala chyba."
     :checkout/upgrade-plan                           "Upgradujte předplatné"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Škola"] " nebo "
                                                         [:a.link-button {:href enterprise-url} "firma"] "? Зв'яжіться з нами, щоб отримати індивідуальну пропозицію."])
     :checkout/pay-with-credit-card                   "Оплата карткою"
     :checkout/pay-with-wire-transfer                 "Оплата переказом"
     :checkout/promo-code                             "Промо-код"
     :checkout/try-for-free                           "Спробувати безкоштовно"
     :checkout/activate-now                           "Активувати зараз"
     :checkout/continue-for-free                      "Продовжити безкоштовно"

     :consent/title                                   "Використання Cookies в OrgPad"
     :consent/text                                    (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                        [:div.consent-text
                                                         "Використовуючи цей сайт, ви погоджуєтеся з "
                                                         [:a.link-button terms-and-conditions "правила та умови"]
                                                         " kомпанія OrgPad і se "
                                                         [:a.link-button privacy-policy "Політика конфіденційності"]
                                                         ". Для певної функціональності, що полегшує роботу OrgPad, ми використовуємо файли cookie."])

     :dashboard/confirm-delete                        [:<> [:b "Trvale"] " smazat tuto OrgStránku?"]
     :dashboard/login-needed                          [:<> "Abyste mohli vytvořit novou OrgStránku, " [:b "přihlaste se"] " nebo " [:b "se registrujte"] "."]
     :dashboard/owned-orgpages                        "Moje OrgStránky"
     :dashboard/public-orgpages                       "Veřejné OrgStránky"
     :dashboard/shared-orgpages                       "OrgStránky sdílené s Vámi"
     :dashboard/usergroup-orgpages                    "OrgStránky týmu {usergroup/name}"
     :dashboard/public-permission-edit                "Sdílená s každým pro úpravy"
     :dashboard/public-permission-view                "Sdílená s každým pro čtení"
     :dashboard/create-public-orgpage                 "Vytvořit jako veřejné"
     :dashboard/leave-orgpage-as-public               "Nechat jako veřejné"
     :dashboard/owner-reached-private-limit           "Vlastník dosáhl limitu"
     :dashboard/copy-as-public                        "Kopírovat jako veřejné"
     :dashboard/copy-from-template-as-public          "Kopírovat jako veřejné ze šablony"

     :editors/create-page                             "Vytvořit další stránku"
     :editors/remove-page                             "Odstranit tuto stránku"
     :editors/previous-page                           "Předchozí stránka; podržte SHIFT pro přesunutí této stránky doleva"
     :editors/next-page                               "Následující stránka; podržte SHIFT pro přesunutí této stránky doprava"
     :editors/title                                   "Nadpis"
     :editors/switch-to-this-page                     (fn [{:render/keys [can-edit]}]
                                                        (str "Přepnout na tuto stránku"
                                                             (when can-edit "; podržte SHIFT pro přesunutí aktuální stránky sem")))
     :editors/hidden-info                             "Pro psaní klikněte"

     :embedding-code/code                             "Kód"
     :embedding-code/description                      "Pro vložení OrgStránky do vaší webové stránky, zkopírujte do Vaší webové stránky následující kód:"

     :error/orgpage-access-denied                     "K této OrgStránce nemáte přístup. Zkuste se přihlásit."
     :error/usergroup-access-denied                   "Zamítnuta práva k editaci týmu."
     :error/already-member                            "„{usergroups/member}“ už je členem."
     :error/administration-access                     "Administrátorský přístup zamítnut."
     :error/creation-unauthorized                     "Pro vytvoření OrgStránky se přihlaste."
     :error/deleting-denied                           "Smazání OrgStránky zamítnuto."
     :error/email-already-used                        "Email už se používá."
     :error/email-not-registered                      "Žádný účet s tímto emailem."
     :error/email-missing-mx-record                   "Emailový server na doméně nenalezen."
     :error/email-invalid                             "Není email."
     :error/error                                     "Chyba: "
     :error/safari-unsupported                        (str "Webový prohlížeč Safari není v současnosti podporován."
                                                           " Prosím, použijte jiný webový prohlížeč, například "
                                                           " Google Chrome, Microsoft Edge, Vivaldi nebo Firefox.")
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Chybná OrgStránka" (when id " {orgpage/id}")
                                                             ". Špatně zkopírovaný odkaz?"))
     :error/incorrect-link                            "Chybný odkaz. Buď se přihlaste, nebo otevřete správný odkaz."
     :error/incorrect-password                        "Nesprávné heslo"
     :error/incorrect-profile-id                      "Chybný odkaz na profil. Špatně zkopírovaný odkaz?"
     :error/lost-permission                           "Ztracený přístup k této OrgStránce."
     :error/name-already-used                         "Jméno se již používá."
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "OrgStránka" (when title "\"{orgpage/title}\"")
                                                             " byla odstraněna."))
     :error/owner-of-orgpage                          "Už je vlastníkem OrgStránky."
     :error/passwords-mismatch                        "Hesla se neshodují."
     :error/profile-not-found                         "Profil nenalezen."
     :error/unknown-error                             "Neznámá chyba, zkuste to znovu."
     :error/unknown-id                                "Neznámá OrgStránka."
     :error/unknown-login-or-email                    "Neznámý email nebo login týmu."
     :error/unknown-user                              "„{usergroups/member}“ neexistuje."
     :error/unknown-usergroup                         "Tým byl smazán."
     :error/upload-failed                             "Selhalo nahravání OrgStránky: \"{orgpage/title}\""

     :feedback/ask-question                           "Položit otázku"
     :feedback/hide-button                            "Trvale skrýt tlačítko"
     :feedback/dialog-title                           "Napište tvůrcům OrgPadu"
     :feedback/description                            [:<> "Pokud potřebujete pomoci nebo máte problém, ozvěte se nám - "
                                                       [:b "tvůrcům OrgPadu"] ". " "Také vítáme nápady na zlepšení. "
                                                       "Odpovíme Vám pomocí emailu co nejdříve."]
     :feedback/languages                              "Můžete nám psát česky, anglicky nebo německy."
     :feedback/contact-when-problem-persists          [:<> " Pokud problém přetrvává, kontaktujte nás prosím na "
                                                       [:a {:href  "mailto:support@orgpad.com"
                                                            :class "link-button"} "support@orgpad.com"] "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Převod na účet"
                                                             (when currency
                                                               (str " v " (name currency))) " pro "
                                                             "roční"
                                                             (if (= tier "standard")
                                                               " standardní"
                                                               " profesionalní")
                                                             " předplatné"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Napište nám svou " [:b "fakturační adresu"] " a další informace k faktuře."
                                                         " Obratem Vás budeme kontaktovat na Vaší e-mailové adrese " [:b email] "."])
     :feedback/school-plan-title                      "Chci si koupit předplatné pro svou školu"
     :feedback/school-plan                            (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Uveďte, " [:b "jak velká je Vaše škola"]
                                                         ", kolik učitelů a žáků chce OrgPad používat a další informace."
                                                         " Obratem Vás budeme kontaktovat na Vaší e-mailové adrese " [:b email]
                                                         ". Rovněž nám můžete zavolat na "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/enterprise-plan-title                  "Chci si koupit předplatné pro svou firmu"
     :feedback/enterprise-plan                        (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Uveďte, " [:b "jak velká je Vaše firma"]
                                                         " a kolik lidí chce používat OrgPad."
                                                         " Máte nějaké další požadavky?"
                                                         " Potřebujete za příplatek vlastní hosting OrgPadu?"
                                                         " Obratem Vás budeme kontaktovat na Vaší e-mailové adrese " [:b email]
                                                         ". Rovněž nám můžete zavolat na "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Povyšte moje předplatné na profesionální předplatné"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Napište nám, jak máme změnit vaše stávající předplatné a další informace."
                                                         " Obratem Vás budeme kontaktovat na Vaší e-mailové adrese " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Změna zúčtovacího období na " (if (= period "yearly")
                                                                                              "roční"
                                                                                              "měsíční") " vyúčtování"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Změna proběhne po skončení aktuálního zúčtovacího období."
                                                         " Při ročním vyúčtování získáte slevu 15 %."
                                                         " Obratem Vás budeme kontaktovat na Vaší e-mailové adrese " [:b email] "."])

     :help-screen/units-with-shadows                  "Клітини з тінями відкриваються і закриваються в один клік."
     :help-screen/flat-units                          "Невисокі клітини не мають додаткового вмісту всередині."

     :help-screen/more-pages                          "Більше сторінок показано за допомогою коліщаток на нижній частині комірки."
     :help-screen/click-title-to-close                "Натисніть на заголовок, щоб негайно закрити клітинку."
     :help-screen/click-content-next-page             "Натисніть на вміст комірки, щоб перейти на наступну сторінку."
     :help-screen/click-bullet-goto-page              "Клацніть коліщатком, щоб перейти безпосередньо на дану сторінку."

     :help-screen/create-links                        "Створіть з'єднання або потягнувши кнопку з'єднання, або натиснувши на кнопку, а потім натиснувши на ціль."
     :help-screen/create-unit-by-dragging-link        "Утворення з'єднання в порожньому просторі створює нову клітину в даному місці."

     :help-screen/how-to-view                         "Як читати"
     :help-screen/opening-units                       "Відкриття комірок"
     :help-screen/moving-pages                        "Більше сторінок"

     :help-screen/how-to-edit                         "Як редагувати"
     :help-screen/creating-links                      "Створення з'єднань"

     :help-screen/help                                "Допомогу можна знайти тут!"

     :info/uploading-attachments                      [:i18n/plural "Завантаження {info/count} {info/num-files} ..."
                                                       {:info/num-files [:info/count "souborů" "souboru" "souborů" "souborů"]}]
     :info/uploading-images                           [:i18n/plural "Завантаження {info/count} {info/num-images} ..."
                                                       {:info/num-images [:info/count "obrázků" "obrázku" "obrázků" "obrázků"]}]
     :info/uploading-images-failed                    [:i18n/plural "Завантаження {info/count} {info/num-images} не вдалося."
                                                       {:info/num-images [:info/count "obrázků" "obrázku" "obrázků" "obrázků"]}]
     :info/uploading-attachments-failed               "Помилка завантаження файлів."
     :info/presentation-link-copied                   "Скопійовано посилання на цю презентацію."
     :info/storage-exceeded                           "Vlastníkovi této stránky OrgPage nezbývá {upload/total-size} pro nahrání těchto souborů."
     :info/attachments-too-large                      (str "Запис {upload/total-size} не вдалося."
                                                           " Одночасно можна завантажити не більше 500 Мб.")

     :import/another-format                           [:<> "Якщо ви хочете імпортувати існуючі дані в іншому форматі, зв'яжіться з нами за "
                                                       [:b "support@orgpad.com"] "."]
     :import/dialog                                   "Імпортуйте свої дані"
     :import/google-docs                              "Якщо ви хочете імпортувати дані з Microsoft Office або Google Docs, просто вставте їх з буфера обміну в ОргСторінки."
     :import/supported-formats                        "Зараз ми підтримуємо наступні формати:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exportovaný jako .vsdx soubor."]

     :lang/cs                                         "Česky"
     :lang/de                                         "Německy"
     :lang/en                                         "Anglicky"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polsky"
     :lang/ru                                         "Rusky"
     :lang/uk                                         "Ukrajinsky"

     :language-select/lang-tooltip                    (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                        (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

     :limit/of                                        " з "
     :limit/orgpages                                  " ОргСайт"
     :limit/people                                    " люди"
     :limit/teams                                     [:i18n/plural "{limit/team-label}"
                                                       {:limit/team-label [:limit/num-teams
                                                                           " týmů" " týmu" " týmů" " týmů"]}]
     :limit/team-members                              " членів"
     :limit/orgpages-tooltip                          (str "V předplatném zdarma je počet OrgStránek omezený."
                                                           " Pro tvoření více OrgStránek přejděte na vyšší předplatné.")
     :limit/shares-tooltip                            (str "Кількість людей, з якими ви можете безпосередньо поділитися цим ОргСайтом, обмежена."
                                                           " Povyšte na profesionální předplatné pro sdílení s neomezeným počtem lidí.")
     :limit/teams-tooltip                             (str "У стандартній підписці кількість команд, що належать, обмежена."
                                                           " Povyšte na profesionální předplatné pro vytváření neomezeného počtu týmů.")
     :limit/teams-members-tooltip                     (str "Ve standardním předplatné má každý tým omezený počet členů."
                                                           " Povyšte na profesionální předplatné pro vytváření neomezeně velkých týmů.")
     :limit/attachments-size                          (str "Загальний розмір завантажених файлів і зображень обмежений,"
                                                           " ale může být rozšířena povýšením na vyšší předplatné.")
     :limit/attachments-size-clickable                (str "Загальний розмір завантажених файлів і зображень обмежений."
                                                           "Klikněte pro zvednutí limitu přechodem na vyšší předplatné.")

     :limits/max-orgpages                             [:i18n/plural "{limit/document-label}"
                                                       {:limit/document-label [:limit/num
                                                                               "dokumentů" "dokument" "dokumenty" "dokumentů"]}]
     :limits/max-storage                              "зберігання"
     :limits/max-teams                                [:i18n/plural "{limit/team-label}"
                                                       {:limit/team-label [:limit/num
                                                                           "týmů" "tým" "týmy" "týmů"]}]
     :limits/of                                       " o"
     :limits/max-team-members                         [:i18n/plural "{limit/member-label}"
                                                       {:limit/member-label [:limit/num
                                                                             "členech" "členu" "členech" "členech"]}]
     :limits/priority-support                         "přednostní podpora"

     :link-panel/flip                                 "Змінити напрямок"
     :link-panel/insert-unit-in-middle                "Вставити комірку посередині"
     :link-panel/delete                               "Вилучити з' єднання"
     :link-panel/change-link-style                    "Змінити стиль з'єднання; утримуйте SHIFT для налаштування поточного стилю, утримуйте CTRL для копіювання в поточний стиль"


     :loading/initial-autoresize                      "Підрахунок розмірів всіх клітин, {loading/num-units} залишилося ..."
     :loading/initial-layout                          "Поліпшення початкового розподілу ..."
     :loading/restoring-opened-pages                  "Відновлення позицій відкритих сторінок ..."
     :loading/getting-orgpage                         "Stahování OrgStránky ze serveru ..."
     :loading/getting-dashboard                       "Stahování seznamu dostupných OrgStránek ze serveru ..."
     :loading/uploading-orgpage                       "Завантаження Оргсторінки на сервер ..."
     :loading/authorizing-user                        "Авторизація користувача ..."
     :loading/ws-init                                 "Створення з'єднання з сервером ..."
     :loading/ws-closed                               "З' єднання з сервером закрито, я намагаюся знову підключитися. Якщо проблема не зникає, поновіть сторінку."
     :loading/administration                          "Nahravání administrativních dat ..."
     :loading/profile                                 "Nahrávání profilu ..."
     :loading/style                                   "Nahravání stylů ..."
     :loading/uploading-attachments                   "Nahravání příloh na server ..."

     :login/continue-with-facebook                    "Продовжити з Facebook"
     :login/continue-with-google                      "Продовжити з Google"
     :login/forgotten-password                        "Забули пароль"
     :login/forgotten-password-email-resent           "Електронна пошта для відновлення пароля вже відправлена."
     :login/forgotten-password-description            "Введіть адресу електронної пошти, куди ми надішлемо вам посилання для відновлення пароля. посилання працює 24 години."

     :login/forgotten-password-error                  [:<> "Ця електронна адреса заблокована Вами. Будь ласка, або розблокуйте його, натиснувши "Відписатися" на будь-якому електронному листі від OrgPad, або надішліть нам електронний лист на "
                                                       [:b "support@orgpad.com"]
                                                       " з цієї електронної адреси."]
     :login/remember                                  "Запам'ятати"
     :login/remember-tooltip                          "Я хочу залишитися зареєстрованим при поверненні на цей сайт."
     :login/send-reset-link                           "Надіслати посилання для відновлення"
     :login/wrong-email-or-password                   "Електронна пошта або пароль неправильні."

     :login-util/separator                            "або"

     :notes/create-note                               "Нове зауваження"
     :notes/edit-note                                 "Редагувати примітку"
     :notes/manage-notes                              "Керування нотатками"
     :notes/my-notes                                  "Мої нотатки"
     :notes/notes                                     [:i18n/plural "{notes/num-notes} {notes/notes-label}"
                                                       {:notes/notes-label [:notes/num-notes
                                                                            "poznámek" "poznámka" "poznámky" "poznámek"]}]
     :notes/confirm-delete                            "Вилучити це зауваження?"
     :notes/notes-description                         "Захоплюйте свої ідеї і розставляйте їх пізніше."

     :notifications/info                              "Виберіть, які електронні листи вам надсилатиме OrgPad. Ми завжди інформуватимемо Вас про важливі зміни."
     :notifications/any-email                         "Будь-яка електронна пошта від OrgPad"
     :notifications/email-verification                "Перевірка електронної пошти при реєстрації, посилання для відновлення пароля та важлива інформація про платежі"
     :notifications/monthly-newsletter                "Щомісячний бюлетень з новинами та останніми розробками в OrgPad"
     :notifications/messages                          "Отримуйте повідомлення від інших людей"
     :notifications/blocked-people                    "Явно заблоковані люди:"
     :notifications/receipts                          "Účty při automatickém obnovení předplatného"
     :notifications/receive-invitations               "Отримуйте запрошення від інших людей"
     :notifications/unblock-user                      "Розблокуйте цю людину."

     :onboarding/openable-units                       "Відкрити можна тільки піднесені клітини з тінями."

     :orgpage/change-information                      "Змінити інформацію"
     :orgpage/copy-orgpage                            "Копіювати до нової Оргсторінки"
     :orgpage/delete-orgpage                          "Вилучити ОргСторінку"
     :orgpage/detail                                  "Подробиці"
     :orgpage/meta-description                        "Опис"
     :orgpage/meta-new-tag                            "Мітка"
     :orgpage/meta-info                               (str "Інформація нижче допомагає Вам та іншим дізнатися, про що ця ОргСторінка. "
                                                           "Ви можете використовувати теги в списку OrgСайтів для фільтрації.")
     :orgpage/meta-info-in-share-orgpage              "Перед поширенням цього ОргСайту має бути встановлений заголовок."
     :orgpage/share-tooltip                           "Поділіться цією ОргСторінкою з іншими"
     :orgpage/share-orgpage                           "Поділитися ОргСайти"
     :orgpage/show-information                        "Показати інформацію"

     :orgpage/zoom-in                                 "Збільшення"
     :orgpage/zoom-out                                "Відстрочка"
     :orgpage/create-unit-double-click                "Подвійним клацанням зробіть клітинку."
     :orgpage/switch-to-edit                          "Перейти до редагування"

     :orgpage/untitled                                "ОргСторінка без назви"
     :orgpage/untitled-unit                           "Одиниця без назви"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "kroků" "krok" "kroky" "kroků"]}]

     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (stránka {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (stránka {orgpage/closed-index} → {orgpage/opened-index})"

     :orgpage-stats/number-of-units                   "Кількість комірок"
     :orgpage-stats/number-of-links                   "Кількість стиків"
     :orgpage-stats/number-of-files                   "Кількість файлів"
     :orgpage-stats/number-of-images                  "Кількість зображень"

     :org-role/student                                "Учень"
     :org-role/teacher                                "Викладач"
     :org-role/employee                               "Працівник"
     :org-role/admin                                  "Адміністратор"

     :panel/mobile-limitations                        [:<> "OrgStránku " [:b "nelze zatím"] " vytvářet ani upravit na mobilu. Vyřešíme to v nadcházející verzi, v tuto chvíli prosím používejte desktop."]
     :panel/create-orgpage                            "Нова ОргСторінка"
     :panel/logo-tooltip                              "Перейти на головну сторінку"
     :panel/edit-info                                 "Перемкнутися на редагування, де можна створювати та видаляти комірки та з'єднання, редагувати вміст та багато іншого"


     :panel/read-info                                 "Перемкнутися на читання, де нічого не можна змінити, але переглядати вміст простіше."
     :panel/undo-deletion                             "Повернути вилучення"
     :panel/undo-deletion-info                        [:i18n/plural "Повернути вилучення {delete/num-units} {delete/unit-label} a {delete/num-links} {delete/link-label}."
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "buněk" "buňky" "buněk" "buněk"]
                                                                :link-label [:delete/num-links
                                                                             "spojů" "spoje" "spojů" "spojů"]}]

     :panel/switch-style                              "Перемикання стилю нових комірок і з'єднань; перетягування, щоб зробити нову клітинку"

     
     :panel/profile                                   "Профіль"
     :panel/settings                                  "Налаштування"
     :panel/usergroups                                "Команди"
     :panel/stats                                     "Статистика"
     :panel/administration                            "Адміністрування"

     :password/too-short                              "Принаймні 8 символів"
     :password/different-passwords                    "Паролі не збігаються"

     :password-reset/back-to-list                     "Повернутися до списку"
     :password-reset/change-password                  "Змінити пароль"
     :password-reset/set-password                     "Встановити пароль"
     :password-reset/has-password                     "Ваш обліковий запис має встановлений пароль."
     :password-reset/without-password                 "Пароль ще не встановлено, оскільки ви використовували пов'язані облікові записи для входу в систему."
     :password-reset/invalid-link                     "Некоректне посилання, можливо, воно старше 24 годин. Будь ласка, попросіть повторно надіслати листа."
     :password-reset/description                      "Встановіть новий пароль"
     :password-reset/enter-current-and-new-password   "Введіть поточний пароль і двічі новий пароль."
     :password-reset/enter-new-password-twice         "Двічі введіть новий пароль."

     :pending-activation/email-already-used           "Електронна пошта вже використовується в іншому обліковому записі."
     :pending-activation/email-not-recieved           "NВи перевіряли електронну пошту активації? Натисніть на кнопку нижче. Ви можете змінити свою електронну адресу."
     :pending-activation/email-sent                   "Електронна пошта активації відправлена. "
     :pending-activation/instructions                 "З міркувань безпеки ми повинні спочатку перевірити вашу електронну пошту. Натисніть на посилання для активації в електронному листі, який ми надіслали вам."
     :pending-activation/resend                       "Відправити електронний лист активації"

     :path/add-step                                   "Додати крок"
     :path/title                                      "Презентація {path/num-paths}"
     :paths/create-new-path                           "Створити презентацію"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Вилучити презентацію " [:b title] " ?"])
     :paths/show-hidden-units                         "Показати приховані комірки"

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Aktuální " [:b tier] " předplatné je platné do " [:b end-date] "."
                                                         (if autorenewal
                                                           " Předplatné bude na konci platebního období automaticky obnoveno."
                                                           " Předplatné vyprší na konci platebního období.")])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " ve " [:b tier " předplatném"] " z " name "."])
     :payments/free-tier-info                         [:<> "OrgPad používate v " [:b "předplatném zdarma"] "."]
     :payments/no-teams                               "Команди не доступні в безкоштовній передплаті."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Pro " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "povýšení"] " nebo "])
                                                         [:a.link-button {:href period-url} "změnu platebního období"]
                                                         " nás prosím kontaktujte."])
     :payments/choose-plan                            "Виберіть підписку"
     :payments/manage-plan                            "Spravovat předplatné"
     :payments/contact-to-manage                      [:<> "Для управління Вашою підпискою, будь ласка, зв'яжіться з нами за "
                                                       [:a {:href  "mailto:support@orgpad.com"
                                                            :class "link-button"} "support@orgpad.com"] "."]
     :payments/receipts                               "Účty:"
     :payments/receipt-label                          "Účet {receipt/date-range}"
     :payments/customer-portal-failed                 "Під час завантаження веб-сайту адміністрації підписки сталася помилка."

     :presentation/presentation                       "Презентація"
     :presentation/step                               "Крок"
     :presentation/first-step                         "Перший крок"
     :presentation/previous-step                      "Попередній крок"
     :presentation/next-step                          "Наступний крок"
     :presentation/last-step                          "Останній крок"
     :presentation/present                            "Почати презентацію"
     :presentation/exit-tooltip                       "Закінчити презентацію"

     :presentation/share-presentation                 "Поділіться цією презентацією з іншими."

     :presentation/embedded-zoom-info                 "CTRL + прокручування для масштабування"

     :paths-menu/focus                                "Налаштування камери {keyboard/shortcut}"
     :paths-menu/open-and-close                       "Відкриття та закриття комірок {keyboard/shortcut}"
     :paths-menu/visibility                           "Зміна видимості {keyboard/shortcut}"

     :pricing-popup/orgpages-exceeded-title           "Ви не можете створювати додаткові ОргСайти в безкоштовній підписці."
     :pricing-popup/orgpages-exceeded                 "Ви повинні підвищити свою підписку."
     :pricing-popup/storage-exceeded-title            "Недостатньо місця для завантаження {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Zbývá pouze " [:b space-left " místa"] " ve Vašem úložišti."
                                                         " Povýšením Vašeho předplatného můžete úložný prostor rozšířit."])
     :pricing-popup/num-shared-limit-reached-title    "Ви не можете ділитися цією ОрганСайтом з декількома людьми."
     :pricing-popup/num-shared-limit-reached-common   "Максимальна кількість людей, які поділяють цей Оргсайт, була досягнута."
     :pricing-popup/num-shared-limit-reached          [:<> " K přidání více lidí musíte povýšit na "
                                                       [:b "profesionální předplatné"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Vlastník této OrgStránky " owner " musí pro přidání dalších lidí povýšit na "
                                                         [:b "profesionální předplatné"] "."])
     :pricing-popup/enable-teams-title                "Povyšte Vaše předplatné pro správu týmů."
     :pricing-popup/enable-teams                      [:<> "Týmy seskupují lidi dohromady, což zjednodušuje spolupráci a sdílení OrgStránek."
                                                       " Tato funkcionalita je dostupná ve " [:b "standardním předplatném"] " nebo vyšším."]
     :pricing-popup/teams-limit-reached-title         "Povyšte Vaše předplatné pro vytváření více týmů."
     :pricing-popup/teams-limit-reached               "Limit pro počet týmů byl dosažen ve Vašem předplatném."
     :pricing-popup/team-members-limit-reached-title  "Nemůžete přidat více členů do {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Максимальна кількість членів команди була досягнута."
     :pricing-popup/team-members-limit-reached        [:<> " Pro přidání více členů musíte povýšit na "
                                                       [:b "profesionální předplatné"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> "Vlastník tohoto týmu " owner " musí pro přidání dalších členů povýšit na "
                                                         [:b "profesionální předplatné"] "."])

     :profile/open-contact-dialog                     "Надіслати повідомлення"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Зв'яжіться " first-name " " last-name)
                                                          "Зв'яжіться з цією людиною"))
     :profile/contact-dialog-info                     (str "Оскільки ми не повідомляємо адреси електронної пошти інших людей в OrgPad, ми надішлемо це повідомлення за вас. У ній ми вкажемо ваше ім'я та електронну пошту,"
                                                           " для того, щоб ви могли встановити прямий контакт.")

     :promotion/unknown                               "Невідомий код"
     :promotion/max-usages-reached                    "Використовувати занадто багато разів"
     :promotion/expired                               "Закінчився"
     :promotion/one-year-free                         "1 рік безкоштовно"
     :promotion/for-one-year                          " на 1 рік"
     :promotion/for-six-months                        " на 6 місяців"

     :props/h1                                        "Великий заголовок"
     :props/h2                                        "Середній заголовок"
     :props/h3                                        "Маленький заголовок"
     :props/weight-none                               "Звичайне з'єднання"
     :props/strong                                    "Сильний зв'язок"
     :props/arrowhead-none                            "Без стрілки"
     :props/single                                    "Стрілка"
     :props/double                                    "Подвійна стрілка"

     :public-permission/none                          "приватні."
     :public-permission/edit                          "ділиться з усіма для редагування."
     :public-permission/view                          "ділиться з усіма для читання."

     :registration/create-user                        "Створити аккаунт"
     :registration/register-by-email                  "Реєстрація по електронній пошті"
     :registration/server-error                       "Помилка сервера. Спробуйте створити обліковий запис знову."
     :registration/missing-email                      "{registration/service} нам не повідомив ваш e-mail. Будь ласка, заповніть його нижче."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
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

     :selection/link                                  "З'єднати комірки"
     :selection/hide-contents                         "Сховати вміст"
     :selection/show-contents                         "Показати вміст"
     :selection/copy-units-links                      "Скопіювати комірки та з'єднання"
     :selection/flip-links                            "Змінити напрямки з' єднання"
     :selection/delete                                "Вилучити вибране"

     :settings/profile                                "Профіль"
     :settings/payments                               "Платежі"
     :settings/account                                "Рахунок"
     :settings/linked-accounts                        "Зв'язані облікові записи"
     :settings/notifications                          "Оголошення"
     :settings/account-description                    "Змініть свій email, пароль або видаліть свій обліковий запис."
     :settings/stats-description                      "Ось вибрана статистика вашого використання OrgPad."
     :settings/change-email                           "Змінити email"
     :settings/change-email-text                      "Введіть нову адресу електронної пошти. З міркувань безпеки ми повинні перевірити його, перш ніж розблокувати обліковий запис."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Ваш рахунок зареєстровано на email " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Ваш рахунок є" [:b " пов'язаний "] " з Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Ваш рахунок " [:b " не пов'язаний "] " з Facebook."]
     :settings/link-fb                                "Зв'язатися з Facebook"
     :settings/unlink-fb                              "Скасувати з' єднання з Facebook"
     :settings/account-linked-to-google               [:<> "Ваш рахунок є " [:b " пов'язаний "] " з Google."]
     :settings/account-not-linked-to-google           [:<> "Ваш рахунок " [:b " не пов'язаний "] " з Google."]
     :settings/link-google                            "Зв'язатися з Google"
     :settings/unlink-google                          "Скасувати з'єднання з Google"
     :settings/set-password-text                      " Встановіть пароль перед тим, як скасувати з'єднання."
     :settings/linked-accounts-info                   "Підключіть свій обліковий запис Facebook або Google до OrgPad, щоб ви могли використовувати його для входу в систему."
     :settings/profile-info                           "Люди впізнають вас на OrgPad за допомогою наведеної нижче інформації."
     :settings/select-language                        "Мова програми (Ctrl+Shift+L): "

     :settings/delete-account                         "Видалити обліковий запис"
     :settings/confirm-delete-account-question        [:<> [:b "Постійно"] " видалити обліковий запис?"]
     :settings/confirm-delete-account-info            "Він постійно видаляє всі ваші ОргСайти та їх дані."
     :settings/delete-account-info                    [:<> "Видалення облікового запису" [:b "Постійно"] " видаляє всі ваші ОргСайти та їх дані."]

     :share-orgpage/copy-template-link                "Скопіювати посилання на шаблон"
     :share-orgpage/copy-template-link-tooltip        "Люди можуть використовувати це посилання для створення волосяних копій цього ОргСайту"
     :share-orgpage/dialog-title                      "Поділитися {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Люди без облікового запису на OrgPad отримують запрошення з посиланням."
                                                                  " Після відкриття посилання вони можуть прочитати цю ОргСторінку. ")
                                                         "Щоб легше ділитися ОрганСайтом з групою людей, ви можете "
                                                         [:a.link-button create-team "створити команду"] "."])
     :share-orgpage/invite-for-editing                "Запросити редагувати"
     :share-orgpage/invite-for-viewing                "Запросити для читання"
     :share-orgpage/invite-by-email                   "Хочете запросити його на електронну пошту певною мовою?"
     :share-orgpage/links                             "Посилання"
     :share-orgpage/to-read                           "читати"
     :share-orgpage/to-edit                           "редагувати"
     :share-orgpage/links-tooltip                     "Надайте доступ за допомогою посилань для спільного використання"
     :share-orgpage/new-user-or-usergroup             "Ім'я, e-mail або команда"
     :share-orgpage/link-permission-start             "Дозвольте людям"
     :share-orgpage/link-permission-end               "цієї Оргсторінки."
     :share-orgpage/private-info                      "Доступ надається тільки Вам і людям, з якими Ви поділилися на Сайті безпосередньо або за допомогою посилання. Кожен новий документ є приватним."
     :share-orgpage/publish-for-editing-info          "ОргСторінка є публічною. Будь-хто в Інтернеті може її знайти та редагувати."
     :share-orgpage/publish-for-reading-info          "ОргСторінка є публічною. Кожен в інтернеті може знайти і прочитати її. Зміни можуть вноситися тільки вами або людьми, з якими ви поділилися на Сайті для редагування."
     :share-orgpage/publish-permission-end            "Ця ОргСторінка є "
     :share-orgpage/publish                           "Опублікувати"
     :share-orgpage/publish-confirmation              "Кожен зможе {orgpage/permission} цієї Оргсторінки. Ви впевнені?"
     :share-orgpage/publish-tooltip                   "Надайте доступ кожному"
     :share-orgpage/remove-user                       "Вилучити дозволи"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Якщо ви помилково поділилися посиланням, ви можете "
                                                         [:span.link-button reset-links "видалити всі попередні посилання"]
                                                         "."])
     :share-orgpage/shareable-link                    "Спільне посилання"
     :share-orgpage/show-embedding-code               "Вставити на веб-сторінку"
     :share-orgpage/start-with-presentation           "Почніть з презентації."
     :share-orgpage/user-not-registered               " ще не зареєстрований в OrgPad."
     :share-orgpage/users                             "Люди"
     :share-orgpage/users-tooltip                     "Надання доступу окремим людям"

     :side-panel/about                                "Про Оргпад"
     :side-panel/files-and-images                     "Файли та зображення"
     :side-panel/paths                                "Презентація"
     :side-panel/translate                            "Переклади"
     :side-panel/help                                 "Довідка"
     :side-panel/home                                 "Головна сторінка"
     :side-panel/import                               "Імпорт"
     :side-panel/share                                "Поділитися"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "souborů" "soubor" "soubory" "souborů"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "obrázků" "obrázek" "obrázky" "obrázků"]}]
     :side-panel/num-paths                            [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "cest" "cesta" "cesty" "cest"]}]

     :step/closed-pages                               "Закриті сторінки."
     :step/everything-closed                          "Все закрито."
     :step/hidden-units                               "Приховані комірки"
     :step/nothing-changed                            "Ніяких змін."
     :step/opened-pages                               "Відкриті сторінки"
     :step/pages-shown-in-the-camera                  "Сторінки, що відображаються на камері"
     :step/revealed-units                             "Виявлені клітини"
     :step/switched-pages                             "Перемикання сторінок"

     :tag/public                                      "публічний"

     :text-field/email                                "Email"
     :text-field/first-name                           "Ім'я"
     :text-field/last-name                            "Прізвище"
     :text-field/new-password                         "Новий пароль"
     :text-field/new-password-again                   "Знову новий пароль"
     :text-field/password                             "Пароль"
     :text-field/password-again                       "Знову пароль"
     :text-field/title                                "Заголовок"
     :text-field/content                              "Зміст"
     :text-field/name-or-email                        "Ім'я або email"
     :text-field/subject                              "Тема"
     :text-field/message                              "Повідомлення"

     :tier/free                                       "Безкоштовно"
     :tier/standard                                   "Стандартний"
     :tier/professional                               "Професійні"
     :tier/school                                     "Школа"
     :tier/enterprise                                 "Компанія" ; podnik?
     :tier/unlimited                                  "Необмежений"

     :translate/title                                 "Переклад Оргсторінок {orgpage/title} на іншу мову"
     :translate/info                                  (str "Автоматично створить копію Оргсторінки, що належить Вам,"
                                                           " яка буде перекладена з мови оригіналу на мову перекладу."
                                                           " Через хвилину ви знайдете її у своєму списку.")
     :translate/source-lang                           "Мова джерела"
     :translate/target-lang                           "Мова призначення"
     :translate/translate                             "Перекласти"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Переклад доступний як "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :role/owner                                      "Власник"
     :role/admin                                      "Може ділитися і видаляти"
     :role/edit                                       "Може коригувати"
     :role/view                                       "Може читати"
     :role/member                                     "Учасник"

     :unit-panel/create-link                          "Натисніть або потягніть, щоб з'єднати; утримуйте SHIFT, щоб створити кілька з'єднань"
     :unit-panel/change-link-style                    (str "Змінення стилю цієї комірки; "
                                                           "утримуйте SHIFT для налаштування поточного стилю, "
                                                           "утримуйте CTRL для копіювання до поточного стилю; "
                                                           "тягнучи зробити зв'язок в цьому стилі")
     :unit-panel/hide-content                         "Сховати вміст"
     :unit-panel/delete-unit                          "Вилучити комірку"

     :usergroups/create-team                          "Створити команду"
     :usergroups/info                                 "Для полегшення спільного використання ОргСайту створюйте та керуйте командами ваших друзів та співробітників."
     :usergroups/delete-usergroup                     "Вилучити команду"
     :usergroups/members                              "Члени"
     :usergroups/change                               "Змінити логотип і назву команди"
     :usergroups/show-actions                         "Показати дії"
     :usergroups/name                                 "Ім'я"
     :usergroups/create-usegroup-info                 (str "Ім'я та профільне зображення команди видно всім людям на OrgPad. "
                                                           "Виберіть ім'я довжиною не менше 5 символів. "
                                                           "Пробіли на початку і в кінці будуть видалені.")
     :usergroups/confirm-delete-usergroup             [:<> [:b "Trvale"] " вилучити цю команду?"]
     :usergroups/usergroups-members                   "Члени команди {usergroup/name}"
     :usergroups/remove-member                        "Вилучити з команди"
     :usergroups/remove-admin                         "Вилучити менеджер"
     :usergroups/make-admin                           "Зробити адміністратором"
     :usergroups/admin-tooltip                        "Адміністратор може управляти членами і видаляти команду."
     :usergroups/untitled-usergroup                   "Команда без назви"

     :wire-transfer/title                             "Bankovní převod pro roční {wire-transfer/tier} předplatné"
     :wire-transfer/info                              "Vaše roční předplatné aktivujeme po přijetí peněz na náš účet."
     :wire-transfer/used-currency                     "Platba v {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Příjemce"
     :wire-transfer/account-number                    "Číslo účtu"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Částka"
     :wire-transfer/payment-purpose                   "Zpráva pro příjemce"
     :wire-transfer/qr-code-common                    (str "Pro automatické vyplnění správných informací pomoci bankovní"
                                                           " aplikace prosím naskenujte následující kód QR platby.")
     :wire-transfer/cz-sk-qr-code-description         (str " Tento QR kód se běžně používá pro bankovní převody"
                                                           " v Česku a na Slovensku.")
     :wire-transfer/eu-qr-code-description            (str " Tento QR kód se běžně používá pro SEPA bankovní převody"
                                                           " v Evropské Unii.")
     :wire-transfer/trial-info                        (str "Pro plné využití OrgPadu můžete začít ihned jednorázovým"
                                                           " 7-denním předplatným. Až nám banka potvrdí platbu,"
                                                           " prodloužíme Vám předplatné o 1 rok.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Pokud máte jakékoliv dotazy nebo těžkosti, prosím kontaktujte"
                                                         " nás " [:a.link-button {:href url} "vyplněním formuláře"] "."])
     :wire-transfer/success-text                      [:<> "Aktivovali jsme Vám " [:b "jednorázové 7denní předplatné"] ","
                                                       " abyste mohli OrgPad s novým plánem používat okamžitě. "]
     :wire-transfer/common-result-text                (str "Když banka potvrdí, že platba proběhla úspěšně,"
                                                           " bude doba předplatného prodloužena o 1 rok.")
     :wire-transfer/start-trial                       "Platba odeslána"
     :wire-transfer/start-trial-result-title          "Děkujeme za platbu"
     :wire-transfer/copy                              "Zkopírovat do schránky"
     }))
