(ns orgpad.server.i18n.es
  (:require [orgpad.common.company :as company]
            [orgpad.common.i18n.dict.es :as es]))

(def dict
  "A dictionary map from keywords to the corresponding Spanish texts."
  (merge
    es/dict
    {:orgpage/untitled                    "un documento"
     :orgpage/copy                        "copia"

     :permission/view                     "para leer"
     :permission/edit                     "para editar"

     :subscription/monthly                "mensual"
     :subscription/yearly                 "anual"

     :email/greeting                      "Estimado {{customer}},"
     :email/signature                     "Saludos cordiales"
     :email/team                          "Pavel Klavík y Kamila Klavíková"
     :email/creators                      "Los creadores de OrgPad"
     :email/footer                        (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                            (list [:a href-orgpad "https://orgpad.info"] ". ¿No quieres recibir estos correos? "
                                                  [:a href-unsubscribe "Cancelar suscripción"] "."))
     :email/support-info                  (fn [{:feedback/keys [url]}]
                                            (list "Si tienes algún problema, avísanos usando el "
                                                  [:a {:href (str "{{domain}}" url)} "formulario en la aplicación"]
                                                  " o enviando un correo electrónico a " company/support-email-link "."))
     :email/or                            " o "
     :email/customer                      "cliente"

     :verification/subject                "Verifica tu cuenta de OrgPad"
     :verification/preheader              "Te damos la bienvenida a OrgPad. Verifica tu cuenta haciendo clic en el botón de abajo."
     :verification/heading                "Verifica tu correo electrónico"
     :verification/body                   "Para verificar tu cuenta, haz clic en el botón de abajo. Al hacer clic en el botón, aceptas los "
     :verification/terms-and-conditions   "Términos y Condiciones"
     :verification/button                 "Confirmar dirección de correo electrónico"
     :verification/accidental-email       "Si has recibido este correo electrónico por error, por favor, bórralo. Si sigues recibiendo estos correos, por favor, contáctanos en "

     :password-reset/subject              "Restablece tu contraseña de OrgPad"
     :password-reset/preheader            "Restablece tu contraseña de OrgPad haciendo clic en el botón de abajo."
     :password-reset/heading              "Restablece tu contraseña de OrgPad"
     :password-reset/body                 "Por favor, haz clic en el botón de abajo para restablecer tu contraseña. El enlace será válido por 24 horas."
     :password-reset/button               "Restablecer contraseña"
     :password-reset/accidental-email     "Si no solicitaste restablecer tu contraseña o ya no necesitas cambiarla, no necesitas hacer nada."

     :new-subscription/subject            "Confirmación de nueva suscripción"
     :new-subscription/preheader          "Tu plan {{tier}} con OrgPad ya está activo. La suscripción se renovará automáticamente cada {{period}}."
     :new-subscription/body               "Tu plan {{tier}} con OrgPad ya está activo. ¡Gracias por tu pago!"
     :new-subscription/details            (fn [{:payment/keys [url]}]
                                            (list "En adelante, la suscripción se renovará automáticamente cada {{period}}. Tus recibos se guardan automáticamente en la "
                                                  [:a {:href (str "{{domain}}" url)} "sección Pagos"]
                                                  " de la configuración de OrgPad."))


     :new-payment/subject                 "Pago realizado con éxito"
     :new-payment/preheader               "Has renovado tu suscripción al plan {{tier}}, válida hasta el {{subscription-end}}."
     :new-payment/body                    (list "Has renovado con éxito tu suscripción al plan {{tier}}. Será válida hasta el "
                                                [:b "{{subscription-end}}"]
                                                ". ¡Gracias por tu pago!")
     :new-payment/button                  "Descargar factura"

     :payment-failed/subject              "Falló el pago de la suscripción"
     :payment-failed/preheader            "Por favor, comprueba que tu tarjeta es válida y tiene fondos suficientes. Si los problemas persisten, contáctanos."
     :payment-failed/body                 (str "Ha habido un error con el pago de tu suscripción a OrgPad."
                                               " Por favor, comprueba que tu tarjeta es válida y tiene fondos suficientes.")
     :payment-failed/button               "Actualizar método de pago"
     :payment-failed/grace-warning        (list "Tu suscripción actual está activa hasta el "
                                                [:b "{{subscription-end}}"]
                                                ". Si no pagas la cuota de suscripción antes de esta fecha, tu cuenta pasará al plan gratuito. "
                                                "Todavía podrás acceder, editar, eliminar y compartir tus datos.")

     :feedback/subject                    "Pregunta: {{title}}"
     :feedback/preheader                  "{{first-name}} {{last-name}} ha enviado la pregunta {{title}}"
     :feedback/heading                    "{{first-name}} {{last-name}} ({{email}}) ha enviado la pregunta {{title}}"

     :invitation/subject                  "Te han invitado a {{action}} un documento en OrgPad"
     :invitation/preheader                "{{user}} te ha invitado a {{action}} {{title}}. Por favor, haz clic en el botón de abajo para abrirlo."
     :invitation/heading                  "{{user}} te ha invitado a {{action}} {{title}}"
     :invitation/body                     "OrgPad es una plataforma para construir documentos visuales para una visión general. Al hacer clic en el siguiente botón, aceptas la invitación y abres el documento."
     :invitation/button                   "Abrir documento"
     :invitation/accidental-email         "Si has recibido este correo electrónico por error, por favor, bórralo. Si sigues recibiendo estos correos, puedes "
     :invitation/block-user               "bloquear invitaciones de {{user}}"
     :invitation/block-all                "bloquear todas las invitaciones"

     :contact-user/subject                "Te han contactado a través de OrgPad"
     :contact-user/preheader              "Mensaje de {{user}}"
     :contact-user/heading                "{{user}} ({{reply-to}}) te está contactando a través de OrgPad"
     :contact-user/body                   (str "Este correo te lo enviamos nosotros porque no compartimos tu dirección de correo electrónico con nadie más. "
                                               "Puedes responder al mensaje respondiendo a este correo o enviando un correo a {{reply-to}}.")
     :contact-user/unsolicited-info       "Si el mensaje no es solicitado, puedes "
     :contact-user/block-user             "bloquear todos los mensajes de {{user}}"
     :contact-user/block-all              "bloquear todos los mensajes de todas las personas en OrgPad."

     :blog/rss-description                "Las últimas noticias, actualizaciones y debates técnicos sobre OrgPad."

     :newsletter-2024-summer/subject      "Actualización de verano de OrgPad"
     :newsletter-2024-summer/preheader    "Descubre las últimas novedades de nuestra aplicación, el nuevo blog, mejoras en privacidad y más."
     :newsletter-2024-summer/introduction "¡Estamos de vuelta con otro boletín después de un año de descanso!"
     :newsletter-2024-summer/heading      "Encontrarás en este boletín:"
     :newsletter-2024-summer/body         (list [:li "Qué hay de nuevo en la aplicación desde principios de año."]
                                                [:li "Qué encontrarás en nuestro nuevo blog."]
                                                [:li "Cómo cuidamos tu privacidad y la seguridad de tus datos."]
                                                [:li "Cómo hemos actualizado los Términos y Condiciones para tu comodidad."]
                                                [:li "Por qué unirte a la comunidad."])
     :newsletter-2024-summer/button       "Leer el boletín"
     :newsletter-2024-summer/closing      "¡Esperamos tus ideas!"}))