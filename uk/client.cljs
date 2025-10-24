(ns orgpad.client.i18n.dicts.uk
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.uk :as uk]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  "A dictionary map from keywords to the corresponding Ukrainian texts."
  (merge
    uk/dict
    {:address/company                                 "Назва компанії"
     :address/ico                                     "ПДВ"
     :address/street                                  "Вулиця"
     :address/street-number                           "Номер"
     :address/postal-code                             "Поштовий індекс"
     :address/city                                    "Місто"
     :address/country                                 "Країна"


     :administration/page-title                       "Адміністрація - OrgPad"

     :attachments/allows-access-to-file               "Дозволяє доступ до цього файлу."
     :attachments/allows-access-to-image              "Дозволяє доступ до цього зображення."
     :attachments/no-preview                          "Попередній перегляд неможливий."
     :attachments/all-files                           "Всі файли"
     :attachments/used-files                          "Файли в ОргСторінці"
     :attachments/unused-files                        "Сторонні файли"
     :attachments/all-images                          "Всі зображення"
     :attachments/used-images                         "Зображення в ОргСторінці"
     :attachments/unused-images                       "Сторонні зображення"
     :attachments/uploading-files                     "Завантаження файлів …"
     :attachments/previous-attachment                 "Попередній файл або зображення"
     :attachments/next-attachment                     "Наступний файл або зображення"
     :attachments/display-using-microsoft-365         "Відкрити за допомогою Microsoft 365"
     :attachments/edit-filename                       "Змінити назву"
     :attachments/title-order                         "Алфавітно за назвою"
     :attachments/upload-order                        "Новіші вгорі"
     :attachments/size-order                          "Більші вгорі"
     :attachments/split-used-unused                   "Групувати за наявністю в ОргСторінці"
     :attachments/search                              "Пошук"
     :attachments/ordering                            "Сортування"
     :attachments/new-version                         "Нова версія"
     :attachments/preserve-old-version                "Зберегти стару версію"
     :attachments/in-other-orgpages                   "Замінити в інших ОргСторінках:"

     :button/back                                     "Назад"
     :button/cancel                                   "Скасувати"
     :button/close                                    "Закрити"
     :button/comment                                  "Коментар"
     :button/continue                                 "Продовжити"
     :button/copied                                   "Скопійовано"
     :button/copy                                     "Копіювати"
     :button/copy-link                                "Копіювати посилання"
     :button/create                                   "Створити"
     :button/create-tooltip                           "Створити (CTRL+ENTER)"
     :button/delete                                   "Видалити"
     :button/delete-selected                          "Видалити вибране"
     :button/documentation                            "Документація"
     :button/download                                 "Завантажити"
     :button/download-all                             "Завантажити все"
     :button/drop                                     "Перемістити"
     :button/edit                                     "Редагувати"
     :button/import                                   "Імпортувати"
     :button/insert                                   "Вставити"
     :button/login                                    "Увійти"
     :button/logout                                   "Вийти"
     :button/publish                                  "Опублікувати"
     :button/read                                     "Проглянути"
     :button/register                                 "Зареєструватись"
     :button/register-to-save                         "Зареєструватись для збереження"
     :button/remove                                   "Вилучити"
     :button/reset                                    "Скинути"
     :button/save                                     "Зберегти зміни"
     :button/save-tooltip                             "Зберегти зміни (CTRL+ENTER)"
     :button/upload                                   "Додати"
     :button/upload-from-computer                     "Завантажити з комп'ютера"
     :button/send                                     "Відправити"
     :button/present                                  "Презентувати"
     :button/present-tooltip                          "Розпочати презентацію (F5)"
     :button/share                                    "Поширити"
     :button/start                                    "Старт"
     :button/exit                                     "Вийти"
     :button/show-password                            "Показати"
     :button/hide-password                            "Приховати"

     :checkout/currency                               "Валюта"
     :checkout/monthly                                "щомісячно"
     :checkout/yearly                                 "щорічно (зберегти 15%)"
     :checkout/failed-to-init                         "Під час завантаження веб-сайту оплати сталася помилка."
     :checkout/upgrade-plan                           "Оновити план"
     :checkout/professional-plan                      "Професійний план"
     :checkout/school-plan                            "Шкільний план"
     :checkout/enterprise-plan                        "Корпоративний план"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Шкільний"] " або "
                                                         [:a.link-button {:href enterprise-url} "корпоративний"] "? Зв'яжіться з нами для індивідуальної угоди."])
     :checkout/pay-with-credit-card                   "Оплатити карткою"
     :checkout/pay-with-wire-transfer                 "Оплата банківським переказом"
     :checkout/promo-code                             "Промо-код"
     :checkout/try-for-free                           "Спробуйте безкоштовно"
     :checkout/activate-now                           "Активувати зараз"
     :checkout/continue-for-free                      "Продовжити безкоштовно"

     :code-lang/none                                  "Жоден"
     :code-lang/multiple                              "Кілька"

     :dashboard/confirm-delete                        [:<> [:b "Назавжди"] " видалити цю ОргСторінку?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Увійти"] " або "
                                                         [:a {:href register-url} "зареєструватись,"]
                                                         " щоб створити нові ОргСторінки."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "Термін дії підписки для школи " name " закінчився " subscription-expired ". "
                                                         "Для поновлення зверніться до свого керівництва. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Більше інформації"] " близько 95% знижки для шкіл."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Отримайте ОргСторінку для своєї школи без обмежень зі знижкою 95%. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Більше інформації."]])
     :dashboard/owned-orgpages                        "Мої ОргСторінки"
     :dashboard/public-orgpages                       "Опублікувати ОргСторінки"
     :dashboard/shared-orgpages                       "ОргСторінки, якими поділились з вами"
     :dashboard/usergroup-orgpages                    "ОргСторінки {usergroup/name} "
     :dashboard/help-or-inspiration-button            "Ось ви його!"
     :dashboard/new-domain                            [:<> "Використовуйте новий домен " [:a {:href "https://orgpad.info/list"} "orgpad.info"] ". Більше інформації в ОргСторінці " [:a {:href "https://orgpad.info/s/new-domain"} "Зміни в OrgPad та новий домен"] "."]
     :dashboard-filter/filter                         "Фільтрувати ОргСторінки"
     :dashboard-filter/ordering                       "Сортувати ОргСторінки"
     :dashboard-filter/filter-and-ordering            "Фільтрувати та сортувати ОргСторінки"
     :dashboard-filter/title                          "Фільтрувати та сортувати відображаються ОргСторінки"
     :dashboard-filter/ordering-label                 "Сортування ОргСторінки"
     :dashboard-filter/title-order                    "Алфавітно за назвою"
     :dashboard-filter/creation-time-order            "Новіші вгорі"
     :dashboard-filter/last-modified-order            "Останні вгорі"
     :dashboard-filter/most-viewed-order              "Найбільше переглядів вгорі"
     :dashboard-filter/search-tags                    "Пошук тегів"

     :embedding-code/code                             "Код"
     :embedding-code/description                      "Вставте ОргСторінку на веб-сайт або іншу програму."

     :error/orgpage-access-denied                     "Ви не маєте доступу до цієї ОргСторінки. Спробуйте увійти."
     :error/usergroup-access-denied                   "Групове редагування недоступне."
     :error/administration-access                     "Доступ як адміністратору не надано."
     :error/creation-unauthorized                     "Увійдіть, щоб створити ОргСторінки."
     :error/deleting-denied                           "У видаленні ОргСторінки відмовлено."
     :error/email-already-used                        "Email вже існує."
     :error/email-not-registered                      "Немає облікового запису, пов'язаного з цією адресою електронної пошти."
     :error/email-missing-mx-record                   "У цьому домені не знайдено сервера електронної пошти."
     :error/email-invalid                             "Адреса електронної пошти недійсна."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Невірна ОргСторінка" (when id " {orgpage/id}")
                                                             ". Перевірте скопійоване посилання."))
     :error/incorrect-link                            "Невірне посилання. Авторизуйтесь або відкрийте вірне посилання."
     :error/incorrect-password                        "Невірний пароль."
     :error/incorrect-profile-id                      "Невірне посилання на профіль. Перевірте скопійоване посилання."
     :error/lost-permission                           "Доступ до цієї ОргСторінки втрачено."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "Електронні адреси без облікового запису: " emails))
     :error/name-already-used                         "Ім'я вже використовується"
     :error/name-not-valid                            "Використовуйте принаймні 5 символів"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "ОргСторінка " (when title "\"{orgpage/title}\"") " було переміщено."))
     :error/owner-of-orgpage                          "Ця людина вже є власником цієї ОргСторінки."
     :error/profile-not-found                         "Профіль не знайдено."
     :error/unknown-error                             "Невідома помилка, спробуйте ще раз."
     :error/unknown-id                                "Невідома ОргСторінка."
     :error/unknown-login-or-email                    "Невідома електронна адреса або логін групи."
     :error/unknown-usergroup                         "Група була видалена"
     :error/upload-failed                             "Не вдалось загрузити ОргСторінку: \"{orgpage/title}\""

     :export/show                                     "Експорт ОргСторінки"
     :export/title                                    "Експорт {orgpage/title}"
     :export/info                                     "Оберіть формат, в якому цю ОргСторінку експортувати."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"] " формат, який використовується в OrgPad"]
     :export/html                                     "Лінійний HTML файл"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " формат"]
     :export/generate                                 "Створити експорт"

     :feedback/ask-question                           "Запитати"
     :feedback/hide-button                            "Приховати кнопку назавжди"
     :feedback/dialog-title                           "Зв'язатись із розробниками OrgPad"
     :feedback/description                            [:<> "Якщо потрібна допомога або маєте якусь проблему, будь ласка, дайте нам - "
                                                       [:b "розробникам OrgPad"] " знати. "
                                                       "Також ми вітаємо будь-які ідеї щодо покращення. "
                                                       "Ми відповімо вам електронною поштою якомога швидше."]
     :feedback/languages                              "Ви можете писати нам англійською, чеською та німецькою."
     :feedback/contact-when-problem-persists          [:<> " Якщо проблема не зникне, зв'яжіться з нами за адресою "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Банківський переказ"
                                                             (when currency
                                                               (str " у " (name currency))) " для "
                                                             "річного плану"
                                                             (if (= tier "standard")
                                                               " Стандартний"
                                                               " Професійний")))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Напишіть нам вашу " [:b "адресу виставлення рахунку"] ", будь-яку додаткову інформацію щодо рахунка-фактури."
                                                         " Ми зв'яжемося з вами найближчим часом за вашою електронною адресою " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Я хочу купити план підписки для своєї " (case org-type
                                                                                                        :feedback/school-plan "школи"
                                                                                                        :feedback/enterprise-plan "компанії"
                                                                                                        "організації")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "За допомогою цієї форми ви зв'яжетеся з представником OrgPad s.r.o."
                                                         " Ми зв'яжемося з вами найближчим часом за вашою електронною адресою " email
                                                         ". Ви також можете подзвонити нам за "
                                                         [:a.link-button {:href (str "тел.:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Підняти рівень моєї підписки до плану Професійний"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Напишіть нам, як ми маємо змінити вашу існуючу підписку, і будь-яку додаткову інформацію."
                                                         " Ми зв'яжемося з вами найближчим часом за вашою електронною адресою " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Змінити мій розрахунковий період на виставлення рахунків " (if (= period "щорічно")
                                                                                                                           "щорічно"
                                                                                                                           "щомісячно")))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Зміна відбудеться після закінчення поточного розрахункового періода."
                                                         " При щорічній оплаті надається знижка 15%."
                                                         " Ми зв'яжемося з вами найближчим часом за вашою електронною адресою " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "Школа"
                                                               :feedback/enterprise-plan "Компанія"
                                                               "Організація") " назву"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Позицію в " (case org-type
                                                                            :feedback/school-plan "школи"
                                                                            :feedback/enterprise-plan "компанії"
                                                                            "організації")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "Школа"
                                                               :feedback/enterprise-plan "Компанія"
                                                               "Організація") " веб-сайт"))

     :fragment/fragment                               "Місцезнаходження"
     :fragment/text-id                                "ID"
     :fragment/title                                  "Назва"
     :fragment/create                                 "Створити місцезнаходження"
     :fragment/create-tooltip                         "TAB; утримуйте SHIFT, щоб скопіювати вибране місцезнаходження"
     :fragment/remove                                 "Видалити місцезнаходження"
     :fragment/share                                  "Скопіювати посилання на це місцезнаходження"
     :fragment/text-id-required                       "Потрібно вказати ID."
     :fragment/text-id-already-used                   "ID вже використовується."
     :fragment/closed-books                           "Закриті комірки; CTRL+клік для вибору"
     :fragment/hidden-books                           "Приховані комірки; CTRL+клік для вибору"
     :fragment/opened-pages                           "Відкриті сторінки; CTRL+клік для вибору"
     :fragment/focused-books                          "Комірки в камері; CTRL+клік для вибору"
     :fragment/shown-books                            "Показані комірки; CTRL+клік для вибору"

     :info/uploading-attachments                      [:i18n/plural "Завантаження {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "файлів" "файл" "файла" "файлів"]}]
     :info/uploading-images                           [:i18n/plural "Завантаження {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "зображень" "зображення" "зображення"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Не вдалось завантажити {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "зображень" "зображення" "зображення"]}]
                                                          "Не вдалось завантажити як мінімум одне зображення."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} Youtube {info/num-youtubes} не знайдено."
                                                       {:info/num-youtubes [:info/count "відео" "відео" "відео"]}]
     :info/uploading-attachments-failed               "Не вдалось завантажити файли."
     :info/presentation-link-copied                   "Посилання на цю презентацію скопійоване."
     :info/max-orgpages-exceeded                      "Власник цієї ОргСторінки не може створити додаткову ОргСторінку."
     :info/storage-exceeded                           "У власника цієї ОргСторінки не залишилося {upload/total-size} для завантаження цих файлів."
     :info/attachments-too-large                      (str "Неможливо завантажити {upload/total-size} в одному завантаженні."
                                                           " Максимальний розмір усіх завантажених вкладень становить 500 MB.")
     :info/drop-info                                  "Перетягніть файли або зображення сюди, щоб завантажити їх."
     :info/audio-not-allowed                          "Відтворення аудіо заблоковано. Натисніть кнопку відтворення."
     :info/audio-not-supported                        "Формат аудіо не підтримується."

     :import/another-format                           [:<> "Якщо ви хочете імпортувати дані іншого формату, зв'яжіться з нами за адресою "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Імпортувати дані"
     :import/google-docs                              "Щоб вставити дані з Microsoft Office або Google Docs, просто вставте їх в ОргСторінку."
     :import/supported-formats                        "Зараз ми підтримуємо такі формати:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " експортовано як файл .vsdx."]
     :import/json-canvas                              [:<> [:a.link-button {:href "https://jsoncanvas.org/" :target "_blank"} "JSON canvas"] " файл."]

     :ios/install-info                                "Встановити OrgPad додаток"
     :ios/share-button                                "1. Відкрити"
     :ios/add-to-home-screen                          "2. Натисніть"

     :lang/cs                                         "Чеська"
     :lang/de                                         "Німецька"
     :lang/en                                         "Англійська"
     :lang/es                                         "Іспанська"
     :lang/fr                                         "Французька"
     :lang/hi                                         "Хінді"
     :lang/pl                                         "Польська"
     :lang/ru                                         "Російська"
     :lang/uk                                         "Українська"

     :lang-select/tooltip                             "Мова застосунку (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "Не вистачає вашої мови? Допоможіть нам " [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                                                                          :target "_blank"} "перекласти OrgPad"] "."]

     :limit/of                                        " з "
     :limit/orgpages                                  " ОргСторінки"
     :limit/people                                    " люди"
     :limit/teams                                     " групи"
     :limit/team-members                              " члени"
     :limit/orgpages-tooltip                          (str "У безкоштовному плані підписки число ОргСторінок обмежене."
                                                           " Оновіть ваш план підписки, щоб створити більше ОргСторінок.")
     :limit/shares-tooltip                            (str "Кількість людей, з якими ви можете безпосередньо поділитися ОргСторінкою, обмежена."
                                                           " Оновіть ваш план підписки до плану Професійний, щоб ділитися з необмеженою кількістю людей.")
     :limit/teams-tooltip                             (str "У плані підписки Стандартний кількість власних груп обмежена."
                                                           " Оновіть ваш план підписки до плану Професійний, щоб створювати необмежену кількість груп.")
     :limit/teams-members-tooltip                     (str "У плані підписки Стандартний кількість членів кожної групи обмежена."
                                                           " Оновіть ваш план підписки до плану Професійний, щоб створювати необмежені групи.")
     :limit/attachments-size                          (str "Загальний розмір усіх завантажених файлів і зображень обмежений,"
                                                           " він може бути збільшений оновленням плану підписки.")
     :limit/attachments-size-clickable                (str "Загальний розмір усіх завантажених файлів і зображень обмежений."
                                                           " Клікніть, щоб збільшити ваш ліміт шляхом оновленням плану підписки.")
     :limit/attachments-size-try-out                  (str "Загальний розмір усіх завантажених файлів і зображень обмежений."
                                                           " Щоб збільшити ваш ліміт до 100 МБ, клікніть, щоб створити обліковий запис.")

     :limits/max-orgpages                             "документи"
     :limits/max-storage                              "сховище"
     :limits/max-teams                                "групи"
     :limits/of                                       " з"
     :limits/max-team-members                         "члени"
     :limits/priority-support                         "пріоритетна підтримка"

     :link-panel/flip                                 "Перевернути напрямок"
     :link-panel/insert-unit-in-middle                "Вставити комірку всередину"
     :link-panel/delete                               "Видалити посилання"
     :link-panel/change-link-style                    "Змінити стиль цього посилання; утримуйте SHIFT для встановлення поточного; утримуйте CTRL, щоб скопіювати до стилю за замовчуванням"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Розрахунок розміру всіх комірок, " [:span#autoresize-num-units num-units] " залишилось …"])
     :loading/initial-layout                          "Удосконалення початкового формату …"
     :loading/restoring-opened-pages                  "Відновлення позиції відкритих сторінок …"
     :loading/getting-orgpage                         "Завантаження ОргСторінки із сервера …"
     :loading/getting-dashboard                       "Завантаження списка доступних ОргСторінок із сервера …"
     :loading/getting-website                         "Завантаження веб-сайту з сервера …"
     :loading/getting-blog                            "Завантаження блогу з сервера …"
     :loading/uploading-orgpage                       "Завантаження ОргСторінки на сервер …"
     :loading/ws-init                                 "Налаштування зв'язку з сервером …"
     :loading/ws-closed                               "Зв'язок із сервером втрачено. Спробуйте перепідключитись. Якщо проблема не зникне, перезавантажте сторінку."
     :loading/administration                          "Завантаження даних адміністратора …"
     :loading/profile                                 "Завантаження профілю …"
     :loading/style                                   "Завантаження стилів …"
     :loading/start-trial                             "Початок 7-денної пробної підписки …"
     :loading/uploading-attachments                   "Завантаження вкладень на сервер …"

     :login/continue-with-email                       "Продовжити з електронною поштою"
     :login/continue-with-facebook                    "Продовжити з Facebook"
     :login/continue-with-google                      "Продовжити з Google"
     :login/continue-with-microsoft                   "Продовжити з Microsoft"
     :login/continue-with-cuni                        "Продовжити з Charles University"
     :login/email-sent                                "Електронний лист надіслано. Натисніть на посилання в листі."
     :login/forgotten-password                        "Забули пароль"
     :login/forgotten-password-email-resent           "Електронний лист для скидання пароля надіслано."
     :login/forgotten-password-description            "Отримайте посилання для скидання пароля електронною поштою (дійсне 24 години)."
     :login/forgotten-password-error                  [:<> "Ця електронна адреса заблокована вами. Розблокуйте або натисніть на Відписатись у будь-якому листі від OrgPad, або надішліть нам електронний лист за адресою "
                                                       company/support-email-app-link " з цієї електронної адреси."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Новий у OrgPad? " [:a.link-button {:href route} "Зареєструватись"]])
     :login/options                                   "Виберіть інший спосіб входу"
     :login/send-reset-link                           "Надіслати посилання для скидання"
     :login/wrong-email-or-password                   "Невірна електронна адреса або пароль."

     :markdown/title                                  "Вставлений текст форматовано за допомогою Markdown?"
     :markdown/info                                   "Виявлено форматування Markdown у вставленому тексті. Хочете застосувати його форматування?"
     :markdown/remember                               "Запам'ятати до перезавантаження"
     :markdown/insert                                 "Застосувати форматування Markdown"
     :markdown/ignore                                 "Залишити оригінальне"

     :meta/title                                      "Назва ОргСторінки"
     :meta/orgpage-thumbnail                          "зображення ОргСторінки"
     :meta/automatic-screenshot-start                 "Автоматично створений скріншот для "
     :meta/automatic-screenshot-refresh               "Оновлюється через п'ять хвилин після кожної зміни."
     :meta/custom-thumbnail                           "Завантажте власне зображення розміром 1360x768."
     :meta/upload-thumbnail                           "Завантажте власне зображення"
     :meta/thumbnail-upload-failed                    "Не вдалося завантажити зображення."
     :meta/description                                "Опис"
     :meta/new-tags                                   "Додати тег"
     :meta/tag-too-long                               (str "Максимальна довжина тега — " common-orgpage/max-tag-length " символів.")
     :meta/too-many-tags                              (str "Дозволено не більше " common-orgpage/max-tags " тегів.")
     :meta/info                                       (str "Ці деталі відображатимуться у списку ОргСторінок, "
                                                           "під час вбудовування ОргСторінки та при її публікації в соціальних мережах.")
     :meta/info-in-share-orgpage                      "Перед поширенням цієї ОргСторінки потрібно встановити назву."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Перемістити вибране {selection/num-units} {selection/units-label} "
                                                                         "and {selection/num-links} {selection/links-label} в нову ОргСторінку "
                                                                         "з наступною інформацією. У поточній ОргСторінці ці комірки та посилання "
                                                                         "буде замінено однією коміркою, що містить нову ОргСторінку всередині.")
                                                       {:selection/units-label [:selection/num-units "комірок" "комірка" "комірки" "комірок"]
                                                        :selection/links-label [:selection/num-links "посилань" "посилання" "посилання" "посилань"]}]
     :meta/info-title                                 "Інформація – {meta/title}"
     :meta/info-title-only                            "Назвіть ОргСторінку"
     :meta/details                                    "Деталі"
     :meta/preview                                    "Попередній перегляд"
     :meta/init-fragments                             "Початкове місцезнаходження"
     :meta/init-fragments-info                        (str "Ви можете вибрати початкове місцезнаходження при відкритті ОргСторінки. "
                                                           "Для мобільних пристроїв може бути вибране інше початкове місцезнаходження.")
     :meta/desktop-init-fragment                      "Початкове місцезнаходження для комп'ютера"
     :meta/mobile-init-fragment                       "Початкове місцезнаходження для мобільного пристрою"
     :meta/everything-closed                          "Всі комірки закриті"
     :meta/everything-closed-lowercase                "всі комірки закриті"
     :meta/more-details                               "Більше інформації"
     :meta/move-to-new-orgpage-title                  "Перейти до {meta/title}"
     :meta/move-to-new-orgpage                        "Перейти до нової ОргСторінки"

     :microsoft-365-permission/title                  "Дозволити Microsoft 365 доступ до цього документа?"
     :microsoft-365-permission/info                   [:<> "Документ Office можна переглянути через Microsoft 365. Натискаючи погодитися, ваш документ буде надіслано Microsoft. Ознайомтеся з "
                                                       [:a.link-button {:href   "https://www.microsoft.com/uk-ua/servicesagreement/"
                                                                        :target "_blank"}
                                                        "Угодою Microsoft"] "."]
     :microsoft-365-permission/allow                  "Дозволити Microsoft 365"

     :notifications/info                              "Виберіть, які електронні листи вам надсилатиме OrgPad. Ми завжди інформуватимемо вас про важливі зміни."
     :notifications/any-email                         "Будь-який лист від OrgPad"
     :notifications/email-verification                "Перевірка електронної пошти при реєстрації, посилання для скидання пароля та необхідна платіжна інформація"
     :notifications/monthly-newsletter                "Щомісячний інформаційний бюлетень з оновленнями та останніми розробками в OrgPad"
     :notifications/messages                          "Одержувати повідомлення від інших людей"
     :notifications/blocked-people                    "Заблоковані люди:"
     :notifications/receipts                          "Квитанції, коли ваша підписка автоматично подовжується"
     :notifications/receive-invitations               "Одержувати запрошення від інших людей"
     :notifications/unblock-user                      "Розблокувати цього користувача"

     :onboarding/openable-units                       "Можуть бути відкритими лише виступаючі відтінені комірки."
     :onboarding/zoom                                 "Скролити, щоб збільшити"
     :onboarding/drag-canvas                          "Перемістити перетягуванням"
     :onboarding/open-units                           "Відтінені комірки мають вміст"

     :orgpage/creating-preview                        "Створення попереднього перегляду …"
     :orgpage/change-information                      "Змінити інформацію"
     :orgpage/copy-orgpage                            "Скопіювати до нової ОргСторінки"
     :orgpage/delete-orgpage                          "Видалити ОргСторінку"
     :orgpage/detail                                  "Розкрити подробиці"
     :orgpage/share-tooltip                           "Поділитись цією ОргСторінкою з іншими"
     :orgpage/share-orgpage                           "Поділитись ОргСторінкою"
     :orgpage/show-information                        "Показати інформацію"

     :orgpage/zoom-in                                 "Збільшити"
     :orgpage/zoom-out                                "Зменшити"
     :orgpage/create-unit-double-click                "Клікніть двічі, щоб створити комірку."
     :orgpage/create-unit-hold-or-double-tap          "Утримуйте або двічі натисніть, щоб створити комірку."
     :orgpage/switch-to-edit                          "Перейти до режиму редагування."

     :orgpage/untitled                                "ОргСторінка без назви"
     :orgpage/title                                   "Назва ОргСторінки"
     :orgpage/untitled-unit                           "Комірка без назви"
     :orgpage/untitled-path                           "Презентація без назви"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "кроків" "крок" "кроки" "кроків"]}]

     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (page {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (page {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Копія доступна як "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Змініть колір цієї ОргСторінки"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Ця ОргСторінка автоматично надається " label " для спільного "
                                                         (case permission
                                                           :permission/view "читання"
                                                           :permission/comment "коментування"
                                                           :permission/edit "редагування"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Натисніть тут"]
                                                         " щоб скасувати спільний доступ."])

     :orgpage-placement/activate                      "Дивіться тут"
     :orgpage-print/displayed                         "Відображено"
     :orgpage-print/displayed-info                    "Все, що знаходиться у прямокутнику, буде надруковано саме так, як ви це бачите."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "ОргСторінку успішно надруковано у файл "
                                                         [:a.link-button {:href link :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "Друк цього PDF повинен зайняти близько {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Все закрито"
     :orgpage-print/everything-closed-info            "У надрукованому PDF всі комірки відображаються закритими."
     :orgpage-print/fragment                          "Місцезнаходження"
     :orgpage-print/fragment-info                     "У надрукованому PDF відображається вибране місцезнаходження."
     :orgpage-print/gray                              "Сірий"
     :orgpage-print/landscape                         "Альбомна"
     :orgpage-print/orientation                       "Орієнтація"
     :orgpage-print/path-info                         [:i18n/plural " з {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "сторінок" "сторінка" "сторінки"]}]
     :orgpage-print/portrait                          "Книжкова"
     :orgpage-print/presentation                      "Презентація"
     :orgpage-print/presentation-info                 "У надрукованому PDF відображається вибрана презентація."
     :orgpage-print/print                             "Друкувати у PDF"
     :orgpage-print/size                              "Розмір"
     :orgpage-print/started                           (str "Ми друкуємо цю ОргСторінку у PDF. Це повинно зайняти близько {orgpage-print/estimated-time}."
                                                           " Після завершення вона буде доступна як файл.")
     :orgpage-print/title                             "Назва PDF"
     :orgpage-print/type                              "Тип"
     :orgpage-print/watermark                         "Водяний знак"
     :orgpage-print/watermark-info                    "У надрукованому PDF буде водяний знак OrgPad."
     :orgpage-print/white                             "Білий"

     :orgpage-stats/number-of-units                   "Число комірок"
     :orgpage-stats/number-of-links                   "Число посилань"
     :orgpage-stats/number-of-files                   "Число файлів"
     :orgpage-stats/number-of-images                  "Число зображень"

     :org-role/student                                "Студент"
     :org-role/teacher                                "Викладач"
     :org-role/employee                               "Співробітник"
     :org-role/admin                                  "Адміністратор"

     :panel/toggle-side-panel                         "Бокове меню"
     :panel/create-orgpage                            "Нова ОргСторінка"
     :panel/logo-tooltip                              "Додому"
     :panel/edit-info                                 "Перейти до режиму редагування, де можна створювати і видаляти комірки та посилання, змінювати вміст та інше (F7)"
     :panel/comment-info                              (str "Перейти до режиму коментування, де можна створювати, редагувати і видаляти"
                                                           " ваші комірки та посилання, але не можете редагувати або видаляти комірки або посилання"
                                                           " інших людей. Однак ви можете посилатися на комірки, які не належать вам. (F7)")
     :panel/read-info                                 "Перейти до режиму перегляду, де не можна нічого змінювати, проте переглядати вміст простіше (F6)"
     :panel/undo-deletion                             "Скасування видалення"
     :panel/undo-deletion-info                        [:i18n/plural "Скасувати видалення {delete/num-units} {delete/unit-label} і {delete/num-links} {delete/link-label} (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "комірок" "комірка" "комірки" "комірок"]
                                                                :link-label [:delete/num-links
                                                                             "посилань" "посилання" "посилання" "посилань"]}]
     :panel/refresh                                   "Оновити"
     :panel/switch-style                              "Змінити стиль нових комірок і посилань; перетягніть, щоб створити нову комірку"
     :panel/profile                                   "Профіль"
     :panel/settings                                  "Налаштування"
     :panel/usergroups                                "Групи"
     :panel/stats                                     "Статистика"
     :panel/administration                            "Адміністрація"
     :panel/ios-install-info                          "Встановити додаток"
     :panel/upload-attachment                         "Вставте зображення або файли в нові комірки"
     :panel/selection-mode                            "Почати вибір"
     :panel/search                                    "Пошук (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Показати {panel/num-hidden-book-ids} {panel/unit-label} в теперішньому місцізнаходженні"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids
                                                                            "комірок" "комірка" "комірки" "комірок"]}]

     :password/too-short                              "Потрібно щонайменше 8 символів"
     :password/different-passwords                    "Пароль не співпадає"

     :password-reset/back-to-list                     "Назад до списку"
     :password-reset/change-password                  "Змінити пароль"
     :password-reset/set-password                     "Встановити пароль"
     :password-reset/has-password                     "Для вашого облікового запису встановлено пароль."
     :password-reset/without-password                 "Пароль ще не встановлено, оскільки для входу використовувалися пов'язані облікові записи."
     :password-reset/invalid-link                     "Невірне посилання; можливо, минуло 24 години. Будь ласка, попросіть надіслати електронний лист ще раз"
     :password-reset/description                      "Встановіть ваш новий пароль."
     :password-reset/enter-current-and-new-password   "Введіть поточний пароль і новий пароль."
     :password-reset/enter-new-password               "ВВедіть новий пароль."

     :path/add-step                                   "Крок"
     :path/add-step-tooltip                           "ENTER або TAB; утримуйте SHIFT, щоб скопіювати камеру"
     :path/hidden-ops                                 " і ще {path/num-hidden}"
     :path/title                                      "Назва презентації"
     :path/default-title                              "Презентація {path/num-paths}"
     :path/copy                                       "Скопіювати в нову презентацію"
     :path/copy-suffix                                "Копія"
     :path/add-audio                                  "Зв'язати аудіо з кроком"
     :path/remove-audio                               "Від'єднати аудіо від кроку"

     :paths/create-new-path                           "Створити презентацію"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Видалити презентацію " [:b title] "?"])
     :paths/help                                      "Виберіть комірки, щоб змінити відображення. Докладніше — у посібнику (англійською)."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Наразі план підписки " [:b tier] ", дійсний до " [:b end-date] "."
                                                         (if autorenewal
                                                           " Підписку буде автоматично подовжено наприкінці платіжного періоду."
                                                           " Термін дії підписки закінчиться після закінчення періоду оплати.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Ваш " [:b tier] " план закінчився " [:b end-date] ", оскільки ваш платіж не був успішно оплачений. "
                                                         "Якщо ви виправите ваш платіж, ваша підписка буде автоматично подовжена."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " в плані підписки " [:b tier] name "."])
     :payments/free-tier-info                         [:<> "OrgPad використовується в плані підписки " [:b "Безкоштовний,"] " без будь-яких платежів."]
     :payments/no-teams                               "Немає груп, що використовують план підписки Безкоштовний."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Для " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "оновлення"] " або "])
                                                         [:a.link-button {:href period-url} "зміни вашого періоду оплати"]
                                                         " зв'яжіться з нами."])
     :payments/choose-plan                            "Вибрати план"
     :payments/manage-plan                            "Керувати планом"
     :payments/billing-address                        "Платіжний адреса"
     :payments/billing-address-info                   (str "Вказаний платіжний адреса буде використано для всіх нових рахунків. "
                                                           "Останні рахунки також автоматично оновлюються.")
     :payments/receipt-label                          "Квитанція {receipt/date-range}"
     :payments/customer-portal-failed                 "Під час завантаження сайту керування сталася помилка планом."

     :pending-activation/email-already-used           "Електронна пошта вже використовується іншим обліковим записом."
     :pending-activation/email-not-recieved           "Не отримали електронного листа? Надішліть його знову або змініть адресу нижче."
     :pending-activation/email-sent                   "Електронний лист для активації надіслано. "
     :pending-activation/instructions                 "Ви майже у цілі! Активуйте свій обліковий запис одним натисканням на посилання, яке ми надіслали вам на електронну пошту."
     :pending-activation/resend                       "Надіслати електронний лист для активації ще раз"

     :permission/admin                                "Може ділитися та видаляти"
     :permission/admin-tooltip                        "Також той, хто має доступ, може змінювати документ."
     :permission/edit                                 "Може редагувати"
     :permission/edit-tooltip                         "Може вносити будь-які зміни до ОргСторінки."
     :permission/comment                              "Може коментувати"
     :permission/comment-tooltip                      (str "Може створювати власні нові комірки, "
                                                           "з'єднувати та змінювати їх.")
     :permission/view                                 "Може читати"
     :permission/view-tooltip                         "Може читати ОргСторінку, не вносячи жодних змін."

     :presentation/presentation                       "Презентація"
     :presentation/step                               "Крок"
     :presentation/present                            "Почати презентацію"
     :presentation/slideshow                          "Автоматичне покрокове відтворення "
     :presentation/step-duration                      "Тривалість кроку в секундах"
     :presentation/loop-slideshow                     "Повторіти після завершення"
     :presentation/respect-audio-track                "Тривалість кроку згідно з аудіодоріжкою"
     :presentation/stop-slideshow                     "Зупинити автоматичне покрокове відтворення"
     :presentation/exit-tooltip                       "Вихід з презентації"
     :presentation/play-audio                         "Відтворити аудіо для цього кроку"
     :presentation/pause-audio                        "Пауза відтворення аудіо"

     :presentation/share-presentation                 "Поділитись цією презентацією з іншими."

     :pricing-popup/orgpages-exceeded-title           "Безкоштовний план не дозволяє створювати більше ОргСторінок"
     :pricing-popup/orgpages-exceeded                 "Ви повинні оновити свій план."
     :pricing-popup/storage-exceeded-title            "Недостатньо місця для завантаження {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "У вашому сховищі залишилось тільки " [:b space-left] "."
                                                         " Ви можете оновити свій план, щоб збільшити обсяг пам'яті."])
     :pricing-popup/num-shared-limit-reached-title    "Ви не можете надати доступ до цієї ОргСторінки більшій кількості людей"
     :pricing-popup/num-shared-limit-reached-common   "Досягнуто максимальної кількості людей, які можуть спільно використовувати цю ОргСторінку."
     :pricing-popup/num-shared-limit-reached          [:<> " Щоб додати більше людей, ви повинні оновитись до "
                                                       [:b "плану Професійний"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Власник цієї ОргСторінки " owner " повинен оновитись до "
                                                         [:b "плану Професійний"] ", щоб додати більше людей."])
     :pricing-popup/enable-teams-title                "Оновіть свій план, щоб керувати групами"
     :pricing-popup/enable-teams                      [:<> "Групи об'єднують людей, що спрощує співпрацю та спільний доступ до ОргСторінок."
                                                       " Ця функція доступна лише у " [:b "плані Стандартний"] " або вище."]
     :pricing-popup/teams-limit-reached-title         "Оновіть свій план, щоб створювати більше груп"
     :pricing-popup/teams-limit-reached               "Для вашого плану досягнуто обмеження по кількості груп."
     :pricing-popup/team-members-limit-reached-title  "Ви не можете додати більше учасників до {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Досягнуто максимальної кількості членів групи."
     :pricing-popup/team-members-limit-reached        [:<> " Щоб додати більше учасників, ви повинні оновитись до "
                                                       [:b "плану Професійний"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " Власник цієї групи " owner " повинен оновитись до "
                                                         [:b "плану Професійний"] ", щоб додати більше членів."])
     :pricing-popup/try-out-share-title               "Зареєструйтесь, щоб поділитися цією ОргСторінкою"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "У вашому сховищі залишилось тільки " [:b space-left] "."])
     :pricing-popup/free-account-info                 "Зареєструвавшись, ви отримаєте:"
     :pricing-popup/free-limit                        "до трьох ОргСторінок,"
     :pricing-popup/free-storage                      "до 100 МБ сховища,"
     :pricing-popup/free-share                        "поділитись вашою роботою з іншими."
     :pricing-popup/free-account-info2                "Створіть свій обліковий запис за кілька кліків."
     :pricing-popup/register-to-comment               "Зареєструйтесь, щоб додати коментарі"
     :pricing-popup/register-to-comment-info          (str "Комірки коментування відображатимуть ваше ім'я та фотографію профілю. "
                                                           "Для цього вам потрібно створити обліковий запис спочатку.")
     :pricing-popup/print-watermark-title             "Оновіть свій план для вилучення водяного знаку"
     :pricing-popup/print-watermark-info              (str "Друк без водяних знаків OrgPad.info можливий лише "
                                                           "у професійному, шкільному та корпоративному планах.")

     :profile/open-contact-dialog                     "Послати повідомлення"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Зв'язатись з " first-name " " last-name)
                                                          "Зв'язатись з цією людиною"))
     :profile/contact-dialog-info                     (str "Оскільки ми не розкриваємо електронні адреси інших людей в OrgPad, це повідомлення від нас. Ми"
                                                           " додамо ваше ім'я та електронну адресу, щоб забезпечити прямий контакт.")

     :promotion/unknown                               "Невідомий код"
     :promotion/max-usages-reached                    "Використовувався занадто багато разів"
     :promotion/expired                               "Термін дії закінчився"
     :promotion/one-year-free                         "1 рік безкоштовно"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} безкоштовно"
                                                       {:promotion/days [:promotion/duration "днів" "день" "дні" "днів"]}]
     :promotion/for-one-year                          " на 1 рік"
     :promotion/for-six-months                        " на 6 місяців"

     :props/h1                                        "Великий заголовок"
     :props/h2                                        "Середній заголовок"
     :props/h3                                        "Малий заголовок"
     :props/weight-none                               "Тонка лінія з'єднання"
     :props/strong                                    "Товста лінія з'єднання"
     :props/arrowhead-none                            "Без стрілки"
     :props/single                                    "Стрілка"
     :props/double                                    "Подвійна стрілка"

     :public-permission/none                          "приватне."
     :public-permission/view                          "надано всім для проглядання."

     :registration/create-user                        "Створити обліковий запис"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Вже маєте обліковий запис? " [:a.link-button {:href route} "Увійти"]])
     :registration/options                            "Виберіть інший спосіб реєстрації"
     :registration/server-error                       "Помилка серверу. Спробуйте створити обліковий запис ще раз."
     :registration/missing-oauth-email                "{registration/service} не повідомила нам вашу електронну пошту. Будь ласка, заповніть її нижче."

     :search/previous-match                           "Попередній збіг (PAGE UP); перший збіг (HOME)"
     :search/next-match                               "Наступний збіг (PAGE DOWN, ENTER); останній збіг (END)"
     :search/close                                    "Закрити (ESC)"
     :search/cells-with-selected-attachments          "Комірки з вибраними файлами та зображеннями."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Змінити стиль вибраного "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; утримуйте SHIFT, щоб встановити поточний; утримуйте CTRL, щоб скопіювати до поточного"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "комірок" "комірка" "комірки" "комірок"]
                                                                   :link-label [:selection/num-links
                                                                                "посилань" "посилання" "посилання" "посилань"]}]

     :selection/link                                  "З'єднати комірки"
     :selection/hide-contents                         "Приховати вміст (ESC)"
     :selection/show-contents                         "Показати вміст"
     :selection/force-closing                         "Приховати ці елементи під час відкриття місцезнаходження (ESC)"
     :selection/step-focus-camera                     "Налаштувати камеру на вибрані комірки (F2 або Q). SHIFT — додати, ALT — видалити."
     :selection/fragment-focus-camera                 "Налаштувати камеру місцезнаходження на вибрані комірки (F2 або Q). SHIFT — додати, ALT — видалити."
     :selection/step-show-books                       "Показати тільки вибрані комірки в шаблоні (F3 або W). SHIFT — додати, ALT — видалити."
     :selection/fragment-show-books                   "Показати тільки вибрані комірки в місцезнаходженні (F3 або W). SHIFT — додати, ALT — видалити."
     :selection/force-showing                         "Показати вибрані комірки, якщо вони приховані."
     :selection/share-units                           "Скопіювати посилання для перегляду вибраних елементів. Утримуйте SHIFT, щоб відкрити налаштування."
     :selection/move-to-new-orgpage                   "Перейти до нової ОргСторінки"
     :selection/change-code-lang                      "Змінити мову коду"
     :selection/copy-units-links                      "Скопіювати комірки і посилання до буфера обміну"
     :selection/flip-links                            "Перевернути напрямок посилання"
     :selection/delete                                "Видалити вибране"

     :settings/profile                                "Профіль"
     :settings/payments                               "Платежі"
     :settings/account                                "Обліковий запис"
     :settings/linked-accounts                        "Пов'язані облікові записи"
     :settings/email                                  "Сповіщення"
     :settings/account-description                    "Змінити електронну пошту, пароль або видалити обліковий запис."
     :settings/stats-description                      "Тут знаходяться деякі статистичні дані про використання вашого OrgPad."
     :settings/change-email                           "Змінити електронну пошту"
     :settings/change-email-text                      "Введіть нову електронну адресу. З міркувань безпеки ми перевіремо її перед тим, як розблокувати обліковий запис."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Ваш обліковий запис зареєстровано на електронну адресу " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Ваш обліковий запис " [:b " прив'язаний "] " до Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Ваш обліковий запис " [:b " не прив'язаний "] " до Facebook."]
     :settings/link-fb                                "Прив'язати Facebook"
     :settings/unlink-fb                              "Відкріпити Facebook"
     :settings/account-linked-to-google               [:<> " Ваш обліковий запис " [:b " прив'язаний "] " до Google."]
     :settings/account-not-linked-to-google           [:<> " Ваш обліковий запис " [:b " не прив'язаний "] " до Google."]
     :settings/link-google                            "Прив'язати Google"
     :settings/unlink-google                          "Відкріпити Google"
     :settings/account-linked-to-microsoft            [:<> " Ваш обліковий запис " [:b " прив'язаний "] " до Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> " Ваш обліковий запис " [:b " не прив'язаний "] " до Microsoft."]
     :settings/link-microsoft                         "Прив'язати Microsoft"
     :settings/unlink-microsoft                       "Відкріпити Microsoft"
     :settings/account-linked-to-cuni                 [:<> " Ваш обліковий запис " [:b " прив'язаний "] " до Charles University."]
     :settings/account-not-linked-to-cuni             [:<> " Ваш обліковий запис " [:b " не прив'язаний "] " до Charles University."]
     :settings/link-cuni                              "Прив'язати Charles University"
     :settings/unlink-cuni                            "Відкріпити Charles University"
     :settings/set-password-text                      " Встановіть пароль перед тим, як відв'язати."
     :settings/linked-accounts-info                   "Прив'яжіть ваш обліковий запис у Facebook або Google до облікового запису OrgPad, щоб ви могли використовувати його для входу."
     :settings/profile-info                           "Надана інформація допоможе вам легше знайти співробітників по проекту."

     :settings/delete-account                         "Видалити обліковий запис"
     :settings/confirm-delete-account-question        [:<> [:b "Остаточно"] " видалити обліковий запис?"]
     :settings/confirm-delete-account-info            "Усі ваші ОргСторінки та їх дані буде видалено."
     :settings/delete-account-info                    [:<> "Видалення призведе до " [:b "остаточного"] " видалення всіх ваших ОргСторінок та їх даних."]

     :share-orgpage/campaigns                         "Кампанії"
     :share-orgpage/copied-to-clipboard               "Скопійовано до буфера обміну"
     :share-orgpage/copy-template-link                "Скопіювати посилання на шаблон"
     :share-orgpage/dialog-title                      "Поширити {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Люди, що не мають облікового запису OrgPad, одержать запрошення з посиланням."
                                                                  " Відкривши посилання, вони зможуть переглядати цю ОргСторінку. ")
                                                         [:a.link-button create-team "Створити групу,"]
                                                         " щоб легко ділитися ОргСторінками з декількома людьми."])
     :share-orgpage/email-found                       "Знайдено обліковий запис OrgPad."
     :share-orgpage/email-unused                      "Обліковий запис OrgPad не знайдено. Надіслати запрошення електронною поштою."
     :share-orgpage/checking-email-address            "Перевірка електронної адреси …"
     :share-orgpage/invite-for-editing                "Запрошення для редагування"
     :share-orgpage/invite-for-viewing                "Запрошення для проглядання"
     :share-orgpage/invite-by-email                   "Чи бажаєте ви запросити їх електронною поштою, використовуючи певну мову?"
     :share-orgpage/show-profile                      "Показати профіль"
     :share-orgpage/links                             "Посилання"
     :share-orgpage/to-read                           "щоб проглядати"
     :share-orgpage/to-comment                        "щоб коментувати"
     :share-orgpage/to-edit                           "щоб редагувати"
     :share-orgpage/links-tooltip                     "Надайте доступ через посилання для спільного доступу"
     :share-orgpage/template                          "Шаблон"
     :share-orgpage/template-tooltip                  "Посилання автоматично створюють копію цієї ОргСторінки"
     :share-orgpage/template-info                     "Люди можуть використовувати це посилання для створення власних копій цієї ОргСторінки."
     :share-orgpage/template-autoshare-none           "Не ділітися цими копіями зі мною."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Поділітися цими копіями зі мною для "
                                                             (case template-autoshare
                                                               :permission/view "читання"
                                                               :permission/comment "коментування"
                                                               :permission/edit "редагування") "."))
     :share-orgpage/embed                             "Вставити"
     :share-orgpage/embed-into-microsoft-teams        "Вставити в Microsoft Teams"
     :share-orgpage/embed-into-website                "Вставити в веб-сайт або застосунок"
     :share-orgpage/embed-tooltip                     "Вставте у свій веб-сайт"
     :share-orgpage/new-user-or-usergroup             "Ім'я, електронна адреса або група"
     :share-orgpage/link-permission-start             "Дозволені люди"
     :share-orgpage/link-permission-end               "ця ОргСторінка."
     :share-orgpage/orgpage-info                      "Інформація"
     :share-orgpage/orgpage-info-tooltip              "Інформація про власника та опубліковану ОргСторінку"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Цією ОргСторінкою поділилися з вами для"
                                                             (case user-permission
                                                               :permission/view "читання"
                                                               :permission/comment "коментування"
                                                               :permission/edit "редагування") "."))
     :share-orgpage/remove-yourself                   "Видалити себе"
     :share-orgpage/private-info                      (str "Доступ маєте лише ви та люди, яким ви надали доступ до ОргСторінки безпосередньо або за посиланням."
                                                           " Кожен новостворений документ є приватним.")
     :share-orgpage/publish-for-reading-info          (str "ОргСторінка є загальнодоступною. Будь-хто в Інтернеті може шукати та проглядати її."
                                                           " Зміни вносити можете лише ви або ті, з ким ви поділились ОргСторінкою для редагування.")
     :share-orgpage/publish-permission-end            "Ця ОргСторінка є "
     :share-orgpage/publish                           "Публічною"
     :share-orgpage/publish-confirmation              "Кожен буде у змозі {orgpage/permission} цю ОргСторінку. Ви впевнені?"
     :share-orgpage/publish-tooltip                   "Надано доступ усім"
     :share-orgpage/remove-user                       "Видалити дозвіл"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Якщо ви поділилися посиланням випадково, ви можете "
                                                         [:span.link-button reset-links "скасувати всі попередні посилання"]
                                                         "."])
     :share-orgpage/shareable-link                    "Посилання для спільного доступу"
     :share-orgpage/everything-closed                 "Показати всі комірки закритими"
     :share-orgpage/presentation                      "Почніть з презентації"
     :share-orgpage/fragment                          "Показати місцезнаходження"
     :share-orgpage/template-link-switch              "Створити посилання на шаблон."
     :share-orgpage/user-not-registered               " ще не зареєстрований на OrgPad."
     :share-orgpage/users                             "Люди"
     :share-orgpage/users-tooltip                     "Надайте доступ окремим людям"

     :side-panel/about                                "Домашня сторінка"
     :side-panel/terms-and-conditions                 "Умови та умови"
     :side-panel/privacy-and-security                 "Приватність та безпека"
     :side-panel/files-and-images                     "Файли та зображення"
     :side-panel/paths                                "Презентації"
     :side-panel/fragments                            "Місцезнаходження"
     :side-panel/translate                            "Перекласти"
     :side-panel/toggle-debug                         "Відладчик"
     :side-panel/help                                 "Допомога"
     :side-panel/blog                                 "Блог"
     :side-panel/home                                 "Додому"
     :side-panel/import                               "Імпортувати"
     :side-panel/share                                "Поділитися"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "файлів" "файл" "файли" "файлів"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "зображень" "зображення" "зображення" "зображень"]}]
     :side-panel/num-paths                            [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 " маршрутів " " маршрут " " маршрути " " маршрутів "]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "місцезнаходження" "місцезнаходження" "місцезнаходження" "місцезнаходження"]}]

     :step/closed-books                               "Закриті сторінки; CTRL+клік для вибору"
     :step/everything-closed                          "Все закрито"
     :step/hidden-books                               "Приховані комірки; CTRL+клік для вибору"
     :step/nothing-changed                            "Нічого не змінилося"
     :step/opened-pages                               "Відкриті сторінки; CTRL+клік для вибору"
     :step/focused-books                              "Сторінки, що відображаються у камері; CTRL+клік для вибору"
     :step/shown-books                                "Розкриті комірки; CTRL+клік для вибору"
     :step/switched-pages                             "Сторінки, що перемикалися; CTRL+клік для вибору"

     :style-select/set-comment                        "Перейдіть у комірку для коментарів із зображенням вашого профілю (CTRL+,)"
     :style-select/unset-comment                      "Змінити на звичайну комірку, видаливши зображення профілю (CTRL+,)"
     :style-select/set-comment-safari                 "Перейдіть у комірку для коментарів із зображенням вашого профілю (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Змінити на звичайну комірку, видаливши зображення профілю (SHIFT+CMD+,)"

     :tag/public                                      "загальнодоступний"

     :text-field/email                                "Електронна пошта"
     :text-field/first-name                           "Ім'я"
     :text-field/last-name                            "Прізвище"
     :text-field/name                                 "Ім'я"
     :text-field/new-password                         "Новий пароль"
     :text-field/password                             "Пароль"
     :text-field/content                              "Вміст"
     :text-field/name-or-email                        "Ім'я або електронна пошта"
     :text-field/subject                              "Тема"
     :text-field/message                              "Повідомлення"
     :text-field/phone-number                         "Номер телефону"
     :text-field/width                                "Ширина"
     :text-field/height                               "Висота"

     :translate/title                                 "Перекласти ОргСторінку {orgpage/title} на іншу мову"
     :translate/info                                  (str "Автоматично створює копію вашої ОргСторінки"
                                                           ", перекладену з вихідної мови на цільову."
                                                           " Ви можете знайти її у своєму списку за хвилину.")
     :translate/source-lang                           "Вихідна мова"
     :translate/target-lang                           "Цільова мова"
     :translate/translate                             "Перекласти"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Переклад доступний як "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :unit-editor/add-page                            "Створити іншу сторінку (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "Видалити цю сторінку"
     :unit-editor/previous-page                       (str "Попередня сторінка (PAGEUP);"
                                                           " утримуйте SHIFT, щоб перемістити цю сторінку ліворуч (SHIFT+PAGEUP);"
                                                           " утримуйте CTRL, щоб додати іншу сторінку перед цією сторінкою (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "Наступна сторінка (PAGEDOWN);"
                                                           " утримуйте SHIFT, щоб перемістити цю сторінку праворуч (SHIFT+PAGEDOWN);"
                                                           " утримуйте CTRL, щоб додати іншу сторінку після цієї сторінки (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Перейти на цю сторінку"
                                                             (when can-edit "; утримуйте SHIFT, щоб перемістити туди поточну сторінку")))
     :unit-editor/hidden-info                         "Натисніть, щоб записати"
     :unit-editor/undo                                "Скасувати (CTRL+Z)"
     :unit-editor/redo                                "Повторити (CTRL+SHIFT+Z або CTRL+Y)"
     :unit-editor/toggle-bold                         "Жирний (CTRL+B)"
     :unit-editor/toggle-italic                       "Курсив (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Закреслений"
     :unit-editor/toggle-subscript                    "Нижній індекс (CTRL+S)"
     :unit-editor/toggle-superscript                  "Верхній індекс (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Створити посилання (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Вилучити посилання"
     :unit-editor/set-highlighting                    "Встановити колір підсвітки"
     :unit-editor/selection->code                     "Перетворити на код (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Ненумерований список (TAB)"
     :unit-editor/toggle-list-ol                      "Нумерований список (CTRL+O)"
     :unit-editor/indent                              "Збільшити відступ (TAB)"
     :unit-editor/outdent                             "Зменшити відступ (SHIFT+TAB)"
     :unit-editor/center                              "Центрувати (CTRL+L)"
     :unit-editor/heading                             "Заголовок (CTRL+G)"
     :unit-editor/embed-pdf                           "Показати вміст PDF"
     :unit-editor/link-pdf                            "Замінити вміст PDF посиланням"
     :unit-editor/embed-office                        "Показати вміст Office"
     :unit-editor/link-office                         "Замінити вміст Office посиланням"
     :unit-editor/embed-video                         "Показати відео"
     :unit-editor/link-video                          "Замінити відео посиланням"
     :unit-editor/embed-audio                         "Показати аудіо"
     :unit-editor/link-audio                          "Замінити аудіо посиланням"
     :unit-editor/hyperlink->embed                    "Вставити посилання"
     :unit-editor/embed->hyperlink                    "Замінити вставлену сторінку посиланням"
     :unit-editor/open-image-in-attachments           "Відкрити це зображення в списку файлів"
     :unit-editor/open-file-in-attachments            "Відкрити цей файл в списку файлів"
     :unit-editor/toggle-controls                     "Показати керування відео"
     :unit-editor/toggle-autoplay                     "Відтворювати автоматично"
     :unit-editor/toggle-muted                        "Відтворювати без звуку, автоматичне відтворення може бути заблоковано"
     :unit-editor/toggle-loop                         "Повторювати відтворення"
     :unit-editor/toggle-chained-size                 "Зберігати пропорції"
     :unit-editor/insert-menu                         "Вставити"
     :unit-editor/insert-image                        "Зображення"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Завантажте зображення з вашого пристрою."
     :unit-editor/insert-image-info2                  "Підказка: перетягніть або вставте зображення прямо в будь-яку комірку або в білий фон."
     :unit-editor/insert-camera                       "Камера"
     :unit-editor/insert-attachment                   "Файл"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Відео"
     :unit-editor/insert-video-info                   "Завантажте відео з вашого комп'ютера або вставте його з YouTube."
     :unit-editor/insert-video-info2                  "Підказка: перетягніть відео та мітки YouTube прямо в будь-яку комірку або в білий фон."
     :unit-editor/video-url                           "Посилання YouTube"
     :unit-editor/youtube-start                       "Початок"
     :unit-editor/youtube-end                         "Кінець"
     :unit-editor/insert-table                        "Таблиця"
     :unit-editor/insert-table-info                   "Виберіть розмір вставленої таблиці."
     :unit-editor/toggle-table-border                 "Показати табличні рамки"
     :unit-editor/add-row-before                      "Вставити рядок вище"
     :unit-editor/add-row-after                       "Вставити рядок нижче"
     :unit-editor/remove-current-row                  "Вилучити рядок"
     :unit-editor/add-column-before                   "Вставити стовпець зліва"
     :unit-editor/add-column-after                    "Вставити стовпець справа"
     :unit-editor/remove-current-column               "Вилучити стовпець"
     :unit-editor/remove-table                        "Вилучити таблицю"
     :unit-editor/insert-website                      "Веб-сайт"
     :unit-editor/insert-website-info                 (str "Ви можете вставити веб-сайт безпосередньо в комірку. "
                                                           "Якщо це не спрацювало, це може бути заблоковано власником веб-сайту.")
     :unit-editor/website-url-or-code                 "Адреса веб-сайту або код"
     :unit-editor/website-id                          "ID сайту"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Використовується для "
                                                         [:a.link-button {:href info :target "_blank"} "надсилання повідомлень між сайтами"] "."])
     :unit-editor/invalid-website-url                 "Неправильна адреса веб-сайту або код"
     :unit-editor/invalid-video-url                   "Неправильне посилання на відео"
     :unit-editor/update-website                      "Змінити адресу веб-сайту"
     :unit-editor/insert-orgpage                      "ОргСторінка"
     :unit-editor/insert-code                         "Код"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Скопіювати код"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Код як окремий параграф"
     :unit-editor/toggle-block-math                   "Математика на окремому рядку"
     :unit-editor/remove-code                         "Вилучити форматування коду"
     :unit-editor/insert-math                         "Математика / Хімія"

     :unit-panel/link                                 (str "Клікніть або перетягніть для з'єднання;"
                                                           " утримуйте SHIFT, щоб створити множинні з'єднання;"
                                                           " утримуйте CTRL, щоб створити ланцюжок комірок")
     :unit-panel/upload-attachment                    "Вставте зображення, або файл у цю комірку"
     :unit-panel/change-link-style                    (str "Змінити стиль цієї комірки; "
                                                           "утримуйте SHIFT, щоб встановити поточний, "
                                                           "утримуйте CTRL, щоб скопіювати до стилю за замовчуванням; "
                                                           "перетягніть, щоб підключитись у цьому стилі")
     :unit-panel/hide-content                         "Приховати вміст"
     :unit-panel/delete-unit                          "Видалити комірку"

     :usergroup/create                                "Створити групу"
     :usergroup/edit-title                            "Редагувати {usergroup/name}"
     :usergroup/info                                  "Створіть і керуйте групами ваших друзів і співробітників, щоб полегшити розповсюдження ОргСторінок."
     :usergroup/delete                                "Видалити групу"
     :usergroup/members                               "Члени"
     :usergroup/edit                                  "Змінити назву і логотип"
     :usergroup/show-actions                          "Показати дії"
     :usergroup/name                                  "Ім'я"
     :usergroup/hide-orgpages                         "Приховати ОргСторінки"
     :usergroup/hide-orgpages-tooltip                 "Вони можуть бути відображені, якщо група ввімкнена в фільтрі"
     :usergroup/hide-in-filter                        "Приховати в фільтрі"
     :usergroup/create-info                           "Ім'я групи й аватарку профілю може бачити тільки члени."
     :usergroup/confirm-delete                        [:<> [:b "Остаточно"] " видалити цю групу?"]
     :usergroup/members-title                         "члени групи {usergroup/name}"
     :usergroup/remove-member                         "Виключити з групи"
     :usergroup/remove-admin                          "Зняти права адміністратора"
     :usergroup/make-admin                            "Зробити адміністратором"
     :usergroup/admin-tooltip                         "Адміністратор може керувати членами групи та видаляти її."
     :usergroup/copy-usergroup                        "Скопіювати групу"

     :usergroup-role/owner                            "Власник"
     :usergroup-role/admin                            "Адміністратор"
     :usergroup-role/member                           "Член"

     :wire-transfer/title                             "Банківський переказ для річного плану {wire-transfer/tier}"
     :wire-transfer/info                              "Ми активуємо вашу річну підписку після одержання коштів на рахунок."
     :wire-transfer/used-currency                     "Платіж у {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Ім'я одержувача"
     :wire-transfer/account-number                    "Номер рахунку"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Сума"
     :wire-transfer/payment-purpose                   "Призначення платежу"
     :wire-transfer/qr-code-common                    (str "Зіскануйте цей платіжний QR-код у вашому банківському застосунку, щоб"
                                                           " автоматично вносити правильну інформацію.")
     :wire-transfer/cz-sk-qr-code-description         (str " Це QR-код, який зазвичай використовується для банківських переказів"
                                                           " у Чехії та Словаччині.")
     :wire-transfer/eu-qr-code-description            (str " Це QR-код, який зазвичай використовується для переказів SEPA"
                                                           " в Євросоюзі.")
     :wire-transfer/trial-info                        (str "Ви можете відкрити одноразову 7-денну підписку, щоб використовувати OrgPad"
                                                           " негайно. Коли банк підтвердить успішну оплату,"
                                                           " термін дії підписки буде продовжено"
                                                           " на 1 рік.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Якщо у вас виникли запитання чи труднощі, будь ласка,"
                                                         " повідомте нам, " [:a.link-button {:href url} "заповнивши цю форму"] "."])
     :wire-transfer/success-text                      [:<> "Ми активували " [:b "одноразову 7-денну підписку,"]
                                                       " тож ви можете негайно використовувати OrgPad за новим планом. "]
     :wire-transfer/common-result-text                (str "Коли банк підтвердить успішну оплату,"
                                                           " термін дії підписки буде продовжено"
                                                           " на 1 рік.")
     :wire-transfer/start-trial                       "Банківський переказ надіслано"
     :wire-transfer/start-trial-result-title          "Дякуємо за оплату"
     :wire-transfer/copy                              "Скопіювати до буферу обміну"

     :website-editor/settings                         "Налаштування"
     :website-editor/routes                           "Маршрути"
     :website-editor/menus                            "Меню"
     :website-editor/create-menu                      "Створити меню"
     :website-editor/edited-menu                      "Редагувати меню"
     :website-editor/untitled-menu                    "Меню без назви"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "дітей" "дитина" "дітей" "дітей"]}]
     :website-editor/delete-menu-item                 "Видалити цей пункт меню"
     :website-editor/add-menu-item                    "Додати пункт меню"
     :website-editor/menu-item-label                  "Ярлик пункту"
     :menu-item/path-type                             "Відкриває маршрути"
     :menu-item/url-type                              "Відкриває зовнішнє посилання URL"
     :menu-item/children-type                         "Відкриває підменю"
     :website-editor/menu-item-path                   "Маршрут"

     :youtube-placement/watch-on-prefix               (str "Дивитися" unicode/nbsp "на")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/uk dict)