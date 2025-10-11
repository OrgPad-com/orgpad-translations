(ns orgpad.common.i18n.dict.uk)

(def dict
  "A dictionary map from keywords to the corresponding Ukrainian texts."
  {:lang/plural-breaks [0 1 2 5]                            ; Counts of elements for which the next translation for :i18n/plural is used.

   :tier/free          "Вільний"
   :tier/standard      "Стандартний"
   :tier/professional  "Професійний"
   :tier/school        "Шкільний"
   :tier/enterprise    "Корпоративний"
   :tier/unlimited     "Безлімітний"

   :date/january       "Січень"
   :date/february      "Лютий"
   :date/march         "Березень"
   :date/april         "Квітнь"
   :date/may           "Травень"
   :date/june          "Червень"
   :date/july          "Липень"
   :date/august        "Серпень"
   :date/september     "Вересень"
   :date/october       "Жовтень"
   :date/november      "Листопад"
   :date/december      "Грудень"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Проформа-рахунок "
                                "Рахунок ") full-number))})