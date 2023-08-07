(ns orgpad.server.i18n.ptbr
  (:require [orgpad.common.i18n.dict.en :as en]
            [orgpad.server.i18n.en-admin :as en-admin]))

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  (merge
    en/dict
    en-admin/dict
    {:orgpage/untitled                        "um documento"
     :permission/view                         "ler"
     :permission/edit                         "editar"

     :subscription/monthly                    "mês"
     :subscription/yearly                     "ano"

     :tier/standard                           "Padrão"
     :tier/professional                       "Profissional"
     :tier/school                             "Escola"
     :tier/enterprise                         "Empresarial"
     :tier/unlimited                          "Ilimitado"

     :email/customer                          "cliente"
     :email/greeting                          "Prezado {{customer}},"
     :email/signature                         "Melhores desejos"
     :email/ceo                               "Vít Kalisz, CEO"
     :email/contact-us                        (fn [{:feedback/keys [url]}]
                                                  (list "Se você encontrar algum problema, informe-nos usando o "
                                                        [:a {:href (str "{{domain}}" url)} "formulário dentro do aplicativo"]
                                                        " ou enviando um e-mail para " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                                " ou "

     :invitation/subject                      "Você está convidado(a) a {{action}} um documento no OrgPad"
     :invitation/preheader                    "{{user}} convidou você para {{action}} {{title}}. Clique no botão abaixo para abrir."
     :invitation/heading                      "{{user}} convidou você para {{action}} {{title}}"
     :invitation/info                         "OrgPad é uma plataforma para criar documentos visuais para uma Visão Geral. Clique no botão a seguir para aceitar o convite e abrir o documento."
     :invitation/button                       "Abrir Documento"
     :invitation/accidental-email             "Se você recebeu este e-mail por engano, por favor, exclua-o. Se você receber esses e-mails repetidamente, você pode "
     :invitation/block-user                   "bloquear convites de {{user}}"
     :invitation/block-all                    "bloquear todos os convites"

     :june-newsletter-2023/subject            "Atualizações, Inspirações e Vitórias - a jornada do OrgPad"
     :june-newsletter-2023/preheader          (str "Revelando um mundo de inovação: Explore melhorias recentes, saiba sobre o que está por vir,"
                                                   " celebre algumas de nossas conquistas conosco e ganhe licenças gratuitas! Adentre o futuro com o nosso mais recente"
                                                   " boletim - Clique para abrir novos horizontes!")
     :june-newsletter-2023/introduction       (str "repleto de novas inspirações e atualizações é a edição de verão de nosso boletim."
                                                   " Na verdade... O verdadeiro boletim está escondido abaixo do botão a seguir. Mergulhe nele!")
     :june-newsletter-2023/button             "OK, estou curioso(a)!"
     :june-newsletter-2023/details            (str "Trabalhamos muito desde a edição de Natal, então temos muitas melhorias incríveis para mostrar."
                                                   " Além disso, vamos lhe dar uma visão do que planejamos para o verão. Mas a empolgação não"
                                                   " para por aí! Também temos uma oportunidade emocionante para você ganhar uma licença profissional gratuita válida por um ano."
                                                   " Clique no botão para reivindicar o seu prêmio.")
     :june-newsletter-2023/best-wishes        "Desejamos a você um feriado cheio de relaxamento e alegria, de toda a equipe do OrgPad."

     :footer/unsubscribe                      (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                                  (list [:a href-orgpad "https://orgpad.com"] ". Você não gosta desses e-mails? "
                                                        [:a href-unsubscribe "Cancelar inscrição"] "."))

     :orgpage/copy                            "copiar"

     :password-reset/subject                  "Redefina sua senha do OrgPad"
     :password-reset/preheader                "Redefina sua senha do OrgPad clicando no botão abaixo."
     :password-reset/heading                  "Redefina sua senha do OrgPad"
     :password-reset/text-1                   "Clique no botão abaixo para redefinir sua senha. Ela é válida por 24 horas."
     :password-reset/button                   "Redefinir senha"
     :password-reset/text-2                   "Se você não solicitou a redefinição de senha ou não precisa mais fazer a alteração, você não precisa fazer nada."

     :verification/subject                    "Verifique sua conta do OrgPad"
     :verification/preheader                  "Bem-vindo(a) ao OrgPad. Verifique sua conta clicando no botão abaixo."
     :verification/heading                    "Verifique seu e-mail"
     :verification/verify-account-info        "Para verificar sua conta, clique no botão abaixo. Ao clicar no botão, você também concorda com os "
     :verification/terms-and-conditions       "Termos e Condições"
     :verification/button                     "Confirmar Endereço de E-mail"
     :verification/received-by-mistake        "Se você recebeu este e-mail por engano, por favor, exclua-o. Se você receber esses e-mails repetidamente, entre em contato conosco em "
     :verification/support-email              "support@orgpad.com"

     :feedback/subject                        "Pergunta: {{title}}"
     :feedback/preheader                      "{{first-name}} {{last-name}} enviou uma pergunta {{title}}"
     :feedback/heading                        "{{first-name}} {{last-name}} ({{email}}) enviou uma pergunta {{title}}"

     :newsletter/subject                      "Boletim do OrgPad {{newsletter/date}}"
     :newsletter/preheader                    "Boletim do OrgPad para {{newsletter/date}}. Clique no link abaixo."
     :newsletter/button                       "Abrir boletim"
     :newsletter/text                         "Este boletim é enviado a você porque você se inscreveu para recebê-lo. Se você recebeu este e-mail por engano ou não deseja mais recebê-lo, "
     :newsletter/unsubscribe                  "cancele a inscrição usando este link"

     :conference-invitation-2022/subject      "Convite para a Conferência OrgPad em 19 de novembro de 2022"
     :conference-invitation-2022/preheader    (str "Em 19 de novembro, às 9h30, começa a segunda Conferência OrgPad em Praga, Smíchov,"
                                                   " e você não deve perder! É um encontro da comunidade da qual você faz parte."
                                                   " Você pode esperar oito palestras de 20 minutos, pessoas interessantes, ótimos lanches"
                                                   " e uma competição. Os palestrantes são: Barbora Jeřábková, Janek Wagner, Radko Sáblík, Tomáš Baránek,"
                                                   " Ondřej Lněnička, Václav Maněna e Petra Plachá")
     :conference-invitation-2022/introduction (str "Gostaria de convidá-lo para a Conferência OrgPad, que ocorrerá no sábado, 19 de novembro de 2022,"
                                                   " a partir das 9h30 nas belas instalações da Next Zone, Preslova 25, Praga 5-Smíchov.")
     :conference-invitation-2022/info         (str "Venha e conheça outros membros da comunidade! Você pode esperar palestras interessantes e lanches saborosos."
                                                   " A entrada é gratuita. As palestras serão realizadas em língua tcheca.")
     :conference-invitation-2022/button       "Registrar-se para a conferência"
     :conference-invitation-2022/program      (list "Programa da conferência:"
                                                    [:ul {:style {:list-style-type "none"
                                                                  :margin          0
                                                                  :padding         0}}
                                                     [:li "09h30 - 10h00 Recepção"]
                                                     [:li "10h10 - 10h40 Discurso de abertura e palestra principal pelos autores do OrgPad"]
                                                     [:li "10h45 - 11h05 Baruš Jeřábková, \"Jen\" aplikace"]
                                                     [:li "11h30 - 11h50 Janek Wagner, České školství očima ajťáka aneb Jsem z toho janek"]
                                                     [:li "12h00 - 12h20 Radko Sáblík, Vzdělávání pro 21. století"]
                                                     [:li "13h00 - 13h20 Tomáš Baránek, Příprava autorské knihy a online kurzu v OrgPadu"]
                                                     [:li "13h30 - 13h50 Ondřej Lněnička, Jak jsme se stali školou na OrgPadu závislou"]
                                                     [:li "14h10 - 14h30 Václav Maněna, OrgPad v profesním i osobním životě učitele"]
                                                     [:li "14h40 - 15h00 Petra Plachá, My, ORGanizovaní proPADlí"]
                                                     [:li "15h00 - 15h30 Microfone Aberto (slots de 3 - 5 minutos)"]
                                                     [:li "15h30 - 17h00 Anúncio dos vencedores da competição, discussão aberta e programa de acompanhamento"]])
     :conference-invitation-2022/best-wishes2 "Tudo de bom"

     :contact-user/subject                    "Você foi contatado(a) via OrgPad"
     :contact-user/preheader                  "Mensagem de {{user}}"
     :contact-user/heading                    "{{user}} ({{reply-to}}) está entrando em contato via OrgPad"
     :contact-user/common-info                (str "Este e-mail é nosso, pois não compartilhamos seu endereço de e-mail com ninguém. Você pode responder à mensagem "
                                                   "respondendo a este e-mail ou enviando um e-mail para {{reply-to}}.")
     :contact-user/post-message-info          "Se a mensagem não for solicitada, você pode "
     :contact-user/block-user                 "bloquear todas as mensagens de {{user}}"
     :contact-user/block-all                  "bloquear todas as mensagens de todas as pessoas do OrgPad."

     :new-payment/subject                     "Pagamento efetuado com sucesso"
     :new-payment/preheader                   "Você renovou sua assinatura para o plano {{tier}}, válido até {{subscription-end}}."
     :new-payment/common-info                 (list "Você renovou com sucesso sua assinatura para o plano {{tier}}. Ele é válido até "
                                                    [:b "{{subscription-end}}"] ". Obrigado pelo seu pagamento!")
     :new-payment/download-receipt            "Baixar recibo"

     :new-subscription/subject                "Confirmação de nova assinatura"
     :new-subscription/preheader              "Seu plano {{tier}} com o OrgPad está agora ativo. A assinatura será renovada automaticamente a cada {{period}}."
     :new-subscription/active-tier            "Seu plano {{tier}} com o OrgPad está agora ativo. Obrigado pelo seu pagamento!"
     :new-subscription/payment-info           (fn [{:payment/keys [url]}]
                                                  (list "Daqui para frente, a assinatura será renovada automaticamente a cada {{period}}. Seus recibos são armazenados automaticamente na "
                                                        [:a {:href (str "{{domain}}" url)} "seção de pagamentos"] " nas configurações do OrgPad."))

     :payment-failed/subject                  "Falha no pagamento da assinatura"
     :payment-failed/preheader                "Verifique se seu cartão é válido e tem fundos suficientes. Se os problemas persistirem, entre em contato conosco."
     :payment-failed/error                    (str "Ocorreu um erro no pagamento de sua assinatura do OrgPad."
                                                   " Verifique se seu cartão é válido e tem fundos suficientes.")
     :payment-failed/payment                  "Atualizar método de pagamento"
     :payment-failed/current-subscription     (list "Sua assinatura atual está ativa até "
                                                    [:b "{{subscription-end}}"]
                                                    ". Se você não pagar a taxa de assinatura até essa data, sua conta será"
                                                    " rebaixada para o plano gratuito. Você ainda poderá acessar, editar, excluir e compartilhar seus dados.")

     :reminder/subject                        "Desconto OrgPad, novidades e exemplos"
     :reminder/preheader                      "O que melhorou no OrgPad em dezembro de 2021 e exemplos de como ele pode ser usado."
     :reminder/thank-you                      "Em primeiro lugar, gostaria de agradecer por criar uma conta no OrgPad."
     :reminder/phunt-launch                   (str "Dezembro é um mês especial cheio de surpresas. "
                                                   "A maior surpresa do mês passado veio na Véspera de Natal. "
                                                   "O Papai Noel não foi o responsável, o Product Hunt foi. "
                                                   "Pelo menos eu acho. O OrgPad foi um dos cinco melhores produtos "
                                                   "no Product Hunt naquele dia. Graças a isso, ficamos ocupados no Natal respondendo e-mails das pessoas e"
                                                   " respondendo perguntas nas redes sociais e compartilhando o OrgPad ainda mais.")
     :reminder/button-info                    (str "Para tornar seu início no OrgPad mais fácil, preparei alguns exemplos de como usar o OrgPad. "
                                                   "Clique no botão abaixo para explorá-los. Também adicionei algumas novidades sobre o OrgPad.")
     :reminder/button                         "Novidades e exemplos do OrgPad"
     :reminder/phunt-promo-code               (list "Gostaria também de lembrar você do código promocional "
                                                    [:b "PHUNT21 para 50% de desconto."]
                                                    " Você pode nos ajudar a divulgar o OrgPad nas redes sociais. "
                                                    "Um único tweet, postagem ou menção seria ótimo.")

     :christmas-newsletter-2022/subject       "Aumento de preços, reflexão, perspectivas, desejos"
     :christmas-newsletter-2022/preheader     (str "Até 1º de fevereiro, você pode fazer seu pedido pelo preço atual. Resumo das novas funcionalidades do OrgPad"
                                                   " e eventos, gravações de vídeo da conferência, Microsoft Roadshow, informações para escolas,"
                                                   " manutenção programada dos sistemas na noite de 24 para 25 de dezembro.")
     :christmas-newsletter-2022/introduction  (str "a aproximação das festas é um momento de reflexão. Por isso, olhamos para trás no que aconteceu no OrgPad no ano passado"
                                                   " e começamos a pensar no ano que está por vir.")
     :christmas-newsletter-2022/list-info     "Um ano depois, resultou em outro boletim, no qual tocamos nos seguintes tópicos:"
     :christmas-newsletter-2022/list          (list [:li "O que mudou no OrgPad no último ano?"]
                                                    [:li "Recapitulação da conferência do OrgPad."]
                                                    [:li "Novos preços a partir de 1º de fevereiro de 2023."]
                                                    [:li "Informações para escolas e nossa participação na Microsoft Roadshow."]
                                                    [:li "Manutenção do sistema e período de inatividade na Véspera de Natal para o Dia de Natal (24 a 25 de dezembro)."])
     :christmas-newsletter-2022/button        "Nova lista de preços e detalhes"
     :christmas-newsletter-2022/best-wishes   "Desejamos a você um feriado tranquilo"}))
