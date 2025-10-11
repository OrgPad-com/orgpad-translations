(ns orgpad.common.i18n.dict.es)

(def dict
  "A dictionary map from keywords to the corresponding Spanish texts."
  {:lang/plural-breaks [0 1]                         ; Counts of elements for which the next translation for :i18n/plural is used

   :tier/free          "Gratis"
   :tier/standard      "Estándar"
   :tier/professional  "Profesional"
   :tier/school        "Escolar"
   :tier/enterprise    "Empresarial"
   :tier/unlimited     "Ilimitado"

   :date/january       "Enero"
   :date/february      "Febrero"
   :date/march         "Marzo"
   :date/april         "Abril"
   :date/may           "Mayo"
   :date/june          "Junio"
   :date/july          "Julio"
   :date/august        "Agosto"
   :date/september     "Septiembre"
   :date/october       "Octubre"
   :date/november      "Noviembre"
   :date/december      "Diciembre"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Factura proforma "
                                "Factura ") full-number))})