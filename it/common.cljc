(ns orgpad.common.i18n.dict.it)

(def dict
  "A dictionary map from keywords to the corresponding Italian texts."
  {:lang/plural-breaks [0 1 2]

   :tier/free          "Gratuito"
   :tier/standard      "Standard"
   :tier/professional  "Professionale"
   :tier/school        "Scuola"
   :tier/enterprise    "Azienda"
   :tier/unlimited     "Illimitato"

   :date/january       "Gennaio"
   :date/february      "Febbraio"
   :date/march         "Marzo"
   :date/april         "Aprile"
   :date/may           "Maggio"
   :date/june          "Giugno"
   :date/july          "Luglio"
   :date/august        "Agosto"
   :date/september     "Settembre"
   :date/october       "Ottobre"
   :date/november      "Novembre"
   :date/december      "Dicembre"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Fattura proforma "
                                "Fattura ") full-number))})
