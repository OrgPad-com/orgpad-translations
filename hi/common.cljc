(ns orgpad.common.i18n.dict.hi)

(def dict
  "A dictionary map from keywords to the corresponding Hindi texts."
  {:lang/plural-breaks [0 1]

   :tier/free          "निःशुल्क"
   :tier/standard      "मानक"
   :tier/professional  "पेशेवर"
   :tier/school        "विद्यालय"
   :tier/enterprise    "उद्यम"
   :tier/unlimited     "असीमित"

   :date/january       "जनवरी"
   :date/february      "फरवरी"
   :date/march         "मार्च"
   :date/april         "अप्रैल"
   :date/may           "मई"
   :date/june          "जून"
   :date/july          "जुलाई"
   :date/august        "अगस्त"
   :date/september     "सितंबर"
   :date/october       "अक्टूबर"
   :date/november      "नवंबर"
   :date/december      "दिसंबर"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "प्रोफॉर्मा चालान "
                                "चालान ") full-number))})
