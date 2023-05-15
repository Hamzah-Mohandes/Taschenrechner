# To-Do-Liste

Dieses Repository enthält eine einfache To-Do-Liste, die in Pseudocode implementiert ist. Die To-Do-Liste besteht aus verschiedenen Klassen, die das Hinzufügen von Aufgaben, Anzeigen der Aufgabenliste und Markieren von Aufgaben als erledigt ermöglichen.

## Verwendung

Um die To-Do-Liste zu verwenden, folgen Sie diesen Schritten:

1. Klonen Sie das Repository auf Ihren lokalen Computer:

```shell
git clone https://github.com/your-username/to-do-list.git


Klasse Aufgabe:
    Eigenschaften:
        - name: Zeichenkette
        - erledigt: bool

    Methode Aufgabe(name):
        setze this.name auf name
        setze this.erledigt auf false

    Methode markiereAlsErledigt():
        setze this.erledigt auf true

Klasse To-Do-Liste:
    Eigenschaften:
        - aufgaben: Liste von Aufgabe-Objekten

    Methode To-Do-Liste():
        setze this.aufgaben auf leere Liste

    Methode aufgabeHinzufuegen():
        ausgabe "Geben Sie den Namen der Aufgabe ein:"
        lese name von Benutzer mit readln()
        neueAufgabe = neue Instanz von Aufgabe mit Parameter name
        füge neueAufgabe der Liste this.aufgaben hinzu

    Methode aufgabenAnzeigen():
        wenn this.aufgaben leer sind, dann
            ausgabe "Keine Aufgaben vorhanden"
        sonst
            für jede aufgabe in this.aufgaben, tue
                wenn aufgabe.erledigt ist, dann
                    ausgabe "- [x] " + aufgabe.name
                sonst
                    ausgabe "- [ ] " + aufgabe.name

    Methode aufgabeAlsErledigtMarkieren():
        ausgabe "Geben Sie den Namen der Aufgabe ein, die als erledigt markiert werden soll:"
        lese name von Benutzer mit readln()
        für jede aufgabe in this.aufgaben, tue
            wenn aufgabe.name gleich name ist, dann
                aufgabe.markiereAlsErledigt()
                ausgabe "Aufgabe als erledigt markiert."
                beende Schleife

    Methode toDoListeAusfuehren():
        wiederhole, bis der Benutzer die Aktion "beenden" auswählt, tue
            ausgabe "Wählen Sie eine Aktion aus:"
            ausgabe "1. Aufgabe hinzufügen"
            ausgabe "2. Aufgaben anzeigen"
            ausgabe "3. Aufgabe als erledigt markieren"
            ausgabe "4. Beenden"

            lese auswahl von Benutzer mit readln()

            wenn auswahl gleich "1", dann
                aufgabeHinzufuegen()
            sonst wenn auswahl gleich "2", dann
                aufgabenAnzeigen()
            sonst wenn auswahl gleich "3", dann
                aufgabeAlsErledigtMarkieren()
            sonst wenn auswahl gleich "4", dann
                ausgabe "Auf Wiedersehen!"
            sonst
                ausgabe "Ungültige Auswahl. Versuchen Sie es erneut."

-------------------------------------------------------------------------------
Task (Aufgabe) Klasse:

constructor(name: String): Erstellt eine neue Aufgabe mit dem angegebenen Namen.
markAsDone(): Markiert die Aufgabe als erledigt.
toString(): Gibt eine String-Repräsentation der Aufgabe zurück.
ToDoList (To-Do-Liste) Klasse:

addTask(task: Task): Fügt der To-Do-Liste eine Aufgabe hinzu.
removeTask(task: Task): Entfernt eine Aufgabe aus der To-Do-Liste.
markTaskAsDone(task: Task): Markiert eine Aufgabe als erledigt.
printTasks(): Druckt alle Aufgaben in der To-Do-Liste.
TaskManager (Aufgabenmanager) Klasse:

createTask(name: String): Erstellt eine neue Aufgabe mit dem angegebenen Namen.
editTask(task: Task, newName: String): Bearbeitet den Namen einer Aufgabe.
deleteTask(task: Task): Löscht eine Aufgabe.
markTaskAsDone(task: Task): Markiert eine Aufgabe als erledigt.
printTasks(): Druckt alle Aufgaben im Aufgabenmanager.
TaskInputReader (Aufgabeneingabeleser) Klasse:

readTaskName(): String: Liest den Namen einer Aufgabe vom Benutzer ein.
Main Klasse:

main(): Die Hauptfunktion, die das Programm steuert und die Benutzerinteraktion ermöglicht.
