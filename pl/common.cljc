(ns orgpad.common.i18n.dict.pl)

(def dict
  "A dictionary map from keywords to the corresponding Polish texts."
  {:lang/plural-breaks [0 1 2 5]

   :tier/free          "Darmowy"
   :tier/standard      "Standardowy"
   :tier/professional  "Profesjonalny"
   :tier/school        "Szkolny"
   :tier/enterprise    "Biznesowy"
   :tier/unlimited     "Nielimitowany"

   :date/january       "Styczeń"
   :date/february      "Luty"
   :date/march         "Marzec"
   :date/april         "Kwiecień"
   :date/may           "Maj"
   :date/june          "Czerwiec"
   :date/july          "Lipiec"
   :date/august        "Sierpień"
   :date/september     "Wrzesień"
   :date/october       "Październik"
   :date/november      "Listopad"
   :date/december      "Grudzień"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Faktura proforma "
                                "Faktura ") full-number))})
