(ns orgpad.common.i18n.dict.kr)

(def dict
  "A dictionary map from keywords to the corresponding Korean texts."
  {:tier/free          "무료"
   :tier/standard      "스탠다드"
   :tier/professional  "프로페셔널"
   :tier/school        "학교"
   :tier/enterprise    "기업"
   :tier/unlimited     "무제한"

   :date/january       "1월"
   :date/february      "2월"
   :date/march         "3월"
   :date/april         "4월"
   :date/may           "5월"
   :date/june          "6월"
   :date/july          "7월"
   :date/august        "8월"
   :date/september     "9월"
   :date/october       "10월"
   :date/november      "11월"
   :date/december      "12월"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "견적 송장 "
                                "송장 ") full-number))})
