# Practicum
# Travel Packing List Manager App

## Repository Link
Access the complete Kotlin source code here: [Insert your GitHub Repository Link Here]

---

## Description
This Android application is a Travel Packing List Manager designed to help users store, categorize, and manage their packing items for travel requirements. The application is built using native Kotlin in Android Studio and demonstrates the practical implementation of user interface design, screen navigation, data validation, and logic formatting using parallel arrays and loops.

---

## Features & Implementation Details
* **Data Architecture:** The app systematically tracks items using four parallel arrays to store information for the item name, category, quantity, and specific comments.
* **Screen Navigation:** Features a seamless dual-screen workflow to handle item configuration and list management.
* **Error Handling:** Features robust input validation to handle entry errors gracefully, providing constructive feedback to the user when inputs are missing or incorrect.
* **Logging:** Utilizes structural logging throughout the execution lifecycle to track operations and demonstrate core program logic.

---

## Application Workflow

### Screen One: Item Entry
* Features input fields to capture detailed travel packing information (Item Name, Category, Quantity, Comments).
* Includes an **"Add to Packing list"** button to validate inputs and save them into the manager's arrays.
* Includes navigation controls to seamlessly transition to the second view or safely **Exit** the application.

### Screen Two: List Management
* Includes a control to display the compiled master packing list.
* Features a specialized filter button to quickly isolate and display items requiring two (2) or more quantities.
* Includes a return button to navigate back to the main data entry screen.

---

## Project Screenshots & Code Verification

### 1. Source Code Implementation
<img width="1920" height="1080" alt="Screenshot 2026-06-05 182303" src="https://github.com/user-attachments/assets/cbdc14eb-4522-4b81-8baa-470e0d5ea533" />

* **Description:** This screenshot showcases the core Kotlin source code structure, highlighting the implementation of the parallel arrays, data structures, and lifecycle validation methods.

### 2. Screen One (Data Entry Screen)
<img width="1920" height="1080" alt="Screenshot 2026-06-05 182050" src="https://github.com/user-attachments/assets/d4e25c98-4e08-4217-a356-9dd39ad528d8" />

<img width="1920" height="1080" alt="Screenshot 2026-06-05 182340" src="https://github.com/user-attachments/assets/460f2f31-9cbd-42a2-bbf1-879b57fd678a" />

* **Description:** This displays the primary interactive user interface where users can type in details for their travel items, choose a category, and input quantities.

### 3. Screen Two (Display & Filters)
<img width="1920" height="1080" alt="Screenshot 2026-06-05 181839" src="https://github.com/user-attachments/assets/81ed545c-f129-4095-9f37-e7825bb53a48" />

(Insert your screen two screenshot image link here)
* **Description:** This showcases the second layout view where the saved items are processed, displaying the total travel details and filtering elements matching specific quantity criteria.

### 4. Emulator Execution
* **Description:** A view of the fully functional application executing smoothly within the Android Studio emulator environment, demonstrating active runtime stability.
*<img width="1920" height="1080" alt="Screenshot 2026-06-05 182303" src="https://github.com/user-attachments/assets/77e48aea-7a38-4694-ad77-a1fdaab0fd06" />
<img width="1920" height="1080" alt="Screenshot 2026-06-05 182050" src="https://github.com/user-attachments/assets/92169400-bc3b-4959-9b1d-8528b1976650" />
<img width="1920" height="1080" alt="Screenshot 2026-06-05 181839" src="https://github.com/user-attachments/assets/55dc6bdd-207b-4cfe-9864-c1f836ff1575" />
<img width="268" height="188" alt="SKY" src="https://github.com/user-attachments/assets/068f2ccc-69fc-4ba4-8ad1-12713fabde3c" />
<img width="1920" height="1080" alt="Screenshot 2026-06-05 182340" src="https://github.com/user-attachments/assets/827a5dff-bd23-4ab2-8ab2-0226002bf223" />
