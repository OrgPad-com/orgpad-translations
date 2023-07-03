(ns orgpad.server.i18n.cs
  (:require [orgpad.common.i18n.dict.cs :as cs]))

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  (merge
    cs/dict
    {:orgpage/untitled                                    "dokumentu"
     :permission/view                                     "ke čtení"
     :permission/edit                                     "k úpravě"

     :subscription/monthly                                "měsíc"
     :subscription/yearly                                 "rok"

     :tier/standard                                       "Standardní"
     :tier/professional                                   "Profesionální"
     :tier/school                                         "Školní"
     :tier/enterprise                                     "Firemní"
     :tier/unlimited                                      "Neomezené"

     :email/customer                                      "zákazníku"
     :email/greeting                                      "Vážený {{customer}},"
     :email/signature                                     "S pozdravem"
     :email/ceo                                           "Vít Kalisz, CEO"
     :email/contact-us                                    (fn [{:feedback/keys [url]}]
                                                            (list "Pokud narazíte na jakékoliv problémy, prosím ozvěte se nám buď pomocí " [:a {:href (str "{{domain}}" url)} "formuláře v aplikaci"]
                                                                  " nebo nám pošlete e-mail na " [:a {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."))
     :email/or                                            " nebo "

     :invitation/subject                                  "Jste pozváni {{action}} dokumentu v OrgPadu"
     :invitation/preheader                                "{{user}} vás zve {{action}} {{title}}. K otevření dokumentu prosím klikněte na tlačítko níže."
     :invitation/heading                                  "{{user}} vás zve {{action}} {{title}}"
     :invitation/info                                     "OrgPad je platforma na vytváření vizuálních dokumentů pro získání nadhledu. Kliknutím na následující tlačítko přijmete pozvánku a otevřete dokument."
     :invitation/button                                   "Otevřít dokument"
     :invitation/accidental-email                         "Pokud jste tento e-mail obdrželi omylem, smažte ho prosím. Pokud tyto e-maily dostáváte opakovaně, můžete "
     :invitation/block-user                               "zablokovat pozvánky od {{user}}"
     :invitation/block-all                                "zablokovat všechny pozvánky"

     :june-newsletter-2023/subject                        "Změny, inspirace a úspěchy v OrgPadu – letní newsletter je tu!"
     :june-newsletter-2023/preheader                      (str "Pět propracovaných OrgStránek, několik velkých vylepšení, pohled do budoucnosti"
                                                               " a pár velkých úspěchů. To je v kostce aktuální newsletter. Kliknutím na tlačítko"
                                                               " se Vám otevřou nové obzory!")
     :june-newsletter-2023/introduction                   (str "přinášíme Vám newsletter praskající ve švech inspirací a novinkami. Bodejť by"
                                                               " ne, poslední jsme rozesílali před Vánoci a od té doby jsme pilně pracovali."
                                                               " Vlastně… Newsletter je schovaný pod následujícím tlačítkem. Klikněte na něj!")
     :june-newsletter-2023/button                         "To mě zaujalo!"
     :june-newsletter-2023/details                        (str "Vybrali jsme pro Vás pět úžasných veřejných materiálů, které se v OrgPadu za"
                                                               " posledního půl roku objevily, čeká Vás také cesta časem do budoucnosti kde"
                                                               " zjistíte, jak bude OrgPad vypadat, až se k němu v září vrátíte. Nyní klikněte"
                                                               " na tlačítko a nechte se inspirovat.")
     :june-newsletter-2023/best-wishes                    "Za celý tým OrgPadu Vám přeji krásné a odpočinkové prázdniny"

     :footer/unsubscribe                                  (fn [{:footer/keys [href-orgpad href-unsubscribe]}]
                                                            (list [:a href-orgpad "https://orgpad.com"] ". Nechcete dostávat tyto e-maily? "
                                                                  [:a href-unsubscribe "Odhlaste se"] "."))

     :orgpage/copy                                        "kopie"

     :password-reset/subject                              "Obnovení Vašeho hesla v OrgPadu"
     :password-reset/preheader                            "Pomocí kliknutí na tlačítko níže obnovíte Vaše heslo v OrgPadu."
     :password-reset/heading                              "Obnovení Vašeho hesla v OrgPadu"
     :password-reset/text-1                               "Pro obnovení Vašeho hesla prosím klikněte na tlačítko níže. Platné je po dobu 24 hodin."
     :password-reset/button                               "Obnovit heslo"
     :password-reset/text-2                               "Pokud jste obnovu hesla nevyvolali, nebo pokud už obnovu nepotřebujete, nemusíte nic podnikat."

     :verification/subject                                "Ověření Vašeho účtu v OrgPadu"
     :verification/preheader                              "Vítejte v OrgPadu. Pomocí kliknutí na tlačítko níže prosím ověřte Váš účet."
     :verification/heading                                "Ověření Vašeho e-mailu"
     :verification/verify-account-info                    "Pro ověření Vašeho účtu, prosím klikněte na tlačítko níže. Kliknutím na tlačítko dále souhlasíte s "
     :verification/terms-and-conditions                   "podmínkami použití OrgPadu"
     :verification/button                                 "Ověřit e-mailovou adresu"
     :verification/received-by-mistake                    "Pokud jste tento e-mail obdrželi omylem, smažte ho prosím. Pokud tyto e-maily dostáváte opakovaně, kontaktujte nás prosím na adrese "
     :verification/support-email                          "support@orgpad.com"

     :feedback/subject                                    "Otázka: {{title}}"
     :feedback/preheader                                  "{{first-name}} {{last-name}} odeslal otázku {{title}}"
     :feedback/heading                                    "{{first-name}} {{last-name}} ({{email}}) odeslal otázku {{title}}"

     ;; newsletter was never really used
     :conference-invitation-2022/subject                  "Pozvánka na OrgPad konferenci 19. listopadu 2022"
     :conference-invitation-2022/preheader                (str "19. Listopadu v 9:30 začíná v Praze na Smíchově v pořadí již druhá OrgPad konference a Vy u toho nesmíte chybět!"
                                                               " Jde totiž o setkání komunity jejíž jste členem. Těšit se můžete na osm dvacetiminutových přednášek, zajímavé lidi,"
                                                               " skvělé občerstvení a soutěž. Přednášející jsou: Barbora Jeřábková, Janek Wagner, Radko Sáblík, Tomáš Baránek,"
                                                               " Ondřej Lněnička, Václav Maněna a Petra Plachá")
     :conference-invitation-2022/introduction             (str "srdečně Vás zvu na OrgPad konferenci, která proběhne zhruba za týden v sobotu 19. listopadu 2022"
                                                               " od 9:30 v nádherných prostorách Next Zone, Preslova 25, Praha 5-Smíchov.")
     :conference-invitation-2022/info                     (str "Přijďte se poznat s ostatními členy komunity! Těšit se můžete na zajímavé přednášky"
                                                               " a chutné občerstvení. Vstup je zdarma.")
     :conference-invitation-2022/button                   "Přihlásit se na konferenci"
     :conference-invitation-2022/program                  (list "Program konference:"
                                                                [:ul {:style {:list-style-type "none"
                                                                              :margin          0
                                                                              :padding         0}}
                                                                 [:li "09:30 - 10:00 Recepce"]
                                                                 [:li "10:10 - 10:40 Zahájení a tvůrci OrgPadu"]
                                                                 [:li "10:45 - 11:05 Baruš Jeřábková, \"Jen\" aplikace"]
                                                                 [:li "11:30 - 11:50 Janek Wagner, České školství očima ajťáka aneb Jsem z toho janek"]
                                                                 [:li "12:00 - 12:20 Radko Sáblík, Vzdělávání pro 21. století"]
                                                                 [:li "13:00 - 13:20 Tomáš Baránek, Příprava autorské knihy a online kurzu v OrgPadu"]
                                                                 [:li "13:30 - 13:50 Ondřej Lněnička, Jak jsme se stali školou na OrgPadu závislou"]
                                                                 [:li "14:10 - 14:30 Václav Maněna, OrgPad v profesním i osobním životě učitele"]
                                                                 [:li "14:40 - 15:00 Petra Plachá, My, ORGanizovaní proPADlí"]
                                                                 [:li "15:00 - 15:30 Open Mic (3 - 5 minutové sloty)"]
                                                                 [:li "15:30 - 17:00 Vyhlášení soutěže, volná diskuze a doprovodný program"]])
     :conference-invitation-2022/best-wishes2             "Za tvůrce OrgPadu s pozdravem"

     :contact-user/subject                                "Byli jste kontaktováni přes OrgPad"
     :contact-user/preheader                              "Zpráva od {{user}}"
     :contact-user/heading                                "{{user}} ({{reply-to}}) Vás kontaktuje přes OrgPad"
     :contact-user/common-info                            (str "Tento e-mail Vám píšeme my, protože Vaši e-mailovou adresu s nikým nesdílíme. Na zprávu můžete "
                                                               "reagovat zasláním odpovědi na tuto zprávu nebo zprávou na e-mail {{reply-to}}.")
     :contact-user/post-message-info                      "Pokud je zpráva nevyžádaná, můžete "
     :contact-user/block-user                             "zablokovat všechny zprávy od {{user}}"
     :contact-user/block-all                              "zablokovat všechny zprávy od všech lidí z OrgPadu."

     :new-payment/subject                                 "Platba proběhla v pořádku"
     :new-payment/preheader                               "Obnovili jste Vaše předplatné {{tier}} pro období do {{subscription-end}}."
     :new-payment/common-info                             (list "úspěšně jste obnovili Vaše předplatné {{tier}} pro období do "
                                                                [:b "{{subscription-end}}"] ". Děkujeme Vám za projevenou důvěru.")
     :new-payment/download-receipt                        "Stáhnout účet"

     :new-subscription/subject                            "Potvrzení nového předplatného"
     :new-subscription/preheader                          "Vaše {{tier}} předplatné OrgPadu je nyní aktivní. Předplatné bude automaticky obnovováno každý {{period}}"
     :new-subscription/active-tier                        "Vaše {{tier}} předplatné OrgPadu je nyní aktivní. Děkujeme za Vaši platbu!"
     :new-subscription/payment-info                       (fn [{:payment/keys [url]}]
                                                            (list "Od této chvíle bude předplatné automaticky obnovováno každý {{period}}. Vaše účtenky se automaticky ukládají v "
                                                                  [:a {:href (str "{{domain}}" url)} "oddílu plateb"] " v nastavení OrgPadu."))

     :payment-failed/subject                              "Platba předplatného se nezdařila"
     :payment-failed/preheader                            "Zkontrolujte prosím platnost karty a její zůstatek. V případě přetrvávajících potíží nás kontaktujte."
     :payment-failed/error                                "došlo k chybě při platbě Vašeho předplatného OrgPadu. Zkontrolujte prosím, zda je Vaše karta platná a zda na ní máte dostatečný zůstatek."
     :payment-failed/payment                              "Změnit způsob platby"
     :payment-failed/current-subscription                 (list "Vaše stávající předplatné platí do " [:b "{{subscription-end}}"]
                                                                ". Pokud do tohoto data neuhradíte předplatné, přepne se Váš účet po tomto datu do předplatného zdarma. Ke svým datům budete mít nadále přístup, budete je moci upravovat, mazat a sdílet.")

     :stripe-report/subject                               "Vyúčtování platební brány Stripe za {{report-month}} {{report-year}}"
     :stripe-report/text                                  "Bylo vygenerováno vyúčtování platební brány Stripe."
     :stripe-report/button                                "Stáhnout PDF"

     :offer-to-czech-schools/preheader                    "Národní plán obnovy je jedinečnou možností zavést do našich škol mocné nástroje, které budou lidem v příštích dekádách pomáhat při práci. OrgPad takovým mocným nástrojem je, proto bych ho rád zavedl i na Vaši školu, potažmo do všech českých škol."
     :offer-to-czech-schools/subject                      "OrgPad - řešení digitálních kompetencí financovatelné z Národního plánu obnovy (NPO)"
     :offer-to-czech-schools/heading                      "OrgPad - řešení digitálních kompetencí financovatelné z Národního plánu obnovy (NPO)"
     :offer-to-czech-schools/greeting                     "Vážená paní, vážený pane,"
     :offer-to-czech-schools/motivation-to-read           "často zmiňované digitální kompetence vyžadují komplexní řešení."
     :offer-to-czech-schools/introduction                 (list "Takovým řešením může být česká aplikace OrgPad na tvorbu vylepšených myšlenkových map, kterou "
                                                                [:b "mohou používat studenti i učitelé ve všech předmětech."]
                                                                " Již nyní používají OrgPad v ČR desítky škol a vzdělávacích institucí včetně Národního pedagogického institutu či Nadačního fondu Eduzměna.")
     :offer-to-czech-schools/edu-view                     (list "Výhodami OrgPadu " [:b "z hlediska výuky"] " je, že:")
     :offer-to-czech-schools/edu-advantages               (list [:li "OrgPad podporuje myšlení v souvislostech"]
                                                                [:li "Studenti používáním OrgPadu trénují celou řadu digitálních kompetencí a rozvíjí kreativitu"]
                                                                [:li "Seznámení s aplikací a její používání je velmi intuitivní a jednoduché"]
                                                                [:li "Lze jej používat ve všech předmětech"]
                                                                [:li "Umožňuje tvořit prezentace"]
                                                                [:li "Zkušenost s OrgPadem mohou studenti uplatňovat po celý život - OrgPad není nástroj pouze pro školy, najdete ho i ve veřejném prostoru, ve firmách atd."])
     :offer-to-czech-schools/org-view                     (list "Výhodami OrgPadu " [:b "z hlediska školy"] " je, že:")
     :offer-to-czech-schools/org-advantages               (list [:li "OrgPad se dá platit z peněz Národního plánu obnovy (NPO - více na edu.cz/digitalizujeme)"]
                                                                [:li "Máte k dispozici podporu v češtině"]
                                                                [:li "Existuje síť externích školitelů, které si můžete na školu pozvat a zaměstnance proškolit - požádali jsme také o akreditaci u MŠMT v rámci DVPP"]
                                                                [:li "Fakturujeme jako české s.r.o., platby jsou v CZK, licence lze zakoupit na několik let s fixní cenou"])
     :offer-to-czech-schools/button-info                  (list "Zpracovali jsme pro Vás "
                                                                [:b "podrobnější informace přímo v OrgPadu"]
                                                                " tak, abyste si mohli nástroj rovnou vyzkoušet. Pro přechod do tohoto dokumentu, prosím, klikněte na následující tlačítko.")
     :offer-to-czech-schools/button                       "Informace pro české školy o OrgPadu"
     :offer-to-czech-schools/org-and-end-stuff            (list "Rád bych společně s Vámi nalezl způsob, jakým by mohla i Vaše škola OrgPad využívat. Můžeme se s Vámi a s vybranými učiteli domluvit na "
                                                                [:b "videokonferenci,"]
                                                                " kde probereme nasazení OrgPadu u Vás na škole - budu rád, když navrhnete termín, který vám bude vyhovovat nejvíce. Třeba i v rámci přípravného týdne.")
     :offer-to-czech-schools/farewell                     "S pozdravem"
     :offer-to-czech-schools/signature-line-1             "Vít Kalisz"
     :offer-to-czech-schools/signature-line-2             "CEO & Co-Founder of OrgPad s.r.o."
     :offer-to-czech-schools/signature-line-3             "tel. +420 736 174 126"
     :offer-to-czech-schools/signature-line-4             "www.orgpad.com"
     :offer-to-czech-schools/signature-line-5             "Renoirova 624/1, 15200 Praha 5, Czech Republic"
     :offer-to-czech-schools/signature-line-6             "IČO: 09480994"

     :schools-end-of-year-2022/subject                    "Využijte zbývající finance na digitalizaci"
     :schools-end-of-year-2022/preheader                  (str "Koncepční řešení digitalizace na Vaší škole je s pomocí univerzálního nástroje OrgPad snadné."
                                                               " Využijte zbývající prostředky na dovybavení školy a modernizaci výuky."
                                                               " OrgPad je pro školy dostupný s 95% slevou.")
     :schools-end-of-year-2022/introduction               "blíží se konec roku a s ním přichází otázka, jak smysluplně využít zbylé finanční prostředky. Letos může být odpovědí digitální učební pomůcka OrgPad!"
     :schools-end-of-year-2022/info                       (list "OrgPad je nástroj do výuky, který mohou používat jak učitelé, tak žáci napříč předměty a ročníky. Jedná se o českou webovou aplikaci na tvorbu interaktivních"
                                                                " digitálních nástěnek, ve které je kladen silný důraz na souvislosti a dynamiku. Tápete? Nevadí! OrgPad si můžete okamžitě a zcela zdarma vyzkoušet na "
                                                                [:a {:href "www.orgpad.com"} "www.orgpad.com"])
     :schools-end-of-year-2022/about-orgpad               (str "OrgPad můžete mít nyní pro celou Vaši školu za pouhých 12 000 Kč na rok. Malotřídní školy jsou zvýhodněné ještě víc, OrgPad je vyjde ročně pouze na 5 000 Kč."
                                                               " Licence zahrnuje všechny žáky, studenty i pedagogy. Zaujala Vás nabídka? ")
     :schools-end-of-year-2022/button                     "Chci si koupit předplatné"
     :schools-end-of-year-2022/about-conference           (list "Zaujal Vás OrgPad a chcete vědět víc? Podívejte se na "
                                                                [:a {:href "https://youtube.com/playlist?list=PL4UUekqpKNKVu66nmRL1CS_zGSQQllBRx"} "záznam"]
                                                                " z nedávné konference, kde vystoupili mimo jiné Barbora Jeřábková, Václav Maněna, Janek Wagner nebo Ondřej Lněnička.")
     :schools-end-of-year-2022/best-wishes                "S pozdravem a přáním klidného adventu"

     :price-increase-reminder-to-schools/greeting         "Vážená paní, vážený pane,"
     :price-increase-reminder-to-schools/subject          "Do konce ledna za starou cenu"
     :price-increase-reminder-to-schools/preheader        (str "Tento týden je poslední možnost zakoupit OrgPad za stávající ceny. Od prvního února zdražujeme."
                                                               " Koncepční řešení digitalizace na Vaší škole je s pomocí univerzálního nástroje OrgPad snadné."
                                                               " Využijte prostředky z řady dotačních titulů na dovybavení školy a modernizaci výuky."
                                                               " OrgPad je pro školy dostupný s 95% slevou.")
     :price-increase-reminder-to-schools/introduction     "první pololetí se již pomalu chýlí ke konci a s ním se neúprosně přibližuje i 1. únor - den, kdy budeme poprvé zdražovat."
     :price-increase-reminder-to-schools/info             (list "Aby byl přechod na nový ceník co možná nejpříjemnější,"
                                                                " můžete si do konce ledna za stávající ceny zakoupit"
                                                                " nebo prodloužit licence i na více let dopředu.")
     :price-increase-reminder-to-schools/button           "Chci OrgPad za starou cenu"
     :price-increase-reminder-to-schools/school-price     (str "Od 1. února bude stát roční školní licence softwaru OrgPad včetně DPH 15 000 Kč."
                                                               " Malotřídní školy nově zaplatí za roční licenci včetně DPH 6 000 Kč."
                                                               " Školní licence se zapínají vždy pro celou školu najednou automaticky na všech e-mailových adresách školy."
                                                               " Licence tedy zahrnuje všechny žáky, studenty i pedagogy.")
     :price-increase-reminder-to-schools/individual-price (str "Individuální licence rovněž podraží, standardní roční licence vyjde nově na 1 499 Kč"
                                                               " a profesionální roční licence na 2 999 Kč."
                                                               " Individuální licence lze platit také měsíčně, jsou ale o 20 % dražší.")
     :price-increase-reminder-to-schools/about-orgpad     (list "Zaujal Vás OrgPad a chcete vědět víc? Podívejte se na "
                                                                [:a {:href "https://youtube.com/playlist?list=PL4UUekqpKNKVu66nmRL1CS_zGSQQllBRx"} "záznam"]
                                                                " z nedávné konference, kde vystoupili mimo jiné Barbora Jeřábková, Václav Maněna, Janek Wagner nebo Ondřej Lněnička.")
     :price-increase-reminder-to-schools/best-wishes      "S pozdravem za celý tým OrgPadu"

     :christmas-newsletter-2022/subject                   "Zdražení, souhrn, výhled, přání"
     :christmas-newsletter-2022/preheader                 (str "Do 1. února objednejte za současnou cenu. Shrnutí nových funkcí a akcí OrgPadu, videozáznamy z konference, Microsoft Roadshow,"
                                                               " informace pro školy, plánovaná údržba systémů v noci z 24. na 25. prosince.")
     :christmas-newsletter-2022/introduction              (str "předvánoční čas je časem rozjímání. Proto jsme se ohlédli za tím,"
                                                               " co se v uplynulém roce kolem OrgPadu událo a začali přemýšlet o tom následujícím.")
     :christmas-newsletter-2022/list-info                 "Po roce tak vznikl další oběžník, ve kterém se dotýkáme následujících témat:"
     :christmas-newsletter-2022/list                      (list [:li "Co se v OrgPadu za poslední rok změnilo?"]
                                                                [:li "Rekapitulace OrgPad konference"]
                                                                [:li "Nový ceník od 1. února 2023"]
                                                                [:li "Informace pro školy a naše účast na Microsoft Roadshow"]
                                                                [:li "Údržba a odstávka systému v noci ze Štědrého dne na Boží hod"]
                                                                [:li "Obdarujte na Vánoce OrgPadem!"])
     :christmas-newsletter-2022/button                    "Nový ceník a detaily"
     :christmas-newsletter-2022/best-wishes               "S přáním poklidného adventu a krásných Vánoc"
     ;; admin-* are only in English
     }))