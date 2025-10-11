(ns orgpad.common.i18n.dict.zh)

(def dict
  "A dictionary map from keywords to the corresponding Chinese texts."
  {:tier/free          "免费"
   :tier/standard      "标准"
   :tier/professional  "专业"
   :tier/school        "学校"
   :tier/enterprise    "企业"
   :tier/unlimited     "无限"

   :date/january       "一月"
   :date/february      "二月"
   :date/march         "三月"
   :date/april         "四月"
   :date/may           "五月"
   :date/june          "六月"
   :date/july          "七月"
   :date/august        "八月"
   :date/september     "九月"
   :date/october       "十月"
   :date/november      "十一月"
   :date/december      "十二月"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "形式发票 "
                                "发票 ") full-number))})
