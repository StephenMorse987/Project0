# Shopping List
An app for keeping track of food supplies and creating a shopping list based on a given recipe.

## Features
- [ ] Allows a user to create a list of food supplies they own.
    - [ ] The list is persistent.
        - [ ] Keeps track of how much of each item is present.
        - [ ] Keeps track of how much is used.
            - [ ] Estimates how long the item will last.
- [x] Allows a user to insert ingredients for a recipe they wish to make.
    - [ ] Compares the list to existing supplies and creates a shopping list.

## Usage
`./gradle`
Clears compiled code, compiles and runs

`./gradle clean`
Removes .classes and .jars

`./gradle build`
Compiles the source code

`./gradle package`
Packages the compiled source into executables (must `./gradle build` first)

`./gradle run`
Runs compiled code (must `./gradle build` first)
