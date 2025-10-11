(ns orgpad.server.i18n.pt
  (:require [orgpad.common.i18n.dict.pt :as pt]
            [orgpad.common.company :as company]))

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  (merge
    pt/dict
    {:orgpage/untitled                        "um documento"
     :orgpage/copy                            "copiar"

     :permission/view                         "ler"
     :permission/edit                         "editar"

     :subscription/monthly                    "mês"
     :subscription/yearly                     "ano"

     :email/greeting                          "Prezado {{customer}},"
     :email/signature                         "Melhores desejos"
     :email/team                              "Pavel Klavík, Kamila Klavíková"
     :email/creators                          "Criadores do OrgPad"
     :email/footer                            (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                                (list [:a href-orgpad "https://orgpad.info"] ". Você não gosta desses e-mails? "
                                                      [:a href-unsubscribe "Cancelar inscrição"] "."))
     :email/support-info                      (fn [{:feedback/keys [url]}]
                                                (list "Se você encontrar algum problema, informe-nos usando o "
                                                      [:a {:href (str "{{domain}}" url)} "formulário dentro do aplicativo"]
                                                      " ou enviando um e-mail para " company/support-email-link "."))
     :email/or                                " ou "
     :email/customer                          "cliente"

     :verification/subject                    "Verifique sua conta do OrgPad"
     :verification/preheader                  "Bem-vindo(a) ao OrgPad. Verifique sua conta clicando no botão abaixo."
     :verification/heading                    "Verifique seu e-mail"
     :verification/body                       "Para verificar sua conta, clique no botão abaixo. Ao clicar no botão, você também concorda com os "
     :verification/terms-and-conditions       "Termos e Condições"
     :verification/button                     "Confirmar Endereço de E-mail"
     :verification/accidental-email           "Se você recebeu este e-mail por engano, por favor, exclua-o. Se você receber esses e-mails repetidamente, entre em contato conosco em "

     :password-reset/subject                  "Redefina sua senha do OrgPad"
     :password-reset/preheader                "Redefina sua senha do OrgPad clicando no botão abaixo."
     :password-reset/heading                  "Redefina sua senha do OrgPad"
     :password-reset/body                     "Clique no botão abaixo para redefinir sua senha. Ela é válida por 24 horas."
     :password-reset/button                   "Redefinir senha"
     :password-reset/accidental-email         "Se você não solicitou a redefinição de senha ou não precisa mais fazer a alteração, você não precisa fazer nada."

     :new-subscription/subject                "Confirmação de nova assinatura"
     :new-subscription/preheader              "Seu plano {{tier}} com o OrgPad está agora ativo. A assinatura será renovada automaticamente a cada {{period}}."
     :new-subscription/body                   "Seu plano {{tier}} com o OrgPad está agora ativo. Obrigado pelo seu pagamento!"
     :new-subscription/details                (fn [{:payment/keys [url]}]
                                                (list "Daqui para frente, a assinatura será renovada automaticamente a cada {{period}}. Seus recibos são armazenados automaticamente na "
                                                      [:a {:href (str "{{domain}}" url)} "seção de pagamentos"] " nas configurações do OrgPad."))

     :new-payment/subject                     "Pagamento efetuado com sucesso"
     :new-payment/preheader                   "Você renovou sua assinatura para o plano {{tier}}, válido até {{subscription-end}}."
     :new-payment/body                        (list "Você renovou com sucesso sua assinatura para o plano {{tier}}. Ele é válido até "
                                                    [:b "{{subscription-end}}"] ". Obrigado pelo seu pagamento!")
     :new-payment/button                      "Baixar recibo"

     :payment-failed/subject                  "Falha no pagamento da assinatura"
     :payment-failed/preheader                "Verifique se seu cartão é válido e tem fundos suficientes. Se os problemas persistirem, entre em contato conosco."
     :payment-failed/body                     (str "Ocorreu um erro no pagamento de sua assinatura do OrgPad."
                                                   " Verifique se seu cartão é válido e tem fundos suficientes.")
     :payment-failed/button                   "Atualizar método de pagamento"
     :payment-failed/grace-warning            (list "Sua assinatura atual está ativa até "
                                                    [:b "{{subscription-end}}"]
                                                    ". Se você não pagar a taxa de assinatura até essa data, sua conta será"
                                                    " rebaixada para o plano gratuito. Você ainda poderá acessar, editar, excluir e compartilhar seus dados.")

     :feedback/subject                        "Pergunta: {{title}}"
     :feedback/preheader                      "{{first-name}} {{last-name}} enviou uma pergunta {{title}}"
     :feedback/heading                        "{{first-name}} {{last-name}} ({{email}}) enviou uma pergunta {{title}}"

     :invitation/subject                      "Você está convidado(a) a {{action}} um documento no OrgPad"
     :invitation/preheader                    "{{user}} convidou você para {{action}} {{title}}. Clique no botão abaixo para abrir."
     :invitation/heading                      "{{user}} convidou você para {{action}} {{title}}"
     :invitation/body                         "OrgPad é uma plataforma para criar documentos visuais para uma Visão Geral. Clique no botão a seguir para aceitar o convite e abrir o documento."
     :invitation/button                       "Abrir Documento"
     :invitation/accidental-email             "Se você recebeu este e-mail por engano, por favor, exclua-o. Se você receber esses e-mails repetidamente, você pode "
     :invitation/block-user                   "bloquear convites de {{user}}"
     :invitation/block-all                    "bloquear todos os convites"

     :contact-user/subject                    "Você foi contactado(a) via OrgPad"
     :contact-user/preheader                  "Mensagem de {{user}}"
     :contact-user/heading                    "{{user}} ({{reply-to}}) está entrando em contato via OrgPad"
     :contact-user/body                       (str "Este e-mail é nosso, pois não compartilhamos seu endereço de e-mail com ninguém. Você pode responder à mensagem "
                                                   "respondendo a este e-mail ou enviando um e-mail para {{reply-to}}.")
     :contact-user/unsolicited-info           "Se a mensagem não for solicitada, você pode "
     :contact-user/block-user                 "bloquear todas as mensagens de {{user}}"
     :contact-user/block-all                  "bloquear todas as mensagens de todas as pessoas do OrgPad."

     :blog/rss-description                    "As últimas notícias e atualizações do OrgPad e discussões técnicas."

     :newsletter-2024-summer/subject          "Atualização de verão do OrgPad"
     :newsletter-2024-summer/preheader        "Saiba mais sobre nossas últimas atualizações de aplicativos, novo blog, medidas de privacidade aprimoradas e muito mais!"
     :newsletter-2024-summer/introduction     "Estamos de volta com outro boletim informativo após uma pausa de um ano!"
     :newsletter-2024-summer/heading          "Você encontrará neste boletim informativo:"
     :newsletter-2024-summer/body             (list [:li "O que há de novo no aplicativo desde o início do ano?"]
                                                    [:li "O que você encontrará em nosso novo blog?"]
                                                    [:li "Como cuidamos da sua privacidade e da segurança dos seus dados?"]
                                                    [:li "Como atualizamos os termos e condições para sua conveniência?"]
                                                    [:li "Por que participar da comunidade?"])
     :newsletter-2024-summer/button           "Ler boletim informativo"
     :newsletter-2024-summer/closing          "Aguardamos suas ideias!" }))