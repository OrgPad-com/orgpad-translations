(ns orgpad.server.i18n.ru
  (:require [orgpad.common.i18n.dict.ru :as ru]
            [orgpad.common.company :as company]))

(def dict
  "A dictionary map from keywords to the corresponding Russian texts."
  (merge
    ru/dict
    {:orgpage/untitled                     "документ"
     :orgpage/copy                         "Копировать"

     :permission/view                      "читать"
     :permission/edit                      "редактировать"

     :subscription/monthly                 "месячная"
     :subscription/yearly                  "годовая"

     :email/greeting                       "Дорогой {{customer}},"
     :email/signature                      "С наилучшими пожеланиями"
     :email/team                           "Pavel Klavík, Kamila Klavíková"
     :email/creators                       "Создатели OrgPad"
     :email/footer                         (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                             (list [:a href-orgpad "https://orgpad.info"] ". Вам не нравятся эти письма? "
                                                   [:a href-unsubscribe "Отписаться"] "."))
     :email/support-info                   (fn [{:feedback/keys [url]}]
                                             (list "В случае возникновения каких-либо проблем, пожалуйста, сообщите нам "
                                                   [:a {:href (str "{{domain}}" url)} "через форму"]
                                                   " или написав на " company/support-email-link "."))
     :email/or                             " или "
     :email/customer                       "Клиент"

     :verification/subject                 "Подтвердите ваш аккаунт в OrgPad"
     :verification/preheader               "Добро пожаловать в OrgPad. Пожалуйста, подтвердите ваш аккаунт, нажав кнопку ниже."
     :verification/heading                 "Подтвердите адрес вашей электронной почты"
     :verification/body                    "Чтобы подтвердить ваш аккаунт, пожалуйста, нажмите кнопку ниже. Нажимая кнопку, вы в дальнейшем соглашаетесь с "
     :verification/terms-and-conditions    "Условиями и Положениями OrgPad"
     :verification/button                  "Подтвердить адрес электронной почты"
     :verification/accidental-email        "Если вы получили это письмо по ошибке, пожалуйста, удалите его. Если вы получите эти письма повторно, пожалуйста, сообщите нам по адресу "

     :password-reset/subject               "Сбросить ваш пароль к OrgPad"
     :password-reset/preheader             "Сбросить ваш пароль к OrgPad, нажав кнопку ниже."
     :password-reset/heading               "Сбросить ваш пароль к OrgPad"
     :password-reset/body                  "Пожалуйста, нажмите кнопку ниже, чтобы сбросить ваш пароль. Действительно 24 часа."
     :password-reset/button                "Сбросить пароль"
     :password-reset/accidental-email      "Если вы не пытались сбросить пароль, или в этом больше нет необходимости, Вам не нужно ничего делать."

     :new-subscription/subject             "Подтверждение новой подписки"
     :new-subscription/preheader           "Ваш план {{tier}} подписки на OrgPad активен. Подписка будет обновляться автоматически через {{period}}."
     :new-subscription/body                "Ваш план {{tier}} подписки на OrgPad активен. Благодарим за оплату!"
     :new-subscription/details             (fn [{:payment/keys [url]}]
                                             (list "В дальнейшем подписка будет продлеваться автоматически каждый {{period}}. Ваши квитанции автоматически сохраняются в "
                                                   [:a {:href (str "{{domain}}" url)} "разделе Платежи"] " в настройках OrgPad."))

     :new-payment/subject                  "Платеж прошел успешно"
     :new-payment/preheader                "Вы продлили вашу подписку на план {{tier}}, действительно до {{subscription-end}}."
     :new-payment/body                     (list "Вы успешно продлили вашу подписку на план {{tier}}. Она действительна до "
                                                 [:b "{{subscription-end}}"] ". Благодарим за оплату!")
     :new-payment/button                   "Загрузить квитанцию"

     :payment-failed/subject               "Не удалось оплатить подписку"
     :payment-failed/preheader             "Пожалуйста, убедитесь, что ваша карта действительна, и на ней достаточно средств. Если проблемы останутся, свяжитесь с нами."
     :payment-failed/body                  (str "Произошла ошибка при оплате подписки на OrgPad."
                                                " Пожалуйста, убедитесь, что ваша карта действительна, и на ней достаточно средств.")
     :payment-failed/button                "Обновить способ оплаты"
     :payment-failed/grace-warning         (list "Ваша текущая подписка активна до "
                                                 [:b "{{subscription-end}}"]
                                                 ". Если вы не оплатите подписку до этой даты, ваша учетная запись будет"
                                                 " понижена до бесплатного плана. Вы по-прежнему сможете получать доступ, редактировать, удалять и делиться своими данными.")

     :feedback/subject                     "Вопрос: {{title}}"
     :feedback/preheader                   "{{first-name}} {{last-name}} прислал(-а) вопрос {{title}}"
     :feedback/heading                     "{{first-name}} {{last-name}} ({{email}}) прислал(-а) вопрос {{title}}"

     :invitation/subject                   "Вы приглашаетесь {{action}} документ в OrgPad"
     :invitation/preheader                 "{{user}} приглашает вас {{action}} {{title}}. Нажмите кнопку ниже для открытия."
     :invitation/heading                   "{{user}} приглашает вас {{action}} {{title}}"
     :invitation/body                      "OrgPad - это платформа для создания визуальных документов для Big Picture. Нажимая кнопку ниже, вы принимаете приглашение и открываете документ."
     :invitation/button                    "Открыть Документ"
     :invitation/accidental-email          "Если вы получили это письмо по ошибке, пожалуйста, удалите его. Если вы получите эти письма повторно, вы можете "
     :invitation/block-user                "заблокировать приглашения от {{user}}"
     :invitation/block-all                 "заблокировать все приглашения"

     :contact-user/subject                 "С Вами связались через OrgPad"
     :contact-user/preheader               "Сообщение от {{user}}"
     :contact-user/heading                 "{{user}} ({{reply-to}}) связывается с Вами через OrgPad"
     :contact-user/body                    (str "Это электронное письмо от нас, потому что мы никому не передаем ваш адрес электронной почты. вы можете ответить на сообщение, "
                                                "ответив на это сообщение или написав электронное письмо на {{reply-to}}.")
     :contact-user/unsolicited-info        "Если это сообщение нежелательно, вы можете "
     :contact-user/block-user              "заблокировать все сообщения от {{user}}"
     :contact-user/block-all               "заблокировать все сообщения от всех пользователей OrgPad."

     :blog/rss-description                 "Последние новости и обновления OrgPad и технические обсуждения."

     :newsletter-2024-summer/subject       "Летнее обновление от OrgPad"
     :newsletter-2024-summer/preheader     "Узнайте о наших последних обновлениях приложения, новом блоге, улучшенных мерах конфиденциальности и многом другом!"
     :newsletter-2024-summer/introduction  "Мы вернулись с очередной рассылкой после годового перерыва!"
     :newsletter-2024-summer/heading       "В этом письме вы найдете:"
     :newsletter-2024-summer/body          (list [:li "Что нового в приложении с начала года?"]
                                                [:li "Что вы найдете в нашем новом блоге?"]
                                                [:li "Как мы заботимся о вашей конфиденциальности и безопасности ваших данных?"]
                                                [:li "Как мы обновили условия использования для вашего удобства?"]
                                                [:li "Зачем присоединяться к сообществу?"])
     :newsletter-2024-summer/button        "Читать рассылку"
     :newsletter-2024-summer/closing       "Ждем ваших идей!" }))