(ns orgpad.common.i18n.dict.de)

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  {:lang/plural-breaks [0 1 2]                              ; Counts of elements for which the next translation for :i18n/plural is used.

   :tier/free          "Kostenlos"
   :tier/standard      "Standard"
   :tier/professional  "Professional"
   :tier/school        "Schule"
   :tier/enterprise    "Unternehmen"
   :tier/unlimited     "Unbegrenzt"

   :date/january       "January"
   :date/february      "February"
   :date/march         "March"
   :date/april         "April"
   :date/may           "May"
   :date/june          "June"
   :date/july          "July"
   :date/august        "August"
   :date/september     "September"
   :date/october       "October"
   :date/november      "November"
   :date/december      "December"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Proforma-Rechnung "
                                "Rechnung ")
                              full-number))})