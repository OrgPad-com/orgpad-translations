(ns orgpad.common.i18n.dict.cs)

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  {:lang/plural-breaks [0 1 2 5]                            ; Counts of elements for which the next translation for :i18n/plural is used.

   :tier/free          "Zdarma"
   :tier/standard      "Standardní"
   :tier/professional  "Profesionální"
   :tier/school        "Školní"
   :tier/enterprise    "Firemní"
   :tier/unlimited     "Neomezené"

   :date/january       "Leden"
   :date/february      "Únor"
   :date/march         "Březen"
   :date/april         "Duben"
   :date/may           "Květen"
   :date/june          "Červen"
   :date/july          "Červenec"
   :date/august        "Srpen"
   :date/september     "Září"
   :date/october       "Říjen"
   :date/november      "Listopad"
   :date/december      "Prosinec"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Zálohová faktura "
                                "Faktura ") full-number))})