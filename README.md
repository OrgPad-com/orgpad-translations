# OrgPad Translations

[OrgPad](https://orgpad.info) is an interactive web application for visual thinking, learning, and collaboration.
It combines the structure of a mind map with the flexibility of a whiteboard.
People can connect ideas, notes, and media on an infinite canvas to organize information clearly and intuitively.
OrgPad is used by teachers, students, and professionals to plan projects, create lessons, and present ideas visually.

This repository contains all language files that make OrgPad accessible in different languages — both in the web client
and in server-side features like emails and notifications.

## How to Help Improve Translations

We welcome anyone who wants to help make OrgPad better in their language!
You don’t need any coding experience.

### Getting Started

0. **Start from English** – English (`en/`) files are the source version. Use them as a reference when translating or
   comparing.
1. **Find your language** – Look for the folder with your language code (e.g., `fr/` for French, `de/` for German).
2. **Choose what to translate** – Open the file that matches what you want to improve:

    * **`client.cljs`** – Text you see in the OrgPad app (buttons, menus, error messages)
    * **`common.cljc`** – Text that appears in both the app and the server (for example, tier names)
    * **`server.cljc`** – Email notifications and messages
3. **Make your improvements** – Edit the text to make it sound natural in your language.
4. **Share your changes** – Contact us or create a Pull Request (we’ll gladly guide you if you’re new to GitHub).

   > ✉️ If you prefer, you can also email us the updated file.

## How Translations Are Organized

Each language has its own folder with three files containing different types of translations:

* **`client.cljs`** – User interface text (buttons, menus, messages you see in the app)
* **`common.cljc`** – General text shared across the app and server
* **`server.cljc`** – Email messages and notifications

> 🟢 These are ClojureScript (`.cljs`) and Clojure (`.cljc`) files.
> You don’t need to know these languages — just edit the text in quotes.

### Supported Languages

Currently supporting **16 languages**:

* `cs` – Czech
* `de` – German
* `en` – English
* `es` – Spanish
* `fr` – French
* `hi` – Hindi
* `it` – Italian
* `jp` – Japanese
* `kr` – Korean
* `nl` – Dutch
* `pl` – Polish
* `pt` – Portuguese
* `ru` – Russian
* `sk` – Slovak
* `uk` – Ukrainian
* `zh` – Chinese

> 🌍 We use **one version per language** (for example, `pt` combines Brazilian and European Portuguese) so that it’s
> understandable to people from different regions.

## What to Translate

Translate the text in quotes `"..."` to make it sound natural in your language.
Keep the structure and formatting (brackets, colons, etc.) unchanged.
For plural forms, translate all variations: `"files"` `"file"` `"files"`.

Parameters will be filled in automatically:

* `{parameter}` in `client.cljs` files (like `{:info/count}`)
* `{{parameter}}` in `server.cljc` files (like `{{email}}`)

> ⚠️ **Don’t translate:**
>
> * Keys like `:button/save`
> * Words inside `{}` or `{{}}`

## What the Files Look Like

Each file contains different types of text entries.
Here are examples of what you might see:

### Simple text:

```clojure
:button/save "Save"
:dashboard/owned-orgpages "My OrgPages"
:export/title "Export {orgpage/title}"
```

### Pluralization (:i18n/plural)

Pluralization handles different grammatical forms based on count values.

```clojure
:info/uploading-attachments [:i18n/plural "Uploading {info/count} {info/num-files} …"
                             {:info/num-files [:info/count "files" "file" "files"]}]
 ```

**How it works:**

The system looks up the count value using `param/count-key`. It uses `:lang/plural-breaks` to determine which plural
form to use

For English: `[0 1 2]` means:

- 0 or less: use first form ("files")
- 1: use second form ("file")
- 2+: use third form ("files")

### Dynamic content:

```clojure
:error/orgpage-removed (fn [{:orgpage/keys [title]}]
                           (str "The OrgPage " (when title "“{orgpage/title}”") " was removed."))
```

## Contributors

Thank you for contributing! We appreciate it dearly and hope it will make OrgPad better for everybody.

* Victor Inacio – Portuguese (August 2023)
* Dishant Pandya – Hindi (September 2025)

## Contact

Need help or want to discuss your translation ideas?

* 📧 **Email us** at [support@orgpad.info](mailto:support@orgpad.info)
* 🌐 **Contact us** via [social media](https://orgpad.info/s/contact)

### Need Help?

* **Small fixes** (typos, better wording) – Just contact us directly.
* **Bigger projects** – We can guide you through the technical steps or help you create a Pull Request.
* **New languages** – Please contact us first so we can coordinate.