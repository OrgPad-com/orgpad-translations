(ns orgpad.common.i18n.dict.en)

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  {:lang/plural-breaks [0 1 2]                       ; Counts of elements for which the next translation for :i18n/plural is used.

   :tier/free          "Free"
   :tier/standard      "Standard"
   :tier/professional  "Professional"
   :tier/school        "School"
   :tier/enterprise    "Enterprise"
   :tier/unlimited     "Unlimited"

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
                                "Proforma invoice "
                                "Invoice ") full-number))})