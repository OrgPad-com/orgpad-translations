(ns orgpad.server.i18n.uk
  (:require [orgpad.common.i18n.dict.uk :as uk]))

(def dict
  "A dictionary map from keywords to the corresponding Ukrainian texts."
  (merge
    uk/dict
    {:orgpage/untitled                     "документ"
     :permission/view                      "читати"
     :permission/edit                      "редагувати"

     :subscription/monthly                 "місячна"
     :subscription/yearly                  "річна"

     :tier/standard                        "Стандарт"
     :tier/professional                    "Професіонал"
     :tier/school                          "Школа"
     :tier/enterprise                      "Бізнес"
     :tier/unlimited                       "Безліміт"

     :email/customer                       "Клієнт"
     :email/greeting                       "Дорогий {{customer}},"
     :email/signature                      "З найкращими побажаннями"
     :email/ceo                            "Vít Kalisz, CEO"
     :email/contact-us                     (fn [{:feedback/keys [url]}]
                                             (list "Якщо виникнуть якісь проблеми, будь- ласка, повідомте нам "
                                                   [:a {:href (str "{{domain}}" url)} "через форму"]
                                                   " або напишіть на " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                             " або "

     :invitation/subject                   "Вас запрошено {{action}} документ в OrgPad"
     :invitation/preheader                 "{{user}} запрошує вас {{action}} {{title}}. Натисніть кнопку нижче щоб відкрити."
     :invitation/heading                   "{{user}} запрошує вас {{action}} {{title}}"
     :invitation/info                      "OrgPad є платформою для створення візуальних документів для Big Picture. Натискаючи кнопку нижче, ви приймаєте запрошення і відкриваєте документ."
     :invitation/button                    "Відкрити Документ"
     :invitation/accidental-email          "Якщо ви одержали цей лист помилково, будь ласка, видаліть його. Якщо ви одержите ці листи знову, ви можете "
     :invitation/block-user                "заблокувати запрошення від {{user}}"
     :invitation/block-all                 "заблокувати всі запрошення"

     :footer/unsubscribe                   (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                             (list [:a href-orgpad "https://orgpad.com"] ". Вам не подобаються ці листи? "
                                                   [:a href-unsubscribe "Відписатись"] "."))

     :orgpage/copy                         "Копія"

     :password-reset/subject               "Скинути ваш пароль до OrgPad"
     :password-reset/preheader             "Скинути ваш пароль до OrgPad, натиснувши кнопку нижче."
     :password-reset/heading               "Скинути ваш пароль до OrgPad"
     :password-reset/text-1                "Будь ласка, натисніть кнопку нижче, щоб скинути ваш пароль. Дійсно 24 години."
     :password-reset/button                "Скинути пароль"
     :password-reset/text-2                "Якщо ви не намагались скинути пароль, або в цьому більше немає потреби, вам не потрібно нічего робити."

     :verification/subject                 "Підтвердіть ваш обліковий запис в OrgPad"
     :verification/preheader               "Ласкаво просимо в OrgPad. Будь ласка, підтвердіть ваш обліковий запис, натиснувши кнопку нижче."
     :verification/heading                 "Підтвердіть адресу вашої електронної пошти"
     :verification/verify-account-info     "Щоб підтвердити ваш обліковий запис, будь ласка, натисніть кнопку нижче. Натискаючи кнопку, ви у подальшому погоджуєтесь з "
     :verification/terms-and-conditions    "Умовами й Положеннями Orgpad"
     :verification/button                  "Підтвердіть адресу електронної пошти"
     :verification/received-by-mistake     "Якщо ви одержали цей лист помилково, будь ласка, видаліть його. Якщо ви одержите ці листи знову, будь ласка, повідомте нам за адресою "
     :verification/support-email           "support@orgpad.com"

     :feedback/subject                     "Питання: {{title}}"
     :feedback/preheader                   "{{first-name}} {{last-name}} надіслав(-ла) питання {{title}}"
     :feedback/heading                     "{{first-name}} {{last-name}} ({{email}}) надіслав(-ла) питання {{title}}"

     :newsletter/subject                   "Новинна розсилка OrgPad {newsletter/date}"
     :newsletter/preheader                 "Щоб одержувати новинну розсилку {newsletter/date}. натисніть посилання нижче."
     :newsletter/button                    "Відкрити новинну розсилку "
     :newsletter/text                      "Ви отримали цю новинну розсилку, оскільки ви підписались на неї. Якщо ви одержали цей лист помилково або не бажаєте більше одержувати їх, "
     :newsletter/unsubscribe               "відпишіться, використовуючи це посилання"

     :contact-user/subject                 "З вами зв'язались через OrgPad"
     :contact-user/preheader               "Повідомлення від {{user}}"
     :contact-user/heading                 "{{user}} ({{reply-to}}) зв'язується з вами через OrgPad"
     :contact-user/common-info             (str "Цей електронний лист від нас, оскільки ми нікому не передаємо вашу адресу електронної пошти. Ви можете відповісти на повідомлення, "
                                                "відповівши на це повідомлення або написавши електронний лист на {{reply-to}}.")
     :contact-user/post-message-info       "Якщо це повідомлення є небажаним, ви можете "
     :contact-user/block-user              "заблокувати всі повідомлення від {{user}}"
     :contact-user/block-all               "заблокувати всі повідомлення від усіх користувачів OrgPad."

     :new-payment/subject                  "Платіж пройшов успішно"
     :new-payment/preheader                "Ви продовжили вашу підписку на план {{tier}}, дійсно до {{subscription-end}}."
     :new-payment/common-info              (list "Ви успішно продовжили вашу підписку на план {{tier}}. Вона дійсна до "
                                                 [:b "{{subscription-end}}"] ". Дякуємо за оплату!")
     :new-payment/download-receipt         "Загрузити квитанцію"

     :new-subscription/subject             "Підтвердження нової підписки"
     :new-subscription/preheader           "Ваш план {{tier}} підписки на OrgPad активний. Підписка буде поновлюватись автоматично через {{period}}."
     :new-subscription/active-tier         "Ваш план {{tier}} підписки на OrgPad активний. Дякуємо за оплату!"
     :new-subscription/payment-info        (fn [{:payment/keys [url]}]
                                             (list "У подальшому підписка буде поновлюватись автоматично кожний {{period}}. Ваші квитанції автоматично зберігаються в "
                                                   [:a {:href (str "{{domain}}" url)} "розділі Платежі"] " в налаштуваннях OrgPad."))

     :payment-failed/subject               "Не вдалося оплатити підписку"
     :payment-failed/preheader             "Будь ласка, переконайтеся, що ваша карта дійсна, і на ній достатньо коштів. Якщо проблеми залишаться, зв'яжіться з нами."
     :payment-failed/error                 (str "Виникла помилка при оплаті підписки на OrgPad."
                                                " Будь ласка, переконайтеся, що ваша карта дійсна, і на ній достатньо коштів.")
     :payment-failed/payment               "Поновити спосіб оплати"
     :payment-failed/current-subscription  (list "Ваша поточна підписка активна до "
                                                 [:b "{{subscription-end}}"]
                                                 ". Якщо ви не оплатите підписку до цієї дати, ваш обліковий запис буде"
                                                 " знижений до безкоштовного плану. Ви, як і раніше, зможете отримувати доступ, редагувати, видаляти та ділитися своїми даними.")

     :admin-trial-start/subject            "Новий пробний період {{tier}} розпочався ({{monetary-value}})"
     :admin-free-license-activated/subject "Безкоштовну ліцензію {{tier}} активовано ({{monetary-value}})"
     :admin-gift-coupon-activated/subject  "Подарунковий купон на ліцензію {{tier}} активовано ({{monetary-value}})"
     :admin-subscription-start/subject     "Новий {{period}} підписки {{tier}} розпочався ({{monetary-value}})"
     :admin-subscription-failed/subject    "Не вдалося поновити підписку {{tier}} на {{period}} ({{monetary-value}})"
     :admin-subscription-end/subject       "Продовження {{period}} підписки {{tier}} відхилено ({{monetary-value}})"
     :admin-subscription-renewed/subject   "Існуючий {{period}} підписки {{tier}} продовжено ({{monetary-value}})"

     :reminder/subject                     "Знижки на OrgPad, новини та приклади використання"
     :reminder/preheader                   "Що покращено в OrgPad у грудні 2021 та приклади використання."
     :reminder/thank-you                   "Перш за все, я хотів би подякувати вам за створення облікового запису в OrgPad."
     :reminder/phunt-launch                (str "Грудень - місяць, повний сюрпризів. "
                                                "Найбільший сюрприз минулого місяця трапився напередодні Різдва. "
                                                "І трапилося це завдяки не Санті, а  Product Hunt. "
                                                "Принаймні я так думаю. Зараз OrgPad є одним з п'яти топових продуктів "
                                                "на Product Hunt. Завдяки цьому ми були зайняті на "
                                                "Різдво відповідями на електронні листи і "
                                                "запитання у соціальних мережах і подальшим розповсюдженням OrgPad.")
     :reminder/button-info                 (str "Щоб полегшити початок користування OrgPad, я підготував кілька прикладів використання. "
                                                "Щоб їх вивчити, натисніть кнопку нижче. Я також додав кілька новин про OrgPad.")
     :reminder/button                      "Новини OrgPad і приклади використання"
     :reminder/phunt-promo-code            (list "Я також хотів би нагадати вам про "
                                                 [:b "промо-код PHUNT21 на 50% знижку."]
                                                 " Ви можете допомогти нам розповсюдженням у соціальних мережах інформації про OrgPad. "
                                                 "Вітаються окремі твіти, пости або згадки.")}))
