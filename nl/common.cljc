(ns orgpad.common.i18n.dict.nl)

(def dict
  "A dictionary map from keywords to the corresponding Dutch texts."
  {:lang/plural-breaks [0 1 2]

   :tier/free          "Gratis"
   :tier/standard      "Standaard"
   :tier/professional  "Professioneel"
   :tier/school        "School"
   :tier/enterprise    "Onderneming"
   :tier/unlimited     "Onbeperkt"

   :date/january       "Januari"
   :date/february      "Februari"
   :date/march         "Maart"
   :date/april         "April"
   :date/may           "Mei"
   :date/june          "Juni"
   :date/july          "Juli"
   :date/august        "Augustus"
   :date/september     "September"
   :date/october       "Oktober"
   :date/november      "November"
   :date/december      "December"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Proforma factuur "
                                "Factuur ") full-number))})
