(ns orgpad.client.i18n.dicts.it
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.it :as it]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  (merge
    it/dict
    {:address/company                                 "Nome dell'azienda"
     :address/ico                                     "Partita IVA"
     :address/street                                  "Via"
     :address/street-number                           "Numero"
     :address/postal-code                             "CAP"
     :address/city                                    "Città"
     :address/country                                 "Paese"

     :administration/page-title                       "Amministrazione - OrgPad"

     :attachments/allows-access-to-file               "Consente l'accesso a questo file."
     :attachments/allows-access-to-image              "Consente l'accesso a questa immagine."
     :attachments/no-preview                          "Nessuna anteprima disponibile."
     :attachments/all-files                           "Tutti i file"
     :attachments/used-files                          "File in OrgPagina"
     :attachments/unused-files                        "File extra"
     :attachments/all-images                          "Tutte le immagini"
     :attachments/used-images                         "Immagini in OrgPagina"
     :attachments/unused-images                       "Immagini extra"
     :attachments/uploading-files                     "Caricamento dei file in corso…"
     :attachments/previous-attachment                 "File o immagine precedente"
     :attachments/next-attachment                     "File o immagine successiva"
     :attachments/display-using-microsoft-365         "Visualizza con Microsoft 365"
     :attachments/edit-filename                       "Modifica il nome"
     :attachments/title-order                         "In ordine alfabetico per titolo"
     :attachments/upload-order                        "I più recenti in alto"
     :attachments/size-order                          "I più grandi in alto"
     :attachments/split-used-unused                   "Raggruppa per presenza in OrgPagina"
     :attachments/search                              "Cerca"
     :attachments/ordering                            "Ordinamento"
     :attachments/new-version                         "Nuova versione"
     :attachments/preserve-old-version                "Conserva la vecchia versione"
     :attachments/in-other-orgpages                   "Sostituisci in altre OrgPagine:"

     :button/back                                     "Indietro"
     :button/cancel                                   "Annulla"
     :button/close                                    "Chiudi"
     :button/comment                                  "Commenta"
     :button/continue                                 "Continua"
     :button/copied                                   "Copiato"
     :button/copy                                     "Copia"
     :button/copy-link                                "Copia link"
     :button/create                                   "Crea"
     :button/create-tooltip                           "Crea (CTRL+INVIO)"
     :button/delete                                   "Elimina"
     :button/delete-selected                          "Elimina selezionati"
     :button/documentation                            "Documentazione"
     :button/download                                 "Scarica"
     :button/download-all                             "Scarica tutto"
     :button/drop                                     "Rilascia"
     :button/edit                                     "Modifica"
     :button/import                                   "Importa"
     :button/insert                                   "Inserisci"
     :button/login                                    "Accedi"
     :button/logout                                   "Esci"
     :button/publish                                  "Pubblica"
     :button/read                                     "Leggi"
     :button/register                                 "Registrati"
     :button/register-to-save                         "Registrati per salvare"
     :button/remove                                   "Rimuovi"
     :button/reset                                    "Reimposta"
     :button/save                                     "Salva modifiche"
     :button/save-tooltip                             "Salva modifiche (CTRL+INVIO)"
     :button/upload                                   "Carica"
     :button/upload-from-computer                     "Carica da computer"
     :button/send                                     "Invia"
     :button/present                                  "Presenta"
     :button/present-tooltip                          "Avvia presentazione (F5)"
     :button/share                                    "Condividi"
     :button/start                                    "Inizia"
     :button/exit                                     "Esci"
     :button/show-password                            "Mostra"
     :button/hide-password                            "Nascondi"

     :checkout/currency                               "Valuta"
     :checkout/monthly                                "mensile"
     :checkout/yearly                                 "annuale (risparmia il 15%)"
     :checkout/failed-to-init                         "Si è verificato un errore durante il caricamento della pagina di pagamento."
     :checkout/upgrade-plan                           "Aggiorna il piano"
     :checkout/professional-plan                      "Piano professionale"
     :checkout/school-plan                            "Piano scolastico"
     :checkout/enterprise-plan                        "Piano aziendale"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Scuola"] " o "
                                                         [:a.link-button {:href enterprise-url} "azienda"] "? Contattaci per un'offerta personalizzata."])
     :checkout/pay-with-credit-card                   "Paga con carta di credito"
     :checkout/pay-with-wire-transfer                 "Paga con bonifico bancario"
     :checkout/promo-code                             "Codice promozionale"
     :checkout/try-for-free                           "Provalo gratuitamente"
     :checkout/activate-now                           "Attiva ora"
     :checkout/continue-for-free                      "Continua gratuitamente"

     :code-lang/none                                  "Nessuno"
     :code-lang/multiple                              "Più"

     :dashboard/confirm-delete                        [:<> [:b "Elimina definitivamente"] " l’OrgPagina?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Accedi"] " o "
                                                         [:a {:href register-url} "registrati"]
                                                         " per creare nuove OrgPagine."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "L'abbonamento della tua scuola " name " è scaduto il " subscription-expired ". "
                                                         "Per il rinnovo, contatta la tua direzione. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Maggiori informazioni"] " sullo sconto del 95% per le scuole."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Ottieni OrgPad per la tua scuola senza limiti con uno sconto del 95%. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Maggiori informazioni."]])
     :dashboard/owned-orgpages                        "Le mie OrgPagine"
     :dashboard/public-orgpages                       "OrgPagine pubblicate"
     :dashboard/shared-orgpages                       "OrgPagine condivise con me"
     :dashboard/usergroup-orgpages                    "OrgPagine di {usergroup/name}"
     :dashboard/help-or-inspiration-button            "Ecco a te!"
     :dashboard/new-domain                            [:<> "Usa il nuovo dominio " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Maggiori informazioni in OrgPagina " [:a {:href "https://orgpad.info/s/new-domain"} "Cambiamenti in OrgPad e nuovo dominio"] "."]

     :dashboard-filter/filter                         "Filtra OrgPagine"
     :dashboard-filter/ordering                       "Ordina OrgPagine"
     :dashboard-filter/filter-and-ordering            "Filtra e ordina OrgPagine"
     :dashboard-filter/title                          "Filtra e ordina le OrgPagine visualizzate"
     :dashboard-filter/ordering-label                 "Ordinamento delle OrgPagine"
     :dashboard-filter/title-order                    "In ordine alfabetico per titolo"
     :dashboard-filter/creation-time-order            "I più recenti in alto"
     :dashboard-filter/last-modified-order            "Ultima modifica in alto"
     :dashboard-filter/most-viewed-order              "I più visti in alto"
     :dashboard-filter/search-tags                    "Cerca tag"

     :embedding-code/code                             "Codice"
     :embedding-code/description                      "Incorpora l’OrgPagina in un sito web o in un’altra applicazione."

     :error/orgpage-access-denied                     "Non hai accesso a questa OrgPagina. Prova ad accedere."
     :error/usergroup-access-denied                   "Autorizzazioni per modificare il team negate."
     :error/administration-access                     "Accesso all'amministrazione negato."
     :error/creation-unauthorized                     "Accedi per creare OrgPagine."
     :error/deleting-denied                           "Eliminazione di OrgPagina negata."
     :error/email-already-used                        "E-mail già in uso."
     :error/email-not-registered                      "Nessun account con questa e-mail."
     :error/email-missing-mx-record                   "Nessun server di posta elettronica trovato in questo dominio."
     :error/email-invalid                             "Non è un'e-mail."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "OrgPagina errata" (when id " {orgpage/id}")
                                                             ". Link copiato male?"))
     :error/incorrect-link                            "Link errato. Accedi o apri il link corretto."
     :error/incorrect-password                        "Password errata."
     :error/incorrect-profile-id                      "Link al profilo errato. Link copiato male?"
     :error/lost-permission                           "Accesso a questa OrgPagina perso."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "E-mail senza account: " emails))
     :error/name-already-used                         "Nome già in uso"
     :error/name-not-valid                            "Usa almeno 5 caratteri"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "L'OrgPagina " (when title "“{orgpage/title}”") " è stata rimossa."))
     :error/owner-of-orgpage                          "La persona è già proprietaria di questa OrgPagina."
     :error/profile-not-found                         "Profilo non trovato."
     :error/unknown-error                             "Errore sconosciuto, riprova."
     :error/unknown-id                                "OrgPagina sconosciuta."
     :error/unknown-login-or-email                    "E-mail o login del team sconosciuti."
     :error/unknown-usergroup                         "Il team è stato eliminato"
     :error/upload-failed                             "Impossibile caricare l'OrgPagina: “{orgpage/title}”"

     :export/show                                     "Esporta OrgPagina"
     :export/title                                    "Esporta {orgpage/title}"
     :export/info                                     "Scegli il formato in cui esportare questa OrgPagina."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " formato utilizzato da OrgPad"]
     :export/html                                     "Un file HTML lineare"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " formato"]
     :export/generate                                 "Genera esportazione"

     :feedback/ask-question                           "Fai una domanda"
     :feedback/hide-button                            "Nascondi pulsante in modo permanente"
     :feedback/dialog-title                           "Contatta gli sviluppatori di OrgPad"
     :feedback/description                            [:<> "Se hai bisogno di aiuto o hai qualche problema, faccelo sapere - "
                                                       [:b "gli sviluppatori di OrgPad"] ". "
                                                       "Accogliamo anche qualsiasi idea di miglioramento. "
                                                       "Risponderemo via e-mail il prima possibile."]
     :feedback/languages                              "Puoi scriverci in inglese, ceco e tedesco."
     :feedback/contact-when-problem-persists          [:<> " Se il problema persiste, contattaci all'indirizzo "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Bonifico bancario"
                                                             (when currency
                                                               (str " in " (name currency))) " per "
                                                             "annuale"
                                                             (if (= tier "standard")
                                                               " Standard"
                                                               " Professionale")
                                                             " piano"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Scrivici il tuo " [:b "indirizzo di fatturazione"] ", eventuali ulteriori informazioni per la fattura."
                                                         " Ti contatteremo a breve al tuo indirizzo e-mail " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Voglio acquistare un piano per la mia " (case org-type
                                                                                                        :feedback/school-plan "scuola"
                                                                                                        :feedback/enterprise-plan "azienda"
                                                                                                        "organizzazione")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Usa questo modulo per contattare un rappresentante di OrgPad s.r.o."
                                                         " Ti ricontatteremo a breve al numero di telefono o all'indirizzo e-mail che hai fornito (" email
                                                         "). Puoi anche chiamarci al "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Aggiorna il mio abbonamento al piano Professionale"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Scrivici come dovremmo modificare il tuo abbonamento esistente e qualsiasi ulteriore informazione."
                                                         " Ti contatteremo a breve al tuo indirizzo e-mail " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Cambia il mio periodo di fatturazione in " (if (= period "yearly")
                                                                                                           "annuale"
                                                                                                           "mensile") " fatturazione"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "La modifica avverrà al termine del periodo di fatturazione corrente."
                                                         " C'è uno sconto del 15% con fatturazione annuale."
                                                         " Ti contatteremo a breve al tuo indirizzo e-mail " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str "Nome " (case org-type
                                                                       :feedback/school-plan "scuola"
                                                                       :feedback/enterprise-plan "azienda"
                                                                       "organizzazione")))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Posizione all'interno della " (case org-type
                                                                                              :feedback/school-plan "scuola"
                                                                                              :feedback/enterprise-plan "azienda"
                                                                                              "organizzazione")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str "Sito web " (case org-type
                                                                           :feedback/school-plan "scuola"
                                                                           :feedback/enterprise-plan "azienda"
                                                                           "organizzazione")))

     :fragment/fragment                               "Posizione"
     :fragment/text-id                                "Id"
     :fragment/title                                  "Titolo"
     :fragment/create                                 "Crea posizione"
     :fragment/create-tooltip                         "TAB; tieni premuto SHIFT per copiare la posizione selezionata"
     :fragment/remove                                 "Rimuovi posizione"
     :fragment/share                                  "Copia un link a questa posizione"
     :fragment/text-id-required                       "Id richiesto."
     :fragment/text-id-already-used                   "Id già in uso."
     :fragment/closed-books                           "Celle chiuse; CTRL+clic per selezionare"
     :fragment/hidden-books                           "Celle nascoste; CTRL+clic per selezionare"
     :fragment/opened-pages                           "Pagine aperte; CTRL+clic per selezionare"
     :fragment/focused-books                          "Celle mostrate nella fotocamera; CTRL+clic per selezionare"
     :fragment/shown-books                            "Celle rivelate; CTRL+clic per selezionare"

     :info/uploading-attachments                      [:i18n/plural "Caricamento di {info/count} {info/num-files} in corso…"
                                                       {:info/num-files [:info/count "file" "file" "file"]}]
     :info/uploading-images                           [:i18n/plural "Caricamento di {info/count} {info/num-images} in corso…"
                                                       {:info/num-images [:info/count "immagini" "immagine" "immagini"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Impossibile caricare {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "immagini" "immagine" "immagini"]}]
                                                          "Impossibile caricare almeno un'immagine."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} video di Youtube {info/num-youtubes} non trovati."
                                                       {:info/num-youtubes [:info/count "video" "video" "video"]}]
     :info/uploading-attachments-failed               "Caricamento dei file non riuscito."
     :info/presentation-link-copied                   "Il link per questa presentazione è stato copiato."
     :info/max-orgpages-exceeded                      "Il proprietario di questa OrgPagina non può creare un'OrgPagina aggiuntiva."
     :info/storage-exceeded                           "Il proprietario di questa OrgPagina non ha {upload/total-size} di spazio rimanente per caricare questi file."
     :info/attachments-too-large                      (str "Impossibile caricare {upload/total-size} in un unico caricamento."
                                                           " La dimensione massima di tutti gli allegati caricati è di 500 MB.")
     :info/drop-info                                  "Rilascia in una qualsiasi cella o sulla tela grigia per creare una nuova cella."
     :info/audio-not-allowed                          "Riproduzione audio bloccata. Fai clic sul pulsante di riproduzione."
     :info/audio-not-supported                        "Formato audio non supportato."

     :import/another-format                           [:<> "Se desideri importare i tuoi dati esistenti in un altro formato, contattaci all'indirizzo "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Importa i tuoi dati"
     :import/google-docs                              "Per inserire dati da Microsoft Office o Google Docs, incollali semplicemente in un'OrgPagina."
     :import/supported-formats                        "Ora supportiamo questi formati:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " esportato come file .vsdx."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " file."]

     :ios/install-info                                "Installa l'app OrgPad"
     :ios/share-button                                "1. Apri"
     :ios/add-to-home-screen                          "2. Tocca"

     :lang/cs                                         "Ceco"
     :lang/de                                         "Tedesco"
     :lang/en                                         "Inglese"
     :lang/es                                         "Spagnolo"
     :lang/fr                                         "Francese"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polacco"
     :lang/ru                                         "Russo"
     :lang/uk                                         "Ucraino"

     :lang-select/tooltip                             "Lingua dell'app (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "Ti manca la tua lingua? Aiutaci "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "traducendo OrgPad"] "."]

     :limit/of                                        " di "
     :limit/orgpages                                  " OrgPagine"
     :limit/people                                    " persone"
     :limit/teams                                     " team"
     :limit/team-members                              " membri"
     :limit/orgpages-tooltip                          (str "Nel livello Gratuito, il numero di OrgPagine è limitato."
                                                           " Aggiorna il tuo piano per creare più OrgPagine.")
     :limit/shares-tooltip                            (str "Il numero di persone con cui puoi condividere direttamente questa OrgPagina è limitato."
                                                           " Aggiorna al livello Professionale per condividere con un numero illimitato di persone.")
     :limit/teams-tooltip                             (str "Nel livello Standard, il numero di team di proprietà è limitato."
                                                           " Aggiorna al livello Professionale per creare team illimitati.")
     :limit/teams-members-tooltip                     (str "Nel livello Standard, ogni team ha un numero limitato di membri."
                                                           " Aggiorna al livello Professionale per creare team illimitati.")
     :limit/attachments-size                          (str "La dimensione totale di tutti i file e le immagini caricati è limitata"
                                                           " e può essere aumentata aggiornando il piano.")
     :limit/attachments-size-clickable                (str "La dimensione totale di tutti i file e le immagini caricati è limitata."
                                                           " Fai clic per aumentare il tuo limite aggiornando il piano.")
     :limit/attachments-size-try-out                  (str "La dimensione totale di tutti i file e le immagini caricati è limitata."
                                                           " Per aumentare il tuo limite a 100 MB, fai clic per creare un account.")

     :limits/max-orgpages                             "documenti"
     :limits/max-storage                              "spazio di archiviazione"
     :limits/max-teams                                "team"
     :limits/of                                       " di"
     :limits/max-team-members                         "membri"
     :limits/priority-support                         "supporto prioritario"

     :link-panel/flip                                 "Inverti la direzione"
     :link-panel/insert-unit-in-middle                "Inserisci una cella nel mezzo"
     :link-panel/delete                               "Elimina il link"
     :link-panel/change-link-style                    "Cambia lo stile di questo link; tieni premuto SHIFT per impostare quello corrente, tieni premuto CTRL per copiarlo in quello predefinito"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Calcolo delle dimensioni di tutte le celle, " [:span#autoresize-num-units num-units] " rimanenti…"])
     :loading/initial-layout                          "Miglioramento del layout iniziale…"
     :loading/restoring-opened-pages                  "Ripristino della posizione delle pagine aperte…"
     :loading/getting-orgpage                         "Download di un'OrgPagina dal server…"
     :loading/getting-dashboard                       "Download dell'elenco delle OrgPagine disponibili dal server…"
     :loading/getting-website                         "Download di un sito web dal server…"
     :loading/getting-blog                            "Download del blog dal server…"
     :loading/uploading-orgpage                       "Caricamento di un'OrgPagina sul server…"
     :loading/ws-init                                 "Impostazione della connessione al server…"
     :loading/ws-closed                               "Connessione al server chiusa, tentativo di riconnessione. Se il problema persiste, ricarica la pagina."
     :loading/administration                          "Caricamento dei dati di amministrazione…"
     :loading/profile                                 "Caricamento del profilo…"
     :loading/style                                   "Caricamento degli stili…"
     :loading/start-trial                             "Avvio dell'abbonamento di prova di 7 giorni…"
     :loading/uploading-attachments                   "Caricamento degli allegati sul server…"

     :login/continue-with-email                       "Continua con l'e-mail"
     :login/continue-with-facebook                    "Continua con Facebook"
     :login/continue-with-google                      "Continua con Google"
     :login/continue-with-microsoft                   "Continua con Microsoft"
     :login/continue-with-cuni                        "Continua con l'Università Carolina"
     :login/email-sent                                "E-mail inviata. Fai clic sul link nell'e-mail."
     :login/forgotten-password                        "Password dimenticata"
     :login/forgotten-password-email-resent           "E-mail di reimpostazione della password già inviata."
     :login/forgotten-password-description            "Ottieni un link per la reimpostazione della password via e-mail (valido 24 ore)."
     :login/forgotten-password-error                  [:<> "Questo indirizzo e-mail è bloccato da te. Sbloccalo facendo clic su Annulla l'iscrizione in qualsiasi e-mail da OrgPad, oppure inviaci un'e-mail a "
                                                       company/support-email-app-link " da questo indirizzo e-mail."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Nuovo su OrgPad? " [:a.link-button {:href route} "Registrati"]])
     :login/options                                   "Scegli un altro modo per accedere"
     :login/send-reset-link                           "Invia link di reimpostazione"
     :login/wrong-email-or-password                   "E-mail o password errata."

     :markdown/title                                  "Il testo incollato è formattato con Markdown?"
     :markdown/info                                   "Nel contenuto incollato è stata rilevata la formattazione Markdown. Desideri applicare la sua formattazione?"
     :markdown/remember                               "Ricorda fino al ricaricamento"
     :markdown/insert                                 "Usa la formattazione Markdown"
     :markdown/ignore                                 "Mantieni l'originale"

     :meta/title                                      "Nome dell'OrgPagina"
     :meta/orgpage-thumbnail                          "Immagine dell'OrgPagina"
     :meta/automatic-screenshot-start                 "Screenshot generato automaticamente per "
     :meta/automatic-screenshot-refresh               "Si aggiorna cinque minuti dopo ogni modifica."
     :meta/custom-thumbnail                           "Immagine personalizzata caricata di dimensioni 1360x768."
     :meta/upload-thumbnail                           "Carica immagine personalizzata"
     :meta/thumbnail-upload-failed                    "Impossibile caricare l'immagine."
     :meta/description                                "Descrizione"
     :meta/new-tags                                   "Tag"
     :meta/tag-too-long                               (str "La lunghezza massima di un tag è di " common-orgpage/max-tag-length " caratteri.")
     :meta/too-many-tags                              (str "Sono consentiti al massimo " common-orgpage/max-tags " tag.")
     :meta/info                                       (str "Questi dettagli verranno visualizzati nell'elenco delle OrgPagine, "
                                                           "quando si incorpora un'OrgPagina e quando la si condivide sui social network.")
     :meta/info-in-share-orgpage                      "Prima di poter condividere questa OrgPagina, è necessario impostare il titolo."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Sposta le {selection/num-units} {selection/units-label} selezionate "
                                                                         "e i {selection/num-links} {selection/links-label} in una nuova OrgPagina "
                                                                         "con le seguenti informazioni. Nell'OrgPagina corrente, queste celle e link "
                                                                         "verranno sostituiti da una singola cella, contenente la nuova OrgPagina all'interno.")
                                                       {:selection/units-label [:selection/num-units "celle" "cella" "celle"]
                                                        :selection/links-label [:selection/num-links "link" "link" "link"]}]
     :meta/info-title                                 "Informazioni – {meta/title}"
     :meta/info-title-only                            "Dai un nome all'OrgPagina"
     :meta/details                                    "Dettagli"
     :meta/preview                                    "Anteprima"
     :meta/init-fragments                             "Posizione di partenza"
     :meta/init-fragments-info                        (str "Puoi scegliere la posizione di partenza all'apertura dell'OrgPagina. "
                                                           "È possibile specificare una posizione di partenza diversa per i dispositivi mobili.")
     :meta/desktop-init-fragment                      "Posizione del desktop"
     :meta/mobile-init-fragment                       "Posizione del cellulare"
     :meta/everything-closed                          "Tutte le celle chiuse"
     :meta/everything-closed-lowercase                "tutte le celle chiuse"
     :meta/more-details                               "Maggiori dettagli"
     :meta/move-to-new-orgpage-title                  "Sposta in {meta/title}"
     :meta/move-to-new-orgpage                        "Sposta in una nuova OrgPagina"

     :microsoft-365-permission/title                  "Consentire a Microsoft 365 di accedere a questo documento?"
     :microsoft-365-permission/info                   [:<> "Il documento di Office può essere visualizzato utilizzando Microsoft 365."
                                                       " Facendo clic su Accetto, il documento verrà condiviso con Microsoft."
                                                       " Controlla " [:a.link-button {:href   "https://www.microsoft.com/it-it/servicesagreement/"
                                                                                      :target "_blank"}
                                                                      "Contratto di Servizi Microsoft"] "."]
     :microsoft-365-permission/allow                  "Concedi l'autorizzazione a Microsoft 365"

     :notifications/info                              "Scegli quali e-mail ti invia OrgPad. Ti informeremo sempre delle modifiche importanti."
     :notifications/any-email                         "Qualsiasi e-mail da OrgPad"
     :notifications/email-verification                "Verifica e-mail al momento dell'iscrizione, link per la reimpostazione della password e informazioni di pagamento essenziali"
     :notifications/monthly-newsletter                "Newsletter mensile con aggiornamenti e recenti sviluppi in OrgPad"
     :notifications/messages                          "Ricevi messaggi da altre persone"
     :notifications/blocked-people                    "Persone specificamente bloccate:"
     :notifications/receipts                          "Ricevute quando il tuo abbonamento si rinnova automaticamente"
     :notifications/receive-invitations               "Ricevi inviti da altre persone"
     :notifications/unblock-user                      "Sblocca questa persona"

     :onboarding/openable-units                       "Solo le celle rialzate con ombre possono essere aperte."
     :onboarding/zoom                                 "Scorri per ingrandire"
     :onboarding/drag-canvas                          "Sposta trascinando"
     :onboarding/open-units                           "Le celle con ombre hanno contenuto"

     :orgpage/creating-preview                        "Creazione dell'anteprima in corso…"
     :orgpage/change-information                      "Cambia informazioni"
     :orgpage/copy-orgpage                            "Copia in una nuova OrgPagina"
     :orgpage/delete-orgpage                          "Elimina OrgPagina"
     :orgpage/detail                                  "Dettaglio"
     :orgpage/share-tooltip                           "Condividi questa OrgPagina con altri"
     :orgpage/share-orgpage                           "Condividi OrgPagina"
     :orgpage/show-information                        "Mostra informazioni"
     :orgpage/zoom-in                                 "Ingrandisci"
     :orgpage/zoom-out                                "Rimpicciolisci"
     :orgpage/create-unit-double-click                "Fai doppio clic per creare una cella."
     :orgpage/create-unit-hold-or-double-tap          "Tieni premuto o tocca due volte per creare una cella."
     :orgpage/switch-to-edit                          "Passa alla modifica."
     :orgpage/untitled                                "OrgPagina senza titolo"
     :orgpage/title                                   "Titolo dell'OrgPagina"
     :orgpage/untitled-unit                           "Cella senza titolo"
     :orgpage/untitled-path                           "Presentazione senza titolo"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "passaggi" "passaggio" "passaggi"]}]
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (pagina {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (pagina {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Una copia disponibile come "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Cambia il colore di questa OrgPagina"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Questa OrgPagina è condivisa automaticamente con " label " per "
                                                         (case permission
                                                           :permission/view "la lettura"
                                                           :permission/comment "il commento"
                                                           :permission/edit "la modifica"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Fai clic qui"]
                                                         " per annullare la condivisione."])

     :orgpage-placement/activate                      "Visualizza qui"

     :orgpage-print/displayed                         "Esattamente come visualizzato"
     :orgpage-print/displayed-info                    "Tutto ciò che si trova all'interno del rettangolo verrà stampato esattamente come lo vedi."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPagina stampata con successo in "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "La stampa di questo PDF dovrebbe richiedere circa {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Tutte le celle chiuse"
     :orgpage-print/everything-closed-info            "Il PDF stampato mostra tutte le celle chiuse."
     :orgpage-print/fragment                          "Una posizione"
     :orgpage-print/fragment-info                     "Il PDF stampato mostra la posizione selezionata."
     :orgpage-print/gray                              "Sfondo grigio"
     :orgpage-print/landscape                         "Orizzontale"
     :orgpage-print/orientation                       "Orientamento"
     :orgpage-print/path-info                         [:i18n/plural " con {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "pagine" "pagina" "pagine"]}]
     :orgpage-print/portrait                          "Verticale"
     :orgpage-print/presentation                      "Passaggi di una presentazione"
     :orgpage-print/presentation-info                 "Ogni passaggio viene stampato su una pagina separata."
     :orgpage-print/print                             "Stampa in PDF"
     :orgpage-print/size                              "Dimensioni"
     :orgpage-print/started                           (str "Stiamo stampando questa OrgPagina in PDF. Dovrebbe richiedere circa {orgpage-print/estimated-time}."
                                                           " Al termine, sarà disponibile come file.")
     :orgpage-print/title                             "Nome di stampa"
     :orgpage-print/type                              "Cosa viene stampato"
     :orgpage-print/watermark                         "Includi filigrana"
     :orgpage-print/watermark-info                    "Aggiorna a professionale, scuola o azienda per rimuovere."
     :orgpage-print/white                             "Sfondo bianco"

     :orgpage-stats/number-of-units                   "Numero di celle"
     :orgpage-stats/number-of-links                   "Numero di link"
     :orgpage-stats/number-of-files                   "Numero di file"
     :orgpage-stats/number-of-images                  "Numero di immagini"

     :org-role/student                                "Studente"
     :org-role/teacher                                "Insegnante"
     :org-role/employee                               "Dipendente"
     :org-role/admin                                  "Amministratore"

     :panel/toggle-side-panel                         "Menu laterale"
     :panel/create-orgpage                            "Nuova OrgPagina"
     :panel/logo-tooltip                              "Vai a casa"
     :panel/edit-info                                 "Passa alla modifica dove puoi creare ed eliminare celle e link, modificare contenuti e altro (F7)"
     :panel/comment-info                              (str "Passa al commento dove puoi creare, modificare ed eliminare"
                                                           " le tue celle e i tuoi link ma non puoi modificare o eliminare celle o link"
                                                           " di altre persone. Tuttavia, puoi creare link a celle non di tua proprietà. (F7)")
     :panel/read-info                                 "Passa alla lettura dove non è possibile modificare nulla ma la navigazione dei contenuti è più semplice (F6)"
     :panel/undo-deletion                             "Annulla eliminazione"
     :panel/undo-deletion-info                        [:i18n/plural "Ripristina l'eliminazione di {delete/num-units} {delete/unit-label} e {delete/num-links} {delete/link-label} (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "celle" "cella" "celle"]
                                                                :link-label [:delete/num-links
                                                                             "link" "link" "link"]}]
     :panel/refresh                                   "Aggiorna"
     :panel/switch-style                              "Cambia lo stile di nuove celle e link; trascina per creare una nuova cella"
     :panel/profile                                   "Profilo"
     :panel/settings                                  "Impostazioni"
     :panel/usergroups                                "Team"
     :panel/stats                                     "Statistiche"
     :panel/administration                            "Amministrazione"
     :panel/ios-install-info                          "Installa app"
     :panel/upload-attachment                         "Inserisci immagini o file in nuove celle"
     :panel/selection-mode                            "Avvia selezione"
     :panel/search                                    "Cerca (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Rivela {panel/num-hidden-book-ids} {panel/unit-label} nascoste nella posizione corrente"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids
                                                                            "celle" "cella" "celle"]}]

     :password/too-short                              "Sono richiesti almeno 8 caratteri"
     :password/different-passwords                    "Le password non corrispondono"

     :password-reset/back-to-list                     "Torna all'elenco"
     :password-reset/change-password                  "Cambia password"
     :password-reset/set-password                     "Imposta password"
     :password-reset/has-password                     "Il tuo account ha una password impostata."
     :password-reset/without-password                 "Non è ancora stata impostata alcuna password poiché per l'accesso sono stati utilizzati account collegati."
     :password-reset/invalid-link                     "Link non valido, forse più vecchio di 24 ore. Richiedi di inviare nuovamente l'e-mail."
     :password-reset/description                      "Imposta la tua nuova password."
     :password-reset/enter-current-and-new-password   "Inserisci la password corrente e la nuova password."
     :password-reset/enter-new-password               "Inserisci la nuova password."

     :path/add-step                                   "Passaggio"
     :path/add-step-tooltip                           "INVIO o TAB; tieni premuto SHIFT per copiare la fotocamera"
     :path/hidden-ops                                 " e {path/num-hidden} altri"
     :path/title                                      "Nome della presentazione"
     :path/default-title                              "Presentazione {path/num-paths}"
     :path/copy                                       "Copia in una nuova presentazione"
     :path/copy-suffix                                "copia"
     :path/add-audio                                  "Collega l'audio al passaggio"
     :path/remove-audio                               "Scollega l'audio dal passaggio"

     :paths/create-new-path                           "Crea una presentazione"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Eliminare la presentazione " [:b title] "?"])
     :paths/help                                      "Seleziona le celle per modificare ciò che viene mostrato; consulta la guida per maggiori dettagli."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Attualmente nel piano " [:b tier] ", valido fino al " [:b end-date] "."
                                                         (if autorenewal
                                                           " L'abbonamento si rinnoverà automaticamente alla fine del periodo di pagamento."
                                                           " L'abbonamento scadrà alla fine del periodo di pagamento.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Il tuo piano " [:b tier] " è scaduto il " [:b end-date] " poiché il pagamento del rinnovo non è andato a buon fine."
                                                         " Se risolvi il pagamento, il tuo abbonamento verrà esteso automaticamente."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " al piano " [:b tier] " di " name "."])
     :payments/free-tier-info                         [:<> "OrgPad utilizzato nel " [:b "livello Gratuito,"] " senza alcun pagamento."]
     :payments/no-teams                               "Nessun team nel livello Gratuito."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Per " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "aggiornamenti"] " o "])
                                                         [:a.link-button {:href period-url} "modificare il periodo di fatturazione"]
                                                         ", contattaci."])
     :payments/choose-plan                            "Scegli piano"
     :payments/manage-plan                            "Gestisci piano"
     :payments/billing-address                        "Indirizzo di fatturazione"
     :payments/billing-address-info                   (str "L'indirizzo di fatturazione inserito verrà utilizzato su tutte le nuove fatture."
                                                           " Anche le fatture recenti vengono aggiornate automaticamente.")
     :payments/receipt-label                          "Ricevuta {receipt/date-range}"
     :payments/customer-portal-failed                 "Si è verificato un errore durante il caricamento del sito web di gestione del piano."

     :pending-activation/email-already-used           "E-mail già in uso su un altro account."
     :pending-activation/email-not-recieved           "Nessuna e-mail? Invia di nuovo o modifica di seguito."
     :pending-activation/email-sent                   "E-mail di attivazione inviata. "
     :pending-activation/instructions                 "Quasi finito! Attiva il tuo account con un clic sul link che ti abbiamo inviato via e-mail."
     :pending-activation/resend                       "Invia di nuovo l'e-mail di attivazione"

     :permission/admin                                "Può condividere ed eliminare"
     :permission/admin-tooltip                        "Può anche modificare chi altro ha accesso al documento."
     :permission/edit                                 "Può modificare"
     :permission/edit-tooltip                         "Può apportare qualsiasi modifica all'OrgPagina."
     :permission/comment                              "Può commentare"
     :permission/comment-tooltip                      (str "Può creare nuove celle di proprietà, collegarle e modificarle. "
                                                           "Non può modificare il resto dell'OrgPagina.")
     :permission/view                                 "Può leggere"
     :permission/view-tooltip                         "Può leggere l'OrgPagina senza apportare alcuna modifica."

     :presentation/presentation                       "Presentazione"
     :presentation/step                               "Passaggio"
     :presentation/present                            "Avvia presentazione"
     :presentation/slideshow                          "Riproduci automaticamente i passaggi"
     :presentation/step-duration                      "Durata del passaggio in secondi"
     :presentation/loop-slideshow                     "Ripeti alla fine"
     :presentation/respect-audio-track                "Durata del passaggio in base alla traccia audio"
     :presentation/stop-slideshow                     "Interrompi la riproduzione automatica dei passaggi"
     :presentation/exit-tooltip                       "Esci dalla presentazione"
     :presentation/play-audio                         "Riproduci l'audio per questo passaggio"
     :presentation/pause-audio                        "Metti in pausa la riproduzione dell'audio"
     :presentation/share-presentation                 "Condividi questa presentazione con altri."

     :pricing-popup/orgpages-exceeded-title           "Non puoi creare più OrgPagine nel piano Gratuito"
     :pricing-popup/orgpages-exceeded                 "Devi aggiornare il tuo piano."
     :pricing-popup/storage-exceeded-title            "Spazio insufficiente per caricare {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Nel tuo spazio di archiviazione sono rimasti solo " [:b space-left] "."
                                                         " Puoi aggiornare il tuo piano per estendere il tuo spazio di archiviazione."])
     :pricing-popup/num-shared-limit-reached-title    "Non puoi condividere questa OrgPagina con più persone"
     :pricing-popup/num-shared-limit-reached-common   "È stato raggiunto il numero massimo di persone che condividono questa OrgPagina."
     :pricing-popup/num-shared-limit-reached          [:<> " Per aggiungere più persone, devi aggiornare al "
                                                       [:b "livello Professionale"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Il proprietario di questa OrgPagina " owner " deve aggiornare al "
                                                         [:b "livello Professionale"] " per aggiungere più persone."])
     :pricing-popup/enable-teams-title                "Aggiorna il tuo piano per gestire i team"
     :pricing-popup/enable-teams                      [:<> "I team raggruppano le persone per semplificare la collaborazione e la condivisione di OrgPagine."
                                                       " Questa funzione è abilitata solo nel " [:b "livello Standard"] " o superiore."]
     :pricing-popup/teams-limit-reached-title         "Aggiorna il tuo piano per creare più team"
     :pricing-popup/teams-limit-reached               "È stato raggiunto il limite per il numero di team per il tuo piano."
     :pricing-popup/team-members-limit-reached-title  "Non puoi aggiungere altri membri a {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "È stato raggiunto il numero massimo di membri del team."
     :pricing-popup/team-members-limit-reached        [:<> " Per aggiungere altri membri, devi aggiornare al "
                                                       [:b "livello Professionale"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " Il proprietario di questo team " owner " deve aggiornare al "
                                                         [:b "livello Professionale"] " per aggiungere altri membri."])
     :pricing-popup/try-out-share-title               "Registrati per condividere questa OrgPagina"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Nel tuo spazio di archiviazione sono rimasti solo " [:b space-left] "."])
     :pricing-popup/free-account-info                 "Registrandoti, ottieni gratuitamente:"
     :pricing-popup/free-limit                        "fino a tre OrgPagine,"
     :pricing-popup/free-storage                      "fino a 100 MB di spazio di archiviazione,"
     :pricing-popup/free-share                        "condividere il tuo lavoro con altri."
     :pricing-popup/free-account-info2                "Crea il tuo account in pochi clic."

     :pricing-popup/register-to-comment               "Registrati per aggiungere i tuoi commenti"
     :pricing-popup/register-to-comment-info          (str "Le celle dei commenti mostreranno il tuo nome e la tua foto del profilo."
                                                           " Per questo devi prima creare il tuo account.")

     :pricing-popup/print-watermark-title             "Aggiorna il tuo piano per non avere filigrane"
     :pricing-popup/print-watermark-info              (str "La stampa senza filigrane di OrgPad.info è possibile solo"
                                                           " nei piani professionali, scolastici e aziendali.")

     :profile/open-contact-dialog                     "Invia messaggio"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Contatta " first-name " " last-name)
                                                          "Contatta questa persona"))
     :profile/contact-dialog-info                     (str "Poiché non condividiamo gli indirizzi e-mail di altre persone in OrgPad, invieremo questo messaggio per te. "
                                                           "Includeremo il tuo nome e la tua e-mail per fornire un contatto diretto.")

     :promotion/unknown                               "Codice sconosciuto"
     :promotion/max-usages-reached                    "Usato troppe volte"
     :promotion/expired                               "Scaduto"
     :promotion/one-year-free                         "1 anno gratis"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} gratis"
                                                       {:promotion/days [:promotion/duration "giorni" "giorno" "giorni"]}]
     :promotion/for-one-year                          " per 1 anno"
     :promotion/for-six-months                        " per 6 mesi"

     :props/h1                                        "Titolo grande"
     :props/h2                                        "Titolo medio"
     :props/h3                                        "Titolo piccolo"
     :props/weight-none                               "Link normale"
     :props/strong                                    "Link forte"
     :props/arrowhead-none                            "Nessuna freccia"
     :props/single                                    "Freccia"
     :props/double                                    "Doppia freccia"

     :public-permission/none                          "privato."
     :public-permission/view                          "condiviso con tutti per la lettura."

     :registration/create-user                        "Crea account"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Hai già un account? " [:a.link-button {:href route} "Accedi"]])
     :registration/options                            "Scegli un altro modo per registrarti"
     :registration/server-error                       "Errore del server. Prova a creare di nuovo l'account."
     :registration/missing-oauth-email                "{{registration/service}} non ci ha comunicato la tua e-mail. Compilala di seguito."

     :search/previous-match                           "Corrispondenza precedente (Pagina su)"
     :search/next-match                               "Corrispondenza successiva (Pagina giù)"
     :search/close                                    "Chiudi (ESC)"
     :search/cells-with-selected-attachments          "Le celle con i file e le immagini selezionati."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Cambia lo stile di "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/units-label} e "
                                                                                                          "{selection/num-links} {selection/links-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/units-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/links-label}")
                                                                           " selezionati; tieni premuto SHIFT per impostare quello corrente, tieni premuto CTRL per copiarlo in quello corrente"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "celle" "cella" "celle"]
                                                                   :link-label [:selection/num-links
                                                                                "link" "link" "link"]}]

     :selection/link                                  "Collega celle"
     :selection/hide-contents                         "Nascondi contenuti (ESC)"
     :selection/show-contents                         "Mostra contenuti"
     :selection/force-closing                         "Nascondi questi contenuti all'apertura della posizione (ESC)"
     :selection/step-focus-camera                     "Metti a fuoco la fotocamera di questo passaggio esattamente sulle celle selezionate (F2 o Q); tieni premuto SHIFT per aggiungere, ALT per rimuovere."
     :selection/fragment-focus-camera                 "Metti a fuoco la fotocamera della posizione esattamente sulle celle selezionate (F2 o Q); tieni premuto SHIFT per aggiungere, ALT per rimuovere."
     :selection/step-show-books                       "Mostra esattamente le celle selezionate in questo passaggio (F3 o W); tieni premuto SHIFT per aggiungere, ALT per rimuovere."
     :selection/fragment-show-books                   "Mostra esattamente le celle selezionate nella posizione (F3 o W); tieni premuto SHIFT per aggiungere, ALT per rimuovere."
     :selection/force-showing                         "Rivela le celle selezionate precedentemente nascoste"
     :selection/share-units                           "Copia un link che mostra le unità selezionate; tieni premuto SHIFT per aprire invece le impostazioni della posizione"
     :selection/move-to-new-orgpage                   "Sposta in una nuova OrgPagina"
     :selection/change-code-lang                      "Cambia lingua del codice"
     :selection/copy-units-links                      "Copia celle e link negli appunti"
     :selection/flip-links                            "Inverti le direzioni dei link"
     :selection/delete                                "Elimina selezionati"

     :settings/profile                                "Profilo"
     :settings/payments                               "Pagamenti"
     :settings/account                                "Account"
     :settings/linked-accounts                        "Account collegati"
     :settings/email                                  "Notifiche"
     :settings/account-description                    "Cambia la tua e-mail, la password o elimina il tuo account."
     :settings/stats-description                      "Ecco alcune statistiche sul tuo utilizzo di OrgPad."
     :settings/change-email                           "Cambia e-mail"
     :settings/change-email-text                      "Inserisci un nuovo indirizzo e-mail. Per motivi di sicurezza, dobbiamo verificarlo prima di sbloccare l'account."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Ti sei registrato al tuo account utilizzando l'e-mail " [:b email] "."])
     :settings/account-linked-to-facebook             [:<> "Il tuo account è " [:b "collegato"] " a Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Il tuo account " [:b "non è collegato"] " a Facebook."]
     :settings/link-fb                                "Collega Facebook"
     :settings/unlink-fb                              "Scollega Facebook"
     :settings/account-linked-to-google               [:<> " Il tuo account è " [:b "collegato"] " a Google."]
     :settings/account-not-linked-to-google           [:<> " Il tuo account " [:b "non è collegato"] " a Google."]
     :settings/link-google                            "Collega Google"
     :settings/unlink-google                          "Scollega Google"
     :settings/account-linked-to-microsoft            [:<> " Il tuo account è " [:b "collegato"] " a Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> " Il tuo account " [:b "non è collegato"] " a Microsoft."]
     :settings/link-microsoft                         "Collega Microsoft"
     :settings/unlink-microsoft                       "Scollega Microsoft"
     :settings/account-linked-to-cuni                 [:<> " Il tuo account è " [:b "collegato"] " all'Università Carolina."]
     :settings/account-not-linked-to-cuni             [:<> " Il tuo account " [:b "non è collegato"] " all'Università Carolina."]
     :settings/link-cuni                              "Collega l'Università Carolina"
     :settings/unlink-cuni                            "Scollega l'Università Carolina"
     :settings/set-password-text                      " Imposta la password prima di scollegare."
     :settings/linked-accounts-info                   "Collega il tuo account Facebook, Google, Microsoft o dell'Università Carolina a OrgPad in modo da poterli utilizzare per accedere."
     :settings/profile-info                           "Con le informazioni fornite sarai più facile da trovare per i colleghi di un progetto."
     :settings/delete-account                         "Elimina account"
     :settings/confirm-delete-account-question        [:<> [:b "Elimina definitivamente"] " il tuo account?"]
     :settings/confirm-delete-account-info            "Eliminerà tutte le tue OrgPagine e i loro dati."
     :settings/delete-account-info                    [:<> "L'eliminazione eliminerà " [:b "definitivamente"] " tutte le tue OrgPagine e i loro dati."]

     :share-orgpage/campaigns                         "Campagne"
     :share-orgpage/copied-to-clipboard               "Copiato negli appunti"
     :share-orgpage/copy-template-link                "Copia link modello"
     :share-orgpage/dialog-title                      "Condividi {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Le persone senza un account OrgPad riceveranno un invito con un link."
                                                                  " Dopo aver aperto il link, possono leggere questa OrgPagina. ")
                                                         [:a.link-button create-team "Crea un team"]
                                                         " per condividere facilmente le OrgPagine con un gruppo di persone."])
     :share-orgpage/email-found                       "Trovato un account OrgPad."
     :share-orgpage/email-unused                      "Nessun account OrgPad trovato. Invia invece un invito via e-mail."
     :share-orgpage/checking-email-address            "Verifica dell'indirizzo e-mail in corso…"
     :share-orgpage/invite-for-editing                "Invita a modificare"
     :share-orgpage/invite-for-viewing                "Invita a leggere"
     :share-orgpage/invite-by-email                   "Vuoi invitarli via e-mail utilizzando una lingua specifica?"
     :share-orgpage/show-profile                      "Mostra profilo"
     :share-orgpage/links                             "Link"
     :share-orgpage/to-read                           "per leggere"
     :share-orgpage/to-comment                        "per commentare"
     :share-orgpage/to-edit                           "per modificare"
     :share-orgpage/links-tooltip                     "Concedi l'accesso tramite link condivisibili"
     :share-orgpage/template                          "Modello"
     :share-orgpage/template-tooltip                  "Link che creano automaticamente una copia di questa OrgPagina"
     :share-orgpage/template-info                     "Le persone possono utilizzare questo link per creare le proprie copie di questa OrgPagina."
     :share-orgpage/template-autoshare-none           "Non condividere le copie con me."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Condividi le copie con me per "
                                                             (case template-autoshare
                                                               :permission/view "la lettura"
                                                               :permission/comment "il commento"
                                                               :permission/edit "la modifica") "."))
     :share-orgpage/embed                             "Incorpora"
     :share-orgpage/embed-into-microsoft-teams        "Incorpora in Microsoft Teams"
     :share-orgpage/embed-into-website                "Incorpora in un sito web o in un'applicazione"
     :share-orgpage/embed-tooltip                     "Incorpora in un sito web o in un'applicazione"
     :share-orgpage/new-user-or-usergroup             "Nome, e-mail o team"
     :share-orgpage/link-permission-start             "Consenti alle persone"
     :share-orgpage/link-permission-end               "questa OrgPagina."
     :share-orgpage/orgpage-info                      "Informazioni"
     :share-orgpage/orgpage-info-tooltip              "Informazioni sul proprietario e se l'OrgPagina è pubblicata"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Questa OrgPagina è condivisa con te per "
                                                             (case user-permission
                                                               :permission/view "la lettura"
                                                               :permission/comment "il commento"
                                                               :permission/edit "la modifica") "."))
     :share-orgpage/remove-yourself                   "Rimuoviti"
     :share-orgpage/private-info                      "Solo tu e le persone con cui hai condiviso l'OrgPagina direttamente o tramite un link avete accesso. Ogni documento appena creato è privato."
     :share-orgpage/publish-for-reading-info          "L'OrgPagina è pubblica. Chiunque su Internet può cercarla e leggerla. Solo tu o le persone con cui hai condiviso l'OrgPagina per la modifica potete apportare modifiche."
     :share-orgpage/publish-permission-end            "Questa OrgPagina è "
     :share-orgpage/publish                           "Pubblica"
     :share-orgpage/publish-confirmation              "Tutti potranno {orgpage/permission} questa OrgPagina. Sei sicuro?"
     :share-orgpage/publish-tooltip                   "Concedi l'accesso a tutti"
     :share-orgpage/remove-user                       "Rimuovi autorizzazione"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Se hai condiviso un link per errore, puoi "
                                                         [:span.link-button reset-links "invalidare tutti i link precedenti"]
                                                         "."])
     :share-orgpage/shareable-link                    "Link condivisibile"
     :share-orgpage/everything-closed                 "Mostra tutte le celle chiuse"
     :share-orgpage/presentation                      "Inizia con una presentazione"
     :share-orgpage/fragment                          "Mostra una posizione"
     :share-orgpage/template-link-switch              "Crea un link modello."
     :share-orgpage/user-not-registered               " non si è ancora registrato a OrgPad."
     :share-orgpage/users                             "Persone"
     :share-orgpage/users-tooltip                     "Concedi l'accesso a singole persone"

     :side-panel/about                                "Pagina iniziale"
     :side-panel/terms-and-conditions                 "Termini e condizioni"
     :side-panel/privacy-and-security                 "Privacy e sicurezza"
     :side-panel/files-and-images                     "File e immagini"
     :side-panel/paths                                "Presentazioni"
     :side-panel/fragments                            "Posizioni"
     :side-panel/translate                            "Traduci"
     :side-panel/toggle-debug                         "Debugger"
     :side-panel/help                                 "Aiuto"
     :side-panel/blog                                 "Blog"
     :side-panel/home                                 "Home"
     :side-panel/import                               "Importa"
     :side-panel/share                                "Condividi"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "file" "file" "file"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "immagini" "immagine" "immagini"]}]
     :side-panel/num-paths                            [:i18n/plural "{side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "presentazioni" "presentazione" "presentazioni"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "posizioni" "posizione" "posizioni"]}]

     :step/closed-books                               "Celle chiuse"
     :step/everything-closed                          "Tutto chiuso."
     :step/hidden-books                               "Celle nascoste"
     :step/nothing-changed                            "Niente è cambiato."
     :step/opened-pages                               "Pagine aperte"
     :step/focused-books                              "Celle mostrate nella fotocamera"
     :step/shown-books                                "Celle rivelate"
     :step/switched-pages                             "Pagine cambiate"

     :style-select/set-comment                        "Trasforma in una cella di commento con la tua immagine del profilo (CTRL+,)"
     :style-select/unset-comment                      "Trasforma in una cella normale, rimuovendo l'immagine del profilo (CTRL+,)"
     :style-select/set-comment-safari                 "Trasforma in una cella di commento con la tua immagine del profilo (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Trasforma in una cella normale, rimuovendo l'immagine del profilo (SHIFT+CMD+,)"

     :tag/public                                      "pubblico"

     :text-field/email                                "E-mail"
     :text-field/first-name                           "Nome"
     :text-field/last-name                            "Cognome"
     :text-field/name                                 "Nome"
     :text-field/new-password                         "Nuova password"
     :text-field/password                             "Password"
     :text-field/content                              "Contenuto"
     :text-field/name-or-email                        "Nome o e-mail"
     :text-field/subject                              "Oggetto"
     :text-field/message                              "Messaggio"
     :text-field/phone-number                         "Numero di telefono"
     :text-field/width                                "Larghezza"
     :text-field/height                               "Altezza"

     :translate/title                                 "Traduci OrgPagina {orgpage/title} in un'altra lingua"
     :translate/info                                  (str "Crea automaticamente una copia di questa OrgPagina di tua proprietà"
                                                           " che viene tradotta dalla lingua di origine alla lingua di destinazione"
                                                           " lingua. Puoi trovarla nel tuo elenco entro un minuto.")
     :translate/source-lang                           "Lingua di origine"
     :translate/target-lang                           "Lingua di destinazione"
     :translate/translate                             "Traduci"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Traduzione disponibile come "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :unit-editor/add-page                            "Crea un'altra pagina (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "Rimuovi questa pagina"
     :unit-editor/previous-page                       (str "Pagina precedente (PAGEUP);"
                                                           " tieni premuto SHIFT per spostare questa pagina a sinistra (SHIFT+PAGEUP);"
                                                           " tieni premuto CTRL per aggiungere un'altra pagina prima di questa pagina (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "Pagina successiva (PAGEDOWN);"
                                                           " tieni premuto SHIFT per spostare questa pagina a destra (SHIFT+PAGEDOWN);"
                                                           " tieni premuto CTRL per aggiungere un'altra pagina dopo questa pagina (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Passa a questa pagina"
                                                             (when can-edit "; tieni premuto SHIFT per spostare la pagina corrente lì")))
     :unit-editor/hidden-info                         "Fai clic per scrivere"
     :unit-editor/undo                                "Annulla (CTRL+Z)"
     :unit-editor/redo                                "Ripeti (CTRL+SHIFT+Z o CTRL+Y)"
     :unit-editor/toggle-bold                         "Grassetto (CTRL+B)"
     :unit-editor/toggle-italic                       "Corsivo (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Barrato"
     :unit-editor/toggle-subscript                    "Pedice (CTRL+S)"
     :unit-editor/toggle-superscript                  "Apice (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Crea collegamento ipertestuale (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Rimuovi collegamento ipertestuale"
     :unit-editor/set-highlighting                    "Colore di evidenziazione"
     :unit-editor/selection->code                     "Converti in codice (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Elenco puntato (TAB)"
     :unit-editor/toggle-list-ol                      "Elenco numerato (CTRL+O)"
     :unit-editor/indent                              "Aumenta rientro (TAB)"
     :unit-editor/outdent                             "Riduci rientro (SHIFT+TAB)"
     :unit-editor/center                              "Allinea al centro (CTRL+L)"
     :unit-editor/heading                             "Intestazione (CTRL+G)"
     :unit-editor/embed-pdf                           "Mostra contenuto PDF"
     :unit-editor/link-pdf                            "Sostituisci contenuto PDF con il suo collegamento ipertestuale"
     :unit-editor/embed-office                        "Mostra contenuto del documento utilizzando Microsoft 365"
     :unit-editor/link-office                         "Sostituisci contenuto del documento con il suo collegamento ipertestuale"
     :unit-editor/embed-video                         "Visualizza lettore video"
     :unit-editor/link-video                          "Sostituisci video con il suo collegamento ipertestuale"
     :unit-editor/embed-audio                         "Visualizza lettore audio"
     :unit-editor/link-audio                          "Sostituisci audio con il suo collegamento ipertestuale"
     :unit-editor/hyperlink->embed                    "Inserisci sito web collegato"
     :unit-editor/embed->hyperlink                    "Sostituisci sito web incorporato con il suo collegamento ipertestuale"
     :unit-editor/open-image-in-attachments           "Apri questa immagine nell'elenco degli allegati"
     :unit-editor/open-file-in-attachments            "Apri questo file nell'elenco degli allegati"
     :unit-editor/toggle-controls                     "Visualizza i controlli del lettore video"
     :unit-editor/toggle-autoplay                     "Riproduci automaticamente"
     :unit-editor/toggle-muted                        "Riproduci in modalità silenziosa, altrimenti la riproduzione automatica potrebbe essere bloccata"
     :unit-editor/toggle-loop                         "Riproduzione in loop"
     :unit-editor/toggle-chained-size                 "Mantieni le proporzioni"
     :unit-editor/insert-menu                         "Inserisci"
     :unit-editor/insert-image                        "Immagine"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Carica un'immagine dal tuo dispositivo."
     :unit-editor/insert-image-info2                  "Suggerimento: trascina o incolla le immagini direttamente in una qualsiasi cella o sulla tela grigia."
     :unit-editor/insert-camera                       "Fotocamera"
     :unit-editor/insert-attachment                   "File"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Video"
     :unit-editor/insert-video-info                   "Carica un video dal computer o inseriscilo da YouTube."
     :unit-editor/insert-video-info2                  "Suggerimento: trascina video e miniature di YouTube direttamente in una qualsiasi cella o sulla tela grigia."
     :unit-editor/video-url                           "Link di YouTube"
     :unit-editor/youtube-start                       "Inizio"
     :unit-editor/youtube-end                         "Fine"
     :unit-editor/insert-table                        "Tabella"
     :unit-editor/insert-table-info                   "Scegli le dimensioni della tabella inserita."
     :unit-editor/toggle-table-border                 "Mostra i bordi della tabella"
     :unit-editor/add-row-before                      "Inserisci riga sopra"
     :unit-editor/add-row-after                       "Inserisci riga sotto"
     :unit-editor/remove-current-row                  "Elimina riga"
     :unit-editor/add-column-before                   "Inserisci colonna prima"
     :unit-editor/add-column-after                    "Inserisci colonna dopo"
     :unit-editor/remove-current-column               "Elimina colonna"
     :unit-editor/remove-table                        "Rimuovi tabella"
     :unit-editor/insert-website                      "Sito web"
     :unit-editor/insert-website-info                 (str "Puoi incorporare siti web direttamente in una cella."
                                                           " Se non funziona, potrebbe essere bloccato dal proprietario del sito web.")
     :unit-editor/website-url-or-code                 "Indirizzo del sito web o codice"
     :unit-editor/website-id                          "ID del sito web"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Utilizzato per "
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "inviare messaggi tra siti web"] "."])
     :unit-editor/invalid-website-url                 "Indirizzo del sito web o codice non valido"
     :unit-editor/invalid-video-url                   "Indirizzo video non valido"
     :unit-editor/update-website                      "Cambia indirizzo del sito web"
     :unit-editor/insert-orgpage                      "OrgPagina"
     :unit-editor/insert-code                         "Codice"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Copia codice"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Codice come paragrafo separato"
     :unit-editor/toggle-block-math                   "Matematica su una riga separata"
     :unit-editor/remove-code                         "Rimuovi formattazione del codice"
     :unit-editor/insert-math                         "Matematica / Chimica"

     :unit-panel/link                                 (str "Fai clic o trascina per connettere;"
                                                           " tieni premuto SHIFT per creare più connessioni;"
                                                           " tieni premuto CTRL per creare una catena di celle")
     :unit-panel/upload-attachment                    "Inserisci immagine o file in questa cella"
     :unit-panel/change-link-style                    (str "Cambia lo stile di questa cella; "
                                                           "tieni premuto SHIFT per impostare quello corrente, "
                                                           "tieni premuto CTRL per copiarlo in quello predefinito; "
                                                           "trascina per connettere in questo stile")
     :unit-panel/hide-content                         "Nascondi contenuto"
     :unit-panel/delete-unit                          "Elimina cella"

     :usergroup/create                                "Crea un team"
     :usergroup/edit-title                            "Modifica {usergroup/name}"
     :usergroup/info                                  "Crea e gestisci team di amici e colleghi per semplificare la condivisione di OrgPagine."
     :usergroup/delete                                "Elimina team"
     :usergroup/members                               "Membri"
     :usergroup/edit                                  "Cambia nome e logo del team"
     :usergroup/show-actions                          "Mostra azioni"
     :usergroup/name                                  "Nome"
     :usergroup/hide-orgpages                         "Nascondi OrgPagine condivise"
     :usergroup/hide-orgpages-tooltip                 "Possono essere visualizzati attivando il team nel filtro"
     :usergroup/hide-in-filter                        "Nascondi nel filtro"
     :usergroup/create-info                           "Il nome del team e l'immagine del profilo sono visibili solo ai membri del team."
     :usergroup/confirm-delete                        [:<> [:b "Elimina definitivamente"] " questo team?"]
     :usergroup/members-title                         "Membri di {usergroup/name}"
     :usergroup/remove-member                         "Rimuovi dal team"
     :usergroup/remove-admin                          "Rimuovi amministratore"
     :usergroup/make-admin                            "Rendi amministratore"
     :usergroup/admin-tooltip                         "Un amministratore può gestire i membri ed eliminare il team."
     :usergroup/copy-usergroup                        "Copia team"

     :usergroup-role/owner                            "Proprietario"
     :usergroup-role/admin                            "Amministratore"
     :usergroup-role/member                           "Membro"

     :wire-transfer/title                             "Bonifico bancario per il piano annuale {wire-transfer/tier}"
     :wire-transfer/info                              "Attiveremo il tuo abbonamento annuale non appena riceveremo i tuoi soldi sul nostro conto."
     :wire-transfer/used-currency                     "Pagamento in {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Nome del destinatario"
     :wire-transfer/account-number                    "Numero di conto"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Importo"
     :wire-transfer/payment-purpose                   "Scopo del pagamento"
     :wire-transfer/qr-code-common                    (str "Scansiona questo codice QR di pagamento con la tua app bancaria per compilare"
                                                           " automaticamente le informazioni corrette.")
     :wire-transfer/cz-sk-qr-code-description         (str " Questo è un codice QR comunemente usato per i bonifici bancari"
                                                           " in Cechia e Slovacchia.")
     :wire-transfer/eu-qr-code-description            (str " Questo è un codice QR comunemente usato per i bonifici SEPA"
                                                           " nell'Unione Europea.")
     :wire-transfer/trial-info                        (str "Puoi avviare un abbonamento di prova di 7 giorni una tantum per utilizzare OrgPad"
                                                           " completamente subito. Quando la banca confermerà il pagamento"
                                                           " riuscito, il periodo di abbonamento verrà esteso"
                                                           " di 1 anno.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Se hai domande o difficoltà, faccelo sapere "
                                                         " " [:a.link-button {:href url} "compilando questo modulo"] "."])
     :wire-transfer/success-text                      [:<> "Abbiamo attivato un " [:b "abbonamento di prova di 7 giorni una tantum"]
                                                       " in modo da poter utilizzare immediatamente OrgPad con il nuovo piano. "]
     :wire-transfer/common-result-text                (str "Quando la banca confermerà il pagamento riuscito,"
                                                           " il periodo di abbonamento verrà esteso"
                                                           " di 1 anno.")
     :wire-transfer/start-trial                       "Bonifico bancario inviato"
     :wire-transfer/start-trial-result-title          "Grazie per il pagamento"
     :wire-transfer/copy                              "Copia negli appunti"

     :website-editor/settings                         "Impostazioni"
     :website-editor/routes                           "Percorsi"
     :website-editor/menus                            "Menu"
     :website-editor/create-menu                      "Crea menu"
     :website-editor/edited-menu                      "Menu modificato"
     :website-editor/untitled-menu                    "Menu senza titolo"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "figli" "figlio" "figli"]}]
     :website-editor/delete-menu-item                 "Elimina questa voce di menu"
     :website-editor/add-menu-item                    "Aggiungi voce di menu"
     :website-editor/menu-item-label                  "Etichetta dell'elemento"
     :menu-item/path-type                             "Apre un percorso"
     :menu-item/url-type                              "Apre un URL esterno"
     :menu-item/children-type                         "Apre un sottomenu"
     :website-editor/menu-item-path                   "Percorso"

     :youtube-placement/watch-on-prefix               (str "Guarda" unicode/nbsp "su")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/it dict)