(ns orgpad.server.i18n.uk
  (:require [orgpad.common.i18n.dict.uk :as uk]
            [orgpad.common.company :as company]))

(def dict
  "A dictionary map from keywords to the corresponding Ukrainian texts."
  (merge
    uk/dict
    {:orgpage/untitled                     "документ"
     :orgpage/copy                         "Копія"

     :permission/view                      "читати"
     :permission/edit                      "редагувати"

     :subscription/monthly                 "місячна"
     :subscription/yearly                  "річна"

     :email/greeting                       "Дорогий {{customer}},"
     :email/signature                      "З найкращими побажаннями"
     :email/team                           "Pavel Klavík i Kamila Klavíková"
     :email/creators                       "Творці OrgPad"
     :email/footer                         (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                             (list [:a href-orgpad "https://orgpad.info"] ". Вам не подобаються ці листи? "
                                                   [:a href-unsubscribe "Відписатись"] "."))
     :email/support-info                   (fn [{:feedback/keys [url]}]
                                             (list "Якщо виникнуть якісь проблеми, будь-ласка, повідомте нам "
                                                   [:a {:href (str "{{domain}}" url)} "через форму"]
                                                   " або напишіть на " company/support-email-link "."))
     :email/or                             " або "
     :email/customer                       "Клієнт"

     :verification/subject                 "Підтвердіть ваш обліковий запис в OrgPad"
     :verification/preheader               "Ласкаво просимо в OrgPad. Будь ласка, підтвердіть ваш обліковий запис, натиснувши кнопку нижче."
     :verification/heading                 "Підтвердіть адресу вашої електронної пошти"
     :verification/body                    "Щоб підтвердити ваш обліковий запис, будь ласка, натисніть кнопку нижче. Натискаючи кнопку, ви у подальшому погоджуєтесь з "
     :verification/terms-and-conditions    "Умовами й Положеннями OrgPad"
     :verification/button                  "Підтвердити адресу електронної пошти"
     :verification/accidental-email        "Якщо ви одержали цей лист помилково, будь ласка, видаліть його. Якщо ви одержите ці листи знову, будь ласка, повідомте нам за адресою "

     :password-reset/subject               "Скинути ваш пароль до OrgPad"
     :password-reset/preheader             "Скинути ваш пароль до OrgPad, натиснувши кнопку нижче."
     :password-reset/heading               "Скинути ваш пароль до OrgPad"
     :password-reset/body                  "Будь ласка, натисніть кнопку нижче, щоб скинути ваш пароль. Дійсно 24 години."
     :password-reset/button                "Скинути пароль"
     :password-reset/accidental-email      "Якщо ви не намагались скинути пароль, або в цьому більше немає потреби, вам не потрібно нічого робити."

     :new-subscription/subject             "Підтвердження нової підписки"
     :new-subscription/preheader           "Ваш план {{tier}} підписки на OrgPad активний. Підписка буде поновлюватись автоматично через {{period}}."
     :new-subscription/body                "Ваш план {{tier}} підписки на OrgPad активний. Дякуємо за оплату!"
     :new-subscription/details             (fn [{:payment/keys [url]}]
                                             (list "У подальшому підписка буде поновлюватись автоматично кожний {{period}}. Ваші квитанції автоматично зберігаються в "
                                                   [:a {:href (str "{{domain}}" url)} "розділі Платежі"] " в налаштуваннях OrgPad."))

     :new-payment/subject                  "Платіж пройшов успішно"
     :new-payment/preheader                "Ви продовжили вашу підписку на план {{tier}}, дійсно до {{subscription-end}}."
     :new-payment/body                     (list "Ви успішно продовжили вашу підписку на план {{tier}}. Вона дійсна до "
                                                 [:b "{{subscription-end}}"] ". Дякуємо за оплату!")
     :new-payment/button                   "Завантажити квитанцію"

     :payment-failed/subject               "Не вдалося оплатити підписку"
     :payment-failed/preheader             "Будь ласка, переконайтесь, що ваша карта дійсна, і на ній достатньо коштів. Якщо проблеми залишаться, зв'яжіться з нами."
     :payment-failed/body                  (str "Виникла помилка при оплаті підписки на OrgPad."
                                                " Будь ласка, переконайтесь, що ваша карта дійсна, і на ній достатньо коштів.")
     :payment-failed/button                "Поновити спосіб оплати"
     :payment-failed/grace-warning         (list "Ваша поточна підписка активна до "
                                                 [:b "{{subscription-end}}"]
                                                 ". Якщо ви не оплатите підписку до цієї дати, ваш обліковий запис буде"
                                                 " знижений до безкоштовного плану. Ви, як і раніше, зможете отримувати доступ, редагувати, видаляти та ділитися своїми даними.")

     :feedback/subject                     "Питання: {{title}}"
     :feedback/preheader                   "{{first-name}} {{last-name}} надіслав(-ла) питання {{title}}"
     :feedback/heading                     "{{first-name}} {{last-name}} ({{email}}) надіслав(-ла) питання {{title}}"

     :invitation/subject                   "Вас запрошено {{action}} документ в OrgPad"
     :invitation/preheader                 "{{user}} запрошує вас {{action}} {{title}}. Натисніть кнопку нижче щоб відкрити."
     :invitation/heading                   "{{user}} запрошує вас {{action}} {{title}}"
     :invitation/body                      "OrgPad є платформою для створення візуальних документів для Big Picture. Натискаючи кнопку нижче, ви приймаєте запрошення і відкриваєте документ."
     :invitation/button                    "Відкрити Документ"
     :invitation/accidental-email          "Якщо ви одержали цей лист помилково, будь ласка, видаліть його. Якщо ви одержите ці листи знову, ви можете "
     :invitation/block-user                "заблокувати запрошення від {{user}}"
     :invitation/block-all                 "заблокувати всі запрошення"

     :contact-user/subject                 "З вами зв'язались через OrgPad"
     :contact-user/preheader               "Повідомлення від {{user}}"
     :contact-user/heading                 "{{user}} ({{reply-to}}) зв'язується з вами через OrgPad"
     :contact-user/body                    (str "Цей електронний лист від нас, оскільки ми нікому не передаємо вашу адресу електронної пошти. Ви можете відповісти на повідомлення, "
                                                "відповівши на це повідомлення або написавши електронний лист на {{reply-to}}.")
     :contact-user/unsolicited-info        "Якщо це повідомлення є небажаним, ви можете "
     :contact-user/block-user              "заблокувати всі повідомлення від {{user}}"
     :contact-user/block-all               "заблокувати всі повідомлення від усіх користувачів OrgPad."

     :blog/rss-description                 "Останні новини та оновлення OrgPad і технічні обговорення."

     :newsletter-2024-summer/subject       "Літнє оновлення від OrgPad"
     :newsletter-2024-summer/preheader     "Дізнайтеся про наші останні оновлення додатку, новий блог, покращені заходи конфіденційності та багато іншого!"
     :newsletter-2024-summer/introduction  "Ми повернулися з черговою розсилкою після річної перерви!"
     :newsletter-2024-summer/heading       "У цьому листі ви знайдете:"
     :newsletter-2024-summer/body          (list [:li "Що нового в додатку з початку року?"]
                                                [:li "Що ви знайдете в нашому новому блозі?"]
                                                [:li "Як ми дбаємо про вашу конфіденційність і безпеку ваших даних?"]
                                                [:li "Як ми оновили умови використання для вашої зручності?"]
                                                [:li "Навіщо приєднуватися до спільноти?"])
     :newsletter-2024-summer/button        "Переглянути розсилання"
     :newsletter-2024-summer/closing       "Ми чекаємо на ваші ідеї."}))