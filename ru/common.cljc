(ns orgpad.common.i18n.dict.ru)

(def dict
  "A dictionary map from keywords to the corresponding Russian texts."
  {:lang/plural-breaks [0 1 2 5]                            ; Counts of elements for which the next translation for :i18n/plural is used.

   :tier/free          "Свободный"
   :tier/standard      "Стандартный"
   :tier/professional  "Профессиональный"
   :tier/school        "Школьный"
   :tier/enterprise    "Корпоративный"
   :tier/unlimited     "Безлимитный"

   :date/january       "Январь"
   :date/february      "Февраль"
   :date/march         "Март"
   :date/april         "Апрель"
   :date/may           "Май"
   :date/june          "Июнь"
   :date/july          "Июль"
   :date/august        "Август"
   :date/september     "Сентябрь"
   :date/october       "Октябрь"
   :date/november      "Ноябрь"
   :date/december      "Декабрь"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Проформа-счёт "
                                "Счёт ") full-number))})