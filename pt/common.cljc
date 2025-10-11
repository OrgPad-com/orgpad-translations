(ns orgpad.common.i18n.dict.pt)

(def dict
  "A dictionary map from keywords to the corresponding Portuguese texts."
  {:lang/plural-breaks [0 1 2]                              ; Counts of elements for which the next translation for :i18n/plural is used.

   :tier/free          "Grátis"
   :tier/standard      "Padrão"
   :tier/professional  "Profissional"
   :tier/school        "Escola"
   :tier/enterprise    "Empresarial"
   :tier/unlimited     "Ilimitado"

   :date/january       "Janeiro"
   :date/february      "Fevereiro"
   :date/march         "Março"
   :date/april         "Abril"
   :date/may           "Maio"
   :date/june          "Junho"
   :date/july          "Julho"
   :date/august        "Agosto"
   :date/september     "Setembro"
   :date/october       "Outubro"
   :date/november      "Novembro"
   :date/december      "Dezembro"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Fatura proforma "
                                "Fatura ") full-number))})