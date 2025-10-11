# OrgPad Translations

This is a public repository containing translations for the OrgPad web client and server-side features like emails and notifications.

## How Translations Are Organized

Each language has its own folder with three files containing different types of translations:

- **`client.cljs`** - User interface text (buttons, menus, messages you see in the app)
- **`common.cljc`** - General text used throughout OrgPad
- **`server.cljc`** - Email messages and notifications

### Supported Languages

Currently supporting **16 languages**:
- `cs` - Czech
- `de` - German  
- `en` - English
- `es` - Spanish
- `fr` - French
- `hi` - Hindi
- `it` - Italian
- `jp` - Japanese
- `kr` - Korean
- `nl` - Dutch
- `pl` - Polish
- `pt` - Portuguese
- `ru` - Russian
- `sk` - Slovak
- `uk` - Ukrainian
- `zh` - Chinese

## How to Help Improve Translations

We welcome anyone who wants to help make OrgPad better in their language! You don't need any coding experience.

### Getting Started

1. **Find your language** - Look for the folder with your language code (e.g., `fr/` for French, `de/` for German)

2. **Choose what to translate** - Open the file that matches what you want to improve:
   - **`client.cljs`** - Text you see in the OrgPad app (buttons, menus, error messages)
   - **`common.cljc`** - General messages and labels
   - **`server.cljc`** - Email notifications and messages

3. **Make your improvements** - Edit the text to make it more natural in your language

4. **Share your changes** - Contact us or create a Pull Request (we can help guide you through this step)

### What the Files Look Like

Each file contains simple text entries like:
```
:button/save "Save"

:dashboard/owned-orgpages "My OrgPages"
```

You just need to translate the text in quotes to make it sound natural in your language.

## Contributors

Thank you for contributing! We appreciate it dearly and hope it will make OrgPad better for everybody.

* Victor Inacio - Portuguese (August 2023)
* Dishant Pandya - Hindi (September 2025)

## Contact

Need help or want to discuss your translation ideas?
- **Email us** at support@orgpad.info (we're happy to help!)
- **Contact us** via [social media](https://orgpad.info/s/contact)

### Need Help?

- **Small fixes** (typos, better wording) - Just contact us directly
- **Bigger projects** - We can guide you through the technical steps or create Pull request
- **New language** or major updates - Please contact us first so we can coordinate
