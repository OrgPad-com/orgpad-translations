(ns orgpad.client.i18n.dicts.ru
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.ru :as ru]))

(def dict
  "A dictionary map from keywords to the corresponding Russian texts."
  (merge
    ru/dict
    {:administration/page-title                       "Администрация - OrgPad"

     :attachments/allows-access-to-file               "Разрешает доступ к этому файлу."
     :attachments/allows-access-to-image              "Разрешает доступ к этому изображению."
     :attachments/no-preview                          "Предварительный просмотр невозможен."
     :attachments/used-files                          "Файлы в ОргСтраничке"
     :attachments/unused-files                        "Посторонние файлы"
     :attachments/used-images                         "Изображения в ОргСтраничке"
     :attachments/unused-images                       "Посторонние изображения"
     :attachments/uploading-files                     "Загрузка файлов ..."

     :button/back                                     "Назад"
     :button/cancel                                   "Отклонить"
     :button/close                                    "Закрыть"
     :button/comment                                  "Комментировать"
     :button/copied                                   "Скопировано"
     :button/copy                                     "Копировать"
     :button/copy-link                                "Копировать ссылку"
     :button/create                                   "Создать"
     :button/create-tooltip                           "Создать (Ctrl+Enter)"
     :button/delete                                   "Удалить"
     :button/delete-selected                          "Удалить выделение"
     :button/documentation                            "Документация"
     :button/download                                 "Загрузить"
     :button/download-all                             "Загрузить все"
     :button/drop                                     "Перетащить"
     :button/edit                                     "Редактировать"
     :button/import                                   "Импортировать"
     :button/login                                    "Войти"
     :button/logout                                   "Выйти"
     :button/publish                                  "Опубликовать"
     :button/read                                     "Просмотреть"
     :button/register                                 "Зарегистрироваться"
     :button/save                                     "Сохранить изменения"
     :button/save-tooltip                             "Сохранить изменения (Ctrl+Enter)"
     :button/upload                                   "Добавить"
     :button/send                                     "Отправить"
     :button/present                                  "Презентовать"
     :button/present-tooltip                          "Начать презентацию (F5)"
     :button/share                                    "Поделиться"
     :button/exit                                     "Выйти"
     :button/show-password                            "Показать"
     :button/hide-password                            "Скрыть"

     :checkout/currency                               "Валюта"
     :checkout/monthly                                "помесячно"
     :checkout/yearly                                 "ежегодно (сэкономить 15 %)"
     :checkout/failed-to-init                         "Во время загрузки веб-сайта оплаты произошла ошибка."
     :checkout/upgrade-plan                           "Обновить план"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Школьный"] " или "
                                                         [:a.link-button {:href enterprise-url} "корпоративный"] "? Свяжитесь с нами для индивидуального соглашения."])
     :checkout/pay-with-credit-card                   "Оплатить картой"
     :checkout/pay-with-wire-transfer                 "Оплата банковским переводом"
     :checkout/promo-code                             "Промо-код"
     :checkout/try-for-free                           "Попробуйте безплатно"
     :checkout/activate-now                           "Активировать сейчас"
     :checkout/continue-for-free                      "Продолжить безплатно"

     :consent/title                                   "Использование cookies в OrgPad"
     :consent/text                                    (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                        [:<> "Используя этот сайт, вы соглашаетесь с "
                                                         [:a.link-button terms-and-conditions " Правилами и Условиями OrgPad "]
                                                         " и "
                                                         [:a.link-button privacy-policy "Политикой конфиденциальности"]
                                                         (str ". Мы используем файлы cookie, чтобы улучшить функциональность"
                                                              "определенных областей для облегчения использования OrgPad.")])

     :dashboard/confirm-delete                        [:<> [:b "Навсегда"] " удалить эту ОргСтраничку?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Войти"] " или "
                                                         [:a {:href register-url} "зарегистрироваться,"]
                                                         " чтобы создать новые OrgPages."])
     :dashboard/owned-orgpages                        "Мои ОргСтранички"
     :dashboard/public-orgpages                       "Опубликовать ОргСтранички"
     :dashboard/shared-orgpages                       "ОргСтранички, которыми с вами поделились"
     :dashboard/usergroup-orgpages                    "ОргСтранички {usergroup/name}"
     :dashboard/public-permission-edit                "Предоставлен доступ всем для редактирования"
     :dashboard/public-permission-view                "Предоставлен доступ всем для просмотра"
     :dashboard/create-public-orgpage                 "Создать общедоступную"
     :dashboard/leave-orgpage-as-public               "Оставить для общего доступа"
     :dashboard/owner-reached-private-limit           "Владелец достиг лимита"
     :dashboard/copy-as-public                        "Копировать как общедоступную"
     :dashboard/copy-from-template-as-public          "Копировать из шаблона как общедоступную"

     :editors/create-page                             "Создать другую страницу"
     :editors/remove-page                             "Удалить эту страницу"
     :editors/previous-page                           "Предыдущая страница ; удерживайте SHIFT для перемещения этой страницы влево"
     :editors/next-page                               "Следующая страница; удерживайте SHIFT для перемещения этой страницы вправо"
     :editors/title                                   "Заголовок"
     :editors/switch-to-this-page                     (fn [{:render/keys [can-edit]}]
                                                        (str "Перейти на эту страицу"
                                                             (when can-edit "; удерживайте SHIFT для перемещения туда текущей страницы")))
     :editors/hidden-info                             "Кликнте, чтобы записать"

     :embedding-code/code                             "Кодировать"
     :embedding-code/description                      [:<> "Чтобы вставить эту ОргСтраничку в ваш " [:b "веб-сайт"]
                                                       ", вставьте в веб-сайт следующий код:"]

     :error/orgpage-access-denied                     "Вы не имеете доступа к этой ОргСтраничке. Попробуйте войти."
     :error/usergroup-access-denied                   "Групповое редактирование недоступно."
     :error/already-member                            "“{usergroups/member}” уже является членом группы."
     :error/administration-access                     "Доступ как администратору не предоставлен."
     :error/creation-unauthorized                     "Войдите для создания ОргСтраничек."
     :error/deleting-denied                           "В удалении ОргСтранички отказано."
     :error/email-already-used                        "Email уже существует."
     :error/email-not-registered                      "Нет учетной записи, связанной с этим адресом электронной почты."
     :error/email-missing-mx-record                   "В этом домене сервер электронной почты не найден."
     :error/email-invalid                             "Адрес электронной почты недействителен."
     :error/error                                     "Ошибка: "
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Неправильная ОргСтраничка" (when id " {orgpage/id}")
                                                             ". Проверьте скопированную ссылку."))
     :error/incorrect-link                            "Неверная ссылка. Авторизуйтесь или откройте правильную ссылку."
     :error/incorrect-password                        "Неверный пароль."
     :error/incorrect-profile-id                      "Неверная ссылка на профиль. Проверьте скопированную ссылку."
     :error/lost-permission                           "Доступ к этой ОргСтранички утерян."
     :error/name-already-used                         "Имя уже используется"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "ОргСтраничка " (when title "\"{orgpage/title}\"") " была перемещена."))
     :error/owner-of-orgpage                          "Этот человек уже является владельцем этой ОргСтранички."
     :error/passwords-mismatch                        "Пароль не совпадает"
     :error/profile-not-found                         "Профиль не найден."
     :error/unknown-error                             "Неизвестная ошибка, попробуйте еще раз."
     :error/unknown-id                                "Неизвестная ОргСтраничка."
     :error/unknown-login-or-email                    "Неизвестнный электронный адрес или логин группы."
     :error/unknown-user                              "“{usergroups/member}” не существует."
     :error/unknown-usergroup                         "Группа была удалена"
     :error/upload-failed                             "Не удалось загрузить ОргСтраничку: \"{orgpage/title}\""

     :feedback/ask-question                           "Спросить"
     :feedback/hide-button                            "Скрыть кнопку навсегда"
     :feedback/dialog-title                           "Связаться с разработчиками OrgPad"
     :feedback/description                            [:<> "Если вам нужна помощь, или у вас возникла какая-нибудь проблема, пожалуйста, дайте нам - "
                                                       [:b "разработчикам OrgPad"] " знать. "
                                                       "Также мы приветствуем любые идеи касательно улучшения. "
                                                       "Мы отправим вам электронной почтой как можно скорее."]
     :feedback/languages                              "Вы можете писать нам на английском, чешском и немецком языках."
     :feedback/contact-when-problem-persists          [:<> " Если проблема не исчезнет, свяжитесь с нами по адресу "
                                                       [:a.link-button {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Банковский перевод"
                                                             (when currency
                                                               (str " в " (name currency))) " для "
                                                             "годового плана"
                                                             (if (= tier "standard")
                                                               " Стандартный"
                                                               " Профессиональный")))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Напишите нам ваш " [:b "адрес для выставления счета"] ", любую другую информацию, касающуюся счета-фактуры."
                                                         " Мы свяжемся с вами в ближайшее время по электронной почте " [:b email] "."])
     :feedback/school-plan-title                      "Я хочу купить план подписки для своей школы"
     :feedback/school-plan                            (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Сообщите нам, " [:b "как велика ваша школа"]
                                                         ", сколько учителей и учеников желает пользоваться OrgPad и любую другую дополнительную информацию."
                                                         " Мы свяжемся с вами в ближайшее время по электронной почте " [:b email]
                                                         ". Вы также можете позвонить нам по "
                                                         [:a.link-button {:href (str "тел.:" (str/replace phone #" " ""))} phone] "."])
     :feedback/enterprise-plan-title                  "Я хочу купить план подписки для своей компании"
     :feedback/enterprise-plan                        (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Сообщите нам, " [:b "как велика ваша компания"]
                                                         "и сколько людей желает пользоваться OrgPad."
                                                         " Есть ли у вас дополнительные потребности?"
                                                         " Нужен ли вам самостоятельный хостинг OrgPad за дополнительную плату?"
                                                         " Мы свяжемся с вами в ближайшее время по электронной почте " [:b email]
                                                         ". Вы также можете позвонить нам по "
                                                         [:a.link-button {:href (str "тел.:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Поднять уровень моей подписки до плана Профессиональный"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Напишите нам, как мы должны изменить вашу текущую подписку, и любую другую дополнительную информацию."
                                                         " Мы свяжемся с вами в ближайшее время по электронной почте " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Изменить мой расчетный период на выставление счетов " (if (= period "ежегодно")
                                                                                                                      "ежегодно"
                                                                                                                      "помесячно")))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Изменения наступят после окончания текущего расчетного периода."
                                                         " При ежегодной оплате предоставляется скидка 15%."
                                                         " Мы свяжемся с вами в ближайшее время по электронной почте " [:b email] "."])

     :help-screen/units-with-shadows                  "Затененные ячейки открываются и закрываются одинарным кликом."
     :help-screen/flat-units                          "Плоские ячейки не имеют дополнительного содержимого."

     :help-screen/more-pages                          "Множественные страницы обозначены кружками внизу."
     :help-screen/click-title-to-close                "Клик по заголовку сразу закрывает ячейку."
     :help-screen/click-content-next-page             "Клик по содержимому ведет к переходу на следующую страницу."
     :help-screen/click-bullet-goto-page              "Кликните по кружкам, чтобы перейти непосредственно на страницу."

     :help-screen/create-links                        "Создайте ссылку, перетащив кнопку присоединения или кликнув по ней, а потом по месту назначения."
     :help-screen/create-unit-by-dragging-link        "Создание ссылки на пустое пространство создает там новую ячейку."

     :help-screen/how-to-view                         "Как просматривать"
     :help-screen/opening-units                       "Открытие ячеек"
     :help-screen/moving-pages                        "Множественные страницы"

     :help-screen/how-to-edit                         "Как редактировать"
     :help-screen/creating-links                      "Создание ссылок"

     :help-screen/help                                "Помощь можно найти тут!"

     :info/uploading-attachments                      [:i18n/plural "Загрузка {info/count} {info/num-files} ..."
                                                       {:info/num-files [:info/count "файлов" "файл" "файла" "файлов"]}]
     :info/uploading-images                           [:i18n/plural "Загрузка {info/count} {info/num-images} ..."
                                                       {:info/num-images [:info/count "изображений" "изображения" "изображения"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Не удалось загрузить {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "изображений" "изображения" "изображения"]}]
                                                          "Не удалось загрузить как минимум одно изображение."))
     :info/uploading-attachments-failed               "Не удалось загрузить файлы."
     :info/presentation-link-copied                   "Ссылка на эту презентацию скопирована."
     :info/storage-exceeded                           "У владельца этой ОргСтранички не осталось {upload/total-size} для загрузки этих файлов."
     :info/attachments-too-large                      (str "Невозможно загрузить {upload/total-size} в одной загрузке."
                                                           " Максимальный размер всех загруженных вложений составляет 500 MB.")

     :import/another-format                           [:<> "Если вы хотите импортировать данные другого формата, свяжитесь с нами по адресу "
                                                       [:b "support@orgpad.com"] "."]
     :import/dialog                                   "Импортировать данные"
     :import/google-docs                              "Чтобы вставить данные из Microsoft Office или Google Docs, просто вставьте их в OrgPage."
     :import/supported-formats                        "Сейчас мы поддерживаем такие форматы:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " экспортировано как файл .vsdx."]

     :ios/install-info                                "Установить OrgPad приложение"
     :ios/share-button                                "1. Открыть"
     :ios/add-to-home-screen                          "2. Нажмите"

     :lang/cs                                         "Чешский"
     :lang/de                                         "Немецкий"
     :lang/en                                         "Английский"
     :lang/hi                                         "Хинди"
     :lang/pl                                         "Польский"
     :lang/ru                                         "Русский"

     :language-select/lang-tooltip                    (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                        (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

     :limit/of                                        " c "
     :limit/orgpages                                  " ОргСтранички"
     :limit/people                                    " люди"
     :limit/teams                                     " группы"
     :limit/team-members                              " члены"
     :limit/orgpages-tooltip                          (str "В бесплатном плане подписки количество ОргСтраничек ограничено."
                                                           " Обновите ваш план подписки, чтобы создавать больше ОргСтраничек.")
     :limit/shares-tooltip                            (str "Количество людей, с которыми вы можете непосредственно поделиться ОргСтраничкой, ограничено."
                                                           " Обновите ваш план подписки до плана Профессиональный, чтобы делиться ОргСтранички с неограниченным количеством людей.")
     :limit/teams-tooltip                             (str "В плане подписки Стандартный количество собственных групп ограничено."
                                                           " Обновите ваш план подписки до плана Профессиональный, чтобы создавать неограниченное количество групп.")
     :limit/teams-members-tooltip                     (str "В плане подписки Стандартный количество членов каждой группы ограничено."
                                                           " Обновите ваш план подписки до плана Профессиональный, чтобы создавать неограниченные группы.")
     :limit/attachments-size                          (str "Общий размер всех загруженных файлов и изображений ограничен,"
                                                           " он может быть увеличен обновлением плана подписки.")
     :limit/attachments-size-clickable                (str "Общий размер всех загруженных файлов и изображений ограничен."
                                                           " Кликните, чтобы увеличить ваш лимит путём обновлением плана подписки.")

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

     :loading/initial-autoresize                      "Расчет размера всех ячеек, {loading/num-units} осталось ..."
     :loading/initial-layout                          "Усовершенствование первоначального формата ..."
     :loading/restoring-opened-pages                  "Восстановление позиції открытых страниц ..."
     :loading/getting-orgpage                         "Загрузка ОргСтранички из сервера ..."
     :loading/getting-dashboard                       "Загрузка списка доступных ОргСтраничек из сервера ..."
     :loading/getting-website                         "Загрузка веб-сайта из сервера ..."
     :loading/uploading-orgpage                       "Выгрузка ОргСтранички на сервер ..."
     :loading/ws-init                                 "Настройка связи с сервером ..."
     :loading/ws-closed                               "Связь с сервером утрачена. Попробуйте переподключиться. Если проблема не исчезнет, перезагрузите страницу."
     :loading/administration                          "Загрузка данных администратора ..."
     :loading/profile                                 "Загрузка профиля ..."
     :loading/style                                   "Загрузка стилей ..."
     ;; Needed?
     :loading/start-trial                             "Начало 7-дневной пробной подписки..."
     :loading/uploading-attachments                   "Выгрузка ввложений на сервер ..."

     :login/continue-with-facebook                    "Продолжить с Facebook"
     :login/continue-with-google                      "Продолжить с Google"
     :login/continue-with-microsoft                   "Продолжить с Microsoft"
     :login/forgotten-password                        "Забыли пароль"
     :login/forgotten-password-email-resent           "Электронное письмо для сброса пароля отправлено."
     :login/forgotten-password-description            "Введите электронный адрес, на который мы отправим вам ссылку, чтобы сбросить ваш пароль. Эта ссылка действительна в течение 24 часов."
     :login/forgotten-password-error                  [:<> "Этот электронный адрес заблокирован вами. Разблокируйте или нажмите Отписаться в любом письме от OrgPad, или отправьте нам электронное письмо по адресу "
                                                       [:b "support@orgpad.com"]
                                                       " с этого электронного адреса."]
     :login/remember                                  "Запомнить"
     :login/remember-tooltip                          "Оставаться в системе по возвращению на этот сайт."
     :login/send-reset-link                           "Отправить ссылку на сброс"
     :login/wrong-email-or-password                   "Неправильный адрес электронной почты или пароль."

     :login-util/separator                            "или"

     :meta/description                                "Описание"
     :meta/new-tag                                    "Добавить тэг"
     :meta/info                                       (str "Приведенная ниже информация поможет узнать, о чем эта ОргСтраничка. "
                                                           "Вы можете отфильтровывать по тэгам список ОргСтраничек.")

     :meta/info-in-share-orgpage                      "Перед публикацией этой ОргСтранички необходимо установить название."
     :notes/create-note                               "Новая заметка"
     :notes/edit-note                                 "Редактировать заметку"
     :notes/manage-notes                              "Управлять заметками"
     :notes/my-notes                                  "Мои заметки"
     :notes/notes                                     [:i18n/plural "{notes/num-notes} {notes/notes-label}"
                                                       {:notes/notes-label [:notes/num-notes
                                                                            "заметок" "заметка" "заметки" "заметок"]}]
     :notes/untitled                                  "Безымянная заметка"
     :notes/confirm-delete                            "Удалить эту заметку?"
     :notes/notes-description                         "Зафиксируйте свои идеи и отсортируйте их позже."

     :notifications/info                              "Виберите, какие электронные письма будет отправлять вам OrgPad. Мы всегда будем информировать вас о важных изменениях."
     :notifications/any-email                         "Любое письмо от OrgPad"
     :notifications/email-verification                "Проверка электронной почты при регистрации, ссылка для сброса пароля и необходимая платежная информация"
     :notifications/monthly-newsletter                "Ежемесячный информационный бюллетень с обновлениями и последними разработками в OrgPad"
     :notifications/messages                          "Получать сообщения от других людей"
     :notifications/blocked-people                    "Заблокированные люди:"
     :notifications/receipts                          "Квитанции, когда ваша подписка автоматически продлевается"
     :notifications/receive-invitations               "Получать приглашения от других людей"
     :notifications/unblock-user                      "Разблокировать этого пользователя"

     :onboarding/openable-units                       "Могут открываться только выступающие затененные ячейки."
     :onboarding/zoom                                 "Скролить для увеличения"
     :onboarding/drag-canvas                          "Переместить перетаскиванием"
     :onboarding/open-units                           "Затененные ячейки имеют содержимое"

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
     :orgpage/path-unit                               "Безымянная презентация"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "шагов" "шаг" "шагa" "шагов"]}]

     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (page {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (page {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Копия доступна как "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :orgpage-stats/number-of-units                   "Количество ячеек"
     :orgpage-stats/number-of-links                   "Количество ссылок"
     :orgpage-stats/number-of-files                   "Количество файлов"
     :orgpage-stats/number-of-images                  "Количество изображений"

     :org-role/student                                "Студент"
     :org-role/teacher                                "Преподаватель"
     :org-role/employee                               "Сотрудник"
     :org-role/admin                                  "Администратор"

     :panel/create-orgpage                            "Новая ОргСтраничка"
     :panel/logo-tooltip                              "Домой"
     :panel/edit-info                                 "Перейти к режиму редактирования, где можно создавать и удалять ячейки и ссылки, менять содержимое и т.п."
     :panel/read-info                                 "Перейти к режиму просмотра, где нельзя ничего изменять, но просматривать содержимое проще"
     :panel/undo-deletion                             "Отмена удаления"
     :panel/undo-deletion-info                        [:i18n/plural "Отменить удаление {delete/num-units} {delete/unit-label} и {delete/num-links} {delete/link-label} (CTRL+Z)."
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "ячеек" "ячейка" "ячейки" "ячеек"]
                                                                :link-label [:delete/num-links
                                                                             "ссылок" "ссылка" "ссылки" "ссылок"]}]
     :panel/refresh                                   "Обновить"
     :panel/switch-style                              "Изменить стиль новых ячеек и ссылок; перетащите для создания новой ячейки"
     :panel/profile                                   "Профиль"
     :panel/settings                                  "Настройка"
     :panel/usergroups                                "Группы"
     :panel/stats                                     "Статистика"
     :panel/administration                            "Администрация"
     :panel/ios-install-info                          "Установить приложение"
     :panel/upload-attachment                         "Вставте изображения или файлы в новые ячейки"
     :panel/selection-mode                            "Начать выбор"

     :password/too-short                              "Необходимо как минимум 8 символов"
     :password/different-passwords                    "Пароль не совпадает"

     :password-reset/back-to-list                     "Назад к списку"
     :password-reset/change-password                  "Сменить пароль"
     :password-reset/set-password                     "Установить пароль"
     :password-reset/has-password                     "Для вашей учетной записи установлен пароль."
     :password-reset/without-password                 "Пароль еще не установлен, поскольку для входа использовались привязанные учетные записи."
     :password-reset/invalid-link                     "Неправильная ссылка; возможно, прошло 24 часа. Пожалуйста, попросите отправить электронное письмо повторно"
     :password-reset/description                      "Установите ваш новый пароль."
     :password-reset/enter-current-and-new-password   "Введите текущий пароль и дважды новый пароль."
     :password-reset/enter-new-password-twice         "Введите новый пароль дважды."

     :path/add-step                                   "Добавить шаг"
     :path/add-step-tooltip                           "Удерживайте SHIFT, чтобы скопировать камеру"
     :path/title                                      "Презентация {path/num-paths}"
     :paths/create-new-path                           "Создать презентацию"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Удалить презентацию " [:b title] "?"])
     :paths/show-hidden-units                         "Показать скрытые ячейки"

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Текущий план подписки " [:b tier] ", действителен до " [:b end-date] "."
                                                         (if autorenewal
                                                           " Подписка будет автоматически продлена в конце платежного периода."
                                                           " Срок действия подписки закончится после окончания периода оплаты.")])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " в плане подписки " [:b tier] name "."])
     :payments/free-tier-info                         [:<> "OrgPad используется в плане подписки " [:b "Бесплатный,"] " без каких-либо платежей."]
     :payments/no-teams                               "Нет групп, использующих план подписки Бесплатный."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Для " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "обновления"]] " или ")
                                                         [:a.link-button {:href period-url} "изменения вашего периода оплаты"]
                                                         " свяжитесь с нами."])
     :payments/choose-plan                            "Выбрать план"
     :payments/manage-plan                            "Управлять планом"
     :payments/contact-to-manage                      (fn [{:payments/keys [url]}]
                                                        [:<> "Свяжитесь с нами, чтобы "
                                                         [:a.link-button {:href url} "управлять вашей подпиской"] "."])
     :payments/receipts                               "Квитанции:"
     :payments/receipt-label                          "Квитанция {receipt/date-range}"
     :payments/customer-portal-failed                 "При загрузке сайта управления произошла ошибка планом."

     :pending-activation/email-already-used           "Электронная почта уже используется другой учетной записью."
     :pending-activation/email-not-recieved           "Не получили электронное письмо для активации? Нажмите кнопку ниже. Вы можете даже изменить свой адрес электронной почты."
     :pending-activation/email-sent                   "Электронное письмо для активации отправлено. "
     :pending-activation/instructions                 "Из соображений безопасности мы должны сначала подтвердить вашу электронную почту. Нажмите ссылку для активации в электронном письме, которое мы вам отправили."
     :pending-activation/resend                       "Отправить электронное письмо для активации повторно"

     :permission/admin                                "Может делиться и удалять"
     :permission/admin-tooltip                        "Также имеющий доступ может изменять документ."
     :permission/edit                                 "Может редактировать"
     :permission/edit-tooltip                         "Может делать любые изменения в ОргСтраничке."
     :permission/comment                              "Может комментировать"
     :permission/comment-tooltip                      (str "Может создавать свои новые ячейки, "
                                                           "соединять и изменять их.")
     :permission/view                                 "Может читать"
     :permission/view-tooltip                         "Может читать ОргСтраничку, не внося никаких изменений."

     :presentation/presentation                       "Презентация"
     :presentation/step                               "Шаг"
     :presentation/first-step                         "Первый шаг"
     :presentation/previous-step                      "Предыдущий шаг"
     :presentation/next-step                          "Следующий шаг"
     :presentation/last-step                          "Последний шаг"
     :presentation/present                            "Начать презентацию"
     :presentation/exit-tooltip                       "Выход из презентации"

     :presentation/share-presentation                 "Поделиться этой презентацией с другими."

     :presentation/embedded-zoom-info                 "CTRL + scroll для масштабирования"

     :paths-menu/focus                                "Установить камеру {keyboard/shortcut}"
     :paths-menu/open-and-close                       "Открыть и закрыть ячейку {keyboard/shortcut}"
     :paths-menu/visibility                           "Сменить видимость {keyboard/shortcut}"

     :pricing-popup/orgpages-exceeded-title           "Бесплатный план не позволяет создавать больше ОргСтраничек"
     :pricing-popup/orgpages-exceeded                 "Вы должны обновить свой план."
     :pricing-popup/storage-exceeded-title            "Недостаточно места для загрузки {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "В вашем хранилище сталось только " [:b space-left] "."
                                                         " Вы можете обновить свой план, чтобы увеличить объем памяти."])
     :pricing-popup/num-shared-limit-reached-title    "Вы не можете предоставить доступ к этой ОргСтраничке большему количеству людей"
     :pricing-popup/num-shared-limit-reached-common   "Достигнуто максимальное количество людей, которые могут сообща использовать эту ОргСтраничку."
     :pricing-popup/num-shared-limit-reached          [:<> " Чтобы добавить больше людей, вы должны обновиться до "
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
     :pricing-popup/team-members-limit-reached        [:<> " Чтобы добавить больше участников, вы должны обновиться до "
                                                       [:b "плана Профессиональный"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " Владелец этой группы " owner " должен обновиться до "
                                                         [:b "плана Профессиональный"] ", чтобы добавить больше членов."])

     :profile/open-contact-dialog                     "Отправить сообщение"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Связаться с " first-name " " last-name)
                                                          "Связаться с этим человеком"))
     :profile/contact-dialog-info                     (str "Так как мы не раскрываем электронные адреса других людей в OrgPad, это сообщение от нас. Мы"
                                                           " добавим ваше имя и электронный адрес, чтобы обеспечить прямой контакт.")

     :promotion/unknown                               "Неизвестный код"
     :promotion/max-usages-reached                    "Использовался слишком много раз"
     :promotion/expired                               "Срок действия истек"
     :promotion/one-year-free                         "1 год бесплатно"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} бесплатно"
                                                       {:promotion/days [:promotion/duration "дней" "день" "дня" "дней"]}]
     :promotion/for-one-year                          " на 1 год"
     :promotion/for-six-months                        " на 6 месяцев"

     :props/h1                                        "Крупный заголовок"
     :props/h2                                        "Средний заголовок"
     :props/h3                                        "Малый заголовок"
     :props/weight-none                               "Тонкая линия соединения"
     :props/strong                                    "Толстая линия соединения"
     :props/arrowhead-none                            "Без стрелки"
     :props/single                                    "Стрелка"
     :props/double                                    "Двойная стрелка"

     :public-permission/none                          "личное."
     :public-permission/edit                          "предоставлено всем для редактирования."
     :public-permission/view                          "предоставлено всем для просмотра."

     :registration/create-user                        "Создать учетную запись"
     :registration/register-by-email                  "Зарегистрировать электронный адрес"
     :registration/server-error                       "Ошибка сервера. Попробуйте создать учетную запись еще раз."
     :registration/missing-email                      "{registration/service} не сообщила нам адрес вашей электронной почты. Пожалуйста, заполните его ниже."

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
     :selection/hide-contents                         "Скрыть содержание"
     :selection/show-contents                         "Показать содержание"
     :selection/copy-units-links                      "Скопировать ячейки и ссылки в буфер обмена"
     :selection/flip-links                            "Перевернуть направление ссылки"
     :selection/delete                                "Удалить выделенное"

     :settings/profile                                "Профиль"
     :settings/payments                               "Платежи"
     :settings/account                                "Учетная запись"
     :settings/linked-accounts                        "Связанные учетные записи"
     :settings/notifications                          "Уведомления"
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
     :settings/set-password-text                      " Установите пароль перед тим, как открепить."
     :settings/linked-accounts-info                   "Привяжите вашу учетную запись в Facebook или Google к учетной записи OrgPad, чтобы вы могли использовать ее для входа."
     :settings/profile-info                           "Предоставленная информация облегчит вам поиск сотрудников по проекту."
     :settings/select-language                        "Язык приложения (Ctrl+Shift+L): "

     :settings/delete-account                         "Удалить учетную запись"
     :settings/confirm-delete-account-question        [:<> [:b "Окончательно"] " удалить учетную запись?"]
     :settings/confirm-delete-account-info            "Все ваши ОргСтранички и их данные будут удалены."
     :settings/delete-account-info                    [:<> "Удаление приведет к " [:b "окончательному"] " удалению всех ваших ОргСтраничек и их данных."]

     :share-orgpage/campaigns                         "Campaigns"
     :share-orgpage/copy-template-link                "Скопировать ссылку на шаблон"
     :share-orgpage/dialog-title                      "Поделиться {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Люди, не имеющие учетной записи OrgPad, получат приглашение со ссылкой."
                                                                  " Открыв ее, они смогут просматривать эту ОргСтраничку. ")
                                                         [:a.link-button create-team "Создать группу,"]
                                                         " чтобы легко делиться ОргСтраничками с несколькими людьми."])
     :share-orgpage/invite-for-editing                "Приглашение для редактирования"
     :share-orgpage/invite-for-viewing                "Приглашение для просмотра"
     :share-orgpage/invite-by-email                   "Желаете ли вы пригласить их по электронной почте на определенном языке?"
     :share-orgpage/links                             "Ссылки"
     :share-orgpage/to-read                           "для просмотра"
     :share-orgpage/to-comment                        "комментировать"
     :share-orgpage/to-edit                           "для редактирования"
     :share-orgpage/links-tooltip                     "Предоставьте доступ по ссылке для общего доступа"
     :share-orgpage/template-info                     "Люди могут использовать эту ссылку для создания собственных копий этой ОргСтранички."
     :share-orgpage/embed                             "Встроить"
     :share-orgpage/embed-tooltip                     "Вставьте в свой веб-сайт"
     :share-orgpage/new-user-or-usergroup             "Имя, адрес электронной почты или группа"
     :share-orgpage/link-permission-start             "Разрешенные люди"
     :share-orgpage/link-permission-end               "эта ОргСтраничка."
     :share-orgpage/private-info                      (str "Доступ имеете только вы и люди, которым вы предоставили доступ к ОргСтраничке непосредственно или по ссылке."
                                                           " Каждый вновь созданный документ является личным.")
     :share-orgpage/publish-for-editing-info          "ОргСтраничка является общедоступной. Кто-либо в Интернете может искать и редактировать ее."
     :share-orgpage/publish-for-reading-info          (str "ОргСтраничка является общедоступной. Кто-либо в Интернете может искать и просматривать ее."
                                                           " Изменения вносить можете только вы или те, с кем вы поделились ОргСтраничкой для редактирования.")
     :share-orgpage/publish-permission-end            "Эта ОргСтраничка является "
     :share-orgpage/publish                           "Общедоступной"
     :share-orgpage/publish-confirmation              "Каждый сможет {orgpage/permission} эту ОргСтраничку. Вы уверены?"
     :share-orgpage/publish-tooltip                   "Предоставлен доступ всем"
     :share-orgpage/remove-user                       "Удалить разрешение"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Если вы поделились ссылкой случайно, вы можете "
                                                         [:span.link-button reset-links "аннулировать все предыдущие ссылки"]
                                                         "."])
     :share-orgpage/shareable-link                    "Ссылка для общего доступа"
     :share-orgpage/start-with-presentation           "Начните с презентации."
     :share-orgpage/template-link-switch              "Создать ссылку на шаблон."
     :share-orgpage/user-not-registered               " еще не зарегистрирован на OrgPad."
     :share-orgpage/users                             "Люди"
     :share-orgpage/users-tooltip                     "Предоставьте доступ отдельным людям"

     :side-panel/about                                "О"
     :side-panel/files-and-images                     "Файлы и изображения"
     :side-panel/paths                                "Презентации"
     :side-panel/translate                            "Перевести"
     :side-panel/help                                 "Помощь"
     :side-panel/home                                 "Домой"
     :side-panel/import                               "Импортировать"
     :side-panel/share                                "Поделиться"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "файлов" "файл" "файла" "файлов"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "изображений" "изображение" "изображения" "изображений"]}]
     :side-panel/num-paths                            [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 " маршрутов " " маршрут " " маршрута " " маршрутов "]}]

     :step/closed-pages                               "Закрытые страницы"
     :step/everything-closed                          "Все закрыто."
     :step/hidden-units                               "Скрытые ячейки"
     :step/nothing-changed                            "Ничего не изменилось."
     :step/opened-pages                               "Открытые страницы"
     :step/pages-shown-in-the-camera                  "Страницы, отображающиеся в камере"
     :step/revealed-units                             "Раскрытые ячейки"
     :step/switched-pages                             "Переключенные страницы"

     :tag/public                                      "общедоступный"

     :text-field/email                                "Email"
     :text-field/first-name                           "Имя"
     :text-field/last-name                            "Фамилия"
     :text-field/new-password                         "Новый пароль"
     :text-field/new-password-again                   "Новый пароль еще раз"
     :text-field/password                             "Пароль"
     :text-field/password-again                       "Пароль еще раз"
     :text-field/title                                "Название"
     :text-field/content                              "Содержимое"
     :text-field/name-or-email                        "Имя или адрес электронной почты"
     :text-field/subject                              "Тема"
     :text-field/message                              "Сообщение"

     :tier/free                                       "Свободный"
     :tier/standard                                   "Стандартный"
     :tier/professional                               "Профессиональный"
     :tier/school                                     "Школьный"
     :tier/enterprise                                 "Корпоративный"
     :tier/unlimited                                  "Безлимитный"

     :translate/title                                 "Перевести ОргСтраничку {orgpage/title} на другой язык"
     :translate/info                                  (str "Автоматически создает копию вашей ОргСтранички"
                                                           ", переведенную с исходного языка на целевой."
                                                           " Вы можете найти ее в своем списке за минуту.")
     :translate/source-lang                           "Исходный язык"
     :translate/target-lang                           "Целевой язык"
     :translate/translate                             "Перевести"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Перевод доступен как "
                                                         [:a.link-button {:href   url
                                                                          :target "_пусто"} title]])

     :role/owner                                      "Владелец"
     :role/member                                     "Член"

     :unit-panel/link                                 "Кликните или перетащите для соединения; удерживайте SHIFT для создания множественных соединений"
     :unit-panel/upload-attachment                    "Вставьте изображение, или файл в эту ячейку"
     :unit-panel/change-link-style                    (str "Изменить стиль этой ячейки; "
                                                           "Удерживайте SHIFT, чтобы установить текущий, "
                                                           "Удерживайте CTRL, чтобы скопировать в стиль по умолчанию; "
                                                           "перетащите для подключения в этом стиле")
     :unit-panel/hide-content                         "Скрыть содержимое"
     :unit-panel/delete-unit                          "Удалить ячейку"

     :usergroups/create-team                          "Создать группу"
     :usergroups/info                                 "Создайте и управляйте группами ваших друзей и сотрудников для облегчения распространения ОргСтраничек."
     :usergroups/delete-usergroup                     "Удалить группу"
     :usergroups/members                              "Члены"
     :usergroups/change                               "Сменить название и логотип"
     :usergroups/show-actions                         "Показать действия"
     :usergroups/name                                 "Имя"
     :usergroups/create-usegroup-info                 (str "Имя группы и аватарку профиля может видеть кто-либо на OrgPad. "
                                                           "Виберите имя длиной не меньше 5 символов. "
                                                           "Начальные и конечные пробелы будут удалены.")
     :usergroups/confirm-delete-usergroup             [:<> [:b "Окончательно"] " удалить эту группу?"]
     :usergroups/usergroups-members                   "члены группы {usergroup/name}"
     :usergroups/remove-member                        "Исключить из группы"
     :usergroups/remove-admin                         "Снять права администратора"
     :usergroups/make-admin                           "Сделать администратором"
     :usergroups/admin-tooltip                        "Администратор может управлять членами группы и удалять ее."
     :usergroups/untitled-usergroup                   "Безымянная группа"

     :wire-transfer/title                             "Банкіовский перевод для годового плана {wire-transfer/tier}"
     :wire-transfer/info                              "Мы активируем вашу годовую подписку после поступления средств на счет."
     :wire-transfer/used-currency                     "Платеж в {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Имя получателя"
     :wire-transfer/account-number                    "Номер счета"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Сумма"
     :wire-transfer/payment-purpose                   "Назначение платежа"
     :wire-transfer/qr-code-common                    (str "Сосканируйте этот платежный QR-код в вашем банковском приложении, чтобы"
                                                           " автоматически вносить правильную информацию.")
     :wire-transfer/cz-sk-qr-code-description         (str " Это QR-код, который обычно используется для банковских переводов"
                                                           " в Чехии и Словакии.")
     :wire-transfer/eu-qr-code-description            (str " Это QR-код, который обычно используется для переводов SEPA"
                                                           " в Евросоюзе.")
     :wire-transfer/trial-info                        (str "Вы можете открыть одноразовую 7-дневную подписку для использования OrgPad"
                                                           " прямо сейчас. Когда банк подтвердит успешную оплату,"
                                                           " срок действия подписки будет продлен"
                                                           " на 1 год.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Если у вас возникли вопросы или трудности, пожалуйста,"
                                                         " сообщите нам, " [:a.link-button {:href url} "заполнив эту форму"] "."])
     :wire-transfer/success-text                      [:<> "Мы активировали " [:b "одноразовую 7-дневную подписку,"]
                                                       " так что вы можете прямо сейчас использовать OrgPad по новому плану. "]
     :wire-transfer/common-result-text                (str "Когда банк подтвердит успешную оплату,"
                                                           " срок действия подписки будет продлен"
                                                           " на 1 год.")
     :wire-transfer/start-trial                       "Банковский перевод отправлен"
     :wire-transfer/start-trial-result-title          "Благодарим за оплату"
     :wire-transfer/copy                              "Скопировать в буфер обмена"

     :website-editor/settings                         "Настройки"
     :website-editor/routes                           "Маршруты"
     :website-editor/menus                            "Меню"
     :website-editor/create-menu                      "Создать меню"
     :website-editor/edited-menu                      "Редактировать меню"
     :website-editor/untitled-menu                    "Безымянное меню"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "детей" "ребенок" "детей" "детей"]}]
     :website-editor/delete-menu-item                 "Удалить этот пункт меню"
     :website-editor/add-menu-item                    "Добавить пункт меню"
     :website-editor/menu-item-label                  "Ярлык пункта"
     :menu-item/path-type                             "Открывает маршруты"
     :menu-item/url-type                              "Открывает внешнюю ссылку URL"
     :menu-item/children-type                         "Открывает подменю"
     :website-editor/menu-item-path                   "Маршрут"
     }))
