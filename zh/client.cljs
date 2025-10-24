(ns orgpad.client.i18n.dicts.zh
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.zh :as zh]
            [orgpad.client.util.unicode :as unicode]
            [orgpad.common.company :as company]
            [orgpad.common.orgpage.core :as common-orgpage]
            [orgpad.client.i18n.dicts.core :as dicts]))

(def dict
  (merge
    zh/dict
    {:address/company                                 "公司名"
     :address/ico                                     "增值税"
     :address/street                                  "街道"
     :address/street-number                           "门牌号"
     :address/postal-code                             "邮政编码"
     :address/city                                    "城市"
     :address/country                                 "国家"

     :administration/page-title                       "管理 - OrgPad"

     :attachments/allows-access-to-file               "允许访问此文件。"
     :attachments/allows-access-to-image              "允许访问此图片。"
     :attachments/no-preview                          "无可用预览。"
     :attachments/all-files                           "所有文件"
     :attachments/used-files                          "OrgPage中的文件"
     :attachments/unused-files                        "旁边的文件"
     :attachments/all-images                          "所有图片"
     :attachments/used-images                         "OrgPage中的图片"
     :attachments/unused-images                       "旁边的图片"
     :attachments/uploading-files                     "正在上传文件..."
     :attachments/previous-attachment                 "上一个文件或图片"
     :attachments/next-attachment                     "下一个文件或图片"
     :attachments/display-using-microsoft-365         "使用 Microsoft 365 显示"
     :attachments/edit-filename                       "编辑名称"
     :attachments/title-order                         "按标题字母顺序"
     :attachments/upload-order                        "最新的在最上面"
     :attachments/size-order                          "最大的在最上面"
     :attachments/split-used-unused                   "按在OrgPage中的存在分组"
     :attachments/search                              "搜索"
     :attachments/ordering                            "排序"
     :attachments/new-version                         "新版本"
     :attachments/preserve-old-version                "保留旧版本"
     :attachments/in-other-orgpages                   "在其他OrgPage中替换："

     :button/back                                     "返回"
     :button/cancel                                   "取消"
     :button/close                                    "关闭"
     :button/comment                                  "评论"
     :button/continue                                 "继续"
     :button/copied                                   "已复制"
     :button/copy                                     "复制"
     :button/copy-link                                "复制链接"
     :button/create                                   "创建"
     :button/create-tooltip                           "创建 (CTRL+ENTER)"
     :button/delete                                   "删除"
     :button/delete-selected                          "删除所选"
     :button/documentation                            "文档"
     :button/download                                 "下载"
     :button/download-all                             "全部下载"
     :button/drop                                     "拖放"
     :button/edit                                     "编辑"
     :button/import                                   "导入"
     :button/insert                                   "插入"
     :button/login                                    "登录"
     :button/logout                                   "登出"
     :button/publish                                  "发布"
     :button/read                                     "阅读"
     :button/register                                 "注册"
     :button/register-to-save                         "注册以保存"
     :button/remove                                   "移除"
     :button/reset                                    "重置"
     :button/save                                     "保存更改"
     :button/save-tooltip                             "保存更改 (CTRL+ENTER)"
     :button/upload                                   "上传"
     :button/upload-from-computer                     "从电脑上传"
     :button/send                                     "发送"
     :button/present                                  "演示"
     :button/present-tooltip                          "开始演示 (F5)"
     :button/share                                    "分享"
     :button/start                                    "开始"
     :button/exit                                     "退出"
     :button/show-password                            "显示"
     :button/hide-password                            "隐藏"

     :checkout/currency                               "货币"
     :checkout/monthly                                "每月"
     :checkout/yearly                                 "每年 (节省15%)"
     :checkout/failed-to-init                         "加载结账网站时出错。"
     :checkout/upgrade-plan                           "升级计划"
     :checkout/professional-plan                      "专业计划"
     :checkout/school-plan                            "学校计划"
     :checkout/enterprise-plan                        "企业计划"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "学校"] "或"
                                                         [:a.link-button {:href enterprise-url} "企业"] "？联系我们获取定制协议。"])
     :checkout/pay-with-credit-card                   "用卡支付"
     :checkout/pay-with-wire-transfer                 "通过电汇支付"
     :checkout/promo-code                             "优惠码"
     :checkout/try-for-free                           "免费试用"
     :checkout/activate-now                           "立即激活"
     :checkout/continue-for-free                      "继续免费"

     :code-lang/none                                  "无"
     :code-lang/multiple                              "多个"

     :dashboard/confirm-delete                        [:<> [:b "永久"] "删除此OrgPage？"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> [:a {:href login-url} "登录"] "或"
                                                         [:a {:href register-url} "注册"]
                                                         "以创建新的OrgPage。"])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "您学校 " name " 的订阅已于 " subscription-expired " 到期。"
                                                         "如需续订，请联系您的管理部门。"
                                                         [:a {:href   info-link
                                                              :target "_blank"} "更多信息"] "关于学校95%的折扣。"])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "以95%的折扣为您的学校获取无限制的OrgPad。"
                                                         [:a {:href   info-link
                                                              :target "_blank"} "更多信息。"]])
     :dashboard/owned-orgpages                        "我的OrgPages"
     :dashboard/public-orgpages                       "已发布的OrgPages"
     :dashboard/shared-orgpages                       "与我共享的OrgPages"
     :dashboard/usergroup-orgpages                    "{usergroup/name}的OrgPages"
     :dashboard/help-or-inspiration-button            "给你！"
     :dashboard/new-domain                            [:<> "使用新域名 " [:a {:href "https://orgpad.info/list"} "orgpad.info"]
                                                       ". 更多信息请见OrgPage " [:a {:href "https://orgpad.info/s/new-domain"} "OrgPad中的更改和新域名"] "."]

     :dashboard-filter/filter                         "筛选OrgPages"
     :dashboard-filter/ordering                       "排序OrgPages"
     :dashboard-filter/filter-and-ordering            "筛选和排序OrgPages"
     :dashboard-filter/title                          "筛选和排序显示的OrgPages"
     :dashboard-filter/ordering-label                 "OrgPages的排序"
     :dashboard-filter/title-order                    "按标题字母顺序"
     :dashboard-filter/creation-time-order            "最新的在最上面"
     :dashboard-filter/last-modified-order            "最后修改的在最上面"
     :dashboard-filter/most-viewed-order              "浏览最多的在最上面"
     :dashboard-filter/search-tags                    "搜索标签"

     :embedding-code/code                             "代码"
     :embedding-code/description                      "将OrgPage嵌入网站或其他应用程序。"

     :error/orgpage-access-denied                     "您无权访问此OrgPage。请尝试登录。"
     :error/usergroup-access-denied                   "编辑团队的权限被拒绝。"
     :error/administration-access                     "管理访问被拒绝。"
     :error/creation-unauthorized                     "登录以创建OrgPages。"
     :error/deleting-denied                           "删除OrgPage被拒绝。"
     :error/email-already-used                        "电子邮件已被使用。"
     :error/email-not-registered                      "没有使用此电子邮件的帐户。"
     :error/email-missing-mx-record                   "在此域中找不到电子邮件服务器。"
     :error/email-invalid                             "不是电子邮件。"
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "不正确的OrgPage" (when id " {orgpage/id}")
                                                             "。链接复制错误？"))
     :error/incorrect-link                            "链接不正确。请登录或打开正确的链接。"
     :error/incorrect-password                        "密码不正确。"
     :error/incorrect-profile-id                      "个人资料链接不正确。链接复制错误？"
     :error/lost-permission                           "失去了对此OrgPage的访问权限。"
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "没有帐户的电子邮件：" emails))
     :error/name-already-used                         "名称已被使用"
     :error/name-not-valid                            "至少使用5个字符"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "OrgPage " (when title "“{orgpage/title}”") " 已被删除。"))
     :error/owner-of-orgpage                          "此人已经是此OrgPage的所有者。"
     :error/profile-not-found                         "未找到个人资料。"
     :error/unknown-error                             "未知错误，请重试。"
     :error/unknown-id                                "未知的OrgPage。"
     :error/unknown-login-or-email                    "未知的电子邮件或团队登录。"
     :error/unknown-usergroup                         "团队已被删除"
     :error/upload-failed                             "上传OrgPage失败： “{orgpage/title}”"

     :export/show                                     "导出OrgPage"
     :export/title                                    "导出 {orgpage/title}"
     :export/info                                     "选择导出此OrgPage的格式。"
     :export/edn                                      [:<> [:a.link-button {:href   "https://github.com/edn-format/edn"
                                                                            :target "_blank"} "EDN"]
                                                       " OrgPad使用的格式"]
     :export/html                                     "线性HTML文件"
     :export/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] " 格式"]
     :export/generate                                 "生成导出"

     :feedback/ask-question                           "提问"
     :feedback/hide-button                            "永久隐藏按钮"
     :feedback/dialog-title                           "联系OrgPad开发人员"
     :feedback/description                            [:<> "如果您需要帮助或有任何问题，请告诉我们 - "
                                                       [:b "OrgPad的开发人员"] "。"
                                                       "我们也欢迎任何改进建议。"
                                                       "我们会尽快通过电子邮件回复。"]
     :feedback/languages                              "您可以用英语、捷克语和德语给我们写信。"
     :feedback/contact-when-problem-persists          [:<> "如果问题仍然存在，请通过 "
                                                       company/support-email-app-link " 联系我们。"]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "电汇"
                                                             (when currency
                                                               (str " " (name currency))) " 为"
                                                             "每年"
                                                             (if (= tier "standard")
                                                               "标准"
                                                               "专业")
                                                             "计划"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "请填写您的" [:b "账单地址"] "，以及发票所需的任何其他信息。"
                                                         "我们会尽快通过您的电子邮件地址 " [:b email] " 与您联系。"])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "我想为我的" (case org-type
                                                                            :feedback/school-plan "学校"
                                                                            :feedback/enterprise-plan "公司"
                                                                            "组织") "购买一个计划"))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "使用此表格联系OrgPad s.r.o.代表。"
                                                         "我们会尽快通过您提供的电话号码或电子邮件地址(" email
                                                         ")与您联系。您也可以致电我们"
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "将我的订阅升级到专业计划"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "请告诉我们您希望如何更改您现有的订阅以及任何其他信息。"
                                                         "我们会尽快通过您的电子邮件地址 " [:b email] " 与您联系。"])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "将我的账单周期更改为" (if (= period "yearly")
                                                                                      "每年"
                                                                                      "每月") "账单"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "更改将在当前账单周期结束后生效。"
                                                         "每年计费可享受15%的折扣。"
                                                         "我们会尽快通过您的电子邮件地址 " [:b email] " 与您联系。"])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "学校"
                                                               :feedback/enterprise-plan "公司"
                                                               "组织") "名称"))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "在" (case org-type
                                                                    :feedback/school-plan "学校"
                                                                    :feedback/enterprise-plan "公司"
                                                                    "组织") "内的职位"))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str (case org-type
                                                               :feedback/school-plan "学校"
                                                               :feedback/enterprise-plan "公司"
                                                               "组织") "网站"))

     :fragment/fragment                               "位置"
     :fragment/text-id                                "Id"
     :fragment/title                                  "标题"
     :fragment/create                                 "创建位置"
     :fragment/create-tooltip                         "TAB；按住SHIFT复制所选位置"
     :fragment/remove                                 "删除位置"
     :fragment/share                                  "复制此位置的链接"
     :fragment/text-id-required                       "需要Id。"
     :fragment/text-id-already-used                   "Id已被使用。"
     :fragment/closed-books                           "关闭的单元格；CTRL+单击选择"
     :fragment/hidden-books                           "隐藏的单元格；CTRL+单击选择"
     :fragment/opened-pages                           "打开的页面；CTRL+单击选择"
     :fragment/focused-books                          "相机中显示的单元格；CTRL+单击选择"
     :fragment/shown-books                            "显示的单元格；CTRL+单击选择"

     :info/uploading-attachments                      "正在上传{info/count}个文件..."
     :info/uploading-images                           "正在上传{info/count}个图片..."
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          (str "上传" (:info/count info) "个图片失败。")
                                                          "至少有一张图片上传失败。 "))
     :info/uploading-youtubes-failed                  "未找到{info/count}个YouTube视频。"
     :info/uploading-attachments-failed               "上传文件失败。"
     :info/presentation-link-copied                   "此演示文稿的链接已复制。"
     :info/max-orgpages-exceeded                      "此OrgPage的所有者无法创建其他OrgPage。"
     :info/storage-exceeded                           "此OrgPage的所有者没有足够的{upload/total-size}空间来上传这些文件。"
     :info/attachments-too-large                      (str "无法在单次上传中上传{upload/total-size}。"
                                                           "所有上传附件的最大大小为500 MB。")
     :info/drop-info                                  "拖放到任何单元格或灰色画布中以创建新单元格。"
     :info/audio-not-allowed                          "音频播放被阻止。单击播放按钮。"
     :info/audio-not-supported                        "不支持的音频格式。"

     :import/another-format                           [:<> "如果您想以其他格式导入现有数据，请通过 "
                                                       company/support-email-app-link " 联系我们。"]
     :import/dialog                                   "导入您的数据"
     :import/google-docs                              "要从Microsoft Office或Google Docs插入数据，只需将其粘贴到OrgPage中即可。"
     :import/supported-formats                        "我们现在支持以下格式："
     :import/lucidchart                               [:<> [:b "Lucidchart"] "导出为.vsdx文件。"]
     :import/json-canvas                              [:<> [:a.link-button {:href   "https://jsoncanvas.org/"
                                                                            :target "_blank"} "JSON canvas"] "文件。"]

     :ios/install-info                                "安装OrgPad应用"
     :ios/share-button                                "1. 打开"
     :ios/add-to-home-screen                          "2. 点击"

     :lang/cs                                         "捷克语"
     :lang/de                                         "德语"
     :lang/en                                         "英语"
     :lang/es                                         "西班牙语"
     :lang/fr                                         "法语"
     :lang/hi                                         "印地语"
     :lang/pl                                         "波兰语"
     :lang/ru                                         "俄语"
     :lang/uk                                         "乌克兰语"

     :lang-select/tooltip                             "应用程序的语言 (CTRL+SHIFT+L)"
     :lang-select/help-by-translating                 [:<> "您是否缺少您的语言？通过"
                                                       [:a {:href   "https://github.com/OrgPad-com/orgpad-translations"
                                                            :target "_blank"} "翻译OrgPad"] "帮助我们。"]

     :limit/of                                        "的"
     :limit/orgpages                                  " OrgPages"
     :limit/people                                    "人"
     :limit/teams                                     "团队"
     :limit/team-members                              "成员"
     :limit/orgpages-tooltip                          (str "在免费套餐中，OrgPages的数量是有限的。"
                                                           "升级您的计划以创建更多的OrgPages。")
     :limit/shares-tooltip                            (str "您可以直接共享此OrgPage的人数是有限的。"
                                                           "升级到专业套餐以与无限数量的人共享。")
     :limit/teams-tooltip                             (str "在标准套餐中，拥有的团队数量是有限的。"
                                                           "升级到专业套餐以创建无限的团队。")
     :limit/teams-members-tooltip                     (str "在标准套餐中，每个团队的成员数量是有限的。"
                                                           "升级到专业套餐以创建无限的团队。")
     :limit/attachments-size                          (str "所有上传文件和图片的总大小是有限的"
                                                           "并且可以通过升级计划来增加。")
     :limit/attachments-size-clickable                (str "所有上传文件和图片的总大小是有限的。"
                                                           "单击以通过升级计划来增加您的限制。")
     :limit/attachments-size-try-out                  (str "所有上传文件和图片的总大小是有限的。"
                                                           "要将您的限制增加到100 MB，请单击以创建帐户。")

     :limits/max-orgpages                             "文档"
     :limits/max-storage                              "存储"
     :limits/max-teams                                "团队"
     :limits/of                                       "的"
     :limits/max-team-members                         "成员"
     :limits/priority-support                         "优先支持"

     :link-panel/flip                                 "翻转方向"
     :link-panel/insert-unit-in-middle                "在中间插入一个单元格"
     :link-panel/delete                               "删除链接"
     :link-panel/change-link-style                    "更改此链接的样式；按住SHIFT设置当前样式，按住CTRL复制到默认样式"

     :loading/initial-autoresize                      (fn [{:loading/keys [num-units]}]
                                                        [:<> "正在计算所有单元格的大小，剩余" [:span#autoresize-num-units num-units] "... "])
     :loading/initial-layout                          "正在改善初始布局..."
     :loading/restoring-opened-pages                  "正在恢复打开页面的位置..."
     :loading/getting-orgpage                         "正在从服务器下载OrgPage..."
     :loading/getting-dashboard                       "正在从服务器下载可用OrgPages的列表..."
     :loading/getting-website                         "正在从服务器下载网站..."
     :loading/getting-blog                            "正在从服务器下载博客..."
     :loading/uploading-orgpage                       "正在将OrgPage上传到服务器..."
     :loading/ws-init                                 "正在设置与服务器的连接..."
     :loading/ws-closed                               "与服务器的连接已关闭，正在尝试重新连接。如果问题仍然存在，请重新加载页面。"
     :loading/administration                          "正在加载管理数据..."
     :loading/profile                                 "正在加载个人资料..."
     :loading/style                                   "正在加载样式..."
     :loading/start-trial                             "正在开始7天试用订阅..."
     :loading/uploading-attachments                   "正在将附件上传到服务器..."

     :login/continue-with-email                       "使用电子邮件继续"
     :login/continue-with-facebook                    "使用Facebook继续"
     :login/continue-with-google                      "使用Google继续"
     :login/continue-with-microsoft                   "使用Microsoft继续"
     :login/continue-with-cuni                        "使用查理大学继续"
     :login/email-sent                                "电子邮件已发送。请单击电子邮件中的链接。"
     :login/forgotten-password                        "忘记密码"
     :login/forgotten-password-email-resent           "密码重置电子邮件已发送。"
     :login/forgotten-password-description            "通过电子邮件获取密码重置链接（有效期24小时）。"
     :login/forgotten-password-error                  [:<> "此电子邮件地址已被您阻止。请通过单击OrgPad任何电子邮件中的取消订阅来取消阻止，或从该电子邮件地址向我们发送电子邮件至"
                                                       company/support-email-app-link "。"]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "OrgPad新手？" [:a.link-button {:href route} "注册"]])
     :login/options                                   "选择其他登录方式"
     :login/send-reset-link                           "发送重置链接"
     :login/wrong-email-or-password                   "电子邮件或密码不正确。"

     :markdown/title                                  "粘贴的文本是否使用Markdown格式化？"
     :markdown/info                                   "在您粘贴的内容中检测到Markdown格式。您想应用其格式吗？"
     :markdown/remember                               "记住直到重新加载"
     :markdown/insert                                 "使用Markdown格式"
     :markdown/ignore                                 "保留原始"

     :meta/title                                      "OrgPage的名称"
     :meta/orgpage-thumbnail                          "OrgPage图片"
     :meta/automatic-screenshot-start                 "自动生成的屏幕截图"
     :meta/automatic-screenshot-refresh               "每次更改后五分钟更新。"
     :meta/custom-thumbnail                           "自定义上传的尺寸为1360x768的图片。"
     :meta/upload-thumbnail                           "上传自定义图片"
     :meta/thumbnail-upload-failed                    "上传图片失败。"
     :meta/description                                "描述"
     :meta/new-tags                                   "标签"
     :meta/tag-too-long                               (str "标签的最大长度为" common-orgpage/max-tag-length "个字符。")
     :meta/too-many-tags                              (str "最多允许" common-orgpage/max-tags "个标签。")
     :meta/info                                       (str "这些详细信息将显示在OrgPage列表中，"
                                                           "嵌入OrgPage时以及在社交网络上共享时。")
     :meta/info-in-share-orgpage                      "在共享此OrgPage之前，需要设置标题。"
     :meta/info-move-to-new-orgpage                   (str "将所选的{selection/num-units}个单元格"
                                                            "和{selection/num-links}个链接移动到具有以下信息的新OrgPage中。"
                                                            "在当前的OrgPage中，这些单元格和链接将被替换为包含新OrgPage的单个单元格。")
     :meta/info-title                                 "信息 – {meta/title}"
     :meta/info-title-only                            "命名OrgPage"
     :meta/details                                    "详细信息"
     :meta/preview                                    "预览"
     :meta/init-fragments                             "起始位置"
     :meta/init-fragments-info                        (str "您可以在打开OrgPage时选择起始位置。"
                                                           "可以为移动设备指定不同的起始位置。")
     :meta/desktop-init-fragment                      "桌面位置"
     :meta/mobile-init-fragment                       "移动位置"
     :meta/everything-closed                          "所有单元格关闭"
     :meta/everything-closed-lowercase                "所有单元格关闭"
     :meta/more-details                               "更多详细信息"
     :meta/move-to-new-orgpage-title                  "移动到{meta/title}"
     :meta/move-to-new-orgpage                        "移动到新的OrgPage"

     :microsoft-365-permission/title                  "允许Microsoft 365访问此文档吗？"
     :microsoft-365-permission/info                   [:<> "可以使用Microsoft 365显示Office文档。"
                                                       "单击同意，您的文档将与Microsoft共享。"
                                                       "查看" [:a.link-button {:href   "https://www.microsoft.com/en/servicesagreement/"
                                                                               :target "_blank"}
                                                               "Microsoft服务协议"] "."]
     :microsoft-365-permission/allow                  "授予Microsoft 365权限"

     :notifications/info                              "选择OrgPad向您发送哪些电子邮件。我们总是会通知您重要的更改。"
     :notifications/any-email                         "来自OrgPad的任何电子邮件"
     :notifications/email-verification                "注册时的电子邮件验证，重置密码的链接和基本的付款信息"
     :notifications/monthly-newsletter                "包含OrgPad更新和最新发展的月度新闻通讯"
     :notifications/messages                          "接收来自他人的消息"
     :notifications/blocked-people                    "特别阻止的人："
     :notifications/receipts                          "订阅自动续订时的收据"
     :notifications/receive-invitations               "接收来自他人的邀请"
     :notifications/unblock-user                      "取消阻止此人"

     :onboarding/openable-units                       "只有带有阴影的凸起单元格才能打开。"
     :onboarding/zoom                                 "滚动缩放"
     :onboarding/drag-canvas                          "通过拖动移动"
     :onboarding/open-units                           "带有阴影的单元格有内容"

     :orgpage/creating-preview                        "正在创建预览..."
     :orgpage/change-information                      "更改信息"
     :orgpage/copy-orgpage                            "复制到新的OrgPage"
     :orgpage/delete-orgpage                          "删除OrgPage"
     :orgpage/detail                                  "详细信息"
     :orgpage/share-tooltip                           "与他人共享此OrgPage"
     :orgpage/share-orgpage                           "共享OrgPage"
     :orgpage/show-information                        "显示信息"
     :orgpage/zoom-in                                 "放大"
     :orgpage/zoom-out                                "缩小"
     :orgpage/create-unit-double-click                "双击以创建单元格。"
     :orgpage/create-unit-hold-or-double-tap          "按住或双击以创建单元格。"
     :orgpage/switch-to-edit                          "切换到编辑。"
     :orgpage/untitled                                "无标题的OrgPage"
     :orgpage/title                                   "OrgPage标题"
     :orgpage/untitled-unit                           "无标题的单元格"
     :orgpage/untitled-path                           "无标题的演示文稿"
     :orgpage/path-num-steps                          "{orgpage/num-steps}个步骤"
     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (页面{orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (页面{orgpage/closed-index}→{orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "副本可用作"
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "更改此OrgPage的颜色"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "此OrgPage自动与" label "共享，用于"
                                                         (case permission
                                                           :permission/view "阅读"
                                                           :permission/comment "评论"
                                                           :permission/edit "编辑"
                                                           nil)
                                                         "." [:span.link-button {:on-click on-click} "单击此处"]
                                                         "取消共享。"])

     :orgpage-placement/activate                      "在此处查看"

     :orgpage-print/displayed                         "完全如图所示"
     :orgpage-print/displayed-info                    "矩形内的所有内容都将完全按照您看到的方式打印。"
     :orgpage-print/done                              (fn [{:orgpage-print/keys [link]}]
                                                        [:<> "OrgPage已成功打印到"
                                                         [:a.link-button {:href   link
                                                                          :target "_blank"} "PDF"] "."])
     :orgpage-print/estimated-time                    "打印此PDF大约需要{orgpage-print/estimated-time}。"
     :orgpage-print/everything-closed                 "所有单元格关闭"
     :orgpage-print/everything-closed-info            "打印的PDF显示所有单元格关闭。"
     :orgpage-print/fragment                          "一个位置"
     :orgpage-print/fragment-info                     "打印的PDF显示所选位置。"
     :orgpage-print/gray                              "灰色背景"
     :orgpage-print/landscape                         "横向"
     :orgpage-print/orientation                       "方向"
     :orgpage-print/path-info                         "，共{orgpage-print/num-pages}个页面。"
     :orgpage-print/portrait                          "纵向"
     :orgpage-print/presentation                      "演示文稿的步骤"
     :orgpage-print/presentation-info                 "每个步骤都打印在单独的页面上。"
     :orgpage-print/print                             "打印到PDF"
     :orgpage-print/size                              "大小"
     :orgpage-print/started                           (str "我们正在将此OrgPage打印到PDF。大约需要{orgpage-print/estimated-time}。"
                                                           "完成后，它将作为文件可用。")
     :orgpage-print/title                             "打印名称"
     :orgpage-print/type                              "打印内容"
     :orgpage-print/watermark                         "包含水印"
     :orgpage-print/watermark-info                    "升级到专业版、学校版或企业版以删除水印。"
     :orgpage-print/white                             "白色背景"

     :orgpage-stats/number-of-units                   "单元格数"
     :orgpage-stats/number-of-links                   "链接数"
     :orgpage-stats/number-of-files                   "文件数"
     :orgpage-stats/number-of-images                  "图片数"

     :org-role/student                                "学生"
     :org-role/teacher                                "教师"
     :org-role/employee                               "员工"
     :org-role/admin                                  "管理员"

     :panel/toggle-side-panel                         "侧边菜单"
     :panel/create-orgpage                            "新的OrgPage"
     :panel/logo-tooltip                              "回家"
     :panel/edit-info                                 "切换到编辑模式，您可以在其中创建和删除单元格和链接、修改内容等 (F7)"
     :panel/comment-info                              (str "切换到评论模式，您可以在其中创建、编辑和删除"
                                                           "您自己的单元格和链接，但不能编辑或删除"
                                                           "他人的单元格或链接。但是，您可以链接到不属于您的单元格。(F7)")
     :panel/read-info                                 "切换到阅读模式，其中任何内容都无法更改，但浏览内容更容易 (F6)"
     :panel/undo-deletion                             "撤消删除"
     :panel/undo-deletion-info                        "恢复删除{delete/num-units}个单元格和{delete/num-links}个链接 (CTRL+Z)"
     :panel/refresh                                   "刷新"
     :panel/switch-style                              "切换新单元格和链接的样式；拖动以创建新单元格"
     :panel/profile                                   "个人资料"
     :panel/settings                                  "设置"
     :panel/usergroups                                "团队"
     :panel/stats                                     "统计"
     :panel/administration                            "管理"
     :panel/ios-install-info                          "安装应用"
     :panel/upload-attachment                         "将图片或文件插入新单元格"
     :panel/selection-mode                            "开始选择"
     :panel/search                                    "搜索 (CTRL+F)"
     :panel/toggle-reveal-hidden                      "显示当前位置隐藏的{panel/num-hidden-book-ids}个单元格"

     :password/too-short                              "至少需要8个字符"
     :password/different-passwords                    "密码不匹配"

     :password-reset/back-to-list                     "返回列表"
     :password-reset/change-password                  "更改密码"
     :password-reset/set-password                     "设置密码"
     :password-reset/has-password                     "您的帐户已设置密码。"
     :password-reset/without-password                 "由于使用链接帐户登录，因此尚未设置密码。"
     :password-reset/invalid-link                     "链接无效，可能已超过24小时。请要求重新发送电子邮件。"
     :password-reset/description                      "设置您的新密码。"
     :password-reset/enter-current-and-new-password   "输入当前密码和新密码。"
     :password-reset/enter-new-password               "输入新密码。"

     :path/add-step                                   "步骤"
     :path/add-step-tooltip                           "ENTER或TAB；按住SHIFT复制相机"
     :path/hidden-ops                                 "和{path/num-hidden}更多"
     :path/title                                      "演示文稿的名称"
     :path/default-title                              "演示文稿{path/num-paths}"
     :path/copy                                       "复制到新的演示文稿"
     :path/copy-suffix                                "副本"
     :path/add-audio                                  "将音频链接到步骤"
     :path/remove-audio                               "取消音频与步骤的链接"

     :paths/create-new-path                           "创建演示文稿"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "删除演示文稿" [:b title] "？"])
     :paths/help                                      "选择单元格以更改显示内容；详情请参阅指南。"

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "当前在" [:b tier "计划"] "中，有效期至" [:b end-date] "。"
                                                         (if autorenewal
                                                           "订阅将在付款期结束时自动续订。"
                                                           "订阅将在付款期结束时到期。")])
     :payments/expired-subscription                   (fn [{:subscription/keys [tier end-date]}]
                                                        [:<> "您的" [:b tier "计划"] "已于" [:b end-date] "到期，因为您的续订付款失败。"
                                                         "如果您修复付款，您的订阅将自动延长。"])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] "在" name "的" [:b tier "计划"] "中。"])
     :payments/free-tier-info                         [:<> "OrgPad在" [:b "免费套餐"] "中使用，无需任何付款。"]
     :payments/no-teams                               "免费套餐中没有团队。"
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "对于" (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "升级"] "或"])
                                                         [:a.link-button {:href period-url} "更改您的账单周期"]
                                                         "，请联系我们。"])
     :payments/choose-plan                            "选择计划"
     :payments/manage-plan                            "管理计划"
     :payments/billing-address                        "账单地址"
     :payments/billing-address-info                   (str "输入的账单地址将用于所有新发票。"
                                                           "最近的发票也会自动更新。")
     :payments/receipt-label                          "收据{receipt/date-range}"
     :payments/customer-portal-failed                 "加载计划管理网站时出错。"

     :pending-activation/email-already-used           "电子邮件已在另一个帐户上使用。"
     :pending-activation/email-not-recieved           "没有收到电子邮件？请在下面重新发送或更改。"
     :pending-activation/email-sent                   "激活电子邮件已发送。"
     :pending-activation/instructions                 "快完成了！单击我们通过电子邮件发送给您的链接，一键激活您的帐户。"
     :pending-activation/resend                       "重新发送激活电子邮件"

     :permission/admin                                "可以共享和删除"
     :permission/admin-tooltip                        "也可以修改谁可以访问该文档。"
     :permission/edit                                 "可以编辑"
     :permission/edit-tooltip                         "可以对OrgPage进行任何更改。"
     :permission/comment                              "可以评论"
     :permission/comment-tooltip                      (str "可以创建新的自有单元格，连接它们并修改它们。"
                                                           "无法修改OrgPage的其余部分。")
     :permission/view                                 "可以阅读"
     :permission/view-tooltip                         "可以阅读OrgPage而无需进行任何更改。"

     :presentation/presentation                       "演示文稿"
     :presentation/step                               "步骤"
     :presentation/present                            "开始演示"
     :presentation/slideshow                          "自动播放步骤"
     :presentation/step-duration                      "步骤持续时间（秒）"
     :presentation/loop-slideshow                     "在末尾重复"
     :presentation/respect-audio-track                "根据音轨的步骤持续时间"
     :presentation/stop-slideshow                     "停止自动播放步骤"
     :presentation/exit-tooltip                       "退出演示"
     :presentation/play-audio                         "播放此步骤的音频"
     :presentation/pause-audio                        "暂停播放音频"
     :presentation/share-presentation                 "与他人共享此演示文稿。"

     :pricing-popup/orgpages-exceeded-title           "您无法在免费计划中创建更多OrgPages"
     :pricing-popup/orgpages-exceeded                 "您必须升级您的计划。"
     :pricing-popup/storage-exceeded-title            "没有足够的空间上传{upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "您的存储空间中只剩下" [:b space-left] "。"
                                                         "您可以升级您的计划以扩展您的存储空间。"])
     :pricing-popup/num-shared-limit-reached-title    "您无法与更多人共享此OrgPage"
     :pricing-popup/num-shared-limit-reached-common   "已达到共享此OrgPage的最大人数。"
     :pricing-popup/num-shared-limit-reached          [:<> "要添加更多人，您必须升级到"
                                                       [:b "专业套餐"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> "此OrgPage的所有者" owner "必须升级到"
                                                         [:b "专业套餐"] "才能添加更多人。"])
     :pricing-popup/enable-teams-title                "升级您的计划以管理团队"
     :pricing-popup/enable-teams                      [:<> "团队将人们组合在一起，从而简化了协作和共享OrgPages。"
                                                       "此功能仅在" [:b "标准套餐"] "或更高版本中启用。"]
     :pricing-popup/teams-limit-reached-title         "升级您的计划以创建更多团队"
     :pricing-popup/teams-limit-reached               "您的计划已达到团队数量限制。"
     :pricing-popup/team-members-limit-reached-title  "您无法向{usergroup/name}添加更多成员"
     :pricing-popup/team-members-limit-reached-common "已达到团队成员的最大数量。"
     :pricing-popup/team-members-limit-reached        [:<> "要添加更多成员，您必须升级到"
                                                       [:b "专业套餐"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> "此团队的所有者" owner "必须升级到"
                                                         [:b "专业套餐"] "才能添加更多成员。"])
     :pricing-popup/try-out-share-title               "注册以共享此OrgPage"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "您的存储空间中只剩下" [:b space-left] "。"])
     :pricing-popup/free-account-info                 "通过注册，您可以免费获得："
     :pricing-popup/free-limit                        "最多三个OrgPages，"
     :pricing-popup/free-storage                      "最多100 MB的存储空间，"
     :pricing-popup/free-share                        "与他人共享您的工作。"
     :pricing-popup/free-account-info2                "只需点击几下即可创建您的帐户。"

     :pricing-popup/register-to-comment               "注册以添加您的评论"
     :pricing-popup/register-to-comment-info          (str "评论单元格将显示您的姓名和个人资料照片。"
                                                           "为此，您需要先创建您的帐户。")

     :pricing-popup/print-watermark-title             "升级您的计划以去除水印"
     :pricing-popup/print-watermark-info              (str "只有在专业、学校和企业计划中才可能"
                                                           "打印没有OrgPad.info水印的内容。")

     :profile/open-contact-dialog                     "发送消息"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "联系" first-name " " last-name)
                                                          "联系此人"))
     :profile/contact-dialog-info                     (str "由于我们不共享OrgPad中其他人的电子邮件地址，我们将为您发送此消息。"
                                                           "我们将包含您的姓名和电子邮件以提供直接联系。")

     :promotion/unknown                               "未知代码"
     :promotion/max-usages-reached                    "使用次数过多"
     :promotion/expired                               "已过期"
     :promotion/one-year-free                         "1年免费"
     :promotion/duration-free                         "{promotion/duration}天免费"
     :promotion/for-one-year                          "为期1年"
     :promotion/for-six-months                        "为期6个月"

     :props/h1                                        "大标题"
     :props/h2                                        "中标题"
     :props/h3                                        "小标题"
     :props/weight-none                               "普通链接"
     :props/strong                                    "强链接"
     :props/arrowhead-none                            "无箭头"
     :props/single                                    "箭头"
     :props/double                                    "双箭头"

     :public-permission/none                          "私人的。"
     :public-permission/view                          "与所有人共享以供阅读。"

     :registration/create-user                        "创建帐户"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "已经有帐户了？" [:a.link-button {:href route} "登录"]])
     :registration/options                            "选择其他注册方式"
     :registration/server-error                       "服务器错误。请重试创建帐户。"
     :registration/missing-oauth-email                "{registration/service}没有告诉我们您的电子邮件。请在下面填写。"

     :search/previous-match                           "上一个匹配项 (PAGE UP); 第一个匹配项 (HOME)"
     :search/next-match                               "下一个匹配项 (PAGE DOWN, ENTER); 最后一个匹配项 (END)"
     :search/close                                    "关闭 (ESC)"
     :search/cells-with-selected-attachments          "包含所选文件和图片的单元格。"

     :selection/change-style-of-selected              (fn [{:selection/keys [type]}]
                                                        (str "更改所选"
                                                             (case type
                                                               :style-select/all-props (str "{selection/num-units}个单元格和"
                                                                                            "{selection/num-links}个链接")
                                                               :style-select/unit-props "{selection/num-units}个单元格"
                                                               :style-select/link-props "{selection/num-links}个链接")
                                                             "的样式；按住SHIFT设置当前样式，按住CTRL复制到当前样式"))

     :selection/link                                  "连接单元格"
     :selection/hide-contents                         "隐藏内容 (ESC)"
     :selection/show-contents                         "显示内容"
     :selection/force-closing                         "打开位置时隐藏这些内容 (ESC)"
     :selection/step-focus-camera                     "将此步骤的摄像机聚焦在所选单元格上（F2 或 Q）；按住 SHIFT 添加，按住 ALT 移除。"
     :selection/fragment-focus-camera                 "将当前位置的摄像机聚焦在所选单元格上（F2 或 Q）；按住 SHIFT 添加，按住 ALT 移除。"
     :selection/step-show-books                       "在此步骤中仅显示所选单元格（F3 或 W）；按住 SHIFT 添加，按住 ALT 移除。"
     :selection/fragment-show-books                   "在当前位置仅显示所选单元格（F3 或 W）；按住 SHIFT 添加，按住 ALT 移除。"
     :selection/force-showing                         "显示先前隐藏的所选单元格"
     :selection/share-units                           "复制显示所选单元格的链接；按住SHIFT改为打开位置的设置"
     :selection/move-to-new-orgpage                   "移动到新的OrgPage"
     :selection/change-code-lang                      "更改代码语言"
     :selection/copy-units-links                      "将单元格和链接复制到剪贴板"
     :selection/flip-links                            "翻转链接方向"
     :selection/delete                                "删除所选"

     :settings/profile                                "个人资料"
     :settings/payments                               "付款"
     :settings/account                                "帐户"
     :settings/linked-accounts                        "链接的帐户"
     :settings/email                                  "通知"
     :settings/account-description                    "更改您的电子邮件、密码或删除您的帐户。"
     :settings/stats-description                      "以下是有关您OrgPad使用情况的一些统计信息。"
     :settings/change-email                           "更改电子邮件"
     :settings/change-email-text                      "输入新的电子邮件地址。出于安全原因，我们必须在解锁帐户之前对其进行验证。"
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "您使用电子邮件" [:b email] "注册了您的帐户。"])
     :settings/account-linked-to-facebook             [:<> "您的帐户已" [:b "链接"] "到Facebook。"]
     :settings/account-not-linked-to-facebook         [:<> "您的帐户" [:b "未链接"] "到Facebook。"]
     :settings/link-fb                                "链接Facebook"
     :settings/unlink-fb                              "取消链接Facebook"
     :settings/account-linked-to-google               [:<> "您的帐户已" [:b "链接"] "到Google。"]
     :settings/account-not-linked-to-google           [:<> "您的帐户" [:b "未链接"] "到Google。"]
     :settings/link-google                            "链接Google"
     :settings/unlink-google                          "取消链接Google"
     :settings/account-linked-to-microsoft            [:<> "您的帐户已" [:b "链接"] "到Microsoft。"]
     :settings/account-not-linked-to-microsoft        [:<> "您的帐户" [:b "未链接"] "到Microsoft。"]
     :settings/link-microsoft                         "链接Microsoft"
     :settings/unlink-microsoft                       "取消链接Microsoft"
     :settings/account-linked-to-cuni                 [:<> "您的帐户已" [:b "链接"] "到查理大学。"]
     :settings/account-not-linked-to-cuni             [:<> "您的帐户" [:b "未链接"] "到查理大学。"]
     :settings/link-cuni                              "链接查理大学"
     :settings/unlink-cuni                            "取消链接查理大学"
     :settings/set-password-text                      "取消链接前请设置密码。"
     :settings/linked-accounts-info                   "将您的Facebook、Google、Microsoft或查理大学帐户链接到OrgPad，以便您可以使用它们登录。"
     :settings/profile-info                           "有了给定的信息，项目中的同事会更容易找到您。"
     :settings/delete-account                         "删除帐户"
     :settings/confirm-delete-account-question        [:<> [:b "永久"] "删除您的帐户？"]
     :settings/confirm-delete-account-info            "它将删除您所有的OrgPages及其数据。"
     :settings/delete-account-info                    [:<> "删除将" [:b "永久"] "删除您所有的OrgPages及其数据。"]

     :share-orgpage/campaigns                         "活动"
     :share-orgpage/copied-to-clipboard               "已复制到剪贴板"
     :share-orgpage/copy-template-link                "复制模板链接"
     :share-orgpage/dialog-title                      "共享{orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "没有OrgPad帐户的人将收到带有链接的邀请。"
                                                                  "他们打开链接后，可以阅读此OrgPage。")
                                                         [:a.link-button create-team "创建团队"]
                                                         "以轻松地与一组人共享OrgPages。"])
     :share-orgpage/email-found                       "找到了一个OrgPad帐户。"
     :share-orgpage/email-unused                      "未找到OrgPad帐户。请改为发送电子邮件邀请。"
     :share-orgpage/checking-email-address            "正在检查电子邮件地址..."
     :share-orgpage/invite-for-editing                "邀请编辑"
     :share-orgpage/invite-for-viewing                "邀请阅读"
     :share-orgpage/invite-by-email                   "您想使用特定语言通过电子邮件邀请他们吗？"
     :share-orgpage/show-profile                      "显示个人资料"
     :share-orgpage/links                             "链接"
     :share-orgpage/to-read                           "阅读"
     :share-orgpage/to-comment                        "评论"
     :share-orgpage/to-edit                           "编辑"
     :share-orgpage/links-tooltip                     "通过可共享链接授予访问权限"
     :share-orgpage/template                          "模板"
     :share-orgpage/template-tooltip                  "自动创建此OrgPage副本的链接"
     :share-orgpage/template-info                     "人们可以使用此链接创建此OrgPage的自己的副本。"
     :share-orgpage/template-autoshare-none           "不要与我共享副本。"
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "与我共享副本以供"
                                                             (case template-autoshare
                                                               :permission/view "阅读"
                                                               :permission/comment "评论"
                                                               :permission/edit "编辑") "."))
     :share-orgpage/embed                             "嵌入"
     :share-orgpage/embed-into-microsoft-teams        "嵌入到Microsoft Teams"
     :share-orgpage/embed-into-website                "嵌入到网站或应用程序"
     :share-orgpage/embed-tooltip                     "嵌入到网站或应用程序"
     :share-orgpage/new-user-or-usergroup             "姓名、电子邮件或团队"
     :share-orgpage/link-permission-start             "允许人们"
     :share-orgpage/link-permission-end               "此OrgPage。"
     :share-orgpage/orgpage-info                      "信息"
     :share-orgpage/orgpage-info-tooltip              "有关所有者以及OrgPage是否已发布的信息"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "此OrgPage与您共享以供"
                                                             (case user-permission
                                                               :permission/view "阅读"
                                                               :permission/comment "评论"
                                                               :permission/edit "编辑") "."))
     :share-orgpage/remove-yourself                   "移除自己"
     :share-orgpage/private-info                      "只有您和您直接或通过链接与之共享OrgPage的人才能访问。每个新创建的文档都是私有的。"
     :share-orgpage/publish-for-reading-info          "OrgPage是公开的。互联网上的任何人都可以搜索和阅读它。只有您或您与之共享OrgPage以进行编辑的人才能进行更改。"
     :share-orgpage/publish-permission-end            "此OrgPage是"
     :share-orgpage/publish                           "发布"
     :share-orgpage/publish-confirmation              "每个人都将能够{orgpage/permission}此OrgPage。您确定吗？"
     :share-orgpage/publish-tooltip                   "授予所有人访问权限"
     :share-orgpage/remove-user                       "移除权限"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "如果您不小心共享了链接，您可以"
                                                         [:span.link-button reset-links "使所有以前的链接无效"]
                                                         "."])
     :share-orgpage/shareable-link                    "可共享链接"
     :share-orgpage/everything-closed                 "显示所有单元格关闭"
     :share-orgpage/presentation                      "从演示文稿开始"
     :share-orgpage/fragment                          "显示一个位置"
     :share-orgpage/template-link-switch              "创建一个模板链接。"
     :share-orgpage/user-not-registered               "尚未注册OrgPad。"
     :share-orgpage/users                             "人"
     :share-orgpage/users-tooltip                     "授予个人访问权限"

     :side-panel/about                                "主页"
     :side-panel/terms-and-conditions                 "条款和条件"
     :side-panel/privacy-and-security                 "隐私和安全"
     :side-panel/files-and-images                     "文件和图片"
     :side-panel/paths                                "演示文稿"
     :side-panel/fragments                            "位置"
     :side-panel/translate                            "翻译"
     :side-panel/toggle-debug                         "调试器"
     :side-panel/help                                 "帮助"
     :side-panel/blog                                 "博客"
     :side-panel/home                                 "主页"
     :side-panel/import                               "导入"
     :side-panel/share                                "共享"
     :side-panel/num-files                            "{side-panel/num-files}个文件"
     :side-panel/num-images                           "{side-panel/num-images}个图片"
     :side-panel/num-paths                            "{side-panel/num-paths}个演示文稿"
     :side-panel/num-fragments                        "{side-panel/num-fragments}个位置"

     :step/closed-books                               "关闭的单元格；CTRL+单击选择"
     :step/everything-closed                          "一切都关闭了。"
     :step/hidden-books                               "隐藏的单元格；CTRL+单击选择"
     :step/nothing-changed                            "什么都没变。"
     :step/opened-pages                               "打开的页面；CTRL+单击选择"
     :step/focused-books                              "相机中显示的单元格；CTRL+单击选择"
     :step/shown-books                                "显示的单元格；CTRL+单击选择"
     :step/switched-pages                             "切换的页面；CTRL+单击选择"

     :style-select/set-comment                        "更改为带有您的个人资料图片的评论单元格 (CTRL+,)"
     :style-select/unset-comment                      "更改为普通单元格，删除个人资料图片 (CTRL+,)"
     :style-select/set-comment-safari                 "更改为带有您的个人资料图片的评论单元格 (SHIFT+CMD+,)"
     :style-select/unset-comment-safari               "更改为普通单元格，删除个人资料图片 (SHIFT+CMD+,)"

     :tag/public                                      "公开"

     :text-field/email                                "电子邮件"
     :text-field/first-name                           "名"
     :text-field/last-name                            "姓"
     :text-field/name                                 "姓名"
     :text-field/new-password                         "新密码"
     :text-field/password                             "密码"
     :text-field/content                              "内容"
     :text-field/name-or-email                        "姓名或电子邮件"
     :text-field/subject                              "主题"
     :text-field/message                              "消息"
     :text-field/phone-number                         "电话号码"
     :text-field/width                                "宽度"
     :text-field/height                               "高度"

     :translate/title                                 "将OrgPage {orgpage/title}翻译成另一种语言"
     :translate/info                                  (str "自动创建您拥有的此OrgPage的副本"
                                                           "，该副本从源语言翻译为目标"
                                                           "语言。您可以在一分钟内在您的列表中找到它。")
     :translate/source-lang                           "源语言"
     :translate/target-lang                           "目标语言"
     :translate/translate                             "翻译"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "翻译可用作"
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :unit-editor/add-page                            "创建另一个页面 (CTRL+PAGEDOWN)"
     :unit-editor/delete-page                         "删除此页面"
     :unit-editor/previous-page                       (str "上一页 (PAGEUP)；"
                                                           "按住SHIFT将此页面向左移动 (SHIFT+PAGEUP)；"
                                                           "按住CTRL在此页面之前添加另一个页面 (CTRL+PAGEUP)")
     :unit-editor/next-page                           (str "下一页 (PAGEDOWN)；"
                                                           "按住SHIFT将此页面向右移动 (SHIFT+PAGEDOWN)；"
                                                           "按住CTRL在此页面之后添加另一个页面 (CTRL+PAGEDOWN)")
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "切换到此页面"
                                                             (when can-edit "；按住SHIFT将当前页面移动到那里")))
     :unit-editor/hidden-info                         "单击以书写"
     :unit-editor/undo                                "撤消 (CTRL+Z)"
     :unit-editor/redo                                "重做 (CTRL+SHIFT+Z或CTRL+Y)"
     :unit-editor/toggle-bold                         "粗体 (CTRL+B)"
     :unit-editor/toggle-italic                       "斜体 (CTRL+I)"
     :unit-editor/toggle-strikethrough                "删除线"
     :unit-editor/toggle-subscript                    "下标 (CTRL+S)"
     :unit-editor/toggle-superscript                  "上标 (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "创建超链接 (CTRL+K)"
     :unit-editor/remove-hyperlink                    "删除超链接"
     :unit-editor/set-highlighting                    "高亮颜色"
     :unit-editor/selection->code                     "转换为代码 (CTRL+D)"
     :unit-editor/toggle-list-ul                      "项目符号列表 (TAB)"
     :unit-editor/toggle-list-ol                      "编号列表 (CTRL+O)"
     :unit-editor/indent                              "增加缩进 (TAB)"
     :unit-editor/outdent                             "减少缩进 (SHIFT+TAB)"
     :unit-editor/center                              "居中对齐 (CTRL+L)"
     :unit-editor/heading                             "标题 (CTRL+G)"
     :unit-editor/embed-pdf                           "显示PDF内容"
     :unit-editor/link-pdf                            "用其超链接替换PDF内容"
     :unit-editor/embed-office                        "使用Microsoft 365显示文档内容"
     :unit-editor/link-office                         "用其超链接替换文档内容"
     :unit-editor/embed-video                         "显示视频播放器"
     :unit-editor/link-video                          "用其超链接替换视频"
     :unit-editor/embed-audio                         "显示音频播放器"
     :unit-editor/link-audio                          "用其超链接替换音频"
     :unit-editor/hyperlink->embed                    "插入链接的网站"
     :unit-editor/embed->hyperlink                    "用其超链接替换嵌入的网站"
     :unit-editor/open-image-in-attachments           "在附件列表中打开此图片"
     :unit-editor/open-file-in-attachments            "在附件列表中打开此文件"
     :unit-editor/toggle-controls                     "显示视频播放器控件"
     :unit-editor/toggle-autoplay                     "自动播放"
     :unit-editor/toggle-muted                        "静音播放，否则自动播放可能会被阻止"
     :unit-editor/toggle-loop                         "循环播放"
     :unit-editor/toggle-chained-size                 "保持纵横比"
     :unit-editor/insert-menu                         "插入"
     :unit-editor/insert-image                        "图片"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "从您的设备上传图片。"
     :unit-editor/insert-image-info2                  "提示：将图片直接拖动或粘贴到任何单元格或灰色画布中。"
     :unit-editor/insert-camera                       "相机"
     :unit-editor/insert-attachment                   "文件"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "视频"
     :unit-editor/insert-video-info                   "从计算机上传视频或从YouTube插入视频。"
     :unit-editor/insert-video-info2                  "提示：将视频和YouTube缩略图直接拖动到任何单元格或灰色画布中。"
     :unit-editor/video-url                           "YouTube链接"
     :unit-editor/youtube-start                       "开始"
     :unit-editor/youtube-end                         "结束"
     :unit-editor/insert-table                        "表格"
     :unit-editor/insert-table-info                   "选择插入表格的大小。"
     :unit-editor/toggle-table-border                 "显示表格边框"
     :unit-editor/add-row-before                      "在上方插入行"
     :unit-editor/add-row-after                       "在下方插入行"
     :unit-editor/remove-current-row                  "删除行"
     :unit-editor/add-column-before                   "在前面插入列"
     :unit-editor/add-column-after                    "在后面插入列"
     :unit-editor/remove-current-column               "删除列"
     :unit-editor/remove-table                        "删除表格"
     :unit-editor/insert-website                      "网站"
     :unit-editor/insert-website-info                 (str "您可以将网站直接嵌入到单元格中。"
                                                           "如果不起作用，可能是网站所有者阻止了它。")
     :unit-editor/website-url-or-code                 "网站地址或代码"
     :unit-editor/website-id                          "网站ID"
     :unit-editor/website-id-info                     (fn [{:embed-messaging/keys [info]}]
                                                        [:<> "用于"
                                                         [:a.link-button {:href   info
                                                                          :target "_blank"} "在网站之间发送消息"] "."])
     :unit-editor/invalid-website-url                 "无效的网站地址或代码"
     :unit-editor/invalid-video-url                   "无效的视频地址"
     :unit-editor/update-website                      "更改网站地址"
     :unit-editor/insert-orgpage                      "OrgPage"
     :unit-editor/insert-code                         "代码"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/copy-code                           "复制代码"
     :unit-editor/insert-math-shortcut                "CTRL+U, CTRL+M"
     :unit-editor/toggle-block-code                   "代码作为单独的段落"
     :unit-editor/toggle-block-math                   "数学在单独的行上"
     :unit-editor/remove-code                         "删除代码格式"
     :unit-editor/insert-math                         "数学/化学"

     :unit-panel/link                                 (str "单击或拖动以连接；"
                                                           "按住SHIFT创建多个连接；"
                                                           "按住CTRL创建单元格链")
     :unit-panel/upload-attachment                    "将图片或文件插入此单元格"
     :unit-panel/change-link-style                    (str "更改此单元格的样式；"
                                                           "按住SHIFT设置当前样式，"
                                                           "按住CTRL复制到默认样式；"
                                                           "拖动以在此样式中连接")
     :unit-panel/hide-content                         "隐藏内容"
     :unit-panel/delete-unit                          "删除单元格"

     :usergroup/create                                "创建团队"
     :usergroup/edit-title                            "编辑{usergroup/name}"
     :usergroup/info                                  "创建和管理您的朋友和同事的团队，以简化共享OrgPages。"
     :usergroup/delete                                "删除团队"
     :usergroup/members                               "成员"
     :usergroup/edit                                  "更改团队名称和徽标"
     :usergroup/show-actions                          "显示操作"
     :usergroup/name                                  "姓名"
     :usergroup/hide-orgpages                         "隐藏共享的OrgPages"
     :usergroup/hide-orgpages-tooltip                 "可以通过在过滤器中打开团队来显示它们"
     :usergroup/hide-in-filter                        "在过滤器中隐藏"
     :usergroup/create-info                           "团队名称和个人资料图片仅对团队成员可见。"
     :usergroup/confirm-delete                        [:<> [:b "永久"] "删除此团队？"]
     :usergroup/members-title                         "{usergroup/name}的成员"
     :usergroup/remove-member                         "从团队中移除"
     :usergroup/remove-admin                          "移除管理员"
     :usergroup/make-admin                            "设为管理员"
     :usergroup/admin-tooltip                         "管理员可以管理成员并删除团队。"
     :usergroup/copy-usergroup                        "复制团队"

     :usergroup-role/owner                            "所有者"
     :usergroup-role/admin                            "管理员"
     :usergroup-role/member                           "成员"

     :wire-transfer/title                             "年度{wire-transfer/tier}计划的电汇"
     :wire-transfer/info                              "我们将在收到您的款项后激活您的年度订阅。"
     :wire-transfer/used-currency                     "以{wire-transfer/currency}付款"
     :wire-transfer/recipient-name                    "收款人姓名"
     :wire-transfer/account-number                    "帐号"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "金额"
     :wire-transfer/payment-purpose                   "付款目的"
     :wire-transfer/qr-code-common                    (str "使用您的银行应用扫描此付款QR码以自动填写"
                                                           "正确的信息。")
     :wire-transfer/cz-sk-qr-code-description         (str "这是捷克和斯洛伐克通常用于电汇的QR码。")
     :wire-transfer/eu-qr-code-description            (str "这是欧盟通常用于SEPA转账的QR码。")
     :wire-transfer/trial-info                        (str "您可以立即开始为期7天的一次性订阅以完全使用OrgPad。"
                                                           "银行确认付款成功后，"
                                                           "订阅期将延长1年。")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> "如果您有任何问题或困难，请通过"
                                                         [:a.link-button {:href url} "填写此表格"] "告知我们。"])
     :wire-transfer/success-text                      [:<> "我们已激活"
                                                       [:b "一次性7天订阅"]
                                                       "，以便您可以立即使用新计划的OrgPad。"]
     :wire-transfer/common-result-text                (str "银行确认付款成功后，"
                                                           "订阅期将延长"
                                                           "1年。")
     :wire-transfer/start-trial                       "电汇已发送"
     :wire-transfer/start-trial-result-title          "感谢您的付款"
     :wire-transfer/copy                              "复制到剪贴板"

     :website-editor/settings                         "设置"
     :website-editor/routes                           "路由"
     :website-editor/menus                            "菜单"
     :website-editor/create-menu                      "创建菜单"
     :website-editor/edited-menu                      "已编辑的菜单"
     :website-editor/untitled-menu                    "无标题菜单"
     :website-editor/num-subitems                     "{menu-item/num-children}个子项"
     :website-editor/delete-menu-item                 "删除此菜单项"
     :website-editor/add-menu-item                    "添加菜单项"
     :website-editor/menu-item-label                  "项目标签"
     :menu-item/path-type                             "打开路由"
     :menu-item/url-type                              "打开外部URL"
     :menu-item/children-type                         "打开子菜单"
     :website-editor/menu-item-path                   "路由"

     :youtube-placement/watch-on-prefix               (str "在" unicode/nbsp "上观看")
     :youtube-placement/watch-on-suffix               ""}))

(dicts/init-lang! :lang/zh dict)