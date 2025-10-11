(ns orgpad.common.i18n.dict.fr)

(def dict
  "A dictionary map from keywords to the corresponding French texts."
  {:lang/plural-breaks [0 1 2]                              ; Counts of elements for which the next translation for :i18n/plural is used.

   :tier/free          "Gratuit"
   :tier/standard      "Standard"
   :tier/professional  "Professionnel"
   :tier/school        "Scolaire"
   :tier/enterprise    "Entreprise"
   :tier/unlimited     "Illimité"

   :date/january       "Janvier"
   :date/february      "Février"
   :date/march         "Mars"
   :date/april         "Avril"
   :date/may           "Mai"
   :date/june          "Juin"
   :date/july          "Juillet"
   :date/august        "Août"
   :date/september     "Septembre"
   :date/october       "Octobre"
   :date/november      "Novembre"
   :date/december      "Décembre"

   :invoice/title      (fn [{:invoice/keys [type full-number]}]
                         (str (if (= type :invoice/proforma-wire-transfer)
                                "Facture proforma "
                                "Facture ")
                              full-number))})