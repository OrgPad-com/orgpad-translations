(ns orgpad.common.i18n.dict.sk)

(def dict
  "A dictionary map from keywords to the corresponding Slovak texts."
  {:lang/plural-breaks [0 1 2 5]                            ; Counts of elements for which the next translation for :i18n/plural is used.

   :tier/free          "Zadarmo"
   :tier/standard      "Štandard"
   :tier/professional  "Profesionál"
   :tier/school        "Škola"
   :tier/enterprise    "Firma"
   :tier/unlimited     "Neobmedzený"

   :date/january       "Január"
   :date/february      "Február"
   :date/march         "Marec"
   :date/april         "Apríl"
   :date/may           "Máj"
   :date/june          "Jún"
   :date/july          "Júl"
   :date/august        "August"
   :date/september     "September"
   :date/october       "Október"
   :date/november      "November"
   :date/december      "December"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Zálohová faktúra "
                                "Faktúra ") full-number))})
