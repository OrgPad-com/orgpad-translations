(ns orgpad.client.i18n.dicts.pt
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.pt :as pt]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  "A dictionary map from keywords to the corresponding Portuguese texts."
  (merge
    pt/dict
    {:address/company                                 "Nome da empresa"
     :address/ico                                     "VAT"
     :address/street                                  "Rua"
     :address/street-number                           "Número"
     :address/postal-code                             "Código postal"
     :address/city                                    "Cidade"
     :address/country                                 "País"

     :administration/page-title                       "Administração - OrgPad"

     :attachments/allows-access-to-file               "Permite acesso a este arquivo."
     :attachments/allows-access-to-image              "Permite acesso a esta imagem."
     :attachments/no-preview                          "Pré-visualização indisponível."
     :attachments/all-files                           "Todos os arquivos"
     :attachments/used-files                          "Arquivos na OrgPage"
     :attachments/unused-files                        "Arquivos não utilizados"
     :attachments/all-images                          "Todas as imagens"
     :attachments/used-images                         "Imagens na OrgPage"
     :attachments/unused-images                       "Imagens não utilizadas"
     :attachments/uploading-files                     "Enviando arquivos …"
     :attachments/previous-attachment                 "Arquivo ou imagem anterior"
     :attachments/next-attachment                     "Próximo arquivo ou imagem"
     :attachments/display-using-microsoft-365         "Exibir usando o Microsoft 365"
     :attachments/edit-filename                       "Editar nome"
     :attachments/title-order                         "Alfabeticamente por título"
     :attachments/upload-order                        "Mais recentes no topo"
     :attachments/size-order                          "Maior no topo"
     :attachments/split-used-unused                   "Agrupar por presença em OrgPage"
     :attachments/search                              "Pesquisar"
     :attachments/ordering                            "Ordenação"
     :attachments/new-version                         "Nova versão"
     :attachments/preserve-old-version                "Manter versão antiga"
     :attachments/in-other-orgpages                   "Substituir em outras OrgPages:"

     :button/back                                     "Voltar"
     :button/cancel                                   "Cancelar"
     :button/close                                    "Fechar"
     :button/comment                                  "Comentar"
     :button/continue                                 "Continuar"
     :button/copied                                   "Copiado"
     :button/copy                                     "Copiar"
     :button/copy-link                                "Copiar link"
     :button/create                                   "Criar"
     :button/create-tooltip                           "Criar (CTRL+ENTER)"
     :button/delete                                   "Deletar"
     :button/delete-selected                          "Deletar seleção"
     :button/documentation                            "Documentação"
     :button/download                                 "Baixar"
     :button/download-all                             "Baixar tudo"
     :button/drop                                     "Soltar"
     :button/edit                                     "Editar"
     :button/import                                   "Importar"
     :button/insert                                   "Inserir"
     :button/login                                    "Fazer login"
     :button/logout                                   "Sair"
     :button/publish                                  "Publicar"
     :button/read                                     "Ler"
     :button/register                                 "Registrar"
     :button/register-to-save                         "Registre-se para salvar"
     :button/remove                                   "Remover"
     :button/reset                                    "Redefinir"
     :button/save                                     "Salvar mudanças"
     :button/save-tooltip                             "Salvar mudanças (CTRL+ENTER)"
     :button/upload                                   "Enviar"
     :button/upload-from-computer                     "Enviar do computador"
     :button/send                                     "Enviar"
     :button/present                                  "Apresentar"
     :button/present-tooltip                          "Iniciar apresentação (F5)"
     :button/share                                    "Compartilhar"
     :button/start                                    "Iniciar"
     :button/exit                                     "Fechar"
     :button/show-password                            "Exibir"
     :button/hide-password                            "Ocultar"

     :checkout/currency                               "Moeda"
     :checkout/monthly                                "mensal"
     :checkout/yearly                                 "anual(economiza 15 %)"
     :checkout/failed-to-init                         "Alguma coisa de errado aconteceu durante carregamento do site de pagamento."
     :checkout/upgrade-plan                           "Aprimorar seu Plano"
     :checkout/professional-plan                      "Plano Profissional"
     :checkout/school-plan                            "Plano Escola"
     :checkout/enterprise-plan                        "Plano Empresa"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Escola"] " ou "
                                                         [:a.link-button {:href enterprise-url} "empresa"] "? Entre em contato conosco para uma oferta personalizada."])
     :checkout/pay-with-credit-card                   "Pagar com cartão de crédito"
     :checkout/pay-with-wire-transfer                 "Pagar por transferência bancária"
     :checkout/promo-code                             "Código promocional"
     :checkout/try-for-free                           "Experimente grátis"
     :checkout/activate-now                           "Ativar agora"
     :checkout/continue-for-free                      "Continuar gratuitamente"

     :code-lang/none                                  "Nenhum"
     :code-lang/multiple                              "Múltiplos"

     :dashboard/confirm-delete                        [:<> [:b "Excluir"] " permanentemente esta OrgPage?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Fazer login"] " ou "
                                                         [:a {:href register-url} "criar uma conta"]
                                                         " para criar novas OrgPages."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "A assinatura da sua escola " name " expirou em " subscription-expired ". "
                                                         "Para renovação, entre em contato com a administração. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Mais informações"] " sobre 95% de desconto para escolas."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Obtenha o OrgPad para sua escola sem limites com 95% de desconto. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Mais informações."]])
     :dashboard/owned-orgpages                        "Minhas OrgPages"
     :dashboard/public-orgpages                       "OrgPages Publicadas"
     :dashboard/shared-orgpages                       "OrgPages compartilhadas comigo"
     :dashboard/usergroup-orgpages                    "OrgPages de {usergroup/name}"
     :dashboard/help-or-inspiration-button            "Aqui está!"
     :dashboard/new-domain                            [:<> "Use o novo domínio " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Mais informações em OrgPage " [:a {:href "https://orgpad.info/s/new-domain"} "Mudanças no OrgPad e novo domínio"] "."]

     :dashboard-filter/filter                         "Filtrar OrgPages"
     :dashboard-filter/ordering                       "Ordenar OrgPages"
     :dashboard-filter/filter-and-ordering            "Filtrar e ordenar OrgPages"
     :dashboard-filter/title                          "Filtrar e ordenar OrgPages exibidas"
     :dashboard-filter/ordering-label                 "Ordenação de OrgPages"
     :dashboard-filter/title-order                    "Em ordem alfabética por título"
     :dashboard-filter/creation-time-order            "Mais recentes no topo"
     :dashboard-filter/last-modified-order            "Última modificação no topo"
     :dashboard-filter/most-viewed-order              "Mais visualizadas no topo"
     :dashboard-filter/search-tags                    "Pesquisar tags"

     :embedding-code/code                             "Código"
     :embedding-code/description                      "Incorporar a OrgPage em um site ou outra aplicação."

     :error/orgpage-access-denied                     "Você não tem acesso a esta OrgPage. Tente fazer login."
     :error/usergroup-access-denied                   "Permissões para editar o grupo negadas."
     :error/administration-access                     "Acesso à administração negado."
     :error/creation-unauthorized                     "Faça login para criar OrgPages."
     :error/deleting-denied                           "Exclusão da OrgPage negada."
     :error/email-already-used                        "E-mail já em uso."
     :error/email-not-registered                      "Nenhuma conta com este e-mail."
     :error/email-missing-mx-record                   "Nenhum servidor de e-mail encontrado neste domínio."
     :error/email-invalid                             "E-mail inválido."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "OrgPage incorreta" (when id " {orgpage/id}")
                                                             ". Link copiado erroneamente?"))
     :error/incorrect-link                            "Link incorreto. Faça login ou abra o link correto."
     :error/incorrect-password                        "Senha incorreta."
     :error/incorrect-profile-id                      "Link de perfil incorreto. Link copiado erroneamente?"
     :error/lost-permission                           "Acesso a esta OrgPage perdido."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "E-mails sem conta: " emails))
     :error/name-already-used                         "Nome já em uso"
     :error/name-not-valid                            "Use pelo menos 5 caracteres"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "A OrgPage " (when title "“{orgpage/title}”") " foi removida."))
     :error/owner-of-orgpage                          "A pessoa já é proprietária desta OrgPage."
     :error/profile-not-found                         "Perfil não encontrado."
     :error/unknown-error                             "Erro desconhecido, tente novamente."
     :error/unknown-id                                "OrgPage desconhecida."
     :error/unknown-login-or-email                    "E-mail ou login de equipe desconhecido."
     :error/unknown-usergroup                         "A equipe foi excluída"
     :error/upload-failed                             "Falha ao enviar a OrgPage: \"{orgpage/title}\""

     :export/show                                     "Exportar OrgPage"
     :export/title                                    "Exportar {orgpage/title}"
     :export/info                                     "Escolha o formato no qual esta OrgPage será exportada."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " formato usado pelo OrgPad"]
     :export/html                                     "Um arquivo HTML linear"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " formato"]
     :export/generate                                 "Gerar exportação"

     :feedback/ask-question                           "Fazer uma pergunta"
     :feedback/hide-button                            "Ocultar botão permanentemente"
     :feedback/dialog-title                           "Contatar os Desenvolvedores do OrgPad"
     :feedback/description                            [:<> "Se você precisar de ajuda ou tiver algum problema, por favor nos avise - "
                                                       [:b "os desenvolvedores do OrgPad"] ". "
                                                       "Além disso, estamos abertos a qualquer ideia de melhoria. "
                                                       "Responderemos via e-mail o mais breve possível."]
     :feedback/languages                              "Você pode nos escrever em inglês, tcheco e alemão."
     :feedback/contact-when-problem-persists          [:<> "Se o problema persistir, entre em contato conosco em "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Transferência bancária"
                                                             (when currency
                                                               (str " em " (name currency))) " para "
                                                             "plano"
                                                             (if (= tier "standard")
                                                               " Padrão"
                                                               " Profissional")
                                                             " anual"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Informe-nos seu " [:b "endereço de cobrança"] " e quaisquer informações adicionais para a fatura."
                                                         " Entraremos em contato em breve através do seu endereço de e-mail " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Quero comprar um plano para a minha " (case org-type
                                                                                                      :feedback/school-plan "escola"
                                                                                                      :feedback/enterprise-plan "empresa"
                                                                                                      "organização")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Através deste formulário você entrará em contato com um representante da OrgPad s.r.o."
                                                         " Entraremos em contato em breve através do seu número de telefone ou seu endereço de e-mail " email
                                                         ". Alternativamente, você pode nos ligar em "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Atualizar minha assinatura para o plano Profissional"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Informe como devemos alterar sua assinatura existente e quaisquer informações adicionais."
                                                         " Entraremos em contato em breve através do seu endereço de e-mail " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Alterar meu período de faturamento para " (if (= period "yearly")
                                                                                                          "anual"
                                                                                                          "mensal")))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "A mudança ocorrerá após o término do período de faturamento atual."
                                                         " Existe um desconto de 15% para faturamento anual."
                                                         " Entraremos em contato em breve através do seu endereço de e-mail " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "Nome da Escola"
                                                               :feedback/enterprise-plan "Nome da Empresa"
                                                               "Nome da Organização")))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Posição dentro da " (case org-type
                                                                                    :feedback/school-plan "escola"
                                                                                    :feedback/enterprise-plan "empresa"
                                                                                    "organização")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str "Website da " (case org-type
                                                                             :feedback/school-plan "Escola"
                                                                             :feedback/enterprise-plan "Empresa"
                                                                             "Organização")))

     :fragment/fragment                               "Localização"
     :fragment/text-id                                "ID"
     :fragment/title                                  "Título"
     :fragment/create                                 "Criar localização"
     :fragment/create-tooltip                         "TAB; mantenha pressionada a tecla SHIFT para copiar a localização selecionada"
     :fragment/remove                                 "Remover localização"
     :fragment/share                                  "Copiar link para esta localização"
     :fragment/text-id-required                       "ID obrigatório."
     :fragment/text-id-already-used                   "ID já está em uso."
     :fragment/closed-books                           "Células fechadas; CTRL+clique para selecionar"
     :fragment/hidden-books                           "Células ocultas; CTRL+clique para selecionar"
     :fragment/opened-pages                           "Páginas abertas; CTRL+clique para selecionar"
     :fragment/focused-books                          "Células visíveis na câmera; CTRL+clique para selecionar"
     :fragment/shown-books                            "Células reveladas; CTRL+clique para selecionar"

     :info/uploading-attachments                      [:i18n/plural "Enviando {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "arquivos" "arquivo" "arquivos"]}]
     :info/uploading-images                           [:i18n/plural "Enviando {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "imagens" "imagem" "imagens"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Falha ao enviar {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "imagens" "imagem" "imagens"]}]
                                                          "Falha ao enviar pelo menos uma imagem."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} Youtube {info/num-youtubes} não encontrado."
                                                       {:info/num-youtubes [:info/count "vídeos" "vídeo" "vídeos"]}]
     :info/uploading-attachments-failed               "Falha ao enviar arquivos."
     :info/presentation-link-copied                   "O link para esta apresentação foi copiado."
     :info/max-orgpages-exceeded                      "O proprietário desta OrgPage não pode criar uma OrgPage adicional."
     :info/storage-exceeded                           "O proprietário desta OrgPage não possui {upload/total-size} restantes para enviar esses arquivos."
     :info/attachments-too-large                      (str "Não é possível enviar {upload/total-size} em um único envio."
                                                           " O tamanho máximo de todos os anexos enviados é de 500 MB.")
     :info/drop-info                                  "Solte em qualquer célula ou na área cinza para criar uma nova célula."
     :info/audio-not-allowed                          "Reprodução de áudio bloqueada. Clique no botão de reprodução."
     :info/audio-not-supported                        "Formato de áudio não suportado."

     :import/another-format                           [:<> "Se você deseja importar seus dados existentes em outro formato, entre em contato conosco em "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Importar seus dados"
     :import/google-docs                              "Para inserir dados do Microsoft Office ou Google Docs, simplesmente cole-os em uma OrgPage."
     :import/supported-formats                        "Agora nós suportamos os seguintes formatos:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exportado como arquivo .vsdx."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " arquivo."]

     :ios/install-info                                "Instale o aplicativo OrgPad"
     :ios/share-button                                "1. Abra"
     :ios/add-to-home-screen                          "2. Toque"

     :lang/cs                                         "Tcheco"
     :lang/de                                         "Alemão"
     :lang/en                                         "Inglês"
     :lang/es                                         "Espanhol"
     :lang/fr                                         "Francês"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polonês"
     :lang/ru                                         "Russo"
     :lang/uk                                         "Ucraniano"

     :lang-select/tooltip                             "Idioma do aplicativo (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "Não tem o seu idioma? Ajude-nos, "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "traduzindo o OrgPad"] "."]

     :limit/of                                        " de "
     :limit/orgpages                                  " OrgPages"
     :limit/people                                    " pessoas"
     :limit/teams                                     " equipes"
     :limit/team-members                              " membros"
     :limit/orgpages-tooltip                          (str "Na categoria Gratuita, o número de OrgPages é limitado."
                                                           " Atualize seu plano para criar mais OrgPages.")
     :limit/shares-tooltip                            (str "O número de pessoas com as quais você pode compartilhar diretamente esta OrgPage é limitado."
                                                           " Atualize para o plano Profissional para compartilhar com um número ilimitado de pessoas.")
     :limit/teams-tooltip                             (str "Na categoria Padrão, o número de equipes próprias é limitado."
                                                           " Atualize para o plano Profissional para criar equipes ilimitadas.")
     :limit/teams-members-tooltip                     (str "Na categoria Padrão, cada equipe tem um número limitado de membros."
                                                           " Atualize para o plano Profissional para criar equipes ilimitadas.")
     :limit/attachments-size                          (str "O tamanho total de todos os arquivos e imagens enviados é limitado"
                                                           " e pode ser aumentado através da atualização do plano.")
     :limit/attachments-size-clickable                (str "O tamanho total de todos os arquivos e imagens enviados é limitado."
                                                           " Clique para aumentar seu limite através da atualização do plano.")
     :limit/attachments-size-try-out                  (str "O tamanho total de todos os arquivos e imagens enviados é limitado."
                                                           " Para aumentar seu limite para 100 MB, clique para criar uma conta.")

     :limits/max-orgpages                             "documentos"
     :limits/max-storage                              "armazenamento"
     :limits/max-teams                                "equipes"
     :limits/of                                       " de"
     :limits/max-team-members                         "membros"
     :limits/priority-support                         "suporte prioritário"

     :link-panel/flip                                 "Inverter a direção"
     :link-panel/insert-unit-in-middle                "Inserir uma célula no meio"
     :link-panel/delete                               "Excluir o link"
     :link-panel/change-link-style                    "Alterar o estilo deste link; pressione SHIFT para definir o atual, pressione CTRL para copiar para o padrão"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Calculando tamanhos de todas as células, " [:span#autoresize-num-units num-units] " restantes …"])
     :loading/initial-layout                          "Melhorando o layout inicial …"
     :loading/restoring-opened-pages                  "Restaurando a posição das páginas abertas …"
     :loading/getting-orgpage                         "Baixando uma OrgPage do servidor …"
     :loading/getting-dashboard                       "Baixando a lista de OrgPages disponíveis do servidor …"
     :loading/getting-website                         "Baixando um site do servidor …"
     :loading/getting-blog                            "Baixando o blog do servidor …"
     :loading/uploading-orgpage                       "Enviando uma OrgPage para o servidor …"
     :loading/ws-init                                 "Configurando a conexão com o servidor …"
     :loading/ws-closed                               "Conexão com o servidor fechada, tentando reconectar. Se o problema persistir, recarregue a página."
     :loading/administration                          "Carregando dados de administração …"
     :loading/profile                                 "Carregando perfil …"
     :loading/style                                   "Carregando estilos …"
     :loading/start-trial                             "Iniciando assinatura de teste de 7 dias..."
     :loading/uploading-attachments                   "Enviando anexos para o servidor …"

     :login/continue-with-email                       "Continuar com e-mail"
     :login/continue-with-facebook                    "Continuar com o Facebook"
     :login/continue-with-google                      "Continuar com o Google"
     :login/continue-with-microsoft                   "Continuar com o Microsoft"
     :login/continue-with-cuni                        "Continuar com o Charles University"
     :login/email-sent                                "E-mail enviado. Clique no link no e-mail."
     :login/forgotten-password                        "Senha esquecida"
     :login/forgotten-password-email-resent           "E-mail de redefinição de senha já enviado."
     :login/forgotten-password-description            "Obtenha um link de redefinição de senha por e-mail (válido por 24h)."
     :login/forgotten-password-error                  [:<> "Este endereço de e-mail está bloqueado por você. Desbloqueie-o clicando em Cancelar inscrição em qualquer e-mail da OrgPad, ou nos envie um e-mail para "
                                                       company/support-email-app-link " deste endereço de e-mail."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Novo no OrgPad? " [:a.link-button {:href route} "Inscreva-se"]])
     :login/options                                   "Escolha outra maneira de fazer login"
     :login/send-reset-link                           "Enviar link de redefinição"
     :login/wrong-email-or-password                   "E-mail ou senha incorretos."

     :markdown/title                                  "O texto colado é formatado com Markdown?"
     :markdown/info                                   "Markdown foi detectado no seu texto colado. Deseja aplicar este formato?"
     :markdown/remember                               "Lembrar até a próxima recarga"
     :markdown/insert                                 "Usar formatação Markdown"
     :markdown/ignore                                 "Manter original"

     :meta/title                                      "Título da OrgPage"
     :meta/orgpage-thumbnail                          "Imagem da OrgPage"
     :meta/automatic-screenshot-start                 "Captura de tela gerada automaticamente para "
     :meta/automatic-screenshot-refresh               "Atualiza cinco minutos após cada alteração."
     :meta/custom-thumbnail                           "Imagem personalizada enviada de tamanho 1360x768."
     :meta/upload-thumbnail                           "Enviar imagem personalizada"
     :meta/thumbnail-upload-failed                    "Falha ao enviar imagem."
     :meta/description                                "Descrição"
     :meta/new-tags                                   "Tag"
     :meta/tag-too-long                               (str "O comprimento máximo de uma tag é " common-orgpage/max-tag-length " caracteres.")
     :meta/too-many-tags                              (str "No máximo " common-orgpage/max-tags " tags são permitidas.")
     :meta/info                                       (str "Esses detalhes serão exibidos na lista de OrgPages, "
                                                           "ao incorporar uma OrgPage e ao compartilhá-la nas redes sociais.")
     :meta/info-in-share-orgpage                      "Antes de compartilhar esta OrgPage, o título deve ser definido."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Mova as {selection/num-units} {selection/units-label} selecionadas "
                                                                         "e os {selection/num-links} {selection/links-label} links para uma nova OrgPage "
                                                                         "com as seguintes informações. Na OrgPage atual, essas células e links "
                                                                         "serão substituídos por uma única célula, contendo a nova OrgPage dentro.")
                                                       {:selection/units-label [:selection/num-units "células" "célula" "células"]
                                                        :selection/links-label [:selection/num-links "links" "link" "links"]}]
     :meta/info-title                                 "Informações – {meta/title}"
     :meta/info-title-only                            "Nome da OrgPage"
     :meta/details                                    "Detalhes"
     :meta/preview                                    "Pré-visualização"
     :meta/init-fragments                             "Localização inicial"
     :meta/init-fragments-info                        (str "Você pode escolher a localização inicial quando a OrgPage for aberta. "
                                                           "Uma localização diferente pode ser especificada para dispositivos móveis.")
     :meta/desktop-init-fragment                      "Localização para computador"
     :meta/mobile-init-fragment                       "Localização para dispositivo móvel"
     :meta/everything-closed                          "Tudo fechado"
     :meta/everything-closed-lowercase                "tudo fechado"
     :meta/more-details                               "Mais detalhes"
     :meta/move-to-new-orgpage-title                  "Mover para {meta/title}"
     :meta/move-to-new-orgpage                        "Mover para uma nova OrgPage"

     :microsoft-365-permission/title                  "Permitir acesso do Microsoft 365 a este documento?"
     :microsoft-365-permission/info                   [:<> "O documento do Office pode ser exibido usando o Microsoft 365."
                                                       " Ao clicar em concordar, seu documento será compartilhado com o Microsoft."
                                                       " Consulte " [:a.link-button {:href   "https://www.microsoft.com/pt-br/servicesagreement/"
                                                                                     :target "_blank"}
                                                                     "Microsoft Service Agreement"] "."]
     :microsoft-365-permission/allow                  "Permitir acesso do Microsoft 365"

     :notifications/info                              "Escolha quais e-mails o OrgPad envia para você. Sempre informaremos sobre mudanças importantes."
     :notifications/any-email                         "Qualquer e-mail da OrgPad"
     :notifications/email-verification                "Verificação de e-mail ao se inscrever, links para redefinição de senha e informações essenciais de pagamento"
     :notifications/monthly-newsletter                "Boletim informativo mensal com atualizações e desenvolvimento recente no OrgPad"
     :notifications/messages                          "Receber mensagens de outras pessoas"
     :notifications/blocked-people                    "Pessoas especificamente bloqueadas:"
     :notifications/receipts                          "Comprovantes quando sua assinatura for renovada automaticamente"
     :notifications/receive-invitations               "Receber convites de outras pessoas"
     :notifications/unblock-user                      "Desbloquear essa pessoa"

     :onboarding/openable-units                       "Apenas células elevadas com sombras podem ser abertas."
     :onboarding/zoom                                 "Role para ampliar"
     :onboarding/drag-canvas                          "Mova arrastando"
     :onboarding/open-units                           "Células com sombras têm conteúdo"

     :orgpage/creating-preview                        "Criando pré-visualização …"
     :orgpage/change-information                      "Alterar informações"
     :orgpage/copy-orgpage                            "Copiar para uma nova OrgPage"
     :orgpage/delete-orgpage                          "Excluir OrgPage"
     :orgpage/detail                                  "Detalhe"
     :orgpage/share-tooltip                           "Compartilhar esta OrgPage com outros"
     :orgpage/share-orgpage                           "Compartilhar OrgPage"
     :orgpage/show-information                        "Mostrar informações"

     :orgpage/zoom-in                                 "Ampliar"
     :orgpage/zoom-out                                "Reduzir zoom"
     :orgpage/create-unit-double-click                "Duplo clique para criar uma célula."
     :orgpage/create-unit-hold-or-double-tap          "Segure ou dê dois toques para criar uma célula."
     :orgpage/switch-to-edit                          "Mudar para edição."

     :orgpage/untitled                                "OrgPage sem título"
     :orgpage/title                                   "Título da OrgPage"
     :orgpage/untitled-unit                           "Célula sem título"
     :orgpage/untitled-path                           "Apresentação sem título"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "etapas" "etapa" "etapas"]}]

     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (página {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (página {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Uma cópia disponível como "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Alterar cor desta OrgPage"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Esta OrgPage é automaticamente compartilhada com " label " para "
                                                         (case permission
                                                           :permission/view "leitura"
                                                           :permission/comment "comentário"
                                                           :permission/edit "edição"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Clique aqui"]
                                                         " para cancelar o compartilhamento."])

     :orgpage-placement/activate                      "Visualizar aqui"
     :orgpage-print/displayed                         "Exatamente como exibido"
     :orgpage-print/displayed-info                    "Tudo dentro do retângulo será impresso exatamente como você vê."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPage impressa com sucesso em um arquivo "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "A impressão deste PDF deve levar cerca de {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Tudo fechado"
     :orgpage-print/everything-closed-info            "No PDF impresso, todas as células são exibidas fechadas."
     :orgpage-print/fragment                          "Uma localização"
     :orgpage-print/fragment-info                     "O PDF impresso exibe a localização selecionada."
     :orgpage-print/gray                              "Fundo cinza"
     :orgpage-print/landscape                         "Paisagem"
     :orgpage-print/orientation                       "Orientação"
     :orgpage-print/path-info                         [:i18n/plural " com {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "páginas" "página" "páginas"]}]
     :orgpage-print/portrait                          "Retrato"
     :orgpage-print/presentation                      "Etapas de uma apresentação"
     :orgpage-print/presentation-info                 "Cada etapa é impressa em uma página separada."
     :orgpage-print/print                             "Imprimir em PDF"
     :orgpage-print/size                              "Tamanho"
     :orgpage-print/started                           (str "Estamos imprimindo esta OrgPage em PDF. Deve levar cerca de {orgpage-print/estimated-time}."
                                                           " Quando terminar, estará disponível como um arquivo.")
     :orgpage-print/title                             "Nome da impressão"
     :orgpage-print/type                              "O que é impresso"
     :orgpage-print/watermark                         "Incluir marca d'água"
     :orgpage-print/watermark-info                    "Atualize para profissional, escola ou empresa para remover."
     :orgpage-print/white                             "Fundo branco"

     :orgpage-stats/number-of-units                   "Número de células"
     :orgpage-stats/number-of-links                   "Número de links"
     :orgpage-stats/number-of-files                   "Número de arquivos"
     :orgpage-stats/number-of-images                  "Número de imagens"

     :org-role/student                                "Estudante"
     :org-role/teacher                                "Professor"
     :org-role/employee                               "Funcionário"
     :org-role/admin                                  "Administrador"

     :panel/toggle-side-panel                         "Menu lateral"
     :panel/create-orgpage                            "Nova OrgPage"
     :panel/logo-tooltip                              "Ir para a página inicial"
     :panel/edit-info                                 "Alternar para edição onde você pode criar e excluir células e links, modificar conteúdo e mais (F7)"
     :panel/comment-info                              (str "Alternar para comentar onde você pode criar, editar e excluir"
                                                           " suas células e links, mas não pode editar ou excluir células ou links"
                                                           " de outras pessoas. No entanto, você pode vincular a células que não são de sua propriedade. (F7)")
     :panel/read-info                                 "Alternar para leitura onde nada pode ser alterado, mas a navegação no conteúdo é mais fácil (F6)"
     :panel/undo-deletion                             "Desfazer exclusão"
     :panel/undo-deletion-info                        [:i18n/plural "Reverter a exclusão de {delete/num-units} {delete/unit-label} e {delete/num-links} {delete/link-label} (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "células" "célula" "células"]
                                                                :link-label [:delete/num-links
                                                                             "links" "link" "links"]}]
     :panel/refresh                                   "Atualizar"
     :panel/switch-style                              "Alternar estilo de novas células e links; arraste para criar uma nova célula"
     :panel/profile                                   "Perfil"
     :panel/settings                                  "Configurações"
     :panel/usergroups                                "Equipes"
     :panel/stats                                     "Estatísticas"
     :panel/administration                            "Administração"
     :panel/ios-install-info                          "Instalar aplicativo"
     :panel/upload-attachment                         "Inserir imagens ou arquivos em novas células"
     :panel/selection-mode                            "Iniciar seleção"
     :panel/search                                    "Pesquisar (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Revelar {panel/num-hidden-book-ids} {panel/unit-label} ocultas na localização atual"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids "células" "célula" "células"]}]

     :password/too-short                              "Pelo menos 8 caracteres são necessários"
     :password/different-passwords                    "As senhas não coincidem"

     :password-reset/back-to-list                     "Voltar para a lista"
     :password-reset/change-password                  "Mudar senha"
     :password-reset/set-password                     "Definir senha"
     :password-reset/has-password                     "Sua conta tem uma senha definida."
     :password-reset/without-password                 "Nenhuma senha ainda foi definida, já que contas vinculadas foram usadas para login."
     :password-reset/invalid-link                     "Link inválido, talvez tenha mais de 24 horas. Por favor, peça para reenviar o e-mail."
     :password-reset/description                      "Defina sua nova senha."
     :password-reset/enter-current-and-new-password   "Digite a senha atual e a nova senha."
     :password-reset/enter-new-password               "Digite a nova senha."

     :path/add-step                                   "Passo"
     :path/add-step-tooltip                           "ENTER ou TAB; mantenha pressionada a tecla SHIFT para copiar a câmera"
     :path/hidden-ops                                 " e mais {path/num-hidden}"
     :path/title                                      "Título da apresentação"
     :path/default-title                              "Apresentação {path/num-paths}"
     :path/copy                                       "Copiar para uma nova apresentação"
     :path/copy-suffix                                "copiar"
     :path/add-audio                                  "Vincular Áudio ao Passo"
     :path/remove-audio                               "Desvincular Áudio do Passo"

     :paths/create-new-path                           "Criar uma apresentação"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Excluir a apresentação " [:b title] "?"])
     :paths/help                                      "Selecione células para alterar o que é exibido; veja o guia para mais detalhes (em inglês)."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Atualmente no plano " [:b tier] ", válido até " [:b end-date] "."
                                                         (if autorenewal
                                                           " A assinatura será renovada automaticamente no final do período de pagamento."
                                                           " A assinatura expirará no final do período de pagamento.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Seu plano " [:b tier] " expirou em " [:b end-date] ", pois seu pagamento não foi concluído."
                                                         " Se você corrigir seu pagamento, sua assinatura será renovada automaticamente."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " em " [:b tier] " do plano de " name "."])
     :payments/free-tier-info                         [:<> "OrgPad usado no " [:b "plano Gratuito,"] " sem nenhum pagamento."]
     :payments/no-teams                               "Nenhuma equipe no plano Gratuito."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Para " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "atualizar"] " ou "])
                                                         [:a.link-button {:href period-url} "mudar seu período de cobrança"]
                                                         ", entre em contato conosco."])
     :payments/choose-plan                            "Escolher plano"
     :payments/manage-plan                            "Gerenciar plano"
     :payments/billing-address                        "Endereço de cobrança"
     :payments/billing-address-info                   (str "O endereço de cobrança inserido será usado em todas as novas faturas."
                                                           " As faturas recentes também são automaticamente atualizadas.")
     :payments/receipt-label                          "Comprovante {receipt/date-range}"
     :payments/customer-portal-failed                 "Algo deu errado ao carregar o site de gerenciamento de planos."

     :pending-activation/email-already-used           "E-mail já usado em outra conta."
     :pending-activation/email-not-recieved           "Nenhum e-mail? Reenvie ou mude abaixo."
     :pending-activation/email-sent                   "E-mail de ativação enviado. "
     :pending-activation/instructions                 "Quase lá! Ative sua conta com um clique no link que enviamos para você por e-mail."
     :pending-activation/resend                       "Reenviar e-mail de ativação"

     :permission/admin                                "Pode compartilhar e excluir"
     :permission/admin-tooltip                        "Também pode modificar quem mais tem acesso ao documento."
     :permission/edit                                 "Pode editar"
     :permission/edit-tooltip                         "Pode fazer quaisquer alterações na OrgPage."
     :permission/comment                              "Pode comentar"
     :permission/comment-tooltip                      (str "Pode criar novas células de propriedade, conectá-las e modificá-las. "
                                                           "Não pode modificar o resto da OrgPage.")
     :permission/view                                 "Pode ler"
     :permission/view-tooltip                         "Pode ler a OrgPage sem fazer quaisquer alterações."

     :presentation/presentation                       "Apresentação"
     :presentation/step                               "Passo"
     :presentation/present                            "Iniciar apresentação"
     :presentation/slideshow                          "Reproduzir automaticamente os passos"
     :presentation/step-duration                      "Duração do passo em segundos"
     :presentation/loop-slideshow                     "Repetir no final"
     :presentation/respect-audio-track                "Duração do passo conforme a faixa de áudio"
     :presentation/stop-slideshow                     "Parar a reprodução automática dos passos"
     :presentation/exit-tooltip                       "Sair da apresentação"
     :presentation/play-audio                         "Reproduzir áudio para este passo"
     :presentation/pause-audio                        "Pausar a reprodução do áudio"

     :presentation/share-presentation                 "Compartilhar esta apresentação com outras pessoas."

     :pricing-popup/orgpages-exceeded-title           "Você não pode criar mais OrgPages no plano Gratuito"
     :pricing-popup/orgpages-exceeded                 "Você precisa atualizar seu plano."
     :pricing-popup/storage-exceeded-title            "Espaço insuficiente para enviar {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Restam apenas " [:b space-left] " em seu armazenamento."
                                                         " Você pode atualizar seu plano para estender seu armazenamento."])
     :pricing-popup/num-shared-limit-reached-title    "Você não pode compartilhar esta OrgPage com mais pessoas"
     :pricing-popup/num-shared-limit-reached-common   "O número máximo de pessoas compartilhando esta OrgPage foi atingido."
     :pricing-popup/num-shared-limit-reached          [:<> "Para adicionar mais pessoas, você precisa atualizar para o "
                                                       [:b "plano Profissional"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> "O proprietário desta OrgPage " owner " precisa atualizar para o "
                                                         [:b "plano Profissional"] " para adicionar mais pessoas."])
     :pricing-popup/enable-teams-title                "Atualize seu plano para gerenciar equipes"
     :pricing-popup/enable-teams                      [:<> "Equipes agrupam pessoas, simplificando a colaboração e o compartilhamento de OrgPages."
                                                       " Essa função só está ativada no " [:b "plano Padrão"] " ou superior."]
     :pricing-popup/teams-limit-reached-title         "Atualize seu plano para criar mais equipes"
     :pricing-popup/teams-limit-reached               "O limite para o número de equipes foi atingido em seu plano."
     :pricing-popup/team-members-limit-reached-title  "Você não pode adicionar mais membros a {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "O número máximo de membros da equipe foi atingido."
     :pricing-popup/team-members-limit-reached        [:<> "Para adicionar mais membros, você precisa atualizar para o "
                                                       [:b "plano Profissional"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> "O proprietário desta equipe " owner " precisa atualizar para o "
                                                         [:b "plano Profissional"] " para adicionar mais membros."])
     :pricing-popup/try-out-share-title               "Inscreva-se para compartilhar esta OrgPage"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Restam apenas " [:b space-left] " em seu armazenamento."])
     :pricing-popup/free-account-info                 "Ao se inscrever, você ganha gratuitamente:"
     :pricing-popup/free-limit                        "até três OrgPages,"
     :pricing-popup/free-storage                      "até 100 MB de armazenamento,"
     :pricing-popup/free-share                        "compartilhamento de seu trabalho com outras pessoas."
     :pricing-popup/free-account-info2                "Crie sua conta em apenas alguns cliques."

     :pricing-popup/register-to-comment               "Inscreva-se para adicionar seus comentários"
     :pricing-popup/register-to-comment-info          (str "As células de comentário exibirão seu nome e foto de perfil."
                                                           " Para isso, você precisa criar sua conta primeiro.")

     :pricing-popup/print-watermark-title             "Atualize seu plano para remover a marca d'água"
     :pricing-popup/print-watermark-info              (str "A impressão sem marca d'água do OrgPad.info só é possível em planos "
                                                           "Profissional, Escola ou Empresa.")

     :profile/open-contact-dialog                     "Enviar mensagem"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Contatar " first-name " " last-name)
                                                          "Contatar esta pessoa"))
     :profile/contact-dialog-info                     (str "Como não compartilhamos os endereços de e-mail de outras pessoas no OrgPad, enviaremos esta mensagem por você. Incluiremos"
                                                           " seu nome e e-mail para fornecer um contato direto.")

     :promotion/unknown                               "Código desconhecido"
     :promotion/max-usages-reached                    "Usado muitas vezes"
     :promotion/expired                               "Expirou"
     :promotion/one-year-free                         "1 ano grátis"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} grátis"
                                                       {:promotion/days [:promotion/duration "dias" "dia" "dias"]}]
     :promotion/for-one-year                          " por 1 ano"
     :promotion/for-six-months                        " por 6 meses"

     :props/h1                                        "Título grande"
     :props/h2                                        "Título médio"
     :props/h3                                        "Título pequeno"
     :props/weight-none                               "Link normal"
     :props/strong                                    "Link forte"
     :props/arrowhead-none                            "Sem seta"
     :props/single                                    "Seta simples"
     :props/double                                    "Seta dupla"

     :public-permission/none                          "privada."
     :public-permission/view                          "compartilhada com todos para leitura."

     :registration/create-user                        "Criar conta"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Já possui uma conta? " [:a.link-button {:href route} "Login"]])
     :registration/options                            "Selecione outra forma de registro"
     :registration/server-error                       "Erro no servidor. Tente criar a conta novamente."
     :registration/missing-oauth-email                "{registration/service} não nos informou seu e-mail. Preencha seu e-mail abaixo."

     :search/previous-match                           "Resultado anterior (Page Up)"
     :search/next-match                               "Próximo resultado (Page Down)"
     :search/close                                    "Fechar (ESC)"
     :search/cells-with-selected-attachments          "As células com arquivos e imagens selecionados."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Alterar estilo da seleção "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} e "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; mantenha SHIFT pressionado para definir o estilo atual, mantenha CTRL pressionado para copiar para o atual"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "células" "célula" "células"]
                                                                   :link-label [:selection/num-links
                                                                                "links" "link" "links"]}]

     :selection/link                                  "Conectar células"
     :selection/hide-contents                         "Ocultar conteúdo (ESC)"
     :selection/show-contents                         "Mostrar conteúdo"
     :selection/force-closing                         "Ocultar estes conteúdos ao abrir a localização (ESC)"
     :selection/step-focus-camera                     "Focar a câmera do passo exatamente nas células selecionadas (F2 ou Q); segure SHIFT para adicionar, segure ALT para remover."
     :selection/fragment-focus-camera                 "Focar a câmera da localização exatamente nas células selecionadas (F2 ou Q); segure SHIFT para adicionar, segure ALT para remover."
     :selection/step-show-books                       "Mostrar apenas as células selecionadas no passo (F3 ou W); segure SHIFT para adicionar, segure ALT para remover."
     :selection/fragment-show-books                   "Mostrar apenas as células selecionadas na localização (F3 ou W); segure SHIFT para adicionar, segure ALT para remover."
     :selection/force-showing                         "Revelar as células selecionadas se estiverem ocultas"
     :selection/share-units                           "Copiar link que exibe as unidades selecionadas; segure SHIFT para abrir as configurações da localização"
     :selection/move-to-new-orgpage                   "Mover para uma nova OrgPage"
     :selection/change-code-lang                      "Alterar idioma do código"
     :selection/copy-units-links                      "Copiar células e links para a área de transferência"
     :selection/flip-links                            "Inverter direções dos links"
     :selection/delete                                "Excluir selecionado"

     :settings/profile                                "Perfil"
     :settings/payments                               "Pagamentos"
     :settings/account                                "Conta"
     :settings/linked-accounts                        "Contas vinculadas"
     :settings/email                                  "Notificações"
     :settings/account-description                    "Altere seu e-mail, senha ou exclua sua conta."
     :settings/stats-description                      "Aqui estão algumas estatísticas sobre o uso do OrgPad."
     :settings/change-email                           "Alterar e-mail"
     :settings/change-email-text                      "Insira o novo endereço de e-mail. Por motivos de segurança, precisamos verificá-lo antes de desbloquear a conta."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Você se inscreveu para sua conta usando o e-mail " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Sua conta está " [:b " vinculada "] " ao Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Sua conta não está " [:b " vinculada "] " ao Facebook."]
     :settings/link-fb                                "Vincular ao Facebook"
     :settings/unlink-fb                              "Desvincular do Facebook"
     :settings/account-linked-to-google               [:<> " Sua conta está " [:b " vinculada "] " ao Google."]
     :settings/account-not-linked-to-google           [:<> " Sua conta não está " [:b " vinculada "] " ao Google."]
     :settings/link-google                            "Vincular ao Google"
     :settings/unlink-google                          "Desvincular do Google"
     :settings/account-linked-to-microsoft            [:<> " Sua conta está " [:b " vinculada "] " à Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> " Sua conta não está " [:b " vinculada "] " à Microsoft."]
     :settings/link-microsoft                         "Vincular à Microsoft"
     :settings/unlink-microsoft                       "Desvincular da Microsoft"
     :settings/account-linked-to-cuni                 [:<> " Sua conta está " [:b " vinculada "] " à Charles University."]
     :settings/account-not-linked-to-cuni             [:<> " Sua conta não está " [:b " vinculada "] " à Charles University."]
     :settings/link-cuni                              "Vincular à Charles University"
     :settings/unlink-cuni                            "Desvincular da Charles University"
     :settings/set-password-text                      " Defina uma senha antes de desvincular."
     :settings/linked-accounts-info                   "Vincule sua conta do Facebook ou Google ao OrgPad para poder usá-las para fazer login."
     :settings/profile-info                           "Com as informações fornecidas, você será mais fácil de encontrar para colegas em um projeto."

     :settings/delete-account                         "Excluir conta"
     :settings/confirm-delete-account-question        [:<> [:b "Excluir"] " permanentemente sua conta?"]
     :settings/confirm-delete-account-info            "Isso excluirá todas as suas OrgPages e seus dados."
     :settings/delete-account-info                    [:<> "A exclusão excluirá " [:b "permanentemente"] " todas as suas OrgPages e seus dados."]

     :share-orgpage/campaigns                         "Campanhas"
     :share-orgpage/copied-to-clipboard               "Copiado para a área de transferência"
     :share-orgpage/copy-template-link                "Copiar link do modelo"
     :share-orgpage/dialog-title                      "Compartilhar {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Pessoas sem uma conta no OrgPad receberão um convite com um link."
                                                                  " Depois de abrir o link, eles podem ler esta OrgPage. ")
                                                         [:a.link-button create-team "Crie uma equipe"]
                                                         " para compartilhar facilmente OrgPages com um grupo de pessoas."])
     :share-orgpage/email-found                       "Encontrada uma conta OrgPad."
     :share-orgpage/email-unused                      "Nenhuma conta OrgPad encontrada. Envie um convite por e-mail."
     :share-orgpage/checking-email-address            "Verificando endereço de e-mail …"
     :share-orgpage/invite-for-editing                "Convidar para edição"
     :share-orgpage/invite-for-viewing                "Convidar para leitura"
     :share-orgpage/invite-by-email                   "Você deseja convidá-los por e-mail usando um idioma específico?"
     :share-orgpage/show-profile                      "Mostrar perfil"
     :share-orgpage/links                             "Links"
     :share-orgpage/to-read                           "para leitura"
     :share-orgpage/to-comment                        "para comentário"
     :share-orgpage/to-edit                           "para edição"
     :share-orgpage/links-tooltip                     "Conceda acesso por meio de links compartilháveis"
     :share-orgpage/template                          "Modelo"
     :share-orgpage/template-tooltip                  "Links que criam automaticamente uma cópia desta OrgPage"
     :share-orgpage/template-info                     "As pessoas podem usar este link para criar suas próprias cópias desta OrgPage."
     :share-orgpage/template-autoshare-none           "Não compartilhe as cópias comigo."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Compartilhe as cópias comigo para "
                                                             (case template-autoshare
                                                               :permission/view "leitura"
                                                               :permission/comment "comentário"
                                                               :permission/edit "edição") "."))
     :share-orgpage/embed                             "Incorporar"
     :share-orgpage/embed-into-microsoft-teams        "Incorporar no Microsoft Teams"
     :share-orgpage/embed-into-website                "Incorporar no site ou aplicativo"
     :share-orgpage/embed-tooltip                     "Incorporar no site ou aplicativo"
     :share-orgpage/new-user-or-usergroup             "Nome, e-mail ou equipe"
     :share-orgpage/link-permission-start             "Permitir que as pessoas"
     :share-orgpage/link-permission-end               "esta OrgPage."
     :share-orgpage/orgpage-info                      "Info"
     :share-orgpage/orgpage-info-tooltip              "Informações sobre o proprietário e se a OrgPage está publicada"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Esta OrgPage é compartilhada com você para "
                                                             (case user-permission
                                                               :permission/view "leitura"
                                                               :permission/comment "comentário"
                                                               :permission/edit "edição") "."))
     :share-orgpage/remove-yourself                   "Remover-se"
     :share-orgpage/private-info                      "Somente você e as pessoas com as quais você compartilhou a OrgPage diretamente ou por meio de um link têm acesso. Todo documento recém-criado é privado."
     :share-orgpage/publish-for-reading-info          "A OrgPage é pública. Qualquer pessoa na Internet pode pesquisar e ler. Somente você ou as pessoas com as quais você compartilhou a OrgPage para edição podem fazer alterações."
     :share-orgpage/publish-permission-end            "Esta OrgPage está "
     :share-orgpage/publish                           "Publicar"
     :share-orgpage/publish-confirmation              "Todos poderão {orgpage/permission} esta OrgPage. Você tem certeza?"
     :share-orgpage/publish-tooltip                   "Conceda acesso a todos"
     :share-orgpage/remove-user                       "Remover permissão"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Se você compartilhou um link por acidente, pode "
                                                         [:span.link-button reset-links "invalidar todos os links anteriores"]
                                                         "."])
     :share-orgpage/shareable-link                    "Link compartilhável"
     :share-orgpage/everything-closed                 "Exibir todas as células fechadas"
     :share-orgpage/presentation                      "Comece com uma apresentação"
     :share-orgpage/fragment                          "Exibir uma localização"
     :share-orgpage/template-link-switch              "Criar um link do modelo."
     :share-orgpage/user-not-registered               " ainda não se inscreveu no OrgPad."
     :share-orgpage/users                             "Pessoas"
     :share-orgpage/users-tooltip                     "Conceda acesso a pessoas individuais"

     :side-panel/about                                "Página inicial"
     :side-panel/terms-and-conditions                 "Termos e condições"
     :side-panel/privacy-and-security                 "Privacidade e segurança"
     :side-panel/files-and-images                     "Arquivos e imagens"
     :side-panel/paths                                "Apresentações"
     :side-panel/fragments                            "Localizações"
     :side-panel/translate                            "Traduzir"
     :side-panel/toggle-debug                         "Depurador"
     :side-panel/help                                 "Ajuda"
     :side-panel/blog                                 "Blog"
     :side-panel/home                                 "Início"
     :side-panel/import                               "Importar"
     :side-panel/share                                "Compartilhar"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "arquivos" "arquivo" "arquivos"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "imagens" "imagem" "imagens"]}]
     :side-panel/num-paths                            [:i18n/plural "{side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "apresentações" "apresentação" "apresentações"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "localizações" "localização" "localizações"]}]

     :step/closed-books                               "Células fechadas; CTRL+clique para selecionar"
     :step/everything-closed                          "Tudo fechado"
     :step/hidden-books                               "Células ocultas; CTRL+clique para selecionar"
     :step/nothing-changed                            "Nada mudou"
     :step/opened-pages                               "Páginas abertas; CTRL+clique para selecionar"
     :step/focused-books                              "Células mostradas na câmera; CTRL+clique para selecionar"
     :step/shown-books                                "Células reveladas; CTRL+clique para selecionar"
     :step/switched-pages                             "Páginas trocadas; CTRL+clique para selecionar"

     :style-select/set-comment                        "Mudar para uma célula de comentário com sua imagem de perfil (CTRL+,)"
     :style-select/unset-comment                      "Mudar para uma célula normal, removendo a imagem de perfil (CTRL+,)"
     :style-select/set-comment-safari                 "Mudar para uma célula de comentário com sua imagem de perfil (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Mudar para uma célula normal, removendo a imagem de perfil (SHIFT+CMD+,)"

     :tag/public                                      "público"

     :text-field/email                                "E-mail"
     :text-field/first-name                           "Nome"
     :text-field/last-name                            "Sobrenome"
     :text-field/name                                 "Nome"
     :text-field/new-password                         "Nova senha"
     :text-field/password                             "Senha"
     :text-field/content                              "Conteúdo"
     :text-field/name-or-email                        "Nome ou e-mail"
     :text-field/subject                              "Assunto"
     :text-field/message                              "Mensagem"
     :text-field/phone-number                         "Número de telefone"
     :text-field/width                                "Largura"
     :text-field/height                               "Altura"

     :translate/title                                 "Traduzir OrgPage {orgpage/title} para outro idioma"
     :translate/info                                  (str "Cria automaticamente uma cópia desta OrgPage de sua propriedade"
                                                           " que é traduzida do idioma de origem para o idioma de destino."
                                                           " Você pode encontrá-la em sua lista em menos de um minuto.")
     :translate/source-lang                           "Idioma de origem"
     :translate/target-lang                           "Idioma de destino"
     :translate/translate                             "Traduzir"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Tradução disponível em "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :unit-editor/add-page                            "Criar outra página (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "Remover esta página"
     :unit-editor/previous-page                       (str "Página anterior (PAGEUP);"
                                                           " mantenha SHIFT pressionado para mover esta página para a esquerda (SHIFT+PAGEUP);"
                                                           " mantenha CTRL pressionado para criar outra página antes desta página (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "Próxima página (PAGEDOWN);"
                                                           " mantenha SHIFT pressionado para mover esta página para a direita (SHIFT+PAGEDOWN);"
                                                           " mantenha CTRL pressionado para criar outra página após esta página (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Mudar para esta página"
                                                             (when can-edit "; mantenha SHIFT pressionado para mover a página atual para lá")))
     :unit-editor/hidden-info                         "Clique para escrever"
     :unit-editor/undo                                "Desfazer (CTRL+Z)"
     :unit-editor/redo                                "Refazer (CTRL+SHIFT+Z ou CTRL+Y)"
     :unit-editor/toggle-bold                         "Negrito (CTRL+B)"
     :unit-editor/toggle-italic                       "Itálico (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Riscar"
     :unit-editor/toggle-subscript                    "Subscrito (CTRL+S)"
     :unit-editor/toggle-superscript                  "Sobrescrito (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Criar hiperlink (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Remover hiperlink"
     :unit-editor/set-highlighting                    "Cor de destaque"
     :unit-editor/selection->code                     "Converter para código (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Lista com marcadores (TAB)"
     :unit-editor/toggle-list-ol                      "Lista numerada (CTRL+O)"
     :unit-editor/indent                              "Aumentar recuo (TAB)"
     :unit-editor/outdent                             "Diminuir recuo (SHIFT+TAB)"
     :unit-editor/center                              "Alinhar ao centro (CTRL+L)"
     :unit-editor/heading                             "Título (CTRL+G)"
     :unit-editor/embed-pdf                           "Mostrar conteúdo em PDF"
     :unit-editor/link-pdf                            "Substituir o conteúdo em PDF pelo seu hiperlink"
     :unit-editor/embed-office                        "Mostrar conteúdo do Office usando Microsoft 365"
     :unit-editor/link-office                         "Substituir o conteúdo do Office pelo seu hiperlink"
     :unit-editor/embed-video                         "Mostrar reprodutor de vídeo"
     :unit-editor/link-video                          "Substituir o vídeo pelo seu hiperlink"
     :unit-editor/embed-audio                         "Mostrar reprodutor de áudio"
     :unit-editor/link-audio                          "Substituir o áudio pelo seu hiperlink"
     :unit-editor/hyperlink->embed                    "Inserir site vinculado"
     :unit-editor/embed->hyperlink                    "Substituir o site incorporado pelo seu hiperlink"
     :unit-editor/open-image-in-attachments           "Abrir esta imagem na lista de anexos"
     :unit-editor/open-file-in-attachments            "Abrir este arquivo na lista de anexos"
     :unit-editor/toggle-controls                     "Mostrar controles do reprodutor de vídeo"
     :unit-editor/toggle-autoplay                     "Reproduzir automaticamente"
     :unit-editor/toggle-muted                        "Reproduzir sem som, a reprodução automática pode ser bloqueada"
     :unit-editor/toggle-loop                         "Reprodução em loop"
     :unit-editor/toggle-chained-size                 "Manter proporção"
     :unit-editor/insert-menu                         "Inserir"
     :unit-editor/insert-image                        "Imagem"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Carregue uma imagem do seu dispositivo."
     :unit-editor/insert-image-info2                  "Dica: Arraste ou cole imagens diretamente em qualquer célula ou área cinza."
     :unit-editor/insert-camera                       "Câmera"
     :unit-editor/insert-attachment                   "Anexar arquivo"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Vídeo"
     :unit-editor/insert-video-info                   "Carregue um vídeo do computador ou insira-o do YouTube."
     :unit-editor/insert-video-info2                  "Dica: Arraste vídeos e miniaturas do YouTube diretamente em qualquer célula ou área cinza."
     :unit-editor/video-url                           "Link do YouTube"
     :unit-editor/youtube-start                       "Início"
     :unit-editor/youtube-end                         "Fim"
     :unit-editor/insert-table                        "Tabela"
     :unit-editor/insert-table-info                   "Escolha o tamanho da tabela inserida."
     :unit-editor/toggle-table-border                 "Mostrar bordas da tabela"
     :unit-editor/add-row-before                      "Inserir linha acima"
     :unit-editor/add-row-after                       "Inserir linha abaixo"
     :unit-editor/remove-current-row                  "Excluir linha"
     :unit-editor/add-column-before                   "Inserir coluna à esquerda"
     :unit-editor/add-column-after                    "Inserir coluna à direita"
     :unit-editor/remove-current-column               "Excluir coluna"
     :unit-editor/remove-table                        "Remover tabela"
     :unit-editor/insert-website                      "Site"
     :unit-editor/insert-website-info                 (str "Você pode incorporar sites diretamente em uma célula."
                                                           " Se não funcionar, pode estar bloqueado pelo proprietário do site.")
     :unit-editor/website-url-or-code                 "Endereço do site ou código"
     :unit-editor/website-id                          "ID do site"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Usado para "
                                                         [:a.link-button {:href info :target "_blank"} "envio de mensagens entre sites"] "."])
     :unit-editor/invalid-website-url                 "Endereço do site ou código inválido"
     :unit-editor/invalid-video-url                   "Endereço de vídeo inválido"
     :unit-editor/update-website                      "Alterar endereço do site"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "Código"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Copiar código"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Bloco de código"
     :unit-editor/toggle-block-math                   "Matemática em uma linha separada"
     :unit-editor/remove-code                         "Remover formatação de código"
     :unit-editor/insert-math                         "Matemática / Química"

     :unit-panel/link                                 (str "Clique ou arraste para conectar;"
                                                           " mantenha SHIFT pressionado para criar várias conexões;"
                                                           " mantenha CTRL pressionado para criar uma cadeia de células")
     :unit-panel/upload-attachment                    "Inserir imagem ou arquivo nesta célula"
     :unit-panel/change-link-style                    (str "Alterar estilo desta célula;"
                                                           " mantenha SHIFT pressionado para definir o atual,"
                                                           " mantenha CTRL pressionado para copiar para o padrão;"
                                                           " arraste para conectar neste estilo")
     :unit-panel/hide-content                         "Ocultar conteúdo"
     :unit-panel/delete-unit                          "Excluir célula"

     :usergroup/create                                "Criar uma equipe"
     :usergroup/edit-title                            "Editar {usergroup/name}"
     :usergroup/info                                  "Crie e gerencie equipes de amigos e colegas para simplificar o compartilhamento de OrgPages."
     :usergroup/delete                                "Excluir equipe"
     :usergroup/members                               "Membros"
     :usergroup/edit                                  "Alterar título e logótipo da equipe"
     :usergroup/show-actions                          "Mostrar ações"
     :usergroup/name                                  "Nome"
     :usergroup/hide-orgpages                         "Ocultar OrgPages compartilhadas"
     :usergroup/hide-orgpages-tooltip                 "Eles podem ser exibidos se a equipe for ativada no filtro"
     :usergroup/hide-in-filter                        "Ocultar no filtro"
     :usergroup/create-info                           "O nome da equipe e a imagem de perfil podem ser vistos por membros."
     :usergroup/confirm-delete                        [:<> [:b "Excluir"] " permanentemente esta equipe?"]
     :usergroup/members-title                         "Membros de {usergroup/name}"
     :usergroup/remove-member                         "Remover da equipe"
     :usergroup/remove-admin                          "Remover administrador"
     :usergroup/make-admin                            "Tornar administrador"
     :usergroup/admin-tooltip                         "Um administrador pode gerenciar os membros e excluir a equipe."
     :usergroup/copy-usergroup                        "Copiar equipe"

     :usergroup-role/owner                            "Proprietário"
     :usergroup-role/admin                            "Administrador"
     :usergroup-role/member                           "Membro"

     :wire-transfer/title                             "Transferência Bancária para o plano {wire-transfer/tier} anual"
     :wire-transfer/info                              "Ativaremos a sua assinatura anual assim que recebermos o seu dinheiro na nossa conta."
     :wire-transfer/used-currency                     "Pagamento em {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Nome do destinatário"
     :wire-transfer/account-number                    "Número da conta"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Montante"
     :wire-transfer/payment-purpose                   "Finalidade do pagamento"
     :wire-transfer/qr-code-common                    (str "Digitalize este código QR de pagamento com o aplicativo bancário"
                                                           " para preencher automaticamente as informações corretas.")
     :wire-transfer/cz-sk-qr-code-description         (str " Este é um código QR comumente usado para transferências bancárias"
                                                           " na República Checa e na Eslováquia.")
     :wire-transfer/eu-qr-code-description            (str " Este é um código QR comumente usado para transferências SEPA"
                                                           " na União Europeia.")
     :wire-transfer/trial-info                        (str "Você pode iniciar uma assinatura única de 7 dias para usar o OrgPad"
                                                           " imediatamente. Quando o banco confirmar que o pagamento"
                                                           " foi efetuado com sucesso, o período de assinatura será estendido"
                                                           " por 1 ano.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Se tiver alguma dúvida ou dificuldade, informe-nos"
                                                         " preenchendo " [:a.link-button {:href url} "este formulário"] "."])
     :wire-transfer/success-text                      [:<> "Ativamos uma assinatura " [:b "única de 7 dias"]
                                                       " para que possa usar imediatamente o OrgPad.info o novo plano. "]
     :wire-transfer/common-result-text                (str "Quando o banco confirmar que o pagamento foi efetuado com sucesso,"
                                                           " o período de assinatura será estendido por 1 ano.")
     :wire-transfer/start-trial                       "Transferência bancária enviada"
     :wire-transfer/start-trial-result-title          "Obrigado pelo pagamento"
     :wire-transfer/copy                              "Copiar para a área de transferência"

     :website-editor/settings                         "Configurações"
     :website-editor/routes                           "Rotas"
     :website-editor/menus                            "Menus"
     :website-editor/create-menu                      "Criar menu"
     :website-editor/edited-menu                      "Menu editado"
     :website-editor/untitled-menu                    "Menu sem título"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "filhos" "filho" "filhos"]}]
     :website-editor/delete-menu-item                 "Eliminar este item de menu"
     :website-editor/add-menu-item                    "Adicionar item de menu"
     :website-editor/menu-item-label                  "Etiqueta do item"
     :menu-item/path-type                             "Abre uma rota"
     :menu-item/url-type                              "Abre um URL externo"
     :menu-item/children-type                         "Abre um submenu"
     :website-editor/menu-item-path                   "Rota"

     :youtube-placement/watch-on-prefix               (str "Ver" unicode/nbsp "em")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/pt dict)