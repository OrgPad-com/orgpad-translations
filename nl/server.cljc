(ns orgpad.server.i18n.nl
  (:require [orgpad.common.i18n.dict.nl :as nl]
            [orgpad.common.company :as company]))

(def dict
  (merge
    nl/dict
    {:orgpage/untitled                    "een document"
     :orgpage/copy                        "kopie"

     :permission/view                     "om te lezen"
     :permission/edit                     "om te bewerken"

     :subscription/monthly                "maand"
     :subscription/yearly                 "jaar"

     :email/greeting                      "Beste {{customer}},"
     :email/signature                     "Met vriendelijke groet"
     :email/team                          "Pavel Klavík en Kamila Klavíková"
     :email/creators                      "OrgPad-makers"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"]
                                                  ". Wil je deze e-mails niet meer ontvangen? "
                                                  [:a href-unsubscribe "Afmelden"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "Als je problemen ondervindt, laat het ons dan weten via een "
                                                  [:a {:href (str "{{domain}}" url)} "in-app formulier"]
                                                  " of door een e-mail te sturen naar " company/support-email-link "."))
     :email/or                            " of "
     :email/customer                      "klant"

     :verification/subject                "Verifieer je OrgPad-account"
     :verification/preheader              "Welkom bij OrgPad. Verifieer je account door op de onderstaande knop te klikken."
     :verification/heading                "Verifieer je e-mailadres"
     :verification/body                   "Om je account te verifiëren, klik je op de onderstaande knop. Door op de knop te klikken, ga je verder akkoord met de "
     :verification/terms-and-conditions   "de algemene voorwaarden van OrgPad"
     :verification/button                 "Bevestig e-mailadres"
     :verification/accidental-email       "Als je deze e-mail per ongeluk hebt ontvangen, verwijder hem dan. Als je deze e-mails herhaaldelijk ontvangt, neem dan contact met ons op via "

     :password-reset/subject              "Stel je wachtwoord voor OrgPad opnieuw in"
     :password-reset/preheader            "Stel je wachtwoord voor OrgPad opnieuw in door op de onderstaande knop te klikken."
     :password-reset/heading              "Stel je wachtwoord voor OrgPad opnieuw in"
     :password-reset/body                 "Klik op de onderstaande knop om je wachtwoord opnieuw in te stellen. Het is 24 uur geldig."
     :password-reset/button               "Wachtwoord opnieuw instellen"
     :password-reset/accidental-email     "Als je niet hebt gevraagd om je wachtwoord opnieuw in te stellen of als je het niet meer hoeft te wijzigen, hoef je niets te doen."

     :new-subscription/subject            "Bevestiging van een nieuw abonnement"
     :new-subscription/preheader          "Je {{tier}}-abonnement bij OrgPad is nu actief. Het abonnement wordt elke {{period}} automatisch verlengd."
     :new-subscription/body               "Je {{tier}}-abonnement bij OrgPad is nu actief. Bedankt voor je betaling!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "In de toekomst wordt het abonnement elke {{period}} automatisch verlengd. Je facturen worden automatisch opgeslagen in de "
                                                  [:a {:href (str "{{domain}}" url)} "sectie Betalingen"] " in de OrgPad-instellingen."))

     :new-payment/subject                 "Betaling voltooid"
     :new-payment/preheader               "Je hebt je {{tier}}-abonnement verlengd, geldig tot {{subscription-end}}."
     :new-payment/body                    (list "Je hebt je {{tier}}-abonnement succesvol verlengd. Het is geldig tot "
                                                [:b "{{subscription-end}}"] ". Bedankt voor je betaling!")
     :new-payment/button                  "Factuur downloaden"

     :payment-failed/subject              "Abonnementsbetaling mislukt"
     :payment-failed/preheader            "Controleer of je kaart geldig is en voldoende saldo heeft. Als de problemen aanhouden, neem dan contact met ons op."
     :payment-failed/body                 (str "Er is een fout opgetreden bij de betaling van je OrgPad-abonnement."
                                               " Controleer of je kaart geldig is en voldoende saldo heeft.")
     :payment-failed/button               "Betaalmethode bijwerken"
     :payment-failed/grace-warning        (list "Je huidige abonnement is actief tot "
                                                [:b "{{subscription-end}}"]
                                                ". Als je de abonnementskosten niet voor deze datum betaalt, wordt je account omgezet naar het gratis abonnement. "
                                                "Je hebt nog steeds toegang tot je gegevens en kunt ze bewerken, verwijderen en delen.")

     :feedback/subject                    "Vraag: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} heeft de vraag {{title}} gestuurd"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) heeft de vraag {{title}} gestuurd"

     :invitation/subject                  "Je bent uitgenodigd om een document te {{action}} in OrgPad"
     :invitation/preheader                "{{user}} heeft je uitgenodigd om het document {{title}} te {{action}}. Klik op de onderstaande knop om het te openen."
     :invitation/heading                  "{{user}} heeft je uitgenodigd om het document {{title}} te {{action}}"
     :invitation/body                     "OrgPad is een platform voor het bouwen van visuele documenten om het grote geheel te overzien. Door op de volgende knop te klikken, accepteer je de uitnodiging en open je het document."
     :invitation/button                   "Document openen"
     :invitation/accidental-email         "Als je deze e-mail per ongeluk hebt ontvangen, verwijder hem dan. Als je deze e-mails herhaaldelijk ontvangt, kun je "
     :invitation/block-user               "uitnodigingen van {{user}} blokkeren"
     :invitation/block-all                "alle uitnodigingen blokkeren"

     :contact-user/subject                "Je hebt een bericht ontvangen via OrgPad"
     :contact-user/preheader              "Bericht van {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) neemt contact met je op via OrgPad"
     :contact-user/body                   (str "Deze e-mail is van ons omdat we je e-mailadres met niemand anders delen. Je kunt op het bericht reageren "
                                               "door op dit bericht te antwoorden of door te e-mailen naar {{reply-to}}.")
     :contact-user/unsolicited-info       "Als het bericht ongevraagd is, kun je "
     :contact-user/block-user             "alle berichten van {{user}} blokkeren"
     :contact-user/block-all              "alle berichten van alle mensen in OrgPad blokkeren."

     :blog/rss-description                "Het laatste nieuws, updates en technische discussies over OrgPad."

     :newsletter-2024-summer/subject      "Zomerupdate van het OrgPad-team"
     :newsletter-2024-summer/preheader    "Lees meer over onze nieuwste app-updates, de nieuwe blog, verbeterde privacymaatregelen en meer!"
     :newsletter-2024-summer/introduction "We zijn terug met een nieuwe nieuwsbrief na een pauze van een jaar!"
     :newsletter-2024-summer/heading      "In deze nieuwsbrief vind je:"
     :newsletter-2024-summer/body         (list [:li "Wat is er nieuw in de app sinds het begin van het jaar?"]
                                                [:li "Wat vind je op onze nieuwe blog?"]
                                                [:li "Hoe zorgen we voor je privacy en de veiligheid van je gegevens?"]
                                                [:li "Hoe hebben we de algemene voorwaarden voor je gemak bijgewerkt?"]
                                                [:li "Waarom lid worden van de community?"])
     :newsletter-2024-summer/button       "Nieuwsbrief lezen"
     :newsletter-2024-summer/closing      "We kijken uit naar je ideeën!"}))
