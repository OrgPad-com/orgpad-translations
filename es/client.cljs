(ns orgpad.client.i18n.dicts.es
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.es :as es]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  "A dictionary map from keywords to the corresponding Spanish texts."
  (merge
    es/dict
    {:address/company                                 "Nombre de la empresa"
     :address/ico                                     "ID fiscal"
     :address/street                                  "Calle"
     :address/street-number                           "Número"
     :address/postal-code                             "Código postal"
     :address/city                                    "Ciudad"
     :address/country                                 "País"

     :administration/page-title                       "Administración – OrgPad"

     :attachments/allows-access-to-file               "Permite el acceso a este archivo."
     :attachments/allows-access-to-image              "Permite el acceso a esta imagen."
     :attachments/no-preview                          "Vista previa no disponible."
     :attachments/all-files                           "Todos los archivos"
     :attachments/used-files                          "Archivos en OrgPage"
     :attachments/unused-files                        "Archivos no usados"
     :attachments/all-images                          "Todas las imágenes"
     :attachments/used-images                         "Imágenes en OrgPage"
     :attachments/unused-images                       "Imágenes no usadas"
     :attachments/uploading-files                     "Subiendo archivos…"
     :attachments/previous-attachment                 "Archivo o imagen anterior"
     :attachments/next-attachment                     "Archivo o imagen siguiente"
     :attachments/display-using-microsoft-365         "Mostrar usando Microsoft 365"
     :attachments/edit-filename                       "Editar nombre"
     :attachments/title-order                         "Alfabéticamente por título"
     :attachments/upload-order                        "Más recientes primero"
     :attachments/size-order                          "Más grandes primero"
     :attachments/split-used-unused                   "Agrupar por presencia en OrgPage"
     :attachments/search                              "Buscar"
     :attachments/ordering                            "Ordenación"
     :attachments/new-version                         "Nueva versión"
     :attachments/preserve-old-version                "Conservar la versión anterior"
     :attachments/in-other-orgpages                   "Reemplazar en otras OrgPages:"

     :button/back                                     "Atrás"
     :button/cancel                                   "Cancelar"
     :button/close                                    "Cerrar"
     :button/comment                                  "Comentar"
     :button/continue                                 "Continuar"
     :button/copied                                   "Copiado"
     :button/copy                                     "Copiar"
     :button/copy-link                                "Copiar enlace"
     :button/create                                   "Crear"
     :button/create-tooltip                           "Crear (CTRL+ENTER)"
     :button/delete                                   "Eliminar"
     :button/delete-selected                          "Eliminar seleccionados"
     :button/documentation                            "Ayuda"
     :button/download                                 "Descargar"
     :button/download-all                             "Descargar todo"
     :button/drop                                     "Soltar"
     :button/edit                                     "Editar"
     :button/import                                   "Importar"
     :button/insert                                   "Insertar"
     :button/login                                    "Iniciar sesión"
     :button/logout                                   "Cerrar sesión"
     :button/publish                                  "Publicar"
     :button/read                                     "Leer"
     :button/register                                 "Registrarse"
     :button/register-to-save                         "Regístrate para guardar"
     :button/remove                                   "Quitar"
     :button/reset                                    "Restablecer"
     :button/save                                     "Guardar"
     :button/save-tooltip                             "Guardar (CTRL+ENTER)"
     :button/upload                                   "Subir"
     :button/upload-from-computer                     "Subir desde el dispositivo"
     :button/send                                     "Enviar"
     :button/present                                  "Presentar"
     :button/present-tooltip                          "Iniciar presentación (F5)"
     :button/share                                    "Compartir"
     :button/start                                    "Comenzar"
     :button/exit                                     "Salir"
     :button/show-password                            "Mostrar"
     :button/hide-password                            "Ocultar"

     :checkout/currency                               "Moneda"
     :checkout/monthly                                "mensual"
     :checkout/yearly                                 "anual (ahorra 15 %)"
     :checkout/failed-to-init                         "Se produjo un error al cargar la página de pago."
     :checkout/upgrade-plan                           "Mejorar plan"
     :checkout/professional-plan                      "Plan profesional"
     :checkout/school-plan                            "Plan escolar"
     :checkout/enterprise-plan                        "Plan empresarial"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Escuela"] " o "
                                                         [:a.link-button {:href enterprise-url} "empresa"] "? Contáctanos para una oferta personalizada."])
     :checkout/pay-with-credit-card                   "Pagar con tarjeta"
     :checkout/pay-with-wire-transfer                 "Pagar por transferencia"
     :checkout/promo-code                             "Código promocional"
     :checkout/try-for-free                           "Probar gratis"
     :checkout/activate-now                           "Activar ahora"
     :checkout/continue-for-free                      "Continuar gratis"

     :code-lang/none                                  "Ninguno"
     :code-lang/multiple                              "Múltiples"

     :dashboard/confirm-delete                        [:<> [:b "Eliminar permanentemente"] " esta OrgPage?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "Inicia sesión"] " o "
                                                         [:a {:href register-url} "regístrate"]
                                                         " para crear nuevas OrgPages."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "La suscripción de tu escuela " name " expiró el " subscription-expired ". "
                                                         "Para renovarla, contacta a la administración. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Más información"] " sobre el 95 % de descuento para escuelas."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Obtén OrgPad para tu escuela sin límites con un 95 % de descuento. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Más información."]])
     :dashboard/owned-orgpages                        "Mis OrgPages"
     :dashboard/public-orgpages                       "OrgPages publicadas"
     :dashboard/shared-orgpages                       "OrgPages compartidas conmigo"
     :dashboard/usergroup-orgpages                    "OrgPages de {usergroup/name}"
     :dashboard/help-or-inspiration-button            "¡Aquí!"
     :dashboard/new-domain                            [:<> "Usa el nuevo dominio " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". Más información en la OrgPage " [:a {:href "https://orgpad.info/s/new-domain"} "Cambios en OrgPad y nuevo dominio"] "."]

     :dashboard-filter/filter                         "Filtrar OrgPages"
     :dashboard-filter/ordering                       "Ordenar OrgPages"
     :dashboard-filter/filter-and-ordering            "Filtrar y ordenar OrgPages"
     :dashboard-filter/title                          "Filtrar y ordenar las OrgPages mostradas"
     :dashboard-filter/ordering-label                 "Ordenación de OrgPages"
     :dashboard-filter/title-order                    "Alfabéticamente por título"
     :dashboard-filter/creation-time-order            "Más recientes arriba"
     :dashboard-filter/last-modified-order            "Última modificación arriba"
     :dashboard-filter/most-viewed-order              "Más vistas arriba"
     :dashboard-filter/search-tags                    "Buscar etiquetas"

     :embedding-code/code                             "Código"
     :embedding-code/description                      "Incrusta la OrgPage en un sitio web u otra aplicación."

     :error/orgpage-access-denied                     "No tienes acceso a esta OrgPage. Intenta iniciar sesión."
     :error/usergroup-access-denied                   "Permiso para editar el equipo denegado."
     :error/administration-access                     "Acceso de administración denegado."
     :error/creation-unauthorized                     "Inicia sesión para crear OrgPages."
     :error/deleting-denied                           "No se puede eliminar la OrgPage."
     :error/email-already-used                        "El correo electrónico ya está en uso."
     :error/email-not-registered                      "No existe una cuenta con ese correo electrónico."
     :error/email-missing-mx-record                   "No se encontró servidor de correo para este dominio."
     :error/email-invalid                             "No es un correo electrónico válido."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "OrgPage incorrecta" (when id " {orgpage/id}")
                                                             ". ¿Enlace copiado incorrectamente?"))
     :error/incorrect-link                            "Enlace incorrecto. Inicia sesión o abre el enlace correcto."
     :error/incorrect-password                        "Contraseña incorrecta."
     :error/incorrect-profile-id                      "Enlace de perfil incorrecto. ¿Enlace copiado incorrectamente?"
     :error/lost-permission                           "Has perdido acceso a esta OrgPage."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "Correos electrónicos sin cuenta: " emails))
     :error/name-already-used                         "Nombre ya en uso"
     :error/name-not-valid                            "Usa al menos 5 caracteres"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "La OrgPage " (when title "“{orgpage/title}”") " fue eliminada."))
     :error/owner-of-orgpage                          "La persona ya es propietaria de esta OrgPage."
     :error/profile-not-found                         "Perfil no encontrado."
     :error/unknown-error                             "Error desconocido, inténtalo de nuevo."
     :error/unknown-id                                "OrgPage desconocida."
     :error/unknown-login-or-email                    "Correo electrónico o inicio de sesión de equipo desconocido."
     :error/unknown-usergroup                         "El equipo ha sido eliminado"
     :error/upload-failed                             "Error al subir la OrgPage: “{orgpage/title}”"

     :export/show                                     "Exportar OrgPage"
     :export/title                                    "Exportar {orgpage/title}"
     :export/info                                     "Elige el formato en el que se exportará esta OrgPage."
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " formato utilizado por OrgPad"]
     :export/html                                     "Archivo HTML lineal"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " formato"]
     :export/generate                                 "Generar exportación"

     :feedback/ask-question                           "Hacer una pregunta"
     :feedback/hide-button                            "Ocultar botón permanentemente"
     :feedback/dialog-title                           "Contactar a los desarrolladores de OrgPad"
     :feedback/description                            [:<> "Si necesitas ayuda o tienes algún problema, háznoslo saber – "
                                                       [:b "los desarrolladores de OrgPad"] ". "
                                                       "También agradecemos ideas para mejorar. "
                                                       "Responderemos por correo electrónico lo antes posible."]
     :feedback/languages                              "Puedes escribirnos en español, inglés, checo o alemán."
     :feedback/contact-when-problem-persists          [:<> " Si el problema persiste, contáctanos en "
                                                       company/support-email-app-link "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Transferencia bancaria"
                                                             (when currency
                                                               (str " en " (name currency))) " para "
                                                             "anual"
                                                             (if (= tier "standard")
                                                               " Estándar"
                                                               " Profesional")
                                                             " plan"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Escríbenos tu " [:b "dirección de facturación"] ", cualquier información adicional para la factura."
                                                         " Te contactaremos pronto en tu dirección de correo electrónico " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Quiero comprar un plan para mi " (case org-type
                                                                                                 :feedback/school-plan "escuela"
                                                                                                 :feedback/enterprise-plan "empresa"
                                                                                                 "organización")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Usa este formulario para contactar a un representante de OrgPad s.r.o."
                                                         " Te responderemos pronto en el número de teléfono o dirección de correo electrónico que proporcionaste (" email
                                                         "). También puedes llamarnos al "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Mejorar mi suscripción al plan Profesional"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Escríbenos cómo deberíamos cambiar tu suscripción existente y cualquier información adicional."
                                                         " Te contactaremos pronto en tu dirección de correo electrónico " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Cambiar mi período de facturación a " (if (= period "yearly")
                                                                                                      "facturación anual"
                                                                                                      "facturación mensual")))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "El cambio ocurrirá después de que termine el período de facturación actual."
                                                         " Hay un 15% de descuento cuando se factura anualmente."
                                                         " Te contactaremos pronto en tu dirección de correo electrónico " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "Escuela"
                                                               :feedback/enterprise-plan "Empresa"
                                                               "Organización") " nombre"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Posición dentro de la " (case org-type
                                                                                        :feedback/school-plan "escuela"
                                                                                        :feedback/enterprise-plan "empresa"
                                                                                        "organización")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "Escuela"
                                                               :feedback/enterprise-plan "Empresa"
                                                               "Organización") " sitio web"))

     :fragment/fragment                               "Ubicación"
     :fragment/text-id                                "Id"
     :fragment/title                                  "Título"
     :fragment/create                                 "Crear ubicación"
     :fragment/create-tooltip                         "TAB; mantén SHIFT para copiar la ubicación seleccionada"
     :fragment/remove                                 "Eliminar ubicación"
     :fragment/share                                  "Copiar enlace a esta ubicación"
     :fragment/text-id-required                       "Id requerido."
     :fragment/text-id-already-used                   "Id ya utilizado."
     :fragment/closed-books                           "Células cerradas; CTRL+clic para seleccionar"
     :fragment/hidden-books                           "Células ocultas; CTRL+clic para seleccionar"
     :fragment/opened-pages                           "Páginas abiertas; CTRL+clic para seleccionar"
     :fragment/focused-books                          "Células mostradas en cámara; CTRL+clic para seleccionar"
     :fragment/shown-books                            "Células reveladas; CTRL+clic para seleccionar"

     :info/uploading-attachments                      [:i18n/plural "Subiendo {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "archivos" "archivo" "archivos"]}]
     :info/uploading-images                           [:i18n/plural "Subiendo {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "imágenes" "imagen" "imágenes"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Fallo al subir {info/count} {info/num-images}."
                                                           {:info/num-images [:info/count "imágenes" "imagen" "imágenes"]}]
                                                          "Fallo al subir al menos una imagen."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} Youtube {info/num-youtubes} no encontrado."
                                                       {:info/num-youtubes [:info/count "vídeos" "vídeo" "vídeos"]}]
     :info/uploading-attachments-failed               "Falló la subida de archivos."
     :info/presentation-link-copied                   "Enlace de la presentación copiado."
     :info/max-orgpages-exceeded                      "El propietario de esta OrgPage no puede crear otra OrgPage."
     :info/storage-exceeded                           "Al propietario de esta OrgPage le faltan {upload/total-size} para subir estos archivos."
     :info/attachments-too-large                      (str "No se puede subir {upload/total-size}. "
                                                           "El tamaño máximo por carga es 500 MB.")
     :info/drop-info                                  "Suelta en cualquier célula o en el lienzo gris para crear una nueva célula."
     :info/audio-not-allowed                          "Reproducción de audio bloqueada. Haz clic en Reproducir."
     :info/audio-not-supported                        "Formato de audio no soportado."

     :import/another-format                           [:<> "Si quieres importar tus datos en otro formato, contáctanos en "
                                                       company/support-email-app-link "."]
     :import/dialog                                   "Importa tus datos"
     :import/google-docs                              "Para insertar datos de Microsoft Office o Google Docs, simplemente pégalos en una OrgPage."
     :import/supported-formats                        "Actualmente soportamos estos formatos:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exportado como archivo .vsdx."]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " archivo."]

     :ios/install-info                                "Instala la aplicación OrgPad"
     :ios/share-button                                "1. Abre"
     :ios/add-to-home-screen                          "2. Añadir a pantalla de inicio"

     :lang/cs                                         "Checo"
     :lang/de                                         "Alemán"
     :lang/en                                         "Inglés"
     :lang/es                                         "Español"
     :lang/fr                                         "Francés"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polaco"
     :lang/ru                                         "Ruso"
     :lang/uk                                         "Ucraniano"

     :lang-select/tooltip                             "Idioma de la aplicación (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "¿Falta tu idioma? Ayúdanos "
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "traduciendo OrgPad"] "."]

     :limit/of                                        " de "
     :limit/orgpages                                  " OrgPages"
     :limit/people                                    " personas"
     :limit/teams                                     " equipos"
     :limit/team-members                              " miembros"
     :limit/orgpages-tooltip                          (str "En el plan gratuito el número de OrgPages está limitado. "
                                                           "Mejora tu plan para crear más OrgPages.")
     :limit/shares-tooltip                            (str "El número de personas con las que puedes compartir esta OrgPage está limitado. "
                                                           "Pásate al plan Profesional para compartir sin límites.")
     :limit/teams-tooltip                             (str "En el plan Estándar el número de equipos propios está limitado. "
                                                           "Pásate al plan Profesional para crear equipos ilimitados.")
     :limit/teams-members-tooltip                     (str "En el plan Estándar cada equipo tiene un número limitado de miembros. "
                                                           "Pásate al plan Profesional para ampliarlo.")
     :limit/attachments-size                          (str "El tamaño total de archivos e imágenes subidos está limitado "
                                                           "y puede ampliarse mejorando el plan.")
     :limit/attachments-size-clickable                (str "El tamaño total de archivos e imágenes subidos está limitado. "
                                                           "Haz clic para aumentar el límite mejorando el plan.")
     :limit/attachments-size-try-out                  (str "El tamaño total de archivos e imágenes subidos está limitado. "
                                                           "Para aumentar tu límite a 100 MB crea una cuenta.")

     :limits/max-orgpages                             "documentos"
     :limits/max-storage                              "almacenamiento"
     :limits/max-teams                                "equipos"
     :limits/of                                       " de"
     :limits/max-team-members                         "miembros"
     :limits/priority-support                         "soporte prioritario"

     :link-panel/flip                                 "Invertir dirección"
     :link-panel/insert-unit-in-middle                "Insertar célula en medio"
     :link-panel/delete                               "Eliminar enlace"
     :link-panel/change-link-style                    "Cambiar estilo de este enlace; mantén SHIFT para fijar el actual, CTRL para copiar al predeterminado"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "Calculando tamaños de las células, " [:span#autoresize-num-units num-units] " restantes …"])
     :loading/initial-layout                          "Mejorando el diseño inicial …"
     :loading/restoring-opened-pages                  "Restaurando posición de páginas abiertas …"
     :loading/getting-orgpage                         "Descargando OrgPage del servidor …"
     :loading/getting-dashboard                       "Descargando lista de OrgPages del servidor …"
     :loading/getting-website                         "Descargando sitio web del servidor …"
     :loading/getting-blog                            "Descargando blog del servidor …"
     :loading/uploading-orgpage                       "Subiendo OrgPage al servidor …"
     :loading/ws-init                                 "Estableciendo conexión con el servidor …"
     :loading/ws-closed                               "Conexión con el servidor cerrada, intentando reconectar. Si el problema persiste, recarga la página."
     :loading/administration                          "Cargando datos de administración …"
     :loading/profile                                 "Cargando perfil …"
     :loading/style                                   "Cargando estilos …"
     :loading/start-trial                             "Iniciando prueba de 7 días …"
     :loading/uploading-attachments                   "Subiendo adjuntos al servidor …"

     :login/continue-with-email                       "Continuar con correo"
     :login/continue-with-facebook                    "Continuar con Facebook"
     :login/continue-with-google                      "Continuar con Google"
     :login/continue-with-microsoft                   "Continuar con Microsoft"
     :login/continue-with-cuni                        "Continuar con Charles University"
     :login/email-sent                                "Correo enviado. Haz clic en el enlace del correo."
     :login/forgotten-password                        "Contraseña olvidada"
     :login/forgotten-password-email-resent           "Correo de restablecimiento ya enviado."
     :login/forgotten-password-description            "Recibe un enlace de restablecimiento de contraseña por correo (válido 24 h)."
     :login/forgotten-password-error                  [:<> "Esta dirección de correo está bloqueada por ti. Desbloquéala haciendo clic en Cancelar suscripción en cualquier correo de OrgPad, o envíanos un correo a "
                                                       company/support-email-app-link " desde ese correo."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "¿Nuevo en OrgPad? " [:a.link-button {:href route} "Regístrate"]])
     :login/options                                   "Elige otra forma de iniciar sesión"
     :login/send-reset-link                           "Enviar enlace de restablecimiento"
     :login/wrong-email-or-password                   "Correo o contraseña incorrectos."

     :markdown/title                                  "¿El texto pegado está formateado en Markdown?"
     :markdown/info                                   "Se detectó formato Markdown en tu contenido pegado. ¿Aplicar el formato?"
     :markdown/remember                               "Recordar hasta recargar"
     :markdown/insert                                 "Usar formato Markdown"
     :markdown/ignore                                 "Mantener original"

     :meta/title                                      "Nombre de la OrgPage"
     :meta/orgpage-thumbnail                          "Imagen de la OrgPage"
     :meta/automatic-screenshot-start                 "Captura generada automáticamente para "
     :meta/automatic-screenshot-refresh               "Se actualiza cinco minutos después de cada cambio."
     :meta/custom-thumbnail                           "Imagen personalizada de 1360×768."
     :meta/upload-thumbnail                           "Subir imagen personalizada"
     :meta/thumbnail-upload-failed                    "Error al subir la imagen."
     :meta/description                                "Descripción"
     :meta/new-tags                                   "Etiqueta"
     :meta/tag-too-long                               (str "La longitud máxima de una etiqueta es " common-orgpage/max-tag-length " caracteres.")
     :meta/too-many-tags                              (str "Se permiten como máximo " common-orgpage/max-tags " etiquetas.")
     :meta/info                                       (str "Estos detalles se mostrarán en la lista de OrgPages, "
                                                           "al incrustar una OrgPage y al compartirla en redes sociales.")
     :meta/info-in-share-orgpage                      "Antes de compartir esta OrgPage, debes establecer el título."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Mover las {selection/num-units} {selection/units-label} seleccionadas "
                                                                         "y {selection/num-links} {selection/links-label} a una nueva OrgPage "
                                                                         "con la siguiente información. En la OrgPage actual, estas células y enlaces "
                                                                         "serán reemplazados por una sola célula, que contiene la nueva OrgPage dentro.")
                                                       {:selection/units-label [:selection/num-units "células" "célula" "células"]
                                                        :selection/links-label [:selection/num-links "enlaces" "enlace" "enlaces"]}]
     :meta/info-title                                 "Información – {meta/title}"
     :meta/info-title-only                            "Nombrar la OrgPage"
     :meta/details                                    "Detalles"
     :meta/preview                                    "Vista previa"
     :meta/init-fragments                             "Ubicación inicial"
     :meta/init-fragments-info                        (str "Puedes elegir la ubicación inicial cuando se abra la OrgPage. "
                                                           "Se puede especificar una ubicación inicial diferente para dispositivos móviles.")
     :meta/desktop-init-fragment                      "Ubicación de escritorio"
     :meta/mobile-init-fragment                       "Ubicación móvil"
     :meta/everything-closed                          "Todas las células cerradas"
     :meta/everything-closed-lowercase                "todas las células cerradas"
     :meta/more-details                               "Más información"
     :meta/move-to-new-orgpage-title                  "Mover a {meta/title}"
     :meta/move-to-new-orgpage                        "Mover a una nueva OrgPage"

     :microsoft-365-permission/title                  "¿Permitir que Microsoft 365 acceda a este documento?"
     :microsoft-365-permission/info                   [:<> "El documento Office puede mostrarse usando Microsoft 365. "
                                                       "Al hacer clic en Aceptar, tu documento se compartirá con Microsoft. "
                                                       "Consulta " [:a.link-button {:href   "https://www.microsoft.com/es-es/servicesagreement/"
                                                                                    :target "_blank"}
                                                                    "el acuerdo de servicios de Microsoft"] "."]
     :microsoft-365-permission/allow                  "Conceder permiso a Microsoft 365"

     :notifications/info                              "Elige qué correos deseas recibir de OrgPad. Siempre te informaremos de cambios importantes."
     :notifications/any-email                         "Cualquier correo de OrgPad"
     :notifications/email-verification                "Verificación de correo, enlaces de restablecimiento y pagos esenciales"
     :notifications/monthly-newsletter                "Boletín mensual con novedades y desarrollo"
     :notifications/messages                          "Recibir mensajes de otras personas"
     :notifications/blocked-people                    "Personas bloqueadas específicamente:"
     :notifications/receipts                          "Recibos cuando tu suscripción se renueva automáticamente"
     :notifications/receive-invitations               "Recibir invitaciones de otras personas"
     :notifications/unblock-user                      "Desbloquear a esta persona"

     :onboarding/openable-units                       "Solo las células elevadas con sombra se pueden abrir."
     :onboarding/zoom                                 "Desplázate para hacer zoom"
     :onboarding/drag-canvas                          "Mueve arrastrando"
     :onboarding/open-units                           "Las células con sombra tienen contenido"

     :orgpage/creating-preview                        "Creando vista previa …"
     :orgpage/change-information                      "Cambiar información"
     :orgpage/copy-orgpage                            "Copiar en una nueva OrgPage"
     :orgpage/delete-orgpage                          "Eliminar OrgPage"
     :orgpage/detail                                  "Detalle"
     :orgpage/share-tooltip                           "Compartir esta OrgPage con otros"
     :orgpage/share-orgpage                           "Compartir OrgPage"
     :orgpage/show-information                        "Mostrar información"
     :orgpage/zoom-in                                 "Acercar"
     :orgpage/zoom-out                                "Alejar"
     :orgpage/create-unit-double-click                "Doble clic para crear una célula."
     :orgpage/create-unit-hold-or-double-tap          "Mantén o doble toque para crear una célula."
     :orgpage/switch-to-edit                          "Cambiar a edición."
     :orgpage/untitled                                "OrgPage sin título"
     :orgpage/title                                   "Título de la OrgPage"
     :orgpage/untitled-unit                           "Célula sin título"
     :orgpage/untitled-path                           "Presentación sin título"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "pasos" "paso" "pasos"]}]
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (página {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (página {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Una copia disponible como "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Cambiar color de esta OrgPage"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Esta OrgPage se comparte automáticamente con " label " para "
                                                         (case permission
                                                           :permission/view "lectura"
                                                           :permission/comment "comentario"
                                                           :permission/edit "edición"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Haz clic aquí"]
                                                         " para cancelar el compartir."])

     :orgpage-placement/activate                      "Ver aquí"

     :orgpage-print/displayed                         "Exactamente como se muestra"
     :orgpage-print/displayed-info                    "Todo dentro del rectángulo se imprimirá exactamente como lo ves."
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPage impresa exitosamente en "
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "Imprimir este PDF debería tomar aproximadamente {orgpage-print/estimated-time}."
     :orgpage-print/everything-closed                 "Todas las células cerradas"
     :orgpage-print/everything-closed-info            "El PDF impreso muestra todas las células cerradas."
     :orgpage-print/fragment                          "Una ubicación"
     :orgpage-print/fragment-info                     "El PDF impreso muestra la ubicación seleccionada."
     :orgpage-print/gray                              "Fondo gris"
     :orgpage-print/landscape                         "Horizontal"
     :orgpage-print/orientation                       "Orientación"
     :orgpage-print/path-info                         [:i18n/plural " con {orgpage-print/num-pages} {orgpage-print/page-label}."
                                                       #:orgpage-print{:page-label [:orgpage-print/num-pages
                                                                                    "páginas" "página" "páginas"]}]
     :orgpage-print/portrait                          "Vertical"
     :orgpage-print/presentation                      "Pasos de una presentación"
     :orgpage-print/presentation-info                 "Cada paso se imprime en una página separada."
     :orgpage-print/print                             "Imprimir a PDF"
     :orgpage-print/size                              "Tamaño"
     :orgpage-print/started                           (str "Estamos imprimiendo esta OrgPage en PDF. Debería tomar aproximadamente {orgpage-print/estimated-time}."
                                                           " Cuando termine, estará disponible como archivo.")
     :orgpage-print/title                             "Nombre de impresión"
     :orgpage-print/type                              "Qué se imprime"
     :orgpage-print/watermark                         "Incluir marca de agua"
     :orgpage-print/watermark-info                    "Mejora a profesional, escolar o empresarial para quitar."
     :orgpage-print/white                             "Fondo blanco"

     :orgpage-stats/number-of-units                   "Número de células"
     :orgpage-stats/number-of-links                   "Número de enlaces"
     :orgpage-stats/number-of-files                   "Número de archivos"
     :orgpage-stats/number-of-images                  "Número de imágenes"

     :org-role/student                                "Estudiante"
     :org-role/teacher                                "Profesor"
     :org-role/employee                               "Empleado"
     :org-role/admin                                  "Administrador"

     :panel/toggle-side-panel                         "Menú lateral"
     :panel/create-orgpage                            "Nueva OrgPage"
     :panel/logo-tooltip                              "Ir al inicio"
     :panel/edit-info                                 "Cambiar a edición donde puedes crear y eliminar células y enlaces, modificar contenido y más (F7)"
     :panel/comment-info                              (str "Cambiar a comentarios donde puedes crear, editar y eliminar "
                                                           "tus células y enlaces pero no los "
                                                           "de otros. Aun así puedes enlazar a células ajenas. (F7)")
     :panel/read-info                                 "Cambiar a lectura donde nada puede modificarse pero navegar es más fácil (F6)"
     :panel/undo-deletion                             "Deshacer eliminación"
     :panel/undo-deletion-info                        [:i18n/plural "Revertir la eliminación de {delete/num-units} {delete/unit-label} y {delete/num-links} {delete/link-label} (CTRL+Z)"
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "células" "célula" "células"]
                                                                :link-label [:delete/num-links
                                                                             "enlaces" "enlace" "enlaces"]}]
     :panel/refresh                                   "Actualizar"
     :panel/switch-style                              "Cambiar estilo de nuevas células y enlaces; arrastrar para crear una nueva célula"
     :panel/profile                                   "Perfil"
     :panel/settings                                  "Ajustes"
     :panel/usergroups                                "Equipos"
     :panel/stats                                     "Estadísticas"
     :panel/administration                            "Administración"
     :panel/ios-install-info                          "Instalar app"
     :panel/upload-attachment                         "Insertar imágenes o archivos en nuevas células"
     :panel/selection-mode                            "Iniciar selección"
     :panel/search                                    "Buscar (CTRL+F)"
     :panel/toggle-reveal-hidden                      [:i18n/plural "Revelar {panel/num-hidden-book-ids} {panel/unit-label} ocultas en la ubicación actual"
                                                       #:panel{:unit-label [:panel/num-hidden-book-ids "células" "célula" "células"]}]

     :password/too-short                              "Al menos 8 caracteres"
     :password/different-passwords                    "Las contraseñas no coinciden"

     :password-reset/back-to-list                     "Volver a la lista"
     :password-reset/change-password                  "Cambiar contraseña"
     :password-reset/set-password                     "Establecer contraseña"
     :password-reset/has-password                     "Tu cuenta tiene una contraseña establecida."
     :password-reset/without-password                 "Aún no hay contraseña porque usaste cuentas vinculadas."
     :password-reset/invalid-link                     "Enlace inválido, quizás tenga más de 24 h. Solicita uno nuevo."
     :password-reset/description                      "Establece tu nueva contraseña"
     :password-reset/enter-current-and-new-password   "Introduce la contraseña actual y la nueva."
     :password-reset/enter-new-password               "Introduce la nueva contraseña dos veces."

     :path/add-step                                   "Paso"
     :path/add-step-tooltip                           "ENTER o TAB; mantén SHIFT para copiar la cámara"
     :path/hidden-ops                                 " y {path/num-hidden} más"
     :path/title                                      "Nombre de la presentación"
     :path/default-title                              "Presentación {path/num-paths}"
     :path/copy                                       "Copiar en una nueva presentación"
     :path/copy-suffix                                "copia"
     :path/add-audio                                  "Vincular audio al paso"
     :path/remove-audio                               "Desvincular audio del paso"

     :paths/create-new-path                           "Crear presentación"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "¿Eliminar la presentación " [:b title] "?"])
     :paths/help                                      "Selecciona células para cambiar lo que se muestra; consulta la guía para más detalles."

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Actualmente en el plan " [:b tier] ", válido hasta " [:b end-date] "."
                                                         (if autorenewal
                                                           " La suscripción se renovará automáticamente al final del período."
                                                           " La suscripción expirará al final del período.")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "Tu plan " [:b tier] " expiró el " [:b end-date] " porque falló el pago de renovación."
                                                         " Si actualizas tu pago, la suscripción se extenderá automáticamente."])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " en el plan " [:b tier] " de " name "."])
     :payments/free-tier-info                         [:<> "OrgPad se usa en el " [:b "plan Gratis"] ", sin pagos."]
     :payments/no-teams                               "Sin equipos en el plan Gratis."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Para " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "mejoras"] " o "])
                                                         [:a.link-button {:href period-url} "cambiar el período de facturación"]
                                                         ", contáctanos."])
     :payments/choose-plan                            "Elegir plan"
     :payments/manage-plan                            "Gestionar plan"
     :payments/billing-address                        "Dirección de facturación"
     :payments/billing-address-info                   (str "La dirección ingresada se usará en todas las facturas nuevas. "
                                                           "Las facturas recientes también se actualizarán automáticamente.")
     :payments/receipt-label                          "Recibo {receipt/date-range}"
     :payments/customer-portal-failed                 "Error al cargar la página de gestión del plan."

     :pending-activation/email-already-used           "Correo ya usado en otra cuenta."
     :pending-activation/email-not-recieved           "¿Sin correo? Reenviar o cambiar abajo."
     :pending-activation/email-sent                   "Correo de activación enviado. "
     :pending-activation/instructions                 "¡Casi listo! Activa tu cuenta con un clic en el enlace que te enviamos."
     :pending-activation/resend                       "Reenviar correo de activación"

     :permission/admin                                "Puede compartir y eliminar"
     :permission/admin-tooltip                        "También puede gestionar quién más accede al documento."
     :permission/edit                                 "Puede editar"
     :permission/edit-tooltip                         "Puede hacer cualquier cambio en la OrgPage."
     :permission/comment                              "Puede comentar"
     :permission/comment-tooltip                      (str "Puede crear células propias y enlazarlas."
                                                           " No puede modificar el resto de la OrgPage.")
     :permission/view                                 "Puede leer"
     :permission/view-tooltip                         "Puede leer la OrgPage sin hacer cambios."

     :presentation/presentation                       "Presentación"
     :presentation/step                               "Paso"
     :presentation/present                            "Iniciar presentación"
     :presentation/slideshow                          "Reproducir pasos automáticamente"
     :presentation/step-duration                      "Duración del paso en segundos"
     :presentation/loop-slideshow                     "Repetir al final"
     :presentation/respect-audio-track                "Duración según la pista de audio"
     :presentation/stop-slideshow                     "Detener reproducción automática"
     :presentation/exit-tooltip                       "Salir de la presentación"
     :presentation/play-audio                         "Reproducir audio para este paso"
     :presentation/pause-audio                        "Pausar audio"
     :presentation/share-presentation                 "Comparte esta presentación con otros."

     :pricing-popup/orgpages-exceeded-title           "No puedes crear más OrgPages en el plan Gratis"
     :pricing-popup/orgpages-exceeded                 "Debes mejorar tu plan."
     :pricing-popup/storage-exceeded-title            "No hay suficiente espacio para subir {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Solo " [:b space-left] " disponibles en tu almacenamiento." " Puedes mejorar tu plan para ampliarlo."])
     :pricing-popup/num-shared-limit-reached-title    "No puedes compartir esta OrgPage con más personas"
     :pricing-popup/num-shared-limit-reached-common   "Se alcanzó el número máximo de personas que comparten esta OrgPage."
     :pricing-popup/num-shared-limit-reached          [:<> " Para añadir más personas, mejora al "
                                                       [:b "plan Profesional"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " El propietario " owner " debe mejorar al "
                                                         [:b "plan Profesional"] " para añadir más personas."])
     :pricing-popup/enable-teams-title                "Mejora tu plan para gestionar equipos"
     :pricing-popup/enable-teams                      [:<> "Los equipos agrupan personas y facilitan la colaboración. Disponible en el " [:b "plan Estándar"] " o superior."]
     :pricing-popup/teams-limit-reached-title         "Mejora tu plan para crear más equipos"
     :pricing-popup/teams-limit-reached               "Se alcanzó el límite de equipos de tu plan."
     :pricing-popup/team-members-limit-reached-title  "No puedes añadir más miembros a {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Se alcanzó el número máximo de miembros."
     :pricing-popup/team-members-limit-reached        [:<> " Para añadir más miembros, mejora al "
                                                       [:b "plan Profesional"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " El propietario " owner " debe mejorar al " [:b "plan Profesional"] " para añadir más miembros."])
     :pricing-popup/try-out-share-title               "Regístrate para compartir esta OrgPage"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Solo " [:b space-left] " disponibles en tu almacenamiento."])
     :pricing-popup/free-account-info                 "Al registrarte obtienes gratis:"
     :pricing-popup/free-limit                        "hasta tres OrgPages,"
     :pricing-popup/free-storage                      "hasta 100 MB de almacenamiento,"
     :pricing-popup/free-share                        "compartir tu trabajo con otros."
     :pricing-popup/free-account-info2                "Crea tu cuenta en unos pocos clics."

     :pricing-popup/register-to-comment               "Regístrate para añadir tus comentarios"
     :pricing-popup/register-to-comment-info          (str "Las células de comentarios mostrarán tu nombre y foto de perfil."
                                                           " Para ello, primero debes crear tu cuenta.")

     :pricing-popup/print-watermark-title             "Mejora tu plan para no tener marcas de agua"
     :pricing-popup/print-watermark-info              (str "Imprimir sin marcas de agua de OrgPad.info solo es posible"
                                                           " en planes profesional, escolar y empresarial.")

     :profile/open-contact-dialog                     "Enviar mensaje"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Contactar a " first-name " " last-name)
                                                          "Contactar a esta persona"))
     :profile/contact-dialog-info                     (str "Como no compartimos los correos electrónicos de otras personas en OrgPad, te enviaremos este mensaje por ti. "
                                                           "Incluiremos tu nombre y correo electrónico para facilitar el contacto directo.")

     :promotion/unknown                               "Código desconocido"
     :promotion/max-usages-reached                    "Usado demasiadas veces"
     :promotion/expired                               "Expirado"
     :promotion/one-year-free                         "1 año gratis"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} gratis"
                                                       {:promotion/days [:promotion/duration "días" "día" "días"]}]
     :promotion/for-one-year                          " para 1 año"
     :promotion/for-six-months                        " para 6 meses"

     :props/h1                                        "Título grande"
     :props/h2                                        "Título"
     :props/h3                                        "Subtítulo"
     :props/weight-none                               "Enlace normal"
     :props/strong                                    "Enlace fuerte"
     :props/arrowhead-none                            "Sin flecha"
     :props/single                                    "Flecha simple"
     :props/double                                    "Flecha doble"

     :public-permission/none                          "privado."
     :public-permission/view                          "compartido con todos para leer."

     :registration/create-user                        "Crear cuenta"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "¿Ya tienes una cuenta? " [:a.link-button {:href route} "Inicia sesión"]])
     :registration/options                            "Elige otra forma de registrarte"
     :registration/server-error                       "Error del servidor. Intenta crear la cuenta de nuevo."
     :registration/missing-oauth-email                "{registration/service} no nos ha proporcionado tu correo electrónico. Por favor, rellénalo a continuación."

     :search/previous-match                           "Coincidencia anterior (Pág. arriba)"
     :search/next-match                               "Coincidencia siguiente (Pág. abajo)"
     :search/close                                    "Cerrar (ESC)"
     :search/cells-with-selected-attachments          "Las células con archivos y imágenes seleccionados."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Cambiar estilo de las "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; mantén SHIFT para fijar el actual, CTRL para copiar al predeterminado"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "células" "célula" "células"]
                                                                   :link-label [:selection/num-links
                                                                                "enlaces" "enlace" "enlaces"]}]

     :selection/link                                  "Conectar células"
     :selection/hide-contents                         "Ocultar contenido (ESC)"
     :selection/show-contents                         "Mostrar contenido"
     :selection/force-closing                         "Ocultar estos contenidos al abrir la ubicación (ESC)"
     :selection/step-focus-camera                     "Enfoca la cámara de este paso exactamente en las celdas seleccionadas (F2 o Q); mantén presionado SHIFT para añadirlas, ALT para quitarlas."
     :selection/fragment-focus-camera                 "Enfoca la cámara de la ubicación exactamente en las celdas seleccionadas (F2 o Q); mantén presionado SHIFT para añadirlas, ALT para quitarlas."
     :selection/step-show-books                       "Muestra exactamente las celdas seleccionadas en este paso (F3 o W); mantén presionado SHIFT para añadirlas, ALT para quitarlas."
     :selection/fragment-show-books                   "Muestra exactamente las celdas seleccionadas en la ubicación (F3 o W); mantén presionado SHIFT para añadirlas, ALT para quitarlas."
     :selection/force-showing                         "Revelar las células seleccionadas cuando estaban ocultas"
     :selection/share-units                           "Copiar un enlace que muestre las células seleccionadas; mantén SHIFT para abrir la configuración de la ubicación"
     :selection/move-to-new-orgpage                   "Mover a una nueva OrgPage"
     :selection/change-code-lang                      "Cambiar lenguaje de código"
     :selection/copy-units-links                      "Copiar células y enlaces al portapapeles"
     :selection/flip-links                            "Invertir direcciones de enlaces"
     :selection/delete                                "Eliminar seleccionados"

     :settings/profile                                "Perfil"
     :settings/payments                               "Pagos"
     :settings/account                                "Cuenta"
     :settings/linked-accounts                        "Cuentas vinculadas"
     :settings/email                                  "Notificaciones"
     :settings/account-description                    "Cambia tu correo electrónico, contraseña o elimina tu cuenta."
     :settings/stats-description                      "Aquí hay algunas estadísticas sobre tu uso de OrgPad."
     :settings/change-email                           "Cambiar correo electrónico"
     :settings/change-email-text                      "Introduce el nuevo correo electrónico. Por razones de seguridad, debemos verificarlo antes de desbloquear la cuenta."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Has registrado tu cuenta usando el correo electrónico " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Tu cuenta está " [:b "vinculada "] " a Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Tu cuenta está " [:b "no vinculada "] " a Facebook."]
     :settings/link-fb                                "Vincular Facebook"
     :settings/unlink-fb                              "Desvincular Facebook"
     :settings/account-linked-to-google               [:<> "Tu cuenta está " [:b "vinculada "] " a Google."]
     :settings/account-not-linked-to-google           [:<> "Tu cuenta está " [:b "no vinculada "] " a Google."]
     :settings/link-google                            "Vincular Google"
     :settings/unlink-google                          "Desvincular Google"
     :settings/account-linked-to-microsoft            [:<> "Tu cuenta está " [:b "vinculada "] " a Microsoft."]
     :settings/account-not-linked-to-microsoft        [:<> "Tu cuenta está " [:b "no vinculada "] " a Microsoft."]
     :settings/link-microsoft                         "Vincular Microsoft"
     :settings/unlink-microsoft                       "Desvincular Microsoft"
     :settings/account-linked-to-cuni                 [:<> "Tu cuenta está " [:b "vinculada "] " a Charles University."]
     :settings/account-not-linked-to-cuni             [:<> "Tu cuenta está " [:b "no vinculada "] " a Charles University."]
     :settings/link-cuni                              "Vincular Charles University"
     :settings/unlink-cuni                            "Desvincular Charles University"
     :settings/set-password-text                      " Establece una contraseña antes de desvincular."
     :settings/linked-accounts-info                   "Vincula tu cuenta de Facebook, Google, Microsoft o Charles University a OrgPad para usarla para iniciar sesión."
     :settings/profile-info                           "Con la información proporcionada, serás más fácil de encontrar en un proyecto."

     :settings/delete-account                         "Eliminar cuenta"
     :settings/confirm-delete-account-question        [:<> [:b "Permanente"] " eliminar tu cuenta?"]
     :settings/confirm-delete-account-info            "Eliminará todas tus OrgPages y sus datos."
     :settings/delete-account-info                    [:<> "Eliminar eliminará todas tus OrgPages y sus datos " [:b "permanentemente"] "."]

     :share-orgpage/campaigns                         "Campañas"
     :share-orgpage/copied-to-clipboard               "Copiado al portapapeles"
     :share-orgpage/copy-template-link                "Copiar enlace de plantilla"
     :share-orgpage/dialog-title                      "Compartir {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Las personas sin una cuenta de OrgPad recibirán una invitación con un enlace. "
                                                                  "Después de abrir el enlace, podrán leer esta OrgPage. ")
                                                         [:a.link-button create-team "Crear un equipo"]
                                                         " para compartir fácilmente OrgPages con un grupo de personas."])
     :share-orgpage/email-found                       "Se encontró una cuenta de OrgPad."
     :share-orgpage/email-unused                      "No se encontró una cuenta de OrgPad. Envia una invitación por correo electrónico en su lugar."
     :share-orgpage/checking-email-address            "Comprobando dirección de correo electrónico..."
     :share-orgpage/invite-for-editing                "Invitar para editar"
     :share-orgpage/invite-for-viewing                "Invitar para leer"
     :share-orgpage/invite-by-email                   "¿Quieres invitarlos por correo electrónico usando un idioma específico?"
     :share-orgpage/show-profile                      "Mostrar perfil"
     :share-orgpage/links                             "Enlaces"
     :share-orgpage/to-read                           "para leer"
     :share-orgpage/to-comment                        "para comentar"
     :share-orgpage/to-edit                           "para editar"
     :share-orgpage/links-tooltip                     "Conceder acceso a través de enlaces compartibles"
     :share-orgpage/template                          "Plantilla"
     :share-orgpage/template-tooltip                  "Enlaces que crean automáticamente una copia de esta OrgPage"
     :share-orgpage/template-info                     "Las personas pueden usar este enlace para crear sus propias copias de esta OrgPage."
     :share-orgpage/template-autoshare-none           "No compartir las copias conmigo."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Compartir las copias conmigo para "
                                                             (case template-autoshare
                                                               :permission/view "lectura"
                                                               :permission/comment "comentario"
                                                               :permission/edit "edición") "."))
     :share-orgpage/embed                             "Incrustar"
     :share-orgpage/embed-into-microsoft-teams        "Incrustar en Microsoft Teams"
     :share-orgpage/embed-into-website                "Incrustar en sitio web o aplicación"
     :share-orgpage/embed-tooltip                     "Incrustar en sitio web o aplicación"
     :share-orgpage/new-user-or-usergroup             "Nombre, correo electrónico o equipo"
     :share-orgpage/link-permission-start             "Permitir a las personas"
     :share-orgpage/link-permission-end               "esta OrgPage."
     :share-orgpage/orgpage-info                      "Info"
     :share-orgpage/orgpage-info-tooltip              "Información sobre el propietario y si la OrgPage está publicada"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Esta OrgPage está compartida con usted para "
                                                             (case user-permission
                                                               :permission/view "lectura"
                                                               :permission/comment "comentario"
                                                               :permission/edit "edición") "."))
     :share-orgpage/remove-yourself                   "Eliminar a ti mismo"
     :share-orgpage/private-info                      "Solo tú y las personas con las que has compartido la OrgPage directamente o a través de un enlace tienen acceso. Cada documento nuevo es privado."
     :share-orgpage/publish-for-reading-info          "La OrgPage es pública. Cualquiera en Internet puede buscarla y leerla. Solo tú o las personas con las que has compartido la OrgPage para editar pueden hacer cambios."
     :share-orgpage/publish-permission-end            "Esta OrgPage es "
     :share-orgpage/publish                           "Publicar"
     :share-orgpage/publish-confirmation              "Todos podrán {orgpage/permission} esta OrgPage. ¿Estás seguro?"
     :share-orgpage/publish-tooltip                   "Conceder acceso a todos"
     :share-orgpage/remove-user                       "Eliminar permiso"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Si compartiste un enlace por error, puedes "
                                                         [:span.link-button reset-links "invalidar todos los enlaces anteriores"]
                                                         "."])
     :share-orgpage/shareable-link                    "Enlace compartible"
     :share-orgpage/everything-closed                 "Mostrar todas las células cerradas"
     :share-orgpage/presentation                      "Iniciar con una presentación"
     :share-orgpage/fragment                          "Mostrar una ubicación"
     :share-orgpage/template-link-switch              "Crear un enlace de plantilla."
     :share-orgpage/user-not-registered               " no ha registrado en OrgPad."
     :share-orgpage/users                             "Personas"
     :share-orgpage/users-tooltip                     "Conceder acceso a personas individuales"

     :side-panel/about                                "Página de inicio"
     :side-panel/terms-and-conditions                 "Términos y condiciones"
     :side-panel/privacy-and-security                 "Privacidad y seguridad"
     :side-panel/files-and-images                     "Archivos y imágenes"
     :side-panel/paths                                "Presentaciones"
     :side-panel/fragments                            "Ubicaciones"
     :side-panel/translate                            "Traducir"
     :side-panel/toggle-debug                         "Depurador"
     :side-panel/help                                 "Ayuda"
     :side-panel/blog                                 "Blog"
     :side-panel/home                                 "Inicio"
     :side-panel/import                               "Importar"
     :side-panel/share                                "Compartir"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "archivos" "archivo" "archivos"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "imágenes" "imagen" "imágenes"]}]
     :side-panel/num-paths                            [:i18n/plural "{side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "presentaciones" "presentación" "presentaciones"]}]
     :side-panel/num-fragments                        [:i18n/plural "{side-panel/num-fragments} {side-panel/fragments-label}"
                                                       {:side-panel/fragments-label [:side-panel/num-fragments
                                                                                     "ubicaciones" "ubicación" "ubicaciones"]}]

     :step/closed-books                               "Células cerradas"
     :step/everything-closed                          "Todo cerrado."
     :step/hidden-books                               "Células ocultas"
     :step/nothing-changed                            "Nada cambiado."
     :step/opened-pages                               "Páginas abiertas"
     :step/focused-books                              "Células en la cámara"
     :step/shown-books                                "Células mostradas"
     :step/switched-pages                             "Páginas cambiadas"

     :style-select/set-comment                        "Cambiar a célula de comentario con tu foto de perfil (CTRL+,)"
     :style-select/unset-comment                      "Cambiar a célula normal, quitando la foto de perfil (CTRL+,)"
     :style-select/set-comment-safari                 "Cambiar a célula de comentario con tu foto de perfil (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "Cambiar a célula normal, quitando la foto de perfil (SHIFT+CMD+,)"

     :tag/public                                      "público"

     :text-field/email                                "Correo electrónico"
     :text-field/first-name                           "Nombre"
     :text-field/last-name                            "Apellido"
     :text-field/name                                 "Nombre"
     :text-field/new-password                         "Nueva contraseña"
     :text-field/password                             "Contraseña"
     :text-field/content                              "Contenido"
     :text-field/name-or-email                        "Nombre o correo electrónico"
     :text-field/subject                              "Asunto"
     :text-field/message                              "Mensaje"
     :text-field/phone-number                         "Número de teléfono"
     :text-field/width                                "Ancho"
     :text-field/height                               "Altura"

     :translate/title                                 "Traducir OrgPage {orgpage/title} a otro idioma"
     :translate/info                                  (str "Crea automáticamente una copia de esta OrgPage propiedad de ti"
                                                           " que se traduce del idioma fuente al idioma objetivo."
                                                           " Puedes encontrarla en tu lista en unos minutos.")
     :translate/source-lang                           "Idioma fuente"
     :translate/target-lang                           "Idioma objetivo"
     :translate/translate                             "Traducir"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Traducción disponible como "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :unit-editor/add-page                            "Crear otra página (CTRL+AV PÁG)"
     :unit-editor/delete-page                         "Eliminar esta página"
     :unit-editor/previous-page                       (str "Página anterior (RE PÁG);"
                                                           " mantén SHIFT para mover esta página a la izquierda (SHIFT+RE PÁG);"
                                                           " mantén CTRL para añadir otra página antes de esta (CTRL+RE PÁG)")
     :unit-editor/next-page                           (str "Página siguiente (AV PÁG);"
                                                           " mantén SHIFT para mover esta página a la derecha (SHIFT+AV PÁG);"
                                                           " mantén CTRL para añadir otra página después de esta (CTRL+AV PÁG)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Cambiar a esta página"
                                                             (when can-edit "; mantén SHIFT para mover la página actual allí")))
     :unit-editor/hidden-info                         "Haz clic para escribir"
     :unit-editor/undo                                "Deshacer (CTRL+Z)"
     :unit-editor/redo                                "Rehacer (CTRL+SHIFT+Z o CTRL+Y)"
     :unit-editor/toggle-bold                         "Negrita (CTRL+B)"
     :unit-editor/toggle-italic                       "Itálica (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Tachado"
     :unit-editor/toggle-subscript                    "Subíndice (CTRL+S)"
     :unit-editor/toggle-superscript                  "Superíndice (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Crear hipervínculo (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Eliminar hipervínculo"
     :unit-editor/set-highlighting                    "Color de resaltado"
     :unit-editor/selection->code                     "Convertir a código (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Lista desordenada (TAB)"
     :unit-editor/toggle-list-ol                      "Lista ordenada (CTRL+O)"
     :unit-editor/indent                              "Aumentar sangría (TAB)"
     :unit-editor/outdent                             "Disminuir sangría (SHIFT+TAB)"
     :unit-editor/center                              "Centrar (CTRL+L)"
     :unit-editor/heading                             "Título (CTRL+G)"
     :unit-editor/embed-pdf                           "Mostrar contenido PDF"
     :unit-editor/link-pdf                            "Reemplazar contenido PDF con su hipervínculo"
     :unit-editor/embed-office                        "Mostrar contenido de Microsoft 365"
     :unit-editor/link-office                         "Reemplazar contenido de Microsoft 365 con su hipervínculo"
     :unit-editor/embed-video                         "Mostrar reproductor de vídeo"
     :unit-editor/link-video                          "Reemplazar vídeo con su hipervínculo"
     :unit-editor/embed-audio                         "Mostrar reproductor de audio"
     :unit-editor/link-audio                          "Reemplazar audio con su hipervínculo"
     :unit-editor/hyperlink->embed                    "Insertar sitio web vinculado"
     :unit-editor/embed->hyperlink                    "Reemplazar sitio web incrustado con su hipervínculo"
     :unit-editor/open-image-in-attachments           "Abrir esta imagen en la lista de archivos adjuntos"
     :unit-editor/open-file-in-attachments            "Abrir este archivo en la lista de archivos adjuntos"
     :unit-editor/toggle-controls                     "Mostrar controles del reproductor de vídeo"
     :unit-editor/toggle-autoplay                     "Reproducir automáticamente"
     :unit-editor/toggle-muted                        "Reproducir en modo silencioso, la reproducción automática podría estar bloqueada de otra manera"
     :unit-editor/toggle-loop                         "Repetir reproducción"
     :unit-editor/toggle-chained-size                 "Mantener proporción"
     :unit-editor/insert-menu                         "Insertar"
     :unit-editor/insert-image                        "Imagen"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Carga una imagen desde tu dispositivo."
     :unit-editor/insert-image-info2                  "Consejo: Arrastra o pega imágenes directamente en cualquier celda o lienzo gris."
     :unit-editor/insert-camera                       "Cámara"
     :unit-editor/insert-attachment                   "Archivo"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Vídeo"
     :unit-editor/insert-video-info                   "Carga un vídeo desde tu ordenador o inserta uno de YouTube."
     :unit-editor/insert-video-info2                  "Consejo: Arrastra vídeos y miniaturas de YouTube directamente en cualquier celda o lienzo gris."
     :unit-editor/video-url                           "Enlace de YouTube"
     :unit-editor/youtube-start                       "Inicio"
     :unit-editor/youtube-end                         "Fin"
     :unit-editor/insert-table                        "Tabla"
     :unit-editor/insert-table-info                   "Elige el tamaño de la tabla que quieres insertar."
     :unit-editor/toggle-table-border                 "Mostrar bordes de la tabla"
     :unit-editor/add-row-before                      "Insertar fila arriba"
     :unit-editor/add-row-after                       "Insertar fila abajo"
     :unit-editor/remove-current-row                  "Eliminar fila"
     :unit-editor/add-column-before                   "Insertar columna a la izquierda"
     :unit-editor/add-column-after                    "Insertar columna a la derecha"
     :unit-editor/remove-current-column               "Eliminar columna"
     :unit-editor/remove-table                        "Eliminar tabla"
     :unit-editor/insert-website                      "Sitio web"
     :unit-editor/insert-website-info                 (str "Puedes incrustar sitios web directamente en una celda. "
                                                           "Si no funciona, podría estar bloqueado por el propietario del sitio web.")
     :unit-editor/website-url-or-code                 "Dirección o código del sitio web"
     :unit-editor/website-id                          "ID del sitio web"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "Usado para "
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "enviar mensajes entre sitios web"] "."])
     :unit-editor/invalid-website-url                 "Dirección o código de sitio web inválidos"
     :unit-editor/invalid-video-url                   "Dirección de vídeo inválida"
     :unit-editor/update-website                      "Cambiar dirección del sitio web"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "Código"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "Copiar código"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "Código como un párrafo separado"
     :unit-editor/toggle-block-math                   "Matemáticas en una línea separada"
     :unit-editor/remove-code                         "Quitar formato de código"
     :unit-editor/insert-math                         "Matemáticas / Química"

     :unit-panel/link                                 (str "Haz clic o arrastra para conectar;"
                                                           " mantén SHIFT para crear múltiples conexiones;"
                                                           " mantén CTRL para crear una cadena de células")
     :unit-panel/upload-attachment                    "Insertar imagen o archivo en esta célula"
     :unit-panel/change-link-style                    (str "Cambiar estilo de esta célula;"
                                                           " mantén SHIFT para establecer el actual,"
                                                           " mantén CTRL para copiar al predeterminado;"
                                                           " arrastra para conectar en este estilo")
     :unit-panel/hide-content                         "Ocultar contenido"
     :unit-panel/delete-unit                          "Eliminar célula"

     :usergroup/create                                "Crear un equipo"
     :usergroup/edit-title                            "Editar {usergroup/name}"
     :usergroup/info                                  "Crea y gestiona equipos de amigos y compañeros para simplificar el intercambio de OrgPages."
     :usergroup/delete                                "Eliminar equipo"
     :usergroup/members                               "Miembros"
     :usergroup/edit                                  "Cambiar nombre y logo del equipo"
     :usergroup/show-actions                          "Mostrar acciones"
     :usergroup/name                                  "Nombre"
     :usergroup/hide-orgpages                         "Ocultar OrgPages compartidas"
     :usergroup/hide-orgpages-tooltip                 "Se pueden mostrar activando el equipo en el filtro"
     :usergroup/hide-in-filter                        "Ocultar en el filtro"
     :usergroup/create-info                           "El nombre del equipo y la foto de perfil son visibles solo para los miembros del equipo."
     :usergroup/confirm-delete                        [:<> [:b "Permanente"] " eliminar este equipo?"]
     :usergroup/members-title                         "Miembros de {usergroup/name}"
     :usergroup/remove-member                         "Eliminar del equipo"
     :usergroup/remove-admin                          "Eliminar administrador"
     :usergroup/make-admin                            "Hacer administrador"
     :usergroup/admin-tooltip                         "Un administrador puede gestionar los miembros y eliminar el equipo."
     :usergroup/copy-usergroup                        "Copiar equipo"

     :usergroup-role/owner                            "Propietario"
     :usergroup-role/admin                            "Administrador"
     :usergroup-role/member                           "Miembro"

     :wire-transfer/title                             "Transferencia bancaria para el plan anual {wire-transfer/tier}"
     :wire-transfer/info                              "Activaremos tu suscripción anual cuando recibamos tu dinero en nuestra cuenta."
     :wire-transfer/used-currency                     "Pago en {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Nombre del receptor"
     :wire-transfer/account-number                    "Número de cuenta"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Cantidad"
     :wire-transfer/payment-purpose                   "Propósito del pago"
     :wire-transfer/qr-code-common                    (str "Escanea este código QR de pago con tu aplicación bancaria para rellenar"
                                                           " la información correcta automáticamente.")
     :wire-transfer/cz-sk-qr-code-description         (str " Este es un código QR comúnmente utilizado para transferencias bancarias"
                                                           " en la República Checa y Eslovaquia.")
     :wire-transfer/eu-qr-code-description            (str " Este es un código QR comúnmente utilizado para transferencias SEPA"
                                                           " en la Unión Europea.")
     :wire-transfer/trial-info                        (str "Puedes iniciar una suscripción de prueba de 7 días para usar OrgPad"
                                                           " con el nuevo plan inmediatamente. Cuando el banco confirme que el pago"
                                                           " ha sido exitoso, el período de suscripción se extenderá"
                                                           " por 1 año.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Si tienes alguna pregunta o dificultad, por favor"
                                                         " háznoslo saber " [:a.link-button {:href url} "completando este formulario"] "."])
     :wire-transfer/success-text                      [:<> "Hemos activado una " [:b "suscripción de prueba de 7 días"]
                                                       " para que puedas usar OrgPad con el nuevo plan inmediatamente. "]
     :wire-transfer/common-result-text                (str "Cuando el banco confirme que el pago ha sido exitoso,"
                                                           " el período de suscripción se extenderá"
                                                           " por 1 año.")
     :wire-transfer/start-trial                       "Transferencia bancaria enviada"
     :wire-transfer/start-trial-result-title          "Gracias por el pago"
     :wire-transfer/copy                              "Copiar al portapapeles"

     :website-editor/settings                         "Configuración"
     :website-editor/routes                           "Rutas"
     :website-editor/menus                            "Menús"
     :website-editor/create-menu                      "Crear menú"
     :website-editor/edited-menu                      "Menú editado"
     :website-editor/untitled-menu                    "Menú sin título"
     :website-editor/num-subitems                     [:i18n/plural "{menu-item/num-children} {menu-item/children-label}"
                                                       #:menu-item{:children-label [:menu-item/num-children
                                                                                    "elementos" "elemento" "elementos"]}]
     :website-editor/delete-menu-item                 "Eliminar este elemento del menú"
     :website-editor/add-menu-item                    "Añadir elemento al menú"
     :website-editor/menu-item-label                  "Etiqueta del elemento"
     :menu-item/path-type                             "Abre una ruta"
     :menu-item/url-type                              "Abre una URL externa"
     :menu-item/children-type                         "Abre un submenú"
     :website-editor/menu-item-path                   "Ruta"

     :youtube-placement/watch-on-prefix               (str "Ver" unicode/nbsp "en")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/es dict)