(ns orgpad.server.i18n.it
  (:require [orgpad.common.i18n.dict.it :as it]
            [orgpad.common.company :as company]))

(def dict
  (merge
    it/dict
    {:orgpage/untitled                    "un documento"
     :orgpage/copy                        "copia"

     :permission/view                     "a leggere"
     :permission/edit                     "a modificare"

     :subscription/monthly                "mese"
     :subscription/yearly                 "anno"

     :email/greeting                      "Gentile {{customer}},"
     :email/signature                     "Cordiali saluti"
     :email/team                          "Pavel Klavík e Kamila Klavíková"
     :email/creators                      "i creatori di OrgPad"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". Non ti piacciono queste email? "
                                                  [:a href-unsubscribe "Annulla l'iscrizione"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "In caso di problemi, faccelo sapere utilizzando un "
                                                  [:a {:href (str "{{domain}}" url)} "modulo nell’app"]
                                                  " o inviando un'email a " company/support-email-link "."))
     :email/or                            " o "
     :email/customer                      "cliente"

     :verification/subject                "Verifica il tuo account OrgPad"
     :verification/preheader              "Benvenuto in OrgPad. Verifica il tuo account facendo clic sul pulsante in basso."
     :verification/heading                "Verifica il tuo indirizzo email"
     :verification/body                   "Per verificare il tuo account, fai clic sul pulsante in basso. Facendo clic sul pulsante, accetti inoltre i "
     :verification/terms-and-conditions   "Termini e condizioni di OrgPad"
     :verification/button                 "Conferma l’indirizzo email"
     :verification/accidental-email       "Se hai ricevuto questa email per errore, eliminala. Se ricevi ripetutamente queste email, contattaci all'indirizzo "

     :password-reset/subject              "Reimposta la tua password di OrgPad"
     :password-reset/preheader            "Reimposta la tua password di OrgPad facendo clic sul pulsante in basso."
     :password-reset/heading              "Reimposta la tua password di OrgPad"
     :password-reset/body                 "Fai clic sul pulsante in basso per reimpostare la password. Il link è valido per 24 ore."
     :password-reset/button               "Reimposta password"
     :password-reset/accidental-email     "Se non hai chiesto di reimpostare la password o non hai più bisogno di cambiarla, non devi fare nulla."

     :new-subscription/subject            "Conferma nuovo abbonamento"
     :new-subscription/preheader          "Il tuo piano {{tier}} con OrgPad è ora attivo. L'abbonamento si rinnoverà automaticamente ogni {{period}}."
     :new-subscription/body               "Il tuo piano {{tier}} con OrgPad è ora attivo. Grazie per il tuo pagamento!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "In futuro, l'abbonamento si rinnoverà automaticamente ogni {{period}}. Le tue ricevute vengono archiviate automaticamente nella "
                                                  [:a {:href (str "{{domain}}" url)} "sezione pagamenti"] " nelle impostazioni di OrgPad."))

     :new-payment/subject                 "Pagamento riuscito"
     :new-payment/preheader               "Hai rinnovato il tuo abbonamento al piano {{tier}}, valido fino al {{subscription-end}}."
     :new-payment/body                    (list "Hai rinnovato con successo il tuo abbonamento al piano {{tier}}. È valido fino al "
                                                [:b "{{subscription-end}}"] ". Grazie per il tuo pagamento!")
     :new-payment/button                  "Scarica la fattura"

     :payment-failed/subject              "Pagamento dell'abbonamento non riuscito"
     :payment-failed/preheader            "Verifica che la tua carta sia valida e disponga di fondi sufficienti. Se i problemi persistono, contattaci."
     :payment-failed/body                 (str "Si è verificato un errore con il pagamento del tuo abbonamento a OrgPad."
                                               " Verifica che la tua carta sia valida e disponga di fondi sufficienti.")
     :payment-failed/button               "Aggiorna metodo di pagamento"
     :payment-failed/grace-warning        (list "Il tuo abbonamento attuale è attivo fino al "
                                                [:b "{{subscription-end}}"]
                                                ". Se non paghi la quota di abbonamento entro questa data, il tuo account verrà"
                                                " declassato al piano gratuito. Potrai comunque accedere, modificare, eliminare e condividere i tuoi dati.")

     :feedback/subject                    "Domanda: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} ha inviato la domanda {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) ha inviato la domanda {{title}}"

     :invitation/subject                  "Sei stato invitato {{action}} un documento in OrgPad"
     :invitation/preheader                "{{user}} ti ha invitato {{action}} {{title}}. Fai clic sul pulsante in basso per aprirlo."
     :invitation/heading                  "{{user}} ti ha invitato {{action}} {{title}}"
     :invitation/body                     "OrgPad è una piattaforma per la creazione di documenti visivi per il quadro generale. Facendo clic sul pulsante seguente, accetti l'invito e apri il documento."
     :invitation/button                   "Apri il documento"
     :invitation/accidental-email         "Se hai ricevuto questa email per errore, eliminala. Se ricevi ripetutamente queste email, puoi "
     :invitation/block-user               "bloccare gli inviti da {{user}}"
     :invitation/block-all                "bloccare tutti gli inviti"

     :contact-user/subject                "Sei stato contattato tramite OrgPad"
     :contact-user/preheader              "Messaggio da {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) ti sta contattando tramite OrgPad"
     :contact-user/body                   (str "Questa email proviene da noi perché non condividiamo il tuo indirizzo email con nessun altro. Puoi rispondere al messaggio "
                                               "rispondendo a questo messaggio o inviando un'email a {{reply-to}}.")
     :contact-user/unsolicited-info       "Se il messaggio è indesiderato, puoi "
     :contact-user/block-user             "bloccare tutti i messaggi da {{user}}"
     :contact-user/block-all              "bloccare tutti i messaggi da tutte le persone in OrgPad."

     :blog/rss-description                "Le ultime notizie e gli aggiornamenti per OrgPad e le discussioni tecniche."

     :newsletter-2024-summer/subject      "Aggiornamento estivo da OrgPad"
     :newsletter-2024-summer/preheader    "Scopri i nostri ultimi aggiornamenti dell'app, il nuovo blog, le misure sulla privacy migliorate e altro ancora!"
     :newsletter-2024-summer/introduction "Siamo tornati con un'altra newsletter dopo una pausa di un anno!"
     :newsletter-2024-summer/heading      "In questa newsletter troverai:"
     :newsletter-2024-summer/body         (list [:li "Cosa c'è di nuovo nell'app dall'inizio dell'anno?"]
                                                [:li "Cosa troverai sul nostro nuovo blog?"]
                                                [:li "Come ci prendiamo cura della tua privacy e della sicurezza dei tuoi dati?"]
                                                [:li "Come abbiamo aggiornato i termini e le condizioni per la tua comodità?"]
                                                [:li "Perché entrare a far parte della community?"])
     :newsletter-2024-summer/button       "Leggi la newsletter"
     :newsletter-2024-summer/closing      "Attendiamo con impazienza le tue idee!"}))
