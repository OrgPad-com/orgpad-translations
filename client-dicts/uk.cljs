(ns orgpad.client.i18n.dicts.uk
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.uk :as uk]
            [orgpad.client.util.unicode :as unicode]))

(def dict
  "A dictionary map from keywords to the corresponding Ukrainian texts."
  (merge
    uk/dict
    {:administration/page-title                       "Адміністрація - OrgPad"

     :attachments/allows-access-to-file               "Дозволяє доступ до цього файлу."
     :attachments/allows-access-to-image              "Дозволяє доступ до цього зображення."
     :attachments/no-preview                          "Попередній перегляд неможливий."
     :attachments/used-files                          "Файли в ОргСторінці"
     :attachments/unused-files                        "Сторонні файли"
     :attachments/used-images                         "Зображення в ОргСторінці"
     :attachments/unused-images                       "Сторонні зображення"
     :attachments/uploading-files                     "Завантаження файлів …"
     :attachments/previous-attachment                 "Попередній файл або зображення"
     :attachments/next-attachment                     "Наступний файл або зображення"

     :button/back                                     "Назад"
     :button/cancel                                   "Відхилити"
     :button/close                                    "Закрити"
     :button/comment                                  "Коментувати"
     :button/copied                                   "Скопійовано"
     :button/copy                                     "Копіювати"
     :button/copy-link                                "Копіювати посилання"
     :button/create                                   "Створити"
     :button/create-tooltip                           "Створити (Ctrl+Enter)"
     :button/delete                                   "Видалити"
     :button/delete-selected                          "Видалити вибране"
     :button/documentation                            "Документація"
     :button/download                                 "Завантажити"
     :button/download-all                             "Завантажити все"
     :button/drop                                     "Перемістити"
     :button/edit                                     "Редагувати"
     :button/import                                   "Імпортувати"
     :button/login                                    "Увійти"
     :button/logout                                   "Вийти"
     :button/publish                                  "Опублікувати"
     :button/read                                     "Проглянути"
     :button/register                                 "Зареєструватись"
     :button/save                                     "Зберегти зміни"
     :button/save-tooltip                             "Зберегти зміни (Ctrl+Enter)"
     :button/upload                                   "Додати"
     :button/send                                     "Відправити"
     :button/present                                  "Презентувати"
     :button/present-tooltip                          "Розпочати презентацію (F5)"
     :button/share                                    "Поширити"
     :button/start                                    "Cтарт"
     :button/exit                                     "Вийти"
     :button/show-password                            "Показати"
     :button/hide-password                            "Приховати"

     :checkout/currency                               "Валюта"
     :checkout/monthly                                "щомісячно"
     :checkout/yearly                                 "щорічно (зберегти 15%)"
     :checkout/failed-to-init                         "Під час завантаження веб-сайту оплати сталася помилка."
     :checkout/upgrade-plan                           "Оновити план"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Шкільний"] " або "
                                                         [:a.link-button {:href enterprise-url} "корпоративний"] "? Зв'яжіться з нами для індивідуальної угоди."])
     :checkout/pay-with-credit-card                   "Оплатити карткою"
     :checkout/pay-with-wire-transfer                 "Оплата банківським переказом"
     :checkout/promo-code                             "Промо-код"
     :checkout/try-for-free                           "Спробуйте безкоштовно"
     :checkout/activate-now                           "Активувати зараз"
     :checkout/continue-for-free                      "Продовжити безкоштовно"

     :consent/title                                   "Використання cookies у OrgPad"
     :consent/text                                    (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                        [:<> "Використовуючи цей сайт, ви погоджуєтеся з "
                                                         [:a.link-button terms-and-conditions "Правилами та Умовами OrgPad"]
                                                         " і "
                                                         [:a.link-button privacy-policy "Політикою конфіденційності"]
                                                         (str ". Ми використовуємо файли cookie, щоб покращити функціональність "
                                                              "певних областей для полегшення використання OrgPad.")])

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
     :dashboard/public-permission-view                "Надано доступ усім для проглядання"
     :dashboard/public-permission-edit                "Надано доступ усім для редагування"

     :embedding-code/code                             "Кодувати"
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
     :error/name-already-used                         "Ім'я вже використовується"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "ОргСторінка " (when title "\"{orgpage/title}\"") " було переміщено."))
     :error/owner-of-orgpage                          "Ця людина вже є власником цієї ОргСторінки."
     :error/profile-not-found                         "Профіль не знайдено."
     :error/unknown-error                             "Невідома помилка, спробуйте ще раз."
     :error/unknown-id                                "Невідома ОргСторінка."
     :error/unknown-login-or-email                    "Невідома електронна адреса або логін групи."
     :error/unknown-usergroup                         "Група була видалена"
     :error/upload-failed                             "Не вдалось загрузити ОргСторінку: \"{orgpage/title}\""

     :feedback/ask-question                           "Запитати"
     :feedback/hide-button                            "Приховати кнопку назавжди"
     :feedback/dialog-title                           "Зв’язатись із розробниками OrgPad"
     :feedback/description                            [:<> "Якщо потрібна допомога або маєте якусь проблему, будь ласка, дайте нам - "
                                                       [:b "розробникам OrgPad"] " знати. "
                                                       "Також ми вітаємо будь-які ідеї щодо покращення. "
                                                       "Ми відповімо вам електронною поштою якомога швидше."]
     :feedback/languages                              "Ви можете писати нам англійською, чеською та німецькою."
     :feedback/contact-when-problem-persists          [:<> " Якщо проблема не зникне, зв’яжіться з нами за адресою "
                                                       [:a.link-button {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."]
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
                                                        [:<> "За допомогою цієї форми ви зв’яжетеся з представником OrgPad s.r.o."
                                                         " Ми зв'яжемося з вами найближчим часом за вашою електронною адресою " [:b email]
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

     :help-screen/units-with-shadows                  "Відтінені комірки відкриваються і закриваються одиничним кліком."
     :help-screen/flat-units                          "Плоскі комірки не містять додаткового вмісту."

     :help-screen/more-pages                          "Множинні сторінки позначені кружечками внизу."
     :help-screen/click-title-to-close                "Клік по заголовку негайно закриває комірку."
     :help-screen/click-content-next-page             "Клік по вмісту веде до переходу на наступну сторінку."
     :help-screen/click-bullet-goto-page              "Натисніть на кружечки, щоб перейти безпосередньо на сторінку."

     :help-screen/create-links                        "Створіть посилання, перетягнувши кнопку приєднання або клінувши по ній, а потім по місцю призначення."
     :help-screen/create-unit-by-dragging-link        "Створення посилання на порожній простір створює там нову комірку."

     :help-screen/how-to-view                         "Як проглядати"
     :help-screen/opening-units                       "Відкриття комірок"
     :help-screen/moving-pages                        "Множинні сторінки"

     :help-screen/how-to-edit                         "Як редагувати"
     :help-screen/creating-links                      "Створення посилань"

     :help-screen/help                                "Допомогу можна знайти тут!"

     :info/uploading-attachments                      [:i18n/plural "Завантаження {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "файлів" "файл" "файла" "файлів"]}]
     :info/uploading-images                           [:i18n/plural "Завантаження {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "зображень" "зображення" "зображення"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Не вдалось завантажити {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "зображень" "зображення" "зображення"]}]
                                                          "Не вдалось завантажити як мінімум одне зображення."))
     ;; TODO
     #_#_:info/uploading-youtubes-failed [:i18n/plural "{info/count} Youtube {info/num-youtubes} не знайдено."
                                          {:info/num-youtubes [:info/count "videos" "video" "videos"]}]
     :info/uploading-attachments-failed               "Не вдалось завантажити файли."
     :info/presentation-link-copied                   "Посилання на цю презентацію скопійоване."
     :info/max-orgpages-exceeded                      "Власник цієї ОргСторінки не може створити додаткову ОргСторінку."
     :info/storage-exceeded                           "У власника цієї ОргСторінки не залишилося {upload/total-size} для завантаження цих файлів."
     :info/attachments-too-large                      (str "Неможливо завантажити {upload/total-size} в одному завантаженні."
                                                           " Максимальний розмір усіх завантажених вкладень становить 500 MB.")

     :import/another-format                           [:<> "Якщо ви хочете імпортувати дані іншого формату, зв’яжіться з нами за адресою "
                                                       [:b "support@orgpad.com"] "."]
     :import/dialog                                   "Імпортувати дані"
     :import/google-docs                              "Щоб вставити дані з Microsoft Office або Google Docs, просто вставте їх в ОргСторінку."
     :import/supported-formats                        "Зараз ми підтримуємо такі формати:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " експортовано як файл .vsdx."]

     :ios/install-info                                "Встановити OrgPad додаток"
     :ios/share-button                                "1. Відкрити"
     :ios/add-to-home-screen                          "2. Натисніть"

     :lang/cs                                         "Чеська"
     :lang/de                                         "Німецька"
     :lang/en                                         "Англійська"
     :lang/hi                                         "Хінді"
     :lang/pl                                         "Польська"
     :lang/ru                                         "Російська"

     :language-select/lang-tooltip                    (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                        (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

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

     :loading/initial-autoresize                      "Розрахунок розміру всіх комірок, {loading/num-units} залишилось …"
     :loading/initial-layout                          "Удосконалення початкового формату …"
     :loading/restoring-opened-pages                  "Відновлення позиції відкритих сторінок …"
     :loading/getting-orgpage                         "Завантаження ОргСторінки із сервера …"
     :loading/getting-dashboard                       "Завантаження списка доступних ОргСторінок із сервера …"
     :loading/getting-website                         "Завантаження веб-сайту з сервера …"
     :loading/uploading-orgpage                       "Завантаження ОргСторінки на сервер …"
     :loading/ws-init                                 "Налаштування зв'язку з сервером …"
     :loading/ws-closed                               "Зв'язок із сервером втрачено. Спробуйте перепідключитись. Якщо проблема не зникне, перезавантажте сторінку."
     :loading/administration                          "Завантаження даних адміністратора …"
     :loading/profile                                 "Завантаження профілю …"
     :loading/style                                   "Завантаження стилів …"
     ;; Needed?
     :loading/start-trial                             "Початок 7-денної пробної підписки …"
     :loading/uploading-attachments                   "Завантаження вкладень на сервер …"

     :login/continue-with-email                       "Продовжити з електронною поштою"
     :login/continue-with-facebook                    "Продовжити з Facebook"
     :login/continue-with-google                      "Продовжити з Google"
     :login/continue-with-microsoft                   "Продовжити з Microsoft"
     :login/forgotten-password                        "Забули пароль"
     :login/forgotten-password-email-resent           "Електронний лист для скидання пароля надіслано."
     :login/forgotten-password-description            "Отримайте посилання для скидання пароля електронною поштою (дійсне 24 години)."
     :login/forgotten-password-error                  [:<> "Ця електронна адреса заблокована вами. Розблокуйте або натисніть на Відписатись у будь-якому листі від OrgPad, або надішліть нам електронний лист за адресою "
                                                       [:b "support@orgpad.com"]
                                                       " з цієї електронної адреси."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Новий у OrgPad? " [:a.link-button {:href route} "Зареєструватись"]])
     :login/options                                   "Виберіть інший спосіб входу"
     :login/send-reset-link                           "Надіслати посилання для скидання"
     :login/wrong-email-or-password                   "Невірна електронна адреса або пароль."

     :meta/orgpage-thumbnail                          "зображення ОргСторінки"
     :meta/thumbnail-info                             (str "Виберіть зображення, яке відображається для цієї ОргСторінки. Воно використовується в "
                                                           "списку ОргСторінки, у вбудованих вставках, коли ділиться в соціальних мережах.")
     :meta/automatic-screenshot                       "Автоматично створений образ екрана. Оновлення протягом п’яти хвилин після кожної зміни."
     :meta/custom-thumbnail                           "Завантажте власне зображення розміром 1360x768."
     :meta/upload-thumbnail                           "Завантажте власне зображення"
     :meta/thumbnail-upload-failed                    "Не вдалося завантажити зображення."
     :meta/description                                "Опис"
     :meta/new-tag                                    "Додати тег"
     :meta/info                                       (str "Інформація, наведена нижче, допоможе дізнатися, про що ця ОргСторінка. "
                                                           "Ви можете відфільтровувати за тегами список ОргСторінок.")
     :meta/info-in-share-orgpage                      "Перед поширенням цієї ОргСторінки потрібно встановити назву."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Перемістити вибране {selection/num-units} {selection/units-label} "
                                                                         "and {selection/num-links} {selection/links-label} в нову ОргСторінку "
                                                                         "з наступною інформацією. У поточній ОргСторінці ці комірки та посилання "
                                                                         "буде замінено однією клітинкою, що містить нову ОргСторінку всередині.")
                                                       {:selection/units-label [:selection/num-units "cells" "cell" "cells"] ; TODO
                                                        :selection/links-label [:selection/num-links "links" "link" "links"]}] ; TODO
     :meta/move-to-new-orgpage-title                  "Перейти до {meta/title}"
     :meta/move-to-new-orgpage                        "Перейти до нової ОргСторінки"

     :notes/create-note                               "Нова нотатка"
     :notes/edit-note                                 "Редагувати нотатку"
     :notes/manage-notes                              "Управляти нотатками"
     :notes/my-notes                                  "Мої нотатки"
     :notes/notes                                     [:i18n/plural "{notes/num-notes} {notes/notes-label}"
                                                       {:notes/notes-label [:notes/num-notes
                                                                            "нотаток" "нотатка" "нотатки" "нотаток"]}]
     :notes/untitled                                  "Нотатка без назви"
     :notes/confirm-delete                            "Видалити цю нотатку?"
     :notes/notes-description                         "Зафіксуйте свої ідеї та відсортуйте їх пізніше."

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
     :orgpage/create-unit-hold-or-double-tap          "Утримуйте або двічі натисніть, щоб створити клітинку."
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

     :orgpage-stats/number-of-units                   "Число комірок"
     :orgpage-stats/number-of-links                   "Число посилань"
     :orgpage-stats/number-of-files                   "Число файлів"
     :orgpage-stats/number-of-images                  "Число зображень"

     :org-role/student                                "Студент"
     :org-role/teacher                                "Викладач"
     :org-role/employee                               "Співробітник"
     :org-role/admin                                  "Адміністратор"

     :panel/create-orgpage                            "Нова ОргСторінка"
     :panel/logo-tooltip                              "Додому"
     :panel/edit-info                                 "Перейти до режиму редагування, де можна створювати і видаляти комірки та посилання, змінювати вміст та інше (F7)"
     ;; TODO: Add :panel/comment-info with approapriate translations
     :panel/read-info                                 "Перейти до режиму перегляду, де не можна нічого змінювати, проте переглядати вміст простіше (F6)"
     :panel/undo-deletion                             "Скасування видалення"
     :panel/undo-deletion-info                        [:i18n/plural "Скасувати видалення {delete/num-units} {delete/unit-label} і {delete/num-links} {delete/link-label} (CTRL+Z)."
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
     :panel/upload-attachment                         "Вставте зображення або файли в нові клітинки"
     :panel/selection-mode                            "Почати вибір"

     :password/too-short                              "Потрібно щонайменше 8 символів"
     :password/different-passwords                    "Пароль не співпадає"

     :password-reset/back-to-list                     "Назад до списку"
     :password-reset/change-password                  "Змінити пароль"
     :password-reset/set-password                     "Встановити пароль"
     :password-reset/has-password                     "Для вашого облікового запису встановлено пароль."
     :password-reset/without-password                 "Пароль ще не встановлено, оскільки для входу використовувалися пов’язані облікові записи."
     :password-reset/invalid-link                     "Невірне посилання; можливо, минуло 24 години. Будь ласка, попросіть надіслати електронний лист ще раз"
     :password-reset/description                      "Встановіть ваш новий пароль."
     :password-reset/enter-current-and-new-password   "Введіть поточний пароль і двічі новий пароль."
     :password-reset/enter-new-password-twice         "ВВедіть новий пароль двічі."

     :path/add-step                                   "Додати крок"
     :path/add-step-tooltip                           "Утримуйте SHIFT, щоб скопіювати камеру"
     :path/title                                      "Презентація {path/num-paths}"
     :paths/create-new-path                           "Створити презентацію"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Видалити презентацію " [:b title] "?"])

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Наразі план підписки " [:b tier] ", дійсний до " [:b end-date] "."
                                                         (if autorenewal
                                                           " Підписку буде автоматично подовжено наприкінці платіжного періоду."
                                                           " Термін дії підписки закінчиться після закінчення періоду оплати.")])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " в плані підписки " [:b tier] name "."])
     :payments/free-tier-info                         [:<> "OrgPad використовується в плані підписки " [:b "Безкоштовний,"] " без будь-яких платежів."]
     :payments/no-teams                               "Немає груп, що використовують план підписки Безкоштовний."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Для " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "оновлення"]] " або ")
                                                         [:a.link-button {:href period-url} "зміни вашого періоду оплати"]
                                                         " зв'яжіться з нами."])
     :payments/choose-plan                            "Вибрати план"
     :payments/manage-plan                            "Керувати планом"
     :payments/contact-to-manage                      (fn [{:payments/keys [url]}]
                                                        [:<> "Зв'яжіться з нами, щоб "
                                                         [:a.link-button {:href url} "керувати вашою підпискою"] "."])
     :payments/receipts                               "Квитанції:"
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
                                                           "з’єднувати та змінювати їх.")
     :permission/view                                 "Може читати"
     :permission/view-tooltip                         "Може читати ОргСторінку, не вносячи жодних змін."

     :presentation/presentation                       "Презентація"
     :presentation/step                               "Крок"
     :presentation/first-step                         "Перший крок"
     :presentation/previous-step                      "Попередній крок"
     :presentation/next-step                          "Наступний крок"
     :presentation/last-step                          "Останній крок"
     :presentation/present                            "Почати презентацію"
     :presentation/slideshow                          "Автоматичне покрокове відтворення "
     :presentation/step-duration                      "Тривалість кроку в секундах"
     :presentation/loop-slideshow                     "Повторіти після завершення"
     :presentation/stop-slideshow                     "Зупинити автоматичне покрокове відтворення"
     :presentation/exit-tooltip                       "Вихід з презентації"

     :presentation/share-presentation                 "Поділитись цією презентацією з іншими."

     :presentation/embedded-zoom-info                 "CTRL + scroll для масштабування"

     :paths-menu/focus                                "Встановити камеру {keyboard/shortcut}"
     :paths-menu/open-and-close                       "Відкрити і закрити комірку {keyboard/shortcut}"
     :paths-menu/visibility                           "Змінити видимість {keyboard/shortcut}"

     :pricing-popup/orgpages-exceeded-title           "Безкоштовний план не дозволяє створювати більше ОргСторінок"
     :pricing-popup/orgpages-exceeded                 "Ви повинні оновити свій план."
     :pricing-popup/storage-exceeded-title            "Недостатньо місця для завантаження {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "У вашому сховищі залишилось тільки " [:b space-left] "."
                                                         " Ви можете оновити свій план, щоб збільшити обсяг пам’яті."])
     :pricing-popup/num-shared-limit-reached-title    "Ви не можете надати доступ до цієї ОргСторінки більшій кількості людей"
     :pricing-popup/num-shared-limit-reached-common   "Досягнуто максимальної кількості людей, які можуть спільно використовувати цю ОргСторінку."
     :pricing-popup/num-shared-limit-reached          [:<> " Щоб додати більше людей, ви повинні оновитись до "
                                                       [:b "плану Професійний"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Власник цієї ОргСторінки " owner " повинен оновитись до "
                                                         [:b "плану Професійний"] ", щоб додати більше людей."])
     :pricing-popup/enable-teams-title                "Оновіть свій план, щоб керувати групами"
     :pricing-popup/enable-teams                      [:<> "Групи об’єднують людей, що спрощує співпрацю та спільний доступ до ОргСторінок."
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

     :profile/open-contact-dialog                     "Послати повідомлення"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Зв'язатись з " first-name " " last-name)
                                                          "Зв'язатись з цією людиною"))
     :profile/contact-dialog-info                     (str "Оскільки ми не розкриваємо електронні адреси інших людей в OrgPad, це повідомлення від нас. Ми"
                                                           " додамо ваше ім’я та електронну адресу, щоб забезпечити прямий контакт.")

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
     :public-permission/comment                       "надано всім для коментування."
     :public-permission/edit                          "надано всім для редагування."
     :public-permission/view                          "надано всім для проглядання."

     :registration/create-user                        "Створити обліковий запис"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Вже маєте обліковий запис? " [:a.link-button {:href route} "Увійти"]])
     :registration/options                            "Виберіть інший спосіб реєстрації"
     :registration/server-error                       "Помилка серверу. Спробуйте створити обліковий запис ще раз."
     :registration/missing-oauth-email                "{registration/service} не повідомила нам вашу електронну пошту. Будь ласка, заповніть її нижче."

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
     :selection/hide-contents                         "Приховати вміст"
     :selection/show-contents                         "Показати вміст"
     :selection/move-to-new-orgpage                   "Перейти до нової ОргСторінки"
     :selection/copy-units-links                      "Скопіювати комірки і посилання до буфера обміну"
     :selection/flip-links                            "Перевернути напрямок посилання"
     :selection/delete                                "Видалити вибране"

     :settings/profile                                "Профіль"
     :settings/payments                               "Платежі"
     :settings/account                                "Обліковий запис"
     :settings/linked-accounts                        "Пов'язані облікові записи"
     :settings/notifications                          "Сповіщення"
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
     :settings/set-password-text                      " Встановіть пароль перед тим, як відв'язати."
     :settings/linked-accounts-info                   "Прив'яжіть ваш обліковий запис у Facebook або Google до облікового запису OrgPad, щоб ви могли використовувати його для входу."
     :settings/profile-info                           "Надана інформація допоможе вам легше знайти співробітників по проекту."
     :settings/select-language                        "Мова застосунку (Ctrl+Shift+L): "

     :settings/delete-account                         "Видалити обліковий запис"
     :settings/confirm-delete-account-question        [:<> [:b "Остаточно"] " видалити обліковий запис?"]
     :settings/confirm-delete-account-info            "Усі ваші ОргСторінки та їх дані буде видалено."
     :settings/delete-account-info                    [:<> "Видалення призведе до " [:b "остаточного"] " видалення всіх ваших ОргСторінок та їх даних."]

     :share-orgpage/campaigns                         "Campaigns"
     :share-orgpage/copy-template-link                "Скопіювати посилання на шаблон"
     :share-orgpage/dialog-title                      "Поширити {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Люди, що не мають облікового запису OrgPad, одержать запрошення з посиланням."
                                                                  " Відкривши посилання, вони зможуть переглядати цю ОргСторінку. ")
                                                         [:a.link-button create-team "Створити групу,"]
                                                         " щоб легко ділитися ОргСторінками з декількома людьми."])
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
     :share-orgpage/embed-tooltip                     "Вставте у свій веб-сайт"
     :share-orgpage/new-user-or-usergroup             "Ім'я, електронна адреса або група"
     :share-orgpage/link-permission-start             "Дозволені люди"
     :share-orgpage/link-permission-end               "ця ОргСторінка."
     :share-orgpage/orgpage-info                      "Info"
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
     :share-orgpage/publish-for-commenting-info       "ОргСторінка є загальнодоступною. Будь-хто в Інтернеті може шукати та коментувати її." ; add "comment it with an OrgPad account"
     :share-orgpage/publish-for-editing-info          "ОргСторінка є загальнодоступною. Будь-хто в Інтернеті може шукати та редагувати її."
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
     :share-orgpage/start-with-presentation           "Почніть з презентації."
     :share-orgpage/template-link-switch              "Створити посилання на шаблон."
     :share-orgpage/user-not-registered               " ще не зареєстрований на OrgPad."
     :share-orgpage/users                             "Люди"
     :share-orgpage/users-tooltip                     "Надайте доступ окремим людям"

     :side-panel/about                                "Домашня сторінка"
     :side-panel/files-and-images                     "Файли та зображення"
     :side-panel/paths                                "Презентації"
     :side-panel/translate                            "Перекласти"
     :side-panel/help                                 "Допомога"
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

     :step/closed-pages                               "Закриті сторінки"
     :step/everything-closed                          "Все закрито."
     :step/hidden-units                               "Приховані комірки"
     :step/nothing-changed                            "Нічого не змінилося."
     :step/opened-pages                               "Відкриті сторінки"
     :step/pages-shown-in-the-camera                  "Сторінки, що відображаються у камері"
     :step/revealed-units                             "Розкриті комірки"
     :step/switched-pages                             "Сторінки, що перемикалися "

     :style-select/set-comment                        "Перейдіть у комірку для коментарів із зображенням вашого профілю (CTRL+,)"
     :style-select/unset-comment                      "Змінити на звичайну комірку, видаливши зображення профілю (CTRL+,)"

     :tag/public                                      "загальнодоступний"

     :text-field/email                                "Email"
     :text-field/first-name                           "Ім'я"
     :text-field/last-name                            "Прізвище"
     :text-field/new-password                         "Новий пароль"
     :text-field/password                             "Пароль"
     :text-field/title                                "Назва"
     :text-field/content                              "Вміст"
     :text-field/name-or-email                        "Ім'я або електронна пошта"
     :text-field/subject                              "Тема"
     :text-field/message                              "Повідомлення"

     :tier/free                                       "Вільний"
     :tier/standard                                   "Стандартний"
     :tier/professional                               "Професійний"
     :tier/school                                     "Шкільний"
     :tier/enterprise                                 "Корпоративний"
     :tier/unlimited                                  "Безлімітний"

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
                                                                          :target "_порожньо"} title]])

     :usergroup-role/owner                            "Власник"
     :usergroup-role/admin                            "Адміністратор"
     :usergroup-role/member                           "Член"

     :unit-editor/add-page                            "Створити іншу сторінку"
     :unit-editor/delete-page                         "Видалити цю сторінку"
     :unit-editor/previous-page                       "Попередня сторінка (PAGEUP) ; утримуйте SHIFT, щоб перемістити цю сторінку ліворуч (SHIFT+PAGEUP)"
     :unit-editor/next-page                           "Наступна сторінка (PAGEDOWN) ; утримуйте SHIFT, щоб перемістити цю сторінку праворуч (SHIFT+PAGEDOWN)"
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Перейти на цю сторінку"
                                                             (when can-edit "; утримуйте SHIFT, щоб перемістити туди поточну сторінку")))
     :unit-editor/hidden-info                         "Натисніть, щоб записати"

     :unit-panel/link                                 "Клікніть або перетягніть для з'єднання; утримуйте SHIFT, щоб створити множинні з'єднання"
     :unit-panel/upload-attachment                    "Вставте зображення, або файл у цю клітинку"
     :unit-panel/change-link-style                    (str "Змінити стиль цієї комірки; "
                                                           "утримуйте SHIFT, щоб встановити поточний, "
                                                           "утримуйте CTRL, щоб скопіювати до стилю за замовчуванням; "
                                                           "перетягніть, щоб підключитись у цьому стилі")
     :unit-panel/hide-content                         "Приховати вміст"
     :unit-panel/delete-unit                          "Видалити комірку"

     :usergroups/create-team                          "Створити групу"
     :usergroups/info                                 "Створіть і керуйте групами ваших друзів і співробітників, щоб полегшити розповсюдження ОргСторінок."
     :usergroups/delete-usergroup                     "Видалити групу"
     :usergroups/members                              "Члени"
     :usergroups/change                               "Змінити назву і логотип"
     :usergroups/show-actions                         "Показати дії"
     :usergroups/name                                 "Ім'я"
     :usergroups/create-usegroup-info                 "Ім’я групи й аватарку профілю може бачити будь-хто на OrgPad."
     :usergroups/confirm-delete-usergroup             [:<> [:b "Остаточно"] " видалити цю групу?"]
     :usergroups/usergroups-members                   "члени групи {usergroup/name}"
     :usergroups/remove-member                        "Виключити з групи"
     :usergroups/remove-admin                         "Зняти права адміністратора"
     :usergroups/make-admin                           "Зробити адміністратором"
     :usergroups/admin-tooltip                        "Адміністратор може керувати членами групи та видаляти її."

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
     :youtube-placement/watch-on-suffix               ""
     }))
