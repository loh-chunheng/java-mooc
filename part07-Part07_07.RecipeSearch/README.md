# Project: Recipe Search Engine

## 📖 Description
A command-line application designed to manage and search recipe data stored in text files. It supports filtering by name, cooking time, and specific ingredients.

## 🛠 Technical Implementation
This project served as one of the final challenges for Java Programming I, utilizing several core Object-Oriented principles:
* **File Processing:** Used `java.nio.file.Paths` and `Scanner` to parse multi-line structured data.
* **Encapsulation:** Modeled the domain with a `Recipe` class and a `RecipeBook` manager class.
* **Separation of Concerns:** Divided the application into Data (Recipe), Logic (RecipeBook), and Interaction (RecipeSearch).

## 🧠 Design Reflections & Lessons Learned
During development, I encountered several "Aha!" moments regarding software architecture:

* **Static vs. Instance Context:** Learned how to bridge the "Static World" of the `main` method with the "Object World" of my classes. Tried to gain comprehension that `static` represents a fixed memory location for the class, while objects are dynamic instances created at runtime.
* **The "Manager" Class Pattern:** Initially debated if a `RecipeBook` class was necessary. I discovered that by moving search logic into its own class, the code became more "pluggable" and organized compared to putting everything in the main loop.
* **Input Stream Management:** Learned why creating multiple `Scanners` for `System.in` is dangerous. Successfully implemented a single shared Scanner passed as a parameter, avoiding resource conflicts.
* **Data Hierarchy:** Handling a list of ingredients *inside* a list of recipes taught me how to navigate nested data structures effectively.
