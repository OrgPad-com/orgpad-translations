(ns orgpad.server.i18n.ru
  (:require [orgpad.common.i18n.dict.ru :as ru]))

(def dict
  "A dictionary map from keywords to the corresponding Russian texts."
  (merge
    ru/dict
    {:orgpage/untitled                     "документ"
     :permission/view                      "читать"
     :permission/edit                      "редактировать"

     :subscription/monthly                 "месячная"
     :subscription/yearly                  "годовая"

     :tier/standard                        "Стандарт"
     :tier/professional                    "Профессионал"
     :tier/school                          "Школа"
     :tier/enterprise                      "Бизнес"
     :tier/unlimited                       "Безлимит"

     :email/customer                       "Клиент"
     :email/greeting                       "Дорогой {{customer}},"
     :email/signature                      "С наилучшими пожеланиями"
     :email/ceo                            "Vít Kalisz, CEO"
     :email/contact-us                     (fn [{:feedback/keys [url]}]
                                             (list "В случае возникновения каких-либо проблем, пожалуйста, сообщите нам "
                                                   [:a {:href (str "{{domain}}" url)} "через форму"]
                                                   " или написав на " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                             " или "

     :invitation/subject                   "Вы приглашаетесь {{action}} документ в OrgPad"
     :invitation/preheader                 "{{user}} приглашает вас {{action}} {{title}}. Нажмите кнопку ниже для открытия."
     :invitation/heading                   "{{user}} приглашает вас {{action}} {{title}}"
     :invitation/info                      "OrgPad - это платформа для создания визуальных документов для Big Picture. Нажимая кнопку ниже, вы принимаете приглашение и открываете документ."
     :invitation/button                    "Открыть Документ"
     :invitation/accidental-email          "Если вы получили это письмо по ошибке, пожалуйста, удалите его. Если вы получите эти письма повторно, вы можете "
     :invitation/block-user                "блокировать приглашения от {{user}}"
     :invitation/block-all                 "блокировать все приглашения"

     :footer/unsubscribe                   (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                             (list [:a href-orgpad "https://orgpad.com"] ". Вам не нравятся эти письма? "
                                                   [:a href-unsubscribe "Отписаться"] "."))

     :orgpage/copy                         "Копировать"

     :password-reset/subject               "Сбросить ваш пароль к OrgPad"
     :password-reset/preheader             "Сбросить ваш пароль к OrgPad, нажав кнопку ниже."
     :password-reset/heading               "Сбросить ваш пароль к OrgPad"
     :password-reset/text-1                "Пожалуйста, нажмите кнопку ниже, чтобы сбросить ваш пароль. Действительно 24 часа."
     :password-reset/button                "Сбросить пароль"
     :password-reset/text-2                "Если вы не пытались сбросить пароль, или в этом больше нет необходимости, Вам не нужно ничего делать."

     :verification/subject                 "Подтвердите ваш аккаунт в OrgPad"
     :verification/preheader               "Добро пожаловать в OrgPad. Пожалуйста, подтвердите ваш аккаунт, нажав кнопку ниже."
     :verification/heading                 "Подтвердите адрес вашей электронной почты"
     :verification/verify-account-info     "Чтобы подтвердить ваш аккаунт, пожалуйста, нажмите кнопку ниже. Нажимая кнопку, вы в дальнейшем соглашаетесь с "
     :verification/terms-and-conditions    "Условиями и Положениями Orgpad"
     :verification/button                  "Подтвердить адрес электронной почты"
     :verification/received-by-mistake     "Если вы получили это письмо по ошибке, пожалуйста, удалите его. Если вы получите эти письма повторно, пожалуйста, сообщите нам по адресу "
     :verification/support-email           "support@orgpad.com"

     :feedback/subject                     "Вопрос: {{title}}"
     :feedback/preheader                   "{{first-name}} {{last-name}} прислал(-а) вопрос {{title}}"
     :feedback/heading                     "{{first-name}} {{last-name}} ({{email}}) прислал(-а) вопрос {{title}}"

     :newsletter/subject                   "Новостная рассылка OrgPad {newsletter/date}"
     :newsletter/preheader                 "Для получения новостной рассылки {newsletter/date}. нажмите ссылку ниже."
     :newsletter/button                    "Открыть новостную рассылку "
     :newsletter/text                      "Эта новостная рассылка получена вами, поскольку вы подписались на нее. Если вы получили это письмо по ошибке или не хотите более получать их, "
     :newsletter/unsubscribe               "отпишитесь, используя эту ссылку"

     :contact-user/subject                 "С Вами связались через OrgPad"
     :contact-user/preheader               "Сообщение от {{user}}"
     :contact-user/heading                 "{{user}} ({{reply-to}}) связывается с Вами через OrgPad"
     :contact-user/common-info             (str "Это электронное письмо от нас, потому что мы никому не передаем ваш адрес электронной почты. вы можете ответить на сообщение, "
                                                "ответив на это сообщение или написав электронное письмо на {{reply-to}}.")
     :contact-user/post-message-info       "Если это сообщение нежелательно, вы можете "
     :contact-user/block-user              "заблокировать все сообщения от {{user}}"
     :contact-user/block-all               "заблокировать все сообщения от всех пользователей OrgPad."

     :new-payment/subject                  "Платеж прошел успешно"
     :new-payment/preheader                "Вы продлили вашу подписку на план {{tier}}, действительно до {{subscription-end}}."
     :new-payment/common-info              (list "Вы успешно продлили вашу подписку на план {{tier}}. Она действительна до "
                                                 [:b "{{subscription-end}}"] ". Благодарим за оплату!")
     :new-payment/download-receipt         "Загрузить квитанцию"

     :new-subscription/subject             "Подтверждение новой подписки"
     :new-subscription/preheader           "Ваш план {{tier}} подписки на OrgPad активен. Подписка будет обновляться автоматически через {{period}}."
     :new-subscription/active-tier         "Ваш план {{tier}} подписки на OrgPad активен. Благодарим за оплату!"
     :new-subscription/payment-info        (fn [{:payment/keys [url]}]
                                             (list "В дальнейшем подписка будет продлеваться автоматически каждый {{period}}. Ваши квитанции автоматически сохраняются в "
                                                   [:a {:href (str "{{domain}}" url)} "разделе Платежи"] " в настройках OrgPad."))

     :payment-failed/subject               "Не удалось оплатить подписку"
     :payment-failed/preheader             "Пожалуйста, убедитесь, что ваша карта действительна, и на ней достаточно средств. Если проблемы останутся, свяжитесь с нами."
     :payment-failed/error                 (str "Произошла ошибка при оплате подписки на OrgPad."
                                                " Пожалуйста, убедитесь, что ваша карта действительна, и на ней достаточно средств.")
     :payment-failed/payment               "Обновить способ оплаты"
     :payment-failed/current-subscription  (list "Ваша текущая подписка активна до "
                                                 [:b "{{subscription-end}}"]
                                                 ". Если вы не оплатите подписку до этой даты, ваша учетная запись будет"
                                                 " понижена до бесплатного плана. Вы по-прежнему сможете получать доступ, редактировать, удалять и делиться своими данными.")

     :admin-trial-start/subject            "Новый пробный период {{tier}} начался ({{monetary-value}})"
     :admin-free-license-activated/subject "Бесплатная лицензия {{tier}} активирована ({{monetary-value}})"
     :admin-gift-coupon-activated/subject  "Подарочный купон на лицензию {{tier}} активирован ({{monetary-value}})"
     :admin-subscription-start/subject     "Новый {{period}} подписки {{tier}} начался ({{monetary-value}})"
     :admin-subscription-failed/subject    "Не удалось продлить подписку {{tier}} на {{period}} ({{monetary-value}})"
     :admin-subscription-end/subject       "Продление {{period}} подписки {{tier}} отклонено ({{monetary-value}})"
     :admin-subscription-renewed/subject   "Существующий {{period}} подписки {{tier}} продлен ({{monetary-value}})"

     :reminder/subject                     "Скидки на OrgPad, новости и примеры использования"
     :reminder/preheader                   "Что улучшено в OrgPad в декабре 2021 и примеры использования."
     :reminder/thank-you                   "Прежде всего, я хотел бы поблагодарить вас за создание аккаунта в OrgPad."
     :reminder/phunt-launch                (str "Декабрь - месяц, полный сюрпризов. "
                                                "Самый большой сюрприз прошлого месяца случился в канун Рождества. "
                                                "И случилось это благодаря не Санте, а  Product Hunt. "
                                                "По крайней мере, я так думаю. Сейчас OrgPad является одним из пяти топовых продуктов "
                                                "на Product Hunt. Благодаря этому мы были заняты на "
                                                "Рождество ответами на электронные письма и "
                                                "вопросы в социальных сетях и дальнейшим распространением OrgPad.")
     :reminder/button-info                 (str "Чтобы облегчить вам начало использования OrgPad, я подготовил несколько примеров. "
                                                "Для их изучения нажмите кнопку ниже. Я также добавил несколько новостей об OrgPad.")
     :reminder/button                      "Новости OrgPad и примеры использования"
     :reminder/phunt-promo-code            (list "Я также хотел бы напомнить вам о "
                                                 [:b "промо-коде PHUNT21 на 50% скидку."]
                                                 " Вы можете помочь нам распространением в социальных сетях информации об OrgPad. "
                                                 "Приветствуются отдельные твиты, посты или же упоминания.")}))
