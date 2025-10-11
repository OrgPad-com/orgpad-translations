(ns orgpad.common.i18n.dict.jp)

(def dict
  "A dictionary map from keywords to the corresponding Japanese texts."
  {:tier/free          "無料"
   :tier/standard      "スタンダード"
   :tier/professional  "プロフェッショナル"
   :tier/school        "学校"
   :tier/enterprise    "エンタープライズ"
   :tier/unlimited     "無制限"

   :date/january       "1月"
   :date/february      "2月"
   :date/march         "3月"
   :date/april         "4月"
   :date/may           "5月"
   :date/june          "6月"
   :date/july          "7月"
   :date/august        "8月"
   :date/september     "9月"
   :date/october       "10月"
   :date/november      "11月"
   :date/december      "12月"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "プロフォーマインボイス "
                                "請求書 ") full-number))})
