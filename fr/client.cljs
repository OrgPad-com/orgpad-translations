(ns orgpad.client.i18n.dicts.fr
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.fr :as fr]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  "A dictionary map from keywords to the corresponding French texts."
  (merge
    fr/dict
    {:address/company                                 "Nom de l'entreprise"
     :address/ico                                     "N° TVA"
     :address/street                                  "Rue"
     :address/street-number                           "Numéro"
     :address/postal-code                             "Code postal"
     :address/city                                    "Ville"
     :address/country                                 "Pays"

     :administration/page-title                       "Administration – OrgPad"

     :attachments/allows-access-to-file               "Permet l'accès à ce fichier."
     :attachments/allows-access-to-image              "Permet l'accès à cette image."
     :attachments/no-preview                          "Aperçu non disponible."
     :attachments/all-files                           "Tous les fichiers"
     :attachments/used-files                          "Fichiers dans OrgPage"
     :attachments/unused-files                        "Fichiers à part"
     :attachments/all-images                          "Toutes les images"
     :attachments/used-images                         "Images dans OrgPage"
     :attachments/unused-images                       "Images à part"
     :attachments/uploading-files                     "Téléchargement des fichiers …"
     :attachments/previous-attachment                 "Fichier ou image précédent(e)"
     :attachments/next-attachment                     "Fichier ou image suivant(e)"
     :attachments/display-using-microsoft-365         "Afficher avec Microsoft 365"
     :attachments/edit-filename                       "Renommer"
     :attachments/title-order                         "Par titre (ordre alphabétique)"
     :attachments/upload-order                        "Les plus récents en haut"
     :attachments/size-order                          "Les plus volumineux en haut"
     :attachments/split-used-unused                   "Grouper par présence dans OrgPage"
     :attachments/search                              "Recherche"
     :attachments/ordering                            "Tri"
     :attachments/new-version                         "Nouvelle version"
     :attachments/preserve-old-version                "Conserver l'ancienne version"
     :attachments/in-other-orgpages                   "Remplacer dans d'autres OrgPages :"

     :button/back                                     "Retour"
     :button/cancel                                   "Annuler"
     :button/close                                    "Fermer"
     :button/comment                                  "Commenter"
     :button/continue                                 "Continuer"
     :button/copied                                   "Copié"
     :button/copy                                     "Copier"
     :button/copy-link                                "Copier le lien"
     :button/create                                   "Créer"
     :button/create-tooltip                           "Créer (CTRL+ENTRÉE)"
     :button/delete                                   "Supprimer"
     :button/delete-selected                          "Supprimer la sélection"
     :button/documentation                            "Documentation"
     :button/download                                 "Télécharger"
     :button/download-all                             "Tout télécharger"
     :button/drop                                     "Déposer"
     :button/edit                                     "Éditer"
     :button/import                                   "Importer"
     :button/insert                                   "Insérer"
     :button/login                                    "Se connecter"
     :button/logout                                   "Se déconnecter"
     :button/publish                                  "Publier"
     :button/read                                     "Lire"
     :button/register                                 "S'inscrire"
     :button/register-to-save                         "S'inscrire pour sauvegarder"
     :button/remove                                   "Retirer"
     :button/reset                                    "Réinitialiser"
     :button/save                                     "Enregistrer les modifications"
     :button/save-tooltip                             "Enregistrer les modifications (CTRL+ENTRÉE)"
     :button/upload                                   "Téléverser"
     :button/upload-from-computer                     "Téléverser depuis l'ordinateur"
     :button/send                                     "Envoyer"
     :button/present                                  "Présenter"
     :button/present-tooltip                          "Démarrer la présentation (F5)"
     :button/share                                    "Partager"
     :button/start                                    "Démarrer"
     :button/exit                                     "Quitter"
     :button/show-password                            "Afficher"
     :button/hide-password                            "Masquer"

     :checkout/currency                               "Devise"
     :checkout/monthly                                "mensuel"
     :checkout/yearly                                 "annuel (économisez 15%)"
     :checkout/failed-to-init                         "Une erreur s'est produite lors du chargement du site de paiement."
     :checkout/upgrade-plan                           "Mettre à niveau le forfait"
     :checkout/professional-plan                      "Forfait professionnel"
     :checkout/school-plan                            "Forfait scolaire"
     :checkout/enterprise-plan                        "Forfait entreprise"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "École"] " ou "
                                                         [:a.link-button {:href enterprise-url} "entreprise"] " ? Contactez-nous pour une offre personnalisée."])
     :checkout/pay-with-credit-card                   "Payer par carte"
     :checkout/pay-with-wire-transfer                 "Payer par virement bancaire"
     :checkout/promo-code                             "Code promo"
     :checkout/try-for-free                           "Essayer gratuitement"
     :checkout/activate-now                           "Activer maintenant"
     :checkout/continue-for-free                      "Continuer gratuitement"

     :code-lang/none                                  "Aucun langage"
     :code-lang/multiple                              "Langages multiples"

     :dashboard/confirm-delete                        [:<> [:b "Supprimer définitivement"] " cette OrgPage ?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Connectez-vous"] " ou "
                                                         [:a {:href register-url} "inscrivez-vous"]
                                                         " pour créer de nouvelles OrgPages."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "L'abonnement de votre école " name " a expiré le " subscription-expired ". "
                                                         "Pour le renouvellement, contactez votre administration. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Plus d'informations"] " sur la réduction de 95% pour les écoles."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Obtenez OrgPad pour votre école sans limites avec une réduction de 95%. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Plus d'informations."]])
     :dashboard/owned-orgpages                        "Mes OrgPages"
     :dashboard/public-orgpages                       "OrgPages publiées"
     :dashboard/shared-orgpages                       "OrgPages partagées avec moi"
     :dashboard/usergroup-orgpages                    "OrgPages de {usergroup/name}"
     :dashboard/help-or-inspiration-button            "Voici !"
     :dashboard/new-domain                            [:<> "Utilisez le nouveau domaine " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Plus d'informations dans OrgPage " [:a {:href "https://orgpad.info/s/new-domain"} "Changements dans OrgPad et nouveau domaine"] "."]

     :dashboard-filter/filter                         "Filtrer les OrgPages"
     :dashboard-filter/ordering                       "Trier les OrgPages"
     :dashboard-filter/filter-and-ordering            "Filtrer et trier les OrgPages"
     :dashboard-filter/title                          "Filtrer et trier les OrgPages affichées"
     :dashboard-filter/ordering-label                 "Ordre des OrgPages"
     :dashboard-filter/title-order                    "Par titre (ordre alphabétique)"
     :dashboard-filter/creation-time-order            "Les plus récentes en haut"
     :dashboard-filter/last-modified-order            "Dernière modification en haut"
     :dashboard-filter/most-viewed-order              "Les plus consultées en haut"
     :dashboard-filter/search-tags                    "Rechercher des tags"

     :embedding-code/code                             "Code"
     :embedding-code/description                      "Intégrez l'OrgPage dans un site web ou une autre application."

     :error/orgpage-access-denied                     "Vous n'avez pas accès à cette OrgPage. Essayez de vous connecter."
     :error/usergroup-access-denied                   "Droits d'édition de l'équipe refusés."
     :error/administration-access                     "Accès à l'administration refusé."
     :error/creation-unauthorized                     "Connectez-vous pour créer des OrgPages."
     :error/deleting-denied                           "Suppression de l'OrgPage refusée."
     :error/email-already-used                        "E-mail déjà utilisé."
     :error/email-not-registered                      "Aucun compte avec cet e-mail."
     :error/email-missing-mx-record                   "Aucun serveur de messagerie trouvé pour ce domaine."
     :error/email-invalid                             "Ce n'est pas un e-mail."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "OrgPage incorrecte" (when id " {orgpage/id}")
                                                             ". Lien mal copié ?"))
     :error/incorrect-link                            "Lien incorrect. Connectez-vous ou ouvrez le bon lien."
     :error/incorrect-password                        "Mot de passe incorrect."
     :error/incorrect-profile-id                      "Lien de profil incorrect. Lien mal copié ?"
     :error/lost-permission                           "Accès perdu à cette OrgPage."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "E-mails sans compte : " emails))
     :error/name-already-used                         "Nom déjà utilisé"
     :error/name-not-valid                            "Utilisez au moins 5 caractères"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "L'OrgPage " (when title "« {orgpage/title} »") " a été supprimée."))
     :error/owner-of-orgpage                          "La personne est déjà propriétaire de cette OrgPage."
     :error/profile-not-found                         "Profil non trouvé."
     :error/unknown-error                             "Erreur inconnue, veuillez réessayer."
     :error/unknown-id                                "OrgPage inconnue."
     :error/unknown-login-or-email                    "E-mail ou identifiant d'équipe inconnu."
     :error/unknown-usergroup                         "L'équipe a été supprimée"
     :error/upload-failed                             "Échec du téléchargement de l'OrgPage : « {orgpage/title} »"

     :export/show                                     "Exporter l'OrgPage"
     :export/title                                    "Exporter {orgpage/title}"
     :export/info                                     "Choisissez le format dans lequel cette OrgPage sera exportée."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " format utilisé par OrgPad"]
     :export/html                                     "Un fichier HTML linéaire"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " format"]
     :export/generate                                 "Générer l'exportation"

     :feedback/ask-question                           "Poser une question"
     :feedback/hide-button                            "Masquer le bouton définitivement"
     :feedback/dialog-title                           "Contacter les développeurs d'OrgPad"
     :feedback/description                            [:<> "Si vous avez besoin d'aide ou rencontrez un problème, faites-le nous savoir – "
                                                       [:b "les développeurs d'OrgPad"] ". "
                                                       "Nous accueillons également toutes suggestions d'amélioration. "
                                                       "Nous vous répondrons par e-mail dès que possible."]
     :feedback/languages                              "Vous pouvez nous écrire en anglais, tchèque et allemand."
     :feedback/contact-when-problem-persists          [:<> " Si le problème persiste, contactez-nous à "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Virement bancaire"
                                                             (when currency
                                                               (str " en " (name currency))) " pour "
                                                             "l'abonnement annuel"
                                                             (if (= tier "standard")
                                                               " Standard"
                                                               " Professionnel")
                                                             " forfait"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Écrivez-nous votre " [:b "adresse de facturation"] ", toute information supplémentaire pour la facture."
                                                         " Nous vous contacterons bientôt à votre adresse e-mail " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Je veux acheter un forfait pour mon " (case org-type
                                                                                                      :feedback/school-plan "école"
                                                                                                      :feedback/enterprise-plan "entreprise"
                                                                                                      "organisation")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Utilisez ce formulaire pour contacter un représentant d'OrgPad s.r.o."
                                                         " Nous vous contacterons bientôt au numéro de téléphone ou à l'adresse e-mail que vous avez fournie (" email
                                                         "). Vous pouvez aussi nous appeler au "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Mettre à niveau mon abonnement au forfait Professionnel"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Écrivez-nous comment nous devons modifier votre abonnement existant et toute information supplémentaire."
                                                         " Nous vous contacterons bientôt à votre adresse e-mail " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Changer ma période de facturation en " (if (= period "yearly")
                                                                                                       "annuelle"
                                                                                                       "mensuelle") " facturation"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Le changement aura lieu après la fin de la période de facturation en cours."
                                                         " Il y a une réduction de 15% pour la facturation annuelle."
                                                         " Nous vous contacterons bientôt à votre adresse e-mail " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "École"
                                                               :feedback/enterprise-plan "Entreprise"
                                                               "Organisation") " nom"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Poste au sein de " (case org-type
                                                                                   :feedback/school-plan "l'école"
                                                                                   :feedback/enterprise-plan "l'entreprise"
                                                                                   "l'organisation")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "Site web de l'école"
                                                               :feedback/enterprise-plan "Site web de l'entreprise"
                                                               "Site web de l'organisation")))

     :fragment/fragment                               "Emplacement"
     :fragment/text-id                                "Identifiant"
     :fragment/title                                  "Titre"
     :fragment/create                                 "Créer un emplacement"
     :fragment/create-tooltip                         "TAB ; maintenez SHIFT pour copier l'emplacement sélectionné"
     :fragment/remove                                 "Supprimer l'emplacement"
     :fragment/share                                  "Copier un lien vers cet emplacement"
     :fragment/text-id-required                       "Identifiant requis."
     :fragment/text-id-already-used                   "Identifiant déjà utilisé."
     :fragment/closed-books                           "Cellules fermées ; CTRL+clic pour sélectionner"
     :fragment/hidden-books                           "Cellules cachées ; CTRL+clic pour sélectionner"
     :fragment/opened-pages                           "Pages ouvertes ; CTRL+clic pour sélectionner"
     :fragment/focused-books                          "Cellules affichées dans la caméra ; CTRL+clic pour sélectionner"
     :fragment/shown-books                            "Cellules révélées ; CTRL+clic pour sélectionner"

     :info/uploading-attachments                      [:i18n/plural "Téléchargement de {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "fichiers" "fichier" "fichiers"]}]
     :info/uploading-images                           [:i18n/plural "Téléchargement de {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "images" "image" "images"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Échec du téléchargement de {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "images" "image" "images"]}]
                                                          "Échec du téléchargement d'au moins une image."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} Youtube {info/num-youtubes} non trouvés."
                                                       {:info/num-youtubes [:info/count "vidéos" "vidéo" "vidéos"]}]
     :info/uploading-attachments-failed               "Échec du téléchargement des fichiers."
     :info/presentation-link-copied                   "Le lien pour cette présentation a été copié."
     :info/max-orgpages-exceeded                      "Vous avez dépassé le nombre maximal d'OrgPages autorisées pour votre forfait."
     :info/storage-exceeded                           "Espace de stockage insuffisant pour télécharger ce fichier ou cette image."
     :info/attachments-too-large                      (str "Impossible de téléverser {upload/total-size} en un seul envoi. "
                                                           "La taille maximale de toutes les pièces jointes téléversées est de 500 Mo.")
     :info/drop-info                                  "Déposez vos fichiers ou images ici pour les télécharger."
     :info/audio-not-allowed                          "L'audio n'est pas autorisé sur cet appareil ou navigateur."
     :info/audio-not-supported                        "L'audio n'est pas pris en charge sur cet appareil ou navigateur."

     :import/another-format                           [:<> "Si vous souhaitez importer vos données existantes dans un autre format, contactez-nous à "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Importer vos données"
     :import/google-docs                              "Pour insérer des données de Microsoft Office ou Google Docs, collez-les simplement dans une OrgPage."
     :import/supported-formats                        "Nous prenons désormais en charge ces formats :"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exporté en fichier .vsdx."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " fichier."]

     :ios/install-info                                "Installer l'application OrgPad"
     :ios/share-button                                "1. Ouvrir"
     :ios/add-to-home-screen                          "2. Appuyer"

     :lang/cs                                         "Tchèque"
     :lang/de                                         "Allemand"
     :lang/en                                         "Anglais"
     :lang/es                                         "Espagnol"
     :lang/fr                                         "Français"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polonais"
     :lang/ru                                         "Russe"
     :lang/uk                                         "Ukrainien"

     :lang-select/tooltip                             "Langue de l'application (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "Vous ne trouvez pas votre langue ? Aidez-nous en "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "traduisant OrgPad"] "."]

     :limit/of                                        " sur "
     :limit/orgpages                                  " OrgPages"
     :limit/people                                    " personnes"
     :limit/teams                                     " équipes"
     :limit/team-members                              " membres"
     :limit/orgpages-tooltip                          (str "Dans la version gratuite, le nombre d'OrgPages est limité."
                                                           " Passez à un forfait supérieur pour créer plus d'OrgPages.")
     :limit/shares-tooltip                            (str "Le nombre de personnes avec lesquelles vous pouvez partager cette OrgPage directement est limité."
                                                           " Passez au forfait Professionnel pour partager avec un nombre illimité de personnes.")
     :limit/teams-tooltip                             (str "Dans la version Standard, le nombre d'équipes possédées est limité."
                                                           " Passez au forfait Professionnel pour créer un nombre illimité d'équipes.")
     :limit/teams-members-tooltip                     (str "Dans la version Standard, chaque équipe a un nombre limité de membres."
                                                           " Passez au forfait Professionnel pour créer un nombre illimité d'équipes.")
     :limit/attachments-size                          (str "La taille totale de tous les fichiers et images téléchargés est limitée"
                                                           " et peut être augmentée en passant à un forfait supérieur.")
     :limit/attachments-size-clickable                (str "La taille totale de tous les fichiers et images téléchargés est limitée."
                                                           " Cliquez pour augmenter votre limite en passant à un forfait supérieur.")
     :limit/attachments-size-try-out                  (str "La taille totale de tous les fichiers et images téléchargés est limitée."
                                                           " Pour augmenter votre limite à 100 Mo, cliquez pour créer un compte.")

     :limits/max-orgpages                             "documents"
     :limits/max-storage                              "stockage"
     :limits/max-teams                                "équipes"
     :limits/of                                       " sur"
     :limits/max-team-members                         "membres"
     :limits/priority-support                         "support prioritaire"

     :link-panel/flip                                 "Inverser la direction"
     :link-panel/insert-unit-in-middle                "Insérer une cellule au milieu"
     :link-panel/delete                               "Supprimer le lien"
     :link-panel/change-link-style                    "Changer le style de ce lien ; maintenez SHIFT pour définir le courant, maintenez CTRL pour copier sur la valeur par défaut"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Calcul des tailles de toutes les cellules, " [:span#autoresize-num-units num-units] " restantes …"])
     :loading/initial-layout                          "Amélioration de la disposition initiale …"
     :loading/restoring-opened-pages                  "Restauration de la position des pages ouvertes …"
     :loading/getting-orgpage                         "Téléchargement d'une OrgPage depuis le serveur …"
     :loading/getting-dashboard                       "Téléchargement de la liste des OrgPages disponibles depuis le serveur …"
     :loading/getting-website                         "Téléchargement d'un site web depuis le serveur …"
     :loading/getting-blog                            "Téléchargement du blog depuis le serveur …"
     :loading/uploading-orgpage                       "Téléchargement d'une OrgPage sur le serveur …"
     :loading/ws-init                                 "Mise en place de la connexion au serveur …"
     :loading/ws-closed                               "Connexion au serveur fermée, tentative de reconnexion. Si le problème persiste, rechargez la page."
     :loading/administration                          "Chargement des données d'administration …"
     :loading/profile                                 "Chargement du profil …"
     :loading/style                                   "Chargement des styles …"
     :loading/start-trial                             "Démarrage de l'essai de 7 jours…"
     :loading/uploading-attachments                   "Téléchargement des pièces jointes sur le serveur …"

     :login/continue-with-email                       "Continuer avec l'e-mail"
     :login/continue-with-facebook                    "Continuer avec Facebook"
     :login/continue-with-google                      "Continuer avec Google"
     :login/continue-with-microsoft                   "Continuer avec Microsoft"
     :login/continue-with-cuni                        "Continuer avec l'Université Charles"
     :login/email-sent                                "E-mail envoyé. Cliquez sur le lien dans l'e-mail."
     :login/forgotten-password                        "Mot de passe oublié"
     :login/forgotten-password-email-resent           "E-mail de réinitialisation du mot de passe déjà envoyé."
     :login/forgotten-password-description            "Recevez un lien de réinitialisation du mot de passe par e-mail (valable 24h)."
     :login/forgotten-password-error                  [:<> "Cette adresse e-mail est bloquée par vous. Débloquez-la en cliquant sur Se désabonner dans n'importe quel e-mail d'OrgPad, ou envoyez-nous un e-mail à "
                                                       company/support-email-app-link " depuis cette adresse e-mail."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Nouveau sur OrgPad ? " [:a.link-button {:href route} "Inscrivez-vous"]])
     :login/options                                   "Choisissez un autre moyen de vous connecter"
     :login/send-reset-link                           "Envoyer le lien de réinitialisation"
     :login/wrong-email-or-password                   "E-mail ou mot de passe incorrect."

     :markdown/title                                  "Le texte collé est-il formaté en Markdown ?"
     :markdown/info                                   "Un formatage Markdown a été détecté dans votre contenu collé. Voulez-vous appliquer ce formatage ?"
     :markdown/remember                               "Se souvenir jusqu'au rechargement"
     :markdown/insert                                 "Utiliser le formatage Markdown"
     :markdown/ignore                                 "Conserver l'original"

     :meta/title                                      "Nom de l'OrgPage"
     :meta/orgpage-thumbnail                          "Image de l'OrgPage"
     :meta/automatic-screenshot-start                 "Capture d'écran générée automatiquement pour "
     :meta/automatic-screenshot-refresh               "Mise à jour cinq minutes après chaque modification."
     :meta/custom-thumbnail                           "Image personnalisée téléchargée de taille 1360x768."
     :meta/upload-thumbnail                           "Télécharger une image personnalisée"
     :meta/thumbnail-upload-failed                    "Échec du téléchargement de l'image."
     :meta/description                                "Description"
     :meta/new-tags                                   "Tag"
     :meta/tag-too-long                               (str "La longueur maximale d'un tag est de " common-orgpage/max-tag-length " caractères.")
     :meta/too-many-tags                              (str "Au maximum " common-orgpage/max-tags " tags autorisés.")
     :meta/info                                       (str "Ces détails seront affichés dans la liste des OrgPages, "
                                                           "lors de l'intégration d'une OrgPage, et lors de son partage sur les réseaux sociaux.")
     :meta/info-in-share-orgpage                      "Avant de pouvoir partager cette OrgPage, le titre doit être défini."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Déplacer les {selection/num-units} {selection/units-label} sélectionnés "
                                                                         "et {selection/num-links} {selection/links-label} dans une nouvelle OrgPage "
                                                                         "avec les informations suivantes. Dans l'OrgPage actuelle, ces cellules et liens "
                                                                         "seront remplacés par une seule cellule, contenant la nouvelle OrgPage à l'intérieur.")
                                                       {:selection/units-label [:selection/num-units "cellules" "cellule" "cellules"]
                                                        :selection/links-label [:selection/num-links "liens" "lien" "liens"]}]
     :meta/info-title                                 "Informations – {meta/title}"
     :meta/info-title-only                            "Nommer l'OrgPage"
     :meta/details                                    "Détails"
     :meta/preview                                    "Aperçu"
     :meta/init-fragments                             "Emplacement de départ"
     :meta/init-fragments-info                        (str "Vous pouvez choisir l'emplacement de départ lors de l'ouverture de l'OrgPage. "
                                                           "Un emplacement de départ différent peut être spécifié pour les appareils mobiles.")
     :meta/desktop-init-fragment                      "Emplacement du bureau"
     :meta/mobile-init-fragment                       "Emplacement mobile"
     :meta/everything-closed                          "Toutes les cellules fermées"
     :meta/everything-closed-lowercase                "toutes les cellules fermées"
     :meta/more-details                               "Plus d'informations"
     :meta/move-to-new-orgpage-title                  "Déplacer vers {meta/title}"
     :meta/move-to-new-orgpage                        "Déplacer vers une nouvelle OrgPage"

     :microsoft-365-permission/title                  "Autoriser Microsoft 365 à accéder à ce document ?"
     :microsoft-365-permission/info                   [:<> "Le document Office peut être affiché à l'aide de Microsoft 365."
                                                       " En cliquant sur accepter, votre document sera partagé avec Microsoft."
                                                       " Consultez " [:a.link-button {:href   "https://www.microsoft.com/fr-fr/servicesagreement/"
                                                                                      :target "_blank"}
                                                                      "l'accord de service Microsoft"] "."]
     :microsoft-365-permission/allow                  "Accorder l'autorisation à Microsoft 365"

     :notifications/info                              "Choisissez les e-mails qu'OrgPad vous envoie. Nous vous informerons toujours des changements importants."
     :notifications/any-email                         "Tout e-mail d'OrgPad"
     :notifications/email-verification                "Vérification de l'e-mail lors de l'inscription, liens pour réinitialiser le mot de passe et informations de paiement essentielles"
     :notifications/monthly-newsletter                "Newsletter mensuelle avec les mises à jour et le développement récent d'OrgPad"
     :notifications/messages                          "Recevoir des messages d'autres personnes"
     :notifications/blocked-people                    "Personnes spécifiquement bloquées :"
     :notifications/receipts                          "Reçus lorsque votre abonnement est automatiquement renouvelé"
     :notifications/receive-invitations               "Recevoir des invitations d'autres personnes"
     :notifications/unblock-user                      "Débloquer cette personne"

     :onboarding/openable-units                       "Seules les cellules surélevées avec des ombres peuvent être ouvertes."
     :onboarding/zoom                                 "Faire défiler pour zoomer"
     :onboarding/drag-canvas                          "Déplacer en faisant glisser"
     :onboarding/open-units                           "Les cellules avec des ombres ont du contenu"

     :orgpage/creating-preview                        "Création de l'aperçu …"
     :orgpage/change-information                      "Modifier les informations"
     :orgpage/copy-orgpage                            "Copier dans une nouvelle OrgPage"
     :orgpage/delete-orgpage                          "Supprimer l'OrgPage"
     :orgpage/detail                                  "Détail"
     :orgpage/share-tooltip                           "Partager cette OrgPage avec d'autres"
     :orgpage/share-orgpage                           "Partager l'OrgPage"
     :orgpage/show-information                        "Afficher les informations"
     :orgpage/zoom-in                                 "Zoom avant"
     :orgpage/zoom-out                                "Zoom arrière"
     :orgpage/create-unit-double-click                "Double-cliquez pour créer une cellule."
     :orgpage/create-unit-hold-or-double-tap          "Maintenez ou double tapez pour créer une cellule."
     :orgpage/switch-to-edit                          "Passer en mode édition."
     :orgpage/untitled                                "OrgPage sans titre"
     :orgpage/title                                   "Titre de l'OrgPage"
     :orgpage/untitled-unit                           "Cellule sans titre"
     :orgpage/untitled-path                           "Présentation sans titre"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "étapes" "étape" "étapes"]}]
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (page {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (page {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Une copie disponible sous "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Changer la couleur de cette OrgPage"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Cette OrgPage est automatiquement partagée avec " label " pour "
                                                         (case permission
                                                           :permission/view "lecture"
                                                           :permission/comment "commentaire"
                                                           :permission/edit "édition"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Cliquez ici"]
                                                         " pour annuler le partage."])

     :orgpage-placement/activate                      "Voir ici"

     :orgpage-print/displayed                         "Affiché"
     :orgpage-print/displayed-info                    "Tout ce qui se trouve dans le rectangle sera imprimé exactement comme vous le voyez."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPage imprimée avec succès dans un fichier "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "L'impression de ce PDF devrait prendre environ {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Tout fermé"
     :orgpage-print/everything-closed-info            "Dans le PDF imprimé, toutes les cellules sont affichées fermées."
     :orgpage-print/fragment                          "Emplacement"
     :orgpage-print/fragment-info                     "Le PDF imprimé affiche l'emplacement sélectionné."
     :orgpage-print/gray                              "Gris"
     :orgpage-print/landscape                         "Paysage"
     :orgpage-print/orientation                       "Orientation"
     :orgpage-print/path-info                         [:i18n/plural " avec {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "pages" "page" "pages"]}]
     :orgpage-print/portrait                          "Portrait"
     :orgpage-print/presentation                      "Présentation"
     :orgpage-print/presentation-info                 "Le PDF imprimé affiche la présentation sélectionnée."
     :orgpage-print/print                             "Imprimer en PDF"
     :orgpage-print/size                              "Taille"
     :orgpage-print/started                           (str "Nous imprimons cette OrgPage en PDF. Cela devrait prendre environ {orgpage-print/estimated-time}."
                                                           " Une fois terminé, il sera disponible en tant que fichier.")
     :orgpage-print/title                             "Titre du PDF"
     :orgpage-print/type                              "Type"
     :orgpage-print/watermark                         "Filigrane"
     :orgpage-print/watermark-info                    "Le PDF imprimé contiendra un filigrane OrgPad."
     :orgpage-print/white                             "Fond blanc"

     :orgpage-stats/number-of-files                   "Nombre de fichiers"
     :orgpage-stats/number-of-images                  "Nombre d'images"
     :orgpage-stats/number-of-links                   "Nombre de liens"
     :orgpage-stats/number-of-units                   "Nombre de cellules"

     :org-role/student                                "Étudiant"
     :org-role/teacher                                "Enseignant"
     :org-role/employee                               "Employé"
     :org-role/admin                                  "Administrateur"

     :panel/toggle-side-panel                         "Menu latéral"
     :panel/create-orgpage                            "Nouvelle OrgPage"
     :panel/logo-tooltip                              "Aller à l'accueil"
     :panel/edit-info                                 "Passez en mode édition pour créer et supprimer des cellules et des liens, modifier le contenu, et plus encore (F7)"
     :panel/comment-info                              (str "Passez en mode commentaire où vous pouvez créer, éditer et supprimer vos cellules et liens, "
                                                           "mais vous ne pouvez pas modifier ou supprimer les cellules ou liens d'autres personnes. "
                                                           "Cependant, vous pouvez lier des cellules qui ne vous appartiennent pas. (F7)")
     :panel/read-info                                 "Passez en mode lecture où rien ne peut être modifié mais la navigation est plus facile (F6)"
     :panel/undo-deletion                             "Annuler la suppression"
     :panel/undo-deletion-info                        [:i18n/plural "Restaurer la suppression de {delete/num-units} {delete/unit-label} et {delete/num-links} {delete/link-label} (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "cellules" "cellule" "cellules"]
                                                                :link-label [:delete/num-links
                                                                             "liens" "lien" "liens"]}]
     :panel/refresh                                   "Rafraîchir"
     :panel/switch-style                              "Changer le style des nouvelles cellules et liens ; faites glisser pour créer une nouvelle cellule"
     :panel/profile                                   "Profil"
     :panel/settings                                  "Paramètres"
     :panel/usergroups                                "Équipes"
     :panel/stats                                     "Statistiques"
     :panel/administration                            "Administration"
     :panel/ios-install-info                          "Installer l'application"
     :panel/upload-attachment                         "Insérer des images ou des fichiers dans de nouvelles cellules"
     :panel/selection-mode                            "Démarrer la sélection"
     :panel/search                                    "Rechercher (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Révéler {panel/num-hidden-book-ids} {panel/unit-label} caché(s) dans l'emplacement actuel"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids
                                                                            "cellules" "cellule" "cellules"]}]

     :password/too-short                              "Au moins 8 caractères requis"
     :password/different-passwords                    "Les mots de passe ne correspondent pas"

     :password-reset/back-to-list                     "Retour à la liste"
     :password-reset/change-password                  "Changer le mot de passe"
     :password-reset/set-password                     "Définir le mot de passe"
     :password-reset/has-password                     "Votre compte a un mot de passe défini."
     :password-reset/without-password                 "Aucun mot de passe n'est encore défini car des comptes liés ont été utilisés pour la connexion."
     :password-reset/invalid-link                     "Lien invalide, peut-être plus ancien que 24 heures. Veuillez demander à renvoyer l'e-mail."
     :password-reset/description                      "Définissez votre nouveau mot de passe."
     :password-reset/enter-current-and-new-password   "Entrez votre mot de passe actuel et le nouveau."
     :password-reset/enter-new-password               "Entrez le nouveau mot de passe."

     :path/add-step                                   "Étape"
     :path/add-step-tooltip                           "ENTRÉE ou TAB ; maintenez SHIFT pour copier la caméra"
     :path/hidden-ops                                 " et {path/num-hidden} de plus"
     :path/title                                      "Nom de la présentation"
     :path/default-title                              "Présentation {path/num-paths}"
     :path/copy                                       "Copier dans une nouvelle présentation"
     :path/copy-suffix                                "copie"
     :path/add-audio                                  "Lier un audio à l'étape"
     :path/remove-audio                               "Dissocier l'audio de l'étape"

     :paths/create-new-path                           "Créer une présentation"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Supprimer la présentation " [:b title] " ?"])
     :paths/help                                      "Sélectionnez des cellules pour modifier l’affichage ; consultez le guide pour plus de détails."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Actuellement en " [:b tier " forfait"] ", valable jusqu'au " [:b end-date] "."
                                                         (if autorenewal
                                                           " L'abonnement sera automatiquement renouvelé à la fin de la période de paiement."
                                                           " L'abonnement expirera à la fin de la période de paiement.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Votre " [:b tier " forfait"] " a expiré le " [:b end-date] " car votre paiement de renouvellement a échoué."
                                                         " Si vous régularisez votre paiement, votre abonnement sera automatiquement prolongé."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " à " [:b tier " forfait"] " de " name "."])
     :payments/free-tier-info                         [:<> "OrgPad utilisé en " [:b "version gratuite,"] " sans aucun paiement."]
     :payments/no-teams                               "Aucune équipe en version gratuite."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Pour " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "mettre à niveau"] " ou "])
                                                         [:a.link-button {:href period-url} "changer votre période de facturation"]
                                                         ", contactez-nous."])
     :payments/choose-plan                            "Choisir un forfait"
     :payments/manage-plan                            "Gérer le forfait"
     :payments/billing-address                        "Adresse de facturation"
     :payments/billing-address-info                   (str "L'adresse de facturation saisie sera utilisée sur toutes les nouvelles factures."
                                                           " Les factures récentes sont également automatiquement mises à jour.")
     :payments/receipt-label                          "Reçu {receipt/date-range}"
     :payments/customer-portal-failed                 "Une erreur s'est produite lors du chargement du site de gestion du forfait."

     :pending-activation/email-already-used           "E-mail déjà utilisé sur un autre compte."
     :pending-activation/email-not-recieved           "Pas d'e-mail ? Renvoyez ou modifiez ci-dessous."
     :pending-activation/email-sent                   "E-mail d'activation envoyé. "
     :pending-activation/instructions                 "Presque terminé ! Activez votre compte en un clic sur le lien que nous vous avons envoyé par e-mail."
     :pending-activation/resend                       "Renvoyer l'e-mail d'activation"

     :permission/admin                                "Peut partager et supprimer"
     :permission/admin-tooltip                        "Peut également modifier qui a accès au document."
     :permission/edit                                 "Peut éditer"
     :permission/edit-tooltip                         "Peut effectuer toutes les modifications sur l'OrgPage."
     :permission/comment                              "Peut commenter"
     :permission/comment-tooltip                      (str "Peut créer de nouvelles cellules possédées, les connecter et les modifier. "
                                                           "Ne peut pas modifier le reste de l'OrgPage.")
     :permission/view                                 "Peut lire"
     :permission/view-tooltip                         "Peut lire l'OrgPage sans effectuer de modifications."

     :presentation/presentation                       "Présentation"
     :presentation/step                               "Étape"
     :presentation/present                            "Démarrer la présentation"
     :presentation/slideshow                          "Lire automatiquement les étapes"
     :presentation/step-duration                      "Durée de l'étape en secondes"
     :presentation/loop-slideshow                     "Répéter à la fin"
     :presentation/respect-audio-track                "Durée de l'étape selon la piste audio"
     :presentation/stop-slideshow                     "Arrêter la lecture automatique des étapes"
     :presentation/exit-tooltip                       "Quitter la présentation"
     :presentation/play-audio                         "Lire l'audio pour cette étape"
     :presentation/pause-audio                        "Mettre l'audio en pause"
     :presentation/share-presentation                 "Partager cette présentation avec d'autres."

     :pricing-popup/orgpages-exceeded-title           "Vous ne pouvez pas créer plus d'OrgPages en version gratuite"
     :pricing-popup/orgpages-exceeded                 "Vous devez mettre à niveau votre forfait."
     :pricing-popup/storage-exceeded-title            "Pas assez d'espace pour télécharger {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Il ne reste que " [:b space-left " restants"] " dans votre stockage."
                                                         " Vous pouvez mettre à niveau votre forfait pour étendre votre stockage."])
     :pricing-popup/num-shared-limit-reached-title    "Vous ne pouvez pas partager cette OrgPage avec plus de personnes"
     :pricing-popup/num-shared-limit-reached-common   "Le nombre maximum de personnes partageant cette OrgPage a été atteint."
     :pricing-popup/num-shared-limit-reached          [:<> " Pour ajouter plus de personnes, vous devez passer au "
                                                       [:b "forfait Professionnel"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Le propriétaire de cette OrgPage " owner " doit passer au "
                                                         [:b "forfait Professionnel"] " pour ajouter plus de personnes."])
     :pricing-popup/enable-teams-title                "Mettez à niveau votre forfait pour gérer les équipes"
     :pricing-popup/enable-teams                      [:<> "Les équipes regroupent les personnes, ce qui simplifie la collaboration et le partage des OrgPages."
                                                       " Cette fonctionnalité n'est activée que dans la " [:b "version Standard"] " ou supérieure."]
     :pricing-popup/teams-limit-reached-title         "Mettez à niveau votre forfait pour créer plus d'équipes"
     :pricing-popup/teams-limit-reached               "La limite du nombre d'équipes a été atteinte pour votre forfait."
     :pricing-popup/team-members-limit-reached-title  "Vous ne pouvez pas ajouter plus de membres à {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Le nombre maximum de membres de l'équipe a été atteint."
     :pricing-popup/team-members-limit-reached        [:<> " Pour ajouter plus de membres, vous devez passer au "
                                                       [:b "forfait Professionnel"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " Le propriétaire de cette équipe " owner " doit passer au "
                                                         [:b "forfait Professionnel"] " pour ajouter plus de membres."])
     :pricing-popup/try-out-share-title               "Inscrivez-vous pour partager cette OrgPage"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Il ne reste que " [:b space-left " restants"] " dans votre stockage."])
     :pricing-popup/free-account-info                 "En vous inscrivant, vous obtenez gratuitement :"
     :pricing-popup/free-limit                        "jusqu'à trois OrgPages,"
     :pricing-popup/free-storage                      "jusqu'à 100 Mo de stockage,"
     :pricing-popup/free-share                        "partage de votre travail avec d'autres."
     :pricing-popup/free-account-info2                "Créez votre compte en quelques clics."

     :pricing-popup/register-to-comment               "Inscrivez-vous pour ajouter vos commentaires"
     :pricing-popup/register-to-comment-info          (str "Les cellules de commentaire afficheront votre nom et votre photo de profil."
                                                           " Pour cela, vous devez d'abord créer votre compte.")

     :pricing-popup/print-watermark-title             "Améliorez votre offre pour supprimer les filigranes"
     :pricing-popup/print-watermark-info              (str "L'impression sans filigranes OrgPad.info n'est possible"
                                                           " que dans les forfaits professionnel, scolaire et entreprise.")

     :profile/open-contact-dialog                     "Envoyer un message"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Contacter " first-name " " last-name)
                                                          "Contacter cette personne"))
     :profile/contact-dialog-info                     (str "Comme nous ne partageons pas les adresses e-mail des autres personnes dans OrgPad, nous enverrons ce message pour vous. "
                                                           "Nous inclurons votre nom et votre e-mail pour fournir un contact direct.")

     :promotion/unknown                               "Code inconnu"
     :promotion/max-usages-reached                    "Utilisé trop de fois"
     :promotion/expired                               "Expiré"
     :promotion/one-year-free                         "1 an gratuit"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} gratuits"
                                                       {:promotion/days [:promotion/duration "jours" "jour" "jours"]}]
     :promotion/for-one-year                          " pour 1 an"
     :promotion/for-six-months                        " pour 6 mois"

     :props/h1                                        "Grand titre"
     :props/h2                                        "Titre moyen"
     :props/h3                                        "Petit titre"
     :props/weight-none                               "Lien normal"
     :props/strong                                    "Lien fort"
     :props/arrowhead-none                            "Pas de flèche"
     :props/single                                    "Flèche"
     :props/double                                    "Double flèche"

     :public-permission/none                          "privé."
     :public-permission/view                          "partagé avec tout le monde pour lecture."

     :registration/create-user                        "Créer un compte"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Vous avez déjà un compte ? " [:a.link-button {:href route} "Connectez-vous"]])
     :registration/options                            "Choisissez un autre moyen de vous inscrire"
     :registration/server-error                       "Erreur du serveur. Réessayez de créer le compte."
     :registration/missing-oauth-email                "{registration/service} ne nous a pas communiqué votre e-mail. Veuillez le renseigner ci-dessous."

     :search/previous-match                           "Correspondance précédente (PAGEUP)"
     :search/next-match                               "Correspondance suivante (PAGEDOWN)"
     :search/close                                    "Fermer (ESC)"
     :search/cells-with-selected-attachments          "Les cellules avec les fichiers et images sélectionnés."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Changer le style des éléments sélectionnés "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} et "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}"))
                                                                      "; maintenez SHIFT pour définir le courant, maintenez CTRL pour copier sur le courant")
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "cellules" "cellule" "cellules"]
                                                                   :link-label [:selection/num-links
                                                                                "liens" "lien" "liens"]}]

     :selection/link                                  "Connecter les cellules"
     :selection/hide-contents                         "Masquer le contenu (ESC)"
     :selection/show-contents                         "Afficher le contenu"
     :selection/force-closing                         "Masquer ce contenu lors de l'ouverture de l'emplacement (ESC)"
     :selection/step-focus-camera                     "Faites en sorte que la caméra de cette étape se centre exactement sur les cellules sélectionnées (F2 ou Q) ; maintenez SHIFT pour ajouter, ALT pour retirer."
     :selection/fragment-focus-camera                 "Faites en sorte que la caméra de l'emplacement se centre exactement sur les cellules sélectionnées (F2 ou Q) ; maintenez SHIFT pour ajouter, ALT pour retirer."
     :selection/step-show-books                       "Affichez uniquement les cellules sélectionnées dans cette étape (F3 ou W) ; maintenez SHIFT pour ajouter, ALT pour retirer."
     :selection/fragment-show-books                   "Affichez uniquement les cellules sélectionnées dans l'emplacement (F3 ou W) ; maintenez SHIFT pour ajouter, ALT pour retirer."
     :selection/force-showing                         "Révéler les cellules sélectionnées lorsqu'elles étaient précédemment cachées"
     :selection/share-units                           "Copier un lien affichant les unités sélectionnées ; maintenez SHIFT pour ouvrir les paramètres de l'emplacement à la place"
     :selection/move-to-new-orgpage                   "Déplacer vers une nouvelle OrgPage"
     :selection/change-code-lang                      "Changer la langue du code"
     :selection/copy-units-links                      "Copier les cellules et les liens dans le presse-papiers"
     :selection/flip-links                            "Inverser la direction des liens"
     :selection/delete                                "Supprimer la sélection"

     :settings/profile                                "Profil"
     :settings/payments                               "Paiements"
     :settings/account                                "Compte"
     :settings/linked-accounts                        "Comptes liés"
     :settings/email                                  "Notifications"
     :settings/account-description                    "Changez votre e-mail, mot de passe ou supprimez votre compte."
     :settings/stats-description                      "Voici quelques statistiques sur votre utilisation d'OrgPad."
     :settings/change-email                           "Changer l'e-mail"
     :settings/change-email-text                      "Entrez la nouvelle adresse e-mail. Pour des raisons de sécurité, nous devons la vérifier avant de déverrouiller le compte."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Vous vous êtes inscrit avec l'adresse e-mail " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Votre compte est " [:b " lié "] " à Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Votre compte n'est " [:b " pas lié "] " à Facebook."]
     :settings/link-fb                                "Lier Facebook"
     :settings/unlink-fb                              "Dissocier Facebook"
     :settings/account-linked-to-google               [:<> " Votre compte est " [:b " lié "] " à Google."]
     :settings/account-not-linked-to-google           [:<> " Votre compte n'est " [:b " pas lié "] " à Google."]
     :settings/link-google                            "Lier Google"
     :settings/unlink-google                          "Dissocier Google"
     :settings/account-linked-to-microsoft            [:<> " Votre compte est " [:b " lié "] " à Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> " Votre compte n'est " [:b " pas lié "] " à Microsoft."]
     :settings/link-microsoft                         "Lier Microsoft"
     :settings/unlink-microsoft                       "Dissocier Microsoft"
     :settings/account-linked-to-cuni                 [:<> " Votre compte est " [:b " lié "] " à l'Université Charles."]
     :settings/account-not-linked-to-cuni             [:<> " Votre compte n'est " [:b " pas lié "] " à l'Université Charles."]
     :settings/link-cuni                              "Lier l'Université Charles"
     :settings/unlink-cuni                            "Dissocier l'Université Charles"
     :settings/set-password-text                      " Définir un mot de passe avant de dissocier."
     :settings/linked-accounts-info                   "Liez votre compte Facebook, Google, Microsoft ou Université Charles à OrgPad pour pouvoir les utiliser pour vous connecter."
     :settings/profile-info                           "Avec les informations fournies, vous serez plus facile à trouver pour les collègues sur un projet."
     :settings/delete-account                         "Supprimer le compte"
     :settings/confirm-delete-account-question        [:<> [:b "Supprimer définitivement"] " votre compte ?"]
     :settings/confirm-delete-account-info            "Cela supprimera toutes vos OrgPages et leurs données."
     :settings/delete-account-info                    [:<> "La suppression " [:b "supprimera définitivement"] " toutes vos OrgPages et leurs données."]

     :share-orgpage/campaigns                         "Campagnes"
     :share-orgpage/copied-to-clipboard               "Copié dans le presse-papier"
     :share-orgpage/copy-template-link                "Copier le lien du modèle"
     :share-orgpage/dialog-title                      "Partager {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> "Les personnes sans compte OrgPad recevront une invitation avec un lien. "
                                                         "Après avoir ouvert le lien, elles pourront lire cette OrgPage. "
                                                         [:a.link-button create-team "Créer une équipe"]
                                                         " pour partager facilement des OrgPages avec un groupe."])
     :share-orgpage/email-found                       "Un compte OrgPad trouvé."
     :share-orgpage/email-unused                      "Aucun compte OrgPad trouvé. Envoyer une invitation par e-mail à la place."
     :share-orgpage/checking-email-address            "Vérification de l'adresse e-mail …"
     :share-orgpage/invite-for-editing                "Inviter pour l'édition"
     :share-orgpage/invite-for-viewing                "Inviter pour la lecture"
     :share-orgpage/invite-by-email                   "Souhaitez-vous les inviter par e-mail dans une langue spécifique ?"
     :share-orgpage/show-profile                      "Afficher le profil"
     :share-orgpage/links                             "Liens"
     :share-orgpage/to-read                           "pour lire"
     :share-orgpage/to-comment                        "pour commenter"
     :share-orgpage/to-edit                           "pour éditer"
     :share-orgpage/links-tooltip                     "Accorder l'accès via des liens partageables"
     :share-orgpage/template                          "Modèle"
     :share-orgpage/template-tooltip                  "Liens créant automatiquement une copie de cette OrgPage"
     :share-orgpage/template-info                     "Les personnes peuvent utiliser ce lien pour créer leurs propres copies de cette OrgPage."
     :share-orgpage/template-autoshare-none           "Ne pas partager les copies avec moi."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Partager les copies avec moi pour "
                                                             (case template-autoshare
                                                               :permission/view "lecture"
                                                               :permission/comment "commentaire"
                                                               :permission/edit "édition") "."))
     :share-orgpage/embed                             "Intégrer"
     :share-orgpage/embed-into-microsoft-teams        "Intégrer dans Microsoft Teams"
     :share-orgpage/embed-into-website                "Intégrer dans un site ou une application"
     :share-orgpage/embed-tooltip                     "Intégrer dans un site ou une application"
     :share-orgpage/new-user-or-usergroup             "Nom, e-mail ou équipe"
     :share-orgpage/link-permission-start             "Permettre aux personnes"
     :share-orgpage/link-permission-end               "cette OrgPage."
     :share-orgpage/orgpage-info                      "Infos"
     :share-orgpage/orgpage-info-tooltip              "Informations sur le propriétaire et la publication de l'OrgPage"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Cette OrgPage est partagée avec vous pour "
                                                             (case user-permission
                                                               :permission/view "lecture"
                                                               :permission/comment "commentaire"
                                                               :permission/edit "édition") "."))
     :share-orgpage/remove-yourself                   "Vous retirer"
     :share-orgpage/private-info                      "Seuls vous et les personnes avec lesquelles vous avez partagé l'OrgPage directement ou via un lien y avez accès. Chaque nouveau document est privé."
     :share-orgpage/publish-for-reading-info          "L'OrgPage est publique. Tout le monde peut la rechercher et la lire. Seuls vous ou les personnes avec qui vous avez partagé l'OrgPage pour l'édition pouvez la modifier."
     :share-orgpage/publish-permission-end            "Cette OrgPage est "
     :share-orgpage/publish                           "Publier"
     :share-orgpage/publish-confirmation              "Tout le monde pourra {orgpage/permission} cette OrgPage. Êtes-vous sûr ?"
     :share-orgpage/publish-tooltip                   "Accorder l'accès à tout le monde"
     :share-orgpage/remove-user                       "Retirer l'autorisation"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Si vous avez partagé un lien par accident, vous pouvez "
                                                         [:span.link-button reset-links "invalider tous les liens précédents"]
                                                         "."])
     :share-orgpage/shareable-link                    "Lien partageable"
     :share-orgpage/everything-closed                 "Afficher toutes les cellules fermées"
     :share-orgpage/presentation                      "Commencer par une présentation"
     :share-orgpage/fragment                          "Afficher un emplacement"
     :share-orgpage/template-link-switch              "Créer un lien modèle."
     :share-orgpage/user-not-registered               " n'est pas encore inscrit(e) sur OrgPad."
     :share-orgpage/users                             "Personnes"
     :share-orgpage/users-tooltip                     "Accorder l'accès à des personnes spécifiques"

     :side-panel/about                                "Page d'accueil"
     :side-panel/terms-and-conditions                 "Conditions générales"
     :side-panel/privacy-and-security                 "Confidentialité et sécurité"
     :side-panel/files-and-images                     "Fichiers et images"
     :side-panel/paths                                "Présentations"
     :side-panel/fragments                            "Emplacements"
     :side-panel/translate                            "Traduire"
     :side-panel/toggle-debug                         "Débogueur"
     :side-panel/help                                 "Aide"
     :side-panel/blog                                 "Blog"
     :side-panel/home                                 "Accueil"
     :side-panel/import                               "Importer"
     :side-panel/share                                "Partager"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "fichiers" "fichier" "fichiers"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "images" "image" "images"]}]
     :side-panel/num-paths                            [:i18n/plural "{side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "présentations" "présentation" "présentations"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "emplacements" "emplacement" "emplacements"]}]

     :step/closed-books                               "Cellules fermées"
     :step/everything-closed                          "Tout fermé."
     :step/hidden-books                               "Cellules cachées"
     :step/nothing-changed                            "Rien n'a changé."
     :step/opened-pages                               "Pages ouvertes"
     :step/focused-books                              "Cellules affichées dans la caméra"
     :step/shown-books                                "Cellules révélées"
     :step/switched-pages                             "Pages changées"

     :style-select/set-comment                        "Transformer en cellule de commentaire avec votre photo de profil (CTRL+,)"
     :style-select/unset-comment                      "Revenir à une cellule normale sans photo de profil (CTRL+,)"
     :style-select/set-comment-safari                 "Transformer en cellule de commentaire avec votre photo de profil (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Revenir à une cellule normale sans photo de profil (SHIFT+CMD+,)"

     :tag/public                                      "public"

     :text-field/email                                "E-mail"
     :text-field/first-name                           "Prénom"
     :text-field/last-name                            "Nom"
     :text-field/name                                 "Nom"
     :text-field/new-password                         "Nouveau mot de passe"
     :text-field/password                             "Mot de passe"
     :text-field/content                              "Contenu"
     :text-field/name-or-email                        "Nom ou e-mail"
     :text-field/subject                              "Sujet"
     :text-field/message                              "Message"
     :text-field/phone-number                         "Numéro de téléphone"
     :text-field/width                                "Largeur"
     :text-field/height                               "Hauteur"

     :translate/title                                 "Traduire l'OrgPage {orgpage/title} dans une autre langue"
     :translate/info                                  (str "Crée automatiquement une copie de cette OrgPage vous appartenant,"
                                                           " traduite de la langue source vers la langue cible."
                                                           " Vous la trouverez dans votre liste en moins d'une minute.")
     :translate/source-lang                           "Langue source"
     :translate/target-lang                           "Langue cible"
     :translate/translate                             "Traduire"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Traduction disponible sous "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :unit-editor/add-page                            "Créer une autre page (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "Supprimer cette page"
     :unit-editor/previous-page                       (str "Page précédente (PAGEUP);"
                                                           " maintenez SHIFT pour déplacer cette page vers la gauche (SHIFT+PAGEUP);"
                                                           " maintenez CTRL pour ajouter une autre page avant cette page (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "Page suivante (PAGEDOWN);"
                                                           " maintenez SHIFT pour déplacer cette page vers la droite (SHIFT+PAGEDOWN);"
                                                           " maintenez CTRL pour ajouter une autre page après cette page (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Aller à cette page"
                                                             (when can-edit "; maintenez SHIFT pour déplacer la page courante ici")))
     :unit-editor/hidden-info                         "Cliquez pour écrire"
     :unit-editor/undo                                "Annuler (CTRL+Z)"
     :unit-editor/redo                                "Rétablir (CTRL+SHIFT+Z ou CTRL+Y)"
     :unit-editor/toggle-bold                         "Gras (CTRL+B)"
     :unit-editor/toggle-italic                       "Italique (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Barré"
     :unit-editor/toggle-subscript                    "Indice (CTRL+S)"
     :unit-editor/toggle-superscript                  "Exposant (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Créer un lien (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Supprimer le lien"
     :unit-editor/set-highlighting                    "Couleur de surlignage"
     :unit-editor/selection->code                     "Convertir en code (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Liste à puces (TAB)"
     :unit-editor/toggle-list-ol                      "Liste numérotée (CTRL+O)"
     :unit-editor/indent                              "Augmenter le retrait (TAB)"
     :unit-editor/outdent                             "Diminuer le retrait (SHIFT+TAB)"
     :unit-editor/center                              "Centrer (CTRL+L)"
     :unit-editor/heading                             "Titre (CTRL+G)"
     :unit-editor/embed-pdf                           "Afficher le contenu PDF"
     :unit-editor/link-pdf                            "Remplacer le contenu PDF par son lien"
     :unit-editor/embed-office                        "Afficher le contenu du document avec Microsoft 365"
     :unit-editor/link-office                         "Remplacer le contenu du document par son lien"
     :unit-editor/embed-video                         "Afficher le lecteur vidéo"
     :unit-editor/link-video                          "Remplacer la vidéo par son lien"
     :unit-editor/embed-audio                         "Afficher le lecteur audio"
     :unit-editor/link-audio                          "Remplacer l'audio par son lien"
     :unit-editor/hyperlink->embed                    "Insérer le site web lié"
     :unit-editor/embed->hyperlink                    "Remplacer le site web intégré par son lien"
     :unit-editor/open-image-in-attachments           "Ouvrir cette image dans la liste des pièces jointes"
     :unit-editor/open-file-in-attachments            "Ouvrir ce fichier dans la liste des pièces jointes"
     :unit-editor/toggle-controls                     "Afficher les contrôles du lecteur vidéo"
     :unit-editor/toggle-autoplay                     "Lecture automatique"
     :unit-editor/toggle-muted                        "Lecture en sourdine, la lecture automatique peut être bloquée sinon"
     :unit-editor/toggle-loop                         "Lecture en boucle"
     :unit-editor/toggle-chained-size                 "Maintenir le ratio d'aspect"
     :unit-editor/insert-menu                         "Insérer"
     :unit-editor/insert-image                        "Image"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Télécharger une image depuis votre appareil."
     :unit-editor/insert-image-info2                  "Astuce : faites glisser ou collez des images directement dans une cellule ou sur la zone grise."
     :unit-editor/insert-camera                       "Caméra"
     :unit-editor/insert-attachment                   "Fichier"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Vidéo"
     :unit-editor/insert-video-info                   "Télécharger une vidéo depuis l'ordinateur ou l'insérer depuis YouTube."
     :unit-editor/insert-video-info2                  "Astuce : faites glisser des vidéos et des miniatures YouTube directement dans une cellule ou sur la zone grise."
     :unit-editor/video-url                           "Lien YouTube"
     :unit-editor/youtube-start                       "Début"
     :unit-editor/youtube-end                         "Fin"
     :unit-editor/insert-table                        "Tableau"
     :unit-editor/insert-table-info                   "Choisissez la taille du tableau à insérer."
     :unit-editor/toggle-table-border                 "Afficher les bordures du tableau"
     :unit-editor/add-row-before                      "Insérer une ligne avant"
     :unit-editor/add-row-after                       "Insérer une ligne après"
     :unit-editor/remove-current-row                  "Supprimer la ligne"
     :unit-editor/add-column-before                   "Insérer une colonne avant"
     :unit-editor/add-column-after                    "Insérer une colonne après"
     :unit-editor/remove-current-column               "Supprimer la colonne"
     :unit-editor/remove-table                        "Supprimer le tableau"
     :unit-editor/insert-website                      "Site web"
     :unit-editor/insert-website-info                 (str "Vous pouvez intégrer des sites web directement dans une cellule."
                                                           " Si cela ne fonctionne pas, il se peut que ce soit bloqué par le propriétaire du site.")
     :unit-editor/website-url-or-code                 "Adresse ou code du site web"
     :unit-editor/website-id                          "ID du site web"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Utilisé pour "
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "envoyer des messages entre sites web"] "."])
     :unit-editor/invalid-website-url                 "Adresse ou code du site web invalide"
     :unit-editor/invalid-video-url                   "Adresse vidéo invalide"
     :unit-editor/update-website                      "Changer l'adresse du site web"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "Code"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Copier le code"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Code en paragraphe séparé"
     :unit-editor/toggle-block-math                   "Maths sur une ligne séparée"
     :unit-editor/remove-code                         "Supprimer le formatage du code"
     :unit-editor/insert-math                         "Maths / Chimie"

     :unit-panel/link                                 (str "Cliquer ou faire glisser pour connecter ;"
                                                           " maintenez SHIFT pour créer plusieurs connexions ;"
                                                           " maintenez CTRL pour créer une chaîne de cellules")
     :unit-panel/upload-attachment                    "Insérer une image ou un fichier dans cette cellule"
     :unit-panel/change-link-style                    (str "Changer le style de cette cellule ;"
                                                           " maintenez SHIFT pour définir le style courant,"
                                                           " maintenez CTRL pour copier vers la valeur par défaut ;"
                                                           " faites glisser pour connecter avec ce style")
     :unit-panel/hide-content                         "Masquer le contenu"
     :unit-panel/delete-unit                          "Supprimer la cellule"

     :usergroup/create                                "Créer une équipe"
     :usergroup/edit-title                            "Modifier {usergroup/name}"
     :usergroup/info                                  "Créez et gérez des équipes d'amis et de collègues pour simplifier le partage des OrgPages."
     :usergroup/delete                                "Supprimer l'équipe"
     :usergroup/members                               "Membres"
     :usergroup/edit                                  "Modifier le nom et le logo de l'équipe"
     :usergroup/show-actions                          "Afficher les actions"
     :usergroup/name                                  "Nom de l'équipe"
     :usergroup/hide-orgpages                         "Masquer les OrgPages partagés"
     :usergroup/hide-orgpages-tooltip                 "Ils peuvent être affichés en activant l'équipe dans le filtre"
     :usergroup/hide-in-filter                        "Masquer dans le filtre"
     :usergroup/create-info                           "Le nom de l'équipe et la photo de profil ne sont visibles que par les membres de l'équipe."
     :usergroup/confirm-delete                        [:<> [:b "Supprimer définitivement"] " cette équipe ?"]
     :usergroup/members-title                         "Membres de {usergroup/name}"
     :usergroup/remove-member                         "Retirer de l'équipe"
     :usergroup/remove-admin                          "Retirer l'administrateur"
     :usergroup/make-admin                            "Définir comme administrateur"
     :usergroup/admin-tooltip                         "Un administrateur peut gérer les membres et supprimer l'équipe."
     :usergroup/copy-usergroup                        "Copier l'équipe"

     :usergroup-role/owner                            "Propriétaire"
     :usergroup-role/admin                            "Administrateur"
     :usergroup-role/member                           "Membre"

     :wire-transfer/title                             "Virement pour le forfait annuel {wire-transfer/tier}"
     :wire-transfer/info                              "Nous activerons votre abonnement annuel lorsque nous recevrons votre paiement sur notre compte."
     :wire-transfer/used-currency                     "Paiement en {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Nom du bénéficiaire"
     :wire-transfer/account-number                    "Numéro de compte"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Montant"
     :wire-transfer/payment-purpose                   "Motif du paiement"
     :wire-transfer/qr-code-common                    (str "Scannez ce code QR de paiement avec votre application bancaire pour remplir"
                                                           " automatiquement les informations correctes.")
     :wire-transfer/cz-sk-qr-code-description         (str " Ceci est un code QR couramment utilisé pour les virements bancaires"
                                                           " en Tchéquie et en Slovaquie.")
     :wire-transfer/eu-qr-code-description            (str " Ceci est un code QR couramment utilisé pour les virements SEPA"
                                                           " dans l'Union européenne.")
     :wire-transfer/trial-info                        (str "Commencez dès maintenant un abonnement unique de 7 jours pour utiliser OrgPad"
                                                           " immédiatement. Dès confirmation du paiement par la banque,"
                                                           " votre abonnement sera prolongé"
                                                           " d’un an.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Si vous avez des questions ou des difficultés,veuillez nous le faire"
                                                         " savoir en " [:a.link-button {:href url} "remplissant ce formulaire"] "."])
     :wire-transfer/success-text                      [:<> "Nous avons activé un " [:b "abonnement unique de 7 jours"]
                                                       " afin que vous puissiez utiliser OrgPad avec le nouveau forfait immédiatement. "]
     :wire-transfer/common-result-text                (str "Lorsque la banque confirme que le paiement a réussi,"
                                                           " la période d'abonnement sera prolongée"
                                                           " d'un an.")
     :wire-transfer/start-trial                       "Virement envoyé"
     :wire-transfer/start-trial-result-title          "Merci pour le paiement"
     :wire-transfer/copy                              "Copier dans le presse-papiers"

     :website-editor/settings                         "Paramètres"
     :website-editor/routes                           "Routes"
     :website-editor/menus                            "Menus"
     :website-editor/create-menu                      "Créer un menu"
     :website-editor/edited-menu                      "Menu modifié"
     :website-editor/untitled-menu                    "Menu sans titre"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "enfants" "enfant" "enfants"]}]
     :website-editor/delete-menu-item                 "Supprimer cet élément de menu"
     :website-editor/add-menu-item                    "Ajouter un élément de menu"
     :website-editor/menu-item-label                  "Libellé de l'élément"
     :menu-item/path-type                             "Ouvrir une route"
     :menu-item/url-type                              "Ouvrir une URL externe"
     :menu-item/children-type                         "Ouvrir un sous-menu"
     :website-editor/menu-item-path                   "Route"

     :youtube-placement/watch-on-prefix               (str "Regarder" unicode/nbsp "sur")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/fr dict)