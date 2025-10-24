(ns orgpad.client.i18n.dicts.ru
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.ru :as ru]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  "A dictionary map from keywords to the corresponding Russian texts."
  (merge
    ru/dict
    {:address/company                                 "Название компании"
     :address/ico                                     "ИНН"
     :address/street                                  "Улица"
     :address/street-number                           "Номер"
     :address/postal-code                             "Почтовый индекс"
     :address/city                                    "Город"
     :address/country                                 "Страна"

     :administration/page-title                       "Администрация - OrgPad"

     :attachments/allows-access-to-file               "Разрешает доступ к этому файлу."
     :attachments/allows-access-to-image              "Разрешает доступ к этому изображению."
     :attachments/no-preview                          "Предварительный просмотр невозможен."
     :attachments/all-files                           "Все файлы"
     :attachments/used-files                          "Файлы в ОргСтраничке"
     :attachments/unused-files                        "Посторонние файлы"
     :attachments/all-images                          "Все изображения"
     :attachments/used-images                         "Изображения в ОргСтраничке"
     :attachments/unused-images                       "Посторонние изображения"
     :attachments/uploading-files                     "Загрузка файлов …"
     :attachments/previous-attachment                 "Предыдущий файл или изображение"
     :attachments/next-attachment                     "Следующий файл или изображение"
     :attachments/display-using-microsoft-365         "Отображать с помощью Microsoft 365"
     :attachments/edit-filename                       "Изменить название"
     :attachments/title-order                         "Алфавитно по названию"
     :attachments/upload-order                        "Новые сверху"
     :attachments/size-order                          "Большие сверху"
     :attachments/split-used-unused                   "Группировать по наличию в ОргСтраничке"
     :attachments/search                              "Поиск"
     :attachments/ordering                            "Сортировка"
     :attachments/new-version                         "Новая версия"
     :attachments/preserve-old-version                "Сохранить старую версию"
     :attachments/in-other-orgpages                   "Заменить в других ОргСтраничках:"

     :button/back                                     "Назад"
     :button/cancel                                   "Отклонить"
     :button/close                                    "Закрыть"
     :button/comment                                  "Комментировать"
     :button/continue                                 "Продолжить"
     :button/copied                                   "Скопировано"
     :button/copy                                     "Копировать"
     :button/copy-link                                "Копировать ссылку"
     :button/create                                   "Создать"
     :button/create-tooltip                           "Создать (CTRL+ENTER)"
     :button/delete                                   "Удалить"
     :button/delete-selected                          "Удалить выделение"
     :button/documentation                            "Документация"
     :button/download                                 "Загрузить"
     :button/download-all                             "Загрузить все"
     :button/drop                                     "Перетащить"
     :button/edit                                     "Редактировать"
     :button/import                                   "Импортировать"
     :button/insert                                   "Вставить"
     :button/login                                    "Войти"
     :button/logout                                   "Выйти"
     :button/publish                                  "Опубликовать"
     :button/read                                     "Просмотреть"
     :button/register                                 "Зарегистрироваться"
     :button/register-to-save                         "Зарегистрироваться для сохранения"
     :button/remove                                   "Удалить"
     :button/reset                                    "Сбросить"
     :button/save                                     "Сохранить изменения"
     :button/save-tooltip                             "Сохранить изменения (CTRL+ENTER)"
     :button/upload                                   "Добавить"
     :button/upload-from-computer                     "Загрузить с компьютера"
     :button/send                                     "Отправить"
     :button/present                                  "Презентовать"
     :button/present-tooltip                          "Начать презентацию (F5)"
     :button/share                                    "Поделиться"
     :button/start                                    "Начинать"
     :button/exit                                     "Выйти"
     :button/show-password                            "Показать"
     :button/hide-password                            "Скрыть"

     :checkout/currency                               "Валюта"
     :checkout/monthly                                "помесячно"
     :checkout/yearly                                 "ежегодно (сэкономить 15 %)"
     :checkout/failed-to-init                         "Во время загрузки сайта оплаты произошла ошибка."
     :checkout/upgrade-plan                           "Обновить план"
     :checkout/professional-plan                      "Профессиональный план"
     :checkout/school-plan                            "Школьный план"
     :checkout/enterprise-plan                        "Корпоративный план"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Школьный"] " или "
                                                         [:a.link-button {:href enterprise-url} "корпоративный"] "? Свяжитесь с нами для индивидуального соглашения."])
     :checkout/pay-with-credit-card                   "Оплатить картой"
     :checkout/pay-with-wire-transfer                 "Оплата банковским переводом"
     :checkout/promo-code                             "Промо-код"
     :checkout/try-for-free                           "Попробуйте безплатно"
     :checkout/activate-now                           "Активировать сейчас"
     :checkout/continue-for-free                      "Продолжить безплатно"

     :code-lang/none                                  "Нет"
     :code-lang/multiple                              "Несколько"

     :dashboard/confirm-delete                        [:<> [:b "Навсегда"] " удалить эту ОргСтраничку?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Войти"] " или "
                                                         [:a {:href register-url} "зарегистрироваться,"]
                                                         " чтобы создать новые ОргСтранички."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "Подписка вашей школы " name " закончилась " subscription-expired ". "
                                                         "Для продления свяжитесь с вашим руководством. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Дополнительная информация"] " о 95%-й скидке для школ."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Получите OrgPad для своей школы без ограничений со скидкой 95 %. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Дополнительная информация."]])
     :dashboard/owned-orgpages                        "Мои ОргСтранички"
     :dashboard/public-orgpages                       "Опубликованные ОргСтранички"
     :dashboard/shared-orgpages                       "ОргСтранички, которыми поделились со мной"
     :dashboard/usergroup-orgpages                    "ОргСтранички {usergroup/name}"
     :dashboard/help-or-inspiration-button            "Вот оно!"
     :dashboard/new-domain                            [:<> "Используйте новый домен " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Дополнительная информация в ОргСтраничке " [:a {:href "https://orgpad.info/s/new-domain"} "Изменения в OrgPad и новый домен"] "."]

     :dashboard-filter/filter                         "Фильтр ОргСтраничек"
     :dashboard-filter/ordering                       "Сортировка ОргСтраничек"
     :dashboard-filter/filter-and-ordering            "Фильтр и сортировка ОргСтраничек"
     :dashboard-filter/title                          "Фильтр и сортировка отображаемых ОргСтраничек"
     :dashboard-filter/ordering-label                 "Сортировка ОргСтраничек"
     :dashboard-filter/title-order                    "По названию (А–Я)"
     :dashboard-filter/creation-time-order            "Сначала новые"
     :dashboard-filter/last-modified-order            "Сначала обновлённые"
     :dashboard-filter/most-viewed-order              "Сначала популярные"
     :dashboard-filter/search-tags                    "Поиск по тегам"

     :embedding-code/code                             "Код"
     :embedding-code/description                      "Вставьте ОргСтраничку на сайт или в другое приложение."

     :error/orgpage-access-denied                     "У вас нет доступа к этой ОргСтраничке. Попробуйте войти."
     :error/usergroup-access-denied                   "Доступ к редактированию команды запрещён."
     :error/administration-access                     "Доступ администратора запрещён."
     :error/creation-unauthorized                     "Войдите для создания ОргСтраничек."
     :error/deleting-denied                           "Удаление ОргСтранички запрещено."
     :error/email-already-used                        "Email уже используется."
     :error/email-not-registered                      "Нет учетной записи, связанной с этим адресом электронной почты."
     :error/email-missing-mx-record                   "В этом домене сервер электронной почты не найден."
     :error/email-invalid                             "Адрес электронной почты недействителен."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Неправильная ОргСтраничка" (when id " {orgpage/id}")
                                                             ". Проверьте скопированную ссылку."))
     :error/incorrect-link                            "Неверная ссылка. Авторизуйтесь или откройте правильную ссылку."
     :error/incorrect-password                        "Неверный пароль."
     :error/incorrect-profile-id                      "Неверная ссылка на профиль. Проверьте скопированную ссылку."
     :error/lost-permission                           "Доступ к этой ОргСтраничке утерян."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "Электронные адреса без учетной записи: " emails))
     :error/name-already-used                         "Имя уже используется"
     :error/name-not-valid                            "Используйте не менее 5 символов"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "ОргСтраничка " (when title "\"{orgpage/title}\"") " была удалена."))
     :error/owner-of-orgpage                          "Этот человек уже является владельцем этой ОргСтранички."
     :error/profile-not-found                         "Профиль не найден."
     :error/unknown-error                             "Неизвестная ошибка, попробуйте ещё раз."
     :error/unknown-id                                "Неизвестная ОргСтраничка."
     :error/unknown-login-or-email                    "Неизвестный электронный адрес или логин группы."
     :error/unknown-usergroup                         "Группа была удалена."
     :error/upload-failed                             "Не удалось загрузить ОргСтраничку: \"{orgpage/title}\""

     :export/show                                     "Экспорт ОргСтранички"
     :export/title                                    "Экспорт {orgpage/title}"
     :export/info                                     "Выберите формат, в котором будет экспортирована эта ОргСтраничка."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " — формат OrgPad"]
     :export/html                                     "Плоский HTML-файл"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON Canvas"] " — формат"]
     :export/generate                                 "Сгенерировать экспорт"

     :feedback/ask-question                           "Спросить"
     :feedback/hide-button                            "Скрыть кнопку навсегда"
     :feedback/dialog-title                           "Связаться с разработчиками OrgPad"
     :feedback/description                            [:<> "Если вам нужна помощь или возникла проблема, напишите нам — "
                                                       [:b "разработчикам OrgPad"] ". "
                                                       "Также будем рады вашим идеям по улучшению. "
                                                       "Ответим по электронной почте как можно скорее."]
     :feedback/languages                              "Пишите нам на английском, чешском или немецком."
     :feedback/contact-when-problem-persists          [:<> "Если проблема не исчезает, свяжитесь с нами по адресу "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Банковский перевод"
                                                             (when currency
                                                               (str " в " (name currency))) " для годового плана"
                                                             (if (= tier "standard")
                                                               " Стандарт"
                                                               " Профи")))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Напишите ваш " [:b "платёжный адрес"] " и данные для счёта."
                                                         " Мы скоро свяжемся с вами по адресу " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Хочу купить план для своей "
                                                             (case org-type
                                                               :feedback/school-plan "школы"
                                                               :feedback/enterprise-plan "компании"
                                                               "организации")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Используйте эту форму, чтобы связаться с представителем OrgPad."
                                                         " Мы свяжемся с вами по телефону или email (" email
                                                         "). Также вы можете позвонить нам по "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Перейти на план Профи"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Напишите, как изменить вашу текущую подписку."
                                                         " Мы скоро свяжемся с вами по адресу " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Сменить оплату на " (if (= period "yearly")
                                                                                    "годовую"
                                                                                    "помесячную")))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Изменения вступят в силу после окончания текущего периода."
                                                         " При годовой оплате действует скидка 15%."
                                                         " Мы скоро свяжемся с вами по адресу " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str "Название " (case org-type
                                                                           :feedback/school-plan "школы"
                                                                           :feedback/enterprise-plan "компании"
                                                                           "организации")))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Должность в " (case org-type
                                                                              :feedback/school-plan "школе"
                                                                              :feedback/enterprise-plan "компании"
                                                                              "организации")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str "Сайт " (case org-type
                                                                       :feedback/school-plan "школы"
                                                                       :feedback/enterprise-plan "компании"
                                                                       "организации")))

     :fragment/fragment                               "Местоположение"
     :fragment/text-id                                "ID"
     :fragment/title                                  "Название"
     :fragment/create                                 "Создать местоположение"
     :fragment/create-tooltip                         "TAB; удерживайте SHIFT, чтобы скопировать выбранное местоположение"
     :fragment/remove                                 "Удалить местоположение"
     :fragment/share                                  "Копировать ссылку на это местоположение"
     :fragment/text-id-required                       "Укажите ID"
     :fragment/text-id-already-used                   "ID уже используется."
     :fragment/closed-books                           "Закрытые ячейки; CTRL+клик для выбора"
     :fragment/hidden-books                           "Скрытые ячейки; CTRL+клик для выбора"
     :fragment/opened-pages                           "Открытые страницы; CTRL+клик для выбора"
     :fragment/focused-books                          "Ячейки в фокусе камеры; CTRL+клик для выбора"
     :fragment/shown-books                            "Отображённые ячейки; CTRL+клик для выбора"

     :info/uploading-attachments                      [:i18n/plural "Загрузка {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "файлов" "файл" "файла" "файлов"]}]
     :info/uploading-images                           [:i18n/plural "Загрузка {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "изображений" "изображение" "изображения" "изображений"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Не удалось загрузить {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "изображений" "изображение" "изображения" "изображений"]}]
                                                          "Не удалось загрузить одно или несколько изображений."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} YouTube {info/num-youtubes} не найдено."
                                                       {:info/num-youtubes [:info/count "видео" "видео" "видео" "видео"]}]
     :info/uploading-attachments-failed               "Не удалось загрузить файлы."
     :info/presentation-link-copied                   "Ссылка на презентацию скопирована."
     :info/max-orgpages-exceeded                      "Владелец этой ОргСтранички не может создать ополнительную ОргСтраничку."
     :info/storage-exceeded                           "У владельца этой ОргСтранички нет {upload/total-size} для загрузки файлов."
     :info/attachments-too-large                      (str "Нельзя загрузить {upload/total-size} за один раз."
                                                           " Максимальный размер всех файлов — 500 МБ.")
     :info/drop-info                                  "Перетащите в ячейку или на серое поле, чтобы создать новую."
     :info/audio-not-allowed                          "Воспроизведение заблокировано. Нажмите кнопку воспроизведения."
     :info/audio-not-supported                        "Формат аудио не поддерживается."

     :import/another-format                           [:<> "Если нужно импортировать данные другого формата, напишите нам на "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Импорт данных"
     :import/google-docs                              "Чтобы вставить данные из Microsoft Office или Google Docs, просто вставьте их в ОргСтраничку."
     :import/supported-formats                        "Сейчас поддерживаются такие форматы:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " — файл .vsdx."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON Canvas"] " — файл."]

     :ios/install-info                                "Установить приложение OrgPad"
     :ios/share-button                                "1. Откройте"
     :ios/add-to-home-screen                          "2. Нажмите"

     :lang/cs                                         "Чешский"
     :lang/de                                         "Немецкий"
     :lang/en                                         "Английский"
     :lang/es                                         "Испанский"
     :lang/fr                                         "Французский"
     :lang/hi                                         "Хинди"
     :lang/pl                                         "Польский"
     :lang/ru                                         "Русский"
     :lang/uk                                         "Украинский"

     :lang-select/tooltip                             "Язык приложения (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "Не хватает вашего языка? Помогите нам, "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "переведя OrgPad"] "."]

     :limit/of                                        " c "
     :limit/orgpages                                  " ОргСтранички"
     :limit/people                                    " люди"
     :limit/teams                                     " группы"
     :limit/team-members                              " члены"
     :limit/orgpages-tooltip                          (str "В бесплатном плане подписки количество ОргСтраничек ограничено."
                                                           " Обновите ваш план подписки, чтобы создавать больше ОргСтраничек.")
     :limit/shares-tooltip                            (str "Количество людей, с которыми вы можете непосредственно поделиться ОргСтраничкой, ограничено."
                                                           " Обновите ваш план подписки до плана Профессиональный, чтобы делиться ОргСтраничками с неограниченным количеством людей.")
     :limit/teams-tooltip                             (str "В плане подписки Стандартный количество собственных групп ограничено."
                                                           " Обновите ваш план подписки до плана Профессиональный, чтобы создавать неограниченное количество групп.")
     :limit/teams-members-tooltip                     (str "В плане подписки Стандартный количество членов каждой группы ограничено."
                                                           " Обновите ваш план подписки до плана Профессиональный, чтобы создавать неограниченные группы.")
     :limit/attachments-size                          (str "Общий размер всех загруженных файлов и изображений ограничен,"
                                                           " он может быть увеличен обновлением плана подписки.")
     :limit/attachments-size-clickable                (str "Общий размер всех загруженных файлов и изображений ограничен."
                                                           " Кликните, чтобы увеличить ваш лимит путём обновления плана подписки.")
     :limit/attachments-size-try-out                  (str "Общий размер всех загруженных файлов и изображений ограничен."
                                                           " Чтобы увеличить ваш лимит до 100 МБ, кликните, чтобы создать учетную запись.")

     :limits/max-orgpages                             "документы"
     :limits/max-storage                              "хранилище"
     :limits/max-teams                                "группы"
     :limits/of                                       " c"
     :limits/max-team-members                         "члены"
     :limits/priority-support                         "приоритетная поддержка"

     :link-panel/flip                                 "Перевернуть направление"
     :link-panel/insert-unit-in-middle                "Вставить ячейку в середину"
     :link-panel/delete                               "Удалить ссылку"
     :link-panel/change-link-style                    "Изменить стиль этой ссылки; удерживайте SHIFT для установки текущего, удерживайте CTRL для копирования в стиль по умолчанию"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Расчет размеров всех ячеек, " [:span#autoresize-num-units num-units] " осталось …"])
     :loading/initial-layout                          "Усовершенствование первоначального формата …"
     :loading/restoring-opened-pages                  "Восстановление позиции открытых страниц …"
     :loading/getting-orgpage                         "Загрузка ОргСтранички с сервера …"
     :loading/getting-dashboard                       "Загрузка списка доступных ОргСтраничек с сервера …"
     :loading/getting-website                         "Загрузка сайта с сервера …"
     :loading/getting-blog                            "Загрузка блога с сервера …"
     :loading/uploading-orgpage                       "Выгрузка ОргСтранички на сервер …"
     :loading/ws-init                                 "Настройка связи с сервером …"
     :loading/ws-closed                               "Связь с сервером утрачена. Попробуйте переподключиться. Если проблема не исчезнет, перезагрузите страницу."
     :loading/administration                          "Загрузка данных администратора …"
     :loading/profile                                 "Загрузка профиля …"
     :loading/style                                   "Загрузка стилей …"
     :loading/start-trial                             "Начало 7-дневной пробной подписки …"
     :loading/uploading-attachments                   "Выгрузка вложений на сервер …"

     :login/continue-with-email                       "Войти через почту"
     :login/continue-with-facebook                    "Войти через Facebook"
     :login/continue-with-google                      "Войти через Google"
     :login/continue-with-microsoft                   "Войти через Microsoft"
     :login/continue-with-cuni                        "Войти через Charles University"
     :login/email-sent                                "Письмо отправлено. Нажмите ссылку в письме."
     :login/forgotten-password                        "Забыли пароль"
     :login/forgotten-password-email-resent           "Письмо для сброса пароля уже отправлено."
     :login/forgotten-password-description            "Мы отправим ссылку для сброса пароля (действует 24 часа)."
     :login/forgotten-password-error                  [:<> "Этот адрес заблокирован. Разблокируйте через ссылку Отписаться или напишите нам на "
                                                       company/support-email-app-link " с этого адреса."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Впервые в OrgPad? " [:a.link-button {:href route} "Зарегистрируйтесь"]])
     :login/options                                   "Выберите другой способ входа"
     :login/send-reset-link                           "Отправить ссылку сброса"
     :login/wrong-email-or-password                   "Неверный email или пароль."

     :markdown/title                                  "Текст вставлен с форматированием Markdown?"
     :markdown/info                                   "Обнаружено форматирование Markdown. Применить его?"
     :markdown/remember                               "Запомнить до перезагрузки"
     :markdown/insert                                 "Применить Markdown"
     :markdown/ignore                                 "Оставить без изменений"

     :meta/title                                      "Название ОргСтранички"
     :meta/orgpage-thumbnail                          "Изображение ОргСтранички"
     :meta/automatic-screenshot-start                 "Автоматический снимок экрана для "
     :meta/automatic-screenshot-refresh               "Обновляется через пять минут после каждого изменения."
     :meta/custom-thumbnail                           "Пользовательское изображение 1360×768."
     :meta/upload-thumbnail                           "Загрузить изображение"
     :meta/thumbnail-upload-failed                    "Не удалось загрузить изображение."
     :meta/description                                "Описание"
     :meta/new-tags                                   "Тег"
     :meta/tag-too-long                               (str "Максимальная длина тега — " common-orgpage/max-tag-length " символов.")
     :meta/too-many-tags                              (str "Можно добавить не более " common-orgpage/max-tags " тегов.")
     :meta/info                                       (str "Эти данные отображаются в списке ОргСтраничек, "
                                                           "при встраивании и публикации в соцсетях.")
     :meta/info-in-share-orgpage                      "Перед публикацией нужно указать название."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Переместить выбранные {selection/num-units} {selection/units-label} "
                                                                         "и {selection/num-links} {selection/links-label} в новую ОргСтраничку "
                                                                         "со следующей информацией. В текущей ОргСтраничке они будут заменены одной ячейкой "
                                                                         "с новой ОргСтраничкой внутри.")
                                                       {:selection/units-label [:selection/num-units "ячее́к" "ячейка" "ячейки" "ячее́к"]
                                                        :selection/links-label [:selection/num-links "ссылок" "ссылка" "ссылки" "ссылок"]}]
     :meta/info-title                                 "Информация – {meta/title}"
     :meta/info-title-only                            "Название ОргСтранички"
     :meta/details                                    "Детали"
     :meta/preview                                    "Предпросмотр"
     :meta/init-fragments                             "Начальное местоположение"
     :meta/init-fragments-info                        (str "Вы можете выбрать начальное местоположение при открытии ОргСтранички. "
                                                           "Для мобильных устройств можно указать другое.")
     :meta/desktop-init-fragment                      "Местоположение для компьютера"
     :meta/mobile-init-fragment                       "Местоположение для мобильного устройства"
     :meta/everything-closed                          "Всё закрыто"
     :meta/everything-closed-lowercase                "всё закрыто"
     :meta/more-details                               "Подробнее"
     :meta/move-to-new-orgpage-title                  "Перейти к {meta/title}"
     :meta/move-to-new-orgpage                        "Перейти на новую ОргСтраничку"

     :microsoft-365-permission/title                  " Разрешить Microsoft 365 доступ к этому документу?"
     :microsoft-365-permission/info                   [:<> "Документ Office может быть отображен с помощью Microsoft 365."
                                                       " Нажав на кнопку согласия, ваш документ будет отправлен в Microsoft."
                                                       " Проверьте " [:a.link-button {:href   "https://www.microsoft.com/ru-ru/servicesagreement/"
                                                                                      :target "_blank"}
                                                                      "Microsoft Service Agreement"] "."]
     :microsoft-365-permission/allow                  "Разрешить доступ Microsoft 365"

     :notifications/info                              "Выберите, какие электронные письма будет отправлять вам OrgPad."
     :notifications/any-email                         "Любое письмо от OrgPad"
     :notifications/email-verification                "Письма для подтверждения почты, сброса пароля и оплаты"
     :notifications/monthly-newsletter                "Ежемесячная рассылка с обновлениями и новостями OrgPad"
     :notifications/messages                          "Получать сообщения от других людей"
     :notifications/blocked-people                    "Заблокированные люди:"
     :notifications/receipts                          "Квитанции при автоматическом продлении подписки"
     :notifications/receive-invitations               "Получать приглашения от других людей"
     :notifications/unblock-user                      "Разблокировать этого пользователя"

     :onboarding/openable-units                       "Могут открываться только выступающие затененные ячейки."
     :onboarding/zoom                                 "Скролить для увеличения"
     :onboarding/drag-canvas                          "Переместить перетаскиванием"
     :onboarding/open-units                           "Затененные ячейки имеют содержимое"

     :orgpage/creating-preview                        "Создание предварительного просмотра …"
     :orgpage/change-information                      "Изменить информацию"
     :orgpage/copy-orgpage                            "Скопировать в новую ОргСтраничку"
     :orgpage/delete-orgpage                          "Удалить ОргСтраничку"
     :orgpage/detail                                  "Раскрыть подробности"
     :orgpage/share-tooltip                           "Поделиться этой ОргСтраничкой с другими"
     :orgpage/share-orgpage                           "Поделиться ОргСтраничкой"
     :orgpage/show-information                        "Показать информацию"
     :orgpage/zoom-in                                 "Увеличить"
     :orgpage/zoom-out                                "Уменьшить"
     :orgpage/create-unit-double-click                "Кликните дважды для создания ячейки."
     :orgpage/create-unit-hold-or-double-tap          "Удерживайте или дважды нажмите, чтобы создать ячейку."
     :orgpage/switch-to-edit                          "Перейти к режиму редактирования."
     :orgpage/untitled                                "Безымянная ОргСтраничка"
     :orgpage/title                                   "Название ОргСтранички"
     :orgpage/untitled-unit                           "Безымянная ячейка"
     :orgpage/untitled-path                           "Безымянная презентация"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "шагов" "шаг" "шага" "шагов"]}]
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (страница {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (страница {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Копия доступна как "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Изменить цвет этой ОргСтранички"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Эта ОргСтраничка автоматически доступна " label " для "
                                                         (case permission
                                                           :permission/view "чтения"
                                                           :permission/comment "комментирования"
                                                           :permission/edit "редактирования"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Кликните сюда"]
                                                         " чтобы отменить совместное использование."])

     :orgpage-placement/activate                      "Посмотреть здесь"

     :orgpage-print/displayed                         "Отображено"
     :orgpage-print/displayed-info                    "Всё, что находится в прямоугольнике, будет напечатано точно так, как вы это видите."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPage успешно напечатана в файл "
                                                         [:a.link-button {:href link :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "Печать этого PDF должна занять около {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Всё закрыто"
     :orgpage-print/everything-closed-info            "В распечатанном PDF все ячейки отображаются закрытыми."
     :orgpage-print/fragment                          "Местоположение"
     :orgpage-print/fragment-info                     "В распечатанном PDF отображается выбранное местоположение."
     :orgpage-print/gray                              "Серый"
     :orgpage-print/landscape                         "Альбомная"
     :orgpage-print/orientation                       "Ориентация"
     :orgpage-print/path-info                         [:i18n/plural " с {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "страниц" "страница" "страницы"]}]
     :orgpage-print/portrait                          "Книжная"
     :orgpage-print/presentation                      "Презентация"
     :orgpage-print/presentation-info                 "В распечатанном PDF отображается выбранная презентация."
     :orgpage-print/print                             "Печать в PDF"
     :orgpage-print/size                              "Размер"
     :orgpage-print/started                           (str "Мы печатаем эту OrgPage в PDF. Это должно занять около {orgpage-print/estimated-time}."
                                                           " После завершения он будет доступен как файл.")
     :orgpage-print/title                             "Название PDF"
     :orgpage-print/type                              "Тип"
     :orgpage-print/watermark                         "Водяной знак"
     :orgpage-print/watermark-info                    "В распечатанном PDF будет водяной знак OrgPad."
     :orgpage-print/white                             "Белый"

     :orgpage-stats/number-of-units                   "Количество ячеек"
     :orgpage-stats/number-of-links                   "Количество ссылок"
     :orgpage-stats/number-of-files                   "Количество файлов"
     :orgpage-stats/number-of-images                  "Количество изображений"

     :org-role/student                                "Студент"
     :org-role/teacher                                "Преподаватель"
     :org-role/employee                               "Сотрудник"
     :org-role/admin                                  "Администратор"

     :panel/toggle-side-panel                         "Боковое меню"
     :panel/create-orgpage                            "Новая ОргСтраничка"
     :panel/logo-tooltip                              "Домой"
     :panel/edit-info                                 "Переключиться в режим редактирования: можно создавать и удалять ячейки и ссылки, менять содержимое и др. (F7)"
     :panel/comment-info                              (str "Переключиться в режим комментариев: можно создавать, редактировать и удалять свои ячейки и ссылки; "
                                                           "чужие изменять нельзя. Можно ссылаться на чужие ячейки. "
                                                           "(F7)")
     :panel/read-info                                 "Переключиться в режим просмотра: изменять нельзя, просматривать удобнее (F6)"
     :panel/undo-deletion                             "Отменить удаление"
     :panel/undo-deletion-info                        [:i18n/plural "Отменить удаление {delete/num-units} {delete/unit-label} и {delete/num-links} {delete/link-label} (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "ячеек" "ячейка" "ячейки" "ячеек"]
                                                                :link-label [:delete/num-links
                                                                             "ссылок" "ссылка" "ссылки" "ссылок"]}]
     :panel/refresh                                   "Обновить"
     :panel/switch-style                              "Изменить стиль новых ячеек и ссылок; перетащите, чтобы создать новую ячейку"
     :panel/profile                                   "Профиль"
     :panel/settings                                  "Настройки"
     :panel/usergroups                                "Группы"
     :panel/stats                                     "Статистика"
     :panel/administration                            "Администрация"
     :panel/ios-install-info                          "Установить приложение"
     :panel/upload-attachment                         "Вставьте изображения или файлы в новые ячейки"
     :panel/selection-mode                            "Начать выбор"
     :panel/search                                    "Поиск (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Показать {panel/num-hidden-book-ids} {panel/unit-label}, скрытые в текущем местоположении"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids
                                                                            "ячеек" "ячейка" "ячейки" "ячеек"]}]

     :password/too-short                              "Минимум 8 символов"
     :password/different-passwords                    "Пароли не совпадают"

     :password-reset/back-to-list                     "Назад к списку"
     :password-reset/change-password                  "Сменить пароль"
     :password-reset/set-password                     "Установить пароль"
     :password-reset/has-password                     "Для вашей учетной записи установлен пароль."
     :password-reset/without-password                 "Пароль еще не установлен, поскольку для входа использовались привязанные учетные записи."
     :password-reset/invalid-link                     "Неверная ссылка (возможно, прошло более 24 часов). Попросите отправить письмо ещё раз."
     :password-reset/description                      "Установите новый пароль."
     :password-reset/enter-current-and-new-password   "Введите текущий и новый пароль."
     :password-reset/enter-new-password               "Введите новый пароль."

     :path/add-step                                   "Шаг"
     :path/add-step-tooltip                           "ENTER или TAB; удерживайте SHIFT, чтобы скопировать камеру"
     :path/hidden-ops                                 " и ещё {path/num-hidden}"
     :path/title                                      "Название презентации"
     :path/default-title                              "Презентация {path/num-paths}"
     :path/copy                                       "Скопировать в новую презентацию"
     :path/copy-suffix                                "копия"
     :path/add-audio                                  "Связать аудио с шагом"
     :path/remove-audio                               "Отвязать аудио от шага"

     :paths/create-new-path                           "Создать презентацию"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Удалить презентацию " [:b title] "?"])
     :paths/help                                      "Выберите ячейки, чтобы изменить отображаемое; подробности — в руководстве."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Текущий план подписки " [:b tier] ", действителен до " [:b end-date] "."
                                                         (if autorenewal
                                                           " Подписка будет автоматически продлена в конце платежного периода."
                                                           " Срок действия подписки закончится после окончания периода оплаты.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Ваш " [:b tier] " план закончился " [:b end-date] ", поскольку ваш платеж не прошел."
                                                         " Если вы исправите платеж, ваша подписка будет автоматически продлена."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " в плане подписки " [:b tier] " организации " name "."])
     :payments/free-tier-info                         [:<> "OrgPad используется в плане подписки " [:b "«Бесплатный»"] " без платежей."]
     :payments/no-teams                               "В бесплатном плане нет групп."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Для " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "обновления"] " или "])
                                                         [:a.link-button {:href period-url} "изменения вашего периода оплаты"]
                                                         " свяжитесь с нами."])
     :payments/choose-plan                            "Выбрать план"
     :payments/manage-plan                            "Управлять планом"
     :payments/billing-address                        "Адрес для выставления счетов"
     :payments/billing-address-info                   (str "Введенный адрес для выставления счетов будет использоваться на всех новых счетах."
                                                           " Недавние счета также автоматически обновляются.")
     :payments/receipt-label                          "Квитанция {receipt/date-range}"
     :payments/customer-portal-failed                 "При загрузке сайта управления планом произошла ошибка."

     :pending-activation/email-already-used           "Электронная почта уже используется другой учетной записью."
     :pending-activation/email-not-recieved           "Не получили письмо? Отправьте его снова или измените адрес ниже."
     :pending-activation/email-sent                   "Электронное письмо для активации отправлено. "
     :pending-activation/instructions                 "Вы почти у цели! Активируйте свой аккаунт одним нажатием на ссылку, которую мы отправили вам на электронную почту."
     :pending-activation/resend                       "Отправить электронное письмо для активации повторно"

     :permission/admin                                "Может делиться и удалять"
     :permission/admin-tooltip                        "Также может управлять доступом других к документу."
     :permission/edit                                 "Может редактировать"
     :permission/edit-tooltip                         "Может делать любые изменения в ОргСтраничке."
     :permission/comment                              "Может комментировать"
     :permission/comment-tooltip                      (str "Может создавать свои новые ячейки, соединять их и изменять. "
                                                           "Не может изменять остальную часть ОргСтранички.")
     :permission/view                                 "Может читать"
     :permission/view-tooltip                         "Может читать ОргСтраничку, не внося никаких изменений."

     :presentation/presentation                       "Презентация"
     :presentation/step                               "Шаг"
     :presentation/present                            "Начать презентацию"
     :presentation/slideshow                          "Автоматически воспроизводить шаги"
     :presentation/step-duration                      "Длительность шага в секундах"
     :presentation/loop-slideshow                     "Повторять в конце"
     :presentation/respect-audio-track                "Длительность шага по аудиодорожке"
     :presentation/stop-slideshow                     "Остановить автоматическое воспроизведение шагов"
     :presentation/exit-tooltip                       "Выйти из презентации"
     :presentation/play-audio                         "Воспроизвести аудио для этого шага"
     :presentation/pause-audio                        "Пауза воспроизведения аудио"

     :presentation/share-presentation                 "Поделиться этой презентацией с другими."

     :pricing-popup/orgpages-exceeded-title           "Бесплатный план не позволяет создавать больше ОргСтраничек"
     :pricing-popup/orgpages-exceeded                 "Нужно обновить план."
     :pricing-popup/storage-exceeded-title            "Недостаточно места для загрузки {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "В вашем хранилище осталось только " [:b space-left] "."
                                                         " Вы можете обновить свой план, чтобы увеличить объём памяти."])
     :pricing-popup/num-shared-limit-reached-title    "Вы не можете предоставить доступ к этой ОргСтраничке большему количеству людей"
     :pricing-popup/num-shared-limit-reached-common   "Достигнуто максимальное количество людей, которые могут совместно использовать эту ОргСтраничку."
     :pricing-popup/num-shared-limit-reached          [:<> " Чтобы добавить больше людей, нужно обновиться до "
                                                       [:b "плана Профессиональный"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Владелец этой ОргСтранички " owner " должен обновиться до "
                                                         [:b "плана Профессиональный"] ", чтобы добавить больше людей."])
     :pricing-popup/enable-teams-title                "Обновите свой план, чтобы управлять группами"
     :pricing-popup/enable-teams                      [:<> "Группы объединяют людей, что упрощает сотрудничество и общий доступ к ОргСтраничкам."
                                                       " Эта функция доступна только в " [:b "плане Стандартный"] " или выше."]
     :pricing-popup/teams-limit-reached-title         "Обновите свой план, чтобы создавать больше групп"
     :pricing-popup/teams-limit-reached               "Для вашего плана достигнуто ограничение на количество групп."
     :pricing-popup/team-members-limit-reached-title  "Вы не можете добавить больше участников к {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Достигнуто максимальное количество членов группы."
     :pricing-popup/team-members-limit-reached        [:<> " Чтобы добавить больше участников, нужно обновиться до "
                                                       [:b "плана Профессиональный"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " Владелец этой группы " owner " должен обновиться до "
                                                         [:b "плана Профессиональный"] ", чтобы добавить больше членов."])
     :pricing-popup/try-out-share-title               "Зарегистрируйтесь, чтобы поделиться этой ОргСтраничкой"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "В вашем хранилище осталось только " [:b space-left] "."])
     :pricing-popup/free-account-info                 "Зарегистрировавшись, вы получаете:"
     :pricing-popup/free-limit                        "до трех ОргСтраничек,"
     :pricing-popup/free-storage                      "до 100 МБ памяти,"
     :pricing-popup/free-share                        "делиться своей работой с другими."
     :pricing-popup/free-account-info2                "Создайте свою учетную запись всего за несколько кликов."
     :pricing-popup/register-to-comment               "Зарегистрируйтесь, чтобы добавить свои комментарии"
     :pricing-popup/register-to-comment-info          (str "Комментарии к ячейкам будут отображать ваше имя и фотографию."
                                                           " Для этого сначала нужно создать учетную запись.")
     :pricing-popup/print-watermark-title             "Обновите свой план, чтобы избежать водяных знаков"
     :pricing-popup/print-watermark-info              (str "Печать без водяных знаков OrgPad.info возможна только в планах "
                                                           "Профессиональный, Школьный или Корпоративный.")

     :profile/open-contact-dialog                     "Отправить сообщение"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Связаться с " first-name " " last-name)
                                                          "Связаться с этим человеком"))
     :profile/contact-dialog-info                     (str "Поскольку мы не раскрываем электронные адреса других людей в OrgPad, мы отправим это сообщение за вас. "
                                                           "Мы добавим ваше имя и электронный адрес, чтобы обеспечить прямой контакт.")

     :promotion/unknown                               "Неизвестный код"
     :promotion/max-usages-reached                    "Использован слишком много раз"
     :promotion/expired                               "Срок действия истек"
     :promotion/one-year-free                         "1 год бесплатно"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} бесплатно"
                                                       {:promotion/days [:promotion/duration "дней" "день" "дня" "дней"]}]
     :promotion/for-one-year                          " на 1 год"
     :promotion/for-six-months                        " на 6 месяцев"

     :props/h1                                        "Крупный заголовок"
     :props/h2                                        "Средний заголовок"
     :props/h3                                        "Малый заголовок"
     :props/weight-none                               "Обычная линия соединения"
     :props/strong                                    "Толстая линия соединения"
     :props/arrowhead-none                            "Без стрелки"
     :props/single                                    "Стрелка"
     :props/double                                    "Двойная стрелка"

     :public-permission/none                          "личная."
     :public-permission/view                          "предоставлена всем для просмотра."

     :registration/create-user                        "Создать учетную запись"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Уже есть аккаунт? " [:a.link-button {:href route} "Войти"]])
     :registration/options                            "Выберите другой способ регистрации"
     :registration/server-error                       "Ошибка сервера. Попробуйте создать учетную запись еще раз."
     :registration/missing-oauth-email                "{registration/service} не сообщила нам ваш адрес электронной почты. Пожалуйста, заполните его ниже."

     :search/previous-match                           "Предыдущее совпадение (PAGE UP); первое совпадение (HOME)"
     :search/next-match                               "Следующее совпадение (PAGE DOWN, ENTER); последнее совпадение (END)"
     :search/close                                    "Закрыть (ESC)"
     :search/cells-with-selected-attachments          "Ячейки с выбранными файлами и изображениями."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Изменить стиль выделенного "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; удерживайте SHIFT, чтобы установить текущий; удерживайте CTRL, чтобы скопировать в текущий"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "ячеек" "ячейка" "ячейки" "ячеек"]
                                                                   :link-label [:selection/num-links
                                                                                "ссылок" "ссылка" "ссылки" "ссылок"]}]

     :selection/link                                  "Соединить ячейки"
     :selection/hide-contents                         "Скрыть содержание (ESC)"
     :selection/show-contents                         "Показать содержание"
     :selection/force-closing                         "Скрыть эти элементы при открытии местоположения (ESC)"
     :selection/step-focus-camera                     "Сфокусировать камеру шага на выбранных ячейках (F2 или Q); удерживайте SHIFT, чтобы добавить, удерживайте ALT, чтобы удалить."
     :selection/fragment-focus-camera                 "Сфокусировать камеру местоположения на выбранных ячейках (F2 или Q); удерживайте SHIFT, чтобы добавить, удерживайте ALT, чтобы удалить."
     :selection/step-show-books                       "Показать только выбранные ячейки в этом шаге (F3 или W); удерживайте SHIFT, чтобы добавить, удерживайте ALT, чтобы удалить."
     :selection/fragment-show-books                   "Показать только выбранные ячейки в местоположении (F3 или W); удерживайте SHIFT, чтобы добавить, удерживайте ALT, чтобы удалить."
     :selection/force-showing                         "Отобразить выбранные ячейки, если они были скрыты."
     :selection/share-units                           "Скопировать ссылку для отображения выбранных элементов; удерживайте SHIFT, чтобы открыть настройки."
     :selection/move-to-new-orgpage                   "Перейти на новую ОргСтраничку"
     :selection/change-code-lang                      "Изменить язык кода"
     :selection/copy-units-links                      "Скопировать ячейки и ссылки в буфер обмена"
     :selection/flip-links                            "Перевернуть направление ссылки"
     :selection/delete                                "Удалить выделенное"

     :settings/profile                                "Профиль"
     :settings/payments                               "Платежи"
     :settings/account                                "Учетная запись"
     :settings/linked-accounts                        "Связанные учетные записи"
     :settings/email                                  "Уведомления"
     :settings/account-description                    "Изменить электронную почту, пароль или удалить учетную запись."
     :settings/stats-description                      "Здесь находятся некоторые статистические данные об использовании вашего OrgPad."
     :settings/change-email                           "Изменить электронную почту"
     :settings/change-email-text                      "Введите новый адрес электронной почты. Из соображений безопасности мы проверим его перед тем, как разблокировать учетную запись."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Ваша учетная запись зарегистрирована на адрес электронной почты " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Ваша учетная запись " [:b " привязана "] " к Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Ваша учетная запись " [:b " не привязана "] " к Facebook."]
     :settings/link-fb                                "Привязать Facebook"
     :settings/unlink-fb                              "Открепить Facebook"
     :settings/account-linked-to-google               [:<> " Ваша учетная запись " [:b " привязана "] " к Google."]
     :settings/account-not-linked-to-google           [:<> " Ваша учетная запись " [:b " не привязана "] " к Google."]
     :settings/link-google                            "Привязать Google"
     :settings/unlink-google                          "Открепить Google"
     :settings/account-linked-to-microsoft            [:<> " Ваша учетная запись " [:b " привязана "] " к Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> " Ваша учетная запись " [:b " не привязана "] " к Microsoft."]
     :settings/link-microsoft                         "Привязать Microsoft"
     :settings/unlink-microsoft                       "Открепить Microsoft"
     :settings/account-linked-to-cuni                 [:<> " Ваша учетная запись " [:b " привязана "] " к Charles University."]
     :settings/account-not-linked-to-cuni             [:<> " Ваша учетная запись " [:b " не привязана "] " к Charles University."]
     :settings/link-cuni                              "Привязать Charles University"
     :settings/unlink-cuni                            "Открепить Charles University"
     :settings/set-password-text                      " Установите пароль перед тем, как открепить."
     :settings/linked-accounts-info                   "Привяжите Facebook, Google, Microsoft или Charles University к вашему аккаунту OrgPad, чтобы входить через них."
     :settings/profile-info                           "По этой информации вас будет проще найти коллегам по проекту."
     :settings/delete-account                         "Удалить учетную запись"
     :settings/confirm-delete-account-question        [:<> [:b "Окончательно"] " удалить учетную запись?"]
     :settings/confirm-delete-account-info            "Все ваши ОргСтранички и их данные будут удалены."
     :settings/delete-account-info                    [:<> "Удаление приведет к " [:b "окончательному"] " удалению всех ваших ОргСтраничек и их данных."]

     :share-orgpage/campaigns                         "Кампании"
     :share-orgpage/copied-to-clipboard               "Скопировано в буфер обмена"
     :share-orgpage/copy-template-link                "Скопировать ссылку на шаблон"
     :share-orgpage/dialog-title                      "Поделиться {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Люди без учетной записи OrgPad получат приглашение со ссылкой."
                                                                  " Открыв её, они смогут просматривать эту ОргСтраничку. ")
                                                         [:a.link-button create-team "Создать группу"]
                                                         " — так проще делиться ОргСтраничками с группой людей."])
     :share-orgpage/email-found                       "Найдена учетная запись OrgPad."
     :share-orgpage/email-unused                      "Учетная запись OrgPad не найдена. Отправьте приглашение по электронной почте."
     :share-orgpage/checking-email-address            "Проверка адреса электронной почты ..."
     :share-orgpage/invite-for-editing                "Пригласить для редактирования"
     :share-orgpage/invite-for-viewing                "Пригласить для просмотра"
     :share-orgpage/invite-by-email                   "Пригласить по электронной почте на определённом языке?"
     :share-orgpage/show-profile                      "Показать профиль"
     :share-orgpage/links                             "Ссылки"
     :share-orgpage/to-read                           "для просмотра"
     :share-orgpage/to-comment                        "для комментирования"
     :share-orgpage/to-edit                           "для редактирования"
     :share-orgpage/links-tooltip                     "Предоставить доступ по ссылке"
     :share-orgpage/template                          "Шаблон"
     :share-orgpage/template-tooltip                  "Ссылки автоматически создают копию этой ОргСтранички"
     :share-orgpage/template-info                     "Можно использовать эту ссылку, чтобы создать собственную копию ОргСтранички."
     :share-orgpage/template-autoshare-none           "Не делиться копиями со мной."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Поделиться копиями со мной для "
                                                             (case template-autoshare
                                                               :permission/view "чтения"
                                                               :permission/comment "комментирования"
                                                               :permission/edit "редактирования") "."))
     :share-orgpage/embed                             "Встроить"
     :share-orgpage/embed-into-microsoft-teams        "Встроить в Microsoft Teams"
     :share-orgpage/embed-into-website                "Встроить в сайт или приложение"
     :share-orgpage/embed-tooltip                     "Встроить в сайт или приложение"
     :share-orgpage/new-user-or-usergroup             "Имя, адрес электронной почты или группа"
     :share-orgpage/link-permission-start             "Разрешить людям"
     :share-orgpage/link-permission-end               "эту ОргСтраничку."
     :share-orgpage/orgpage-info                      "Информация"
     :share-orgpage/orgpage-info-tooltip              "Информация о владельце и опубликована ли ОргСтраничка"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Вам предоставлен доступ к этой ОргСтраничке для "
                                                             (case user-permission
                                                               :permission/view "чтения"
                                                               :permission/comment "комментирования"
                                                               :permission/edit "редактирования") "."))
     :share-orgpage/remove-yourself                   "Удалить себя"
     :share-orgpage/private-info                      (str "Доступ имеете только вы и люди, которым вы предоставили доступ к ОргСтраничке непосредственно или по ссылке."
                                                           " Каждый вновь созданный документ является личным.")
     :share-orgpage/publish-for-reading-info          (str "ОргСтраничка общедоступна. Любой в Интернете может найти и просматривать её."
                                                           " Изменения могут вносить только вы или те, с кем вы поделились ОргСтраничкой для редактирования.")
     :share-orgpage/publish-permission-end            "Эта ОргСтраничка "
     :share-orgpage/publish                           "Опубликовать"
     :share-orgpage/publish-confirmation              "Каждый сможет {orgpage/permission} эту ОргСтраничку. Вы уверены?"
     :share-orgpage/publish-tooltip                   "Предоставить доступ всем"
     :share-orgpage/remove-user                       "Удалить доступ"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Если вы поделились ссылкой случайно, можно "
                                                         [:span.link-button reset-links "аннулировать все предыдущие ссылки"]
                                                         "."])
     :share-orgpage/shareable-link                    "Ссылка для общего доступа"
     :share-orgpage/everything-closed                 "Показать все ячейки закрытыми"
     :share-orgpage/presentation                      "Начать с презентации"
     :share-orgpage/fragment                          "Показать местоположение"
     :share-orgpage/template-link-switch              "Создать ссылку на шаблон."
     :share-orgpage/user-not-registered               " ещё не зарегистрирован в OrgPad."
     :share-orgpage/users                             "Люди"
     :share-orgpage/users-tooltip                     "Предоставить доступ отдельным людям"

     :side-panel/about                                "Домашняя страница"
     :side-panel/terms-and-conditions                 "Условия и положения"
     :side-panel/privacy-and-security                 "Конфиденциальность и безопасность"
     :side-panel/files-and-images                     "Файлы и изображения"
     :side-panel/paths                                "Презентации"
     :side-panel/fragments                            "Местоположения"
     :side-panel/translate                            "Перевести"
     :side-panel/toggle-debug                         "Отладчик"
     :side-panel/help                                 "Помощь"
     :side-panel/blog                                 "Блог"
     :side-panel/home                                 "Домой"
     :side-panel/import                               "Импортировать"
     :side-panel/share                                "Поделиться"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "файлов" "файл" "файла" "файлов"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "изображений" "изображение" "изображения" "изображений"]}]
     :side-panel/num-paths                            [:i18n/plural "{side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "презентаций" "презентация" "презентации" "презентаций"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "местоположений" "местоположение" "местоположения" "местоположений"]}]

     :step/closed-books                               "Закрытые ячейки; CTRL+клик для выбора"
     :step/everything-closed                          "Всё закрыто"
     :step/hidden-books                               "Скрытые ячейки; CTRL+клик для выбора"
     :step/nothing-changed                            "Ничего не изменилось"
     :step/opened-pages                               "Открытые страницы; CTRL+клик для выбора"
     :step/focused-books                              "Ячейки в кадре камеры; CTRL+клик для выбора"
     :step/shown-books                                "Раскрытые ячейки; CTRL+клик для выбора"
     :step/switched-pages                             "Переключенные страницы; CTRL+клик для выбора"

     :style-select/set-comment                        "Изменить на ячейку комментария с вашим аватаром (CTRL+,)"
     :style-select/unset-comment                      "Изменить на обычную ячейку, удалить аватар (CTRL+,)"
     :style-select/set-comment-safari                 "Изменить на ячейку комментария с вашим аватаром (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Изменить на обычную ячейку, удалить аватар (SHIFT+CMD+,)"

     :tag/public                                      "общедоступный"

     :text-field/email                                "Email"
     :text-field/first-name                           "Имя"
     :text-field/last-name                            "Фамилия"
     :text-field/name                                 "Имя"
     :text-field/new-password                         "Новый пароль"
     :text-field/password                             "Пароль"
     :text-field/content                              "Содержимое"
     :text-field/name-or-email                        "Имя или адрес электронной почты"
     :text-field/subject                              "Тема"
     :text-field/message                              "Сообщение"
     :text-field/phone-number                         "Номер телефона"
     :text-field/width                                "Ширина"
     :text-field/height                               "Высота"

     :translate/title                                 "Перевести ОргСтраничку {orgpage/title} на другой язык"
     :translate/info                                  (str "Автоматически создаёт копию вашей ОргСтранички, "
                                                           "переведённую с исходного языка на целевой."
                                                           " Вы сможете найти её в своём списке примерно через минуту.")
     :translate/source-lang                           "Исходный язык"
     :translate/target-lang                           "Целевой язык"
     :translate/translate                             "Перевести"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Перевод доступен как "
                                                         [:a.link-button {:href url :target "_blank"} title]])

     :unit-editor/add-page                            "Создать другую страницу (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "Удалить эту страницу"
     :unit-editor/previous-page                       (str "Предыдущая страница (PAGEUP);"
                                                           " удерживайте SHIFT для перемещения этой страницы влево (SHIFT+PAGEUP);"
                                                           " удерживайте CTRL, чтобы добавить страницу перед текущей (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "Следующая страница (PAGEDOWN);"
                                                           " удерживайте SHIFT для перемещения этой страницы вправо (SHIFT+PAGEDOWN);"
                                                           " удерживайте CTRL, чтобы добавить страницу после текущей (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Перейти на эту страницу"
                                                             (when can-edit "; удерживайте SHIFT, чтобы переместить туда текущую страницу")))
     :unit-editor/hidden-info                         "Кликните, чтобы написать"
     :unit-editor/undo                                "Отменить (CTRL+Z)"
     :unit-editor/redo                                "Вернуть (CTRL+SHIFT+Z или CTRL+Y)"
     :unit-editor/toggle-bold                         "Жирный (CTRL+B)"
     :unit-editor/toggle-italic                       "Курсив (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Зачёркнутый"
     :unit-editor/toggle-subscript                    "Нижний индекс (CTRL+S)"
     :unit-editor/toggle-superscript                  "Верхний индекс (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Создать гиперссылку (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Удалить гиперссылку"
     :unit-editor/set-highlighting                    "Цвет подсветки"
     :unit-editor/selection->code                     "Преобразовать в код (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Маркированный список (TAB)"
     :unit-editor/toggle-list-ol                      "Нумерованный список (CTRL+O)"
     :unit-editor/indent                              "Увеличить отступ (TAB)"
     :unit-editor/outdent                             "Уменьшить отступ (SHIFT+TAB)"
     :unit-editor/center                              "Центрировать (CTRL+L)"
     :unit-editor/heading                             "Заголовок (CTRL+G)"
     :unit-editor/embed-pdf                           "Показать содержимое PDF"
     :unit-editor/link-pdf                            "Заменить содержимое PDF его ссылкой"
     :unit-editor/embed-office                        "Показать содержимое документа с помощью Microsoft 365"
     :unit-editor/link-office                         "Заменить содержимое документа его ссылкой"
     :unit-editor/embed-video                         "Показать видеоплеер"
     :unit-editor/link-video                          "Заменить видео его ссылкой"
     :unit-editor/embed-audio                         "Показать аудиоплеер"
     :unit-editor/link-audio                          "Заменить аудио его ссылкой"
     :unit-editor/hyperlink->embed                    "Вставить связанный сайт"
     :unit-editor/embed->hyperlink                    "Заменить встроенный сайт его ссылкой"
     :unit-editor/open-image-in-attachments           "Открыть это изображение в списке вложений"
     :unit-editor/open-file-in-attachments            "Открыть этот файл в списке вложений"
     :unit-editor/toggle-controls                     "Показать элементы управления плеера"
     :unit-editor/toggle-autoplay                     "Автоматически воспроизводить"
     :unit-editor/toggle-muted                        "Воспроизводить без звука; иначе автозапуск может быть заблокирован"
     :unit-editor/toggle-loop                         "Повторять"
     :unit-editor/toggle-chained-size                 "Сохранять пропорции"
     :unit-editor/insert-menu                         "Вставить"
     :unit-editor/insert-image                        "Изображение"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Загрузите изображение с вашего устройства."
     :unit-editor/insert-image-info2                  "Подсказка: перетащите или вставьте изображения прямо в любую ячейку или серую область."
     :unit-editor/insert-camera                       "Камера"
     :unit-editor/insert-attachment                   "Файл"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Видео"
     :unit-editor/insert-video-info                   "Загрузите видео с компьютера или вставьте ссылку с YouTube."
     :unit-editor/insert-video-info2                  "Подсказка: перетащите видео и миниатюры YouTube прямо в любую ячейку или серую область."
     :unit-editor/video-url                           "Ссылка на YouTube"
     :unit-editor/youtube-start                       "Начало"
     :unit-editor/youtube-end                         "Конец"
     :unit-editor/insert-table                        "Таблица"
     :unit-editor/insert-table-info                   "Выберите размер вставляемой таблицы."
     :unit-editor/toggle-table-border                 "Показать границы таблицы"
     :unit-editor/add-row-before                      "Вставить строку выше"
     :unit-editor/add-row-after                       "Вставить строку ниже"
     :unit-editor/remove-current-row                  "Удалить строку"
     :unit-editor/add-column-before                   "Вставить столбец слева"
     :unit-editor/add-column-after                    "Вставить столбец справа"
     :unit-editor/remove-current-column               "Удалить столбец"
     :unit-editor/remove-table                        "Удалить таблицу"
     :unit-editor/insert-website                      "Сайт"
     :unit-editor/insert-website-info                 (str "Вы можете встроить сайты прямо в ячейку."
                                                           " Если не работает, возможно, это запрещено владельцем сайта.")
     :unit-editor/website-url-or-code                 "Адрес сайта или код"
     :unit-editor/website-id                          "ID сайта"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Используется для "
                                                         [:a.link-button {:href info :target "_blank"} "обмена сообщениями между сайтами"] "."])
     :unit-editor/invalid-website-url                 "Неверный адрес сайта или код"
     :unit-editor/invalid-video-url                   "Неверный адрес видео"
     :unit-editor/update-website                      "Изменить адрес сайта"
     :unit-editor/insert-orgpage                      "ОргСтраничка"
     :unit-editor/insert-code                         "Код"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Копировать код"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Код как отдельный абзац"
     :unit-editor/toggle-block-math                   "Математика на отдельной строке"
     :unit-editor/remove-code                         "Удалить форматирование кода"
     :unit-editor/insert-math                         "Математика / Химия"

     :unit-panel/link                                 "Кликните или перетащите для соединения; удерживайте SHIFT для создания множественных соединений"
     :unit-panel/upload-attachment                    "Вставьте изображение, или файл в эту ячейку"
     :unit-panel/change-link-style                    (str "Изменить стиль этой ячейки; "
                                                           "Удерживайте SHIFT, чтобы установить текущий, "
                                                           "Удерживайте CTRL, чтобы скопировать в стиль по умолчанию; "
                                                           "перетащите для подключения в этом стиле")
     :unit-panel/hide-content                         "Скрыть содержимое"
     :unit-panel/delete-unit                          "Удалить ячейку"

     :usergroup/create                                "Создать группу"
     :usergroup/edit-title                            "Редактировать {usergroup/name}"
     :usergroup/info                                  "Создавайте и управляйте группами друзей и коллег, чтобы проще делиться ОргСтраничками."
     :usergroup/delete                                "Удалить группу"
     :usergroup/members                               "Члены"
     :usergroup/edit                                  "Сменить название и логотип"
     :usergroup/show-actions                          "Показать действия"
     :usergroup/name                                  "Имя"
     :usergroup/hide-orgpages                         "Скрыть ОргСтранички"
     :usergroup/hide-orgpages-tooltip                 "Их можно отобразить, включив группу в фильтре"
     :usergroup/hide-in-filter                        "Скрыть в фильтре"
     :usergroup/create-info                           "Имя группы и изображение профиля видят только участники."
     :usergroup/confirm-delete                        [:<> [:b "Окончательно"] " удалить эту группу?"]
     :usergroup/members-title                         "Члены группы {usergroup/name}"
     :usergroup/remove-member                         "Исключить из группы"
     :usergroup/remove-admin                          "Снять права администратора"
     :usergroup/make-admin                            "Сделать администратором"
     :usergroup/admin-tooltip                         "Администратор может управлять участниками и удалять группу."
     :usergroup/copy-usergroup                        "Скопировать группу"

     :usergroup-role/owner                            "Владелец"
     :usergroup-role/admin                            "Администратор"
     :usergroup-role/member                           "Член"

     :wire-transfer/title                             "Банковский перевод для годового плана {wire-transfer/tier}"
     :wire-transfer/info                              "Мы активируем вашу годовую подписку после поступления средств на наш счёт."
     :wire-transfer/used-currency                     "Платёж в {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Имя получателя"
     :wire-transfer/account-number                    "Номер счёта"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Сумма"
     :wire-transfer/payment-purpose                   "Назначение платежа"
     :wire-transfer/qr-code-common                    (str "Сканируйте этот платёжный QR-код в банковском приложении, чтобы"
                                                           " данные заполнились автоматически.")
     :wire-transfer/cz-sk-qr-code-description         (str " Это QR-код, который обычно используется для банковских переводов"
                                                           " в Чехии и Словакии.")
     :wire-transfer/eu-qr-code-description            (str " Это QR-код, который обычно используется для переводов SEPA"
                                                           " в Европейском союзе.")
     :wire-transfer/trial-info                        (str "Вы можете открыть одноразовую 7-дневную подписку и начать пользоваться OrgPad"
                                                           " сразу. Когда банк подтвердит успешную оплату,"
                                                           " срок действия подписки будет продлён"
                                                           " на 1 год.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Если у вас есть вопросы или трудности, пожалуйста, сообщите нам, "
                                                         [:a.link-button {:href url} "заполнив эту форму"] "."])
     :wire-transfer/success-text                      [:<> "Мы активировали " [:b "одноразовую 7-дневную подписку"]
                                                       ", чтобы вы могли использовать OrgPad по новому плану сразу. "]
     :wire-transfer/common-result-text                (str "Когда банк подтвердит успешную оплату,"
                                                           " срок действия подписки будет продлён"
                                                           " на 1 год.")
     :wire-transfer/start-trial                       "Банковский перевод отправлен"
     :wire-transfer/start-trial-result-title          "Благодарим за оплату"
     :wire-transfer/copy                              "Скопировать в буфер обмена"

     :website-editor/settings                         "Настройки"
     :website-editor/routes                           "Маршруты"
     :website-editor/menus                            "Меню"
     :website-editor/create-menu                      "Создать меню"
     :website-editor/edited-menu                      "Редактируемое меню"
     :website-editor/untitled-menu                    "Безымянное меню"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "подпунктов" "подпункт" "подпункта" "подпунктов"]}]
     :website-editor/delete-menu-item                 "Удалить этот пункт меню"
     :website-editor/add-menu-item                    "Добавить пункт меню"
     :website-editor/menu-item-label                  "Название пункта"
     :menu-item/path-type                             "Открывает маршрут"
     :menu-item/url-type                              "Открывает внешний URL"
     :menu-item/children-type                         "Открывает подменю"
     :website-editor/menu-item-path                   "Маршрут"

     :youtube-placement/watch-on-prefix               (str "Смотреть" unicode/nbsp "на")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/ru dict)