(ns orgpad.server.i18n.fr
  (:require [orgpad.common.company :as company]
            [orgpad.common.i18n.dict.fr :as fr]))

(def dict
  "A dictionary map from keywords to the corresponding French texts."
  (merge
    fr/dict
    {:orgpage/untitled                    "un document"
     :orgpage/copy                        "copie"

     :permission/view                     "à lire"
     :permission/edit                     "à modifier"

     :subscription/monthly                "mois"
     :subscription/yearly                 "année"

     :email/greeting                      "Bonjour {{customer}},"
     :email/signature                     "Cordialement"
     :email/team                          "Pavel Klavík et Kamila Klavíková"
     :email/creators                      "Les créateurs d'OrgPad"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". Vous ne souhaitez plus recevoir ces e-mails ? "
                                                  [:a href-unsubscribe "Se désabonner"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "Si vous rencontrez des problèmes, veuillez nous le faire savoir en utilisant un "
                                                  [:a {:href (str "{{domain}}" url)} "formulaire dans l'application"]
                                                  " ou en envoyant un e-mail à " company/support-email-link "."))
     :email/or                            " ou "
     :email/customer                      "client"

     :verification/subject                "Vérifiez votre compte OrgPad"
     :verification/preheader              "Bienvenue sur OrgPad. Veuillez vérifier votre compte en cliquant sur le bouton ci-dessous."
     :verification/heading                "Vérifiez votre e-mail"
     :verification/body                   "Pour vérifier votre compte, veuillez cliquer sur le bouton ci-dessous. En cliquant sur le bouton, vous acceptez les "
     :verification/terms-and-conditions   "Conditions Générales d'Utilisation"
     :verification/button                 "Confirmer l'adresse e-mail"
     :verification/accidental-email       "Si vous avez reçu cet e-mail par erreur, veuillez le supprimer. Si vous recevez ces e-mails à plusieurs reprises, veuillez nous contacter à "

     :password-reset/subject              "Réinitialisez votre mot de passe OrgPad"
     :password-reset/preheader            "Réinitialisez votre mot de passe OrgPad en cliquant sur le bouton ci-dessous."
     :password-reset/heading              "Réinitialisez votre mot de passe OrgPad"
     :password-reset/body                 "Veuillez cliquer sur le bouton ci-dessous pour réinitialiser votre mot de passe. Il est valable 24 heures."
     :password-reset/button               "Réinitialiser le mot de passe"
     :password-reset/accidental-email     "Si vous n'avez pas demandé la réinitialisation de votre mot de passe ou si vous n'avez plus besoin de le changer, vous n'avez rien à faire."

     :new-subscription/subject            "Confirmation du nouvel abonnement"
     :new-subscription/preheader          "Votre forfait {{tier}} avec OrgPad est maintenant actif. L'abonnement sera renouvelé automatiquement chaque {{period}}."
     :new-subscription/body               "Votre forfait {{tier}} avec OrgPad est maintenant actif. Merci pour votre paiement !"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "À l'avenir, l'abonnement sera renouvelé automatiquement chaque {{period}}. Vos reçus sont automatiquement enregistrés dans la "
                                                  [:a {:href (str "{{domain}}" url)} "section Paiements"] " des paramètres d'OrgPad."))

     :new-payment/subject                 "Paiement réussi"
     :new-payment/preheader               "Vous avez renouvelé votre abonnement au forfait {{tier}}, valable jusqu'au {{subscription-end}}."
     :new-payment/body                    (list "Votre abonnement au forfait {{tier}} a été renouvelé. Il est valable jusqu'au "
                                                [:b "{{subscription-end}}"] ". Merci pour votre paiement !")
     :new-payment/button                  "Télécharger la facture"

     :payment-failed/subject              "Le paiement de l'abonnement a échoué"
     :payment-failed/preheader            "Veuillez vérifier que votre carte est valide et dispose de fonds suffisants. Si les problèmes persistent, contactez-nous."
     :payment-failed/body                 (str "Une erreur est survenue lors du paiement de votre abonnement OrgPad."
                                               " Veuillez vérifier que votre carte est valide et dispose de fonds suffisants.")
     :payment-failed/button               "Mettre à jour le mode de paiement"
     :payment-failed/grace-warning        (list "Votre abonnement actuel est actif jusqu'au "
                                                [:b "{{subscription-end}}"]
                                                ". Si vous ne payez pas les frais d'abonnement avant cette date, votre compte sera ramené au forfait gratuit. "
                                                "Vous pourrez toujours accéder, modifier, supprimer et partager vos données.")

     :feedback/subject                    "Question : {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} a envoyé la question {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) a envoyé la question {{title}}"

     :invitation/subject                  "Invitation à {{action}} un document dans OrgPad"
     :invitation/preheader                "{{user}} vous invite à {{action}} {{title}}. Veuillez cliquer sur le bouton ci-dessous pour l'ouvrir."
     :invitation/heading                  "{{user}} vous invite à {{action}} {{title}}"
     :invitation/body                     "OrgPad est une plateforme permettant de créer des documents visuels pour une vue d’ensemble. En cliquant sur le bouton ci-dessous, vous acceptez l’invitation et ouvrez le document."
     :invitation/button                   "Ouvrir le document"
     :invitation/accidental-email         "Si vous avez reçu cet e-mail par erreur, veuillez le supprimer. Si vous recevez ces e-mails à plusieurs reprises, vous pouvez "
     :invitation/block-user               "bloquer les invitations de {{user}}"
     :invitation/block-all                "bloquer toutes les invitations"

     :contact-user/subject                "Vous recevez un message via OrgPad"
     :contact-user/preheader              "Message de {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) vous contacte via OrgPad"
     :contact-user/body                   (str "Cet e-mail vous est envoyé par nos soins, car nous ne partageons jamais votre adresse e-mail. "
                                               "Vous pouvez répondre directement à ce message ou écrire à {{reply-to}}.")
     :contact-user/unsolicited-info       "Si le message n'est pas sollicité, vous pouvez "
     :contact-user/block-user             "bloquer tous les messages de {{user}}"
     :contact-user/block-all              "bloquer tous les messages provenant de toutes les personnes sur OrgPad."

     :blog/rss-description                "Les dernières nouvelles, mises à jour et discussions techniques autour d’OrgPad."

     :newsletter-2024-summer/subject      "Mise à jour estivale d'OrgPad"
     :newsletter-2024-summer/preheader    "Découvrez les dernières mises à jour de notre application, notre nouveau blog, les mesures de confidentialité améliorées et bien plus encore !"
     :newsletter-2024-summer/introduction "Nous sommes de retour avec une nouvelle newsletter après une pause d'un an !"
     :newsletter-2024-summer/heading      "Vous trouverez dans cette newsletter :"
     :newsletter-2024-summer/body         (list [:li "Quoi de neuf dans l'application depuis le début de l'année ?"]
                                                [:li "Que trouverez-vous sur notre nouveau blog ?"]
                                                [:li "Comment protégeons-nous votre vie privée et vos données ?"]
                                                [:li "Comment nous avons mis à jour les conditions générales pour vous simplifier la vie ?"]
                                                [:li "Pourquoi rejoindre notre communauté ?"])
     :newsletter-2024-summer/button       "Lire la newsletter"
     :newsletter-2024-summer/closing      "Nous avons hâte de découvrir vos idées !"}))